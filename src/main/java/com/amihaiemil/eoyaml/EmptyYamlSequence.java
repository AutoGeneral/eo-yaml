package com.amihaiemil.eoyaml;

import java.util.Collection;
import java.util.Collections;

public class EmptyYamlSequence extends BaseYamlSequence {
    private final YamlSequence sequence;

    public EmptyYamlSequence(YamlSequence sequence) {
        this.sequence = sequence;
    }

    @Override
    public Collection<YamlNode> values() {
        return Collections.emptyList();
    }

    @Override
    public Comment comment() {
        return sequence.comment();
    }
}

package com.amihaiemil.eoyaml;

import java.util.Collections;
import java.util.Set;

public class EmptyYamlMapping extends BaseYamlMapping {

    private final YamlMapping mapping;

    public EmptyYamlMapping(YamlMapping mapping) {
        this.mapping = mapping;
    }

    @Override
    public Set<YamlNode> keys() {
        return Collections.emptySet();
    }

    @Override
    public YamlNode value(YamlNode key) {
        return null;
    }

    @Override
    public Comment comment() {
        return this.mapping.comment();
    }
}

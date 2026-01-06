package com.flowingcode.vaadin.addons.markdown;

/**
 * The different available preview options for the Markdown Viewer component.
 */
public enum PreviewMode {
    LIVE("live"),
    EDIT("edit"),
    PREVIEW("preview");

    private final String value;

    PreviewMode(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}


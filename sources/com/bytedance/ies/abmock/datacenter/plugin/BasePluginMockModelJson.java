package com.bytedance.ies.abmock.datacenter.plugin;

/* loaded from: classes3.dex */
public abstract class BasePluginMockModelJson {
    public StringBuilder mockModelJsonBuilder;

    public String getMockModelJson() {
        StringBuilder sb = this.mockModelJsonBuilder;
        if (sb == null) {
            return "[]";
        }
        return sb.toString();
    }
}

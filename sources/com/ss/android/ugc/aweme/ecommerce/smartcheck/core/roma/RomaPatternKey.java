package com.ss.android.ugc.aweme.ecommerce.smartcheck.core.roma;

import X.InterfaceC65349Pkn;
import com.google.gson.j;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class RomaPatternKey {

    @InterfaceC65349Pkn("defaultValue")
    public final String defaultValue;

    @InterfaceC65349Pkn("desc")
    public final String desc;

    @InterfaceC65349Pkn("editable")
    public final boolean editable;

    @InterfaceC65349Pkn("joinPatternItem")
    public final j joinPatternItem;

    @InterfaceC65349Pkn("key")
    public String key = "";

    @InterfaceC65349Pkn("needEncode")
    public final boolean needEncode;

    @InterfaceC65349Pkn("options")
    public final List<RomaPatternOption> options;

    @InterfaceC65349Pkn("required")
    public boolean required;

    @InterfaceC65349Pkn("schema")
    public final String schema;

    @InterfaceC65349Pkn("type")
    public final String type;

    public final String getDefaultValue() {
        return this.defaultValue;
    }

    public final String getDesc() {
        return this.desc;
    }

    public final boolean getEditable() {
        return this.editable;
    }

    public final j getJoinPatternItem() {
        return this.joinPatternItem;
    }

    public final String getKey() {
        return this.key;
    }

    public final boolean getNeedEncode() {
        return this.needEncode;
    }

    public final List<RomaPatternOption> getOptions() {
        return this.options;
    }

    public final boolean getRequired() {
        return this.required;
    }

    public final String getSchema() {
        return this.schema;
    }

    public final String getType() {
        return this.type;
    }

    public final void setKey(String str) {
        o.LJIIIZ(str, "<set-?>");
        this.key = str;
    }

    public final void setRequired(boolean z) {
        this.required = z;
    }
}

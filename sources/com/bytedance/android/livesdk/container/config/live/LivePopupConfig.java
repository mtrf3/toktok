package com.bytedance.android.livesdk.container.config.live;

import X.CNS;
import kotlin.jvm.internal.o;
import org.json.JSONArray;

/* loaded from: classes6.dex */
public final class LivePopupConfig extends LiveHybridConfig {

    @CNS(name = "min_margin_top")
    public int minMarginTop;

    @CNS(name = "pull_down_close_containers")
    public JSONArray pullDownCloseIds;

    @CNS(name = "soft_input_mode")
    public String softInputMode = "";

    @CNS(name = "variable_height")
    public int variableHeight;

    public final int getMinMarginTop() {
        return this.minMarginTop;
    }

    public final JSONArray getPullDownCloseIds() {
        return this.pullDownCloseIds;
    }

    public final String getSoftInputMode() {
        return this.softInputMode;
    }

    public final int getVariableHeight() {
        return this.variableHeight;
    }

    public final void setMinMarginTop(int i) {
        this.minMarginTop = i;
    }

    public final void setPullDownCloseIds(JSONArray jSONArray) {
        this.pullDownCloseIds = jSONArray;
    }

    public final void setSoftInputMode(String str) {
        o.LJIIIZ(str, "<set-?>");
        this.softInputMode = str;
    }

    public final void setVariableHeight(int i) {
        this.variableHeight = i;
    }
}

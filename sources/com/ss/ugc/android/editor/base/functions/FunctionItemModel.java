package com.ss.ugc.android.editor.base.functions;

import X.InterfaceC65349Pkn;
import java.util.List;

/* loaded from: classes2.dex */
public final class FunctionItemModel {
    public List<FunctionItemModel> children;

    @InterfaceC65349Pkn("edit_mode_func_list")
    public List<FunctionItemModel> editModeList;

    @InterfaceC65349Pkn("enable_strategy")
    public int enableStrategy;
    public String type;

    public final List<FunctionItemModel> getChildren() {
        return this.children;
    }

    public final List<FunctionItemModel> getEditModeList() {
        return this.editModeList;
    }

    public final int getEnableStrategy() {
        return this.enableStrategy;
    }

    public final String getType() {
        return this.type;
    }

    public final void setChildren(List<FunctionItemModel> list) {
        this.children = list;
    }

    public final void setEditModeList(List<FunctionItemModel> list) {
        this.editModeList = list;
    }

    public final void setEnableStrategy(int i) {
        this.enableStrategy = i;
    }

    public final void setType(String str) {
        this.type = str;
    }
}

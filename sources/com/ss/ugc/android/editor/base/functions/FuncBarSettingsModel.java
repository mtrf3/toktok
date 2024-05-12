package com.ss.ugc.android.editor.base.functions;

import X.InterfaceC65349Pkn;

/* loaded from: classes2.dex */
public class FuncBarSettingsModel {

    @InterfaceC65349Pkn("function_item_tree")
    public FunctionItemModel functionItemTree;

    @InterfaceC65349Pkn("is_settings_enable")
    public boolean isSettingsEnable;

    public final FunctionItemModel getFunctionItemTree() {
        return this.functionItemTree;
    }

    public final boolean isSettingsEnable() {
        return this.isSettingsEnable;
    }

    public final void setFunctionItemTree(FunctionItemModel functionItemModel) {
        this.functionItemTree = functionItemModel;
    }

    public final void setSettingsEnable(boolean z) {
        this.isSettingsEnable = z;
    }
}

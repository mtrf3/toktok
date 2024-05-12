package com.ss.ugc.android.editor.components.base.impl;

import X.C52T;
import com.ss.ugc.android.editor.components.base.api.IConsoleBarService;

/* loaded from: classes3.dex */
public final class ConsoleBarServiceImpl implements IConsoleBarService {
    public C52T consoleBar;

    @Override // com.ss.ugc.android.editor.components.base.api.IConsoleBarService
    public void onDestroy() {
        this.consoleBar = null;
    }

    @Override // com.ss.ugc.android.editor.components.base.api.IConsoleBarService
    public C52T getConsoleBar() {
        return this.consoleBar;
    }

    @Override // com.ss.ugc.android.editor.components.base.api.IConsoleBarService
    public void init(C52T c52t) {
        this.consoleBar = c52t;
    }
}

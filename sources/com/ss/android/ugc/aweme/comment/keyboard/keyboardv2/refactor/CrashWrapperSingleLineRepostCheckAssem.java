package com.ss.android.ugc.aweme.comment.keyboard.keyboardv2.refactor;

import X.C2K0;
import X.C36922EeM;
import android.util.Log;
import java.util.LinkedHashMap;

/* loaded from: classes4.dex */
public final class CrashWrapperSingleLineRepostCheckAssem extends SingleLineRepostCheckAssem {
    @Override // com.ss.android.ugc.aweme.comment.keyboard.keyboardv2.refactor.SingleLineRepostCheckAssem, X.InterfaceC55102Lju
    public final C2K0 provideAbility(String str) {
        if (str.hashCode() != 1867027516) {
            return null;
        }
        return this;
    }

    public CrashWrapperSingleLineRepostCheckAssem() {
        new LinkedHashMap();
    }

    @Override // com.ss.android.ugc.aweme.comment.keyboard.keyboardv2.refactor.SingleLineRepostCheckAssem, com.bytedance.assem.arch.view.UIContentAssem, com.bytedance.assem.arch.core.UIAssem
    public final void onCreateView() {
        try {
            super.onCreateView();
        } catch (Throwable th) {
            if (C36922EeM.LIZ) {
                C36922EeM.LIZLLL(6, "CrashWrapperSingleLine", Log.getStackTraceString(th));
            }
        }
    }
}

package com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.common;

import X.C221108m2;
import X.C3OO;
import X.C3Y4;
import X.C47704Ins;
import X.C48841JEv;
import X.C55749LuL;
import X.C62822Ol8;
import X.C78613UtF;
import X.C89333ez;
import X.C89523fI;
import X.C8W0;
import X.C99033ud;
import X.XKX;
import kotlin.jvm.internal.AqS151S0100000_1;

/* loaded from: classes2.dex */
public final class ChatCommonAssem extends C8W0 {
    public final C55749LuL LJLIL = new C55749LuL(C47704Ins.LIZJ(this, C89333ez.class, null), checkSupervisorPrepared());
    public final C62822Ol8 LJLILLLLZI = C221108m2.LIZIZ(new AqS151S0100000_1(this, 367));

    @Override // X.C8W0
    public final void onCreate() {
        super.onCreate();
        C3Y4.LIZLLL = (C99033ud) this.LJLILLLLZI.getValue();
    }

    @Override // X.C8W0
    public final void onDestroy() {
        super.onDestroy();
        C3Y4.LIZLLL = null;
    }

    @Override // X.C8W0
    public final void onPause() {
        super.onPause();
        if (((Boolean) C89523fI.LIZ.getValue()).booleanValue()) {
            return;
        }
        XKX.LIZLLL(C48841JEv.LIZ(C78613UtF.LIZJ), null, null, new C3OO(null), 3);
    }
}

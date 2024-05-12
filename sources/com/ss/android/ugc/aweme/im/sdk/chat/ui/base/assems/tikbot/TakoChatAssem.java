package com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.tikbot;

import X.C17N;
import X.C47704Ins;
import X.C55749LuL;
import X.C57082Lw;
import X.C5H3;
import X.C89333ez;
import X.C8VV;
import Y.AObserverS69S0100000_1;
import android.view.View;
import com.bytedance.assem.arch.view.UIContentAssem;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AqS151S0100000_1;
import kotlin.jvm.internal.AqS167S0100000_1;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class TakoChatAssem extends UIContentAssem {
    public final C55749LuL LJLIL;
    public final C5H3 LJLILLLLZI;
    public final C5H3 LJLJI;

    public TakoChatAssem() {
        new LinkedHashMap();
        this.LJLIL = new C55749LuL(C47704Ins.LJ(this, C89333ez.class, null), checkSupervisorPrepared());
        this.LJLILLLLZI = C17N.LJJIJL(new AqS151S0100000_1(this, 440));
        this.LJLJI = C17N.LJJIJL(new AqS151S0100000_1(this, 441));
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.C8W0
    public final void onDestroy() {
        super.onDestroy();
        C57082Lw.LIZ.LIZ("#BOT_RECEIVE_WELCOME_MSG_FINISH");
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        o.LJIIIZ(view, "view");
        super.onViewCreated(view);
        C8VV.LIZJ(this, new AqS167S0100000_1(this, 138));
        C57082Lw.LIZ.LIZJ("#BOT_RECEIVE_WELCOME_MSG_FINISH").observe(this, new AObserverS69S0100000_1(this, 148));
    }
}

package com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.input.button;

import X.C17N;
import X.C44H;
import X.C47704Ins;
import X.C55749LuL;
import X.C5H3;
import X.C89333ez;
import Y.AObserverS69S0100000_1;
import android.view.View;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AqS151S0100000_1;
import kotlin.jvm.internal.AqS44S0110000_1;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class TakoChatSendButtonAssem extends IMInputSendButtonAssem {
    public final C55749LuL LJLJI;
    public final C5H3 LJLJJI;
    public boolean LJLJJL;

    public TakoChatSendButtonAssem() {
        new LinkedHashMap();
        this.LJLJI = new C55749LuL(C47704Ins.LIZJ(this, C89333ez.class, null), checkSupervisorPrepared());
        this.LJLJJI = C17N.LJJIJL(new AqS151S0100000_1(this, 377));
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.input.button.IMInputSendButtonAssem
    public final void A3() {
        withState((AssemViewModel) this.LJLIL.getValue(), new AqS44S0110000_1(C44H.LIZ(), this, 1));
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.input.button.IMInputSendButtonAssem, com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        o.LJIIIZ(view, "view");
        super.onViewCreated(view);
        C44H.LIZIZ(this, new AObserverS69S0100000_1(this, 40));
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.input.button.IMInputSendButtonAssem
    public final void x3(String str) {
        boolean z;
        if (this.LJLJJL || C44H.LIZ()) {
            z = true;
        } else {
            z = false;
        }
        this.LJLJJL = z;
        if (v3(str)) {
            C3(false);
        } else {
            C3(!this.LJLJJL);
        }
    }
}

package com.ss.android.ugc.aweme.main.assems.mainfragment;

import X.C53959LFr;
import X.C55096Ljo;
import X.C76800UCe;
import X.C8W0;
import X.InterfaceC54151LNb;
import X.InterfaceC54152LNc;
import X.InterfaceC88472Yns;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.bytedance.tiktok.homepage.mainfragment.HomeTabAbility;
import com.bytedance.tiktok.homepage.mainfragment.TopTabProtocol;
import java.util.Iterator;
import kotlin.jvm.internal.AqS140S0200000_9;
import kotlin.jvm.internal.AqS33S0001000_9;
import kotlin.jvm.internal.AqS97S0101000_9;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class TopTabAssem extends C8W0 implements InterfaceC54151LNb, InterfaceC54152LNc {
    @Override // X.InterfaceC54151LNb
    public final void LLLLILI(Bundle bundle) {
    }

    @Override // X.C8W0
    public final void onParentSet() {
        super.onParentSet();
        C55096Ljo.LIZJ(this);
    }

    @Override // X.C8W0
    public final void onResume() {
        super.onResume();
        v3(C53959LFr.LJLIL);
    }

    @Override // X.InterfaceC54151LNb
    public final void LLLLLLZ(Bundle args) {
        o.LJIIIZ(args, "args");
    }

    public final void v3(InterfaceC88472Yns<? super TopTabProtocol, C76800UCe> interfaceC88472Yns) {
        Iterator<TopTabProtocol> it = ((HomeTabAbility) C55096Ljo.LIZIZ(C55096Ljo.LJIIZILJ(this), HomeTabAbility.class)).L2().iterator();
        while (it.hasNext()) {
            interfaceC88472Yns.invoke(it.next());
        }
    }

    @Override // X.InterfaceC54152LNc
    public final void LJJJJI(View view, Bundle bundle) {
        o.LJIIIZ(view, "view");
        v3(new AqS140S0200000_9(view, bundle, this, 13));
    }

    @Override // X.InterfaceC54151LNb
    public final void LLJJJJJIL(int i, Fragment fragment) {
        v3(new AqS97S0101000_9(i, fragment, 0));
    }

    @Override // X.InterfaceC54151LNb
    public final void y(int i, boolean z) {
        v3(new AqS33S0001000_9(i, 7));
    }
}

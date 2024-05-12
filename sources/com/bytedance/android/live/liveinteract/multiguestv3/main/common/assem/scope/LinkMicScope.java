package com.bytedance.android.live.liveinteract.multiguestv3.main.common.assem.scope;

import X.C2K0;
import X.C55230Lly;
import X.C55247LmF;
import X.C55252LmK;
import X.C79234V7u;
import X.InterfaceC55235Lm3;
import X.UC0;
import X.UC1;
import android.view.View;
import androidx.fragment.app.Fragment;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class LinkMicScope extends UC1 {
    public final String LJLJLJ;

    @Override // X.UC1, X.InterfaceC55235Lm3
    public final String getKey() {
        return this.LJLJLJ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LinkMicScope(View v) {
        super(v);
        o.LJIIIZ(v, "v");
        this.LJLJLJ = "link_mic_scope";
        Fragment LJIIIZ = C79234V7u.LJIIIZ(v);
        if (LJIIIZ != null) {
            C55247LmF.LIZ(this, C55230Lly.LIZJ(LJIIIZ, "linkMicScope"));
            UC0.LJJIZ("LinkMicScope  is created, and parent scope is [FragmentScope] ", "linkScope");
        }
    }

    public static void LIZ(LinkMicScope linkMicScope, C2K0 ability, Class cls) {
        InterfaceC55235Lm3 interfaceC55235Lm3;
        o.LJIIIZ(ability, "ability");
        C55252LmK tree = linkMicScope.getTree();
        if (tree != null && (interfaceC55235Lm3 = tree.LIZJ) != null) {
            UC0.LJIIIIZZ(interfaceC55235Lm3, ability, cls, null);
        }
    }
}

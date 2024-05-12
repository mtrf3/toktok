package com.ss.android.ugc.aweme.search.arch.v2.protocol.card.components;

import X.C32151Nz;
import X.C34472Dfw;
import X.C49098JOs;
import X.C79043V0l;
import X.C90193gN;
import X.InterfaceC48999JKx;
import X.JJC;
import X.O6R;
import android.view.View;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class SearchSingleLiveTagAssem extends SearchCardLiveTagAssem {
    public TuxTextView LLFII;
    public View LLFZ;
    public View LLI;

    public SearchSingleLiveTagAssem() {
        new LinkedHashMap();
    }

    @Override // com.ss.android.ugc.aweme.search.arch.v2.protocol.card.components.SearchCardLiveTagAssem, X.C8XO
    /* renamed from: F0 */
    public final /* bridge */ /* synthetic */ void q4(InterfaceC48999JKx interfaceC48999JKx) {
        q4(interfaceC48999JKx);
    }

    @Override // com.ss.android.ugc.aweme.search.arch.v2.protocol.card.components.SearchCardLiveTagAssem
    /* renamed from: m4 */
    public final void q4(InterfaceC48999JKx item) {
        int i;
        o.LJIIIZ(item, "item");
        super.q4(item);
        View view = this.LLI;
        if (view == null) {
            return;
        }
        C34472Dfw.LIZ.getClass();
        if (C34472Dfw.LIZ()) {
            i = 8;
        } else {
            i = 0;
        }
        view.setVisibility(i);
    }

    @Override // com.ss.android.ugc.aweme.search.arch.v2.protocol.card.components.SearchCardLiveTagAssem, com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        View view2;
        int i;
        o.LJIIIZ(view, "view");
        super.onViewCreated(view);
        this.LLFZ = view.findViewById(R.id.g4b);
        this.LLFII = (TuxTextView) view.findViewById(R.id.f6b);
        this.LLI = view.findViewById(R.id.g74);
        C49098JOs.LIZ.getClass();
        Integer valueOf = Integer.valueOf(C49098JOs.LIZIZ());
        if (valueOf.intValue() <= 0) {
            valueOf = null;
        }
        C34472Dfw.LIZ.getClass();
        if (C34472Dfw.LIZ()) {
            if (valueOf != null) {
                i = valueOf.intValue();
            } else {
                i = 3;
            }
            float LJIIZILJ = C32151Nz.LJIIZILJ(Integer.valueOf(i));
            C79043V0l.LJIJI(this.LLFZ, LJIIZILJ, LJIIZILJ, LJIIZILJ, LJIIZILJ);
        } else {
            if (valueOf == null) {
                return;
            }
            float LJIIZILJ2 = C32151Nz.LJIIZILJ(valueOf);
            if (C90193gN.LIZIZ(getContext())) {
                C79043V0l.LJIJI(this.LLFZ, 0.0f, LJIIZILJ2, LJIIZILJ2, 0.0f);
                C79043V0l.LJIJI(this.LLI, LJIIZILJ2, 0.0f, 0.0f, LJIIZILJ2);
            } else {
                C79043V0l.LJIJI(this.LLFZ, LJIIZILJ2, 0.0f, 0.0f, LJIIZILJ2);
                C79043V0l.LJIJI(this.LLI, 0.0f, LJIIZILJ2, LJIIZILJ2, 0.0f);
            }
        }
        JJC.LIZ.getClass();
        if (JJC.LIZ()) {
            TuxTextView tuxTextView = this.LLFII;
            if (tuxTextView != null) {
                tuxTextView.setTuxFont(82);
            }
            if (!C34472Dfw.LIZ() || (view2 = this.LLFZ) == null) {
                return;
            }
            view2.setMinimumHeight(O6R.LJJIIZ(C32151Nz.LJIIZILJ(16)));
        }
    }
}

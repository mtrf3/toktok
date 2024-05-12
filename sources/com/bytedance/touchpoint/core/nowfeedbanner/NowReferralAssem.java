package com.bytedance.touchpoint.core.nowfeedbanner;

import X.C212428Vi;
import X.C248389ow;
import X.C29701Eo;
import X.C32151Nz;
import X.C47959Irz;
import X.C59042Tk;
import X.C8XO;
import X.C95J;
import X.KL2;
import X.O6R;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class NowReferralAssem extends ReusedUISlotAssem<NowReferralAssem> implements C8XO<C59042Tk> {
    public RelativeLayout LLFF;
    public TuxTextView LLFFF;
    public TuxTextView LLFII;
    public C29701Eo LLFZ;
    public FrameLayout LLI;

    @Override // X.C8XO
    public final void LLLZIIL() {
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int W3() {
        return R.layout.ctd;
    }

    @Override // X.C8XO
    public final void unBind() {
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final void Z3() {
        C248389ow c248389ow = (C248389ow) C95J.LIZ(22);
        if (c248389ow != null) {
            c248389ow.LIZJ();
        }
    }

    @Override // X.C8XO
    /* renamed from: F0 */
    public final void q4(C59042Tk item) {
        o.LJIIIZ(item, "item");
    }

    @Override // X.C8XO
    public final boolean c2(C59042Tk item) {
        o.LJIIIZ(item, "item");
        return true;
    }

    @Override // X.C8XO
    public final void n3(C59042Tk item) {
        o.LJIIIZ(item, "item");
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        o.LJIIIZ(view, "view");
        view.findViewById(R.id.hpd);
        this.LLFF = (RelativeLayout) view.findViewById(R.id.hpe);
        this.LLFFF = (TuxTextView) view.findViewById(R.id.hp9);
        this.LLFII = (TuxTextView) view.findViewById(R.id.hp8);
        this.LLFZ = (C29701Eo) view.findViewById(R.id.hp7);
        this.LLI = (FrameLayout) view.findViewById(R.id.hp3);
        view.findViewById(R.id.hp4);
        view.findViewById(R.id.hp5);
        int min = Math.min(KL2.LJIIJJI(getContext()), O6R.LJJIIZ(C32151Nz.LJIIZILJ(485)));
        View findViewById = view.findViewById(R.id.h8d);
        if (findViewById != null) {
            ViewGroup.LayoutParams layoutParams = findViewById.getLayoutParams();
            layoutParams.width = min;
            layoutParams.height = C47959Irz.LIZJ(92, (int) (min * 0.89f));
            findViewById.setLayoutParams(layoutParams);
        }
        C29701Eo c29701Eo = this.LLFZ;
        if (c29701Eo != null) {
            ViewGroup.LayoutParams layoutParams2 = c29701Eo.getLayoutParams();
            layoutParams2.width = min;
            layoutParams2.height = (int) (min * 0.89f);
            c29701Eo.setLayoutParams(layoutParams2);
        }
        C248389ow c248389ow = (C248389ow) C95J.LIZ(22);
        if (c248389ow != null) {
            c248389ow.LIZIZ(C212428Vi.LIZ(this), C212428Vi.LIZLLL(this));
        }
    }
}

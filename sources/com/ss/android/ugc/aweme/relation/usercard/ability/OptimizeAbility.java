package com.ss.android.ugc.aweme.relation.usercard.ability;

import X.C27484AqW;
import X.C32151Nz;
import X.C52782Kna;
import X.C57859MnH;
import X.C57898Mnu;
import X.C57913Mo9;
import X.C76800UCe;
import X.InterfaceC70422pa;
import X.InterfaceC88472Yns;
import X.L7Y;
import X.O6R;
import android.text.TextUtils;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.relation.model.RecUser;
import kotlin.jvm.internal.AqS159S0100000_9;

/* loaded from: classes10.dex */
public final class OptimizeAbility implements IOptimizeAbility {
    public static TuxTextView LJLILLLLZI;
    public final InterfaceC88472Yns<InterfaceC88472Yns<? super InterfaceC70422pa, C76800UCe>, C76800UCe> LJLIL;

    @Override // com.ss.android.ugc.aweme.relation.usercard.ability.IOptimizeAbility
    public final void Kh0() {
        C27484AqW.LJ(C57913Mo9.LJLIL);
    }

    @Override // com.ss.android.ugc.aweme.relation.usercard.ability.IOptimizeAbility
    public final void Xd(RecUser recUser) {
        C27484AqW.LJ(new AqS159S0100000_9(recUser, 852));
    }

    public OptimizeAbility(C57859MnH c57859MnH, L7Y l7y) {
        this.LJLIL = l7y;
        O6R.LJJIIZ(C32151Nz.LJIIZILJ(126));
        if (!((Boolean) C52782Kna.LIZ.getValue()).booleanValue() && c57859MnH.getListConfig().LIZ == 400) {
            if (LJLILLLLZI == null) {
                TuxTextView tuxTextView = new TuxTextView(C57898Mnu.LIZIZ(c57859MnH), null, 6, 0);
                tuxTextView.setEllipsize(TextUtils.TruncateAt.END);
                tuxTextView.setMaxLines(2);
                tuxTextView.setTuxFont(61);
                LJLILLLLZI = tuxTextView;
            }
            if (c57859MnH.getUiConfig().LIZ == 101) {
                O6R.LJJIIZ(C32151Nz.LJIIZILJ(136));
            }
        }
    }
}

package com.ss.android.ugc.aweme.profile.editprofile.pronouns.powerlist;

import X.C16880lQ;
import X.C1FL;
import X.C214298b3;
import X.C238309Ww;
import X.C252629vm;
import X.C252639vn;
import X.C252649vo;
import X.C27680Atg;
import X.C27702Au2;
import X.C27703Au3;
import X.C65352Pkq;
import X.C65776Prg;
import X.C9BD;
import X.C9BE;
import X.C9QR;
import X.C9XN;
import X.InterfaceC65784Pro;
import X.YE1;
import Y.ACListenerS24S0100000_4;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.profile.editprofile.pronouns.viewmodel.ProfileEditPronounsSearchAndDisplayViewModel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS154S0100000_4;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class PronounCell extends PowerCell<C9QR> {
    public TuxTextView LJLIL;
    public final C214298b3 LJLILLLLZI;
    public Context LJLJI;

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onItemViewCreated() {
        C16880lQ.LJIIJ(new ACListenerS24S0100000_4(this, 117), this.itemView);
    }

    public PronounCell() {
        C214298b3 c214298b3;
        C9BE c9be = C9BE.LIZ;
        C65776Prg LIZ = C65352Pkq.LIZ(ProfileEditPronounsSearchAndDisplayViewModel.class);
        AqS154S0100000_4 aqS154S0100000_4 = new AqS154S0100000_4(LIZ, 672);
        C252629vm c252629vm = C252629vm.INSTANCE;
        if (o.LJ(c9be, C9BD.LIZ)) {
            c214298b3 = new C214298b3(LIZ, aqS154S0100000_4, C27702Au2.INSTANCE, new AqS154S0100000_4(this, 673), new AqS154S0100000_4(this, 674), C252649vo.INSTANCE, c252629vm, new AqS154S0100000_4(this, 675), 256);
        } else if (o.LJ(c9be, c9be)) {
            c214298b3 = new C214298b3(LIZ, aqS154S0100000_4, C27703Au3.INSTANCE, new AqS154S0100000_4(this, 676), new AqS154S0100000_4(this, 667), C252639vn.INSTANCE, c252629vm, new AqS154S0100000_4(this, 668), 256);
        } else if (c9be == null || o.LJ(c9be, C9XN.LIZ)) {
            c214298b3 = new C214298b3(LIZ, aqS154S0100000_4, C27680Atg.INSTANCE, new AqS154S0100000_4(this, 669), new AqS154S0100000_4(this, 670), new AqS154S0100000_4(this, 671), c252629vm, (InterfaceC65784Pro) null, 384);
        } else {
            throw new IllegalArgumentException(YE1.LIZJ("Don't support this VMScope: ", c9be, " there"));
        }
        this.LJLILLLLZI = c214298b3;
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(C9QR c9qr) {
        C9QR t = c9qr;
        o.LJIIIZ(t, "t");
        TuxTextView tuxTextView = this.LJLIL;
        if (tuxTextView != null) {
            tuxTextView.setText(t.LJLIL);
        } else {
            o.LJIJI("pronounTuxTuxTextView");
            throw null;
        }
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup parent) {
        int i;
        o.LJIIIZ(parent, "parent");
        Context context = parent.getContext();
        o.LJIIIIZZ(context, "parent.context");
        this.LJLJI = context;
        if (C238309Ww.LIZJ()) {
            i = R.layout.c84;
        } else {
            i = R.layout.c83;
        }
        View LIZIZ = C1FL.LIZIZ(parent, i, parent, false, "view");
        View findViewById = LIZIZ.findViewById(R.id.ieb);
        o.LJIIIIZZ(findViewById, "view.findViewById(R.id.pronoun)");
        this.LJLIL = (TuxTextView) findViewById;
        return LIZIZ;
    }
}

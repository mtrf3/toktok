package com.ss.android.ugc.aweme.profile.aigc;

import X.C116414hZ;
import X.C1DI;
import X.C214298b3;
import X.C65352Pkq;
import X.C65776Prg;
import X.C9BD;
import X.C9BE;
import X.C9XN;
import X.InterfaceC65784Pro;
import X.SS5;
import X.SS6;
import X.SS7;
import X.SS8;
import X.SS9;
import X.SSA;
import X.TBT;
import X.YE1;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.ies.powerlist.footer.PowerLoadingCell;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS162S0100000_12;
import kotlin.jvm.internal.AqS178S0100000_12;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class ProfileAigcChooseAvatarFooterCell extends PowerLoadingCell {
    public final C214298b3 LJLIL;
    public TuxIconView LJLILLLLZI;
    public C116414hZ LJLJI;
    public TuxTextView LJLJJI;

    public final ProfileAigcAvatarViewModel Q() {
        return (ProfileAigcAvatarViewModel) this.LJLIL.getValue();
    }

    public ProfileAigcChooseAvatarFooterCell() {
        C214298b3 c214298b3;
        C9BE c9be = C9BE.LIZ;
        C65776Prg LIZ = C65352Pkq.LIZ(ProfileAigcAvatarViewModel.class);
        AqS162S0100000_12 aqS162S0100000_12 = new AqS162S0100000_12(LIZ, 829);
        SS8 ss8 = SS8.INSTANCE;
        if (o.LJ(c9be, C9BD.LIZ)) {
            c214298b3 = new C214298b3(LIZ, aqS162S0100000_12, SS6.INSTANCE, new AqS162S0100000_12(this, 830), new AqS162S0100000_12(this, 831), SSA.INSTANCE, ss8, new AqS162S0100000_12(this, 832), 256);
        } else if (o.LJ(c9be, c9be)) {
            c214298b3 = new C214298b3(LIZ, aqS162S0100000_12, SS7.INSTANCE, new AqS162S0100000_12(this, 833), new AqS162S0100000_12(this, 824), SS9.INSTANCE, ss8, new AqS162S0100000_12(this, 825), 256);
        } else if (c9be == null || o.LJ(c9be, C9XN.LIZ)) {
            c214298b3 = new C214298b3(LIZ, aqS162S0100000_12, SS5.INSTANCE, new AqS162S0100000_12(this, 826), new AqS162S0100000_12(this, 827), new AqS162S0100000_12(this, 828), ss8, (InterfaceC65784Pro) null, 384);
        } else {
            throw new IllegalArgumentException(YE1.LIZJ("Don't support this VMScope: ", c9be, " there"));
        }
        this.LJLIL = c214298b3;
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onItemViewCreated() {
        super.onItemViewCreated();
        View findViewById = this.itemView.findViewById(R.id.g7l);
        o.LJIIIIZZ(findViewById, "itemView.findViewById(R.id.load_more_icon)");
        this.LJLILLLLZI = (TuxIconView) findViewById;
        View findViewById2 = this.itemView.findViewById(R.id.k_i);
        o.LJIIIIZZ(findViewById2, "itemView.findViewById(R.id.spinner_icon)");
        this.LJLJI = (C116414hZ) findViewById2;
        View findViewById3 = this.itemView.findViewById(R.id.text);
        o.LJIIIIZZ(findViewById3, "itemView.findViewById(R.id.text)");
        this.LJLJJI = (TuxTextView) findViewById3;
        ProfileAigcAvatarViewModel.jv0(Q(), new TBT() { // from class: X.SRA
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((SIN) obj).LJLJJLL;
            }
        }, this, new AqS178S0100000_12(this, 251));
    }

    public final void T(boolean z) {
        if (z) {
            TuxIconView tuxIconView = this.LJLILLLLZI;
            if (tuxIconView != null) {
                tuxIconView.setAlpha(1.0f);
                TuxTextView tuxTextView = this.LJLJJI;
                if (tuxTextView != null) {
                    tuxTextView.setAlpha(1.0f);
                    return;
                } else {
                    o.LJIJI("text");
                    throw null;
                }
            }
            o.LJIJI("loadMoreIcon");
            throw null;
        }
        TuxIconView tuxIconView2 = this.LJLILLLLZI;
        if (tuxIconView2 != null) {
            tuxIconView2.setAlpha(0.5f);
            TuxTextView tuxTextView2 = this.LJLJJI;
            if (tuxTextView2 != null) {
                tuxTextView2.setAlpha(0.5f);
                return;
            } else {
                o.LJIJI("text");
                throw null;
            }
        }
        o.LJIJI("loadMoreIcon");
        throw null;
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        return C1DI.LIZ(viewGroup, "parent", R.layout.c3a, viewGroup, false, "from(parent.context)\n   …nate_view, parent, false)");
    }
}

package com.ss.android.ugc.aweme.roaming;

import X.ActivityC45651qj;
import X.C16880lQ;
import X.C1DG;
import X.C214298b3;
import X.C54638LcQ;
import X.C54652Lce;
import X.C54662Lco;
import X.C54676Ld2;
import X.C54753LeH;
import X.C54754LeI;
import X.C56291M7j;
import X.C56292M7k;
import X.C56293M7l;
import X.C65352Pkq;
import X.C65776Prg;
import X.C78685UuP;
import X.C9BD;
import X.C9BE;
import X.C9XN;
import X.InterfaceC65784Pro;
import X.LJ5;
import X.YE1;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS159S0100000_9;
import kotlin.jvm.internal.AqS175S0100000_9;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class NearbyRegionCell extends PowerCell<C54638LcQ> implements View.OnClickListener {
    public final C214298b3 LJLIL;
    public TuxTextView LJLILLLLZI;
    public TuxTextView LJLJI;

    public NearbyRegionCell() {
        C214298b3 c214298b3;
        C9BE c9be = C9BE.LIZ;
        C65776Prg LIZ = C65352Pkq.LIZ(RegionSearchViewModel.class);
        AqS159S0100000_9 aqS159S0100000_9 = new AqS159S0100000_9(LIZ, 587);
        C54676Ld2 c54676Ld2 = C54676Ld2.INSTANCE;
        if (o.LJ(c9be, C9BD.LIZ)) {
            c214298b3 = new C214298b3(LIZ, aqS159S0100000_9, C56292M7k.INSTANCE, new AqS159S0100000_9(this, 588), new AqS159S0100000_9(this, 589), C54754LeI.INSTANCE, c54676Ld2, new AqS159S0100000_9(this, 590), 256);
        } else if (o.LJ(c9be, c9be)) {
            c214298b3 = new C214298b3(LIZ, aqS159S0100000_9, C56293M7l.INSTANCE, new AqS159S0100000_9(this, 591), new AqS159S0100000_9(this, 582), C54753LeH.INSTANCE, c54676Ld2, new AqS159S0100000_9(this, 583), 256);
        } else if (c9be == null || o.LJ(c9be, C9XN.LIZ)) {
            c214298b3 = new C214298b3(LIZ, aqS159S0100000_9, C56291M7j.INSTANCE, new AqS159S0100000_9(this, 584), new AqS159S0100000_9(this, 585), new AqS159S0100000_9(this, 586), c54676Ld2, (InterfaceC65784Pro) null, 384);
        } else {
            throw new IllegalArgumentException(YE1.LIZJ("Don't support this VMScope: ", c9be, " there"));
        }
        this.LJLIL = c214298b3;
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(C54638LcQ c54638LcQ) {
        C54638LcQ t = c54638LcQ;
        o.LJIIIZ(t, "t");
        super.onBindItemView(t);
        if (C78685UuP.LJJJZ(t.LJLIL.getParentName())) {
            TuxTextView tuxTextView = this.LJLJI;
            if (tuxTextView != null) {
                tuxTextView.setText(t.LJLIL.getParentName());
                TuxTextView tuxTextView2 = this.LJLJI;
                if (tuxTextView2 != null) {
                    tuxTextView2.setVisibility(0);
                } else {
                    o.LJIJI("tvL1Name");
                    throw null;
                }
            } else {
                o.LJIJI("tvL1Name");
                throw null;
            }
        } else {
            TuxTextView tuxTextView3 = this.LJLJI;
            if (tuxTextView3 != null) {
                tuxTextView3.setVisibility(8);
            } else {
                o.LJIJI("tvL1Name");
                throw null;
            }
        }
        TuxTextView tuxTextView4 = this.LJLILLLLZI;
        if (tuxTextView4 != null) {
            tuxTextView4.setText(t.LJLIL.getName());
        } else {
            o.LJIJI("tvL2Name");
            throw null;
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        String str;
        String str2;
        C54638LcQ item = getItem();
        if (item == null) {
            return;
        }
        String str3 = ((C54662Lco) ((AssemViewModel) this.LJLIL.getValue()).getState()).LJLIL;
        if (str3 == null || str3.length() == 0) {
            str = "all_regions";
        } else {
            str = "search_region";
        }
        ActivityC45651qj LJ = C1DG.LJ(this.itemView, "itemView.context");
        if (LJ != null) {
            RoamingLocationInfo LIZIZ = LJ5.LIZIZ(LJ);
            String name = item.LJLIL.getName();
            if (LIZIZ != null) {
                str2 = LIZIZ.getManualRegionName();
            } else {
                str2 = null;
            }
            C54652Lce.LIZJ(str, name, str2);
        }
        ((AssemViewModel) this.LJLIL.getValue()).setState(new AqS175S0100000_9(item.LJLIL, 528));
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup parent) {
        o.LJIIIZ(parent, "parent");
        View LLLLIILL = C16880lQ.LLLLIILL(C16880lQ.LLZIL(parent.getContext()), R.layout.bwe, parent, false);
        C16880lQ.LJIIJ(this, LLLLIILL);
        View findViewById = LLLLIILL.findViewById(R.id.m_b);
        o.LJIIIIZZ(findViewById, "view.findViewById(R.id.tv_l1_name)");
        this.LJLJI = (TuxTextView) findViewById;
        View findViewById2 = LLLLIILL.findViewById(R.id.m_c);
        o.LJIIIIZZ(findViewById2, "view.findViewById(R.id.tv_l2_name)");
        this.LJLILLLLZI = (TuxTextView) findViewById2;
        return LLLLIILL;
    }
}

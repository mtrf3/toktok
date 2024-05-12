package com.ss.android.ugc.aweme.paidcontent.assem;

import X.C16880lQ;
import X.C184077Kh;
import X.C213688a4;
import X.C214368bA;
import X.C214378bB;
import X.C214528bQ;
import X.C221108m2;
import X.C234529Ii;
import X.C237869Ve;
import X.C252709vu;
import X.C254069y6;
import X.C254109yA;
import X.C254119yB;
import X.C254229yM;
import X.C47704Ins;
import X.C55749LuL;
import X.C57939MoZ;
import X.C62822Ol8;
import X.C65352Pkq;
import X.C65776Prg;
import X.C73305Spp;
import X.C78926UyI;
import X.C8W0;
import X.C8YN;
import X.C9KF;
import X.FKM;
import X.FMX;
import X.HG3;
import X.InterfaceC65784Pro;
import X.JBR;
import X.RBX;
import X.SY4;
import X.SYL;
import X.TBT;
import X.X1D;
import Y.ACListenerS24S0100000_4;
import android.view.View;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.ext_power_list.UIListContentAssem;
import com.ss.android.ugc.aweme.paidcontent.viewmodel.PaidContentCollectionListAssemViewModel;
import com.ss.android.ugc.aweme.tux.business.powerlist.LoadingFooterCell;
import com.zhiliaoapp.musically.R;
import defpackage.s1;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AqS154S0100000_4;
import kotlin.jvm.internal.AqS170S0100000_4;
import kotlin.jvm.internal.AqS183S0100000_1;
import kotlin.jvm.internal.AqS186S0100000_4;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class PaidContentPromoteListAssem extends UIListContentAssem<PaidContentCollectionListAssemViewModel> {
    public final C55749LuL LJLIL;
    public final C214378bB LJLILLLLZI;
    public final C62822Ol8 LJLJI;
    public C73305Spp LJLJJI;
    public SY4 LJLJJL;
    public final C62822Ol8 LJLJJLL;
    public final C62822Ol8 LJLJL;

    public PaidContentPromoteListAssem() {
        InterfaceC65784Pro LJIILJJIL;
        new LinkedHashMap();
        this.LJLIL = new C55749LuL(C47704Ins.LIZJ(this, C254229yM.class, "paid_content_collection_list_hierarchy_data_key"), checkSupervisorPrepared());
        AqS154S0100000_4 aqS154S0100000_4 = new AqS154S0100000_4(this, 559);
        C65776Prg LIZ = C65352Pkq.LIZ(PaidContentCollectionListAssemViewModel.class);
        C254069y6 c254069y6 = C254069y6.INSTANCE;
        if (C214368bA.LJIIIIZZ) {
            LJIILJJIL = new AqS154S0100000_4((C8W0) this, 558);
        } else {
            LJIILJJIL = C78926UyI.LJIILJJIL(this, true);
        }
        this.LJLILLLLZI = new C214378bB(LIZ, aqS154S0100000_4, C214528bQ.LJLIL, C78926UyI.LJJII(this, false), C184077Kh.LJLIL, c254069y6, LJIILJJIL, C78926UyI.LJIIZILJ(this, true));
        this.LJLJI = C221108m2.LIZIZ(C254109yA.LJLIL);
        this.LJLJJLL = C221108m2.LIZIZ(new AqS154S0100000_4(this, 557));
        this.LJLJL = C221108m2.LIZIZ(new AqS154S0100000_4(this, 556));
    }

    public final C254229yM C3() {
        return (C254229yM) this.LJLIL.getValue();
    }

    @Override // com.bytedance.ext_power_list.UIListContentAssem
    /* renamed from: E3, reason: merged with bridge method [inline-methods] */
    public final PaidContentCollectionListAssemViewModel A3() {
        return (PaidContentCollectionListAssemViewModel) this.LJLILLLLZI.getValue();
    }

    @Override // com.bytedance.ext_power_list.UIListContentAssem
    public final SYL v3() {
        Object value = this.LJLJJLL.getValue();
        o.LJIIIIZZ(value, "<get-list>(...)");
        return (SYL) value;
    }

    @Override // com.bytedance.ext_power_list.UIListContentAssem
    public final C57939MoZ x3() {
        C57939MoZ c57939MoZ = new C57939MoZ();
        c57939MoZ.LIZIZ = true;
        c57939MoZ.LIZ = 4;
        c57939MoZ.LIZJ = LoadingFooterCell.class;
        return c57939MoZ;
    }

    @Override // com.bytedance.ext_power_list.UIListContentAssem, com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        o.LJIIIZ(view, "view");
        super.onViewCreated(view);
        View findViewById = getContainerView().findViewById(R.id.ibp);
        o.LJIIIIZZ(findViewById, "containerView.findViewBy…R.id.promote_status_view)");
        C73305Spp c73305Spp = (C73305Spp) findViewById;
        this.LJLJJI = c73305Spp;
        c73305Spp.LJFF();
        C73305Spp c73305Spp2 = this.LJLJJI;
        if (c73305Spp2 != null) {
            c73305Spp2.setVisibility(0);
            C8YN.LJII(this, A3(), new TBT() { // from class: X.9y7
                @Override // X.TBT, X.TBZ, X.TBW
                public final Object get(Object obj) {
                    return ((C254149yE) obj).LJLIL;
                }
            }, C213688a4.LIZLLL(), new AqS186S0100000_4(this, 150), 4);
            AssemViewModel.asyncSubscribe$default(A3(), new TBT() { // from class: X.9y5
                @Override // X.TBT, X.TBZ, X.TBW
                public final Object get(Object obj) {
                    C254149yE c254149yE = (C254149yE) obj;
                    c254149yE.getClass();
                    return C208708Ha.LIZLLL(c254149yE);
                }
            }, null, new AqS170S0100000_4(this, 483), C254119yB.LJLIL, new AqS170S0100000_4(this, 484), 2, null);
            C252709vu c252709vu = (C252709vu) view.findViewById(R.id.ibs);
            C234529Ii LIZJ = s1.LIZJ();
            LIZJ.LIZJ = R.raw.icon_chevron_left_ltr;
            LIZJ.LIZLLL = true;
            LIZJ.LIZIZ(new AqS154S0100000_4(this, 1012));
            c252709vu.LIZJ(LIZJ);
            C9KF c9kf = new C9KF();
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append(FKM.LIZJ().getString(R.string.qk3));
            LIZ.append(' ');
            c9kf.LIZ(X1D.LIZIZ(LIZ));
            c9kf.LJ = R.raw.icon_info_circle;
            c9kf.LIZ = new C237869Ve(new AqS154S0100000_4(this, 1013));
            c252709vu.LJIILLIIL(c9kf);
            View findViewById2 = view.findViewById(R.id.ibd);
            o.LJIIIIZZ(findViewById2, "rootView.findViewById(R.id.promote_button)");
            SY4 sy4 = (SY4) findViewById2;
            this.LJLJJL = sy4;
            sy4.setText(FKM.LIZJ().getString(R.string.qpl));
            SY4 sy42 = this.LJLJJL;
            if (sy42 != null) {
                sy42.setEnabled(false);
                C8YN.LJII(this, A3(), new TBT() { // from class: X.9y8
                    @Override // X.TBT, X.TBZ, X.TBW
                    public final Object get(Object obj) {
                        return ((C254149yE) obj).LJLJI;
                    }
                }, C213688a4.LIZLLL(), new AqS186S0100000_4(this, 244), 4);
                C8YN.LJII(this, A3(), new TBT() { // from class: X.9y9
                    @Override // X.TBT, X.TBZ, X.TBW
                    public final Object get(Object obj) {
                        return ((C254149yE) obj).LJLJJI;
                    }
                }, C213688a4.LIZLLL(), new AqS183S0100000_1(view, 64), 4);
                SY4 sy43 = this.LJLJJL;
                if (sy43 != null) {
                    C16880lQ.LJJIZ(sy43, new ACListenerS24S0100000_4(this, 207));
                    FMX.LJIIL("show_add_series_to_post", JBR.LJIIIIZZ("enter_from", C3().LJLJI, "author_id", ((RBX) HG3.LJIILL()).getCurUserId()).LIZ);
                    return;
                } else {
                    o.LJIJI("promoteButton");
                    throw null;
                }
            }
            o.LJIJI("promoteButton");
            throw null;
        }
        o.LJIJI("statusView");
        throw null;
    }
}

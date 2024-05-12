package com.ss.android.ugc.aweme.paidcontent.assem;

import X.C16880lQ;
import X.C184077Kh;
import X.C188727au;
import X.C19N;
import X.C213688a4;
import X.C214368bA;
import X.C214378bB;
import X.C214528bQ;
import X.C221108m2;
import X.C234529Ii;
import X.C252709vu;
import X.C254229yM;
import X.C254289yS;
import X.C254299yT;
import X.C254329yW;
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
import X.FMX;
import X.HG3;
import X.InterfaceC65784Pro;
import X.RBX;
import X.SY4;
import X.SYL;
import X.TBT;
import Y.ACListenerS24S0100000_4;
import Y.ARunnableS23S0200000_4;
import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.ext_power_list.UIListContentAssem;
import com.ss.android.ugc.aweme.paidcontent.experiment.PaidContentFeedbackIntegrationURLSetting;
import com.ss.android.ugc.aweme.paidcontent.viewmodel.PaidContentCollectionListAssemViewModel;
import com.ss.android.ugc.aweme.tux.business.powerlist.LoadingFooterCell;
import com.zhiliaoapp.musically.R;
import defpackage.s1;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AqS135S0200000_4;
import kotlin.jvm.internal.AqS151S0200000_4;
import kotlin.jvm.internal.AqS154S0100000_4;
import kotlin.jvm.internal.AqS166S0200000_3;
import kotlin.jvm.internal.AqS167S0200000_4;
import kotlin.jvm.internal.AqS186S0100000_4;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class PaidContentCollectionListAssem extends UIListContentAssem<PaidContentCollectionListAssemViewModel> {
    public final C55749LuL LJLIL;
    public boolean LJLILLLLZI;
    public final C214378bB LJLJI;
    public final C62822Ol8 LJLJJI;
    public C252709vu LJLJJL;
    public C234529Ii LJLJJLL;
    public SY4 LJLJL;
    public LinearLayout LJLJLJ;
    public final C62822Ol8 LJLJLLL;
    public final C62822Ol8 LJLL;

    public PaidContentCollectionListAssem() {
        InterfaceC65784Pro LJIILJJIL;
        new LinkedHashMap();
        this.LJLIL = new C55749LuL(C47704Ins.LIZJ(this, C254229yM.class, "paid_content_collection_list_hierarchy_data_key"), checkSupervisorPrepared());
        AqS154S0100000_4 aqS154S0100000_4 = new AqS154S0100000_4(this, 555);
        C65776Prg LIZ = C65352Pkq.LIZ(PaidContentCollectionListAssemViewModel.class);
        C254289yS c254289yS = C254289yS.INSTANCE;
        if (C214368bA.LJIIIIZZ) {
            LJIILJJIL = new AqS154S0100000_4((C8W0) this, 554);
        } else {
            LJIILJJIL = C78926UyI.LJIILJJIL(this, true);
        }
        this.LJLJI = new C214378bB(LIZ, aqS154S0100000_4, C214528bQ.LJLIL, C78926UyI.LJJII(this, false), C184077Kh.LJLIL, c254289yS, LJIILJJIL, C78926UyI.LJIIZILJ(this, true));
        this.LJLJJI = C221108m2.LIZIZ(C254299yT.LJLIL);
        this.LJLJLLL = C221108m2.LIZIZ(new AqS154S0100000_4(this, 553));
        this.LJLL = C221108m2.LIZIZ(new AqS154S0100000_4(this, 552));
    }

    public final C254229yM C3() {
        return (C254229yM) this.LJLIL.getValue();
    }

    @Override // com.bytedance.ext_power_list.UIListContentAssem
    /* renamed from: E3, reason: merged with bridge method [inline-methods] */
    public final PaidContentCollectionListAssemViewModel A3() {
        return (PaidContentCollectionListAssemViewModel) this.LJLJI.getValue();
    }

    @Override // com.bytedance.ext_power_list.UIListContentAssem
    public final SYL v3() {
        Object value = this.LJLJLLL.getValue();
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

    public final void F3() {
        SY4 sy4;
        Context context = getContext();
        if (context != null && (sy4 = this.LJLJL) != null) {
            getContainerView().post(new ARunnableS23S0200000_4(context, sy4, 14));
            C188727au c188727au = new C188727au();
            c188727au.LJIIIZ("enter_from", "personal_homepage");
            FMX.LJIIL("show_mobile_creation_tooltip", c188727au.LIZ);
        }
    }

    @Override // com.bytedance.ext_power_list.UIListContentAssem, com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        C252709vu c252709vu;
        o.LJIIIZ(view, "view");
        super.onViewCreated(view);
        View findViewById = getContainerView().findViewById(R.id.hg5);
        o.LJIIIIZZ(findViewById, "containerView.findViewBy…d_collection_status_view)");
        C73305Spp c73305Spp = (C73305Spp) findViewById;
        c73305Spp.LJFF();
        c73305Spp.setVisibility(0);
        this.LJLJL = (SY4) getContainerView().findViewById(R.id.hgh);
        this.LJLJLJ = (LinearLayout) getContainerView().findViewById(R.id.c0c);
        C8YN.LJII(this, A3(), new TBT() { // from class: X.9yQ
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                C254149yE c254149yE = (C254149yE) obj;
                c254149yE.getClass();
                return C208708Ha.LIZ(c254149yE);
            }
        }, C213688a4.LIZLLL(), new AqS186S0100000_4(this, 148), 4);
        C8YN.LJII(this, A3(), new TBT() { // from class: X.9yP
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C254149yE) obj).LJLIL;
            }
        }, C213688a4.LIZLLL(), new AqS186S0100000_4(this, 149), 4);
        AssemViewModel.asyncSubscribe$default(A3(), new TBT() { // from class: X.9yR
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                C254149yE c254149yE = (C254149yE) obj;
                c254149yE.getClass();
                return C208708Ha.LIZLLL(c254149yE);
            }
        }, null, new AqS135S0200000_4(this, c73305Spp, 74), C254329yW.LJLIL, new AqS135S0200000_4(this, c73305Spp, 75), 2, null);
        v3().setLayoutManager(new StaggeredGridLayoutManager(2, 1));
        this.LJLJJL = (C252709vu) view.findViewById(R.id.hg6);
        if (C3().LJLJLJ == 55) {
            C252709vu c252709vu2 = this.LJLJJL;
            if (c252709vu2 != null) {
                C234529Ii LIZJ = s1.LIZJ();
                LIZJ.LIZJ = R.raw.icon_x_mark_small;
                LIZJ.LIZLLL = true;
                LIZJ.LIZIZ(new AqS154S0100000_4(this, 1015));
                c252709vu2.LIZJ(LIZJ);
                C9KF c9kf = new C9KF();
                String string = c252709vu2.getResources().getString(R.string.qng);
                o.LJIIIIZZ(string, "resources.getString(R.st…_post_anchor_sheetheader)");
                c9kf.LIZJ = string;
                c252709vu2.LJIILLIIL(c9kf);
            }
        } else {
            C252709vu c252709vu3 = this.LJLJJL;
            if (c252709vu3 != null) {
                C234529Ii LIZJ2 = s1.LIZJ();
                LIZJ2.LIZJ = R.raw.icon_chevron_left_ltr;
                LIZJ2.LIZLLL = true;
                LIZJ2.LIZIZ(new AqS154S0100000_4(this, 1016));
                c252709vu3.LIZJ(LIZJ2);
                C9KF c9kf2 = new C9KF();
                String string2 = c252709vu3.getResources().getString(R.string.qk4);
                o.LJIIIIZZ(string2, "resources.getString(R.st…ries_allseries_pagetitle)");
                c9kf2.LIZJ = string2;
                c252709vu3.LJIILLIIL(c9kf2);
            }
            PaidContentFeedbackIntegrationURLSetting.FeedbackIntegrationInfoStructJsonModel LIZ = PaidContentFeedbackIntegrationURLSetting.LIZ();
            if (C3().LJLILLLLZI == 1) {
                if (C19N.LJ("creator_m10n_android_feedback_integration_enabled", false) && LIZ != null && (c252709vu = this.LJLJJL) != null) {
                    C234529Ii LIZJ3 = s1.LIZJ();
                    LIZJ3.LIZJ = R.raw.icon_bubble_ellipsis_right;
                    LIZJ3.LIZIZ(new AqS151S0200000_4(this, LIZ, 25));
                    c252709vu.LIZIZ(LIZJ3);
                }
                if (C19N.LJ("promote_paid_content_anchor_video_is_enabled", false) && o.LJ(String.valueOf(C3().LJLIL), ((RBX) HG3.LJIILL()).getCurUserId())) {
                    C234529Ii LIZJ4 = s1.LIZJ();
                    LIZJ4.LIZJ = R.raw.icon_horn_ltr;
                    LIZJ4.LIZIZ = "promote";
                    LIZJ4.LIZIZ(new AqS154S0100000_4(this, 1009));
                    this.LJLJJLL = LIZJ4;
                    C252709vu c252709vu4 = this.LJLJJL;
                    if (c252709vu4 != null) {
                        c252709vu4.LIZIZ(LIZJ4);
                    }
                }
            }
        }
        if (C3().LJLJJLL) {
            LinearLayout linearLayout = (LinearLayout) getContainerView().findViewById(R.id.hfs);
            LinearLayout linearLayout2 = (LinearLayout) getContainerView().findViewById(R.id.hfr);
            if (linearLayout2 != null) {
                linearLayout2.setVisibility(0);
            }
            C8YN.LJII(this, A3(), new TBT() { // from class: X.9yF
                @Override // X.TBT, X.TBZ, X.TBW
                public final Object get(Object obj) {
                    return ((C254149yE) obj).LJLJJL;
                }
            }, C213688a4.LIZLLL(), new AqS166S0200000_3(linearLayout, linearLayout2, 21), 4);
            C8YN.LJII(this, A3(), new TBT() { // from class: X.9yV
                @Override // X.TBT, X.TBZ, X.TBW
                public final Object get(Object obj) {
                    return ((C254149yE) obj).LJLILLLLZI;
                }
            }, C213688a4.LIZLLL(), new AqS167S0200000_4(linearLayout2, linearLayout, 24), 4);
            C16880lQ.LJIIZILJ(linearLayout, new ACListenerS24S0100000_4(this, 210));
        }
    }
}

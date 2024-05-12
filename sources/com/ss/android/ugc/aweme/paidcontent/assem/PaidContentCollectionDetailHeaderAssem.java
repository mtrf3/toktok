package com.ss.android.ugc.aweme.paidcontent.assem;

import X.A42;
import X.A45;
import X.A46;
import X.ActivityC45651qj;
import X.C184077Kh;
import X.C19N;
import X.C212428Vi;
import X.C213688a4;
import X.C214298b3;
import X.C214368bA;
import X.C214378bB;
import X.C214528bQ;
import X.C221108m2;
import X.C234529Ii;
import X.C252709vu;
import X.C25594A2s;
import X.C45631qh;
import X.C47704Ins;
import X.C55749LuL;
import X.C62822Ol8;
import X.C65352Pkq;
import X.C65776Prg;
import X.C78926UyI;
import X.C8W0;
import X.C9BD;
import X.InterfaceC65784Pro;
import X.TBT;
import android.content.Context;
import android.view.View;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.model.CollectionDetailModel;
import com.ss.android.ugc.aweme.paidcontent.experiment.PaidContentFeedbackIntegrationURLSetting;
import com.ss.android.ugc.aweme.paidcontent.viewmodel.PaidContentDetailPaymentViewModel;
import com.ss.android.ugc.aweme.paidcontent.viewmodel.PaidContentDetailVideoListViewModel;
import com.zhiliaoapp.musically.R;
import defpackage.s1;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AqS151S0200000_4;
import kotlin.jvm.internal.AqS154S0100000_4;
import kotlin.jvm.internal.AqS170S0100000_4;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class PaidContentCollectionDetailHeaderAssem extends UIContentAssem {
    public final C55749LuL LJLIL;
    public final C214378bB LJLILLLLZI;
    public final C214298b3 LJLJI;
    public CollectionDetailModel LJLJJI;
    public boolean LJLJJL;
    public final C62822Ol8 LJLJJLL;

    public PaidContentCollectionDetailHeaderAssem() {
        InterfaceC65784Pro LJIILJJIL;
        new LinkedHashMap();
        this.LJLIL = new C55749LuL(C47704Ins.LIZJ(this, C25594A2s.class, "paid_content_collection_detail_hierarchy_data_key"), checkSupervisorPrepared());
        AqS154S0100000_4 aqS154S0100000_4 = new AqS154S0100000_4(this, 545);
        C65776Prg LIZ = C65352Pkq.LIZ(PaidContentDetailVideoListViewModel.class);
        A46 a46 = A46.INSTANCE;
        if (C214368bA.LJIIIIZZ) {
            LJIILJJIL = new AqS154S0100000_4((C8W0) this, 544);
        } else {
            LJIILJJIL = C78926UyI.LJIILJJIL(this, true);
        }
        this.LJLILLLLZI = new C214378bB(LIZ, aqS154S0100000_4, C214528bQ.LJLIL, C78926UyI.LJJII(this, false), C184077Kh.LJLIL, a46, LJIILJJIL, C78926UyI.LJIIZILJ(this, true));
        C9BD c9bd = C9BD.LIZ;
        C65776Prg LIZ2 = C65352Pkq.LIZ(PaidContentDetailPaymentViewModel.class);
        this.LJLJI = C78926UyI.LJ(this, LIZ2, c9bd, new AqS154S0100000_4(LIZ2, 543), A45.INSTANCE, null);
        this.LJLJJL = true;
        this.LJLJJLL = C221108m2.LIZIZ(new AqS154S0100000_4(this, 542));
    }

    public final C25594A2s v3() {
        return (C25594A2s) this.LJLIL.getValue();
    }

    public final C252709vu x3() {
        return (C252709vu) this.LJLJJLL.getValue();
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        o.LJIIIZ(view, "view");
        super.onViewCreated(view);
        AssemViewModel.asyncSubscribe$default(this.LJLILLLLZI.getValue(), new TBT() { // from class: X.A41
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((A3V) obj).LJLILLLLZI;
            }
        }, C213688a4.LIZLLL(), null, null, new AqS170S0100000_4(this, 480), 12, null);
        ActivityC45651qj LIZ = C212428Vi.LIZ(this);
        if (!v3().LJLJLJ) {
            C252709vu x3 = x3();
            C234529Ii LIZJ = s1.LIZJ();
            LIZJ.LIZJ = R.raw.icon_chevron_left_ltr;
            LIZJ.LIZLLL = true;
            LIZJ.LIZIZ(new AqS154S0100000_4(LIZ, 1010));
            x3.LIZJ(LIZJ);
        }
        if (C19N.LJ("paid_content_enable_share_series", false)) {
            C252709vu x32 = x3();
            C234529Ii LIZJ2 = s1.LIZJ();
            LIZJ2.LIZJ = R.raw.icon_3pt_arrow_turn_up_right;
            LIZJ2.LIZIZ = "share_collection";
            LIZJ2.LIZLLL = false;
            LIZJ2.LIZIZ(new AqS151S0200000_4(this, LIZ, 23));
            x32.LIZIZ(LIZJ2);
        }
        PaidContentFeedbackIntegrationURLSetting.FeedbackIntegrationInfoStructJsonModel LIZ2 = PaidContentFeedbackIntegrationURLSetting.LIZ();
        C252709vu x33 = x3();
        C234529Ii LIZJ3 = s1.LIZJ();
        LIZJ3.LIZJ = R.raw.icon_bubble_ellipsis_right;
        LIZJ3.LIZIZ = "feedback";
        LIZJ3.LJI = false;
        LIZJ3.LIZIZ(new AqS151S0200000_4(LIZ, LIZ2, 24));
        x33.LIZIZ(LIZJ3);
        C252709vu x34 = x3();
        C234529Ii LIZJ4 = s1.LIZJ();
        LIZJ4.LIZJ = R.raw.icon_ellipsis_horizontal;
        LIZJ4.LIZIZ = "paid_collection_menu";
        LIZJ4.LJI = false;
        LIZJ4.LIZIZ(new AqS154S0100000_4(this, 1011));
        x34.LIZIZ(LIZJ4);
        x3().LJIILJJIL(false);
        x3().LJIILL(R.style.ux);
        x3().setNavBackground(0);
        x3().setBackgroundColor(0);
        Context context = getContext();
        if (context != null) {
            ((C45631qh) getContainerView().findViewById(R.id.j7u)).setOnScrollChangeListener(new A42(this, context));
        }
    }
}

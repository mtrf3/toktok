package com.ss.android.ugc.aweme.trending.ui.detailpage;

import X.ActivityC45651qj;
import X.C16880lQ;
import X.C184077Kh;
import X.C212428Vi;
import X.C214368bA;
import X.C214378bB;
import X.C214528bQ;
import X.C221108m2;
import X.C47704Ins;
import X.C55749LuL;
import X.C56390MBe;
import X.C56424MCm;
import X.C62822Ol8;
import X.C65352Pkq;
import X.C65776Prg;
import X.C78897Uxp;
import X.C78926UyI;
import X.C7FC;
import X.C8YN;
import X.C96E;
import X.InterfaceC65784Pro;
import X.MB3;
import X.MBK;
import X.MBM;
import X.MBQ;
import X.MBT;
import X.ProgressDialogC43241Gy5;
import X.TBT;
import Y.ACListenerS29S0100000_9;
import Y.ACListenerS44S0200000_9;
import Y.ARunnableS23S0200000_4;
import Y.IDLCallbackS107S0200000_9;
import android.view.View;
import android.widget.TextSwitcher;
import android.widget.Toast;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.homepage.msadapt.MSAdaptionService;
import com.ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.ss.android.ugc.aweme.search.TrendingEventModel;
import com.ss.android.ugc.aweme.services.external.ui.RecordConfig;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.ss.android.ugc.aweme.trending.ui.TrendingTitleSwitcher;
import com.ss.android.ugc.aweme.trending.viewmodel.TrendingDetailSharedVM;
import com.zhiliaoapp.musically.R;
import defpackage.e1;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AqS126S0300000_9;
import kotlin.jvm.internal.AqS154S0100000_4;
import kotlin.jvm.internal.AqS159S0100000_9;
import kotlin.jvm.internal.AqS172S0200000_9;
import kotlin.jvm.internal.AqS186S0100000_4;
import kotlin.jvm.internal.AqS51S1200000_9;
import kotlin.jvm.internal.IDqS36S0300000_4;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class BottomBarAssem extends UIContentAssem {
    public final C55749LuL LJLIL;
    public final C214378bB LJLILLLLZI;
    public final C62822Ol8 LJLJI;
    public final C62822Ol8 LJLJJI;
    public ProgressDialogC43241Gy5 LJLJJL;
    public TrendingEventModel LJLJJLL;
    public boolean LJLJL;
    public TrendingTitleSwitcher LJLJLJ;

    public BottomBarAssem() {
        InterfaceC65784Pro LJIILJJIL;
        new LinkedHashMap();
        this.LJLIL = new C55749LuL(C47704Ins.LIZJ(this, MBK.class, null), checkSupervisorPrepared());
        AqS159S0100000_9 aqS159S0100000_9 = new AqS159S0100000_9(this, 666);
        C65776Prg LIZ = C65352Pkq.LIZ(TrendingDetailSharedVM.class);
        MBT mbt = MBT.INSTANCE;
        if (C214368bA.LJIIIIZZ) {
            LJIILJJIL = new AqS154S0100000_4(this, 892);
        } else {
            LJIILJJIL = C78926UyI.LJIILJJIL(this, true);
        }
        this.LJLILLLLZI = new C214378bB(LIZ, aqS159S0100000_9, C214528bQ.LJLIL, C78926UyI.LJJII(this, false), C184077Kh.LJLIL, mbt, LJIILJJIL, C78926UyI.LJIIZILJ(this, true));
        this.LJLJI = C221108m2.LIZIZ(new AqS159S0100000_9(this, 667));
        this.LJLJJI = C221108m2.LIZIZ(C56390MBe.LJLIL);
        this.LJLJL = true;
    }

    public final MBM A3() {
        return (MBM) this.LJLJI.getValue();
    }

    public final MBK v3() {
        return (MBK) this.LJLIL.getValue();
    }

    public final TrendingDetailSharedVM x3() {
        return (TrendingDetailSharedVM) this.LJLILLLLZI.getValue();
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        o.LJIIIZ(view, "view");
        View findViewById = view.findViewById(R.id.lkj);
        View findViewById2 = view.findViewById(R.id.lkr);
        TextSwitcher textSwitcher = (TextSwitcher) view.findViewById(R.id.lks);
        View findViewById3 = view.findViewById(R.id.lkv);
        TuxTextView tuxTextView = (TuxTextView) view.findViewById(R.id.lkx);
        TuxIconView tuxIconView = (TuxIconView) view.findViewById(R.id.lkw);
        View bottomShootBtn = view.findViewById(R.id.ll9);
        if (C56424MCm.LIZ()) {
            findViewById2.findViewById(R.id.lkt).setVisibility(8);
            findViewById3.setVisibility(8);
        }
        if (o.LJ(v3().LJLILLLLZI, "creator_spotlight_inspired_button") || e1.LIZ(31744, "trending_inflow_with_shoot", true, false)) {
            o.LJIIIIZZ(bottomShootBtn, "bottomShootBtn");
            C78897Uxp.LJJJJLL(bottomShootBtn);
            C16880lQ.LJIIJ(new ACListenerS29S0100000_9(this, 72), bottomShootBtn);
        } else {
            bottomShootBtn.setVisibility(8);
        }
        if (C96E.LIZ()) {
            findViewById3.post(new ARunnableS23S0200000_4(findViewById3, tuxTextView, 22));
        }
        C7FC.LIZIZ(findViewById2);
        C7FC.LIZIZ(findViewById3);
        C16880lQ.LJIIJ(new ACListenerS44S0200000_9(findViewById2, this, 20), findViewById2);
        C16880lQ.LJIIJ(new ACListenerS29S0100000_9(this, 73), findViewById3);
        C8YN.LJII(this, x3(), new TBT() { // from class: X.MBU
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return Boolean.valueOf(((C56386MBa) obj).LJLJL);
            }
        }, null, new AqS186S0100000_4(findViewById, 210), 6);
        C8YN.LJIIJ(this, x3(), new TBT() { // from class: X.MBW
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C56386MBa) obj).LJLILLLLZI;
            }
        }, new TBT() { // from class: X.MBb
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C56386MBa) obj).LJLJJL;
            }
        }, null, new MBQ(this, textSwitcher, findViewById3, tuxIconView, tuxTextView), 12);
        C8YN.LJII(this, x3(), new TBT() { // from class: X.MBZ
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C56386MBa) obj).LJLJJL;
            }
        }, null, new AqS126S0300000_9(this, textSwitcher, findViewById2, 2), 6);
        C8YN.LJIIJ(this, x3(), new TBT() { // from class: X.MBS
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                C56386MBa c56386MBa = (C56386MBa) obj;
                c56386MBa.getClass();
                return C208708Ha.LIZLLL(c56386MBa);
            }
        }, new TBT() { // from class: X.MBY
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C56386MBa) obj).LJLJJLL;
            }
        }, null, new IDqS36S0300000_4(this, findViewById3, tuxTextView, 1), 12);
        C8YN.LJII(this, x3(), new TBT() { // from class: X.MBV
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C56386MBa) obj).LJLJI;
            }
        }, null, new AqS172S0200000_9(this, findViewById2, 5), 6);
    }

    public final void C3(MusicModel musicModel, String str) {
        String str2;
        if (C212428Vi.LIZ(this) != null && MSAdaptionService.LJIIL().LJI(C212428Vi.LIZ(this))) {
            ActivityC45651qj LIZ = C212428Vi.LIZ(this);
            ActivityC45651qj LIZ2 = C212428Vi.LIZ(this);
            if (LIZ2 != null) {
                str2 = LIZ2.getString(R.string.f1i);
            } else {
                str2 = null;
            }
            C16880lQ.LLZILL(Toast.makeText(LIZ, str2, 0));
            return;
        }
        MB3.LIZLLL();
        RecordConfig.Builder builder = new RecordConfig.Builder();
        builder.shootWay("from_trends");
        builder.enterMethod("click_trending_shoot_button");
        builder.enterFrom("trending_inflow_page");
        String trendingEventId = v3().LJLJI.getTrendingEventId();
        o.LJI(trendingEventId);
        builder.postTrendsId(trendingEventId);
        builder.postTrendsType("100");
        if (str != null) {
            builder.musicPath(str);
        }
        if (musicModel != null) {
            builder.musicModel(musicModel);
        }
        ActivityC45651qj LIZ3 = C212428Vi.LIZ(this);
        if (LIZ3 != null) {
            AVExternalServiceImpl.LIZ().asyncService(LIZ3, "trending_inflow", new IDLCallbackS107S0200000_9(LIZ3, builder, 3));
        }
    }

    public final void E3(View view, String str) {
        if (C56424MCm.LIZ()) {
            return;
        }
        withState(x3(), new AqS51S1200000_9(this, str, view, 0));
    }
}

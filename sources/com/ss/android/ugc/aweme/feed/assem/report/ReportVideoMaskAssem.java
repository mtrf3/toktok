package com.ss.android.ugc.aweme.feed.assem.report;

import X.C201677vn;
import X.C201707vq;
import X.C201747vu;
import X.C201757vv;
import X.C201777vx;
import X.C201787vy;
import X.C201797vz;
import X.C213688a4;
import X.C214348b8;
import X.C240999d1;
import X.C5H3;
import X.C65352Pkq;
import X.C65776Prg;
import X.C8YN;
import X.InterfaceC115514g7;
import X.InterfaceC74236TBo;
import X.TBT;
import android.view.View;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.feed.adapter.VideoPlayViewModel;
import com.ss.android.ugc.aweme.feed.adapter.VideoViewModel;
import com.ss.android.ugc.aweme.feed.assem.base.FeedBaseAssem;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AqS153S0100000_3;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class ReportVideoMaskAssem extends FeedBaseAssem<ReportVideoMaskAssem> {
    public static final /* synthetic */ InterfaceC74236TBo<Object>[] LLI;
    public final InterfaceC115514g7 LLFFF;
    public final C5H3 LLFII;
    public final C5H3 LLFZ;

    static {
        TBT tbt = new TBT(ReportVideoMaskAssem.class, "reportVM", "getReportVM()Lcom/ss/android/ugc/aweme/feed/assem/report/ReportVideoMaskVM;", 0);
        C65352Pkq.LIZ.getClass();
        LLI = new InterfaceC74236TBo[]{tbt};
    }

    @Override // com.bytedance.assem.arch.reused.ReusedAssem
    public final void F3() {
        C8YN.LJIIJ(this, p4(), new TBT() { // from class: X.7vt
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C201727vs) obj).LJLILLLLZI;
            }
        }, new TBT() { // from class: X.7vr
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return Boolean.valueOf(((C201727vs) obj).LJLIL);
            }
        }, null, C201677vn.INSTANCE, 12);
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int W3() {
        return R.layout.aeb;
    }

    public ReportVideoMaskAssem() {
        new LinkedHashMap();
        C240999d1 c240999d1 = C240999d1.LIZ;
        C65776Prg LIZ = C65352Pkq.LIZ(ReportVideoMaskVM.class);
        this.LLFFF = C214348b8.LIZ(this, LIZ, c240999d1, new AqS153S0100000_3(LIZ, 360), null, C201777vx.INSTANCE, null, null);
        this.LLFII = C214348b8.LIZIZ(this, C65352Pkq.LIZ(VideoViewModel.class), C201787vy.INSTANCE);
        this.LLFZ = C214348b8.LIZIZ(this, C65352Pkq.LIZ(VideoPlayViewModel.class), C201797vz.INSTANCE);
    }

    public final ReportVideoMaskVM p4() {
        return (ReportVideoMaskVM) this.LLFFF.LIZ(this, LLI[0]);
    }

    @Override // X.C8XO
    public final void F0(VideoItemParams item) {
        o.LJIIIZ(item, "item");
        p4().kv0();
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        o.LJIIIZ(view, "view");
        Y3().setVisibility(8);
        C8YN.LJIILJJIL(this, (AssemViewModel) this.LLFII.getValue(), new TBT() { // from class: X.7w1
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C82B) obj).LJLJLJ;
            }
        }, C213688a4.LIZLLL(), C201757vv.INSTANCE, 4);
        C8YN.LJIILJJIL(this, (AssemViewModel) this.LLFII.getValue(), new TBT() { // from class: X.7vw
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C82B) obj).LJLJI;
            }
        }, C213688a4.LIZLLL(), C201747vu.INSTANCE, 4);
        C8YN.LJIILJJIL(this, (AssemViewModel) this.LLFZ.getValue(), new TBT() { // from class: X.7w2
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C212208Um) obj).LJLIL;
            }
        }, C213688a4.LIZLLL(), C201707vq.LJLIL, 4);
    }
}

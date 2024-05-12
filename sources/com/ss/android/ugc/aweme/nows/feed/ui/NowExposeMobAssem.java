package com.ss.android.ugc.aweme.nows.feed.ui;

import X.C181847Bs;
import X.C181867Bu;
import X.C213688a4;
import X.C214348b8;
import X.C221108m2;
import X.C47704Ins;
import X.C51029K0z;
import X.C55749LuL;
import X.C5H3;
import X.C61845OOz;
import X.C62822Ol8;
import X.C65351Pkp;
import X.C65352Pkq;
import X.C65776Prg;
import X.C7B5;
import X.C7ML;
import X.C7ND;
import X.C7NE;
import X.C7NF;
import X.C7NI;
import X.C7NN;
import X.C7NO;
import X.C7NP;
import X.C8XO;
import X.C8YN;
import X.InterfaceC115514g7;
import X.InterfaceC194547kI;
import X.InterfaceC74236TBo;
import X.TBT;
import android.view.View;
import com.bytedance.assem.arch.reused.ReusedUIContentAssem;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.feed.adapter.VideoViewModel;
import com.ss.android.ugc.aweme.nows.feed.common.MarkReadApi;
import com.ss.android.ugc.aweme.nows.feed.viewmodel.NowAreaMonitorViewModel;
import com.ss.android.ugc.aweme.nows.feed.viewmodel.NowPostCellViewModel;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AqS153S0100000_3;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class NowExposeMobAssem extends ReusedUIContentAssem<NowExposeMobAssem> implements C8XO<InterfaceC194547kI> {
    public static final /* synthetic */ InterfaceC74236TBo<Object>[] LLI;
    public final InterfaceC115514g7 LJZL;
    public final InterfaceC115514g7 LL;
    public final C5H3 LLD;
    public final C62822Ol8 LLF;
    public final C55749LuL LLFF;
    public long LLFFF;
    public boolean LLFII;
    public final C62822Ol8 LLFZ;

    static {
        TBT tbt = new TBT(NowExposeMobAssem.class, "nowCellVM", "getNowCellVM()Lcom/ss/android/ugc/aweme/nows/feed/viewmodel/NowPostCellViewModel;", 0);
        C65351Pkp c65351Pkp = C65352Pkq.LIZ;
        c65351Pkp.getClass();
        LLI = new InterfaceC74236TBo[]{tbt, C61845OOz.LIZJ(NowExposeMobAssem.class, "areaMonitorVM", "getAreaMonitorVM()Lcom/ss/android/ugc/aweme/nows/feed/viewmodel/NowAreaMonitorViewModel;", 0, c65351Pkp)};
    }

    @Override // X.C8XO
    public final void LLLZIIL() {
    }

    @Override // X.C8XO
    public final void unBind() {
    }

    public NowExposeMobAssem() {
        new LinkedHashMap();
        C65776Prg LIZ = C65352Pkq.LIZ(NowPostCellViewModel.class);
        this.LJZL = C214348b8.LIZ(this, LIZ, null, new AqS153S0100000_3(LIZ, 595), null, C181867Bu.INSTANCE, null, null);
        C65776Prg LIZ2 = C65352Pkq.LIZ(NowAreaMonitorViewModel.class);
        this.LL = C214348b8.LIZ(this, LIZ2, null, new AqS153S0100000_3(LIZ2, 596), null, C7NI.INSTANCE, null, null);
        this.LLD = C214348b8.LIZIZ(this, C65352Pkq.LIZ(VideoViewModel.class), C7B5.INSTANCE);
        this.LLF = C221108m2.LIZIZ(new AqS153S0100000_3(this, 597));
        this.LLFF = new C55749LuL(C47704Ins.LIZJ(this, C181847Bs.class, "now_feed_hierarchy_data_key"), checkSupervisorPrepared());
        this.LLFZ = C221108m2.LIZIZ(new AqS153S0100000_3(this, 594));
    }

    public final C181847Bs Z3() {
        return (C181847Bs) this.LLFF.getValue();
    }

    @Override // X.C8XO
    public final void F0(InterfaceC194547kI item) {
        o.LJIIIZ(item, "item");
    }

    @Override // X.C8XO
    public final /* bridge */ /* synthetic */ boolean c2(InterfaceC194547kI interfaceC194547kI) {
        return true;
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        o.LJIIIZ(view, "view");
        C8YN.LJII(this, (AssemViewModel) this.LL.LIZ(this, LLI[1]), new TBT() { // from class: X.7NK
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C196287n6) obj).LJLILLLLZI;
            }
        }, C213688a4.LIZLLL(), C7ND.LJLIL, 4);
        if (((InterfaceC194547kI) C51029K0z.LJIILLIIL(this)).LLLIL()) {
            C8YN.LJII(this, (AssemViewModel) this.LLD.getValue(), new TBT() { // from class: X.7NG
                @Override // X.TBT, X.TBZ, X.TBW
                public final Object get(Object obj) {
                    return ((C82B) obj).LJLJI;
                }
            }, null, C7NE.LJLIL, 6);
            C8YN.LJII(this, (AssemViewModel) this.LLD.getValue(), new TBT() { // from class: X.7NH
                @Override // X.TBT, X.TBZ, X.TBW
                public final Object get(Object obj) {
                    return ((C82B) obj).LJLJJI;
                }
            }, null, C7NF.LJLIL, 6);
        }
    }

    @Override // X.C8XO
    public final /* bridge */ /* synthetic */ void n3(InterfaceC194547kI interfaceC194547kI) {
    }

    public final void a4(C7NN c7nn, int i) {
        C7NO c7no;
        if (c7nn != C7NN.VISIBLE_ENOUGH) {
            return;
        }
        int awemeType = ((C7ML) C51029K0z.LJIILLIIL(this)).getAweme().getAwemeType();
        String awemeId = ((C7ML) C51029K0z.LJIILLIIL(this)).getAweme().getAid();
        if (i == 1) {
            c7no = C7NO.VISIBLE;
        } else {
            c7no = C7NO.BLUR;
        }
        C7NP c7np = MarkReadApi.LIZ;
        o.LJIIIIZZ(awemeId, "awemeId");
        String authorUid = ((C7ML) C51029K0z.LJIILLIIL(this)).getAweme().getAuthorUid();
        c7np.getClass();
        C7NP.LIZ(awemeType, awemeId, c7no, "main post view assem", authorUid);
    }
}

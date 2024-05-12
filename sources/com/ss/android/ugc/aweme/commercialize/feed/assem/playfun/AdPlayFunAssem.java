package com.ss.android.ugc.aweme.commercialize.feed.assem.playfun;

import X.ActivityC45651qj;
import X.C213688a4;
import X.C214348b8;
import X.C221108m2;
import X.C240999d1;
import X.C58096Mr6;
import X.C59680NbY;
import X.C59681NbZ;
import X.C59682Nba;
import X.C59683Nbb;
import X.C59684Nbc;
import X.C59685Nbd;
import X.C59686Nbe;
import X.C59687Nbf;
import X.C59689Nbh;
import X.C59690Nbi;
import X.C59691Nbj;
import X.C59692Nbk;
import X.C59693Nbl;
import X.C59694Nbm;
import X.C59695Nbn;
import X.C59700Nbs;
import X.C5H3;
import X.C62822Ol8;
import X.C63081OpJ;
import X.C65352Pkq;
import X.C65776Prg;
import X.C78939UyV;
import X.C8YN;
import X.InterfaceC115514g7;
import X.InterfaceC59688Nbg;
import X.InterfaceC65350Pko;
import X.InterfaceC74236TBo;
import X.NDI;
import X.TBT;
import X.W5F;
import X.W5U;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.commercialize.feed.assem.CommerceContentBaseAssem;
import com.ss.android.ugc.aweme.commercialize.feed.assem.FeedAdViewModel;
import com.ss.android.ugc.aweme.commercialize.playfun.AdPlayFunAsseUtils;
import com.ss.android.ugc.aweme.commercialize.playfun.IAdPlayFunAsseUtils;
import com.ss.android.ugc.aweme.feed.adapter.VideoPlayViewModel;
import com.ss.android.ugc.aweme.feed.adapter.VideoViewModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemePlayFunModel;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AqS160S0100000_10;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class AdPlayFunAssem extends CommerceContentBaseAssem<AdPlayFunAssem> {
    public static final /* synthetic */ InterfaceC74236TBo<Object>[] LLFFF;
    public final C62822Ol8 LJZL;
    public final InterfaceC115514g7 LL;
    public final C5H3 LLD;
    public final C5H3 LLF;
    public final C5H3 LLFF;

    static {
        TBT tbt = new TBT(AdPlayFunAssem.class, "playFunVM", "getPlayFunVM()Lcom/ss/android/ugc/aweme/commercialize/feed/assem/playfun/AdPlayFunVM;", 0);
        C65352Pkq.LIZ.getClass();
        LLFFF = new InterfaceC74236TBo[]{tbt};
    }

    @Override // com.bytedance.assem.arch.reused.ReusedAssem
    public final void F3() {
        C8YN.LJII(this, b4(), new TBT() { // from class: X.Nbt
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C227878wx) obj).LJLILLLLZI;
            }
        }, C213688a4.LJ(), C59680NbY.LJLIL, 4);
        C8YN.LJII(this, b4(), new TBT() { // from class: X.Nbu
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C227878wx) obj).LJLIL;
            }
        }, C213688a4.LJ(), C59691Nbj.LJLIL, 4);
        C8YN.LJII(this, b4(), new TBT() { // from class: X.Nbv
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C227878wx) obj).LJLJI;
            }
        }, C213688a4.LJ(), C59692Nbk.LJLIL, 4);
    }

    public AdPlayFunAssem() {
        new LinkedHashMap();
        this.LJZL = C221108m2.LIZIZ(new AqS160S0100000_10(this, 81));
        C240999d1 c240999d1 = C240999d1.LIZ;
        C65776Prg LIZ = C65352Pkq.LIZ(AdPlayFunVM.class);
        this.LL = C214348b8.LIZ(this, LIZ, c240999d1, new AqS160S0100000_10((InterfaceC65350Pko) LIZ, 80), null, C59700Nbs.INSTANCE, null, null);
        this.LLD = C214348b8.LIZIZ(this, C65352Pkq.LIZ(VideoViewModel.class), C59693Nbl.INSTANCE);
        this.LLF = C214348b8.LIZIZ(this, C65352Pkq.LIZ(VideoPlayViewModel.class), C59694Nbm.INSTANCE);
        this.LLFF = C214348b8.LIZIZ(this, C65352Pkq.LIZ(FeedAdViewModel.class), C59695Nbn.INSTANCE);
    }

    public final FeedAdViewModel a4() {
        return (FeedAdViewModel) this.LLFF.getValue();
    }

    public final AdPlayFunVM b4() {
        return (AdPlayFunVM) this.LL.LIZ(this, LLFFF[0]);
    }

    public final InterfaceC59688Nbg c4() {
        return (InterfaceC59688Nbg) this.LJZL.getValue();
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIContentAssem, com.bytedance.assem.arch.reused.ReusedAssem
    public final void E3() {
        super.E3();
        c4().setVisibility(8);
        c4().LJ(null);
    }

    @Override // X.C8XO
    public final void F0(VideoItemParams videoItemParams) {
        Aweme aweme;
        VideoItemParams gv0;
        Fragment fragment;
        ActivityC45651qj mo49getActivity;
        IAdPlayFunAsseUtils iAdPlayFunAsseUtils;
        AwemePlayFunModel playFunModel;
        VideoItemParams item = videoItemParams;
        o.LJIIIZ(item, "item");
        Aweme aweme2 = item.getAweme();
        if (aweme2 != null) {
            AwemeRawAd awemeRawAd = aweme2.getAwemeRawAd();
            UrlModel urlModel = null;
            if (awemeRawAd != null && (playFunModel = awemeRawAd.getPlayFunModel()) != null) {
                urlModel = playFunModel.getImageInfo();
            }
            VideoItemParams gv02 = b4().gv0();
            if (gv02 != null && (aweme = gv02.getAweme()) != null && (gv0 = b4().gv0()) != null && (fragment = gv0.fragment) != null && (mo49getActivity = fragment.mo49getActivity()) != null) {
                Object LIZ = C58096Mr6.LIZ(IAdPlayFunAsseUtils.class, false);
                if (LIZ != null) {
                    iAdPlayFunAsseUtils = (IAdPlayFunAsseUtils) LIZ;
                } else {
                    if (C58096Mr6.LLLLLLZZ == null) {
                        synchronized (IAdPlayFunAsseUtils.class) {
                            if (C58096Mr6.LLLLLLZZ == null) {
                                C58096Mr6.LLLLLLZZ = new AdPlayFunAsseUtils();
                            }
                        }
                    }
                    iAdPlayFunAsseUtils = C58096Mr6.LLLLLLZZ;
                }
                if (iAdPlayFunAsseUtils != null && urlModel != null) {
                    iAdPlayFunAsseUtils.LIZ(aweme);
                    W5F LJII = W5U.LJII(C78939UyV.LJ(urlModel));
                    LJII.LIZJ = mo49getActivity;
                    LJII.LJIIIZ(new NDI(iAdPlayFunAsseUtils, aweme));
                }
            }
            c4().LJ(aweme2);
        }
        c4().LJI(item.dataCenter);
        c4().setVisibility(8);
    }

    @Override // com.ss.android.ugc.aweme.commercialize.feed.assem.CommerceContentBaseAssem
    /* renamed from: Z3 */
    public final boolean c2(VideoItemParams item) {
        o.LJIIIZ(item, "item");
        Aweme aweme = item.getAweme();
        if (aweme != null) {
            return C63081OpJ.LL(aweme);
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.commercialize.feed.assem.CommerceContentBaseAssem, X.C8XO
    public final /* bridge */ /* synthetic */ boolean c2(VideoItemParams videoItemParams) {
        return c2(videoItemParams);
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        o.LJIIIZ(view, "view");
        C8YN.LJII(this, a4(), new TBT() { // from class: X.Nbp
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C59542NYk) obj).LJLJJL;
            }
        }, C213688a4.LIZLLL(), C59684Nbc.LJLIL, 4);
        C8YN.LJII(this, a4(), new TBT() { // from class: X.NYr
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C59542NYk) obj).LJLJI;
            }
        }, C213688a4.LIZLLL(), C59685Nbd.LJLIL, 4);
        C8YN.LJII(this, (AssemViewModel) this.LLD.getValue(), new TBT() { // from class: X.NYH
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C82B) obj).LJLILLLLZI;
            }
        }, C213688a4.LIZLLL(), C59682Nba.LJLIL, 4);
        C8YN.LJII(this, (AssemViewModel) this.LLD.getValue(), new TBT() { // from class: X.NbI
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C82B) obj).LJLIL;
            }
        }, null, C59686Nbe.LJLIL, 6);
        C8YN.LJII(this, a4(), new TBT() { // from class: X.NYC
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C59542NYk) obj).LJLJLLL;
            }
        }, C213688a4.LIZLLL(), C59687Nbf.LJLIL, 4);
        C8YN.LJII(this, a4(), new TBT() { // from class: X.NYq
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C59542NYk) obj).LJLL;
            }
        }, C213688a4.LIZLLL(), C59689Nbh.LJLIL, 4);
        C8YN.LJII(this, a4(), new TBT() { // from class: X.Nbo
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C59542NYk) obj).LJLIL;
            }
        }, null, C59681NbZ.LJLIL, 6);
        C8YN.LJII(this, a4(), new TBT() { // from class: X.NYD
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C59542NYk) obj).LJLILLLLZI;
            }
        }, C213688a4.LIZLLL(), C59683Nbb.LJLIL, 4);
        C8YN.LJII(this, (AssemViewModel) this.LLF.getValue(), new TBT() { // from class: X.Nbw
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C212208Um) obj).LJLJJLL;
            }
        }, C213688a4.LIZLLL(), C59690Nbi.LJLIL, 4);
    }
}

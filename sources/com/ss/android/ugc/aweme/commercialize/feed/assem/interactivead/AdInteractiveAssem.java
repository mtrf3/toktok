package com.ss.android.ugc.aweme.commercialize.feed.assem.interactivead;

import X.C10K;
import X.C213688a4;
import X.C214348b8;
import X.C221108m2;
import X.C240999d1;
import X.C59409NTh;
import X.C59708Nc0;
import X.C59709Nc1;
import X.C59710Nc2;
import X.C59711Nc3;
import X.C59712Nc4;
import X.C59713Nc5;
import X.C59714Nc6;
import X.C59715Nc7;
import X.C59716Nc8;
import X.C59718NcA;
import X.C59719NcB;
import X.C59720NcC;
import X.C59721NcD;
import X.C59722NcE;
import X.C59723NcF;
import X.C59724NcG;
import X.C59725NcH;
import X.C59726NcI;
import X.C5H3;
import X.C62822Ol8;
import X.C63081OpJ;
import X.C65352Pkq;
import X.C65776Prg;
import X.C8YN;
import X.CallableC78777Uvt;
import X.InterfaceC115514g7;
import X.InterfaceC59717Nc9;
import X.InterfaceC65350Pko;
import X.InterfaceC74236TBo;
import X.TBT;
import X.X1D;
import android.view.View;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.commercialize.feed.assem.CommerceContentBaseAssem;
import com.ss.android.ugc.aweme.commercialize.feed.assem.FeedAdViewModel;
import com.ss.android.ugc.aweme.feed.adapter.VideoPlayViewModel;
import com.ss.android.ugc.aweme.feed.adapter.VideoViewModel;
import com.ss.android.ugc.aweme.feed.model.AdGestureGuidance;
import com.ss.android.ugc.aweme.feed.model.AdInteractionData;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.AqS160S0100000_10;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class AdInteractiveAssem extends CommerceContentBaseAssem<AdInteractiveAssem> {
    public static final /* synthetic */ InterfaceC74236TBo<Object>[] LLFII;
    public final InterfaceC115514g7 LJZL;
    public final C5H3 LL;
    public final C5H3 LLD;
    public final C5H3 LLF;
    public final C62822Ol8 LLFF;
    public boolean LLFFF;

    static {
        TBT tbt = new TBT(AdInteractiveAssem.class, "adInteractiveVM", "getAdInteractiveVM()Lcom/ss/android/ugc/aweme/commercialize/feed/assem/interactivead/AdInteractiveVM;", 0);
        C65352Pkq.LIZ.getClass();
        LLFII = new InterfaceC74236TBo[]{tbt};
    }

    @Override // com.bytedance.assem.arch.reused.ReusedAssem
    public final void F3() {
        C8YN.LJII(this, a4(), new TBT() { // from class: X.Nby
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C214078ah) obj).LJLIL;
            }
        }, C213688a4.LJ(), C59718NcA.LJLIL, 4);
    }

    @Override // com.ss.android.ugc.aweme.commercialize.feed.assem.CommerceContentBaseAssem, X.C8XO
    public final void unBind() {
        this.LLFFF = true;
    }

    public AdInteractiveAssem() {
        new LinkedHashMap();
        C240999d1 c240999d1 = C240999d1.LIZ;
        C65776Prg LIZ = C65352Pkq.LIZ(AdInteractiveVM.class);
        this.LJZL = C214348b8.LIZ(this, LIZ, c240999d1, new AqS160S0100000_10((InterfaceC65350Pko) LIZ, 79), null, C59726NcI.INSTANCE, null, null);
        this.LL = C214348b8.LIZIZ(this, C65352Pkq.LIZ(VideoViewModel.class), C59724NcG.INSTANCE);
        this.LLD = C214348b8.LIZIZ(this, C65352Pkq.LIZ(VideoPlayViewModel.class), C59725NcH.INSTANCE);
        this.LLF = C214348b8.LIZIZ(this, C65352Pkq.LIZ(FeedAdViewModel.class), C59708Nc0.INSTANCE);
        this.LLFF = C221108m2.LIZIZ(new AqS160S0100000_10(this, 78));
        this.LLFFF = true;
        C221108m2.LIZIZ(C59409NTh.LJLIL);
    }

    public final AdInteractiveVM a4() {
        return (AdInteractiveVM) this.LJZL.LIZ(this, LLFII[0]);
    }

    public final FeedAdViewModel b4() {
        return (FeedAdViewModel) this.LLF.getValue();
    }

    public final InterfaceC59717Nc9 c4() {
        return (InterfaceC59717Nc9) this.LLFF.getValue();
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIContentAssem, com.bytedance.assem.arch.reused.ReusedAssem
    public final void E3() {
        super.E3();
        c4().reset();
        c4().LJFF(null, null);
        c4().setVisibility(8);
    }

    public final void e4() {
        String str;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("triggerInteractivePause adInteractiveVM.item?.toTab = ");
        VideoItemParams gv0 = a4().gv0();
        if (gv0 != null) {
            str = gv0.toTab;
        } else {
            str = null;
        }
        LIZ.append(str);
        String msg = X1D.LIZIZ(LIZ);
        o.LJIIIZ(msg, "msg");
        c4().onPause();
    }

    public final void g4() {
        String str;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("triggerInteractiveResume adInteractiveVM.item?.toTab = ");
        VideoItemParams gv0 = a4().gv0();
        String str2 = null;
        if (gv0 != null) {
            str = gv0.toTab;
        } else {
            str = null;
        }
        LIZ.append(str);
        String msg = X1D.LIZIZ(LIZ);
        o.LJIIIZ(msg, "msg");
        InterfaceC59717Nc9 c4 = c4();
        VideoItemParams gv02 = a4().gv0();
        if (gv02 != null) {
            str2 = gv02.toTab;
        }
        c4.LIZLLL(str2, this.LLFFF);
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIContentAssem
    public final void X3() {
        e4();
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIContentAssem
    public final void Y3() {
        g4();
    }

    @Override // X.C8XO
    public final void F0(VideoItemParams videoItemParams) {
        AwemeRawAd awemeRawAd;
        AdInteractionData adInteractionData;
        AdGestureGuidance gestureGuidance;
        UrlModel image;
        List<String> urlList;
        VideoItemParams item = videoItemParams;
        o.LJIIIZ(item, "item");
        this.LLFFF = true;
        Aweme aweme = item.getAweme();
        if (aweme != null && (awemeRawAd = aweme.getAwemeRawAd()) != null && (adInteractionData = awemeRawAd.getAdInteractionData()) != null && (gestureGuidance = adInteractionData.getGestureGuidance()) != null && (image = gestureGuidance.getImage()) != null && (urlList = image.getUrlList()) != null && (true ^ urlList.isEmpty())) {
            String imageUrl = (String) ListProtector.get(urlList, 0);
            o.LJIIIIZZ(imageUrl, "imageUrl");
            C10K.LIZJ(new CallableC78777Uvt(imageUrl));
            c4().LJFF(item.getAweme(), imageUrl);
            c4().setOperator(new C59723NcF(this));
            c4().setVisibility(8);
        }
    }

    @Override // com.ss.android.ugc.aweme.commercialize.feed.assem.CommerceContentBaseAssem
    /* renamed from: Z3 */
    public final boolean c2(VideoItemParams item) {
        Aweme aweme;
        o.LJIIIZ(item, "item");
        VideoItemParams gv0 = a4().gv0();
        if (gv0 == null || (aweme = gv0.getAweme()) == null || !C63081OpJ.LJLLI(aweme)) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.ugc.aweme.commercialize.feed.assem.CommerceContentBaseAssem, X.C8XO
    public final /* bridge */ /* synthetic */ boolean c2(VideoItemParams videoItemParams) {
        return c2(videoItemParams);
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        o.LJIIIZ(view, "view");
        C8YN.LJII(this, (AssemViewModel) this.LL.getValue(), new TBT() { // from class: X.NbH
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C82B) obj).LJLIL;
            }
        }, C213688a4.LIZLLL(), C59709Nc1.LJLIL, 4);
        C8YN.LJII(this, (AssemViewModel) this.LL.getValue(), new TBT() { // from class: X.NcN
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C82B) obj).LJLJJI;
            }
        }, null, C59715Nc7.LJLIL, 6);
        C8YN.LJII(this, (AssemViewModel) this.LLD.getValue(), new TBT() { // from class: X.NcL
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C212208Um) obj).LJLLJ;
            }
        }, C213688a4.LIZLLL(), C59716Nc8.LJLIL, 4);
        C8YN.LJII(this, (AssemViewModel) this.LLD.getValue(), new TBT() { // from class: X.Nbx
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C212208Um) obj).LJLJJLL;
            }
        }, C213688a4.LIZLLL(), C59714Nc6.LJLIL, 4);
        C8YN.LJII(this, b4(), new TBT() { // from class: X.Nbq
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C59542NYk) obj).LJLIL;
            }
        }, C213688a4.LIZLLL(), C59711Nc3.LJLIL, 4);
        C8YN.LJII(this, b4(), new TBT() { // from class: X.NYE
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C59542NYk) obj).LJLILLLLZI;
            }
        }, C213688a4.LIZLLL(), C59710Nc2.LJLIL, 4);
        C8YN.LJII(this, b4(), new TBT() { // from class: X.NYn
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C59542NYk) obj).LJLJJLL;
            }
        }, C213688a4.LIZLLL(), C59719NcB.LJLIL, 4);
        C8YN.LJII(this, b4(), new TBT() { // from class: X.NYo
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C59542NYk) obj).LJLJL;
            }
        }, C213688a4.LIZLLL(), C59712Nc4.LJLIL, 4);
        C8YN.LJII(this, b4(), new TBT() { // from class: X.NYp
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C59542NYk) obj).LJLJLJ;
            }
        }, C213688a4.LIZLLL(), C59713Nc5.LJLIL, 4);
        C8YN.LJII(this, b4(), new TBT() { // from class: X.Nbr
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C59542NYk) obj).LJLJJL;
            }
        }, C213688a4.LIZLLL(), C59720NcC.LJLIL, 4);
        C8YN.LJII(this, (AssemViewModel) this.LL.getValue(), new TBT() { // from class: X.NcJ
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C82B) obj).LJLJL;
            }
        }, C213688a4.LIZLLL(), C59721NcD.LJLIL, 4);
        C8YN.LJII(this, (AssemViewModel) this.LL.getValue(), new TBT() { // from class: X.NcK
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C82B) obj).LJLJLJ;
            }
        }, C213688a4.LIZLLL(), C59722NcE.LJLIL, 4);
    }
}

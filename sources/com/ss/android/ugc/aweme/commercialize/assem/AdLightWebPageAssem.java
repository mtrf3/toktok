package com.ss.android.ugc.aweme.commercialize.assem;

import X.ActivityC45651qj;
import X.C16880lQ;
import X.C213688a4;
import X.C214348b8;
import X.C240999d1;
import X.C58909NAb;
import X.C59506NXa;
import X.C59507NXb;
import X.C59508NXc;
import X.C59509NXd;
import X.C59510NXe;
import X.C59511NXf;
import X.C5H3;
import X.C63081OpJ;
import X.C65352Pkq;
import X.C65776Prg;
import X.C8XO;
import X.C8YN;
import X.InterfaceC115514g7;
import X.InterfaceC65350Pko;
import X.InterfaceC74236TBo;
import X.NH3;
import X.NU4;
import X.NU5;
import X.NVB;
import X.NXK;
import X.NXM;
import X.NXY;
import X.NXZ;
import X.TBT;
import Y.ARunnableS46S0100000_10;
import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import androidx.fragment.app.Fragment;
import com.bytedance.assem.arch.reused.ReusedUIContentAssem;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.commercialize.feed.assem.FeedAdEventViewModel;
import com.ss.android.ugc.aweme.commercialize.feed.assem.FeedAdViewModel;
import com.ss.android.ugc.aweme.feed.adapter.VideoPlayViewModel;
import com.ss.android.ugc.aweme.feed.adapter.VideoViewModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AqS160S0100000_10;
import kotlin.jvm.internal.AqS32S1300000_10;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class AdLightWebPageAssem extends ReusedUIContentAssem<AdLightWebPageAssem> implements C8XO<VideoItemParams> {
    public static final /* synthetic */ InterfaceC74236TBo<Object>[] LLI;
    public NVB LJZL;
    public final Handler LL;
    public final ARunnableS46S0100000_10 LLD;
    public final InterfaceC115514g7 LLF;
    public final C5H3 LLFF;
    public final C5H3 LLFFF;
    public final C5H3 LLFII;
    public final C5H3 LLFZ;

    static {
        TBT tbt = new TBT(AdLightWebPageAssem.class, "lightWebPageVM", "getLightWebPageVM()Lcom/ss/android/ugc/aweme/commercialize/assem/AdLightWebPageVM;", 0);
        C65352Pkq.LIZ.getClass();
        LLI = new InterfaceC74236TBo[]{tbt};
    }

    @Override // X.C8XO
    public final void LLLZIIL() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void b4() {
        Fragment fragment;
        ActivityC45651qj mo49getActivity;
        VideoItemParams gv0;
        Aweme aweme;
        String str;
        View findViewById;
        VideoItemParams gv02 = Z3().gv0();
        Integer num = null;
        if (gv02 == null || (fragment = gv02.fragment) == null || (mo49getActivity = fragment.mo49getActivity()) == null || (gv0 = Z3().gv0()) == null || (aweme = gv0.getAweme()) == null) {
            return;
        }
        Z3().getClass();
        AwemeRawAd awemeRawAd = aweme.getAwemeRawAd();
        if (awemeRawAd != null) {
            str = awemeRawAd.getLightWebUrl();
        } else {
            str = null;
        }
        NU5 nu5 = new NU5();
        new AqS32S1300000_10(str, fragment, aweme, this, 1).invoke(nu5.LIZ);
        NU4 nu4 = (NU4) nu5.LIZ;
        NVB nvb = this.LJZL;
        if (nvb == null) {
            nvb = new NVB(mo49getActivity);
            nvb.setParams(nu4);
            ViewStub viewStub = (ViewStub) mo49getActivity.findViewById(R.id.ro);
            if (viewStub != null) {
                C58909NAb.LIZ.getClass();
                if (NH3.LIZ() != null) {
                    num = Integer.valueOf(R.layout.azj);
                }
                o.LJI(num);
                viewStub.setLayoutResource(num.intValue());
                findViewById = viewStub.inflate();
                o.LJII(findViewById, "null cannot be cast to non-null type android.widget.FrameLayout");
            } else {
                findViewById = mo49getActivity.findViewById(R.id.rn);
            }
            if (findViewById != null) {
                this.LJLLJ = findViewById;
            }
            ((ViewGroup) getContainerView()).addView(nvb);
        }
        this.LJZL = nvb;
        nvb.setCallback(new NXZ(this));
    }

    @Override // X.C8XO
    public final void unBind() {
    }

    public AdLightWebPageAssem() {
        new LinkedHashMap();
        this.LL = new Handler(C16880lQ.LLJJJJ());
        this.LLD = new ARunnableS46S0100000_10(this, 37);
        C240999d1 c240999d1 = C240999d1.LIZ;
        C65776Prg LIZ = C65352Pkq.LIZ(AdLightWebPageVM.class);
        this.LLF = C214348b8.LIZ(this, LIZ, c240999d1, new AqS160S0100000_10((InterfaceC65350Pko) LIZ, 64), null, C59509NXd.INSTANCE, null, null);
        this.LLFF = C214348b8.LIZIZ(this, C65352Pkq.LIZ(VideoViewModel.class), C59510NXe.INSTANCE);
        this.LLFFF = C214348b8.LIZIZ(this, C65352Pkq.LIZ(VideoPlayViewModel.class), C59511NXf.INSTANCE);
        this.LLFII = C214348b8.LIZIZ(this, C65352Pkq.LIZ(FeedAdViewModel.class), C59507NXb.INSTANCE);
        this.LLFZ = C214348b8.LIZIZ(this, C65352Pkq.LIZ(FeedAdEventViewModel.class), C59508NXc.INSTANCE);
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIContentAssem
    public final void W3() {
        this.LL.removeCallbacksAndMessages(null);
    }

    public final AdLightWebPageVM Z3() {
        return (AdLightWebPageVM) this.LLF.LIZ(this, LLI[0]);
    }

    @Override // X.C8XO
    public final void F0(VideoItemParams item) {
        o.LJIIIZ(item, "item");
    }

    @Override // X.C8XO
    public final boolean c2(VideoItemParams videoItemParams) {
        VideoItemParams item = videoItemParams;
        o.LJIIIZ(item, "item");
        Aweme aweme = item.getAweme();
        if (aweme != null && C63081OpJ.LJJLIIIJL(aweme)) {
            return true;
        }
        return false;
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        o.LJIIIZ(view, "view");
        C8YN.LJII(this, (AssemViewModel) this.LLFII.getValue(), new TBT() { // from class: X.NXh
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C59542NYk) obj).LJLLI;
            }
        }, null, NXK.LJLIL, 6);
        C8YN.LJII(this, (AssemViewModel) this.LLFF.getValue(), new TBT() { // from class: X.NYI
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C82B) obj).LJLIL;
            }
        }, null, NXM.LJLIL, 6);
        C8YN.LJII(this, (AssemViewModel) this.LLFF.getValue(), new TBT() { // from class: X.NYG
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C82B) obj).LJLILLLLZI;
            }
        }, C213688a4.LIZLLL(), NXY.LJLIL, 4);
        C8YN.LJII(this, (AssemViewModel) this.LLFZ.getValue(), new TBT() { // from class: X.NXg
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C2309894s) obj).LJLJJLL;
            }
        }, null, C59506NXa.LJLIL, 6);
    }

    @Override // X.C8XO
    public final /* bridge */ /* synthetic */ void n3(VideoItemParams videoItemParams) {
    }

    public static boolean a4(AdLightWebPageAssem adLightWebPageAssem, Boolean bool, String str, String str2, int i) {
        NU4 params;
        if ((i & 2) != 0) {
            str = null;
        }
        if ((i & 4) != 0) {
            str2 = null;
        }
        NVB nvb = adLightWebPageAssem.LJZL;
        if (nvb == null || nvb.getMBottomSheet().LLFZ.getState() == 3) {
            return false;
        }
        adLightWebPageAssem.getContainerView().setVisibility(0);
        if (str2 != null && (params = nvb.getParams()) != null) {
            params.LIZ = str2;
        }
        nvb.LJFF(bool, str);
        return true;
    }
}

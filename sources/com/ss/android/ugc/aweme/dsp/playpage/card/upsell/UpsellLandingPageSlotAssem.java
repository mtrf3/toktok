package com.ss.android.ugc.aweme.dsp.playpage.card.upsell;

import X.AbstractC91590Zx4;
import X.C212428Vi;
import X.C214348b8;
import X.C241249dQ;
import X.C243119gR;
import X.C63081OpJ;
import X.C65351Pkp;
import X.C65352Pkq;
import X.C65776Prg;
import X.C73305Spp;
import X.C91139Zpn;
import X.C91200Zqm;
import X.C91218Zr4;
import X.C91249ZrZ;
import X.C91264Zro;
import X.C91301ZsP;
import X.C91395Ztv;
import X.C91398Zty;
import X.C91473ZvB;
import X.C91537ZwD;
import X.C91538ZwE;
import X.C91539ZwF;
import X.C91605ZxJ;
import X.C9BD;
import X.InterfaceC115514g7;
import X.InterfaceC74236TBo;
import X.InterfaceC91281Zs5;
import X.InterfaceC91296ZsK;
import X.SYL;
import X.TBT;
import X.X1D;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.MutableLiveData;
import com.ss.android.ugc.aweme.dsp.arch.BaseDspSlotReusedAssem;
import com.ss.android.ugc.aweme.dsp.playerservice.plugin.expired.ExpirePlayableVM;
import com.ss.android.ugc.aweme.dsp.playerservice.plugin.expired.ExpiredPlayableManager;
import com.ss.android.ugc.aweme.dsp.playerservice.v2.IAudioPlayerAbility;
import com.ss.android.ugc.aweme.dsp.playpage.base.BasePlayerFragment;
import com.ss.android.ugc.aweme.dsp.playpage.s2s.S2SReportViewModel;
import com.ss.android.ugc.aweme.dsp.playpage.v2.IContainerUtilityAbility;
import com.ss.android.ugc.aweme.dsp.playpage.v2.IStatusViewAbility;
import com.ss.android.ugc.aweme.homepage.ui.view.tab.top.IXTabPanelAbility;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.IDqS20S0101000_29;
import kotlin.jvm.internal.IDqS421S0100000_29;
import kotlin.jvm.internal.o;

/* loaded from: classes22.dex */
public final class UpsellLandingPageSlotAssem extends BaseDspSlotReusedAssem {
    public static final /* synthetic */ InterfaceC74236TBo<Object>[] LLIIL;
    public View LLI;
    public C91139Zpn LLIFFJFJJ;
    public SYL LLII;
    public FrameLayout LLIIII;
    public C73305Spp LLIIIILZ;
    public View LLIIIJ;
    public final InterfaceC115514g7 LLIIIL;
    public final InterfaceC115514g7 LLIIIZ;
    public final InterfaceC115514g7 LLIIJI;
    public C91395Ztv LLIIJLIL;

    static {
        TBT tbt = new TBT(UpsellLandingPageSlotAssem.class, "expireVM", "getExpireVM()Lcom/ss/android/ugc/aweme/dsp/playerservice/plugin/expired/ExpirePlayableVM;", 0);
        C65351Pkp c65351Pkp = C65352Pkq.LIZ;
        c65351Pkp.getClass();
        TBT tbt2 = new TBT(UpsellLandingPageSlotAssem.class, "landingPageVM", "getLandingPageVM()Lcom/ss/android/ugc/aweme/dsp/playpage/card/upsell/LandingPageVm;", 0);
        c65351Pkp.getClass();
        TBT tbt3 = new TBT(UpsellLandingPageSlotAssem.class, "s2sReportVM", "getS2sReportVM()Lcom/ss/android/ugc/aweme/dsp/playpage/s2s/S2SReportViewModel;", 0);
        c65351Pkp.getClass();
        LLIIL = new InterfaceC74236TBo[]{tbt, tbt2, tbt3};
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int W3() {
        return R.layout.ax;
    }

    public UpsellLandingPageSlotAssem() {
        new LinkedHashMap();
        C9BD c9bd = C9BD.LIZ;
        C65776Prg LIZ = C65352Pkq.LIZ(ExpirePlayableVM.class);
        this.LLIIIL = C214348b8.LIZ(this, LIZ, c9bd, new IDqS421S0100000_29(LIZ, 16), null, C91537ZwD.INSTANCE, null, null);
        C65776Prg LIZ2 = C65352Pkq.LIZ(LandingPageVm.class);
        this.LLIIIZ = C214348b8.LIZ(this, LIZ2, c9bd, new IDqS421S0100000_29(LIZ2, 17), null, C91538ZwE.INSTANCE, null, null);
        C241249dQ c241249dQ = C241249dQ.LIZ;
        C65776Prg LIZ3 = C65352Pkq.LIZ(S2SReportViewModel.class);
        this.LLIIJI = C214348b8.LIZ(this, LIZ3, c241249dQ, new IDqS421S0100000_29(LIZ3, 18), null, C91539ZwF.INSTANCE, null, null);
    }

    public final LandingPageVm q4() {
        return (LandingPageVm) this.LLIIIZ.LIZ(this, LLIIL[1]);
    }

    public final void p4() {
        int height;
        IContainerUtilityAbility m4 = m4();
        if (m4 != null) {
            int z9 = m4.z9();
            IContainerUtilityAbility m42 = m4();
            if (m42 != null) {
                int v4 = m42.v4();
                View view = this.LLI;
                if (view == null) {
                    return;
                }
                view.setPadding(view.getPaddingLeft(), view.getPaddingTop(), view.getPaddingRight(), z9);
                Context context = getContext();
                if (context != null) {
                    int LJJJJLI = C63081OpJ.LJJJJLI(context);
                    if (((Boolean) this.LLFII.getValue()).booleanValue()) {
                        height = ((view.getHeight() - LJJJJLI) - v4) - z9;
                    } else {
                        height = ((view.getHeight() - LJJJJLI) - v4) - BasePlayerFragment.LLFF;
                    }
                    view.requestLayout();
                    view.invalidate();
                    C243119gR.LIZIZ(new IDqS20S0101000_29(this, height, 0));
                }
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.dsp.arch.BaseDspSlotReusedAssem, X.C8XO
    public final void unBind() {
        if (n4()) {
            ((S2SReportViewModel) this.LLIIJI.LIZ(this, LLIIL[2])).LJLIL.dispose();
        }
    }

    @Override // X.C8XO
    /* renamed from: F0 */
    public final void q4(C91395Ztv c91395Ztv) {
        int i;
        C91605ZxJ c91605ZxJ;
        InterfaceC91281Zs5 kt;
        MutableLiveData<InterfaceC91296ZsK> Q;
        String str;
        String str2;
        String str3;
        AbstractC91590Zx4 HS;
        C91395Ztv item = c91395Ztv;
        o.LJIIIZ(item, "item");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("current Item pos=");
        C91398Zty c91398Zty = (C91398Zty) this.LLFF.getValue();
        if (c91398Zty != null) {
            i = c91398Zty.LJLIL;
        } else {
            i = 0;
        }
        LIZ.append(i);
        X1D.LIZIZ(LIZ);
        this.LLIIJLIL = item;
        q4().LJLJI = item;
        InterfaceC115514g7 interfaceC115514g7 = this.LLIIIL;
        InterfaceC74236TBo<?>[] interfaceC74236TBoArr = LLIIL;
        interfaceC115514g7.LIZ(this, interfaceC74236TBoArr[0]).getClass();
        ExpiredPlayableManager expiredPlayableManager = ExpiredPlayableManager.INSTANCE;
        if (!expiredPlayableManager.isTodayPlayableLimited() || expiredPlayableManager.cancelLandingPage(item.LJLIL)) {
            View view = this.LLI;
            if (view == null) {
                return;
            }
            view.setVisibility(8);
            return;
        }
        if (item.LJZL || item.LJLJJL.length() != 0) {
            Object LIZ2 = this.LLIIIL.LIZ(this, interfaceC74236TBoArr[0]);
            String str4 = item.LJLJJL;
            IAudioPlayerAbility LIZJ = C91264Zro.LIZJ(this);
            String str5 = null;
            if (LIZJ != null && (HS = LIZJ.HS()) != null) {
                c91605ZxJ = HS.LJLILLLLZI;
            } else {
                c91605ZxJ = null;
            }
            LIZ2.getClass();
            if (!C91218Zr4.LIZJ(str4, c91605ZxJ)) {
                View view2 = this.LLI;
                if (view2 != null) {
                    view2.setVisibility(0);
                }
                if (n4()) {
                    IStatusViewAbility LIZLLL = C91264Zro.LIZLLL(this);
                    if (LIZLLL != null) {
                        LIZLLL.h3(2);
                    }
                    IXTabPanelAbility LJFF = C91264Zro.LJFF(this);
                    C91200Zqm.LIZLLL(this.LLIIII, C212428Vi.LIZLLL(this), LJFF);
                    C91139Zpn c91139Zpn = this.LLIFFJFJJ;
                    Fragment LIZLLL2 = C212428Vi.LIZLLL(this);
                    if (LJFF != null && c91139Zpn != null) {
                        C91200Zqm.LIZ(LIZLLL2, c91139Zpn, Float.valueOf(LJFF.F7()), new IDqS421S0100000_29(LJFF, 68));
                    }
                    q4().gv0();
                    Context context = getContext();
                    if (context != null) {
                        if (C91218Zr4.LIZLLL(context)) {
                            str = "open_resso";
                        } else {
                            str = "download_resso";
                        }
                        C91395Ztv c91395Ztv2 = this.LLIIJLIL;
                        if (c91395Ztv2 != null) {
                            C91301ZsP c91301ZsP = c91395Ztv2.LJLJJI;
                            C91473ZvB x5 = x5();
                            if (x5 != null) {
                                str5 = x5.LJLIL;
                            }
                            if (o.LJ(str5, "dsp_player")) {
                                str2 = "my_playlist";
                            } else {
                                str2 = "track_reco";
                            }
                            if (c91395Ztv2.LJZL) {
                                IContainerUtilityAbility LJ = C91264Zro.LJ(this);
                                if (LJ == null || (str3 = LJ.getEnterMethod()) == null) {
                                    str3 = "";
                                }
                            } else {
                                str3 = c91395Ztv2.LJLJJI.LJ;
                            }
                            C91249ZrZ.LJIILLIIL(c91301ZsP, str2, "stream_limit", str, str3);
                        }
                        ((S2SReportViewModel) this.LLIIJI.LIZ(this, interfaceC74236TBoArr[2])).gv0(context, C212428Vi.LIZLLL(this), String.valueOf(item.LJLILLLLZI), item.LJLJI, false);
                    }
                    IContainerUtilityAbility m4 = m4();
                    if (m4 != null && (kt = m4.kt()) != null && (Q = kt.Q()) != null) {
                        Q.postValue(item.LJLIL);
                    }
                }
                Context context2 = getContext();
                if (context2 == null) {
                    return;
                }
                if (C91218Zr4.LIZLLL(context2)) {
                    C91139Zpn c91139Zpn2 = this.LLIFFJFJJ;
                    if (c91139Zpn2 == null) {
                        return;
                    }
                    c91139Zpn2.setText(R.string.ihf);
                    return;
                }
                C91139Zpn c91139Zpn3 = this.LLIFFJFJJ;
                if (c91139Zpn3 == null) {
                    return;
                }
                c91139Zpn3.setText(R.string.igu);
                return;
            }
        }
        View view3 = this.LLI;
        if (view3 == null) {
            return;
        }
        view3.setVisibility(8);
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x018a  */
    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onViewCreated(android.view.View r16) {
        /*
            Method dump skipped, instructions count: 447
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.dsp.playpage.card.upsell.UpsellLandingPageSlotAssem.onViewCreated(android.view.View):void");
    }

    public final void r4(View view) {
        int i;
        int[] iArr = new int[2];
        if (view != null) {
            view.getLocationInWindow(iArr);
            i = view.getHeight();
        } else {
            i = 0;
        }
        int i2 = iArr[1];
        if (i2 != 0 && i != 0) {
            int i3 = i2 + i;
            FrameLayout frameLayout = this.LLIIII;
            if (frameLayout != null) {
                ViewGroup.LayoutParams layoutParams = frameLayout.getLayoutParams();
                if (layoutParams != null) {
                    LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
                    layoutParams2.topMargin = i3;
                    frameLayout.setLayoutParams(layoutParams2);
                    return;
                }
                throw new NullPointerException("null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
            }
        }
    }
}

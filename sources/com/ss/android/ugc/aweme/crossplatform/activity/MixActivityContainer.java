package com.ss.android.ugc.aweme.crossplatform.activity;

import X.AbstractC57425MgH;
import X.AbstractC73672Svk;
import X.ActivityC45651qj;
import X.AnonymousClass636;
import X.C0H1;
import X.C107794Kx;
import X.C16880lQ;
import X.C188727au;
import X.C27740Aue;
import X.C2U8;
import X.C38049EwX;
import X.C38354F3m;
import X.C40101FoX;
import X.C40263Fr9;
import X.C40292Frc;
import X.C40681ii;
import X.C54154LNe;
import X.C56642Ke;
import X.C58655N0h;
import X.C58704N2e;
import X.C59273NOb;
import X.C59307NPj;
import X.C59309NPl;
import X.C59314NPq;
import X.C59470NVq;
import X.C59484NWe;
import X.C59571NZn;
import X.C59639Nat;
import X.C59648Nb2;
import X.C59650Nb4;
import X.C59866NeY;
import X.C59895Nf1;
import X.C60178Nja;
import X.C60191Njn;
import X.C61200O0e;
import X.C61291O3r;
import X.C62905OmT;
import X.C62906OmU;
import X.C63081OpJ;
import X.C71367Rzf;
import X.C71396S0i;
import X.C73318Sq2;
import X.C73411SrX;
import X.C77591Ucl;
import X.C78983UzD;
import X.C79004UzY;
import X.C84763XOl;
import X.F0L;
import X.FFL;
import X.FMX;
import X.INY;
import X.InterfaceC27436Apk;
import X.InterfaceC53944LFc;
import X.InterfaceC59569NZl;
import X.JF3;
import X.KL2;
import X.NPH;
import X.NTI;
import X.NTL;
import X.NV9;
import X.NWB;
import X.NXI;
import X.NZ3;
import X.NZ5;
import X.NZ7;
import X.NZ9;
import X.NZC;
import X.NZD;
import X.NZF;
import X.NZG;
import X.NZI;
import X.NZJ;
import X.NZL;
import X.NZN;
import X.NZR;
import X.NZX;
import X.QD3;
import X.T16;
import X.ViewOnClickListenerC59660NbE;
import X.WM7;
import X.X1D;
import Y.AObjectS128S0200000_10;
import Y.AfS28S0110000_10;
import Y.AfS38S0101000_10;
import Y.IDRunnableS6S0101000;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.Space;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OnLifecycleEvent;
import com.bytedance.android.livesdk.livesetting.gift.LiveExchangeConfirmThreshold;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.bytedance.tux.icon.TuxIconView;
import com.gyf.barlibrary.ImmersionBar;
import com.ss.android.ugc.aweme.awemeservice.AwemeService;
import com.ss.android.ugc.aweme.base.utils.KeyboardUtils;
import com.ss.android.ugc.aweme.crossplatform.business.AdWebStatBusiness;
import com.ss.android.ugc.aweme.crossplatform.business.BusinessService;
import com.ss.android.ugc.aweme.crossplatform.business.OpenUrlHintBusiness;
import com.ss.android.ugc.aweme.crossplatform.business.PassBackWebInfoBusiness;
import com.ss.android.ugc.aweme.crossplatform.business.PlayableBusiness;
import com.ss.android.ugc.aweme.crossplatform.business.PreRenderWebViewBusiness;
import com.ss.android.ugc.aweme.crossplatform.business.WalletBusiness;
import com.ss.android.ugc.aweme.crossplatform.business.proxy.ReportBusinessProxy;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.im.sdk.common.controller.providedservices.IMService;
import com.ss.android.ugc.aweme.landpage.survey.AdLandPageSurveyServiceImpl;
import com.ss.android.ugc.aweme.landpage.survey.IAdLandPageSurveyService;
import com.ss.android.ugc.aweme.live.LiveOuterService;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.o;
import org.greenrobot.eventbus.EventBus;
import org.json.JSONException;
import org.json.JSONObject;
import yq4.a;

/* loaded from: classes11.dex */
public class MixActivityContainer extends AbsActivityContainer implements InterfaceC59569NZl {
    public final Activity LJLIL;
    public C59314NPq LJLILLLLZI;
    public Bundle LJLJI;
    public boolean LJLJJI;
    public final C59484NWe LJLJJL;
    public NZC LJLJJLL;
    public NZI LJLJL;
    public String LJLJLJ;
    public Runnable LJLJLLL;
    public NZ7 LJLL;
    public boolean LJLLI;
    public long LJLLILLLL = -1;
    public C73411SrX LJLLJ;
    public ImmersionBar LJLLL;
    public final NPH LJLLLL;
    public ViewOnClickListenerC59660NbE LJLLLLLL;
    public NZ5 LJLZ;
    public String LJZ;
    public long LJZI;
    public NZD LJZL;
    public NZ3 LL;
    public C59571NZn LLD;
    public Space LLF;
    public boolean LLFF;
    public InterfaceC53944LFc LLFFF;
    public final Set<InterfaceC27436Apk> LLFII;

    public void LJ() {
    }

    public void LJJIFFI() {
    }

    public void LJJIIJZLJL() {
    }

    public void LJJIIZ() {
    }

    public void LJJIJIIJI(Boolean bool) {
    }

    public void LJJIJL() {
    }

    public final boolean canGoBack() {
        try {
            SettingsManager.LIZLLL().getClass();
        } catch (Throwable th) {
            C78983UzD.LJIIZILJ(th);
        }
        if (SettingsManager.LIZ("ad_cross_back_press", true)) {
            if (LJJIII()) {
                return false;
            }
        }
        return this.LJLJJLL.goBack();
    }

    @Override // X.InterfaceC59561NZd
    public final String getTitle() {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.crossplatform.activity.AbsActivityContainer, androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (event == Lifecycle.Event.ON_CREATE) {
            onCreate();
            return;
        }
        if (event == Lifecycle.Event.ON_PAUSE) {
            onPause();
            return;
        }
        if (event == Lifecycle.Event.ON_RESUME) {
            onResume();
        } else if (event == Lifecycle.Event.ON_STOP) {
            onStop();
        } else if (event == Lifecycle.Event.ON_DESTROY) {
            onDestroy();
        }
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_STOP)
    public final void onStop() {
        this.LJLLI = false;
    }

    @Override // X.InterfaceC59569NZl
    public final void LIZ() {
        if (this.LJLIL.isFinishing()) {
            return;
        }
        this.LJLZ.setBackgroundColor(this.LJLILLLLZI.LIZJ.LJJI);
        if (NWB.LIZIZ(this.LJLILLLLZI)) {
            return;
        }
        if (TextUtils.equals(this.LJLILLLLZI.LIZJ.LJIIJ, "1")) {
            ((ImageView) this.LL.LIZ(R.id.bfd)).setVisibility(0);
            return;
        }
        if (TextUtils.equals(this.LJLILLLLZI.LIZJ.LJIIJ, CardStruct.IStatusCode.DEFAULT)) {
            ((ImageView) this.LL.LIZ(R.id.bfd)).setVisibility(8);
        } else if (((NXI) this.LJLJJLL.LJI(NXI.class)).canGoBack()) {
            ((ImageView) this.LL.LIZ(R.id.bfd)).setVisibility(0);
        } else {
            ((ImageView) this.LL.LIZ(R.id.bfd)).setVisibility(8);
        }
    }

    @Override // X.InterfaceC59561NZd
    public final void LJIIIZ() {
        this.LL.setVisibility(8);
        this.LLF.setVisibility(8);
    }

    @Override // X.InterfaceC59488NWi
    public final boolean LJIIJ() {
        return this.LJLJJLL.LJIIJ();
    }

    @Override // com.ss.android.ugc.aweme.crossplatform.activity.AbsActivityContainer
    public final void LJIIL() {
        this.LJLIL.finish();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC59561NZd
    public final void LJIILLIIL() {
        boolean z;
        ImmersionBar immersionBar = this.LJLLL;
        if (immersionBar != null) {
            immersionBar.destroy();
            this.LJLLL = null;
        }
        C59314NPq c59314NPq = this.LJLILLLLZI;
        Activity activity = this.LJLIL;
        activity.findViewById(R.id.c05).setPadding(0, C63081OpJ.LJJJJLI(activity), 0, 0);
        Window window = activity.getWindow();
        if (window != null && Build.VERSION.SDK_INT >= 28) {
            WindowManager.LayoutParams attributes = window.getAttributes();
            attributes.layoutInDisplayCutoutMode = 1;
            window.setAttributes(attributes);
        }
        ImmersionBar with = ImmersionBar.with(activity);
        with.keyboardEnable(true, 32);
        with.init();
        if (c59314NPq.LIZJ.LJIIZILJ) {
            View findViewById = activity.findViewById(R.id.c05);
            findViewById.setPadding(0, 0, 0, 0);
            if (activity instanceof LifecycleOwner) {
                KeyboardUtils.LIZ((LifecycleOwner) activity, findViewById, new NZL(findViewById));
            }
            C59309NPl c59309NPl = c59314NPq.LIZJ;
            if (!c59309NPl.LJJIIJZLJL) {
                c59309NPl.LJIJ = true;
            }
            z = true;
        } else {
            z = false;
        }
        if (c59314NPq.LIZJ.LJIJ) {
            activity.getWindow().setStatusBarColor(0);
        }
        JF3.LIZIZ(activity, activity.getWindow(), c59314NPq.LIZJ.LIZIZ);
        C59309NPl c59309NPl2 = c59314NPq.LIZJ;
        if (c59309NPl2.LJIJI && (c59309NPl2.LJIIZILJ || !C60178Nja.LIZIZ(activity))) {
            if (!z) {
                View findViewById2 = activity.findViewById(R.id.c05);
                findViewById2.setPadding(0, 0, 0, 0);
                if (activity instanceof LifecycleOwner) {
                    KeyboardUtils.LIZ((LifecycleOwner) activity, findViewById2, new NZL(findViewById2));
                }
            }
            C60191Njn.LIZIZ(activity);
            c59314NPq.LIZJ.LJIJJ = activity.getWindow().getStatusBarColor();
        } else {
            C59309NPl c59309NPl3 = c59314NPq.LIZJ;
            if (!c59309NPl3.LJIIZILJ) {
                int i = c59309NPl3.LJIJJ;
                if (i != -2) {
                    activity.getWindow().setStatusBarColor(i);
                } else {
                    c59309NPl3.LJIJJ = activity.getWindow().getStatusBarColor();
                }
            }
        }
        this.LJLLL = with;
    }

    public final void LJIJJ() {
        Runnable runnable = this.LJLJLLL;
        if (runnable != null) {
            runnable.run();
        }
        String queryParameter = UriProtector.getQueryParameter(UriProtector.parse(this.LJLILLLLZI.LIZ.LIZJ), "__spark_session_id");
        if (!TextUtils.isEmpty(queryParameter)) {
            C40101FoX.LIZIZ(queryParameter);
        }
    }

    public final void LJIJJLI() {
        C59309NPl c59309NPl;
        this.LLF.setVisibility(8);
        ((NZ5) LJIL(R.id.g3l)).setGradualChangeMode(false);
        NZ3 nz3 = this.LL;
        nz3.setBackgroundColor(0);
        nz3.LIZ(R.id.aj1).setVisibility(8);
        C59314NPq c59314NPq = nz3.LJLILLLLZI;
        if (c59314NPq != null && (c59309NPl = c59314NPq.LIZJ) != null && c59309NPl.LJJIIJZLJL) {
            nz3.LIZ(R.id.aj1).setVisibility(8);
        }
        nz3.LIZ(R.id.title).setVisibility(8);
        ((TuxIconView) nz3.LIZ(R.id.bfl)).setIconRes(R.raw.icon_arrow_left_ltr);
        ((TuxIconView) nz3.LIZ(R.id.bfl)).setTintColorRes(R.attr.cl);
        ((TuxIconView) nz3.LIZ(R.id.bfl)).LIZIZ(true);
        ((AppCompatImageView) nz3.LIZ(R.id.bfd)).setImageResource(R.drawable.all);
        ((AppCompatImageView) nz3.LIZ(R.id.az6)).setImageResource(R.drawable.alp);
        ((TuxIconView) nz3.LIZ(R.id.iwu)).setIconRes(R.raw.icon_flag);
        ((TuxIconView) nz3.LIZ(R.id.iwu)).setTintColorRes(R.attr.cl);
        ((TuxIconView) nz3.LIZ(R.id.iwu)).LIZIZ(true);
        ((AppCompatImageView) nz3.LIZ(R.id.j2p)).setImageResource(R.drawable.aln);
        this.LL.setVisibility(0);
    }

    public final NZR LJJ() {
        NXI nxi;
        NZC nzc = this.LJLJJLL;
        if (nzc == null || (nxi = (NXI) nzc.LJI(NXI.class)) == null) {
            return null;
        }
        return nxi.LIZ();
    }

    public final boolean LJJIII() {
        if (this.LJLILLLLZI.LIZIZ.LIZ > 0) {
            return true;
        }
        return false;
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public final void onDestroy() {
        this.LJLLLL.dispose();
        ImmersionBar immersionBar = this.LJLLL;
        if (immersionBar != null) {
            immersionBar.destroy();
        }
        NZC nzc = this.LJLJJLL;
        if (nzc != null) {
            nzc.LIZJ(this.LJLIL);
            this.LJLJJL.getClass();
        }
        if (!TextUtils.isEmpty(this.LJLILLLLZI.LIZ.LJIILJJIL)) {
            ReportBusinessProxy reportBusinessProxy = (ReportBusinessProxy) this.LJLJJL.LIZ(ReportBusinessProxy.class);
            if (TextUtils.equals(reportBusinessProxy.LIZLLL, "bio_link")) {
                C188727au c188727au = new C188727au();
                c188727au.LJ(System.currentTimeMillis() - reportBusinessProxy.LJFF.longValue(), "duration");
                FMX.LJIIL("biolink_session_duration", c188727au.LIZ);
            }
        }
        EventBus.LIZJ().LJIJ(this);
        LJJIJIL(false);
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_PAUSE)
    public final void onPause() {
        NZC nzc;
        PassBackWebInfoBusiness passBackWebInfoBusiness = (PassBackWebInfoBusiness) this.LJLJJL.LIZ(PassBackWebInfoBusiness.class);
        if (passBackWebInfoBusiness != null) {
            passBackWebInfoBusiness.LJI(((NXI) this.LJLJJLL.LJI(NXI.class)).LIZ(), false);
        }
        this.LJLJJLL.LIZIZ(this.LJLIL);
        this.LJLLILLLL = System.currentTimeMillis() - this.LJZI;
        this.LJZI = 0L;
        C188727au c188727au = new C188727au();
        c188727au.LJ(this.LJLLILLLL, "duration");
        FMX.LJIIL("h5_stay_time", c188727au.LIZ);
        this.LJLJJL.getClass();
        LJJIJL();
        AdWebStatBusiness adWebStatBusiness = (AdWebStatBusiness) this.LJLJJL.LIZ(AdWebStatBusiness.class);
        if (adWebStatBusiness != null && (nzc = this.LJLJJLL) != null) {
            adWebStatBusiness.LJIIIZ(false, nzc.getWebBackForwardList(), null, this.LJLJLJ);
        }
        PlayableBusiness playableBusiness = (PlayableBusiness) this.LJLJJL.LIZ(PlayableBusiness.class);
        if (playableBusiness != null && !playableBusiness.LJ) {
            playableBusiness.LIZ(true, false);
        }
        this.LJLLJ = (C73411SrX) AbstractC73672Svk.LJJLL(AbstractC73672Svk.LJJIJIL(a.LJIJJ()), C84763XOl.LJFF(), new C59895Nf1()).LJJL(T16.LIZ()).LJJJJZI(new AfS38S0101000_10(2, this, 1));
    }

    @Override // X.InterfaceC59488NWi
    public final void refresh() {
        this.LJLJJLL.refresh();
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x00fd, code lost:
    
        if (r1.contains("cov19_render_no_need_load=1") == false) goto L20;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJII() {
        /*
            Method dump skipped, instructions count: 295
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.crossplatform.activity.MixActivityContainer.LJJII():void");
    }

    public final void LJJIIZI() {
        NZC nzc;
        if (LJJIII()) {
            if (TextUtils.equals(C54154LNe.LIZ(this.LJLIL, "profile_2_feed"), C54154LNe.LIZIZ(this.LJLIL))) {
                this.LJLJLJ = "full_screen_system_click";
            }
            C59314NPq c59314NPq = this.LJLILLLLZI;
            String str = this.LJLJLJ;
            if (c59314NPq != null) {
                long j = c59314NPq.LIZIZ.LIZ;
                if (j > 0) {
                    C58655N0h LJ = C58704N2e.LJ("landing_ad", "close", String.valueOf(j), c59314NPq.LIZIZ.LJIIIIZZ, null);
                    LJ.LIZJ(str, "refer");
                    LJ.LJI();
                }
            }
        }
        AdWebStatBusiness adWebStatBusiness = (AdWebStatBusiness) this.LJLJJL.LIZ(AdWebStatBusiness.class);
        if (adWebStatBusiness != null && (nzc = this.LJLJJLL) != null) {
            adWebStatBusiness.LJIIIZ(true, nzc.getWebBackForwardList(), LJJ(), this.LJLJLJ);
        }
        if (LJJ() != null) {
            LJJ().onPause();
            if (LJJIII()) {
                try {
                    FFL.LJIIIZ().getClass();
                    if (FFL.LJ(31744, "fix_fragment_pv", true, false)) {
                        LJJ().stopLoading();
                    }
                } catch (Exception unused) {
                }
            }
        }
        PlayableBusiness playableBusiness = (PlayableBusiness) this.LJLJJL.LIZ(PlayableBusiness.class);
        if (playableBusiness != null) {
            playableBusiness.LJ = true;
            playableBusiness.LIZ(true, false);
        }
        PreRenderWebViewBusiness LIZ = NV9.LIZ(this);
        if (LIZ != null) {
            LIZ.LJ = 0;
            C38049EwX c38049EwX = LIZ.LIZLLL;
            if (c38049EwX != null) {
                c38049EwX.LJIIIIZZ("webViewDidHide", null);
            }
        }
        Activity activity = this.LJLIL;
        if (activity != null && Build.VERSION.SDK_INT >= 23) {
            activity.getWindow().getDecorView().setSystemUiVisibility(1024);
        }
        LJJIJIL(false);
    }

    public final void LJJIJ() {
        this.LJLLLLLL = (ViewOnClickListenerC59660NbE) LJIL(R.id.c05);
        NZ5 nz5 = (NZ5) LJIL(R.id.g3l);
        this.LJLZ = nz5;
        int i = this.LJLILLLLZI.LIZJ.LJI;
        if (i != -2) {
            nz5.setBackgroundColor(i);
        } else {
            nz5.setBackgroundColor(AnonymousClass636.LJIIIIZZ(R.attr.cl, this.LJLIL));
        }
        int i2 = this.LJLILLLLZI.LIZJ.LJIILJJIL;
        if (i2 != -2) {
            this.LJLLLLLL.setBackgroundColor(i2);
            this.LJLIL.getWindow().setBackgroundDrawableResource(R.color.cz);
            INY.LIZ(this.LJLIL);
        }
        this.LL = (NZ3) LJIL(R.id.c06);
        this.LLF = (Space) LJIL(R.id.gwj);
        this.LL.setCrossPlatformParams(this.LJLILLLLZI);
        this.LL.setTitleWrap(new NZ9(this));
        this.LL.post(new IDRunnableS6S0101000(8, this, 14));
        this.LJZL = new NZD(this.LJLIL, this);
        LJJIJIIJI(Boolean.valueOf(NWB.LIZIZ(this.LJLILLLLZI)));
        if (this.LJLILLLLZI.LIZJ.LJIJJLI) {
            C62905OmT c62905OmT = new C62905OmT(this.LJLIL);
            c62905OmT.LIZ(R.string.ive);
            c62905OmT.LJI(R.string.dsn);
            new C62906OmU(c62905OmT).LIZLLL();
        }
        if (this.LJLILLLLZI.LIZJ.LJIIL) {
            NZD nzd = this.LJZL;
            nzd.getClass();
            if (!C38354F3m.LJ("copylink")) {
                NZF[] values = NZF.values();
                int length = values.length;
                int i3 = 0;
                while (true) {
                    if (i3 >= length) {
                        break;
                    }
                    NZF nzf = values[i3];
                    if (TextUtils.equals("copylink", nzf.key)) {
                        int i4 = nzf.id;
                        if (i4 > 0) {
                            KL2.LJIILLIIL(8, nzd.LJFF.findViewById(i4));
                            if (nzd.LJ == null) {
                                nzd.LJ = new ArrayList();
                            }
                            if (!((ArrayList) nzd.LJ).contains(Integer.valueOf(i4))) {
                                ((ArrayList) nzd.LJ).add(Integer.valueOf(i4));
                            }
                        }
                    } else {
                        i3++;
                    }
                }
            }
        }
        BusinessService.Business LIZ = this.LJLJJL.LIZ(OpenUrlHintBusiness.class);
        ViewOnClickListenerC59660NbE viewOnClickListenerC59660NbE = this.LJLLLLLL;
        String str = this.LJLILLLLZI.LIZ.LJIIIZ;
        LIZ.getClass();
        viewOnClickListenerC59660NbE.LIZIZ(AwemeService.LIZ().o6(str));
        this.LJLJJLL.setFullScreen(new NZJ(this));
        if (this.LJLILLLLZI.LIZJ.LJIJ) {
            LJIIIZ();
        }
        C59309NPl c59309NPl = this.LJLILLLLZI.LIZJ;
        if (!c59309NPl.LJIILL) {
            LJIJJLI();
        } else if (c59309NPl.LJIJ) {
            LJIIIZ();
        } else {
            ((NZ5) LJIL(R.id.g3l)).setGradualChangeMode(false);
            this.LLF.setVisibility(0);
            NZ3 nz3 = this.LL;
            C59314NPq c59314NPq = nz3.LJLILLLLZI;
            if (c59314NPq != null) {
                int i5 = c59314NPq.LIZJ.LJFF;
                if (i5 != -2) {
                    nz3.setBackgroundColor(i5);
                } else {
                    nz3.setBackgroundResource(R.drawable.bno);
                }
                if (c59314NPq.LIZJ.LJII != -2) {
                    ((TextView) nz3.LIZ(R.id.title)).setTextColor(c59314NPq.LIZJ.LJII);
                    Context context = nz3.getContext();
                    if (context != null) {
                        C40681ii LIZ2 = C40681ii.LIZ(context.getResources(), R.drawable.alk, context.getTheme());
                        if (LIZ2 != null) {
                            LIZ2.setTint(c59314NPq.LIZJ.LJII);
                        }
                        ((TuxIconView) nz3.LIZ(R.id.bfl)).setImageDrawable(LIZ2);
                    }
                } else {
                    ((TuxIconView) nz3.LIZ(R.id.bfl)).setIconRes(R.raw.icon_arrow_left_ltr);
                }
                nz3.LIZ(R.id.aj1).setVisibility(8);
                nz3.LIZ(R.id.title).setVisibility(0);
                ((AppCompatImageView) nz3.LIZ(R.id.bfd)).setImageResource(R.drawable.alm);
                ((AppCompatImageView) nz3.LIZ(R.id.az6)).setImageResource(R.drawable.alr);
                ((TuxIconView) nz3.LIZ(R.id.iwu)).setIconRes(R.raw.icon_exclamation_mark_triangle_fill);
                ((AppCompatImageView) nz3.LIZ(R.id.j2p)).setImageResource(R.drawable.alo);
            }
        }
        if (this.LJLILLLLZI.LIZJ.LJIILLIIL) {
            LJIL(R.id.c05).setPadding(0, C63081OpJ.LJJJJLI(this.LJLIL), 0, 0);
        }
        if (this.LJLILLLLZI.LIZJ.LJJIIJZLJL) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.LL.getLayoutParams();
            int i6 = this.LJLILLLLZI.LIZJ.LJJIIZ;
            if (i6 < 0) {
                i6 = C63081OpJ.LJJJJLI(this.LJLIL);
            }
            marginLayoutParams.setMargins(0, i6, 0, 0);
            this.LL.setLayoutParams(marginLayoutParams);
        }
    }

    public final void LJJIJIIJIL() {
        if (LJJ() != null) {
            LJJ().onResume();
        }
        PlayableBusiness playableBusiness = (PlayableBusiness) this.LJLJJL.LIZ(PlayableBusiness.class);
        if (playableBusiness != null) {
            playableBusiness.LJ = false;
            playableBusiness.LIZ(false, true);
        }
        PreRenderWebViewBusiness LIZ = NV9.LIZ(this);
        if (LIZ != null) {
            LIZ.LIZIZ(null);
        }
        Activity activity = this.LJLIL;
        if (activity != null) {
            C27740Aue.LJII(activity);
        }
        LJJIJIL(true);
        if (LJJIII()) {
            this.LJLJLJ = "full_screen_slide";
        }
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_CREATE)
    public void onCreate() {
        System.currentTimeMillis();
        EventBus.LIZJ().LJIILJJIL(this);
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
    public final void onResume() {
        System.currentTimeMillis();
        this.LJLJJLL.LIZLLL(this.LJLIL);
        this.LJLJJL.LIZIZ.LIZ(WalletBusiness.class).getClass();
        this.LJZI = System.currentTimeMillis();
        LJJIFFI();
        AdWebStatBusiness adWebStatBusiness = (AdWebStatBusiness) this.LJLJJL.LIZ(AdWebStatBusiness.class);
        boolean z = false;
        if (adWebStatBusiness != null) {
            adWebStatBusiness.LIZLLL = false;
            adWebStatBusiness.LJ = false;
            adWebStatBusiness.LJI();
        }
        PlayableBusiness playableBusiness = (PlayableBusiness) this.LJLJJL.LIZ(PlayableBusiness.class);
        if (playableBusiness != null && !playableBusiness.LJ) {
            playableBusiness.LIZ(false, true);
        }
        Bundle bundle = this.LJLJI;
        if (bundle != null && bundle.getBoolean("skip_consent", false)) {
            z = true;
        }
        this.LJLLJ = (C73411SrX) AbstractC73672Svk.LJJIJIL(a.LJIJJ()).LJJL(T16.LIZ()).LJJJJZI(new AfS28S0110000_10(this, z, 2));
        this.LJLLI = true;
    }

    @Override // X.InterfaceC59561NZd
    public final NZX LJII() {
        return this.LJLL;
    }

    @Override // X.InterfaceC59561NZd
    public final NZC LJIIJJI() {
        return this.LJLJJLL;
    }

    @Override // X.InterfaceC59488NWi
    public final /* bridge */ /* synthetic */ Context getContext() {
        return this.LJLIL;
    }

    @Override // X.InterfaceC59488NWi
    public final NTL getCrossPlatformBusiness() {
        return this.LJLJJL;
    }

    @Override // X.InterfaceC59488NWi
    public final C59314NPq getCrossPlatformParams() {
        return this.LJLILLLLZI;
    }

    @Override // com.ss.android.ugc.aweme.crossplatform.activity.AbsActivityContainer
    public final void LJFF(InterfaceC27436Apk interfaceC27436Apk) {
        if (interfaceC27436Apk != null) {
            synchronized (this.LLFII) {
                ((HashSet) this.LLFII).add(interfaceC27436Apk);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.crossplatform.activity.AbsActivityContainer
    public final void LJIILJJIL(InterfaceC27436Apk interfaceC27436Apk) {
        if (interfaceC27436Apk != null) {
            synchronized (this.LLFII) {
                ((HashSet) this.LLFII).remove(interfaceC27436Apk);
            }
        }
    }

    @Override // X.F10
    public final void LJIIZILJ(String str) {
        LJIILL(str, true);
    }

    public final <T extends View> T LJIL(int i) {
        return (T) this.LJLIL.findViewById(i);
    }

    public final void LJJI(boolean z) {
        if (!canGoBack()) {
            C188727au c188727au = new C188727au();
            c188727au.LJI("method", this.LJZ);
            FMX.LJIIL("h5_leave_detail", c188727au.LIZ);
            Runnable runnable = this.LJLJLLL;
            if (runnable != null) {
                runnable.run();
                if (z) {
                    this.LJLJLJ = "full_screen_page_click";
                } else {
                    this.LJLJLJ = "full_screen_system_click";
                }
            }
        }
    }

    public final void LJJIIJ(String str) {
        this.LJLJJI = true;
        Bundle bundle = this.LJLJI;
        if (bundle != null && !TextUtils.equals(str, bundle.getString("url"))) {
            this.LJLJI.putString("url", str);
            this.LJLILLLLZI = C59307NPj.LIZ(this.LJLJI);
            LJJIJ();
        }
        ((NXI) this.LJLJJLL.LJI(NXI.class)).LIZIZ(str);
        AdWebStatBusiness adWebStatBusiness = (AdWebStatBusiness) this.LJLJJL.LIZ(AdWebStatBusiness.class);
        if (adWebStatBusiness != null) {
            adWebStatBusiness.LIZLLL = false;
            adWebStatBusiness.LJ = false;
        }
    }

    public final void LJJIJIL(boolean z) {
        C59273NOb c59273NOb = this.LJLILLLLZI.LIZIZ;
        if (c59273NOb.LIZ > 0) {
            if (z) {
                IAdLandPageSurveyService LJI = AdLandPageSurveyServiceImpl.LJI();
                String str = c59273NOb.LJJIJL;
                StringBuilder LIZ = X1D.LIZ();
                LJI.LJ(str, C0H1.LIZJ(LIZ, c59273NOb.LJJJLIIL, "", LIZ), c59273NOb.LJIILIIL, c59273NOb.LJJJJZI, c59273NOb.LJIIIIZZ, c59273NOb.LJJJJZ, c59273NOb.LJJJJL, c59273NOb.LJJJJLI, c59273NOb.LJJJJLL);
                return;
            }
            AdLandPageSurveyServiceImpl.LJI().LIZ();
        }
    }

    @QD3
    public final void invokeRenderTimeEvent(C56642Ke c56642Ke) {
        JSONObject jSONObject;
        NZN nzn;
        if (this.LJLLI && (jSONObject = c56642Ke.LJLIL) != null) {
            if (TextUtils.equals("goods_rn_page_monitor", jSONObject.optString("eventName"))) {
                try {
                    JSONObject jSONObject2 = JSONObjectProtectorUtils.getJSONObject(c56642Ke.LJLIL, "data");
                    C71367Rzf c71367Rzf = new C71367Rzf();
                    CastLongProtector.valueOf(jSONObject2.optString("interact_render_ts")).longValue();
                    jSONObject2.optString("page_id");
                    CastLongProtector.valueOf(jSONObject2.optString("ender_render_ts")).longValue();
                    jSONObject2.optString("session_id");
                    C71396S0i.LIZ().logCommerceEvents("commerce_page_render_time", c71367Rzf);
                    return;
                } catch (Exception e) {
                    C16880lQ.LLLLIIL(e);
                    return;
                }
            }
            if (TextUtils.equals("hybrid_prefetch_duration_monitor", c56642Ke.LJLIL.optString("eventName"))) {
                NZG nzg = new NZG();
                try {
                    JSONObject jSONObject3 = JSONObjectProtectorUtils.getJSONObject(c56642Ke.LJLIL, "data");
                    nzg.LJIILL.put("duration", CastLongProtector.valueOf(jSONObject3.optString("duration")).longValue());
                    nzg.LJIILJJIL.put("duration_type", jSONObject3.optString("duration_type"));
                    nzg.LJIILJJIL.put("is_cache", jSONObject3.optString("is_cache"));
                    nzg.LJIILJJIL.put("page_id", jSONObject3.optString("page_id"));
                    NZC nzc = this.LJLJJLL;
                    if (nzc != null) {
                        nzg.LJIIZILJ = nzc.getMonitorSession();
                    }
                    C59639Nat LIZ = F0L.LIZ();
                    C59866NeY c59866NeY = nzg.LJIIZILJ;
                    if (c59866NeY != null) {
                        nzn = (NZN) c59866NeY.LJJIJIIJI(NZN.class);
                    } else {
                        nzn = null;
                    }
                    JSONObject jSONObject4 = nzg.LJIILJJIL;
                    JSONObject jSONObject5 = nzg.LJIILL;
                    JSONObject jSONObject6 = nzg.LJIILLIIL;
                    LIZ.getClass();
                    if (nzn != null) {
                        nzn.LJIILJJIL("hybrid_prefetch_duration_monitor", "invoke_render_event", jSONObject4, jSONObject5, jSONObject6);
                    }
                } catch (Exception e2) {
                    C16880lQ.LLLLIIL(e2);
                }
            }
        }
    }

    @QD3
    public void onEvent(C40292Frc c40292Frc) {
        NZR LIZ;
        PreRenderWebViewBusiness LIZ2 = NV9.LIZ(this);
        if (LIZ2 != null) {
            LIZ2.LIZJ(this.LJLJJLL, c40292Frc);
            return;
        }
        if (c40292Frc == null || c40292Frc.LJLILLLLZI == null || c40292Frc.LJLIL == 0 || (LIZ = ((NXI) this.LJLJJLL.LJI(NXI.class)).LIZ()) == null || LIZ.hashCode() != c40292Frc.LJLIL) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("code", 1);
            jSONObject.put("preloadType", 0);
            String str = this.LJLILLLLZI.LIZIZ.LJJIJL;
            if ("splash".equals(str)) {
                jSONObject.put(WM7.SCENE_SERVICE, 2);
            } else if ("feedad".equals(str)) {
                jSONObject.put(WM7.SCENE_SERVICE, 1);
            }
        } catch (JSONException e) {
            C16880lQ.LLLLIIL(e);
        }
        c40292Frc.LJLILLLLZI.LIZIZ(jSONObject);
    }

    @QD3
    public void onEvent(C40263Fr9 c40263Fr9) {
        NZC nzc;
        NXI nxi;
        NZR LIZ;
        if (c40263Fr9 == null || c40263Fr9.LJLIL == 0 || (nzc = this.LJLJJLL) == null || (nxi = (NXI) nzc.LJI(NXI.class)) == null || (LIZ = nxi.LIZ()) == null || this.LJLJLLL == null || LIZ.hashCode() != c40263Fr9.LJLIL || LJIJI(null, false)) {
            return;
        }
        this.LJLJLLL.run();
        this.LJLJLJ = "full_screen_page_click";
    }

    @QD3
    public void onEvent(C59650Nb4 c59650Nb4) {
        Activity activity = this.LJLIL;
        if (!(activity instanceof ActivityC45651qj)) {
            return;
        }
        ActivityC45651qj activityC45651qj = (ActivityC45651qj) activity;
        C77591Ucl c77591Ucl = new C77591Ucl();
        Map<String, String> map = c59650Nb4.LJLJI;
        o.LJIIIZ(map, "<set-?>");
        c77591Ucl.LIZIZ = map;
        LiveOuterService.LJJJLL().LJJIJIL().createRechargeDialogFragment(activityC45651qj, new C59648Nb2(c59650Nb4), c59650Nb4.LJLILLLLZI, c77591Ucl).showNow(activityC45651qj.getSupportFragmentManager(), C16880lQ.LJLLJ(getClass()));
    }

    @QD3
    public final void onEvent(C107794Kx c107794Kx) {
        if (TextUtils.equals("web", c107794Kx.LJLJJI)) {
            IMService.createIIMServicebyMonsterPlugin(false).getShareService().LJIIL(this.LJLIL, this.LL, c107794Kx);
        }
    }

    @QD3
    public void onEvent(C59470NVq c59470NVq) {
        if (this.LJLJL != null) {
            C79004UzY.LJJIFFI(C61291O3r.LIZIZ);
        }
    }

    public MixActivityContainer(Activity activity, C59314NPq c59314NPq) {
        new C73318Sq2();
        this.LJLLJ = null;
        this.LJLLLL = new NPH();
        this.LLFF = false;
        this.LLFII = new HashSet();
        this.LJLIL = activity;
        this.LJLILLLLZI = c59314NPq;
        this.LJLJJL = new C59484NWe(this);
    }

    @Override // com.ss.android.ugc.aweme.crossplatform.activity.AbsActivityContainer
    public final boolean LJIILIIL(int i, String str) {
        return C61200O0e.LIZLLL().LJIIIIZZ(i, this.LJLIL, str);
    }

    @Override // X.InterfaceC59561NZd
    public final void LJIILL(CharSequence charSequence, boolean z) {
        Integer num;
        if (this.LL == null) {
            return;
        }
        if (NWB.LIZIZ(this.LJLILLLLZI) && !TextUtils.isEmpty(charSequence)) {
            this.LL.setTitle(charSequence);
            return;
        }
        if ((TextUtils.isEmpty(charSequence) || !AbstractC57425MgH.LJII(charSequence)) && (num = this.LJLILLLLZI.LIZ.LIZ) != null && num.intValue() == 1) {
            if (this.LJLILLLLZI.LIZJ.LJIL || z) {
                this.LL.setTitle(charSequence);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.crossplatform.activity.AbsActivityContainer
    public final void LJIJ(int i, Intent intent) {
        this.LJLIL.setResult(LiveExchangeConfirmThreshold.DEFAULT, intent);
    }

    public final boolean LJIJI(Runnable runnable, boolean z) {
        boolean z2;
        if (((NXI) this.LJLJJLL.LJI(NXI.class)).LIZ() != null) {
            z2 = ((NXI) this.LJLJJLL.LJI(NXI.class)).canGoBack();
        } else {
            z2 = false;
        }
        if (!LJJIII() || (z2 && !z)) {
            return false;
        }
        return AdLandPageSurveyServiceImpl.LJI().LIZLLL(this.LJLIL, new AObjectS128S0200000_10(this, runnable, 3));
    }

    @Override // X.InterfaceC27436Apk
    public final boolean onActivityResult(int i, int i2, Intent intent) {
        BusinessService.Business LIZ = this.LJLJJL.LIZ(WalletBusiness.class);
        String currentUrl = this.LJLJJLL.getCurrentUrl();
        LIZ.getClass();
        if (currentUrl != null && currentUrl.contains("wallet/home")) {
            C2U8.LIZ(new NTI());
        }
        HashSet hashSet = new HashSet();
        synchronized (this.LLFII) {
            hashSet.addAll(this.LLFII);
        }
        if (!hashSet.isEmpty()) {
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                ((InterfaceC27436Apk) it.next()).onActivityResult(i, i2, intent);
            }
            return false;
        }
        return false;
    }
}

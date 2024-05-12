package com.ss.android.ugc.aweme.share.qrcode;

import X.ASL;
import X.AV1;
import X.ActivityC86117Xqz;
import X.C16880lQ;
import X.C188727au;
import X.C2068389v;
import X.C44927HkB;
import X.C57127MbT;
import X.C5S1;
import X.C61712OJw;
import X.C61713OJx;
import X.C62180Oam;
import X.C62494Ofq;
import X.C65803Ps7;
import X.C73318Sq2;
import X.C78688UuS;
import X.C79866VWc;
import X.C7MY;
import X.C82802Wec;
import X.EF7;
import X.FMX;
import X.HG3;
import X.InterfaceC62484Ofg;
import X.J7H;
import X.KL2;
import X.L12;
import X.OHQ;
import X.OYF;
import X.OZ1;
import X.OZ4;
import X.OZA;
import X.OZC;
import X.OZD;
import X.OZE;
import X.OZG;
import X.OZM;
import X.OZQ;
import X.RBX;
import X.W5F;
import X.W5U;
import X.X1D;
import Y.ACListenerS30S0100000_10;
import Y.ACListenerS39S0200000_4;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import com.bytedance.apm.agent.v2.instrumentation.ActivityAgent;
import com.bytedance.bpea.cert.token.TokenCert;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.homepage.msadapt.MSAdaptionService;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.ug.UgCommonServiceImpl;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AqS157S0200000_10;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class UserQRCodeActivity extends ActivityC86117Xqz {
    public static final /* synthetic */ int LJLZ = 0;
    public View LJLILLLLZI;
    public ImageView LJLJI;
    public View LJLJJI;
    public TextView LJLJJL;
    public C57127MbT LJLJJLL;
    public OZQ LJLJL;
    public FrameLayout LJLJLJ;
    public C62180Oam LJLJLLL;
    public C79866VWc LJLL;
    public String LJLLI;
    public String LJLLILLLL;
    public final Map<Integer, View> LJLLLLLL = new LinkedHashMap();
    public final C73318Sq2 LJLIL = new C73318Sq2();
    public final OZE LJLLJ = new OZE(this);
    public final ACListenerS30S0100000_10 LJLLL = new ACListenerS30S0100000_10(this, 58);
    public final ACListenerS30S0100000_10 LJLLLL = new ACListenerS30S0100000_10(this, 59);

    @Override // X.ActivityC86117Xqz, X.KMV
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJLLLLLL).clear();
    }

    @Override // X.ActivityC86117Xqz, X.KMV
    public final View _$_findCachedViewById(int i) {
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLLLLLL;
        View view = (View) linkedHashMap.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        if (findViewById == null) {
            return null;
        }
        linkedHashMap.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    @Override // X.ActivityC86117Xqz, X.ActivityC45651qj, android.app.Activity
    public final void onPause() {
        C65803Ps7.LIZJ(this);
        super.onPause();
    }

    @Override // X.ActivityC86117Xqz, X.ActivityC45651qj, android.app.Activity
    public final void onResume() {
        C65803Ps7.LIZLLL(this);
        super.onResume();
    }

    @Override // X.ActivityC86117Xqz, X.C29S, X.ActivityC45651qj, android.app.Activity
    public final void onStart() {
        C65803Ps7.LJ(this);
        super.onStart();
    }

    @Override // X.ActivityC86117Xqz, android.app.Activity, android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.share.qrcode.UserQRCodeActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public final void LLFZ() {
        if (MSAdaptionService.LJIIL().LJI(this)) {
            C16880lQ.LLZILL(Toast.makeText(this, getString(R.string.f1i), 0));
            return;
        }
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("enter_from", "qr_code_detail");
        c188727au.LJIIIZ("previous_page", "personal_homepage");
        FMX.LJIIL("qr_code_scan_enter", c188727au.LIZ);
        C188727au c188727au2 = new C188727au();
        c188727au2.LJIIIZ("enter_from", "qr_code_detail");
        c188727au2.LJIIIZ("action_type", "click");
        FMX.LJIIL("scan_icon", c188727au2.LIZ);
        OZ1.LIZIZ.LIZIZ(this, -1, true);
    }

    @Override // X.ActivityC86117Xqz, X.C29S, X.ActivityC45651qj, android.app.Activity
    public final void onDestroy() {
        C65803Ps7.LIZIZ(this);
        super.onDestroy();
        this.LJLIL.LIZLLL();
    }

    @Override // X.ActivityC86117Xqz, X.C29S, X.ActivityC45651qj, android.app.Activity
    public final void onStop() {
        C65803Ps7.LJFF(this);
        super.onStop();
        if (EnterTransitionCrashOptimizer.getContext() != null) {
            try {
                getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
            } catch (Throwable unused) {
            }
        }
        try {
            getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
        } catch (Throwable unused2) {
        }
    }

    public final void LLII(OZA oza) {
        C62180Oam c62180Oam = this.LJLJLLL;
        if (c62180Oam != null && !c62180Oam.LJLILLLLZI) {
            Context LIZIZ = EF7.LIZIZ();
            C5S1 c5s1 = new C5S1(LIZIZ);
            c5s1.LIZLLL(LIZIZ.getString(R.string.exs));
            c5s1.LJ();
            return;
        }
        C79866VWc c79866VWc = this.LJLL;
        if (c79866VWc != null && c62180Oam != null) {
            OZD ozd = new OZD(this);
            ozd.setCallback(new OZC(oza, c62180Oam, c79866VWc, ozd));
            String qrCodeUrl = c62180Oam.getQrCodeUrl();
            o.LJIIIZ(qrCodeUrl, "qrCodeUrl");
            W5F LJIIIIZZ = W5U.LJIIIIZZ(qrCodeUrl);
            LJIIIIZZ.LIZJ = ozd.getContext();
            LJIIIIZZ.LJIIIZ(new OZG(ozd));
        }
    }

    @Override // X.ActivityC86117Xqz, X.KMV, X.ActivityC45651qj, androidx.activity.ComponentActivity, X.C1AU, android.app.Activity
    public final void onCreate(Bundle bundle) {
        OZQ ozq;
        User user;
        String str;
        String str2;
        ViewGroup.LayoutParams layoutParams;
        ViewGroup.LayoutParams layoutParams2;
        User user2;
        C65803Ps7.LIZ(this, bundle);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.share.qrcode.UserQRCodeActivity", "onCreate", true);
        InterfaceC62484Ofg interfaceC62484Ofg = C62494Ofq.LIZ;
        if (interfaceC62484Ofg != null) {
            interfaceC62484Ofg.LJIJ();
            setTheme(R.style.lb);
        }
        super.onCreate(bundle);
        if (L12.LIZJ()) {
            setContentView(R.layout.clq);
        } else {
            setContentView(R.layout.clp);
        }
        this.LJLLI = C16880lQ.LLJJIJIIJIL(getIntent(), "extra_key_type");
        this.LJLLILLLL = C16880lQ.LLJJIJIIJIL(getIntent(), "extra_key_enter_form");
        C16880lQ.LLJJIJIIJIL(getIntent(), "extra_key_enter_method");
        this.LJLILLLLZI = findViewById(R.id.ij2);
        this.LJLJI = (ImageView) findViewById(R.id.ij3);
        this.LJLJJI = findViewById(R.id.iil);
        this.LJLJJL = (TextView) findViewById(R.id.ij_);
        findViewById(R.id.iir);
        findViewById(R.id.ij0);
        this.LJLJJLL = (C57127MbT) findViewById(R.id.ij8);
        this.LJLJL = (OZQ) findViewById(R.id.iim);
        this.LJLJLJ = (FrameLayout) findViewById(R.id.iis);
        this.LJLJLLL = (C62180Oam) findViewById(R.id.iit);
        this.LJLL = (C79866VWc) findViewById(R.id.ij9);
        View findViewById = findViewById(R.id.ij5);
        o.LJIIIIZZ(findViewById, "findViewById(R.id.qr_code_top_left)");
        View findViewById2 = findViewById(R.id.ij6);
        o.LJIIIIZZ(findViewById2, "findViewById(R.id.qr_code_top_right)");
        View findViewById3 = findViewById(R.id.iii);
        o.LJIIIIZZ(findViewById3, "findViewById(R.id.qr_code_bottom_left)");
        View findViewById4 = findViewById(R.id.iij);
        o.LJIIIIZZ(findViewById4, "findViewById(R.id.qr_code_bottom_right)");
        View findViewById5 = findViewById(R.id.g_c);
        o.LJIIIIZZ(findViewById5, "findViewById(R.id.logo)");
        UgCommonServiceImpl.LJIJ().LIZIZ();
        ViewGroup.LayoutParams layoutParams3 = null;
        C82802Wec.LJIIJJI((ImageView) findViewById, "share_user_qr_code_left_top", null);
        C82802Wec.LJIIJJI((ImageView) findViewById2, "share_user_qr_code_top_right", null);
        C82802Wec.LJIIJJI((ImageView) findViewById3, "share_user_qr_code_bottom_left", null);
        C82802Wec.LJIIJJI((ImageView) findViewById4, "share_user_qr_code_right_bottom", null);
        C82802Wec.LJIIJJI((ImageView) findViewById5, "img_scan_logo_new", null);
        C62180Oam c62180Oam = this.LJLJLLL;
        o.LJI(c62180Oam);
        C82802Wec.LJIIJ(c62180Oam, "qr_code_default_view");
        View view = this.LJLILLLLZI;
        if (view != null) {
            C16880lQ.LJIIJ(this.LJLLL, view);
        }
        ImageView imageView = this.LJLJI;
        if (imageView != null) {
            C16880lQ.LJIILLIIL(imageView, this.LJLLLL);
        }
        if ((L12.LIZ() == 3 || L12.LIZ() == 0 || L12.LIZ() == 1) && (ozq = this.LJLJL) != null) {
            ozq.setCallback(this.LJLLJ);
        }
        C62180Oam c62180Oam2 = this.LJLJLLL;
        if (c62180Oam2 != null) {
            IAccountUserService LJIILL = HG3.LJIILL();
            if (LJIILL != null) {
                user2 = ((RBX) LJIILL).getCurUser();
            } else {
                user2 = null;
            }
            String LJIIIIZZ = AV1.LJIIIIZZ(user2);
            String str3 = this.LJLLILLLL;
            if (str3 == null) {
                str3 = "personal_homepage";
            }
            c62180Oam2.LJ(4, LJIIIIZZ, str3);
        }
        View view2 = this.LJLJJI;
        if (view2 != null) {
            C16880lQ.LJIIJ(OZM.LJLIL, view2);
        }
        if (L12.LIZJ()) {
            C16880lQ.LJIIZILJ((LinearLayout) _$_findCachedViewById(R.id.iin), new ACListenerS30S0100000_10(this, 203));
            View LLLZIIL = C16880lQ.LLLZIIL(R.layout.cmh, getLayoutInflater(), null);
            View findViewById6 = LLLZIIL.findViewById(R.id.iim);
            o.LJII(findViewById6, "null cannot be cast to non-null type com.ss.android.ugc.aweme.share.qrcode.view.UserQRCodeControlView");
            ((OZQ) findViewById6).setCallback(this.LJLLJ);
            TuxSheet tuxSheet = new ASL().LIZ;
            tuxSheet.LJLLI = LLLZIIL;
            View findViewById7 = LLLZIIL.findViewById(R.id.juc);
            o.LJII(findViewById7, "null cannot be cast to non-null type com.bytedance.tux.icon.TuxIconView");
            C16880lQ.LJJJ((TuxIconView) findViewById7, new ACListenerS30S0100000_10(tuxSheet, 204));
            C16880lQ.LJIIZILJ((LinearLayout) _$_findCachedViewById(R.id.iiz), new ACListenerS39S0200000_4(tuxSheet, this, 114));
        }
        ImageView imageView2 = this.LJLJI;
        if (imageView2 != null) {
            C2068389v c2068389v = new C2068389v();
            c2068389v.LIZ = R.raw.icon_scan;
            c2068389v.LJ = Integer.valueOf(R.attr.dj);
            c2068389v.LIZIZ = C7MY.LIZIZ(24);
            c2068389v.LIZJ = C7MY.LIZIZ(24);
            imageView2.setImageDrawable(c2068389v.LIZ(this));
        }
        C61713OJx LIZJ = C61712OJw.LIZJ(this);
        LIZJ.LIZIZ.LJIIL();
        if (L12.LIZJ()) {
            LIZJ.LIZIZ.LJIIJJI();
        } else {
            LIZJ.LJ(R.attr.cr);
        }
        LIZJ.LIZJ();
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("enter_from", "qr_code_detail");
        c188727au.LJIIIZ("action_type", "show");
        FMX.LJIIL("scan_icon", c188727au.LIZ);
        IAccountUserService LJIILL2 = HG3.LJIILL();
        if (LJIILL2 != null) {
            user = ((RBX) LJIILL2).getCurUser();
        } else {
            user = null;
        }
        TextView textView = this.LJLJJL;
        if (textView != null) {
            if (user != null) {
                str = user.getNickname();
            } else {
                str = null;
            }
            textView.setText(str);
        }
        C57127MbT c57127MbT = this.LJLJJLL;
        if (c57127MbT != null) {
            c57127MbT.setBorderColor(R.color.ar);
        }
        C57127MbT c57127MbT2 = this.LJLJJLL;
        if (c57127MbT2 != null) {
            c57127MbT2.setBorderWidth(4);
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("UserQRCodeActivity_");
        if (user == null || (str2 = user.getUid()) == null) {
            str2 = "no_uid";
        }
        LIZ.append(str2);
        String LIZIZ = X1D.LIZIZ(LIZ);
        int dimension = (int) getResources().getDimension(R.dimen.a7r);
        C57127MbT c57127MbT3 = this.LJLJJLL;
        if (c57127MbT3 != null) {
            c57127MbT3.LJIIIIZZ(C78688UuS.LJJI(user), J7H.LIZ(101), dimension, dimension, LIZIZ, true, null);
        }
        if (KL2.LJIILL(this, KL2.LJIIIZ(this)) < 654) {
            View view3 = this.LJLJJI;
            if (view3 != null) {
                layoutParams = view3.getLayoutParams();
            } else {
                layoutParams = null;
            }
            o.LJII(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            marginLayoutParams.topMargin = (int) KL2.LIZJ(this, 18.0f);
            View view4 = this.LJLJJI;
            if (view4 != null) {
                view4.setLayoutParams(marginLayoutParams);
            }
            int LIZJ2 = (int) KL2.LIZJ(this, 130.0f);
            FrameLayout frameLayout = this.LJLJLJ;
            if (frameLayout != null) {
                layoutParams2 = frameLayout.getLayoutParams();
            } else {
                layoutParams2 = null;
            }
            o.LJII(layoutParams2, "null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            layoutParams2.width = LIZJ2;
            layoutParams2.height = LIZJ2;
            FrameLayout frameLayout2 = this.LJLJLJ;
            if (frameLayout2 != null) {
                frameLayout2.setLayoutParams(layoutParams2);
            }
            int LIZJ3 = (int) KL2.LIZJ(this, 115.0f);
            C62180Oam c62180Oam3 = this.LJLJLLL;
            if (c62180Oam3 != null) {
                layoutParams3 = c62180Oam3.getLayoutParams();
            }
            o.LJII(layoutParams3, "null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            layoutParams3.width = LIZJ3;
            layoutParams3.height = LIZJ3;
            C62180Oam c62180Oam4 = this.LJLJLLL;
            if (c62180Oam4 != null) {
                c62180Oam4.setLayoutParams(layoutParams3);
            }
        }
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.share.qrcode.UserQRCodeActivity", "onCreate", false);
    }

    public final void saveToDevice(View view) {
        C44927HkB.LIZ(this, TokenCert.Companion.with("bpea-check_qrcode_download_storage"), new AqS157S0200000_10(this, view, 15));
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x004d, code lost:
    
        if (r2 != null) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x007c, code lost:
    
        if (r2 != null) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0060  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LLFII(android.content.Context r7, X.InterfaceC88471Ynr r8) {
        /*
            r6 = this;
            com.ss.android.ugc.aweme.IAccountUserService r0 = X.HG3.LJIILL()
            r4 = 0
            if (r0 == 0) goto L83
            X.RBX r0 = (X.RBX) r0
            com.ss.android.ugc.aweme.profile.model.User r2 = r0.getCurUser()
            if (r2 == 0) goto L84
            com.ss.android.ugc.aweme.base.share.ShareInfo r0 = r2.getShareInfo()
            if (r0 == 0) goto L84
            java.lang.String r0 = r0.getShareUrl()
        L19:
            r5 = 0
            if (r0 == 0) goto L22
            int r0 = r0.length()
            if (r0 != 0) goto L81
        L22:
            r0 = 1
        L23:
            java.lang.String r3 = ""
            if (r0 == 0) goto L60
            if (r2 == 0) goto L4f
            java.lang.StringBuilder r1 = X.X1D.LIZ()
            java.lang.String r0 = "tiktok.com/@"
            r1.append(r0)
            java.lang.String r0 = r2.getUniqueId()
            r1.append(r0)
            java.lang.String r0 = X.X1D.LIZIZ(r1)
            java.lang.String r0 = X.C78609UtB.LJIJJ(r0)
            if (r0 == 0) goto L4f
            java.lang.String r0 = X.C78609UtB.LJJ(r0)
            if (r0 == 0) goto L4f
            java.lang.String r2 = X.C78609UtB.LJJI(r0)
            if (r2 != 0) goto L50
        L4f:
            r2 = r3
        L50:
            int r0 = r2.length()
            if (r0 != 0) goto L86
            X.OYP r1 = new X.OYP
            r0 = 6
            r1.<init>(r3, r4, r0)
            r8.invoke(r1, r7)
            return
        L60:
            if (r2 == 0) goto L7f
            com.ss.android.ugc.aweme.base.share.ShareInfo r0 = r2.getShareInfo()
            if (r0 == 0) goto L7f
            java.lang.String r0 = r0.getShareUrl()
        L6c:
            java.lang.String r0 = X.C78609UtB.LJIJJ(r0)
            if (r0 == 0) goto L4f
            java.lang.String r0 = X.C78609UtB.LJJ(r0)
            if (r0 == 0) goto L4f
            java.lang.String r2 = X.C78609UtB.LJJI(r0)
            if (r2 != 0) goto L50
            goto L4f
        L7f:
            r0 = r4
            goto L6c
        L81:
            r0 = 0
            goto L23
        L83:
            r2 = r4
        L84:
            r0 = r4
            goto L19
        L86:
            com.ss.android.ugc.aweme.share.improve.channel.CopyLinkChannel r1 = new com.ss.android.ugc.aweme.share.improve.channel.CopyLinkChannel
            r1.<init>(r5)
            java.lang.String r0 = "user"
            X.Sv9 r1 = X.OYF.LIZLLL(r1, r2, r0)
            X.OYb<T, R> r0 = X.C62081OYb.LJLIL
            X.StV r1 = r1.LJIIJ(r0)
            X.T0k r0 = X.T16.LIZ()
            X.Sui r1 = r1.LJIJJ(r0)
            X.T0k r0 = X.C73969T1h.LIZIZ()
            X.StO r2 = r1.LJIIL(r0)
            Y.AfS50S0200000_1 r1 = new Y.AfS50S0200000_1
            r0 = 16
            r1.<init>(r7, r8, r0)
            X.3kP r1 = r2.LJIILLIIL(r1)
            X.Sq2 r0 = r6.LJLIL
            X.C78999UzT.LJFF(r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.share.qrcode.UserQRCodeActivity.LLFII(android.content.Context, X.Ynr):void");
    }

    /* JADX WARN: Failed to extract var names
    java.lang.NullPointerException
     */
    @Override // X.ActivityC45651qj, androidx.activity.ComponentActivity, android.app.Activity, X.C06Q
    public final void onRequestPermissionsResult(int i, String[] strArr, int[] grantResults) {
        o.LJIIIZ(strArr, OHQ.LIZIZ);
        o.LJIIIZ(grantResults, "grantResults");
        super.onRequestPermissionsResult(i, strArr, grantResults);
        if (i == 1) {
            for (int i2 : grantResults) {
                if (i2 == -1) {
                    Context baseContext = getBaseContext();
                    o.LJIIIIZZ(baseContext, "baseContext");
                    OYF.LJII(baseContext, TokenCert.Companion.with("bpea-request_save_qr_image_storage"), null);
                    return;
                }
            }
            Context baseContext2 = getBaseContext();
            o.LJIIIIZZ(baseContext2, "baseContext");
            OZ4.LIZ(baseContext2, this.LJLL, this.LJLJLLL, true, false, null);
        }
    }
}

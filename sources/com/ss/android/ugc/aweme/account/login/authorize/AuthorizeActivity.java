package com.ss.android.ugc.aweme.account.login.authorize;

import X.ActivityC86117Xqz;
import X.C0M8;
import X.C0M9;
import X.C16880lQ;
import X.C198517qh;
import X.C207998Eh;
import X.C26045AKb;
import X.C2NU;
import X.C35831E4l;
import X.C35936E8m;
import X.C38816FLg;
import X.C40535FvX;
import X.C58725N2z;
import X.C5S1;
import X.C65803Ps7;
import X.C66569QAr;
import X.C68972R5c;
import X.C68987R5r;
import X.C69008R6m;
import X.C77266UUc;
import X.C78685UuP;
import X.C78939UyV;
import X.C79156V4u;
import X.DialogC61824OOe;
import X.EnumC62956OnI;
import X.EnumC69113RAn;
import X.EnumC69116RAq;
import X.FMX;
import X.HG3;
import X.InterfaceC61825OOf;
import X.InterfaceC62984Onk;
import X.InterfaceC68974R5e;
import X.InterfaceC69001R6f;
import X.InterfaceC69002R6g;
import X.InterfaceC85767XlL;
import X.Q13;
import X.QBA;
import X.QBB;
import X.QBC;
import X.QBH;
import X.QQD;
import X.QQN;
import X.QTX;
import X.R41;
import X.R6B;
import X.R6E;
import X.R6F;
import X.R6G;
import X.R6H;
import X.R6I;
import X.R6J;
import X.R6R;
import X.R6V;
import X.R6X;
import X.R72;
import X.RBX;
import X.RC0;
import X.RunnableC45421Hs9;
import X.V16;
import X.V1B;
import X.X1D;
import Y.ARunnableS11S0301000_11;
import Y.ARunnableS14S0101000_10;
import Y.ARunnableS14S0201000_11;
import Y.ARunnableS14S0210000_15;
import Y.ARunnableS15S0101000_11;
import Y.ARunnableS17S0110000_11;
import Y.ARunnableS47S0100000_11;
import Y.ARunnableS9S0101000_5;
import Y.IDeS356S0100000_11;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Base64;
import com.bytedance.apm.agent.v2.instrumentation.ActivityAgent;
import com.bytedance.lobby.auth.AuthResult;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.router.SmartRouter;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.ss.android.ugc.aweme.IPrevLoginPlatformService;
import com.ss.android.ugc.aweme.account.base.SafeHandler;
import com.ss.android.ugc.aweme.account.login.prevlogin.PrevLoginPlatformService;
import com.ss.android.ugc.aweme.account.login.v2.base.CommonFlowActivity;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.main.service.ILanguageService;
import com.ss.android.ugc.aweme.services.IAccountHelperService;
import com.ss.android.ugc.aweme.utils.GsonHolder;
import com.zhiliaoapp.musically.R;
import defpackage.i0;
import java.lang.ref.WeakReference;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.o;
import yq4.a;

/* loaded from: classes12.dex */
public class AuthorizeActivity extends ActivityC86117Xqz implements InterfaceC61825OOf, R6J, InterfaceC69002R6g, QBC, InterfaceC69001R6f, InterfaceC68974R5e, InterfaceC62984Onk, InterfaceC85767XlL {
    public static final Set<Integer> LLFFF = new HashSet();
    public QBA LJLIL;
    public QBH LJLILLLLZI;
    public R6I LJLJI;
    public AuthResult LJLJJI;
    public R6F LJLJJL;
    public String LJLJJLL;
    public boolean LJLJL;
    public boolean LJLJLJ;
    public boolean LJLJLLL;
    public String LJLL;
    public String LJLLI;
    public String LJLLILLLL;
    public String LJLLJ;
    public String LJLLL;
    public boolean LJLLLL;
    public DialogC61824OOe LJLLLLLL;
    public boolean LJLZ;
    public boolean LJZ;
    public R6R LLD;
    public final SafeHandler LJZI = new SafeHandler(this);
    public int LJZL = -1;
    public String LL = "";
    public boolean LLF = false;
    public boolean LLFF = false;

    public final void LLIIIILZ() {
        boolean z;
        C79156V4u.LJLJI = null;
        if (this.LJLJL) {
            String platform = this.LJLJJLL;
            int i = this.LJZL;
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("passport error:");
            LIZ.append(this.LL);
            String LIZIZ = X1D.LIZIZ(LIZ);
            o.LJIIIZ(platform, "platform");
            Q13.LIZIZ("monitor_login_thirdparty", 1, C68987R5r.LIZIZ(i, LIZIZ, platform));
            V16.LJJJJZI(this.LJZL, this.LL, this.LJLJJLL);
        }
        Intent intent = new Intent();
        intent.putExtra("error_code", this.LJZL);
        if (a.LIZIZ().LJI() == EnumC62956OnI.US_FTC && this.LJZ && !TextUtils.equals(this.LJLJJLL, "facebook") && !TextUtils.equals(this.LJLJJLL, "google") && C40535FvX.LIZ().getInt("ftc_age_gate_response_mode", 0) != EnumC62956OnI.PASS.getValue()) {
            LLIIIJ(0, intent);
            return;
        }
        int i2 = this.LLD.LIZLLL;
        if (i2 == 1030 || i2 == 1041) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            intent.putExtra("description", this.LJZL);
            intent.putExtra("repeat_bind_error", true);
            LLIIIJ(999, intent);
        } else {
            intent.putExtra("description", this.LJZL);
            LLIIIJ(0, intent);
        }
    }

    @Override // X.InterfaceC62984Onk
    public final boolean getCanCollectConsent() {
        return false;
    }

    @Override // X.ActivityC86117Xqz, X.ActivityC45651qj, android.app.Activity
    public final void onPause() {
        C65803Ps7.LIZJ(this);
        super.onPause();
    }

    @Override // X.ActivityC86117Xqz, X.C29S, X.ActivityC45651qj, android.app.Activity
    public final void onStart() {
        C65803Ps7.LJ(this);
        super.onStart();
    }

    @Override // X.ActivityC86117Xqz, android.app.Activity, android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.account.login.authorize.AuthorizeActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    @Override // X.InterfaceC85767XlL
    public final void LJII() {
        runOnUiThread(new ARunnableS47S0100000_11(this, 45));
    }

    public final void LLIIJI() {
        if (this.LJLLLLLL == null) {
            DialogC61824OOe dialogC61824OOe = new DialogC61824OOe(this);
            this.LJLLLLLL = dialogC61824OOe;
            dialogC61824OOe.LJLIL = this;
        }
        DialogC61824OOe dialogC61824OOe2 = this.LJLLLLLL;
        if (dialogC61824OOe2 != null) {
            V1B.LJLJJL(dialogC61824OOe2);
        }
    }

    @Override // X.InterfaceC61825OOf
    public final void X() {
        LLIIIJ(0, new Intent());
    }

    @Override // X.ActivityC86117Xqz, android.app.Activity
    public final void finish() {
        DialogC61824OOe dialogC61824OOe = this.LJLLLLLL;
        if (dialogC61824OOe != null) {
            V1B.LJLILLLLZI(dialogC61824OOe);
        }
        super.finish();
    }

    @Override // X.InterfaceC68974R5e
    public final String Xg() {
        return C16880lQ.LLJJIJIIJIL(getIntent(), "enter_type");
    }

    @Override // X.InterfaceC68974R5e
    public final Bundle getExtras() {
        return C16880lQ.LLJJIJI(getIntent());
    }

    @Override // X.ActivityC86117Xqz, X.C29S, X.ActivityC45651qj, android.app.Activity
    public final void onDestroy() {
        C65803Ps7.LIZIZ(this);
        super.onDestroy();
        if (this.LJLIL != null) {
            QBB LIZ = QBB.LIZ();
            synchronized (LIZ.LIZ) {
                Iterator it = ((C0M9.b) LIZ.LIZ.entrySet()).iterator();
                while (true) {
                    C0M8 c0m8 = (C0M8) it;
                    if (!c0m8.hasNext()) {
                        break;
                    }
                    c0m8.next();
                    List list = (List) c0m8.getValue();
                    if (list != null) {
                        list.remove(this);
                    }
                }
            }
        }
        Set<Integer> set = LLFFF;
        if (set != null) {
            ((HashSet) set).remove(Integer.valueOf(hashCode()));
        }
    }

    @Override // X.ActivityC86117Xqz, X.ActivityC45651qj, android.app.Activity
    public final void onResume() {
        C65803Ps7.LIZLLL(this);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.account.login.authorize.AuthorizeActivity", "onResume", true);
        super.onResume();
        if (this.LLF && !this.LLFF) {
            LLIIIILZ();
        }
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.account.login.authorize.AuthorizeActivity", "onResume", false);
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

    @Override // X.InterfaceC68974R5e
    public final String LJJLIIIJJI() {
        return this.LJLL;
    }

    @Override // X.InterfaceC68974R5e
    public final String LJJLIIIJLLLLLLLZ() {
        return this.LJLLI;
    }

    @Override // X.InterfaceC68974R5e
    public final String LLZZ() {
        return this.LJLLILLLL;
    }

    @Override // X.InterfaceC68974R5e
    public final String channel() {
        return this.LJLLL;
    }

    public static String LLFII(AuthResult authResult) {
        String str;
        try {
            if (LLII(authResult).booleanValue()) {
                str = "";
            } else {
                str = authResult.mToken;
            }
            String str2 = new String(Base64.decode(str.split("\\.")[1], 8), Charset.forName("utf-8"));
            if (!str2.isEmpty()) {
                Map map = (Map) GsonHolder.LIZLLL().LIZ().LJI(str2, Map.class);
                if (map.containsKey("sub")) {
                    return (String) map.get("sub");
                }
            }
            return authResult.mUid;
        } catch (Exception unused) {
            return authResult.mUid;
        }
    }

    public static Boolean LLII(AuthResult authResult) {
        boolean z;
        if (TextUtils.equals("google", authResult.mProviderId) || TextUtils.equals("google_onetap", authResult.mProviderId)) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    @Override // X.R6J
    public final void LJJIIZI(QTX userInfo) {
        AuthResult authResult;
        boolean z;
        R41.LJIILIIL(userInfo);
        LLFZ(Boolean.FALSE);
        boolean z2 = false;
        int i = 1;
        if (!TextUtils.isEmpty(this.LJLJJLL) && "facebook".equals(this.LJLJJLL) && userInfo != null && (authResult = this.LJLJJI) != null) {
            String[] stringArray = authResult.mBundle.getStringArray("fb_granted_permissions");
            int length = stringArray.length;
            int i2 = 0;
            while (true) {
                if (i2 < length) {
                    if ("user_friends".equals(stringArray[i2])) {
                        z = true;
                        break;
                    }
                    i2++;
                } else {
                    z = false;
                    break;
                }
            }
            String valueOf = String.valueOf(userInfo.LIZ);
            AuthResult authResult2 = this.LJLJJI;
            String str = authResult2.mToken;
            long j = authResult2.mExpiryDateInMillis;
            if (z) {
                C77266UUc.LIZIZ.LJIIJ().LJII(j, valueOf, str);
            } else {
                C77266UUc.LIZIZ.LJIIJ().LIZ(valueOf);
            }
        }
        RC0.LIZJ(null, "login_signup_3p_result", this.LJLL, this.LJLLI, this.LJLJJLL, true);
        if (C35831E4l.LIZ() == 2 || C35831E4l.LIZ() == 3) {
            o.LJIIIZ(userInfo, "userInfo");
            String str2 = userInfo.LJIIZILJ;
            if (str2 == null) {
                str2 = "";
            }
            if (C78685UuP.LJJJZ(str2)) {
                Map<String, String> map = C207998Eh.LIZJ;
                String curUserId = ((RBX) HG3.LJIILL()).getCurUserId();
                o.LJIIIIZZ(curUserId, "userService().curUserId");
                map.put(curUserId, str2);
            }
        }
        if (this.LJLJL) {
            C66569QAr.LIZ(userInfo.LJIIIIZZ, userInfo.LJIJ);
            String str3 = this.LJLJJLL;
            try {
                z2 = C2NU.LIZ.LIZIZ();
            } catch (Exception unused) {
            }
            if (z2) {
                C198517qh LJIILL = V16.LJIILL(str3);
                LJIILL.LIZ.put("app_language", ((ILanguageService) C58725N2z.LIZIZ(ILanguageService.class)).getAppLanguage());
                LJIILL.LIZ.put("platform", str3);
                Q13.LIZIZ("aweme_thirdparty_login_error_rate", 1, LJIILL.LJ());
            }
            ((IAccountHelperService) C58725N2z.LIZIZ(IAccountHelperService.class)).AppsFlyerUtilsTrackLoginSuccess(this.LJLJJLL);
            this.LJZI.post(new R6B(this, userInfo, i));
            IPrevLoginPlatformService LJIIL = PrevLoginPlatformService.LJIIL();
            LJIIL.LJIIJJI(userInfo.LIZ, this.LJLJJLL);
            LJIIL.LJIIIIZZ(this.LJLJJLL);
            return;
        }
        if (this.LJLJLJ) {
            this.LJZI.post(new ARunnableS15S0101000_11(5, this, 9));
        } else {
            this.LJZI.post(new ARunnableS14S0101000_10(2, this, 2));
        }
    }

    @Override // X.InterfaceC85767XlL
    public final void LJJJJZI(Parcelable parcelable) {
        if (parcelable != null && (parcelable instanceof AuthResult)) {
            this.LJLJJLL = "google_onetap";
            onAuthResult((AuthResult) parcelable);
        }
    }

    public final void LLFZ(Boolean bool) {
        if (!TextUtils.isEmpty(this.LJLJJLL) && "google_onetap".equals(this.LJLJJLL)) {
            C35936E8m c35936E8m = new C35936E8m();
            c35936E8m.LIZLLL("enter_from", this.LJLL);
            c35936E8m.LIZJ("enter_method", this.LJLLI);
            if (bool.booleanValue()) {
                c35936E8m.LIZJ("exit_method", "dismiss");
            } else {
                c35936E8m.LIZJ("exit_method", "continue");
            }
            FMX.LJIIL("exit_google_onetap", c35936E8m.LIZ);
        }
    }

    @Override // X.QBC
    public final void onAuthResult(AuthResult authResult) {
        String str;
        if (isFinishing() || isDestroyed()) {
            return;
        }
        this.LJLJJI = authResult;
        Intent intent = new Intent();
        intent.putExtra("platform", this.LJLJJLL);
        if (authResult.mIsSuccessful) {
            str = "1";
        } else if (authResult.mIsCancelled) {
            str = "2";
        } else {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        C35936E8m c35936E8m = new C35936E8m();
        c35936E8m.LIZLLL("enter_method", this.LJLLI);
        c35936E8m.LIZLLL("enter_from", this.LJLL);
        c35936E8m.LIZLLL("enter_type", Xg());
        c35936E8m.LIZLLL("login_panel_type", this.LJLLILLLL);
        c35936E8m.LIZLLL("platform", this.LJLJJLL);
        c35936E8m.LIZLLL("status", str);
        FMX.LJIIL("3p_auth_page_response", c35936E8m.LIZ);
        int i = 1;
        if (authResult.mIsSuccessful) {
            LLIIIZ(authResult, true);
        } else if (authResult.mIsCancelled) {
            LLFZ(Boolean.TRUE);
            this.LJZI.post(new RunnableC45421Hs9(2, this, intent));
        } else {
            this.LJZI.post(new ARunnableS11S0301000_11(0, this, authResult, intent, 3));
        }
        R6I r6i = this.LJLJI;
        if (r6i == null) {
            return;
        }
        if (this.LJLLLL) {
            i = 3;
        } else if (this.LJLJLJ) {
            i = 4;
        }
        r6i.LJIILLIIL(authResult, i, new C69008R6m(this.LJLL, this.LJLLI, this.LJLLJ, this.LJLLILLLL));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0150, code lost:
    
        if (r13 != null) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0184, code lost:
    
        if (r15.equals("google_onetap") == false) goto L14;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0233  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0154  */
    @Override // X.ActivityC86117Xqz, X.KMV, X.ActivityC45651qj, androidx.activity.ComponentActivity, X.C1AU, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onCreate(android.os.Bundle r18) {
        /*
            Method dump skipped, instructions count: 886
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.account.login.authorize.AuthorizeActivity.onCreate(android.os.Bundle):void");
    }

    public final void LLIIIJ(int i, Intent intent) {
        intent.putExtra("platform", this.LJLJJLL);
        if (Looper.myLooper() == C16880lQ.LLJJJJ()) {
            setResult(i, intent);
            finish();
        } else {
            this.LJZI.post(new ARunnableS14S0201000_11(i, this, intent, 8));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:146:0x03d5, code lost:
    
        if (kotlin.jvm.internal.o.LJ(r25.mProviderId, "google_onetap") != false) goto L128;
     */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0362  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0375  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0379  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00d8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LLIIIZ(com.bytedance.lobby.auth.AuthResult r25, boolean r26) {
        /*
            Method dump skipped, instructions count: 988
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.account.login.authorize.AuthorizeActivity.LLIIIZ(com.bytedance.lobby.auth.AuthResult, boolean):void");
    }

    @Override // X.ActivityC86117Xqz, X.KMV, X.ActivityC45651qj, androidx.activity.ComponentActivity, android.app.Activity
    public final void onActivityResult(int i, int i2, Intent intent) {
        Bundle LLJJIJI;
        if (i == 32972) {
            if (i2 != 0 && intent != null && (LLJJIJI = C16880lQ.LLJJIJI(intent)) != null && LLJJIJI.containsKey("callback")) {
                try {
                    Uri parse = UriProtector.parse(LLJJIJI.getString("callback"));
                    String scheme = parse.getScheme();
                    if (scheme != null && scheme.startsWith("snssdk")) {
                        if ("connect_switch".equals(UriProtector.getQueryParameter(parse, "error_name"))) {
                            Intent intent2 = new Intent();
                            intent2.putExtra("repeat_bind_error", true);
                            LLIIIJ(0, intent2);
                            return;
                        }
                    }
                } catch (Exception unused) {
                }
            }
            R6F r6f = this.LJLJJL;
            String str = this.LJLJJLL;
            R6G r6g = new R6G(this);
            Context context = r6f.LIZ;
            QQN LIZIZ = R6V.LIZIZ(str, null, null, null, null, null);
            LIZIZ.LIZ = C78939UyV.LIZIZ("/2/user/info/");
            new R6X(context, LIZIZ.LIZIZ(), r6g).LJIIIZ();
        }
        super.onActivityResult(i, i2, intent);
    }

    @Override // X.R6J
    public final void LJJLIIIJ(int i, String str, String str2, R6R response) {
        boolean z;
        String str3;
        boolean z2;
        EnumC69113RAn enumC69113RAn;
        String str4;
        if (isFinishing()) {
            return;
        }
        this.LJZL = i;
        this.LL = str;
        this.LLD = response;
        LLFZ(Boolean.FALSE);
        if (i == 1011) {
            z = true;
        } else {
            z = false;
        }
        this.LJZ = z;
        R6H r6h = new R6H();
        r6h.LJ = this.LJLJJLL;
        r6h.LIZLLL = CardStruct.IStatusCode.DEFAULT;
        r6h.LJFF = String.valueOf(i);
        if (this.LJLZ) {
            str3 = "/passport/auth/only_login/";
        } else {
            str3 = "/passport/auth/login/";
        }
        r6h.LJI = str3;
        r6h.LIZIZ();
        ((HashMap) r6h.LIZIZ).putAll(r6h.LIZJ);
        C38816FLg.LJ(new ARunnableS9S0101000_5(4, r6h, 13));
        if (C16880lQ.LLJJIJI(getIntent()) != null && C16880lQ.LLJJIJI(getIntent()).getBoolean("age_gate_block", false)) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (this.LJLZ && this.LJZ) {
            if (!TextUtils.isEmpty(str2)) {
                this.LJLJJI.mBundle.putString("profile_key", str2);
            }
            RC0.LIZJ(null, "login_signup_3p_result", this.LJLL, this.LJLLI, this.LJLJJLL, false);
            this.LJZI.post(new ARunnableS17S0110000_11((Object) this, z2, 4));
            return;
        }
        if (this.LJLJL) {
            if (!this.LJZ) {
                C68972R5c.LJFF(false, i, this.LJLJJLL, this, null);
                if (i > 0 && !QQD.LIZ.contains(Integer.valueOf(i)) && !QQD.LIZIZ.contains(Integer.valueOf(i))) {
                    if (i == 1450) {
                        o.LJIIIZ(response, "response");
                        C79156V4u.LJLJI = new WeakReference(this);
                        String optString = response.LJII.optJSONObject("data").optString("webapp_url");
                        if (TextUtils.isEmpty(optString)) {
                            C26045AKb c26045AKb = new C26045AKb(this);
                            c26045AKb.LJIIIIZZ(R.string.g5w);
                            c26045AKb.LJIIJ();
                        }
                        SmartRouter.buildRoute(this, optString).open();
                        this.LLF = true;
                        return;
                    }
                    if (i == 2100) {
                        if (!R72.LIZ(null, this, C16880lQ.LLJJIJI(getIntent()))) {
                            C26045AKb c26045AKb2 = new C26045AKb(this);
                            c26045AKb2.LJIIIZ(str);
                            c26045AKb2.LJIIJ();
                            return;
                        }
                        return;
                    }
                    if (i != 1381) {
                        if (i != 2135) {
                            if (TextUtils.isEmpty(str)) {
                                str4 = getString(R.string.hx5);
                            } else {
                                str4 = str;
                            }
                            C5S1 c5s1 = new C5S1(getBaseContext());
                            c5s1.LIZLLL(str4);
                            c5s1.LJ();
                        }
                    } else {
                        if (response.LJII != null) {
                            R6E r6e = new R6E(response.LJII.optJSONObject("data"));
                            if (r6e.LIZJ) {
                                if (o.LJ(r6e.LIZIZ, "mobile")) {
                                    enumC69113RAn = EnumC69113RAn.PHONE_SMS_CHANGE_PASSWORD;
                                } else {
                                    enumC69113RAn = EnumC69113RAn.EMAIL_SMS_CHANGE_PASSWORD;
                                }
                                CommonFlowActivity.Companion.LIZIZ(this, enumC69113RAn, EnumC69116RAq.CHANGE_PASSWORD, r6e.LIZ(), new IDeS356S0100000_11(this, 2), null, Boolean.TRUE);
                            }
                        }
                        C5S1 c5s12 = new C5S1(getBaseContext());
                        c5s12.LIZJ(R.string.g5w);
                        c5s12.LJ();
                    }
                }
            }
            String platform = this.LJLJJLL;
            String LJFF = i0.LJFF("passport error:", str);
            o.LJIIIZ(platform, "platform");
            Q13.LIZIZ("monitor_login_thirdparty", 1, C68987R5r.LIZIZ(i, LJFF, platform));
            V16.LJJJJZI(i, str, this.LJLJJLL);
            LLIIIILZ();
            return;
        }
        if (this.LJLJLJ) {
            Intent intent = new Intent();
            intent.putExtra("error_code", i);
            intent.putExtra("description", str);
            intent.putExtra("platform", this.LJLJJLL);
            LLIIIJ(0, intent);
        }
    }

    @Override // X.InterfaceC85767XlL
    public final void LJJZ(Throwable th, boolean z, Boolean bool, boolean z2) {
        runOnUiThread(new ARunnableS14S0210000_15(this, th, z, z2, 2));
    }
}

package com.bytedance.lobby.instagram;

import X.C03880Dg;
import X.C16880lQ;
import X.C29S;
import X.C39099FWd;
import X.C39519Ff9;
import X.C64626PXy;
import X.C64627PXz;
import X.C65300Pk0;
import X.C65803Ps7;
import X.FCD;
import X.FKM;
import X.FXL;
import X.OC9;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.webkit.CookieManager;
import android.webkit.WebSettings;
import android.webkit.WebView;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.zhiliaoapp.musically.R;
import java.util.UUID;

/* loaded from: classes11.dex */
public class InstagramAuthActivity extends C29S {
    public static String LJLJI;
    public static String LJLJJI;
    public static String LJLJJL;
    public static String LJLJJLL;
    public static String LJLJL;
    public WebView LJLIL;
    public String LJLILLLLZI = "";

    public static String LLFII(CookieManager cookieManager, String str) {
        C39519Ff9 LIZJ = new C03880Dg(2).LIZJ(103100, "android/webkit/CookieManager", "getCookie", cookieManager, new Object[]{str}, "java.lang.String", new C65300Pk0(false, "(Ljava/lang/String;)Ljava/lang/String;", "5310470131258852545"));
        return LIZJ.LIZ ? (String) LIZJ.LIZIZ : cookieManager.getCookie(str);
    }

    @Override // X.C29S, X.ActivityC45651qj, android.app.Activity
    public final void onDestroy() {
        C65803Ps7.LIZIZ(this);
        super.onDestroy();
    }

    @Override // X.ActivityC45651qj, android.app.Activity
    public final void onPause() {
        C65803Ps7.LIZJ(this);
        super.onPause();
    }

    @Override // X.ActivityC45651qj, android.app.Activity
    public final void onResume() {
        C65803Ps7.LIZLLL(this);
        super.onResume();
    }

    @Override // X.C29S, X.ActivityC45651qj, android.app.Activity
    public final void onStart() {
        C65803Ps7.LJ(this);
        super.onStart();
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public final void onBackPressed() {
        Intent intent = new Intent();
        intent.putExtra("ig_result_error_info", "Login flow cancelled by pressing back");
        intent.putExtra("error_stage", "goto_URL_and_auth");
        setResult(-1, intent);
        super.onBackPressed();
    }

    @Override // X.C29S, X.ActivityC45651qj, android.app.Activity
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

    @Override // X.ActivityC45651qj, androidx.activity.ComponentActivity, X.C1AU, android.app.Activity
    public final void onCreate(Bundle bundle) {
        String LLFII;
        C65803Ps7.LIZ(this, bundle);
        super.onCreate(bundle);
        setContentView(R.layout.eg);
        this.LJLIL = (WebView) findViewById(R.id.epg);
        Intent intent = getIntent();
        if (intent != null) {
            LJLJJL = C16880lQ.LLJJIJIIJIL(intent, "client_id");
            LJLJI = C16880lQ.LLJJIJIIJIL(intent, "login_auth_url");
            LJLJJI = C16880lQ.LLJJIJIIJIL(intent, "redirect_url");
            LJLJJLL = C16880lQ.LLJJIJIIJIL(intent, "response_type");
            LJLJL = C16880lQ.LLJJIJIIJIL(intent, "scope");
        }
        try {
            WebSettings settings = this.LJLIL.getSettings();
            settings.setJavaScriptEnabled(true);
            settings.setLoadsImagesAutomatically(true);
            settings.setDefaultTextEncodingName("utf-8");
            settings.setDomStorageEnabled(true);
        } catch (Exception unused) {
        }
        C16880lQ.LLZLI(this.LJLIL, new OC9(this));
        CookieManager cookieManager = CookieManager.getInstance();
        if (!TextUtils.isEmpty(LLFII(cookieManager, "https://.instagram.com"))) {
            cookieManager.setCookie("https://.instagram.com", "sessionid=");
            if (FCD.LJI(FKM.LIZ()) && FXL.LIZIZ() && (LLFII = LLFII(CookieManager.getInstance(), C39099FWd.LIZIZ())) != null && !TextUtils.equals(LLFII, C39099FWd.LIZ())) {
                C39099FWd.LIZJ(C39099FWd.LIZIZ(), LLFII);
            }
        }
        this.LJLILLLLZI = UUID.randomUUID().toString();
        C64626PXy LJIIJJI = C64626PXy.LJIIJJI(LJLJI);
        if (LJIIJJI != null) {
            C64627PXz LJIIJ = LJIIJJI.LJIIJ();
            LJIIJ.LIZIZ("client_id", LJLJJL);
            LJIIJ.LIZIZ("redirect_uri", LJLJJI);
            LJIIJ.LIZIZ("response_type", LJLJJLL);
            LJIIJ.LIZIZ("state", this.LJLILLLLZI);
            LJIIJ.LIZIZ("scope", LJLJL);
            C16880lQ.LLZZ(this.LJLIL, LJIIJ.LIZJ().LJIIIIZZ);
        }
    }
}

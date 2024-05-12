package com.apple.android.sdk.authentication;

import X.C16880lQ;
import X.C29S;
import X.C39386Fd0;
import X.C39647FhD;
import X.C65803Ps7;
import X.EnumC93680aUm;
import X.ViewOnClickListenerC93684aUq;
import X.ViewOnClickListenerC93685aUr;
import X.X1D;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.text.Html;
import android.text.TextUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;

/* loaded from: classes34.dex */
public class StartAuthenticationActivity extends C29S {
    public static final /* synthetic */ int LJLJJL = 0;
    public String LJLIL;
    public String LJLILLLLZI;
    public HashMap LJLJI;
    public Button LJLJJI;

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

    static {
        C16880lQ.LJLLJ(StartAuthenticationActivity.class);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public final void onBackPressed() {
        Intent intent = new Intent();
        intent.putExtra("music_user_token_error", EnumC93680aUm.USER_CANCELLED.getErrorCode());
        setResult(0, intent);
        super.onBackPressed();
    }

    @Override // X.C29S, X.ActivityC45651qj, android.app.Activity
    public final void onStart() {
        C65803Ps7.LJ(this);
        super.onStart();
        try {
            if (C16880lQ.LLLLLLZ(getPackageManager(), "com.apple.android.music", 0).versionCode >= 680) {
                findViewById(R.id.nlg).setVisibility(8);
                this.LJLJJI.setText(R.string.ce7);
            } else {
                this.LJLJJI.setText(R.string.tz1);
            }
        } catch (PackageManager.NameNotFoundException e) {
            C16880lQ.LLLLIIL(e);
            this.LJLJJI.setText(R.string.tz0);
        }
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

    @Override // X.C29S, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public final void attachBaseContext(Context context) {
        Context LIZ = C39386Fd0.LIZ(context);
        C39647FhD.LJ(LIZ);
        super.attachBaseContext(LIZ);
    }

    @Override // X.ActivityC45651qj, androidx.activity.ComponentActivity, X.C1AU, android.app.Activity
    public final void onCreate(Bundle bundle) {
        String str;
        int i;
        C65803Ps7.LIZ(this, bundle);
        super.onCreate(bundle);
        setContentView(R.layout.duj);
        Uri data = getIntent().getData();
        if (data != null) {
            Intent intent = new Intent();
            intent.putExtra("music_user_token", UriProtector.getQueryParameter(data, "usertoken"));
            setResult(-1, intent);
            finish();
            return;
        }
        Bundle LLJJIJI = C16880lQ.LLJJIJI(getIntent());
        Drawable drawable = null;
        if (LLJJIJI != null) {
            this.LJLIL = LLJJIJI.getString("developer_token");
            str = LLJJIJI.getString("custom_prompt_text");
            this.LJLILLLLZI = LLJJIJI.getString("contextual_upsell_id");
            if (LLJJIJI.containsKey("custom_params")) {
                this.LJLJI = (HashMap) LLJJIJI.getSerializable("custom_params");
            }
        } else {
            str = null;
        }
        TextView textView = (TextView) findViewById(R.id.nlf);
        if (TextUtils.isEmpty(str)) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("<b><font color='black'>");
            LIZ.append(getPackageManager().getApplicationLabel(getApplicationInfo()).toString());
            LIZ.append("</font></b>");
            textView.setText(Html.fromHtml(getString(R.string.tyy, X1D.LIZIZ(LIZ))));
        } else {
            textView.setText(Html.fromHtml(str));
        }
        PackageManager packageManager = getPackageManager();
        try {
            ApplicationInfo LLLLLLLLL = C16880lQ.LLLLLLLLL(getPackageManager(), getPackageName(), 128);
            Resources resourcesForApplication = packageManager.getResourcesForApplication(LLLLLLLLL);
            if (resourcesForApplication != null && (i = LLLLLLLLL.icon) != 0) {
                drawable = resourcesForApplication.getDrawableForDensity(i, getResources().getDisplayMetrics().densityDpi);
            }
        } catch (Exception unused) {
        }
        ((ImageView) findViewById(R.id.nll)).setImageDrawable(drawable);
        Button button = (Button) findViewById(R.id.nlw);
        this.LJLJJI = button;
        C16880lQ.LJIILIIL(button, new ViewOnClickListenerC93684aUq(this));
        C16880lQ.LJIIJ(new ViewOnClickListenerC93685aUr(this), findViewById(R.id.bfj));
    }

    @Override // X.ActivityC45651qj, androidx.activity.ComponentActivity, android.app.Activity
    public final void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        Uri data = intent.getData();
        Intent intent2 = new Intent();
        intent2.putExtra("music_user_token", UriProtector.getQueryParameter(data, "usertoken"));
        setResult(-1, intent2);
        finish();
    }

    @Override // X.ActivityC45651qj, androidx.activity.ComponentActivity, android.app.Activity
    public final void onActivityResult(int i, int i2, Intent intent) {
        if (i == 2021) {
            if (i2 == -1 && intent != null) {
                C16880lQ.LLJJIJIIJIL(intent, "music_user_token");
            }
            setResult(i2, intent);
            if (intent != null) {
                finish();
            }
        }
        super.onActivityResult(i, i2, intent);
    }
}

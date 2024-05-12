package com.apple.android.sdk.authentication;

import X.C16880lQ;
import X.C29S;
import X.C39386Fd0;
import X.C39647FhD;
import X.C65803Ps7;
import X.C93682aUo;
import X.X1D;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes34.dex */
public class SDKUriHandlerActivity extends C29S {
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

    static {
        C16880lQ.LJLLJ(SDKUriHandlerActivity.class);
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

    public final void LLFII(Uri uri) {
        if (uri.getScheme().equals("musicsdk") && uri.getPath().equals("/authenticateresult")) {
            if (UriProtector.getQueryParameter(uri, "usertoken") != null) {
                Intent intent = new Intent();
                intent.putExtra("music_user_token", UriProtector.getQueryParameter(uri, "usertoken"));
                setResult(-1, intent);
            } else {
                setResult(0);
            }
            finish();
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
        HashMap hashMap;
        C65803Ps7.LIZ(this, bundle);
        super.onCreate(bundle);
        Intent intent = getIntent();
        if (intent.getData() != null) {
            LLFII(intent.getData());
            return;
        }
        if (C16880lQ.LLJJIJIIJIL(intent, "developer_token") == null) {
            return;
        }
        String LLJJIJIIJIL = C16880lQ.LLJJIJIIJIL(intent, "developer_token");
        String LLJJIJIIJIL2 = C16880lQ.LLJJIJIIJIL(intent, "contextual_upsell_id");
        if (intent.hasExtra("custom_params")) {
            hashMap = (HashMap) intent.getSerializableExtra("custom_params");
        } else {
            hashMap = null;
        }
        String packageName = getPackageName();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("appPackage=");
        LIZ.append(packageName);
        LIZ.append("&devToken=");
        LIZ.append(LLJJIJIIJIL);
        String LIZIZ = X1D.LIZIZ(LIZ);
        if (!TextUtils.isEmpty(LLJJIJIIJIL2)) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append(LIZIZ);
            LIZ2.append("&contextualId=");
            LIZ2.append(LLJJIJIIJIL2);
            LIZIZ = X1D.LIZIZ(LIZ2);
        }
        if (hashMap != null && !hashMap.isEmpty()) {
            String str = "";
            for (Map.Entry entry : hashMap.entrySet()) {
                str = str.concat("&").concat((String) entry.getKey()).concat("=").concat((String) entry.getValue());
            }
            LIZIZ = LIZIZ.concat(str);
        }
        StringBuilder LIZ3 = X1D.LIZ();
        LIZ3.append("musicsdk://applemusic/authenticate-v1?");
        LIZ3.append(LIZIZ);
        String LIZIZ2 = X1D.LIZIZ(LIZ3);
        try {
            Intent intent2 = new Intent("android.intent.action.VIEW");
            intent2.setData(UriProtector.parse(LIZIZ2));
            try {
            } catch (PackageManager.NameNotFoundException e) {
                C16880lQ.LLLLIIL(e);
            }
            if (C16880lQ.LLLLLLZ(getPackageManager(), "com.apple.android.music", 0).versionCode >= 680) {
                C16880lQ.LJFF(this, 2022, intent2);
            } else {
                C93682aUo.LIZ(this, LIZIZ2);
            }
        } catch (ActivityNotFoundException unused) {
        }
    }

    @Override // X.ActivityC45651qj, androidx.activity.ComponentActivity, android.app.Activity
    public final void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        if (intent.getData() != null) {
            LLFII(intent.getData());
        }
    }

    @Override // X.ActivityC45651qj, androidx.activity.ComponentActivity, android.app.Activity
    public final void onActivityResult(int i, int i2, Intent intent) {
        if (i == 2022) {
            if (i2 == -1 && intent != null) {
                C16880lQ.LLJJIJIIJIL(intent, "music_user_token");
            }
            setResult(i2, intent);
            finish();
        } else if (i == 2024) {
            finish();
        }
        super.onActivityResult(i, i2, intent);
    }
}

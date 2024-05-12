package com.ss.android.ugc.aweme.ecommerce.singpass;

import X.AbstractActivityC27434Api;
import X.C16880lQ;
import X.C65803Ps7;
import X.C78598Ut0;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import com.bytedance.apm.agent.v2.instrumentation.ActivityAgent;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import net.openid.appauth.AuthorizationManagementActivity;

/* loaded from: classes5.dex */
public final class RedirectUriReceiverActivity extends AbstractActivityC27434Api {
    public final Map<Integer, View> LJLJJI = new LinkedHashMap();

    @Override // X.AbstractActivityC27434Api, X.ActivityC86117Xqz, X.KMV
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJLJJI).clear();
    }

    @Override // X.AbstractActivityC27434Api, X.ActivityC86117Xqz, X.KMV
    public final View _$_findCachedViewById(int i) {
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLJJI;
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

    @Override // X.AbstractActivityC27434Api, X.ActivityC86117Xqz, X.C29S, X.ActivityC45651qj, android.app.Activity
    public final void onDestroy() {
        C65803Ps7.LIZIZ(this);
        super.onDestroy();
    }

    @Override // X.ActivityC86117Xqz, X.ActivityC45651qj, android.app.Activity
    public final void onPause() {
        C65803Ps7.LIZJ(this);
        super.onPause();
    }

    @Override // X.AbstractActivityC27434Api, X.ActivityC86117Xqz, X.ActivityC45651qj, android.app.Activity
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
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.ecommerce.singpass.RedirectUriReceiverActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
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

    @Override // X.AbstractActivityC27434Api, X.ActivityC86117Xqz, X.KMV, X.ActivityC45651qj, androidx.activity.ComponentActivity, X.C1AU, android.app.Activity
    public final void onCreate(Bundle bundle) {
        String str;
        Set<String> keySet;
        String string;
        C65803Ps7.LIZ(this, bundle);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.ecommerce.singpass.RedirectUriReceiverActivity", "onCreate", true);
        super.onCreate(bundle);
        try {
            Uri.Builder builder = new Uri.Builder();
            Uri data = getIntent().getData();
            String str2 = null;
            if (data != null) {
                str = data.getScheme();
            } else {
                str = null;
            }
            Uri.Builder scheme = builder.scheme(str);
            Uri data2 = getIntent().getData();
            if (data2 != null) {
                str2 = data2.getAuthority();
            }
            Uri.Builder authority = scheme.authority(str2);
            Bundle LLJJIJI = C16880lQ.LLJJIJI(getIntent());
            if (LLJJIJI != null && (keySet = LLJJIJI.keySet()) != null) {
                for (String str3 : keySet) {
                    Bundle LLJJIJI2 = C16880lQ.LLJJIJI(getIntent());
                    if (LLJJIJI2 != null && (string = LLJJIJI2.getString(str3)) != null) {
                        authority.appendQueryParameter(str3, string);
                    }
                }
            }
            Uri build = authority.build();
            Intent intent = new Intent(this, (Class<?>) AuthorizationManagementActivity.class);
            intent.setData(build);
            intent.addFlags(603979776);
            C78598Ut0.LJIJJ(intent, this);
            startActivity(intent);
        } finally {
            try {
            } finally {
            }
        }
    }
}

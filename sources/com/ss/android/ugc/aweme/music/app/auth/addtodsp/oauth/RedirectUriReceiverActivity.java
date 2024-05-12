package com.ss.android.ugc.aweme.music.app.auth.addtodsp.oauth;

import X.ActivityC86117Xqz;
import X.C16880lQ;
import X.C65803Ps7;
import X.C78598Ut0;
import X.C78685UuP;
import X.OQY;
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

/* loaded from: classes34.dex */
public final class RedirectUriReceiverActivity extends ActivityC86117Xqz {
    public final Map<Integer, View> LJLIL = new LinkedHashMap();

    @Override // X.ActivityC86117Xqz, X.KMV
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJLIL).clear();
    }

    @Override // X.ActivityC86117Xqz, X.KMV
    public final View _$_findCachedViewById(int i) {
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLIL;
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

    @Override // X.ActivityC86117Xqz, X.C29S, X.ActivityC45651qj, android.app.Activity
    public final void onDestroy() {
        C65803Ps7.LIZIZ(this);
        super.onDestroy();
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
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.music.app.auth.addtodsp.oauth.RedirectUriReceiverActivity", "onWindowFocusChanged", true);
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

    @Override // X.ActivityC86117Xqz, X.KMV, X.ActivityC45651qj, androidx.activity.ComponentActivity, X.C1AU, android.app.Activity
    public final void onCreate(Bundle bundle) {
        Set<String> set;
        C65803Ps7.LIZ(this, bundle);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.music.app.auth.addtodsp.oauth.RedirectUriReceiverActivity", "onCreate", true);
        super.onCreate(bundle);
        Uri data = getIntent().getData();
        if (data != null) {
            Uri.Builder buildUpon = data.buildUpon();
            Bundle LLJJIJI = C16880lQ.LLJJIJI(getIntent());
            if (LLJJIJI == null || (set = LLJJIJI.keySet()) == null) {
                set = OQY.INSTANCE;
            }
            for (String str : set) {
                Bundle LLJJIJI2 = C16880lQ.LLJJIJI(getIntent());
                if (LLJJIJI2 != null) {
                    LLJJIJI2.keySet();
                }
                String LLJJIJIIJIL = C16880lQ.LLJJIJIIJIL(getIntent(), str);
                if (C78685UuP.LJJJZ(LLJJIJIIJIL)) {
                    buildUpon.appendQueryParameter(str, LLJJIJIIJIL);
                }
            }
            data = buildUpon.build();
        }
        Intent intent = new Intent(this, (Class<?>) AuthorizationManagementActivity.class);
        intent.setData(data);
        intent.addFlags(603979776);
        C78598Ut0.LJIJJ(intent, this);
        startActivity(intent);
        finish();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.music.app.auth.addtodsp.oauth.RedirectUriReceiverActivity", "onCreate", false);
    }
}

package net.openid.appauth;

import X.C16880lQ;
import X.C65803Ps7;
import X.C66544Q9s;
import X.Q6T;
import android.app.Activity;
import android.app.PendingIntent;
import android.content.Intent;
import android.os.Bundle;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public class AuthorizationManagementActivity extends Activity {
    public static final /* synthetic */ int LJLJJLL = 0;
    public boolean LJLIL;
    public Intent LJLILLLLZI;
    public C66544Q9s LJLJI;
    public PendingIntent LJLJJI;
    public PendingIntent LJLJJL;

    @Override // android.app.Activity
    public final void onDestroy() {
        C65803Ps7.LIZIZ(this);
        super.onDestroy();
    }

    @Override // android.app.Activity
    public final void onPause() {
        C65803Ps7.LIZJ(this);
        super.onPause();
    }

    @Override // android.app.Activity
    public final void onStart() {
        C65803Ps7.LJ(this);
        super.onStart();
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x01a3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZIZ() {
        /*
            Method dump skipped, instructions count: 490
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: net.openid.appauth.AuthorizationManagementActivity.LIZIZ():void");
    }

    @Override // android.app.Activity
    public final void onResume() {
        C65803Ps7.LIZLLL(this);
        if (this.LJLILLLLZI != null) {
            LIZIZ();
            return;
        }
        try {
            LIZIZ();
        } catch (NullPointerException unused) {
            finish();
        }
    }

    @Override // android.app.Activity
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

    public final void LIZ(Bundle bundle) {
        if (bundle == null) {
            Q6T.LIZLLL("No stored state - unable to handle response", new Object[0]);
            finish();
            return;
        }
        this.LJLILLLLZI = (Intent) bundle.getParcelable("authIntent");
        this.LJLIL = bundle.getBoolean("authStarted", false);
        try {
            C66544Q9s c66544Q9s = null;
            String string = bundle.getString("authRequest", null);
            if (string != null) {
                c66544Q9s = C66544Q9s.LIZ(new JSONObject(string));
            }
            this.LJLJI = c66544Q9s;
            this.LJLJJI = (PendingIntent) bundle.getParcelable("completeIntent");
            this.LJLJJL = (PendingIntent) bundle.getParcelable("cancelIntent");
        } catch (JSONException e) {
            throw new IllegalStateException("Unable to deserialize authorization request", e);
        }
    }

    @Override // android.app.Activity
    public final void onCreate(Bundle bundle) {
        C65803Ps7.LIZ(this, bundle);
        super.onCreate(bundle);
        if (bundle == null) {
            LIZ(C16880lQ.LLJJIJI(getIntent()));
        } else {
            LIZ(bundle);
        }
    }

    @Override // android.app.Activity
    public final void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        setIntent(intent);
    }

    @Override // android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("authStarted", this.LJLIL);
        bundle.putParcelable("authIntent", this.LJLILLLLZI);
        bundle.putString("authRequest", this.LJLJI.LIZIZ().toString());
        bundle.putParcelable("completeIntent", this.LJLJJI);
        bundle.putParcelable("cancelIntent", this.LJLJJL);
    }
}

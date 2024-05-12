package com.linecorp.linesdk.auth.internal;

import X.C16880lQ;
import X.C65803Ps7;
import X.EnumC65312PkC;
import X.OHQ;
import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.linecorp.linesdk.LineApiError;
import com.linecorp.linesdk.auth.LineAuthenticationConfig;
import com.linecorp.linesdk.auth.LineLoginResult;
import com.linecorp.linesdk.auth.internal.a;
import com.linecorp.linesdk.auth.internal.c;
import com.zhiliaoapp.musically.R;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public class LineAuthenticationActivity extends Activity {
    public static final /* synthetic */ int LJLJJI = 0;
    public boolean LJLIL;
    public d LJLILLLLZI;
    public c LJLJI;

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

    @Override // android.app.Activity
    public final void onResume() {
        C65803Ps7.LIZLLL(this);
        super.onResume();
        int i = this.LJLILLLLZI.LJLJJI;
        if (i == 1) {
            c cVar = this.LJLJI;
            cVar.LJII.LJLJJI = 2;
            new c.AsyncTaskC0025c().execute1(new Void[0]);
        } else if (i != 3) {
            new Handler(C16880lQ.LLJJJJ()).postDelayed(new c.b(), 1000L);
        }
        this.LJLIL = false;
    }

    @Override // android.app.Activity
    public final void onStop() {
        C65803Ps7.LJFF(this);
        super.onStop();
        this.LJLIL = true;
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

    public final void LIZ(LineLoginResult lineLoginResult) {
        d dVar = this.LJLILLLLZI;
        if (dVar == null) {
            finish();
            return;
        }
        int i = dVar.LJLJJI;
        if (i == 2) {
            if (this.LJLIL) {
                return;
            }
        } else if (i != 4) {
            return;
        }
        Intent intent = new Intent();
        intent.putExtra("authentication_result", lineLoginResult);
        setResult(-1, intent);
        finish();
    }

    @Override // android.app.Activity
    public final void onCreate(Bundle bundle) {
        d dVar;
        C65803Ps7.LIZ(this, bundle);
        super.onCreate(bundle);
        setContentView(R.layout.bop);
        Intent intent = getIntent();
        LineAuthenticationConfig lineAuthenticationConfig = (LineAuthenticationConfig) intent.getParcelableExtra("authentication_config");
        if (lineAuthenticationConfig == null) {
            LIZ(new LineLoginResult(EnumC65312PkC.INTERNAL_ERROR, null, null, new LineApiError(-1, "The requested parameter is illegal.")));
            return;
        }
        if (bundle == null) {
            dVar = new d();
        } else {
            dVar = (d) bundle.getParcelable("authenticationStatus");
            if (dVar == null) {
                dVar = new d();
            }
        }
        this.LJLILLLLZI = dVar;
        this.LJLJI = new c(this, lineAuthenticationConfig, dVar, intent.getStringArrayExtra(OHQ.LIZIZ));
    }

    @Override // android.app.Activity
    public final void onNewIntent(Intent intent) {
        a.c cVar;
        EnumC65312PkC enumC65312PkC;
        LineApiError lineApiError;
        super.onNewIntent(intent);
        if (this.LJLILLLLZI.LJLJJI == 2) {
            c cVar2 = this.LJLJI;
            cVar2.LJII.LJLJJI = 3;
            a aVar = cVar2.LJ;
            Uri data = intent.getData();
            if (data == null) {
                cVar = new a.c(null, null, null, "Illegal redirection from external application.");
            } else {
                String str = aVar.LIZ.LJLJI;
                String queryParameter = UriProtector.getQueryParameter(data, "state");
                if (str == null || !str.equals(queryParameter)) {
                    cVar = new a.c(null, null, null, "Illegal parameter value of 'state'.");
                } else {
                    String queryParameter2 = UriProtector.getQueryParameter(data, "code");
                    if (!TextUtils.isEmpty(queryParameter2)) {
                        cVar = new a.c(queryParameter2, null, null, null);
                    } else {
                        cVar = new a.c(null, UriProtector.getQueryParameter(data, "error"), UriProtector.getQueryParameter(data, "error_description"), null);
                    }
                }
            }
            boolean z = true;
            if (!(!TextUtils.isEmpty(cVar.LIZ))) {
                cVar2.LJII.LJLJJI = 4;
                LineAuthenticationActivity lineAuthenticationActivity = cVar2.LIZ;
                if (TextUtils.isEmpty(cVar.LIZLLL) && !(!TextUtils.isEmpty(cVar.LIZ))) {
                    enumC65312PkC = EnumC65312PkC.AUTHENTICATION_AGENT_ERROR;
                } else {
                    enumC65312PkC = EnumC65312PkC.INTERNAL_ERROR;
                }
                if (!TextUtils.isEmpty(cVar.LIZLLL) || (!TextUtils.isEmpty(cVar.LIZ))) {
                    z = false;
                }
                if (z) {
                    try {
                        lineApiError = new LineApiError(-1, new JSONObject().putOpt("error", cVar.LIZIZ).putOpt("error_description", cVar.LIZJ).toString());
                    } catch (JSONException e) {
                        lineApiError = new LineApiError(e);
                    }
                } else {
                    lineApiError = new LineApiError(-1, cVar.LIZLLL);
                }
                lineAuthenticationActivity.LIZ(new LineLoginResult(enumC65312PkC, null, null, lineApiError));
                return;
            }
            c.a aVar2 = new c.a();
            String[] strArr = new String[1];
            if (!TextUtils.isEmpty(cVar.LIZ)) {
                strArr[0] = cVar.LIZ;
                aVar2.execute1(strArr);
                return;
            }
            throw new UnsupportedOperationException("requestToken is null. Please check result by isSuccess before.");
        }
    }

    @Override // android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putParcelable("authenticationStatus", this.LJLILLLLZI);
    }

    @Override // android.app.Activity
    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (this.LJLILLLLZI.LJLJJI == 2) {
            c cVar = this.LJLJI;
            if (i != 3 || cVar.LJII.LJLJJI == 3) {
                return;
            }
            new Handler(C16880lQ.LLJJJJ()).postDelayed(new c.b(), 1000L);
        }
    }
}

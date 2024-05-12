package com.spotify.sdk.android.auth;

import X.C16880lQ;
import X.C39386Fd0;
import X.C39647FhD;
import X.C65803Ps7;
import X.C93551aSh;
import X.C93553aSj;
import X.C94128ac0;
import X.EnumC93552aSi;
import X.InterfaceC93555aSl;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.BaseBundle;
import android.os.Bundle;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes34.dex */
public class LoginActivity extends Activity {
    public static final /* synthetic */ int LJLILLLLZI = 0;
    public final C93553aSj LJLIL = new C93553aSj(this);

    @Override // android.app.Activity
    public final void onPause() {
        C65803Ps7.LIZJ(this);
        super.onPause();
    }

    @Override // android.app.Activity
    public final void onResume() {
        C65803Ps7.LIZLLL(this);
        super.onResume();
    }

    @Override // android.app.Activity
    public final void onStart() {
        C65803Ps7.LJ(this);
        super.onStart();
    }

    @Override // android.app.Activity
    public final void onDestroy() {
        C65803Ps7.LIZIZ(this);
        C93553aSj c93553aSj = this.LJLIL;
        if (c93553aSj.LIZIZ) {
            c93553aSj.LIZIZ = false;
            InterfaceC93555aSl interfaceC93555aSl = c93553aSj.LIZJ;
            if (interfaceC93555aSl != null) {
                interfaceC93555aSl.LIZ(null);
                interfaceC93555aSl.stop();
            }
            LoginActivity loginActivity = c93553aSj.LJ;
            if (loginActivity != null) {
                loginActivity.setResult(0);
                c93553aSj.LJ = null;
            }
        }
        this.LJLIL.LJ = null;
        super.onDestroy();
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

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public final void attachBaseContext(Context context) {
        Context LIZ = C39386Fd0.LIZ(context);
        C39647FhD.LJ(LIZ);
        super.attachBaseContext(LIZ);
    }

    @Override // android.app.Activity
    public final void onCreate(Bundle bundle) {
        AuthorizationRequest authorizationRequest;
        C65803Ps7.LIZ(this, bundle);
        super.onCreate(bundle);
        setContentView(R.layout.dw3);
        Bundle LJJLIIIIJ = C16880lQ.LJJLIIIIJ(getIntent(), "EXTRA_AUTH_REQUEST");
        if (LJJLIIIIJ == null) {
            authorizationRequest = null;
        } else {
            authorizationRequest = (AuthorizationRequest) LJJLIIIIJ.getParcelable("request");
        }
        this.LJLIL.LJ = this;
        if (getCallingActivity() == null) {
            finish();
            return;
        }
        if (authorizationRequest == null) {
            setResult(0);
            finish();
            return;
        }
        if (bundle != null) {
            return;
        }
        C93553aSj c93553aSj = this.LJLIL;
        if (c93553aSj.LIZIZ) {
            return;
        }
        c93553aSj.LIZIZ = true;
        Iterator it = ((ArrayList) c93553aSj.LIZLLL).iterator();
        while (it.hasNext()) {
            InterfaceC93555aSl interfaceC93555aSl = (InterfaceC93555aSl) it.next();
            interfaceC93555aSl.LIZ(new C94128ac0(c93553aSj, interfaceC93555aSl));
            if (!interfaceC93555aSl.LIZIZ(c93553aSj.LIZ, authorizationRequest)) {
                interfaceC93555aSl.LIZ(null);
                interfaceC93555aSl.stop();
            } else {
                c93553aSj.LIZJ = interfaceC93555aSl;
                return;
            }
        }
    }

    @Override // android.app.Activity
    public final void onNewIntent(Intent intent) {
        AuthorizationResponse LIZ;
        super.onNewIntent(intent);
        Uri data = intent.getData();
        C93553aSj c93553aSj = this.LJLIL;
        C93551aSh c93551aSh = new C93551aSh();
        if (data == null) {
            c93551aSh.LIZ = EnumC93552aSi.EMPTY;
            LIZ = c93551aSh.LIZ();
        } else {
            String queryParameter = UriProtector.getQueryParameter(data, "error");
            if (queryParameter != null) {
                String queryParameter2 = UriProtector.getQueryParameter(data, "state");
                c93551aSh.LJ = queryParameter;
                c93551aSh.LIZLLL = queryParameter2;
                c93551aSh.LIZ = EnumC93552aSi.ERROR;
                LIZ = c93551aSh.LIZ();
            } else {
                String queryParameter3 = UriProtector.getQueryParameter(data, "code");
                if (queryParameter3 != null) {
                    String queryParameter4 = UriProtector.getQueryParameter(data, "state");
                    c93551aSh.LIZIZ = queryParameter3;
                    c93551aSh.LIZLLL = queryParameter4;
                    c93551aSh.LIZ = EnumC93552aSi.CODE;
                    LIZ = c93551aSh.LIZ();
                } else {
                    String encodedFragment = data.getEncodedFragment();
                    if (encodedFragment != null && encodedFragment.length() > 0) {
                        String str = null;
                        String str2 = null;
                        String str3 = null;
                        for (String str4 : encodedFragment.split("&")) {
                            String[] split = str4.split("=");
                            if (split.length == 2) {
                                if (split[0].startsWith("access_token")) {
                                    str = Uri.decode(split[1]);
                                }
                                if (split[0].startsWith("state")) {
                                    str2 = Uri.decode(split[1]);
                                }
                                if (split[0].startsWith("expires_in")) {
                                    str3 = Uri.decode(split[1]);
                                }
                            }
                        }
                        c93551aSh.LIZJ = str;
                        c93551aSh.LIZLLL = str2;
                        if (str3 != null) {
                            try {
                                c93551aSh.LJFF = CastIntegerProtector.parseInt(str3);
                            } catch (NumberFormatException unused) {
                            }
                        }
                        c93551aSh.LIZ = EnumC93552aSi.TOKEN;
                        LIZ = c93551aSh.LIZ();
                    } else {
                        c93551aSh.LIZ = EnumC93552aSi.UNKNOWN;
                        LIZ = c93551aSh.LIZ();
                    }
                }
            }
        }
        c93553aSj.LIZ(c93553aSj.LIZJ, LIZ);
    }

    @Override // android.app.Activity
    public final void onActivityResult(int i, int i2, Intent intent) {
        String LLJJIJIIJIL;
        super.onActivityResult(i, i2, intent);
        if (i == 1138) {
            C93551aSh c93551aSh = new C93551aSh();
            if (i2 == -2) {
                c93551aSh.LIZ = EnumC93552aSi.ERROR;
                if (intent == null) {
                    LLJJIJIIJIL = "Invalid message format";
                } else {
                    LLJJIJIIJIL = C16880lQ.LLJJIJIIJIL(intent, "ERROR");
                    if (LLJJIJIIJIL == null) {
                        LLJJIJIIJIL = "Unknown error";
                    }
                }
                c93551aSh.LJ = LLJJIJIIJIL;
            } else if (i2 == -1) {
                BaseBundle baseBundle = (BaseBundle) intent.getParcelableExtra("REPLY");
                if (baseBundle == null) {
                    c93551aSh.LIZ = EnumC93552aSi.ERROR;
                    c93551aSh.LJ = "Missing response data";
                } else {
                    String string = baseBundle.getString("RESPONSE_TYPE", "unknown");
                    c93551aSh.LIZLLL = baseBundle.getString("STATE", null);
                    string.getClass();
                    if (!string.equals("code")) {
                        if (!string.equals("token")) {
                            c93551aSh.LIZ = EnumC93552aSi.UNKNOWN;
                        } else {
                            String string2 = baseBundle.getString("ACCESS_TOKEN");
                            int i3 = baseBundle.getInt("EXPIRES_IN");
                            c93551aSh.LIZ = EnumC93552aSi.TOKEN;
                            c93551aSh.LIZJ = string2;
                            c93551aSh.LJFF = i3;
                        }
                    } else {
                        String string3 = baseBundle.getString("AUTHORIZATION_CODE");
                        c93551aSh.LIZ = EnumC93552aSi.CODE;
                        c93551aSh.LIZIZ = string3;
                    }
                }
            } else {
                c93551aSh.LIZ = EnumC93552aSi.EMPTY;
            }
            C93553aSj c93553aSj = this.LJLIL;
            c93553aSj.LJ = this;
            c93553aSj.LIZ(c93553aSj.LIZJ, c93551aSh.LIZ());
        }
    }
}

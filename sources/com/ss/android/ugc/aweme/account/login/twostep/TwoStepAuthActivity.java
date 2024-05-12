package com.ss.android.ugc.aweme.account.login.twostep;

import X.AbstractC234519Ih;
import X.ActivityC86117Xqz;
import X.AnonymousClass636;
import X.C10K;
import X.C16880lQ;
import X.C234529Ii;
import X.C235119Kp;
import X.C252709vu;
import X.C41119GBv;
import X.C65803Ps7;
import X.C85809Xm1;
import X.C85810Xm2;
import X.C85811Xm3;
import X.C85812Xm4;
import X.C85813Xm5;
import X.C85814Xm6;
import X.C9KF;
import X.InterfaceC62984Onk;
import X.InterfaceC85818XmA;
import X.RCD;
import X.RCE;
import X.X1D;
import Y.ACallableS118S0100000_15;
import Y.AgS131S0100000_15;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewStub;
import com.bytedance.apm.agent.v2.instrumentation.ActivityAgent;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.zhiliaoapp.musically.R;
import defpackage.s1;
import defpackage.t1;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AqS165S0100000_15;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class TwoStepAuthActivity extends ActivityC86117Xqz implements InterfaceC85818XmA, InterfaceC62984Onk {
    public static final /* synthetic */ int LJLL = 0;
    public ViewStub LJLIL;
    public C85814Xm6 LJLILLLLZI;
    public String LJLJJI;
    public String LJLJJL;
    public String LJLJJLL;
    public boolean LJLJL;
    public C85809Xm1 LJLJLJ;
    public final Map<Integer, View> LJLJLLL = new LinkedHashMap();
    public int LJLJI = -1;

    @Override // X.InterfaceC85818XmA
    public final void LJJLL() {
    }

    @Override // X.ActivityC86117Xqz, X.KMV
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJLJLLL).clear();
    }

    @Override // X.ActivityC86117Xqz, X.KMV
    public final View _$_findCachedViewById(int i) {
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLJLLL;
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

    @Override // X.InterfaceC62984Onk
    public final boolean getCanCollectConsent() {
        return false;
    }

    @Override // X.KMV, androidx.activity.ComponentActivity, android.app.Activity
    public final void onBackPressed() {
        this.LJLJL = true;
        finish();
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
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.account.login.twostep.TwoStepAuthActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    @Override // X.ActivityC86117Xqz, android.app.Activity
    public final void finish() {
        if (this.LJLJL) {
            RCE.LIZ().LIZIZ(new RCD(0, null, null, "User left TwoStepAuthActivity before completing auth process"));
        }
        super.finish();
    }

    @Override // X.ActivityC86117Xqz, X.C29S, X.ActivityC45651qj, android.app.Activity
    public final void onDestroy() {
        C65803Ps7.LIZIZ(this);
        super.onDestroy();
        this.LJLJLJ = null;
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
        C65803Ps7.LIZ(this, bundle);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.account.login.twostep.TwoStepAuthActivity", "onCreate", true);
        activityConfiguration(C41119GBv.LJLIL);
        super.onCreate(bundle);
        setContentView(R.layout.m1);
        C252709vu c252709vu = (C252709vu) _$_findCachedViewById(R.id.mrd);
        C235119Kp c235119Kp = new C235119Kp();
        C234529Ii LIZJ = s1.LIZJ();
        LIZJ.LIZJ = R.raw.icon_chevron_left_ltr;
        LIZJ.LIZIZ(new AqS165S0100000_15(this, 130));
        C9KF LIZLLL = t1.LIZLLL(c235119Kp, new AbstractC234519Ih[]{LIZJ});
        String string = getString(R.string.dro);
        o.LJIIIIZZ(string, "getString(R.string.common_verify_title)");
        LIZLLL.LIZJ = string;
        c235119Kp.LIZJ = LIZLLL;
        c235119Kp.LIZLLL = false;
        c252709vu.setNavActions(c235119Kp);
        ViewStub two_step_auth_content_stub = (ViewStub) _$_findCachedViewById(R.id.mrc);
        o.LJIIIIZZ(two_step_auth_content_stub, "two_step_auth_content_stub");
        this.LJLIL = two_step_auth_content_stub;
        this.LJLJI = getIntent().getIntExtra("auth_type", -1);
        this.LJLJJL = C16880lQ.LLJJIJIIJIL(getIntent(), "auth_data");
        this.LJLJJI = C16880lQ.LLJJIJIIJIL(getIntent(), "url_path");
        if (this.LJLJI == -1) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("Unknown TwoStepAuthType: ");
            LIZ.append(this.LJLJI);
            X1D.LIZIZ(LIZ);
            finish();
        } else if (TextUtils.isEmpty(this.LJLJJL)) {
            finish();
        } else {
            int i = this.LJLJI;
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            if (i == 5) {
                                ViewStub viewStub = this.LJLIL;
                                if (viewStub != null) {
                                    this.LJLILLLLZI = new C85813Xm5(this, viewStub, this);
                                } else {
                                    o.LJIJI("contentStub");
                                    throw null;
                                }
                            }
                        } else {
                            ViewStub viewStub2 = this.LJLIL;
                            if (viewStub2 != null) {
                                this.LJLILLLLZI = new C85811Xm3(this, viewStub2, this);
                            } else {
                                o.LJIJI("contentStub");
                                throw null;
                            }
                        }
                    } else {
                        ViewStub viewStub3 = this.LJLIL;
                        if (viewStub3 != null) {
                            this.LJLILLLLZI = new C85809Xm1(this, viewStub3, this);
                        } else {
                            o.LJIJI("contentStub");
                            throw null;
                        }
                    }
                } else {
                    ViewStub viewStub4 = this.LJLIL;
                    if (viewStub4 != null) {
                        this.LJLILLLLZI = new C85812Xm4(this, viewStub4, this);
                    } else {
                        o.LJIJI("contentStub");
                        throw null;
                    }
                }
            } else {
                ViewStub viewStub5 = this.LJLIL;
                if (viewStub5 != null) {
                    this.LJLILLLLZI = new C85810Xm2(this, viewStub5, this);
                } else {
                    o.LJIJI("contentStub");
                    throw null;
                }
            }
            C10K.LIZJ(new ACallableS118S0100000_15(this, 19)).LJ(new AgS131S0100000_15(this, 28), C10K.LJIIIIZZ, null);
        }
        getWindow().setBackgroundDrawable(new ColorDrawable(AnonymousClass636.LJIIIIZZ(R.attr.cl, this)));
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.account.login.twostep.TwoStepAuthActivity", "onCreate", false);
    }

    @Override // X.InterfaceC85818XmA
    public final void onSuccess(String str) {
        RCE.LIZ().LIZIZ(new RCD(0, str, this.LJLJJLL, null));
        finish();
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0038, code lost:
    
        if (r1 == null) goto L11;
     */
    @Override // X.ActivityC86117Xqz, X.KMV, X.ActivityC45651qj, androidx.activity.ComponentActivity, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onActivityResult(int r15, int r16, android.content.Intent r17) {
        /*
            r14 = this;
            r1 = r16
            r4 = r17
            super.onActivityResult(r15, r1, r4)
            X.Xm1 r2 = r14.LJLJLJ
            if (r2 == 0) goto L67
            r0 = 123(0x7b, float:1.72E-43)
            if (r15 != r0) goto L67
            r12 = 0
            r0 = -1
            r3 = 0
            if (r1 != r0) goto L72
            if (r4 == 0) goto L6d
            java.lang.String r0 = "access_token"
            java.lang.String r5 = X.C16880lQ.LLJJIJIIJIL(r4, r0)
            java.lang.String r0 = "access_token_secret"
            java.lang.String r6 = X.C16880lQ.LLJJIJIIJIL(r4, r0)
            java.lang.String r0 = "code"
            java.lang.String r7 = X.C16880lQ.LLJJIJIIJIL(r4, r0)
            java.lang.String r0 = "expires_in"
            int r0 = r4.getIntExtra(r0, r3)
            java.lang.Integer r8 = java.lang.Integer.valueOf(r0)
            java.lang.String r0 = "platform_id"
            java.lang.String r1 = X.C16880lQ.LLJJIJIIJIL(r4, r0)
            if (r1 != 0) goto L3c
        L3a:
            java.lang.String r1 = ""
        L3c:
            com.ss.android.ugc.aweme.account.login.twostep.TwoStepAuthApi r0 = com.ss.android.ugc.aweme.account.login.twostep.TwoStepAuthApi.LIZ
            java.lang.String r10 = r2.LJLJLJ
            java.lang.String r13 = r2.LJLJJL
            r0.getClass()
            com.ss.android.ugc.aweme.account.login.twostep.TwoStepAuthApi$Api r4 = com.ss.android.ugc.aweme.account.login.twostep.TwoStepAuthApi.LIZIZ()
            java.lang.Integer r9 = java.lang.Integer.valueOf(r3)
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 == 0) goto L68
        L53:
            java.lang.Integer r11 = java.lang.Integer.valueOf(r3)
            X.10K r3 = r4.verifyThirdParty(r5, r6, r7, r8, r9, r10, r11, r12, r13)
            Y.AgS131S0100000_15 r1 = new Y.AgS131S0100000_15
            r0 = 18
            r1.<init>(r2, r0)
            X.10C r0 = X.C10K.LJIIIIZZ
            r3.LJ(r1, r0, r12)
        L67:
            return
        L68:
            int r3 = com.bytedance.mt.protector.impl.string2number.CastIntegerProtector.parseInt(r1)     // Catch: java.lang.NumberFormatException -> L53
            goto L53
        L6d:
            r5 = r12
            r6 = r12
            r7 = r12
            r8 = r12
            goto L3a
        L72:
            if (r4 == 0) goto L88
            java.lang.String r0 = "error_code"
            int r0 = r4.getIntExtra(r0, r3)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            java.lang.String r0 = "description"
            java.lang.String r12 = X.C16880lQ.LLJJIJIIJIL(r4, r0)
        L84:
            r2.LIZLLL(r1, r12)
            goto L67
        L88:
            r1 = r12
            goto L84
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.account.login.twostep.TwoStepAuthActivity.onActivityResult(int, int, android.content.Intent):void");
    }
}

package com.bytedance.globalpayment.googlepayapi;

import X.C16880lQ;
import X.C65803Ps7;
import X.C67646Qgk;
import X.C67887Qkd;
import X.C67907Qkx;
import X.C67938QlS;
import X.C67942QlW;
import X.C67959Qln;
import X.EnumC35459Dvr;
import X.R19;
import android.app.Activity;
import android.os.Bundle;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.google.android.gms.common.Feature;
import com.google.android.gms.wallet.PaymentDataRequest;
import kotlin.jvm.internal.o;

/* loaded from: classes12.dex */
public final class PIPOPayActivity extends Activity {
    public boolean LJLIL;

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
    public final void finish() {
        super.finish();
        if (!this.LJLIL) {
            C67959Qln.LIZIZ();
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

    @Override // android.app.Activity
    public final void onCreate(Bundle bundle) {
        String string;
        C65803Ps7.LIZ(this, bundle);
        super.onCreate(bundle);
        String LLJJIJIIJIL = C16880lQ.LLJJIJIIJIL(getIntent(), "requestJSONStr");
        if (bundle == null) {
            string = null;
        } else {
            string = bundle.getString("PIPO_PAY_ACTIVITY_INTENT_CONTENT");
        }
        if (LLJJIJIIJIL == null) {
            LLJJIJIIJIL = string;
        }
        if (LLJJIJIIJIL == null) {
            this.LJLIL = true;
            EnumC35459Dvr enumC35459Dvr = EnumC35459Dvr.LaunchActivityEmptyContent;
            C67959Qln.LIZ(enumC35459Dvr.getValue());
            System.out.println((Object) o.LJIILLIIL(Integer.valueOf(enumC35459Dvr.getValue()), "ooookk "));
            finish();
            return;
        }
        try {
            PaymentDataRequest LJJJJL = PaymentDataRequest.LJJJJL(LLJJIJIIJIL);
            C67907Qkx c67907Qkx = C67959Qln.LIZIZ;
            if (c67907Qkx != null) {
                C67887Qkd c67887Qkd = new C67887Qkd();
                c67887Qkd.LIZ = new C67942QlW(LJJJJL);
                c67887Qkd.LIZJ = new Feature[]{C67938QlS.LIZ};
                c67887Qkd.LIZIZ = true;
                c67887Qkd.LIZLLL = 23707;
                C67646Qgk LIZLLL = c67907Qkx.LIZLLL(1, c67887Qkd.LIZ());
                o.LJIIIIZZ(LIZLLL, "GooglePayAPIProvider.mPa….loadPaymentData(request)");
                R19.LIZ(this, LIZLLL);
                return;
            }
            o.LJIJI("mPaymentsClient");
            throw null;
        } catch (Throwable unused) {
            C67959Qln.LIZ(EnumC35459Dvr.LaunchActivityParseContentError.getValue());
            this.LJLIL = true;
            finish();
        }
    }

    @Override // android.app.Activity
    public final void onSaveInstanceState(Bundle outState) {
        o.LJIIIZ(outState, "outState");
        outState.putString("PIPO_PAY_ACTIVITY_INTENT_CONTENT", C16880lQ.LLJJIJIIJIL(getIntent(), "requestJSONStr"));
        super.onSaveInstanceState(outState);
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0065, code lost:
    
        if (X.C76800UCe.LIZ == null) goto L21;
     */
    @Override // android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onActivityResult(int r6, int r7, android.content.Intent r8) {
        /*
            r5 = this;
            super.onActivityResult(r6, r7, r8)
            r0 = 1001(0x3e9, float:1.403E-42)
            if (r6 != r0) goto L19
            r4 = 0
            r0 = -1
            r3 = 1
            if (r7 == r0) goto L33
            if (r7 == 0) goto L2f
            r1 = 0
            if (r7 == r3) goto L1a
            X.C67959Qln.LIZJ(r1)
        L14:
            r5.LJLIL = r3
            r5.finish()
        L19:
            return
        L1a:
            if (r8 != 0) goto L21
        L1d:
            X.C67959Qln.LIZJ(r1)
            goto L14
        L21:
            java.lang.String r0 = "com.google.android.gms.common.api.AutoResolveHelper.status"
            android.os.Parcelable r0 = r8.getParcelableExtra(r0)
            com.google.android.gms.common.api.Status r0 = (com.google.android.gms.common.api.Status) r0
            if (r0 != 0) goto L2c
            goto L1d
        L2c:
            int r1 = r0.zzc
            goto L1d
        L2f:
            X.C67959Qln.LIZIZ()
            goto L14
        L33:
            if (r8 != 0) goto L39
        L35:
            X.C67959Qln.LIZIZ()
            goto L14
        L39:
            android.os.Parcelable$Creator<com.google.android.gms.wallet.PaymentData> r1 = com.google.android.gms.wallet.PaymentData.CREATOR
            java.lang.String r0 = "com.google.android.gms.wallet.PaymentData"
            byte[] r0 = r8.getByteArrayExtra(r0)
            if (r0 != 0) goto L49
            r2 = r4
        L44:
            com.google.android.gms.wallet.PaymentData r2 = (com.google.android.gms.wallet.PaymentData) r2
            if (r2 != 0) goto L4e
            goto L35
        L49:
            com.google.android.gms.common.internal.safeparcel.SafeParcelable r2 = X.C64476PSe.LIZ(r0, r1)
            goto L44
        L4e:
            X.Qls r1 = new X.Qls
            X.Qlp r0 = X.EnumC67961Qlp.Success
            r1.<init>(r0, r2)
            X.Qlo r0 = X.C67959Qln.LJFF
            if (r0 == 0) goto L6e
            r0.LIZ(r1)
            X.Qm7 r0 = X.C67959Qln.LIZLLL
            if (r0 == 0) goto L68
            r0.LIZ(r1)
            X.UCe r0 = X.C76800UCe.LIZ
            if (r0 != 0) goto L14
            goto L35
        L68:
            java.lang.String r0 = "callback"
            kotlin.jvm.internal.o.LJIJI(r0)
            throw r4
        L6e:
            java.lang.String r0 = "monitor"
            kotlin.jvm.internal.o.LJIJI(r0)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.globalpayment.googlepayapi.PIPOPayActivity.onActivityResult(int, int, android.content.Intent):void");
    }
}

package com.ss.android.ugc.aweme.qrcode.view;

import X.C16880lQ;
import X.C279017q;
import X.C29S;
import X.C61099NyR;
import X.C61184Nzo;
import X.C62905OmT;
import X.C65803Ps7;
import X.FMX;
import X.OHI;
import Y.IDCListenerS162S0100000_10;
import Y.IDDListenerS149S0100000_10;
import Y.IDeS404S0100000_10;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import com.bytedance.apm.agent.v2.instrumentation.ActivityAgent;
import com.bytedance.bpea.cert.token.TokenCert;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;

/* loaded from: classes11.dex */
public class QRCodePermissionActivity extends C29S {
    public static long LJLJJI;
    public static final /* synthetic */ int LJLJJL = 0;
    public boolean LJLIL;
    public int LJLILLLLZI = -1;
    public boolean LJLJI;

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

    @Override // android.app.Activity, android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.qrcode.view.QRCodePermissionActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public final void LLFII() {
        C62905OmT c62905OmT = new C62905OmT(this);
        c62905OmT.LJ(R.string.ehc);
        c62905OmT.LIZ(R.string.ehd);
        c62905OmT.LJIIIIZZ(R.string.cg_, new IDCListenerS162S0100000_10(this, 5), false);
        c62905OmT.LJIIJJI(R.string.dsi, new IDCListenerS162S0100000_10(this, 4), false);
        c62905OmT.LIZLLL = new IDDListenerS149S0100000_10(this, 1);
        C279017q.LIZLLL(c62905OmT);
    }

    public final void LLII() {
        int i = this.LJLILLLLZI;
        if (i == 5) {
            Intent intent = new Intent(this, (Class<?>) ScanQRCodeActivityV2.class);
            intent.putExtra("is_kill_self_after_scan", true);
            intent.putExtra("scan_page_from", i);
            C16880lQ.LIZJ(this, intent);
        } else if (i != -1) {
            boolean z = this.LJLJI;
            Intent intent2 = new Intent(this, (Class<?>) ScanQRCodeActivityV2.class);
            intent2.putExtra("scan_page_from", i);
            intent2.putExtra("camera_only", z);
            C16880lQ.LIZJ(this, intent2);
        } else {
            boolean z2 = this.LJLIL;
            Intent intent3 = new Intent(this, (Class<?>) ScanQRCodeActivityV2.class);
            intent3.putExtra("enter_from", z2);
            C16880lQ.LIZJ(this, intent3);
        }
        finish();
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
        boolean z;
        Object obj;
        Object obj2;
        boolean z2;
        C65803Ps7.LIZ(this, bundle);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.qrcode.view.QRCodePermissionActivity", "onCreate", true);
        super.onCreate(bundle);
        int LIZ = C61184Nzo.LIZ(this);
        OHI.LIZ.getClass();
        boolean LJ = OHI.LJ(this, "android.permission.CAMERA");
        if (LIZ == 0) {
            z = true;
        } else {
            z = false;
        }
        HashMap hashMap = new HashMap();
        String str = "1";
        if (z) {
            obj = "1";
        } else {
            obj = CardStruct.IStatusCode.DEFAULT;
        }
        hashMap.put("origin", obj);
        if (LJ) {
            obj2 = "1";
        } else {
            obj2 = CardStruct.IStatusCode.DEFAULT;
        }
        hashMap.put("new", obj2);
        if (LJ != z) {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        hashMap.put("equal", str);
        FMX.LJIIL("power_permission_grant_track", hashMap);
        if (LIZ == 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.LJLIL = getIntent().getBooleanExtra("enter_from", false);
        this.LJLILLLLZI = getIntent().getIntExtra("page_from", -1);
        this.LJLJI = getIntent().getBooleanExtra("camera_only", false);
        if (!z2) {
            if (Build.VERSION.SDK_INT >= 23) {
                C61099NyR.LIZIZ.LIZIZ(this, TokenCert.with("bpea-qrcode_camera")).LIZ("android.permission.CAMERA").LIZJ(new IDeS404S0100000_10(this, 1));
            } else {
                LLFII();
            }
        } else {
            LLII();
        }
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.qrcode.view.QRCodePermissionActivity", "onCreate", false);
    }

    public static void LLFZ(Context context, boolean z, int i) {
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis - LJLJJI < 1000) {
            return;
        }
        LJLJJI = currentTimeMillis;
        Intent intent = new Intent(context, (Class<?>) QRCodePermissionActivity.class);
        intent.putExtra("finishAfterScan", false);
        intent.putExtra("enter_from", z);
        intent.putExtra("page_from", i);
        C16880lQ.LIZJ(context, intent);
    }
}

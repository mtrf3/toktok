package com.ss.android.ugc.aweme.deeplink;

import X.ActivityC86117Xqz;
import X.C16880lQ;
import X.C38586FCk;
import X.C46254IDi;
import X.C56235M5f;
import X.C65803Ps7;
import X.C78598Ut0;
import X.CU2;
import X.M5X;
import X.M66;
import X.X1D;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.view.View;
import com.bytedance.apm.agent.v2.instrumentation.ActivityAgent;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public class DeepLinkActivityV2 extends ActivityC86117Xqz {
    public Uri LJLIL;
    public M5X LJLILLLLZI;
    public Intent LJLJJI;
    public final Map<Integer, View> LJLJJL = new LinkedHashMap();
    public final CU2 LJLJI = new CU2();

    @Override // X.ActivityC86117Xqz, X.KMV
    public void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJLJJL).clear();
    }

    @Override // X.ActivityC86117Xqz, X.KMV
    public View _$_findCachedViewById(int i) {
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLJJL;
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

    @Override // X.ActivityC86117Xqz, X.ActivityC45651qj, android.app.Activity
    public void onPause() {
        C65803Ps7.LIZJ(this);
        super.onPause();
    }

    @Override // X.ActivityC86117Xqz, X.ActivityC45651qj, android.app.Activity
    public void onResume() {
        C65803Ps7.LIZLLL(this);
        super.onResume();
    }

    @Override // X.ActivityC86117Xqz, X.C29S, X.ActivityC45651qj, android.app.Activity
    public void onStart() {
        C65803Ps7.LJ(this);
        super.onStart();
    }

    @Override // X.ActivityC86117Xqz, X.C29S, X.ActivityC45651qj, android.app.Activity
    public void onStop() {
        C65803Ps7.LJFF(this);
        super.onStop();
    }

    @Override // X.ActivityC86117Xqz, android.app.Activity, android.view.Window.Callback
    public void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.deeplink.DeepLinkActivityV2", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public final M5X LLFII() {
        M5X m5x = this.LJLILLLLZI;
        if (m5x != null) {
            return m5x;
        }
        o.LJIJI("deepLinkData");
        throw null;
    }

    @Override // X.ActivityC86117Xqz, X.C29S, X.ActivityC45651qj, android.app.Activity
    public void onDestroy() {
        C65803Ps7.LIZIZ(this);
        super.onDestroy();
        M66.LIZIZ.LJII();
        Intent intent = this.LJLJJI;
        if (intent != null) {
            C78598Ut0.LJIJJ(intent, this);
            startActivity(intent);
            this.LJLJJI = null;
        }
    }

    @Override // X.ActivityC86117Xqz, X.C29S, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public final void attachBaseContext(Context context) {
        int i;
        long currentTimeMillis = System.currentTimeMillis();
        boolean LIZIZ = C38586FCk.LIZIZ();
        C46254IDi.LIZ = currentTimeMillis;
        if (LIZIZ) {
            i = 2;
        } else {
            i = 1;
        }
        C46254IDi.LIZIZ = i;
        if (!LIZIZ) {
            C46254IDi.LJI = true;
        }
        super.attachBaseContext(context);
    }

    /* JADX WARN: Code restructure failed: missing block: B:171:0x04a2, code lost:
    
        if (r10 != null) goto L177;
     */
    /* JADX WARN: Code restructure failed: missing block: B:175:0x0496, code lost:
    
        if (r14 != null) goto L172;
     */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0357  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x039e  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0313  */
    @Override // X.ActivityC86117Xqz, X.KMV, X.ActivityC45651qj, androidx.activity.ComponentActivity, X.C1AU, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onCreate(android.os.Bundle r18) {
        /*
            Method dump skipped, instructions count: 1472
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.deeplink.DeepLinkActivityV2.onCreate(android.os.Bundle):void");
    }

    @Override // X.KMV, X.ActivityC45651qj, androidx.activity.ComponentActivity, android.app.Activity
    public final void onNewIntent(Intent intent) {
        String LLJJIJIIJIL;
        super.onNewIntent(intent);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(this);
        LIZ.append(" onNewIntent, inner_from = ");
        String str = null;
        if (intent != null) {
            str = C16880lQ.LLJJIJIIJIL(intent, "inner_from");
        }
        LIZ.append(str);
        X1D.LIZIZ(LIZ);
        if (intent != null && (LLJJIJIIJIL = C16880lQ.LLJJIJIIJIL(intent, "inner_from")) != null) {
            int hashCode = LLJJIJIIJIL.hashCode();
            if (hashCode != -414536821) {
                if (hashCode != -274828254) {
                    if (hashCode != 929166351 || !LLJJIJIIJIL.equals("require_login")) {
                        return;
                    }
                    C56235M5f.LJFF("LoginNode");
                    M66.LIZIZ.LJJ("", "");
                    return;
                }
                if (!LLJJIJIIJIL.equals("switch_account")) {
                    return;
                }
                C56235M5f.LJFF("MultiAccountNode");
                M66.LIZIZ.LJJ("", "");
                return;
            }
            if (!LLJJIJIIJIL.equals("new_user_journey")) {
                return;
            }
            C56235M5f.LJFF("NewUserJourneyNode");
            M66.LIZIZ.LJJ("", "");
            return;
        }
        finish();
        this.LJLJJI = intent;
    }
}

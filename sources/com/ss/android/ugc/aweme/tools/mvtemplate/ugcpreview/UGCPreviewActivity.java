package com.ss.android.ugc.aweme.tools.mvtemplate.ugcpreview;

import X.AbstractActivityC162676Zz;
import X.C172656q5;
import X.C43001GuD;
import X.C44037HQb;
import X.C45244HpI;
import X.C5WP;
import X.C65803Ps7;
import X.C81184Vtc;
import X.EnumC172756qF;
import X.FMX;
import X.HEU;
import X.HEX;
import X.HQU;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.apm.agent.v2.instrumentation.ActivityAgent;
import com.bytedance.ies.nle.editor_jni.NLEModelDownloader;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class UGCPreviewActivity extends AbstractActivityC162676Zz {
    public HQU LJLJLLL;
    public long LJLL;
    public String LJLLI;
    public final Map<Integer, View> LJLLILLLL = new LinkedHashMap();

    @Override // X.AbstractActivityC162676Zz
    public final void LLIIIZ(boolean z) {
    }

    @Override // X.AbstractActivityC162676Zz
    public final void LLIIJI() {
    }

    @Override // X.GBO, X.GB7, X.ActivityC86117Xqz, X.KMV
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJLLILLLL).clear();
    }

    @Override // X.GBO, X.GB7, X.ActivityC86117Xqz, X.KMV
    public final View _$_findCachedViewById(int i) {
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLLILLLL;
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
    public final void onPause() {
        C65803Ps7.LIZJ(this);
        super.onPause();
    }

    @Override // X.AbstractActivityC162676Zz, X.ActivityC86117Xqz, X.C29S, X.ActivityC45651qj, android.app.Activity
    public final void onStart() {
        C65803Ps7.LJ(this);
        super.onStart();
    }

    @Override // X.ActivityC86117Xqz, android.app.Activity, android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.tools.mvtemplate.ugcpreview.UGCPreviewActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    @Override // X.ActivityC86117Xqz, android.app.Activity
    public final void finish() {
        super.finish();
        C44037HQb.LIZ(this);
    }

    @Override // X.KMV, androidx.activity.ComponentActivity, android.app.Activity
    public final void onBackPressed() {
        super.onBackPressed();
        HQU hqu = this.LJLJLLL;
        if (hqu != null) {
            String shootWay = hqu.LIZJ();
            o.LJIIIZ(shootWay, "shootWay");
            FMX.LJIIL("exit_template_preview_page", C43001GuD.LJIIIZ(shootWay).LIZ);
            HQU hqu2 = this.LJLJLLL;
            if (hqu2 != null) {
                String aid = hqu2.LIZ().getAid();
                long j = this.LJLL;
                HQU hqu3 = this.LJLJLLL;
                if (hqu3 != null) {
                    C43001GuD.LJIILL(1, aid, hqu3.LIZJ(), j);
                    return;
                } else {
                    o.LJIJI("previewContext");
                    throw null;
                }
            }
            o.LJIJI("previewContext");
            throw null;
        }
        o.LJIJI("previewContext");
        throw null;
    }

    @Override // X.AbstractActivityC162676Zz, X.ActivityC86117Xqz, X.C29S, X.ActivityC45651qj, android.app.Activity
    public final void onDestroy() {
        C65803Ps7.LIZIZ(this);
        super.onDestroy();
        EnumC172756qF type = EnumC172756qF.UGC;
        o.LJIIIZ(type, "type");
        C5WP LIZ = C172656q5.LIZ();
        ((LinkedHashMap) LIZ.LIZ).clear();
        ((LinkedHashMap) LIZ.LIZIZ).clear();
        synchronized (C45244HpI.LIZ) {
            NLEModelDownloader nLEModelDownloader = (NLEModelDownloader) ((LinkedHashMap) C45244HpI.LJ).get(type);
            if (nLEModelDownloader != null) {
                nLEModelDownloader.clearEpCache();
            }
        }
        ((LinkedHashMap) ((HEX) HEU.LJ.getValue()).LIZ).clear();
    }

    @Override // X.AbstractActivityC162676Zz, X.ActivityC86117Xqz, X.ActivityC45651qj, android.app.Activity
    public final void onResume() {
        C65803Ps7.LIZLLL(this);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.tools.mvtemplate.ugcpreview.UGCPreviewActivity", "onResume", true);
        super.onResume();
        this.LJLL = System.currentTimeMillis();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.tools.mvtemplate.ugcpreview.UGCPreviewActivity", "onResume", false);
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

    @Override // X.AbstractActivityC162676Zz
    public final void LLIIJLIL(boolean z) {
        View closeBtn = _$_findCachedViewById(R.id.bf8);
        o.LJIIIIZZ(closeBtn, "closeBtn");
        int LJFF = C81184Vtc.LJFF(this);
        ViewGroup.LayoutParams layoutParams = closeBtn.getLayoutParams();
        o.LJII(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        marginLayoutParams.topMargin = 0 + LJFF;
        closeBtn.setLayoutParams(marginLayoutParams);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:19:0x03cf A[Catch: Exception -> 0x008c, TryCatch #0 {Exception -> 0x008c, blocks: (B:17:0x03c7, B:19:0x03cf, B:20:0x03f6, B:22:0x03fc), top: B:16:0x03c7 }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x03bd A[Catch: Exception -> 0x0097, TRY_LEAVE, TryCatch #1 {Exception -> 0x0097, blocks: (B:29:0x03a8, B:31:0x03bd), top: B:28:0x03a8 }] */
    /* JADX WARN: Type inference failed for: r0v88, types: [T, java.lang.String] */
    @Override // X.AbstractActivityC162676Zz, X.GBO, X.ActivityC86117Xqz, X.KMV, X.ActivityC45651qj, androidx.activity.ComponentActivity, X.C1AU, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onCreate(android.os.Bundle r20) {
        /*
            Method dump skipped, instructions count: 1145
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.tools.mvtemplate.ugcpreview.UGCPreviewActivity.onCreate(android.os.Bundle):void");
    }
}

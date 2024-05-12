package com.ss.android.ugc.aweme.dsp.v2;

import X.ActivityC86117Xqz;
import X.C16880lQ;
import X.C44037HQb;
import X.C65803Ps7;
import X.C91249ZrZ;
import X.C91250Zra;
import X.C91252Zrc;
import X.TBU;
import android.content.Context;
import android.os.SystemClock;
import android.view.View;
import com.bytedance.apm.agent.v2.instrumentation.ActivityAgent;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes22.dex */
public final class TTDspActivityV2 extends ActivityC86117Xqz {
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
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.dsp.v2.TTDspActivityV2", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    @Override // X.ActivityC86117Xqz, android.app.Activity
    public final void finish() {
        super.finish();
        String LLJJIJIIJIL = C16880lQ.LLJJIJIIJIL(getIntent(), "enter_method");
        if (LLJJIJIIJIL == null) {
            return;
        }
        switch (LLJJIJIIJIL.hashCode()) {
            case -1167692212:
                if (!LLJJIJIIJIL.equals("homepage_music_cover")) {
                    return;
                }
                C44037HQb.LIZ(this);
                return;
            case -97561065:
                if (!LLJJIJIIJIL.equals("feed_fav_button")) {
                    return;
                }
                break;
            case 975440483:
                if (!LLJJIJIIJIL.equals("metab_music")) {
                    return;
                }
                break;
            case 1374813039:
                if (!LLJJIJIIJIL.equals("full_song_anchor")) {
                    return;
                }
                break;
            case 1410424812:
                if (!LLJJIJIIJIL.equals("full_song_button")) {
                    return;
                }
                break;
            default:
                return;
        }
        C44037HQb.LIZ(this);
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

    @Override // X.ActivityC86117Xqz, X.C29S, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public final void attachBaseContext(Context context) {
        C91249ZrZ.LIZIZ = SystemClock.elapsedRealtime();
        C91252Zrc.LIZIZ(true);
        final C91250Zra c91250Zra = C91252Zrc.LIZ;
        C91252Zrc.LIZJ(new TBU(c91250Zra) { // from class: X.Zxo
            @Override // X.TBU, X.AbstractC74223TBb, X.InterfaceC74226TBe
            public final Object get() {
                return Long.valueOf(((C91250Zra) this.receiver).LIZIZ);
            }

            @Override // X.TBU, X.AbstractC74223TBb, X.InterfaceC74227TBf
            public final void set(Object obj) {
                ((C91250Zra) this.receiver).LIZIZ = ((Number) obj).longValue();
            }
        });
        super.attachBaseContext(context);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0100, code lost:
    
        if (r14.equals("feed_fav_button") == false) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0122, code lost:
    
        X.C44037HQb.LIZIZ(r17, 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x010a, code lost:
    
        if (r14.equals("metab_music") == false) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0114, code lost:
    
        if (r14.equals("full_song_anchor") == false) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x011e, code lost:
    
        if (r14.equals("full_song_button") == false) goto L6;
     */
    @Override // X.ActivityC86117Xqz, X.KMV, X.ActivityC45651qj, androidx.activity.ComponentActivity, X.C1AU, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onCreate(android.os.Bundle r18) {
        /*
            Method dump skipped, instructions count: 318
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.dsp.v2.TTDspActivityV2.onCreate(android.os.Bundle):void");
    }
}

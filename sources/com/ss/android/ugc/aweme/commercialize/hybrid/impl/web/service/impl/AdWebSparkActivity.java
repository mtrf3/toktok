package com.ss.android.ugc.aweme.commercialize.hybrid.impl.web.service.impl;

import X.AbstractC60817Ntt;
import X.ActivityC86117Xqz;
import X.C109464Ri;
import X.C117144ik;
import X.C16880lQ;
import X.C1B3;
import X.C1B6;
import X.C37682Eqc;
import X.C59222NMc;
import X.C65803Ps7;
import X.C86298Xtu;
import X.GC3;
import X.InterfaceC60176NjY;
import X.OHQ;
import X.X1D;
import Y.ARunnableS46S0100000_10;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.bytedance.apm.agent.v2.instrumentation.ActivityAgent;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.hybrid.spark.page.SparkFragment;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.ss.android.ugc.aweme.web.service.IAdWebUtils;
import com.ss.android.ugc.aweme.web.utils.AdWebUtils;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class AdWebSparkActivity extends ActivityC86117Xqz {
    public SparkFragment LJLIL;
    public SparkContext LJLILLLLZI;
    public final Map<Integer, View> LJLJI = new LinkedHashMap();

    @Override // X.ActivityC86117Xqz, X.KMV
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJLJI).clear();
    }

    @Override // X.ActivityC86117Xqz, X.KMV
    public final View _$_findCachedViewById(int i) {
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLJI;
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
    public final void onStart() {
        C65803Ps7.LJ(this);
        super.onStart();
    }

    @Override // X.ActivityC86117Xqz, android.app.Activity, android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.commercialize.hybrid.impl.web.service.impl.AdWebSparkActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    @Override // X.ActivityC86117Xqz, android.app.Activity
    public final void finish() {
        super.finish();
        overridePendingTransition(0, R.anim.q);
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
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.commercialize.hybrid.impl.web.service.impl.AdWebSparkActivity", "onResume", true);
        super.onResume();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.commercialize.hybrid.impl.web.service.impl.AdWebSparkActivity", "onResume", false);
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
        int i;
        C65803Ps7.LIZ(this, bundle);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.commercialize.hybrid.impl.web.service.impl.AdWebSparkActivity", "onCreate", true);
        activityConfiguration(GC3.LJLIL);
        super.onCreate(bundle);
        overridePendingTransition(R.anim.r, 0);
        setContentView(R.layout.g8);
        C109464Ri.LIZ.getClass();
        C117144ik c117144ik = C117144ik.LIZIZ;
        String LLJJIJIIJIL = C16880lQ.LLJJIJIIJIL(getIntent(), "SparkContextContainerId");
        c117144ik.getClass();
        SparkContext LIZ = C117144ik.LIZ(LLJJIJIIJIL);
        if (LIZ == null) {
            LIZ = new SparkContext();
        }
        this.LJLILLLLZI = LIZ;
        HashMap hashMap = new HashMap();
        if (bundle != null) {
            i = 1;
        } else {
            i = 0;
        }
        hashMap.put("isRecreated", Integer.valueOf(i));
        LIZ.LJJIJ(hashMap);
        SparkContext sparkContext = this.LJLILLLLZI;
        if (sparkContext != null) {
            C37682Eqc.LIZIZ(sparkContext, "AdWebSparkActivity", "onCreate");
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("SparkFragment#");
            SparkContext sparkContext2 = this.LJLILLLLZI;
            if (sparkContext2 != null) {
                LIZ2.append(sparkContext2.containerId);
                String LIZIZ = X1D.LIZIZ(LIZ2);
                SparkContext sparkContext3 = this.LJLILLLLZI;
                if (sparkContext3 != null) {
                    C37682Eqc.LIZIZ(sparkContext3, "AdWebSparkActivity", "Create SparkFragment");
                    SparkContext sparkContext4 = this.LJLILLLLZI;
                    if (sparkContext4 != null) {
                        C59222NMc c59222NMc = (C59222NMc) sparkContext4.LIZIZ(C59222NMc.class);
                        IAdWebUtils LIZJ = AdWebUtils.LIZJ();
                        SparkContext sparkContext5 = this.LJLILLLLZI;
                        if (sparkContext5 != null) {
                            Fragment LIZ3 = LIZJ.LIZ(this, c59222NMc, sparkContext5.url, new ARunnableS46S0100000_10(this, 116));
                            o.LJII(LIZ3, "null cannot be cast to non-null type com.bytedance.hybrid.spark.page.SparkFragment");
                            this.LJLIL = (SparkFragment) LIZ3;
                            FragmentManager supportFragmentManager = getSupportFragmentManager();
                            C1B3 LIZ4 = C1B6.LIZ(supportFragmentManager, supportFragmentManager);
                            SparkFragment sparkFragment = this.LJLIL;
                            if (sparkFragment != null) {
                                LIZ4.LJIIIIZZ(R.id.pa, 1, sparkFragment, LIZIZ);
                                LIZ4.LJI();
                                ActivityAgent.onTrace("com.ss.android.ugc.aweme.commercialize.hybrid.impl.web.service.impl.AdWebSparkActivity", "onCreate", false);
                                return;
                            }
                            o.LJIJI("sparkFragment");
                            throw null;
                        }
                        o.LJIJI("sparkContext");
                        throw null;
                    }
                    o.LJIJI("sparkContext");
                    throw null;
                }
                o.LJIJI("sparkContext");
                throw null;
            }
            o.LJIJI("sparkContext");
            throw null;
        }
        o.LJIJI("sparkContext");
        throw null;
    }

    @Override // X.ActivityC86117Xqz, X.KMV, X.ActivityC45651qj, androidx.activity.ComponentActivity, android.app.Activity
    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        SparkContext sparkContext = this.LJLILLLLZI;
        if (sparkContext != null) {
            InterfaceC60176NjY interfaceC60176NjY = (InterfaceC60176NjY) sparkContext.LIZIZ(InterfaceC60176NjY.class);
            if (interfaceC60176NjY != null) {
                interfaceC60176NjY.onActivityResult(i, i2, intent);
            }
            SparkContext sparkContext2 = this.LJLILLLLZI;
            if (sparkContext2 != null) {
                AbstractC60817Ntt abstractC60817Ntt = (AbstractC60817Ntt) sparkContext2.LIZIZ(AbstractC60817Ntt.class);
                if (abstractC60817Ntt == null) {
                    return;
                }
                do {
                    abstractC60817Ntt.onActivityResult(i, i2, intent);
                    AbstractC60817Ntt next = abstractC60817Ntt.next();
                    if (next != null && (next instanceof AbstractC60817Ntt)) {
                        abstractC60817Ntt = next;
                    } else {
                        return;
                    }
                } while (abstractC60817Ntt != null);
                return;
            }
            o.LJIJI("sparkContext");
            throw null;
        }
        o.LJIJI("sparkContext");
        throw null;
    }

    /* JADX WARN: Failed to extract var names
    java.lang.NullPointerException
     */
    @Override // X.ActivityC45651qj, androidx.activity.ComponentActivity, android.app.Activity, X.C06Q
    public final void onRequestPermissionsResult(int i, String[] strArr, int[] grantResults) {
        o.LJIIIZ(strArr, OHQ.LIZIZ);
        o.LJIIIZ(grantResults, "grantResults");
        C86298Xtu.LIZIZ(this, i, grantResults);
        super.onRequestPermissionsResult(i, strArr, grantResults);
    }
}

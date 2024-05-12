package com.ss.android.ugc.aweme.ecommerce.base.review;

import X.AbstractActivityC27434Api;
import X.C113554cx;
import X.C122874rz;
import X.C16880lQ;
import X.C1B3;
import X.C1B6;
import X.C201037ul;
import X.C234529Ii;
import X.C235119Kp;
import X.C252709vu;
import X.C27351AoN;
import X.C27739Aud;
import X.C53571L0t;
import X.C65803Ps7;
import X.C70695Rop;
import X.C9KF;
import X.EnumC63755P0l;
import X.GCY;
import X.InterfaceC18010nF;
import X.OSZ;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.FragmentManager;
import com.bytedance.apm.agent.v2.instrumentation.ActivityAgent;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.ss.android.ugc.aweme.ecommerce.common.ECBaseJediFragment;
import com.zhiliaoapp.musically.R;
import defpackage.s1;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AqS157S0100000_7;

/* loaded from: classes11.dex */
public final class ProductReviewActivity extends AbstractActivityC27434Api implements InterfaceC18010nF {
    public final Map<Integer, View> LJLJJI = new LinkedHashMap();

    @Override // X.AbstractActivityC27434Api, X.ActivityC86117Xqz, X.KMV
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJLJJI).clear();
    }

    @Override // X.AbstractActivityC27434Api, X.ActivityC86117Xqz, X.KMV
    public final View _$_findCachedViewById(int i) {
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLJJI;
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

    @Override // X.AbstractActivityC27434Api, X.InterfaceC37828Esy
    public final String getPageName() {
        return "product_review";
    }

    @Override // X.AbstractActivityC27434Api, X.ActivityC86117Xqz, X.C29S, X.ActivityC45651qj, android.app.Activity
    public final void onDestroy() {
        C65803Ps7.LIZIZ(this);
        super.onDestroy();
    }

    @Override // X.ActivityC86117Xqz, X.ActivityC45651qj, android.app.Activity
    public final void onPause() {
        C65803Ps7.LIZJ(this);
        super.onPause();
    }

    @Override // X.AbstractActivityC27434Api, X.ActivityC86117Xqz, X.ActivityC45651qj, android.app.Activity
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
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.ecommerce.base.review.ProductReviewActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    @Override // X.InterfaceC18010nF
    public final Map<String, String> x3() {
        return null;
    }

    @Override // X.InterfaceC18010nF
    public String getBtmPageCode() {
        return EnumC63755P0l.PRODUCT_REVIEW_PAGE.getPageCode();
    }

    @Override // X.InterfaceC18010nF
    public final String LLZIL() {
        return String.valueOf(hashCode());
    }

    @Override // X.AbstractActivityC27434Api, X.ActivityC86117Xqz, android.app.Activity
    public final void finish() {
        super.finish();
        C201037ul.LIZ(0, this, false);
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

    @Override // X.AbstractActivityC27434Api, X.ActivityC86117Xqz, X.KMV, X.ActivityC45651qj, androidx.activity.ComponentActivity, X.C1AU, android.app.Activity
    public final void onCreate(Bundle bundle) {
        String str;
        String str2;
        String str3;
        String str4;
        Object obj;
        Object obj2;
        Object obj3;
        C65803Ps7.LIZ(this, bundle);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.ecommerce.base.review.ProductReviewActivity", "onCreate", true);
        super.onCreate(bundle);
        String str5 = "product_review";
        getIntent().putExtra("in_window", "product_review");
        activityConfiguration(GCY.LJLIL);
        setContentView(R.layout.a5m);
        C201037ul.LIZ(0, this, true);
        String LLJJIJIIJIL = C16880lQ.LLJJIJIIJIL(getIntent(), "product_id");
        String str6 = "";
        if (LLJJIJIIJIL == null) {
            LLJJIJIIJIL = "";
        }
        float floatExtra = getIntent().getFloatExtra("review_score", -1.0f);
        int intExtra = getIntent().getIntExtra("review_count", 0);
        int intExtra2 = getIntent().getIntExtra("shop_review_cnt", 0);
        String LLJJIJIIJIL2 = C16880lQ.LLJJIJIIJIL(getIntent(), "clicked_review_id");
        String LLJJIJIIJIL3 = C16880lQ.LLJJIJIIJIL(getIntent(), "clicked_impression_word_filter_id");
        String LLJJIJIIJIL4 = C16880lQ.LLJJIJIIJIL(getIntent(), "clicked_impression_word_filter_name");
        String LLJJIJIIJIL5 = C16880lQ.LLJJIJIIJIL(getIntent(), "clicked_impression_word_filter_type");
        int intExtra3 = getIntent().getIntExtra("clicked_filter_count", 0);
        int intExtra4 = getIntent().getIntExtra("review_body_content", 1);
        String LLJJIJIIJIL6 = C16880lQ.LLJJIJIIJIL(getIntent(), "seller_id");
        HashMap<String, Object> LIZIZ = C27739Aud.LIZIZ(getIntent(), "pdp_track_param");
        OSZ[] oszArr = new OSZ[5];
        if (intExtra4 == 2) {
            str5 = "shop_review";
        }
        oszArr[0] = new OSZ("page_name", str5);
        oszArr[1] = new OSZ("product_id", LLJJIJIIJIL);
        if (LIZIZ == null || (obj3 = LIZIZ.get("source_page_type")) == null || (str = obj3.toString()) == null) {
            str = "";
        }
        oszArr[2] = new OSZ("source_page_type", str);
        if (LIZIZ == null || (obj2 = LIZIZ.get("enter_from_info")) == null || (str2 = obj2.toString()) == null) {
            str2 = "";
        }
        oszArr[3] = new OSZ("enter_from", str2);
        if (LIZIZ == null || (obj = LIZIZ.get("author_id")) == null || (str3 = obj.toString()) == null) {
            str3 = "";
        }
        oszArr[4] = new OSZ("author_id", str3);
        HashMap LJJJLZIJ = C113554cx.LJJJLZIJ(oszArr);
        HashMap<String, Object> LIZ = C27739Aud.LIZ(this, "track_params");
        if (LIZ != null) {
            LJJJLZIJ.putAll(LIZ);
        }
        LJJJLZIJ.put("EVENT_ORIGIN_FEATURE", "TEMAI");
        C27351AoN.LIZ(this, new C122874rz(LJJJLZIJ));
        ECBaseJediFragment LIZ2 = C70695Rop.LIZ();
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        C1B3 LIZ3 = C1B6.LIZ(supportFragmentManager, supportFragmentManager);
        Bundle bundle2 = new Bundle();
        bundle2.putString("product_id", LLJJIJIIJIL);
        bundle2.putInt("review_count", intExtra);
        bundle2.putInt("shop_review_cnt", intExtra2);
        if (floatExtra >= 0.0f) {
            bundle2.putFloat("review_score", floatExtra);
        }
        if (LLJJIJIIJIL2 != null && LLJJIJIIJIL2.length() != 0) {
            bundle2.putString("clicked_review_id", LLJJIJIIJIL2);
        }
        if (LLJJIJIIJIL3 != null && LLJJIJIIJIL3.length() != 0) {
            bundle2.putString("clicked_impression_word_filter_id", LLJJIJIIJIL3);
        }
        if (LLJJIJIIJIL4 != null && LLJJIJIIJIL4.length() != 0) {
            bundle2.putString("clicked_impression_word_filter_name", LLJJIJIIJIL4);
        }
        if (LLJJIJIIJIL5 != null && LLJJIJIIJIL5.length() != 0) {
            bundle2.putString("clicked_impression_word_filter_type", LLJJIJIIJIL5);
        }
        bundle2.putInt("clicked_filter_count", intExtra3);
        bundle2.putInt("review_body_content", intExtra4);
        if (LLJJIJIIJIL6 != null) {
            str6 = LLJJIJIIJIL6;
        }
        bundle2.putString("seller_id", str6);
        bundle2.putSerializable("pdp_track_param", LIZIZ);
        LIZ2.setArguments(bundle2);
        LIZ3.LJIIJ(LIZ2, "PRODUCT_COMMENT_FRAGMENT_TAG", R.id.dm7);
        LIZ3.LJI();
        C235119Kp c235119Kp = new C235119Kp();
        C234529Ii LIZJ = s1.LIZJ();
        LIZJ.LIZJ = R.raw.icon_arrow_left_ltr;
        LIZJ.LIZLLL = true;
        LIZJ.LIZIZ(new AqS157S0100000_7(this, 112));
        c235119Kp.LIZLLL(LIZJ);
        C53571L0t.LIZ.getClass();
        if (!C53571L0t.LIZ()) {
            if (intExtra4 == 2) {
                str4 = getString(R.string.ffp) + " (" + intExtra2 + ')';
            } else {
                str4 = getString(R.string.f4u) + " (" + intExtra + ')';
            }
            C9KF c9kf = new C9KF();
            c9kf.LIZ(str4);
            c235119Kp.LIZJ = c9kf;
        }
        ((C252709vu) _$_findCachedViewById(R.id.l_2)).setNavActions(c235119Kp);
        ((C252709vu) _$_findCachedViewById(R.id.l_2)).LJIILJJIL(true);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.ecommerce.base.review.ProductReviewActivity", "onCreate", false);
    }
}

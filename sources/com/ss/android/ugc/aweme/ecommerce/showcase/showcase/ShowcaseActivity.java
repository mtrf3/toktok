package com.ss.android.ugc.aweme.ecommerce.showcase.showcase;

import X.AbstractActivityC27434Api;
import X.C27739Aud;
import X.C40342FsQ;
import X.C40343FsR;
import X.C61141Nz7;
import X.C61471OAp;
import X.C61491OBj;
import X.C61712OJw;
import X.C61713OJx;
import X.C65803Ps7;
import X.C75792yF;
import X.EnumC63755P0l;
import X.InterfaceC18010nF;
import X.InterfaceC40159FpT;
import X.InterfaceC60761Nsz;
import X.M2T;
import X.M2U;
import X.OSZ;
import X.SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS;
import android.R;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.apm.agent.v2.instrumentation.ActivityAgent;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.google.gson.m;
import com.lynx.tasm.TemplateData;
import com.ss.android.ugc.aweme.ecommerce.showcase.EcommerceStoreTechLogServiceImpl;
import com.ss.android.ugc.aweme.services.BaseUserService;
import defpackage.e1;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class ShowcaseActivity extends AbstractActivityC27434Api implements InterfaceC40159FpT, InterfaceC18010nF {
    public SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS LJLJJI;
    public final Map<Integer, View> LJLJJL = new LinkedHashMap();

    @Override // X.InterfaceC40159FpT
    public final void LLJIJIL() {
    }

    @Override // X.AbstractActivityC27434Api, X.ActivityC86117Xqz, X.KMV
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJLJJL).clear();
    }

    @Override // X.AbstractActivityC27434Api, X.ActivityC86117Xqz, X.KMV
    public final View _$_findCachedViewById(int i) {
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

    @Override // X.ActivityC86117Xqz, X.C29S, X.ActivityC45651qj, android.app.Activity
    public final void onStart() {
        C65803Ps7.LJ(this);
        super.onStart();
    }

    @Override // X.ActivityC86117Xqz, android.app.Activity, android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.ecommerce.showcase.showcase.ShowcaseActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    @Override // X.InterfaceC18010nF
    public final Map<String, String> x3() {
        return null;
    }

    @Override // X.InterfaceC18010nF
    public String getBtmPageCode() {
        return EnumC63755P0l.SHOWCASE_PAGE.getPageCode();
    }

    @Override // X.NV7
    public final void refresh() {
        SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS = this.LJLJJI;
        if (sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS != null) {
            sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS.LIZIZ();
        }
    }

    @Override // X.InterfaceC18010nF
    public final String LLZIL() {
        return String.valueOf(hashCode());
    }

    @Override // X.AbstractActivityC27434Api, X.ActivityC86117Xqz, X.C29S, X.ActivityC45651qj, android.app.Activity
    public final void onDestroy() {
        C65803Ps7.LIZIZ(this);
        SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS = this.LJLJJI;
        if (sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS != null) {
            SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS.LJ(sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS);
        }
        super.onDestroy();
    }

    @Override // X.ActivityC86117Xqz, X.ActivityC45651qj, android.app.Activity
    public final void onPause() {
        InterfaceC60761Nsz kitView;
        C65803Ps7.LIZJ(this);
        super.onPause();
        SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS = this.LJLJJI;
        if (sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS != null && (kitView = sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS.getKitView()) != null) {
            kitView.onHide();
        }
    }

    @Override // X.AbstractActivityC27434Api, X.ActivityC86117Xqz, X.ActivityC45651qj, android.app.Activity
    public final void onResume() {
        InterfaceC60761Nsz kitView;
        C65803Ps7.LIZLLL(this);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.ecommerce.showcase.showcase.ShowcaseActivity", "onResume", true);
        super.onResume();
        SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS = this.LJLJJI;
        if (sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS != null && (kitView = sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS.getKitView()) != null) {
            kitView.onShow();
        }
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.ecommerce.showcase.showcase.ShowcaseActivity", "onResume", false);
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

    @Override // X.InterfaceC40159FpT
    public final void close() {
        finish();
    }

    @Override // X.AbstractActivityC27434Api, X.ActivityC86117Xqz, X.KMV, X.ActivityC45651qj, androidx.activity.ComponentActivity, X.C1AU, android.app.Activity
    public final void onCreate(Bundle bundle) {
        JSONObject jSONObject;
        Object obj;
        String queryParameter;
        C65803Ps7.LIZ(this, bundle);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.ecommerce.showcase.showcase.ShowcaseActivity", "onCreate", true);
        super.onCreate(bundle);
        activityConfiguration(C61471OAp.LJLIL);
        C61713OJx LIZJ = C61712OJw.LIZJ(this);
        LIZJ.LIZIZ.LJIIL();
        LIZJ.LIZ(false);
        LIZJ.LIZIZ.LJIIJ(true);
        LIZJ.LIZJ();
        Uri data = getIntent().getData();
        if (data == null) {
            finish();
            ActivityAgent.onTrace("com.ss.android.ugc.aweme.ecommerce.showcase.showcase.ShowcaseActivity", "onCreate", false);
            return;
        }
        HashMap<String, Object> LIZ = C27739Aud.LIZ(this, "trackParams");
        HashMap<String, Object> LIZ2 = C27739Aud.LIZ(this, "trackParams");
        if (LIZ2 == null) {
            LIZ2 = new HashMap<>();
        }
        int[] LIZLLL = M2T.LIZLLL(3, LIZ2);
        String queryParameter2 = UriProtector.getQueryParameter(data, "trackParams");
        if (queryParameter2 != null) {
            jSONObject = new JSONObject(queryParameter2);
        } else {
            jSONObject = new JSONObject();
        }
        jSONObject.put("traffic_source_list", C75792yF.LIZJ(LIZLLL));
        String jSONObject2 = jSONObject.toString();
        o.LJIIIIZZ(jSONObject2, "trackParamsJson.toString()");
        Set<String> queryParameterNames = UriProtector.getQueryParameterNames(data);
        Uri.Builder buildUpon = data.buildUpon();
        buildUpon.clearQuery();
        for (String str : queryParameterNames) {
            if (o.LJ(str, "trackParams")) {
                queryParameter = jSONObject2;
            } else {
                queryParameter = UriProtector.getQueryParameter(data, str);
            }
            buildUpon.appendQueryParameter(str, queryParameter);
        }
        String queryParameter3 = UriProtector.getQueryParameter(data, "_ec_start_time");
        if (queryParameter3 == null || ujb.o.LJJJJJL(queryParameter3)) {
            buildUpon.appendQueryParameter("_ec_start_time", String.valueOf(System.currentTimeMillis()));
        }
        String str2 = null;
        buildUpon.scheme("sslocal").authority("lynxview").path(null).appendQueryParameter("__live_platform__", "webcast").appendQueryParameter("original_schema", "aweme");
        if (e1.LIZ(31744, "showcase_lynx_prefetch", true, false)) {
            buildUpon.appendQueryParameter("enable_prefetch", "1");
        }
        String queryParameter4 = UriProtector.getQueryParameter(data, "author_id");
        String str3 = "";
        if (queryParameter4 == null) {
            queryParameter4 = "";
        }
        if (LIZ != null) {
            obj = LIZ.get("list_source_content_id");
        } else {
            obj = null;
        }
        m LIZ3 = M2U.LIZ(obj, queryParameter4);
        SparkContext sparkContext = new SparkContext();
        sparkContext.LJJIJLIJ(String.valueOf(buildUpon));
        sparkContext.LJII(InterfaceC40159FpT.class, this);
        OSZ[] oszArr = new OSZ[1];
        if (LIZ3 != null) {
            str2 = LIZ3.toString();
        }
        oszArr[0] = new OSZ("recommend_context", str2);
        TemplateData LJLIL = C61491OBj.LJLIL((OSZ[]) Arrays.copyOf(oszArr, 1));
        if (LJLIL != null) {
            sparkContext.LJJ(new C61141Nz7(LJLIL));
        }
        C40343FsR.LJIILJJIL.getClass();
        this.LJLJJI = C40343FsR.LIZ(C40342FsQ.LIZ(this, sparkContext));
        ((ViewGroup) findViewById(R.id.content)).addView(this.LJLJJI);
        SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS = this.LJLJJI;
        if (sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS != null) {
            sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS.LIZIZ();
        }
        boolean LJ = o.LJ(BaseUserService.createIUserServicebyMonsterPlugin(false).getCurrentUserID(), queryParameter4);
        String queryParameter5 = UriProtector.getQueryParameter(data, "enter_from");
        if (queryParameter5 != null) {
            str3 = queryParameter5;
        }
        EcommerceStoreTechLogServiceImpl.LIZIZ().LIZ(queryParameter4, str3, "showcase", null, LJ);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.ecommerce.showcase.showcase.ShowcaseActivity", "onCreate", false);
    }
}

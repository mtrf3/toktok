package com.ss.android.ugc.aweme.vision;

import X.ActivityC86117Xqz;
import X.C09650Zl;
import X.C1B3;
import X.C1B6;
import X.C48658J7u;
import X.C61712OJw;
import X.C61713OJx;
import X.C63081OpJ;
import X.C65232Piu;
import X.C65803Ps7;
import X.C78857UxB;
import X.EnumC63755P0l;
import X.InterfaceC18010nF;
import X.KHS;
import X.X1D;
import android.content.Intent;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.bytedance.apm.agent.v2.instrumentation.ActivityAgent;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.google.gson.Gson;
import com.ss.android.ugc.aweme.search.ecommerce.IEcomSearchService;
import com.ss.android.ugc.aweme.vision.model.PhotoSearchBusinessEnterParams;
import com.ss.android.ugc.aweme.vision.model.PhotoSearchEnterParams;
import com.ss.android.ugc.aweme.vision.model.PhotoSearchLogEnterParams;
import com.ss.android.ugc.aweme.vision.model.PhotoSearchPdpEnterParams;
import com.ss.android.ugc.aweme.vision.model.PhotoSearchToolsEnterParams;
import com.zhiliaoapp.musically.R;
import java.io.Serializable;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes9.dex */
public final class PhotoSearchActivity extends ActivityC86117Xqz implements InterfaceC18010nF {
    public static String LJLJI = "";
    public PhotoSearchViewModel LJLIL;
    public final Map<Integer, View> LJLILLLLZI = new LinkedHashMap();

    @Override // X.ActivityC86117Xqz, X.KMV
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJLILLLLZI).clear();
    }

    @Override // X.ActivityC86117Xqz, X.KMV
    public final View _$_findCachedViewById(int i) {
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLILLLLZI;
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

    @Override // X.ActivityC86117Xqz, X.C29S, X.ActivityC45651qj, android.app.Activity
    public final void onStart() {
        C65803Ps7.LJ(this);
        super.onStart();
    }

    @Override // X.ActivityC86117Xqz, android.app.Activity, android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.vision.PhotoSearchActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    @Override // X.InterfaceC18010nF
    public final Map<String, String> x3() {
        return null;
    }

    public final void LLFZ() {
        PhotoSearchFragment photoSearchFragment = new PhotoSearchFragment();
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        supportFragmentManager.getClass();
        C1B3 c1b3 = new C1B3(supportFragmentManager);
        c1b3.LJIIJ(photoSearchFragment, "PhotoSearchFragment", R.id.bs8);
        c1b3.LJII();
    }

    @Override // X.InterfaceC18010nF
    public String getBtmPageCode() {
        return EnumC63755P0l.PHOTO_SEARCH_RESULT_PAGE.getPageCode();
    }

    public final void LLFII() {
        PhotoSearchEnterParams photoSearchEnterParams;
        long j;
        PhotoSearchEnterParams photoSearchEnterParams2;
        PhotoSearchBusinessEnterParams businessParams;
        PhotoSearchEnterParams photoSearchEnterParams3;
        PhotoSearchToolsEnterParams toolsParams;
        Long searchTime;
        PhotoSearchBusinessEnterParams businessParams2;
        String str;
        PhotoSearchToolsEnterParams toolsParams2;
        this.LJLIL = KHS.LIZ(this);
        Serializable serializableExtra = getIntent().getSerializableExtra("photo_search_enter_param");
        if (serializableExtra != null && (serializableExtra instanceof PhotoSearchEnterParams)) {
            PhotoSearchViewModel photoSearchViewModel = this.LJLIL;
            if (photoSearchViewModel != null) {
                photoSearchViewModel.LJLILLLLZI = (PhotoSearchEnterParams) serializableExtra;
                PhotoSearchEnterParams photoSearchEnterParams4 = photoSearchViewModel.LJLILLLLZI;
                if (photoSearchEnterParams4 != null && (businessParams2 = photoSearchEnterParams4.getBusinessParams()) != null) {
                    businessParams2.setPersonalContextInfo(LJLJI);
                }
            }
            PhotoSearchViewModel photoSearchViewModel2 = this.LJLIL;
            if (photoSearchViewModel2 != null) {
                PhotoSearchEnterParams photoSearchEnterParams5 = photoSearchViewModel2.LJLILLLLZI;
                if (photoSearchEnterParams5 != null && (toolsParams2 = photoSearchEnterParams5.getToolsParams()) != null) {
                    str = toolsParams2.getSearchSource();
                } else {
                    str = null;
                }
                String str2 = "choose_album";
                if (!o.LJ(str, "choose_album")) {
                    str2 = "take_photo";
                    if (!o.LJ(str, "take_photo")) {
                        str2 = "pdp_main_pic";
                    }
                }
                photoSearchViewModel2.LJLJLJ = str2;
            }
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("enterParam: ");
        Gson gson = C09650Zl.LIZIZ;
        PhotoSearchViewModel photoSearchViewModel3 = this.LJLIL;
        if (photoSearchViewModel3 != null) {
            photoSearchEnterParams = photoSearchViewModel3.LJLILLLLZI;
        } else {
            photoSearchEnterParams = null;
        }
        LIZ.append(GsonProtectorUtils.toJson(gson, photoSearchEnterParams));
        X1D.LIZIZ(LIZ);
        long currentTimeMillis = System.currentTimeMillis();
        PhotoSearchViewModel photoSearchViewModel4 = this.LJLIL;
        if (photoSearchViewModel4 != null) {
            RDPhotoSearchTraceTime rDPhotoSearchTraceTime = new RDPhotoSearchTraceTime(null, null, null, null, null, null, 63, null);
            rDPhotoSearchTraceTime.setEnterResult(Long.valueOf(currentTimeMillis));
            photoSearchViewModel4.LJLL = rDPhotoSearchTraceTime;
        }
        PhotoSearchViewModel photoSearchViewModel5 = this.LJLIL;
        if (photoSearchViewModel5 != null && (photoSearchEnterParams3 = photoSearchViewModel5.LJLILLLLZI) != null && (toolsParams = photoSearchEnterParams3.getToolsParams()) != null && (searchTime = toolsParams.getSearchTime()) != null) {
            j = searchTime.longValue();
        } else {
            j = 0;
        }
        C78857UxB.LJJJJIZL("leave_page", "search_result", Long.valueOf(currentTimeMillis - j), null, 248);
        PhotoSearchViewModel photoSearchViewModel6 = this.LJLIL;
        if (photoSearchViewModel6 != null && (photoSearchEnterParams2 = photoSearchViewModel6.LJLILLLLZI) != null && (businessParams = photoSearchEnterParams2.getBusinessParams()) != null) {
            IEcomSearchService LJJIJL = C63081OpJ.LJJIJL();
            LJJIJL.LJ("search_session_id", businessParams.getSearchSessionId());
            LJJIJL.LJ("ec_search_session_id", businessParams.getEcSearchSessionId());
        }
    }

    @Override // X.InterfaceC18010nF
    public final String LLZIL() {
        return String.valueOf(hashCode());
    }

    @Override // X.ActivityC86117Xqz, android.app.Activity
    public final void finish() {
        super.finish();
        overridePendingTransition(0, 0);
    }

    @Override // X.KMV, androidx.activity.ComponentActivity, android.app.Activity
    public final void onBackPressed() {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        PhotoSearchEnterParams photoSearchEnterParams;
        PhotoSearchPdpEnterParams pdpParams;
        PhotoSearchEnterParams photoSearchEnterParams2;
        PhotoSearchPdpEnterParams pdpParams2;
        PhotoSearchEnterParams photoSearchEnterParams3;
        PhotoSearchLogEnterParams logParams;
        PhotoSearchEnterParams photoSearchEnterParams4;
        PhotoSearchLogEnterParams logParams2;
        PhotoSearchEnterParams photoSearchEnterParams5;
        PhotoSearchLogEnterParams logParams3;
        super.onBackPressed();
        JSONObject LIZJ = C65232Piu.LIZJ("words_source", "photo_search");
        PhotoSearchViewModel photoSearchViewModel = this.LJLIL;
        String str8 = null;
        if (photoSearchViewModel != null) {
            str = photoSearchViewModel.LJLLILLLL;
        } else {
            str = null;
        }
        LIZJ.put("raw_pic", str);
        PhotoSearchViewModel photoSearchViewModel2 = this.LJLIL;
        if (photoSearchViewModel2 != null) {
            str2 = photoSearchViewModel2.LJLJLJ;
        } else {
            str2 = null;
        }
        LIZJ.put("raw_photo_source", str2);
        PhotoSearchViewModel photoSearchViewModel3 = this.LJLIL;
        if (photoSearchViewModel3 != null && (photoSearchEnterParams5 = photoSearchViewModel3.LJLILLLLZI) != null && (logParams3 = photoSearchEnterParams5.getLogParams()) != null) {
            str3 = logParams3.getSearchEntrance();
        } else {
            str3 = null;
        }
        LIZJ.put("search_entrance", str3);
        PhotoSearchViewModel photoSearchViewModel4 = this.LJLIL;
        if (photoSearchViewModel4 != null && (photoSearchEnterParams4 = photoSearchViewModel4.LJLILLLLZI) != null && (logParams2 = photoSearchEnterParams4.getLogParams()) != null) {
            str4 = logParams2.getCurrentPage();
        } else {
            str4 = null;
        }
        LIZJ.put("source_page_name", str4);
        PhotoSearchViewModel photoSearchViewModel5 = this.LJLIL;
        if (photoSearchViewModel5 != null && (photoSearchEnterParams3 = photoSearchViewModel5.LJLILLLLZI) != null && (logParams = photoSearchEnterParams3.getLogParams()) != null) {
            str5 = logParams.getSearchType();
        } else {
            str5 = null;
        }
        LIZJ.put("search_type", str5);
        PhotoSearchViewModel photoSearchViewModel6 = this.LJLIL;
        if (photoSearchViewModel6 != null) {
            str6 = photoSearchViewModel6.LJLLLLLL;
        } else {
            str6 = null;
        }
        LIZJ.put("search_id", str6);
        PhotoSearchViewModel photoSearchViewModel7 = this.LJLIL;
        if (photoSearchViewModel7 != null && (photoSearchEnterParams2 = photoSearchViewModel7.LJLILLLLZI) != null && (pdpParams2 = photoSearchEnterParams2.getPdpParams()) != null) {
            str7 = pdpParams2.getEnterProductId();
        } else {
            str7 = null;
        }
        LIZJ.put("enter_product_id", str7);
        PhotoSearchViewModel photoSearchViewModel8 = this.LJLIL;
        if (photoSearchViewModel8 != null && (photoSearchEnterParams = photoSearchViewModel8.LJLILLLLZI) != null && (pdpParams = photoSearchEnterParams.getPdpParams()) != null) {
            str8 = pdpParams.getTrackId();
        }
        LIZJ.put("track_id", str8);
        LIZJ.put("action_type", "close");
        C48658J7u.LIZIZ("photo_search_result_action", LIZJ);
    }

    @Override // X.ActivityC86117Xqz, X.ActivityC45651qj, android.app.Activity
    public final void onResume() {
        PhotoSearchEnterParams photoSearchEnterParams;
        PhotoSearchBusinessEnterParams businessParams;
        C65803Ps7.LIZLLL(this);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.vision.PhotoSearchActivity", "onResume", true);
        super.onResume();
        LJLJI = null;
        PhotoSearchViewModel photoSearchViewModel = this.LJLIL;
        if (photoSearchViewModel != null && (photoSearchEnterParams = photoSearchViewModel.LJLILLLLZI) != null && (businessParams = photoSearchEnterParams.getBusinessParams()) != null) {
            businessParams.getPersonalContextInfo();
        }
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.vision.PhotoSearchActivity", "onResume", false);
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

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean dispatchTouchEvent(MotionEvent ev) {
        o.LJIIIZ(ev, "ev");
        if (ev.getPointerCount() > 1) {
            return false;
        }
        return super.dispatchTouchEvent(ev);
    }

    @Override // X.ActivityC86117Xqz, X.KMV, X.ActivityC45651qj, androidx.activity.ComponentActivity, X.C1AU, android.app.Activity
    public final void onCreate(Bundle bundle) {
        C65803Ps7.LIZ(this, bundle);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.vision.PhotoSearchActivity", "onCreate", true);
        super.onCreate(bundle);
        LLFII();
        overridePendingTransition(0, 0);
        setContentView(R.layout.ex);
        C61713OJx LIZJ = C61712OJw.LIZJ(this);
        LIZJ.LIZIZ.LJIIL();
        LIZJ.LIZIZ.LJIIJJI();
        LIZJ.LJIIIZ();
        LIZJ.LIZJ();
        LLFZ();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.vision.PhotoSearchActivity", "onCreate", false);
    }

    @Override // X.KMV, X.ActivityC45651qj, androidx.activity.ComponentActivity, android.app.Activity
    public final void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        setIntent(intent);
        LLFII();
        List<Fragment> LJJJJLI = getSupportFragmentManager().LJJJJLI();
        o.LJIIIIZZ(LJJJJLI, "supportFragmentManager.fragments");
        if (!LJJJJLI.isEmpty()) {
            FragmentManager supportFragmentManager = getSupportFragmentManager();
            C1B3 LIZ = C1B6.LIZ(supportFragmentManager, supportFragmentManager);
            Iterator<Fragment> it = LJJJJLI.iterator();
            while (it.hasNext()) {
                LIZ.LJJI(it.next());
            }
            LIZ.LJII();
        }
        LLFZ();
    }

    @Override // android.app.Activity
    public final boolean onTouchEvent(MotionEvent event) {
        o.LJIIIZ(event, "event");
        if (event.getPointerCount() > 1) {
            return false;
        }
        return super.onTouchEvent(event);
    }

    @Override // X.C1AU, android.app.Activity
    public final void setRequestedOrientation(int i) {
        super.setRequestedOrientation(1);
    }
}

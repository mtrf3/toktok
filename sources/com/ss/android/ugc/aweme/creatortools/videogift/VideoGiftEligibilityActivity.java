package com.ss.android.ugc.aweme.creatortools.videogift;

import X.AbstractC36908Ee8;
import X.AbstractC73672Svk;
import X.ActivityC86117Xqz;
import X.C16880lQ;
import X.C234529Ii;
import X.C235119Kp;
import X.C252709vu;
import X.C25723A7r;
import X.C65803Ps7;
import X.C73318Sq2;
import X.C73536StY;
import X.C73969T1h;
import X.C78840Uwu;
import X.C8ID;
import X.EFJ;
import X.SY4;
import X.T16;
import Y.ACListenerS24S0100000_4;
import Y.ACListenerS39S0200000_4;
import Y.AfS36S0000000_4;
import Y.AfS53S0100000_1;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import com.bytedance.apm.agent.v2.instrumentation.ActivityAgent;
import com.bytedance.ies.ugc.aweme.network.IRetrofitFactory;
import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.IPrivacyDisclaimerUtil;
import com.ss.android.ugc.aweme.PrivacyDisclaimerUtilService;
import com.ss.android.ugc.aweme.creatortools.videogift.VideoGiftApi;
import com.zhiliaoapp.musically.R;
import defpackage.s1;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import kotlin.jvm.internal.AqS154S0100000_4;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class VideoGiftEligibilityActivity extends ActivityC86117Xqz {
    public boolean LJLIL;
    public final Map<Integer, View> LJLJJI = new LinkedHashMap();
    public final C73318Sq2 LJLILLLLZI = new C73318Sq2();
    public String LJLJI = "";

    @Override // X.ActivityC86117Xqz, X.KMV
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJLJJI).clear();
    }

    @Override // X.ActivityC86117Xqz, X.KMV
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
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.creatortools.videogift.VideoGiftEligibilityActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    @Override // X.ActivityC86117Xqz, X.C29S, X.ActivityC45651qj, android.app.Activity
    public final void onDestroy() {
        C65803Ps7.LIZIZ(this);
        this.LJLILLLLZI.dispose();
        super.onDestroy();
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
        boolean z;
        String str;
        AbstractC73672Svk<VideoGiftEligibilityResponse> abstractC73672Svk;
        C65803Ps7.LIZ(this, bundle);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.creatortools.videogift.VideoGiftEligibilityActivity", "onCreate", true);
        activityConfiguration(C25723A7r.LJLIL);
        super.onCreate(bundle);
        Intent intent = getIntent();
        if (intent != null) {
            z = intent.getBooleanExtra("bundle_video_gift_enter_from_notification", false);
        } else {
            z = false;
        }
        this.LJLIL = z;
        Intent intent2 = getIntent();
        if (intent2 == null || (str = C16880lQ.LLJJIJIIJIL(intent2, "bundle_video_gift_previous_page")) == null) {
            str = "";
        }
        this.LJLJI = str;
        supportRequestWindowFeature(10);
        setContentView(R.layout.ck7);
        C252709vu c252709vu = (C252709vu) _$_findCachedViewById(R.id.la4);
        C235119Kp c235119Kp = new C235119Kp();
        String string = getString(R.string.tpq);
        o.LJIIIIZZ(string, "getString(R.string.videogifts_optin_page)");
        C78840Uwu.LJJIZ(c235119Kp, string, new AqS154S0100000_4(this, 1233));
        C234529Ii LIZJ = s1.LIZJ();
        LIZJ.LIZJ = R.raw.icon_question_mark_circle_ltr;
        LIZJ.LIZIZ(new AqS154S0100000_4(this, 1234));
        c235119Kp.LIZIZ(LIZJ);
        c252709vu.setNavActions(c235119Kp);
        IPrivacyDisclaimerUtil LJI = PrivacyDisclaimerUtilService.LJI();
        TuxTextView privacy_text = (TuxTextView) _$_findCachedViewById(R.id.i4o);
        o.LJIIIIZZ(privacy_text, "privacy_text");
        LJI.LIZJ(this, privacy_text, new ACListenerS39S0200000_4(LJI, this, 102), new ACListenerS39S0200000_4(LJI, this, 103), new ACListenerS39S0200000_4(LJI, this, 104));
        C16880lQ.LJJIZ((SY4) _$_findCachedViewById(R.id.ltx), new ACListenerS24S0100000_4(this, 298));
        ((C8ID) _$_findCachedViewById(R.id.dsr)).setVisibility(0);
        _$_findCachedViewById(R.id.ct2).setVisibility(8);
        this.LJLILLLLZI.LIZLLL();
        try {
            if (VideoGiftApi.LIZIZ == null) {
                IRetrofitFactory LIZLLL = RetrofitFactory.LIZLLL();
                String API_URL_PREFIX_SI = EFJ.LIZJ;
                o.LJIIIIZZ(API_URL_PREFIX_SI, "API_URL_PREFIX_SI");
                VideoGiftApi.LIZIZ = (VideoGiftApi.GetGiftEligibilityApi) LIZLLL.create(API_URL_PREFIX_SI).create(VideoGiftApi.GetGiftEligibilityApi.class);
            }
            VideoGiftApi.GetGiftEligibilityApi getGiftEligibilityApi = VideoGiftApi.LIZIZ;
            o.LJI(getGiftEligibilityApi);
            abstractC73672Svk = getGiftEligibilityApi.getGiftEligibilityInfo();
        } catch (ExecutionException e) {
            AbstractC36908Ee8.getCompatibleException(e);
            abstractC73672Svk = C73536StY.LJLIL;
            o.LJIIIIZZ(abstractC73672Svk, "empty()");
        }
        this.LJLILLLLZI.LIZ(abstractC73672Svk.LJJL(T16.LIZ()).LJJJ(C73969T1h.LIZIZ()).LJJJLIIL(new AfS53S0100000_1(this, 92), new AfS36S0000000_4(this, 2)));
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.creatortools.videogift.VideoGiftEligibilityActivity", "onCreate", false);
    }
}

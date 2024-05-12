package com.ss.android.ugc.aweme.ttsvoice.ui;

import X.ActivityC86117Xqz;
import X.C16880lQ;
import X.C188727au;
import X.C1B3;
import X.C34X;
import X.C41177GEb;
import X.C65803Ps7;
import X.C78939UyV;
import X.FMX;
import X.GHC;
import X.InterfaceC27853AwT;
import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import androidx.fragment.app.FragmentManager;
import com.bytedance.apm.agent.v2.instrumentation.ActivityAgent;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.ss.android.ugc.aweme.music.model.Music;
import com.zhiliaoapp.musically.R;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class TTSVoiceDetailsActivity extends ActivityC86117Xqz implements C34X, InterfaceC27853AwT {
    public long LJLIL;
    public final Map<Integer, View> LJLJI = new LinkedHashMap();
    public final ArrayList<GHC> LJLILLLLZI = new ArrayList<>();

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

    @Override // X.InterfaceC27853AwT
    public final String getPageName() {
        return "tts_page";
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
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.ttsvoice.ui.TTSVoiceDetailsActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    @Override // X.ActivityC86117Xqz, android.app.Activity
    public final void finish() {
        super.finish();
        C78939UyV.LJJJJ(this);
    }

    @Override // X.ActivityC86117Xqz, X.C29S, X.ActivityC45651qj, android.app.Activity
    public final void onDestroy() {
        C65803Ps7.LIZIZ(this);
        super.onDestroy();
        C188727au c188727au = new C188727au();
        c188727au.LJI("anchor_type", C16880lQ.LLJJIJIIJIL(getIntent(), "anchor_type"));
        c188727au.LJI("anchor_id", C16880lQ.LLJJIJIIJIL(getIntent(), "voice_id"));
        c188727au.LJI("anchor_name", C16880lQ.LLJJIJIIJIL(getIntent(), "anchor_name"));
        c188727au.LJI("main_anchor_type", C16880lQ.LLJJIJIIJIL(getIntent(), "main_anchor_type"));
        c188727au.LJI("main_anchor_id", C16880lQ.LLJJIJIIJIL(getIntent(), "main_anchor_id"));
        c188727au.LJI("main_anchor_name", C16880lQ.LLJJIJIIJIL(getIntent(), "main_anchor_name"));
        c188727au.LJI("tone_list", C16880lQ.LLJJIJIIJIL(getIntent(), "voice_id"));
        c188727au.LJ(System.currentTimeMillis() - this.LJLIL, "duration");
        FMX.LJIIL("multi_anchor_stay_time", c188727au.LIZ);
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
        C65803Ps7.LIZ(this, bundle);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.ttsvoice.ui.TTSVoiceDetailsActivity", "onCreate", true);
        activityConfiguration(C41177GEb.LJLIL);
        super.onCreate(bundle);
        setContentView(R.layout.bol);
        findViewById(R.id.bs8).setFitsSystemWindows(false);
        this.LJLIL = System.currentTimeMillis();
        String LLJJIJIIJIL = C16880lQ.LLJJIJIIJIL(getIntent(), "voice_id");
        Serializable serializableExtra = getIntent().getSerializableExtra("music_model");
        if (!(serializableExtra instanceof Music)) {
            serializableExtra = null;
        }
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        o.LJIIIIZZ(supportFragmentManager, "supportFragmentManager");
        Bundle bundle2 = new Bundle();
        bundle2.putString("voice_id", LLJJIJIIJIL);
        bundle2.putSerializable("music_model", serializableExtra);
        TTSVoiceDetailsFragment tTSVoiceDetailsFragment = new TTSVoiceDetailsFragment();
        tTSVoiceDetailsFragment.setUserVisibleHint(true);
        tTSVoiceDetailsFragment.setArguments(bundle2);
        C1B3 c1b3 = new C1B3(supportFragmentManager);
        c1b3.LJIIJ(tTSVoiceDetailsFragment, "ttsvoice_detail_fragment_tag", R.id.bs8);
        c1b3.LJIILJJIL();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.ttsvoice.ui.TTSVoiceDetailsActivity", "onCreate", false);
    }

    @Override // X.C34X
    public final void registerActivityOnKeyDownListener(GHC listener) {
        o.LJIIIZ(listener, "listener");
        ArrayList<GHC> arrayList = this.LJLILLLLZI;
        if (!arrayList.contains(listener)) {
            arrayList.add(listener);
        }
    }

    @Override // X.C34X
    public final void unRegisterActivityOnKeyDownListener(GHC listener) {
        o.LJIIIZ(listener, "listener");
        this.LJLILLLLZI.remove(listener);
    }

    @Override // X.ActivityC86117Xqz, X.C29S, android.app.Activity, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (isDestroyed()) {
            return false;
        }
        Iterator<GHC> it = this.LJLILLLLZI.iterator();
        while (it.hasNext()) {
            if (it.next().onKeyDown(i, keyEvent)) {
                return true;
            }
        }
        return super.onKeyDown(i, keyEvent);
    }

    @Override // X.ActivityC86117Xqz, X.KMV, X.ActivityC45651qj, androidx.activity.ComponentActivity, android.app.Activity
    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i2 == -1) {
            setResult(-1, intent);
            finish();
            overridePendingTransition(0, 0);
        }
    }
}

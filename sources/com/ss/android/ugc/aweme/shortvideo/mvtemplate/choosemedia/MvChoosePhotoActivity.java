package com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia;

import X.C5HC;
import X.C65803Ps7;
import X.C6Z7;
import X.GBO;
import X.HA3;
import X.HA4;
import X.HEP;
import X.HEQ;
import X.HER;
import X.InterfaceC144185lG;
import X.InterfaceC45540Hu4;
import X.QD3;
import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import com.bytedance.apm.agent.v2.instrumentation.ActivityAgent;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.o;
import org.greenrobot.eventbus.ThreadMode;

/* loaded from: classes8.dex */
public final class MvChoosePhotoActivity extends GBO implements InterfaceC45540Hu4, HA3 {
    public static final /* synthetic */ int LJLJL = 0;
    public MvChoosePhotoScene LJLJI;
    public final Map<Integer, View> LJLJJLL = new LinkedHashMap();
    public final ArrayList<InterfaceC144185lG> LJLJJI = new ArrayList<>();
    public final ArrayList<C5HC> LJLJJL = new ArrayList<>();

    @Override // X.GBO, X.GB7, X.ActivityC86117Xqz, X.KMV
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJLJJLL).clear();
    }

    @Override // X.GBO, X.GB7, X.ActivityC86117Xqz, X.KMV
    public final View _$_findCachedViewById(int i) {
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLJJLL;
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
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvChoosePhotoActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    @Override // X.InterfaceC45540Hu4
    public final void registerActivityOnKeyDownListenerHead(C5HC listener) {
        o.LJIIIZ(listener, "listener");
    }

    @Override // X.HA3
    public final boolean LJJL() {
        MvChoosePhotoScene mvChoosePhotoScene = this.LJLJI;
        if (mvChoosePhotoScene != null) {
            return mvChoosePhotoScene.LLLLZI;
        }
        o.LJIJI("rootScene");
        throw null;
    }

    @Override // X.HA3
    public final void LJZL() {
        MvChoosePhotoScene mvChoosePhotoScene = this.LJLJI;
        if (mvChoosePhotoScene != null) {
            mvChoosePhotoScene.LLLLZI = false;
        } else {
            o.LJIJI("rootScene");
            throw null;
        }
    }

    @Override // X.HA3
    public final HA4 LLILII() {
        MvChoosePhotoScene mvChoosePhotoScene = this.LJLJI;
        if (mvChoosePhotoScene != null) {
            if (mvChoosePhotoScene.mActivity != null) {
                return mvChoosePhotoScene.LLILII();
            }
            return new HA4(null, null);
        }
        o.LJIJI("rootScene");
        throw null;
    }

    @Override // X.HA3
    public final HA4 getPreDownloadMusicData() {
        MvChoosePhotoScene mvChoosePhotoScene = this.LJLJI;
        if (mvChoosePhotoScene != null) {
            if (mvChoosePhotoScene.mActivity != null) {
                return mvChoosePhotoScene.getPreDownloadMusicData();
            }
            return new HA4(null, null);
        }
        o.LJIJI("rootScene");
        throw null;
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

    @Override // android.app.Activity
    public final void onEnterAnimationComplete() {
        super.onEnterAnimationComplete();
    }

    @Override // X.GBO, X.ActivityC86117Xqz, X.KMV, X.ActivityC45651qj, androidx.activity.ComponentActivity, X.C1AU, android.app.Activity
    public final void onCreate(Bundle bundle) {
        C65803Ps7.LIZ(this, bundle);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvChoosePhotoActivity", "onCreate", true);
        activityConfiguration(HER.LJLIL);
        super.onCreate(bundle);
        overridePendingTransition(R.anim.x, 0);
        if (getIntent().getIntExtra("key_choose_scene", -1) == 24 || getIntent().getIntExtra("key_choose_scene", -1) == 36) {
            setTheme(R.style.ux);
        }
        setContentView(R.layout.es);
        HEP hep = new HEP(this, MvChoosePhotoScene.class);
        hep.LJFF = R.id.dg_;
        hep.LJIIIIZZ = "MvChoosePhotoActivity";
        hep.LJI = false;
        hep.LJII = new HEQ(this);
        hep.LIZ();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvChoosePhotoActivity", "onCreate", false);
    }

    @QD3(threadMode = ThreadMode.MAIN)
    public final void onEvent(C6Z7 albumEvent) {
        o.LJIIIZ(albumEvent, "albumEvent");
        finish();
    }

    @Override // X.InterfaceC45540Hu4
    public final void registerActivityOnKeyDownListener(C5HC listener) {
        o.LJIIIZ(listener, "listener");
        this.LJLJJL.add(listener);
    }

    @Override // X.InterfaceC45540Hu4
    public final void registerActivityResultListener(InterfaceC144185lG listener) {
        o.LJIIIZ(listener, "listener");
        this.LJLJJI.add(listener);
    }

    @Override // X.InterfaceC45540Hu4
    public final void unRegisterActivityOnKeyDownListener(C5HC listener) {
        o.LJIIIZ(listener, "listener");
        this.LJLJJL.remove(listener);
    }

    @Override // X.InterfaceC45540Hu4
    public final void unRegisterActivityResultListener(InterfaceC144185lG listener) {
        o.LJIIIZ(listener, "listener");
        this.LJLJJI.remove(listener);
    }

    @Override // X.HA3
    public final void LJLZ(MusicModel musicModel, String str) {
        MvChoosePhotoScene mvChoosePhotoScene = this.LJLJI;
        if (mvChoosePhotoScene != null) {
            mvChoosePhotoScene.LJLZ(musicModel, str);
        } else {
            o.LJIJI("rootScene");
            throw null;
        }
    }

    @Override // X.ActivityC86117Xqz, X.C29S, android.app.Activity, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        Iterator<C5HC> it = this.LJLJJL.iterator();
        while (it.hasNext()) {
            if (it.next().onKeyDown(i, keyEvent)) {
                return true;
            }
        }
        return super.onKeyDown(i, keyEvent);
    }

    @Override // X.GB7, X.ActivityC86117Xqz, X.KMV, X.ActivityC45651qj, androidx.activity.ComponentActivity, android.app.Activity
    public final void onActivityResult(int i, int i2, Intent intent) {
        Iterator<InterfaceC144185lG> it = this.LJLJJI.iterator();
        while (it.hasNext()) {
            if (it.next().onActivityResult(i, i2, intent)) {
                return;
            }
        }
        super.onActivityResult(i, i2, intent);
    }
}

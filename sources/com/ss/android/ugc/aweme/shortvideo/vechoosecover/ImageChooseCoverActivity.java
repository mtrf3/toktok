package com.ss.android.ugc.aweme.shortvideo.vechoosecover;

import X.C1B3;
import X.C1B6;
import X.C221108m2;
import X.C32151Nz;
import X.C42326GjK;
import X.C44172HVg;
import X.C60903NvH;
import X.C62822Ol8;
import X.C65803Ps7;
import X.C69B;
import X.C6VO;
import X.C6VR;
import X.C6YM;
import X.C78996UzQ;
import X.G8G;
import X.GBO;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.FragmentManager;
import com.bytedance.apm.agent.v2.instrumentation.ActivityAgent;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.zhiliaoapp.musically.R;
import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AqS152S0100000_2;
import kotlin.jvm.internal.AqS168S0100000_2;
import kotlin.jvm.internal.o;

/* loaded from: classes3.dex */
public final class ImageChooseCoverActivity extends GBO implements C6VR {
    public static final /* synthetic */ int LJLJJLL = 0;
    public ImageChooseCoverFragment LJLJJI;
    public final Map<Integer, View> LJLJJL = new LinkedHashMap();
    public final C62822Ol8 LJLJI = C221108m2.LIZIZ(new AqS152S0100000_2(this, 286));

    @Override // X.GBO, X.GB7, X.ActivityC86117Xqz, X.KMV
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJLJJL).clear();
    }

    @Override // X.GBO, X.GB7, X.ActivityC86117Xqz, X.KMV
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
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.shortvideo.vechoosecover.ImageChooseCoverActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public ImageChooseCoverActivity() {
        C6YM.LIZ();
        C69B.LIZ();
        C69B.LIZJ();
    }

    @Override // X.C6VR
    public final VideoPublishEditModel LIZLLL() {
        return (VideoPublishEditModel) this.LJLJI.getValue();
    }

    @Override // X.ActivityC86117Xqz, android.app.Activity
    public final void finish() {
        super.finish();
        overridePendingTransition(R.anim.x, R.anim.y);
    }

    @Override // X.KMV, androidx.activity.ComponentActivity, android.app.Activity
    public final void onBackPressed() {
        boolean z;
        super.onBackPressed();
        ImageChooseCoverFragment imageChooseCoverFragment = this.LJLJJI;
        if (imageChooseCoverFragment != null) {
            C6VO LJFF = C60903NvH.LJIIJJI().LJFF();
            VideoPublishEditModel videoPublishEditModel = imageChooseCoverFragment.LLFII;
            if (videoPublishEditModel != null) {
                if (videoPublishEditModel.getCoverPublishModel().getImageCurrentIndex() != imageChooseCoverFragment.LLD) {
                    z = true;
                } else {
                    z = false;
                }
                LJFF.LJFF(new AqS168S0100000_2(imageChooseCoverFragment, 14), z);
                return;
            }
            o.LJIJI("model");
            throw null;
        }
        o.LJIJI("chooseCoverFragment");
        throw null;
    }

    @Override // X.ActivityC86117Xqz, X.ActivityC45651qj, android.app.Activity
    public final void onResume() {
        C65803Ps7.LIZLLL(this);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.shortvideo.vechoosecover.ImageChooseCoverActivity", "onResume", true);
        super.onResume();
        G8G.LIZ.end("av_image_choose_cover", "onResume end");
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.shortvideo.vechoosecover.ImageChooseCoverActivity", "onResume", false);
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

    @Override // X.C6VR
    public final void LJLLILLLL(boolean z) {
        int i;
        Intent intent = new Intent();
        VideoPublishEditModel model = (VideoPublishEditModel) this.LJLJI.getValue();
        o.LJIIIZ(model, "model");
        intent.putExtra("KEY_IMAGE_CHOOSE_COVER_RESULT", (Serializable) model);
        CreativeModel creativeModel = model.creativeModel;
        o.LJIIIIZZ(creativeModel, "model.creativeModel");
        C78996UzQ.LJJIZ(intent, creativeModel);
        if (z) {
            i = 0;
        } else {
            i = -1;
        }
        setResult(i, intent);
        finish();
    }

    @Override // X.GBO, X.ActivityC86117Xqz, X.KMV, X.ActivityC45651qj, androidx.activity.ComponentActivity, X.C1AU, android.app.Activity
    public final void onCreate(Bundle bundle) {
        C65803Ps7.LIZ(this, bundle);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.shortvideo.vechoosecover.ImageChooseCoverActivity", "onCreate", true);
        super.onCreate(bundle);
        getWindow().addFlags(128);
        getWindow().setSoftInputMode(34);
        C42326GjK c42326GjK = C42326GjK.LIZ;
        Intent intent = getIntent();
        c42326GjK.getClass();
        C42326GjK.LIZJ(this, intent, bundle);
        setContentView(R.layout.ff);
        C44172HVg.LIZLLL(C32151Nz.LJIILJJIL());
        ImageChooseCoverFragment imageChooseCoverFragment = (ImageChooseCoverFragment) getSupportFragmentManager().LJJJIL("ImageChooseCoverFragment");
        if (imageChooseCoverFragment == null) {
            imageChooseCoverFragment = new ImageChooseCoverFragment();
            FragmentManager supportFragmentManager = getSupportFragmentManager();
            C1B3 LIZ = C1B6.LIZ(supportFragmentManager, supportFragmentManager);
            LIZ.LJIIIIZZ(R.id.j71, 1, imageChooseCoverFragment, "ImageChooseCoverFragment");
            LIZ.LJIILJJIL();
        }
        this.LJLJJI = imageChooseCoverFragment;
        G8G.LIZ.step("av_image_choose_cover", "onCreate end");
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.shortvideo.vechoosecover.ImageChooseCoverActivity", "onCreate", false);
    }

    @Override // X.ActivityC86117Xqz, X.ActivityC45651qj, androidx.activity.ComponentActivity, X.C1AU, android.app.Activity
    public final void onSaveInstanceState(Bundle outState) {
        o.LJIIIZ(outState, "outState");
        super.onSaveInstanceState(outState);
        C42326GjK c42326GjK = C42326GjK.LIZ;
        getIntent();
        c42326GjK.getClass();
        C42326GjK.LJI(this, outState);
    }
}

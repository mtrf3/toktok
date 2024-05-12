package com.ss.android.ugc.aweme.fe.method.upload;

import X.ActivityC86117Xqz;
import X.C16880lQ;
import X.C65803Ps7;
import Y.ACListenerS24S0100000_4;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.VideoView;
import com.bytedance.apm.agent.v2.instrumentation.ActivityAgent;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.fe.method.upload.PreviewUploadActivity;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes5.dex */
public final class PreviewUploadActivity extends ActivityC86117Xqz {
    public String LJLIL;
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
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.fe.method.upload.PreviewUploadActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    @Override // X.ActivityC86117Xqz, X.C29S, X.ActivityC45651qj, android.app.Activity
    public final void onDestroy() {
        C65803Ps7.LIZIZ(this);
        super.onDestroy();
        if (_$_findCachedViewById(R.id.n9f) != null) {
            ((VideoView) _$_findCachedViewById(R.id.n9f)).suspend();
        }
    }

    @Override // X.ActivityC86117Xqz, X.ActivityC45651qj, android.app.Activity
    public final void onResume() {
        C65803Ps7.LIZLLL(this);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.fe.method.upload.PreviewUploadActivity", "onResume", true);
        super.onResume();
        if (_$_findCachedViewById(R.id.n9f) != null && !((VideoView) _$_findCachedViewById(R.id.n9f)).isPlaying()) {
            ((VideoView) _$_findCachedViewById(R.id.n9f)).start();
        }
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.fe.method.upload.PreviewUploadActivity", "onResume", false);
    }

    @Override // X.ActivityC86117Xqz, X.C29S, X.ActivityC45651qj, android.app.Activity
    public final void onStop() {
        C65803Ps7.LJFF(this);
        super.onStop();
        if (_$_findCachedViewById(R.id.n9f) != null && ((VideoView) _$_findCachedViewById(R.id.n9f)).isPlaying()) {
            ((VideoView) _$_findCachedViewById(R.id.n9f)).pause();
        }
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
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.fe.method.upload.PreviewUploadActivity", "onCreate", true);
        super.onCreate(bundle);
        setContentView(R.layout.ajg);
        String LLJJIJIIJIL = C16880lQ.LLJJIJIIJIL(getIntent(), "filePath");
        this.LJLIL = LLJJIJIIJIL;
        if (LLJJIJIIJIL != null) {
            VideoView videoView = (VideoView) _$_findCachedViewById(R.id.n9f);
            videoView.setVisibility(0);
            videoView.setVideoPath(this.LJLIL);
            videoView.setOnPreparedListener(new MediaPlayer.OnPreparedListener() { // from class: X.9aI
                @Override // android.media.MediaPlayer.OnPreparedListener
                public final void onPrepared(MediaPlayer mediaPlayer) {
                    PreviewUploadActivity.this._$_findCachedViewById(R.id.muq).setVisibility(0);
                    PreviewUploadActivity.this._$_findCachedViewById(R.id.mup).setVisibility(0);
                    mediaPlayer.setLooping(true);
                }
            });
        }
        C16880lQ.LJJJJI((TuxTextView) _$_findCachedViewById(R.id.muq), new ACListenerS24S0100000_4(this, 237));
        C16880lQ.LJJJJI((TuxTextView) _$_findCachedViewById(R.id.mup), new ACListenerS24S0100000_4(this, 238));
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.fe.method.upload.PreviewUploadActivity", "onCreate", false);
    }
}

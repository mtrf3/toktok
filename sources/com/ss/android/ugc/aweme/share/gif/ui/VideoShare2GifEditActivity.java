package com.ss.android.ugc.aweme.share.gif.ui;

import X.AYA;
import X.ActivityC86117Xqz;
import X.C16880lQ;
import X.C39579Fg7;
import X.C61712OJw;
import X.C61713OJx;
import X.C65803Ps7;
import X.FMX;
import Y.ACListenerS22S0101000_3;
import Y.AObjectS12S0001000_7;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import com.bytedance.apm.agent.v2.instrumentation.ActivityAgent;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.ss.android.ugc.aweme.services.IDLCallbackS60S0100000_7;
import com.ss.android.ugc.aweme.share.gif.VideoShare2GifEditContext;
import com.ss.android.ugc.aweme.utils.Au2S16S0100000_7;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;

/* loaded from: classes8.dex */
public class VideoShare2GifEditActivity extends ActivityC86117Xqz {
    public static final /* synthetic */ int LJLJI = 0;
    public boolean LJLIL = true;
    public VideoShare2GifEditContext LJLILLLLZI;

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
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.share.gif.ui.VideoShare2GifEditActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
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
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.share.gif.ui.VideoShare2GifEditActivity", "onCreate", true);
        activityConfiguration(new AObjectS12S0001000_7(3, 1));
        super.onCreate(bundle);
        setContentView(R.layout.fs);
        C61713OJx LIZJ = C61712OJw.LIZJ(this);
        LIZJ.LJII(R.attr.cl);
        LIZJ.LIZJ();
        AYA.LIZIZ(findViewById(R.id.kej));
        View findViewById = findViewById(R.id.aeg);
        if (findViewById != null) {
            C16880lQ.LJIIJ(new ACListenerS22S0101000_3(3, this, 4), findViewById);
        }
        VideoShare2GifEditContext videoShare2GifEditContext = (VideoShare2GifEditContext) getIntent().getParcelableExtra("extra_data");
        this.LJLILLLLZI = videoShare2GifEditContext;
        if (videoShare2GifEditContext == null || !C39579Fg7.LIZIZ(videoShare2GifEditContext.videoPath)) {
            finish();
        }
        C16880lQ.LJIIJ(new Au2S16S0100000_7(this, 10), findViewById(R.id.h0u));
        if (getSupportFragmentManager().LJJJI(R.id.dd8) == null) {
            AVExternalServiceImpl.LIZ().asyncService(this, "Share2Gif", new IDLCallbackS60S0100000_7(this, 3));
        }
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.share.gif.ui.VideoShare2GifEditActivity", "onCreate", false);
    }

    public void resolveUiClickEvent(View view) {
        if (view.getId() == R.id.aeg) {
            FMX.LJIIL("gif_quit_editing", new HashMap());
            finish();
        }
    }

    @Override // X.ActivityC86117Xqz, X.KMV, X.ActivityC45651qj, androidx.activity.ComponentActivity, android.app.Activity
    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 1 && i2 == -1) {
            finish();
        }
    }

    public static void LLFII(Context context, String str, String str2, boolean z, String str3, String str4, String str5) {
        Intent intent = new Intent(context, (Class<?>) VideoShare2GifEditActivity.class);
        VideoShare2GifEditContext videoShare2GifEditContext = new VideoShare2GifEditContext();
        videoShare2GifEditContext.awemeId = str;
        videoShare2GifEditContext.logPb = str5;
        videoShare2GifEditContext.enterFrom = str4;
        videoShare2GifEditContext.authorId = str2;
        videoShare2GifEditContext.videoPath = str3;
        videoShare2GifEditContext.isAddWatermark = z;
        intent.putExtra("extra_data", videoShare2GifEditContext);
        C16880lQ.LIZJ(context, intent);
    }
}

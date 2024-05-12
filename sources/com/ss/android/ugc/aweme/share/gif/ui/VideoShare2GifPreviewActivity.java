package com.ss.android.ugc.aweme.share.gif.ui;

import X.AYA;
import X.ActivityC86117Xqz;
import X.C16880lQ;
import X.C17N;
import X.C43165Gwr;
import X.C43251GyF;
import X.C45413Hs1;
import X.C4LD;
import X.C4PT;
import X.C61712OJw;
import X.C61713OJx;
import X.C61898ORa;
import X.C62846OlW;
import X.C65803Ps7;
import X.C78765Uvh;
import X.InterfaceC62225ObV;
import X.KL2;
import X.OYR;
import X.ViewOnClickListenerC13880ga;
import X.W5I;
import Y.ACListenerS26S0101000_8;
import Y.ACListenerS29S1200000_10;
import Y.AObjectS30S0000000_7;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.apm.agent.v2.instrumentation.ActivityAgent;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.ss.android.ugc.aweme.share.gif.VideoShare2GifEditContext;
import com.zhiliaoapp.musically.R;
import java.io.File;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public class VideoShare2GifPreviewActivity extends ActivityC86117Xqz implements GenericLifecycleObserver {
    public static final /* synthetic */ int LJLJJLL = 0;
    public C62846OlW LJLIL;
    public LinearLayout LJLILLLLZI;
    public LinearLayout LJLJI;
    public VideoShare2GifEditContext LJLJJI;
    public boolean LJLJJL;

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

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
    }

    @Override // X.ActivityC86117Xqz, android.app.Activity, android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.share.gif.ui.VideoShare2GifPreviewActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    @Override // X.ActivityC86117Xqz, X.ActivityC45651qj, android.app.Activity
    public final void onResume() {
        C65803Ps7.LIZLLL(this);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.share.gif.ui.VideoShare2GifPreviewActivity", "onResume", true);
        super.onResume();
        if (this.LJLJJL) {
            setResult(-1);
            finish();
        }
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.share.gif.ui.VideoShare2GifPreviewActivity", "onResume", false);
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
        InterfaceC62225ObV LIZ;
        C65803Ps7.LIZ(this, bundle);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.share.gif.ui.VideoShare2GifPreviewActivity", "onCreate", true);
        activityConfiguration(new AObjectS30S0000000_7(3));
        super.onCreate(bundle);
        setContentView(R.layout.fr);
        C61713OJx LIZJ = C61712OJw.LIZJ(this);
        LIZJ.LJII(R.attr.cl);
        LIZJ.LIZJ();
        AYA.LIZIZ(findViewById(R.id.kej));
        this.LJLIL = (C62846OlW) findViewById(R.id.f3q);
        this.LJLILLLLZI = (LinearLayout) findViewById(R.id.g62);
        this.LJLJI = (LinearLayout) findViewById(R.id.g63);
        View findViewById = findViewById(R.id.m0_);
        if (findViewById != null) {
            C16880lQ.LJIIJ(new ACListenerS26S0101000_8(2, this, 2), findViewById);
        }
        VideoShare2GifEditContext videoShare2GifEditContext = (VideoShare2GifEditContext) getIntent().getParcelableExtra("extra_data");
        this.LJLJJI = videoShare2GifEditContext;
        if (videoShare2GifEditContext == null) {
            finish();
        }
        this.LJLIL.setClipToOutline(true);
        this.LJLIL.setOutlineProvider(new C43251GyF(C17N.LJIILL(4.0d)));
        VideoShare2GifEditContext videoShare2GifEditContext2 = this.LJLJJI;
        if (videoShare2GifEditContext2 != null && !TextUtils.isEmpty(videoShare2GifEditContext2.gifImagePath)) {
            VideoShare2GifEditContext videoShare2GifEditContext3 = this.LJLJJI;
            if (videoShare2GifEditContext3.targetHeight > 0 && videoShare2GifEditContext3.targetWidth > 0) {
                ViewGroup.LayoutParams layoutParams = this.LJLIL.getLayoutParams();
                VideoShare2GifEditContext videoShare2GifEditContext4 = this.LJLJJI;
                layoutParams.width = videoShare2GifEditContext4.targetWidth;
                layoutParams.height = videoShare2GifEditContext4.targetHeight;
                this.LJLIL.setLayoutParams(layoutParams);
                Uri fromFile = Uri.fromFile(new File(this.LJLJJI.gifImagePath));
                W5I.LIZ().LIZIZ(fromFile);
                C62846OlW c62846OlW = this.LJLIL;
                String uri = fromFile.toString();
                VideoShare2GifEditContext videoShare2GifEditContext5 = this.LJLJJI;
                C78765Uvh.LIZJ(c62846OlW, uri, videoShare2GifEditContext5.targetWidth, videoShare2GifEditContext5.targetHeight, true);
            }
        }
        String[] sourceList = C4LD.LIZIZ.LJJJJJL();
        if (C4PT.LIZ()) {
            o.LJIIIZ(sourceList, "sourceList");
            C61898ORa.LJJIIJZLJL(new C45413Hs1(), sourceList);
        }
        if (sourceList == null || sourceList.length <= 0) {
            LinearLayout linearLayout = this.LJLJI;
            if (linearLayout != null) {
                linearLayout.setVisibility(8);
            }
        } else {
            for (String str : sourceList) {
                if (!TextUtils.isEmpty(str) && (LIZ = OYR.LIZ(this, str)) != null) {
                    String label = LIZ.label();
                    Drawable LIZJ2 = LIZ.LIZJ(this);
                    ACListenerS29S1200000_10 aCListenerS29S1200000_10 = new ACListenerS29S1200000_10(this, LIZ, str, 1);
                    LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
                    int LIZJ3 = (int) KL2.LIZJ(this, 10.0f);
                    layoutParams2.leftMargin = LIZJ3;
                    layoutParams2.setMarginStart(LIZJ3);
                    C43165Gwr c43165Gwr = new C43165Gwr(this);
                    c43165Gwr.setLayoutParams(layoutParams2);
                    c43165Gwr.setOnClickListener(new ViewOnClickListenerC13880ga(aCListenerS29S1200000_10));
                    if (label != null) {
                        c43165Gwr.setText(label);
                    }
                    if (LIZJ2 != null) {
                        c43165Gwr.setIcon(LIZJ2);
                    }
                    if (LIZ.LIZLLL(this)) {
                        this.LJLILLLLZI.addView(c43165Gwr);
                    }
                }
            }
        }
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.share.gif.ui.VideoShare2GifPreviewActivity", "onCreate", false);
    }
}

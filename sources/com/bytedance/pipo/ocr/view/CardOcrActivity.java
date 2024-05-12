package com.bytedance.pipo.ocr.view;

import X.AnonymousClass064;
import X.C140575fR;
import X.C16880lQ;
import X.C65803Ps7;
import X.C80012Vai;
import X.C86321XuH;
import X.C86819Y5n;
import X.Y5K;
import X.Y5L;
import X.Y5O;
import Y.ARunnableS16S1100000_15;
import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Resources;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.os.Build;
import android.os.Vibrator;
import android.util.TypedValue;
import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.android.livesdk.livesetting.level.LiveBarrageReleasePlayerTimeSetting;
import com.bytedance.pipo.ocr.bean.PipoOcrResult;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.ss.android.ugc.bytex.pthread.base.proxy.PthreadTimer;
import com.zhiliaoapp.musically.R;
import ij2.a;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class CardOcrActivity extends Y5K {
    public AppCompatImageView LJZ;
    public C140575fR LJZI;
    public AppCompatImageView LJZL;
    public View LL;
    public View LLD;
    public final double LLF = 0.229d;
    public final double LLFF = 0.075d;
    public final long LLFFF = LiveBarrageReleasePlayerTimeSetting.DEFAULT;
    public final long LLFII = 500;
    public PthreadTimer LLFZ = new PthreadTimer("CardOcrActivity");
    public String LLI;
    public C86321XuH LLIFFJFJJ;

    @Override // X.Y5K, android.hardware.SensorEventListener
    public final void onAccuracyChanged(Sensor sensor, int i) {
    }

    @Override // X.Y5K, X.C29S, X.ActivityC45651qj, android.app.Activity
    public final void onDestroy() {
        C65803Ps7.LIZIZ(this);
        super.onDestroy();
    }

    @Override // X.C29S, X.ActivityC45651qj, android.app.Activity
    public final void onStart() {
        C65803Ps7.LJ(this);
        super.onStart();
    }

    @Override // X.Y5K
    public final void LJII() {
        View view = this.LLD;
        if (view != null) {
            ConstraintLayout constraintLayout = (ConstraintLayout) findViewById(R.id.b5q);
            AnonymousClass064 anonymousClass064 = new AnonymousClass064();
            anonymousClass064.LJII(constraintLayout);
            constraintLayout.addView(view);
            anonymousClass064.LJIIL(view.getId(), -2);
            anonymousClass064.LJIIJ(view.getId(), -2);
            anonymousClass064.LJIIIIZZ(view.getId(), 6, 0, 6);
            anonymousClass064.LJIIIIZZ(view.getId(), 7, 0, 7);
            anonymousClass064.LJIIIIZZ(view.getId(), 3, 0, 3);
            anonymousClass064.LJIIIIZZ(view.getId(), 4, 0, 4);
            anonymousClass064.LIZIZ(constraintLayout);
        }
    }

    @Override // X.Y5K
    public final void LJIJ() {
        View view = this.LLD;
        if (view != null) {
            C16880lQ.LJLZ(view, (ConstraintLayout) findViewById(R.id.b5q));
        }
    }

    @Override // X.Y5K
    public final void LLILIL() {
        try {
            this.LLFZ.cancel();
        } catch (Throwable unused) {
        }
        super.LLILIL();
    }

    @Override // X.Y5K
    public final void LLILLJJLI() {
        super.LLILLJJLI();
        LLIIIZ().setVisibility(0);
        try {
            this.LLFZ.cancel();
        } catch (Throwable unused) {
        }
        PthreadTimer pthreadTimer = new PthreadTimer("CardOcrActivity");
        pthreadTimer.schedule(new C80012Vai(this), this.LLFFF);
        this.LLFZ = pthreadTimer;
    }

    @Override // X.Y5K, X.ActivityC45651qj, android.app.Activity
    public final void onPause() {
        C65803Ps7.LIZJ(this);
        LLIIIZ().LIZ();
        Y5O y5o = this.LJLLI;
        if (y5o != null) {
            y5o.LIZJ();
            try {
                this.LLFZ.cancel();
            } catch (Throwable unused) {
            }
            super.onPause();
            return;
        }
        o.LJIJI("mCaptureExtender");
        throw null;
    }

    @Override // X.Y5K, X.ActivityC45651qj, android.app.Activity
    public final void onResume() {
        C65803Ps7.LIZLLL(this);
        super.onResume();
        if (Build.VERSION.SDK_INT >= 23) {
            LLIILII();
        } else {
            LLIIIZ().LIZJ();
        }
        try {
            this.LLFZ.cancel();
        } catch (Throwable unused) {
        }
        PthreadTimer pthreadTimer = new PthreadTimer("CardOcrActivity");
        pthreadTimer.schedule(new C80012Vai(this), this.LLFFF);
        this.LLFZ = pthreadTimer;
    }

    @Override // X.C29S, X.ActivityC45651qj, android.app.Activity
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

    @Override // X.Y5K
    public final void LLJILJILJ(String str) {
        runOnUiThread(new ARunnableS16S1100000_15(this, str, 1));
    }

    public final int LLJJJ(float f) {
        Resources resources = getResources();
        o.LJIIIIZZ(resources, "resources");
        return (int) TypedValue.applyDimension(1, f, resources.getDisplayMetrics());
    }

    public final Activity LLJJJIL(Context context) {
        if (context instanceof Activity) {
            return (Activity) context;
        }
        if (context instanceof ContextWrapper) {
            return LLJJJIL(((ContextWrapper) context).getBaseContext());
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:67:0x03bd, code lost:
    
        if (r7 != null) goto L64;
     */
    @Override // X.Y5K, X.ActivityC45651qj, androidx.activity.ComponentActivity, X.C1AU, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onCreate(android.os.Bundle r22) {
        /*
            Method dump skipped, instructions count: 1080
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.pipo.ocr.view.CardOcrActivity.onCreate(android.os.Bundle):void");
    }

    @Override // X.Y5K, android.hardware.SensorEventListener
    public final void onSensorChanged(SensorEvent sensorEvent) {
        float[] fArr;
        if (sensorEvent != null && (fArr = sensorEvent.values) != null) {
            float f = fArr[0];
            if (!this.LJLLLL) {
                if (f > 300) {
                    View view = this.LL;
                    if (view != null) {
                        view.setVisibility(4);
                    }
                    AppCompatImageView appCompatImageView = this.LJZL;
                    if (appCompatImageView != null) {
                        appCompatImageView.setVisibility(4);
                        return;
                    } else {
                        o.LJIJI("mOcrFlashButton");
                        throw null;
                    }
                }
                View view2 = this.LL;
                if (view2 != null) {
                    view2.setVisibility(0);
                }
                AppCompatImageView appCompatImageView2 = this.LJZL;
                if (appCompatImageView2 != null) {
                    appCompatImageView2.setVisibility(0);
                    return;
                } else {
                    o.LJIJI("mOcrFlashButton");
                    throw null;
                }
            }
            View view3 = this.LL;
            if (view3 != null) {
                view3.setVisibility(0);
            }
            AppCompatImageView appCompatImageView3 = this.LJZL;
            if (appCompatImageView3 != null) {
                appCompatImageView3.setVisibility(0);
            } else {
                o.LJIJI("mOcrFlashButton");
                throw null;
            }
        }
    }

    @Override // X.Y5K
    public final void LLIIJI(int i, int i2, String str, PipoOcrResult pipoOcrResult, String type) {
        PipoOcrResult pipoOcrResult2 = pipoOcrResult;
        o.LJIIIZ(type, "type");
        if (i == 1) {
            if (pipoOcrResult2 == null) {
                pipoOcrResult2 = new PipoOcrResult(null, 255);
            }
            C86819Y5n c86819Y5n = new C86819Y5n(this);
            a.LJIJ.getClass();
            a.LJIIZILJ = 0;
            long j = this.LLFII;
            Object LLILIL = C16880lQ.LLILIL(this, "vibrator");
            if (LLILIL != null) {
                ((Vibrator) LLILIL).vibrate(j);
                runOnUiThread(new Y5L(this, pipoOcrResult2, false, type, c86819Y5n));
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type android.os.Vibrator");
        }
        super.LLIIJI(i, i2, str, pipoOcrResult2, type);
    }
}

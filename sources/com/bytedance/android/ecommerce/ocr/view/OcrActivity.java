package com.bytedance.android.ecommerce.ocr.view;

import X.C03880Dg;
import X.C140575fR;
import X.C16880lQ;
import X.C39519Ff9;
import X.C65300Pk0;
import X.C65803Ps7;
import X.C72868Sim;
import X.C82951Wh1;
import X.DialogC25755A8x;
import X.Y5K;
import X.Y5N;
import X.Y5O;
import X.Y5V;
import X.Y6E;
import Y.IDCListenerS135S0100000;
import Y.IDDListenerS396S0100000_15;
import Y.IDRunnableS85S0100000;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorManager;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.android.ecommerce.ocr.view.OcrActivity;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.zhiliaoapp.musically.R;
import ij2.a;
import kotlin.jvm.internal.o;

/* loaded from: classes.dex */
public final class OcrActivity extends Y5K {
    public C72868Sim LJZ;
    public C140575fR LJZI;
    public FrameLayout LJZL;
    public ImageView LL;
    public DialogC25755A8x LLD;

    @Override // X.Y5K, android.hardware.SensorEventListener
    public final void onAccuracyChanged(Sensor sensor, int i) {
    }

    @Override // X.C29S, X.ActivityC45651qj, android.app.Activity
    public final void onStart() {
        C65803Ps7.LJ(this);
        super.onStart();
    }

    @Override // X.Y5K
    public final void LJII() {
        if (this.LLD == null) {
            this.LLD = new DialogC25755A8x(this);
        }
        DialogC25755A8x dialogC25755A8x = this.LLD;
        if (dialogC25755A8x == null || new C03880Dg(2).LIZJ(300000, "com/bytedance/pipo/ocr/view/loading/SimpleLoadingDialog", "show", dialogC25755A8x, new Object[0], "void", new C65300Pk0(false, "()V", "-1059943249590976427")).LIZ) {
            return;
        }
        dialogC25755A8x.show();
    }

    @Override // X.Y5K
    public final void LJIJ() {
        DialogC25755A8x dialogC25755A8x = this.LLD;
        if (dialogC25755A8x != null) {
            dialogC25755A8x.dismiss();
        }
    }

    @Override // X.Y5K
    public final void LLILIL() {
        super.LLILIL();
        C140575fR c140575fR = this.LJZI;
        if (c140575fR != null) {
            c140575fR.setVisibility(4);
        } else {
            o.LJIJI("mOcrScanView");
            throw null;
        }
    }

    @Override // X.Y5K
    public final void LLILLJJLI() {
        super.LLILLJJLI();
        LLIIIZ().setVisibility(0);
        C140575fR c140575fR = this.LJZI;
        if (c140575fR != null) {
            c140575fR.setVisibility(0);
            FrameLayout frameLayout = this.LJZL;
            if (frameLayout != null) {
                frameLayout.setVisibility(0);
                return;
            } else {
                o.LJIJI("mOcrRectangle");
                throw null;
            }
        }
        o.LJIJI("mOcrScanView");
        throw null;
    }

    @Override // X.Y5K, X.C29S, X.ActivityC45651qj, android.app.Activity
    public final void onDestroy() {
        C65803Ps7.LIZIZ(this);
        DialogC25755A8x dialogC25755A8x = this.LLD;
        if (dialogC25755A8x != null) {
            dialogC25755A8x.dismiss();
        }
        super.onDestroy();
    }

    @Override // X.Y5K, X.ActivityC45651qj, android.app.Activity
    public final void onPause() {
        C65803Ps7.LIZJ(this);
        LLIIIZ().LIZ();
        Y5O y5o = this.LJLLI;
        if (y5o != null) {
            y5o.LIZJ();
            super.onPause();
        } else {
            o.LJIJI("mCaptureExtender");
            throw null;
        }
    }

    @Override // X.Y5K, X.ActivityC45651qj, android.app.Activity
    public final void onResume() {
        C65803Ps7.LIZLLL(this);
        super.onResume();
        if (Build.VERSION.SDK_INT >= 23) {
            LLIILII();
            return;
        }
        LLIIIZ().LIZJ();
        Y5O y5o = this.LJLLI;
        if (y5o != null) {
            Y5N y5n = y5o.LIZIZ;
            y5n.LJLJL = 0;
            y5n.LJLJI = 0;
            y5n.LJLJJI = 0;
            y5n.LJLJJL = 0;
            Sensor sensor = y5n.LJLILLLLZI;
            if (sensor == null) {
                return;
            }
            SensorManager sensorManager = y5n.LJLIL;
            C39519Ff9 LIZJ = new C03880Dg(2).LIZJ(100700, "android/hardware/SensorManager", "registerListener", sensorManager, new Object[]{y5n, sensor, 3}, "boolean", new C65300Pk0(false, "(Landroid/hardware/SensorEventListener;Landroid/hardware/Sensor;I)Z", "1967622647663670777"));
            if (LIZJ.LIZ) {
                ((Boolean) LIZJ.LIZIZ).booleanValue();
                return;
            } else {
                sensorManager.registerListener(y5n, sensor, 3);
                return;
            }
        }
        o.LJIJI("mCaptureExtender");
        throw null;
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

    @Override // X.Y5K, android.app.Activity
    public final void finish() {
        super.finish();
    }

    @Override // X.Y5K, X.ActivityC45651qj, androidx.activity.ComponentActivity, X.C1AU, android.app.Activity
    public final void onCreate(Bundle bundle) {
        C65803Ps7.LIZ(this, bundle);
        supportRequestWindowFeature(1);
        super.onCreate(bundle);
        setContentView(R.layout.ev);
        View findViewById = findViewById(R.id.ed4);
        o.LJIIIIZZ(findViewById, "findViewById(R.id.id_camera_preview)");
        this.LJLL = (Y5V) findViewById;
        View findViewById2 = findViewById(R.id.h9f);
        o.LJIIIIZZ(findViewById2, "findViewById(R.id.ocr_title_view)");
        this.LJZ = (C72868Sim) findViewById2;
        View findViewById3 = findViewById(R.id.edc);
        o.LJIIIIZZ(findViewById3, "findViewById(R.id.id_ocr_scan_view)");
        this.LJZI = (C140575fR) findViewById3;
        View findViewById4 = findViewById(R.id.eda);
        o.LJIIIIZZ(findViewById4, "findViewById(R.id.id_ocr_rectangle)");
        this.LJZL = (FrameLayout) findViewById4;
        View findViewById5 = findViewById(R.id.h9e);
        o.LJIIIIZZ(findViewById5, "findViewById(R.id.ocr_iv_flashlight)");
        this.LL = (ImageView) findViewById5;
        LLIIIZ().LLIFFJFJJ = this;
        LLIIIZ().LLI = new Y6E() { // from class: X.1IX
            @Override // X.Y6E
            public final void LIZ() {
            }

            @Override // X.Y6E
            public final void LIZIZ() {
            }

            @Override // X.Y6E
            public final void LIZLLL() {
            }

            @Override // X.Y6E
            public final void LJ(Exception error) {
                o.LJIIIZ(error, "error");
            }

            @Override // X.Y6E
            public final void LIZJ() {
                OcrActivity ocrActivity = OcrActivity.this;
                FrameLayout frameLayout = ocrActivity.LJZL;
                if (frameLayout != null) {
                    OcrActivity.this.LLIIIZ().LLFZ = ocrActivity.LLIIIILZ(frameLayout);
                    OcrActivity.this.LLIIIZ().LJI();
                } else {
                    o.LJIJI("mOcrRectangle");
                    throw null;
                }
            }
        };
        ImageView imageView = this.LL;
        if (imageView != null) {
            C16880lQ.LJIILLIIL(imageView, new IDCListenerS135S0100000(this, 55));
            LLIIIZ().setKeepScreenOn(true);
            TextView ocrHintText = (TextView) findViewById(R.id.ed_);
            o.LJIIIIZZ(ocrHintText, "ocrHintText");
            ocrHintText.setText(C82951Wh1.LIZ("pipo_payin_instruction_OCR_scan_notice"));
            C72868Sim c72868Sim = this.LJZ;
            if (c72868Sim != null) {
                c72868Sim.setPhotoPickerListener(new IDCListenerS135S0100000(this, 56));
                C72868Sim c72868Sim2 = this.LJZ;
                if (c72868Sim2 != null) {
                    c72868Sim2.setBackClickListener(new IDCListenerS135S0100000(this, 57));
                    C72868Sim c72868Sim3 = this.LJZ;
                    if (c72868Sim3 != null) {
                        c72868Sim3.post(new IDRunnableS85S0100000(this, 72));
                        Y5V y5v = this.LJLL;
                        if (y5v != null) {
                            y5v.getViewTreeObserver().addOnPreDrawListener(new IDDListenerS396S0100000_15(this, 2));
                            a.LJIJ.getClass();
                            a.LJIIIIZZ = 0L;
                            a.LJIIIZ = 0L;
                            a.LJIIJ = 0L;
                            a.LJIIL = false;
                            return;
                        }
                        o.LJIJI("mOcrCameraPreview");
                        throw null;
                    }
                    o.LJIJI("mOcrTitleView");
                    throw null;
                }
                o.LJIJI("mOcrTitleView");
                throw null;
            }
            o.LJIJI("mOcrTitleView");
            throw null;
        }
        o.LJIJI("ocrFlashLight");
        throw null;
    }

    @Override // X.Y5K, android.hardware.SensorEventListener
    public final void onSensorChanged(SensorEvent sensorEvent) {
        float[] fArr;
        Float valueOf;
        if (sensorEvent != null && (fArr = sensorEvent.values) != null && (valueOf = Float.valueOf(fArr[0])) != null) {
            if (!this.LJLLLL) {
                if (valueOf.floatValue() > 300) {
                    ImageView imageView = this.LL;
                    if (imageView != null) {
                        imageView.setVisibility(4);
                        return;
                    } else {
                        o.LJIJI("ocrFlashLight");
                        throw null;
                    }
                }
                ImageView imageView2 = this.LL;
                if (imageView2 != null) {
                    imageView2.setVisibility(0);
                    return;
                } else {
                    o.LJIJI("ocrFlashLight");
                    throw null;
                }
            }
            ImageView imageView3 = this.LL;
            if (imageView3 != null) {
                imageView3.setVisibility(0);
            } else {
                o.LJIJI("ocrFlashLight");
                throw null;
            }
        }
    }
}

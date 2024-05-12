package com.byted.cast.usbsource.usbdisplaysource.presentation;

import X.X1D;
import android.app.Presentation;
import android.content.Context;
import android.opengl.GLSurfaceView;
import android.os.Bundle;
import android.view.Display;
import android.view.MotionEvent;
import android.widget.Button;
import com.byted.cast.usbsource.usbcommon.Logger;

/* loaded from: classes29.dex */
public final class DemoPresentation extends Presentation {
    public Button mExplodeButton;
    public final Logger mLogger;
    public CubeRenderer mRenderer;
    public GLSurfaceView mSurfaceView;

    @Override // android.app.Dialog
    public void onCreate(Bundle bundle) {
    }

    @Override // android.app.Dialog
    public boolean onTouchEvent(MotionEvent motionEvent) {
        Logger logger = this.mLogger;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Received touch event: ");
        LIZ.append(motionEvent);
        logger.log(X1D.LIZIZ(LIZ));
        return super.onTouchEvent(motionEvent);
    }

    public DemoPresentation(Context context, Display display, Logger logger) {
        super(context, display);
        this.mLogger = logger;
    }
}

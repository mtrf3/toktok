package X;

import android.graphics.Rect;
import android.hardware.Camera;
import android.util.Size;
import android.view.MotionEvent;
import com.bytedance.android.livesdk.broadcast.LiveCoverManualFocusEvent;
import com.bytedance.android.livesdk.livesetting.pullstream.LiveNetAdaptiveHurryTimeSetting;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class Y5A extends SJC {
    public final /* synthetic */ Y59 LJLIL;

    public Y5A(Y59 y59) {
        this.LJLIL = y59;
    }

    @Override // X.SJC, android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        Camera.Parameters parameters;
        if (motionEvent != null) {
            Y59 y59 = this.LJLIL;
            y59.getClass();
            DataChannel dataChannel = y59.LJLILLLLZI;
            if (dataChannel != null) {
                dataChannel.qv0(LiveCoverManualFocusEvent.class, motionEvent);
                float x = motionEvent.getX();
                float y = motionEvent.getY();
                float LIZ = B9K.LIZ(y59.getContext(), 65.0f) / C81185Vtd.LIZLLL();
                float f = LiveNetAdaptiveHurryTimeSetting.DEFAULT;
                int i = (int) (LIZ * f);
                Size size = y59.LJLJJI;
                if (size != null) {
                    int width = size.getWidth();
                    if (y59.LJLJJI != null) {
                        float f2 = 1000;
                        int height = (int) (((y / r0.getHeight()) * f) - f2);
                        float f3 = width;
                        int i2 = (int) ((((f3 - x) / f3) * f) - f2);
                        int i3 = i / 2;
                        int LJJIIZ = C78609UtB.LJJIIZ(height - i3, -1000, 1000);
                        int LJJIIZ2 = C78609UtB.LJJIIZ(i2 - i3, -1000, 1000);
                        Rect rect = new Rect(LJJIIZ, LJJIIZ2, C78609UtB.LJJIIZ(LJJIIZ + i, -1000, 1000), C78609UtB.LJJIIZ(i + LJJIIZ2, -1000, 1000));
                        Y58 cameraProxy = y59.getCameraProxy();
                        cameraProxy.getClass();
                        try {
                            Camera camera = cameraProxy.LIZJ;
                            if (camera != null) {
                                camera.cancelAutoFocus();
                            }
                        } catch (RuntimeException e) {
                            C0NB.LJI("LiveCoverCameraProxy", e);
                        }
                        Camera camera2 = cameraProxy.LIZJ;
                        if (camera2 != null && (parameters = camera2.getParameters()) != null) {
                            if (parameters.getMaxNumFocusAreas() > 0) {
                                parameters.setFocusAreas(C47261Igj.LJII(new Camera.Area(rect, 1000)));
                            }
                            if (parameters.getMaxNumMeteringAreas() > 0) {
                                parameters.setMeteringAreas(C47261Igj.LJII(new Camera.Area(rect, 1000)));
                            }
                            parameters.setFocusMode("macro");
                            cameraProxy.LJ(parameters);
                            try {
                                Camera camera3 = cameraProxy.LIZJ;
                                if (camera3 != null) {
                                    camera3.autoFocus(Y5E.LIZ);
                                }
                            } catch (RuntimeException e2) {
                                C0NB.LJI("LiveCoverCameraProxy", e2);
                            }
                        }
                    }
                }
            } else {
                o.LJIJI("dataChannel");
                throw null;
            }
        }
        return true;
    }
}

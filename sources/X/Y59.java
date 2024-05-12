package X;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Size;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import kotlin.jvm.internal.AqS165S0100000_15;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class Y59 extends SurfaceView implements SurfaceHolder.Callback {
    public Y58 LJLIL;
    public DataChannel LJLILLLLZI;
    public boolean LJLJI;
    public Size LJLJJI;
    public final C62822Ol8 LJLJJL;
    public final C62822Ol8 LJLJJLL;
    public InterfaceC65784Pro<Boolean> LJLJL;

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceCreated(SurfaceHolder holder) {
        o.LJIIIZ(holder, "holder");
    }

    private final GestureDetector getGestureDetector() {
        return (GestureDetector) this.LJLJJLL.getValue();
    }

    private final ScaleGestureDetector getScaleGestureDetector() {
        return (ScaleGestureDetector) this.LJLJJL.getValue();
    }

    public final Y58 getCameraProxy() {
        Y58 y58 = this.LJLIL;
        if (y58 != null) {
            return y58;
        }
        o.LJIJI("cameraProxy");
        throw null;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent event) {
        o.LJIIIZ(event, "event");
        ScaleGestureDetector scaleGestureDetector = getScaleGestureDetector();
        if (scaleGestureDetector != null) {
            scaleGestureDetector.onTouchEvent(event);
        }
        GestureDetector gestureDetector = getGestureDetector();
        if (gestureDetector != null) {
            gestureDetector.onTouchEvent(event);
            return true;
        }
        return true;
    }

    public final void setCameraProxy(Y58 y58) {
        o.LJIIIZ(y58, "<set-?>");
        this.LJLIL = y58;
    }

    public final void setCheckFragVisibleCallback(InterfaceC65784Pro<Boolean> callback) {
        o.LJIIIZ(callback, "callback");
        this.LJLJL = callback;
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceDestroyed(SurfaceHolder holder) {
        o.LJIIIZ(holder, "holder");
        getCameraProxy().LIZLLL();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Y59(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        C04560Fw.LIZ(context, "context", attributeSet, "attrs");
        this.LJLJJL = C221108m2.LIZIZ(new AqS165S0100000_15(this, 27));
        this.LJLJJLL = C221108m2.LIZIZ(new AqS165S0100000_15(this, 26));
    }

    /* JADX WARN: Code restructure failed: missing block: B:69:0x0102, code lost:
    
        if (r10 == null) goto L38;
     */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x016e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZ(int r15, X.C78862UxG r16) {
        /*
            Method dump skipped, instructions count: 446
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Y59.LIZ(int, X.UxG):void");
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceChanged(SurfaceHolder holder, int i, int i2, int i3) {
        o.LJIIIZ(holder, "holder");
        if (!getCameraProxy().LJ) {
            InterfaceC65784Pro<Boolean> interfaceC65784Pro = this.LJLJL;
            if (interfaceC65784Pro != null && !interfaceC65784Pro.invoke().booleanValue()) {
                return;
            }
            LIZ(getCameraProxy().LIZLLL, C78857UxB.LJJIIJ(1476788238, "bpea-live_cover_or_profile_camera_open"));
        }
    }
}

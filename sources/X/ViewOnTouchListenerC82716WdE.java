package X;

import android.content.Context;
import android.graphics.PointF;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.lighten.loader.SmartImageView;
import com.ss.android.ugc.aweme.settings.PinchToClearModeSettings;
import defpackage.a1;
import kotlin.jvm.internal.AqS164S0100000_14;
import kotlin.jvm.internal.o;

/* renamed from: X.WdE, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class ViewOnTouchListenerC82716WdE extends SmartImageView implements View.OnTouchListener {
    public static final float LJZI;
    public static final float LJZL;
    public boolean LJLJLJ;
    public ILK LJLJLLL;
    public PointF LJLL;
    public PointF LJLLI;
    public PointF LJLLILLLL;
    public float LJLLJ;
    public C82718WdG LJLLL;
    public boolean LJLLLL;
    public final C62822Ol8 LJLLLLLL;
    public final C62822Ol8 LJLZ;
    public Long LJZ;

    public final View getBackgroundView() {
        return (View) this.LJLLLLLL.getValue();
    }

    public final FrameLayout getOverlayContainer() {
        return (FrameLayout) this.LJLZ.getValue();
    }

    static {
        float f;
        float f2;
        if (C52480Kii.LIZ()) {
            f = PinchToClearModeSettings.LIZ().minScale;
        } else {
            f = 1.0f;
        }
        LJZI = f;
        if (C52480Kii.LIZ()) {
            f2 = PinchToClearModeSettings.LIZ().maxScale;
        } else {
            f2 = 4.0f;
        }
        LJZL = f2;
    }

    @Override // X.VA9, android.widget.ImageView, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C54339LUh.LIZ(this);
    }

    public final Long getZoomOutDuration() {
        return this.LJZ;
    }

    public final void setTouchEnabled(boolean z) {
        this.LJLLLL = z;
    }

    public final void setZoomOutDuration(Long l) {
        this.LJZ = l;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ViewOnTouchListenerC82716WdE(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        o.LJIIIZ(context, "context");
    }

    public static void LJII(MotionEvent motionEvent, PointF pointF) {
        if (motionEvent.getPointerCount() == 2) {
            float f = 2;
            pointF.set((motionEvent.getX(1) + motionEvent.getX(0)) / f, (motionEvent.getY(1) + motionEvent.getY(0)) / f);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0037, code lost:
    
        if (r1 != 6) goto L21;
     */
    @Override // android.view.View.OnTouchListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onTouch(android.view.View r12, android.view.MotionEvent r13) {
        /*
            Method dump skipped, instructions count: 436
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.ViewOnTouchListenerC82716WdE.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ViewOnTouchListenerC82716WdE(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        a1.LJFF(context, "context");
        this.LJLJLLL = ILK.IDLE;
        this.LJLL = new PointF();
        this.LJLLI = new PointF();
        this.LJLLILLLL = new PointF();
        this.LJLLJ = 1.0f;
        this.LJLLLLLL = C221108m2.LIZIZ(new AqS164S0100000_14(context, 192));
        this.LJLZ = C221108m2.LIZIZ(new AqS164S0100000_14(context, 193));
    }
}

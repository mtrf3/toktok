package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.RelativeLayout;
import com.bytedance.android.livesdkapi.host.IHostAppContext;
import defpackage.a1;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicLong;
import kotlin.jvm.internal.o;

/* renamed from: X.0Iu, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C05320Iu extends RelativeLayout {
    public C1XC LJLIL;

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent event) {
        boolean z;
        o.LJIIIZ(event, "event");
        if (event.getAction() == 4) {
            if (C30922CBq.LIZIZ) {
                Object[] objArr = new Object[3];
                if (event.getAction() == 4) {
                    z = true;
                } else {
                    z = false;
                }
                objArr[0] = Boolean.valueOf(z);
                objArr[1] = Float.valueOf(event.getX());
                objArr[2] = Float.valueOf(event.getY());
                String LLLZ = C16880lQ.LLLZ("onTouchEvent, ACTION_OUTSIDE=%s, (%s, %s)", Arrays.copyOf(objArr, 3));
                o.LJIIIIZZ(LLLZ, "format(format, *args)");
                C0NB.LIZIZ("sensor-data-collect", LLLZ);
            }
            C1XC c1xc = this.LJLIL;
            if (c1xc != null) {
                if (((IHostAppContext) CN1.LIZ(IHostAppContext.class)).isAppForeground()) {
                    AtomicLong atomicLong = c1xc.LIZ;
                    atomicLong.set(atomicLong.get() + 1);
                } else {
                    AtomicLong atomicLong2 = c1xc.LIZIZ;
                    atomicLong2.set(atomicLong2.get() + 1);
                }
            }
        }
        return super.onTouchEvent(event);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C05320Iu(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        a1.LJFF(context, "context");
    }
}

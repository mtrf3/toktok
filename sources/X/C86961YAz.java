package X;

import android.content.Context;
import android.view.OrientationEventListener;
import kotlin.jvm.internal.o;

/* renamed from: X.YAz, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C86961YAz extends OrientationEventListener {
    public final YB2 LIZ;

    @Override // android.view.OrientationEventListener
    public final void onOrientationChanged(int i) {
        if (i <= 45 || i > 315) {
            i = 0;
        } else if (135 >= i) {
            i = 90;
        } else if (136 <= i) {
            if (225 >= i) {
                i = 180;
            } else {
                i = 270;
            }
        }
        this.LIZ.LIZLLL(i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C86961YAz(Context context, YB2 mListener) {
        super(context);
        o.LJIIIZ(context, "context");
        o.LJIIIZ(mListener, "mListener");
        this.LIZ = mListener;
    }
}

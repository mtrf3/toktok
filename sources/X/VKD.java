package X;

import android.content.Context;
import android.view.OrientationEventListener;
import java.util.Iterator;

/* loaded from: classes15.dex */
public class VKD extends OrientationEventListener {
    public int LIZ;
    public final /* synthetic */ VKE LIZIZ;

    @Override // android.view.OrientationEventListener
    public final void onOrientationChanged(int i) {
        int i2;
        if (i < 0 || i >= 360) {
            return;
        }
        int i3 = this.LIZIZ.LIZ;
        if (i <= i3 || 360 - i <= i3) {
            i2 = 1;
        } else if (Math.abs(i - 90) <= this.LIZIZ.LIZ) {
            i2 = 8;
        } else if (Math.abs(i - 180) <= this.LIZIZ.LIZ) {
            i2 = 9;
        } else if (Math.abs(i - 270) <= this.LIZIZ.LIZ) {
            i2 = 0;
        } else {
            i2 = -1;
        }
        if (this.LIZ == i2 || i2 == -1) {
            return;
        }
        this.LIZ = i2;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onOrientationChanged:");
        LIZ.append(C283719l.LIZ(i2));
        X1D.LIZIZ(LIZ);
        Iterator<VKF> it = this.LIZIZ.LIZIZ.iterator();
        while (it.hasNext()) {
            it.next().onScreenOrientationChanged(i2);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VKD(VKE vke, Context context) {
        super(context);
        this.LIZIZ = vke;
        this.LIZ = -1;
    }
}

package X;

import android.content.Context;
import android.view.OrientationEventListener;
import java.util.HashSet;
import java.util.Iterator;

/* loaded from: classes12.dex */
public final class Q8W extends OrientationEventListener {
    public Q8W(Context context) {
        super(context);
    }

    @Override // android.view.OrientationEventListener
    public final void onOrientationChanged(int i) {
        if (i == -1) {
            return;
        }
        if (i > 340 || i < 20) {
            if (Q8X.LIZ == 0) {
                return;
            } else {
                Q8X.LIZ = 0;
            }
        } else if (i > 70) {
            if (i < 110) {
                if (Q8X.LIZ == 90) {
                    return;
                } else {
                    Q8X.LIZ = 90;
                }
            } else if (i > 160) {
                if (i < 200) {
                    if (Q8X.LIZ == 180) {
                        return;
                    } else {
                        Q8X.LIZ = 180;
                    }
                } else if (i <= 250 || i >= 290 || Q8X.LIZ == 270) {
                    return;
                } else {
                    Q8X.LIZ = 270;
                }
            } else {
                return;
            }
        } else {
            return;
        }
        int i2 = Q8X.LIZ;
        HashSet<Q8Y> hashSet = Q8X.LIZIZ;
        if (!hashSet.isEmpty()) {
            Iterator<Q8Y> it = hashSet.iterator();
            while (it.hasNext()) {
                it.next().LIZ(i2);
            }
        }
    }
}

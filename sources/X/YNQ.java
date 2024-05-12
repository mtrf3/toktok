package X;

import android.content.Context;
import android.view.OrientationEventListener;
import java.util.HashSet;
import java.util.Iterator;

/* loaded from: classes16.dex */
public final class YNQ extends OrientationEventListener {
    public YNQ(Context context) {
        super(context);
    }

    @Override // android.view.OrientationEventListener
    public final void onOrientationChanged(int i) {
        if (i == -1) {
            return;
        }
        if (i > 340 || i < 20) {
            if (YNR.LIZ == 0) {
                return;
            } else {
                YNR.LIZ = 0;
            }
        } else if (71 <= i) {
            if (i < 110) {
                if (YNR.LIZ == 90) {
                    return;
                } else {
                    YNR.LIZ = 90;
                }
            } else if (161 <= i) {
                if (i < 200) {
                    if (YNR.LIZ == 180) {
                        return;
                    } else {
                        YNR.LIZ = 180;
                    }
                } else if (251 > i || i >= 290 || YNR.LIZ == 270) {
                    return;
                } else {
                    YNR.LIZ = 270;
                }
            } else {
                return;
            }
        } else {
            return;
        }
        int i2 = YNR.LIZ;
        HashSet<YNS> hashSet = YNR.LIZIZ;
        if (true ^ hashSet.isEmpty()) {
            Iterator<YNS> it = hashSet.iterator();
            while (it.hasNext()) {
                it.next().LIZ(i2);
            }
        }
    }
}

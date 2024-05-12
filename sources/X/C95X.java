package X;

import X.C95U;
import com.bytedance.touchpoint.core.model.TouchPoint;
import com.bytedance.touchpoint.core.viewmodel.BaseTouchPointDataVM;
import java.util.HashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.95X, reason: invalid class name */
/* loaded from: classes5.dex */
public abstract class C95X<T extends C95U> implements C94Y {
    public abstract Class<T> LIZIZ();

    public abstract int LIZJ();

    public abstract BaseTouchPointDataVM LIZLLL();

    public T LJ(T t) {
        return t;
    }

    public boolean LJFF() {
        return this instanceof C9NK;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.C94Y
    public final void LIZ(HashMap<Integer, TouchPoint> touchPointsMap) {
        BaseTouchPointDataVM LIZLLL;
        int i;
        o.LJIIIZ(touchPointsMap, "touchPointsMap");
        try {
            TouchPoint touchPoint = touchPointsMap.get(Integer.valueOf(LIZJ()));
            if (touchPoint != null) {
                C95U c95u = (C95U) C62819Ol5.LJIIL(touchPoint.data, LIZIZ());
                if (c95u != null) {
                    c95u.LJFF = touchPoint.data;
                    c95u.LIZ = touchPoint.touchPointId;
                    c95u.LIZ(touchPoint.touchPointName);
                    Integer num = touchPoint.launchPlanId;
                    if (num != null) {
                        i = num.intValue();
                    } else {
                        i = -1;
                    }
                    c95u.LIZJ = Integer.valueOf(i);
                    String str = touchPoint.abVersions;
                    if (str == null) {
                        str = "";
                    }
                    c95u.LIZLLL = str;
                    c95u.LJ = touchPoint.customEventParams;
                }
                C9O7 LIZ = C2MW.LIZ();
                int i2 = touchPoint.touchPointId;
                LJ(c95u);
                LIZ.LIZ(i2, c95u);
                BaseTouchPointDataVM LIZLLL2 = LIZLLL();
                if (LIZLLL2 != null) {
                    LIZLLL2.gv0();
                }
                C247229n4.LIZ(c95u);
                return;
            }
            if (LJFF() && (LIZLLL = LIZLLL()) != null) {
                LIZLLL.gv0();
            }
        } catch (Exception unused) {
        }
    }
}

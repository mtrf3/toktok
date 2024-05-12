package X;

import com.ss.android.ugc.aweme.filter.FilterBean;
import java.util.HashMap;
import kotlin.jvm.internal.o;

/* loaded from: classes15.dex */
public final class WR0 implements InterfaceC148845sm {
    public final String LIZ = "JSBVideoRecordScene";
    public final C79655VNz LIZIZ;

    public WR0(C79655VNz c79655VNz) {
        this.LIZIZ = c79655VNz;
    }

    @Override // X.InterfaceC148845sm
    public final int LIZ(FilterBean filterBean, InterfaceC122704ri getter) {
        int intValue;
        o.LJIIIZ(filterBean, "filterBean");
        o.LJIIIZ(getter, "getter");
        C79655VNz c79655VNz = this.LIZIZ;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(this.LIZ);
        LIZ.append('-');
        LIZ.append(filterBean.getResId());
        String key = X1D.LIZIZ(LIZ);
        String compareKey = filterBean.getCompareKey();
        c79655VNz.getClass();
        o.LJIIIZ(key, "key");
        if (compareKey != null) {
            Integer num = (Integer) ((HashMap) c79655VNz.LIZ).get(compareKey);
            if (num == null) {
                num = -1;
            }
            intValue = num.intValue();
        } else {
            Integer num2 = (Integer) ((HashMap) c79655VNz.LIZ).get(key);
            if (num2 == null) {
                num2 = -1;
            }
            intValue = num2.intValue();
        }
        if (intValue == -1) {
            return TML.LIZLLL(filterBean, TML.LIZIZ(filterBean, getter), getter);
        }
        return intValue;
    }

    @Override // X.InterfaceC148845sm
    public final void LIZIZ(FilterBean filterBean, int i) {
        o.LJIIIZ(filterBean, "filterBean");
        C79655VNz c79655VNz = this.LIZIZ;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(this.LIZ);
        LIZ.append('-');
        LIZ.append(filterBean.getResId());
        String key = X1D.LIZIZ(LIZ);
        String compareKey = filterBean.getCompareKey();
        c79655VNz.getClass();
        o.LJIIIZ(key, "key");
        if (compareKey != null) {
            ((HashMap) c79655VNz.LIZ).put(compareKey, Integer.valueOf(i));
        } else {
            ((HashMap) c79655VNz.LIZ).put(key, Integer.valueOf(i));
        }
    }
}

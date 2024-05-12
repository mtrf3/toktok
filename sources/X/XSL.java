package X;

import Y.IDxS312S0100000_15;
import android.text.TextUtils;
import com.ss.android.ugc.aweme.kids.setting.items.digitalwellbeing.antiaddiction.ContinuousTimeCalculator;
import java.util.Calendar;

/* loaded from: classes16.dex */
public final class XSL implements InterfaceC84368X9g {
    public final XSO LIZ;
    public final XSN LIZIZ;

    @Override // X.InterfaceC84368X9g
    public final void LIZ() {
        int i;
        ContinuousTimeCalculator.Companion.getClass();
        long LIZ = C84369X9h.LIZ();
        if (LIZ < 0) {
            return;
        }
        XSN xsn = this.LIZIZ;
        long currentTimeMillis = System.currentTimeMillis();
        xsn.getClass();
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(currentTimeMillis);
        int i2 = calendar.get(11);
        if (i2 >= 0 && i2 < xsn.LIZ) {
            calendar.add(5, -1);
        }
        calendar.set(11, xsn.LIZ);
        calendar.set(12, 0);
        calendar.set(13, 0);
        if (xsn.LIZ() < calendar.getTimeInMillis()) {
            this.LIZ.LIZIZ(0L);
            this.LIZIZ.LIZIZ(System.currentTimeMillis());
        }
        long LJ = this.LIZ.LJ() + LIZ;
        this.LIZ.LIZIZ(LJ);
        XSP.LIZ();
        if (TextUtils.equals(EF7.LJIILIIL, "local_test")) {
            i = 360000;
        } else {
            i = 3600000;
        }
        if (LJ <= i) {
            return;
        }
        AbstractC73672Svk.LJJIJIL("time_lock").LJJL(T16.LIZIZ).LJJJ(C73969T1h.LIZIZ()).LIZ(new IDxS312S0100000_15(this, 2));
    }

    public XSL() {
        Object LIZ = C54370LVm.LIZ(EF7.LIZIZ(), XSO.class);
        if (LIZ != null) {
            this.LIZ = (XSO) LIZ;
            this.LIZIZ = new XSN(this);
        } else {
            "Follow previous logic".toString();
            throw new IllegalArgumentException("Follow previous logic");
        }
    }
}

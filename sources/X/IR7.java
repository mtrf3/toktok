package X;

import com.bytedance.keva.Keva;
import kotlin.jvm.internal.AqS158S0100000_8;

/* loaded from: classes9.dex */
public final class IR7 {
    public final String LIZ;
    public final C62822Ol8 LIZIZ = C221108m2.LIZIZ(new AqS158S0100000_8(this, 599));
    public final C62822Ol8 LIZJ = C221108m2.LIZIZ(new AqS158S0100000_8(this, 596));
    public final C62822Ol8 LIZLLL = C221108m2.LIZIZ(new AqS158S0100000_8(this, 597));
    public final C62822Ol8 LJ = C221108m2.LIZIZ(new AqS158S0100000_8(this, 598));

    public final Keva LIZ() {
        return (Keva) this.LIZIZ.getValue();
    }

    public final void LIZJ() {
        if (C56775MPz.LIZLLL()) {
            return;
        }
        LIZ().storeInt("expand_times", LIZ().getInt("expand_times", 0) + 1);
    }

    public final void LIZLLL() {
        if (C56775MPz.LIZLLL()) {
            return;
        }
        LIZ().storeInt("enter_inbox_times", 0);
        LIZ().storeLong("enter_inbox_limit_start", 0L);
    }

    public IR7(String str) {
        this.LIZ = str;
    }

    public final void LIZIZ(boolean z, boolean z2) {
        if (!z || !z2 || C56775MPz.LIZLLL()) {
            return;
        }
        LIZ().storeInt("enter_inbox_times", LIZ().getInt("enter_inbox_times", 0) + 1);
    }
}

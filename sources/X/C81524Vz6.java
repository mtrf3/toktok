package X;

import java.util.HashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: X.Vz6, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C81524Vz6 {
    public static final /* synthetic */ int LIZJ = 0;
    public final AtomicLong LIZ = new AtomicLong(-1);
    public final AtomicBoolean LIZIZ = new AtomicBoolean(false);

    public final boolean LIZ(boolean z) {
        boolean z2;
        boolean LJIL = C1DH.LJIL();
        EF7.LIZIZ();
        boolean z3 = false;
        try {
            z2 = C2NU.LIZ.LIZIZ();
        } catch (Exception unused) {
            z2 = false;
        }
        boolean z4 = LJIL & z2;
        if (!z || System.currentTimeMillis() - this.LIZ.get() >= 60000) {
            z3 = true;
        }
        return z4 & z3;
    }

    public final boolean LIZIZ(EnumC79770VSk enumC79770VSk, HashMap<String, HashMap<String, Object>> hashMap) {
        if (!LIZ(true)) {
            return false;
        }
        if ((!LXW.LIZ() && !LXW.LIZIZ()) || this.LIZIZ.get()) {
            return false;
        }
        this.LIZ.set(System.currentTimeMillis());
        J99.LIZ(EnumC79773VSn.SHOW_TOAST, enumC79770VSk, hashMap);
        return true;
    }
}

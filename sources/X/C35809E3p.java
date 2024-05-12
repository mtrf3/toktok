package X;

import android.os.Process;

/* renamed from: X.E3p, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C35809E3p {
    public static final C62822Ol8 LIZ = C221108m2.LIZIZ(C35811E3r.LJLIL);

    public static void LIZ(int i) {
        if (((Boolean) C34597Dhx.LIZJ.getValue()).booleanValue() || C16880lQ.LLLZLL()) {
            Process.setThreadPriority(i, -20);
            C35801E3h.LIZ.put("assem-serial-t", new C35808E3o(i, -20));
        } else {
            Process.setThreadPriority(i, -10);
            C35801E3h.LIZ.put("assem-serial-t", new C35808E3o(i, -10));
        }
    }
}

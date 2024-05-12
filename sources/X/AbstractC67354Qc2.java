package X;

import android.util.Base64;

/* renamed from: X.Qc2, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public abstract class AbstractC67354Qc2 {
    public abstract String LIZIZ();

    public abstract byte[] LIZJ();

    public abstract EnumC67357Qc5 LIZLLL();

    public final String toString() {
        String encodeToString;
        Object[] objArr = new Object[3];
        objArr[0] = LIZIZ();
        objArr[1] = LIZLLL();
        if (LIZJ() == null) {
            encodeToString = "";
        } else {
            encodeToString = Base64.encodeToString(LIZJ(), 2);
        }
        objArr[2] = encodeToString;
        return C16880lQ.LLLZ("TransportContext(%s, %s, %s)", objArr);
    }

    public static C67352Qc0 LIZ() {
        C67352Qc0 c67352Qc0 = new C67352Qc0();
        c67352Qc0.LIZJ(EnumC67357Qc5.DEFAULT);
        return c67352Qc0;
    }
}

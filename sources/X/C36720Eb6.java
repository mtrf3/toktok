package X;

import java.lang.reflect.Field;

/* renamed from: X.Eb6, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C36720Eb6 extends AbstractC36715Eb1 {
    public final String LJI = "connectivity";

    public final void LIZLLL() {
        Field LIZ;
        Object LIZIZ;
        C77633UdR c77633UdR = new C77633UdR(this.LJI, this);
        try {
            Class<?> cls = Class.forName("android.os.ServiceManager");
            Object LIZIZ2 = EWC.LIZIZ(cls, "getService", (String) c77633UdR.LIZ);
            if (LIZIZ2 != null && (LIZ = EWF.LIZ(cls, "sCache")) != null && (LIZIZ = EWF.LIZIZ(LIZ, null)) != null && (LIZIZ instanceof java.util.Map)) {
                Object obj = c77633UdR.LIZIZ;
                AbstractC36715Eb1 abstractC36715Eb1 = (AbstractC36715Eb1) obj;
                abstractC36715Eb1.LIZLLL = true;
                abstractC36715Eb1.LIZIZ = LIZIZ2;
                ((java.util.Map) LIZIZ).put((String) c77633UdR.LIZ, C60903NvH.LJII(LIZIZ2, (AbstractC36715Eb1) obj));
            }
        } catch (Exception unused) {
        }
    }

    public C36720Eb6(AbstractC36715Eb1 abstractC36715Eb1) {
        this.LIZ.put("queryLocalInterface", new C36719Eb5(abstractC36715Eb1));
    }
}

package X;

/* renamed from: X.Pvs, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public class C66036Pvs {
    public static C66036Pvs LIZ;

    public String LIZLLL() {
        return "";
    }

    public void LJ(C66038Pvu c66038Pvu, C66033Pvp c66033Pvp) {
    }

    public boolean LJFF() {
        return false;
    }

    public void LJI(java.util.Map<String, Object> map) {
    }

    public void LJII() {
    }

    public static C66036Pvs LIZIZ() {
        C66036Pvs c66036Pvs;
        if (LIZ == null) {
            synchronized (C66036Pvs.class) {
                if (LIZ == null) {
                    try {
                        Class<?> cls = Class.forName("com.bytedance.helios.sdk.HeliosEnvImpl");
                        c66036Pvs = (C66036Pvs) cls.getDeclaredMethod("get", new Class[0]).invoke(cls, new Object[0]);
                    } catch (Exception unused) {
                        c66036Pvs = new C66036Pvs();
                    }
                    LIZ = c66036Pvs;
                }
            }
        }
        return LIZ;
    }

    public C53655L3z LIZJ(int i) {
        return new C53655L3z(i, false, false);
    }
}

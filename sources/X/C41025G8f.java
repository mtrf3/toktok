package X;

/* renamed from: X.G8f, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C41025G8f {
    public static final C62822Ol8 LIZ = C221108m2.LIZIZ(C41024G8e.LJLIL);

    public static final GI4 LIZ(String str) {
        C62822Ol8 c62822Ol8 = LIZ;
        GI4 gi4 = (GI4) ((java.util.Map) c62822Ol8.getValue()).get(str);
        if (gi4 == null) {
            C41319GJn c41319GJn = new C41319GJn(str);
            ((java.util.Map) c62822Ol8.getValue()).put(str, c41319GJn);
            return c41319GJn;
        }
        return gi4;
    }
}

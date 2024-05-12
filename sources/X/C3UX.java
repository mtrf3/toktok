package X;

import kotlin.jvm.internal.o;

/* renamed from: X.3UX, reason: invalid class name */
/* loaded from: classes2.dex */
public abstract class C3UX {
    public final String LIZ;
    public final String LIZIZ;
    public final float LIZJ;
    public final C3US LIZLLL;

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(this.LIZ);
        LIZ.append('_');
        LIZ.append(this.LIZIZ);
        return X1D.LIZIZ(LIZ);
    }

    public C3UX(String name, String extraID, float f, C3US reportingPlatform) {
        o.LJIIIZ(name, "name");
        o.LJIIIZ(extraID, "extraID");
        o.LJIIIZ(reportingPlatform, "reportingPlatform");
        this.LIZ = name;
        this.LIZIZ = extraID;
        this.LIZJ = f;
        this.LIZLLL = reportingPlatform;
    }

    public /* synthetic */ C3UX(String str, String str2, float f, C3US c3us, int i) {
        this(str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? 1.0f : f, (i & 8) != 0 ? C3US.TEA : c3us);
    }
}

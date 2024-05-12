package X;

/* renamed from: X.00U, reason: invalid class name */
/* loaded from: classes.dex */
public enum C00U {
    Json(".json"),
    Zip(".zip");

    public final String extension;

    public String tempExtension() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(".temp");
        LIZ.append(this.extension);
        return X1D.LIZIZ(LIZ);
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.extension;
    }

    public static C00U forFile(String str) {
        for (C00U c00u : values()) {
            if (str.endsWith(c00u.extension)) {
                return c00u;
            }
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Unable to find correct extension for ");
        LIZ.append(str);
        C0GR.LIZIZ(X1D.LIZIZ(LIZ));
        return Json;
    }

    public static C00U valueOf(String str) {
        return (C00U) V0N.LJJJ(C00U.class, str);
    }

    C00U(String str) {
        this.extension = str;
    }
}

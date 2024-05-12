package X;

import kotlin.jvm.internal.o;

/* renamed from: X.WyH, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C84021WyH {
    public final int LIZ;
    public final int LIZIZ;
    public final String LIZJ;
    public final String LIZLLL;
    public final float LJ;
    public final String LJFF;

    public C84021WyH(String path, String featureTag, float f) {
        o.LJIIIZ(path, "path");
        o.LJIIIZ(featureTag, "featureTag");
        this.LIZ = 1;
        this.LIZIZ = -1;
        this.LIZJ = "";
        this.LIZLLL = "";
        this.LJFF = "";
        this.LIZ = 4;
        this.LIZJ = path;
        this.LIZLLL = featureTag;
        this.LJ = f;
    }

    public C84021WyH(int i, String path, String featureTag, float f) {
        o.LJIIIZ(path, "path");
        o.LJIIIZ(featureTag, "featureTag");
        this.LIZ = 1;
        this.LIZIZ = -1;
        this.LIZJ = "";
        this.LIZLLL = "";
        this.LJFF = "";
        this.LIZIZ = i;
        this.LIZ = 4;
        this.LIZJ = path;
        this.LIZLLL = featureTag;
        this.LJ = f;
    }
}

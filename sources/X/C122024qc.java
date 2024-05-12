package X;

import kotlin.jvm.internal.o;

/* renamed from: X.4qc, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public class C122024qc {
    public String LIZ;
    public int LIZIZ;
    public long LIZJ;
    public long LIZLLL;
    public float LJ;
    public float LJFF;
    public float LJI;
    public float LJII;
    public float LJIIIIZZ;
    public C121194pH LJIIIZ;
    public final EnumC121564ps LJIIJ;

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("BaseStickerParams(layer=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", startTime=");
        LIZ.append(this.LIZJ);
        LIZ.append(", endTime=");
        LIZ.append(this.LIZLLL);
        LIZ.append(", x=");
        LIZ.append(this.LJ);
        LIZ.append(", y=");
        LIZ.append(this.LJFF);
        LIZ.append(", rotation=");
        LIZ.append(this.LJI);
        LIZ.append(", alpha=");
        LIZ.append(this.LJII);
        LIZ.append(", scale=");
        return C74221TAz.LIZLLL(LIZ, this.LJIIIIZZ, ')', LIZ);
    }

    public C122024qc(EnumC121564ps type) {
        o.LJIIIZ(type, "type");
        this.LJIIJ = type;
        this.LIZLLL = -2L;
        this.LJ = 0.5f;
        this.LJFF = 0.5f;
        this.LJII = 1.0f;
        this.LJIIIIZZ = 1.0f;
    }
}

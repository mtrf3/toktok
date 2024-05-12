package X;

import kotlin.jvm.internal.o;

/* renamed from: X.H4v, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43485H4v {
    public final String LIZ;
    public final EnumC2323499y LIZIZ;
    public float LIZJ;
    public final float LIZLLL;
    public float LJ;
    public float LJFF;
    public String LJI;
    public boolean LJII;

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Record(creationId='");
        LIZ.append(this.LIZ);
        LIZ.append("', type=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", initMB=");
        LIZ.append(this.LIZJ);
        LIZ.append(", beforeCompileMB=");
        LIZ.append(this.LIZLLL);
        LIZ.append(", afterCompileMB=");
        LIZ.append(this.LJ);
        LIZ.append(", compileFileMB=");
        return C74221TAz.LIZLLL(LIZ, this.LJFF, ')', LIZ);
    }

    public C43485H4v(String creationId, EnumC2323499y type) {
        o.LJIIIZ(creationId, "creationId");
        o.LJIIIZ(type, "type");
        this.LIZ = creationId;
        this.LIZIZ = type;
        this.LIZJ = 0.0f;
        this.LIZLLL = 0.0f;
        this.LJ = 0.0f;
        this.LJFF = 0.0f;
        this.LJI = "";
        this.LJII = true;
    }
}

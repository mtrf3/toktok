package X;

/* renamed from: X.X0x, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C84151X0x {
    public final int LIZ;
    public final int LIZIZ;
    public final int LIZJ;
    public final int LIZLLL;
    public final float LJ;
    public long LJFF;
    public boolean LJIIIIZZ;
    public boolean LJI = true;
    public boolean LJII = true;
    public boolean LJIIIZ = true;
    public EnumC81106VsM LJIIJ = EnumC81106VsM.VIEW;
    public InterfaceC87371YQt LJIIJJI = new C63924P6y();

    public final int LIZ() {
        return (int) (System.currentTimeMillis() - this.LJFF);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("TEFocusSettings{width =");
        LIZ.append(this.LIZ);
        LIZ.append(", height =");
        LIZ.append(this.LIZIZ);
        LIZ.append(", x =");
        LIZ.append(this.LIZJ);
        LIZ.append(", y =");
        LIZ.append(this.LIZLLL);
        LIZ.append(", need focus =");
        LIZ.append(this.LJI);
        LIZ.append(", need meter =");
        LIZ.append(this.LJII);
        LIZ.append(", lock =");
        LIZ.append(this.LJIIIIZZ);
        LIZ.append(", from user=");
        LIZ.append(this.LJIIIZ);
        LIZ.append(", CoordinatesMode");
        LIZ.append(this.LJIIJ);
        LIZ.append('}');
        return X1D.LIZIZ(LIZ);
    }

    public C84151X0x(int i, int i2, int i3, int i4, float f) {
        this.LIZ = i;
        this.LIZIZ = i2;
        this.LIZJ = i3;
        this.LIZLLL = i4;
        this.LJ = f;
    }
}

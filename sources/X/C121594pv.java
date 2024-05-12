package X;

/* renamed from: X.4pv, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C121594pv extends C122024qc {
    public String LJIIJJI;
    public String LJIIL;
    public float LJIILIIL;
    public float LJIILJJIL;

    public C121594pv() {
        this(0);
    }

    @Override // X.C122024qc
    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ImageStickerParams(path=");
        LIZ.append(this.LJIIL);
        LIZ.append(", width=");
        LIZ.append(this.LJIILIIL);
        LIZ.append(", height=");
        LIZ.append(this.LJIILJJIL);
        LIZ.append(')');
        LIZ.append(super.toString());
        return X1D.LIZIZ(LIZ);
    }

    public C121594pv(int i) {
        super(EnumC121564ps.IMAGE);
        this.LJIIL = null;
        this.LJIILIIL = 0.0f;
        this.LJIILJJIL = 0.0f;
    }
}

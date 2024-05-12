package X;

/* renamed from: X.4qR, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C121914qR extends C122004qa {
    public String LJIILJJIL;
    public String LJIILL;
    public boolean LJIILLIIL;
    public EnumC121684q4 LJIIZILJ;

    public C121914qR() {
        super(EnumC122254qz.BGM);
    }

    @Override // X.C122004qa
    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("MusicBgmParams(musicId=");
        LIZ.append(this.LJIILJJIL);
        LIZ.append(", musicName=");
        LIZ.append(this.LJIILL);
        LIZ.append(", isLoop=");
        LIZ.append(this.LJIILLIIL);
        LIZ.append(", mvType=");
        LIZ.append(this.LJIIZILJ);
        LIZ.append(") ");
        LIZ.append(super.toString());
        return X1D.LIZIZ(LIZ);
    }
}

package X;

/* loaded from: classes14.dex */
public final class V6X {
    public final float LIZ = 4;
    public final float LIZIZ = 5;
    public final float LIZJ = 6;
    public final float LIZLLL = 8;
    public final float LJ = 8;
    public final float LJFF = 10;
    public final float LJI = 10;
    public final float LJII = 12;
    public final float LJIIIIZZ = 12;
    public final float LJIIIZ = 14;
    public final float LJIIJ = 4;
    public final float LJIIJJI = 5;
    public final float LJIIL = 6;
    public final float LJIILIIL = 8;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof V6X)) {
            return false;
        }
        V6X v6x = (V6X) obj;
        return C23390vv.LIZJ(this.LIZ, v6x.LIZ) && C23390vv.LIZJ(this.LIZIZ, v6x.LIZIZ) && C23390vv.LIZJ(this.LIZJ, v6x.LIZJ) && C23390vv.LIZJ(this.LIZLLL, v6x.LIZLLL) && C23390vv.LIZJ(this.LJ, v6x.LJ) && C23390vv.LIZJ(this.LJFF, v6x.LJFF) && C23390vv.LIZJ(this.LJI, v6x.LJI) && C23390vv.LIZJ(this.LJII, v6x.LJII) && C23390vv.LIZJ(this.LJIIIIZZ, v6x.LJIIIIZZ) && C23390vv.LIZJ(this.LJIIIZ, v6x.LJIIIZ) && C23390vv.LIZJ(this.LJIIJ, v6x.LJIIJ) && C23390vv.LIZJ(this.LJIIJJI, v6x.LJIIJJI) && C23390vv.LIZJ(this.LJIIL, v6x.LJIIL) && C23390vv.LIZJ(this.LJIILIIL, v6x.LJIILIIL);
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.LJIILIIL) + C47959Irz.LIZIZ(this.LJIIL, C47959Irz.LIZIZ(this.LJIIJJI, C47959Irz.LIZIZ(this.LJIIJ, C47959Irz.LIZIZ(this.LJIIIZ, C47959Irz.LIZIZ(this.LJIIIIZZ, C47959Irz.LIZIZ(this.LJII, C47959Irz.LIZIZ(this.LJI, C47959Irz.LIZIZ(this.LJFF, C47959Irz.LIZIZ(this.LJ, C47959Irz.LIZIZ(this.LIZLLL, C47959Irz.LIZIZ(this.LIZJ, C47959Irz.LIZIZ(this.LIZIZ, Float.floatToIntBits(this.LIZ) * 31, 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TuxRadius(ControlTiny=");
        C0SV.LIZ(this.LIZ, sb, ", ControlSmall=");
        C0SV.LIZ(this.LIZIZ, sb, ", ControlMedium=");
        C0SV.LIZ(this.LIZJ, sb, ", ControlLarge=");
        C0SV.LIZ(this.LIZLLL, sb, ", ContainersLevel0Small=");
        C0SV.LIZ(this.LJ, sb, ", ContainersLevel0Large=");
        C0SV.LIZ(this.LJFF, sb, ", ContainersLevel1Small=");
        C0SV.LIZ(this.LJI, sb, ", ContainersLevel1Large=");
        C0SV.LIZ(this.LJII, sb, ", ContainersLevel2Small=");
        C0SV.LIZ(this.LJIIIIZZ, sb, ", ContainersLevel2Large=");
        C0SV.LIZ(this.LJIIIZ, sb, ", ContentTiny=");
        C0SV.LIZ(this.LJIIJ, sb, ", ContentSmall=");
        C0SV.LIZ(this.LJIIJJI, sb, ", ContentMedium=");
        C0SV.LIZ(this.LJIIL, sb, ", ContentLarge=");
        sb.append((Object) C23390vv.LIZLLL(this.LJIILIIL));
        sb.append(')');
        return sb.toString();
    }
}

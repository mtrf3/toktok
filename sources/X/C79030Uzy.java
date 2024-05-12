package X;

/* renamed from: X.Uzy, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C79030Uzy {
    public EnumC79019Uzn LIZ;
    public EnumC79026Uzu LIZIZ;
    public C79021Uzp LIZJ;
    public int LIZLLL = -1;
    public C78753UvV LJ;

    public final String toString() {
        StringBuilder sb = new StringBuilder(200);
        sb.append("<<\n mode: ");
        sb.append(this.LIZ);
        sb.append("\n ecLevel: ");
        sb.append(this.LIZIZ);
        sb.append("\n version: ");
        sb.append(this.LIZJ);
        sb.append("\n maskPattern: ");
        sb.append(this.LIZLLL);
        if (this.LJ == null) {
            sb.append("\n matrix: null\n");
        } else {
            sb.append("\n matrix:\n");
            sb.append(this.LJ);
        }
        sb.append(">>\n");
        return sb.toString();
    }
}

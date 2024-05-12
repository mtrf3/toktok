package X;

/* renamed from: X.Ybw, reason: case insensitive filesystem */
/* loaded from: classes17.dex */
public final class C87732Ybw {
    public final /* synthetic */ int LIZ = 0;
    public Object LIZIZ;
    public Object LIZJ;
    public Object LIZLLL;

    public final boolean LIZ() {
        Object obj = this.LIZJ;
        if (((C87735Ybz) obj).LIZIZ == null) {
            return false;
        }
        this.LIZJ = ((C87735Ybz) obj).LIZIZ;
        return true;
    }

    public final String toString() {
        switch (this.LIZ) {
            case 0:
                StringBuilder sb = new StringBuilder();
                for (C87735Ybz c87735Ybz = (C87735Ybz) this.LIZIZ; c87735Ybz != null; c87735Ybz = c87735Ybz.LIZIZ) {
                    sb.append(c87735Ybz.LJ);
                    sb.append(",");
                }
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("{");
                LIZ.append(sb.toString());
                LIZ.append("}");
                return X1D.LIZIZ(LIZ);
            default:
                return super.toString();
        }
    }

    public C87732Ybw(C87735Ybz c87735Ybz) {
        this.LIZIZ = c87735Ybz;
        this.LIZJ = c87735Ybz;
        this.LIZLLL = c87735Ybz;
        while (true) {
            C87735Ybz c87735Ybz2 = ((C87735Ybz) this.LIZLLL).LIZIZ;
            if (c87735Ybz2 != null) {
                this.LIZLLL = c87735Ybz2;
            } else {
                return;
            }
        }
    }
}

package X;

/* renamed from: X.CWc, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31454CWc extends C0A4 {
    public final /* synthetic */ C31453CWb LIZ;

    public C31454CWc(C31453CWb c31453CWb) {
        this.LIZ = c31453CWb;
    }

    @Override // X.C0A4
    public final boolean LIZ(int i, int i2) {
        if (i2 == 0) {
            if (!this.LIZ.LIZ.canScrollVertically(1)) {
                C31453CWb.LIZLLL(this.LIZ, EnumC31433CVh.NORMAL, 6);
                return false;
            }
            C31453CWb.LIZLLL(this.LIZ, EnumC31433CVh.FOCUS, 6);
            int LLILLJJLI = this.LIZ.LJIIIZ.LLILLJJLI();
            C31453CWb c31453CWb = this.LIZ;
            int i3 = c31453CWb.LJI;
            if (LLILLJJLI <= i3) {
                return false;
            }
            c31453CWb.LIZJ(c31453CWb.LJFF - (LLILLJJLI - i3));
            this.LIZ.LJI = LLILLJJLI;
            return false;
        }
        return false;
    }
}

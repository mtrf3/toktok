package X;

/* renamed from: X.Qqx, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C68279Qqx extends AbstractC68187QpT {
    public String LIZLLL;
    public java.util.Set LJ;
    public C1HQ LJFF;
    public Long LJI;
    public Long LJII;

    @Override // X.AbstractC68187QpT
    public final void LJIIIIZZ() {
    }

    public C68279Qqx(C68241QqL c68241QqL) {
        super(c68241QqL);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final C68248QqS LJIIIZ(Integer num) {
        if (this.LJFF.containsKey(num)) {
            return (C68248QqS) this.LJFF.getOrDefault(num, null);
        }
        C68248QqS c68248QqS = new C68248QqS(this, this.LIZLLL);
        this.LJFF.put(num, c68248QqS);
        return c68248QqS;
    }
}

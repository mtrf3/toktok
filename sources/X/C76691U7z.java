package X;

/* renamed from: X.U7z, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C76691U7z implements InterfaceC29937Boz {
    public final /* synthetic */ int LIZ;
    public final /* synthetic */ C76677U7l LIZIZ;
    public final /* synthetic */ long LIZJ;

    public C76691U7z(int i, long j, C76677U7l c76677U7l) {
        this.LIZ = i;
        this.LIZIZ = c76677U7l;
        this.LIZJ = j;
    }

    @Override // X.InterfaceC29937Boz
    public final void run() {
        C76689U7x c76689U7x;
        C76690U7y c76690U7y;
        int i = this.LIZ;
        if (i == 102) {
            if (this.LIZIZ.LIZLLL.containsKey(Long.valueOf(this.LIZJ)) && (c76690U7y = this.LIZIZ.LIZLLL.get(Long.valueOf(this.LIZJ))) != null) {
                C76677U7l c76677U7l = this.LIZIZ;
                long j = this.LIZJ;
                c76677U7l.LIZIZ.e(new C75919Tqt(c76690U7y.LIZ, c76690U7y.LIZIZ, c76690U7y.LIZJ, "timeout"), new U9L(c76677U7l, j));
                return;
            }
            return;
        }
        if (i != 100 || !this.LIZIZ.LJ.containsKey(Long.valueOf(this.LIZJ)) || (c76689U7x = this.LIZIZ.LJ.get(Long.valueOf(this.LIZJ))) == null) {
            return;
        }
        C76677U7l c76677U7l2 = this.LIZIZ;
        long j2 = this.LIZJ;
        c76677U7l2.LIZIZ.m(new C75918Tqs(c76689U7x.LIZ, c76689U7x.LIZIZ, c76689U7x.LIZJ, "timeout"), new U9M(c76677U7l2, j2));
    }
}

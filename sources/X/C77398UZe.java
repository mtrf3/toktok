package X;

/* renamed from: X.UZe, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C77398UZe implements InterfaceC77407UZn {
    public final /* synthetic */ C77397UZd LIZ;
    public final /* synthetic */ UZS LIZIZ;

    @Override // X.InterfaceC77407UZn
    public final void onFail() {
    }

    @Override // X.InterfaceC77407UZn
    public final void onSuccess() {
        String str;
        try {
            this.LIZIZ.LIZ = this.LIZ.LJIIL.LIZLLL(0);
            this.LIZIZ.LIZIZ = this.LIZ.LJIIL.LIZLLL(1);
            UZS uzs = this.LIZIZ;
            C77403UZj c77403UZj = this.LIZ.LJIIL;
            if (c77403UZj.LJI) {
                C77404UZk c77404UZk = c77403UZj.LJFF;
                if (c77404UZk != null) {
                    str = c77404UZk.LIZLLL();
                } else {
                    str = null;
                }
                uzs.LIZJ = str;
                UZV uzv = this.LIZ.LIZJ;
                if (uzv != null) {
                    UZS uzs2 = this.LIZIZ;
                    uzs2.getClass();
                    UZR uzr = new UZR(uzs2);
                    AbstractC77394UZa abstractC77394UZa = uzv.LJLJI;
                    if (abstractC77394UZa != null) {
                        abstractC77394UZa.LIZ(uzr);
                        return;
                    }
                    return;
                }
                return;
            }
            throw new Throwable("HAS NOT inited");
        } catch (Exception unused) {
        }
    }

    public C77398UZe(C77397UZd c77397UZd, UZS uzs) {
        this.LIZ = c77397UZd;
        this.LIZIZ = uzs;
    }
}

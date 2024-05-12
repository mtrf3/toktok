package X;

/* renamed from: X.S2i, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C71448S2i implements InterfaceC71464S2y {
    public final /* synthetic */ S2N LIZ;

    public C71448S2i(S2N s2n) {
        this.LIZ = s2n;
    }

    @Override // X.InterfaceC71464S2y
    public final void LIZ(boolean z) {
        if (this.LIZ.LJLJLJ.LIZ()) {
            if (z) {
                ((C119754mx) this.LIZ.LJLJLJ.LIZ).setMaxTagCount(1);
            } else {
                ((C119754mx) this.LIZ.LJLJLJ.LIZ).setMaxTagCount(2);
            }
        }
        this.LIZ.LJJZ();
    }
}

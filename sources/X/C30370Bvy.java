package X;

/* renamed from: X.Bvy, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C30370Bvy implements C41 {
    public final /* synthetic */ C30351Bvf LIZ;

    public C30370Bvy(C30351Bvf c30351Bvf) {
        this.LIZ = c30351Bvf;
    }

    @Override // X.C41
    public final void LIZ(boolean z) {
        long currentTimeMillis = System.currentTimeMillis();
        C30351Bvf c30351Bvf = this.LIZ;
        if (currentTimeMillis - c30351Bvf.LJZ > 1000) {
            c30351Bvf.LJLLJ = z;
        }
    }
}

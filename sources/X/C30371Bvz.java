package X;

/* renamed from: X.Bvz, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C30371Bvz implements C41 {
    public final /* synthetic */ C30350Bve LIZ;

    public C30371Bvz(C30350Bve c30350Bve) {
        this.LIZ = c30350Bve;
    }

    @Override // X.C41
    public final void LIZ(boolean z) {
        long currentTimeMillis = System.currentTimeMillis();
        C30350Bve c30350Bve = this.LIZ;
        if (currentTimeMillis - c30350Bve.LJZ > 1000) {
            c30350Bve.LJLLJ = z;
        }
    }
}

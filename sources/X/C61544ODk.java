package X;

/* renamed from: X.ODk, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C61544ODk extends VJO {
    public final /* synthetic */ OEP LJLJL;

    public final void LIZ() {
        try {
            OC6.LIZ("gecko-debug-tag", "check request retry start");
            Object LIZJ = this.LJLJL.LIZIZ.LIZJ("req_type");
            this.LJLJL.LIZIZ.LIZLLL(2, "req_type");
            this.LJLJL.LIZIZ.LIZLLL(LIZJ, "original_req_type");
            this.LJLJL.LIZIZ.LIZ();
        } catch (Exception unused) {
            OC6.LIZ("gecko-debug-tag", "check request retry failed");
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            LIZ();
        } finally {
            if (LIZ) {
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C61544ODk(OEP oep, int i) {
        super(i);
        this.LJLJL = oep;
    }
}

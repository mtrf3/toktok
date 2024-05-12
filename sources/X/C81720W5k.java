package X;

/* renamed from: X.W5k, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C81720W5k implements HW9 {
    public final W4W LIZ;

    @Override // X.HW9
    public final void cancel() {
        if (this.LIZ != null) {
            C79083V1z.LIZ(0, "DataSourceCancellable", "cancel", "");
            this.LIZ.close();
        }
    }

    public C81720W5k(W4W w4w) {
        this.LIZ = w4w;
    }
}

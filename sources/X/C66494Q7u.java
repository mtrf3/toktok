package X;

/* renamed from: X.Q7u, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C66494Q7u implements Q6L<Q6O> {
    public final /* synthetic */ Q82<Q8F> LIZ;

    @Override // X.Q6L
    public final void onCancel() {
        this.LIZ.onCancel();
    }

    public C66494Q7u(Q82<Q8F> q82) {
        this.LIZ = q82;
    }

    @Override // X.Q6L
    public final void LIZ(Q4W q4w) {
        this.LIZ.MA(new Q86(q4w));
    }

    @Override // X.Q6L
    public final void onSuccess(Q6O q6o) {
        this.LIZ.onSuccess(new Q8F());
    }
}

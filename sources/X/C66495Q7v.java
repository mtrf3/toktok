package X;

/* renamed from: X.Q7v, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C66495Q7v implements Q6L<C66387Q3r> {
    public final /* synthetic */ Q82<Q8C> LIZ;

    @Override // X.Q6L
    public final void onCancel() {
        this.LIZ.onCancel();
    }

    public C66495Q7v(Q82<Q8C> q82) {
        this.LIZ = q82;
    }

    @Override // X.Q6L
    public final void LIZ(Q4W q4w) {
        this.LIZ.MA(new Q86(q4w));
    }

    @Override // X.Q6L
    public final void onSuccess(C66387Q3r c66387Q3r) {
        this.LIZ.onSuccess(new Q8C(c66387Q3r));
    }
}

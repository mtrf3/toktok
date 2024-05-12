package X;

/* renamed from: X.Igf, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C47257Igf implements J9W {
    public final /* synthetic */ C47256Ige LIZ;

    @Override // X.J9W
    public final void onSurfaceDestroy() {
    }

    @Override // X.J9W
    public final void LIZ() {
        RunnableC47253Igb runnableC47253Igb = this.LIZ.LIZJ;
        if (runnableC47253Igb != null) {
            runnableC47253Igb.run();
            this.LIZ.LIZJ = null;
        }
        RunnableC47252Iga runnableC47252Iga = this.LIZ.LIZLLL;
        if (runnableC47252Iga != null) {
            runnableC47252Iga.run();
            this.LIZ.LIZLLL = null;
        }
        this.LIZ.getClass();
    }

    public C47257Igf(C47256Ige c47256Ige) {
        this.LIZ = c47256Ige;
    }
}

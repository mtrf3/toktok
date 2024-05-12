package X;

/* renamed from: X.FhL, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class RunnableC39655FhL implements Runnable {
    public final /* synthetic */ C39647FhD LJLIL;

    public RunnableC39655FhL(C39647FhD c39647FhD) {
        this.LJLIL = c39647FhD;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.LJLIL.LIZ.LIZ();
        } catch (Exception unused) {
        } catch (Throwable th) {
            if (C39223FaN.LIZ(th)) {
            } else {
                throw th;
            }
        }
    }
}

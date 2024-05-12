package X;

/* renamed from: X.4bI, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C112524bI implements C1X {
    public final /* synthetic */ C112444bA LIZ;

    public C112524bI(C112444bA c112444bA) {
        this.LIZ = c112444bA;
    }

    @Override // X.C1X
    public final void LIZ(int i) {
        boolean z;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("[onLiveStatusChange], isPureModeOn = ");
        if (i == 1) {
            z = true;
        } else {
            z = false;
        }
        LIZ.append(z);
        C34B.LJI("IMNotificationPlayer", X1D.LIZIZ(LIZ));
        if (i != 0) {
            if (i != 1) {
                return;
            }
            this.LIZ.LIZLLL = true;
        } else {
            C34B.LJI("IMNotificationPlayer", "[onLiveStatusChange], recover [show] method");
            C112444bA c112444bA = this.LIZ;
            c112444bA.LIZLLL = false;
            c112444bA.LIZJ(0L);
        }
    }
}

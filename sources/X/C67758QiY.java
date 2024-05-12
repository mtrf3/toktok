package X;

import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;

/* renamed from: X.QiY, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C67758QiY implements InterfaceC67770Qik {
    public final C67759QiZ LIZ;

    public C67758QiY(C67759QiZ c67759QiZ) {
        this.LIZ = c67759QiZ;
    }

    @Override // X.InterfaceC67770Qik
    public final void LIZ(Bundle bundle) {
    }

    @Override // X.InterfaceC67770Qik
    public final void LIZIZ(ConnectionResult connectionResult, C67718Qhu<?> c67718Qhu, boolean z) {
    }

    @Override // X.InterfaceC67770Qik
    public final void LIZJ() {
    }

    @Override // X.InterfaceC67770Qik
    public final void LIZLLL() {
    }

    @Override // X.InterfaceC67770Qik
    public final boolean LJFF() {
        this.LIZ.LJLLJ.getClass();
        this.LIZ.LJII();
        return true;
    }

    @Override // X.InterfaceC67770Qik
    public final void LJ(int i) {
        this.LIZ.LJII();
        this.LIZ.LJLLL.LIZ(i, false);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(7:(2:1|2)|(2:4|(2:6|7))|9|10|11|7|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0059, code lost:
    
        r2 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x005a, code lost:
    
        r6.LJIILJJIL(new com.google.android.gms.common.api.Status(8, null, r2.getLocalizedMessage()));
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0066, code lost:
    
        throw r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x004b, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x004c, code lost:
    
        r6.LJIILJJIL(new com.google.android.gms.common.api.Status(8, null, r0.getLocalizedMessage()));
     */
    @Override // X.InterfaceC67770Qik
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final <A, T extends X.AbstractC67748QiO<? extends X.InterfaceC67754QiU, A>> T LJI(T r6) {
        /*
            r5 = this;
            X.QiZ r0 = r5.LIZ     // Catch: android.os.DeadObjectException -> L67
            X.QiW r0 = r0.LJLLJ     // Catch: android.os.DeadObjectException -> L67
            X.QiP r1 = r0.LLF     // Catch: android.os.DeadObjectException -> L67
            java.util.Set<com.google.android.gms.common.api.internal.BasePendingResult<?>> r0 = r1.LIZ     // Catch: android.os.DeadObjectException -> L67
            r0.add(r6)     // Catch: android.os.DeadObjectException -> L67
            X.QiT r1 = r1.LIZIZ     // Catch: android.os.DeadObjectException -> L67
            java.util.concurrent.atomic.AtomicReference<X.QiT> r0 = r6.LJI     // Catch: android.os.DeadObjectException -> L67
            r0.set(r1)     // Catch: android.os.DeadObjectException -> L67
            X.QiZ r0 = r5.LIZ     // Catch: android.os.DeadObjectException -> L67
            X.QiW r0 = r0.LJLLJ     // Catch: android.os.DeadObjectException -> L67
            X.Qi4 r1 = r6.LJIILJJIL     // Catch: android.os.DeadObjectException -> L67
            java.util.Map<X.Qi9<?>, X.Qjo> r0 = r0.LJLLLL     // Catch: android.os.DeadObjectException -> L67
            java.lang.Object r2 = r0.get(r1)     // Catch: android.os.DeadObjectException -> L67
            X.Qjo r2 = (X.InterfaceC67836Qjo) r2     // Catch: android.os.DeadObjectException -> L67
            java.lang.String r0 = "Appropriate Api was not requested."
            X.QH7.LJIIIZ(r2, r0)     // Catch: android.os.DeadObjectException -> L67
            boolean r0 = r2.isConnected()     // Catch: android.os.DeadObjectException -> L67
            r4 = 0
            if (r0 != 0) goto L45
            X.QiZ r0 = r5.LIZ     // Catch: android.os.DeadObjectException -> L67
            java.util.Map<X.Qi9<?>, com.google.android.gms.common.ConnectionResult> r1 = r0.LJLJL     // Catch: android.os.DeadObjectException -> L67
            X.Qi4 r0 = r6.LJIILJJIL     // Catch: android.os.DeadObjectException -> L67
            java.util.HashMap r1 = (java.util.HashMap) r1     // Catch: android.os.DeadObjectException -> L67
            boolean r0 = r1.containsKey(r0)     // Catch: android.os.DeadObjectException -> L67
            if (r0 == 0) goto L45
            com.google.android.gms.common.api.Status r1 = new com.google.android.gms.common.api.Status     // Catch: android.os.DeadObjectException -> L67
            r0 = 17
            r1.<init>(r0, r4, r4)     // Catch: android.os.DeadObjectException -> L67
            r6.LJIILJJIL(r1)     // Catch: android.os.DeadObjectException -> L67
            goto L71
        L45:
            r3 = 8
            r6.LJIILIIL(r2)     // Catch: android.os.RemoteException -> L4b android.os.DeadObjectException -> L59
            goto L71
        L4b:
            r0 = move-exception
            com.google.android.gms.common.api.Status r1 = new com.google.android.gms.common.api.Status     // Catch: android.os.DeadObjectException -> L67
            java.lang.String r0 = r0.getLocalizedMessage()     // Catch: android.os.DeadObjectException -> L67
            r1.<init>(r3, r4, r0)     // Catch: android.os.DeadObjectException -> L67
            r6.LJIILJJIL(r1)     // Catch: android.os.DeadObjectException -> L67
            goto L71
        L59:
            r2 = move-exception
            com.google.android.gms.common.api.Status r1 = new com.google.android.gms.common.api.Status     // Catch: android.os.DeadObjectException -> L67
            java.lang.String r0 = r2.getLocalizedMessage()     // Catch: android.os.DeadObjectException -> L67
            r1.<init>(r3, r4, r0)     // Catch: android.os.DeadObjectException -> L67
            r6.LJIILJJIL(r1)     // Catch: android.os.DeadObjectException -> L67
            throw r2     // Catch: android.os.DeadObjectException -> L67
        L67:
            X.QiZ r1 = r5.LIZ
            X.Qiu r0 = new X.Qiu
            r0.<init>(r5, r5)
            r1.LJIIIIZZ(r0)
        L71:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C67758QiY.LJI(X.QiO):X.QiO");
    }
}

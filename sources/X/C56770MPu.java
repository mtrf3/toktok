package X;

import com.ss.android.ugc.aweme.notification.NotificationFragment;

/* renamed from: X.MPu, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C56770MPu implements MRR {
    public final /* synthetic */ NotificationFragment LIZ;

    public C56770MPu(NotificationFragment notificationFragment) {
        this.LIZ = notificationFragment;
    }

    @Override // X.MRR
    public final void LIZ(int i) {
        C56766MPq c56766MPq = this.LIZ.vl().get(C56761MPl.class);
        if (!(c56766MPq instanceof C56761MPl)) {
            c56766MPq = null;
        }
        C56761MPl c56761MPl = (C56761MPl) c56766MPq;
        if (c56761MPl != null) {
            c56761MPl.LJIIL(i);
            return;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Cannot find widget: ");
        LIZ.append(C16880lQ.LJLLJ(C56761MPl.class));
        throw new IllegalStateException(X1D.LIZIZ(LIZ));
    }
}

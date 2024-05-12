package X;

import com.google.android.gms.common.ConnectionResult;

/* renamed from: X.QkX, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class RunnableC67881QkX implements Runnable {
    public final /* synthetic */ BinderC67831Qjj LJLIL;

    public RunnableC67881QkX(BinderC67831Qjj binderC67831Qjj) {
        this.LJLIL = binderC67831Qjj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            ((C67829Qjh) this.LJLIL.LJLJL).LIZIZ(new ConnectionResult(4));
        } finally {
            if (LIZ) {
            }
        }
    }
}

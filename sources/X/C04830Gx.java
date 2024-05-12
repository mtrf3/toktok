package X;

import android.content.Context;

/* renamed from: X.0Gx, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C04830Gx {
    public volatile boolean LIZ;
    public final Context LIZIZ;
    public volatile C0HW LIZJ;

    public /* synthetic */ C04830Gx(Context context) {
        this.LIZIZ = context;
    }

    public final C1FD LIZ() {
        if (this.LIZIZ != null) {
            if (this.LIZJ != null) {
                if (this.LIZ) {
                    if (this.LIZJ != null) {
                        return new C1FD(this.LIZ, this.LIZIZ, this.LIZJ);
                    }
                    return new C1FD(this.LIZ, this.LIZIZ);
                }
                throw new IllegalArgumentException("Support for pending purchases must be enabled. Enable this by calling 'enablePendingPurchases()' on BillingClientBuilder.");
            }
            throw new IllegalArgumentException("Please provide a valid listener for purchases updates.");
        }
        throw new IllegalArgumentException("Please provide a valid Context.");
    }
}

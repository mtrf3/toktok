package X;

import android.os.Bundle;

/* renamed from: X.QYb, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C67177QYb extends QYY<Void> {
    @Override // X.QYY
    public final boolean LIZIZ() {
        return true;
    }

    @Override // X.QYY
    public final void LIZ(Bundle bundle) {
        if (bundle.getBoolean("ack", false)) {
            LIZLLL(null);
        } else {
            LIZJ(new C67180QYe("Invalid response to one way request", null));
        }
    }

    public C67177QYb(int i, Bundle bundle) {
        super(i, 2, bundle);
    }
}

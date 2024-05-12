package X;

import android.os.Bundle;

/* renamed from: X.QYd, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C67179QYd extends QYY<Bundle> {
    @Override // X.QYY
    public final boolean LIZIZ() {
        return false;
    }

    @Override // X.QYY
    public final void LIZ(Bundle bundle) {
        Bundle bundle2 = bundle.getBundle("data");
        if (bundle2 == null) {
            bundle2 = Bundle.EMPTY;
        }
        LIZLLL(bundle2);
    }

    public C67179QYd(int i, Bundle bundle) {
        super(i, 1, bundle);
    }
}

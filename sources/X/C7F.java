package X;

import android.os.Bundle;

/* loaded from: classes6.dex */
public final class C7F implements C7I {
    @Override // X.C7I
    public final boolean LIZ(Bundle bundle) {
        if (bundle.getInt("open_subscription") == 1) {
            return true;
        }
        return false;
    }
}

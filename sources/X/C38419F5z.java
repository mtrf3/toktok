package X;

import android.content.Intent;
import android.os.Build;
import kotlin.jvm.internal.o;

/* renamed from: X.F5z, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38419F5z implements F61 {
    @Override // X.F61
    public final boolean LIZ(Intent intent) {
        o.LJIIIZ(intent, "intent");
        return true;
    }

    @Override // X.F61
    public final boolean LIZIZ(Intent intent) {
        o.LJIIIZ(intent, "intent");
        if (Build.VERSION.SDK_INT >= 29 && intent.getIdentifier() != null && "third_party_app_identifier".equals(intent.getIdentifier())) {
            return true;
        }
        return false;
    }
}

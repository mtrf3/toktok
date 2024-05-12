package X;

import android.os.Bundle;
import kotlin.jvm.internal.o;

/* renamed from: X.2ua, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C73522ua extends AbstractC65781Prl implements InterfaceC88471Ynr<Bundle, String, Boolean> {
    public C73522ua() {
        super(2);
    }

    @Override // X.InterfaceC88471Ynr
    public final Boolean invoke(Bundle bundle, String key) {
        boolean z;
        o.LJIIJ(bundle, "bundle");
        o.LJIIJ(key, "key");
        if (bundle.containsKey(key)) {
            String string = bundle.getString(key);
            if (string != null) {
                z = o.LJ(string, "1");
            } else {
                z = bundle.getBoolean(key);
            }
            return Boolean.valueOf(z);
        }
        return null;
    }
}

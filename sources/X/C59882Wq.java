package X;

import android.os.Bundle;
import kotlin.jvm.internal.o;

/* renamed from: X.2Wq, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C59882Wq extends AbstractC65781Prl implements InterfaceC88473Ynt<Bundle, String, Boolean, Bundle> {
    public C59882Wq() {
        super(3);
    }

    @Override // X.InterfaceC88473Ynt
    public /* bridge */ /* synthetic */ Bundle invoke(Bundle bundle, String str, Boolean bool) {
        Bundle bundle2 = bundle;
        invoke(bundle2, str, bool);
        return bundle2;
    }

    public final Bundle invoke(Bundle builder, String key, Boolean bool) {
        o.LJIIJ(builder, "builder");
        o.LJIIJ(key, "key");
        builder.putBoolean(key, bool.booleanValue());
        return builder;
    }
}

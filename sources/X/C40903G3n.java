package X;

import android.os.Bundle;
import kotlin.jvm.internal.o;

/* renamed from: X.G3n, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C40903G3n extends G46 {
    @Override // X.G48, X.InterfaceC86124Xr6
    public final void onActivityPreCreated(ActivityC86117Xqz activity, Bundle bundle) {
        o.LJIIIZ(activity, "activity");
        if (C40905G3p.LIZJ == null || !C40905G3p.LIZ().LIZJ) {
            return;
        }
        try {
            if (C16880lQ.LLZIL(activity).getFactory2() != null) {
                return;
            }
            C16880lQ.LLZIL(activity).setFactory2(new LayoutInflaterFactory2C40904G3o(activity.getDelegate()));
        } catch (Throwable unused) {
        }
    }
}

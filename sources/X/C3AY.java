package X;

import android.app.Activity;
import kotlin.jvm.internal.AqS44S1200000_1;
import kotlin.jvm.internal.o;

/* renamed from: X.3AY, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C3AY {
    public static final void LIZ(Activity activity, String str, String str2, String str3, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro2) {
        o.LJIIIZ(activity, "activity");
        if (activity.isFinishing()) {
            return;
        }
        if (interfaceC65784Pro != null) {
            interfaceC65784Pro.invoke();
        }
        C26227ARb LIZ = C3AW.LIZ(activity);
        LIZ.LJFF(str);
        LIZ.LIZIZ(str2);
        UC0.LIZJ(LIZ, new AqS44S1200000_1(activity, str3, interfaceC65784Pro2, 4));
        LIZ.LJI().LIZLLL();
    }
}

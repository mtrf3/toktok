package X;

import android.app.Activity;
import kotlin.jvm.internal.o;

/* renamed from: X.FRz, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38991FRz<T> implements InterfaceC73592SuS {
    public static final C38991FRz<T> LJLIL = new C38991FRz<>();

    @Override // X.InterfaceC73592SuS
    public final boolean test(Object obj) {
        BPL it = (BPL) obj;
        o.LJIIIZ(it, "it");
        Activity activity = it.LIZ;
        if (activity != null && C38354F3m.LIZJ(activity.getClass().getName(), "com.ss.android.ugc.aweme.main.MainActivity")) {
            return true;
        }
        return false;
    }
}

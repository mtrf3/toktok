package X;

import android.app.Activity;
import kotlin.jvm.internal.o;

/* renamed from: X.Eax, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C36711Eax implements InterfaceC73592SuS<BPL> {
    public static final C36711Eax LJLIL = new C36711Eax();

    @Override // X.InterfaceC73592SuS
    public final boolean test(BPL bpl) {
        BPL t = bpl;
        o.LJIIIZ(t, "t");
        Activity activity = t.LIZ;
        if (activity != null && o.LJ(activity.getClass().getName(), "com.ss.android.ugc.aweme.main.MainActivity")) {
            return true;
        }
        return false;
    }
}

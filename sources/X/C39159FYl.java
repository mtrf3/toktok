package X;

import com.bytedance.crash.CrashType;
import com.bytedance.crash.ICrashCallback;
import kotlin.jvm.internal.o;

/* renamed from: X.FYl, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39159FYl implements ICrashCallback {
    public static final C39159FYl LJLIL = new C39159FYl();

    @Override // com.bytedance.crash.ICrashCallback
    public final void onCrash(CrashType type, String str, Thread thread) {
        o.LJIIIZ(type, "type");
        C39163FYp.LJFF().storeLong("exit_by_exception_time", System.currentTimeMillis());
        int i = C39158FYk.LIZ[type.ordinal()];
        int i2 = 2;
        if (i != 1) {
            if (i != 2) {
                i2 = 1;
            } else {
                i2 = 3;
            }
        }
        C39163FYp.LJFF().storeInt("exit_exception", i2);
    }
}

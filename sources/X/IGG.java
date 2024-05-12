package X;

import com.ss.android.ugc.aweme.services.RuntimeBehaviorServiceDiff;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class IGG implements InterfaceC43151Gwd {
    @Override // X.InterfaceC43151Gwd
    public final void LIZ(String str) {
        RuntimeBehaviorServiceDiff.INSTANCE.event(str);
    }

    @Override // X.InterfaceC43151Gwd
    public final void event(String str, String msg) {
        o.LJIIIZ(msg, "msg");
        RuntimeBehaviorServiceDiff.INSTANCE.event(str, msg);
    }
}

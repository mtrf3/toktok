package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import kotlin.jvm.internal.o;

/* loaded from: classes12.dex */
public final class QVW {
    public static final /* synthetic */ int LIZ = 0;

    public static Integer LIZ(C67101QVd c67101QVd) {
        if (c67101QVd == null) {
            return 0;
        }
        try {
            QVX qvx = ((QVZ) ListProtector.get(c67101QVd.topics, 0)).flag;
            o.LJFF(qvx, "msg.topics[0].flag");
            return Integer.valueOf(qvx.getValue());
        } catch (Throwable unused) {
            return 0;
        }
    }
}

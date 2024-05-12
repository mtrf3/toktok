package X;

import com.bytedance.crash.CrashType;
import com.bytedance.crash.ICrashCallback;
import com.ss.android.ugc.aweme.sec.DmtSec;
import kotlin.jvm.internal.o;

/* loaded from: classes12.dex */
public final class QNZ implements ICrashCallback {
    public static final QNZ LJLIL = new QNZ();

    @Override // com.bytedance.crash.ICrashCallback
    public final void onCrash(CrashType crashType, String str, Thread thread) {
        int increaseCrashTimes = DmtSec.INSTANCE.increaseCrashTimes(str);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("NPTH crash = ");
        LIZ.append(crashType);
        LIZ.append(", count = ");
        LIZ.append(increaseCrashTimes);
        LIZ.append(", string ");
        LIZ.append(str);
        LIZ.append(", thread ");
        LIZ.append(thread);
        String msg = X1D.LIZIZ(LIZ);
        o.LJIIIZ(msg, "msg");
    }
}

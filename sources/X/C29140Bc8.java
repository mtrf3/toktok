package X;

import android.os.MessageQueue;
import com.ss.ttlivestreamer.core.utils.TTLSPreInitBusinessHelper;

/* renamed from: X.Bc8, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C29140Bc8 implements MessageQueue.IdleHandler {
    public static final C29140Bc8 LJLIL = new C29140Bc8();

    @Override // android.os.MessageQueue.IdleHandler
    public final boolean queueIdle() {
        C31147CKh.LIZ();
        TTLSPreInitBusinessHelper.preInitAllThreads();
        return false;
    }
}

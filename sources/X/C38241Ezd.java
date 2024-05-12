package X;

import android.os.Process;
import com.ss.android.ugc.bytex.pthread.base.proxy.PthreadThread;

/* renamed from: X.Ezd, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38241Ezd extends PthreadThread {
    public final /* synthetic */ ThreadFactoryC38240Ezc LJLIL;

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            EnumC38242Eze enumC38242Eze = this.LJLIL.LJLILLLLZI;
            if (enumC38242Eze == EnumC38242Eze.LOW) {
                Process.setThreadPriority(10);
            } else if (enumC38242Eze == EnumC38242Eze.HIGH) {
                Process.setThreadPriority(-4);
            }
            super.run();
        } finally {
            if (LIZ) {
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C38241Ezd(Runnable runnable, String str, ThreadFactoryC38240Ezc threadFactoryC38240Ezc) {
        super(runnable, str);
        this.LJLIL = threadFactoryC38240Ezc;
    }
}

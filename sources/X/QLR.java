package X;

import com.ss.android.common.applog.AppLog;
import com.ss.android.ugc.bytex.pthread.base.proxy.PthreadThread;

/* loaded from: classes12.dex */
public final class QLR extends PthreadThread {
    public final /* synthetic */ String LJLIL;
    public final /* synthetic */ boolean LJLILLLLZI;
    public final /* synthetic */ long LJLJI;
    public final /* synthetic */ AppLog LJLJJI;

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            this.LJLJJI.updateConfig(this.LJLIL, this.LJLILLLLZI, this.LJLJI);
        } finally {
            if (LIZ) {
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public QLR(AppLog appLog, String str, boolean z, long j) {
        super("plog/AppLog$2");
        this.LJLJJI = appLog;
        this.LJLIL = str;
        this.LJLILLLLZI = z;
        this.LJLJI = j;
    }
}

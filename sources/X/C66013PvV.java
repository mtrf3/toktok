package X;

import com.ss.android.agilelogger.ALog;
import java.util.TimerTask;

/* renamed from: X.PvV, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C66013PvV extends TimerTask {
    public final /* synthetic */ String LJLIL;
    public final /* synthetic */ String LJLILLLLZI;

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            ALog.removeLegacyFiles(this.LJLIL, this.LJLILLLLZI);
        } finally {
            if (LIZ) {
            }
        }
    }

    public C66013PvV(String str, String str2) {
        this.LJLIL = str;
        this.LJLILLLLZI = str2;
    }
}

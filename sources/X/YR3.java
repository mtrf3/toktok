package X;

import com.ss.android.common.lib.AppLogNewUtils;
import com.ss.videoarch.live.ttquic.TTLogManager;
import org.json.JSONObject;

/* loaded from: classes16.dex */
public final class YR3 implements Runnable {
    public final /* synthetic */ int LJLIL;
    public final /* synthetic */ int LJLILLLLZI;
    public final /* synthetic */ JSONObject LJLJI;
    public final /* synthetic */ TTLogManager LJLJJI;

    @Override // java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            synchronized (this.LJLJJI.mLogLock) {
                int i = this.LJLIL;
                if (i == 1 || i == 101) {
                    AppLogNewUtils.onEventV3(TTLogManager.mAlogEventKey[this.LJLILLLLZI], this.LJLJI);
                }
            }
        } finally {
            if (LIZ) {
            }
        }
    }

    public YR3(TTLogManager tTLogManager, int i, int i2, JSONObject jSONObject) {
        this.LJLJJI = tTLogManager;
        this.LJLIL = i;
        this.LJLILLLLZI = i2;
        this.LJLJI = jSONObject;
    }
}

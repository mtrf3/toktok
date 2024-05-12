package X;

import android.os.Handler;
import android.os.HandlerThread;
import android.text.TextUtils;
import com.bytedance.android.livesdk.stream.performance.abs.AudienceBlockHeartBeatMonitorEnableSetting;
import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: X.BKj, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C28601BKj {
    public final HandlerThread LIZ;
    public final boolean LIZIZ = AudienceBlockHeartBeatMonitorEnableSetting.INSTANCE.getValue();
    public final ConcurrentHashMap<String, BLA> LIZJ = new ConcurrentHashMap<>();
    public final ConcurrentHashMap<String, Long> LIZLLL = new ConcurrentHashMap<>();
    public final HashMap<Long, String> LJ = new HashMap<>();
    public Handler LJFF;

    public C28601BKj(HandlerThread handlerThread) {
        this.LIZ = handlerThread;
    }

    public final void LIZIZ(C28611BKt c28611BKt) {
        if (c28611BKt != null && !TextUtils.isEmpty(c28611BKt.LIZ) && c28611BKt.LIZIZ > 0) {
            this.LIZLLL.put(c28611BKt.LIZ, Long.valueOf(c28611BKt.LIZIZ));
        }
    }

    public final void LIZ(long j, String str, boolean z) {
        if (!this.LIZIZ || j <= 0 || TextUtils.isEmpty(str)) {
            return;
        }
        if (this.LJFF == null && this.LIZ.isAlive()) {
            this.LJFF = new Handler(this.LIZ.getLooper());
        }
        Handler handler = this.LJFF;
        if (handler == null) {
            return;
        }
        handler.post(new BL9(this, j, str, z));
    }
}

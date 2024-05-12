package X;

import android.content.ContentValues;
import android.content.Context;
import com.bytedance.common.wschannel.WsChannelMultiProcessSharedProvider;

/* loaded from: classes12.dex */
public class QM3 {
    public final Context LIZ;
    public final ContentValues LIZIZ = new ContentValues();

    public final synchronized void LIZ() {
        try {
            this.LIZ.getContentResolver().insert(WsChannelMultiProcessSharedProvider.LIZ(this.LIZ, "key", "type"), this.LIZIZ);
        } catch (Throwable unused) {
        }
    }

    public final synchronized void LIZIZ() {
        LIZ();
    }

    public QM3(Context context) {
        this.LIZ = C16880lQ.LLLLL(context);
    }
}

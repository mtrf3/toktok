package X;

import android.content.ContentValues;
import android.content.Context;
import com.ss.android.common.util.MultiProcessSharedProvider;

/* loaded from: classes7.dex */
public class FXF {
    public final Context LIZ;
    public final ContentValues LIZIZ = new ContentValues();

    public final synchronized void LIZ() {
        try {
            this.LIZ.getContentResolver().insert(MultiProcessSharedProvider.LIZ(this.LIZ, "key", "type"), this.LIZIZ);
        } catch (Throwable unused) {
        }
    }

    public FXF(Context context) {
        this.LIZ = C16880lQ.LLLLL(context);
    }
}

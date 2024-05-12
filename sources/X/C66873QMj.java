package X;

import android.content.ContentValues;
import android.content.Context;
import com.ss.android.pushmanager.setting.PushMultiProcessSharedProvider;

/* renamed from: X.QMj, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public class C66873QMj {
    public final Context LIZ;
    public final ContentValues LIZIZ = new ContentValues();

    public final synchronized void LIZ() {
        try {
            this.LIZ.getContentResolver().insert(PushMultiProcessSharedProvider.LIZIZ(this.LIZ, "key", "type"), this.LIZIZ);
        } catch (Throwable unused) {
        }
    }

    public C66873QMj(Context context) {
        this.LIZ = C16880lQ.LLLLL(context);
    }
}

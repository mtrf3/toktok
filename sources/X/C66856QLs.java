package X;

import android.content.ContentValues;
import android.content.Context;
import android.content.SharedPreferences;
import com.ss.android.token.AuthTokenMultiProcessSharedProvider;
import java.util.Map;

/* renamed from: X.QLs, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public class C66856QLs {
    public final Context LIZ;
    public final ContentValues LIZIZ = new ContentValues();

    public final synchronized void LIZ() {
        try {
            SharedPreferences.Editor edit = F9J.LIZIZ(this.LIZ, 4, AuthTokenMultiProcessSharedProvider.LJLJLLL).edit();
            for (Map.Entry<String, Object> entry : this.LIZIZ.valueSet()) {
                Object value = entry.getValue();
                String key = entry.getKey();
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("MultiProcessShareProvider apply key = ");
                LIZ.append(key);
                LIZ.append(" value = ");
                LIZ.append(C66953QPl.LIZIZ(value));
                FXA.LIZ("AuthTokenMultiProcessShared", X1D.LIZIZ(LIZ));
                if (value instanceof String) {
                    edit.putString(key, (String) value);
                } else if (value instanceof Boolean) {
                    edit.putBoolean(key, ((Boolean) value).booleanValue());
                } else if (value instanceof Long) {
                    edit.putLong(key, ((Long) value).longValue());
                } else if (value instanceof Integer) {
                    edit.putInt(key, ((Integer) value).intValue());
                } else if (value instanceof Float) {
                    edit.putFloat(key, ((Float) value).floatValue());
                }
            }
            edit.commit();
            this.LIZ.getContentResolver().insert(AuthTokenMultiProcessSharedProvider.LIZIZ(this.LIZ, "key", "type"), this.LIZIZ);
        } catch (Throwable th) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("MultiProcessShareProvider apply error = ");
            LIZ2.append(android.util.Log.getStackTraceString(th));
            FXA.LIZ("AuthTokenMultiProcessShared", X1D.LIZIZ(LIZ2));
            C38901fq.LJI(th);
        }
    }

    public C66856QLs(Context context) {
        this.LIZ = C16880lQ.LLLLL(context);
    }
}

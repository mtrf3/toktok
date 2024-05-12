package X;

import android.text.TextUtils;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.BLy, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C28642BLy implements InterfaceC28641BLx {
    public final ConcurrentHashMap<String, String> LIZIZ = new ConcurrentHashMap<>();

    @Override // X.InterfaceC28641BLx
    public final void LIZIZ() {
        this.LIZIZ.clear();
    }

    @Override // X.InterfaceC28641BLx
    public final void LIZ(JSONObject log) {
        o.LJIIIZ(log, "log");
        String optString = log.optString("event_key");
        o.LJIIIIZZ(optString, "log.optString(\"event_key\")");
        if (TextUtils.equals(optString, "first_frame")) {
            InterfaceC28641BLx.LIZ.getClass();
            int length = C28640BLw.LIZIZ.length;
            for (int i = 0; i < length; i++) {
                C28640BLw c28640BLw = InterfaceC28641BLx.LIZ;
                c28640BLw.getClass();
                long optLong = log.optLong(C28640BLw.LIZJ[i], 0L);
                if (optLong == 0) {
                    return;
                }
                c28640BLw.getClass();
                LIZLLL(C28640BLw.LIZIZ[i], String.valueOf(optLong));
            }
        }
    }

    public final long LIZJ(String str) {
        String str2 = this.LIZIZ.get("start_real");
        if (str2 != null) {
            long parseLong = CastLongProtector.parseLong(str2);
            String str3 = this.LIZIZ.get(str);
            if (str3 != null) {
                long parseLong2 = CastLongProtector.parseLong(str3) - parseLong;
                if (parseLong2 >= 0) {
                    return parseLong2;
                }
                return 0L;
            }
            return -1L;
        }
        return -1L;
    }

    public final void LIZLLL(String key, String value) {
        o.LJIIIZ(key, "key");
        o.LJIIIZ(value, "value");
        if (!TextUtils.isEmpty(key) && !TextUtils.isEmpty(value) && !this.LIZIZ.contains(key)) {
            this.LIZIZ.put(key, value);
        }
    }
}

package X;

import android.content.SharedPreferences;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import kotlin.jvm.internal.o;
import ujb.s;

/* renamed from: X.NJq, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class CallableC59158NJq<V> implements Callable {
    public static final CallableC59158NJq<V> LJLIL = new CallableC59158NJq<>();

    @Override // java.util.concurrent.Callable
    public final Object call() {
        SharedPreferences LIZ;
        java.util.Set<Map.Entry<String, ?>> entrySet;
        if (((Boolean) C23840we.LIZIZ.getValue()).booleanValue()) {
            C61511OCd.LIZIZ(false, 0L, C59159NJr.LIZ(), 4, true, 64);
        }
        if (C59165NJx.LIZ.LIZ() && (LIZ = C59165NJx.LIZ()) != null) {
            SharedPreferences.Editor edit = LIZ.edit();
            java.util.Map<String, ?> all = LIZ.getAll();
            if (all != null && (entrySet = all.entrySet()) != null) {
                for (Map.Entry<String, ?> entry : entrySet) {
                    Object value = entry.getValue();
                    if (!(value instanceof Long)) {
                        value = null;
                    }
                    Long l = (Long) value;
                    if (l != null && l.longValue() < System.currentTimeMillis()) {
                        String key = entry.getKey();
                        o.LJFF(key, "it.key");
                        List LJLJJL = s.LJLJJL(key, new String[]{"-"}, 0, 6);
                        if (LJLJJL.size() == 2) {
                            String str = (String) ListProtector.get(LJLJJL, 0);
                            String str2 = (String) ListProtector.get(LJLJJL, 1);
                            boolean LIZJ = OAH.LIZJ(C70657RoD.LJIIIZ(str, str2));
                            if (LIZJ && edit != null) {
                                edit.remove(entry.getKey());
                            }
                            OD6.LJFF(new O08(LIZJ ? 1 : 0, str, str2, 0, 0L, (String) null, 9));
                        } else {
                            StringBuilder LIZ2 = X1D.LIZ();
                            LIZ2.append("saved key not the couple of ak and channel: ");
                            LIZ2.append(entry.getKey());
                            OC6.LIZLLL("SpecificTimeClean", X1D.LIZIZ(LIZ2));
                        }
                    }
                }
            }
            if (edit != null) {
                edit.apply();
            }
        }
        return Integer.valueOf(android.util.Log.d("GeckoExpireActiveDay", "meta data writeImmediately"));
    }
}

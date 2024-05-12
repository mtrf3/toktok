package X;

import com.bytedance.keva.Keva;
import com.bytedance.keva.KevaImpl;
import com.ss.android.ugc.aweme.utils.JsonParseUtils;
import kotlin.jvm.internal.o;

/* renamed from: X.7EJ, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C7EJ {
    public static final /* synthetic */ int LIZ = 0;

    public static long LIZIZ(String key) {
        Long l = 0L;
        o.LJIIIZ(key, "key");
        return KevaImpl.getRepoFromSp(EF7.LIZIZ(), "comment_sp", 0).getLong(key, l.longValue());
    }

    public static int LIZ(String key, Integer num) {
        o.LJIIIZ(key, "key");
        int i = 0;
        Keva repoFromSp = KevaImpl.getRepoFromSp(EF7.LIZIZ(), "comment_sp", 0);
        if (num != null) {
            i = num.intValue();
        }
        return repoFromSp.getInt(key, i);
    }

    public static void LIZJ(String key, Object obj) {
        o.LJIIIZ(key, "key");
        Keva repoFromSp = KevaImpl.getRepoFromSp(EF7.LIZIZ(), "comment_sp", 0);
        if (obj instanceof String) {
            repoFromSp.storeString(key, (String) obj);
            return;
        }
        if (obj instanceof Boolean) {
            repoFromSp.storeBoolean(key, ((Boolean) obj).booleanValue());
            return;
        }
        if (obj instanceof Long) {
            repoFromSp.storeLong(key, ((Number) obj).longValue());
        } else if (obj instanceof Integer) {
            repoFromSp.storeInt(key, ((Number) obj).intValue());
        } else {
            repoFromSp.storeString(key, JsonParseUtils.LIZLLL(obj));
        }
    }
}

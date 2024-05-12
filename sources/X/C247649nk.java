package X;

import com.bytedance.keva.Keva;
import com.bytedance.keva.KevaImpl;

/* renamed from: X.9nk, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C247649nk {
    public final Keva LIZ = KevaImpl.getRepoFromSp(((AbstractC247499nV) C95J.LIZ(0)).LJ(), "fe-storage", 0);

    public final void LIZ(Object obj, String str) {
        if (str == null || obj == null) {
            return;
        }
        try {
            if (obj instanceof Boolean) {
                this.LIZ.storeBoolean(str, ((Boolean) obj).booleanValue());
                return;
            }
            if (obj instanceof String) {
                this.LIZ.storeString(str, (String) obj);
            } else if (obj instanceof Long) {
                this.LIZ.storeLong(str, ((Long) obj).longValue());
            } else if (obj instanceof Integer) {
                this.LIZ.storeInt(str, ((Integer) obj).intValue());
            }
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
        }
    }
}

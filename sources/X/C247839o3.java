package X;

import com.bytedance.keva.Keva;
import com.bytedance.keva.KevaImpl;

/* renamed from: X.9o3, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C247839o3 {
    public final Keva LIZ = KevaImpl.getRepoFromSp(EF7.LIZIZ(), "fe-storage", 0);

    public final Boolean LIZ(Boolean bool, String str) {
        return Boolean.valueOf(this.LIZ.getBoolean(str, bool.booleanValue()));
    }

    public final String LIZIZ(String str, String str2) {
        return this.LIZ.getString(str, str2);
    }

    public final boolean LIZJ(Object obj, String str) {
        if (str != null && obj != null) {
            try {
                if (obj instanceof Boolean) {
                    LIZLLL((Boolean) obj, str);
                    return true;
                }
                if (obj instanceof String) {
                    LJ(str, (String) obj);
                    return true;
                }
                if (obj instanceof Long) {
                    this.LIZ.storeLong(str, ((Long) obj).longValue());
                    return true;
                }
                if (!(obj instanceof Integer)) {
                    return false;
                }
                this.LIZ.storeInt(str, ((Integer) obj).intValue());
                return true;
            } catch (Exception e) {
                C16880lQ.LLLLIIL(e);
            }
        }
        return false;
    }

    public final void LIZLLL(Boolean bool, String str) {
        this.LIZ.storeBoolean(str, bool.booleanValue());
    }

    public final void LJ(String str, String str2) {
        this.LIZ.storeString(str, str2);
    }
}

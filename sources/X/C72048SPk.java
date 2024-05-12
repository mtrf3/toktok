package X;

import com.ss.android.ugc.tiktok.tpsc.model.PrivacyUserSettingsV2;
import kotlin.jvm.internal.o;

/* renamed from: X.SPk, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C72048SPk {
    public final PrivacyUserSettingsV2 LIZ;
    public final String LIZIZ;
    public final boolean LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C72048SPk)) {
            return false;
        }
        C72048SPk c72048SPk = (C72048SPk) obj;
        return o.LJ(this.LIZ, c72048SPk.LIZ) && o.LJ(this.LIZIZ, c72048SPk.LIZIZ) && this.LIZJ == c72048SPk.LIZJ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        PrivacyUserSettingsV2 privacyUserSettingsV2 = this.LIZ;
        int hashCode = (privacyUserSettingsV2 == null ? 0 : privacyUserSettingsV2.hashCode()) * 31;
        String str = this.LIZIZ;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        boolean z = this.LIZJ;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return hashCode2 + i;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("PrivacyUserSettingCacheData(privacyUserSettings=");
        LIZ.append(this.LIZ);
        LIZ.append(", logId=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", modified=");
        return C48339Iy7.LIZJ(LIZ, this.LIZJ, ')', LIZ);
    }

    public C72048SPk(PrivacyUserSettingsV2 privacyUserSettingsV2, String str, boolean z) {
        this.LIZ = privacyUserSettingsV2;
        this.LIZIZ = str;
        this.LIZJ = z;
    }
}

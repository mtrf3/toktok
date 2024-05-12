package X;

import com.bytedance.android.livesdk.comp.api.linkcore.model.OnLineMicInfo;
import com.bytedance.android.livesdk.comp.api.linkcore.model.RtcUserInfo;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class U7A {
    public static final /* synthetic */ int LIZLLL = 0;
    public final RtcUserInfo LIZ;
    public final String LIZIZ;
    public final java.util.Map<Long, OnLineMicInfo> LIZJ;

    public U7A() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof U7A)) {
            return false;
        }
        U7A u7a = (U7A) obj;
        return o.LJ(this.LIZ, u7a.LIZ) && o.LJ(this.LIZIZ, u7a.LIZIZ) && o.LJ(this.LIZJ, u7a.LIZJ);
    }

    public final int hashCode() {
        RtcUserInfo rtcUserInfo = this.LIZ;
        int hashCode = (rtcUserInfo == null ? 0 : rtcUserInfo.hashCode()) * 31;
        String str = this.LIZIZ;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        java.util.Map<Long, OnLineMicInfo> map = this.LIZJ;
        return hashCode2 + (map != null ? map.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("LinkEventData(rtcUserInfo=");
        LIZ.append(this.LIZ);
        LIZ.append(", rtcInfo=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", onLineMicInfo=");
        return C15890jp.LIZ(LIZ, this.LIZJ, ')', LIZ);
    }

    public U7A(U7B u7b) {
        RtcUserInfo rtcUserInfo = u7b.LIZ;
        String str = u7b.LIZIZ;
        java.util.Map<Long, OnLineMicInfo> map = u7b.LIZJ;
        this.LIZ = rtcUserInfo;
        this.LIZIZ = str;
        this.LIZJ = map;
    }
}

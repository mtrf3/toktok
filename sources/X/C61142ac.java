package X;

import com.bytedance.android.livesdk.model.message.BottomMessage;
import kotlin.jvm.internal.o;

/* renamed from: X.2ac, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C61142ac {
    public final String LIZ;
    public final String LIZIZ;
    public final BottomMessage LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C61142ac)) {
            return false;
        }
        C61142ac c61142ac = (C61142ac) obj;
        return o.LJ(this.LIZ, c61142ac.LIZ) && o.LJ(this.LIZIZ, c61142ac.LIZIZ) && o.LJ(this.LIZJ, c61142ac.LIZJ);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("GameLiveWarnTipsShowingData(content=");
        LIZ.append(this.LIZ);
        LIZ.append(", type=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", bottomMessage=");
        LIZ.append(this.LIZJ);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public final int hashCode() {
        int hashCode;
        int LJ = C79062V1e.LJ(this.LIZIZ, this.LIZ.hashCode() * 31, 31);
        BottomMessage bottomMessage = this.LIZJ;
        if (bottomMessage == null) {
            hashCode = 0;
        } else {
            hashCode = bottomMessage.hashCode();
        }
        return LJ + hashCode;
    }

    public C61142ac(String content, String str, BottomMessage bottomMessage) {
        o.LJIIIZ(content, "content");
        this.LIZ = content;
        this.LIZIZ = str;
        this.LIZJ = bottomMessage;
    }
}

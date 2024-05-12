package X;

import com.bytedance.android.livesdk.model.message.PunishEventInfo;
import kotlin.jvm.internal.o;

/* renamed from: X.BWh, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C28911BWh {
    public final int LIZ;
    public final BUW LIZIZ;
    public final CharSequence LIZJ;
    public final CharSequence LIZLLL;
    public final String LJ;
    public final PunishEventInfo LJFF;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C28911BWh)) {
            return false;
        }
        C28911BWh c28911BWh = (C28911BWh) obj;
        return this.LIZ == c28911BWh.LIZ && this.LIZIZ == c28911BWh.LIZIZ && o.LJ(this.LIZJ, c28911BWh.LIZJ) && o.LJ(this.LIZLLL, c28911BWh.LIZLLL) && o.LJ(this.LJ, c28911BWh.LJ) && o.LJ(this.LJFF, c28911BWh.LJFF);
    }

    public final int hashCode() {
        int hashCode = (this.LIZLLL.hashCode() + ((this.LIZJ.hashCode() + ((this.LIZIZ.hashCode() + (this.LIZ * 31)) * 31)) * 31)) * 31;
        String str = this.LJ;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        PunishEventInfo punishEventInfo = this.LJFF;
        return hashCode2 + (punishEventInfo != null ? punishEventInfo.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("PerceptionBannerInfo(viewVisibility=");
        LIZ.append(this.LIZ);
        LIZ.append(", notifyType=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", title=");
        LIZ.append((Object) this.LIZJ);
        LIZ.append(", subTitle=");
        LIZ.append((Object) this.LIZLLL);
        LIZ.append(", url=");
        LIZ.append(this.LJ);
        LIZ.append(", info=");
        LIZ.append(this.LJFF);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public C28911BWh(BUW notifyType, CharSequence title, CharSequence charSequence, String str, PunishEventInfo punishEventInfo) {
        o.LJIIIZ(notifyType, "notifyType");
        o.LJIIIZ(title, "title");
        this.LIZ = 0;
        this.LIZIZ = notifyType;
        this.LIZJ = title;
        this.LIZLLL = charSequence;
        this.LJ = str;
        this.LJFF = punishEventInfo;
    }
}

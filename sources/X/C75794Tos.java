package X;

import android.content.Context;
import com.bytedance.ies.sdk.widgets.LiveWidget;
import kotlin.jvm.internal.o;

/* renamed from: X.Tos, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C75794Tos {
    public final Long LIZ;
    public final Long LIZIZ;
    public final Context LIZJ;
    public final int LIZLLL;
    public final boolean LJ;
    public final boolean LJFF;
    public final EnumC32197CkL LJI;
    public final LiveWidget LJII;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C75794Tos)) {
            return false;
        }
        C75794Tos c75794Tos = (C75794Tos) obj;
        return o.LJ(this.LIZ, c75794Tos.LIZ) && o.LJ(this.LIZIZ, c75794Tos.LIZIZ) && o.LJ(this.LIZJ, c75794Tos.LIZJ) && this.LIZLLL == c75794Tos.LIZLLL && this.LJ == c75794Tos.LJ && this.LJFF == c75794Tos.LJFF && this.LJI == c75794Tos.LJI && o.LJ(this.LJII, c75794Tos.LJII);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        Long l = this.LIZ;
        int hashCode = (l == null ? 0 : l.hashCode()) * 31;
        Long l2 = this.LIZIZ;
        int hashCode2 = (hashCode + (l2 == null ? 0 : l2.hashCode())) * 31;
        Context context = this.LIZJ;
        int hashCode3 = (((hashCode2 + (context == null ? 0 : context.hashCode())) * 31) + this.LIZLLL) * 31;
        boolean z = this.LJ;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int hashCode4 = (this.LJI.hashCode() + ((((hashCode3 + i) * 31) + (this.LJFF ? 1 : 0)) * 31)) * 31;
        LiveWidget liveWidget = this.LJII;
        return hashCode4 + (liveWidget != null ? liveWidget.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("LinkMicFeedPackageData(roomId=");
        LIZ.append(this.LIZ);
        LIZ.append(", roomOwnerUserId=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", context=");
        LIZ.append(this.LIZJ);
        LIZ.append(", roomMode=");
        LIZ.append(this.LIZLLL);
        LIZ.append(", isFromForYouFeed=");
        LIZ.append(this.LJ);
        LIZ.append(", isFromFollowingFeed=");
        LIZ.append(this.LJFF);
        LIZ.append(", pageType=");
        LIZ.append(this.LJI);
        LIZ.append(", liveWidget=");
        LIZ.append(this.LJII);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public C75794Tos(Long l, Long l2, Context context, int i, EnumC32197CkL pageType, LiveWidget liveWidget) {
        o.LJIIIZ(pageType, "pageType");
        this.LIZ = l;
        this.LIZIZ = l2;
        this.LIZJ = context;
        this.LIZLLL = i;
        this.LJ = false;
        this.LJFF = false;
        this.LJI = pageType;
        this.LJII = liveWidget;
    }
}

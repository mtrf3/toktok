package X;

import android.view.ViewGroup;
import com.bytedance.ies.ugc.aweme.commercialize.search.ISearchAdEventLogger;
import kotlin.jvm.internal.o;

/* renamed from: X.N6f, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C58809N6f {
    public final ViewGroup LIZ;
    public final ViewGroup LIZIZ;
    public final N6V LIZJ;
    public final N6K LIZLLL;
    public final ISearchAdEventLogger LJ;
    public final N4S LJFF;
    public final InterfaceC58801N5x LJI;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C58809N6f)) {
            return false;
        }
        C58809N6f c58809N6f = (C58809N6f) obj;
        return o.LJ(this.LIZ, c58809N6f.LIZ) && o.LJ(this.LIZIZ, c58809N6f.LIZIZ) && this.LIZJ == c58809N6f.LIZJ && o.LJ(this.LIZLLL, c58809N6f.LIZLLL) && o.LJ(this.LJ, c58809N6f.LJ) && o.LJ(this.LJFF, c58809N6f.LJFF) && o.LJ(this.LJI, c58809N6f.LJI);
    }

    public final int hashCode() {
        ViewGroup viewGroup = this.LIZ;
        int hashCode = (viewGroup == null ? 0 : viewGroup.hashCode()) * 31;
        ViewGroup viewGroup2 = this.LIZIZ;
        int hashCode2 = (this.LIZJ.hashCode() + ((hashCode + (viewGroup2 == null ? 0 : viewGroup2.hashCode())) * 31)) * 31;
        N6K n6k = this.LIZLLL;
        return this.LJI.hashCode() + ((this.LJFF.hashCode() + ((this.LJ.hashCode() + ((hashCode2 + (n6k != null ? n6k.hashCode() : 0)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("SearchAdComponentParam(itemView=");
        LIZ.append(this.LIZ);
        LIZ.append(", slotView=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", moduleType=");
        LIZ.append(this.LIZJ);
        LIZ.append(", searchAdStateBridge=");
        LIZ.append(this.LIZLLL);
        LIZ.append(", eventLogger=");
        LIZ.append(this.LJ);
        LIZ.append(", shareInfo=");
        LIZ.append(this.LJFF);
        LIZ.append(", depend=");
        LIZ.append(this.LJI);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public static C58809N6f LIZ(C58809N6f c58809N6f, ViewGroup viewGroup) {
        ViewGroup viewGroup2 = c58809N6f.LIZ;
        N6V moduleType = c58809N6f.LIZJ;
        N6K n6k = c58809N6f.LIZLLL;
        ISearchAdEventLogger eventLogger = c58809N6f.LJ;
        N4S shareInfo = c58809N6f.LJFF;
        InterfaceC58801N5x depend = c58809N6f.LJI;
        c58809N6f.getClass();
        o.LJIIIZ(moduleType, "moduleType");
        o.LJIIIZ(eventLogger, "eventLogger");
        o.LJIIIZ(shareInfo, "shareInfo");
        o.LJIIIZ(depend, "depend");
        return new C58809N6f(viewGroup2, viewGroup, moduleType, n6k, eventLogger, shareInfo, depend);
    }

    public C58809N6f(ViewGroup viewGroup, ViewGroup viewGroup2, N6V moduleType, N6K n6k, ISearchAdEventLogger iSearchAdEventLogger, N4S shareInfo, InterfaceC58801N5x interfaceC58801N5x) {
        o.LJIIIZ(moduleType, "moduleType");
        o.LJIIIZ(shareInfo, "shareInfo");
        this.LIZ = viewGroup;
        this.LIZIZ = viewGroup2;
        this.LIZJ = moduleType;
        this.LIZLLL = n6k;
        this.LJ = iSearchAdEventLogger;
        this.LJFF = shareInfo;
        this.LJI = interfaceC58801N5x;
    }
}

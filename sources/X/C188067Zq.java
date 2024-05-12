package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import kotlin.jvm.internal.o;

/* renamed from: X.7Zq, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C188067Zq implements InterfaceC57784Mm4 {
    public final Aweme LJLIL;
    public final long LJLILLLLZI;
    public Boolean LJLJI;

    @Override // X.InterfaceC57784Mm4
    public final Object getChangePayload(InterfaceC57784Mm4 interfaceC57784Mm4) {
        return null;
    }

    public final int hashCode() {
        int i;
        Boolean bool = this.LJLJI;
        if (o.LJ(bool, Boolean.TRUE)) {
            i = 1;
        } else if (o.LJ(bool, Boolean.FALSE)) {
            i = 0;
        } else {
            i = 2;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(this.LJLIL.getAid());
        LIZ.append('-');
        LIZ.append(i);
        LIZ.append('-');
        LIZ.append(this.LJLILLLLZI);
        return X1D.LIZIZ(LIZ).hashCode();
    }

    public final String LIZ() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(this.LJLIL.getAid());
        LIZ.append('-');
        LIZ.append(this.LJLILLLLZI);
        return X1D.LIZIZ(LIZ);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("WatchHistoryItem(aweme=");
        LIZ.append(this.LJLIL);
        LIZ.append(", viewTimeStamp=");
        LIZ.append(this.LJLILLLLZI);
        LIZ.append(", selected=");
        return C78920UyC.LIZIZ(LIZ, this.LJLJI, ')', LIZ);
    }

    @Override // X.InterfaceC57784Mm4
    public final boolean areContentsTheSame(InterfaceC57784Mm4 interfaceC57784Mm4) {
        if (interfaceC57784Mm4 instanceof C188067Zq) {
            C188067Zq c188067Zq = (C188067Zq) interfaceC57784Mm4;
            if (o.LJ(c188067Zq.LJLIL.getAid(), this.LJLIL.getAid()) && o.LJ(c188067Zq.LJLJI, this.LJLJI) && c188067Zq.LJLILLLLZI == this.LJLILLLLZI) {
                return true;
            }
            return false;
        }
        return o.LJ(interfaceC57784Mm4, this);
    }

    @Override // X.InterfaceC57784Mm4
    public final boolean areItemTheSame(InterfaceC57784Mm4 interfaceC57784Mm4) {
        if (interfaceC57784Mm4 instanceof C188067Zq) {
            C188067Zq c188067Zq = (C188067Zq) interfaceC57784Mm4;
            if (o.LJ(c188067Zq.LJLIL.getAid(), this.LJLIL.getAid()) && c188067Zq.LJLILLLLZI == this.LJLILLLLZI) {
                return true;
            }
            return false;
        }
        return o.LJ(interfaceC57784Mm4, this);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C188067Zq) {
            C188067Zq c188067Zq = (C188067Zq) obj;
            if (o.LJ(c188067Zq.LJLIL.getAid(), this.LJLIL.getAid()) && c188067Zq.LJLILLLLZI == this.LJLILLLLZI) {
                return true;
            }
            return false;
        }
        return super.equals(obj);
    }

    public C188067Zq(Aweme aweme, long j, Boolean bool) {
        o.LJIIIZ(aweme, "aweme");
        this.LJLIL = aweme;
        this.LJLILLLLZI = j;
        this.LJLJI = bool;
    }
}

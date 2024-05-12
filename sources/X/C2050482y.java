package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.LogPbBean;
import kotlin.jvm.internal.o;

/* renamed from: X.82y, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2050482y implements InterfaceC57784Mm4 {
    public final Aweme LJLIL;
    public final boolean LJLILLLLZI;
    public final String LJLJI;
    public final LogPbBean LJLJJI;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2050482y)) {
            return false;
        }
        C2050482y c2050482y = (C2050482y) obj;
        return o.LJ(this.LJLIL, c2050482y.LJLIL) && this.LJLILLLLZI == c2050482y.LJLILLLLZI && o.LJ(this.LJLJI, c2050482y.LJLJI) && o.LJ(this.LJLJJI, c2050482y.LJLJJI);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int hashCode = this.LJLIL.hashCode() * 31;
        boolean z = this.LJLILLLLZI;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int i2 = (hashCode + i) * 31;
        String str = this.LJLJI;
        int hashCode2 = (i2 + (str == null ? 0 : str.hashCode())) * 31;
        LogPbBean logPbBean = this.LJLJJI;
        return hashCode2 + (logPbBean != null ? logPbBean.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ExploreFeedItem(aweme=");
        LIZ.append(this.LJLIL);
        LIZ.append(", userDigged=");
        LIZ.append(this.LJLILLLLZI);
        LIZ.append(", requestId=");
        LIZ.append(this.LJLJI);
        LIZ.append(", logPbBean=");
        LIZ.append(this.LJLJJI);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    @Override // X.InterfaceC57784Mm4
    public final boolean areContentsTheSame(InterfaceC57784Mm4 interfaceC57784Mm4) {
        C2050482y c2050482y;
        Aweme aweme = null;
        if (interfaceC57784Mm4 instanceof C2050482y) {
            c2050482y = (C2050482y) interfaceC57784Mm4;
            if (c2050482y != null) {
                aweme = c2050482y.LJLIL;
            }
        } else {
            c2050482y = null;
        }
        if (o.LJ(aweme, this.LJLIL) && c2050482y.LJLILLLLZI == this.LJLILLLLZI) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC57784Mm4
    public final boolean areItemTheSame(InterfaceC57784Mm4 interfaceC57784Mm4) {
        C2050482y c2050482y;
        Aweme aweme;
        String str = null;
        if (interfaceC57784Mm4 instanceof C2050482y) {
            c2050482y = (C2050482y) interfaceC57784Mm4;
        } else {
            c2050482y = null;
        }
        String aid = this.LJLIL.getAid();
        if (c2050482y != null && (aweme = c2050482y.LJLIL) != null) {
            str = aweme.getAid();
        }
        return o.LJ(aid, str);
    }

    @Override // X.InterfaceC57784Mm4
    public final Object getChangePayload(InterfaceC57784Mm4 interfaceC57784Mm4) {
        final boolean z;
        if ((interfaceC57784Mm4 instanceof C2050482y) && (z = ((C2050482y) interfaceC57784Mm4).LJLILLLLZI) != this.LJLILLLLZI) {
            return new F9E(z) { // from class: X.82z
                public final boolean LJLIL;

                @Override // X.F9E
                public final Object[] getObjects() {
                    return new Object[]{Boolean.valueOf(this.LJLIL)};
                }

                {
                    this.LJLIL = z;
                }
            };
        }
        return null;
    }

    public C2050482y(Aweme aweme, boolean z, String str, LogPbBean logPbBean) {
        this.LJLIL = aweme;
        this.LJLILLLLZI = z;
        this.LJLJI = str;
        this.LJLJJI = logPbBean;
    }
}

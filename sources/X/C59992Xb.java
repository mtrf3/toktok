package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.LogPbBean;
import kotlin.jvm.internal.o;

/* renamed from: X.2Xb, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C59992Xb implements InterfaceC57784Mm4 {
    public final Aweme LJLIL;
    public final String LJLILLLLZI;
    public final LogPbBean LJLJI;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C59992Xb)) {
            return false;
        }
        C59992Xb c59992Xb = (C59992Xb) obj;
        return o.LJ(this.LJLIL, c59992Xb.LJLIL) && o.LJ(this.LJLILLLLZI, c59992Xb.LJLILLLLZI) && o.LJ(this.LJLJI, c59992Xb.LJLJI);
    }

    @Override // X.InterfaceC57784Mm4
    public final Object getChangePayload(InterfaceC57784Mm4 interfaceC57784Mm4) {
        return null;
    }

    public final int hashCode() {
        int hashCode = this.LJLIL.hashCode() * 31;
        String str = this.LJLILLLLZI;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        LogPbBean logPbBean = this.LJLJI;
        return hashCode2 + (logPbBean != null ? logPbBean.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("LiveDualFeedItem(aweme=");
        LIZ.append(this.LJLIL);
        LIZ.append(", requestId=");
        LIZ.append(this.LJLILLLLZI);
        LIZ.append(", logPbBean=");
        LIZ.append(this.LJLJI);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    @Override // X.InterfaceC57784Mm4
    public final boolean areContentsTheSame(InterfaceC57784Mm4 interfaceC57784Mm4) {
        C59992Xb c59992Xb;
        Aweme aweme = null;
        if ((interfaceC57784Mm4 instanceof C59992Xb) && (c59992Xb = (C59992Xb) interfaceC57784Mm4) != null) {
            aweme = c59992Xb.LJLIL;
        }
        return o.LJ(aweme, this.LJLIL);
    }

    @Override // X.InterfaceC57784Mm4
    public final boolean areItemTheSame(InterfaceC57784Mm4 interfaceC57784Mm4) {
        C59992Xb c59992Xb;
        Aweme aweme;
        String str = null;
        if (interfaceC57784Mm4 instanceof C59992Xb) {
            c59992Xb = (C59992Xb) interfaceC57784Mm4;
        } else {
            c59992Xb = null;
        }
        String aid = this.LJLIL.getAid();
        if (c59992Xb != null && (aweme = c59992Xb.LJLIL) != null) {
            str = aweme.getAid();
        }
        return o.LJ(aid, str);
    }

    public C59992Xb(Aweme aweme, String str, LogPbBean logPbBean) {
        this.LJLIL = aweme;
        this.LJLILLLLZI = str;
        this.LJLJI = logPbBean;
    }
}

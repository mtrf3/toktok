package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.profile.model.User;
import kotlin.jvm.internal.o;

/* renamed from: X.78l, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1809978l extends C1809878k {
    public final User LJLILLLLZI;
    public final Aweme LJLJI;
    public final long LJLJJI;
    public final C1811278y LJLJJL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1809978l)) {
            return false;
        }
        C1809978l c1809978l = (C1809978l) obj;
        return o.LJ(this.LJLILLLLZI, c1809978l.LJLILLLLZI) && o.LJ(this.LJLJI, c1809978l.LJLJI) && this.LJLJJI == c1809978l.LJLJJI && o.LJ(this.LJLJJL, c1809978l.LJLJJL);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ReactionBubbleDescriptionItem(user=");
        LIZ.append(this.LJLILLLLZI);
        LIZ.append(", aweme=");
        LIZ.append(this.LJLJI);
        LIZ.append(", publishTimeInMs=");
        LIZ.append(this.LJLJJI);
        LIZ.append(", mobEventParam=");
        LIZ.append(this.LJLJJL);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public final int hashCode() {
        int hashCode;
        int LIZJ = JBR.LIZJ(this.LJLJJI, (this.LJLJI.hashCode() + (this.LJLILLLLZI.hashCode() * 31)) * 31, 31);
        C1811278y c1811278y = this.LJLJJL;
        if (c1811278y == null) {
            hashCode = 0;
        } else {
            hashCode = c1811278y.hashCode();
        }
        return LIZJ + hashCode;
    }

    @Override // X.C1809878k, X.InterfaceC57784Mm4
    public final boolean areContentsTheSame(InterfaceC57784Mm4 interfaceC57784Mm4) {
        if (interfaceC57784Mm4 instanceof C1809978l) {
            boolean LJ = o.LJ(((C1809978l) interfaceC57784Mm4).LJLJI.getAid(), this.LJLJI.getAid());
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("areContentsTheSame ");
            LIZ.append(LJ);
            C71Y.LIZ("ReactionBubbleDescriptionItem", X1D.LIZIZ(LIZ));
            return LJ;
        }
        return o.LJ(interfaceC57784Mm4, this);
    }

    @Override // X.C1809878k, X.InterfaceC57784Mm4
    public final boolean areItemTheSame(InterfaceC57784Mm4 interfaceC57784Mm4) {
        if (interfaceC57784Mm4 instanceof C1809978l) {
            boolean LJ = o.LJ(((C1809978l) interfaceC57784Mm4).LJLJI.getAid(), this.LJLJI.getAid());
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("areItemTheSame ");
            LIZ.append(LJ);
            C71Y.LIZ("ReactionBubbleDescriptionItem", X1D.LIZIZ(LIZ));
            return LJ;
        }
        return o.LJ(interfaceC57784Mm4, this);
    }

    public C1809978l(User user, Aweme aweme, long j, C1811278y c1811278y) {
        super(3);
        this.LJLILLLLZI = user;
        this.LJLJI = aweme;
        this.LJLJJI = j;
        this.LJLJJL = c1811278y;
    }
}

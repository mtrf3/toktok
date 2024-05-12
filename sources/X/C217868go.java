package X;

import kotlin.jvm.internal.o;

/* renamed from: X.8go, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C217868go implements InterfaceC57784Mm4 {
    public final Y9G LJLIL;
    public final String LJLILLLLZI;
    public final C1794472m LJLJI;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C217868go)) {
            return false;
        }
        C217868go c217868go = (C217868go) obj;
        return o.LJ(this.LJLIL, c217868go.LJLIL) && o.LJ(this.LJLILLLLZI, c217868go.LJLILLLLZI) && o.LJ(this.LJLJI, c217868go.LJLJI);
    }

    @Override // X.InterfaceC57784Mm4
    public final Object getChangePayload(InterfaceC57784Mm4 interfaceC57784Mm4) {
        return null;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("CommentMentionItem(user=");
        LIZ.append(this.LJLIL);
        LIZ.append(", keyword=");
        LIZ.append(this.LJLILLLLZI);
        LIZ.append(", mobParams=");
        LIZ.append(this.LJLJI);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public final int hashCode() {
        int hashCode;
        int LJ = C79062V1e.LJ(this.LJLILLLLZI, this.LJLIL.hashCode() * 31, 31);
        C1794472m c1794472m = this.LJLJI;
        if (c1794472m == null) {
            hashCode = 0;
        } else {
            hashCode = c1794472m.hashCode();
        }
        return LJ + hashCode;
    }

    @Override // X.InterfaceC57784Mm4
    public final boolean areContentsTheSame(InterfaceC57784Mm4 interfaceC57784Mm4) {
        return o.LJ(interfaceC57784Mm4, this);
    }

    @Override // X.InterfaceC57784Mm4
    public final boolean areItemTheSame(InterfaceC57784Mm4 interfaceC57784Mm4) {
        if (interfaceC57784Mm4 instanceof C217868go) {
            return o.LJ(this.LJLIL, ((C217868go) interfaceC57784Mm4).LJLIL);
        }
        return o.LJ(interfaceC57784Mm4, this);
    }

    public C217868go(Y9G user, String keyword, C1794472m c1794472m) {
        o.LJIIIZ(user, "user");
        o.LJIIIZ(keyword, "keyword");
        this.LJLIL = user;
        this.LJLILLLLZI = keyword;
        this.LJLJI = c1794472m;
    }
}

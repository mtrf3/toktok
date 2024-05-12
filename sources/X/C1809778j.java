package X;

import com.ss.android.ugc.aweme.comment.model.Comment;
import kotlin.jvm.internal.o;

/* renamed from: X.78j, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1809778j extends C1809878k {
    public final Comment LJLILLLLZI;
    public final boolean LJLJI;
    public final C1811278y LJLJJI;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1809778j)) {
            return false;
        }
        C1809778j c1809778j = (C1809778j) obj;
        return o.LJ(this.LJLILLLLZI, c1809778j.LJLILLLLZI) && this.LJLJI == c1809778j.LJLJI && o.LJ(this.LJLJJI, c1809778j.LJLJJI);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int hashCode = this.LJLILLLLZI.hashCode() * 31;
        boolean z = this.LJLJI;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int i2 = (hashCode + i) * 31;
        C1811278y c1811278y = this.LJLJJI;
        return i2 + (c1811278y == null ? 0 : c1811278y.hashCode());
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ReactionBubbleCommentItem(comment=");
        LIZ.append(this.LJLILLLLZI);
        LIZ.append(", forceInsert=");
        LIZ.append(this.LJLJI);
        LIZ.append(", mobEventParam=");
        LIZ.append(this.LJLJJI);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    @Override // X.C1809878k, X.InterfaceC57784Mm4
    public final boolean areContentsTheSame(InterfaceC57784Mm4 interfaceC57784Mm4) {
        if (interfaceC57784Mm4 instanceof C1809778j) {
            if (o.LJ(((C1809778j) interfaceC57784Mm4).LJLILLLLZI.getText(), this.LJLILLLLZI.getText()) && o.LJ(interfaceC57784Mm4, this)) {
                return true;
            }
            return false;
        }
        return o.LJ(interfaceC57784Mm4, this);
    }

    @Override // X.C1809878k, X.InterfaceC57784Mm4
    public final boolean areItemTheSame(InterfaceC57784Mm4 interfaceC57784Mm4) {
        return o.LJ(interfaceC57784Mm4, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1809778j(Comment comment, boolean z, C1811278y c1811278y) {
        super(1);
        o.LJIIIZ(comment, "comment");
        this.LJLILLLLZI = comment;
        this.LJLJI = z;
        this.LJLJJI = c1811278y;
    }
}

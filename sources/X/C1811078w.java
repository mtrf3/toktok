package X;

import com.ss.android.ugc.aweme.profile.model.User;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.78w, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1811078w extends C1809878k {
    public final User LJLILLLLZI;
    public final List<Integer> LJLJI;
    public final String LJLJJI;
    public final String LJLJJL;
    public final C1811278y LJLJJLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1811078w)) {
            return false;
        }
        C1811078w c1811078w = (C1811078w) obj;
        return o.LJ(this.LJLILLLLZI, c1811078w.LJLILLLLZI) && o.LJ(this.LJLJI, c1811078w.LJLJI) && o.LJ(this.LJLJJI, c1811078w.LJLJJI) && o.LJ(this.LJLJJL, c1811078w.LJLJJL) && o.LJ(this.LJLJJLL, c1811078w.LJLJJLL);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ReactionBubbleCommonItem(user=");
        LIZ.append(this.LJLILLLLZI);
        LIZ.append(", emojiId=");
        LIZ.append(this.LJLJI);
        LIZ.append(", emojiText=");
        LIZ.append(this.LJLJJI);
        LIZ.append(", bubbleType=");
        LIZ.append(this.LJLJJL);
        LIZ.append(", mobEventParam=");
        LIZ.append(this.LJLJJLL);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public final int hashCode() {
        int hashCode;
        int LIZIZ = AnonymousClass391.LIZIZ(this.LJLJI, this.LJLILLLLZI.hashCode() * 31, 31);
        String str = this.LJLJJI;
        int i = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int LJ = C79062V1e.LJ(this.LJLJJL, (LIZIZ + hashCode) * 31, 31);
        C1811278y c1811278y = this.LJLJJLL;
        if (c1811278y != null) {
            i = c1811278y.hashCode();
        }
        return LJ + i;
    }

    @Override // X.C1809878k, X.InterfaceC57784Mm4
    public final boolean areContentsTheSame(InterfaceC57784Mm4 interfaceC57784Mm4) {
        if (interfaceC57784Mm4 instanceof C1811078w) {
            if (o.LJ(((C1811078w) interfaceC57784Mm4).LJLILLLLZI.getUid(), this.LJLILLLLZI.getUid()) && o.LJ(interfaceC57784Mm4, this)) {
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

    public /* synthetic */ C1811078w(User user, List list, String str, C1811278y c1811278y) {
        this(user, list, null, str, c1811278y);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1811078w(User user, List<Integer> emojiId, String str, String str2, C1811278y c1811278y) {
        super(2);
        o.LJIIIZ(emojiId, "emojiId");
        this.LJLILLLLZI = user;
        this.LJLJI = emojiId;
        this.LJLJJI = str;
        this.LJLJJL = str2;
        this.LJLJJLL = c1811278y;
    }
}

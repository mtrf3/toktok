package X;

import com.ss.android.ugc.aweme.feed.model.upvote.UpvoteStruct;
import defpackage.b0;
import kotlin.jvm.internal.o;

/* renamed from: X.7Ia, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C183487Ia {
    public C183937Jt LIZ;
    public C183937Jt LIZIZ;
    public int LIZJ = 0;
    public int LIZLLL = 0;
    public InterfaceC88471Ynr<? super Integer, ? super UpvoteStruct, C76800UCe> LJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C183487Ia)) {
            return false;
        }
        C183487Ia c183487Ia = (C183487Ia) obj;
        return o.LJ(this.LIZ, c183487Ia.LIZ) && o.LJ(this.LIZIZ, c183487Ia.LIZIZ) && this.LIZJ == c183487Ia.LIZJ && this.LIZLLL == c183487Ia.LIZLLL;
    }

    public final int hashCode() {
        return ((((this.LIZIZ.hashCode() + (this.LIZ.hashCode() * 31)) * 31) + this.LIZJ) * 31) + this.LIZLLL;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("BubbleGroup(curBubble=");
        LIZ.append(this.LIZ);
        LIZ.append(", nextBubble=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", curIdx=");
        LIZ.append(this.LIZJ);
        LIZ.append(", nextIdx=");
        return b0.LIZJ(LIZ, this.LIZLLL, ')', LIZ);
    }

    public C183487Ia(C183937Jt c183937Jt, C183937Jt c183937Jt2) {
        this.LIZ = c183937Jt;
        this.LIZIZ = c183937Jt2;
    }

    public final void LIZ(int i, UpvoteStruct upvoteStruct) {
        InterfaceC88471Ynr<? super Integer, ? super UpvoteStruct, C76800UCe> interfaceC88471Ynr = this.LJ;
        if (interfaceC88471Ynr != null) {
            interfaceC88471Ynr.invoke(Integer.valueOf(i), upvoteStruct);
        }
    }
}

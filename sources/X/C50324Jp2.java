package X;

import com.ss.android.ugc.aweme.discover.model.FeedbackContents;
import java.util.HashMap;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.Jp2, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C50324Jp2 implements KK7 {
    public final List<FeedbackContents> LJLIL;
    public final HashMap<String, Object> LJLILLLLZI;

    public C50324Jp2() {
        this((List) null, 3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C50324Jp2)) {
            return false;
        }
        C50324Jp2 c50324Jp2 = (C50324Jp2) obj;
        return o.LJ(this.LJLIL, c50324Jp2.LJLIL) && o.LJ(this.LJLILLLLZI, c50324Jp2.LJLILLLLZI);
    }

    public final int hashCode() {
        List<FeedbackContents> list = this.LJLIL;
        return this.LJLILLLLZI.hashCode() + ((list == null ? 0 : list.hashCode()) * 31);
    }

    @Override // X.KK7
    public final boolean isLog() {
        return true;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("GlobalDoodleConfigChangeAction(feedbackSurvey=");
        LIZ.append(this.LJLIL);
        LIZ.append(", feelGoodToken=");
        LIZ.append(this.LJLILLLLZI);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    static {
        C17N.LJJJJLI().If().LIZIZ(C65352Pkq.LIZ(C50324Jp2.class), C50327Jp5.LJLIL);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C50324Jp2(java.util.List r2, int r3) {
        /*
            r1 = this;
            r0 = r3 & 1
            if (r0 == 0) goto L6
            X.OQg r2 = X.C61878OQg.INSTANCE
        L6:
            r0 = r3 & 2
            if (r0 == 0) goto L13
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
        Lf:
            r1.<init>(r0, r2)
            return
        L13:
            r0 = 0
            goto Lf
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C50324Jp2.<init>(java.util.List, int):void");
    }

    public C50324Jp2(HashMap feelGoodToken, List list) {
        o.LJIIIZ(feelGoodToken, "feelGoodToken");
        this.LJLIL = list;
        this.LJLILLLLZI = feelGoodToken;
    }
}

package X;

import android.view.ViewGroup;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import kotlin.jvm.internal.o;

/* renamed from: X.6uD, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C175216uD {
    public final Aweme LIZ;
    public final C174366sq LIZIZ;
    public final ViewGroup LIZJ;
    public final C7AY LIZLLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C175216uD)) {
            return false;
        }
        C175216uD c175216uD = (C175216uD) obj;
        return o.LJ(this.LIZ, c175216uD.LIZ) && o.LJ(this.LIZIZ, c175216uD.LIZIZ) && o.LJ(this.LIZJ, c175216uD.LIZJ) && o.LJ(this.LIZLLL, c175216uD.LIZLLL);
    }

    public final int hashCode() {
        int hashCode = this.LIZ.hashCode() * 31;
        C174366sq c174366sq = this.LIZIZ;
        int hashCode2 = (hashCode + (c174366sq == null ? 0 : c174366sq.hashCode())) * 31;
        ViewGroup viewGroup = this.LIZJ;
        return this.LIZLLL.hashCode() + ((hashCode2 + (viewGroup != null ? viewGroup.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ExternalCommentInputBarParams(aweme=");
        LIZ.append(this.LIZ);
        LIZ.append(", param=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", rootView=");
        LIZ.append(this.LIZJ);
        LIZ.append(", commentInputManager=");
        LIZ.append(this.LIZLLL);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public C175216uD(Aweme aweme, C174366sq c174366sq, ViewGroup viewGroup, C176996x5 commentInputManager) {
        o.LJIIIZ(aweme, "aweme");
        o.LJIIIZ(commentInputManager, "commentInputManager");
        this.LIZ = aweme;
        this.LIZIZ = c174366sq;
        this.LIZJ = viewGroup;
        this.LIZLLL = commentInputManager;
    }
}

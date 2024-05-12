package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import defpackage.b0;
import kotlin.jvm.internal.o;

/* renamed from: X.6uj, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C175536uj implements InterfaceC80653En {
    public C174366sq LJLIL;
    public int LJLILLLLZI;
    public Aweme LJLJI;
    public int LJLJJI;

    public C175536uj() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C175536uj)) {
            return false;
        }
        C175536uj c175536uj = (C175536uj) obj;
        return o.LJ(this.LJLIL, c175536uj.LJLIL) && this.LJLILLLLZI == c175536uj.LJLILLLLZI && o.LJ(this.LJLJI, c175536uj.LJLJI) && this.LJLJJI == c175536uj.LJLJJI;
    }

    public final int hashCode() {
        C174366sq c174366sq = this.LJLIL;
        int hashCode = (((c174366sq == null ? 0 : c174366sq.hashCode()) * 31) + this.LJLILLLLZI) * 31;
        Aweme aweme = this.LJLJI;
        return ((hashCode + (aweme != null ? aweme.hashCode() : 0)) * 31) + this.LJLJJI;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("CommentPageSource(videoCommentPageParam=");
        LIZ.append(this.LJLIL);
        LIZ.append(", securityGuide=");
        LIZ.append(this.LJLILLLLZI);
        LIZ.append(", aweme=");
        LIZ.append(this.LJLJI);
        LIZ.append(", commentBgHeight=");
        return b0.LIZJ(LIZ, this.LJLJJI, ')', LIZ);
    }

    public C175536uj(int i) {
        this.LJLIL = null;
        this.LJLILLLLZI = 0;
        this.LJLJI = null;
        this.LJLJJI = 0;
    }
}

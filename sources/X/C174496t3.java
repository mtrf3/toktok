package X;

import com.ss.android.ugc.aweme.comment.model.Comment;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.Arrays;
import kotlin.jvm.internal.o;

/* renamed from: X.6t3, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C174496t3 extends Comment {
    public static final C174506t4 Companion = new Object() { // from class: X.6t4
    };
    public long LJLIL;
    public EnumC177686yC LJLILLLLZI = EnumC177686yC.ALL_EXPANDED;
    public C175446ua LJLJI = new C175446ua(0);
    public Aweme LJLJJI;
    public boolean LJLJJL;

    @Override // com.ss.android.ugc.aweme.comment.model.Comment
    public int hashCode() {
        return Arrays.hashCode(new Object[]{getCid(), getFakeId(), Long.valueOf(this.LJLIL), this.LJLILLLLZI, this.LJLJI});
    }

    public C174496t3() {
        setCommentType(224);
        setCid(((RBX) HG3.LJIILL()).getCurUserId());
    }

    public final Aweme getAweme() {
        return this.LJLJJI;
    }

    public final EnumC177686yC getExpandStatus() {
        return this.LJLILLLLZI;
    }

    public final C175446ua getFooterInfo() {
        return this.LJLJI;
    }

    public final boolean getHasMyUpvote() {
        return this.LJLJJL;
    }

    public final long getRemainCount() {
        return this.LJLIL;
    }

    @Override // com.ss.android.ugc.aweme.comment.model.Comment
    public boolean equals(Object obj) {
        C174496t3 c174496t3;
        if (obj instanceof C174496t3) {
            c174496t3 = (C174496t3) obj;
        } else {
            c174496t3 = null;
        }
        if (!super.equals(obj) || c174496t3 == null || this.LJLIL != c174496t3.LJLIL || this.LJLILLLLZI != c174496t3.LJLILLLLZI || !o.LJ(this.LJLJI, c174496t3.LJLJI)) {
            return false;
        }
        return true;
    }

    public final void setAweme(Aweme aweme) {
        o.LJIIIZ(aweme, "aweme");
        this.LJLJJI = aweme;
        C7HV c7hv = C7HV.LIZIZ;
        String aid = aweme.getAid();
        o.LJIIIIZZ(aid, "aweme.aid");
        setHasMyUpvote(c7hv.LJFF(aid));
    }

    public final void setExpandStatus(EnumC177686yC enumC177686yC) {
        o.LJIIIZ(enumC177686yC, "<set-?>");
        this.LJLILLLLZI = enumC177686yC;
    }

    public final void setFooterInfo(C175446ua c175446ua) {
        o.LJIIIZ(c175446ua, "<set-?>");
        this.LJLJI = c175446ua;
    }

    public final void setHasMyUpvote(boolean z) {
        this.LJLJJL = z;
    }

    public final void setRemainCount(long j) {
        EnumC177686yC enumC177686yC;
        if (j > 0) {
            enumC177686yC = EnumC177686yC.EXPANDABLE;
        } else {
            enumC177686yC = EnumC177686yC.ALL_EXPANDED;
        }
        this.LJLILLLLZI = enumC177686yC;
        this.LJLIL = j;
    }
}

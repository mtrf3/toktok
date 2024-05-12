package X;

import com.ss.android.ugc.aweme.comment.model.Comment;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.now.NowPostAttributes;
import com.ss.android.ugc.aweme.now.NowPostInfo;
import com.ss.android.ugc.now.interaction.NowFeedMobHierarchyData;
import defpackage.b0;
import kotlin.jvm.internal.o;

/* renamed from: X.73G, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C73G implements InterfaceC87283bg {
    public final Aweme LJLIL;
    public final String LJLILLLLZI;
    public boolean LJLJI;
    public Comment LJLJJI;
    public final NowFeedMobHierarchyData LJLJJL;
    public String LJLJJLL;
    public final int LJLJL;

    public C73G() {
        this(null, null, false, null, null, null, 127);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C73G)) {
            return false;
        }
        C73G c73g = (C73G) obj;
        return o.LJ(this.LJLIL, c73g.LJLIL) && o.LJ(this.LJLILLLLZI, c73g.LJLILLLLZI) && this.LJLJI == c73g.LJLJI && o.LJ(this.LJLJJI, c73g.LJLJJI) && o.LJ(this.LJLJJL, c73g.LJLJJL) && o.LJ(this.LJLJJLL, c73g.LJLJJLL) && this.LJLJL == c73g.LJLJL;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        Aweme aweme = this.LJLIL;
        int hashCode = (aweme == null ? 0 : aweme.hashCode()) * 31;
        String str = this.LJLILLLLZI;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        boolean z = this.LJLJI;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int i2 = (hashCode2 + i) * 31;
        Comment comment = this.LJLJJI;
        int hashCode3 = (i2 + (comment == null ? 0 : comment.hashCode())) * 31;
        NowFeedMobHierarchyData nowFeedMobHierarchyData = this.LJLJJL;
        int hashCode4 = (hashCode3 + (nowFeedMobHierarchyData == null ? 0 : nowFeedMobHierarchyData.hashCode())) * 31;
        String str2 = this.LJLJJLL;
        return ((hashCode4 + (str2 != null ? str2.hashCode() : 0)) * 31) + this.LJLJL;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("CommentListInitData(aweme=");
        LIZ.append(this.LJLIL);
        LIZ.append(", insertCid=");
        LIZ.append(this.LJLILLLLZI);
        LIZ.append(", showKeyboard=");
        LIZ.append(this.LJLJI);
        LIZ.append(", replyComment=");
        LIZ.append(this.LJLJJI);
        LIZ.append(", interactionHierarchyData=");
        LIZ.append(this.LJLJJL);
        LIZ.append(", enterMethod=");
        LIZ.append(this.LJLJJLL);
        LIZ.append(", hasSmallWindow=");
        return b0.LIZJ(LIZ, this.LJLJL, ')', LIZ);
    }

    public C73G(Aweme aweme, String str, boolean z, Comment comment, NowFeedMobHierarchyData nowFeedMobHierarchyData, String str2, int i) {
        NowPostInfo nowPostInfo;
        NowPostAttributes attributes;
        aweme = (i & 1) != 0 ? null : aweme;
        str = (i & 2) != 0 ? null : str;
        int i2 = 0;
        z = (i & 4) != 0 ? false : z;
        comment = (i & 8) != 0 ? null : comment;
        nowFeedMobHierarchyData = (i & 16) != 0 ? null : nowFeedMobHierarchyData;
        str2 = (i & 32) != 0 ? null : str2;
        if ((i & 64) != 0 && aweme != null && (nowPostInfo = aweme.nowPostInfo) != null && (attributes = nowPostInfo.getAttributes()) != null && attributes.getNowPostCameraType() == 0) {
            i2 = 1;
        }
        this.LJLIL = aweme;
        this.LJLILLLLZI = str;
        this.LJLJI = z;
        this.LJLJJI = comment;
        this.LJLJJL = nowFeedMobHierarchyData;
        this.LJLJJLL = str2;
        this.LJLJL = i2;
    }
}

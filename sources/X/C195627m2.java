package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.now.NowPostInfo;
import com.ss.android.ugc.aweme.now.UserNowPost;
import com.ss.android.ugc.aweme.profile.model.User;
import defpackage.q;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.7m2, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C195627m2 implements C7ML, InterfaceC213078Xv {
    public final Aweme LJLIL;
    public final Boolean LJLILLLLZI;
    public final int LJLJI;
    public final String LJLJJI;
    public final String LJLJJL;
    public final Boolean LJLJJLL;
    public final C195637m3 LJLJL;
    public final boolean LJLJLJ;
    public final String LJLJLLL;

    @Override // X.InterfaceC57784Mm4
    public final Object getChangePayload(InterfaceC57784Mm4 interfaceC57784Mm4) {
        return null;
    }

    public final InterfaceC194547kI LIZ() {
        return C78949Uyf.LJIILIIL(this.LJLIL, this.LJLILLLLZI, this.LJLJJLL, this.LJLJI, null, false, false, this.LJLJLJ, this.LJLJLLL, 1648);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4 = this.LJLIL.hashCode() * 31;
        Boolean bool = this.LJLILLLLZI;
        int i = 0;
        if (bool == null) {
            hashCode = 0;
        } else {
            hashCode = bool.hashCode();
        }
        int i2 = (((hashCode4 + hashCode) * 31) + this.LJLJI) * 31;
        String str = this.LJLJJI;
        if (str == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str.hashCode();
        }
        int i3 = (i2 + hashCode2) * 31;
        String str2 = this.LJLJJL;
        if (str2 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str2.hashCode();
        }
        int i4 = (i3 + hashCode3) * 31;
        Boolean bool2 = this.LJLJJLL;
        if (bool2 != null) {
            i = bool2.hashCode();
        }
        int hashCode5 = (this.LJLJL.hashCode() + ((i4 + i) * 31)) * 31;
        boolean z = this.LJLJLJ;
        int i5 = z;
        if (z != 0) {
            i5 = 1;
        }
        return this.LJLJLLL.hashCode() + ((hashCode5 + i5) * 31);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("NowOtherCollectionItem(aweme=");
        LIZ.append(this.LJLIL);
        LIZ.append(", isEmptyCellItem=");
        LIZ.append(this.LJLILLLLZI);
        LIZ.append(", nowFeedType=");
        LIZ.append(this.LJLJI);
        LIZ.append(", insertItemEnterPosition=");
        LIZ.append(this.LJLJJI);
        LIZ.append(", insertItemEnterFrom=");
        LIZ.append(this.LJLJJL);
        LIZ.append(", isMyPostLoading=");
        LIZ.append(this.LJLJJLL);
        LIZ.append(", collectionInfo=");
        LIZ.append(this.LJLJL);
        LIZ.append(", isInFeedViewHolder=");
        LIZ.append(this.LJLJLJ);
        LIZ.append(", recommendPosition=");
        return q.LIZIZ(LIZ, this.LJLJLLL, ')', LIZ);
    }

    @Override // X.C7ML
    public final String LLFFF() {
        return this.LJLJJI;
    }

    @Override // X.C7ML
    public final Boolean LLJJJ() {
        return this.LJLILLLLZI;
    }

    @Override // X.C7ML, X.InterfaceC213078Xv
    public final Aweme getAweme() {
        return this.LJLIL;
    }

    @Override // X.C7ML
    public final String l() {
        return this.LJLJJL;
    }

    @Override // X.C7ML
    public final int z() {
        return this.LJLJI;
    }

    @Override // X.InterfaceC57784Mm4
    public final boolean areContentsTheSame(InterfaceC57784Mm4 other) {
        UserNowPost userNowPost;
        List<Aweme> nowPosts;
        List<Aweme> nowPosts2;
        int size;
        String str;
        String str2;
        Integer num;
        Integer num2;
        Integer num3;
        Integer num4;
        Integer num5;
        NowPostInfo nowPostInfo;
        NowPostInfo nowPostInfo2;
        User author;
        User author2;
        User author3;
        User author4;
        o.LJIIIZ(other, "other");
        if (!(other instanceof C195627m2)) {
            return false;
        }
        C195627m2 c195627m2 = (C195627m2) other;
        if (this.LJLJI == c195627m2.LJLJI && (userNowPost = c195627m2.LJLIL.userNowPost) != null && (nowPosts = userNowPost.getNowPosts()) != null) {
            int size2 = nowPosts.size();
            UserNowPost userNowPost2 = this.LJLIL.userNowPost;
            if (userNowPost2 == null || (nowPosts2 = userNowPost2.getNowPosts()) == null || (size = nowPosts2.size()) != size2) {
                return false;
            }
            for (int i = 0; i < size; i++) {
                Aweme aweme = (Aweme) ORZ.LJLLLLLL(i, nowPosts2);
                Aweme aweme2 = (Aweme) ORZ.LJLLLLLL(i, nowPosts);
                Integer num6 = null;
                if (aweme != null) {
                    str = aweme.getAid();
                } else {
                    str = null;
                }
                if (aweme2 != null) {
                    str2 = aweme2.getAid();
                } else {
                    str2 = null;
                }
                if (!o.LJ(str, str2)) {
                    return false;
                }
                if (aweme != null && (author4 = aweme.getAuthor()) != null) {
                    num = Integer.valueOf(author4.getFollowStatus());
                } else {
                    num = null;
                }
                if (aweme2 != null && (author3 = aweme2.getAuthor()) != null) {
                    num2 = Integer.valueOf(author3.getFollowStatus());
                } else {
                    num2 = null;
                }
                if (!o.LJ(num, num2)) {
                    return false;
                }
                if (aweme != null && (author2 = aweme.getAuthor()) != null) {
                    num3 = Integer.valueOf(author2.getFollowerStatus());
                } else {
                    num3 = null;
                }
                if (aweme2 != null && (author = aweme2.getAuthor()) != null) {
                    num4 = Integer.valueOf(author.getFollowerStatus());
                } else {
                    num4 = null;
                }
                if (!o.LJ(num3, num4)) {
                    return false;
                }
                if (aweme != null && (nowPostInfo2 = aweme.nowPostInfo) != null) {
                    num5 = nowPostInfo2.getNowStatus();
                } else {
                    num5 = null;
                }
                if (aweme2 != null && (nowPostInfo = aweme2.nowPostInfo) != null) {
                    num6 = nowPostInfo.getNowStatus();
                }
                if (!o.LJ(num5, num6)) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC57784Mm4
    public final boolean areItemTheSame(InterfaceC57784Mm4 interfaceC57784Mm4) {
        if (!(interfaceC57784Mm4 instanceof C195627m2)) {
            return false;
        }
        return true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C195627m2)) {
            return false;
        }
        C195627m2 c195627m2 = (C195627m2) obj;
        if (o.LJ(this.LJLIL, c195627m2.LJLIL) && o.LJ(this.LJLILLLLZI, c195627m2.LJLILLLLZI) && this.LJLJI == c195627m2.LJLJI && o.LJ(this.LJLJJI, c195627m2.LJLJJI) && o.LJ(this.LJLJJL, c195627m2.LJLJJL) && o.LJ(this.LJLJJLL, c195627m2.LJLJJLL) && o.LJ(this.LJLJL, c195627m2.LJLJL) && this.LJLJLJ == c195627m2.LJLJLJ && o.LJ(this.LJLJLLL, c195627m2.LJLJLLL)) {
            return true;
        }
        return false;
    }

    public C195627m2(Aweme aweme, int i, boolean z, String recommendPosition, int i2) {
        C195637m3 collectionInfo;
        i = (i2 & 4) != 0 ? 0 : i;
        if ((i2 & 64) != 0) {
            collectionInfo = new C195637m3(0);
        } else {
            collectionInfo = null;
        }
        z = (i2 & 128) != 0 ? false : z;
        recommendPosition = (i2 & 256) != 0 ? "bottom" : recommendPosition;
        o.LJIIIZ(aweme, "aweme");
        o.LJIIIZ(collectionInfo, "collectionInfo");
        o.LJIIIZ(recommendPosition, "recommendPosition");
        this.LJLIL = aweme;
        this.LJLILLLLZI = null;
        this.LJLJI = i;
        this.LJLJJI = null;
        this.LJLJJL = null;
        this.LJLJJLL = null;
        this.LJLJL = collectionInfo;
        this.LJLJLJ = z;
        this.LJLJLLL = recommendPosition;
    }
}

package X;

import com.bytedance.android.livesdk.livesetting.pullstream.LiveNetAdaptiveHurryTimeSetting;
import com.ss.android.ugc.aweme.notice.repo.list.bean.MusNotice;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.List;
import java.util.Objects;

/* loaded from: classes10.dex */
public final class MPA extends MusNotice {
    public static final List<Integer> LJ = C47261Igj.LJJIJIIJI(Integer.valueOf(LiveNetAdaptiveHurryTimeSetting.DEFAULT), 2001, 2011, 2002, 2003, 2004, 2005);
    public static final List<Integer> LJFF = C47261Igj.LJJIJIIJI(2004, 2005);
    public final int LIZ;
    public final User LIZIZ;
    public final List<User> LIZJ;
    public final int LIZLLL;

    public MPA() {
        throw null;
    }

    public final Object[] LIZ() {
        return new Object[]{Integer.valueOf(this.LIZ), this.LIZIZ, this.LIZJ, Integer.valueOf(this.LIZLLL)};
    }

    @Override // com.ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof MPA) {
            return C78966Uyw.LJIIIZ(((MPA) obj).LIZ(), LIZ());
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice
    public final int hashCode() {
        return Objects.hash(LIZ());
    }

    public final String toString() {
        return C78966Uyw.LJJJLL("RecommendNotice:%s,%s,%s,%s", LIZ());
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MPA(int i, User user, int i2) {
        super(true);
        user = (i2 & 2) != 0 ? null : user;
        this.LIZ = i;
        this.LIZIZ = user;
        this.LIZJ = null;
        this.LIZLLL = 0;
        this.type = i;
        this.nid = String.valueOf(hashCode());
        this.hasRead = true;
    }
}

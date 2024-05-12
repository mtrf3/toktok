package X;

import com.ss.android.ugc.aweme.notice.repo.list.bean.MusNotice;
import com.ss.android.ugc.aweme.notification.bean.RoomInfo;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.Objects;

/* renamed from: X.MPr, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C56767MPr extends MusNotice {
    public final User LIZ;
    public final int LIZIZ;
    public final RoomInfo LIZJ;

    @Override // com.ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice
    public final int hashCode() {
        String str;
        Object[] objArr = new Object[3];
        objArr[0] = Integer.valueOf(this.type);
        User user = this.LIZ;
        if (user != null) {
            str = user.getUid();
        } else {
            str = null;
        }
        objArr[1] = str;
        objArr[2] = Integer.valueOf(this.LIZIZ);
        return Objects.hash(objArr);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("LiveNotice(user=");
        LIZ.append(this.LIZ);
        LIZ.append(", liveType=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", roomInfo=");
        LIZ.append(this.LIZJ);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    @Override // com.ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C56767MPr)) {
            return false;
        }
        C56767MPr c56767MPr = (C56767MPr) obj;
        if (this.type == c56767MPr.type && Objects.equals(this.LIZ, c56767MPr.LIZ) && this.LIZIZ == c56767MPr.LIZIZ && Objects.equals(this.LIZJ, c56767MPr.LIZJ)) {
            return true;
        }
        return false;
    }

    public C56767MPr(User user, int i, RoomInfo roomInfo) {
        super(true);
        this.LIZ = user;
        this.LIZIZ = i;
        this.LIZJ = roomInfo;
        this.type = 1001;
        this.nid = String.valueOf(hashCode());
        this.priority = 2;
        this.timeLineType = 0;
        this.createTime = 9223372036854775805L;
    }
}

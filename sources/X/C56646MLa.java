package X;

import com.ss.android.ugc.aweme.notice.repo.list.bean.MusNotice;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.List;
import java.util.Objects;

/* renamed from: X.MLa, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C56646MLa extends MusNotice {
    public final int LIZ;
    public final List<User> LIZIZ;

    @Override // com.ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice
    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.type), Integer.valueOf(this.LIZ), this.LIZIZ);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("FollowRequestNotice(followRequestTotal=");
        LIZ.append(this.LIZ);
        LIZ.append(", followRequestList=");
        return C1NE.LIZIZ(LIZ, this.LIZIZ, ')', LIZ);
    }

    @Override // com.ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C56646MLa)) {
            return false;
        }
        C56646MLa c56646MLa = (C56646MLa) obj;
        if (this.type == c56646MLa.type && this.LIZ == c56646MLa.LIZ && Objects.equals(this.LIZIZ, c56646MLa.LIZIZ)) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C56646MLa(int i, List<? extends User> list) {
        super(true);
        this.LIZ = i;
        this.LIZIZ = list;
        this.type = 13;
        this.nid = String.valueOf(hashCode());
        this.hasRead = true;
    }
}

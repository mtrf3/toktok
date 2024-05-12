package X;

import com.ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import com.ss.android.ugc.aweme.notice.repo.list.bean.MusNotice;
import java.util.Objects;

/* loaded from: classes10.dex */
public final class MPH extends MusNotice {
    public int LIZ;

    @Override // com.ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice
    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.type), Integer.valueOf(this.timeLineType));
    }

    @Override // com.ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MPH)) {
            return false;
        }
        BaseNotice baseNotice = (BaseNotice) obj;
        if (this.type == baseNotice.type && this.timeLineType == baseNotice.timeLineType) {
            return true;
        }
        return false;
    }

    public MPH(int i, int i2) {
        super(true);
        this.LIZ = i2;
        this.type = 999;
        this.timeLineType = i;
        this.nid = String.valueOf(hashCode());
    }
}

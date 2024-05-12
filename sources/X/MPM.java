package X;

import com.ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import com.ss.android.ugc.aweme.notice.repo.list.bean.MusNotice;
import java.util.Objects;

/* loaded from: classes10.dex */
public final class MPM extends MusNotice {
    public MPM() {
        super(true);
        this.type = 9999;
        this.nid = String.valueOf(hashCode());
        this.hasRead = true;
    }

    @Override // com.ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice
    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.type));
    }

    @Override // com.ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof MPM) && this.type == ((BaseNotice) obj).type) {
            return true;
        }
        return false;
    }
}

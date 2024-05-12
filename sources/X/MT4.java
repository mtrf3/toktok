package X;

import com.ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import com.ss.android.ugc.aweme.notice.repo.list.bean.MusNotice;
import java.util.Objects;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class MT4 extends MusNotice {
    public MT4() {
        super(true);
        this.type = 31000;
        this.nid = String.valueOf(System.currentTimeMillis());
        this.hasRead = true;
    }

    @Override // com.ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice
    public final int hashCode() {
        return Objects.hash(this.nid);
    }

    @Override // com.ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MT4)) {
            return false;
        }
        BaseNotice baseNotice = (BaseNotice) obj;
        if (this.type == baseNotice.type && o.LJ(this.nid, baseNotice.nid)) {
            return true;
        }
        return false;
    }
}

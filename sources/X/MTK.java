package X;

import com.ss.android.ugc.aweme.notification.creator.model.response.NoticeTabModel;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class MTK {
    public final MT7 LIZ;
    public final int LIZIZ;
    public final List<NoticeTabModel> LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MTK)) {
            return false;
        }
        MTK mtk = (MTK) obj;
        return this.LIZ == mtk.LIZ && this.LIZIZ == mtk.LIZIZ && o.LJ(this.LIZJ, mtk.LIZJ);
    }

    public final int hashCode() {
        int hashCode = ((this.LIZ.hashCode() * 31) + this.LIZIZ) * 31;
        List<NoticeTabModel> list = this.LIZJ;
        return hashCode + (list == null ? 0 : list.hashCode());
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("TabListResult(requestType=");
        LIZ.append(this.LIZ);
        LIZ.append(", currentTabId=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", tabList=");
        return C1NE.LIZIZ(LIZ, this.LIZJ, ')', LIZ);
    }

    public MTK(int i, MT7 requestType, List list) {
        o.LJIIIZ(requestType, "requestType");
        this.LIZ = requestType;
        this.LIZIZ = i;
        this.LIZJ = list;
    }
}

package X;

import com.ss.android.ugc.aweme.inbox.widget.multi.ActivityNoticePod;
import com.ss.android.ugc.aweme.inbox.widget.multi.ActivityPod;
import com.ss.android.ugc.aweme.inbox.widget.multi.InboxHorizontalTopListCombinePod;
import com.ss.android.ugc.aweme.notice.repo.list.bean.InboxEntranceCell;
import com.ss.android.ugc.aweme.notice.repo.list.bean.InboxNoticePreviewWindowResponse;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.MMi, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C56680MMi {
    public final String LIZ;
    public final InboxHorizontalTopListCombinePod LIZIZ;
    public InboxNoticePreviewWindowResponse LIZJ;
    public final ActivityNoticePod LIZLLL;
    public ActivityPod LJ;
    public final boolean LJFF;
    public final List<InboxEntranceCell> LJI;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C56680MMi)) {
            return false;
        }
        C56680MMi c56680MMi = (C56680MMi) obj;
        return o.LJ(this.LIZ, c56680MMi.LIZ) && o.LJ(this.LIZIZ, c56680MMi.LIZIZ) && o.LJ(this.LIZJ, c56680MMi.LIZJ) && o.LJ(this.LIZLLL, c56680MMi.LIZLLL) && o.LJ(this.LJ, c56680MMi.LJ) && this.LJFF == c56680MMi.LJFF && o.LJ(this.LJI, c56680MMi.LJI);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int hashCode = this.LIZ.hashCode() * 31;
        InboxHorizontalTopListCombinePod inboxHorizontalTopListCombinePod = this.LIZIZ;
        int hashCode2 = (hashCode + (inboxHorizontalTopListCombinePod == null ? 0 : inboxHorizontalTopListCombinePod.hashCode())) * 31;
        InboxNoticePreviewWindowResponse inboxNoticePreviewWindowResponse = this.LIZJ;
        int hashCode3 = (hashCode2 + (inboxNoticePreviewWindowResponse == null ? 0 : inboxNoticePreviewWindowResponse.hashCode())) * 31;
        ActivityNoticePod activityNoticePod = this.LIZLLL;
        int hashCode4 = (hashCode3 + (activityNoticePod == null ? 0 : activityNoticePod.hashCode())) * 31;
        ActivityPod activityPod = this.LJ;
        int hashCode5 = (hashCode4 + (activityPod == null ? 0 : activityPod.hashCode())) * 31;
        boolean z = this.LJFF;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int i2 = (hashCode5 + i) * 31;
        List<InboxEntranceCell> list = this.LJI;
        return i2 + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("BufferedCache(uid=");
        LIZ.append(this.LIZ);
        LIZ.append(", topHorizontalPod=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", previewWindowResponse=");
        LIZ.append(this.LIZJ);
        LIZ.append(", activityNoticePod=");
        LIZ.append(this.LIZLLL);
        LIZ.append(", followerPod=");
        LIZ.append(this.LJ);
        LIZ.append(", isAllLoad=");
        LIZ.append(this.LJFF);
        LIZ.append(", inboxEntranceCellList=");
        return C1NE.LIZIZ(LIZ, this.LJI, ')', LIZ);
    }

    public static C56680MMi LIZ(C56680MMi c56680MMi, List list) {
        String uid = c56680MMi.LIZ;
        InboxHorizontalTopListCombinePod inboxHorizontalTopListCombinePod = c56680MMi.LIZIZ;
        InboxNoticePreviewWindowResponse inboxNoticePreviewWindowResponse = c56680MMi.LIZJ;
        ActivityNoticePod activityNoticePod = c56680MMi.LIZLLL;
        ActivityPod activityPod = c56680MMi.LJ;
        boolean z = c56680MMi.LJFF;
        c56680MMi.getClass();
        o.LJIIIZ(uid, "uid");
        return new C56680MMi(uid, inboxHorizontalTopListCombinePod, inboxNoticePreviewWindowResponse, activityNoticePod, activityPod, z, list);
    }

    public /* synthetic */ C56680MMi(String str, InboxNoticePreviewWindowResponse inboxNoticePreviewWindowResponse, ActivityPod activityPod, boolean z, List list, int i) {
        this(str, null, (i & 4) != 0 ? null : inboxNoticePreviewWindowResponse, null, (i & 16) != 0 ? null : activityPod, (i & 32) != 0 ? false : z, (i & 64) != 0 ? null : list);
    }

    public C56680MMi(String str, InboxHorizontalTopListCombinePod inboxHorizontalTopListCombinePod, InboxNoticePreviewWindowResponse inboxNoticePreviewWindowResponse, ActivityNoticePod activityNoticePod, ActivityPod activityPod, boolean z, List<InboxEntranceCell> list) {
        this.LIZ = str;
        this.LIZIZ = inboxHorizontalTopListCombinePod;
        this.LIZJ = inboxNoticePreviewWindowResponse;
        this.LIZLLL = activityNoticePod;
        this.LJ = activityPod;
        this.LJFF = z;
        this.LJI = list;
    }
}

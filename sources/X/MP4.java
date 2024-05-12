package X;

import com.ss.android.ugc.aweme.feed.model.LogPbBean;
import com.ss.android.ugc.aweme.notice.repo.list.bean.GeneralTemplateNotice;
import com.ss.android.ugc.aweme.notice.repo.list.bean.MusNotice;
import com.ss.android.ugc.aweme.notice.repo.list.bean.NoticeItems;
import com.ss.android.ugc.effectmanager.common.utils.FileUtils;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class MP4 {
    public final List<MusNotice> LIZ;
    public final java.util.Map<Integer, NoticeItems> LIZIZ;
    public final List<MusNotice> LIZJ;
    public final LogPbBean LIZLLL;
    public final long LJ;
    public final boolean LJFF;
    public final int LJI;
    public final MPD LJII;
    public final boolean LJIIIIZZ;
    public final boolean LJIIIZ;
    public final boolean LJIIJ;
    public final java.util.Set<String> LJIIJJI;
    public final java.util.Set<Integer> LJIIL;
    public final List<Integer> LJIILIIL;
    public final MPD LJIILJJIL;
    public final List<MusNotice> LJIILL;
    public final List<MusNotice> LJIILLIIL;
    public final List<MusNotice> LJIIZILJ;

    public MP4() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MP4)) {
            return false;
        }
        MP4 mp4 = (MP4) obj;
        return o.LJ(this.LIZ, mp4.LIZ) && o.LJ(this.LIZIZ, mp4.LIZIZ) && o.LJ(this.LIZJ, mp4.LIZJ) && o.LJ(this.LIZLLL, mp4.LIZLLL) && this.LJ == mp4.LJ && this.LJFF == mp4.LJFF && this.LJI == mp4.LJI && o.LJ(this.LJII, mp4.LJII) && this.LJIIIIZZ == mp4.LJIIIIZZ && this.LJIIIZ == mp4.LJIIIZ && this.LJIIJ == mp4.LJIIJ && o.LJ(this.LJIIJJI, mp4.LJIIJJI) && o.LJ(this.LJIIL, mp4.LJIIL) && o.LJ(this.LJIILIIL, mp4.LJIILIIL) && o.LJ(this.LJIILJJIL, mp4.LJIILJJIL) && o.LJ(this.LJIILL, mp4.LJIILL) && o.LJ(this.LJIILLIIL, mp4.LJIILLIIL) && o.LJ(this.LJIIZILJ, mp4.LJIIZILJ);
    }

    public final String toString() {
        return "ProcessInfo(extraLiveData=" + this.LIZ + ", extraDataMap=" + this.LIZIZ + ", newData=" + this.LIZJ + ", logPb=" + this.LIZLLL + ", lastReadTime=" + this.LJ + ", isRefresh=" + this.LJFF + ", total=" + this.LJI + ", nextTimeRange=" + this.LJII + ", hasMore=" + this.LJIIIIZZ + ", shouldCollapse=" + this.LJIIIZ + ", hasNewExtra=" + this.LJIIJ + ", nidSet=" + this.LJIIJJI + ", typeSet=" + this.LJIIL + ", timelineSet=" + this.LJIILIIL + ", timeRange=" + this.LJIILJJIL + ", nextData=" + this.LJIILL + ", data=" + this.LJIILLIIL + ", collapsedData=" + this.LJIIZILJ + ')';
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int hashCode;
        int LIZIZ = AnonymousClass391.LIZIZ(this.LIZJ, C12400eC.LIZ(this.LIZIZ, this.LIZ.hashCode() * 31, 31), 31);
        LogPbBean logPbBean = this.LIZLLL;
        if (logPbBean == null) {
            hashCode = 0;
        } else {
            hashCode = logPbBean.hashCode();
        }
        int LIZJ = JBR.LIZJ(this.LJ, (LIZIZ + hashCode) * 31, 31);
        boolean z = this.LJFF;
        int i = 1;
        int i2 = z;
        if (z != 0) {
            i2 = 1;
        }
        int hashCode2 = (this.LJII.hashCode() + ((((LIZJ + i2) * 31) + this.LJI) * 31)) * 31;
        boolean z2 = this.LJIIIIZZ;
        int i3 = z2;
        if (z2 != 0) {
            i3 = 1;
        }
        int i4 = (hashCode2 + i3) * 31;
        boolean z3 = this.LJIIIZ;
        int i5 = z3;
        if (z3 != 0) {
            i5 = 1;
        }
        int i6 = (i4 + i5) * 31;
        if (!this.LJIIJ) {
            i = 0;
        }
        return this.LJIIZILJ.hashCode() + AnonymousClass391.LIZIZ(this.LJIILLIIL, AnonymousClass391.LIZIZ(this.LJIILL, (this.LJIILJJIL.hashCode() + AnonymousClass391.LIZIZ(this.LJIILIIL, HXX.LIZ(this.LJIIL, HXX.LIZ(this.LJIIJJI, (i6 + i) * 31, 31), 31), 31)) * 31, 31), 31);
    }

    public final boolean LIZ(MusNotice musNotice) {
        if (this.LJIIJJI.contains(musNotice.nid)) {
            return true;
        }
        int i = musNotice.type;
        if ((i == 1 || i == 2) && this.LJIIL.contains(Integer.valueOf(i))) {
            return true;
        }
        return false;
    }

    public final void LIZIZ(MusNotice musNotice, List<MusNotice> list) {
        long max;
        C56691MMt.LIZ.getClass();
        if (C56691MMt.LIZ()) {
            List<String> list2 = MLS.LIZ;
            if (list2.contains(musNotice.nid)) {
                musNotice.hasRead = false;
                GeneralTemplateNotice generalTemplateNotice = musNotice.templateNotice;
                if (generalTemplateNotice != null && generalTemplateNotice.hasRead) {
                    musNotice.templateNotice = new GeneralTemplateNotice(generalTemplateNotice.nid, generalTemplateNotice.uiTemplate, generalTemplateNotice.extraData, generalTemplateNotice.createTime, generalTemplateNotice.userId, generalTemplateNotice.type, generalTemplateNotice.legacySubType, generalTemplateNotice.nidStr, false, generalTemplateNotice.schemaUrl, generalTemplateNotice.messageExtra, generalTemplateNotice.shouldKeep, generalTemplateNotice.actions, generalTemplateNotice.actionMeta, generalTemplateNotice.LIZ, generalTemplateNotice.LIZIZ);
                }
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("resetNoticeHasRead, noticeId: ");
                LIZ.append(musNotice.nid);
                LIZ.append(", unreadNIds: ");
                LIZ.append(list2);
                C221018lt.LJFF("InboxActivityHelper", X1D.LIZIZ(LIZ));
                list2.remove(musNotice.nid);
            }
        }
        if (!musNotice.hasRead) {
            if (musNotice.noticeListType == 2) {
                musNotice.priority = 3;
            } else {
                musNotice.priority = 1;
            }
            musNotice.timeLineType = 0;
        } else {
            musNotice.timeLineType = C57105Mb7.LJIIJJI(musNotice.createTime * 1000);
        }
        musNotice.lastReadTime = this.LJ;
        if (musNotice.logPbBean == null) {
            musNotice.logPbBean = this.LIZLLL;
        }
        list.add(musNotice);
        java.util.Set<String> set = this.LJIIJJI;
        String str = musNotice.nid;
        o.LJIIIIZZ(str, "notice.nid");
        set.add(str);
        this.LJIIL.add(Integer.valueOf(musNotice.type));
        if (!this.LJIILIIL.contains(Integer.valueOf(musNotice.timeLineType))) {
            this.LJIILIIL.add(Integer.valueOf(musNotice.timeLineType));
        }
        MPD mpd = this.LJIILJJIL;
        long j = musNotice.createTime;
        if (j > 0) {
            long j2 = mpd.LIZ;
            if (j2 <= 0) {
                max = j;
            } else {
                max = Math.max(j2, j);
            }
            mpd.LIZ = max;
            long j3 = mpd.LIZIZ;
            if (j3 > 0) {
                j = Math.min(j3, j);
            }
            mpd.LIZIZ = j;
            return;
        }
        mpd.getClass();
    }

    public MP4(List extraLiveData, java.util.Map map, List newData, LogPbBean logPbBean, long j, boolean z, int i, MPD nextTimeRange, boolean z2, boolean z3, boolean z4, int i2) {
        LinkedHashSet nidSet;
        LinkedHashSet typeSet;
        ArrayList timelineSet;
        MPD timeRange;
        ArrayList nextData;
        ArrayList data;
        boolean z5 = (i2 & 1024) != 0 ? false : z4;
        if ((i2 & 2048) != 0) {
            nidSet = new LinkedHashSet();
        } else {
            nidSet = null;
        }
        if ((i2 & 4096) != 0) {
            typeSet = new LinkedHashSet();
        } else {
            typeSet = null;
        }
        if ((i2 & FileUtils.BUFFER_SIZE) != 0) {
            timelineSet = new ArrayList();
        } else {
            timelineSet = null;
        }
        if ((i2 & 16384) != 0) {
            timeRange = new MPD(0);
        } else {
            timeRange = null;
        }
        if ((32768 & i2) != 0) {
            nextData = new ArrayList();
        } else {
            nextData = null;
        }
        if ((65536 & i2) != 0) {
            data = new ArrayList();
        } else {
            data = null;
        }
        ArrayList collapsedData = (i2 & 131072) != 0 ? new ArrayList() : null;
        o.LJIIIZ(extraLiveData, "extraLiveData");
        o.LJIIIZ(newData, "newData");
        o.LJIIIZ(nextTimeRange, "nextTimeRange");
        o.LJIIIZ(nidSet, "nidSet");
        o.LJIIIZ(typeSet, "typeSet");
        o.LJIIIZ(timelineSet, "timelineSet");
        o.LJIIIZ(timeRange, "timeRange");
        o.LJIIIZ(nextData, "nextData");
        o.LJIIIZ(data, "data");
        o.LJIIIZ(collapsedData, "collapsedData");
        this.LIZ = extraLiveData;
        this.LIZIZ = map;
        this.LIZJ = newData;
        this.LIZLLL = logPbBean;
        this.LJ = j;
        this.LJFF = z;
        this.LJI = i;
        this.LJII = nextTimeRange;
        this.LJIIIIZZ = z2;
        this.LJIIIZ = z3;
        this.LJIIJ = z5;
        this.LJIIJJI = nidSet;
        this.LJIIL = typeSet;
        this.LJIILIIL = timelineSet;
        this.LJIILJJIL = timeRange;
        this.LJIILL = nextData;
        this.LJIILLIIL = data;
        this.LJIIZILJ = collapsedData;
    }
}

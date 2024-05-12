package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.notice.repo.list.bean.MusNotice;
import com.ss.android.ugc.aweme.notice.repo.list.bean.NoticeItems;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class MT1 {
    public final List<MusNotice> LIZ;
    public final List<MusNotice> LIZIZ;
    public final java.util.Map<Integer, NoticeItems> LIZJ;
    public final List<MusNotice> LIZLLL;
    public final boolean LJ;
    public final boolean LJFF;
    public final java.util.Set<String> LJI;
    public final java.util.Set<Integer> LJII;
    public final boolean LJIIIIZZ;

    public final boolean LIZ(MusNotice notice) {
        o.LJIIIZ(notice, "notice");
        if (this.LJI.contains(notice.nid)) {
            return true;
        }
        int i = notice.type;
        if ((i == 1 || i == 2) && this.LJII.contains(Integer.valueOf(i))) {
            return true;
        }
        return false;
    }

    public final void LIZJ(MusNotice notice) {
        o.LJIIIZ(notice, "notice");
        if (!notice.hasRead) {
            notice.priority = 1;
        }
        this.LIZ.add(notice);
        java.util.Set<String> set = this.LJI;
        String str = notice.nid;
        o.LJIIIIZZ(str, "notice.nid");
        set.add(str);
        this.LJII.add(Integer.valueOf(notice.type));
    }

    public final void LIZIZ(int i, MusNotice notice) {
        o.LJIIIZ(notice, "notice");
        if (!notice.hasRead) {
            notice.priority = 1;
        }
        if (i < 0) {
            this.LIZ.add(notice);
        } else {
            ListProtector.add(this.LIZ, i, notice);
        }
        java.util.Set<String> set = this.LJI;
        String str = notice.nid;
        o.LJIIIIZZ(str, "notice.nid");
        set.add(str);
        this.LJII.add(Integer.valueOf(notice.type));
    }

    public MT1(List list, java.util.Map extraDataMap, boolean z, boolean z2, boolean z3) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        LinkedHashSet linkedHashSet2 = new LinkedHashSet();
        o.LJIIIZ(extraDataMap, "extraDataMap");
        this.LIZ = arrayList;
        this.LIZIZ = list;
        this.LIZJ = extraDataMap;
        this.LIZLLL = arrayList2;
        this.LJ = z;
        this.LJFF = z2;
        this.LJI = linkedHashSet;
        this.LJII = linkedHashSet2;
        this.LJIIIIZZ = z3;
    }
}

package X;

import android.util.LongSparseArray;
import com.bytedance.android.livesdk.gift.base.platform.core.manager.GiftManager;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.CsB, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32683CsB {
    public static final /* synthetic */ int LJIIJJI = 0;
    public int LJI;
    public int LJII;
    public int LIZ = -1;
    public int LIZIZ = -1;
    public final LongSparseArray<Long> LIZJ = new LongSparseArray<>();
    public final LongSparseArray<Long> LIZLLL = new LongSparseArray<>();
    public final LongSparseArray<Integer> LJ = new LongSparseArray<>();
    public final LinkedList<AbstractC32698CsQ<? extends C30896CAq>> LJFF = new LinkedList<>();
    public final LinkedList<Long> LJIIIIZZ = new LinkedList<>();
    public final LinkedList<Long> LJIIIZ = new LinkedList<>();
    public boolean LJIIJ = true;

    public final int LIZ() {
        Iterator<Long> it = this.LJIIIIZZ.iterator();
        int i = 0;
        while (it.hasNext()) {
            Long giftId = it.next();
            LongSparseArray<Long> longSparseArray = this.LIZJ;
            o.LJIIIIZZ(giftId, "giftId");
            if (longSparseArray.get(giftId.longValue()) != null || this.LJIIIZ.contains(giftId)) {
                i++;
            }
        }
        return i;
    }

    public final int LIZIZ() {
        Iterator<Long> it = this.LJIIIIZZ.iterator();
        int i = 0;
        while (it.hasNext()) {
            Long id = it.next();
            LongSparseArray<Integer> longSparseArray = this.LJ;
            o.LJIIIIZZ(id, "id");
            Integer num = longSparseArray.get(id.longValue());
            if (num != null && num.intValue() == 0) {
                i++;
            }
        }
        return i;
    }

    public final void LIZJ() {
        if (LIZIZ() == 0) {
            return;
        }
        BZI LIZ = C28787BRn.LIZ("gift_panel_gift_icon_load");
        LIZ.LJIJJ(Integer.valueOf(C32129CjF.LIZ.LJIIIIZZ), "tab_id");
        Iterator<Long> it = this.LJIIIIZZ.iterator();
        long j = 0;
        long j2 = 0;
        while (it.hasNext()) {
            Long id = it.next();
            LongSparseArray<Long> longSparseArray = this.LIZJ;
            o.LJIIIIZZ(id, "id");
            long longValue = longSparseArray.get(id.longValue()).longValue();
            Long l = this.LIZLLL.get(id.longValue());
            o.LJIIIIZZ(l, "mStartTimeList[id]");
            long longValue2 = longValue - l.longValue();
            if (longValue2 > j2) {
                j2 = longValue2;
            }
        }
        LIZ.LJIJJ(Long.valueOf(j2), "gift_icon_load_duration_ms");
        LIZ.LJIJJ(Integer.valueOf(GiftManager.inst().getTabLocation(C32129CjF.LIZ.LJIIIIZZ)), "page_position");
        LIZ.LJIJJ(Integer.valueOf(this.LJII), "gift_cnt");
        LIZ.LJIJJ(Integer.valueOf(LIZIZ()), "no_cache_gift_cnt");
        Iterator<Long> it2 = this.LJIIIIZZ.iterator();
        int i = 0;
        while (it2.hasNext()) {
            if (this.LJIIIZ.contains(it2.next())) {
                i++;
            }
        }
        LIZ.LJIJJ(Integer.valueOf(i), "no_cache_gift_fail_cnt");
        int LIZIZ = LIZIZ();
        Iterator<Long> it3 = this.LJIIIIZZ.iterator();
        long j3 = 0;
        while (it3.hasNext()) {
            Long id2 = it3.next();
            LongSparseArray<Integer> longSparseArray2 = this.LJ;
            o.LJIIIIZZ(id2, "id");
            Integer num = longSparseArray2.get(id2.longValue());
            if (num != null && num.intValue() == 0) {
                long longValue3 = this.LIZJ.get(id2.longValue()).longValue();
                Long l2 = this.LIZLLL.get(id2.longValue());
                o.LJIIIIZZ(l2, "mStartTimeList[id]");
                j3 += longValue3 - l2.longValue();
            }
        }
        if (LIZIZ != 0) {
            j = j3 / LIZIZ;
        }
        LIZ.LJIJJ(Long.valueOf(j), "no_cache_gift_load_duration_ms_avg");
        LIZ.LJIJJ("1", "is_swipe");
        LIZ.LJIIZILJ();
        LIZ.LJJIIJZLJL();
        Iterator<Long> it4 = this.LJIIIIZZ.iterator();
        while (it4.hasNext()) {
            Long id3 = it4.next();
            LongSparseArray<Integer> longSparseArray3 = this.LJ;
            o.LJIIIIZZ(id3, "id");
            longSparseArray3.put(id3.longValue(), 1);
        }
    }

    public final void LIZLLL(long j) {
        this.LIZJ.put(j, Long.valueOf(C30725C4b.LIZ()));
        if (this.LJIIIIZZ.contains(Long.valueOf(j))) {
            this.LJI++;
        }
        if (this.LJI == this.LJII && this.LJIIJ) {
            this.LJIIJ = false;
            LIZJ();
        }
    }

    public final void LJ(long j) {
        this.LIZJ.put(j, Long.valueOf(C30725C4b.LIZ()));
        if (this.LJIIIIZZ.contains(Long.valueOf(j))) {
            this.LJI++;
        }
        this.LJIIIZ.add(Long.valueOf(j));
        if (this.LJI == this.LJII && this.LJIIJ) {
            this.LJIIJ = false;
            LIZJ();
        }
    }

    public final void LJFF(long j) {
        this.LIZLLL.put(j, Long.valueOf(C30725C4b.LIZ()));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void LJI(List<Long> list) {
        Long l;
        long j;
        this.LJII = ((LinkedList) list).size();
        this.LJIIIIZZ.clear();
        Iterator it = ORZ.LLJJI(this.LJFF).iterator();
        while (true) {
            C199797sl c199797sl = (C199797sl) it;
            if (!c199797sl.hasNext()) {
                break;
            }
            C2058786d c2058786d = (C2058786d) c199797sl.next();
            AbstractC32698CsQ abstractC32698CsQ = (AbstractC32698CsQ) c2058786d.LIZIZ;
            if (abstractC32698CsQ != null) {
                l = Long.valueOf(abstractC32698CsQ.LIZJ());
            } else {
                l = null;
            }
            if (ORZ.LJLJJI(l, list)) {
                LinkedList<Long> linkedList = this.LJIIIIZZ;
                AbstractC32698CsQ abstractC32698CsQ2 = (AbstractC32698CsQ) c2058786d.LIZIZ;
                if (abstractC32698CsQ2 != null) {
                    j = abstractC32698CsQ2.LIZJ();
                } else {
                    j = 0;
                }
                linkedList.add(Long.valueOf(j));
            }
        }
        int LIZ = LIZ();
        this.LJI = LIZ;
        this.LJIIJ = true;
        if (LIZ == this.LJII) {
            this.LJIIJ = false;
            try {
                LIZJ();
            } catch (Exception unused) {
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void LJII(int i) {
        int i2;
        long j;
        if (this.LIZIZ == i) {
            return;
        }
        this.LIZIZ = i;
        int size = ((this.LJFF.size() - 1) / 8) + 1;
        int size2 = ((this.LJFF.size() - 1) / 8) * 8;
        if (i == size - 1) {
            i2 = this.LJFF.size() - size2;
        } else {
            i2 = 8;
        }
        this.LJII = i2;
        this.LJIIIIZZ.clear();
        Iterator it = ORZ.LLJJI(this.LJFF).iterator();
        while (true) {
            C199797sl c199797sl = (C199797sl) it;
            if (!c199797sl.hasNext()) {
                break;
            }
            C2058786d c2058786d = (C2058786d) c199797sl.next();
            int i3 = c2058786d.LIZ;
            if (i3 >= i * 8 && i3 < Math.min((i + 1) * 8, this.LJFF.size())) {
                LinkedList<Long> linkedList = this.LJIIIIZZ;
                AbstractC32698CsQ abstractC32698CsQ = (AbstractC32698CsQ) c2058786d.LIZIZ;
                if (abstractC32698CsQ != null) {
                    j = abstractC32698CsQ.LIZJ();
                } else {
                    j = 0;
                }
                linkedList.add(Long.valueOf(j));
            }
        }
        int LIZ = LIZ();
        this.LJI = LIZ;
        this.LJIIJ = true;
        if (LIZ == this.LJII) {
            this.LJIIJ = false;
            try {
                LIZJ();
            } catch (Exception unused) {
            }
        }
    }

    public final void LJIIIIZZ(int i, LinkedList<AbstractC32698CsQ<? extends C30896CAq>> linkedList) {
        if (this.LIZ == i) {
            return;
        }
        this.LIZIZ = -1;
        this.LJIIJ = true;
        this.LIZ = i;
        this.LIZLLL.clear();
        this.LJ.clear();
        this.LIZJ.clear();
        this.LJFF.clear();
        this.LJFF.addAll(linkedList);
    }
}

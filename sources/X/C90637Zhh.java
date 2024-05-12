package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.google.android.gms.cast.MediaQueueItem;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.Zhh, reason: case insensitive filesystem */
/* loaded from: classes29.dex */
public final class C90637Zhh extends AbstractC90122ZYo {
    public final /* synthetic */ C90120ZYm LIZ;

    public C90637Zhh(C90120ZYm c90120ZYm) {
        this.LIZ = c90120ZYm;
    }

    @Override // X.AbstractC90122ZYo
    public final void LJI() {
        long LJ = this.LIZ.LJ();
        C90120ZYm c90120ZYm = this.LIZ;
        if (LJ != c90120ZYm.LIZIZ) {
            c90120ZYm.LIZIZ = LJ;
            c90120ZYm.LIZJ();
            C90120ZYm c90120ZYm2 = this.LIZ;
            if (c90120ZYm2.LIZIZ != 0) {
                c90120ZYm2.LIZLLL();
            }
        }
    }

    @Override // X.AbstractC90122ZYo
    public final void LJIILIIL() {
        this.LIZ.LIZLLL();
    }

    @Override // X.AbstractC90122ZYo
    public final void LJII(int[] iArr) {
        List<Integer> LJ = C90468Zey.LJ(iArr);
        if (this.LIZ.LIZLLL.equals(LJ)) {
            return;
        }
        this.LIZ.LJI();
        this.LIZ.LJFF.evictAll();
        ((ArrayList) this.LIZ.LJI).clear();
        C90120ZYm c90120ZYm = this.LIZ;
        c90120ZYm.LIZLLL = LJ;
        C90120ZYm.LIZIZ(c90120ZYm);
        Iterator it = ((HashSet) this.LIZ.LJIIL).iterator();
        while (it.hasNext()) {
            it.next().getClass();
        }
        this.LIZ.LJFF();
    }

    @Override // X.AbstractC90122ZYo
    public final void LJIIIZ(MediaQueueItem[] mediaQueueItemArr) {
        HashSet hashSet = new HashSet();
        ((ArrayList) this.LIZ.LJI).clear();
        for (MediaQueueItem mediaQueueItem : mediaQueueItemArr) {
            int i = mediaQueueItem.zzc;
            this.LIZ.LJFF.put(Integer.valueOf(i), mediaQueueItem);
            int i2 = this.LIZ.LJ.get(i, -1);
            if (i2 == -1) {
                this.LIZ.LIZLLL();
                return;
            }
            hashSet.add(Integer.valueOf(i2));
        }
        Iterator it = ((ArrayList) this.LIZ.LJI).iterator();
        while (it.hasNext()) {
            int i3 = this.LIZ.LJ.get(((Integer) it.next()).intValue(), -1);
            if (i3 != -1) {
                hashSet.add(Integer.valueOf(i3));
            }
        }
        ((ArrayList) this.LIZ.LJI).clear();
        ArrayList arrayList = new ArrayList(hashSet);
        Collections.sort(arrayList);
        this.LIZ.LJI();
        C90120ZYm c90120ZYm = this.LIZ;
        C90468Zey.LJI(arrayList);
        Iterator it2 = ((HashSet) c90120ZYm.LJIIL).iterator();
        while (it2.hasNext()) {
            it2.next().getClass();
        }
        this.LIZ.LJFF();
    }

    @Override // X.AbstractC90122ZYo
    public final void LJIIJ(int[] iArr) {
        ArrayList arrayList = new ArrayList();
        for (int i : iArr) {
            this.LIZ.LJFF.remove(Integer.valueOf(i));
            int i2 = this.LIZ.LJ.get(i, -1);
            if (i2 == -1) {
                this.LIZ.LIZLLL();
                return;
            } else {
                this.LIZ.LJ.delete(i);
                arrayList.add(Integer.valueOf(i2));
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        Collections.sort(arrayList);
        this.LIZ.LJI();
        this.LIZ.LIZLLL.removeAll(C90468Zey.LJ(iArr));
        C90120ZYm.LIZIZ(this.LIZ);
        C90120ZYm c90120ZYm = this.LIZ;
        C90468Zey.LJI(arrayList);
        Iterator it = ((HashSet) c90120ZYm.LJIIL).iterator();
        while (it.hasNext()) {
            it.next().getClass();
        }
        this.LIZ.LJFF();
    }

    @Override // X.AbstractC90122ZYo
    public final void LJIIL(int[] iArr) {
        ArrayList arrayList = new ArrayList();
        for (int i : iArr) {
            this.LIZ.LJFF.remove(Integer.valueOf(i));
            int i2 = this.LIZ.LJ.get(i, -1);
            if (i2 == -1) {
                this.LIZ.LIZLLL();
                return;
            }
            arrayList.add(Integer.valueOf(i2));
        }
        Collections.sort(arrayList);
        this.LIZ.LJI();
        C90120ZYm c90120ZYm = this.LIZ;
        C90468Zey.LJI(arrayList);
        Iterator it = ((HashSet) c90120ZYm.LJIIL).iterator();
        while (it.hasNext()) {
            it.next().getClass();
        }
        this.LIZ.LJFF();
    }

    @Override // X.AbstractC90122ZYo
    public final void LJIIIIZZ(int i, int[] iArr) {
        int i2;
        if (i == 0) {
            i2 = this.LIZ.LIZLLL.size();
        } else {
            i2 = this.LIZ.LJ.get(i, -1);
            if (i2 == -1) {
                this.LIZ.LIZLLL();
                return;
            }
        }
        this.LIZ.LJI();
        this.LIZ.LIZLLL.addAll(i2, C90468Zey.LJ(iArr));
        C90120ZYm.LIZIZ(this.LIZ);
        Iterator it = ((HashSet) this.LIZ.LJIIL).iterator();
        while (it.hasNext()) {
            it.next().getClass();
        }
        this.LIZ.LJFF();
    }

    @Override // X.AbstractC90122ZYo
    public final void LJIIJJI(int i, List list, List list2) {
        ArrayList arrayList = new ArrayList();
        if (i == 0) {
            this.LIZ.LIZLLL.size();
        } else if (((ArrayList) list2).isEmpty()) {
            this.LIZ.LIZ.getClass();
        } else if (this.LIZ.LJ.get(i, -1) == -1) {
            this.LIZ.LJ.get(((Integer) ListProtector.get(list2, 0)).intValue(), -1);
        }
        Iterator it = ((ArrayList) list2).iterator();
        while (it.hasNext()) {
            int i2 = this.LIZ.LJ.get(((Integer) it.next()).intValue(), -1);
            if (i2 == -1) {
                this.LIZ.LIZLLL();
                return;
            }
            arrayList.add(Integer.valueOf(i2));
        }
        this.LIZ.LJI();
        C90120ZYm c90120ZYm = this.LIZ;
        c90120ZYm.LIZLLL = list;
        C90120ZYm.LIZIZ(c90120ZYm);
        Iterator it2 = ((HashSet) this.LIZ.LJIIL).iterator();
        while (it2.hasNext()) {
            it2.next().getClass();
        }
        this.LIZ.LJFF();
    }
}

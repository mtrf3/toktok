package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: X.UNx, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C77105UNx {
    public long LIZ;
    public long LIZIZ;
    public long LIZJ;
    public long LIZLLL;
    public C77107UNz LJFF;
    public C77107UNz LJI;
    public int LJ = -1;
    public final CopyOnWriteArrayList<C77106UNy> LJII = new CopyOnWriteArrayList<>();

    public final void LIZ(C77106UNy c77106UNy) {
        if (c77106UNy.LJLIL + c77106UNy.LJLJJI < this.LIZIZ + this.LIZLLL) {
            return;
        }
        if (this.LJII.isEmpty()) {
            this.LIZIZ = c77106UNy.LJLIL;
            this.LIZLLL = c77106UNy.LJLJJI;
        } else {
            this.LIZLLL = (c77106UNy.LJLIL + c77106UNy.LJLJJI) - this.LIZIZ;
        }
        this.LJII.add(c77106UNy);
    }

    public final void LIZIZ(long j) {
        this.LIZJ = j;
        if (this.LIZ == 0) {
            this.LIZ = j;
        }
        long j2 = this.LIZIZ;
        if (j < j2) {
            this.LJI = null;
            this.LJ = -1;
            if ((!this.LJII.isEmpty()) && (!((C77106UNy) ORZ.LJLLJ(this.LJII)).LJLILLLLZI.isEmpty())) {
                this.LJFF = (C77107UNz) ORZ.LJLLJ(((C77106UNy) ORZ.LJLLJ(this.LJII)).LJLILLLLZI);
                return;
            }
            return;
        }
        int i = 0;
        if (j >= j2 + this.LIZLLL) {
            this.LJI = (C77107UNz) ORZ.LLFF(((C77106UNy) ORZ.LLFF(this.LJII)).LJLILLLLZI);
            this.LJFF = null;
            Iterator<C77106UNy> it = this.LJII.iterator();
            while (it.hasNext()) {
                i += it.next().LJLJJLL.length();
                this.LJ = i;
            }
            return;
        }
        Iterator<C77106UNy> it2 = this.LJII.iterator();
        int i2 = 0;
        while (it2.hasNext()) {
            C77106UNy next = it2.next();
            int i3 = i + 1;
            if (i >= 0) {
                C77106UNy c77106UNy = next;
                long j3 = this.LIZJ;
                long j4 = c77106UNy.LJLIL;
                if (j3 >= j4) {
                    if (j3 <= j4 + c77106UNy.LJLJJI) {
                        Iterator<C77107UNz> it3 = c77106UNy.LJLILLLLZI.iterator();
                        while (it3.hasNext()) {
                            C77107UNz next2 = it3.next();
                            if (next2.LIZIZ <= this.LIZJ) {
                                this.LJI = next2;
                                this.LJ = next2.LIZJ + i2;
                                this.LJFF = null;
                            } else {
                                this.LJFF = next2;
                                return;
                            }
                        }
                    } else {
                        int length = c77106UNy.LJLJJLL.length() + i2;
                        ArrayList<C77107UNz> arrayList = c77106UNy.LJLILLLLZI;
                        if (!arrayList.isEmpty()) {
                            this.LJI = (C77107UNz) ORZ.LLFF(arrayList);
                            this.LJ = length;
                        }
                        this.LJFF = null;
                        i2 = length;
                    }
                    i = i3;
                } else {
                    ArrayList<C77107UNz> arrayList2 = c77106UNy.LJLILLLLZI;
                    if (!arrayList2.isEmpty()) {
                        this.LJFF = (C77107UNz) ORZ.LJLLJ(arrayList2);
                        return;
                    }
                    return;
                }
            } else {
                C47261Igj.LJJJJJ();
                throw null;
            }
        }
    }
}

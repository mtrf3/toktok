package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.sliver.Sliver;
import com.bytedance.sliver.SliverAllThreadSupport;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* renamed from: X.FYb, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C39149FYb {
    public final int LIZ;
    public final int LIZIZ;
    public final HashSet<Thread> LIZJ = new HashSet<>();
    public volatile long LIZLLL;
    public final int LJ;
    public final FY8 LJFF;
    public volatile boolean LJI;

    public final synchronized void LIZIZ() {
        LIZJ();
        if (this.LIZLLL == 0) {
            return;
        }
        if (!this.LJI) {
            return;
        }
        ArrayList arrayList = new ArrayList(this.LIZJ.size());
        ArrayList arrayList2 = new ArrayList(this.LIZJ.size());
        Iterator<Thread> it = this.LIZJ.iterator();
        while (it.hasNext()) {
            Thread next = it.next();
            long threadPeer = Sliver.getThreadPeer(next);
            if (threadPeer != 0) {
                arrayList.add(Long.valueOf(threadPeer));
                arrayList2.add(next);
            }
        }
        long[] jArr = new long[arrayList.size()];
        for (int i = 0; i < arrayList.size(); i++) {
            jArr[i] = ((Long) ListProtector.get(arrayList, i)).longValue();
        }
        SliverAllThreadSupport.nNotifySliverGroup(this.LIZLLL, (Thread[]) arrayList2.toArray(new Thread[0]), jArr);
        this.LJI = false;
    }

    public final synchronized void LIZJ() {
        if (this.LIZLLL != 0) {
            return;
        }
        this.LIZLLL = SliverAllThreadSupport.nStartSliverGroup(this.LIZIZ, this.LJ, Sliver.mode2Int(this.LJFF), this.LIZ);
    }

    public final synchronized void LIZ(String str) {
        SliverAllThreadSupport.nDumpSliverGroup(this.LIZLLL, str);
    }

    public C39149FYb(int i, int i2, int i3, FY8 fy8) {
        this.LIZ = i;
        this.LIZIZ = i2;
        this.LJ = i3;
        this.LJFF = fy8;
    }
}

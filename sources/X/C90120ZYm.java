package X;

import android.os.Handler;
import android.util.LruCache;
import android.util.SparseIntArray;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.google.android.gms.cast.MediaInfo;
import com.google.android.gms.cast.MediaQueueItem;
import com.google.android.gms.cast.MediaStatus;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.TimerTask;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: X.ZYm, reason: case insensitive filesystem */
/* loaded from: classes29.dex */
public final class C90120ZYm {
    public long LIZIZ;
    public final C90639Zhj LIZJ;
    public List<Integer> LIZLLL;
    public final SparseIntArray LJ;
    public LruCache<Integer, MediaQueueItem> LJFF;
    public final List<Integer> LJI;
    public final Deque<Integer> LJII;
    public final Handler LJIIIIZZ;
    public final TimerTask LJIIIZ;
    public BasePendingResult LJIIJ;
    public BasePendingResult LJIIJJI;
    public final java.util.Set<AbstractC90118ZYk> LJIIL = new HashSet();
    public final C90469Zez LIZ = new C90469Zez("MediaQueue");

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v4, types: [X.QiK] */
    public final void LIZLLL() {
        C90925ZmL c90925ZmL;
        QH7.LJ("Must be called from the main thread.");
        if (this.LIZIZ == 0 || this.LJIIJJI != null) {
            return;
        }
        BasePendingResult basePendingResult = this.LJIIJ;
        if (basePendingResult != null) {
            basePendingResult.LIZLLL();
            this.LJIIJ = null;
        }
        C90639Zhj c90639Zhj = this.LIZJ;
        c90639Zhj.getClass();
        QH7.LJ("Must be called from the main thread.");
        if (!c90639Zhj.LJJIII()) {
            c90925ZmL = C90639Zhj.LJIJJLI();
        } else {
            C90925ZmL c90925ZmL2 = new C90925ZmL(c90639Zhj);
            C90639Zhj.LJJIIJ(c90925ZmL2);
            c90925ZmL = c90925ZmL2;
        }
        this.LJIIJJI = c90925ZmL;
        c90925ZmL.LIZIZ(new InterfaceC67740QiG() { // from class: X.Zho
            @Override // X.InterfaceC67740QiG
            public final void LIZ(InterfaceC67754QiU interfaceC67754QiU) {
                C90120ZYm c90120ZYm = C90120ZYm.this;
                c90120ZYm.getClass();
                Status status = interfaceC67754QiU.getStatus();
                int i = status.zzc;
                if (i != 0) {
                    C90469Zez c90469Zez = c90120ZYm.LIZ;
                    C16880lQ.LLLZ("Error fetching queue item ids, statusCode=%s, statusMessage=%s", new Object[]{Integer.valueOf(i), status.zzd});
                    c90469Zez.getClass();
                }
                c90120ZYm.LJIIJJI = null;
                if (!((ArrayDeque) c90120ZYm.LJII).isEmpty()) {
                    c90120ZYm.LJIIIIZZ.removeCallbacks(c90120ZYm.LJIIIZ);
                    c90120ZYm.LJIIIIZZ.postDelayed(c90120ZYm.LJIIIZ, 500L);
                }
            }
        });
    }

    public final long LJ() {
        int i;
        MediaStatus LJI = this.LIZJ.LJI();
        if (LJI != null) {
            MediaInfo mediaInfo = LJI.zza;
            if (mediaInfo == null) {
                i = -1;
            } else {
                i = mediaInfo.zzd;
            }
            int i2 = LJI.zze;
            int i3 = LJI.zzf;
            int i4 = LJI.zzl;
            if (i2 == 1) {
                if (i3 != 1) {
                    if (i3 != 2) {
                        if (i3 != 3) {
                            return 0L;
                        }
                    } else if (i != 2) {
                        return 0L;
                    }
                }
                if (i4 == 0) {
                    return 0L;
                }
            }
            return LJI.zzb;
        }
        return 0L;
    }

    public final void LJFF() {
        Iterator<AbstractC90118ZYk> it = this.LJIIL.iterator();
        while (it.hasNext()) {
            it.next().getClass();
        }
    }

    public final void LJI() {
        Iterator<AbstractC90118ZYk> it = this.LJIIL.iterator();
        while (it.hasNext()) {
            it.next().getClass();
        }
    }

    public final void LIZJ() {
        LJI();
        this.LIZLLL.clear();
        this.LJ.clear();
        this.LJFF.evictAll();
        ((ArrayList) this.LJI).clear();
        this.LJIIIIZZ.removeCallbacks(this.LJIIIZ);
        ((ArrayDeque) this.LJII).clear();
        BasePendingResult basePendingResult = this.LJIIJJI;
        if (basePendingResult != null) {
            basePendingResult.LIZLLL();
            this.LJIIJJI = null;
        }
        BasePendingResult basePendingResult2 = this.LJIIJ;
        if (basePendingResult2 != null) {
            basePendingResult2.LIZLLL();
            this.LJIIJ = null;
        }
        Iterator it = ((HashSet) this.LJIIL).iterator();
        while (it.hasNext()) {
            it.next().getClass();
        }
        LJFF();
    }

    public C90120ZYm(C90639Zhj c90639Zhj) {
        this.LIZJ = c90639Zhj;
        Math.max(20, 1);
        this.LIZLLL = new ArrayList();
        this.LJ = new SparseIntArray();
        this.LJI = new ArrayList();
        this.LJII = new ArrayDeque(20);
        this.LJIIIIZZ = new HandlerC90301ZcH(C16880lQ.LLJJJJ());
        this.LJIIIZ = new C90116ZYi(this);
        C90637Zhh c90637Zhh = new C90637Zhh(this);
        c90639Zhj.getClass();
        QH7.LJ("Must be called from the main thread.");
        ((CopyOnWriteArrayList) c90639Zhj.LJII).add(c90637Zhh);
        this.LJFF = new C90119ZYl(this);
        this.LIZIZ = LJ();
        LIZLLL();
    }

    public static /* bridge */ /* synthetic */ void LIZIZ(C90120ZYm c90120ZYm) {
        c90120ZYm.LJ.clear();
        for (int i = 0; i < c90120ZYm.LIZLLL.size(); i++) {
            c90120ZYm.LJ.put(((Integer) ListProtector.get(c90120ZYm.LIZLLL, i)).intValue(), i);
        }
    }

    public final int LIZ(int i) {
        QH7.LJ("Must be called from the main thread.");
        if (i >= 0 && i < this.LIZLLL.size()) {
            return ((Integer) ListProtector.get(this.LIZLLL, i)).intValue();
        }
        return 0;
    }
}

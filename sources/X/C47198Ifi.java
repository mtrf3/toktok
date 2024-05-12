package X;

import Y.ARunnableS27S0200000_8;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.playerkit.simapicommon.model.SimVideoUrlModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutorService;

/* renamed from: X.Ifi, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C47198Ifi extends AbstractC47210Ifu {
    public final boolean LJI;
    public String LJII;
    public final IZ1 LJIIIZ;
    public final ExecutorService LJIIIIZZ = C16880lQ.LLLLZLLIL();
    public final C47200Ifk LJIIJ = new C47200Ifk(this);
    public final C47213Ifx LJIIJJI = new C47213Ifx(this);
    public final InterfaceC46732IVs LJ = C47242IgQ.LIZ();
    public final InterfaceC47225Ig9 LJFF = C1DG.LIZ().getConfig().getVideoPreloaderManagerConfig().getPreloadStrategy();

    @Override // X.AbstractC47210Ifu
    public final boolean LJIIJJI() {
        if (C1DG.LIZ().getConfig().getVideoPreloaderManagerConfig().canPreload()) {
            this.LJIIIZ.getClass();
            return true;
        }
        return false;
    }

    @Override // X.AbstractC47210Ifu, X.IZ0
    public final InterfaceC46540IOi LJII() {
        return this.LJIIJ;
    }

    public C47198Ifi(IZ1 iz1) {
        this.LJIIIZ = iz1;
        boolean canPreload = C1DG.LIZ().getConfig().getVideoPreloaderManagerConfig().canPreload();
        this.LJI = canPreload;
        C07670Rv.LIZLLL("preload enable:", canPreload);
    }

    @Override // X.AbstractC47210Ifu, X.IZ0
    public final void LJFF(String str) {
        this.LJ.removeDownloadProgressListener(this.LJIIJJI);
    }

    @Override // X.AbstractC47210Ifu, X.IZ0
    public final void LJI(String str, List<InterfaceC46811IYt> list) {
        InterfaceC46811IYt interfaceC46811IYt;
        List<InterfaceC46813IYv> LJIIJ;
        SimVideoUrlModel LIZJ;
        if (!this.LJI || list.size() == 0) {
            return;
        }
        boolean z = false;
        if (C1DG.LIZ().getConfig().getVideoPreloaderManagerConfig().enableLoadMorePreload() && (interfaceC46811IYt = this.LIZ.LIZJ) != null && (LJIIJ = interfaceC46811IYt.LJIIJ()) != null && LJIIJ.size() != 0 && (LIZJ = C46810IYs.LIZJ(interfaceC46811IYt, (InterfaceC46813IYv) ListProtector.get(LJIIJ, 0))) != null && this.LJ.isCacheCompleted(LIZJ)) {
            List<InterfaceC46811IYt> list2 = this.LIZ.LIZIZ;
            if (list.size() != 0 && list2 != null && list2.size() != 0 && list.size() > list2.size() && TextUtils.equals(((InterfaceC46811IYt) ListProtector.get(list, 0)).getKey(), ((InterfaceC46811IYt) ListProtector.get(list2, 0)).getKey())) {
                z = true;
            }
        }
        this.LJ.addDownloadProgressListener(this.LJIIJJI);
        if (!z) {
            return;
        }
        LJIIL(0L, 0L);
    }

    public final void LJIIL(long j, long j2) {
        List<C47227IgB> LIZ;
        ArrayList arrayList = new ArrayList();
        InterfaceC47225Ig9 interfaceC47225Ig9 = this.LJFF;
        if (interfaceC47225Ig9 != null && (LIZ = interfaceC47225Ig9.LIZ()) != null && LIZ.size() > 0) {
            arrayList.addAll(LIZ);
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C47227IgB c47227IgB = (C47227IgB) it.next();
            if (100 * j2 >= c47227IgB.LIZ * j) {
                arrayList2.add(c47227IgB);
            }
        }
        if (arrayList2.isEmpty()) {
            return;
        }
        this.LJIIIIZZ.submit(new ARunnableS27S0200000_8(this, arrayList2, 75));
    }
}

package X;

import android.os.HandlerThread;
import android.os.Message;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.o;

/* renamed from: X.IcU, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C46998IcU implements IXI, IXC {
    public static int LJJIIJ;
    public final int LIZ;
    public final ITZ LIZIZ;
    public final List<HandlerThread> LIZJ;
    public final List<HandlerThread> LIZLLL;
    public List<IX7> LJFF;
    public IX7 LJI;
    public IX7 LJII;
    public IX7 LJIIIIZZ;
    public boolean LJIIIZ;
    public final boolean LJIIJ;
    public ITX LJIIJJI;
    public final C46999IcV LJIIL;
    public long LJIILIIL;
    public long LJIILJJIL;
    public long LJIILL;
    public long LJIILLIIL;
    public String LJIIZILJ;
    public String LJIJ;
    public String LJIJI;
    public volatile boolean LJIJJLI;
    public volatile boolean LJIL;
    public final C47002IcY LJJ;
    public HandlerThread LJJI;
    public HandlerC46995IcR LJJIFFI;
    public InterfaceC46942Iba LJJII;
    public int LJIJJ = -1;
    public final Object LJJIII = new Object();
    public final List<IX7> LJ = new CopyOnWriteArrayList();

    @Override // X.IXC
    public final IX7 LIZLLL() {
        IX7 LJIILL = LJIILL(null);
        this.LJI = LJIILL;
        return LJIILL;
    }

    @Override // X.IXC
    public final IX7 LJIIIZ() {
        IX7 LJIILL = LJIILL(null);
        this.LJII = LJIILL;
        return LJIILL;
    }

    @Override // X.IXC
    public final void LJ() {
        this.LJJ.LIZIZ(this);
        this.LJJ.LIZJ();
    }

    @Override // X.IXC
    public final void LJIIJ() {
        IX7 ix7 = this.LJII;
        if (ix7 != null) {
            ix7.LJFF();
        }
        this.LJII = null;
        IX7 ix72 = this.LJIIIIZZ;
        if (ix72 != null) {
            ix72.LJFF();
        }
        this.LJIIIIZZ = null;
        HandlerC46995IcR handlerC46995IcR = this.LJJIFFI;
        if (handlerC46995IcR != null && !handlerC46995IcR.LIZJ) {
            handlerC46995IcR.sendEmptyMessage(3);
        }
    }

    public final void LJIIJJI() {
        if (this.LJJI == null || this.LJJIFFI == null) {
            HandlerThread handlerThread = new HandlerThread("acceleratePlayHandlerThread");
            this.LJJI = handlerThread;
            handlerThread.start();
            this.LJJIFFI = new HandlerC46995IcR(this, this.LJJI);
        }
    }

    public final void LJIIL() {
        synchronized (this.LJJIII) {
            this.LJJIFFI = null;
            this.LJJI = null;
            this.LJIJJLI = false;
            this.LJIL = false;
        }
    }

    public final void LJIILLIIL() {
        if (IXB.LIZ) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("initThreadPool max:");
            LIZ.append(this.LJIIL.LIZLLL);
            LIZ.append(", core:");
            LIZ.append(this.LJIIL.LJ);
            IXB.LIZIZ("PlaySessionManager", X1D.LIZIZ(LIZ));
        }
        for (int i = 0; i < this.LJIIL.LJ; i++) {
            try {
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("play_thread_");
                LIZ2.append(i);
                HandlerThread handlerThread = new HandlerThread(X1D.LIZIZ(LIZ2), 0);
                handlerThread.start();
                this.LIZJ.add(handlerThread);
            } catch (Exception unused) {
                if (IXB.LIZ) {
                    IXB.LIZIZ("PlaySessionManager", "create init thread fail, may use main looper");
                }
            }
        }
        this.LJIILIIL = System.currentTimeMillis();
    }

    @Override // X.IXC
    public final void release() {
        if (IXB.LIZ) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("release mCurrentSession:");
            LIZ.append(this.LJI);
            IXB.LIZIZ("PlaySessionManager", X1D.LIZIZ(LIZ));
        }
        IX7 ix7 = this.LJI;
        if (ix7 != null) {
            ix7.LJFF();
        }
        this.LJI = null;
        IX7 ix72 = this.LJII;
        if (ix72 != null) {
            ix72.LJFF();
        }
        this.LJII = null;
        IX7 ix73 = this.LJIIIIZZ;
        if (ix73 != null) {
            ix73.LJFF();
        }
        this.LJIIIIZZ = null;
        HandlerC46995IcR handlerC46995IcR = this.LJJIFFI;
        if (handlerC46995IcR != null) {
            if (!handlerC46995IcR.LIZJ) {
                handlerC46995IcR.sendEmptyMessage(3);
            }
            if (IZ8.LIZIZ()) {
                LJIIL();
            }
        }
        Iterator it = ((CopyOnWriteArrayList) this.LIZJ).iterator();
        while (it.hasNext()) {
            ((HandlerThread) it.next()).quitSafely();
        }
        if (this.LJFF != null) {
            if (IXB.LIZ) {
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("release session pool:");
                LIZ2.append(((CopyOnWriteArrayList) this.LJFF).size());
                IXB.LIZIZ("PlaySessionManager", X1D.LIZIZ(LIZ2));
            }
            if (((CopyOnWriteArrayList) this.LJFF).size() > 0) {
                Iterator it2 = ((CopyOnWriteArrayList) this.LJFF).iterator();
                while (it2.hasNext()) {
                    ((IX7) it2.next()).LJFF();
                }
            }
            ((CopyOnWriteArrayList) this.LJFF).clear();
        }
        ((CopyOnWriteArrayList) this.LIZJ).clear();
        ((CopyOnWriteArrayList) this.LIZLLL).clear();
        ((CopyOnWriteArrayList) this.LJ).clear();
        this.LJIIIZ = true;
        this.LJIILL = System.currentTimeMillis();
        this.LJIJI = C16880lQ.LLLLIIIILLL().getName();
        this.LJJ.LIZ();
        C47002IcY c47002IcY = this.LJJ;
        c47002IcY.LJIIJJI = null;
        B93 b93 = C30591Hz.LJLIL;
        if (b93 == null) {
            return;
        }
        ((CopyOnWriteArrayList) ((B92) b93).LIZ).remove(c47002IcY.LJIIIZ);
    }

    @Override // X.IXC
    public final IX7 LIZIZ() {
        return this.LJI;
    }

    @Override // X.IXC
    public final void LIZ(ITX itx) {
        this.LJIIJJI = itx;
    }

    @Override // X.IXC
    public final void LJII(IWT iwt) {
        synchronized (this.LJJIII) {
            if (this.LJIJJLI) {
                return;
            }
            LJIIJJI();
            if (!this.LJJIFFI.LIZJ) {
                this.LJJII = iwt;
                Message obtain = Message.obtain();
                obtain.what = 1;
                obtain.obj = iwt;
                this.LJJIFFI.sendMessage(obtain);
            }
        }
    }

    public final void LJIILIIL(IX7 ix7) {
        List<IX7> list;
        if (ix7 == null || (list = this.LJFF) == null || list.contains(ix7)) {
            return;
        }
        if (this.LJFF.size() < this.LJIIL.LJFF) {
            this.LJFF.add(ix7);
            return;
        }
        ArrayList arrayList = new ArrayList(3);
        for (IX7 ix72 : this.LJFF) {
            if (ix72.LJIIJJI == ix7.LJIIJJI) {
                ix7.LJFF();
                return;
            } else {
                if (arrayList.contains(Integer.valueOf(ix72.LJIIJJI))) {
                    this.LJFF.remove(ix72);
                    ix72.LJFF();
                    this.LJFF.add(ix7);
                    return;
                }
                arrayList.add(Integer.valueOf(ix72.LJIIJJI));
            }
        }
        if (1 == this.LJFF.size()) {
            IX7 ix73 = (IX7) ListProtector.get(this.LJFF, 0);
            if (ix73 != null) {
                ix73.LJFF();
            }
            ListProtector.remove(this.LJFF, 0);
            this.LJFF.add(ix7);
            return;
        }
        ix7.LJFF();
    }

    public final boolean LJIILJJIL(IX7 ix7) {
        if (ix7 == null) {
            return false;
        }
        Object value = IZ8.LLLLZLL.getValue();
        o.LJIIIIZZ(value, "<get-ENGINE_REUSE_RESTRICT_DECODE_TYPE>(...)");
        if (((Boolean) value).booleanValue() && !ix7.LJIIL) {
            ix7.LJI();
            ix7.LJFF();
            return false;
        }
        if (IZ8.LJJIL().getDisableSRRecycle() && ix7.LJFF.LIZLLL()) {
            ix7.LJI();
            ix7.LJFF();
            return false;
        }
        IZ8.LJIL();
        if (this.LJIIL.LJIIJJI && ix7.LJIIJJI == 0) {
            ix7.LJI();
            ix7.LJFF();
            return false;
        }
        ((CopyOnWriteArrayList) this.LJFF).add(ix7);
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x00aa, code lost:
    
        if (r2 == null) goto L20;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00b2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.IX7 LJIILL(X.IX4 r13) {
        /*
            Method dump skipped, instructions count: 528
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C46998IcU.LJIILL(X.IX4):X.IX7");
    }

    public final boolean LJIIZILJ(IX7 ix7) {
        boolean z;
        boolean z2 = false;
        if (ix7 != null && !ix7.LJIIIIZZ && !ix7.LJIIIZ) {
            if (!this.LJIIJ) {
                return false;
            }
            this.LJIIL.getClass();
            C46999IcV c46999IcV = this.LJIIL;
            if (c46999IcV.LJIIIIZZ ? this.LJFF == null : this.LJIIIIZZ != null) {
                z = false;
            } else {
                z = true;
            }
            if (c46999IcV.LJII && this.LJFF != null && ix7.LJIIJJI == 0 && !((CopyOnWriteArrayList) this.LJFF).isEmpty()) {
                z = false;
            }
            if (this.LJIIL.LJIIJJI && ix7.LJIIJJI == 0) {
                z = false;
            }
            Object value = IZ8.LLLLZLL.getValue();
            o.LJIIIIZZ(value, "<get-ENGINE_REUSE_RESTRICT_DECODE_TYPE>(...)");
            if (((Boolean) value).booleanValue() && !ix7.LJIIL) {
                z = false;
            }
            if (!IZ8.LJJIL().getDisableSRRecycle() || !ix7.LJFF.LIZLLL()) {
                z2 = z;
            }
            IZ8.LJIL();
        }
        return z2;
    }

    @Override // X.IXC
    public final void setMute(boolean z) {
        IX7 ix7;
        this.LJJ.LIZJ = z;
        if (!z && (ix7 = this.LJI) != null) {
            if (ix7.LJFF.isPlaying() || this.LJI.LJFF.isLoading()) {
                LJ();
            }
        }
    }

    public C46998IcU(ITZ itz, C46999IcV c46999IcV) {
        this.LIZ = -1;
        this.LIZIZ = itz;
        this.LJIIL = c46999IcV;
        if (c46999IcV == null) {
            this.LJIIL = new C46999IcV();
        }
        C46999IcV c46999IcV2 = this.LJIIL;
        if (c46999IcV2.LIZIZ && c46999IcV2.LJFF > 0) {
            this.LJFF = new CopyOnWriteArrayList();
        }
        C46999IcV c46999IcV3 = this.LJIIL;
        if (c46999IcV3.LIZ) {
            c46999IcV3.LIZLLL = 1;
            c46999IcV3.LJ = 1;
        }
        if (c46999IcV3.LIZLLL == 1 && c46999IcV3.LJ == 1 && c46999IcV3.LIZIZ) {
            c46999IcV3.LJFF = 0;
        }
        if (c46999IcV.LIZLLL < 1) {
            c46999IcV.LIZLLL = 5;
        }
        int i = c46999IcV.LJ;
        int i2 = c46999IcV.LIZLLL;
        if (i > i2 || i < 1) {
            c46999IcV.LJ = i2;
        }
        if (c46999IcV3.LIZIZ) {
            int i3 = c46999IcV3.LJFF;
            int i4 = c46999IcV3.LJ;
            if (i3 > i4) {
                c46999IcV3.LJFF = i4;
            }
        }
        this.LJIIJ = c46999IcV3.LJI;
        this.LIZJ = new CopyOnWriteArrayList();
        this.LIZLLL = new CopyOnWriteArrayList();
        LJIILLIIL();
        int i5 = LJJIIJ + 1;
        LJJIIJ = i5;
        this.LIZ = i5;
        this.LJJ = new C47002IcY();
    }

    /* JADX WARN: Code restructure failed: missing block: B:111:0x018f, code lost:
    
        if (r2 != null) goto L84;
     */
    @Override // X.IXC
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZJ(X.IX4 r9, X.IVM r10) {
        /*
            Method dump skipped, instructions count: 446
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C46998IcU.LIZJ(X.IX4, X.IVM):void");
    }

    @Override // X.IXI
    public final void LJI(IX7 ix7, HandlerThread handlerThread) {
        Object valueOf;
        ((CopyOnWriteArrayList) this.LJ).remove(ix7);
        this.LJIJ = C16880lQ.LLLLIIIILLL().getName();
        this.LJIJJ = 0;
        if (IXB.LIZ) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("onSessionRelease session:");
            LIZ.append(ix7);
            LIZ.append(", idle size:");
            LIZ.append(((CopyOnWriteArrayList) this.LIZJ).size());
            LIZ.append(", working size:");
            LIZ.append(((CopyOnWriteArrayList) this.LIZLLL).size());
            LIZ.append(", session list size:");
            LIZ.append(((CopyOnWriteArrayList) this.LJ).size());
            LIZ.append(", session pool size:");
            List<IX7> list = this.LJFF;
            if (list == null) {
                valueOf = "null";
            } else {
                valueOf = Integer.valueOf(list.size());
            }
            LIZ.append(valueOf);
            IXB.LIZIZ("PlaySessionManager", X1D.LIZIZ(LIZ));
        }
        if (handlerThread.getLooper() == C16880lQ.LLJJJJ()) {
            ((CopyOnWriteArrayList) this.LIZLLL).removeAll(Collections.singleton(handlerThread));
            ((CopyOnWriteArrayList) this.LIZJ).removeAll(Collections.singleton(handlerThread));
            this.LJIIZILJ = handlerThread.toString();
            this.LJIILLIIL = System.currentTimeMillis();
            this.LJIJJ = 1;
            if (IXB.LIZ) {
                IXB.LIZLLL("PlaySessionManager", "onSessionRelease main looper thread");
                return;
            }
            return;
        }
        if (this.LJIIIZ) {
            handlerThread.quitSafely();
            this.LJIIZILJ = handlerThread.toString();
            this.LJIILLIIL = System.currentTimeMillis();
            this.LJIJJ = 2;
            ((CopyOnWriteArrayList) this.LIZLLL).clear();
            ((CopyOnWriteArrayList) this.LIZJ).clear();
            return;
        }
        Iterator it = ((CopyOnWriteArrayList) this.LJ).iterator();
        while (it.hasNext()) {
            if (((IX7) it.next()).LIZLLL == handlerThread) {
                return;
            }
        }
        if (((CopyOnWriteArrayList) this.LIZJ).size() < this.LJIIL.LJ) {
            if (!((CopyOnWriteArrayList) this.LIZJ).contains(handlerThread)) {
                ((CopyOnWriteArrayList) this.LIZJ).add(handlerThread);
            }
            ((CopyOnWriteArrayList) this.LIZLLL).removeAll(Collections.singleton(handlerThread));
            this.LJIIZILJ = handlerThread.toString();
            this.LJIILLIIL = System.currentTimeMillis();
            this.LJIJJ = 3;
            if (!IXB.LIZ) {
                return;
            }
            IXB.LIZIZ("PlaySessionManager", "onSessionRelease recycle to idle pool");
            return;
        }
        handlerThread.quitSafely();
        this.LJIIZILJ = handlerThread.toString();
        this.LJIILLIIL = System.currentTimeMillis();
        this.LJIJJ = 4;
        ((CopyOnWriteArrayList) this.LIZLLL).removeAll(Collections.singleton(handlerThread));
        ((CopyOnWriteArrayList) this.LIZJ).removeAll(Collections.singleton(handlerThread));
        if (!IXB.LIZ) {
            return;
        }
        IXB.LIZIZ("PlaySessionManager", "onSessionRelease quit thread");
    }

    @Override // X.IXC
    public final void LJIIIIZZ(IX4 ix4, IVM ivm) {
        synchronized (this.LJJIII) {
            if (this.LJIJJLI) {
                return;
            }
            LJIIJJI();
            if (!this.LJJIFFI.LIZJ) {
                Message obtain = Message.obtain();
                obtain.what = 2;
                ix4.LIZ = ivm;
                obtain.obj = ix4;
                this.LJJIFFI.sendMessage(obtain);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:197:0x04fc, code lost:
    
        r9 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:287:0x0746, code lost:
    
        if (r1.LJIIIZ == false) goto L329;
     */
    /* JADX WARN: Removed duplicated region for block: B:102:0x02cd  */
    /* JADX WARN: Removed duplicated region for block: B:104:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0259  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x02a7 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:99:0x02c2  */
    @Override // X.IXC
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJFF(X.IX4 r12, com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener r13, X.IVM r14) {
        /*
            Method dump skipped, instructions count: 1912
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C46998IcU.LJFF(X.IX4, com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener, X.IVM):void");
    }
}

package X;

import Y.IDRunnableS6S0101000;
import android.view.Choreographer;
import android.view.View;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.8et, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C216678et implements InterfaceC217018fR, InterfaceC216998fP {
    public final C216758f1 LIZ;
    public C216478eZ LIZIZ;
    public final C216298eH LIZJ;
    public final List<InterfaceC216998fP> LIZLLL;
    public final List<InterfaceC215738dN> LJ;
    public final C216748f0 LJFF;
    public final QM9 LJI;
    public final C216718ex LJII;
    public boolean LJIIIIZZ;
    public boolean LJIIIZ;
    public WeakReference<View> LJIIJ;
    public long LJIIJJI;
    public final ChoreographerFrameCallbackC216698ev LJIIL;

    public final void LJFF() {
        View view;
        int i = C217028fS.LIZ;
        LJIIIZ();
        LJII();
        WeakReference<View> weakReference = this.LJIIJ;
        if (weakReference == null || (view = weakReference.get()) == null) {
            return;
        }
        view.postInvalidateOnAnimation();
    }

    public final void LJIIIZ() {
        this.LJIIJJI = 0L;
        C16880lQ.LLIIIJ().removeFrameCallback(this.LJIIL);
    }

    /* JADX WARN: Type inference failed for: r0v8, types: [X.8ev] */
    public C216678et() {
        C216758f1 c216758f1 = new C216758f1();
        ((ArrayList) c216758f1.LIZ).add(this);
        this.LIZ = c216758f1;
        this.LIZJ = new C216298eH(this);
        ArrayList arrayList = new ArrayList();
        this.LIZLLL = arrayList;
        this.LJ = new ArrayList();
        this.LJFF = new C216748f0(this);
        this.LJI = new QM9(0);
        this.LJII = new C216718ex(c216758f1);
        this.LJIIIZ = true;
        arrayList.add(this);
        this.LJIIL = new Choreographer.FrameCallback() { // from class: X.8ev
            /* JADX WARN: Type inference failed for: r10v6, types: [X.8dp, T extends X.8dp] */
            @Override // android.view.Choreographer.FrameCallback
            public final void doFrame(long j) {
                boolean z;
                WeakReference<View> weakReference;
                View view;
                C216678et this$0 = C216678et.this;
                o.LJIIIZ(this$0, "this$0");
                C216718ex c216718ex = this$0.LJII;
                long[] jArr = {this$0.LJIIJJI, System.nanoTime()};
                c216718ex.getClass();
                if (jArr[0] > 0) {
                    c216718ex.LIZ.LJIIIIZZ.getClass();
                }
                this$0.LJIIJJI = System.nanoTime();
                if (!this$0.LJIIIIZZ) {
                    return;
                }
                long LIZJ = this$0.LIZJ.LIZJ();
                long nanoTime = System.nanoTime();
                C216298eH c216298eH = this$0.LIZJ;
                c216298eH.LIZIZ.clear();
                if (c216298eH.LJ) {
                    c216298eH.LIZIZ.addAll(c216298eH.LIZJ);
                    c216298eH.LIZJ.clear();
                }
                while (true) {
                    int i = c216298eH.LJFF;
                    if (i < 0 || i >= c216298eH.LIZ.size()) {
                        break;
                    }
                    AbstractC216018dp abstractC216018dp = c216298eH.LIZ.get(c216298eH.LJFF);
                    o.LJIIIIZZ(abstractC216018dp, "mList[mCurrentIndex]");
                    AbstractC216018dp abstractC216018dp2 = abstractC216018dp;
                    if (abstractC216018dp2.LIZJ > c216298eH.LJIIIIZZ) {
                        break;
                    }
                    c216298eH.LIZIZ.add(abstractC216018dp2);
                    c216298eH.LJFF++;
                }
                LinkedList<AbstractC216018dp> items = c216298eH.LIZIZ;
                long nanoTime2 = System.nanoTime();
                C216748f0 c216748f0 = this$0.LJFF;
                c216748f0.getClass();
                o.LJIIIZ(items, "items");
                Iterator<InterfaceC216738ez> it = c216748f0.LIZIZ.iterator();
                while (it.hasNext()) {
                    InterfaceC216738ez layer = it.next();
                    ArrayList arrayList2 = new ArrayList();
                    Iterator<AbstractC216018dp> it2 = items.iterator();
                    while (it2.hasNext()) {
                        AbstractC216018dp next = it2.next();
                        if (next.LJIIIIZZ() == layer.getLayerType()) {
                            arrayList2.add(next);
                        }
                    }
                    if (!arrayList2.isEmpty()) {
                        ArrayList arrayList3 = new ArrayList(C32I.LJJL(arrayList2, 10));
                        Iterator it3 = arrayList2.iterator();
                        while (it3.hasNext()) {
                            ?? r10 = (T) it3.next();
                            o.LJIIIIZZ(layer, "layer");
                            C216768f2 c216768f2 = c216748f0.LIZJ;
                            int LJII = r10.LJII();
                            if (LJII != 1000) {
                                C1UB<AbstractC216708ew<AbstractC216018dp>> LJ = c216768f2.LIZ.LJ(LJII, null);
                                if (LJ == null) {
                                    LJ = new C1UB<>(8);
                                    c216768f2.LIZ.LJI(LJII, LJ);
                                }
                                AbstractC216708ew<? extends AbstractC216018dp> LIZIZ = LJ.LIZIZ();
                                if (LIZIZ == null) {
                                    LIZIZ = null;
                                    InterfaceC216878fD LJ2 = c216768f2.LIZIZ.LJ(LJII, null);
                                    if (LJ2 != null) {
                                        LIZIZ = LJ2.LIZ();
                                    }
                                    if (!(LIZIZ instanceof AbstractC216708ew) || LIZIZ == null) {
                                        throw new IllegalArgumentException(C0NY.LIZIZ("Unknown drawType=", LJII, ", did you forget to register your custom DanmakuFactory?"));
                                    }
                                }
                                LIZIZ.LJFF = layer.LJII();
                                LIZIZ.LIZ = r10;
                                LIZIZ.LJI(r10);
                                LIZIZ.LJFF(c216748f0.LIZ.LIZ);
                                arrayList3.add(LIZIZ);
                            } else {
                                c216768f2.getClass();
                                throw new IllegalArgumentException("drawType is DRAW_TYPE_UNDEFINE! Did you forget to define the drawType in your custom DanmakuData?");
                            }
                        }
                        layer.LJIIIIZZ(LIZJ, arrayList3);
                    }
                }
                long nanoTime3 = System.nanoTime();
                int LIZLLL = this$0.LJFF.LIZLLL(LIZJ, true, false);
                long nanoTime4 = System.nanoTime();
                C216718ex c216718ex2 = this$0.LJII;
                long[] jArr2 = {nanoTime, nanoTime2, nanoTime3, nanoTime4};
                c216718ex2.getClass();
                int i2 = C217028fS.LIZ;
                if (i2 <= 2) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    StringBuilder LJ3 = C7MY.LJ("compute(): typesettingCount=", LIZLLL, "all=");
                    LJ3.append((Object) c216718ex2.LIZIZ.format(jArr2[3] - jArr2[0]));
                    LJ3.append(", query=");
                    LJ3.append((Object) c216718ex2.LIZIZ.format(jArr2[1] - jArr2[0]));
                    LJ3.append(", add=");
                    LJ3.append((Object) c216718ex2.LIZIZ.format(jArr2[2] - jArr2[1]));
                    LJ3.append(", typesetting=");
                    LJ3.append((Object) c216718ex2.LIZIZ.format(jArr2[3] - jArr2[2]));
                    String msg = X1D.LIZIZ(LJ3);
                    o.LJIIIZ(msg, "msg");
                }
                c216718ex2.LIZLLL = ((float) (jArr2[3] - jArr2[0])) / 1000000;
                c216718ex2.LIZ.LJIIIIZZ.getClass();
                if (i2 <= 5 && c216718ex2.LIZLLL > 8.0f) {
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("The time cost of the DanmakuView's draw() method is more than 8ms(");
                    LIZ.append((Object) c216718ex2.LIZJ.format(Float.valueOf(c216718ex2.LIZLLL)));
                    LIZ.append("), it may cause performance issues!");
                    String msg2 = X1D.LIZIZ(LIZ);
                    o.LJIIIZ(msg2, "msg");
                }
                if (!this$0.LJIIIIZZ) {
                    return;
                }
                if (!this$0.LIZ.LIZJ.LJII) {
                    this$0.LJII();
                    return;
                }
                if (LIZLLL > 0) {
                    this$0.LJII();
                    return;
                }
                C216298eH c216298eH2 = this$0.LIZJ;
                if (c216298eH2.LIZ.size() - c216298eH2.LJFF <= 0) {
                    return;
                }
                long LIZ2 = this$0.LIZJ.LIZ();
                int i3 = this$0.LIZ.LIZJ.LIZJ;
                if (i3 > 0) {
                    LIZ2 = (LIZ2 * 100) / i3;
                }
                if (0 <= LIZ2 && LIZ2 <= 160) {
                    this$0.LJII();
                } else {
                    if (LIZ2 < 0 || (weakReference = this$0.LJIIJ) == null || (view = weakReference.get()) == null) {
                        return;
                    }
                    view.postDelayed(new IDRunnableS6S0101000(3, this$0, 5), LIZ2 - 80);
                }
            }
        };
    }

    public final void LJII() {
        C16880lQ.LLIIIJ().postFrameCallback(this.LJIIL);
    }

    public static void LIZJ(C216678et c216678et) {
        c216678et.LJFF.LIZ(1000, null);
        c216678et.LJFF();
    }

    public final void LIZ(AbstractC216018dp data) {
        o.LJIIIZ(data, "data");
        C216298eH c216298eH = this.LIZJ;
        c216298eH.getClass();
        c216298eH.LIZJ.add(data);
        if (this.LIZ.LIZJ.LJII) {
            LJFF();
        }
    }

    @Override // X.InterfaceC216998fP
    public final void LIZIZ(C216948fK c216948fK) {
        View view;
        View view2;
        Boolean bool;
        switch (c216948fK.LIZ) {
            case 1000:
                Object obj = c216948fK.LIZJ;
                if (!(obj instanceof Boolean) || (bool = (Boolean) obj) == null) {
                    return;
                }
                this.LJIIIZ = bool.booleanValue();
                return;
            case 1001:
                WeakReference<View> weakReference = this.LJIIJ;
                if (weakReference == null || (view2 = weakReference.get()) == null) {
                    return;
                }
                view2.postInvalidateOnAnimation();
                return;
            case 1002:
                WeakReference<View> weakReference2 = this.LJIIJ;
                if (weakReference2 == null || (view = weakReference2.get()) == null) {
                    return;
                }
                view.postInvalidateOnAnimation();
                return;
            default:
                return;
        }
    }

    @Override // X.InterfaceC217018fR
    public final void LIZLLL(int i) {
        View view;
        View view2;
        if (i != 1100) {
            if (i != 1101) {
                if (i != 1103) {
                    if (i != 1104) {
                        if (i == 1200) {
                            this.LJFF.LIZLLL(this.LIZJ.LIZJ(), this.LJIIIIZZ, true);
                        }
                    } else if (!this.LIZ.LIZJ.LJI) {
                        this.LJFF.LIZ(1003, null);
                    }
                } else if (!this.LIZ.LIZJ.LJFF) {
                    this.LJFF.LIZ(1002, null);
                }
            } else {
                C216298eH c216298eH = this.LIZJ;
                c216298eH.LJI = c216298eH.LJIIIIZZ;
                c216298eH.LJII = System.currentTimeMillis();
            }
        } else {
            WeakReference<View> weakReference = this.LJIIJ;
            if (weakReference != null && (view = weakReference.get()) != null) {
                view.setAlpha(this.LIZ.LIZJ.LIZIZ / 255.0f);
            }
        }
        WeakReference<View> weakReference2 = this.LJIIJ;
        if (weakReference2 == null || (view2 = weakReference2.get()) == null) {
            return;
        }
        view2.postInvalidateOnAnimation();
    }

    public final void LJI(C216958fL c216958fL) {
        Iterator it = ((ArrayList) this.LJ).iterator();
        while (it.hasNext()) {
            ((InterfaceC215738dN) it.next()).onEvent(c216958fL);
        }
        c216958fL.LIZ = 0;
        c216958fL.LIZIZ = null;
        try {
            C216828f8.LIZ.LIZ(c216958fL);
        } catch (IllegalStateException unused) {
        }
    }

    public final void LJIIIIZZ(long j) {
        View view;
        if (this.LJIIIIZZ) {
            return;
        }
        this.LJIIIIZZ = true;
        this.LIZJ.LIZIZ(j);
        LJIIIZ();
        LJII();
        WeakReference<View> weakReference = this.LJIIJ;
        if (weakReference == null || (view = weakReference.get()) == null) {
            return;
        }
        view.postInvalidateOnAnimation();
    }

    public final void LJIIJ(AbstractC216668es abstractC216668es) {
        ((ArrayList) this.LIZLLL).remove(abstractC216668es);
    }

    public static void LJ(C216678et c216678et, int i, AbstractC216018dp abstractC216018dp) {
        C216948fK c216948fK = new C216948fK(i, abstractC216018dp, null);
        Iterator it = ((ArrayList) c216678et.LIZLLL).iterator();
        while (it.hasNext()) {
            ((InterfaceC216998fP) it.next()).LIZIZ(c216948fK);
        }
    }
}

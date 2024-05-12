package X;

import Y.IDBReceiverS8S0100000_8;
import android.content.IntentFilter;
import android.view.View;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.UUID;

/* renamed from: X.NQz, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C59349NQz extends NR2 {
    public final InterfaceC59388NSm LIZ;
    public WeakReference<View> LIZIZ;
    public final ArrayList<WeakReference<View>> LIZJ = new ArrayList<>();
    public boolean LIZLLL = false;
    public boolean LJ = false;
    public boolean LJFF = false;
    public final String LJI = UUID.randomUUID().toString();
    public long LJII;

    @Override // X.NR2
    public final void LIZIZ() {
        if (this.LJ) {
            return;
        }
        LJI();
        this.LJ = true;
        this.LIZIZ.clear();
        LIZLLL();
        NR0 nr0 = NR0.LIZLLL;
        boolean isEmpty = true ^ nr0.LIZIZ.isEmpty();
        nr0.LIZ.remove(this);
        nr0.LIZIZ.remove(this);
        if (isEmpty && nr0.LIZIZ.isEmpty()) {
            C59881Nen.LJ.LIZIZ();
            C59327NQd c59327NQd = C59327NQd.LJ;
            if (c59327NQd.LIZ.get() != null && c59327NQd.LIZIZ != null) {
                C16880lQ.LJJLIIIJL(c59327NQd.LIZ.get(), c59327NQd.LIZIZ);
                c59327NQd.LIZIZ = null;
            }
            c59327NQd.LIZJ = false;
            c59327NQd.LIZLLL = false;
        }
    }

    @Override // X.NR2
    public final void LIZLLL() {
        if (this.LJ) {
            return;
        }
        this.LIZJ.clear();
    }

    @Override // X.NR2
    public final void LJFF() {
        if (this.LIZLLL) {
            return;
        }
        this.LIZLLL = true;
        this.LJFF = false;
        this.LJII = System.nanoTime();
        NR0 nr0 = NR0.LIZLLL;
        boolean z = !nr0.LIZIZ.isEmpty();
        nr0.LIZIZ.add(this);
        if (!z) {
            C59881Nen.LJ.LIZ();
            C59327NQd c59327NQd = C59327NQd.LJ;
            c59327NQd.LIZIZ = new IDBReceiverS8S0100000_8(7);
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.SCREEN_OFF");
            intentFilter.addAction("android.intent.action.SCREEN_ON");
            intentFilter.addAction("android.intent.action.USER_PRESENT");
            if (c59327NQd.LIZ.get() != null) {
                C16880lQ.LJJLIIIJILLIZJL(c59327NQd.LIZIZ, c59327NQd.LIZ.get(), intentFilter);
            }
            c59327NQd.LIZJ = true;
        }
    }

    public final void LJI() {
        if (!this.LJFF) {
            C40445Fu5 c40445Fu5 = C40445Fu5.LIZIZ;
            String str = this.LJI;
            long j = this.LJII;
            ArrayList<C40449Fu9> arrayList = c40445Fu5.LIZ.get(str);
            if (arrayList != null && !arrayList.isEmpty()) {
                long max = Math.max(j, ((C40449Fu9) ListProtector.get(arrayList, 0)).LIZ);
                Iterator<C40449Fu9> it = arrayList.iterator();
                loop0: while (true) {
                    long j2 = 0;
                    boolean z = true;
                    while (true) {
                        if (!it.hasNext()) {
                            break loop0;
                        }
                        C40449Fu9 next = it.next();
                        long j3 = next.LIZ;
                        if (max <= j3) {
                            if (next.LIZIZ >= 0.5f) {
                                if (z) {
                                    max = j3;
                                    z = false;
                                }
                                j2 += j3 - max;
                                if (j2 >= 2000000000) {
                                    if (!this.LJFF) {
                                        this.LJFF = true;
                                        this.LIZ.LIZ();
                                    }
                                } else {
                                    max = j3;
                                }
                            }
                        }
                    }
                }
            }
        }
        this.LJII = Long.MAX_VALUE;
    }

    public C59349NQz(InterfaceC59388NSm interfaceC59388NSm) {
        this.LIZIZ = new WeakReference<>(null);
        this.LIZ = interfaceC59388NSm;
        this.LIZIZ = new WeakReference<>(null);
        NR0.LIZLLL.LIZ.add(this);
    }

    @Override // X.NR2
    public final void LIZ(View view) {
        if (this.LJ || view == null) {
            return;
        }
        Iterator<WeakReference<View>> it = this.LIZJ.iterator();
        while (it.hasNext()) {
            if (it.next().get() == view) {
                return;
            }
        }
        this.LIZJ.add(new WeakReference<>(view));
    }

    @Override // X.NR2
    public final void LIZJ(View view) {
        if (this.LJ || view == null || this.LIZIZ.get() == view) {
            return;
        }
        this.LIZIZ = new WeakReference<>(view);
        Iterator<C59349NQz> it = NR0.LIZLLL.LIZ.iterator();
        while (it.hasNext()) {
            C59349NQz next = it.next();
            if (next != this && next.LIZIZ.get() == view) {
                next.LIZIZ.clear();
            }
        }
    }

    @Override // X.NR2
    public final void LJ(View view) {
        if (this.LJ || view == null) {
            return;
        }
        Iterator<WeakReference<View>> it = this.LIZJ.iterator();
        WeakReference<View> weakReference = null;
        while (it.hasNext()) {
            WeakReference<View> next = it.next();
            if (next.get() == view) {
                weakReference = next;
            }
        }
        this.LIZJ.remove(weakReference);
    }
}

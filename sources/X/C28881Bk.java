package X;

import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.1Bk, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C28881Bk implements C0AP {
    public final C28871Bj LIZ;
    public final C0B9 LIZIZ;
    public final List<WeakReference<RecyclerView>> LIZJ = new ArrayList();
    public final IdentityHashMap<RecyclerView.ViewHolder, C0AQ> LIZLLL = new IdentityHashMap<>();
    public final List<C0AQ> LJ = new ArrayList();
    public C03060Ac LJFF = new C03060Ac();
    public final C0AZ LJI;
    public final InterfaceC03220As LJII;

    public final void LIZIZ() {
        EnumC029309p enumC029309p;
        Iterator it = ((ArrayList) this.LJ).iterator();
        while (true) {
            if (it.hasNext()) {
                C0AQ c0aq = (C0AQ) it.next();
                EnumC029309p enumC029309p2 = c0aq.LIZJ.mStateRestorationPolicy;
                enumC029309p = EnumC029309p.PREVENT;
                if (enumC029309p2 == enumC029309p || (enumC029309p2 == EnumC029309p.PREVENT_WHEN_EMPTY && c0aq.LJ == 0)) {
                    break;
                }
            } else {
                enumC029309p = EnumC029309p.ALLOW;
                break;
            }
        }
        C28871Bj c28871Bj = this.LIZ;
        if (enumC029309p != c28871Bj.mStateRestorationPolicy) {
            c28871Bj.LJZ(enumC029309p);
        }
    }

    public final int LIZJ(C0AQ c0aq) {
        C0AQ c0aq2;
        Iterator it = ((ArrayList) this.LJ).iterator();
        int i = 0;
        while (it.hasNext() && (c0aq2 = (C0AQ) it.next()) != c0aq) {
            i += c0aq2.LJ;
        }
        return i;
    }

    public final C03060Ac LIZLLL(int i) {
        C03060Ac c03060Ac = this.LJFF;
        if (c03060Ac.LIZJ) {
            c03060Ac = new C03060Ac();
        } else {
            c03060Ac.LIZJ = true;
        }
        Iterator it = ((ArrayList) this.LJ).iterator();
        int i2 = i;
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            C0AQ c0aq = (C0AQ) it.next();
            int i3 = c0aq.LJ;
            if (i3 > i2) {
                c03060Ac.LIZ = c0aq;
                c03060Ac.LIZIZ = i2;
                break;
            }
            i2 -= i3;
        }
        if (c03060Ac.LIZ != null) {
            return c03060Ac;
        }
        throw new IllegalArgumentException(KMP.LJ("Cannot find wrapper for ", i));
    }

    public final C0AQ LJ(RecyclerView.ViewHolder viewHolder) {
        C0AQ c0aq = this.LIZLLL.get(viewHolder);
        if (c0aq != null) {
            return c0aq;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Cannot find wrapper for ");
        LIZ.append(viewHolder);
        LIZ.append(", seems like it is not bound by this adapter: ");
        LIZ.append(this);
        throw new IllegalStateException(X1D.LIZIZ(LIZ));
    }

    public final int LJFF(AbstractC029409q<RecyclerView.ViewHolder> abstractC029409q) {
        int size = ((ArrayList) this.LJ).size();
        for (int i = 0; i < size; i++) {
            if (((C0AQ) ListProtector.get(this.LJ, i)).LIZJ == abstractC029409q) {
                return i;
            }
        }
        return -1;
    }

    public C28881Bk(C28871Bj c28871Bj, C03040Aa c03040Aa) {
        this.LIZ = c28871Bj;
        if (c03040Aa.LIZ) {
            this.LIZIZ = new C1C5();
        } else {
            this.LIZIZ = new C1C7();
        }
        C0AZ c0az = c03040Aa.LIZIZ;
        this.LJI = c0az;
        if (c0az == C0AZ.NO_STABLE_IDS) {
            this.LJII = new InterfaceC03220As() { // from class: X.1Bv
                public final C28981Bu LIZ = new InterfaceC03210Ar() { // from class: X.1Bu
                    @Override // X.InterfaceC03210Ar
                    public final long LIZ(long j) {
                        return -1L;
                    }
                };

                @Override // X.InterfaceC03220As
                public final InterfaceC03210Ar LIZ() {
                    return this.LIZ;
                }
            };
        } else if (c0az == C0AZ.ISOLATED_STABLE_IDS) {
            this.LJII = new C28971Bt();
        } else {
            if (c0az == C0AZ.SHARED_STABLE_IDS) {
                this.LJII = new InterfaceC03220As() { // from class: X.1Bx
                    public final C29001Bw LIZ = new InterfaceC03210Ar() { // from class: X.1Bw
                        @Override // X.InterfaceC03210Ar
                        public final long LIZ(long j) {
                            return j;
                        }
                    };

                    @Override // X.InterfaceC03220As
                    public final InterfaceC03210Ar LIZ() {
                        return this.LIZ;
                    }
                };
                return;
            }
            throw new IllegalArgumentException("unknown stable id mode");
        }
    }

    public final boolean LIZ(int i, AbstractC029409q<RecyclerView.ViewHolder> abstractC029409q) {
        if (i >= 0 && i <= ((ArrayList) this.LJ).size()) {
            if (this.LJI != C0AZ.NO_STABLE_IDS) {
                TMC.LJI("All sub adapters must have stable ids when stable id mode is ISOLATED_STABLE_IDS or SHARED_STABLE_IDS", abstractC029409q.mHasStableIds);
            }
            int LJFF = LJFF(abstractC029409q);
            if (LJFF != -1 && ListProtector.get(this.LJ, LJFF) != null) {
                return false;
            }
            C0AQ c0aq = new C0AQ(abstractC029409q, this, this.LIZIZ, this.LJII.LIZ());
            ListProtector.add(this.LJ, i, c0aq);
            Iterator it = ((ArrayList) this.LIZJ).iterator();
            while (it.hasNext()) {
                RecyclerView recyclerView = (RecyclerView) ((Reference) it.next()).get();
                if (recyclerView != null) {
                    abstractC029409q.onAttachedToRecyclerView(recyclerView);
                }
            }
            if (c0aq.LJ > 0) {
                this.LIZ.notifyItemRangeInserted(LIZJ(c0aq), c0aq.LJ);
            }
            LIZIZ();
            return true;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Index must be between 0 and ");
        LIZ.append(((ArrayList) this.LJ).size());
        LIZ.append(". Given:");
        LIZ.append(i);
        throw new IndexOutOfBoundsException(X1D.LIZIZ(LIZ));
    }
}

package X;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.WeakHashMap;
import kotlin.jvm.internal.o;
import o3.h0;

/* renamed from: X.0A7, reason: invalid class name */
/* loaded from: classes.dex */
public final class C0A7 {
    public final ArrayList<RecyclerView.ViewHolder> LIZ;
    public ArrayList<RecyclerView.ViewHolder> LIZIZ;
    public final ArrayList<RecyclerView.ViewHolder> LIZJ;
    public final List<RecyclerView.ViewHolder> LIZLLL;
    public int LJ;
    public int LJFF;
    public RecyclerView.RecycledViewPool LJI;
    public C0AD LJII;
    public final /* synthetic */ RecyclerView LJIIIIZZ;

    public final void LIZJ() {
        this.LIZ.clear();
        LJI();
    }

    public final RecyclerView.RecycledViewPool LJ() {
        if (this.LJI == null) {
            this.LJI = new RecyclerView.RecycledViewPool();
        }
        return this.LJI;
    }

    public final void LJI() {
        for (int size = this.LIZJ.size() - 1; size >= 0; size--) {
            LJII(size);
        }
        this.LIZJ.clear();
        if (RecyclerView.LLJZ) {
            C1C0 c1c0 = this.LJIIIIZZ.LLJI;
            int[] iArr = c1c0.LIZJ;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            c1c0.LIZLLL = 0;
        }
    }

    public final void LJIILIIL() {
        int i;
        C0A2 c0a2 = this.LJIIIIZZ.LJLLJ;
        if (c0a2 != null) {
            i = c0a2.LJLLI;
        } else {
            i = 0;
        }
        this.LJFF = this.LJ + i;
        for (int size = this.LIZJ.size() - 1; size >= 0 && this.LIZJ.size() > this.LJFF; size--) {
            LJII(size);
        }
    }

    public C0A7(RecyclerView recyclerView) {
        this.LJIIIIZZ = recyclerView;
        ArrayList<RecyclerView.ViewHolder> arrayList = new ArrayList<>();
        this.LIZ = arrayList;
        this.LIZIZ = null;
        this.LIZJ = new ArrayList<>();
        this.LIZLLL = Collections.unmodifiableList(arrayList);
        this.LJ = 2;
        this.LJFF = 2;
    }

    public final int LIZLLL(int i) {
        if (i >= 0 && i < this.LJIIIIZZ.LLJIJIL.LIZIZ()) {
            RecyclerView recyclerView = this.LJIIIIZZ;
            if (!recyclerView.LLJIJIL.LJI) {
                return i;
            }
            return recyclerView.LJLJJI.LJFF(i, 0);
        }
        StringBuilder LJ = C7MY.LJ("invalid position ", i, ". State item count is ");
        LJ.append(this.LJIIIIZZ.LLJIJIL.LIZIZ());
        LJ.append(this.LJIIIIZZ.LJJIIZ());
        throw new IndexOutOfBoundsException(X1D.LIZIZ(LJ));
    }

    public final View LJFF(int i) {
        return LJIIJJI(i, Long.MAX_VALUE).itemView;
    }

    public final void LJII(int i) {
        LIZ((RecyclerView.ViewHolder) ListProtector.get(this.LIZJ, i), true);
        ListProtector.remove(this.LIZJ, i);
    }

    public final void LJIIIIZZ(View view) {
        RecyclerView.ViewHolder LJJJJL = RecyclerView.LJJJJL(view);
        if (LJJJJL.isTmpDetached()) {
            this.LJIIIIZZ.removeDetachedView(view, false);
        }
        if (LJJJJL.isScrap()) {
            LJJJJL.unScrap();
        } else if (LJJJJL.wasReturnedFromScrap()) {
            LJJJJL.clearReturnedFromScrapFlag();
        }
        LJIIIZ(LJJJJL);
        if (this.LJIIIIZZ.LLIIL != null && !LJJJJL.isRecyclable()) {
            this.LJIIIIZZ.LLIIL.LJIIIZ(LJJJJL);
        }
    }

    public final void LJIIIZ(RecyclerView.ViewHolder viewHolder) {
        boolean z;
        boolean z2 = false;
        if (viewHolder.isScrap() || viewHolder.itemView.getParent() != null) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("Scrapped or attached views may not be recycled. isScrap:");
            LIZ.append(viewHolder.isScrap());
            LIZ.append(" isAttached:");
            if (viewHolder.itemView.getParent() != null) {
                z2 = true;
            }
            LIZ.append(z2);
            LIZ.append(this.LJIIIIZZ.LJJIIZ());
            throw new IllegalArgumentException(X1D.LIZIZ(LIZ));
        }
        if (!viewHolder.isTmpDetached()) {
            if (!viewHolder.shouldIgnore()) {
                boolean doesTransientStatePreventRecycling = viewHolder.doesTransientStatePreventRecycling();
                AbstractC029409q abstractC029409q = this.LJIIIIZZ.LJLLILLLL;
                if ((abstractC029409q != null && doesTransientStatePreventRecycling && abstractC029409q.onFailedToRecycleView(viewHolder)) || viewHolder.isRecyclable()) {
                    if (this.LJFF > 0 && !viewHolder.hasAnyOfTheFlags(526)) {
                        int size = this.LIZJ.size();
                        if (size >= this.LJFF && size > 0) {
                            LJII(0);
                            size--;
                        }
                        if (RecyclerView.LLJZ && size > 0) {
                            C1C0 c1c0 = this.LJIIIIZZ.LLJI;
                            int i = viewHolder.mPosition;
                            if (c1c0.LIZJ != null) {
                                int i2 = c1c0.LIZLLL * 2;
                                for (int i3 = 0; i3 < i2; i3 += 2) {
                                    if (c1c0.LIZJ[i3] == i) {
                                        break;
                                    }
                                }
                            }
                            loop1: while (true) {
                                size--;
                                if (size < 0) {
                                    break;
                                }
                                int i4 = ((RecyclerView.ViewHolder) ListProtector.get(this.LIZJ, size)).mPosition;
                                C1C0 c1c02 = this.LJIIIIZZ.LLJI;
                                if (c1c02.LIZJ == null) {
                                    break;
                                }
                                int i5 = c1c02.LIZLLL * 2;
                                for (int i6 = 0; i6 < i5; i6 += 2) {
                                    if (c1c02.LIZJ[i6] == i4) {
                                        break;
                                    }
                                }
                                break loop1;
                            }
                            size++;
                        }
                        ListProtector.add(this.LIZJ, size, viewHolder);
                        z = true;
                    } else {
                        z = false;
                        LIZ(viewHolder, true);
                        z2 = true;
                    }
                } else {
                    z = false;
                }
                this.LJIIIIZZ.LJLJJLL.LJ(viewHolder);
                if (!z && !z2 && doesTransientStatePreventRecycling) {
                    viewHolder.mBindingAdapter = null;
                    viewHolder.mOwnerRecyclerView = null;
                    return;
                }
                return;
            }
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("Trying to recycle an ignored view holder. You should first call stopIgnoringView(view) before calling recycle.");
            LIZ2.append(this.LJIIIIZZ.LJJIIZ());
            throw new IllegalArgumentException(X1D.LIZIZ(LIZ2));
        }
        StringBuilder LIZ3 = X1D.LIZ();
        LIZ3.append("Tmp detached view should be removed from RecyclerView before it can be recycled: ");
        LIZ3.append(viewHolder);
        LIZ3.append(this.LJIIIIZZ.LJJIIZ());
        throw new IllegalArgumentException(X1D.LIZIZ(LIZ3));
    }

    public final void LJIIJ(View view) {
        AbstractC030109x abstractC030109x;
        RecyclerView.ViewHolder LJJJJL = RecyclerView.LJJJJL(view);
        if (LJJJJL.hasAnyOfTheFlags(12) || !LJJJJL.isUpdated() || (abstractC030109x = this.LJIIIIZZ.LLIIL) == null || abstractC030109x.LJI(LJJJJL, LJJJJL.getUnmodifiedPayloads())) {
            if (!LJJJJL.isInvalid() || LJJJJL.isRemoved() || this.LJIIIIZZ.LJLLILLLL.mHasStableIds) {
                LJJJJL.setScrapContainer(this, false);
                this.LIZ.add(LJJJJL);
                return;
            } else {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("Called scrap view with an invalid view. Invalid views cannot be reused from scrap, they should rebound from recycler pool.");
                LIZ.append(this.LJIIIIZZ.LJJIIZ());
                throw new IllegalArgumentException(X1D.LIZIZ(LIZ));
            }
        }
        if (this.LIZIZ == null) {
            this.LIZIZ = new ArrayList<>();
        }
        LJJJJL.setScrapContainer(this, true);
        this.LIZIZ.add(LJJJJL);
    }

    public final void LJIIL(RecyclerView.ViewHolder viewHolder) {
        if (viewHolder.mInChangeScrap) {
            this.LIZIZ.remove(viewHolder);
        } else {
            this.LIZ.remove(viewHolder);
        }
        viewHolder.mScrapContainer = null;
        viewHolder.mInChangeScrap = false;
        viewHolder.clearReturnedFromScrapFlag();
    }

    public final void LIZ(RecyclerView.ViewHolder viewHolder, boolean z) {
        C16120kC c16120kC;
        RecyclerView.LJIILIIL(viewHolder);
        View view = viewHolder.itemView;
        C28921Bo c28921Bo = this.LJIIIIZZ.LLJJIJI;
        if (c28921Bo != null) {
            C28911Bn c28911Bn = c28921Bo.LIZIZ;
            if (c28911Bn instanceof C28911Bn) {
                c16120kC = (C16120kC) ((WeakHashMap) c28911Bn.LIZIZ).remove(view);
            } else {
                c16120kC = null;
            }
            h0.LJIJI(view, c16120kC);
        }
        if (z) {
            C0A8 c0a8 = this.LJIIIIZZ.LJLLL;
            if (c0a8 != null) {
                c0a8.LIZ(viewHolder);
            }
            int size = ((ArrayList) this.LJIIIIZZ.LJLLLL).size();
            for (int i = 0; i < size; i++) {
                ((C0A8) ListProtector.get(this.LJIIIIZZ.LJLLLL, i)).LIZ(viewHolder);
            }
            AbstractC029409q abstractC029409q = this.LJIIIIZZ.LJLLILLLL;
            if (abstractC029409q != null) {
                abstractC029409q.onViewRecycled(viewHolder);
            }
            RecyclerView recyclerView = this.LJIIIIZZ;
            if (recyclerView.LLJIJIL != null) {
                recyclerView.LJLJJLL.LJ(viewHolder);
            }
        }
        viewHolder.mBindingAdapter = null;
        viewHolder.mOwnerRecyclerView = null;
        LJ().putRecycledView(viewHolder);
    }

    /* JADX WARN: Code restructure failed: missing block: B:147:0x020e, code lost:
    
        if (r1 != null) goto L118;
     */
    /* JADX WARN: Code restructure failed: missing block: B:198:0x006c, code lost:
    
        if (r25.LJIIIIZZ.LLJIJIL.LJI == false) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:199:0x006e, code lost:
    
        r3.addFlags(4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:200:0x0076, code lost:
    
        if (r3.isScrap() == false) goto L158;
     */
    /* JADX WARN: Code restructure failed: missing block: B:201:0x0078, code lost:
    
        r25.LJIIIIZZ.removeDetachedView(r3.itemView, false);
        r3.unScrap();
     */
    /* JADX WARN: Code restructure failed: missing block: B:202:0x0082, code lost:
    
        LJIIIZ(r3);
        r3 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:204:0x02e3, code lost:
    
        if (r3.wasReturnedFromScrap() == false) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:205:0x02e5, code lost:
    
        r3.clearReturnedFromScrapFlag();
     */
    /* JADX WARN: Code restructure failed: missing block: B:214:0x030c, code lost:
    
        if (r1.LJLLILLLL.getItemViewType(r3.mPosition) != r3.getItemViewType()) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:218:0x0328, code lost:
    
        if (r3.getItemId() != r25.LJIIIIZZ.LJLLILLLL.getItemId(r3.mPosition)) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00f4, code lost:
    
        r3.mPosition = r6;
        r18 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x029c, code lost:
    
        if (r3 == null) goto L147;
     */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0158 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:117:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x01dc  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x01f3  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x01ee  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x008f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final androidx.recyclerview.widget.RecyclerView.ViewHolder LIZIZ(int r26, long r27) {
        /*
            Method dump skipped, instructions count: 1328
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0A7.LIZIZ(int, long):androidx.recyclerview.widget.RecyclerView$ViewHolder");
    }

    public final RecyclerView.ViewHolder LJIIJJI(int i, long j) {
        if (C2309094k.LIZ == null) {
            C2309094k.LIZ = C03090Af.LIZIZ("catch_tryGetViewHolderForPositionByDeadline_crash", false);
        }
        Boolean bool = C2309094k.LIZ;
        o.LJI(bool);
        if (!bool.booleanValue()) {
            return LIZIZ(i, j);
        }
        try {
            return LIZIZ(i, j);
        } catch (IndexOutOfBoundsException e) {
            StringBuffer stringBuffer = new StringBuffer("tryGetViewHolderForPositionByDeadline crash hook, error: ");
            stringBuffer.append(android.util.Log.getStackTraceString(e));
            C29127Bbv.LIZIZ = stringBuffer.toString();
            if (C19N.LJ("mock_recycle_view_holder", false)) {
                try {
                    return T61.LIZ();
                } catch (Exception e2) {
                    C29127Bbv.LIZIZ = e2.toString();
                    return null;
                }
            }
            return null;
        }
    }
}

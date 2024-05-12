package Y;

import X.C0A2;
import X.C0A6;
import X.C0AG;
import X.C223318pb;
import X.C252709vu;
import X.C56095Lzv;
import X.InterfaceC56094Lzu;
import X.InterfaceC65784Pro;
import X.MKM;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import com.ss.android.ugc.aweme.relation.recommend.NewVersionRecFriendsListAssem;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public class IDrS13S0200000_9 extends C0A6 {
    public final int $t;
    public Object l0;
    public Object l1;

    @Override // X.C0A6
    public final void LJIILJJIL(int i, RecyclerView recyclerView) {
        switch (this.$t) {
            case 2:
                LJIILJJIL$0(this, i, recyclerView);
                return;
            case 3:
                LJIILJJIL$1(this, i, recyclerView);
                return;
            default:
                super.LJIILJJIL(i, recyclerView);
                return;
        }
    }

    @Override // X.C0A6
    public final void LJIILL(RecyclerView recyclerView, int i, int i2) {
        switch (this.$t) {
            case 0:
                LJIILL$0(this, recyclerView, i, i2);
                return;
            case 1:
                LJIILL$1(this, recyclerView, i, i2);
                return;
            case 2:
                LJIILL$2(this, recyclerView, i, i2);
                return;
            default:
                super.LJIILL(recyclerView, i, i2);
                return;
        }
    }

    public IDrS13S0200000_9(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
    }

    public static final void LJIILJJIL$0(IDrS13S0200000_9 iDrS13S0200000_9, int i, RecyclerView recyclerView) {
        InterfaceC56094Lzu interfaceC56094Lzu;
        o.LJIIIZ(recyclerView, "recyclerView");
        if (i == 1) {
            WeakReference<InterfaceC56094Lzu> weakReference = ((C56095Lzv) iDrS13S0200000_9.l0).LIZJ;
            if (weakReference != null && (interfaceC56094Lzu = weakReference.get()) != null) {
                interfaceC56094Lzu.LIZJ();
            }
            ((MKM) iDrS13S0200000_9.l1).removeCallbacks(((C56095Lzv) iDrS13S0200000_9.l0).LJ);
            ((MKM) iDrS13S0200000_9.l1).postDelayed(((C56095Lzv) iDrS13S0200000_9.l0).LJ, 500L);
            RecyclerView currentSubRecyclerView = ((MKM) iDrS13S0200000_9.l1).getCurrentSubRecyclerView();
            if (currentSubRecyclerView != null) {
                currentSubRecyclerView.LJJLL(((C56095Lzv) iDrS13S0200000_9.l0).LIZLLL);
            }
            RecyclerView currentSubRecyclerView2 = ((MKM) iDrS13S0200000_9.l1).getCurrentSubRecyclerView();
            if (currentSubRecyclerView2 != null) {
                currentSubRecyclerView2.LJIIJJI(((C56095Lzv) iDrS13S0200000_9.l0).LIZLLL);
            }
        }
    }

    public static final void LJIILJJIL$1(IDrS13S0200000_9 iDrS13S0200000_9, int i, RecyclerView recyclerView) {
        o.LJIIIZ(recyclerView, "recyclerView");
        if (i == 0) {
            InterfaceC65784Pro interfaceC65784Pro = (InterfaceC65784Pro) iDrS13S0200000_9.l0;
            if (interfaceC65784Pro != null) {
                interfaceC65784Pro.invoke();
            }
            ((MKM) iDrS13S0200000_9.l1).LJJLL(iDrS13S0200000_9);
        }
    }

    public static final void LJIILL$0(IDrS13S0200000_9 iDrS13S0200000_9, RecyclerView recyclerView, int i, int i2) {
        o.LJIIIZ(recyclerView, "recyclerView");
        int LLILL = ((LinearLayoutManager) iDrS13S0200000_9.l0).LLILL();
        if (LLILL == 0) {
            C252709vu c252709vu = ((NewVersionRecFriendsListAssem) iDrS13S0200000_9.l1).LJLIL;
            if (c252709vu != null) {
                if (c252709vu.getAlpha() == 1.0f) {
                    C252709vu c252709vu2 = ((NewVersionRecFriendsListAssem) iDrS13S0200000_9.l1).LJLIL;
                    if (c252709vu2 != null) {
                        c252709vu2.setAlpha(0.0f);
                        return;
                    } else {
                        o.LJIJI("titleBar");
                        throw null;
                    }
                }
                return;
            }
            o.LJIJI("titleBar");
            throw null;
        }
        if (LLILL <= 0) {
            return;
        }
        C252709vu c252709vu3 = ((NewVersionRecFriendsListAssem) iDrS13S0200000_9.l1).LJLIL;
        if (c252709vu3 != null) {
            if (c252709vu3.getAlpha() != 0.0f) {
                return;
            }
            C252709vu c252709vu4 = ((NewVersionRecFriendsListAssem) iDrS13S0200000_9.l1).LJLIL;
            if (c252709vu4 != null) {
                c252709vu4.setAlpha(1.0f);
                return;
            } else {
                o.LJIJI("titleBar");
                throw null;
            }
        }
        o.LJIJI("titleBar");
        throw null;
    }

    public static final void LJIILL$1(IDrS13S0200000_9 iDrS13S0200000_9, RecyclerView recyclerView, int i, int i2) {
        boolean z;
        Boolean valueOf;
        int LJII;
        boolean z2;
        boolean z3;
        o.LJIIIZ(recyclerView, "recyclerView");
        C0A2 layoutManager = ((RecyclerView) iDrS13S0200000_9.l0).getLayoutManager();
        if (layoutManager == null) {
            return;
        }
        if (layoutManager instanceof LinearLayoutManager) {
            if (((LinearLayoutManager) layoutManager).LLIL() <= 0) {
                z3 = true;
            } else {
                z3 = false;
            }
            valueOf = Boolean.valueOf(z3);
        } else if (layoutManager instanceof GridLayoutManager) {
            if (((LinearLayoutManager) layoutManager).LLIL() <= 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            valueOf = Boolean.valueOf(z2);
        } else {
            if (!(layoutManager instanceof StaggeredGridLayoutManager)) {
                return;
            }
            StaggeredGridLayoutManager staggeredGridLayoutManager = (StaggeredGridLayoutManager) layoutManager;
            int i3 = staggeredGridLayoutManager.LJLZ;
            int[] iArr = new int[i3];
            for (int i4 = 0; i4 < staggeredGridLayoutManager.LJLZ; i4++) {
                C0AG c0ag = staggeredGridLayoutManager.LJZ[i4];
                if (c0ag.LJFF.LLFF) {
                    LJII = c0ag.LJII(c0ag.LIZ.size() - 1, -1, true);
                } else {
                    LJII = c0ag.LJII(0, c0ag.LIZ.size(), true);
                }
                iArr[i4] = LJII;
            }
            int i5 = 0;
            for (int i6 = 0; i6 < i3; i6++) {
                if (iArr[i6] <= 0) {
                    i5++;
                }
            }
            if (i5 > 0) {
                z = true;
            } else {
                z = false;
            }
            valueOf = Boolean.valueOf(z);
        }
        if (valueOf != null && (((C223318pb) iDrS13S0200000_9.l1).isEnabled() ^ valueOf.booleanValue())) {
            if (valueOf.booleanValue()) {
                ((C223318pb) iDrS13S0200000_9.l1).setEnabled(true);
                return;
            }
            C223318pb c223318pb = (C223318pb) iDrS13S0200000_9.l1;
            if (c223318pb.LLIIIZ) {
                return;
            }
            c223318pb.setEnabled(false);
        }
    }

    public static final void LJIILL$2(IDrS13S0200000_9 iDrS13S0200000_9, RecyclerView recyclerView, int i, int i2) {
        o.LJIIIZ(recyclerView, "recyclerView");
        ((C56095Lzv) iDrS13S0200000_9.l0).LIZ = System.currentTimeMillis();
    }
}

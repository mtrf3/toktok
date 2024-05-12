package Y;

import X.C0A6;
import X.C42176Ggu;
import X.C42315Gj9;
import X.C45719Hwx;
import X.C45737HxF;
import X.C78999UzT;
import X.InterfaceC44948HkW;
import X.InterfaceC45718Hww;
import X.InterfaceC45740HxI;
import X.InterfaceC88472Yns;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.aweme.base.utils.KeyboardUtils;
import com.ss.android.ugc.aweme.geofencing.ui.GeoFencingSelectionActivity;
import com.ss.android.ugc.aweme.geofencing.ui.GeoFencingSelectionFragment;
import com.ss.android.ugc.aweme.profile.aigc.ProfileAigcChooseStyleFragment;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public class IDrS46S0100000_7 extends C0A6 {
    public final int $t;
    public Object l0;

    @Override // X.C0A6
    public final void LJIILJJIL(int i, RecyclerView recyclerView) {
        switch (this.$t) {
            case 1:
                LJIILJJIL$0(this, i, recyclerView);
                return;
            case 2:
                LJIILJJIL$1(this, i, recyclerView);
                return;
            case 3:
            case 4:
            default:
                super.LJIILJJIL(i, recyclerView);
                return;
            case 5:
                LJIILJJIL$2(this, i, recyclerView);
                return;
            case 6:
                LJIILJJIL$3(this, i, recyclerView);
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
            default:
                super.LJIILL(recyclerView, i, i2);
                return;
            case 3:
                LJIILL$2(this, recyclerView, i, i2);
                return;
            case 4:
                LJIILL$3(this, recyclerView, i, i2);
                return;
        }
    }

    public IDrS46S0100000_7(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void LJIILJJIL$0(IDrS46S0100000_7 iDrS46S0100000_7, int i, RecyclerView recyclerView) {
        if (((C45737HxF) iDrS46S0100000_7.l0).isEnabled()) {
            if (i != 0) {
                if (i != 1) {
                    return;
                }
                ((C45737HxF) iDrS46S0100000_7.l0).getHandler().removeCallbacks(((C45737HxF) iDrS46S0100000_7.l0).LJLLL);
                ((C45737HxF) iDrS46S0100000_7.l0).getClass();
                return;
            }
            C45737HxF c45737HxF = (C45737HxF) iDrS46S0100000_7.l0;
            recyclerView.computeVerticalScrollOffset();
            c45737HxF.getClass();
            if (!((C45737HxF) iDrS46S0100000_7.l0).LJLJJL.isSelected()) {
                ((C45737HxF) iDrS46S0100000_7.l0).getHandler().postDelayed(((C45737HxF) iDrS46S0100000_7.l0).LJLLL, 500L);
            }
            ((C45737HxF) iDrS46S0100000_7.l0).LIZLLL();
            InterfaceC45740HxI interfaceC45740HxI = ((C45737HxF) iDrS46S0100000_7.l0).LJLL;
            if (interfaceC45740HxI == null) {
                return;
            }
            interfaceC45740HxI.LJJLIIIIJ(false);
        }
    }

    public static final void LJIILJJIL$1(IDrS46S0100000_7 iDrS46S0100000_7, int i, RecyclerView recyclerView) {
        InterfaceC45718Hww interfaceC45718Hww;
        o.LJIIIZ(recyclerView, "recyclerView");
        if (InterfaceC44948HkW.LJI.getOpenAlbumOptiGroup() == 2) {
            if (i != 2) {
                Object adapter = ((C45719Hwx) iDrS46S0100000_7.l0).getAdapter();
                if ((adapter instanceof InterfaceC45718Hww) && (interfaceC45718Hww = (InterfaceC45718Hww) adapter) != null) {
                    interfaceC45718Hww.LJJ();
                }
            } else {
                return;
            }
        }
        if (i != 2) {
            C42315Gj9.LIZJ("tool_album_scroll");
            C42315Gj9.LIZJ("tool_album_scroll_high_speed");
        }
    }

    public static final void LJIILJJIL$2(IDrS46S0100000_7 iDrS46S0100000_7, int i, RecyclerView recyclerView) {
        o.LJIIIZ(recyclerView, "recyclerView");
        if (i != 0) {
            KeyboardUtils.LIZIZ(((GeoFencingSelectionActivity) iDrS46S0100000_7.l0)._$_findCachedViewById(R.id.drf));
        }
    }

    public static final void LJIILJJIL$3(IDrS46S0100000_7 iDrS46S0100000_7, int i, RecyclerView recyclerView) {
        o.LJIIIZ(recyclerView, "recyclerView");
        if (i != 0) {
            KeyboardUtils.LIZIZ(((GeoFencingSelectionFragment) iDrS46S0100000_7.l0)._$_findCachedViewById(R.id.drf));
        }
    }

    public static final void LJIILL$0(IDrS46S0100000_7 iDrS46S0100000_7, RecyclerView recyclerView, int i, int i2) {
        o.LJIIIZ(recyclerView, "recyclerView");
        LinearLayoutManager linearLayoutManager = (LinearLayoutManager) recyclerView.getLayoutManager();
        if (linearLayoutManager == null) {
            return;
        }
        if (linearLayoutManager.LLILL() > 0) {
            ((ProfileAigcChooseStyleFragment) iDrS46S0100000_7.l0)._$_findCachedViewById(R.id.gwg).findViewById(R.id.gwk).setAlpha(1.0f);
        } else {
            ((ProfileAigcChooseStyleFragment) iDrS46S0100000_7.l0)._$_findCachedViewById(R.id.gwg).findViewById(R.id.gwk).setAlpha(0.0f);
        }
    }

    public static final void LJIILL$1(IDrS46S0100000_7 iDrS46S0100000_7, RecyclerView recyclerView, int i, int i2) {
        if (!((C45737HxF) iDrS46S0100000_7.l0).LJLJJL.isSelected() && ((C45737HxF) iDrS46S0100000_7.l0).isEnabled()) {
            C45737HxF c45737HxF = (C45737HxF) iDrS46S0100000_7.l0;
            c45737HxF.setTimeLineViewsPosition(c45737HxF.LIZIZ(recyclerView));
        }
        ((C45737HxF) iDrS46S0100000_7.l0).LJLJLLL.setVisibility(0);
        if (((C45737HxF) iDrS46S0100000_7.l0).LJLLI != null && recyclerView.getLayoutManager() != null) {
            ((C45737HxF) iDrS46S0100000_7.l0).LIZLLL();
        }
        ((C45737HxF) iDrS46S0100000_7.l0).getClass();
    }

    public static final void LJIILL$2(IDrS46S0100000_7 iDrS46S0100000_7, RecyclerView recyclerView, int i, int i2) {
        o.LJIIIZ(recyclerView, "recyclerView");
        ((C42176Ggu) iDrS46S0100000_7.l0).LJLILLLLZI += i;
    }

    public static final void LJIILL$3(IDrS46S0100000_7 iDrS46S0100000_7, RecyclerView recyclerView, int i, int i2) {
        o.LJIIIZ(recyclerView, "recyclerView");
        C78999UzT.LJIIIZ(recyclerView, (InterfaceC88472Yns) iDrS46S0100000_7.l0);
    }
}

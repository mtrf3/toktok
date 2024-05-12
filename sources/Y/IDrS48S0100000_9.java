package Y;

import X.AYY;
import X.AbstractC029409q;
import X.C0A2;
import X.C0A6;
import X.C56095Lzv;
import X.C57640Mjk;
import X.C57641Mjl;
import X.C57928MoO;
import X.C57935MoV;
import X.C72912tb;
import X.HandlerC56918MVm;
import X.InterfaceC57910Mo6;
import X.MK7;
import X.MRR;
import X.MSQ;
import X.ORZ;
import android.view.View;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.ss.android.ugc.aweme.commercialize.profile.AdFakeUserProfileAwemeListFragment;
import com.ss.android.ugc.aweme.discover.ui.TrendsTabFragment;
import com.ss.android.ugc.aweme.discover.viewmodel.TrendsTabViewModel;
import com.ss.android.ugc.aweme.notification.MusNewNotificationFragment;
import com.ss.android.ugc.aweme.notification.NotificationFragment;
import com.ss.android.ugc.aweme.notification.perf.NoticeVideoManager;
import com.ss.android.ugc.aweme.profile.ui.AwemeListFragmentImpl;
import com.ss.android.ugc.aweme.profile.ui.MTAwemeListFragment;
import com.ss.android.ugc.aweme.relation.feed.v4.RecSwipeCardListAssem;
import com.ss.android.ugc.aweme.relation.recuser.inbox.UserCardAdapterWidget;
import java.util.Iterator;
import kotlin.jvm.internal.AqS14S0010000_9;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public class IDrS48S0100000_9 extends C0A6 {
    public final int $t;
    public Object l0;

    public static final void LJIILJJIL$4(IDrS48S0100000_9 iDrS48S0100000_9, int i, RecyclerView recyclerView) {
    }

    public static final void LJIILL$1(IDrS48S0100000_9 iDrS48S0100000_9, RecyclerView recyclerView, int i, int i2) {
    }

    public static final void LJIILL$2(IDrS48S0100000_9 iDrS48S0100000_9, RecyclerView recyclerView, int i, int i2) {
    }

    @Override // X.C0A6
    public final void LJIILJJIL(int i, RecyclerView recyclerView) {
        switch (this.$t) {
            case 0:
                LJIILJJIL$0(this, i, recyclerView);
                return;
            case 1:
                LJIILJJIL$1(this, i, recyclerView);
                return;
            case 2:
                LJIILJJIL$2(this, i, recyclerView);
                return;
            case 3:
                LJIILJJIL$3(this, i, recyclerView);
                return;
            case 4:
                LJIILJJIL$4(this, i, recyclerView);
                return;
            case 5:
                LJIILJJIL$5(this, i, recyclerView);
                return;
            case 6:
            case 7:
            case 8:
            case 9:
            case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
            default:
                super.LJIILJJIL(i, recyclerView);
                return;
            case 10:
                LJIILJJIL$6(this, i, recyclerView);
                return;
            case 12:
                LJIILJJIL$7(this, i, recyclerView);
                return;
            case ABRConfig.ABR_STARTUP_MAX_BITRATE /* 13 */:
                LJIILJJIL$8(this, i, recyclerView);
                return;
        }
    }

    @Override // X.C0A6
    public final void LJIILL(RecyclerView recyclerView, int i, int i2) {
        switch (this.$t) {
            case 1:
                LJIILL$0(this, recyclerView, i, i2);
                return;
            case 2:
                LJIILL$1(this, recyclerView, i, i2);
                return;
            case 3:
                LJIILL$2(this, recyclerView, i, i2);
                return;
            case 4:
                LJIILL$3(this, recyclerView, i, i2);
                return;
            case 5:
            case 10:
            case 12:
            default:
                super.LJIILL(recyclerView, i, i2);
                return;
            case 6:
                LJIILL$4(this, recyclerView, i, i2);
                return;
            case 7:
                LJIILL$5(this, recyclerView, i, i2);
                return;
            case 8:
                LJIILL$6(this, recyclerView, i, i2);
                return;
            case 9:
                LJIILL$7(this, recyclerView, i, i2);
                return;
            case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                LJIILL$8(this, recyclerView, i, i2);
                return;
            case ABRConfig.ABR_STARTUP_MAX_BITRATE /* 13 */:
                LJIILL$9(this, recyclerView, i, i2);
                return;
        }
    }

    public IDrS48S0100000_9(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void LJIILJJIL$0(IDrS48S0100000_9 iDrS48S0100000_9, int i, RecyclerView recyclerView) {
        o.LJIIIZ(recyclerView, "recyclerView");
        if (i == 0) {
            ((AdFakeUserProfileAwemeListFragment) iDrS48S0100000_9.l0).vl(false);
        }
    }

    public static final void LJIILJJIL$1(IDrS48S0100000_9 iDrS48S0100000_9, int i, RecyclerView recyclerView) {
        o.LJIIIZ(recyclerView, "recyclerView");
        boolean z = true;
        if (i != 1 && i != 2) {
            z = false;
        }
        HandlerC56918MVm LIZ = NoticeVideoManager.LIZ();
        if (LIZ != null) {
            LIZ.LJIIIZ(z);
        }
    }

    public static final void LJIILJJIL$2(IDrS48S0100000_9 iDrS48S0100000_9, int i, RecyclerView recyclerView) {
        int i2;
        if (i == 0) {
            C0A2 layoutManager = recyclerView.getLayoutManager();
            if (layoutManager instanceof GridLayoutManager) {
                i2 = ((LinearLayoutManager) layoutManager).LLILLJJLI();
            } else {
                i2 = -1;
            }
            if (i2 > recyclerView.getLayoutManager().LJJJJZ() - 15) {
                ((AwemeListFragmentImpl) iDrS48S0100000_9.l0).LJIIJJI();
            }
        }
    }

    public static final void LJIILJJIL$3(IDrS48S0100000_9 iDrS48S0100000_9, int i, RecyclerView recyclerView) {
        int i2;
        if (i == 0) {
            C0A2 layoutManager = recyclerView.getLayoutManager();
            if (layoutManager instanceof GridLayoutManager) {
                i2 = ((LinearLayoutManager) layoutManager).LLILLJJLI();
            } else {
                i2 = -1;
            }
            if (i2 > recyclerView.getLayoutManager().LJJJJZ() - 15) {
                ((MTAwemeListFragment) iDrS48S0100000_9.l0).LJIIJJI();
            }
        }
    }

    public static final void LJIILJJIL$5(IDrS48S0100000_9 iDrS48S0100000_9, int i, RecyclerView recyclerView) {
        o.LJIIIZ(recyclerView, "recyclerView");
        if (i == 1) {
            ((RecSwipeCardListAssem) iDrS48S0100000_9.l0).c4().setState(C57640Mjk.LJLIL);
        } else {
            if (i != 0) {
                return;
            }
            ((RecSwipeCardListAssem) iDrS48S0100000_9.l0).c4().setState(C57641Mjl.LJLIL);
        }
    }

    public static final void LJIILJJIL$6(IDrS48S0100000_9 iDrS48S0100000_9, int i, RecyclerView recyclerView) {
        o.LJIIIZ(recyclerView, "recyclerView");
        Iterator it = ORZ.LLJI(((C57928MoO) iDrS48S0100000_9.l0).LJLJJI).iterator();
        while (it.hasNext()) {
            ((InterfaceC57910Mo6) it.next()).LJLZ(i, recyclerView);
        }
    }

    public static final void LJIILJJIL$7(IDrS48S0100000_9 iDrS48S0100000_9, int i, RecyclerView recyclerView) {
        o.LJIIIZ(recyclerView, "recyclerView");
        if (i == 1 && (((C57935MoV) iDrS48S0100000_9.l0).getCurrentState().LIZJ instanceof C72912tb)) {
            AYY ayy = AYY.LIZ;
            String str = ((C57935MoV) iDrS48S0100000_9.l0).LJLILLLLZI;
            ayy.getClass();
            AYY.LIZIZ(str, "User scroll, set PageMerge to is append");
            ((C57935MoV) iDrS48S0100000_9.l0).LIZ().nv0();
            recyclerView.LJJLL(iDrS48S0100000_9);
        }
    }

    public static final void LJIILJJIL$8(IDrS48S0100000_9 iDrS48S0100000_9, int i, RecyclerView recyclerView) {
        o.LJIIIZ(recyclerView, "recyclerView");
        HandlerC56918MVm LIZ = NoticeVideoManager.LIZ();
        if (LIZ != null) {
            boolean z = true;
            if (i != 1 && i != 2) {
                z = false;
            }
            LIZ.LJIIIZ(z);
        }
    }

    public static final void LJIILL$0(IDrS48S0100000_9 iDrS48S0100000_9, RecyclerView recyclerView, int i, int i2) {
        o.LJIIIZ(recyclerView, "recyclerView");
        ((NotificationFragment) iDrS48S0100000_9.l0).Ol();
    }

    public static final void LJIILL$3(IDrS48S0100000_9 iDrS48S0100000_9, RecyclerView recyclerView, int i, int i2) {
        ((MTAwemeListFragment) iDrS48S0100000_9.l0).Ym();
    }

    public static final void LJIILL$4(IDrS48S0100000_9 iDrS48S0100000_9, RecyclerView recyclerView, int i, int i2) {
        LinearLayoutManager linearLayoutManager;
        AbstractC029409q adapter;
        o.LJIIIZ(recyclerView, "recyclerView");
        ((UserCardAdapterWidget) iDrS48S0100000_9.l0).getClass();
        C0A2 layoutManager = recyclerView.getLayoutManager();
        if (!(layoutManager instanceof LinearLayoutManager) || (linearLayoutManager = (LinearLayoutManager) layoutManager) == null || (adapter = recyclerView.getAdapter()) == null || adapter.getItemCount() - linearLayoutManager.LLILLIZIL() > 10) {
            return;
        }
        recyclerView.LJJLL(iDrS48S0100000_9);
        ((UserCardAdapterWidget) iDrS48S0100000_9.l0).LJJIFFI(false);
    }

    public static final void LJIILL$5(IDrS48S0100000_9 iDrS48S0100000_9, RecyclerView recyclerView, int i, int i2) {
        o.LJIIIZ(recyclerView, "recyclerView");
        boolean canScrollVertically = recyclerView.canScrollVertically(-1);
        if (!o.LJ(((TrendsTabFragment) iDrS48S0100000_9.l0).LJZL, Boolean.valueOf(canScrollVertically))) {
            ((TrendsTabFragment) iDrS48S0100000_9.l0).LJZL = Boolean.valueOf(canScrollVertically);
            TrendsTabViewModel Dl = ((TrendsTabFragment) iDrS48S0100000_9.l0).Dl();
            Dl.getClass();
            Dl.setState(new AqS14S0010000_9(canScrollVertically, 5));
        }
    }

    public static final void LJIILL$6(IDrS48S0100000_9 iDrS48S0100000_9, RecyclerView recyclerView, int i, int i2) {
        o.LJIIIZ(recyclerView, "recyclerView");
        if (i2 >= 0 && ((MK7) iDrS48S0100000_9.l0).isNestedFlingHandled()) {
            recyclerView.LJLJJI();
        }
    }

    public static final void LJIILL$7(IDrS48S0100000_9 iDrS48S0100000_9, RecyclerView recyclerView, int i, int i2) {
        boolean z;
        o.LJIIIZ(recyclerView, "recyclerView");
        if (i2 < 0) {
            z = true;
        } else {
            z = false;
        }
        MSQ msq = (MSQ) iDrS48S0100000_9.l0;
        LinearLayoutManager linearLayoutManager = msq.LIZ;
        if (linearLayoutManager != null) {
            int LLILL = linearLayoutManager.LLILL();
            LinearLayoutManager linearLayoutManager2 = msq.LIZ;
            if (linearLayoutManager2 != null) {
                int LLILLJJLI = linearLayoutManager2.LLILLJJLI();
                if (LLILL == -1 || LLILLJJLI == -1) {
                    return;
                }
                LinearLayoutManager linearLayoutManager3 = msq.LIZ;
                if (linearLayoutManager3 != null) {
                    View LJJIJIL = linearLayoutManager3.LJJIJIL(LLILL);
                    LinearLayoutManager linearLayoutManager4 = msq.LIZ;
                    if (linearLayoutManager4 != null) {
                        View LJJIJIL2 = linearLayoutManager4.LJJIJIL(LLILLJJLI);
                        if (LJJIJIL == null || LJJIJIL2 == null) {
                            return;
                        }
                        LJJIJIL.getLocalVisibleRect(msq.LIZLLL);
                        LJJIJIL2.getGlobalVisibleRect(msq.LJ);
                        int i3 = msq.LIZIZ;
                        int i4 = msq.LIZJ;
                        if (z) {
                            if (i3 > LLILL) {
                                for (int i5 = LLILL; i5 < i3; i5++) {
                                    MRR mrr = msq.LJFF;
                                    if (mrr != null) {
                                        mrr.LIZ(i5);
                                    }
                                }
                                msq.LIZIZ = LLILL;
                            }
                            if (msq.LIZJ == LLILLJJLI) {
                                msq.LIZIZ = LLILL;
                                return;
                            } else {
                                msq.LIZJ = LLILLJJLI;
                                return;
                            }
                        }
                        if (i4 < LLILLJJLI) {
                            int i6 = LLILLJJLI + 1;
                            for (int i7 = i4 + 1; i7 < i6; i7++) {
                                MRR mrr2 = msq.LJFF;
                                if (mrr2 != null) {
                                    mrr2.LIZ(i7);
                                }
                            }
                            msq.LIZJ = LLILLJJLI;
                        }
                        if (msq.LIZIZ == LLILL) {
                            msq.LIZJ = LLILLJJLI;
                            return;
                        } else {
                            msq.LIZIZ = LLILL;
                            return;
                        }
                    }
                    o.LJIJI("mLinearLayoutManager");
                    throw null;
                }
                o.LJIJI("mLinearLayoutManager");
                throw null;
            }
            o.LJIJI("mLinearLayoutManager");
            throw null;
        }
        o.LJIJI("mLinearLayoutManager");
        throw null;
    }

    public static final void LJIILL$8(IDrS48S0100000_9 iDrS48S0100000_9, RecyclerView recyclerView, int i, int i2) {
        o.LJIIIZ(recyclerView, "recyclerView");
        ((C56095Lzv) iDrS48S0100000_9.l0).LIZ = System.currentTimeMillis();
    }

    public static final void LJIILL$9(IDrS48S0100000_9 iDrS48S0100000_9, RecyclerView recyclerView, int i, int i2) {
        o.LJIIIZ(recyclerView, "recyclerView");
        ((MusNewNotificationFragment) iDrS48S0100000_9.l0).Zl();
    }
}

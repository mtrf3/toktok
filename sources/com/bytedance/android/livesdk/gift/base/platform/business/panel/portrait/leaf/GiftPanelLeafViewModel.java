package com.bytedance.android.livesdk.gift.base.platform.business.panel.portrait.leaf;

import X.AbstractC32698CsQ;
import X.C15380j0;
import X.C162476Zf;
import X.C29420Bge;
import X.C30896CAq;
import X.C32658Crm;
import X.C32713Csf;
import X.C32765CtV;
import X.C32778Cti;
import X.C32782Ctm;
import X.CN1;
import X.EnumC32736Ct2;
import X.EnumC32766CtW;
import X.InterfaceC30442Bx8;
import android.view.View;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.livesdk.model.GiftPanelBanner;
import com.bytedance.android.livesdk.revenue.level.api.service.IFansClubService;
import com.bytedance.android.widget.NextLiveData;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class GiftPanelLeafViewModel extends ViewModel {
    public boolean LJLLJ;
    public boolean LJLLL;
    public final MutableLiveData<GiftPanelBanner> LJLIL = new MutableLiveData<>();
    public final MutableLiveData<LinkedList<AbstractC32698CsQ<? extends C30896CAq>>> LJLILLLLZI = new MutableLiveData<>();
    public final MutableLiveData<List<C32713Csf>> LJLJI = new MutableLiveData<>();
    public final MutableLiveData<Integer> LJLJJI = new MutableLiveData<>(1);
    public final MutableLiveData<Integer> LJLJJL = new MutableLiveData<>(1);
    public final MutableLiveData<Long> LJLJJLL = new MutableLiveData<>(Long.valueOf(C32778Cti.LIZ(C15380j0.LIZLLL())));
    public final MutableLiveData<EnumC32736Ct2> LJLJL = new MutableLiveData<>(EnumC32736Ct2.SUCCESS);
    public final Map<Long, Integer> LJLJLJ = new LinkedHashMap();
    public final LinkedList<Integer> LJLJLLL = new LinkedList<>();
    public final LinkedList<Long> LJLL = new LinkedList<>();
    public final long LJLLI = 7777777;
    public final long LJLLILLLL = -10;
    public final MutableLiveData<EnumC32766CtW> LJLLLL = new MutableLiveData<>(EnumC32766CtW.DEFAULT);
    public final NextLiveData<C29420Bge> LJLLLLLL = new NextLiveData<>();

    public static boolean iv0(int i) {
        if (i != 1) {
            if (i != 15) {
                if (i == 16 && !C32658Crm.LIZ.getBoolean(C32658Crm.LIZ(), false)) {
                    return true;
                }
            } else {
                Boolean showUserLevelRedDot = InterfaceC30442Bx8.l0.LIZJ();
                boolean ge0 = ((IFansClubService) CN1.LIZ(IFansClubService.class)).ge0();
                o.LJIIIIZZ(showUserLevelRedDot, "showUserLevelRedDot");
                if (showUserLevelRedDot.booleanValue() || ge0) {
                    return true;
                }
                return false;
            }
        }
        return false;
    }

    public static int gv0(int i, EnumC32766CtW state) {
        o.LJIIIZ(state, "state");
        if (i == 1) {
            int i2 = C32765CtV.LIZ[state.ordinal()];
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 == 3) {
                        return R.drawable.d37;
                    }
                    throw new C162476Zf();
                }
                return R.drawable.d36;
            }
            return R.drawable.d35;
        }
        return 0;
    }

    public static void kv0(RecyclerView recyclerView, GridLayoutManager layoutManager) {
        int i;
        int i2;
        int i3;
        int i4;
        o.LJIIIZ(recyclerView, "recyclerView");
        o.LJIIIZ(layoutManager, "layoutManager");
        int LLILL = layoutManager.LLILL();
        int LLILLJJLI = layoutManager.LLILLJJLI();
        int i5 = -1;
        if (LLILL <= LLILLJJLI) {
            int i6 = -1;
            i = -1;
            while (true) {
                View LJJIJIL = layoutManager.LJJIJIL(LLILL);
                int i7 = 0;
                if (LJJIJIL != null) {
                    i2 = LJJIJIL.getBottom();
                    i3 = LJJIJIL.getTop();
                } else {
                    i2 = 0;
                    i3 = 0;
                }
                int i8 = i2 - i3;
                if (LJJIJIL != null) {
                    i7 = LJJIJIL.getTop();
                }
                double d = i8;
                if (i7 >= (-0.5d) * d) {
                    if (LJJIJIL != null) {
                        i4 = LJJIJIL.getBottom();
                    } else {
                        i4 = Integer.MAX_VALUE;
                    }
                    if (i4 < (d * 0.5d) + recyclerView.getHeight()) {
                        if (i6 == -1) {
                            i6 = LLILL;
                        }
                        i = LLILL;
                    }
                }
                if (LLILL == LLILLJJLI) {
                    break;
                } else {
                    LLILL++;
                }
            }
            i5 = i6;
        } else {
            i = -1;
        }
        C32782Ctm.LIZ.LIZIZ((i5 / 4) + 1, (i / 4) + 1);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x009b, code lost:
    
        if ((r2 instanceof X.C32739Ct5) != false) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00a7, code lost:
    
        if ((r2 instanceof X.C32741Ct7) == false) goto L67;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void jv0(X.RunnableC31065CHd r14, androidx.recyclerview.widget.GridLayoutManager r15, java.util.LinkedList r16) {
        /*
            Method dump skipped, instructions count: 377
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.gift.base.platform.business.panel.portrait.leaf.GiftPanelLeafViewModel.jv0(X.CHd, androidx.recyclerview.widget.GridLayoutManager, java.util.LinkedList):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x00e1, code lost:
    
        if ((r4 instanceof X.C32739Ct5) != false) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x00ed, code lost:
    
        if ((r4 instanceof X.C32741Ct7) == false) goto L78;
     */
    /* JADX WARN: Removed duplicated region for block: B:101:0x025c A[LOOP:2: B:99:0x0256->B:101:0x025c, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:97:0x021c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void hv0(X.RunnableC31065CHd r26, androidx.recyclerview.widget.GridLayoutManager r27, java.util.LinkedList r28, java.util.List r29, java.util.Map r30) {
        /*
            Method dump skipped, instructions count: 698
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.gift.base.platform.business.panel.portrait.leaf.GiftPanelLeafViewModel.hv0(X.CHd, androidx.recyclerview.widget.GridLayoutManager, java.util.LinkedList, java.util.List, java.util.Map):void");
    }
}

package X;

import androidx.fragment.app.Fragment;
import com.bytedance.android.live.effect.FilterPanelFetchSuccessChannel;
import com.bytedance.android.live.effect.api.OnFilterSelectedEvent;
import com.bytedance.android.live.effect.model.FilterModel;
import com.bytedance.android.livesdk.livesetting.broadcast.BeautyPanelMemoryOptSetting;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.IDqS416S0100000;
import kotlin.jvm.internal.o;

/* renamed from: X.1ah, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C35711ah implements InterfaceC24270xL<FilterModel> {
    public final DataChannel LIZ;
    public Fragment LIZIZ;
    public final C76923UGx LIZJ;
    public final InterfaceC65784Pro<String> LIZLLL;
    public final List<FilterModel> LJ = new ArrayList();
    public FilterModel LJFF;

    @Override // X.InterfaceC24270xL
    public final void release() {
        C33771Uf c33771Uf = C15750jb.LIZ;
        c33771Uf.getClass();
        InterfaceC30442Bx8.LLLZZ.LIZ(c33771Uf.LIZLLL);
    }

    @Override // X.InterfaceC24270xL
    public final void LIZIZ() {
        LIZLLL(this.LJFF);
    }

    public final void LIZJ() {
        DataChannel dataChannel = this.LIZ;
        if (dataChannel != null) {
            dataChannel.ov0(this.LIZIZ, FilterPanelFetchSuccessChannel.class, new IDqS416S0100000(this, 300));
            dataChannel.lv0(this.LIZIZ, OnFilterSelectedEvent.class, new IDqS416S0100000(this, 301));
        }
    }

    public final void LJ() {
        int size = this.LJ.size();
        C33771Uf c33771Uf = C15750jb.LIZ;
        if (size != ((ArrayList) c33771Uf.LIZ).size()) {
            this.LJ.clear();
            List<FilterModel> list = this.LJ;
            List<FilterModel> list2 = c33771Uf.LIZ;
            o.LJIIIIZZ(list2, "inst().getAllFilter()");
            list.addAll(list2);
            List<FilterModel> list3 = this.LJ;
            Integer LIZJ = InterfaceC30442Bx8.LJIJI.LIZJ();
            o.LJIIIIZZ(LIZJ, "LIVE_FILTER_INDEX.value");
            this.LJFF = (FilterModel) ORZ.LJLLLLLL(LIZJ.intValue(), list3);
        }
    }

    @Override // X.InterfaceC24270xL
    public final void LIZ(int i) {
        C48459J0d<Boolean> c48459J0d = InterfaceC30442Bx8.LLZZLLIL;
        if (C29306Beo.LJIILLIIL(c48459J0d.LIZJ())) {
            c48459J0d.LIZ(Boolean.TRUE);
        }
        FilterModel filterModel = this.LJFF;
        if (filterModel != null) {
            C0L1 c0l1 = filterModel.filterConfig;
            float LJFF = C12920f2.LJFF(c0l1.LIZ, c0l1.LIZIZ, i);
            C33771Uf c33771Uf = C15750jb.LIZ;
            Float valueOf = Float.valueOf(LJFF);
            c33771Uf.getClass();
            if (valueOf == null || valueOf.isNaN() || valueOf.isInfinite()) {
                return;
            }
            AnonymousClass030.LJFF(InterfaceC30442Bx8.LLLZLZ);
            c33771Uf.LIZLLL.put(filterModel.getFilterId(), Double.valueOf(valueOf.doubleValue()));
            c33771Uf.LIZLLL.put(filterModel.getResourceId(), Double.valueOf(valueOf.doubleValue()));
            Iterator it = ((ArrayList) c33771Uf.LJ).iterator();
            while (it.hasNext()) {
                ((InterfaceC08050Th) it.next()).LIZ(valueOf.floatValue(), filterModel);
            }
        }
    }

    public final void LIZLLL(FilterModel filterModel) {
        if (!o.LJ(this.LIZLLL.invoke(), C0TY.LJFF)) {
            return;
        }
        if (filterModel == null) {
            C29306Beo.LJI(this.LIZJ);
            return;
        }
        if (filterModel.isNone()) {
            C29306Beo.LJI(this.LIZJ);
            return;
        }
        C29306Beo.LJJLJLI(this.LIZJ);
        C76923UGx c76923UGx = this.LIZJ;
        C0L1 c0l1 = filterModel.filterConfig;
        c76923UGx.setPercent(C12920f2.LJ(C15750jb.LIZ.LJIIIZ(filterModel), c0l1.LIZ, c0l1.LIZIZ));
        this.LIZJ.LIZJ(100, 0, filterModel.filterConfig.LIZJ, true);
    }

    public C35711ah(DataChannel dataChannel, Fragment fragment, C76923UGx c76923UGx, InterfaceC65784Pro<String> interfaceC65784Pro) {
        this.LIZ = dataChannel;
        this.LIZIZ = fragment;
        this.LIZJ = c76923UGx;
        this.LIZLLL = interfaceC65784Pro;
        if (!BeautyPanelMemoryOptSetting.INSTANCE.enable()) {
            LIZJ();
            LJ();
        }
    }
}

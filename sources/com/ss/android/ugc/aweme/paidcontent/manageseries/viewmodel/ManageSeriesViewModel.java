package com.ss.android.ugc.aweme.paidcontent.manageseries.viewmodel;

import X.A15;
import X.A1F;
import X.C221108m2;
import X.C249229qI;
import X.C25524A0a;
import X.C25529A0f;
import X.C25532A0i;
import X.C25545A0v;
import X.C47704Ins;
import X.C55749LuL;
import X.C62822Ol8;
import X.C73969T1h;
import X.EnumC25549A0z;
import X.T16;
import Y.AfS16S0210000_4;
import Y.AfS24S0110000_4;
import Y.AfS53S0200000_4;
import Y.AfS56S0100000_4;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.ss.android.ugc.aweme.service.IPaidContentCreationService;
import com.ss.android.ugc.aweme.services.video.IAVPublishService;
import java.util.List;
import kotlin.jvm.internal.AqS170S0100000_4;
import kotlin.jvm.internal.AqS29S1000000_4;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class ManageSeriesViewModel extends AssemViewModel<C25532A0i> implements A1F {
    public final C62822Ol8 LJLIL = C221108m2.LIZIZ(C249229qI.LJLIL);
    public final IAVPublishService LJLILLLLZI = AVExternalServiceImpl.LIZ().publishService();
    public final C55749LuL LJLJI = new C55749LuL(C47704Ins.LIZLLL(this, C25524A0a.class, "manage_series_hierarchy_data_key"), true);

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final C25532A0i defaultState() {
        return new C25532A0i(0);
    }

    public final IPaidContentCreationService hv0() {
        Object value = this.LJLIL.getValue();
        o.LJIIIIZZ(value, "<get-creationService>(...)");
        return (IPaidContentCreationService) value;
    }

    public final void iv0(EnumC25549A0z manageMode) {
        o.LJIIIZ(manageMode, "manageMode");
        setState(new AqS170S0100000_4(manageMode, 504));
    }

    @Override // X.A1F
    public final void qb0(String videoId) {
        o.LJIIIZ(videoId, "videoId");
        setState(new AqS29S1000000_4(videoId, 15));
    }

    @Override // X.A1F
    public final void x40(A15 uploadingVideo) {
        o.LJIIIZ(uploadingVideo, "uploadingVideo");
        setState(new AqS170S0100000_4(uploadingVideo, 502));
    }

    @Override // X.A1F
    public final void yf(C25545A0v c25545A0v) {
        setState(new AqS170S0100000_4(c25545A0v, 503));
    }

    public final void gv0(boolean z, A15 a15) {
        String str = getState().LJLIL;
        if (str != null) {
            disposeOnClear(hv0().LIZ(str).LJJIIJ(T16.LIZ()).LJIJJ(C73969T1h.LIZIZ()).LJIIL(new AfS24S0110000_4(this, z, 1)).LJJII(new AfS16S0210000_4(this, z, a15, 0), new AfS53S0200000_4(this, a15, 8)));
        }
    }

    @Override // X.A1F
    public final void zs(int i, int i2, List list) {
        String str = getState().LJLIL;
        if (str != null) {
            hv0().LJIIIIZZ(str, list).LJJIIJ(T16.LIZ()).LJIJJ(C73969T1h.LIZIZ()).LJIIL(new AfS56S0100000_4(this, 152)).LJJII(new AfS56S0100000_4(this, 136), new C25529A0f(this, i, i2));
        }
    }
}

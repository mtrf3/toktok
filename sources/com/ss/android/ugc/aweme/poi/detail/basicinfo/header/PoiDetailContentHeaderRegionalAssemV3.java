package com.ss.android.ugc.aweme.poi.detail.basicinfo.header;

import X.C190407dc;
import X.C190497dl;
import X.C190577dt;
import X.C214298b3;
import X.C47704Ins;
import X.C55749LuL;
import X.C65352Pkq;
import X.C65776Prg;
import X.C78926UyI;
import X.C9BE;
import android.content.Context;
import android.view.View;
import com.ss.android.ugc.aweme.poi.detail.container.PoiDetailInfoViewModel;
import com.ss.android.ugc.aweme.poi.detail.container.PoiListApi;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AqS153S0100000_3;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class PoiDetailContentHeaderRegionalAssemV3 extends PoiDetailContentHeaderBaseAssemV3 {
    public final C55749LuL LJLJJL;
    public final C214298b3 LJLJJLL;

    public PoiDetailContentHeaderRegionalAssemV3() {
        new LinkedHashMap();
        this.LJLJJL = new C55749LuL(C47704Ins.LJ(this, C190407dc.class, "PoiDetailContentHeaderHierarchyDataV3"), checkSupervisorPrepared());
        C9BE c9be = C9BE.LIZ;
        C65776Prg LIZ = C65352Pkq.LIZ(PoiDetailInfoViewModel.class);
        this.LJLJJLL = C78926UyI.LJ(this, LIZ, c9be, new AqS153S0100000_3(LIZ, 711), C190577dt.INSTANCE, null);
    }

    @Override // com.ss.android.ugc.aweme.poi.detail.basicinfo.header.PoiDetailContentHeaderBaseAssemV3
    public final void H3(View view) {
        PoiListApi.PoiDetailResponse poiDetailResponse;
        C190497dl c190497dl;
        o.LJIIIZ(view, "view");
        C190407dc c190407dc = (C190407dc) this.LJLJJL.getValue();
        if (c190407dc != null && (poiDetailResponse = c190407dc.LJLILLLLZI) != null) {
            String str = ((PoiDetailInfoViewModel) this.LJLJJLL.getValue()).LJLIL;
            I3(poiDetailResponse, str);
            L3(poiDetailResponse, str);
            C190407dc c190407dc2 = (C190407dc) this.LJLJJL.getValue();
            C190497dl c190497dl2 = null;
            if (c190407dc2 != null) {
                c190497dl = c190407dc2.LJLJI;
            } else {
                c190497dl = null;
            }
            C3(str, poiDetailResponse, c190497dl);
            Context context = view.getContext();
            o.LJIIIIZZ(context, "view.context");
            C190407dc c190407dc3 = (C190407dc) this.LJLJJL.getValue();
            if (c190407dc3 != null) {
                c190497dl2 = c190407dc3.LJLJI;
            }
            E3(str, poiDetailResponse, context, c190497dl2);
            K3(poiDetailResponse, str);
        }
    }
}

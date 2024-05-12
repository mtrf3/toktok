package com.ss.android.ugc.aweme.poi.detail.basicinfo.header.old;

import X.C190417dd;
import X.C190497dl;
import X.C190627dy;
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
public final class PoiDetailContentHeaderRegionalAssem extends PoiDetailContentHeaderBaseAssem {
    public final C55749LuL LJLJJL;
    public final C214298b3 LJLJJLL;

    public PoiDetailContentHeaderRegionalAssem() {
        new LinkedHashMap();
        this.LJLJJL = new C55749LuL(C47704Ins.LJ(this, C190417dd.class, "PoiDetailContentHeaderHierarchyData"), checkSupervisorPrepared());
        C9BE c9be = C9BE.LIZ;
        C65776Prg LIZ = C65352Pkq.LIZ(PoiDetailInfoViewModel.class);
        this.LJLJJLL = C78926UyI.LJ(this, LIZ, c9be, new AqS153S0100000_3(LIZ, 717), C190627dy.INSTANCE, null);
    }

    @Override // com.ss.android.ugc.aweme.poi.detail.basicinfo.header.old.PoiDetailContentHeaderBaseAssem
    public final void F3(View view) {
        PoiListApi.PoiDetailResponse poiDetailResponse;
        C190497dl c190497dl;
        o.LJIIIZ(view, "view");
        C190417dd c190417dd = (C190417dd) this.LJLJJL.getValue();
        if (c190417dd != null && (poiDetailResponse = c190417dd.LJLILLLLZI) != null) {
            String str = ((PoiDetailInfoViewModel) this.LJLJJLL.getValue()).LJLIL;
            boolean z = ((PoiDetailInfoViewModel) this.LJLJJLL.getValue()).LJLJJI;
            H3(poiDetailResponse, str);
            L3(poiDetailResponse, z);
            C190417dd c190417dd2 = (C190417dd) this.LJLJJL.getValue();
            C190497dl c190497dl2 = null;
            if (c190417dd2 != null) {
                c190497dl = c190417dd2.LJLJI;
            } else {
                c190497dl = null;
            }
            A3(str, poiDetailResponse, c190497dl);
            Context context = view.getContext();
            o.LJIIIIZZ(context, "view.context");
            C190417dd c190417dd3 = (C190417dd) this.LJLJJL.getValue();
            if (c190417dd3 != null) {
                c190497dl2 = c190417dd3.LJLJI;
            }
            C3(str, poiDetailResponse, context, c190497dl2);
            I3(poiDetailResponse, str);
        }
    }
}

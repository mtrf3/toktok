package com.ss.android.ugc.aweme.poi.detail.basicinfo.header;

import X.C190407dc;
import X.C190497dl;
import X.C190567ds;
import X.C214298b3;
import X.C45243HpH;
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
public final class PoiDetailContentHeaderIndependentAssemV3 extends PoiDetailContentHeaderBaseAssemV3 {
    public final C55749LuL LJLJJL;
    public final C214298b3 LJLJJLL;

    public PoiDetailContentHeaderIndependentAssemV3() {
        new LinkedHashMap();
        this.LJLJJL = new C55749LuL(C47704Ins.LJ(this, C190407dc.class, "PoiDetailContentHeaderHierarchyDataV3"), checkSupervisorPrepared());
        C9BE c9be = C9BE.LIZ;
        C65776Prg LIZ = C65352Pkq.LIZ(PoiDetailInfoViewModel.class);
        this.LJLJJLL = C78926UyI.LJ(this, LIZ, c9be, new AqS153S0100000_3(LIZ, 710), C190567ds.INSTANCE, null);
    }

    public final C190407dc O3() {
        return (C190407dc) this.LJLJJL.getValue();
    }

    @Override // com.ss.android.ugc.aweme.poi.detail.basicinfo.header.PoiDetailContentHeaderBaseAssemV3
    public final void H3(View view) {
        PoiListApi.PoiDetailResponse poiDetailResponse;
        C190497dl c190497dl;
        String str;
        String str2;
        String str3;
        C190497dl c190497dl2;
        C190497dl c190497dl3;
        C190497dl c190497dl4;
        o.LJIIIZ(view, "view");
        String str4 = ((PoiDetailInfoViewModel) this.LJLJJLL.getValue()).LJLIL;
        C190407dc O3 = O3();
        if (O3 != null && (poiDetailResponse = O3.LJLILLLLZI) != null) {
            I3(poiDetailResponse, str4);
            L3(poiDetailResponse, str4);
            F3(poiDetailResponse);
            C190497dl c190497dl5 = null;
            if (str4 != null) {
                boolean LIZJ = C45243HpH.LIZJ(view, "view.context");
                C190407dc O32 = O3();
                if (O32 != null && (c190497dl4 = O32.LJLJI) != null) {
                    str = c190497dl4.LJLJJI;
                } else {
                    str = null;
                }
                C190407dc O33 = O3();
                if (O33 != null && (c190497dl3 = O33.LJLJI) != null) {
                    str2 = c190497dl3.LJLJJL;
                } else {
                    str2 = null;
                }
                C190407dc O34 = O3();
                if (O34 != null && (c190497dl2 = O34.LJLJI) != null) {
                    str3 = c190497dl2.LJLJJLL;
                } else {
                    str3 = null;
                }
                M3(str4, LIZJ, poiDetailResponse, str, str2, str3);
            }
            C190407dc O35 = O3();
            if (O35 != null) {
                c190497dl = O35.LJLJI;
            } else {
                c190497dl = null;
            }
            C3(str4, poiDetailResponse, c190497dl);
            Context context = view.getContext();
            o.LJIIIIZZ(context, "view.context");
            C190407dc O36 = O3();
            if (O36 != null) {
                c190497dl5 = O36.LJLJI;
            }
            E3(str4, poiDetailResponse, context, c190497dl5);
        }
    }
}

package com.ss.android.ugc.aweme.poi.detail.basicinfo.header.old;

import X.C190417dd;
import X.C190497dl;
import X.C190617dx;
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
public final class PoiDetailContentHeaderIndependentAssem extends PoiDetailContentHeaderBaseAssem {
    public final C55749LuL LJLJJL;
    public final C214298b3 LJLJJLL;

    public PoiDetailContentHeaderIndependentAssem() {
        new LinkedHashMap();
        this.LJLJJL = new C55749LuL(C47704Ins.LJ(this, C190417dd.class, "PoiDetailContentHeaderHierarchyData"), checkSupervisorPrepared());
        C9BE c9be = C9BE.LIZ;
        C65776Prg LIZ = C65352Pkq.LIZ(PoiDetailInfoViewModel.class);
        this.LJLJJLL = C78926UyI.LJ(this, LIZ, c9be, new AqS153S0100000_3(LIZ, 716), C190617dx.INSTANCE, null);
    }

    public final C190417dd N3() {
        return (C190417dd) this.LJLJJL.getValue();
    }

    @Override // com.ss.android.ugc.aweme.poi.detail.basicinfo.header.old.PoiDetailContentHeaderBaseAssem
    public final void F3(View view) {
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
        boolean z = ((PoiDetailInfoViewModel) this.LJLJJLL.getValue()).LJLJJI;
        C190417dd N3 = N3();
        if (N3 != null && (poiDetailResponse = N3.LJLILLLLZI) != null) {
            H3(poiDetailResponse, str4);
            L3(poiDetailResponse, z);
            E3(poiDetailResponse);
            C190497dl c190497dl5 = null;
            if (str4 != null) {
                boolean LIZJ = C45243HpH.LIZJ(view, "view.context");
                C190417dd N32 = N3();
                if (N32 != null && (c190497dl4 = N32.LJLJI) != null) {
                    str = c190497dl4.LJLJJI;
                } else {
                    str = null;
                }
                C190417dd N33 = N3();
                if (N33 != null && (c190497dl3 = N33.LJLJI) != null) {
                    str2 = c190497dl3.LJLJJL;
                } else {
                    str2 = null;
                }
                C190417dd N34 = N3();
                if (N34 != null && (c190497dl2 = N34.LJLJI) != null) {
                    str3 = c190497dl2.LJLJJLL;
                } else {
                    str3 = null;
                }
                K3(str4, LIZJ, poiDetailResponse, str, str2, str3);
            }
            C190417dd N35 = N3();
            if (N35 != null) {
                c190497dl = N35.LJLJI;
            } else {
                c190497dl = null;
            }
            A3(str4, poiDetailResponse, c190497dl);
            Context context = view.getContext();
            o.LJIIIIZZ(context, "view.context");
            C190417dd N36 = N3();
            if (N36 != null) {
                c190497dl5 = N36.LJLJI;
            }
            C3(str4, poiDetailResponse, context, c190497dl5);
        }
    }
}

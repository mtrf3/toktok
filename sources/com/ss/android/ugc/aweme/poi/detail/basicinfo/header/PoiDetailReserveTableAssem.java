package com.ss.android.ugc.aweme.poi.detail.basicinfo.header;

import X.C16880lQ;
import X.C188727au;
import X.C190537dp;
import X.C191187es;
import X.C47704Ins;
import X.C55749LuL;
import X.FMX;
import android.view.View;
import com.bytedance.assem.arch.view.UISlotAssem;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;
import q03.IDaS483S0100000_3;

/* loaded from: classes4.dex */
public final class PoiDetailReserveTableAssem extends UISlotAssem {
    public final C55749LuL LJLJLLL;

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int v3() {
        return R.layout.c0m;
    }

    public PoiDetailReserveTableAssem() {
        new LinkedHashMap();
        this.LJLJLLL = new C55749LuL(C47704Ins.LJ(this, C190537dp.class, "PoiDetailReserveHierarchyData"), checkSupervisorPrepared());
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        C191187es c191187es;
        String str;
        String str2;
        String ttTypeCode;
        o.LJIIIZ(view, "view");
        super.onViewCreated(view);
        View findViewById = view.findViewById(R.id.htt);
        if (findViewById != null) {
            C16880lQ.LJIIJ(new IDaS483S0100000_3(this, 16, 42, 42), findViewById);
        }
        C190537dp c190537dp = (C190537dp) this.LJLJLLL.getValue();
        String str3 = null;
        if (c190537dp != null) {
            c191187es = c190537dp.LJLILLLLZI;
        } else {
            c191187es = null;
        }
        if (c191187es != null) {
            str3 = c191187es.getPoiId();
        }
        String str4 = "";
        if (str3 == null) {
            str3 = "";
        }
        if (c191187es == null || (str = c191187es.getPoiRegionCode()) == null) {
            str = "";
        }
        if (c191187es == null || (str2 = c191187es.getPoiCity()) == null) {
            str2 = "";
        }
        if (c191187es != null && (ttTypeCode = c191187es.getTtTypeCode()) != null) {
            str4 = ttTypeCode;
        }
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("enter_from", "poi_detail");
        c188727au.LJIIIZ("enter_method", "click_button");
        c188727au.LJIIIZ("poi_id", str3);
        c188727au.LJIIIZ("poi_city", str2);
        c188727au.LJIIIZ("poi_region_code", str);
        c188727au.LJIIIZ("tt_type_code", str4);
        FMX.LJIIL("show_reserve_button", c188727au.LIZ);
    }
}

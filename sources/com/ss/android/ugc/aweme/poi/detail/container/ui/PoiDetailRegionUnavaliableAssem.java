package com.ss.android.ugc.aweme.poi.detail.container.ui;

import X.C2068389v;
import X.C73305Spp;
import X.C73306Spq;
import android.content.Context;
import android.view.View;
import com.bytedance.assem.arch.dynamic.DynamicAssem;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AqS167S0100000_1;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class PoiDetailRegionUnavaliableAssem extends DynamicAssem {
    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int v3() {
        return R.layout.c0l;
    }

    public PoiDetailRegionUnavaliableAssem() {
        new LinkedHashMap();
    }

    @Override // com.bytedance.assem.arch.dynamic.DynamicAssem, com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        String string;
        o.LJIIIZ(view, "view");
        assembleChildren();
        C73305Spp c73305Spp = (C73305Spp) view.findViewById(R.id.kf_);
        Context context = getContext();
        String str = null;
        if (context != null) {
            str = context.getString(R.string.p40);
        }
        String str2 = "";
        if (str == null) {
            str = "";
        }
        Context context2 = getContext();
        if (context2 != null && (string = context2.getString(R.string.p3z)) != null) {
            str2 = string;
        }
        if (c73305Spp == null) {
            return;
        }
        c73305Spp.setVisibility(0);
        C73306Spq c73306Spq = new C73306Spq();
        C2068389v c2068389v = new C2068389v();
        c2068389v.LIZ = R.raw.icon_large_map_pin;
        c2068389v.LJ = Integer.valueOf(R.attr.gp);
        c73306Spq.LIZJ = 0;
        c73306Spq.LIZIZ = c2068389v;
        c73306Spq.LJFF = str;
        c73306Spq.LJI = str2;
        c73306Spq.LJII = new AqS167S0100000_1(this, 185);
        c73305Spp.setStatus(c73306Spq);
    }
}

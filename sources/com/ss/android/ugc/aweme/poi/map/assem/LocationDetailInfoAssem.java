package com.ss.android.ugc.aweme.poi.map.assem;

import X.C16880lQ;
import X.C190907eQ;
import X.C190977eX;
import X.C191047ee;
import X.C214298b3;
import X.C47704Ins;
import X.C55749LuL;
import X.C65352Pkq;
import X.C65776Prg;
import X.C78926UyI;
import X.C8YN;
import X.C90193gN;
import X.C9BE;
import X.TBT;
import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.poi.detail.container.PoiListApi;
import com.ss.android.ugc.aweme.poi.map.PoiMapViewModel;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AqS153S0100000_3;
import kotlin.jvm.internal.AqS185S0100000_3;
import kotlin.jvm.internal.o;
import q03.IDaS483S0100000_3;

/* loaded from: classes4.dex */
public final class LocationDetailInfoAssem extends UIContentAssem {
    public final C55749LuL LJLIL;
    public final C214298b3 LJLILLLLZI;
    public FrameLayout LJLJI;
    public TextView LJLJJI;
    public TextView LJLJJL;

    public LocationDetailInfoAssem() {
        new LinkedHashMap();
        this.LJLIL = new C55749LuL(C47704Ins.LIZJ(this, C190907eQ.class, "LocationDetailInfoHierarchyData"), checkSupervisorPrepared());
        C9BE c9be = C9BE.LIZ;
        C65776Prg LIZ = C65352Pkq.LIZ(PoiMapViewModel.class);
        this.LJLILLLLZI = C78926UyI.LJ(this, LIZ, c9be, new AqS153S0100000_3(LIZ, 767), C191047ee.INSTANCE, null);
    }

    public final PoiListApi.PoiDetailResponse v3() {
        return ((C190977eX) ((AssemViewModel) this.LJLILLLLZI.getValue()).getState()).LJLIL.LIZ();
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        int i;
        o.LJIIIZ(view, "view");
        super.onViewCreated(view);
        View onViewCreated$lambda$1 = view.findViewById(R.id.dep);
        o.LJIIIIZZ(onViewCreated$lambda$1, "onViewCreated$lambda$1");
        C16880lQ.LJIIJ(new IDaS483S0100000_3(this, 17, 42, 42), onViewCreated$lambda$1);
        o.LJIIIIZZ(onViewCreated$lambda$1, "view.findViewById<FrameL…)\n            }\n        }");
        this.LJLJI = (FrameLayout) onViewCreated$lambda$1;
        View findViewById = view.findViewById(R.id.mec);
        o.LJIIIIZZ(findViewById, "view.findViewById(R.id.tv_poi_name)");
        this.LJLJJI = (TextView) findViewById;
        View findViewById2 = view.findViewById(R.id.me_);
        o.LJIIIIZZ(findViewById2, "view.findViewById(R.id.tv_poi_address)");
        this.LJLJJL = (TextView) findViewById2;
        Context context = getContext();
        if (context != null) {
            TextView textView = this.LJLJJI;
            if (textView != null) {
                int i2 = 3;
                if (C90193gN.LIZIZ(context)) {
                    i = 4;
                } else {
                    i = 3;
                }
                textView.setTextDirection(i);
                TextView textView2 = this.LJLJJL;
                if (textView2 != null) {
                    if (C90193gN.LIZIZ(context)) {
                        i2 = 4;
                    }
                    textView2.setTextDirection(i2);
                } else {
                    o.LJIJI("tvPoiAddress");
                    throw null;
                }
            } else {
                o.LJIJI("tvPoiName");
                throw null;
            }
        }
        C8YN.LJII(this, (AssemViewModel) this.LJLILLLLZI.getValue(), new TBT() { // from class: X.7ed
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C190977eX) obj).LJLILLLLZI;
            }
        }, null, new AqS185S0100000_3(this, 66), 6);
    }
}

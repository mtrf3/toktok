package com.ss.android.ugc.aweme.poi.map.assem;

import X.ActivityC45651qj;
import X.C191027ec;
import X.C191127em;
import X.C191207eu;
import X.C191237ex;
import X.C191247ey;
import X.C191437fH;
import X.C1B3;
import X.C214298b3;
import X.C225248si;
import X.C45804HyK;
import X.C47704Ins;
import X.C55749LuL;
import X.C65352Pkq;
import X.C65776Prg;
import X.C78926UyI;
import X.C9BE;
import X.EnumC191217ev;
import X.InterfaceC191227ew;
import X.M3W;
import android.content.Context;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.ss.android.ugc.aweme.mapapi.IPoiMapService;
import com.ss.android.ugc.aweme.poi.map.PoiMapViewModel;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AqS134S0200000_3;
import kotlin.jvm.internal.AqS153S0100000_3;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class PoiDynamicMapAssem extends UIContentAssem {
    public final C214298b3 LJLIL;
    public final C55749LuL LJLILLLLZI;
    public C191207eu LJLJI;

    public PoiDynamicMapAssem() {
        new LinkedHashMap();
        C9BE c9be = C9BE.LIZ;
        C65776Prg LIZ = C65352Pkq.LIZ(PoiMapViewModel.class);
        this.LJLIL = C78926UyI.LJ(this, LIZ, c9be, new AqS153S0100000_3(LIZ, 768), C191127em.INSTANCE, null);
        this.LJLILLLLZI = new C55749LuL(C47704Ins.LIZJ(this, C191027ec.class, "PoiDynamicMapHierarchyData"), checkSupervisorPrepared());
    }

    public final PoiMapViewModel v3() {
        return (PoiMapViewModel) this.LJLIL.getValue();
    }

    public final void x3() {
        C225248si.LJIJI("poi_map", ((C191027ec) this.LJLILLLLZI.getValue()).LJLIL);
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        Context context;
        ActivityC45651qj LJJIFFI;
        FragmentManager supportFragmentManager;
        o.LJIIIZ(view, "view");
        super.onViewCreated(view);
        M3W.LIZ.getClass();
        IPoiMapService LIZ = M3W.LIZ();
        C191237ex c191237ex = new C191237ex();
        EnumC191217ev enumC191217ev = EnumC191217ev.MAP_TYPE_NORMAL;
        o.LJIIIZ(enumC191217ev, "<set-?>");
        c191237ex.LIZJ = enumC191217ev;
        c191237ex.LJ = true;
        Context context2 = view.getContext();
        o.LJIIIIZZ(context2, "view.context");
        c191237ex.LIZLLL = C191437fH.LIZJ(context2);
        InterfaceC191227ew LIZ2 = LIZ.LIZ(new C191247ey(c191237ex));
        Fragment LIZIZ = LIZ2.LIZIZ();
        if (LIZIZ != null && (context = getContext()) != null && (LJJIFFI = C45804HyK.LJJIFFI(context)) != null && (supportFragmentManager = LJJIFFI.getSupportFragmentManager()) != null) {
            C1B3 c1b3 = new C1B3(supportFragmentManager);
            c1b3.LJIIIIZZ(R.id.des, 1, LIZIZ, null);
            c1b3.LJIILJJIL();
        }
        LIZ2.LIZ(new AqS134S0200000_3(this, view, 126));
    }
}

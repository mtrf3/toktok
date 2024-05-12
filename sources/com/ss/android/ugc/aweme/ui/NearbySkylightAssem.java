package com.ss.android.ugc.aweme.ui;

import X.C110614Vt;
import X.C16880lQ;
import X.C47704Ins;
import X.C54485LZx;
import X.C55749LuL;
import X.C71313Ryn;
import X.C7MY;
import X.LZV;
import X.SY4;
import Y.ACListenerS29S0100000_9;
import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import com.ss.android.ugc.tiktok.location.serviceimpl.LocationServiceImpl;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class NearbySkylightAssem extends NearbySkylightBaseAssem {
    public SY4 LLFF;
    public View LLFFF;
    public final C55749LuL LLFII;

    @Override // com.ss.android.ugc.aweme.ui.NearbySkylightBaseAssem
    public final boolean O3() {
        return true;
    }

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int v3() {
        return R.layout.bwo;
    }

    public NearbySkylightAssem() {
        new LinkedHashMap();
        this.LLFII = new C55749LuL(C47704Ins.LIZJ(this, LZV.class, "NearbyFeedContentHierarchyData"), checkSupervisorPrepared());
    }

    @Override // com.ss.android.ugc.aweme.ui.NearbySkylightBaseAssem
    public final int N3() {
        return C7MY.LIZIZ(16);
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.C8W0
    public final void onDestroy() {
        super.onDestroy();
        C54485LZx.LIZ(false);
    }

    @Override // X.C8W0
    public final void onResume() {
        super.onResume();
        Context context = getContext();
        if (context != null && LocationServiceImpl.LJIJJ().LJIILLIIL(0, context)) {
            I3(null);
        }
    }

    @Override // com.ss.android.ugc.aweme.ui.NearbySkylightBaseAssem, com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        Integer num;
        Integer num2;
        Integer num3;
        Integer num4;
        Resources resources;
        Resources resources2;
        Resources resources3;
        Resources resources4;
        o.LJIIIZ(view, "view");
        super.onViewCreated(view);
        View findViewById = view.findViewById(R.id.l1r);
        o.LJIIIIZZ(findViewById, "view.findViewById(R.id.tb_turn_on)");
        SY4 sy4 = (SY4) findViewById;
        this.LLFF = sy4;
        C110614Vt c110614Vt = new C110614Vt();
        Context context = getContext();
        if (context != null && (resources4 = context.getResources()) != null) {
            num = Integer.valueOf(resources4.getColor(R.color.c7));
        } else {
            num = null;
        }
        c110614Vt.LIZ = num;
        Context context2 = getContext();
        if (context2 != null && (resources3 = context2.getResources()) != null) {
            num2 = Integer.valueOf(resources3.getColor(R.color.c7));
        } else {
            num2 = null;
        }
        c110614Vt.LJ = num2;
        c110614Vt.LIZJ = Float.valueOf(C7MY.LIZIZ(2));
        Context context3 = view.getContext();
        o.LJIIIIZZ(context3, "view.context");
        sy4.setBackground(c110614Vt.LIZ(context3));
        View findViewById2 = view.findViewById(R.id.bcm);
        o.LJIIIIZZ(findViewById2, "view.findViewById(R.id.cl_content_container)");
        this.LLFFF = findViewById2;
        C110614Vt c110614Vt2 = new C110614Vt();
        Context context4 = getContext();
        if (context4 != null && (resources2 = context4.getResources()) != null) {
            num3 = Integer.valueOf(resources2.getColor(R.color.b1));
        } else {
            num3 = null;
        }
        c110614Vt2.LIZ = num3;
        Context context5 = getContext();
        if (context5 != null && (resources = context5.getResources()) != null) {
            num4 = Integer.valueOf(resources.getColor(R.color.b1));
        } else {
            num4 = null;
        }
        c110614Vt2.LJ = num4;
        c110614Vt2.LIZJ = Float.valueOf(C7MY.LIZIZ(8));
        C71313Ryn.LIZIZ(view, "view.context", c110614Vt2, findViewById2);
        SY4 sy42 = this.LLFF;
        if (sy42 != null) {
            C16880lQ.LJJIZ(sy42, new ACListenerS29S0100000_9(this, 74));
            View view2 = this.LLFFF;
            if (view2 != null) {
                C16880lQ.LJIIJ(new ACListenerS29S0100000_9(this, 75), view2);
                return;
            } else {
                o.LJIJI("clContentContainer");
                throw null;
            }
        }
        o.LJIJI("turnOnBtn");
        throw null;
    }
}

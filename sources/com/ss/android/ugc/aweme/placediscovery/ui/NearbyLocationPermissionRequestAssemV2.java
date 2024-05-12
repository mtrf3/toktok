package com.ss.android.ugc.aweme.placediscovery.ui;

import X.C110614Vt;
import X.C16880lQ;
import X.C2K0;
import X.C71313Ryn;
import X.C79045V0n;
import X.C7MY;
import X.InterfaceC55102Lju;
import X.SY4;
import X.ViewOnClickListenerC54551Lb1;
import Y.ACListenerS29S0100000_9;
import android.content.Context;
import android.view.View;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class NearbyLocationPermissionRequestAssemV2 extends NearbyLocationPermissionRequestBaseAssem implements InterfaceC55102Lju {
    public SY4 LJLLILLLL;
    public View LJLLJ;

    @Override // X.InterfaceC55102Lju
    public final C2K0 provideAbility(String str) {
        if (str.hashCode() != -482206377) {
            return null;
        }
        return this;
    }

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int v3() {
        return R.layout.bwo;
    }

    public NearbyLocationPermissionRequestAssemV2() {
        new LinkedHashMap();
    }

    @Override // com.ss.android.ugc.aweme.placediscovery.ui.NearbyLocationPermissionRequestBaseAssem, com.ss.android.ugc.aweme.api.NearbyBaseVAbility
    public final void ia() {
        super.ia();
        getContainerView().setVisibility(4);
    }

    @Override // com.ss.android.ugc.aweme.placediscovery.ui.NearbyLocationPermissionRequestBaseAssem, com.ss.android.ugc.aweme.api.NearbyBaseVAbility
    public final void v20() {
        super.v20();
        SY4 sy4 = this.LJLLILLLL;
        if (sy4 != null) {
            sy4.setVisibility(0);
            View view = this.LJLLJ;
            if (view != null) {
                view.setVisibility(0);
                return;
            } else {
                o.LJIJI("clContentContainer");
                throw null;
            }
        }
        o.LJIJI("turnOnBtn");
        throw null;
    }

    @Override // com.ss.android.ugc.aweme.placediscovery.ui.NearbyLocationPermissionRequestBaseAssem, com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        Integer num;
        Integer num2;
        Integer num3;
        Integer num4;
        o.LJIIIZ(view, "view");
        super.onViewCreated(view);
        View findViewById = view.findViewById(R.id.l1r);
        o.LJIIIIZZ(findViewById, "view.findViewById(R.id.tb_turn_on)");
        SY4 sy4 = (SY4) findViewById;
        this.LJLLILLLL = sy4;
        C110614Vt c110614Vt = new C110614Vt();
        Context context = getContext();
        if (context != null) {
            num = C79045V0n.LJI(R.attr.eb, context);
        } else {
            num = null;
        }
        c110614Vt.LIZ = num;
        Context context2 = getContext();
        if (context2 != null) {
            num2 = C79045V0n.LJI(R.attr.eb, context2);
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
        this.LJLLJ = findViewById2;
        C110614Vt c110614Vt2 = new C110614Vt();
        Context context4 = getContext();
        if (context4 != null) {
            num3 = C79045V0n.LJI(R.attr.d1, context4);
        } else {
            num3 = null;
        }
        c110614Vt2.LIZ = num3;
        Context context5 = getContext();
        if (context5 != null) {
            num4 = C79045V0n.LJI(R.attr.d1, context5);
        } else {
            num4 = null;
        }
        c110614Vt2.LJ = num4;
        c110614Vt2.LIZJ = Float.valueOf(C7MY.LIZIZ(8));
        C71313Ryn.LIZIZ(view, "view.context", c110614Vt2, findViewById2);
        SY4 sy42 = this.LJLLILLLL;
        if (sy42 != null) {
            C16880lQ.LJJIZ(sy42, new ACListenerS29S0100000_9(this, 47));
            View view2 = this.LJLLJ;
            if (view2 != null) {
                C16880lQ.LJIIJ(ViewOnClickListenerC54551Lb1.LJLIL, view2);
                SY4 sy43 = this.LJLLILLLL;
                if (sy43 != null) {
                    sy43.setVisibility(0);
                    View view3 = this.LJLLJ;
                    if (view3 != null) {
                        view3.setVisibility(0);
                        if (gP()) {
                            getContainerView().setVisibility(0);
                            getContainerView().requestLayout();
                            return;
                        } else {
                            getContainerView().setVisibility(4);
                            return;
                        }
                    }
                    o.LJIJI("clContentContainer");
                    throw null;
                }
                o.LJIJI("turnOnBtn");
                throw null;
            }
            o.LJIJI("clContentContainer");
            throw null;
        }
        o.LJIJI("turnOnBtn");
        throw null;
    }
}

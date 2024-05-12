package com.ss.android.ugc.aweme.tablet;

import X.C120954ot;
import X.C16880lQ;
import X.C198517qh;
import X.C53917LEb;
import X.C53925LEj;
import X.FMX;
import X.InterfaceC40368Fsq;
import X.InterfaceC48243IwZ;
import X.InterfaceC53931LEp;
import X.LEP;
import X.LF2;
import X.LF5;
import X.LFY;
import android.app.Activity;
import com.ss.android.ugc.aweme.tablet.api.ITabletService;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class TabletServiceProxy implements ITabletService {
    @Override // com.ss.android.ugc.aweme.tablet.api.ITabletService
    public final InterfaceC53931LEp LIZLLL() {
        if (LF2.LIZJ()) {
            return C53917LEb.LIZ;
        }
        return C53925LEj.LIZ;
    }

    @Override // com.ss.android.ugc.aweme.tablet.api.ITabletService
    public final InterfaceC40368Fsq LIZ() {
        return LFY.LIZ;
    }

    @Override // com.ss.android.ugc.aweme.tablet.api.ITabletService
    public final InterfaceC48243IwZ LIZJ() {
        return LF5.LIZ;
    }

    @Override // com.ss.android.ugc.aweme.tablet.api.ITabletService
    public final void LIZIZ(Activity activity) {
        o.LJIIIZ(activity, "activity");
        try {
            int i = 1;
            if (LF2.LIZJ() && LEP.LIZ(activity)) {
                activity.setRequestedOrientation(13);
            } else {
                if (activity.getResources().getConfiguration().orientation != 1) {
                    C198517qh c198517qh = new C198517qh();
                    c198517qh.LIZ.put("page_name", C16880lQ.LJLLJ(activity.getClass()));
                    c198517qh.LIZ.put("class_name", C16880lQ.LJLLILLLL(activity.getClass()));
                    c198517qh.LIZ.put("enter_method", "tryRotateScreen");
                    FMX.LJIILJJIL("fix_activity_orientation_phone", c198517qh.LJ());
                }
                activity.setRequestedOrientation(1);
                i = 0;
            }
            C120954ot.LIZ(i, "landscape");
        } catch (IllegalStateException unused) {
        }
    }
}

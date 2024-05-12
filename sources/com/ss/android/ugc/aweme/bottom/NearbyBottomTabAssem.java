package com.ss.android.ugc.aweme.bottom;

import X.ActivityC45651qj;
import X.AnonymousClass391;
import X.C16880lQ;
import X.C212428Vi;
import X.C26338AVi;
import X.C32151Nz;
import X.C53095Ksd;
import X.C55096Ljo;
import X.C55230Lly;
import X.C86V;
import X.InterfaceC55235Lm3;
import X.LJ1;
import X.O6R;
import Y.ACListenerS29S0100000_9;
import android.view.View;
import android.widget.TextView;
import com.bytedance.assem.arch.view.UISlotAssem;
import com.ss.android.ugc.aweme.interfaces.INearbyBottomTabAbility;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class NearbyBottomTabAssem extends UISlotAssem {
    public LJ1 LJLJLLL;
    public NearbyBottomTabAssem$onParentSet$1$1 LJLL;

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int v3() {
        return R.layout.bw1;
    }

    public NearbyBottomTabAssem() {
        new LinkedHashMap();
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.C8W0
    public final void onDestroy() {
        super.onDestroy();
        ActivityC45651qj LIZ = C212428Vi.LIZ(this);
        if (LIZ != null) {
            C55096Ljo.LJIILL(C55230Lly.LIZLLL(LIZ, null), INearbyBottomTabAbility.class, null);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [com.ss.android.ugc.aweme.bottom.NearbyBottomTabAssem$onParentSet$1$1] */
    @Override // X.C8W0
    public final void onParentSet() {
        super.onParentSet();
        final ActivityC45651qj LIZ = C212428Vi.LIZ(this);
        if (LIZ != null) {
            this.LJLL = new NearbyBottomTabAbility(LIZ) { // from class: com.ss.android.ugc.aweme.bottom.NearbyBottomTabAssem$onParentSet$1$1
                @Override // com.ss.android.ugc.aweme.interfaces.INearbyBottomTabAbility
                public final LJ1 eb0(ActivityC45651qj activity) {
                    o.LJIIIZ(activity, "activity");
                    LJ1 lj1 = this.LJLJLLL;
                    if (lj1 != null) {
                        return lj1;
                    }
                    o.LJIJI("nearbyTopTabViewImpl");
                    throw null;
                }
            };
            InterfaceC55235Lm3 LIZLLL = C55230Lly.LIZLLL(LIZ, null);
            NearbyBottomTabAssem$onParentSet$1$1 nearbyBottomTabAssem$onParentSet$1$1 = this.LJLL;
            if (nearbyBottomTabAssem$onParentSet$1$1 != null) {
                C55096Ljo.LJIIJJI(LIZLLL, nearbyBottomTabAssem$onParentSet$1$1, INearbyBottomTabAbility.class, null);
            } else {
                o.LJIJI("nearbyBottomTabAbility");
                throw null;
            }
        }
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        o.LJIIIZ(view, "view");
        super.onViewCreated(view);
        String LJFF = C86V.LJFF(R.string.il9);
        o.LJIIIIZZ(LJFF, "getString(R.string.nearby_tab_name)");
        LJ1 lj1 = new LJ1(view, LJFF);
        this.LJLJLLL = lj1;
        C16880lQ.LJIJI(lj1.LIZIZ(), new ACListenerS29S0100000_9(this, 8));
        if (C53095Ksd.LIZ()) {
            LJ1 lj12 = this.LJLJLLL;
            if (lj12 != null) {
                TextView LIZIZ = lj12.LIZIZ();
                C26338AVi.LJIIIZ(LIZIZ, AnonymousClass391.LIZJ(0), null, Integer.valueOf(O6R.LJJIIZ(C32151Nz.LJIIZILJ(0))), null, 26);
                LIZIZ.setCompoundDrawablePadding(O6R.LJJIIZ(C32151Nz.LJIIZILJ(2)));
                return;
            }
            o.LJIJI("nearbyTopTabViewImpl");
            throw null;
        }
    }
}

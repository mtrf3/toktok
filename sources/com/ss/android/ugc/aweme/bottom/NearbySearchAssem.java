package com.ss.android.ugc.aweme.bottom;

import X.C16880lQ;
import X.C55096Ljo;
import android.view.View;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.interfaces.INearbyBottomTabAbility;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class NearbySearchAssem extends UIContentAssem implements View.OnClickListener {
    public TuxIconView LJLIL;

    public NearbySearchAssem() {
        new LinkedHashMap();
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        INearbyBottomTabAbility iNearbyBottomTabAbility = (INearbyBottomTabAbility) C55096Ljo.LIZ(C55096Ljo.LJIIZILJ(this), INearbyBottomTabAbility.class, null);
        if (iNearbyBottomTabAbility != null) {
            iNearbyBottomTabAbility.U4("", "homepage_nearby");
        }
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        o.LJIIIZ(view, "view");
        super.onViewCreated(view);
        View findViewById = view.findViewById(R.id.e9u);
        o.LJIIIIZZ(findViewById, "view.findViewById(R.id.ic_nearby_search)");
        TuxIconView tuxIconView = (TuxIconView) findViewById;
        this.LJLIL = tuxIconView;
        tuxIconView.setVisibility(0);
        TuxIconView tuxIconView2 = this.LJLIL;
        if (tuxIconView2 != null) {
            C16880lQ.LJJJ(tuxIconView2, this);
        } else {
            o.LJIJI("nearbySearch");
            throw null;
        }
    }
}

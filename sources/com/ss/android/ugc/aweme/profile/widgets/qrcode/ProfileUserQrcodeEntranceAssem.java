package com.ss.android.ugc.aweme.profile.widgets.qrcode;

import X.C16880lQ;
import X.C188727au;
import X.C44384HbQ;
import X.C9AC;
import X.C9AE;
import X.FMX;
import Y.ARunnableS23S0200000_4;
import android.view.View;
import android.view.ViewParent;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.bytedance.tux.icon.TuxIconView;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;
import q03.IDaS484S0100000_4;

/* loaded from: classes5.dex */
public final class ProfileUserQrcodeEntranceAssem extends UIContentAssem {
    public TuxIconView LJLIL;

    public ProfileUserQrcodeEntranceAssem() {
        new LinkedHashMap();
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        Object obj;
        ViewParent parent;
        ViewParent parent2;
        o.LJIIIZ(view, "view");
        TuxIconView tuxIconView = (TuxIconView) view;
        this.LJLIL = tuxIconView;
        tuxIconView.setIconRes(R.raw.icon_qr_code);
        tuxIconView.setTintColorRes(R.attr.gv);
        tuxIconView.setVisibility(0);
        C9AE.LIZ(view, C9AC.ALPHA, 0.0f);
        if (C44384HbQ.LLFF(this.LJLIL)) {
            TuxIconView tuxIconView2 = this.LJLIL;
            if (tuxIconView2 != null && (parent = tuxIconView2.getParent()) != null && (parent2 = parent.getParent()) != null) {
                obj = parent2.getParent();
            } else {
                obj = null;
            }
            o.LJII(obj, "null cannot be cast to non-null type android.view.View");
            View view2 = (View) obj;
            view2.post(new ARunnableS23S0200000_4(this, view2, 19));
        }
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("enter_from", "personal_homepage");
        c188727au.LJIIIZ("action_type", "show");
        FMX.LJIIL("qr_code_icon", c188727au.LIZ);
        TuxIconView tuxIconView3 = this.LJLIL;
        if (tuxIconView3 != null) {
            C16880lQ.LJIIJ(new IDaS484S0100000_4(this, 11), tuxIconView3);
        }
        TuxIconView tuxIconView4 = this.LJLIL;
        if (tuxIconView4 == null) {
            return;
        }
        tuxIconView4.setContentDescription(C44384HbQ.LJJZ(R.string.aot));
    }
}

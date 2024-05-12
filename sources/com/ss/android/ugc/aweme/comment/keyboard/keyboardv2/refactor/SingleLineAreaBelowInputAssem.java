package com.ss.android.ugc.aweme.comment.keyboard.keyboardv2.refactor;

import X.C175276uJ;
import X.C178006yi;
import X.C214298b3;
import X.C55096Ljo;
import X.C65352Pkq;
import X.C65776Prg;
import X.C78926UyI;
import X.C8VV;
import X.C8YN;
import X.C9BE;
import X.TBT;
import android.view.View;
import android.widget.LinearLayout;
import com.bytedance.assem.arch.view.UISlotAssem;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AqS153S0100000_3;
import kotlin.jvm.internal.AqS169S0100000_3;
import kotlin.jvm.internal.AqS185S0100000_3;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class SingleLineAreaBelowInputAssem extends UISlotAssem {
    public final C214298b3 LJLJLLL;
    public LinearLayout LJLL;

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int v3() {
        return R.layout.r2;
    }

    public SingleLineAreaBelowInputAssem() {
        new LinkedHashMap();
        C9BE c9be = C9BE.LIZ;
        C65776Prg LIZ = C65352Pkq.LIZ(KeyboardVMV2.class);
        this.LJLJLLL = C78926UyI.LJ(this, LIZ, c9be, new AqS153S0100000_3(LIZ, 118), C178006yi.INSTANCE, null);
    }

    @Override // X.C8W0
    public final void onParentSet() {
        super.onParentSet();
        C55096Ljo.LIZJ(this);
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        o.LJIIIZ(view, "view");
        super.onViewCreated(view);
        o.LJIIIIZZ(view.findViewById(R.id.g6x), "view.findViewById(R.id.ll_upvote_checkbox)");
        View findViewById = view.findViewById(R.id.k0u);
        o.LJIIIIZZ(findViewById, "view.findViewById(R.id.s…_line_icon_group_wrapper)");
        this.LJLL = (LinearLayout) findViewById;
        C8VV.LIZJ(this, new AqS169S0100000_3(this, 85));
        if (C175276uJ.LIZ()) {
            LinearLayout linearLayout = this.LJLL;
            if (linearLayout != null) {
                linearLayout.setVisibility(0);
                C8YN.LJII(this, this.LJLJLLL.getValue(), new TBT() { // from class: X.6yf
                    @Override // X.TBT, X.TBZ, X.TBW
                    public final Object get(Object obj) {
                        return Boolean.valueOf(((C177616y5) obj).LLD);
                    }
                }, null, new AqS185S0100000_3(this, 38), 6);
            } else {
                o.LJIJI("iconGroupWrapper");
                throw null;
            }
        }
    }
}

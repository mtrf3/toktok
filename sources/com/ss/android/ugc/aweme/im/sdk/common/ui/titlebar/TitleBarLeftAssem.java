package com.ss.android.ugc.aweme.im.sdk.common.ui.titlebar;

import X.C16880lQ;
import X.C187087Vw;
import X.C214298b3;
import X.C214528bQ;
import X.C2K0;
import X.C47704Ins;
import X.C4LU;
import X.C55096Ljo;
import X.C55749LuL;
import X.C65352Pkq;
import X.C65776Prg;
import X.C78926UyI;
import X.C8YN;
import X.InterfaceC55102Lju;
import X.TBT;
import Y.ACListenerS23S0100000_3;
import android.view.View;
import com.bytedance.assem.arch.view.UISlotAssem;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.tux.icon.TuxIconView;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AqS153S0100000_3;
import kotlin.jvm.internal.AqS1S1001000_3;
import kotlin.jvm.internal.IDqS428S0100000_3;
import kotlin.jvm.internal.o;
import o3.IDaS89S0000000_3;
import o3.h0;

/* loaded from: classes4.dex */
public final class TitleBarLeftAssem extends UISlotAssem implements TitleBarLeftAbility, InterfaceC55102Lju {
    public final C55749LuL LJLJLLL;
    public final C214298b3 LJLL;
    public TuxIconView LJLLI;

    @Override // X.InterfaceC55102Lju
    public final C2K0 provideAbility(String str) {
        if (str.hashCode() != 1369642310) {
            return null;
        }
        return this;
    }

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int v3() {
        return R.layout.b8w;
    }

    public TitleBarLeftAssem() {
        new LinkedHashMap();
        this.LJLJLLL = new C55749LuL(C47704Ins.LIZJ(this, C4LU.class, null), checkSupervisorPrepared());
        C65776Prg LIZ = C65352Pkq.LIZ(TitleBarLeftViewModel.class);
        this.LJLL = new C214298b3(new AqS153S0100000_3(LIZ, 436), C214528bQ.LJLIL, C78926UyI.LJJII(this, false), C78926UyI.LJJIIJZLJL(this, false), C78926UyI.LJIJJ(this), C78926UyI.LJJI(this), C78926UyI.LJJIFFI(this), C187087Vw.INSTANCE, LIZ);
    }

    @Override // X.C8W0
    public final void onParentSet() {
        C55096Ljo.LIZJ(this);
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        o.LJIIIZ(view, "view");
        super.onViewCreated(view);
        View findViewById = view.findViewById(R.id.gwv);
        o.LJIIIIZZ(findViewById, "view.findViewById(R.id.nav_left_icon)");
        this.LJLLI = (TuxIconView) findViewById;
        o.LJIIIIZZ(view.findViewById(R.id.gww), "view.findViewById(R.id.nav_left_text)");
        h0.LJIJI(view, new IDaS89S0000000_3(4));
        C16880lQ.LJIIJ(new ACListenerS23S0100000_3(this, 87), view);
        C8YN.LJIIJ(this, (AssemViewModel) this.LJLL.getValue(), new TBT() { // from class: X.7Vv
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return Integer.valueOf(((C187107Vy) obj).LJLIL);
            }
        }, new TBT() { // from class: X.7Vx
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C187107Vy) obj).LJLILLLLZI;
            }
        }, null, new IDqS428S0100000_3(this, 7), 12);
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.common.ui.titlebar.TitleBarLeftAbility
    public final void Yg(int i, String str) {
        ((AssemViewModel) this.LJLL.getValue()).setState(new AqS1S1001000_3(i, str, 1));
    }
}

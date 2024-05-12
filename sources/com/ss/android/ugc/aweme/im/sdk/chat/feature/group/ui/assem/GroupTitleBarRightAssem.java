package com.ss.android.ugc.aweme.im.sdk.chat.feature.group.ui.assem;

import X.C100933xh;
import X.C16880lQ;
import X.C214298b3;
import X.C65352Pkq;
import X.C65776Prg;
import X.C78926UyI;
import X.C8YN;
import X.C97343ru;
import X.C9BE;
import X.InterfaceC65350Pko;
import X.TBT;
import Y.ACListenerS21S0100000_1;
import android.view.View;
import android.widget.ImageView;
import com.bytedance.assem.arch.view.UISlotAssem;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.group.viewmodel.GroupTitleBarViewModel;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AqS151S0100000_1;
import kotlin.jvm.internal.AqS183S0100000_1;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class GroupTitleBarRightAssem extends UISlotAssem {
    public final C214298b3 LJLJLLL;
    public TuxIconView LJLL;
    public TuxIconView LJLLI;
    public ImageView LJLLILLLL;

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int v3() {
        return R.layout.b8x;
    }

    public GroupTitleBarRightAssem() {
        new LinkedHashMap();
        C9BE c9be = C9BE.LIZ;
        C65776Prg LIZ = C65352Pkq.LIZ(GroupTitleBarViewModel.class);
        this.LJLJLLL = C78926UyI.LJ(this, LIZ, c9be, new AqS151S0100000_1((InterfaceC65350Pko) LIZ, 86), C100933xh.INSTANCE, null);
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        o.LJIIIZ(view, "view");
        super.onViewCreated(view);
        View findViewById = view.findViewById(R.id.eah);
        TuxIconView onViewCreated$lambda$0 = (TuxIconView) findViewById;
        o.LJIIIIZZ(onViewCreated$lambda$0, "onViewCreated$lambda$0");
        onViewCreated$lambda$0.setVisibility(0);
        onViewCreated$lambda$0.setContentDescription(C97343ru.LJFF(R.string.q2_));
        C16880lQ.LJJJ(onViewCreated$lambda$0, new ACListenerS21S0100000_1(this, 37));
        o.LJIIIIZZ(findViewById, "view.findViewById<TuxIco…}\n            }\n        }");
        this.LJLL = (TuxIconView) findViewById;
        View findViewById2 = view.findViewById(R.id.eai);
        TuxIconView onViewCreated$lambda$1 = (TuxIconView) findViewById2;
        o.LJIIIIZZ(onViewCreated$lambda$1, "onViewCreated$lambda$1");
        onViewCreated$lambda$1.setVisibility(0);
        onViewCreated$lambda$1.setContentDescription(C97343ru.LJFF(R.string.i7q));
        C16880lQ.LJJJ(onViewCreated$lambda$1, new ACListenerS21S0100000_1(this, 38));
        o.LJIIIIZZ(findViewById2, "view.findViewById<TuxIco…}\n            }\n        }");
        this.LJLLI = (TuxIconView) findViewById2;
        View findViewById3 = view.findViewById(R.id.n_y);
        o.LJIIIIZZ(findViewById3, "view.findViewById(R.id.view_dot)");
        this.LJLLILLLL = (ImageView) findViewById3;
        C8YN.LJII(this, (AssemViewModel) this.LJLJLLL.getValue(), new TBT() { // from class: X.3xi
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return Boolean.valueOf(((C100973xl) obj).LJLIL);
            }
        }, null, new AqS183S0100000_1(this, 71), 6);
        C8YN.LJII(this, (AssemViewModel) this.LJLJLLL.getValue(), new TBT() { // from class: X.3xj
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return Boolean.valueOf(((C100973xl) obj).LJLJJLL);
            }
        }, null, new AqS183S0100000_1(this, 72), 6);
    }
}

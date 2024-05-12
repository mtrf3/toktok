package com.ss.android.ugc.aweme.im.sdk.chat.feature.single.ui.assem;

import X.C16880lQ;
import X.C17N;
import X.C40W;
import X.C47704Ins;
import X.C55749LuL;
import X.C5H3;
import X.C97343ru;
import X.C98523to;
import Y.ACListenerS21S0100000_1;
import android.view.View;
import com.bytedance.assem.arch.view.UISlotAssem;
import com.bytedance.tux.icon.TuxIconView;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AqS151S0100000_1;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class SingleTitleBarRightAssem extends UISlotAssem {
    public final C55749LuL LJLJLLL;
    public final C5H3 LJLL;
    public final C5H3 LJLLI;

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int v3() {
        return R.layout.b8x;
    }

    public SingleTitleBarRightAssem() {
        new LinkedHashMap();
        this.LJLJLLL = new C55749LuL(C47704Ins.LIZJ(this, C40W.class, null), checkSupervisorPrepared());
        this.LJLL = C17N.LJJIJL(new AqS151S0100000_1(this, 162));
        this.LJLLI = C17N.LJJIJL(new AqS151S0100000_1(this, 161));
    }

    public final C98523to H3() {
        return (C98523to) this.LJLL.getValue();
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
        C16880lQ.LJJJ(onViewCreated$lambda$0, new ACListenerS21S0100000_1(this, 48));
        o.LJIIIIZZ(findViewById, "view.findViewById<TuxIco…ReportClick() }\n        }");
        View findViewById2 = view.findViewById(R.id.eai);
        TuxIconView onViewCreated$lambda$1 = (TuxIconView) findViewById2;
        o.LJIIIIZZ(onViewCreated$lambda$1, "onViewCreated$lambda$1");
        onViewCreated$lambda$1.setVisibility(0);
        onViewCreated$lambda$1.setContentDescription(C97343ru.LJFF(R.string.i7q));
        C16880lQ.LJJJ(onViewCreated$lambda$1, new ACListenerS21S0100000_1(this, 49));
        o.LJIIIIZZ(findViewById2, "view.findViewById<TuxIco…}\n            }\n        }");
    }
}

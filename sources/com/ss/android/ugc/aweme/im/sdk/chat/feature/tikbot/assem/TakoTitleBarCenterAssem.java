package com.ss.android.ugc.aweme.im.sdk.chat.feature.tikbot.assem;

import X.C100463ww;
import X.C47704Ins;
import X.C55749LuL;
import android.view.View;
import android.widget.TextView;
import com.bytedance.assem.arch.view.UISlotAssem;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class TakoTitleBarCenterAssem extends UISlotAssem {
    public final C55749LuL LJLJLLL;

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int v3() {
        return R.layout.b8u;
    }

    public TakoTitleBarCenterAssem() {
        new LinkedHashMap();
        this.LJLJLLL = new C55749LuL(C47704Ins.LIZJ(this, C100463ww.class, null), checkSupervisorPrepared());
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        o.LJIIIZ(view, "view");
        super.onViewCreated(view);
        View findViewById = view.findViewById(R.id.lao);
        o.LJIIIIZZ(findViewById, "view.findViewById(R.id.title_tv)");
        ((TextView) findViewById).setText(((C100463ww) this.LJLJLLL.getValue()).LJLIL);
    }
}

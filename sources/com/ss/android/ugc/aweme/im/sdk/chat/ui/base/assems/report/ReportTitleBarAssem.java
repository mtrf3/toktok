package com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.report;

import X.C47704Ins;
import X.C55749LuL;
import X.C89333ez;
import X.C8VV;
import android.view.View;
import com.bytedance.assem.arch.view.UISlotAssem;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AqS167S0100000_1;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class ReportTitleBarAssem extends UISlotAssem {
    public final C55749LuL LJLJLLL;

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int v3() {
        return R.layout.b8z;
    }

    public ReportTitleBarAssem() {
        new LinkedHashMap();
        this.LJLJLLL = new C55749LuL(C47704Ins.LIZJ(this, C89333ez.class, null), checkSupervisorPrepared());
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        o.LJIIIZ(view, "view");
        super.onViewCreated(view);
        C8VV.LIZJ(this, new AqS167S0100000_1(this, 133));
    }
}

package com.ss.android.ugc.aweme.im.sdk.chat.feature.group.ui.assem;

import X.C7MY;
import X.C8VV;
import android.view.View;
import com.bytedance.assem.arch.view.UISlotAssem;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AqS167S0100000_1;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class GroupTitleBarAssem extends UISlotAssem {
    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int v3() {
        return R.layout.b8z;
    }

    public GroupTitleBarAssem() {
        new LinkedHashMap();
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        o.LJIIIZ(view, "view");
        super.onViewCreated(view);
        view.getLayoutParams().height = C7MY.LIZIZ(56);
        C8VV.LIZJ(this, new AqS167S0100000_1(this, 62));
    }
}

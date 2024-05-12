package com.ss.android.ugc.aweme.im.sdk.chat.feature.single.ui.assem;

import X.C8VV;
import android.view.View;
import com.bytedance.assem.arch.view.UISlotAssem;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AqS169S0100000_3;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class SingleTitleBarAssem extends UISlotAssem {
    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int v3() {
        return R.layout.b8z;
    }

    public SingleTitleBarAssem() {
        new LinkedHashMap();
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        o.LJIIIZ(view, "view");
        super.onViewCreated(view);
        C8VV.LIZJ(this, new AqS169S0100000_3(this, 232));
    }
}

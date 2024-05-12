package com.ss.android.ugc.aweme.nows.feed.ui;

import X.C8VR;
import android.view.View;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AqS134S0200000_3;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class NowPostAttachInfoAreaAssem extends ReusedUISlotAssem<NowPostAttachInfoAreaAssem> {
    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int W3() {
        return R.layout.byc;
    }

    public NowPostAttachInfoAreaAssem() {
        new LinkedHashMap();
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        o.LJIIIZ(view, "view");
        C8VR.LIZ(this, new AqS134S0200000_3(this, view, 106));
    }
}

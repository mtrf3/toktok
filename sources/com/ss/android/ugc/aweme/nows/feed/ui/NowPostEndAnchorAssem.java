package com.ss.android.ugc.aweme.nows.feed.ui;

import X.C196157mt;
import X.C7MK;
import X.C8XO;
import X.InterfaceC194547kI;
import android.view.View;
import com.bytedance.assem.arch.reused.ReusedUIContentAssem;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AqS15S0000100_3;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class NowPostEndAnchorAssem extends ReusedUIContentAssem<NowPostEndAnchorAssem> implements C8XO<InterfaceC194547kI> {
    @Override // X.C8XO
    public final void LLLZIIL() {
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        o.LJIIIZ(view, "view");
    }

    @Override // X.C8XO
    public final void unBind() {
    }

    public NowPostEndAnchorAssem() {
        new LinkedHashMap();
    }

    @Override // X.C8XO
    public final void F0(InterfaceC194547kI item) {
        o.LJIIIZ(item, "item");
        Long l = C196157mt.LIZLLL;
        if (l != null && l.longValue() != -1 && !C196157mt.LIZIZ) {
            long longValue = l.longValue();
            C196157mt.LIZIZ = true;
            C7MK.LJII("now_performance_feed_page_first_frame_v2", new AqS15S0000100_3(longValue, 6));
        }
    }

    @Override // X.C8XO
    public final /* bridge */ /* synthetic */ boolean c2(InterfaceC194547kI interfaceC194547kI) {
        return true;
    }

    @Override // X.C8XO
    public final /* bridge */ /* synthetic */ void n3(InterfaceC194547kI interfaceC194547kI) {
    }
}

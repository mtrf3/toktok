package com.ss.android.ugc.aweme.nows.feed.ui.other.collection;

import X.C195627m2;
import X.C8VR;
import X.C8XO;
import android.view.View;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AqS134S0200000_3;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class NowOtherCollectionContainerAssem extends ReusedUISlotAssem<NowOtherCollectionContainerAssem> implements C8XO<C195627m2> {
    @Override // X.C8XO
    public final void LLLZIIL() {
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int W3() {
        return R.layout.bxv;
    }

    @Override // X.C8XO
    public final void unBind() {
    }

    public NowOtherCollectionContainerAssem() {
        new LinkedHashMap();
    }

    @Override // X.C8XO
    public final void F0(C195627m2 item) {
        o.LJIIIZ(item, "item");
    }

    @Override // X.C8XO
    public final /* bridge */ /* synthetic */ boolean c2(C195627m2 c195627m2) {
        return true;
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        o.LJIIIZ(view, "view");
        C8VR.LIZ(this, new AqS134S0200000_3(this, view, 110));
    }

    @Override // X.C8XO
    public final /* bridge */ /* synthetic */ void n3(C195627m2 c195627m2) {
    }
}

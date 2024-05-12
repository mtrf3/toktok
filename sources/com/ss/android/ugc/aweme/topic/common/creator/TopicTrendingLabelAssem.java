package com.ss.android.ugc.aweme.topic.common.creator;

import X.C185767Qu;
import X.C214298b3;
import X.C65352Pkq;
import X.C65776Prg;
import X.C78926UyI;
import X.C9BE;
import X.TBT;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.assem.arch.dynamic.DynamicAssem;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.topic.common.creator.vm.TopicSearchViewModel;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AqS153S0100000_3;
import kotlin.jvm.internal.AqS169S0100000_3;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class TopicTrendingLabelAssem extends DynamicAssem {
    public final C214298b3 LJLJLLL;

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int v3() {
        return R.layout.cst;
    }

    public TopicTrendingLabelAssem() {
        new LinkedHashMap();
        C9BE c9be = C9BE.LIZ;
        C65776Prg LIZ = C65352Pkq.LIZ(TopicSearchViewModel.class);
        this.LJLJLLL = C78926UyI.LJ(this, LIZ, c9be, new AqS153S0100000_3(LIZ, 1070), C185767Qu.INSTANCE, null);
    }

    @Override // com.bytedance.assem.arch.dynamic.DynamicAssem, com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        o.LJIIIZ(view, "view");
        Object obj = getConfig().LJ.get("not_show");
        if (!(obj instanceof Boolean)) {
            obj = null;
        }
        if (o.LJ(obj, Boolean.TRUE)) {
            View x3 = x3();
            ViewGroup.LayoutParams layoutParams = x3().getLayoutParams();
            layoutParams.height = 1;
            x3.setLayoutParams(layoutParams);
            return;
        }
        AssemViewModel.asyncSubscribe$default((AssemViewModel) this.LJLJLLL.getValue(), new TBT() { // from class: X.7Qt
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj2) {
                C182347Dq c182347Dq = (C182347Dq) obj2;
                c182347Dq.getClass();
                return C208708Ha.LIZLLL(c182347Dq);
            }
        }, null, null, null, new AqS169S0100000_3(this, 488), 14, null);
    }
}

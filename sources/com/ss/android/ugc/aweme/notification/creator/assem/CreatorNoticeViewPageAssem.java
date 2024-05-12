package com.ss.android.ugc.aweme.notification.creator.assem;

import X.C213688a4;
import X.C214298b3;
import X.C5H3;
import X.C65352Pkq;
import X.C65776Prg;
import X.C78926UyI;
import X.C9BD;
import X.MUX;
import X.TBT;
import X.V1B;
import android.view.View;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.notification.creator.vm.CreatorNoticeTabVM;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AqS159S0100000_9;
import kotlin.jvm.internal.AqS175S0100000_9;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class CreatorNoticeViewPageAssem extends UIContentAssem {
    public final C214298b3 LJLILLLLZI;
    public boolean LJLJI;
    public final Map<Integer, View> LJLJJI = new LinkedHashMap();
    public final C5H3 LJLIL = V1B.LJZI(new AqS159S0100000_9(this, 381));

    public CreatorNoticeViewPageAssem() {
        C9BD c9bd = C9BD.LIZ;
        C65776Prg LIZ = C65352Pkq.LIZ(CreatorNoticeTabVM.class);
        this.LJLILLLLZI = C78926UyI.LJ(this, LIZ, c9bd, new AqS159S0100000_9(LIZ, 380), MUX.INSTANCE, null);
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        o.LJIIIZ(view, "view");
        super.onViewCreated(view);
        AssemViewModel.asyncSubscribe$default((AssemViewModel) this.LJLILLLLZI.getValue(), new TBT() { // from class: X.MUV
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((MT8) obj).LJLJI;
            }
        }, C213688a4.LIZLLL(), null, null, new AqS175S0100000_9(this, 155), 12, null);
    }
}

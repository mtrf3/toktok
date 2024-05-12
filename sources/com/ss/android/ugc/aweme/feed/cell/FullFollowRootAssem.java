package com.ss.android.ugc.aweme.feed.cell;

import X.C224928sC;
import X.C2K0;
import X.C8VR;
import X.C8YN;
import X.TBT;
import Y.AObjectS133S0100000_3;
import android.view.View;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.feed.assem.FeedVideoAssem;
import com.ss.android.ugc.aweme.feed.model.BaseFeedPageParams;
import com.ss.android.ugc.effectmanager.common.ConcurrentHashSet;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AqS169S0100000_3;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class FullFollowRootAssem extends FeedVideoAssem {
    @Override // com.ss.android.ugc.aweme.feed.assem.FeedVideoAssem, X.InterfaceC55102Lju
    public final C2K0 provideAbility(String str) {
        if (str.hashCode() != -959555912) {
            return null;
        }
        return this;
    }

    @Override // com.ss.android.ugc.aweme.feed.assem.FeedVideoAssem, com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        o.LJIIIZ(view, "view");
        C8VR.LIZ(this, new AqS169S0100000_3(this, 219));
        super.onViewCreated(view);
        C8YN.LJII(this, (AssemViewModel) this.LLFF.getValue(), new TBT() { // from class: X.8sB
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C82B) obj).LJLIL;
            }
        }, null, C224928sC.LJLIL, 6);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FullFollowRootAssem(BaseFeedPageParams params, AObjectS133S0100000_3 aObjectS133S0100000_3, ConcurrentHashSet assembler) {
        super(params, aObjectS133S0100000_3, 3, assembler);
        o.LJIIIZ(params, "params");
        o.LJIIIZ(assembler, "assembler");
        new LinkedHashMap();
    }
}

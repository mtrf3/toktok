package com.ss.android.ugc.aweme.search.detail.filter.component.cell;

import X.C16880lQ;
import X.C214298b3;
import X.C214348b8;
import X.C241879eR;
import X.C241889eS;
import X.C242009ee;
import X.C242019ef;
import X.C5H3;
import X.C65352Pkq;
import X.C65776Prg;
import X.C78926UyI;
import X.C8YN;
import X.C9BD;
import X.TBT;
import Y.ACListenerS24S0100000_4;
import android.view.View;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.feed.adapter.VideoPlayViewModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.search.detail.filter.viewmodel.FilterVM;
import com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AqS154S0100000_4;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class FilterContentMaskComponent extends BaseCellSlotComponent<FilterContentMaskComponent> {
    public final C214298b3 LLFII;
    public final C5H3 LLFZ;
    public View LLI;

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int W3() {
        return R.layout.cfk;
    }

    public FilterContentMaskComponent() {
        new LinkedHashMap();
        C9BD c9bd = C9BD.LIZ;
        C65776Prg LIZ = C65352Pkq.LIZ(FilterVM.class);
        this.LLFII = C78926UyI.LJ(this, LIZ, c9bd, new AqS154S0100000_4(LIZ, 775), C241879eR.INSTANCE, null);
        this.LLFZ = C214348b8.LIZIZ(this, C65352Pkq.LIZ(VideoPlayViewModel.class), C241889eS.INSTANCE);
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, X.C8MQ
    public final void E1() {
        Y3().setAlpha(1.0f);
    }

    @Override // X.C8XO
    public final void F0(VideoItemParams item) {
        o.LJIIIZ(item, "item");
        Y3().setAlpha(1.0f);
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        o.LJIIIZ(view, "view");
        super.onViewCreated(view);
        C16880lQ.LJIIJ(new ACListenerS24S0100000_4(this, 163), Y3());
        C8YN.LJII(this, (AssemViewModel) this.LLFII.getValue(), new TBT() { // from class: X.9eg
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C252449vU) obj).LJLJJLL;
            }
        }, null, C242019ef.LJLIL, 6);
        C8YN.LJII(this, (AssemViewModel) this.LLFZ.getValue(), new TBT() { // from class: X.9eh
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C212208Um) obj).LJLJLJ;
            }
        }, null, C242009ee.LJLIL, 6);
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, X.C8MQ
    public final void B2(int i, Aweme aweme) {
        Y3().setAlpha(1.0f);
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, X.C8MQ
    public final void v0(int i, Aweme aweme) {
        Y3().setAlpha(1.0f);
    }
}

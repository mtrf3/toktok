package com.ss.android.ugc.aweme.search.detail.shoot.ui;

import X.C16880lQ;
import X.C214348b8;
import X.C51560KLk;
import X.C51561KLl;
import X.C51562KLm;
import X.C51563KLn;
import X.C5H3;
import X.C65352Pkq;
import X.C8YN;
import X.TBT;
import android.view.View;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.feed.adapter.VideoViewModel;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.search.detail.shoot.viewmodel.CreationIntentionMusicShootVM;
import com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public class SearchInflowMusicShootButtonAssem extends BaseCellSlotComponent<SearchInflowMusicShootButtonAssem> {
    public final C5H3 LLFII;
    public final C5H3 LLFZ;

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int W3() {
        return R.layout.cj9;
    }

    public SearchInflowMusicShootButtonAssem() {
        new LinkedHashMap();
        this.LLFII = C214348b8.LIZIZ(this, C65352Pkq.LIZ(CreationIntentionMusicShootVM.class), C51563KLn.INSTANCE);
        this.LLFZ = C214348b8.LIZIZ(this, C65352Pkq.LIZ(VideoViewModel.class), C51562KLm.INSTANCE);
    }

    @Override // X.C8XO
    /* renamed from: F0 */
    public final void q4(VideoItemParams item) {
        o.LJIIIZ(item, "item");
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        o.LJIIIZ(view, "view");
        View findViewById = view.findViewById(R.id.jgg);
        if (findViewById != null) {
            C16880lQ.LJIIJ(new C51560KLk(this), findViewById);
        }
        C8YN.LJII(this, (AssemViewModel) this.LLFZ.getValue(), new TBT() { // from class: X.KLo
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C82B) obj).LJLJI;
            }
        }, null, C51561KLl.LJLIL, 6);
    }
}

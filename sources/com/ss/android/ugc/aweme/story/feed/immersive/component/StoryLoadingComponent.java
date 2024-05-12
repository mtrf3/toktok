package com.ss.android.ugc.aweme.story.feed.immersive.component;

import X.AnonymousClass961;
import X.C1DH;
import X.C214348b8;
import X.C221108m2;
import X.C5H3;
import X.C62822Ol8;
import X.C65352Pkq;
import X.C8M0;
import X.C8M1;
import X.C8YN;
import X.TBT;
import Y.ARunnableS39S0100000_3;
import android.view.View;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.feed.adapter.VideoViewModel;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AqS153S0100000_3;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class StoryLoadingComponent extends BaseCellSlotComponent<StoryLoadingComponent> {
    public final C5H3 LLFII;
    public final C62822Ol8 LLFZ;

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int W3() {
        return R.layout.cov;
    }

    public StoryLoadingComponent() {
        new LinkedHashMap();
        this.LLFII = C214348b8.LIZIZ(this, C65352Pkq.LIZ(VideoViewModel.class), C8M0.INSTANCE);
        this.LLFZ = C221108m2.LIZIZ(new AqS153S0100000_3(this, 968));
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final void Z3() {
        C1DH.LJJIJIIJI(new ARunnableS39S0100000_3(this, 94));
    }

    public final AnonymousClass961 q4() {
        return (AnonymousClass961) this.LLFZ.getValue();
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, X.C8MQ
    public final void LLIILZL() {
        AnonymousClass961 q4 = q4();
        if (q4 != null) {
            q4.LIZLLL();
        }
    }

    @Override // X.C8XO
    public final void F0(VideoItemParams item) {
        o.LJIIIZ(item, "item");
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        o.LJIIIZ(view, "view");
        super.onViewCreated(view);
        C8YN.LJII(this, (AssemViewModel) this.LLFII.getValue(), new TBT() { // from class: X.8M2
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C82B) obj).LJLLL;
            }
        }, null, C8M1.LJLIL, 6);
    }
}

package com.ss.android.ugc.aweme.story.feed.immersive.component;

import X.C214348b8;
import X.C5H3;
import X.C65352Pkq;
import X.C8LJ;
import X.C8YN;
import X.TBT;
import android.view.View;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.feed.adapter.VideoPlayViewModel;
import com.ss.android.ugc.feed.platform.cell.BaseCellPlaceHolderComponent;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AqS185S0100000_3;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class StoryDownloadPlaceHolderComponent extends BaseCellPlaceHolderComponent {
    public final C5H3 LLD;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StoryDownloadPlaceHolderComponent() {
        super(0);
        new LinkedHashMap();
        this.LLD = C214348b8.LIZIZ(this, C65352Pkq.LIZ(VideoPlayViewModel.class), C8LJ.INSTANCE);
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellPlaceHolderComponent, com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        o.LJIIIZ(view, "view");
        C8YN.LJII(this, (AssemViewModel) this.LLD.getValue(), new TBT() { // from class: X.8LM
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C212208Um) obj).LJZI;
            }
        }, null, new AqS185S0100000_3(this, 81), 6);
    }
}

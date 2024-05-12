package com.ss.android.ugc.aweme.feed.assem.videodownload;

import X.C209648Kq;
import X.C214348b8;
import X.C55096Ljo;
import X.C5H3;
import X.C65352Pkq;
import X.C8LH;
import X.C8YN;
import X.TBT;
import android.view.View;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.feed.adapter.VideoPlayViewModel;
import com.ss.android.ugc.aweme.feed.assem.base.FeedBaseContentAssem;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.feed.platform.cell.RootCellCommonAbility;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class VideoDownloadProgressAssem extends FeedBaseContentAssem<VideoDownloadProgressAssem> {
    public View LJZL;
    public final C5H3 LL;

    public VideoDownloadProgressAssem() {
        new LinkedHashMap();
        this.LL = C214348b8.LIZIZ(this, C65352Pkq.LIZ(VideoPlayViewModel.class), C209648Kq.INSTANCE);
    }

    @Override // X.C8XO
    public final void F0(VideoItemParams item) {
        o.LJIIIZ(item, "item");
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        o.LJIIIZ(view, "view");
        View view2 = null;
        RootCellCommonAbility rootCellCommonAbility = (RootCellCommonAbility) C55096Ljo.LIZ(C55096Ljo.LJIIZILJ(this), RootCellCommonAbility.class, null);
        if (rootCellCommonAbility != null) {
            view2 = rootCellCommonAbility.V8("download_progress_view", false);
        }
        this.LJZL = view2;
        C8YN.LJII(this, (AssemViewModel) this.LL.getValue(), new TBT() { // from class: X.8LL
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C212208Um) obj).LJZI;
            }
        }, null, C8LH.LJLIL, 6);
    }
}

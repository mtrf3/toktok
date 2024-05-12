package com.ss.android.ugc.aweme.ui.feed;

import X.C2047681w;
import X.C213688a4;
import X.C214348b8;
import X.C3C8;
import X.C5H3;
import X.C65352Pkq;
import X.C8YN;
import X.TBT;
import X.V16;
import android.view.View;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.ui.feed.photos.PhotoViewModelV2;
import com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AqS185S0100000_3;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public abstract class PhotoSlideIndicatorAssem<RECEIVER extends C3C8> extends BaseCellSlotComponent<RECEIVER> {
    public final C5H3 LLFII;

    public void r4(int i) {
    }

    public abstract void u4(int i);

    public PhotoSlideIndicatorAssem() {
        new LinkedHashMap();
        this.LLFII = C214348b8.LIZIZ(this, C65352Pkq.LIZ(PhotoViewModelV2.class), C2047681w.INSTANCE);
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, com.bytedance.assem.arch.reused.ReusedUIAssem
    public void onViewCreated(View view) {
        o.LJIIIZ(view, "view");
        C8YN.LJII(this, (AssemViewModel) this.LLFII.getValue(), new TBT() { // from class: X.81m
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return Integer.valueOf(((C203127y8) obj).LJLIL);
            }
        }, C213688a4.LIZLLL(), new AqS185S0100000_3(this, 101), 4);
        super.onViewCreated(view);
    }

    @Override // X.C8XO
    public void q4(VideoItemParams item) {
        o.LJIIIZ(item, "item");
        Aweme aweme = item.getAweme();
        if (aweme != null) {
            u4(V16.LJJIFFI(aweme));
        }
    }
}

package com.ss.android.ugc.aweme.feed.landscape.cell.assem;

import X.AV1;
import X.C53326KwM;
import X.C65352Pkq;
import X.C8L4;
import X.C8VR;
import X.IQD;
import X.Y01;
import android.view.View;
import com.ss.android.ugc.aweme.experiments.LandscapeOptExperiment;
import com.ss.android.ugc.aweme.feed.assem.FeedVideoAssem;
import com.ss.android.ugc.aweme.feed.assem.container.RightAreaContainerAssem;
import com.ss.android.ugc.aweme.feed.landscape.cell.assem.caption.LandscapeCellCaptionSwitchAssem;
import com.ss.android.ugc.aweme.feed.landscape.cell.assem.seekbar.LandscapeCellSeekBarAssem;
import com.ss.android.ugc.aweme.feed.landscape.cell.assem.speed.LandscapeCellSpeedAssem;
import com.ss.android.ugc.aweme.feed.landscape.cell.assem.top.TopAreaContainerAssem;
import com.ss.android.ugc.aweme.feed.model.BaseFeedPageParams;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.service.CaptionServiceImpl;
import java.util.LinkedHashMap;
import java.util.Set;
import kotlin.jvm.internal.AqS169S0100000_3;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class LandscapeCellAssem extends FeedVideoAssem {
    @Override // com.ss.android.ugc.aweme.feed.assem.FeedVideoAssem, X.C8XO
    /* renamed from: F0 */
    public final /* bridge */ /* synthetic */ void q4(VideoItemParams videoItemParams) {
        F0(videoItemParams);
    }

    @Override // com.ss.android.ugc.aweme.feed.assem.FeedVideoAssem
    /* renamed from: e4 */
    public final void F0(VideoItemParams item) {
        o.LJIIIZ(item, "item");
        if (CaptionServiceImpl.LJIILIIL().LJIIIIZZ(item.getAweme())) {
            if (C53326KwM.LIZ() && !AV1.LJIJ(item.getAweme().getAuthor())) {
                return;
            } else {
                C8VR.LIZJ(this, IQD.LIZ().LJ());
            }
        }
        if (LandscapeOptExperiment.LIZ()) {
            C8VR.LIZJ(this, C65352Pkq.LIZ(RightAreaContainerAssem.class));
            C8VR.LIZJ(this, C65352Pkq.LIZ(LandscapeMenuContainerAssem.class));
            C8VR.LIZJ(this, C65352Pkq.LIZ(TopAreaContainerAssem.class));
            C8VR.LIZJ(this, Y01.LIZIZ.LJIIIIZZ());
            C8VR.LIZJ(this, C65352Pkq.LIZ(LandscapeCellSpeedAssem.class));
            C8VR.LIZJ(this, C65352Pkq.LIZ(LandscapeCellSeekBarAssem.class));
            C8VR.LIZJ(this, C65352Pkq.LIZ(LandscapeCellCaptionSwitchAssem.class));
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.assem.FeedVideoAssem, com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        o.LJIIIZ(view, "view");
        C8VR.LIZ(this, new AqS169S0100000_3(this, 221));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LandscapeCellAssem(BaseFeedPageParams baseFeedPageParams, C8L4 c8l4, int i, Set set) {
        super(baseFeedPageParams, c8l4, i, set);
        new LinkedHashMap();
    }
}

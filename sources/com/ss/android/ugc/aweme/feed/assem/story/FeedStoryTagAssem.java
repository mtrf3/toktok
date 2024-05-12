package com.ss.android.ugc.aweme.feed.assem.story;

import X.ActivityC45651qj;
import X.C16880lQ;
import X.C187227Wk;
import X.C2055284u;
import X.C42625Go9;
import X.C45804HyK;
import X.C51029K0z;
import X.QD3;
import android.content.Context;
import android.view.View;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.utils.Au2S13S0200000_3;
import com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class FeedStoryTagAssem extends BaseCellSlotComponent<FeedStoryTagAssem> {
    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int W3() {
        return R.layout.aff;
    }

    public FeedStoryTagAssem() {
        new LinkedHashMap();
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, X.C8MQ
    public final void onDestroyView() {
        C42625Go9.LIZJ(this);
    }

    @Override // X.C8XO
    /* renamed from: F0 */
    public final void q4(VideoItemParams item) {
        o.LJIIIZ(item, "item");
        getContainerView().setVisibility(0);
        Y3().setVisibility(0);
    }

    @QD3
    public final void onPrivateModelEvent(C187227Wk privateModelEvent) {
        Aweme aweme;
        o.LJIIIZ(privateModelEvent, "privateModelEvent");
        Aweme aweme2 = privateModelEvent.LJLILLLLZI;
        if (aweme2 != null) {
            VideoItemParams videoItemParams = (VideoItemParams) C51029K0z.LJIILLIIL(this);
            String str = null;
            if (videoItemParams != null && (aweme = videoItemParams.getAweme()) != null) {
                str = aweme.getAid();
            }
            if (o.LJ(str, aweme2.getAid())) {
                if (!aweme2.getIsTikTokStory()) {
                    getContainerView().setVisibility(8);
                    Y3().setVisibility(8);
                } else {
                    getContainerView().setVisibility(0);
                    Y3().setVisibility(0);
                }
            }
        }
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        ActivityC45651qj LJJIFFI;
        o.LJIIIZ(view, "view");
        super.onViewCreated(view);
        Context context = getContext();
        if (context != null && (LJJIFFI = C45804HyK.LJJIFFI(context)) != null) {
            C16880lQ.LJIIJ(new Au2S13S0200000_3(LJJIFFI, this, 3, 42), Y3());
        }
        C2055284u.LJFF((TuxTextView) view.findViewById(R.id.kl5));
        C42625Go9.LIZIZ(this);
    }
}

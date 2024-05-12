package com.ss.android.ugc.aweme.ui.feed;

import X.C16880lQ;
import X.C2055284u;
import X.C7GV;
import X.C8SG;
import Y.ACListenerS21S0100000_1;
import android.content.Context;
import android.view.View;
import android.widget.TextView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class FeedPhotoModeVideoTagAssem extends BaseCellSlotComponent<FeedPhotoModeVideoTagAssem> {
    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int W3() {
        return R.layout.c2c;
    }

    public FeedPhotoModeVideoTagAssem() {
        new LinkedHashMap();
    }

    @Override // X.C8XO
    /* renamed from: F0 */
    public final void q4(VideoItemParams videoItemParams) {
        Aweme aweme;
        Context context;
        VideoItemParams item = videoItemParams;
        o.LJIIIZ(item, "item");
        Y3().setVisibility(0);
        getContainerView().setVisibility(0);
        Integer LJFF = C8SG.LIZIZ.LJFF();
        if (LJFF != null && (aweme = item.getAweme()) != null && !aweme.isAd() && (context = Y3().getContext()) != null) {
            ((TextView) Y3().findViewById(R.id.m_d)).setText(context.getString(LJFF.intValue()));
        }
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        o.LJIIIZ(view, "view");
        super.onViewCreated(view);
        C2055284u.LJFF((TuxTextView) view.findViewById(R.id.m_d));
        C7GV.LIZ(4, view.findViewById(R.id.hoc));
        C16880lQ.LJIIJ(new ACListenerS21S0100000_1(this, 122), Y3());
    }
}

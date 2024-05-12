package com.ss.android.ugc.aweme.feed.landscape.cell.assem.avatar;

import X.C16880lQ;
import X.C56331M8x;
import Y.ACListenerS23S0100000_3;
import android.view.View;
import android.widget.TextView;
import com.ss.android.ugc.aweme.feed.assem.avatar.FeedAvatarAssemWrap;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class LandscapeAvatarAssem extends FeedAvatarAssemWrap {
    public TextView LLIIIILZ;

    @Override // com.ss.android.ugc.aweme.feed.assem.avatar.FeedAvatarAssemWrap, com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int W3() {
        return R.layout.bgz;
    }

    public LandscapeAvatarAssem() {
        new LinkedHashMap();
    }

    @Override // com.ss.android.ugc.aweme.feed.assem.avatar.FeedAvatarAssemWrap, X.C8XO
    /* renamed from: F0 */
    public final /* bridge */ /* synthetic */ void q4(VideoItemParams videoItemParams) {
        F0(videoItemParams);
    }

    @Override // com.ss.android.ugc.aweme.feed.assem.avatar.FeedAvatarAssemWrap, com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        o.LJIIIZ(view, "view");
        super.onViewCreated(view);
        TextView textView = (TextView) view.findViewById(R.id.mr4);
        this.LLIIIILZ = textView;
        if (textView != null) {
            C16880lQ.LJIJI(textView, new ACListenerS23S0100000_3(view, 82));
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.assem.avatar.FeedAvatarAssemWrap
    /* renamed from: r4 */
    public final void F0(VideoItemParams item) {
        o.LJIIIZ(item, "item");
        super.F0(item);
        TextView textView = this.LLIIIILZ;
        if (textView == null) {
            return;
        }
        textView.setText(C56331M8x.LJ(item.getAweme(), item.mEventType));
    }
}

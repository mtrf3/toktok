package com.ss.android.ugc.aweme.story.feed.immersive.component;

import X.C16880lQ;
import X.C221108m2;
import X.C54838Lfe;
import X.C62822Ol8;
import X.C8ML;
import android.view.View;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AqS153S0100000_3;
import kotlin.jvm.internal.o;
import q03.IDaS483S0100000_3;

/* loaded from: classes4.dex */
public final class StoryShareComponent extends BaseCellSlotComponent<StoryShareComponent> {
    public final C62822Ol8 LLFII;

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int W3() {
        return R.layout.cp2;
    }

    public StoryShareComponent() {
        new LinkedHashMap();
        this.LLFII = C221108m2.LIZIZ(new AqS153S0100000_3(this, 971));
    }

    @Override // X.C8XO
    /* renamed from: F0 */
    public final void q4(VideoItemParams videoItemParams) {
        int i;
        VideoItemParams item = videoItemParams;
        o.LJIIIZ(item, "item");
        if (C54838Lfe.LJIILL(item.getAweme()) || C54838Lfe.LJIJ(item.getAweme()) || C8ML.LIZ(item)) {
            i = R.raw.icon_ellipsis_horizontal;
        } else {
            i = R.raw.icon_arrow_turn_up_right;
        }
        TuxIconView tuxIconView = (TuxIconView) this.LLFII.getValue();
        if (tuxIconView != null) {
            tuxIconView.setIconRes(i);
        }
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        o.LJIIIZ(view, "view");
        super.onViewCreated(view);
        C16880lQ.LJIIJ(new IDaS483S0100000_3(this, 19, 42, 42), view);
    }
}

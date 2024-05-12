package com.ss.android.ugc.feed.platform.cell.fullscreen.above;

import X.C16880lQ;
import X.OUP;
import X.SY4;
import Y.ACListenerS21S0100000_1;
import android.view.View;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class PublishRetryInteractComponent extends BaseCellSlotComponent<PublishRetryInteractComponent> {
    public SY4 LLFII;
    public Aweme LLFZ;

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int W3() {
        return R.layout.abc;
    }

    public PublishRetryInteractComponent() {
        new LinkedHashMap();
    }

    @Override // X.C8XO
    /* renamed from: F0 */
    public final void q4(VideoItemParams videoItemParams) {
        VideoItemParams item = videoItemParams;
        o.LJIIIZ(item, "item");
        this.LLFZ = item.getAweme();
        OUP.LJIJJLI(getContainerView());
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        o.LJIIIZ(view, "view");
        super.onViewCreated(view);
        o.LJIIIIZZ(Y3().findViewById(R.id.l49), "contentView.findViewById(R.id.text_fail)");
        View findViewById = Y3().findViewById(R.id.izq);
        o.LJIIIIZZ(findViewById, "contentView.findViewById(R.id.retry_button)");
        SY4 sy4 = (SY4) findViewById;
        this.LLFII = sy4;
        sy4.setButtonStartIcon(Integer.valueOf(R.raw.icon_arrow_clockwise));
        SY4 sy42 = this.LLFII;
        if (sy42 != null) {
            sy42.setIconTintColorRes(R.attr.dj);
            SY4 sy43 = this.LLFII;
            if (sy43 != null) {
                C16880lQ.LJJIZ(sy43, new ACListenerS21S0100000_1(this, 123));
                return;
            } else {
                o.LJIJI("retry");
                throw null;
            }
        }
        o.LJIJI("retry");
        throw null;
    }
}

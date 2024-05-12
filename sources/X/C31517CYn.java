package X;

import com.bytedance.android.live.rank.impl.entrance.widget.RankEntranceWidget;
import com.bytedance.android.livesdk.rank.model.RankTabInfo;
import java.util.List;

/* renamed from: X.CYn, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31517CYn extends AbstractViewOnClickListenerC28292B8m {
    public final /* synthetic */ RankEntranceWidget LJLJJL;

    @Override // X.AbstractViewOnClickListenerC28292B8m
    public final void LIZ() {
        List<RankTabInfo> list;
        RankEntranceWidget rankEntranceWidget = this.LJLJJL;
        if (rankEntranceWidget.LJLJLJ) {
            C31510CYg c31510CYg = rankEntranceWidget.LJLIL;
            if (c31510CYg != null) {
                list = c31510CYg.LJFF;
            }
            list = null;
        } else {
            C31510CYg c31510CYg2 = rankEntranceWidget.LJLIL;
            if (c31510CYg2 != null) {
                list = c31510CYg2.LJI;
            }
            list = null;
        }
        rankEntranceWidget.LJZI(list);
    }

    public C31517CYn(RankEntranceWidget rankEntranceWidget) {
        this.LJLJJL = rankEntranceWidget;
    }
}

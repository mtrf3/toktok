package Y;

import X.C75647TmV;
import X.C75650TmY;
import X.C76800UCe;
import X.CN1;
import X.InterfaceC65784Pro;
import com.bytedance.android.live.browser.IBrowserService;
import com.bytedance.android.live.liveinteract.linkroom.widget.LinkControlWidget;
import com.bytedance.android.live.liveinteract.multihost.core.service.IMultiHostService;
import com.bytedance.android.livesdk.chatroom.model.interact.CohostTopic;

/* loaded from: classes14.dex */
public class AObjectS45S0400000_13 implements InterfaceC65784Pro {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;
    public Object l3;

    @Override // X.InterfaceC65784Pro
    public final Object invoke() {
        switch (this.$t) {
            case 0:
                return invoke$0(this);
            case 1:
                return invoke$1(this);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AObjectS45S0400000_13 aObjectS45S0400000_13) {
        LinkControlWidget linkControlWidget = (LinkControlWidget) aObjectS45S0400000_13.l0;
        IMultiHostService iMultiHostService = (IMultiHostService) aObjectS45S0400000_13.l1;
        CohostTopic cohostTopic = (CohostTopic) aObjectS45S0400000_13.l2;
        C75647TmV c75647TmV = (C75647TmV) aObjectS45S0400000_13.l3;
        linkControlWidget.getClass();
        iMultiHostService.LJJZZIII(false);
        LinkControlWidget.LJZL();
        ((IBrowserService) CN1.LIZ(IBrowserService.class)).Yd0().LIZ();
        C75650TmY.LJI(linkControlWidget.dataChannel, cohostTopic, c75647TmV);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$1(AObjectS45S0400000_13 aObjectS45S0400000_13) {
        LinkControlWidget linkControlWidget = (LinkControlWidget) aObjectS45S0400000_13.l0;
        IMultiHostService iMultiHostService = (IMultiHostService) aObjectS45S0400000_13.l1;
        CohostTopic cohostTopic = (CohostTopic) aObjectS45S0400000_13.l2;
        C75647TmV c75647TmV = (C75647TmV) aObjectS45S0400000_13.l3;
        linkControlWidget.getClass();
        iMultiHostService.LJJZZIII(true);
        LinkControlWidget.LJZL();
        ((IBrowserService) CN1.LIZ(IBrowserService.class)).Yd0().LIZ();
        C75650TmY.LJI(linkControlWidget.dataChannel, cohostTopic, c75647TmV);
        return C76800UCe.LIZ;
    }

    public AObjectS45S0400000_13(LinkControlWidget linkControlWidget, IMultiHostService iMultiHostService, CohostTopic cohostTopic, C75647TmV c75647TmV, int i) {
        this.$t = i;
        this.l0 = linkControlWidget;
        this.l1 = iMultiHostService;
        this.l2 = cohostTopic;
        this.l3 = c75647TmV;
    }
}

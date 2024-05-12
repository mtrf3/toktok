package Y;

import X.C57434MgQ;
import X.EnumC57435MgR;
import X.InterfaceC57302Ms;
import X.InterfaceC88472Yns;
import X.MSH;
import X.MVV;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.panel.FullFeedFragmentPanel;
import com.ss.android.ugc.aweme.profile.ui.MTAwemeListFragment;
import java.util.Collections;

/* loaded from: classes10.dex */
public class AObjectS147S0100000_9 implements InterfaceC88472Yns {
    public final int $t;
    public Object l0;

    @Override // X.InterfaceC88472Yns
    public final Object invoke(Object obj) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj);
            case 1:
                return invoke$1(this, obj);
            case 2:
                return invoke$2(this, obj);
            default:
                return null;
        }
    }

    public AObjectS147S0100000_9(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final Object invoke$0(AObjectS147S0100000_9 aObjectS147S0100000_9, Object obj) {
        Aweme aweme = (Aweme) obj;
        FullFeedFragmentPanel fullFeedFragmentPanel = (FullFeedFragmentPanel) aObjectS147S0100000_9.l0;
        if (aweme != null) {
            InterfaceC57302Ms interfaceC57302Ms = fullFeedFragmentPanel.mDeleteItemListener;
            if (interfaceC57302Ms == null || !interfaceC57302Ms.LJJIJLIJ(aweme)) {
                return null;
            }
            fullFeedFragmentPanel.LJJLIIJ(aweme.getAid());
            return null;
        }
        fullFeedFragmentPanel.getClass();
        return null;
    }

    public static final Object invoke$1(AObjectS147S0100000_9 aObjectS147S0100000_9, Object obj) {
        EnumC57435MgR enumC57435MgR = (EnumC57435MgR) obj;
        if (MSH.LJI(Collections.singletonList(((MVV) aObjectS147S0100000_9.l0).bindedUser), true) == null) {
            ((MVV) aObjectS147S0100000_9.l0).nameAppendFollowText.setVisibility(8);
        } else if (((MVV) aObjectS147S0100000_9.l0).nameAppendFollowText.getVisibility() != 0) {
            ((MVV) aObjectS147S0100000_9.l0).nameAppendFollowText.setVisibility(0);
        }
        if (C57434MgQ.LIZIZ.contains(Integer.valueOf(enumC57435MgR.getValue()))) {
            ((MVV) aObjectS147S0100000_9.l0).setAppendFollowTextMarginStart(4.0f);
            return null;
        }
        if (!C57434MgQ.LIZ.contains(Integer.valueOf(enumC57435MgR.getValue()))) {
            return null;
        }
        ((MVV) aObjectS147S0100000_9.l0).setAppendFollowTextMarginStart(7.0f);
        return null;
    }

    public static final Object invoke$2(AObjectS147S0100000_9 aObjectS147S0100000_9, Object obj) {
        if (obj != null) {
            ((MTAwemeListFragment) aObjectS147S0100000_9.l0).LLLZI();
            return null;
        }
        return null;
    }
}

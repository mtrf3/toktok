package Y;

import X.C0NB;
import X.C30922CBq;
import X.C50652JuK;
import X.C56542MHa;
import X.C76800UCe;
import X.C78934UyQ;
import X.InterfaceC88472Yns;
import X.X1D;
import android.content.Context;
import com.bytedance.android.live.slot.FrameL2SlotWidget;
import com.bytedance.android.livesdk.chatroom.viewmodule.FullVideoButtonWidget;
import com.bytedance.android.livesdk.livesetting.linkmic.MtCoHostLiveStudioAudienceSlideChangeBugFixSetting;
import com.bytedance.android.widget.Widget;
import com.ss.android.ugc.aweme.ecomsearch.ui.EcSearchContainerFragment;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.panel.BaseListFragmentPanel;
import com.ss.android.ugc.aweme.search.pages.core.ui.fragment.SearchContainerFragment;
import com.zhiliaoapp.musically.R;

/* loaded from: classes9.dex */
public class AObjectS44S0101000_8 implements InterfaceC88472Yns {
    public final int $t;
    public int i1;
    public Object l0;

    @Override // X.InterfaceC88472Yns
    public final Object invoke(Object obj) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj);
            case 1:
                return invoke$1(this, obj);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AObjectS44S0101000_8 aObjectS44S0101000_8, Object obj) {
        switch (aObjectS44S0101000_8.i1) {
            case 0:
                return ((FrameL2SlotWidget) aObjectS44S0101000_8.l0).LJLZ((Boolean) obj);
            case 1:
                FullVideoButtonWidget fullVideoButtonWidget = (FullVideoButtonWidget) aObjectS44S0101000_8.l0;
                Boolean bool = (Boolean) obj;
                fullVideoButtonWidget.getClass();
                if (C30922CBq.LIZIZ) {
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("FullVideoButtonWidget, receive AudienceDefinitionSwitchTipsChannel, tipsShow=");
                    LIZ.append(bool);
                    C0NB.LJIIIZ("DebugFullVideoButton", X1D.LIZIZ(LIZ));
                }
                if (!bool.booleanValue() && fullVideoButtonWidget.LJLZ()) {
                    fullVideoButtonWidget.show();
                } else {
                    fullVideoButtonWidget.hide();
                }
                return C76800UCe.LIZ;
            case 2:
                EcSearchContainerFragment ecSearchContainerFragment = (EcSearchContainerFragment) aObjectS44S0101000_8.l0;
                C50652JuK c50652JuK = (C50652JuK) obj;
                ecSearchContainerFragment.getClass();
                return c50652JuK.copy(c50652JuK.getImmutableData(), c50652JuK.getMutableData().refreshFragmentData(ecSearchContainerFragment.vl().LJLJJI));
            default:
                return BaseListFragmentPanel.lambda$handleNowEvent$22((String) aObjectS44S0101000_8.l0, (Aweme) obj);
        }
    }

    public static final Object invoke$1(AObjectS44S0101000_8 aObjectS44S0101000_8, Object obj) {
        switch (aObjectS44S0101000_8.i1) {
            case 0:
                FullVideoButtonWidget fullVideoButtonWidget = (FullVideoButtonWidget) aObjectS44S0101000_8.l0;
                Boolean bool = (Boolean) obj;
                fullVideoButtonWidget.getClass();
                if (MtCoHostLiveStudioAudienceSlideChangeBugFixSetting.isEnable()) {
                    if (bool.booleanValue()) {
                        fullVideoButtonWidget.LJLJL = true;
                        fullVideoButtonWidget.hide();
                    } else {
                        fullVideoButtonWidget.LJLJL = false;
                        if (fullVideoButtonWidget.LJLZ()) {
                            fullVideoButtonWidget.show();
                        }
                    }
                }
                return C76800UCe.LIZ;
            case 1:
                ((Widget) aObjectS44S0101000_8.l0).contentView.findViewById(R.id.h35).setAlpha(((Float) obj).floatValue());
                return C76800UCe.LIZ;
            case 2:
                ((C56542MHa) aObjectS44S0101000_8.l0).LJLLILLLL = false;
                return C76800UCe.LIZ;
            case 3:
                SearchContainerFragment searchContainerFragment = (SearchContainerFragment) aObjectS44S0101000_8.l0;
                C50652JuK c50652JuK = (C50652JuK) obj;
                searchContainerFragment.getClass();
                return c50652JuK.copy(c50652JuK.getImmutableData(), c50652JuK.getMutableData().refreshFragmentData(searchContainerFragment.vl().LJLJJI));
            default:
                C78934UyQ.LJLIL.LJ().LJ((Context) aObjectS44S0101000_8.l0);
                return C76800UCe.LIZ;
        }
    }

    public AObjectS44S0101000_8(int i, Object obj, int i2) {
        this.$t = i2;
        this.i1 = i;
        this.l0 = obj;
    }
}

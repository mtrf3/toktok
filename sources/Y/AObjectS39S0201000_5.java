package Y;

import X.BKI;
import X.BL8;
import X.C16880lQ;
import X.C175976vR;
import X.C28238B6k;
import X.C47061t0;
import X.C76800UCe;
import X.CN1;
import X.EnumC30204BtI;
import X.InterfaceC04140Eg;
import X.InterfaceC174316sl;
import X.InterfaceC88472Yns;
import android.view.View;
import com.bytedance.android.live.function.IRoomFunctionService;
import com.bytedance.android.livesdk.chatroom.ui.AbsAudienceInteractionFragment;
import com.bytedance.android.livesdk.chatroom.ui.PortraitAudienceInteractionFragment;
import com.bytedance.android.livesdk.widget.LiveSubscribeMaskWidget;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.widget.Widget;
import com.ss.android.ugc.aweme.comment.commentlist.CommentListFragment;
import com.ss.android.ugc.aweme.comment.model.Comment;
import com.zhiliaoapp.musically.R;

/* loaded from: classes6.dex */
public class AObjectS39S0201000_5 implements InterfaceC88472Yns {
    public final int $t;
    public int i2;
    public Object l0;
    public Object l1;

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

    public static final Object invoke$0(AObjectS39S0201000_5 aObjectS39S0201000_5, Object obj) {
        int i = aObjectS39S0201000_5.i2;
        if (i > 0) {
            return C76800UCe.LIZ;
        }
        aObjectS39S0201000_5.i2 = i + 1;
        Room room = ((AbsAudienceInteractionFragment) aObjectS39S0201000_5.l1).mRoom;
        if (room != null && ((InterfaceC04140Eg) aObjectS39S0201000_5.l0).LIZ(room.getId())) {
            EnumC30204BtI enumC30204BtI = EnumC30204BtI.CUSTOM_POLL;
            if (!enumC30204BtI.isShowing(((AbsAudienceInteractionFragment) aObjectS39S0201000_5.l1).mDataChannel) && (!enumC30204BtI.isShowingInInteractionDialog(((AbsAudienceInteractionFragment) aObjectS39S0201000_5.l1).mDataChannel) || !((AbsAudienceInteractionFragment) aObjectS39S0201000_5.l1).isScreenPortrait())) {
                ((IRoomFunctionService) CN1.LIZ(IRoomFunctionService.class)).nj0(((AbsAudienceInteractionFragment) aObjectS39S0201000_5.l1).mDataChannel);
            }
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$1(AObjectS39S0201000_5 aObjectS39S0201000_5, Object obj) {
        int i = aObjectS39S0201000_5.i2;
        if (i > 0) {
            return C76800UCe.LIZ;
        }
        aObjectS39S0201000_5.i2 = i + 1;
        Room room = ((PortraitAudienceInteractionFragment) aObjectS39S0201000_5.l1).mRoom;
        if (room != null && ((InterfaceC04140Eg) aObjectS39S0201000_5.l0).LIZ(room.getId())) {
            EnumC30204BtI enumC30204BtI = EnumC30204BtI.CUSTOM_POLL;
            if (!enumC30204BtI.isShowing(((PortraitAudienceInteractionFragment) aObjectS39S0201000_5.l1).mDataChannel) && !enumC30204BtI.isShowingInInteractionDialog(((PortraitAudienceInteractionFragment) aObjectS39S0201000_5.l1).mDataChannel)) {
                ((IRoomFunctionService) CN1.LIZ(IRoomFunctionService.class)).nj0(((PortraitAudienceInteractionFragment) aObjectS39S0201000_5.l1).mDataChannel);
            }
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$2(AObjectS39S0201000_5 aObjectS39S0201000_5, Object obj) {
        switch (aObjectS39S0201000_5.i2) {
            case 0:
                PortraitAudienceInteractionFragment portraitAudienceInteractionFragment = (PortraitAudienceInteractionFragment) aObjectS39S0201000_5.l0;
                View view = (View) aObjectS39S0201000_5.l1;
                portraitAudienceInteractionFragment.getClass();
                C47061t0 c47061t0 = (C47061t0) view.findViewById(R.id.kq4);
                if (obj == BKI.NON_SUBSCRIBER_FORBIDDEN_LIVE) {
                    c47061t0.setVisibility(0);
                    BL8.LIZIZ(c47061t0, C28238B6k.LJFF(portraitAudienceInteractionFragment.mRoom), portraitAudienceInteractionFragment.getContext());
                    if (portraitAudienceInteractionFragment.LJLLJ == null) {
                        LiveSubscribeMaskWidget liveSubscribeMaskWidget = new LiveSubscribeMaskWidget();
                        portraitAudienceInteractionFragment.LJLLJ = liveSubscribeMaskWidget;
                        portraitAudienceInteractionFragment.mWidgetManager.load(R.id.kq3, (Widget) liveSubscribeMaskWidget, false);
                    }
                    C16880lQ.LJJI(c47061t0, new ACListenerS52S0000000_5(0));
                } else if (obj == BKI.SUBSCRIBER_NORMAL_LIVE) {
                    C16880lQ.LJJI(c47061t0, null);
                    c47061t0.setVisibility(8);
                }
                return C76800UCe.LIZ;
            default:
                AObserverS64S0300000_3 aObserverS64S0300000_3 = (AObserverS64S0300000_3) aObjectS39S0201000_5.l0;
                InterfaceC174316sl interfaceC174316sl = (InterfaceC174316sl) aObjectS39S0201000_5.l1;
                CommentListFragment commentListFragment = (CommentListFragment) aObserverS64S0300000_3.l2;
                Comment LIZIZ = ((C175976vR) interfaceC174316sl).LIZIZ();
                commentListFragment.getClass();
                CommentListFragment.Nn(LIZIZ, "comment_restr_pin_opt_dont_pin_click");
                return C76800UCe.LIZ;
        }
    }

    public AObjectS39S0201000_5(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l1 = obj;
        this.l0 = obj2;
    }

    public AObjectS39S0201000_5(int i, Object obj, Object obj2, int i2) {
        this.$t = i2;
        this.i2 = i;
        this.l0 = obj;
        this.l1 = obj2;
    }
}

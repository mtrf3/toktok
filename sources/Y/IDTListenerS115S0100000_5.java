package Y;

import X.AbstractC32677Cs5;
import X.AbstractC32678Cs6;
import X.AbstractC32698CsQ;
import X.B8U;
import X.BFU;
import X.BKJ;
import X.BKU;
import X.C15380j0;
import X.C28433BDx;
import X.C29224BdU;
import X.C29306Beo;
import X.C30087BrP;
import X.C30183Bsx;
import X.C30350Bve;
import X.C30351Bvf;
import X.C30561Bz3;
import X.C30896CAq;
import X.C31453CWb;
import X.C31691Mf;
import X.C32680Cs8;
import X.C32697CsP;
import X.C32729Csv;
import X.C32811Qn;
import X.C50;
import X.C76800UCe;
import X.C80797VnN;
import X.CA3;
import X.CAO;
import X.CN1;
import X.CT0;
import X.EnumC31433CVh;
import X.InterfaceC30105Brh;
import X.InterfaceC65784Pro;
import X.InterfaceC88472Yns;
import X.XKQ;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import com.bytedance.android.live.effect.api.ActionEvent;
import com.bytedance.android.live.effect.api.IEffectService;
import com.bytedance.android.live.effect.api.LiveGoalOverlayEvent;
import com.bytedance.android.live.publicscreen.impl.widget.PublicScreenWidget;
import com.bytedance.android.livesdk.LiveRoomFragment;
import com.bytedance.android.livesdk.broadcast.PreviewHideKeyboardEvent;
import com.bytedance.android.livesdk.broadcast.preview.virtual.StartLivePreviewFragment;
import com.bytedance.android.livesdk.broadcast.trymode.TryModeBroadcastInteractionFragment;
import com.bytedance.android.livesdk.chatroom.ui.AbsAudienceInteractionFragment;
import com.bytedance.android.livesdk.chatroom.ui.LivePlayFragment;
import com.bytedance.android.livesdk.chatroom.viewmodule.TopRightBannerWidget;
import com.bytedance.android.livesdk.game.GameCategoryListFragment;
import com.bytedance.android.livesdk.impl.revenue.subscription.ui.SubOnlyLiveSettingFragment;
import com.bytedance.android.livesdk.impl.revenue.subscription.ui.setting.SubscriptionSettingFragmentNew;
import com.bytedance.android.livesdk.livesetting.feed.LiveLandscapeInnerFeedSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveAudienceLinkmicLowestAgeSetting;
import com.bytedance.android.livesdk.livesetting.watchlive.LiveSlideUpGuideStrategySetting;
import com.bytedance.android.livesdk.livesetting.watchlive.RecommendEndAtFollowingSetting;
import com.bytedance.android.livesdk.model.BannerInRoom;
import com.bytedance.android.livesdk.model.message.BannerInRoomCollection;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public class IDTListenerS115S0100000_5 implements View.OnTouchListener {
    public final int $t;
    public Object l0;

    public static final boolean onTouch$7(IDTListenerS115S0100000_5 iDTListenerS115S0100000_5, View view, MotionEvent motionEvent) {
        boolean lambda$continueAfterWidgetLoaded$10;
        lambda$continueAfterWidgetLoaded$10 = ((AbsAudienceInteractionFragment) iDTListenerS115S0100000_5.l0).lambda$continueAfterWidgetLoaded$10(view, motionEvent);
        return lambda$continueAfterWidgetLoaded$10;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        switch (this.$t) {
            case 0:
                return onTouch$0(this, view, motionEvent);
            case 1:
                return onTouch$1(this, view, motionEvent);
            case 2:
                return onTouch$2(this, view, motionEvent);
            case 3:
                return onTouch$3(this, view, motionEvent);
            case 4:
                return onTouch$4(this, view, motionEvent);
            case 5:
                return onTouch$5(this, view, motionEvent);
            case 6:
                return onTouch$6(this, view, motionEvent);
            case 7:
                return onTouch$7(this, view, motionEvent);
            case 8:
                return onTouch$8(this, view, motionEvent);
            case 9:
                return onTouch$9(this, view, motionEvent);
            case 10:
                return onTouch$10(this, view, motionEvent);
            case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                return onTouch$11(this, view, motionEvent);
            case 12:
                return onTouch$12(this, view, motionEvent);
            case ABRConfig.ABR_STARTUP_MAX_BITRATE /* 13 */:
                return onTouch$13(this, view, motionEvent);
            case 14:
                return onTouch$14(this, view, motionEvent);
            case 15:
                return onTouch$15(this, view, motionEvent);
            case LiveAudienceLinkmicLowestAgeSetting.DEFAULT /* 16 */:
                return onTouch$16(this, view, motionEvent);
            case 17:
                return onTouch$17(this, view, motionEvent);
            case 18:
                return onTouch$18(this, view, motionEvent);
            case 19:
                return onTouch$19(this, view, motionEvent);
            case 20:
                return onTouch$20(this, view, motionEvent);
            case 21:
                return onTouch$21(this, view, motionEvent);
            case 22:
                return onTouch$22(this, view, motionEvent);
            case 23:
                return onTouch$23(this, view, motionEvent);
            case 24:
                return onTouch$24(this, view, motionEvent);
            default:
                return false;
        }
    }

    public IDTListenerS115S0100000_5(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final boolean onTouch$0(IDTListenerS115S0100000_5 iDTListenerS115S0100000_5, View view, MotionEvent motionEvent) {
        DataChannel dataChannel;
        DataChannel dataChannel2;
        int action = motionEvent.getAction() & 255;
        if (action != 0) {
            if (action != 1) {
                if (action == 2) {
                    ((IEffectService) CN1.LIZ(IEffectService.class)).getLiveGoalEffectHelper();
                    if (C31691Mf.LJIIIZ() && (dataChannel2 = ((C30351Bvf) iDTListenerS115S0100000_5.l0).LJLJI) != null) {
                        dataChannel2.qv0(LiveGoalOverlayEvent.class, new ActionEvent(true, motionEvent.getX(), motionEvent.getY()));
                    }
                }
            } else {
                ((IEffectService) CN1.LIZ(IEffectService.class)).getLiveGoalEffectHelper();
                if (C31691Mf.LJIIIZ() && (dataChannel = ((C30351Bvf) iDTListenerS115S0100000_5.l0).LJLJI) != null) {
                    dataChannel.qv0(LiveGoalOverlayEvent.class, new ActionEvent(false, motionEvent.getX(), motionEvent.getY()));
                }
            }
        } else {
            ((C30351Bvf) iDTListenerS115S0100000_5.l0).requestFocus();
            DataChannel dataChannel3 = ((C30351Bvf) iDTListenerS115S0100000_5.l0).LJLJI;
            if (dataChannel3 != null) {
                dataChannel3.pv0(PreviewHideKeyboardEvent.class);
            }
        }
        C30561Bz3 c30561Bz3 = ((C30351Bvf) iDTListenerS115S0100000_5.l0).LJLJJLL;
        if (c30561Bz3 == null) {
            return false;
        }
        return c30561Bz3.LIZ(motionEvent, new C32811Qn(view.getWidth(), view.getHeight(), view.getTop(), view.getLeft()));
    }

    public static final boolean onTouch$1(IDTListenerS115S0100000_5 iDTListenerS115S0100000_5, View view, MotionEvent motionEvent) {
        DataChannel dataChannel;
        DataChannel dataChannel2;
        int action = motionEvent.getAction() & 255;
        if (action != 0) {
            if (action != 1) {
                if (action == 2) {
                    ((IEffectService) CN1.LIZ(IEffectService.class)).getLiveGoalEffectHelper();
                    if (C31691Mf.LJIIIZ() && (dataChannel2 = ((C30350Bve) iDTListenerS115S0100000_5.l0).LJLJI) != null) {
                        dataChannel2.qv0(LiveGoalOverlayEvent.class, new ActionEvent(true, motionEvent.getX(), motionEvent.getY()));
                    }
                }
            } else {
                ((IEffectService) CN1.LIZ(IEffectService.class)).getLiveGoalEffectHelper();
                if (C31691Mf.LJIIIZ() && (dataChannel = ((C30350Bve) iDTListenerS115S0100000_5.l0).LJLJI) != null) {
                    dataChannel.qv0(LiveGoalOverlayEvent.class, new ActionEvent(false, motionEvent.getX(), motionEvent.getY()));
                }
            }
        } else {
            ((C30350Bve) iDTListenerS115S0100000_5.l0).requestFocus();
            DataChannel dataChannel3 = ((C30350Bve) iDTListenerS115S0100000_5.l0).LJLJI;
            if (dataChannel3 != null) {
                dataChannel3.pv0(PreviewHideKeyboardEvent.class);
            }
        }
        C30561Bz3 c30561Bz3 = ((C30350Bve) iDTListenerS115S0100000_5.l0).LJLJJLL;
        if (c30561Bz3 == null) {
            return false;
        }
        return c30561Bz3.LIZ(motionEvent, new C32811Qn(view.getWidth(), view.getHeight(), view.getTop(), view.getLeft()));
    }

    public static final boolean onTouch$10(IDTListenerS115S0100000_5 iDTListenerS115S0100000_5, View view, MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action != 1) {
                if (action != 2) {
                    if (action != 3) {
                        return false;
                    }
                }
            }
            ((CAO) iDTListenerS115S0100000_5.l0).LJIILJJIL();
            return false;
        }
        CAO cao = (CAO) iDTListenerS115S0100000_5.l0;
        XKQ xkq = cao.LJLL;
        if (xkq != null) {
            xkq.LIZIZ(null);
        }
        cao.LJLL = null;
        return false;
    }

    public static final boolean onTouch$11(IDTListenerS115S0100000_5 iDTListenerS115S0100000_5, View view, MotionEvent event) {
        AbstractC32698CsQ<? extends C30896CAq> abstractC32698CsQ;
        C32697CsP c32697CsP;
        o.LJIIIZ(event, "event");
        AbstractC32698CsQ<? extends C30896CAq> abstractC32698CsQ2 = ((C32680Cs8) iDTListenerS115S0100000_5.l0).LJZ;
        Object obj = null;
        if (abstractC32698CsQ2 != null) {
            obj = abstractC32698CsQ2.LIZIZ;
        }
        if (obj != null && (obj instanceof C32697CsP) && (c32697CsP = (C32697CsP) obj) != null && c32697CsP.LJIILIIL) {
            return false;
        }
        if (event.getAction() == 0) {
            AbstractC32698CsQ<? extends C30896CAq> abstractC32698CsQ3 = ((C32680Cs8) iDTListenerS115S0100000_5.l0).LJZ;
            if (abstractC32698CsQ3 == null || !abstractC32698CsQ3.LIZJ) {
                C32729Csv.LIZJ(view).start();
            }
        } else if (1 == event.getAction()) {
            AbstractC32698CsQ<? extends C30896CAq> abstractC32698CsQ4 = ((C32680Cs8) iDTListenerS115S0100000_5.l0).LJZ;
            if (abstractC32698CsQ4 == null || !abstractC32698CsQ4.LIZJ) {
                C32729Csv.LIZIZ(view).start();
            }
        } else if (3 == event.getAction() && ((abstractC32698CsQ = ((C32680Cs8) iDTListenerS115S0100000_5.l0).LJZ) == null || !abstractC32698CsQ.LIZJ)) {
            C32729Csv.LIZIZ(view).start();
        }
        return false;
    }

    public static final boolean onTouch$12(IDTListenerS115S0100000_5 iDTListenerS115S0100000_5, View view, MotionEvent event) {
        AbstractC32698CsQ<? extends C30896CAq> abstractC32698CsQ;
        AbstractC32698CsQ<? extends C30896CAq> abstractC32698CsQ2;
        AbstractC32698CsQ<? extends C30896CAq> abstractC32698CsQ3;
        o.LJIIIZ(event, "event");
        if (event.getAction() == 0) {
            if (!((AbstractC32678Cs6) iDTListenerS115S0100000_5.l0).X() || (abstractC32698CsQ3 = ((AbstractC32678Cs6) iDTListenerS115S0100000_5.l0).LJZ) == null || !abstractC32698CsQ3.LIZJ) {
                C32729Csv.LIZJ(view).start();
            }
        } else if (1 == event.getAction()) {
            if (!((AbstractC32678Cs6) iDTListenerS115S0100000_5.l0).X() || (abstractC32698CsQ2 = ((AbstractC32678Cs6) iDTListenerS115S0100000_5.l0).LJZ) == null || !abstractC32698CsQ2.LIZJ) {
                C32729Csv.LIZIZ(view).start();
            }
        } else if (3 == event.getAction() && (!((AbstractC32678Cs6) iDTListenerS115S0100000_5.l0).X() || (abstractC32698CsQ = ((AbstractC32678Cs6) iDTListenerS115S0100000_5.l0).LJZ) == null || !abstractC32698CsQ.LIZJ)) {
            C32729Csv.LIZIZ(view).start();
        }
        return false;
    }

    public static final boolean onTouch$13(IDTListenerS115S0100000_5 iDTListenerS115S0100000_5, View view, MotionEvent event) {
        InterfaceC30105Brh interfaceC30105Brh = ((C30087BrP) iDTListenerS115S0100000_5.l0).LJLJI;
        o.LJIIIIZZ(event, "event");
        return interfaceC30105Brh.LJIIIIZZ(event);
    }

    public static final boolean onTouch$14(IDTListenerS115S0100000_5 iDTListenerS115S0100000_5, View view, MotionEvent event) {
        InterfaceC88472Yns<MotionEvent, Boolean> interfaceC88472Yns = ((C30183Bsx) iDTListenerS115S0100000_5.l0).LJLJI;
        o.LJIIIIZZ(event, "event");
        Boolean invoke = interfaceC88472Yns.invoke(event);
        if (invoke != null) {
            return invoke.booleanValue();
        }
        return false;
    }

    public static final boolean onTouch$15(IDTListenerS115S0100000_5 iDTListenerS115S0100000_5, View view, MotionEvent motionEvent) {
        ((BFU) iDTListenerS115S0100000_5.l0).LJJLJLI();
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x006d, code lost:
    
        if (r5 <= (r4._$_findCachedViewById(com.zhiliaoapp.musically.R.id.czv).getHeight() + r1)) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean onTouch$16(Y.IDTListenerS115S0100000_5 r9, android.view.View r10, android.view.MotionEvent r11) {
        /*
            r8 = 0
            if (r10 == 0) goto L3a
            r7 = 1
            if (r11 == 0) goto L3a
            int r0 = r11.getAction()
            if (r0 != 0) goto L3a
            java.lang.Object r4 = r9.l0
            com.bytedance.android.livesdk.game.GameCategoryListFragment r4 = (com.bytedance.android.livesdk.game.GameCategoryListFragment) r4
            float r6 = r11.getRawX()
            float r5 = r11.getRawY()
            r2 = 2131366503(0x7f0a1267, float:1.8352901E38)
            android.view.View r0 = r4._$_findCachedViewById(r2)
            if (r0 != 0) goto L3b
        L21:
            java.lang.Object r0 = r9.l0
            com.bytedance.android.livesdk.game.GameCategoryListFragment r0 = (com.bytedance.android.livesdk.game.GameCategoryListFragment) r0
            android.view.View r0 = r0._$_findCachedViewById(r2)
            boolean r0 = r0.isFocusable()
            if (r0 == 0) goto L3a
            java.lang.Object r0 = r9.l0
            com.bytedance.android.livesdk.game.GameCategoryListFragment r0 = (com.bytedance.android.livesdk.game.GameCategoryListFragment) r0
            android.view.View r0 = r0._$_findCachedViewById(r2)
            r0.clearFocus()
        L3a:
            return r8
        L3b:
            r0 = 2
            int[] r3 = new int[r0]
            android.view.View r0 = r4._$_findCachedViewById(r2)
            r0.getLocationOnScreen(r3)
            r1 = r3[r8]
            float r0 = (float) r1
            int r0 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r0 < 0) goto L21
            android.view.View r0 = r4._$_findCachedViewById(r2)
            int r0 = r0.getWidth()
            int r0 = r0 + r1
            float r0 = (float) r0
            int r0 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r0 > 0) goto L21
            r1 = r3[r7]
            float r0 = (float) r1
            int r0 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r0 < 0) goto L21
            android.view.View r0 = r4._$_findCachedViewById(r2)
            int r0 = r0.getHeight()
            int r0 = r0 + r1
            float r0 = (float) r0
            int r0 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r0 <= 0) goto L3a
            goto L21
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.IDTListenerS115S0100000_5.onTouch$16(Y.IDTListenerS115S0100000_5, android.view.View, android.view.MotionEvent):boolean");
    }

    public static final boolean onTouch$17(IDTListenerS115S0100000_5 iDTListenerS115S0100000_5, View view, MotionEvent motionEvent) {
        if (view != null && motionEvent != null && ((motionEvent.getAction() == 2 || motionEvent.getAction() == 1) && ((GameCategoryListFragment) iDTListenerS115S0100000_5.l0)._$_findCachedViewById(R.id.czv).isFocusable())) {
            ((GameCategoryListFragment) iDTListenerS115S0100000_5.l0)._$_findCachedViewById(R.id.czv).clearFocus();
        }
        return false;
    }

    public static final boolean onTouch$18(IDTListenerS115S0100000_5 iDTListenerS115S0100000_5, View view, MotionEvent motionEvent) {
        InterfaceC65784Pro<C76800UCe> interfaceC65784Pro;
        if (motionEvent.getAction() == 0) {
            SubOnlyLiveSettingFragment subOnlyLiveSettingFragment = (SubOnlyLiveSettingFragment) iDTListenerS115S0100000_5.l0;
            if (!subOnlyLiveSettingFragment.LJLLLL && (interfaceC65784Pro = subOnlyLiveSettingFragment.LJLLLLLL) != null) {
                interfaceC65784Pro.invoke();
            }
            return !((SubOnlyLiveSettingFragment) iDTListenerS115S0100000_5.l0).LJLLLL;
        }
        return false;
    }

    public static final boolean onTouch$19(IDTListenerS115S0100000_5 iDTListenerS115S0100000_5, View view, MotionEvent event) {
        o.LJIIIZ(event, "event");
        if (((AbstractC32677Cs5) iDTListenerS115S0100000_5.l0).LJLLL) {
            return false;
        }
        if (event.getAction() == 0) {
            C32729Csv.LIZJ(view).start();
        } else if (1 == event.getAction()) {
            C32729Csv.LIZIZ(view).start();
        } else if (3 == event.getAction()) {
            C32729Csv.LIZIZ(view).start();
        }
        return false;
    }

    public static final boolean onTouch$2(IDTListenerS115S0100000_5 iDTListenerS115S0100000_5, View view, MotionEvent motionEvent) {
        return ((C50) iDTListenerS115S0100000_5.l0).LJ(motionEvent);
    }

    public static final boolean onTouch$20(IDTListenerS115S0100000_5 iDTListenerS115S0100000_5, View view, MotionEvent motionEvent) {
        boolean z;
        InterfaceC65784Pro<C76800UCe> interfaceC65784Pro;
        if (((SubscriptionSettingFragmentNew) iDTListenerS115S0100000_5.l0).LL != 0) {
            z = true;
        } else {
            z = false;
        }
        if (motionEvent.getAction() == 0 && z && (interfaceC65784Pro = ((SubscriptionSettingFragmentNew) iDTListenerS115S0100000_5.l0).LLD) != null) {
            interfaceC65784Pro.invoke();
        }
        return z;
    }

    public static final boolean onTouch$21(IDTListenerS115S0100000_5 iDTListenerS115S0100000_5, View view, MotionEvent motionEvent) {
        PublicScreenWidget publicScreenWidget = (PublicScreenWidget) iDTListenerS115S0100000_5.l0;
        publicScreenWidget.getClass();
        if (motionEvent.getAction() == 2 && publicScreenWidget.LLIIII.LIZ()) {
            publicScreenWidget.LLILL(CT0.FOCUS, true);
            publicScreenWidget.LJLLLL = false;
        }
        publicScreenWidget.LLIILZL(motionEvent, view);
        return false;
    }

    public static final boolean onTouch$22(IDTListenerS115S0100000_5 iDTListenerS115S0100000_5, View view, MotionEvent motionEvent) {
        return ((GestureDetector) iDTListenerS115S0100000_5.l0).onTouchEvent(motionEvent);
    }

    public static final boolean onTouch$23(IDTListenerS115S0100000_5 iDTListenerS115S0100000_5, View view, MotionEvent event) {
        o.LJIIIZ(event, "event");
        if (event.getAction() == 2 && ((C31453CWb) iDTListenerS115S0100000_5.l0).LIZ.canScrollVertically(1)) {
            C31453CWb.LIZLLL((C31453CWb) iDTListenerS115S0100000_5.l0, EnumC31433CVh.FOCUS, 6);
            ((C31453CWb) iDTListenerS115S0100000_5.l0).LJIIIIZZ = false;
        }
        return false;
    }

    public static final boolean onTouch$24(IDTListenerS115S0100000_5 iDTListenerS115S0100000_5, View view, MotionEvent motionEvent) {
        boolean z;
        InterfaceC65784Pro<C76800UCe> interfaceC65784Pro;
        if (((C28433BDx) iDTListenerS115S0100000_5.l0).LIZ != 0) {
            z = true;
        } else {
            z = false;
        }
        if (motionEvent.getAction() == 1 && z && (interfaceC65784Pro = ((C28433BDx) iDTListenerS115S0100000_5.l0).LIZIZ) != null) {
            interfaceC65784Pro.invoke();
        }
        return z;
    }

    public static final boolean onTouch$3(IDTListenerS115S0100000_5 iDTListenerS115S0100000_5, View view, MotionEvent motionEvent) {
        return ((C50) iDTListenerS115S0100000_5.l0).LJ(motionEvent);
    }

    public static final boolean onTouch$4(IDTListenerS115S0100000_5 iDTListenerS115S0100000_5, View view, MotionEvent motionEvent) {
        ((StartLivePreviewFragment) iDTListenerS115S0100000_5.l0).mGestureDetector.onTouchEvent(motionEvent);
        return false;
    }

    public static final boolean onTouch$5(IDTListenerS115S0100000_5 iDTListenerS115S0100000_5, View view, MotionEvent event) {
        TryModeBroadcastInteractionFragment tryModeBroadcastInteractionFragment = (TryModeBroadcastInteractionFragment) iDTListenerS115S0100000_5.l0;
        o.LJIIIIZZ(event, "event");
        return tryModeBroadcastInteractionFragment.LJIIIIZZ(event);
    }

    public static final boolean onTouch$6(IDTListenerS115S0100000_5 iDTListenerS115S0100000_5, View view, MotionEvent motionEvent) {
        C80797VnN c80797VnN;
        boolean z;
        int currentItem;
        BKJ LJJIII;
        LiveRoomFragment liveRoomFragment = (LiveRoomFragment) iDTListenerS115S0100000_5.l0;
        liveRoomFragment.getClass();
        if (LiveSlideUpGuideStrategySetting.INSTANCE.getExpVersion() > 0) {
            int action = motionEvent.getAction();
            if (action != 1) {
                if (action == 2) {
                    BKJ currentFragment = liveRoomFragment.getCurrentFragment();
                    BKJ xl = liveRoomFragment.xl();
                    if (xl != null && (xl instanceof LivePlayFragment) && currentFragment != null && (currentFragment instanceof LivePlayFragment)) {
                        float y = motionEvent.getY() - liveRoomFragment.LLF.getInitialMotionY();
                        ((LivePlayFragment) xl).Hm(y);
                        ((LivePlayFragment) currentFragment).Hm(y);
                    }
                }
            } else if (B8U.LIZJ) {
                BKJ currentFragment2 = liveRoomFragment.getCurrentFragment();
                BKJ xl2 = liveRoomFragment.xl();
                if ((currentFragment2 instanceof LivePlayFragment) && xl2 != null && (xl2 instanceof LivePlayFragment)) {
                    B8U.LJIIIZ((LivePlayFragment) currentFragment2, (LivePlayFragment) xl2);
                }
            }
        }
        RecommendEndAtFollowingSetting recommendEndAtFollowingSetting = RecommendEndAtFollowingSetting.INSTANCE;
        if (recommendEndAtFollowingSetting.getValue().enableShowRecommend > 0 && (!LiveLandscapeInnerFeedSetting.INSTANCE.isEnable() || liveRoomFragment.mo49getActivity() == null || !C29306Beo.LJIIZILJ(liveRoomFragment.mo49getActivity().getRequestedOrientation()) || motionEvent == null || (c80797VnN = liveRoomFragment.LLF) == null || liveRoomFragment.LLIIIILZ == null || c80797VnN.getCurrentItem() != liveRoomFragment.LLIIIILZ.LIZJ())) {
            if (liveRoomFragment.LJLJL <= 0.0f) {
                liveRoomFragment.LJLJL = liveRoomFragment.LLF.getInitialMotionY() - BKU.LJIIIIZZ;
                liveRoomFragment.LJLJLJ = liveRoomFragment.LLF.getCurrentItem();
                liveRoomFragment.LJLL = false;
            }
            if (Math.abs(motionEvent.getY() - liveRoomFragment.LJLJL) >= 3.0f) {
                if (motionEvent.getY() - liveRoomFragment.LJLJL <= 0.0f) {
                    z = true;
                } else {
                    z = false;
                }
                float abs = Math.abs(motionEvent.getY() - liveRoomFragment.LJLJL) / C15380j0.LJIIJJI();
                if (recommendEndAtFollowingSetting.getValue().enableShowRecommend == 3) {
                    int currentItem2 = liveRoomFragment.LLF.getCurrentItem();
                    if (liveRoomFragment.Gl(currentItem2, currentItem2 + 1, z)) {
                        liveRoomFragment.LJLLLLLL = true;
                    } else {
                        int i = currentItem2 - 1;
                        if (recommendEndAtFollowingSetting.getValue().enableShowRecommend != 3 || z || !liveRoomFragment.vl(i, currentItem2)) {
                            liveRoomFragment.Pl(motionEvent);
                        }
                    }
                    liveRoomFragment.LJLZ = true;
                    float y2 = motionEvent.getY() - liveRoomFragment.LJLJL;
                    BKJ currentFragment3 = liveRoomFragment.getCurrentFragment();
                    if (currentFragment3 instanceof LivePlayFragment) {
                        liveRoomFragment.Ol((LivePlayFragment) currentFragment3, abs, z, true, y2);
                    }
                    if (z) {
                        BKJ xl3 = liveRoomFragment.xl();
                        if (xl3 != null && (xl3 instanceof LivePlayFragment)) {
                            LivePlayFragment livePlayFragment = (LivePlayFragment) xl3;
                            liveRoomFragment.LJZI = livePlayFragment;
                            liveRoomFragment.Ol(livePlayFragment, abs, true, false, y2);
                        }
                    } else if (liveRoomFragment.LLFII != null && liveRoomFragment.LLF.getCurrentItem() - 1 >= 0 && currentItem < liveRoomFragment.LLFII.getCount() && (LJJIII = liveRoomFragment.LLFII.LJJIII(currentItem)) != null && (LJJIII instanceof LivePlayFragment)) {
                        LivePlayFragment livePlayFragment2 = (LivePlayFragment) LJJIII;
                        liveRoomFragment.LJZI = livePlayFragment2;
                        liveRoomFragment.Ol(livePlayFragment2, abs, false, false, y2);
                    }
                    liveRoomFragment.Pl(motionEvent);
                }
            }
            if (1 == motionEvent.getAction()) {
                liveRoomFragment.LJLJL = 0.0f;
            }
        }
        return false;
    }

    public static final boolean onTouch$8(IDTListenerS115S0100000_5 iDTListenerS115S0100000_5, View view, MotionEvent motionEvent) {
        BannerInRoomCollection.BannerInfo bannerInfo;
        String str;
        List<BannerInRoom> list;
        if (motionEvent.getAction() == 1 && (bannerInfo = ((TopRightBannerWidget) iDTListenerS115S0100000_5.l0).LJLJLLL) != null && (((str = bannerInfo.url) != null && str.length() != 0) || (bannerInfo != null && (list = bannerInfo.bannerList) != null && !list.isEmpty()))) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.putAll(CA3.LIZ);
            linkedHashMap.put("banner_type", 2);
            linkedHashMap.put("dynamic_banner_container_type", 2);
            linkedHashMap.put("dynamic_banner_engine_type", 1);
            CA3.LJFF(0, "click", linkedHashMap);
        }
        return false;
    }

    public static final boolean onTouch$9(IDTListenerS115S0100000_5 iDTListenerS115S0100000_5, View view, MotionEvent motionEvent) {
        C29224BdU c29224BdU = (C29224BdU) iDTListenerS115S0100000_5.l0;
        c29224BdU.getClass();
        int action = motionEvent.getAction();
        if (action == 0) {
            c29224BdU.LJLJI.removeCallbacks(c29224BdU.LJLJJLL);
            return false;
        }
        if (action != 3 && action != 1) {
            return false;
        }
        c29224BdU.LJLJI.postDelayed(c29224BdU.LJLJJLL, 5000L);
        return false;
    }
}

package Y;

import X.AbstractC32677Cs5;
import X.AbstractC32682CsA;
import X.BMB;
import X.BO5;
import X.BOC;
import X.BVD;
import X.C06900Ow;
import X.C15070iV;
import X.C15380j0;
import X.C169776lR;
import X.C169786lS;
import X.C169946li;
import X.C31692CcC;
import X.C47121t6;
import X.C57092Lx;
import X.C5MM;
import X.C61447O9r;
import X.C66Y;
import X.C74413TIj;
import X.C76800UCe;
import X.C86093Xqb;
import X.EnumC06890Ov;
import X.EnumC74323TEx;
import X.InterfaceC65784Pro;
import X.MVV;
import X.ViewOnTouchListenerC82857WfV;
import androidx.lifecycle.Observer;
import com.bytedance.android.livesdk.feed.drawerfeed.DrawerFeedLiveFragmentV2;
import com.bytedance.android.livesdk.feed.viewmodel.TabFeedViewModel;
import com.bytedance.android.livesdk.gift.base.platform.business.panel.landscape.widget.LiveNewGiftPanelWidget;
import com.bytedance.android.livesdk.livesetting.gift.LiveGiftPanelManualSortSetting;
import com.ss.android.ugc.aweme.pns.agegate.data.PNSFeedbackModel;
import com.ss.android.ugc.aweme.pns.agegate.ui.view.PNSAgeGateActivity;
import com.ss.android.ugc.aweme.pns.agegate.ui.view.PNSAgeGateBaseFragment;
import com.ss.android.ugc.aweme.profile.ProfilePageFragment;
import com.ss.android.ugc.aweme.shortvideo.AVChallenge;
import com.ss.android.ugc.aweme.shortvideo.cut.gif.Video2GifCutFragment;
import com.ss.android.vesdk.VEEditor;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public class AObserverS60S0101000_5 implements Observer {
    public final int $t;
    public int i1;
    public Object l0;

    @Override // androidx.lifecycle.Observer
    public final void onChanged(Object obj) {
        switch (this.$t) {
            case 0:
                onChanged$0(this, obj);
                return;
            case 1:
                onChanged$1(this, obj);
                return;
            case 2:
                onChanged$2(this, obj);
                return;
            default:
                return;
        }
    }

    public static final void onChanged$0(AObserverS60S0101000_5 aObserverS60S0101000_5, Object obj) {
        AbstractC32677Cs5 abstractC32677Cs5;
        Long l;
        C15070iV<Long, Long> singleVideoPlayBoundary;
        Long l2;
        switch (aObserverS60S0101000_5.i1) {
            case 0:
                String str = (String) obj;
                C47121t6 c47121t6 = ((C31692CcC) aObserverS60S0101000_5.l0).LJLLI;
                if (c47121t6 != null) {
                    c47121t6.setText(str);
                    return;
                }
                return;
            case 1:
                DrawerFeedLiveFragmentV2 drawerFeedLiveFragmentV2 = (DrawerFeedLiveFragmentV2) aObserverS60S0101000_5.l0;
                drawerFeedLiveFragmentV2.getClass();
                if (obj == BMB.SUCCESS) {
                    TabFeedViewModel tabFeedViewModel = drawerFeedLiveFragmentV2.LJLJL;
                    if (tabFeedViewModel != null && tabFeedViewModel.LLIFFJFJJ > 0) {
                        int itemCount = drawerFeedLiveFragmentV2.LJLJJI.getItemCount();
                        TabFeedViewModel tabFeedViewModel2 = drawerFeedLiveFragmentV2.LJLJL;
                        if (itemCount > tabFeedViewModel2.LLIFFJFJJ) {
                            int i = tabFeedViewModel2.LLII;
                            if (i > C15380j0.LIZ(3.0f)) {
                                i -= C15380j0.LIZ(3.0f);
                            }
                            drawerFeedLiveFragmentV2.LJLJJL.LJFF(drawerFeedLiveFragmentV2.LJLJL.LLIFFJFJJ, i);
                        }
                    }
                    TabFeedViewModel tabFeedViewModel3 = drawerFeedLiveFragmentV2.LJLJL;
                    tabFeedViewModel3.LLII = 0;
                    tabFeedViewModel3.LLIFFJFJJ = 0;
                    return;
                }
                return;
            case 2:
                LiveNewGiftPanelWidget liveNewGiftPanelWidget = (LiveNewGiftPanelWidget) aObserverS60S0101000_5.l0;
                Integer num = (Integer) obj;
                if (num != null) {
                    if (liveNewGiftPanelWidget.LLFII != num.intValue()) {
                        liveNewGiftPanelWidget.LLFZ = false;
                        liveNewGiftPanelWidget.LLFII = num.intValue();
                    } else if (liveNewGiftPanelWidget.LLFII == 1 && LiveGiftPanelManualSortSetting.INSTANCE.isEnable()) {
                        liveNewGiftPanelWidget.LLD = true;
                    }
                    liveNewGiftPanelWidget.LJZ = false;
                    liveNewGiftPanelWidget.LJZ(num, liveNewGiftPanelWidget.LJLJLJ);
                }
                AbstractC32682CsA abstractC32682CsA = liveNewGiftPanelWidget.LJLJLLL;
                if (abstractC32682CsA != null && (abstractC32677Cs5 = abstractC32682CsA.LJLILLLLZI) != null) {
                    abstractC32677Cs5.M();
                    return;
                }
                return;
            case 3:
                C169776lR c169776lR = (C169776lR) aObserverS60S0101000_5.l0;
                if (!c169776lR.LJJIL || (l = c169776lR.LJJII.getPlayBoundary().LIZIZ) == null) {
                    return;
                }
                c169776lR.LIZLLL.setValue(C5MM.LIZIZ(c169776lR.LJJIIZ.LIZ(l.intValue())));
                c169776lR.LJJIII();
                return;
            case 4:
                C169786lS c169786lS = (C169786lS) aObserverS60S0101000_5.l0;
                if (!c169786lS.LJJIJIIJIL) {
                    return;
                }
                C15070iV<Long, Long> playBoundary = c169786lS.LJIL.getPlayBoundary();
                Long l3 = playBoundary.LIZ;
                Long l4 = playBoundary.LIZIZ;
                if (l3 == null || l4 == null) {
                    return;
                }
                c169786lS.LIZLLL.setValue(C5MM.LIZLLL(c169786lS.LJJII.LIZ(l3.intValue())));
                c169786lS.LJJI(l3.intValue(), l4.intValue());
                return;
            case 5:
                PNSAgeGateActivity this$0 = (PNSAgeGateActivity) aObserverS60S0101000_5.l0;
                C86093Xqb c86093Xqb = (C86093Xqb) obj;
                o.LJIIIZ(this$0, "this$0");
                if (c86093Xqb != null) {
                    PNSFeedbackModel pNSFeedbackModel = c86093Xqb.LIZ;
                    InterfaceC65784Pro<C76800UCe> action = c86093Xqb.LIZIZ;
                    o.LJIIIZ(action, "action");
                    PNSAgeGateBaseFragment LLFII = this$0.LLFII();
                    if (LLFII == null) {
                        return;
                    }
                    LLFII.vl(pNSFeedbackModel, action);
                    return;
                }
                return;
            case 6:
                ProfilePageFragment profilePageFragment = (ProfilePageFragment) aObserverS60S0101000_5.l0;
                Integer num2 = (Integer) obj;
                profilePageFragment.getClass();
                if (num2 == null) {
                    return;
                }
                if (num2.intValue() == 0) {
                    C57092Lx.LIZ.getClass();
                    num2 = Integer.valueOf(C61447O9r.LIZ());
                }
                profilePageFragment.LLIIIL.setPadding(0, 0, 0, num2.intValue());
                return;
            default:
                Video2GifCutFragment video2GifCutFragment = (Video2GifCutFragment) aObserverS60S0101000_5.l0;
                ViewOnTouchListenerC82857WfV viewOnTouchListenerC82857WfV = video2GifCutFragment.LJLJJI;
                if (viewOnTouchListenerC82857WfV != null && (singleVideoPlayBoundary = viewOnTouchListenerC82857WfV.getSingleVideoPlayBoundary()) != null && (l2 = singleVideoPlayBoundary.LIZ) != null && singleVideoPlayBoundary.LIZIZ != null) {
                    ((C169946li) video2GifCutFragment.LJLJL.LJLILLLLZI).LIZ(l2.longValue(), singleVideoPlayBoundary.LIZIZ.longValue());
                    C169946li c169946li = (C169946li) video2GifCutFragment.LJLJL.LJLILLLLZI;
                    c169946li.LIZ.LLJJJIL((int) (video2GifCutFragment.LJLJJI.getSinglePlayingPosition() / c169946li.LIZLLL), VEEditor.SEEK_MODE.EDITOR_SEEK_FLAG_OnGoing);
                    return;
                }
                return;
        }
    }

    public static final void onChanged$1(AObserverS60S0101000_5 aObserverS60S0101000_5, Object obj) {
        switch (aObserverS60S0101000_5.i1) {
            case 0:
                BVD bvd = (BVD) aObserverS60S0101000_5.l0;
                C06900Ow c06900Ow = (C06900Ow) obj;
                bvd.getClass();
                if (c06900Ow == null) {
                    return;
                }
                if (c06900Ow.LIZ == EnumC06890Ov.RUNNING) {
                    bvd.LJLILLLLZI.setVisibility(0);
                    return;
                } else {
                    bvd.LJLILLLLZI.setVisibility(8);
                    return;
                }
            case 1:
                ((MVV) aObserverS60S0101000_5.l0).lambda$new$0((Boolean) obj);
                return;
            default:
                ((C66Y) aObserverS60S0101000_5.l0).LJII();
                return;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void onChanged$2(AObserverS60S0101000_5 aObserverS60S0101000_5, Object obj) {
        switch (aObserverS60S0101000_5.i1) {
            case 0:
                BO5 bo5 = (BO5) aObserverS60S0101000_5.l0;
                bo5.getClass();
                if (obj == BMB.START) {
                    bo5.LIZ.getClass();
                }
                if (obj == BMB.SUCCESS) {
                    bo5.LIZ.getClass();
                    bo5.LIZIZ.LJLI(0);
                    return;
                }
                return;
            default:
                BOC boc = (BOC) aObserverS60S0101000_5.l0;
                C74413TIj c74413TIj = (C74413TIj) obj;
                if (c74413TIj != null && c74413TIj.LIZIZ == EnumC74323TEx.SUCCESS) {
                    boc.LIZ((AVChallenge) c74413TIj.LIZ);
                    return;
                }
                return;
        }
    }

    public AObserverS60S0101000_5(int i, Object obj, int i2) {
        this.$t = i2;
        this.i1 = i;
        this.l0 = obj;
    }
}

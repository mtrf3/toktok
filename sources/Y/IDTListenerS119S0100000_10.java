package Y;

import X.C2U8;
import X.C55045Liz;
import X.C58655N0h;
import X.C58704N2e;
import X.C59316NPs;
import X.C59501NWv;
import X.C59518NXm;
import X.C59520NXo;
import X.C59521NXp;
import X.C59571NZn;
import X.C59835Ne3;
import X.C5S1;
import X.C60996Nwm;
import X.C63081OpJ;
import X.C72083SQt;
import X.C90193gN;
import X.IDP;
import X.InterfaceC58651N0d;
import X.NN1;
import X.NQL;
import X.NSC;
import X.NUM;
import X.NWF;
import X.NWI;
import X.NWN;
import X.NZR;
import X.O6T;
import X.O7W;
import android.content.Context;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.bytedance.ies.ugc.aweme.commercialize.splash.topview.mask.AwesomeSplashNewMask;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.google.gson.Gson;
import com.ss.android.ugc.aweme.commercialize.ecommerce.pdp.ui.PdpBulletBottomSheetFragment;
import com.ss.android.ugc.aweme.commercialize.feed.slide.SlideAdWebPreloadAssem;
import com.ss.android.ugc.aweme.crossplatform.activity.MixActivityContainer;
import com.ss.android.ugc.aweme.discover.helper.ViewPagerSwitchHelper;
import com.ss.android.ugc.aweme.feed.adapter.VideoBaseCell;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.panel.RecommendFeedFragmentPanel;
import com.ss.android.ugc.aweme.feed.ui.FeedRecommendFragment;
import com.ss.android.ugc.aweme.web.experiment.CommerceWebCrossToSparkExt;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public class IDTListenerS119S0100000_10 implements View.OnTouchListener {
    public final int $t;
    public Object l0;

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
            default:
                return false;
        }
    }

    public IDTListenerS119S0100000_10(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final boolean onTouch$0(IDTListenerS119S0100000_10 iDTListenerS119S0100000_10, View view, MotionEvent motionEvent) {
        if (motionEvent.getAction() == 1) {
            HashMap hashMap = new HashMap();
            if (C90193gN.LIZIZ(((AwesomeSplashNewMask) iDTListenerS119S0100000_10.l0).getContext())) {
                hashMap.put("click_x", String.valueOf(C60996Nwm.LJIIIIZZ(((AwesomeSplashNewMask) iDTListenerS119S0100000_10.l0).getContext()) - motionEvent.getRawX()));
            } else {
                hashMap.put("click_x", String.valueOf(motionEvent.getRawX()));
            }
            hashMap.put("click_y", String.valueOf(motionEvent.getRawY()));
            Map<String, String> map = ((AwesomeSplashNewMask) iDTListenerS119S0100000_10.l0).LJLILLLLZI;
            String json = GsonProtectorUtils.toJson(new Gson(), hashMap);
            o.LJIIIIZZ(json, "Gson().toJson(dataMap)");
            ((HashMap) map).put("ad_extra_data", json);
            return false;
        }
        return false;
    }

    public static final boolean onTouch$1(IDTListenerS119S0100000_10 iDTListenerS119S0100000_10, View view, MotionEvent motionEvent) {
        if (((PdpBulletBottomSheetFragment) iDTListenerS119S0100000_10.l0).LJZ == 4) {
            return true;
        }
        return false;
    }

    public static final boolean onTouch$10(IDTListenerS119S0100000_10 iDTListenerS119S0100000_10, View view, MotionEvent event) {
        if (((NWF) iDTListenerS119S0100000_10.l0).getActionMode().LIZJ == 5) {
            ((NWF) iDTListenerS119S0100000_10.l0).setFromTitleBarClick(true);
        }
        NWN actionMode = ((NWF) iDTListenerS119S0100000_10.l0).getActionMode();
        o.LJIIIIZZ(event, "event");
        actionMode.LIZIZ(event);
        int action = event.getAction();
        if (action != 0) {
            if (action == 1 || action == 3) {
                if (CommerceWebCrossToSparkExt.LIZIZ()) {
                    NZR webView = ((NWF) iDTListenerS119S0100000_10.l0).getWebView();
                    if (webView != null && webView.getView().getScrollY() > 0) {
                        C59501NWv.LLII = false;
                    }
                } else {
                    View LIZ = ((NWF) iDTListenerS119S0100000_10.l0).LIZ(R.id.uv);
                    if (LIZ != null && LIZ.getScrollY() > 0) {
                        C59501NWv.LLII = false;
                    }
                }
            }
        } else {
            C59501NWv.LLII = true;
        }
        return true;
    }

    public static final boolean onTouch$11(IDTListenerS119S0100000_10 iDTListenerS119S0100000_10, View view, MotionEvent motionEvent) {
        if (motionEvent == null) {
            return false;
        }
        ((NWF) iDTListenerS119S0100000_10.l0).getActionMode().LIZIZ(motionEvent);
        return false;
    }

    public static final boolean onTouch$12(IDTListenerS119S0100000_10 iDTListenerS119S0100000_10, View view, MotionEvent motionEvent) {
        if (motionEvent == null) {
            return false;
        }
        ((NWF) iDTListenerS119S0100000_10.l0).getActionMode().LIZIZ(motionEvent);
        return false;
    }

    public static final boolean onTouch$13(IDTListenerS119S0100000_10 iDTListenerS119S0100000_10, View view, MotionEvent motionEvent) {
        ((MixActivityContainer) iDTListenerS119S0100000_10.l0).LLD.LJFF(motionEvent);
        return false;
    }

    public static final boolean onTouch$2(IDTListenerS119S0100000_10 iDTListenerS119S0100000_10, View view, MotionEvent motionEvent) {
        Integer valueOf;
        if (motionEvent == null || (valueOf = Integer.valueOf(motionEvent.getAction())) == null || valueOf.intValue() != 1) {
            return false;
        }
        ((SlideAdWebPreloadAssem) iDTListenerS119S0100000_10.l0).LJLJJI = motionEvent.getX();
        ((SlideAdWebPreloadAssem) iDTListenerS119S0100000_10.l0).LJLJJL = motionEvent.getY();
        ((SlideAdWebPreloadAssem) iDTListenerS119S0100000_10.l0).LJLJLJ = true;
        return false;
    }

    public static final boolean onTouch$3(IDTListenerS119S0100000_10 iDTListenerS119S0100000_10, View view, MotionEvent motionEvent) {
        if (!((ViewPagerSwitchHelper) iDTListenerS119S0100000_10.l0).mEnableAutoScroll) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action == 2) {
            ((ViewPagerSwitchHelper) iDTListenerS119S0100000_10.l0).stopAutoSwitch();
        } else if (action == 1) {
            ((ViewPagerSwitchHelper) iDTListenerS119S0100000_10.l0).mHandler.postDelayed(new ARunnableS46S0100000_10(iDTListenerS119S0100000_10, 48), 2000L);
        }
        return false;
    }

    public static final boolean onTouch$4(IDTListenerS119S0100000_10 iDTListenerS119S0100000_10, View view, MotionEvent motionEvent) {
        Aweme aweme;
        RecommendFeedFragmentPanel recommendFeedFragmentPanel;
        Aweme aweme2;
        long j;
        float rawX;
        if (motionEvent.getAction() == 1) {
            VideoBaseCell videoBaseCell = ((C59316NPs) iDTListenerS119S0100000_10.l0).LJLIL;
            long j2 = 0;
            if (C72083SQt.LJLILLLLZI(videoBaseCell) && videoBaseCell != null && (aweme2 = videoBaseCell.getAweme()) != null && C63081OpJ.LLIIII(aweme2)) {
                Fragment fragment = ((C59316NPs) iDTListenerS119S0100000_10.l0).LJLJJL;
                if ((fragment instanceof FeedRecommendFragment) && fragment != null) {
                    j = ((FeedRecommendFragment) fragment).LJLL.getCurrentPlayDuration();
                } else {
                    j = 0;
                }
                HashMap hashMap = new HashMap();
                hashMap.put("duration", String.valueOf(j));
                HashMap hashMap2 = new HashMap();
                if (C90193gN.LIZIZ(((C59316NPs) iDTListenerS119S0100000_10.l0).LJLLI)) {
                    hashMap2.put("click_x", String.valueOf(C60996Nwm.LJIIIIZZ(((C59316NPs) iDTListenerS119S0100000_10.l0).LJLLI) - motionEvent.getRawX()));
                } else {
                    hashMap2.put("click_x", String.valueOf(motionEvent.getRawX()));
                }
                hashMap2.put("click_y", String.valueOf(motionEvent.getRawY()));
                InterfaceC58651N0d interfaceC58651N0d = (InterfaceC58651N0d) C59835Ne3.LJIIJ.LIZ();
                if (interfaceC58651N0d != null) {
                    String json = GsonProtectorUtils.toJson(interfaceC58651N0d.LIZ(), hashMap2);
                    o.LJIIIIZZ(json, "requireNotNull(BaseRunti…getGson().toJson(dataMap)");
                    hashMap.put("ad_extra_data", json);
                    Context context = O6T.LIZ;
                    Aweme aweme3 = videoBaseCell.getAweme();
                    NN1.LJJJJI(context, "skip", aweme3, NN1.LJIIL(context, aweme3, false, hashMap));
                    C58655N0h LIZLLL = C58704N2e.LIZLLL("draw_ad", "skip", videoBaseCell.getAweme().getAwemeRawAd());
                    if (C90193gN.LIZIZ(((C59316NPs) iDTListenerS119S0100000_10.l0).LJLLI)) {
                        rawX = C60996Nwm.LJIIIIZZ(((C59316NPs) iDTListenerS119S0100000_10.l0).LJLLI) - motionEvent.getRawX();
                    } else {
                        rawX = motionEvent.getRawX();
                    }
                    LIZLLL.LIZIZ(Float.valueOf(rawX), "click_x");
                    LIZLLL.LIZIZ(Float.valueOf(motionEvent.getRawY()), "click_y");
                    LIZLLL.LJII();
                    ViewGroup a = ((C59316NPs) iDTListenerS119S0100000_10.l0).a();
                    if (a != null) {
                        NQL.LJIILL().LJJIIJZLJL(O6T.LIZ, a, videoBaseCell.getAweme());
                    }
                } else {
                    "Required value was null.".toString();
                    throw new IllegalArgumentException("Required value was null.");
                }
            }
            C59316NPs c59316NPs = (C59316NPs) iDTListenerS119S0100000_10.l0;
            if (c59316NPs.LLLJL == 2) {
                KeyEvent.Callback callback = c59316NPs.LLF;
                if (callback instanceof NSC) {
                    o.LJII(callback, "null cannot be cast to non-null type com.bytedance.ies.ugc.aweme.commercialize.splash.topview.ISplashMask");
                    ((NSC) callback).LIZ();
                }
                VideoBaseCell videoBaseCell2 = c59316NPs.LJLIL;
                if (C72083SQt.LJLILLLLZI(videoBaseCell2) && (aweme = videoBaseCell2.getAweme()) != null && C63081OpJ.LLIIII(aweme)) {
                    c59316NPs.LLLLL = true;
                    Fragment fragment2 = c59316NPs.LJLJJL;
                    if ((fragment2 instanceof FeedRecommendFragment) && (recommendFeedFragmentPanel = ((FeedRecommendFragment) fragment2).LJLL) != null) {
                        j2 = recommendFeedFragmentPanel.getCurrentPlayDuration();
                        IDP idp = recommendFeedFragmentPanel.mPlayerController;
                        if (idp != null) {
                            idp.LLLIIII = recommendFeedFragmentPanel.getCurrentAweme();
                        }
                    }
                    new HashMap().put("duration", String.valueOf(j2));
                    C2U8.LIZ(new C55045Liz("homepage_hot", videoBaseCell2.getAweme(), "FUNCTION_FROM_TOPVIEW_SKIP"));
                }
            }
        }
        return false;
    }

    public static final boolean onTouch$5(IDTListenerS119S0100000_10 iDTListenerS119S0100000_10, View view, MotionEvent event) {
        NZR webView;
        C59521NXp actionMode = ((C59518NXm) iDTListenerS119S0100000_10.l0).getActionMode();
        o.LJIIIIZZ(event, "event");
        actionMode.LIZIZ(event);
        int action = event.getAction();
        if (action != 0) {
            if ((action == 1 || action == 3) && (webView = ((C59518NXm) iDTListenerS119S0100000_10.l0).getWebView()) != null && webView.getView().getScrollY() > 0) {
                C59520NXo.LLIFFJFJJ = false;
            }
        } else {
            C59520NXo.LLIFFJFJJ = true;
        }
        return true;
    }

    public static final boolean onTouch$6(IDTListenerS119S0100000_10 iDTListenerS119S0100000_10, View view, MotionEvent motionEvent) {
        if (motionEvent == null) {
            return false;
        }
        ((C59518NXm) iDTListenerS119S0100000_10.l0).getActionMode().LIZIZ(motionEvent);
        return false;
    }

    public static final boolean onTouch$7(IDTListenerS119S0100000_10 iDTListenerS119S0100000_10, View view, MotionEvent motionEvent) {
        if (((O7W) iDTListenerS119S0100000_10.l0).getTouchDelegate() != null && ((O7W) iDTListenerS119S0100000_10.l0).getTouchDelegate().onTouchEvent(motionEvent)) {
            return true;
        }
        return false;
    }

    public static final boolean onTouch$8(IDTListenerS119S0100000_10 iDTListenerS119S0100000_10, View view, MotionEvent motionEvent) {
        ((C5S1) iDTListenerS119S0100000_10.l0).LJ();
        return true;
    }

    public static final boolean onTouch$9(IDTListenerS119S0100000_10 iDTListenerS119S0100000_10, View view, MotionEvent motionEvent) {
        if (motionEvent == null) {
            return false;
        }
        ((NWF) iDTListenerS119S0100000_10.l0).getActionMode().LIZIZ(motionEvent);
        if (CommerceWebCrossToSparkExt.LIZIZ()) {
            NUM iAdWebBottomBar = ((NWI) ((NWF) iDTListenerS119S0100000_10.l0).LIZ(R.id.uv)).getIAdWebBottomBar();
            if (iAdWebBottomBar != null) {
                iAdWebBottomBar.LJFF(motionEvent);
            }
        } else {
            ((C59571NZn) ((NWF) iDTListenerS119S0100000_10.l0).LIZ(R.id.hxb)).LJFF(motionEvent);
        }
        return false;
    }
}

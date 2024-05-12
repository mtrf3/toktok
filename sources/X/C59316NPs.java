package X;

import Y.ACListenerS30S0100000_10;
import Y.ACListenerS45S0200000_10;
import Y.ALAdapterS8S0100000_10;
import Y.AObserverS78S0100000_10;
import Y.ARunnableS10S0301000_10;
import Y.ARunnableS21S0300000_10;
import Y.ARunnableS29S0200000_10;
import Y.ARunnableS2S0102000_10;
import Y.ARunnableS2S0220000_10;
import Y.ARunnableS37S0100000_1;
import Y.ARunnableS39S0100000_3;
import Y.ARunnableS45S0100000_9;
import Y.ARunnableS46S0100000_10;
import Y.ARunnableS6S0200100_10;
import Y.IDDListenerS391S0100000_4;
import Y.IDTListenerS119S0100000_10;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.drawable.ColorDrawable;
import android.os.Handler;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.ViewStub;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Observer;
import com.bytedance.android.livesdk.livesetting.banner.LiveEffectMusicFadeDurationSetting;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveCenterDelayLoadSetting;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveMaxRetainAlogMessageSizeSetting;
import com.bytedance.android.livesdk.livesetting.performance.LivePlayEnforceIntervalSetting;
import com.bytedance.android.livesdk.livesetting.publicscreen.LiveChatShowDelayForHotLiveSetting;
import com.bytedance.android.livesdk.livesetting.pullstream.LiveNetAdaptiveHurryTimeSetting;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.ies.ugc.aweme.commercialize.scene.api.IAdSceneService;
import com.bytedance.ies.ugc.aweme.commercialize.search.core.SearchAdMainService;
import com.bytedance.ies.ugc.aweme.commercialize.splash.core.SplashAdServiceImpl;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.tux.input.TuxTextView;
import com.google.gson.Gson;
import com.ss.android.agilelogger.ALog;
import com.ss.android.ugc.aweme.ad.FeedAdServiceImpl;
import com.ss.android.ugc.aweme.ad.feed.FeedBehaviourViewModel;
import com.ss.android.ugc.aweme.ad.feed.IFeedAdService;
import com.ss.android.ugc.aweme.ad.feed.ibe.CommerceIBEService;
import com.ss.android.ugc.aweme.ad.feed.shakeEgg.ShakeEggSetting;
import com.ss.android.ugc.aweme.ad.feed.shakeEgg.ShakeEggVM;
import com.ss.android.ugc.aweme.ad.preload.AdLandPagePreloadServiceImpl;
import com.ss.android.ugc.aweme.ad.preload.IAdLandPagePreloadService;
import com.ss.android.ugc.aweme.anchor.service.AnchorStateServiceImpl;
import com.ss.android.ugc.aweme.anchor.service.EcommerceAnchorService;
import com.ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.ss.android.ugc.aweme.arch.widgets.base.WidgetManager;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.base.ui.TagLayout;
import com.ss.android.ugc.aweme.cct.OpenCCTUtils;
import com.ss.android.ugc.aweme.comment.service.CommentServiceImpl;
import com.ss.android.ugc.aweme.commercialize.ad.service.ICommercializeAdService;
import com.ss.android.ugc.aweme.commercialize.feed.assem.FeedAdViewModel;
import com.ss.android.ugc.aweme.commercialize.feed.assem.playfun.AdPlayFunVM;
import com.ss.android.ugc.aweme.commercialize.feed.assem.popup.viewmodel.AdPopUpWebPageVM;
import com.ss.android.ugc.aweme.commercialize.measurement.MeasurementServiceImpl;
import com.ss.android.ugc.aweme.commercialize.model.AdFeInteractionModel;
import com.ss.android.ugc.aweme.commercialize.model.AdProductTile;
import com.ss.android.ugc.aweme.commercialize.model.AdStickerData;
import com.ss.android.ugc.aweme.commercialize.model.DouPlusLinkData;
import com.ss.android.ugc.aweme.commercialize.model.LinkData;
import com.ss.android.ugc.aweme.commercialize.model.PlaybackSecondsTrack;
import com.ss.android.ugc.aweme.commercialize.model.ShakeModel;
import com.ss.android.ugc.aweme.commercialize.profile.AdProfilePopUpWebPageWidget;
import com.ss.android.ugc.aweme.commercialize.service.IAdPhotoModeService;
import com.ss.android.ugc.aweme.commercialize.tcm.service.ITcmService;
import com.ss.android.ugc.aweme.commercialize.utils.video.VideoPlayTaskManager;
import com.ss.android.ugc.aweme.commercialize.widget.CommonWebPageWidget;
import com.ss.android.ugc.aweme.commercialize_x.service.CommercializeAdServiceImpl;
import com.ss.android.ugc.aweme.detail.panel.DetailFragmentPanel;
import com.ss.android.ugc.aweme.detail.platform.IDetailPageAbility;
import com.ss.android.ugc.aweme.detail.ui.DetailActivity;
import com.ss.android.ugc.aweme.detail.ui.DetailPageFragment;
import com.ss.android.ugc.aweme.ecommerce.service.IECommerceService;
import com.ss.android.ugc.aweme.ecommerce.ug.vsa.service.EcUgVSAService;
import com.ss.android.ugc.aweme.ecommerce.ug.vsa.service.IEcUgVSAService;
import com.ss.android.ugc.aweme.feed.FypAutoScrollService;
import com.ss.android.ugc.aweme.feed.adapter.VideoBaseCell;
import com.ss.android.ugc.aweme.feed.adapter.VideoPlayViewModel;
import com.ss.android.ugc.aweme.feed.adapter.VideoViewCell;
import com.ss.android.ugc.aweme.feed.model.AdGestureGuidance;
import com.ss.android.ugc.aweme.feed.model.AdInteractionData;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemePlayFunModel;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.feed.model.AwemeSplashInfo;
import com.ss.android.ugc.aweme.feed.model.AwemeTextLabelModel;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.feed.model.LiveAdCardModel;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.feed.model.commercialize.CommerceSmartUITasks;
import com.ss.android.ugc.aweme.feed.ui.FeedFollowFragment;
import com.ss.android.ugc.aweme.feed.ui.FeedRecommendFragment;
import com.ss.android.ugc.aweme.ml.api.SmartFeedAdUIService;
import com.ss.android.ugc.aweme.popularfeed.ui.FeedPopularFragment;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.structure.api.ICommerceService;
import com.ss.android.ugc.feed.platform.panel.autoscroll.FypAutoScrollServiceImpl;
import com.zhiliaoapp.musically.R;
import defpackage.e1;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.AqS15S0010000_10;
import kotlin.jvm.internal.AqS160S0100000_10;
import kotlin.jvm.internal.AqS176S0100000_10;
import kotlin.jvm.internal.AqS34S0001000_10;
import kotlin.jvm.internal.AqS8S0010000_3;
import kotlin.jvm.internal.o;
import org.json.JSONArray;

/* renamed from: X.NPs, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C59316NPs extends QXX implements AnonymousClass901, Observer<C207668Da>, InterfaceC41034G8o<InterfaceC59121NIf> {
    public static final String LLLLLLZ = C16880lQ.LJLLJ(C59316NPs.class);
    public final VideoBaseCell LJLIL;
    public final View LJLILLLLZI;
    public final int LJLJI;
    public final InterfaceC72642tA<C50420Jqa> LJLJJI;
    public final Fragment LJLJJL;
    public final InterfaceC59121NIf LJLJJLL;
    public final Handler LJLJL;
    public Aweme LJLJLJ;
    public int LJLJLLL;
    public final String LJLL;
    public final Context LJLLI;
    public long LJLLILLLL;
    public DataCenter LJLLJ;
    public final VideoPlayTaskManager LJLLL;
    public final C62822Ol8 LJLLLL;
    public final C62822Ol8 LJLLLLLL;
    public final C62822Ol8 LJLZ;
    public final C62822Ol8 LJZ;
    public final C62822Ol8 LJZI;
    public final C62822Ol8 LJZL;
    public final C62822Ol8 LL;
    public NQ2 LLD;
    public View LLF;
    public ViewGroup LLFF;
    public final FrameLayout LLFFF;
    public final LinearLayout LLFII;
    public final FrameLayout LLFZ;
    public C62846OlW LLI;
    public LinearLayout LLIFFJFJJ;
    public final C62822Ol8 LLII;
    public final C62822Ol8 LLIIII;
    public final C62822Ol8 LLIIIILZ;
    public final C62822Ol8 LLIIIJ;
    public final C62822Ol8 LLIIIL;
    public final C62822Ol8 LLIIIZ;
    public final C62822Ol8 LLIIJI;
    public final C62822Ol8 LLIIJLIL;
    public final C62822Ol8 LLIIL;
    public final C62822Ol8 LLIILII;
    public final C62822Ol8 LLIILZL;
    public final C62822Ol8 LLIIZ;
    public final C62822Ol8 LLIL;
    public final C62822Ol8 LLILII;
    public final C62822Ol8 LLILIL;
    public final C62822Ol8 LLILL;
    public final C62822Ol8 LLILLIZIL;
    public NRW LLILLJJLI;
    public C163386b8 LLILLL;
    public AnonymousClass375 LLILZ;
    public ViewGroup LLILZIL;
    public ViewGroup LLILZLL;
    public C62846OlW LLIZ;
    public TextView LLIZLLLIL;
    public ViewGroup LLJ;
    public LinearLayout LLJI;
    public C59948Nfs LLJIJIL;
    public C59948Nfs LLJILJIL;
    public TuxTextView LLJILJILJ;
    public TuxTextView LLJILLL;
    public final RelativeLayout LLJJ;
    public final View LLJJI;
    public final View LLJJIII;
    public final View LLJJIJI;
    public final View LLJJIJIIJIL;
    public final FrameLayout LLJJIJIL;
    public final TagLayout LLJJJ;
    public NI4 LLJJJIL;
    public InterfaceC59325NQb LLJJJJ;
    public final FeedAdViewModel LLJJJJJIL;
    public final ShakeEggVM LLJJJJLIIL;
    public final C62822Ol8 LLJJL;
    public final InterfaceC59347NQx LLJJLIIIJLLLLLLLZ;
    public final InterfaceC59346NQw LLJL;
    public final NQG LLJLIL;
    public final NQI LLJLILLLLZIIL;
    public final NQI LLJLL;
    public final AbstractC59106NHq LLJLLIL;
    public final NRT LLJLLL;
    public final NSE LLJZ;
    public final InterfaceC59328NQe LLJZIJLIL;
    public NQU LLL;
    public final C62822Ol8 LLLF;
    public NRU LLLFF;
    public NRY LLLFFI;
    public IFG LLLFZ;
    public InterfaceC59245NMz LLLI;
    public N7D LLLII;
    public WidgetManager LLLIIII;
    public VideoPlayTaskManager LLLIIIIL;
    public RunnableC58744N3s LLLIIIL;
    public boolean LLLIIL;
    public boolean LLLIILIL;
    public boolean LLLIL;
    public final C59319NPv LLLILZ;
    public String LLLILZJ;
    public String LLLILZLLLI;
    public String LLLIZZ;
    public boolean LLLJ;
    public M89 LLLJIL;
    public int LLLJL;
    public RunnableC59323NPz LLLL;
    public final ARunnableS46S0100000_10 LLLLII;
    public AnimatorSet LLLLIIIILLL;
    public boolean LLLLIIL;
    public boolean LLLLIILL;
    public boolean LLLLIILLL;
    public boolean LLLLIL;
    public boolean LLLLILI;
    public boolean LLLLJ;
    public boolean LLLLJI;
    public boolean LLLLL;
    public final IDX LLLLLIL;
    public InterfaceC37276Ek4<LiveAdCardModel> LLLLLILLIL;
    public boolean LLLLLJIL;
    public boolean LLLLLJLJLL;
    public boolean LLLLLL;
    public int LLLLLLIL;
    public final FeedBehaviourViewModel LLLLLLJ;
    public final CopyOnWriteArrayList<String> LLLLLLL;
    public Boolean LLLLLLLLL;
    public final C59123NIh LLLLLLLLLL;
    public final IDW LLLLLLLZIL;

    @Override // X.AnonymousClass901
    public final void R2() {
    }

    @Override // X.AnonymousClass901
    public final void c2(long j) {
    }

    @Override // X.AnonymousClass901
    public final void g3() {
    }

    @Override // X.AnonymousClass901
    public final void h3() {
        r(1);
    }

    @Override // X.InterfaceC41000G7g
    public final void initialize() {
    }

    public final void A() {
        boolean y;
        LinkData linkData;
        boolean LIZIZ;
        DouPlusLinkData douPlusLinkData;
        int i;
        Aweme aweme;
        AwemeRawAd awemeRawAd;
        AwemeRawAd awemeRawAd2;
        if (this.LJLJLJ == null) {
            return;
        }
        if (C34710Djm.LIZLLL()) {
            linkData = C63077OpF.LIZ(this.LJLJLJ);
            if (linkData != null && y(this.LJLJLJ)) {
                y = true;
            } else {
                y = false;
            }
        } else {
            y = y(this.LJLJLJ);
            linkData = null;
        }
        if (y) {
            if (this.LLILLJJLI == null && C226128u8.LIZ()) {
                View i2 = i(R.layout.adh, "link_tag");
                o.LJII(i2, "null cannot be cast to non-null type com.ss.android.ugc.aweme.commercialize.link.video.CommerceTagLayout");
                this.LLILLJJLI = (NRW) i2;
            }
            if (linkData != null || (linkData = C63077OpF.LIZ(this.LJLJLJ)) != null) {
                C38499F9b.LIZ.LIZIZ().preloadMiniApp(linkData.mpUrl);
            }
            NRW nrw = this.LLILLJJLI;
            if (nrw != null) {
                C59167NJz c59167NJz = new C59167NJz(this, linkData);
                NQ0 nq0 = new NQ0(nrw.getContext());
                nrw.LJLIL = nq0;
                nq0.setLinkTagCallBack(c59167NJz);
                NQ0 nq02 = nrw.LJLIL;
                nq02.LJLJJI = c59167NJz;
                if (linkData == null) {
                    nq02.LJLIL.setImageResource(R.color.cz);
                    nq02.LJLILLLLZI.setText("");
                } else {
                    Integer LJI = C79045V0n.LJI(R.attr.cj, nq02.getContext());
                    if (LJI != null) {
                        nq02.LJLIL.getHierarchy().LJIILL(new ColorDrawable(LJI.intValue()), 5);
                    } else {
                        nq02.LJLIL.getHierarchy().LJIILL(new ColorDrawable(), 5);
                    }
                    UrlModel urlModel = linkData.avatarIcon;
                    if (urlModel != null && !C79004UzY.LJJIFFI(urlModel.getUrlList())) {
                        C78765Uvh.LJFF(nq02.LJLIL, linkData.avatarIcon);
                    } else {
                        nq02.LJLIL.setImageResource(R.color.cz);
                    }
                    if (linkData.showCloseTips) {
                        nq02.LJLJI.setVisibility(0);
                    } else {
                        nq02.LJLJI.setVisibility(8);
                    }
                    C16880lQ.LJIILLIIL(nq02.LJLJI, new ACListenerS45S0200000_10(nrw, c59167NJz, 18));
                    nq02.LJLILLLLZI.setText(linkData.title);
                    if (!TextUtils.isEmpty(linkData.label)) {
                        TextView textView = (TextView) nq02.findViewById(R.id.u9);
                        textView.setVisibility(0);
                        textView.setText(linkData.label);
                    }
                }
                nrw.removeAllViews();
                NQ0 nq03 = nrw.LJLIL;
                nq03.getClass();
                nrw.addView(nq03);
            }
            NRW nrw2 = this.LLILLJJLI;
            if (nrw2 != null) {
                nrw2.setVisibility(0);
            }
            v("link_tag", true);
        } else {
            NRW nrw3 = this.LLILLJJLI;
            if (nrw3 != null) {
                nrw3.removeAllViews();
                nrw3.LJLIL = null;
            }
            NRW nrw4 = this.LLILLJJLI;
            if (nrw4 != null) {
                nrw4.setVisibility(8);
            }
            v("link_tag", false);
        }
        if (this.LJLJLJ == null) {
            return;
        }
        if (C34710Djm.LIZLLL()) {
            Aweme aweme2 = this.LJLJLJ;
            if (aweme2 != null && (awemeRawAd2 = aweme2.getAwemeRawAd()) != null) {
                douPlusLinkData = awemeRawAd2.getDouPlusLinkData();
                if (douPlusLinkData != null && C59646Nb0.LIZIZ(this.LJLJLJ, false, 0, "dou+")) {
                    LIZIZ = true;
                }
            } else {
                douPlusLinkData = null;
            }
            LIZIZ = false;
        } else {
            LIZIZ = C59646Nb0.LIZIZ(this.LJLJLJ, false, 0, "dou+");
            douPlusLinkData = null;
        }
        if (!LIZIZ) {
            C163386b8 c163386b8 = this.LLILLL;
            if (c163386b8 != null) {
                c163386b8.removeAllViews();
                c163386b8.LJLIL = null;
            }
            C163386b8 c163386b82 = this.LLILLL;
            if (c163386b82 != null) {
                c163386b82.setVisibility(8);
            }
            v("dou_plus_link_tag", false);
            return;
        }
        if (this.LLILLL == null && C226128u8.LIZ()) {
            View i3 = i(R.layout.aan, "dou_plus_link_tag");
            o.LJII(i3, "null cannot be cast to non-null type com.ss.android.ugc.aweme.commercialize.link.video.DouPlusTagLayout");
            this.LLILLL = (C163386b8) i3;
        }
        if (douPlusLinkData == null && ((aweme = this.LJLJLJ) == null || (awemeRawAd = aweme.getAwemeRawAd()) == null || (douPlusLinkData = awemeRawAd.getDouPlusLinkData()) == null)) {
            return;
        }
        C163386b8 c163386b83 = this.LLILLL;
        if (c163386b83 != null) {
            C59131NIp c59131NIp = new C59131NIp(this, douPlusLinkData);
            ViewOnClickListenerC163376b7 viewOnClickListenerC163376b7 = new ViewOnClickListenerC163376b7(c163386b83.getContext());
            c163386b83.LJLIL = viewOnClickListenerC163376b7;
            viewOnClickListenerC163376b7.LJLJJI = c59131NIp;
            Context context = viewOnClickListenerC163376b7.getContext();
            o.LJIIIIZZ(context, "context");
            Integer LJI2 = C79045V0n.LJI(R.attr.cj, context);
            if (LJI2 != null) {
                i = LJI2.intValue();
            } else {
                i = 0;
            }
            viewOnClickListenerC163376b7.LJLIL.getHierarchy().LJIILL(new ColorDrawable(i), 5);
            UrlModel urlModel2 = douPlusLinkData.avatarIcon;
            if (urlModel2 != null && !C79004UzY.LJJIFFI(urlModel2.getUrlList())) {
                C78765Uvh.LJFF(viewOnClickListenerC163376b7.LJLIL, douPlusLinkData.avatarIcon);
            } else {
                viewOnClickListenerC163376b7.LJLIL.setImageResource(R.color.cz);
            }
            viewOnClickListenerC163376b7.LJLJI.setVisibility(8);
            viewOnClickListenerC163376b7.LJLILLLLZI.setText(douPlusLinkData.title);
            c163386b83.removeAllViews();
            ViewOnClickListenerC163376b7 viewOnClickListenerC163376b72 = c163386b83.LJLIL;
            o.LJI(viewOnClickListenerC163376b72);
            c163386b83.addView(viewOnClickListenerC163376b72);
        }
        C163386b8 c163386b84 = this.LLILLL;
        if (c163386b84 != null) {
            c163386b84.setVisibility(0);
        }
        v("dou_plus_link_tag", true);
    }

    @Override // X.AnonymousClass901
    public final boolean A2() {
        boolean z;
        Aweme aweme = this.LJLJLJ;
        if (aweme != null && C63081OpJ.LJLJJL(aweme)) {
            z = true;
        } else {
            z = false;
        }
        Aweme aweme2 = this.LJLJLJ;
        if ((aweme2 != null && aweme2.isAd()) || !z) {
            return false;
        }
        C26045AKb c26045AKb = new C26045AKb(this.LLJJ);
        c26045AKb.LJIIIIZZ(R.string.b95);
        c26045AKb.LJIIJ();
        return true;
    }

    public final void E() {
        if (this.LLIFFJFJJ == null) {
            LinearLayout linearLayout = (LinearLayout) C0IF.LIZIZ(this.LJLILLLLZI, null, R.id.d6n, R.id.nf5);
            if (linearLayout != null) {
                this.LLIFFJFJJ = linearLayout;
            }
            View view = this.LJLILLLLZI;
            View findViewById = view.findViewById(R.id.d6l);
            if (findViewById != null) {
                C16880lQ.LJIIJ(new ACListenerS30S0100000_10(this, 81), findViewById);
            }
            View findViewById2 = view.findViewById(R.id.d6n);
            if (findViewById2 != null) {
                C16880lQ.LJIIJ(new ACListenerS30S0100000_10(this, 82), findViewById2);
            }
            View findViewById3 = view.findViewById(R.id.d6p);
            if (findViewById3 != null) {
                C16880lQ.LJIIJ(new ACListenerS30S0100000_10(this, 83), findViewById3);
            }
            View findViewById4 = view.findViewById(R.id.rx);
            if (findViewById4 != null) {
                C16880lQ.LJIIJ(new ACListenerS30S0100000_10(this, 84), findViewById4);
            }
            View findViewById5 = view.findViewById(R.id.qr);
            if (findViewById5 != null) {
                C16880lQ.LJIIJ(new ACListenerS30S0100000_10(this, 86), findViewById5);
            }
            View findViewById6 = view.findViewById(R.id.sv);
            if (findViewById6 != null) {
                C16880lQ.LJIIJ(new ACListenerS30S0100000_10(this, 87), findViewById6);
            }
            View findViewById7 = view.findViewById(R.id.sn);
            if (findViewById7 != null) {
                C16880lQ.LJIIJ(new ACListenerS30S0100000_10(this, 88), findViewById7);
            }
            View findViewById8 = view.findViewById(R.id.uc);
            if (findViewById8 != null) {
                C16880lQ.LJIIJ(new ACListenerS30S0100000_10(this, 89), findViewById8);
            }
            View findViewById9 = view.findViewById(R.id.rz);
            if (findViewById9 != null) {
                C16880lQ.LJIIJ(new ACListenerS30S0100000_10(this, 90), findViewById9);
            }
            View findViewById10 = view.findViewById(R.id.us);
            if (findViewById10 != null) {
                C16880lQ.LJIIJ(new ACListenerS30S0100000_10(this, 75), findViewById10);
            }
            View findViewById11 = view.findViewById(R.id.uf);
            if (findViewById11 != null) {
                C16880lQ.LJIIJ(new ACListenerS30S0100000_10(this, 77), findViewById11);
            }
            View findViewById12 = view.findViewById(R.id.tn);
            if (findViewById12 != null) {
                C16880lQ.LJIIJ(new ACListenerS30S0100000_10(this, 79), findViewById12);
            }
        }
    }

    public final void G() {
        C91Z c91z = this.LJLIL;
        if (c91z instanceof IE5) {
            o.LJII(c91z, "null cannot be cast to non-null type com.ss.android.ugc.aweme.feed.adapter.IDynamicAdViewHolder");
            ((InterfaceC212318Ux) c91z).pausePlayer();
        } else {
            IWF.LJJLIIIIJ().LJIILJJIL();
        }
    }

    @Override // X.AnonymousClass901
    public final boolean G2() {
        NQI nqi = this.LLJLILLLLZIIL;
        if (nqi == null || !nqi.isShowing()) {
            return false;
        }
        return true;
    }

    public final void H() {
        C91Z c91z = this.LJLIL;
        if (c91z instanceof IE5) {
            o.LJII(c91z, "null cannot be cast to non-null type com.ss.android.ugc.aweme.feed.adapter.IDynamicAdViewHolder");
            ((InterfaceC212318Ux) c91z).LJJJJLI();
        } else {
            IWF.LJJLIIIIJ().LIZIZ();
        }
    }

    public final boolean I() {
        Boolean bool = this.LLLLLLLLL;
        if (bool != null) {
            return bool.booleanValue();
        }
        boolean LIZ = e1.LIZ(31744, "use_new_mask", true, false);
        this.LLLLLLLLL = Boolean.valueOf(LIZ);
        return LIZ;
    }

    @Override // X.AnonymousClass901
    public final void J2() {
        NQ2 nq2 = this.LLD;
        if (nq2 != null) {
            nq2.LJIJI(true);
        } else {
            o.LJIJI("nativeAdBottomLabelView");
            throw null;
        }
    }

    @Override // X.AnonymousClass901
    public final void K2() {
        InterfaceC59346NQw interfaceC59346NQw = this.LLJL;
        if (interfaceC59346NQw != null) {
            interfaceC59346NQw.LIZJ();
        }
    }

    @Override // X.AnonymousClass901
    public final void LIZIZ() {
        AbstractC59064NGa abstractC59064NGa;
        IFG ifg = this.LLLFZ;
        if (ifg != null) {
            ifg.LIZIZ(this.LJLLI, this.LJLJLJ, this.LJLL);
        }
        this.LLLFZ = null;
        InterfaceC59245NMz interfaceC59245NMz = this.LLLI;
        if (interfaceC59245NMz != null) {
            for (Class value : C59367NRr.LIZ(interfaceC59245NMz)) {
                C59403NTb<InterfaceC41034G8o<? extends Object>> c59403NTb = C59367NRr.LIZIZ;
                c59403NTb.getClass();
                o.LJIIIZ(value, "value");
                c59403NTb.LIZJ.remove(value);
            }
            this.LLLI = null;
        }
        NRT nrt = this.LLJLLL;
        if (nrt != null) {
            nrt.LIZIZ();
        }
        LLZLLIL().LIZIZ();
        NQI nqi = this.LLJLILLLLZIIL;
        if (nqi != null) {
            nqi.LIZIZ();
        }
        NQI nqi2 = this.LLJLL;
        if (nqi2 != null) {
            nqi2.LIZIZ();
        }
        AbstractC59106NHq abstractC59106NHq = this.LLJLLIL;
        if (abstractC59106NHq != null) {
            if (!abstractC59106NHq.LJFF() && (abstractC59064NGa = abstractC59106NHq.LJLJJLL) != null) {
                abstractC59064NGa.LJII();
            }
            abstractC59106NHq.LJIIIZ();
        }
        InterfaceC59346NQw interfaceC59346NQw = this.LLJL;
        if (interfaceC59346NQw != null) {
            interfaceC59346NQw.LIZIZ();
        }
        NQG nqg = this.LLJLIL;
        if (nqg != null) {
            nqg.LIZIZ();
        }
        NRU nru = this.LLLFF;
        if (nru != null) {
            nru.LLZ();
        }
        NRY nry = this.LLLFFI;
        if (nry != null) {
            nry.LLZ();
        }
        this.LLLFFI = null;
        NQU nqu = this.LLL;
        if (nqu != null) {
            nqu.unBind();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x0217  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0228  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x025a  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x03f9  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x026d  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0278  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0293  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x02bf  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x02c8  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x0480  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x03f4  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x0467  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01bb  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01d6  */
    @Override // X.AnonymousClass901
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJII() {
        /*
            Method dump skipped, instructions count: 1160
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C59316NPs.LJJII():void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:202:0x02b2, code lost:
    
        if (X.C63081OpJ.LLIFFJFJJ(r0) == true) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:199:0x02c6  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0083  */
    @Override // X.AnonymousClass901
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJIIZ() {
        /*
            Method dump skipped, instructions count: 714
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C59316NPs.LJJIIZ():void");
    }

    @Override // X.AnonymousClass901
    public final void LJJJJJL() {
        LinearLayout linearLayout;
        ViewPropertyAnimator animate;
        ViewPropertyAnimator alpha;
        ViewPropertyAnimator duration;
        ViewPropertyAnimator withEndAction;
        DataCenter dataCenter = this.LJLLJ;
        if (dataCenter != null) {
            dataCenter.jv0(null, "ad_video_on_resume_play");
        }
        this.LLJJJJJIL.setState(C59537NYf.LJLIL);
        DataCenter dataCenter2 = this.LJLLJ;
        if (dataCenter2 != null) {
            dataCenter2.jv0(Boolean.TRUE, "ad_feed_video_playing_state");
        }
        Aweme aweme = this.LJLJLJ;
        boolean z = false;
        if (!ShakeEggSetting.LIZ().closeShakeEgg && NHO.LIZIZ.LIZIZ(aweme) != null) {
            ShakeEggVM shakeEggVM = this.LLJJJJLIIL;
            if (shakeEggVM.LJLJI) {
                shakeEggVM.LJLLILLLL.setValue(null);
            }
        }
        this.LLLLIL = false;
        if ((!C46252IDg.LIZ(this.LJLJLJ) || this.LLLIILIL) && ((linearLayout = this.LLIFFJFJJ) == null || linearLayout.getVisibility() != 8)) {
            LinearLayout linearLayout2 = this.LLIFFJFJJ;
            if (linearLayout2 != null) {
                linearLayout2.setAlpha(1.0f);
            }
            LinearLayout linearLayout3 = this.LLIFFJFJJ;
            if (linearLayout3 != null && (animate = linearLayout3.animate()) != null && (alpha = animate.alpha(0.0f)) != null && (duration = alpha.setDuration(150L)) != null && (withEndAction = duration.withEndAction(new ARunnableS46S0100000_10(this, 79))) != null) {
                withEndAction.start();
            }
        }
        NQ2 nq2 = this.LLD;
        if (nq2 != null) {
            Aweme aweme2 = this.LJLJLJ;
            if (aweme2 != null && C63081OpJ.LLIIJI(aweme2)) {
                z = true;
            }
            nq2.LJIJI(!z);
            NQ2 nq22 = this.LLD;
            if (nq22 != null) {
                nq22.LJIJ(Boolean.FALSE);
                AdPopUpWebPageVM LIZJ = C214058af.LIZJ(this.LJLIL);
                this.LLJZIJLIL.LJJJJJL();
                if ((TextUtils.equals(this.LJLL, "homepage_hot") || TextUtils.equals(this.LJLL, "homepage_follow") || TextUtils.equals(this.LJLL, "homepage_popular")) && LIZJ != null && !LIZJ.LJLLILLLL) {
                    C58283Mu7.LIZIZ.LIZJ(this.LJLLI, this.LJLJLJ);
                    return;
                }
                return;
            }
            o.LJIJI("nativeAdBottomLabelView");
            throw null;
        }
        o.LJIJI("nativeAdBottomLabelView");
        throw null;
    }

    @Override // X.AnonymousClass901
    public final void LJJJJLL() {
        if (this.LJLJLJ != null) {
            C0IF.LIZIZ(this.LJLILLLLZI, null, R.id.arz, R.id.nex);
            LLZLLIL().LJJJJLL();
        }
    }

    @Override // X.AnonymousClass901
    public final void LJJJJZI() {
        DataCenter dataCenter = this.LJLLJ;
        if (dataCenter != null) {
            dataCenter.jv0(null, "ad_video_on_pause_play");
        }
        this.LLJJJJJIL.setState(C59536NYe.LJLIL);
        DataCenter dataCenter2 = this.LJLLJ;
        if (dataCenter2 != null) {
            dataCenter2.jv0(Boolean.FALSE, "ad_feed_video_playing_state");
        }
        this.LLLLIL = true;
        this.LLJZIJLIL.LJJJJZI();
    }

    public final ActivityC45651qj LLLLZLLLI() {
        ActivityC45651qj LJJIFFI = C45804HyK.LJJIFFI(this.LJLLI);
        if (LJJIFFI != null) {
            return LJJIFFI;
        }
        "Required value was null.".toString();
        throw new IllegalArgumentException("Required value was null.");
    }

    public final TextView LLLZ() {
        Object value = this.LLIIIZ.getValue();
        o.LJIIIIZZ(value, "<get-adAppUseNumber>(...)");
        return (TextView) value;
    }

    public final T5B LLLZI() {
        Object value = this.LLIIL.getValue();
        o.LJIIIIZZ(value, "<get-adGuideDesc>(...)");
        return (T5B) value;
    }

    public final C62846OlW LLLZIL() {
        Object value = this.LLIILII.getValue();
        o.LJIIIIZZ(value, "<get-adGuideIcon>(...)");
        return (C62846OlW) value;
    }

    public final C62846OlW LLLZL() {
        Object value = this.LLIILZL.getValue();
        o.LJIIIIZZ(value, "<get-adGuideImage>(...)");
        return (C62846OlW) value;
    }

    public final TextView LLLZLL() {
        Object value = this.LLIL.getValue();
        o.LJIIIIZZ(value, "<get-adGuideLabel>(...)");
        return (TextView) value;
    }

    public final TextView LLLZLZ() {
        Object value = this.LLIIIILZ.getValue();
        o.LJIIIIZZ(value, "<get-adGuideName>(...)");
        return (TextView) value;
    }

    public final TextView LLLZZ() {
        Object value = this.LLILII.getValue();
        o.LJIIIIZZ(value, "<get-adGuideTitle>(...)");
        return (TextView) value;
    }

    public final LinearLayout LLLZZIL() {
        Object value = this.LLIIJI.getValue();
        o.LJIIIIZZ(value, "<get-adLikeLayout>(...)");
        return (LinearLayout) value;
    }

    public final LinearLayout LLZIL() {
        Object value = this.LLILIL.getValue();
        o.LJIIIIZZ(value, "<get-adPriceLayout>(...)");
        return (LinearLayout) value;
    }

    public final C227088vg LLZILL() {
        Object value = this.LLIIIJ.getValue();
        o.LJIIIIZZ(value, "<get-adRatingView>(...)");
        return (C227088vg) value;
    }

    public final IAdSceneService LLZL() {
        return (IAdSceneService) this.LJLLLL.getValue();
    }

    public final C5L9 LLZLI() {
        Object value = this.LLIIJLIL.getValue();
        o.LJIIIIZZ(value, "<get-adTagGroup>(...)");
        return (C5L9) value;
    }

    public final AwemeRawAd LLZLL() {
        Aweme aweme = this.LJLJLJ;
        if ((aweme == null || aweme.getAwemeRawAd() == null) && NSJ.LIZ().enableFixPlayerEvent) {
            return NQK.LIZ;
        }
        Aweme aweme2 = this.LJLJLJ;
        if (aweme2 == null) {
            return null;
        }
        return aweme2.getAwemeRawAd();
    }

    public final NQB LLZLLIL() {
        return (NQB) this.LLJJL.getValue();
    }

    public final TextView LLZLLLL() {
        Object value = this.LLII.getValue();
        o.LJIIIIZZ(value, "<get-feedAdDownloadBtn>(...)");
        return (TextView) value;
    }

    public final IFeedAdService LLZZ() {
        return (IFeedAdService) this.LJLZ.getValue();
    }

    public final InterfaceC58942NBi LLZZJLIL() {
        return ((ICommerceService) this.LL.getValue()).LIZIZ().LIZJ(this.LJLLI, this.LJLJLJ, this.LJLL, true);
    }

    public final View LLZZLLIL() {
        InterfaceC57312Mt LJIIIIZZ = this.LJLIL.LJIIIIZZ();
        if (LJIIIIZZ != null) {
            return LJIIIIZZ.getRootView();
        }
        return null;
    }

    public final String LLZZZZ() {
        IDR idr;
        Fragment fragment = this.LJLJJL;
        if (fragment instanceof FeedRecommendFragment) {
            idr = ((FeedRecommendFragment) fragment).LJLL;
        } else if (fragment instanceof FeedFollowFragment) {
            idr = ((FeedFollowFragment) fragment).LLFZ;
        } else {
            if (!(fragment instanceof FeedPopularFragment)) {
                return null;
            }
            idr = ((FeedPopularFragment) fragment).LJLJLLL;
        }
        if (idr == null) {
            return null;
        }
        return idr.getOmSdkContentUrl(this.LJLJLJ);
    }

    @Override // X.AnonymousClass901
    public final void M2() {
        NQI nqi;
        Aweme aweme = this.LJLJLJ;
        if (aweme != null && ((RBX) HG3.LJIILL()).isLogin()) {
            if (this.LLJLL != null && aweme.isAd() && (nqi = this.LLJLL) != null) {
                nqi.LJ(0L);
            }
            if (this.LLJLLIL != null && aweme.isAd()) {
                z();
            }
        }
    }

    @Override // X.AnonymousClass901
    public final void N2() {
        NQI nqi = this.LLJLL;
        if (nqi != null && !this.LLLLLL) {
            nqi.LIZJ();
            this.LLLLLL = true;
        }
        AbstractC59106NHq abstractC59106NHq = this.LLJLLIL;
        if (abstractC59106NHq != null && !this.LLLLLL) {
            abstractC59106NHq.LJIIJ();
            this.LLLLLL = true;
        }
    }

    @Override // X.AnonymousClass901
    public final void O2() {
        NQ2 nq2 = this.LLD;
        if (nq2 != null) {
            nq2.LJIILL();
        } else {
            o.LJIJI("nativeAdBottomLabelView");
            throw null;
        }
    }

    @Override // X.AnonymousClass901
    public final long Y1() {
        long j = this.LJLLILLLL;
        return this.LJLLL.LIZ() + (j * r2.LIZJ);
    }

    @Override // X.AnonymousClass901
    public final void Z2() {
        C46586IQc.LIZJ(this.LLLILZ);
    }

    public final ViewGroup a() {
        View view;
        InterfaceC57312Mt LJIIIIZZ = this.LJLIL.LJIIIIZZ();
        if (LJIIIIZZ != null) {
            view = LJIIIIZZ.getRootView();
        } else {
            view = null;
        }
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        return (ViewGroup) view;
    }

    /* JADX WARN: Code restructure failed: missing block: B:295:0x042d, code lost:
    
        if (r1 != null) goto L239;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:269:0x041b  */
    /* JADX WARN: Removed duplicated region for block: B:270:0x0690  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0089  */
    @Override // X.AnonymousClass901
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a3() {
        /*
            Method dump skipped, instructions count: 1696
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C59316NPs.a3():void");
    }

    public final boolean b() {
        Aweme aweme = this.LJLJLJ;
        if (aweme != null) {
            return C63081OpJ.LL(aweme);
        }
        return false;
    }

    @Override // X.AnonymousClass901
    public final void e2() {
        if (!this.LLLLLJIL) {
            LLZLLIL().LIZJ();
        }
        this.LLLLLJIL = false;
    }

    public final void g() {
        LinearLayout linearLayout;
        if (this.LLJ == null || this.LLJI == null) {
            View V8 = this.LJLIL.V8("ad_desc_label_layout", true);
            o.LJII(V8, "null cannot be cast to non-null type android.view.ViewGroup");
            ViewGroup viewGroup = (ViewGroup) V8;
            if (viewGroup.getChildCount() > 0) {
                View childAt = viewGroup.getChildAt(0);
                o.LJII(childAt, "null cannot be cast to non-null type android.widget.LinearLayout");
                linearLayout = (LinearLayout) childAt;
            } else {
                View LLLLIILL = C16880lQ.LLLLIILL(C16880lQ.LLZIL(this.LJLLI), R.layout.af9, viewGroup, false);
                o.LJII(LLLLIILL, "null cannot be cast to non-null type android.widget.LinearLayout");
                linearLayout = (LinearLayout) LLLLIILL;
                viewGroup.addView(linearLayout);
            }
            ViewGroup.LayoutParams layoutParams = linearLayout.getLayoutParams();
            AAI.LIZIZ(0, linearLayout);
            linearLayout.setLayoutParams(layoutParams);
            this.LLJI = linearLayout;
            this.LLJ = viewGroup;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x0094, code lost:
    
        if (r6.LIZJ(X.OBQ.BACKGROUND.getType(), r1) != false) goto L27;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void h() {
        /*
            Method dump skipped, instructions count: 1123
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C59316NPs.h():void");
    }

    @Override // X.AnonymousClass901
    public final void k2() {
        NQG nqg = this.LLJLIL;
        if (nqg != null && !this.LLLLLJLJLL) {
            nqg.LIZJ();
            this.LLLLLJLJLL = true;
        }
    }

    @Override // X.AnonymousClass901
    public final void k3() {
        NQ2 nq2 = this.LLD;
        if (nq2 != null) {
            C61491OBj LJIJJLI = C73340SqO.LJIJJLI();
            int dimensionPixelOffset = nq2.getResources().getDimensionPixelOffset(R.dimen.ki);
            LJIJJLI.getClass();
            C61491OBj.LJJZ(nq2, dimensionPixelOffset, 300, false);
            return;
        }
        o.LJIJI("nativeAdBottomLabelView");
        throw null;
    }

    public final void l() {
        View V8 = this.LJLIL.V8("vs_vast_ad_tag_layout", true);
        o.LJII(V8, "null cannot be cast to non-null type android.view.ViewGroup");
        ViewGroup viewGroup = (ViewGroup) V8;
        View LLLLIILL = C16880lQ.LLLLIILL(C16880lQ.LLZIL(viewGroup.getContext()), R.layout.afj, viewGroup, false);
        o.LJII(LLLLIILL, "null cannot be cast to non-null type android.widget.LinearLayout");
        ViewGroup viewGroup2 = (ViewGroup) LLLLIILL;
        this.LLILZLL = viewGroup2;
        viewGroup.addView(viewGroup2);
        this.LLIZ = (C62846OlW) viewGroup.findViewById(R.id.n2u);
        this.LLIZLLLIL = (TextView) viewGroup.findViewById(R.id.n2v);
        ViewGroup viewGroup3 = this.LLILZLL;
        if (viewGroup3 != null) {
            C16880lQ.LJIIL(viewGroup3, new ACListenerS30S0100000_10(this, 85));
        }
        this.LLILZIL = viewGroup;
    }

    public final boolean m() {
        C59134NIs c59134NIs = ((C59132NIq) this.LJLJJLL).LIZIZ;
        FragmentManager supportFragmentManager = LLLLZLLLI().getSupportFragmentManager();
        c59134NIs.getClass();
        return M2C.LIZIZ(supportFragmentManager);
    }

    @Override // X.AnonymousClass901
    public final void o2() {
        DataCenter dataCenter = this.LJLLJ;
        if (dataCenter != null) {
            dataCenter.jv0(null, "video_stop_dou_plus_guide_animation");
        }
    }

    @Override // X.AnonymousClass901
    public final void onDestroyView() {
        AbstractC59064NGa abstractC59064NGa;
        this.LLJZIJLIL.eb();
        if (IIU.LIZ) {
            this.LJLLL.reset();
        }
        NQ2 nq2 = this.LLD;
        if (nq2 != null) {
            nq2.LJ();
            ViewGroup a = a();
            RunnableC59323NPz runnableC59323NPz = this.LLLL;
            if (runnableC59323NPz != null) {
                runnableC59323NPz.LJLILLLLZI = true;
                if (a != null) {
                    a.removeCallbacks(runnableC59323NPz);
                }
                this.LLLL = null;
            }
            AnimatorSet animatorSet = this.LLLLIIIILLL;
            if (animatorSet != null) {
                animatorSet.cancel();
                this.LLLLIIIILLL = null;
            }
            OpenCCTUtils.LJFF().LJ(this.LJLLI);
            C58582Rq.LIZ("onDestroyView", LLLLLLZ);
            AbstractC59106NHq abstractC59106NHq = this.LLJLLIL;
            if (abstractC59106NHq != null && (abstractC59064NGa = abstractC59106NHq.LJLJJLL) != null) {
                abstractC59064NGa.LJIJ();
            }
            NQU nqu = this.LLL;
            if (nqu != null) {
                nqu.onDestroy();
                return;
            }
            return;
        }
        o.LJIJI("nativeAdBottomLabelView");
        throw null;
    }

    @Override // X.AnonymousClass901
    public final void onPause() {
        DataCenter dataCenter = this.LJLLJ;
        if (dataCenter != null) {
            dataCenter.jv0(null, "ad_on_fragment_pause");
        }
        this.LLJJJJJIL.setState(C59538NYg.LJLIL);
        NQ2 nq2 = this.LLD;
        if (nq2 != null) {
            nq2.LJIJI(false);
            NQ2 nq22 = this.LLD;
            if (nq22 != null) {
                nq22.LJIJ(Boolean.FALSE);
                if (C55511LqV.LJIIIIZZ(this.LJLJLJ)) {
                    C55511LqV.LIZ().LJIIIZ();
                    return;
                }
                return;
            }
            o.LJIJI("nativeAdBottomLabelView");
            throw null;
        }
        o.LJIJI("nativeAdBottomLabelView");
        throw null;
    }

    @Override // X.AnonymousClass901
    public final void onResume() {
        AwemeRawAd awemeRawAd;
        AdPlayFunVM LIZ;
        DataCenter dataCenter = this.LJLLJ;
        if (dataCenter != null) {
            dataCenter.jv0(null, "ad_on_fragment_resume");
        }
        this.LLJJJJJIL.setState(C59539NYh.LJLIL);
        if (b() && (LIZ = C214058af.LIZ(this.LJLIL)) != null) {
            LIZ.setState(C227888wy.LJLIL);
        }
        if (this.LLLLIILL && LLZL() != null) {
            LLZL().LIZJ();
            NT2.LJJJJLI(this.LJLJLJ, this.LJLLI, 2, this.LJLJLLL + 1);
            this.LLLLIILL = false;
        }
        if (AAX.LIZIZ != 0) {
            String str = AAX.LIZJ;
            if (str == null) {
                str = "draw_ad";
            }
            Aweme aweme = this.LJLJLJ;
            if (aweme != null) {
                awemeRawAd = aweme.getAwemeRawAd();
            } else {
                awemeRawAd = null;
            }
            C58655N0h LIZLLL = C58704N2e.LIZLLL(str, "back_tt", awemeRawAd);
            LIZLLL.LIZIZ(Long.valueOf(System.currentTimeMillis() - AAX.LIZIZ), "ctx_duration");
            LIZLLL.LJI();
            AAX.LIZIZ = 0L;
            AAX.LIZJ = null;
        }
    }

    public final boolean p() {
        AwemeSplashInfo LJJJJZI;
        if (this.LLF != null && a() != null) {
            KeyEvent.Callback callback = this.LLF;
            if (callback instanceof NSC) {
                o.LJII(callback, "null cannot be cast to non-null type com.bytedance.ies.ugc.aweme.commercialize.splash.topview.ISplashMask");
                ((NSC) callback).remove();
            }
            ViewGroup a = a();
            if (a != null) {
                C16880lQ.LJLLL(this.LLF, a);
            }
            this.LLF = null;
            ALog.com_ss_android_agilelogger_ALog_com_ss_android_ugc_aweme_lancet_AlogLancet_alogD("AwesomeSplash", "onAwesomeSplashEvent AwesomeSplashEvent.GONE && mAwesomeSplashMask != null");
            Aweme aweme = this.LJLJLJ;
            if (aweme != null && (LJJJJZI = C63081OpJ.LJJJJZI(aweme)) != null) {
                LJJJJZI.setShown(true);
            }
            return true;
        }
        return false;
    }

    public final void q() {
        String str;
        LinearLayout linearLayout;
        if (this.LJLIL.Ho0()) {
            LinearLayout linearLayout2 = this.LLFII;
            if (linearLayout2 != null) {
                linearLayout2.setTranslationX(0.0f);
            }
            LinearLayout linearLayout3 = this.LLFII;
            if (linearLayout3 != null) {
                linearLayout3.setTranslationY(0.0f);
            }
            LinearLayout linearLayout4 = this.LLFII;
            if (linearLayout4 != null) {
                linearLayout4.setAlpha(1.0f);
            }
            M89 m89 = this.LLLJIL;
            Aweme aweme = this.LJLJLJ;
            boolean z = this.LLLJ;
            int i = this.LJLJI;
            if (m89 != null) {
                str = m89.getEventType();
            } else {
                str = null;
            }
            if (CommentServiceImpl.LJJL().LJJIII(m89, aweme, Boolean.valueOf(z), Integer.valueOf(i), str) || (linearLayout = this.LLFII) == null) {
                return;
            }
            linearLayout.setVisibility(0);
        }
    }

    @Override // X.AnonymousClass901
    public final void q2() {
        NQ2 nq2 = this.LLD;
        if (nq2 != null) {
            nq2.LJIIZILJ();
        } else {
            o.LJIJI("nativeAdBottomLabelView");
            throw null;
        }
    }

    @Override // X.AnonymousClass901
    public final void t2() {
        NQI nqi;
        Aweme aweme = this.LJLJLJ;
        if (aweme == null) {
            return;
        }
        if (this.LLJLL != null && aweme.isAd() && (nqi = this.LLJLL) != null) {
            nqi.LJ(0L);
        }
        if (this.LLJLLIL != null && aweme.isAd()) {
            z();
        }
    }

    @Override // X.AnonymousClass901
    public final boolean u2() {
        if (this.LLLIILIL || this.LLLIL) {
            return true;
        }
        return false;
    }

    @Override // X.AnonymousClass901
    public final void w2() {
        if (this.LJLJLJ == null || LLZLLIL() == null) {
            return;
        }
        this.LLLLLJIL = false;
        e2();
        LLZLLIL().LJI();
        this.LLLLLJIL = true;
    }

    @Override // X.AnonymousClass901
    public final void x2() {
        int i;
        int i2;
        int i3;
        NQ2 nq2 = this.LLD;
        if (nq2 != null) {
            if (!nq2.LJIIL()) {
                return;
            }
            nq2.LLFF = 0L;
            nq2.LJI();
            if (!nq2.LJIILIIL()) {
                nq2.LJIILJJIL();
            } else if (O5Y.LJJJIL(nq2.LJLLLL)) {
                if (O5Y.LJJIJIL(nq2.LJLLLL)) {
                    i = 3;
                } else {
                    i = 2;
                }
                if (C46278IEg.LIZ()) {
                    N7D LIZJ = C58784N5g.LIZIZ.LIZJ(nq2.LJLLLL);
                    if (LIZJ != null) {
                        LIZJ.is0(i);
                    }
                } else {
                    SearchAdMainService.LJIIJJI().LJIIIIZZ().LJIILIIL(i, nq2.LJLLLL);
                }
            }
            if (nq2.LJIIJJI() && !nq2.LJFF() && !nq2.LJLILLLLZI) {
                int colorChangeSeconds = nq2.getColorChangeSeconds();
                CommerceSmartUITasks predictTaskIndex = SmartFeedAdUIService.instance().getPredictTaskIndex();
                if (predictTaskIndex != null) {
                    i2 = predictTaskIndex.getColorDelay();
                } else {
                    i2 = -1;
                }
                if (i2 >= 0) {
                    colorChangeSeconds = i2 * 1000;
                    i3 = 1;
                } else {
                    i3 = 0;
                }
                ARunnableS2S0102000_10 aRunnableS2S0102000_10 = nq2.LJLLLLLL;
                if (aRunnableS2S0102000_10 != null) {
                    nq2.removeCallbacks(aRunnableS2S0102000_10);
                }
                if (nq2.LJLLLLLL == null) {
                    nq2.LJLLLLLL = new ARunnableS2S0102000_10(i3, nq2, colorChangeSeconds, 2);
                }
                long j = colorChangeSeconds;
                if (nq2.LLFF >= j || O5Y.LJJIJIL(nq2.LJLLLL)) {
                    int colorChangeSeconds2 = nq2.getColorChangeSeconds();
                    if (nq2.LJIIJJI() && !nq2.LJFF()) {
                        nq2.LJIIJ(NPC.LIZIZ(nq2.LJLLILLLL, nq2.LJLLLL), 0);
                        nq2.LJLILLLLZI = true;
                        if (C46278IEg.LIZ()) {
                            N7D LIZJ2 = C58784N5g.LIZIZ.LIZJ(nq2.LJLLLL);
                            if (LIZJ2 != null) {
                                LIZJ2.is0(3);
                            }
                        } else {
                            SearchAdMainService.LJIIJJI().LJIIIIZZ().LJIILIIL(3, nq2.LJLLLL);
                        }
                        if (SmartFeedAdUIService.instance().getSmartAdUIExperimentValue() != null) {
                            nq2.LJIIIZ(colorChangeSeconds2, 0, 2, i3);
                        }
                    }
                } else {
                    nq2.postDelayed(nq2.LJLLLLLL, j - nq2.LLFF);
                }
            }
            nq2.LLFF = 0L;
            return;
        }
        o.LJIJI("nativeAdBottomLabelView");
        throw null;
    }

    public final void z() {
        Aweme aweme;
        AbstractC59106NHq abstractC59106NHq = this.LLJLLIL;
        if (abstractC59106NHq == null || (aweme = abstractC59106NHq.LJLJI) == null || abstractC59106NHq.LJLILLLLZI || !abstractC59106NHq.LJIILIIL(aweme)) {
            return;
        }
        abstractC59106NHq.LIZ();
        abstractC59106NHq.LJLJL.postDelayed(new ARunnableS46S0100000_10(abstractC59106NHq, 209), 0L);
    }

    public final boolean B() {
        AwemeRawAd awemeRawAd;
        HashMap hashMap;
        AwemeRawAd awemeRawAd2;
        Integer num;
        AwemeRawAd awemeRawAd3;
        InterfaceC59325NQb interfaceC59325NQb;
        if (!m()) {
            InterfaceC36571c5 interfaceC36571c5 = this.LJLJJL;
            if (!(interfaceC36571c5 instanceof NK1) || !((NK1) interfaceC36571c5).cd()) {
                boolean z = true;
                this.LLLIILIL = true;
                k(true);
                LLZLLIL().LIZ(true);
                if (I() && (interfaceC59325NQb = this.LLJJJJ) != null) {
                    z = interfaceC59325NQb.LIZIZ(new NSQ(this));
                } else {
                    E();
                    Aweme aweme = this.LJLJLJ;
                    if (aweme != null && (awemeRawAd = aweme.getAwemeRawAd()) != null) {
                        HashMap hashMap2 = new HashMap();
                        hashMap2.put("background_type", String.valueOf(awemeRawAd.getNativeCardType()));
                        Context context = this.LJLLI;
                        Aweme aweme2 = this.LJLJLJ;
                        if (hashMap2.size() != 0) {
                            hashMap = new HashMap();
                            hashMap.put("ad_extra_data", GsonProtectorUtils.toJson(new Gson(), hashMap2));
                        } else {
                            hashMap = null;
                        }
                        NN1.LJJJJ(context, "othershow", aweme2, NN1.LJIIL(context, aweme2, false, hashMap));
                        Aweme aweme3 = this.LJLJLJ;
                        if (aweme3 != null) {
                            awemeRawAd2 = aweme3.getAwemeRawAd();
                        } else {
                            awemeRawAd2 = null;
                        }
                        C58655N0h LIZLLL = C58704N2e.LIZLLL("background_ad", "othershow", awemeRawAd2);
                        Aweme aweme4 = this.LJLJLJ;
                        if (aweme4 != null && (awemeRawAd3 = aweme4.getAwemeRawAd()) != null) {
                            num = Integer.valueOf(awemeRawAd3.getNativeCardType());
                        } else {
                            num = null;
                        }
                        LIZLLL.LIZIZ(String.valueOf(num), "background_type");
                        LIZLLL.LIZIZ(0, "is_lynx");
                        Aweme aweme5 = this.LJLJLJ;
                        if (aweme5 != null && IEW.LIZIZ(aweme5)) {
                            LIZLLL.LIZIZ(Integer.valueOf(IEW.LIZIZ), "story_video_type");
                        }
                        LIZLLL.LJII();
                    }
                    this.LLLILZ.LIZ = false;
                    LinearLayout linearLayout = this.LLIFFJFJJ;
                    if (linearLayout != null) {
                        linearLayout.setAlpha(0.0f);
                    }
                    this.LLJJ.setAlpha(1.0f);
                    this.LLJJ.animate().alpha(0.0f).setDuration(150L).withEndAction(new ARunnableS46S0100000_10(this, 68)).start();
                }
                DataCenter dataCenter = this.LJLLJ;
                if (dataCenter != null) {
                    dataCenter.jv0(null, "ON_AD_COMMON_MASK_SHOW");
                }
                if (LLLLZLLIL(this.LJLJLJ)) {
                    this.LLJJJJLIIL.LJLJL.setValue("ad_mask_block");
                }
                return z;
            }
        }
        return false;
    }

    public final void D() {
        g();
        LinearLayout linearLayout = this.LLJI;
        if (linearLayout == null) {
            return;
        }
        if (this.LLJIJIL == null) {
            View findViewById = linearLayout.findViewById(R.id.qs);
            o.LJIIIIZZ(findViewById, "adLabelLl.findViewById(R.id.ad_desc_label)");
            C59948Nfs c59948Nfs = (C59948Nfs) findViewById;
            this.LLJIJIL = c59948Nfs;
            f(c59948Nfs);
        }
        if (this.LLJILJILJ == null) {
            View findViewById2 = linearLayout.findViewById(R.id.gk7);
            o.LJIIIIZZ(findViewById2, "adLabelLl.findViewById(R.id.mission_by_tv)");
            this.LLJILJILJ = (TuxTextView) findViewById2;
        }
        if (this.LLJILLL == null) {
            View findViewById3 = linearLayout.findViewById(R.id.gk6);
            o.LJIIIIZZ(findViewById3, "adLabelLl.findViewById(R.id.mission_ad_tv)");
            this.LLJILLL = (TuxTextView) findViewById3;
        }
    }

    @Override // X.AnonymousClass901
    public final void L2() {
        if (C46278IEg.LIZ()) {
            N7D n7d = this.LLLII;
            if (n7d != null) {
                n7d.Md();
                return;
            }
            return;
        }
        if (JHI.LIZ().LJII == 53) {
            C59133NIr c59133NIr = ((C59132NIq) this.LJLJJLL).LIZJ;
            Context context = this.LJLLI;
            Aweme aweme = this.LJLJLJ;
            C59123NIh c59123NIh = this.LLLLLLLLLL;
            c59133NIr.getClass();
            NOE.LJJIIJ(context, aweme, 53, c59123NIh);
            JHI.LIZ().LJII = -1;
            return;
        }
        if (JHI.LIZ().LJII == 54) {
            C59133NIr c59133NIr2 = ((C59132NIq) this.LJLJJLL).LIZJ;
            Context context2 = this.LJLLI;
            Aweme aweme2 = this.LJLJLJ;
            C59123NIh c59123NIh2 = this.LLLLLLLLLL;
            c59133NIr2.getClass();
            NOE.LJJIIJ(context2, aweme2, 54, c59123NIh2);
            JHI.LIZ().LJII = -1;
            return;
        }
        if (JHI.LIZ().LJII == 55) {
            C59133NIr c59133NIr3 = ((C59132NIq) this.LJLJJLL).LIZJ;
            Context context3 = this.LJLLI;
            Aweme aweme3 = this.LJLJLJ;
            C59123NIh c59123NIh3 = this.LLLLLLLLLL;
            c59133NIr3.getClass();
            NOE.LJJIIJ(context3, aweme3, 55, c59123NIh3);
            JHI.LIZ().LJII = -1;
            return;
        }
        if (JHI.LIZ().LJII == 56) {
            C59133NIr c59133NIr4 = ((C59132NIq) this.LJLJJLL).LIZJ;
            Context context4 = this.LJLLI;
            Aweme aweme4 = this.LJLJLJ;
            C59123NIh c59123NIh4 = this.LLLLLLLLLL;
            c59133NIr4.getClass();
            NOE.LJJIIJ(context4, aweme4, 56, c59123NIh4);
            JHI.LIZ().LJII = -1;
            return;
        }
        if (JHI.LIZ().LJII != 57) {
            return;
        }
        C59133NIr c59133NIr5 = ((C59132NIq) this.LJLJJLL).LIZJ;
        Context context5 = this.LJLLI;
        Aweme aweme5 = this.LJLJLJ;
        C59123NIh c59123NIh5 = this.LLLLLLLLLL;
        c59133NIr5.getClass();
        NOE.LJJIIJ(context5, aweme5, 57, c59123NIh5);
        JHI.LIZ().LJII = -1;
    }

    @Override // X.AnonymousClass901
    public final void X2() {
        LLZLLIL().LJ(0L, true);
    }

    @Override // X.AnonymousClass901
    public final void b3() {
        if (C34710Djm.LIZLLL()) {
            if (this.LLLJL != 4) {
                r(4);
                return;
            }
            return;
        }
        r(4);
    }

    public final void j() {
        String str;
        AwemeRawAd awemeRawAd;
        Aweme aweme;
        User author;
        User author2;
        String str2;
        String str3;
        Aweme aweme2;
        AwemeRawAd awemeRawAd2;
        String adMoreTextual;
        AwemeRawAd awemeRawAd3;
        LLLZL().setVisibility(8);
        LLLZZ().setVisibility(8);
        LLLZLL().setVisibility(8);
        LLZIL().setVisibility(8);
        Aweme aweme3 = this.LJLJLJ;
        UrlModel urlModel = null;
        if (aweme3 != null) {
            str = aweme3.getDesc();
        } else {
            str = null;
        }
        if (!TextUtils.isEmpty(str)) {
            T5B LLLZI = LLLZI();
            Aweme aweme4 = this.LJLJLJ;
            if (aweme4 != null) {
                str2 = aweme4.getDesc();
            } else {
                str2 = null;
            }
            LLLZI.setText(str2);
            Aweme aweme5 = this.LJLJLJ;
            if (aweme5 != null && aweme5.getAwemeRawAd() != null) {
                Aweme aweme6 = this.LJLJLJ;
                if (aweme6 != null && (awemeRawAd3 = aweme6.getAwemeRawAd()) != null) {
                    str3 = awemeRawAd3.getAdMoreTextual();
                } else {
                    str3 = null;
                }
                if (!TextUtils.isEmpty(str3) && (aweme2 = this.LJLJLJ) != null && (awemeRawAd2 = aweme2.getAwemeRawAd()) != null && (adMoreTextual = awemeRawAd2.getAdMoreTextual()) != null) {
                    LLLZI().setMoreString(adMoreTextual);
                }
            }
            LLLZI().setViewLineHeight((int) KL2.LIZJ(this.LJLLI, 20.0f));
            LLLZI().setImageSpanXAxisAdjust((int) KL2.LIZJ(this.LJLLI, 4.0f));
        } else {
            LLLZI().setVisibility(8);
        }
        Aweme aweme7 = this.LJLJLJ;
        if (aweme7 == null || aweme7.getAuthor() == null || (aweme = this.LJLJLJ) == null || (author = aweme.getAuthor()) == null || author.getAvatarMedium() == null) {
            C78765Uvh.LJIIIIZZ(LLLZIL(), C78769Uvl.LIZ(R.drawable.b0p));
        } else {
            C62846OlW LLLZIL = LLLZIL();
            Aweme aweme8 = this.LJLJLJ;
            if (aweme8 != null && (author2 = aweme8.getAuthor()) != null) {
                urlModel = author2.getAvatarMedium();
            }
            C78765Uvh.LJFF(LLLZIL, urlModel);
        }
        Aweme aweme9 = this.LJLJLJ;
        if (aweme9 == null || (awemeRawAd = aweme9.getAwemeRawAd()) == null) {
            return;
        }
        String str4 = "";
        if (C59251NNf.LIZIZ(3, this.LJLJLJ)) {
            TextView LLLZLZ = LLLZLZ();
            if (awemeRawAd.getOmVast().vast.adTitle != null) {
                str4 = awemeRawAd.getOmVast().vast.adTitle;
            }
            LLLZLZ.setText(str4);
        } else {
            TextView LLLZLZ2 = LLLZLZ();
            if (aweme9.getAuthor() != null) {
                str4 = aweme9.getAuthor().getNickname();
            }
            LLLZLZ2.setText(str4);
        }
        if (TextUtils.isEmpty(awemeRawAd.getAppInstall()) && awemeRawAd.getAppLike() < 4.0f) {
            LLLZZIL().setVisibility(8);
        }
        if (TextUtils.isEmpty(awemeRawAd.getAppInstall())) {
            LLLZ().setVisibility(8);
            Object value = this.LLIIIL.getValue();
            o.LJIIIIZZ(value, "<get-adLikeDivide>(...)");
            ((View) value).setVisibility(8);
        } else {
            LLLZ().setText(awemeRawAd.getAppInstall());
        }
        LLZILL().setRatingProgress(awemeRawAd.getAppLike());
        if (awemeRawAd.getAppLike() < 4.0f) {
            LLZILL().setVisibility(8);
            Object value2 = this.LLIIIL.getValue();
            o.LJIIIIZZ(value2, "<get-adLikeDivide>(...)");
            ((View) value2).setVisibility(8);
        }
        if (awemeRawAd.getAppCategory() != null) {
            String[] appCategory = awemeRawAd.getAppCategory();
            o.LJIIIIZZ(appCategory, "awemeRawAd.appCategory");
            if (appCategory.length != 0) {
                ArrayList arrayList = new ArrayList();
                String[] appCategory2 = awemeRawAd.getAppCategory();
                o.LJIIIIZZ(appCategory2, "awemeRawAd.appCategory");
                for (String str5 : appCategory2) {
                    if (str5.length() <= 6) {
                        arrayList.add(str5);
                    }
                }
                C5L9 LLZLI = LLZLI();
                Object[] array = arrayList.toArray(new String[0]);
                o.LJIIIIZZ(array, "strings.toArray(arrayOf())");
                LLZLI.setTagList((String[]) array);
                return;
            }
        }
        LLZLI().setVisibility(8);
    }

    @Override // X.AnonymousClass901
    public final void j2() {
        NT2 LIZJ;
        IAdSceneService LLZL = LLZL();
        if (LLZL != null && (LIZJ = LLZL.LIZJ()) != null) {
            LIZJ.LJJIJL(this.LJLLI, this.LJLJLJ);
        }
    }

    @Override // X.AnonymousClass901
    public final InterfaceC59346NQw C2() {
        return this.LLJL;
    }

    @Override // X.InterfaceC41034G8o
    public final /* bridge */ /* synthetic */ InterfaceC59121NIf L9() {
        return this.LJLJJLL;
    }

    @Override // X.AnonymousClass901
    public final DataCenter LLI() {
        return this.LJLLJ;
    }

    @Override // X.AnonymousClass901
    public final IFG W2() {
        return this.LLLFZ;
    }

    @Override // X.AnonymousClass901
    public final C74R d2() {
        return this.LLLLLLLLLL;
    }

    @Override // X.AnonymousClass901
    public final IDX i2() {
        return this.LLLLLIL;
    }

    @Override // X.AnonymousClass901
    public final int r2() {
        return this.LLLJL;
    }

    @Override // X.AnonymousClass901
    public final NQU z2() {
        return this.LLL;
    }

    public static boolean LLLLZLLIL(Aweme aweme) {
        if (!ShakeEggSetting.LIZ().closeShakeEgg && NHO.LIZIZ.LIZ(aweme)) {
            return true;
        }
        return false;
    }

    public static boolean y(Aweme aweme) {
        if (aweme != null && C63081OpJ.LJJLL(aweme)) {
            return false;
        }
        return C59646Nb0.LIZIZ(aweme, false, 0, "company_link");
    }

    @Override // X.AnonymousClass901
    public final void B2(String sourceId) {
        long j;
        Aweme aweme;
        View view;
        Aweme aweme2;
        Aweme aweme3;
        long delayTimeTypeA;
        Aweme aweme4;
        long LIZ;
        AwemeRawAd awemeRawAd;
        Aweme aweme5;
        AwemeRawAd awemeRawAd2;
        List<PlaybackSecondsTrack> playbackSecondsTrackList;
        boolean z;
        float f;
        int i;
        AwemeRawAd awemeRawAd3;
        AdInteractionData adInteractionData;
        AdGestureGuidance gestureGuidance;
        ShakeModel LIZIZ;
        AwemeSplashInfo LJJJJZI;
        AdFeInteractionModel LIZ2;
        AwemeSplashInfo LJJJJZI2;
        Aweme aweme6;
        AwemeRawAd awemeRawAd4;
        AdProductTile productTile;
        int showSeconds;
        AdStickerData adStickerData;
        int i2;
        float f2;
        float f3;
        boolean z2;
        AdStickerData LJJIIZ;
        AdStickerData LJJIIZ2;
        AdStickerData LJJIIZ3;
        AdStickerData LJJIIZ4;
        AwemeRawAd awemeRawAd5;
        float f4;
        AwemeRawAd awemeRawAd6;
        AwemePlayFunModel playFunModel;
        o.LJIIIZ(sourceId, "sourceId");
        this.LLLLLLIL = 0;
        DataCenter dataCenter = this.LJLLJ;
        if (dataCenter != null) {
            dataCenter.jv0(null, "ad_video_on_render_ready");
        }
        DataCenter dataCenter2 = this.LJLLJ;
        if (dataCenter2 != null) {
            dataCenter2.jv0(Boolean.TRUE, "ad_feed_video_playing_state");
        }
        this.LLLLIL = false;
        VideoPlayTaskManager videoPlayTaskManager = this.LJLLL;
        HandlerC59321NPx handlerC59321NPx = videoPlayTaskManager.LIZLLL;
        if (handlerC59321NPx.hasMessages(1)) {
            handlerC59321NPx.removeMessages(1);
        }
        HandlerC59321NPx handlerC59321NPx2 = videoPlayTaskManager.LIZLLL;
        if (NSX.LIZ() > 0) {
            j = NSX.LIZ();
        } else {
            j = 1000;
        }
        handlerC59321NPx2.LIZIZ = j;
        Aweme aweme7 = this.LJLJLJ;
        if (aweme7 != null && (aweme7.isAd() || ((aweme4 = this.LJLJLJ) != null && C63081OpJ.LLIFFJFJJ(aweme4)))) {
            NQH LIZ3 = C201697vp.LIZ();
            IEZ LIZ4 = C46251IDf.LIZ();
            Aweme aweme8 = this.LJLJLJ;
            if (aweme8 != null && C63081OpJ.LJLJI(aweme8) && LIZ3 != null) {
                LIZ = LIZ3.getDuration();
            } else {
                Aweme aweme9 = this.LJLJLJ;
                if (aweme9 != null && C63081OpJ.LJLLLL(aweme9) && LIZ4 != null) {
                    LIZ = LIZ4.getDuration();
                } else {
                    LIZ = IG7.LIZ(this.LJLJLJ);
                }
            }
            this.LJLLILLLL = LIZ;
            w(this.LJLLL);
            Aweme aweme10 = this.LJLJLJ;
            if (aweme10 == null || !C63081OpJ.LJZL(aweme10)) {
                long j2 = this.LJLLILLLL;
                boolean LIZIZ2 = this.LLLLLIL.LIZIZ(this.LJLJLJ);
                NQK.LJFF = new NQJ(this);
                if (!NSJ.LIZ().enableReuseLoopForPlaySeconds && j2 >= 2000 && (!LIZIZ2 || this.LJLLL.LIZ() < 2000)) {
                    VideoPlayTaskManager videoPlayTaskManager2 = this.LJLLL;
                    N68 LIZIZ3 = C1DD.LIZIZ("2sPlayProgressTrack", j2);
                    LIZIZ3.LIZJ = LiveNetAdaptiveHurryTimeSetting.DEFAULT;
                    LIZIZ3.LIZLLL = new ARunnableS46S0100000_10(this, 71);
                    LIZIZ3.LJ = true;
                    videoPlayTaskManager2.LJLJLJ(LIZIZ3.LIZ());
                } else {
                    this.LJLLL.LJLJI("2sPlayProgressTrack");
                }
                if (!NSJ.LIZ().enableReuseLoopForPlaySeconds && j2 >= 6000 && (!LIZIZ2 || this.LJLLL.LIZ() < 6000)) {
                    VideoPlayTaskManager videoPlayTaskManager3 = this.LJLLL;
                    N68 LIZIZ4 = C1DD.LIZIZ("6sPlayProgressTrack", j2);
                    LIZIZ4.LIZJ = LiveEffectMusicFadeDurationSetting.DEFAULT;
                    LIZIZ4.LIZLLL = new ARunnableS46S0100000_10(this, 72);
                    LIZIZ4.LJ = true;
                    videoPlayTaskManager3.LJLJLJ(LIZIZ4.LIZ());
                } else {
                    this.LJLLL.LJLJI("6sPlayProgressTrack");
                }
                if (!NSJ.LIZ().enableReuseLoopForPlaySeconds && j2 >= LivePlayEnforceIntervalSetting.DEFAULT && (!LIZIZ2 || this.LJLLL.LIZ() < LivePlayEnforceIntervalSetting.DEFAULT)) {
                    VideoPlayTaskManager videoPlayTaskManager4 = this.LJLLL;
                    N68 LIZIZ5 = C1DD.LIZIZ("15sPlayProgressTrack", j2);
                    LIZIZ5.LIZJ = 15000;
                    LIZIZ5.LIZLLL = new ARunnableS46S0100000_10(this, 73);
                    LIZIZ5.LJ = true;
                    videoPlayTaskManager4.LJLJLJ(LIZIZ5.LIZ());
                } else {
                    this.LJLLL.LJLJI("15sPlayProgressTrack");
                }
                Aweme aweme11 = this.LJLJLJ;
                if (aweme11 != null && (((awemeRawAd = aweme11.getAwemeRawAd()) == null || (playbackSecondsTrackList = awemeRawAd.getPlaybackSecondsTrackList()) == null || !playbackSecondsTrackList.isEmpty()) && (aweme5 = this.LJLJLJ) != null && (awemeRawAd2 = aweme5.getAwemeRawAd()) != null)) {
                    for (PlaybackSecondsTrack playbackSecondsTrack : awemeRawAd2.getPlaybackSecondsTrackList()) {
                        int i3 = playbackSecondsTrack.seconds;
                        List<String> list = playbackSecondsTrack.urlList;
                        int min = (int) Math.min(i3 * 1000, j2);
                        VideoPlayTaskManager videoPlayTaskManager5 = this.LJLLL;
                        N68 LIZIZ6 = C1DD.LIZIZ("sPlayProgressTrack", j2);
                        LIZIZ6.LIZJ = min;
                        LIZIZ6.LIZLLL = new ARunnableS10S0301000_10(i3, list, awemeRawAd2, this, 0);
                        LIZIZ6.LJ = true;
                        videoPlayTaskManager5.LJLJLJ(LIZIZ6.LIZ());
                    }
                }
            }
            long j3 = this.LJLLILLLL;
            if (b() && !this.LLLIIL) {
                Aweme aweme12 = this.LJLJLJ;
                if (aweme12 != null && (awemeRawAd6 = aweme12.getAwemeRawAd()) != null && (playFunModel = awemeRawAd6.getPlayFunModel()) != null) {
                    f4 = playFunModel.getShowTime();
                    if (f4 < 0.0f) {
                        f4 = 0.0f;
                    }
                } else {
                    f4 = 0.0f;
                }
                this.LJLLL.LJLJJI(350L);
                VideoPlayTaskManager videoPlayTaskManager6 = this.LJLLL;
                N68 LIZIZ7 = C1DD.LIZIZ("playFunTrack", j3);
                LIZIZ7.LIZJ = (int) (f4 * 1000);
                LIZIZ7.LIZLLL = new ARunnableS39S0100000_3(this, 133);
                LIZIZ7.LJ = false;
                videoPlayTaskManager6.LJLJLJ(LIZIZ7.LIZ());
            }
            long j4 = this.LJLLILLLL;
            Aweme aweme13 = this.LJLJLJ;
            if (aweme13 != null && C63081OpJ.LJLLI(aweme13)) {
                z = true;
            } else {
                z = false;
            }
            int i4 = 300;
            if (z) {
                Aweme aweme14 = this.LJLJLJ;
                if (aweme14 != null && (awemeRawAd3 = aweme14.getAwemeRawAd()) != null && (adInteractionData = awemeRawAd3.getAdInteractionData()) != null && (gestureGuidance = adInteractionData.getGestureGuidance()) != null) {
                    f = gestureGuidance.getShowTime();
                    if (f < 0.0f) {
                        f = 0.0f;
                    }
                } else {
                    f = 0.0f;
                }
                int i5 = (int) (f * 1000);
                this.LJLLL.LJLJJI(100L);
                VideoPlayTaskManager videoPlayTaskManager7 = this.LJLLL;
                N68 LIZIZ8 = C1DD.LIZIZ("interactiveTrack", j4);
                try {
                    SettingsManager.LIZLLL().getClass();
                    i = SettingsManager.LJ("interactive_ads_hint_preshow_time_setting", 300);
                } catch (Throwable th) {
                    C78983UzD.LJIIZILJ(th);
                    i = 300;
                }
                LIZIZ8.LIZJ = i5 - i;
                LIZIZ8.LIZLLL = new ARunnableS39S0100000_3(this, 132);
                LIZIZ8.LJ = true;
                videoPlayTaskManager7.LJLJLJ(LIZIZ8.LIZ());
            }
            long j5 = this.LJLLILLLL;
            Aweme aweme15 = this.LJLJLJ;
            if (aweme15 != null && C63081OpJ.LLJJJJJIL(aweme15)) {
                Aweme aweme16 = this.LJLJLJ;
                if (aweme16 != null && (awemeRawAd5 = aweme16.getAwemeRawAd()) != null) {
                    adStickerData = awemeRawAd5.getStickerData();
                } else {
                    adStickerData = null;
                }
                if (NPC.LJIIIZ(adStickerData)) {
                    Aweme aweme17 = this.LJLJLJ;
                    if (aweme17 != null && (LJJIIZ4 = C63081OpJ.LJJIIZ(aweme17)) != null) {
                        i2 = LJJIIZ4.getShowSeconds();
                    } else {
                        i2 = 0;
                    }
                    int i6 = i2 * 1000;
                    Aweme aweme18 = this.LJLJLJ;
                    if (aweme18 != null && (LJJIIZ3 = C63081OpJ.LJJIIZ(aweme18)) != null) {
                        f2 = LJJIIZ3.getStartShowTime();
                    } else {
                        f2 = 0.0f;
                    }
                    float f5 = 1000;
                    int i7 = (int) (f2 * f5);
                    if (i7 != 0) {
                        i4 = i7;
                    }
                    Aweme aweme19 = this.LJLJLJ;
                    if (aweme19 != null && (LJJIIZ2 = C63081OpJ.LJJIIZ(aweme19)) != null) {
                        f3 = LJJIIZ2.getStopShowTime();
                    } else {
                        f3 = 0.0f;
                    }
                    int i8 = (int) (f3 * f5);
                    if (i8 <= j5) {
                        Aweme aweme20 = this.LJLJLJ;
                        if (aweme20 != null && (LJJIIZ = C63081OpJ.LJJIIZ(aweme20)) != null && LJJIIZ.getEnableShowInterval()) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        this.LJLLL.LJLJJI(100L);
                        VideoPlayTaskManager videoPlayTaskManager8 = this.LJLLL;
                        N68 LIZIZ9 = C1DD.LIZIZ("lynxStickerShowTrack", j5);
                        if (z2) {
                            i6 = i4;
                        }
                        LIZIZ9.LIZJ = i6;
                        LIZIZ9.LIZLLL = new ARunnableS46S0100000_10(this, 67);
                        LIZIZ9.LJ = z2;
                        videoPlayTaskManager8.LJLJLJ(LIZIZ9.LIZ());
                        if (z2) {
                            VideoPlayTaskManager videoPlayTaskManager9 = this.LJLLL;
                            N68 LIZIZ10 = C1DD.LIZIZ("lynxStickerHideTrack", j5);
                            LIZIZ10.LIZJ = i8;
                            LIZIZ10.LIZLLL = new ARunnableS46S0100000_10(this, 69);
                            LIZIZ10.LJ = true;
                            videoPlayTaskManager9.LJLJLJ(LIZIZ10.LIZ());
                        }
                    }
                }
            }
            long j6 = this.LJLLILLLL;
            if (LLLLZLLIL(this.LJLJLJ) && (LIZIZ = NHO.LIZIZ.LIZIZ(this.LJLJLJ)) != null) {
                int showTime = LIZIZ.getShowTime();
                Aweme aweme21 = this.LJLJLJ;
                if (aweme21 != null && (LJJJJZI = C63081OpJ.LJJJJZI(aweme21)) != null && !LJJJJZI.isShown()) {
                    showTime = (int) (LJJJJZI.getSplashShowTime() + ((float) (showTime + 260 + 430)));
                }
                if (showTime == 0 && C220858ld.LJIIIIZZ(this.LJLJLJ)) {
                    showTime = 1;
                }
                if (showTime == LIZIZ.getShowTime()) {
                    VideoPlayTaskManager videoPlayTaskManager10 = this.LJLLL;
                    N68 LIZIZ11 = C1DD.LIZIZ("shakeEggTask", j6);
                    LIZIZ11.LIZJ = LIZIZ.getShowTime();
                    LIZIZ11.LIZLLL = new ARunnableS46S0100000_10(this, 80);
                    LIZIZ11.LJ = true;
                    videoPlayTaskManager10.LJLJLJ(LIZIZ11.LIZ());
                } else {
                    VideoPlayTaskManager videoPlayTaskManager11 = this.LJLLL;
                    N68 LIZIZ12 = C1DD.LIZIZ("delaysShakeEggTask", j6);
                    LIZIZ12.LIZJ = showTime;
                    LIZIZ12.LIZLLL = new ARunnableS6S0200100_10(this, j6, LIZIZ, 0);
                    LIZIZ12.LJ = false;
                    videoPlayTaskManager11.LJLJLJ(LIZIZ12.LIZ());
                }
            }
            long j7 = this.LJLLILLLL;
            Aweme aweme22 = this.LJLJLJ;
            if (aweme22 != null && C63081OpJ.LLJJL(aweme22) && (aweme6 = this.LJLJLJ) != null && (awemeRawAd4 = aweme6.getAwemeRawAd()) != null && (productTile = awemeRawAd4.getProductTile()) != null && (showSeconds = productTile.getShowSeconds()) > 0) {
                this.LJLLL.LJLJJI(350L);
                VideoPlayTaskManager videoPlayTaskManager12 = this.LJLLL;
                N68 LIZIZ13 = C1DD.LIZIZ("nativeProductTileTask", j7);
                LIZIZ13.LIZJ = showSeconds * 1000;
                LIZIZ13.LIZLLL = new ARunnableS39S0100000_3(this, 131);
                LIZIZ13.LJ = false;
                videoPlayTaskManager12.LJLJLJ(LIZIZ13.LIZ());
            }
            long j8 = this.LJLLILLLL;
            if (this.LLJJLIIIJLLLLLLLZ != null && (LIZ2 = NHM.LIZIZ.LIZ(this.LJLJLJ)) != null && !LIZ2.isInteractivity()) {
                int showTime2 = LIZ2.getShowTime();
                int durationTime = LIZ2.getDurationTime();
                Aweme aweme23 = this.LJLJLJ;
                if (aweme23 != null && (LJJJJZI2 = C63081OpJ.LJJJJZI(aweme23)) != null && !LJJJJZI2.isShown()) {
                    showTime2 = (int) (LJJJJZI2.getSplashShowTime() + ((float) (showTime2 + 260 + 430)));
                }
                if (showTime2 == LIZ2.getShowTime()) {
                    VideoPlayTaskManager videoPlayTaskManager13 = this.LJLLL;
                    N68 LIZIZ14 = C1DD.LIZIZ("adFeInteractionShow", j8);
                    LIZIZ14.LIZJ = showTime2;
                    LIZIZ14.LIZLLL = new ARunnableS29S0200000_10(LIZ2, this, 30);
                    LIZIZ14.LJ = true;
                    videoPlayTaskManager13.LJLJLJ(LIZIZ14.LIZ());
                    VideoPlayTaskManager videoPlayTaskManager14 = this.LJLLL;
                    N68 LIZIZ15 = C1DD.LIZIZ("adFeInteractionHide", j8);
                    LIZIZ15.LIZJ = showTime2 + durationTime;
                    LIZIZ15.LIZLLL = new ARunnableS29S0200000_10(LIZ2, this, 32);
                    LIZIZ15.LJ = true;
                    videoPlayTaskManager14.LJLJLJ(LIZIZ15.LIZ());
                } else {
                    int showTime3 = (int) (LIZ2.getShowTime() + j8);
                    VideoPlayTaskManager videoPlayTaskManager15 = this.LJLLL;
                    N68 LIZIZ16 = C1DD.LIZIZ("adFeInteractionShow", j8);
                    LIZIZ16.LIZJ = showTime2;
                    LIZIZ16.LIZLLL = new NQ8(LIZ2, this, j8, showTime3);
                    LIZIZ16.LJ = false;
                    videoPlayTaskManager15.LJLJLJ(LIZIZ16.LIZ());
                    VideoPlayTaskManager videoPlayTaskManager16 = this.LJLLL;
                    N68 LIZIZ17 = C1DD.LIZIZ("adFeInteractionHide", j8);
                    LIZIZ17.LIZJ = showTime2 + durationTime;
                    LIZIZ17.LIZLLL = new NQ9(LIZ2, this, j8, showTime3, durationTime);
                    LIZIZ17.LJ = false;
                    videoPlayTaskManager16.LJLJLJ(LIZIZ17.LIZ());
                }
            }
            long j9 = this.LJLLILLLL;
            Aweme aweme24 = this.LJLJLJ;
            if (aweme24 != null && C59406NTe.LJII(aweme24)) {
                this.LJLLL.LJLJJI(100L);
                VideoPlayTaskManager videoPlayTaskManager17 = this.LJLLL;
                N68 LIZIZ18 = C1DD.LIZIZ("promotePreload", j9);
                LIZIZ18.LIZJ = LiveMaxRetainAlogMessageSizeSetting.DEFAULT;
                LIZIZ18.LIZLLL = new ARunnableS46S0100000_10(this, 74);
                LIZIZ18.LJ = false;
                videoPlayTaskManager17.LJLJLJ(LIZIZ18.LIZ());
            }
            NRU nru = this.LLLFF;
            if (nru != null) {
                nru.sy(this.LJLLILLLL);
            }
            NRY nry = this.LLLFFI;
            if (nry != null) {
                nry.sy(this.LJLLILLLL);
            }
            long j10 = this.LJLLILLLL;
            VideoPlayTaskManager videoPlayTaskManager18 = this.LJLLL;
            N68 LIZIZ19 = C1DD.LIZIZ("1sPlayProgressTask", j10);
            LIZIZ19.LIZJ = 1000;
            LIZIZ19.LJ = false;
            LIZIZ19.LIZLLL = new ARunnableS46S0100000_10(this, 66);
            videoPlayTaskManager18.LJLJLJ(LIZIZ19.LIZ());
            this.LJLLL.LJLIIL();
        }
        Aweme aweme25 = this.LJLJLJ;
        if (aweme25 != null && C59406NTe.LJIILJJIL(aweme25)) {
            Aweme aweme26 = this.LJLJLJ;
            if (aweme26 != null) {
                long LIZJ = C59406NTe.LIZJ(aweme26);
                if (LIZJ != 1 && NII.LIZ.contains(Integer.valueOf(aweme26.getHasPromoteEntry()))) {
                    if (aweme26.getHasPromoteEntry() == 4 || aweme26.getHasPromoteEntry() == 5) {
                        delayTimeTypeA = C59411NTj.LIZIZ.LJIILLIIL().getDelayTimeTypeA();
                    } else {
                        delayTimeTypeA = C59411NTj.LIZIZ.LJIILLIIL().getDelayTimeTypeB();
                    }
                    int i9 = (int) delayTimeTypeA;
                    if (i9 != 0) {
                        this.LJLLL.LJLJJI(100L);
                        VideoPlayTaskManager videoPlayTaskManager19 = this.LJLLL;
                        N68 LIZIZ20 = C1DD.LIZIZ("promoteShareIconFlip", LIZJ);
                        LIZIZ20.LIZJ = i9;
                        LIZIZ20.LIZLLL = new ARunnableS45S0100000_9(this, 116);
                        LIZIZ20.LJ = false;
                        videoPlayTaskManager19.LJLJLJ(LIZIZ20.LIZ());
                    }
                }
            }
            this.LJLLL.LJLIIL();
        }
        this.LLLILZ.LIZ = true;
        if (this.LJLIL.LLLJ() != null && this.LJLIL.LLLJ().getVideoView() != null) {
            View videoView = this.LJLIL.LLLJ().getVideoView();
            NL9 nl9 = new NL9(videoView.getWidth(), videoView.getHeight());
            DataCenter dataCenter3 = this.LJLLJ;
            if (dataCenter3 != null) {
                dataCenter3.jv0(nl9, "ad_feed_bind_texture_size");
            }
            FeedAdViewModel feedAdViewModel = this.LLJJJJJIL;
            feedAdViewModel.getClass();
            feedAdViewModel.setState(new AqS176S0100000_10(nl9, 93));
        }
        if (!C46252IDg.LIZ(NQL.LJIILL().LJIJ) && (((aweme2 = NQL.LJIILL().LJIJ) == null || !C63081OpJ.LJLJI(aweme2)) && !(this.LJLJJL instanceof FeedRecommendFragment) && NQL.LJIILL().LJIJ != null && NQL.LJIILL().LJFF() != null)) {
            Fragment fragment = this.LJLJJL;
            if ((!(fragment instanceof DetailPageFragment) && !C56509MFt.LJI(fragment)) || (aweme3 = this.LJLJLJ) == null || !O5Y.LJJJIL(aweme3)) {
                NQL.LJIILL().LJIILL = false;
                NQL.LJIILL().LIZ(this.LJLLI, NQL.LJIILL().LJFF(), NQL.LJIILL().LJIJ, false);
            }
        }
        if (C46279IEh.LIZ()) {
            Fragment fragment2 = this.LJLJJL;
            if (((fragment2 instanceof DetailPageFragment) || C56509MFt.LJI(fragment2)) && (aweme = this.LJLJLJ) != null && O5Y.LJJJIL(aweme)) {
                IVK LIZJ2 = MeasurementServiceImpl.LJ().LIZJ();
                Aweme aweme27 = this.LJLJLJ;
                if (LIZJ2 != null) {
                    view = LIZJ2.LIZIZ();
                } else {
                    view = null;
                }
                if (aweme27 != null && view != null && LIZJ2 != null) {
                    LIZJ2.LJIIJJI(this.LJLLI, view, aweme27);
                }
            }
        }
        Aweme aweme28 = this.LJLJLJ;
        if (aweme28 != null && C59252NNg.LJ(aweme28) && LLZZLLIL() != null) {
            NQL.LJIILL().LJJIII(LLZZLLIL(), this.LJLJLJ);
        } else {
            NQL.LJIILL().LJJIII(null, null);
        }
        this.LLJZIJLIL.jJ(this.LJLJLJ);
        if (LLZL() != null) {
            LLZL().LIZJ().LJJJJJ(this.LJLJLJ, this.LJLLI, this.LJLL, this.LJLILLLLZI, sourceId, C94B.LJLIL, C59343NQt.LJLIL);
        }
        N7D n7d = this.LLLII;
        if (n7d != null) {
            n7d.LJLIIL();
        }
    }

    public final void C(boolean z) {
        Aweme aweme = this.LJLJLJ;
        if (aweme == null) {
            return;
        }
        if (b()) {
            if (C214128am.LIZ()) {
                C27740Aue.LJIIIZ(8, this.LLFF);
            }
            C62846OlW c62846OlW = this.LLI;
            if (c62846OlW != null) {
                C27740Aue.LJIIIZ(8, c62846OlW);
                return;
            } else {
                o.LJIJI("adRedPacketIv");
                throw null;
            }
        }
        if (this.LLJJJIL == null) {
            ICommercializeAdService iCommercializeAdService = (ICommercializeAdService) this.LJZ.getValue();
            Context context = this.LJLLI;
            C62846OlW c62846OlW2 = this.LLI;
            if (c62846OlW2 != null) {
                this.LLJJJIL = (NI4) iCommercializeAdService.LIZJ(context, new C58850N7u(c62846OlW2));
            } else {
                o.LJIJI("adRedPacketIv");
                throw null;
            }
        }
        NI4 ni4 = this.LLJJJIL;
        if (ni4 == null) {
            return;
        }
        ni4.LJIIIIZZ(aweme, this.LJLL, z);
        if (!C214128am.LIZ()) {
            return;
        }
        if (this.LLFF != null && LLZZ().LJIILL(this.LJLJLJ)) {
            C27740Aue.LJIIIZ(0, this.LLFF);
        } else {
            C27740Aue.LJIIIZ(8, this.LLFF);
        }
    }

    @Override // X.AnonymousClass901
    public final void D2(long j) {
        Integer num;
        String str;
        String requestId;
        AwemeRawAd awemeRawAd;
        Video video;
        this.LJLLL.LJLJJLL();
        if (C46278IEg.LIZ()) {
            N7D n7d = this.LLLII;
            if (n7d != null) {
                n7d.Bl();
                return;
            }
            return;
        }
        if (j < 0) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            Aweme aweme = this.LJLJLJ;
            String str2 = null;
            if (aweme != null && (video = aweme.getVideo()) != null) {
                num = Integer.valueOf(video.getVideoLength());
            } else {
                num = null;
            }
            linkedHashMap.put("awemeDuration", String.valueOf(num));
            Aweme aweme2 = this.LJLJLJ;
            if (aweme2 != null) {
                str2 = aweme2.getAid();
            }
            String str3 = "";
            if (str2 == null) {
                str2 = "";
            }
            linkedHashMap.put("aid", str2);
            linkedHashMap.put("videoDuration", String.valueOf(j));
            Aweme aweme3 = this.LJLJLJ;
            if (aweme3 == null || (awemeRawAd = aweme3.getAwemeRawAd()) == null || (str = awemeRawAd.getCreativeIdStr()) == null) {
                str = "";
            }
            linkedHashMap.put("cid", str);
            Aweme aweme4 = this.LJLJLJ;
            if (aweme4 != null && (requestId = aweme4.getRequestId()) != null) {
                str3 = requestId;
            }
            linkedHashMap.put("req_id", str3);
            C78983UzD.LJIILLIIL("onSearchResumePlay", linkedHashMap);
            return;
        }
        NIP LJIIIIZZ = SearchAdMainService.LJIIJJI().LJIIIIZZ();
        java.util.Set<String> LIZJ = LJIIIIZZ.LIZJ(this.LJLJLJ);
        double d = j;
        int i = (int) (0.25d * d);
        int i2 = (int) (0.5d * d);
        int i3 = (int) (d * 0.75d);
        if (j >= 2000) {
            VideoPlayTaskManager videoPlayTaskManager = this.LJLLL;
            N68 LIZIZ = C1DD.LIZIZ("2sPlayProgressTrack", j);
            LIZIZ.LIZJ = LiveNetAdaptiveHurryTimeSetting.DEFAULT;
            LIZIZ.LIZLLL = new ARunnableS21S0300000_10(LIZJ, this, LJIIIIZZ, 9);
            LIZIZ.LJ = true;
            videoPlayTaskManager.LJLJLJ(LIZIZ.LIZ());
        }
        if (j >= 6000) {
            VideoPlayTaskManager videoPlayTaskManager2 = this.LJLLL;
            N68 LIZIZ2 = C1DD.LIZIZ("6sPlayProgressTrack", j);
            LIZIZ2.LIZJ = LiveEffectMusicFadeDurationSetting.DEFAULT;
            LIZIZ2.LIZLLL = new ARunnableS21S0300000_10(LIZJ, this, LJIIIIZZ, 10);
            LIZIZ2.LJ = true;
            videoPlayTaskManager2.LJLJLJ(LIZIZ2.LIZ());
        }
        if (C46279IEh.LIZ()) {
            return;
        }
        VideoPlayTaskManager videoPlayTaskManager3 = this.LJLLL;
        N68 LIZIZ3 = C1DD.LIZIZ("searchVideoFirstQuartileTimingTask", j);
        LIZIZ3.LIZJ = i;
        LIZIZ3.LIZLLL = new ARunnableS29S0200000_10(LIZJ, this, 31);
        LIZIZ3.LJ = true;
        videoPlayTaskManager3.LJLJLJ(LIZIZ3.LIZ());
        VideoPlayTaskManager videoPlayTaskManager4 = this.LJLLL;
        N68 LIZIZ4 = C1DD.LIZIZ("searchVideoMidQuartileTimingTask", j);
        LIZIZ4.LIZJ = i2;
        LIZIZ4.LIZLLL = new ARunnableS29S0200000_10(LIZJ, this, 33);
        LIZIZ4.LJ = true;
        videoPlayTaskManager4.LJLJLJ(LIZIZ4.LIZ());
        VideoPlayTaskManager videoPlayTaskManager5 = this.LJLLL;
        N68 LIZIZ5 = C1DD.LIZIZ("searchVideoThirdQuartileTimingTask", j);
        LIZIZ5.LIZJ = i3;
        LIZIZ5.LIZLLL = new ARunnableS29S0200000_10(LIZJ, this, 35);
        LIZIZ5.LJ = true;
        videoPlayTaskManager5.LJLJLJ(LIZIZ5.LIZ());
    }

    public final void F(boolean z) {
        AwemeRawAd awemeRawAd;
        Aweme aweme = this.LJLJLJ;
        if (aweme == null || (awemeRawAd = aweme.getAwemeRawAd()) == null) {
            return;
        }
        IAdLandPagePreloadService LJJI = AdLandPagePreloadServiceImpl.LJJI();
        String str = "";
        if (LJJI != null && awemeRawAd.getPreloadWeb() == 4) {
            if (awemeRawAd.getPreloadData() != null) {
                awemeRawAd.getPreloadData().getSiteId();
            }
            String channelName = awemeRawAd.getChannelName();
            String LJIIL = LJJI.LJIIL("feed");
            if (LJIIL == null) {
                LJIIL = "";
            }
            LJJI.LJIL(O3U.LIZJ(LJIIL, channelName));
        }
        if (!z || LJJI == null || awemeRawAd.getPreloadWebSecondPage() != 1) {
            return;
        }
        String channelName2 = awemeRawAd.getChannelName();
        String LJIIL2 = LJJI.LJIIL("feed");
        if (LJIIL2 != null) {
            str = LJIIL2;
        }
        LJJI.LJIL(O3U.LIZJ(str, channelName2));
    }

    @Override // X.AnonymousClass901
    public final void F2(String str) {
        DataCenter dataCenter = this.LJLLJ;
        if (dataCenter != null) {
            dataCenter.jv0(str, "AD_ON_PROFILE_WEB_PAGE_HIDE");
        }
    }

    @Override // X.AnonymousClass901
    public final void H2(C56232Ip event) {
        o.LJIIIZ(event, "event");
        DataCenter dataCenter = this.LJLLJ;
        if (dataCenter != null) {
            dataCenter.jv0(event, "ON_RECEIVE_AD_WEB_PAGE_EVENT");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AnonymousClass901
    public final boolean I2(FragmentManager fragmentManager) {
        Aweme aweme;
        String str;
        String str2;
        AwemeRawAd awemeRawAd;
        NQG nqg;
        AwemeRawAd awemeRawAd2;
        AwemeRawAd awemeRawAd3;
        NRX u70;
        NRX u702;
        Aweme aweme2;
        Aweme aweme3;
        Aweme aweme4;
        Aweme aweme5;
        Aweme aweme6;
        Aweme aweme7;
        CardStruct LJJJIL;
        AwemeRawAd awemeRawAd4;
        o.LJIIIZ(fragmentManager, "fragmentManager");
        if (AnchorStateServiceImpl.LJIIIZ().LJI() || EcommerceAnchorService.LIZ().LIZLLL() || (aweme = this.LJLJLJ) == null || !aweme.isAd()) {
            return false;
        }
        Aweme aweme8 = this.LJLJLJ;
        String str3 = null;
        r6 = null;
        Integer num = null;
        if (aweme8 != null && (awemeRawAd4 = aweme8.getAwemeRawAd()) != null) {
            str = awemeRawAd4.getWebUrl();
        } else {
            str = null;
        }
        if ((TextUtils.isEmpty(str) && (((aweme2 = this.LJLJLJ) == null || !C63081OpJ.LLIIIL(aweme2)) && (((aweme3 = this.LJLJLJ) == null || !C63081OpJ.LJLJJLL(aweme3)) && (((aweme4 = this.LJLJLJ) == null || !C63081OpJ.LLD(aweme4)) && (((aweme5 = this.LJLJLJ) == null || (LJJJIL = C63081OpJ.LJJJIL(aweme5)) == null || LJJJIL.getCardType() != 15) && (((aweme6 = this.LJLJLJ) == null || !C63081OpJ.LJJLJ(aweme6)) && ((aweme7 = this.LJLJLJ) == null || !C63081OpJ.LJJLJLI(aweme7)))))))) || !this.LLLLLLL.isEmpty()) {
            return false;
        }
        NQI nqi = this.LLJLL;
        if (nqi != null && nqi.isShowing()) {
            return false;
        }
        AbstractC59106NHq abstractC59106NHq = this.LLJLLIL;
        if (abstractC59106NHq != null && abstractC59106NHq.LJLILLLLZI) {
            return false;
        }
        NQU nqu = this.LLL;
        if (nqu != null && (((u70 = nqu.u70()) != null && u70.isShowing()) || ((u702 = nqu.u70()) != null && u702.Kl0()))) {
            return false;
        }
        InterfaceC58942NBi LLZZJLIL = LLZZJLIL();
        if (LLZZJLIL != null) {
            LLZZJLIL.LJIILIIL(new C58945NBl(true));
        }
        if (C2NU.LIZ.LIZIZ()) {
            Aweme aweme9 = this.LJLJLJ;
            if (aweme9 != null && C63081OpJ.LLJJJIL(aweme9)) {
                if (!m()) {
                    Fragment fragment = this.LJLJJL;
                    if ((!(fragment instanceof NK1) || !((NK1) fragment).cd()) && (nqg = this.LLJLIL) != null) {
                        this.LJLIL.b2(true);
                        boolean show = nqg.show();
                        this.LLLIL = show;
                        if (show) {
                            G();
                            this.LLJJ.setVisibility(4);
                            DataCenter dataCenter = this.LJLLJ;
                            if (dataCenter != null) {
                                dataCenter.jv0(null, "ON_AD_LYNX_MASK_SHOW");
                            }
                            if (LLLLZLLIL(this.LJLJLJ)) {
                                this.LLJJJJLIIL.LJLJL.setValue("ad_mask_block");
                            }
                            Aweme aweme10 = this.LJLJLJ;
                            if (aweme10 != null && aweme10.getAwemeRawAd() != null) {
                                Aweme aweme11 = this.LJLJLJ;
                                if (aweme11 != null) {
                                    awemeRawAd2 = aweme11.getAwemeRawAd();
                                } else {
                                    awemeRawAd2 = null;
                                }
                                C58655N0h LIZLLL = C58704N2e.LIZLLL("background_ad", "othershow", awemeRawAd2);
                                Aweme aweme12 = this.LJLJLJ;
                                if (aweme12 != null && (awemeRawAd3 = aweme12.getAwemeRawAd()) != null) {
                                    num = Integer.valueOf(awemeRawAd3.getNativeCardType());
                                }
                                LIZLLL.LIZIZ(String.valueOf(num), "background_type");
                                LIZLLL.LIZIZ(1, "is_lynx");
                                Aweme aweme13 = this.LJLJLJ;
                                if (aweme13 != null && IEW.LIZIZ(aweme13)) {
                                    LIZLLL.LIZIZ(Integer.valueOf(IEW.LIZIZ), "story_video_type");
                                }
                                LIZLLL.LJI();
                            }
                        } else {
                            Aweme aweme14 = this.LJLJLJ;
                            if (aweme14 != null) {
                                C58655N0h LIZLLL2 = C58704N2e.LIZLLL("background_ad", "othershow_fail", aweme14.getAwemeRawAd());
                                if (IEW.LIZIZ(this.LJLJLJ)) {
                                    LIZLLL2.LIZIZ(Integer.valueOf(IEW.LIZIZ), "story_video_type");
                                    LIZLLL2.LIZIZ(0, "is_lynx");
                                }
                                LIZLLL2.LJI();
                            }
                        }
                        if (this.LLLIL) {
                            return true;
                        }
                    }
                }
                return B();
            }
            Aweme aweme15 = this.LJLJLJ;
            if (aweme15 != null) {
                AwemeRawAd awemeRawAd5 = aweme15.getAwemeRawAd();
                if (awemeRawAd5 == null || (str2 = awemeRawAd5.getFormUrl()) == null) {
                    str2 = "";
                }
            } else {
                str2 = null;
            }
            if (TextUtils.isEmpty(str2)) {
                return B();
            }
            Aweme aweme16 = this.LJLJLJ;
            if (aweme16 != null && ((awemeRawAd = aweme16.getAwemeRawAd()) == null || (str3 = awemeRawAd.getFormUrl()) == null)) {
                str3 = "";
            }
            if (!C40680Fxs.LIZIZ(str3)) {
                return B();
            }
            return B();
        }
        return B();
    }

    @Override // X.AnonymousClass901
    public final void LIZLLL(Aweme aweme) {
        DataCenter dataCenter;
        C61739OKx c61739OKx;
        NQ4 nq4;
        ViewOnClickListenerC59350NRa viewOnClickListenerC59350NRa;
        Aweme aweme2;
        AdStickerData adStickerData;
        AwemeRawAd awemeRawAd;
        if (aweme == null) {
            return;
        }
        aweme.setActivityId(this.LLLILZJ);
        aweme.setNewSourceType(this.LLLILZLLLI);
        aweme.setNewSourceId(this.LLLIZZ);
        this.LJLJLJ = aweme;
        String str = this.LJLL;
        if (aweme.isAd() && aweme.getAwemeRawAd() != null && (awemeRawAd = aweme.getAwemeRawAd()) != null) {
            awemeRawAd.setPageFrom(str);
        }
        if (C34710Djm.LIZLLL() && (aweme.isAd() || C63081OpJ.LLIFFJFJJ(aweme))) {
            LJJIFFI(this.LJLLJ);
        }
        ((IECommerceService) this.LJZI.getValue()).isECADVideo(aweme);
        A();
        if (LLZZLLIL() != null) {
            NQL LJIILL = NQL.LJIILL();
            Aweme aweme3 = this.LJLJLJ;
            Context context = this.LJLLI;
            String LLZZZZ = LLZZZZ();
            LJIILL.getClass();
            if (aweme3 != null && C59252NNg.LJ(aweme3) && aweme3.getAwemeRawAd().getOmVast().isEnableContentUrl) {
                LJIILL.LJ.put(C62819Ol5.LJIILL(aweme3), LLZZZZ);
            }
            if (!(context instanceof DetailActivity) || !LJIILL.LJIILJJIL) {
                LJIILL.LJIIJJI(context, aweme3);
            }
        }
        if (((Boolean) C34710Djm.LJJIL.getValue()).booleanValue()) {
            if (aweme.isAd() || C63081OpJ.LLIFFJFJJ(aweme)) {
                C0IF.LIZIZ(this.LJLILLLLZI, null, R.id.arz, R.id.nex);
                LLZLLIL().LIZLLL(this.LJLJLJ);
            }
        } else {
            LLZLLIL().LIZLLL(this.LJLJLJ);
        }
        InterfaceC59347NQx interfaceC59347NQx = this.LLJJLIIIJLLLLLLLZ;
        if (interfaceC59347NQx != null) {
            interfaceC59347NQx.LIZLLL(this.LJLJLJ);
        }
        InterfaceC59346NQw interfaceC59346NQw = this.LLJL;
        if (interfaceC59346NQw != null) {
            interfaceC59346NQw.LLLZ(this.LJLJI, this.LJLJLJ);
        }
        NQG nqg = this.LLJLIL;
        if (nqg != null) {
            nqg.LJFF(this.LJLJLJ);
            Aweme aweme4 = this.LJLJLJ;
            if (aweme4 != null && C63081OpJ.LLJJJIL(aweme4) && !C59982Xa.LIZ()) {
                new ARunnableS46S0100000_10(nqg, 75).run();
            }
        }
        NQI nqi = this.LLJLILLLLZIIL;
        if (nqi != null) {
            nqi.LIZLLL(this.LJLJLJ);
            new ARunnableS46S0100000_10(nqi, 76).run();
            Aweme aweme5 = this.LJLJLJ;
            if (aweme5 != null && C63081OpJ.LJJIIZ(aweme5) != null) {
                AwemeRawAd awemeRawAd2 = aweme.getAwemeRawAd();
                if (awemeRawAd2 != null) {
                    adStickerData = awemeRawAd2.getStickerData();
                } else {
                    adStickerData = null;
                }
                if (!NPC.LJIIIZ(adStickerData)) {
                    C224238r5 c224238r5 = new C224238r5();
                    Context context2 = this.LJLLI;
                    aweme.getOcrLocation();
                    C223048pA LIZIZ = c224238r5.LIZIZ(context2, aweme, this.LLJJ);
                    NL9 nl9 = new NL9(LIZIZ.LIZ, LIZIZ.LIZIZ);
                    DataCenter dataCenter2 = this.LJLLJ;
                    if (dataCenter2 != null) {
                        dataCenter2.jv0(nl9, "ad_feed_bind_texture_size");
                    }
                    FeedAdViewModel feedAdViewModel = this.LLJJJJJIL;
                    feedAdViewModel.getClass();
                    feedAdViewModel.setState(new AqS176S0100000_10(nl9, 93));
                    int i = 300;
                    try {
                        SettingsManager.LIZLLL().getClass();
                        i = SettingsManager.LJ("lynx_sticker_delay_setting", 300);
                    } catch (Throwable th) {
                        C78983UzD.LJIIZILJ(th);
                    }
                    long j = i;
                    AwemeSplashInfo LJJJJZI = C63081OpJ.LJJJJZI(aweme);
                    if (LJJJJZI != null && !LJJJJZI.isShown()) {
                        j += LJJJJZI.getSplashShowTime() + ((float) 690);
                    }
                    if (C63081OpJ.LLIZLLLIL(aweme)) {
                        nqi.LIZ(j, new NLD(this));
                    } else {
                        nqi.LJ(j);
                    }
                }
            }
            nqi.hide();
        }
        NQI nqi2 = this.LLJLL;
        if (nqi2 != null) {
            nqi2.LIZLLL(this.LJLJLJ);
            if (!C59982Xa.LIZJ()) {
                new ARunnableS46S0100000_10(nqi2, 77).run();
            }
        }
        AbstractC59106NHq abstractC59106NHq = this.LLJLLIL;
        if (abstractC59106NHq != null) {
            Aweme aweme6 = this.LJLJLJ;
            abstractC59106NHq.LJLJI = aweme6;
            if (abstractC59106NHq.LJIILIIL(aweme6)) {
                abstractC59106NHq.LJI();
            }
            if (!C59982Xa.LIZJ()) {
                new ARunnableS46S0100000_10(abstractC59106NHq, 78).run();
            }
        }
        NSE nse = this.LLJZ;
        if (nse != null) {
            nse.LIZLLL(aweme);
        }
        NRT nrt = this.LLJLLL;
        if (nrt != null) {
            nrt.LIZLLL(aweme);
        }
        C59050NFm c59050NFm = C59050NFm.LIZIZ;
        if (c59050NFm.LJIIIIZZ(aweme) || c59050NFm.LJ(aweme)) {
            NQU LIZIZ2 = c59050NFm.LIZIZ(new C59122NIg(this));
            this.LLL = LIZIZ2;
            if (LIZIZ2 != null) {
                LIZIZ2.LLLLZI();
            }
        }
        InterfaceC55531Lqp interfaceC55531Lqp = (InterfaceC55531Lqp) C59367NRr.LIZIZ(InterfaceC55531Lqp.class);
        if (interfaceC55531Lqp != null) {
            interfaceC55531Lqp.oY(aweme);
        }
        if (!e1.LIZ(31744, "tcm_anchor_gecko_feed", true, false)) {
            ((ITcmService) this.LJLLLLLL.getValue()).LJIILL(aweme, "video");
        }
        if (C1791971n.LIZ()) {
            ((ITcmService) this.LJLLLLLL.getValue()).LJIILL(aweme, "comment");
        }
        NQA nqa = NQA.LIZIZ;
        if (nqa.LIZIZ(this.LJLJLJ) && nqa.LJI()) {
            nqa.LJFF();
        }
        if ((!C51789KUf.LIZJ || ((aweme2 = this.LJLJLJ) != null && aweme2.isAd())) && (dataCenter = this.LJLLJ) != null) {
            C59345NQv c59345NQv = new C59345NQv();
            new AqS176S0100000_10(this, 83).invoke(c59345NQv.LIZ);
            dataCenter.jv0(c59345NQv.LIZ, "ad_feed_video_params");
        }
        IEcUgVSAService LJIIJJI = EcUgVSAService.LJIIJJI();
        if (LJIIJJI != null) {
            c61739OKx = LJIIJJI.LJI(this.LJLJLJ, this.LJLL);
        } else {
            c61739OKx = null;
        }
        this.LLLFZ = c61739OKx;
        if (C63081OpJ.LJLLJ(aweme)) {
            nq4 = LLZZ().LJJII(new C214038ad(this.LJLILLLLZI, this.LJLJJL, this.LJLLL, this.LJLIL, aweme));
        } else {
            nq4 = null;
        }
        this.LLLFF = nq4;
        if (nq4 != null) {
            nq4.onBind();
        }
        if (C63081OpJ.LJJZZIII(aweme)) {
            viewOnClickListenerC59350NRa = LLZZ().LIZIZ(new C214018ab(this.LJLILLLLZI, this.LJLJJL, this.LJLLL, this.LJLIL, aweme));
        } else {
            viewOnClickListenerC59350NRa = null;
        }
        this.LLLFFI = viewOnClickListenerC59350NRa;
        if (O5Y.LJJJIL(aweme) && C46278IEg.LIZ()) {
            this.LLLII = null;
            N7D LIZJ = C58784N5g.LIZIZ.LIZJ(aweme);
            this.LLLII = LIZJ;
            if (LIZJ != null) {
                LIZJ.gq(new C59120NIe(this, aweme));
            }
        }
    }

    @Override // X.AnonymousClass901
    public final void LJJIFFI(DataCenter dataCenter) {
        DataCenter dataCenter2;
        if (dataCenter != null) {
            dataCenter.iv0("on_ad_light_web_page_show", this, false);
            dataCenter.iv0("on_ad_light_web_page_hide", this, false);
            dataCenter.iv0("AD_ACTION_MOVE_IN_DESC", this, false);
            dataCenter.iv0("AD_ACTION_MOVE_OUT_DESC", this, false);
            dataCenter.iv0("AD_ACTION_RESET_INTRO_CONTAINER_LOCATION", this, false);
            dataCenter.iv0("on_ad_pop_up_web_page_show", this, false);
            dataCenter.iv0("on_ad_pop_up_web_page_hide", this, false);
            dataCenter.iv0("action_ad_pop_up_web_pause_video", this, false);
            dataCenter.iv0("action_ad_pop_up_web_resume_video", this, false);
            dataCenter.iv0("new_clean_mode", this, false);
            dataCenter.iv0("AD_ACTION_REPLAY_VIDEO", this, false);
            dataCenter.iv0("action_ad_hide_lynx_mask", this, false);
            dataCenter.iv0("action_ad_swipe_up_video", this, false);
            dataCenter.iv0("ad_feed_pause_video", this, false);
            dataCenter.iv0("ad_feed_resume_video", this, false);
            dataCenter.iv0("ad_play_story_sub_video", this, false);
            dataCenter2 = dataCenter;
        } else {
            dataCenter2 = null;
        }
        this.LJLLJ = dataCenter2;
        LLZLLIL().LJJIFFI(dataCenter);
        InterfaceC59347NQx interfaceC59347NQx = this.LLJJLIIIJLLLLLLLZ;
        if (interfaceC59347NQx != null) {
            interfaceC59347NQx.LJJIFFI(dataCenter);
        }
        InterfaceC59346NQw interfaceC59346NQw = this.LLJL;
        if (interfaceC59346NQw != null) {
            interfaceC59346NQw.LJJIFFI(dataCenter);
        }
        NQG nqg = this.LLJLIL;
        if (nqg != null) {
            nqg.LJJIFFI(dataCenter);
        }
        NQI nqi = this.LLJLILLLLZIIL;
        if (nqi != null) {
            nqi.LJJIFFI(dataCenter);
        }
        NQI nqi2 = this.LLJLL;
        if (nqi2 != null) {
            nqi2.LJJIFFI(dataCenter);
        }
        AbstractC59106NHq abstractC59106NHq = this.LLJLLIL;
        if (abstractC59106NHq != null) {
            abstractC59106NHq.LJIIL(dataCenter);
        }
    }

    @Override // X.AnonymousClass901
    public final void LJJIII(int i) {
        IFG ifg = this.LLLFZ;
        if (ifg != null) {
            ifg.LIZJ();
        }
        DataCenter dataCenter = this.LJLLJ;
        if (dataCenter != null) {
            dataCenter.jv0(null, "ad_on_holder_pause");
        }
        FeedAdViewModel feedAdViewModel = this.LLJJJJJIL;
        feedAdViewModel.getClass();
        feedAdViewModel.setState(new AqS34S0001000_10(i, 0));
        Aweme aweme = this.LJLJLJ;
        if (aweme != null && aweme.isAd()) {
            this.LJLLL.LJLJL();
            NQL LJIILL = NQL.LJIILL();
            LJIILL.LJIJJ.removeCallbacks(LJIILL.LJJ);
            VideoPlayTaskManager videoPlayTaskManager = this.LLLIIIIL;
            if (videoPlayTaskManager != null) {
                videoPlayTaskManager.LJLJL();
            }
        }
        this.LLLLLIL.LIZLLL(this.LJLJLJ, u2());
        NQG nqg = this.LLJLIL;
        if (nqg != null) {
            nqg.LIZLLL();
        }
        Aweme aweme2 = this.LJLJLJ;
        if (aweme2 != null && C59406NTe.LJIILJJIL(aweme2)) {
            this.LJLLL.LJLJL();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0022, code lost:
    
        if ((!r0) != false) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0088, code lost:
    
        if (((com.ss.android.ugc.aweme.popularfeed.ui.FeedPopularFragment) r1).LJLJLLL.getUserVisibleHint() != false) goto L38;
     */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0028  */
    @Override // X.AnonymousClass901
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJIJIIJIL(int r5) {
        /*
            r4 = this;
            X.IFG r3 = r4.LLLFZ
            if (r3 == 0) goto Ld
            androidx.fragment.app.Fragment r2 = r4.LJLJJL
            java.lang.String r1 = r4.LJLL
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r4.LJLJLJ
            r3.LJI(r2, r1, r0)
        Ld:
            androidx.fragment.app.Fragment r1 = r4.LJLJJL
            boolean r0 = r1 instanceof com.ss.android.ugc.aweme.feed.ui.FeedRecommendFragment
            r3 = 1
            if (r0 == 0) goto Lb6
            com.ss.android.ugc.aweme.feed.ui.FeedRecommendFragment r1 = (com.ss.android.ugc.aweme.feed.ui.FeedRecommendFragment) r1
            com.ss.android.ugc.aweme.feed.panel.RecommendFeedFragmentPanel r1 = r1.LJLL
            boolean r0 = r1 instanceof com.ss.android.ugc.aweme.feed.panel.FullFeedFragmentPanel
            if (r0 == 0) goto L24
            boolean r0 = r1.LJJJJL()
        L20:
            r0 = r0 ^ 1
            if (r0 == 0) goto L3c
        L24:
            com.ss.android.ugc.aweme.arch.widgets.base.DataCenter r2 = r4.LJLLJ
            if (r2 == 0) goto L2e
            java.lang.String r1 = "ad_on_holder_resume"
            r0 = 0
            r2.jv0(r0, r1)
        L2e:
            com.ss.android.ugc.aweme.commercialize.feed.assem.FeedAdViewModel r2 = r4.LLJJJJJIL
            r2.getClass()
            kotlin.jvm.internal.AqS34S0001000_10 r1 = new kotlin.jvm.internal.AqS34S0001000_10
            r0 = 1
            r1.<init>(r5, r0)
            r2.setState(r1)
        L3c:
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r4.LJLJLJ
            if (r0 == 0) goto L9f
            boolean r0 = r0.isAd()
            if (r0 != r3) goto L9f
            androidx.fragment.app.Fragment r1 = r4.LJLJJL
            boolean r0 = r1 instanceof com.ss.android.ugc.aweme.feed.ui.FeedRecommendFragment
            if (r0 == 0) goto L56
            com.ss.android.ugc.aweme.feed.ui.FeedRecommendFragment r1 = (com.ss.android.ugc.aweme.feed.ui.FeedRecommendFragment) r1
            com.ss.android.ugc.aweme.feed.panel.RecommendFeedFragmentPanel r0 = r1.LJLL
            boolean r0 = r0.getUserVisibleHint()
            if (r0 != 0) goto L8a
        L56:
            androidx.fragment.app.Fragment r0 = r4.LJLJJL
            com.ss.android.ugc.aweme.detail.platform.IDetailPageAbility r0 = X.KQ1.LIZ(r0)
            if (r0 == 0) goto L6a
            com.ss.android.ugc.aweme.detail.panel.DetailFragmentPanel r0 = r0.Wr()
            if (r0 == 0) goto L6a
            boolean r0 = r0.getUserVisibleHint()
            if (r0 != 0) goto L8a
        L6a:
            androidx.fragment.app.Fragment r1 = r4.LJLJJL
            boolean r0 = r1 instanceof com.ss.android.ugc.aweme.feed.ui.FeedFollowFragment
            if (r0 == 0) goto L7a
            com.ss.android.ugc.aweme.feed.ui.FeedFollowFragment r1 = (com.ss.android.ugc.aweme.feed.ui.FeedFollowFragment) r1
            com.ss.android.ugc.aweme.feed.panel.FollowFeedFragmentPanelMT r0 = r1.LLFZ
            boolean r0 = r0.getUserVisibleHint()
            if (r0 != 0) goto L8a
        L7a:
            androidx.fragment.app.Fragment r1 = r4.LJLJJL
            boolean r0 = r1 instanceof com.ss.android.ugc.aweme.popularfeed.ui.FeedPopularFragment
            if (r0 == 0) goto L9f
            com.ss.android.ugc.aweme.popularfeed.ui.FeedPopularFragment r1 = (com.ss.android.ugc.aweme.popularfeed.ui.FeedPopularFragment) r1
            com.ss.android.ugc.aweme.popularfeed.panel.PopularFeedFragmentPanel r0 = r1.LJLJLLL
            boolean r0 = r0.getUserVisibleHint()
            if (r0 == 0) goto L9f
        L8a:
            com.ss.android.ugc.aweme.commercialize.utils.video.VideoPlayTaskManager r0 = r4.LJLLL
            r0.LJLJJLL()
            X.NQL r1 = X.NQL.LJIILL()
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r4.LJLJLJ
            r1.LJJIIZI(r0)
            com.ss.android.ugc.aweme.commercialize.utils.video.VideoPlayTaskManager r0 = r4.LLLIIIIL
            if (r0 == 0) goto L9f
            r0.LJLJJLL()
        L9f:
            X.NQG r0 = r4.LLJLIL
            if (r0 == 0) goto La6
            r0.LJ()
        La6:
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r4.LJLJLJ
            if (r0 == 0) goto Lb5
            boolean r0 = X.C59406NTe.LJIILJJIL(r0)
            if (r0 == 0) goto Lb5
            com.ss.android.ugc.aweme.commercialize.utils.video.VideoPlayTaskManager r0 = r4.LJLLL
            r0.LJLJJLL()
        Lb5:
            return
        Lb6:
            boolean r0 = r1 instanceof com.ss.android.ugc.aweme.feed.ui.FeedFollowFragment
            if (r0 == 0) goto Lc8
            com.ss.android.ugc.aweme.feed.ui.FeedFollowFragment r1 = (com.ss.android.ugc.aweme.feed.ui.FeedFollowFragment) r1
            com.ss.android.ugc.aweme.feed.panel.FollowFeedFragmentPanelMT r1 = r1.LLFZ
            boolean r0 = r1 instanceof com.ss.android.ugc.aweme.feed.panel.FullFeedFragmentPanel
            if (r0 == 0) goto L24
            boolean r0 = r1.LJJJJL()
            goto L20
        Lc8:
            boolean r0 = r1 instanceof com.ss.android.ugc.aweme.popularfeed.ui.FeedPopularFragment
            if (r0 == 0) goto L24
            com.ss.android.ugc.aweme.popularfeed.ui.FeedPopularFragment r1 = (com.ss.android.ugc.aweme.popularfeed.ui.FeedPopularFragment) r1
            com.ss.android.ugc.aweme.popularfeed.panel.PopularFeedFragmentPanel r1 = r1.LJLJLLL
            boolean r0 = r1 instanceof com.ss.android.ugc.aweme.feed.panel.FullFeedFragmentPanel
            if (r0 == 0) goto L24
            boolean r0 = r1.LJJJJL()
            goto L20
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C59316NPs.LJJIJIIJIL(int):void");
    }

    public final void LLLLZ(String str) {
        this.LLLLLLL.add(str);
        if (LLLLZLLIL(this.LJLJLJ)) {
            this.LLJJJJLIIL.LJLJL.setValue(str);
        }
    }

    public final boolean LLLLZIL(String str) {
        String str2;
        if (!ShakeEggSetting.LIZ().closeShakeEgg && NHO.LIZIZ.LIZIZ(this.LJLJLJ) != null) {
            Aweme aweme = this.LJLJLJ;
            if (aweme != null) {
                str2 = aweme.getAid();
            } else {
                str2 = null;
            }
            if (TextUtils.equals(str2, str)) {
                return true;
            }
        }
        return false;
    }

    @Override // X.AnonymousClass901
    public final void P2(boolean z) {
        if (z) {
            H();
        } else {
            G();
        }
    }

    @Override // X.AnonymousClass901
    public final void Q2(C59219NLz c59219NLz) {
        if (c59219NLz != null) {
            if (c59219NLz.LJLIL) {
                if (!this.LLLLIL) {
                    G();
                    return;
                } else if (c59219NLz == null) {
                    return;
                }
            }
            if (c59219NLz.LJLIL || !this.LLLLIL) {
                return;
            }
            H();
        }
    }

    @Override // X.AnonymousClass901
    public final void S2(M89 param) {
        o.LJIIIZ(param, "param");
        this.LLLILZJ = param.getActivityId();
        this.LLLILZLLLI = param.getNewSourceType();
        this.LLLIZZ = param.getNewSourceId();
        this.LLLJ = param.isMyProfile();
        this.LLLJIL = param;
    }

    @Override // X.AnonymousClass901
    public final void T2(boolean z) {
        FeedAdViewModel feedAdViewModel = this.LLJJJJJIL;
        feedAdViewModel.getClass();
        feedAdViewModel.setState(new AqS15S0010000_10(z, 8));
    }

    @Override // X.AnonymousClass901
    public final void U2(int i) {
        int LIZ = C48052ItU.LIZ() * 1000;
        if (LIZ < 0) {
            if (LIZ != -100) {
                LLZLLIL().LJFF(i, i, 0);
                return;
            }
            return;
        }
        LLZLLIL().LJFF(i, LIZ, 1);
    }

    @Override // X.AnonymousClass901
    public final void Y2(boolean z) {
        AwemeRawAd awemeRawAd;
        AdPlayFunVM LIZ;
        IFG ifg = this.LLLFZ;
        if (ifg != null) {
            ifg.LJIIJ(this.LJLLI, this.LJLJLJ, this.LJLL);
        }
        DataCenter dataCenter = this.LJLLJ;
        if (dataCenter != null) {
            dataCenter.jv0(null, "ad_on_fragment_pager_resume");
        }
        this.LLJJJJJIL.setState(C59541NYj.LJLIL);
        Aweme aweme = this.LJLJLJ;
        if (aweme != null && aweme.isAd()) {
            this.LJLLL.LJLJJLL();
            NQL.LJIILL().LJJIIZI(this.LJLJLJ);
            VideoPlayTaskManager videoPlayTaskManager = this.LLLIIIIL;
            if (videoPlayTaskManager != null) {
                videoPlayTaskManager.LJLJJLL();
            }
        }
        Aweme aweme2 = this.LJLJLJ;
        if (aweme2 != null && C59406NTe.LJIILJJIL(aweme2)) {
            this.LJLLL.LJLJJLL();
        }
        if (b() && (LIZ = C214058af.LIZ(this.LJLIL)) != null) {
            LIZ.setState(C227888wy.LJLIL);
        }
        Aweme aweme3 = this.LJLJLJ;
        if (aweme3 != null && C59252NNg.LJ(aweme3)) {
            NQL.LJIILL().LJJIII(LLZZLLIL(), this.LJLJLJ);
        } else {
            NQL.LJIILL().LJJIII(null, null);
        }
        AdPopUpWebPageVM LIZJ = C214058af.LIZJ(this.LJLIL);
        if ((TextUtils.equals(this.LJLL, "homepage_hot") || TextUtils.equals(this.LJLL, "homepage_popular") || TextUtils.equals(this.LJLL, "homepage_follow")) && LIZJ != null && !LIZJ.LJLLILLLL) {
            C58283Mu7.LIZIZ.LIZJ(this.LJLLI, this.LJLJLJ);
        }
        Aweme aweme4 = this.LJLJLJ;
        if (((aweme4 != null && aweme4.isAd()) || C63081OpJ.LLF(this.LJLJLJ)) && !z) {
            Fragment fragment = this.LJLJJL;
            if (((fragment instanceof FeedRecommendFragment) || (fragment instanceof FeedFollowFragment)) && ((Boolean) C52656KlY.LIZ.getValue()).booleanValue()) {
                Aweme aweme5 = this.LJLJLJ;
                if (aweme5 != null && (awemeRawAd = aweme5.getAwemeRawAd()) != null) {
                    awemeRawAd.setReshowAd(true);
                }
                this.LLLLLLLZIL.LIZIZ(this.LJLJLJ, this.LJLL, JCD.LIZ, new AqS176S0100000_10(this, 84));
            }
        }
        this.LLLLIILLL = false;
    }

    @Override // X.AnonymousClass901
    public final void Z1(boolean z) {
        float f;
        FrameLayout frameLayout = this.LLFZ;
        float f2 = 0.0f;
        if (frameLayout != null) {
            f = frameLayout.getAlpha();
        } else {
            f = 0.0f;
        }
        if (!z) {
            f2 = 1.0f;
        }
        C178596zf.LIZ(f, f2, frameLayout);
        LLZLLIL().LIZ(z);
        k(z);
        DataCenter dataCenter = this.LJLLJ;
        if (dataCenter != null) {
            dataCenter.jv0(Boolean.valueOf(z), "ON_DISLIKE_MODE_CHANGE");
        }
    }

    @Override // X.AnonymousClass901
    public final void b2(boolean z) {
        FrameLayout frameLayout;
        int i;
        if (!C30581Hy.LJIJJ(this.LJLL) && !C2MX.LIZ().LIZ(this.LJLL) && (frameLayout = this.LLFZ) != null) {
            if (z) {
                i = 4;
            } else {
                i = 0;
            }
            frameLayout.setVisibility(i);
            if (!z) {
                frameLayout.setAlpha(1.0f);
            }
        }
        LLZLLIL().LIZ(z);
        k(z);
    }

    @Override // X.AnonymousClass901
    public final void c3(String str) {
        DataCenter dataCenter = this.LJLLJ;
        if (dataCenter != null) {
            dataCenter.jv0(str, "AD_ON_PROFILE_WEB_PAGE_SHOW");
        }
    }

    @Override // X.AnonymousClass901
    public final void d3(boolean z) {
        if (z) {
            LLLLZ("report_dialog_block");
        } else {
            o("report_dialog_block");
        }
    }

    public final void e(boolean z) {
        if (this.LLJLIL != null) {
            this.LJLIL.b2(false);
            C91Y.LIZ(this.LLJJ);
            NQG nqg = this.LLJLIL;
            if (nqg != null) {
                nqg.LJJLIIIJL(z);
            }
            this.LLJJ.setVisibility(0);
        }
        this.LLLIL = false;
        DataCenter dataCenter = this.LJLLJ;
        if (dataCenter != null) {
            dataCenter.jv0(null, "ON_AD_LYNX_MASK_HIDE");
        }
        if (LLLLZLLIL(this.LJLJLJ)) {
            this.LLJJJJLIIL.LJLJLJ.setValue("ad_mask_block");
        }
        FypAutoScrollService LJIIZILJ = FypAutoScrollServiceImpl.LJIIZILJ();
        if (LJIIZILJ != null) {
            LJIIZILJ.LJ(false);
        }
        IFG ifg = this.LLLFZ;
        if (ifg != null) {
            ifg.LJFF(this.LJLLI, this.LJLJLJ, this.LJLL);
        }
    }

    @Override // X.AnonymousClass901
    public final void e3(boolean z) {
        d(z, true, false);
    }

    public final void f(C59948Nfs c59948Nfs) {
        if (!NQA.LIZIZ.LIZIZ(this.LJLJLJ) && c59948Nfs != null) {
            C16880lQ.LJJIJIL(c59948Nfs, new ACListenerS30S0100000_10(this, 80));
        }
    }

    @Override // X.AnonymousClass901
    public final void f2(boolean z) {
        NT2 LIZJ;
        IAdSceneService LLZL = LLZL();
        if (LLZL != null && (LIZJ = LLZL.LIZJ()) != null) {
            LIZJ.LJJIJIIJIL(this.LJLLI, this.LJLJLJ, z);
        }
    }

    @Override // X.AnonymousClass901
    public final void f3(C40304Fro event) {
        Window window;
        View decorView;
        o.LJIIIZ(event, "event");
        for (Context context = this.LJLLI; context instanceof ContextWrapper; context = ((ContextWrapper) context).getBaseContext()) {
            if (context instanceof Activity) {
                Activity activity = (Activity) context;
                if (activity != null && (window = activity.getWindow()) != null && (decorView = window.getDecorView()) != null && decorView.getVisibility() == 0) {
                    DataCenter dataCenter = this.LJLLJ;
                    if (dataCenter != null) {
                        dataCenter.jv0(event, "ad_on_receive_js_bridge_event");
                    }
                    FeedAdViewModel feedAdViewModel = this.LLJJJJJIL;
                    feedAdViewModel.getClass();
                    feedAdViewModel.setState(new AqS176S0100000_10(event, 94));
                    return;
                }
                return;
            }
        }
    }

    @Override // X.AnonymousClass901
    public final void g2(F2C event) {
        o.LJIIIZ(event, "event");
        VideoPlayTaskManager videoPlayTaskManager = this.LLLIIIIL;
        if (videoPlayTaskManager != null) {
            videoPlayTaskManager.reset();
        } else {
            this.LLLIIIIL = new VideoPlayTaskManager();
        }
        VideoPlayTaskManager videoPlayTaskManager2 = this.LLLIIIIL;
        if (videoPlayTaskManager2 != null) {
            videoPlayTaskManager2.LJLJJI(100L);
        }
        JSONArray jSONArray = event.LJLIL;
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            VideoPlayTaskManager videoPlayTaskManager3 = this.LLLIIIIL;
            if (videoPlayTaskManager3 != null) {
                N68 n68 = new N68("registerProgressEvent");
                n68.LIZIZ(this.LJLLILLLL);
                n68.LIZJ = jSONArray.optInt(i);
                n68.LIZLLL = new ARunnableS29S0200000_10(this, event, 37);
                n68.LJ = true;
                videoPlayTaskManager3.LJLJLJ(n68.LIZ());
            }
        }
        VideoPlayTaskManager videoPlayTaskManager4 = this.LLLIIIIL;
        if (videoPlayTaskManager4 != null) {
            w(videoPlayTaskManager4);
        }
        VideoPlayTaskManager videoPlayTaskManager5 = this.LLLIIIIL;
        if (videoPlayTaskManager5 != null) {
            videoPlayTaskManager5.LJLIIL();
        }
    }

    @Override // X.AnonymousClass901
    public final void h2(DataCenter dataCenter) {
        this.LJLLJ = dataCenter;
    }

    @Override // X.AnonymousClass901
    public final void j3(C232659Bd event) {
        o.LJIIIZ(event, "event");
        G();
    }

    public final void k(boolean z) {
        AdPlayFunVM LIZ;
        if (b() && (LIZ = C214058af.LIZ(this.LJLIL)) != null) {
            LIZ.setState(new AqS8S0010000_3(z, 37));
        }
    }

    @Override // X.AnonymousClass901
    public final void l2(int i) {
        this.LJLJLLL = i;
    }

    @Override // X.AnonymousClass901
    public final void m2(boolean z) {
        DataCenter dataCenter = this.LJLLJ;
        if (dataCenter != null) {
            dataCenter.jv0(Boolean.valueOf(z), "ad_share_dialog_visible");
        }
        this.LLLLJI = z;
        FeedAdViewModel feedAdViewModel = this.LLJJJJJIL;
        feedAdViewModel.getClass();
        feedAdViewModel.setState(new AqS15S0010000_10(z, 7));
        if (z) {
            LLLLZ("share_block");
        } else {
            o("share_block");
        }
        this.LLLLLLJ.LJLILLLLZI.setValue(Boolean.valueOf(z));
        InterfaceC58942NBi LLZZJLIL = LLZZJLIL();
        if (LLZZJLIL != null) {
            LLZZJLIL.LJIILIIL(new NBX(z));
        }
    }

    public final void n(View view) {
        AwemeRawAd awemeRawAd;
        o.LJIIIZ(view, "view");
        int id = view.getId();
        IFeedAdService LJJIJLIJ = FeedAdServiceImpl.LJJIJLIJ();
        if (LJJIJLIJ != null) {
            LJJIJLIJ.setEnterFrom(C16880lQ.LJLLJ(this.LJLJJL.getClass()));
        }
        if (id == R.id.gw_) {
            if (A2()) {
                return;
            }
            C59133NIr c59133NIr = ((C59132NIq) this.LJLJJLL).LIZJ;
            Context context = this.LJLLI;
            Aweme aweme = this.LJLJLJ;
            C59123NIh c59123NIh = this.LLLLLLLLLL;
            c59133NIr.getClass();
            NOE.LJJIIJ(context, aweme, 2, c59123NIh);
            F(true);
            return;
        }
        boolean z = false;
        if (id == R.id.d6l) {
            if (A2()) {
                return;
            }
            C59133NIr c59133NIr2 = ((C59132NIq) this.LJLJJLL).LIZJ;
            Context context2 = this.LJLLI;
            Aweme aweme2 = this.LJLJLJ;
            C59123NIh c59123NIh2 = this.LLLLLLLLLL;
            c59133NIr2.getClass();
            NOE.LJJIIJ(context2, aweme2, 3, c59123NIh2);
            F(true);
            Aweme aweme3 = this.LJLJLJ;
            if (aweme3 == null || !C63081OpJ.LJJLJ(aweme3)) {
                this.LLLLIILL = true;
                Aweme aweme4 = this.LJLJLJ;
                if (aweme4 != null && C63081OpJ.LJJLIIIJLLLLLLLZ(aweme4) && (awemeRawAd = aweme4.getAwemeRawAd()) != null && !FCD.LJFF(EF7.LIZIZ(), awemeRawAd.getPackageName()) && !NPC.LJI(awemeRawAd.getOpenUrl()) && awemeRawAd.getDownloadMode() == 0 && TextUtils.isEmpty(awemeRawAd.getPackageName()) && !C63081OpJ.LJJLIIJ(aweme4)) {
                    z = true;
                }
                d(z, true, true);
                return;
            }
            return;
        }
        if (id == R.id.rx) {
            if (A2()) {
                return;
            }
            C59133NIr c59133NIr3 = ((C59132NIq) this.LJLJJLL).LIZJ;
            Context context3 = this.LJLLI;
            Aweme aweme5 = this.LJLJLJ;
            C59123NIh c59123NIh3 = this.LLLLLLLLLL;
            c59133NIr3.getClass();
            NOE.LJJIIJ(context3, aweme5, 11, c59123NIh3);
            F(true);
            return;
        }
        if (id == R.id.sv) {
            if (A2()) {
                return;
            }
            C59133NIr c59133NIr4 = ((C59132NIq) this.LJLJJLL).LIZJ;
            Context context4 = this.LJLLI;
            Aweme aweme6 = this.LJLJLJ;
            C59123NIh c59123NIh4 = this.LLLLLLLLLL;
            c59133NIr4.getClass();
            NOE.LJJIIJ(context4, aweme6, 14, c59123NIh4);
            F(true);
            return;
        }
        if (id == R.id.qr) {
            if (A2()) {
                return;
            }
            C59133NIr c59133NIr5 = ((C59132NIq) this.LJLJJLL).LIZJ;
            Context context5 = this.LJLLI;
            Aweme aweme7 = this.LJLJLJ;
            C59123NIh c59123NIh5 = this.LLLLLLLLLL;
            c59133NIr5.getClass();
            NOE.LJJIIJ(context5, aweme7, 12, c59123NIh5);
            F(true);
            return;
        }
        if (id == R.id.sn) {
            if (A2()) {
                return;
            }
            C59133NIr c59133NIr6 = ((C59132NIq) this.LJLJJLL).LIZJ;
            Context context6 = this.LJLLI;
            Aweme aweme8 = this.LJLJLJ;
            C59123NIh c59123NIh6 = this.LLLLLLLLLL;
            c59133NIr6.getClass();
            NOE.LJJIIJ(context6, aweme8, 13, c59123NIh6);
            F(true);
            return;
        }
        if (id == R.id.uc) {
            if (A2()) {
                return;
            }
            C59133NIr c59133NIr7 = ((C59132NIq) this.LJLJJLL).LIZJ;
            Context context7 = this.LJLLI;
            Aweme aweme9 = this.LJLJLJ;
            C59123NIh c59123NIh7 = this.LLLLLLLLLL;
            c59133NIr7.getClass();
            NOE.LJJIIJ(context7, aweme9, 15, c59123NIh7);
            F(true);
            return;
        }
        if (id == R.id.rz || id == R.id.us) {
            if (A2()) {
                return;
            }
            C59133NIr c59133NIr8 = ((C59132NIq) this.LJLJJLL).LIZJ;
            Context context8 = this.LJLLI;
            Aweme aweme10 = this.LJLJLJ;
            C59123NIh c59123NIh8 = this.LLLLLLLLLL;
            c59133NIr8.getClass();
            NOE.LJJIIJ(context8, aweme10, 19, c59123NIh8);
            F(true);
            return;
        }
        if (id == R.id.uf) {
            if (A2()) {
                return;
            }
            C59133NIr c59133NIr9 = ((C59132NIq) this.LJLJJLL).LIZJ;
            Context context9 = this.LJLLI;
            Aweme aweme11 = this.LJLJLJ;
            C59123NIh c59123NIh9 = this.LLLLLLLLLL;
            c59133NIr9.getClass();
            NOE.LJJIIJ(context9, aweme11, 20, c59123NIh9);
            F(true);
            return;
        }
        if (id == R.id.tn) {
            if (A2()) {
                return;
            }
            C59133NIr c59133NIr10 = ((C59132NIq) this.LJLJJLL).LIZJ;
            Context context10 = this.LJLLI;
            Aweme aweme12 = this.LJLJLJ;
            C59123NIh c59123NIh10 = this.LLLLLLLLLL;
            c59133NIr10.getClass();
            NOE.LJJIIJ(context10, aweme12, 21, c59123NIh10);
            F(true);
            return;
        }
        if (id == R.id.d6n) {
            if (A2()) {
                return;
            }
            Aweme aweme13 = this.LJLJLJ;
            if (aweme13 != null && aweme13.isAd()) {
                Context context11 = this.LJLLI;
                Aweme aweme14 = this.LJLJLJ;
                NN1.LJJJJ(context11, "replay", aweme14, NN1.LJIIIZ(context11, aweme14));
                if (C63081OpJ.LJJLIIIJJI(aweme14)) {
                    AwemeRawAd awemeRawAd2 = aweme14.getAwemeRawAd();
                    O8Z.LIZ("play", awemeRawAd2.getPlayTrackUrlList(), awemeRawAd2.getCreativeId(), awemeRawAd2.getLogExtra());
                    C58655N0h LIZLLL = C58704N2e.LIZLLL("background_ad", "replay", aweme14.getAwemeRawAd());
                    LIZLLL.LIZIZ(0, "is_lynx");
                    LIZLLL.LJII();
                }
                NQL LJIILL = NQL.LJIILL();
                Aweme aweme15 = this.LJLJLJ;
                LJIILL.getClass();
                NQL.LJIJI(aweme15);
            }
            d(true, false, false);
            return;
        }
        if (id != R.id.d6p || A2()) {
            return;
        }
        Aweme aweme16 = this.LJLJLJ;
        if (aweme16 != null && aweme16.isAd()) {
            NN1.LJJ(this.LJLLI, this.LJLJLJ);
            NQL LJIILL2 = NQL.LJIILL();
            Aweme aweme17 = this.LJLJLJ;
            LJIILL2.getClass();
            NQL.LJIJI(aweme17);
        }
        d(true, false, false);
    }

    @Override // X.AnonymousClass901
    public final void n2(FrameLayout mRootView) {
        long j;
        float f;
        o.LJIIIZ(mRootView, "mRootView");
        r(2);
        AnimatorSet animatorSet = this.LLLLIIIILLL;
        if (animatorSet == null || !animatorSet.isRunning()) {
            AnimatorSet animatorSet2 = new AnimatorSet();
            animatorSet2.play(ObjectAnimator.ofFloat(this.LLJJIJI, "alpha", 0.0f, 1.0f)).with(ObjectAnimator.ofFloat(this.LLJJIJIIJIL, "alpha", 0.0f, 1.0f)).with(ObjectAnimator.ofFloat(this.LLJJ, "alpha", 0.0f, 1.0f));
            animatorSet2.setStartDelay(260L);
            animatorSet2.setDuration(430L);
            animatorSet2.addListener(new ALAdapterS8S0100000_10(this, 3));
            this.LLLLIIIILLL = animatorSet2;
        }
        RunnableC59323NPz runnableC59323NPz = this.LLLL;
        if (runnableC59323NPz == null || runnableC59323NPz.LJLILLLLZI) {
            Aweme aweme = this.LJLJLJ;
            this.LLLL = new RunnableC59323NPz(this, aweme);
            if (aweme != null) {
                AwemeSplashInfo LJJJJZI = C63081OpJ.LJJJJZI(aweme);
                if (LJJJJZI != null) {
                    f = LJJJJZI.getSplashShowTime();
                } else {
                    f = 0.0f;
                }
                j = f;
            } else {
                j = 0;
            }
            mRootView.postDelayed(this.LLLL, j);
        }
    }

    public final void o(String str) {
        this.LLLLLLL.remove(str);
        if (LLLLZLLIL(this.LJLJLJ)) {
            this.LLJJJJLIIL.LJLJLJ.setValue(str);
        }
    }

    @Override // androidx.lifecycle.Observer
    public final void onChanged(C207668Da c207668Da) {
        boolean booleanValue;
        boolean booleanValue2;
        int i;
        DetailFragmentPanel detailFragmentPanel;
        C80796VnM viewPager;
        DetailFragmentPanel Wr;
        C80796VnM viewPager2;
        InterfaceC2302191t interfaceC2302191t;
        Object obj;
        C207668Da c207668Da2 = c207668Da;
        if (c207668Da2 == null) {
            return;
        }
        String str = c207668Da2.LIZ;
        int i2 = 0;
        Object obj2 = null;
        switch (str.hashCode()) {
            case -2106631497:
                if (!str.equals("action_ad_pop_up_web_resume_video") || !this.LLLLILI) {
                    return;
                }
                H();
                this.LLLLILI = false;
                return;
            case -1842619453:
                if (!str.equals("AD_ACTION_RESET_INTRO_CONTAINER_LOCATION")) {
                    return;
                }
                q();
                return;
            case -1023452510:
                if (!str.equals("on_ad_light_web_page_hide")) {
                    return;
                }
                o("lightpage_block");
                return;
            case -1023125411:
                if (!str.equals("on_ad_light_web_page_show")) {
                    return;
                }
                e3(true);
                LLLLZ("lightpage_block");
                return;
            case -992914323:
                if (!str.equals("ad_feed_pause_video")) {
                    return;
                }
                G();
                return;
            case -924046888:
                str.equals("new_clean_mode");
                return;
            case -835841586:
                if (!str.equals("ad_feed_resume_video")) {
                    return;
                }
                H();
                return;
            case -481195123:
                if (!str.equals("on_ad_pop_up_web_page_hide")) {
                    return;
                }
                o("popup_page_block");
                Aweme aweme = this.LJLJLJ;
                if (aweme == null || !C63081OpJ.LJZL(aweme)) {
                    return;
                }
                ((IAdPhotoModeService) this.LJZL.getValue()).f1(false, System.currentTimeMillis(), null);
                return;
            case -480868024:
                if (!str.equals("on_ad_pop_up_web_page_show")) {
                    return;
                }
                LLLLZ("popup_page_block");
                e3(false);
                Aweme aweme2 = this.LJLJLJ;
                if (aweme2 == null || !C63081OpJ.LJZL(aweme2)) {
                    return;
                }
                ((IAdPhotoModeService) this.LJZL.getValue()).n1(System.currentTimeMillis());
                return;
            case 1044302436:
                if (!str.equals("action_ad_pop_up_web_pause_video")) {
                    return;
                }
                if (!this.LLLLIL) {
                    this.LLLLILI = true;
                }
                Object obj3 = c207668Da2.LIZIZ;
                if (obj3 != null) {
                    o.LJIIIIZZ(obj3, "kvData.getData()");
                    i2 = ((Number) obj3).intValue();
                }
                ((C59132NIq) this.LJLJJLL).LIZJ.getClass();
                if (NO5.LIZLLL(i2) || i2 == 48 || i2 == 3) {
                    this.LLLLILI = true;
                }
                G();
                return;
            case 1133065514:
                if (!str.equals("action_ad_hide_lynx_mask")) {
                    return;
                }
                Object obj4 = c207668Da2.LIZIZ;
                if (obj4 == null) {
                    obj = null;
                } else {
                    obj = obj4;
                }
                if (!(obj instanceof Boolean)) {
                    return;
                }
                if (obj4 != null) {
                    obj2 = obj4;
                }
                o.LJIIIIZZ(obj2, "kvData.getData()");
                e(((Boolean) obj2).booleanValue());
                return;
            case 1410832003:
                if (!str.equals("ad_play_story_sub_video")) {
                    return;
                }
                VideoBaseCell videoBaseCell = this.LJLIL;
                if (!(videoBaseCell instanceof VideoViewCell) || (interfaceC2302191t = ((VideoViewCell) videoBaseCell).LLLLZIL) == null) {
                    return;
                }
                interfaceC2302191t.playAdStoryVideo();
                return;
            case 1481889616:
                if (!str.equals("AD_ACTION_REPLAY_VIDEO")) {
                    return;
                }
                H();
                return;
            case 1655117583:
                if (!str.equals("action_ad_swipe_up_video")) {
                    return;
                }
                Object obj5 = c207668Da2.LIZIZ;
                if (obj5 == null) {
                    Fragment fragment = this.LJLJJL;
                    if (fragment instanceof FeedRecommendFragment) {
                        C80796VnM viewPager3 = ((FeedRecommendFragment) fragment).LJLL.getViewPager();
                        if (viewPager3 == null) {
                            return;
                        }
                        viewPager3.LJJIL(viewPager3.getCurrentItem() + 1, viewPager3.getCurrentItem(), LiveCenterDelayLoadSetting.DEFAULT);
                        return;
                    }
                    if (fragment instanceof FeedFollowFragment) {
                        C80796VnM viewPager4 = ((FeedFollowFragment) fragment).LLFZ.getViewPager();
                        if (viewPager4 == null) {
                            return;
                        }
                        viewPager4.LJJIL(viewPager4.getCurrentItem() + 1, viewPager4.getCurrentItem(), LiveCenterDelayLoadSetting.DEFAULT);
                        return;
                    }
                    if (fragment instanceof FeedPopularFragment) {
                        C80796VnM viewPager5 = ((FeedPopularFragment) fragment).LJLJLLL.getViewPager();
                        if (viewPager5 == null) {
                            return;
                        }
                        viewPager5.LJJIL(viewPager5.getCurrentItem() + 1, viewPager5.getCurrentItem(), LiveCenterDelayLoadSetting.DEFAULT);
                        return;
                    }
                    IDetailPageAbility LIZ = KQ1.LIZ(fragment);
                    if (LIZ == null || (Wr = LIZ.Wr()) == null || (viewPager2 = Wr.getViewPager()) == null) {
                        return;
                    }
                    viewPager2.LJJIL(viewPager2.getCurrentItem() + 1, viewPager2.getCurrentItem(), LiveCenterDelayLoadSetting.DEFAULT);
                    return;
                }
                if (!(obj5 instanceof C59197NLd)) {
                    return;
                }
                C59197NLd c59197NLd = (C59197NLd) obj5;
                int i3 = c59197NLd.LIZ;
                int i4 = c59197NLd.LIZIZ;
                int i5 = c59197NLd.LIZJ;
                Fragment fragment2 = this.LJLJJL;
                if (fragment2 instanceof FeedRecommendFragment) {
                    C80796VnM viewPager6 = ((FeedRecommendFragment) fragment2).LJLL.getViewPager();
                    if (viewPager6 == null) {
                        return;
                    }
                    viewPager6.LJJIL(i3, i4, i5);
                    return;
                }
                if (fragment2 instanceof FeedFollowFragment) {
                    C80796VnM viewPager7 = ((FeedFollowFragment) fragment2).LLFZ.getViewPager();
                    if (viewPager7 == null) {
                        return;
                    }
                    viewPager7.LJJIL(i3, i4, i5);
                    return;
                }
                if (fragment2 instanceof FeedPopularFragment) {
                    C80796VnM viewPager8 = ((FeedPopularFragment) fragment2).LJLJLLL.getViewPager();
                    if (viewPager8 == null) {
                        return;
                    }
                    viewPager8.LJJIL(i3, i4, i5);
                    return;
                }
                if (!(fragment2 instanceof DetailPageFragment) || (detailFragmentPanel = ((DetailPageFragment) fragment2).LJLJI) == null || (viewPager = detailFragmentPanel.getViewPager()) == null) {
                    return;
                }
                viewPager.LJJIL(i3, i4, i5);
                return;
            case 1676264963:
                if (!str.equals("AD_ACTION_MOVE_OUT_DESC")) {
                    return;
                }
                Object obj6 = c207668Da2.LIZIZ;
                if (obj6 == null) {
                    booleanValue2 = false;
                } else {
                    o.LJIIIIZZ(obj6, "kvData.getData()");
                    booleanValue2 = ((Boolean) obj6).booleanValue();
                }
                LinearLayout linearLayout = this.LLFII;
                if (linearLayout == null) {
                    return;
                }
                if (booleanValue2) {
                    linearLayout.animate().alpha(0.0f).setInterpolator(new LinearInterpolator()).setDuration(200L).withEndAction(new ARunnableS37S0100000_1(linearLayout, 61)).start();
                    return;
                }
                if (C90193gN.LIZIZ(this.LJLLI)) {
                    int[] iArr = new int[2];
                    linearLayout.getLocationOnScreen(iArr);
                    i = -(-(linearLayout.getWidth() + iArr[0]));
                } else {
                    int[] iArr2 = new int[2];
                    linearLayout.getLocationOnScreen(iArr2);
                    i = -(linearLayout.getWidth() + iArr2[0]);
                }
                C178596zf.LIZIZ(linearLayout, linearLayout.getAlpha(), 0.0f, 200L);
                C79234V7u.LJJIZ(linearLayout, linearLayout.getTranslationX(), i);
                return;
            case 1881011274:
                if (!str.equals("AD_ACTION_MOVE_IN_DESC")) {
                    return;
                }
                Object obj7 = c207668Da2.LIZIZ;
                if (obj7 == null) {
                    booleanValue = false;
                } else {
                    o.LJIIIIZZ(obj7, "kvData.getData()");
                    booleanValue = ((Boolean) obj7).booleanValue();
                }
                LinearLayout linearLayout2 = this.LLFII;
                if (linearLayout2 == null) {
                    return;
                }
                if (linearLayout2.getVisibility() == 0 && linearLayout2.getAlpha() == 1.0f) {
                    return;
                }
                if (booleanValue) {
                    linearLayout2.setVisibility(0);
                    linearLayout2.setTranslationY(C17N.LJIILL(17.0d));
                    linearLayout2.animate().alpha(1.0f).translationY(0.0f).setInterpolator(new LinearInterpolator()).setDuration(200L).start();
                    return;
                } else {
                    C178596zf.LIZ(linearLayout2.getAlpha(), 1.0f, linearLayout2);
                    C79234V7u.LJJIZ(linearLayout2, linearLayout2.getTranslationX(), 0.0f);
                    return;
                }
            default:
                return;
        }
    }

    @Override // X.AnonymousClass901
    public final void onPlayCompleted(String str) {
        this.LJLLL.LJJJ();
        VideoPlayTaskManager videoPlayTaskManager = this.LLLIIIIL;
        if (videoPlayTaskManager != null) {
            videoPlayTaskManager.LJJJ();
        }
        DataCenter dataCenter = this.LJLLJ;
        if (dataCenter != null) {
            dataCenter.jv0(Integer.valueOf(this.LJLJLLL), "ad_feed_on_play_completed");
        }
        Aweme aweme = this.LJLJLJ;
        if (aweme != null && O5Y.LJJJIL(aweme)) {
            SearchAdMainService.LJIIJJI().LJIIIIZZ().LIZLLL(this.LJLJLJ);
        }
        N7D n7d = this.LLLII;
        if (n7d != null) {
            n7d.Ie0(this.LJLJLLL);
        }
    }

    @Override // X.AnonymousClass901
    public final void onPlayStop(String str) {
        NT2 LIZJ;
        IAdSceneService LLZL = LLZL();
        if (LLZL != null && (LIZJ = LLZL.LIZJ()) != null) {
            LIZJ.onPlayStop(str);
        }
    }

    @Override // X.AnonymousClass901
    public final void p2(long j) {
        LLZLLIL().LJ(j, false);
    }

    public final void r(int i) {
        View view;
        ViewTreeObserver viewTreeObserver;
        int i2 = this.LLLJL;
        if (i2 != 4 && i2 >= i) {
            return;
        }
        this.LLLJL = i;
        if (this.LJLJLJ == null) {
            return;
        }
        Aweme aweme = this.LJLJLJ;
        o.LJI(aweme);
        C55008LiO c55008LiO = new C55008LiO(i, aweme);
        if (i == 4) {
            ALog.com_ss_android_agilelogger_ALog_com_ss_android_ugc_aweme_lancet_AlogLancet_alogD("AwesomeSplash", "onAwesomeSplashEvent is AwesomeSplashEvent.GONE");
            p();
        } else {
            if (i == 1) {
                this.LLLLL = false;
            }
            if (this.LLF == null && a() != null) {
                ViewGroup a = a();
                ALog.com_ss_android_agilelogger_ALog_com_ss_android_ugc_aweme_lancet_AlogLancet_alogD("AwesomeSplash", "onAwesomeSplashEvent awesome_splash_mask inflate");
                if (a != null) {
                    view = SplashAdServiceImpl.LJJI().LJIIJJI(a, this.LJLJJL);
                } else {
                    view = null;
                }
                this.LLF = view;
                if (view != null) {
                    View LJIIL = SplashAdServiceImpl.LJJI().LJIIL(this.LLF);
                    if (LJIIL != null) {
                        LJIIL.setOnTouchListener(new IDTListenerS119S0100000_10(this, 4));
                    }
                    View view2 = this.LLF;
                    if (view2 != null && (viewTreeObserver = view2.getViewTreeObserver()) != null) {
                        viewTreeObserver.addOnPreDrawListener(new IDDListenerS391S0100000_4(this, 0));
                    }
                }
                Aweme aweme2 = this.LJLJLJ;
                o.LJI(aweme2);
                C2U8.LIZ(new C55008LiO(i, aweme2));
                C55511LqV.LJIIJJI(i, this.LLJJIJI, this.LLJJIJIL, this.LLJJIJIIJIL);
            }
        }
        KeyEvent.Callback callback = this.LLF;
        if (callback instanceof NSC) {
            o.LJII(callback, "null cannot be cast to non-null type com.bytedance.ies.ugc.aweme.commercialize.splash.topview.ISplashMask");
            ((NSC) callback).onEvent(c55008LiO);
        }
        Aweme aweme22 = this.LJLJLJ;
        o.LJI(aweme22);
        C2U8.LIZ(new C55008LiO(i, aweme22));
        C55511LqV.LJIIJJI(i, this.LLJJIJI, this.LLJJIJIL, this.LLJJIJIIJIL);
    }

    @Override // X.AnonymousClass901
    public final void s2(WidgetManager widgetManager) {
        this.LLLIIII = widgetManager;
        if (widgetManager == null) {
            return;
        }
        this.LJLJJLL.getClass();
        widgetManager.wl(null, new CommonWebPageWidget());
        WidgetManager widgetManager2 = this.LLLIIII;
        if (widgetManager2 == null) {
            return;
        }
        widgetManager2.wl(null, new AdProfilePopUpWebPageWidget());
    }

    @Override // X.AnonymousClass901
    public final void v2(boolean z) {
        IFG ifg = this.LLLFZ;
        if (ifg != null) {
            ifg.LJIIL(this.LJLLI, this.LJLL);
        }
        DataCenter dataCenter = this.LJLLJ;
        if (dataCenter != null) {
            dataCenter.jv0(null, "ad_on_fragment_pager_pause");
        }
        this.LLJJJJJIL.setState(C59540NYi.LJLIL);
        Aweme aweme = this.LJLJLJ;
        if (aweme != null && aweme.isAd()) {
            this.LJLLL.LJLJL();
            NQL LJIILL = NQL.LJIILL();
            LJIILL.LJIJJ.removeCallbacks(LJIILL.LJJ);
            VideoPlayTaskManager videoPlayTaskManager = this.LLLIIIIL;
            if (videoPlayTaskManager != null) {
                videoPlayTaskManager.LJLJL();
            }
        }
        this.LLLLLIL.LIZLLL(this.LJLJLJ, u2());
        Aweme aweme2 = this.LJLJLJ;
        if (aweme2 != null && C59406NTe.LJIILJJIL(aweme2)) {
            this.LJLLL.LJLJL();
        }
        Aweme aweme3 = this.LJLJLJ;
        if (aweme3 != null && aweme3.isAd() && !z) {
            Fragment fragment = this.LJLJJL;
            if (((fragment instanceof FeedRecommendFragment) || (fragment instanceof FeedFollowFragment)) && ((Boolean) C52656KlY.LIZ.getValue()).booleanValue() && !this.LLLLIILLL) {
                this.LLLLIILLL = true;
                Context context = this.LJLLI;
                Aweme aweme4 = this.LJLJLJ;
                long currentPosition = IWF.LJJLIIIIJ().getCurrentPosition();
                NN1.LIZIZ(context, aweme4, new OSZ(0, Long.valueOf(currentPosition)), NQL.LJIILL().LJIIIZ + 1);
            }
        }
    }

    public final void w(VideoPlayTaskManager videoPlayTaskManager) {
        NQH LIZ = C201697vp.LIZ();
        IEZ LIZ2 = C46251IDf.LIZ();
        Aweme aweme = this.LJLJLJ;
        if (aweme != null && C63081OpJ.LJLJI(aweme) && LIZ != null) {
            C59338NQo c59338NQo = new C59338NQo(LIZ);
            videoPlayTaskManager.getClass();
            videoPlayTaskManager.LJ = c59338NQo;
            return;
        }
        Aweme aweme2 = this.LJLJLJ;
        if (aweme2 != null && C63081OpJ.LJLLLL(aweme2) && LIZ2 != null) {
            C59339NQp c59339NQp = new C59339NQp(LIZ2);
            videoPlayTaskManager.getClass();
            videoPlayTaskManager.LJ = c59339NQp;
        } else {
            IG7 ig7 = IG7.LIZ;
            videoPlayTaskManager.getClass();
            videoPlayTaskManager.LJ = ig7;
        }
    }

    public final void x(boolean z) {
        Aweme aweme;
        AwemeRawAd awemeRawAd;
        String str;
        AwemeRawAd awemeRawAd2;
        AwemeTextLabelModel label;
        AwemeRawAd awemeRawAd3;
        AwemeTextLabelModel label2;
        java.util.Set<String> set;
        AwemeRawAd awemeRawAd4;
        java.util.Set<String> set2;
        if (C59251NNf.LIZIZ(3, this.LJLJLJ)) {
            if (this.LLILZLL == null) {
                if (C214128am.LIZ()) {
                    l();
                } else {
                    this.LLILZLL = (ViewGroup) C0IF.LIZIZ(this.LJLILLLLZI, this.LLILZLL, R.id.n2t, R.id.ng4);
                    this.LLIZ = (C62846OlW) this.LJLILLLLZI.findViewById(R.id.n2u);
                    this.LLIZLLLIL = (TextView) this.LJLILLLLZI.findViewById(R.id.n2v);
                    ViewGroup viewGroup = this.LLILZLL;
                    if (viewGroup != null) {
                        C16880lQ.LJIIL(viewGroup, new ACListenerS30S0100000_10(this, 85));
                    }
                }
            }
            boolean z2 = false;
            C27740Aue.LJIIIZ(0, this.LLILZLL);
            if (C214128am.LIZ()) {
                C27740Aue.LJIIIZ(0, this.LLILZIL);
            }
            C59256NNk LIZLLL = C59251NNf.LIZLLL(this.LJLJLJ, "AdChoices");
            if (LIZLLL == null || C79004UzY.LJJIFFI(LIZLLL.staticResource)) {
                C27740Aue.LJIIIZ(8, this.LLIZ);
                ViewGroup viewGroup2 = this.LLILZLL;
                if (viewGroup2 != null) {
                    viewGroup2.setClickable(false);
                }
            } else {
                Iterator<String> it = LIZLLL.staticResource.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    String next = it.next();
                    if (!TextUtils.isEmpty(next)) {
                        C27740Aue.LJIIIZ(0, this.LLIZ);
                        C78765Uvh.LJIIIZ(this.LLIZ, next, -1, -1);
                        ViewGroup viewGroup3 = this.LLILZLL;
                        if (viewGroup3 != null) {
                            viewGroup3.setClickable(true);
                        }
                        z2 = true;
                    }
                }
            }
            String str2 = null;
            if (z && z2) {
                if (LIZLLL != null) {
                    set = LIZLLL.viewTracking;
                } else {
                    set = null;
                }
                if (!C79004UzY.LJJIFFI(set) && C59252NNg.LJI(this.LJLJLJ)) {
                    if (LIZLLL != null && (set2 = LIZLLL.viewTracking) != null) {
                        C59252NNg.LJIIL(OJ4.LJJJJI(ORZ.LJLIIIL(set2), C59152Tv.LJLIL), null);
                    }
                    C59127NIl LIZ = C59128NIm.LIZ();
                    LIZ.LIZ = "draw_ad";
                    LIZ.LIZIZ = "ad_choice_view";
                    LIZ.LJIIIIZZ("video");
                    LIZ.LJ(this.LJLJLJ);
                    LIZ.LJIIIZ(this.LJLLI);
                    Aweme aweme2 = this.LJLJLJ;
                    if (aweme2 != null && aweme2.getAwemeRawAd() != null) {
                        Aweme aweme3 = this.LJLJLJ;
                        if (aweme3 != null) {
                            awemeRawAd4 = aweme3.getAwemeRawAd();
                        } else {
                            awemeRawAd4 = null;
                        }
                        C58655N0h LIZLLL2 = C58704N2e.LIZLLL("draw_ad", "ad_choice_view", awemeRawAd4);
                        LIZLLL2.LIZJ("video", "refer");
                        LIZLLL2.LJII();
                    }
                }
            }
            if (this.LLIZLLLIL != null) {
                Aweme aweme4 = this.LJLJLJ;
                if (aweme4 != null && aweme4.getAwemeRawAd() != null && (aweme = this.LJLJLJ) != null && (awemeRawAd = aweme.getAwemeRawAd()) != null && awemeRawAd.getLabel() != null) {
                    Aweme aweme5 = this.LJLJLJ;
                    if (aweme5 != null && (awemeRawAd3 = aweme5.getAwemeRawAd()) != null && (label2 = awemeRawAd3.getLabel()) != null) {
                        str = label2.getLabelName();
                    } else {
                        str = null;
                    }
                    if (!TextUtils.isEmpty(str)) {
                        TextView textView = this.LLIZLLLIL;
                        if (textView != null) {
                            Aweme aweme6 = this.LJLJLJ;
                            if (aweme6 != null && (awemeRawAd2 = aweme6.getAwemeRawAd()) != null && (label = awemeRawAd2.getLabel()) != null) {
                                str2 = label.getLabelName();
                            }
                            textView.setText(str2);
                        }
                    }
                }
                TextView textView2 = this.LLIZLLLIL;
                if (textView2 != null) {
                    textView2.setText(R.string.b9m);
                }
            }
            C27740Aue.LJIIIZ(8, this.LLJJJ);
            return;
        }
        C27740Aue.LJIIIZ(8, this.LLILZLL);
        if (!C214128am.LIZ()) {
            return;
        }
        C27740Aue.LJIIIZ(8, this.LLILZIL);
    }

    @Override // X.AnonymousClass901
    public final void y2(boolean z) {
        IFG ifg = this.LLLFZ;
        if (ifg != null) {
            ifg.LJII(this.LJLLI, this.LJLL, this.LJLJLJ, z);
        }
        DataCenter dataCenter = this.LJLLJ;
        if (dataCenter != null) {
            dataCenter.jv0(Boolean.valueOf(z), "ad_comment_dialog_visible");
        }
        this.LLLLJ = z;
        FeedAdViewModel feedAdViewModel = this.LLJJJJJIL;
        feedAdViewModel.getClass();
        feedAdViewModel.setState(new AqS15S0010000_10(z, 4));
        if (z) {
            LLLLZ("comment_block");
        } else {
            o("comment_block");
        }
        this.LLLLLLJ.LJLIL.setValue(Boolean.valueOf(z));
        InterfaceC58942NBi LLZZJLIL = LLZZJLIL();
        if (LLZZJLIL != null) {
            LLZZJLIL.LJIILIIL(new NBW(z));
        }
    }

    @Override // X.AnonymousClass901
    public final void E2(Runnable runnable, int i) {
        long LIZ;
        NQH LIZ2 = C201697vp.LIZ();
        IEZ LIZ3 = C46251IDf.LIZ();
        Aweme aweme = this.LJLJLJ;
        if (aweme != null && C63081OpJ.LJLJI(aweme) && LIZ2 != null) {
            LIZ = LIZ2.getDuration();
        } else {
            Aweme aweme2 = this.LJLJLJ;
            if (aweme2 != null && C63081OpJ.LJLLLL(aweme2) && LIZ3 != null) {
                LIZ = LIZ3.getDuration();
            } else {
                LIZ = IG7.LIZ(this.LJLJLJ);
            }
        }
        this.LJLLILLLL = LIZ;
        this.LJLLL.LJLJJI(100L);
        VideoPlayTaskManager videoPlayTaskManager = this.LJLLL;
        N68 n68 = new N68("cardTask");
        n68.LIZIZ(this.LJLLILLLL);
        n68.LIZJ = i;
        n68.LIZLLL = runnable;
        n68.LJ = false;
        videoPlayTaskManager.LJLJLJ(n68.LIZ());
    }

    @Override // X.AnonymousClass901
    public final void V2(Context context, Aweme aweme) {
        o.LJIIIZ(context, "context");
        this.LLLLLLIL++;
        if (!A2()) {
            Aweme aweme2 = this.LJLJLJ;
            if (aweme2 != null && aweme2.isAd()) {
                NQL.LJIILL().getClass();
                NQL.LJIJI(aweme);
            }
            d(true, false, false);
        }
    }

    public final View i(int i, String str) {
        View V8 = this.LJLIL.V8(str, true);
        o.LJII(V8, "null cannot be cast to non-null type android.view.ViewGroup");
        ViewGroup viewGroup = (ViewGroup) V8;
        View LLLLIILL = C16880lQ.LLLLIILL(C16880lQ.LLZIL(this.LJLLI), i, viewGroup, false);
        viewGroup.addView(LLLLIILL);
        viewGroup.setVisibility(8);
        return LLLLIILL;
    }

    public final void s(long j, boolean z) {
        String str;
        Context context = this.LJLLI;
        Aweme aweme = this.LJLJLJ;
        NN1.LJJJJI(context, "play_15s", aweme, NN1.LJIIIZ(context, aweme));
        AwemeRawAd LLZLL = LLZLL();
        C58655N0h LIZLLL = C58704N2e.LIZLLL("draw_ad", "play_15s", LLZLL);
        LIZLLL.LIZIZ(Integer.valueOf(z ? 1 : 0), "is_backfilled");
        LIZLLL.LIZIZ(Long.valueOf(j), "duration");
        LIZLLL.LJII();
        NQZ nqz = NQZ.PROGRESS_15S;
        if (LLZLL != null) {
            str = LLZLL.getCreativeIdStr();
        } else {
            str = null;
        }
        NQK.LIZLLL(nqz, str);
    }

    public final void t(long j, boolean z) {
        String str;
        AwemeRawAd awemeRawAd;
        AwemeRawAd LLZLL = LLZLL();
        C58655N0h LIZLLL = C58704N2e.LIZLLL("draw_ad", "play_2s", LLZLL);
        LIZLLL.LIZIZ(Integer.valueOf(z ? 1 : 0), "is_backfilled");
        LIZLLL.LIZIZ(Long.valueOf(j), "duration");
        Aweme aweme = this.LJLJLJ;
        if (aweme != null && (awemeRawAd = aweme.getAwemeRawAd()) != null && awemeRawAd.isReshowAd()) {
            LIZLLL.LIZIZ(1, "is_reshow");
        }
        LIZLLL.LJI();
        Aweme aweme2 = this.LJLJLJ;
        if (aweme2 != null && O5Y.LJJJIL(aweme2)) {
            SearchAdMainService.LJIIJJI().LJIIIIZZ().LJIJI(this.LJLJLJ, "play_2s");
            N7D n7d = this.LLLII;
            if (n7d != null) {
                n7d.yq(EnumC58794N5q.PLAY_2S);
            }
        }
        NQZ nqz = NQZ.PROGRESS_2S;
        if (LLZLL != null) {
            str = LLZLL.getCreativeIdStr();
        } else {
            str = null;
        }
        NQK.LIZLLL(nqz, str);
    }

    public final void u(long j, boolean z) {
        String str;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("6s mob task, ");
        Aweme aweme = this.LJLJLJ;
        String str2 = null;
        if (aweme != null) {
            str = aweme.getAwemeRawAdIdStr();
        } else {
            str = null;
        }
        LIZ.append(str);
        X1D.LIZIZ(LIZ);
        Context context = this.LJLLI;
        Aweme aweme2 = this.LJLJLJ;
        NN1.LJJJJI(context, "play_6s", aweme2, NN1.LJIIIZ(context, aweme2));
        AwemeRawAd LLZLL = LLZLL();
        C58655N0h LIZLLL = C58704N2e.LIZLLL("draw_ad", "play_6s", LLZLL);
        LIZLLL.LIZIZ(Integer.valueOf(z ? 1 : 0), "is_backfilled");
        LIZLLL.LIZIZ(Long.valueOf(j), "duration");
        LIZLLL.LJII();
        Aweme aweme3 = this.LJLJLJ;
        if (aweme3 != null && O5Y.LJJJIL(aweme3)) {
            SearchAdMainService.LJIIJJI().LJIIIIZZ().LJIJI(this.LJLJLJ, "play_6s");
            N7D n7d = this.LLLII;
            if (n7d != null) {
                n7d.yq(EnumC58794N5q.PLAY_6S);
            }
        }
        NQZ nqz = NQZ.PROGRESS_6S;
        if (LLZLL != null) {
            str2 = LLZLL.getCreativeIdStr();
        }
        NQK.LIZLLL(nqz, str2);
    }

    public final void v(String str, boolean z) {
        int i = 0;
        View V8 = this.LJLIL.V8(str, false);
        if (!(V8 instanceof ViewGroup) || V8 == null) {
            return;
        }
        if (!z) {
            i = 8;
        }
        V8.setVisibility(i);
    }

    public final void d(boolean z, boolean z2, boolean z3) {
        LXS LIZ;
        IFG ifg;
        InterfaceC59325NQb interfaceC59325NQb;
        InterfaceC59325NQb interfaceC59325NQb2;
        NQG nqg;
        FypAutoScrollService LJIIZILJ;
        if (!this.LLLIILIL && !this.LLLIL) {
            return;
        }
        if (FypAutoScrollServiceImpl.LJIIZILJ() != null && (LJIIZILJ = FypAutoScrollServiceImpl.LJIIZILJ()) != null) {
            LJIIZILJ.LJ(false);
        }
        if (I() && (interfaceC59325NQb2 = this.LLJJJJ) != null) {
            if (!interfaceC59325NQb2.LIZLLL() && ((nqg = this.LLJLIL) == null || !nqg.isShowing())) {
                return;
            }
        } else if (this.LLIFFJFJJ != null) {
            if (!this.LLLIILIL && !this.LLLIL) {
                return;
            }
        } else {
            return;
        }
        k(false);
        this.LJLIL.b2(false);
        InterfaceC58942NBi LLZZJLIL = LLZZJLIL();
        if (LLZZJLIL != null) {
            LLZZJLIL.LJIILIIL(new C58945NBl(false));
        }
        C91Y.LIZ(this.LLJJ);
        LLZLLIL().LIZ(false);
        JHI.LIZ().LIZLLL = false;
        this.LLLIILIL = false;
        this.LLLIL = false;
        NQG nqg2 = this.LLJLIL;
        if (nqg2 == null || !nqg2.isShowing()) {
            if (I() && (interfaceC59325NQb = this.LLJJJJ) != null) {
                interfaceC59325NQb.LIZJ(z, new NQ6(this, z2));
            } else {
                LinearLayout linearLayout = this.LLIFFJFJJ;
                if (linearLayout != null) {
                    linearLayout.setAlpha(1.0f);
                    linearLayout.animate().alpha(0.0f).setDuration(150L).withEndAction(new ARunnableS2S0220000_10(linearLayout, z, this, z2, 1)).start();
                    if ((this.LJLLI instanceof InterfaceC55058LjC) && (LIZ = LXU.LIZ()) != null && LIZ.LIZ) {
                        this.LLJJ.setVisibility(4);
                    } else {
                        this.LLJJ.setAlpha(0.0f);
                        this.LLJJ.setVisibility(0);
                        this.LLJJ.animate().alpha(1.0f).setDuration(150L).start();
                    }
                }
            }
            DataCenter dataCenter = this.LJLLJ;
            if (dataCenter != null) {
                dataCenter.jv0(null, "ON_AD_COMMON_MASK_HIDE");
            }
            if (LLLLZLLIL(this.LJLJLJ)) {
                this.LLJJJJLIIL.LJLJLJ.setValue("ad_mask_block");
            }
            if (z3 || (ifg = this.LLLFZ) == null) {
                return;
            }
            ifg.LJFF(this.LJLLI, this.LJLJLJ, this.LJLL);
            return;
        }
        e(z);
    }

    @Override // X.AnonymousClass901
    public final void i3(int i, int i2, String str) {
        LLZLLIL().LJII(i, i2, str);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C59316NPs(VideoBaseCell baseHolder, View view, int i, String str, InterfaceC72642tA onInternalEventListener, Fragment fragment, C59132NIq c59132NIq) {
        super((Object) null);
        ViewStub viewStub;
        ViewStub viewStub2;
        String str2 = str;
        o.LJIIIZ(baseHolder, "baseHolder");
        o.LJIIIZ(view, "view");
        o.LJIIIZ(onInternalEventListener, "onInternalEventListener");
        o.LJIIIZ(fragment, "fragment");
        this.LJLIL = baseHolder;
        this.LJLILLLLZI = view;
        this.LJLJI = i;
        this.LJLJJI = onInternalEventListener;
        this.LJLJJL = fragment;
        this.LJLJJLL = c59132NIq;
        this.LJLJL = new Handler(C16880lQ.LLJJJJ());
        str2 = str2 == null ? "" : str2;
        this.LJLL = str2;
        Context context = view.getContext();
        o.LJIIIIZZ(context, "view.context");
        this.LJLLI = context;
        this.LJLLL = new VideoPlayTaskManager();
        this.LJLLLL = C221108m2.LIZIZ(C48876JGe.INSTANCE);
        this.LJLLLLLL = C221108m2.LIZIZ(NSL.INSTANCE);
        this.LJLZ = C221108m2.LIZIZ(N4I.INSTANCE);
        this.LJZ = C221108m2.LIZIZ(NS9.INSTANCE);
        this.LJZI = C221108m2.LIZIZ(NSA.INSTANCE);
        this.LJZL = C221108m2.LIZIZ(C59108NHs.INSTANCE);
        this.LL = C221108m2.LIZIZ(C58192Mse.INSTANCE);
        ViewStub viewStub3 = (ViewStub) view.findViewById(R.id.d8t);
        ViewStub viewStub4 = (ViewStub) view.findViewById(R.id.nbx);
        ViewStub viewStub5 = (ViewStub) view.findViewById(R.id.d8s);
        ViewStub viewStub6 = (ViewStub) view.findViewById(R.id.g_k);
        ViewStub viewStub7 = (ViewStub) view.findViewById(R.id.d6q);
        FrameLayout frameLayout = (FrameLayout) view.findViewById(R.id.rr);
        this.LLFFF = frameLayout;
        View findViewById = view.findViewById(R.id.adq);
        o.LJIIIIZZ(findViewById, "view.findViewById(R.id.aweme_intro_ll)");
        this.LLFII = (LinearLayout) findViewById;
        FrameLayout frameLayout2 = (FrameLayout) view.findViewById(R.id.aod);
        this.LLFZ = frameLayout2;
        this.LLII = C221108m2.LIZIZ(new AqS160S0100000_10(this, 388));
        this.LLIIII = C221108m2.LIZIZ(new AqS160S0100000_10(this, 389));
        this.LLIIIILZ = C221108m2.LIZIZ(new AqS160S0100000_10(this, 397));
        this.LLIIIJ = C221108m2.LIZIZ(new AqS160S0100000_10(this, 385));
        this.LLIIIL = C221108m2.LIZIZ(new AqS160S0100000_10(this, 382));
        this.LLIIIZ = C221108m2.LIZIZ(new AqS160S0100000_10(this, 392));
        this.LLIIJI = C221108m2.LIZIZ(new AqS160S0100000_10(this, 383));
        this.LLIIJLIL = C221108m2.LIZIZ(new AqS160S0100000_10(this, 386));
        this.LLIIL = C221108m2.LIZIZ(new AqS160S0100000_10(this, 393));
        this.LLIILII = C221108m2.LIZIZ(new AqS160S0100000_10(this, 394));
        this.LLIILZL = C221108m2.LIZIZ(new AqS160S0100000_10(this, 395));
        this.LLIIZ = C221108m2.LIZIZ(new AqS160S0100000_10(this, 381));
        this.LLIL = C221108m2.LIZIZ(new AqS160S0100000_10(this, 396));
        this.LLILII = C221108m2.LIZIZ(new AqS160S0100000_10(this, LiveChatShowDelayForHotLiveSetting.DEFAULT));
        this.LLILIL = C221108m2.LIZIZ(new AqS160S0100000_10(this, 384));
        this.LLILL = C221108m2.LIZIZ(new AqS160S0100000_10(this, 398));
        this.LLILLIZIL = C221108m2.LIZIZ(new AqS160S0100000_10(this, 399));
        view.findViewById(R.id.d6c);
        View findViewById2 = view.findViewById(R.id.niu);
        o.LJIIIIZZ(findViewById2, "view.findViewById(R.id.widget_container)");
        this.LLJJ = (RelativeLayout) findViewById2;
        this.LLJJI = view.findViewById(R.id.lhs);
        this.LLJJIII = view.findViewById(R.id.bk6);
        View findViewById3 = view.findViewById(R.id.gradual_bottom);
        o.LJIIIIZZ(findViewById3, "view.findViewById(R.id.gradual_bottom)");
        this.LLJJIJI = findViewById3;
        View findViewById4 = view.findViewById(R.id.gradual_top);
        o.LJIIIIZZ(findViewById4, "view.findViewById(R.id.gradual_top)");
        this.LLJJIJIIJIL = findViewById4;
        this.LLJJIJIL = (FrameLayout) view.findViewById(R.id.eq0);
        this.LLJJJ = (TagLayout) view.findViewById(R.id.n8z);
        this.LLJJJJJIL = (FeedAdViewModel) C214348b8.LIZJ(baseHolder, C65352Pkq.LIZ(FeedAdViewModel.class), C48752JBk.INSTANCE, EnumC221088m0.SYNCHRONIZED).getValue();
        VideoPlayViewModel LIZ = C222448oC.LIZ(baseHolder);
        this.LLJJL = C221108m2.LIZIZ(new AqS160S0100000_10(this, 387));
        this.LLLF = C221108m2.LIZIZ(C58185MsX.INSTANCE);
        this.LLLILZ = new C59319NPv(this);
        this.LLLJL = 4;
        this.LLLLII = new ARunnableS46S0100000_10(this, 82);
        this.LLLLILI = true;
        this.LLLLLLJ = (FeedBehaviourViewModel) C41331GJz.LIZ(FeedBehaviourViewModel.class, fragment, null);
        this.LLLLLLL = new CopyOnWriteArrayList<>();
        this.LLLLLLLLLL = C59123NIh.LIZ;
        if (baseHolder instanceof IE5) {
            LIZ.LJLJJI = (InterfaceC212318Ux) baseHolder;
        }
        ShakeEggVM LIZ2 = C4NV.LIZ(LLLLZLLLI());
        this.LLJJJJLIIL = LIZ2;
        ActivityC45651qj LLLLZLLLI = LLLLZLLLI();
        if (LIZ2 != null) {
            LIZ2.LJLLL.observe(LLLLZLLLI, new AObserverS78S0100000_10(this, 38));
            LIZ2.LJLLLL.observe(LLLLZLLLI, new AObserverS78S0100000_10(this, 39));
            LIZ2.LJLLLLLL.observe(LLLLZLLLI, new AObserverS78S0100000_10(this, 40));
            LIZ2.LJLZ.observe(LLLLZLLLI, new AObserverS78S0100000_10(this, 41));
        }
        this.LLLLLIL = LLZZ().LJIIIIZZ();
        if (this.LLD == null) {
            View V8 = baseHolder.V8("native_ad_bottom_label_view", false);
            o.LJII(V8, "null cannot be cast to non-null type android.view.ViewGroup");
            ViewGroup viewGroup = (ViewGroup) V8;
            View LLLLIILL = C16880lQ.LLLLIILL(C16880lQ.LLZIL(context), R.layout.adm, viewGroup, false);
            o.LJII(LLLLIILL, "null cannot be cast to non-null type com.ss.android.ugc.aweme.commercialize.views.ButtonAdBottomLabelView");
            NQ2 nq2 = (NQ2) LLLLIILL;
            this.LLD = nq2;
            viewGroup.addView(nq2);
        }
        NQ2 nq22 = this.LLD;
        if (nq22 != null) {
            nq22.setOnClickListener(new ViewOnClickListenerC13880ga(new ACListenerS30S0100000_10(this, 76)));
            if (C214128am.LIZ()) {
                View V82 = baseHolder.V8("ad_red_packet_layout", true);
                o.LJII(V82, "null cannot be cast to non-null type android.view.ViewGroup");
                ViewGroup viewGroup2 = (ViewGroup) V82;
                View LLLLIILL2 = C16880lQ.LLLLIILL(C16880lQ.LLZIL(viewGroup2.getContext()), R.layout.ab8, this.LLFF, false);
                o.LJII(LLLLIILL2, "null cannot be cast to non-null type com.ss.android.ugc.aweme.base.ui.RemoteImageView");
                C62846OlW c62846OlW = (C62846OlW) LLLLIILL2;
                this.LLI = c62846OlW;
                viewGroup2.addView(c62846OlW);
                this.LLFF = viewGroup2;
            } else {
                View findViewById5 = view.findViewById(R.id.tu);
                o.LJIIIIZZ(findViewById5, "view.findViewById(R.id.ad_red_packet_iv)");
                this.LLI = (C62846OlW) findViewById5;
            }
            if (!C34710Djm.LJFF()) {
                E();
            }
            if (!C34710Djm.LJFF()) {
                if (C214128am.LIZ()) {
                    l();
                } else {
                    this.LLILZLL = (ViewGroup) view.findViewById(R.id.n2t);
                    this.LLIZ = (C62846OlW) view.findViewById(R.id.n2u);
                    this.LLIZLLLIL = (TextView) view.findViewById(R.id.n2v);
                    ViewGroup viewGroup3 = this.LLILZLL;
                    if (viewGroup3 != null) {
                        C16880lQ.LJIIL(viewGroup3, new ACListenerS30S0100000_10(this, 85));
                    }
                }
            }
            if (frameLayout2 != null) {
                C16880lQ.LJIILJJIL(frameLayout2, new ACListenerS30S0100000_10(this, 78));
            }
            if (!C226128u8.LIZ()) {
                this.LLILLJJLI = (NRW) view.findViewById(R.id.fti);
                this.LLILLL = (C163386b8) view.findViewById(R.id.cfa);
                this.LLILZ = (AnonymousClass375) view.findViewById(R.id.gj2);
                this.LLJILJIL = (C59948Nfs) view.findViewById(R.id.qt);
            }
            C59948Nfs c59948Nfs = this.LLJILJIL;
            if (c59948Nfs != null) {
                C16880lQ.LJJIJIL(c59948Nfs, new ACListenerS30S0100000_10(this, 74));
            }
            if (!C34710Djm.LJFF()) {
                g();
                LinearLayout linearLayout = this.LLJI;
                if (linearLayout != null) {
                    View findViewById6 = linearLayout.findViewById(R.id.qs);
                    o.LJIIIIZZ(findViewById6, "adLabelLl.findViewById(R.id.ad_desc_label)");
                    this.LLJIJIL = (C59948Nfs) findViewById6;
                    View findViewById7 = linearLayout.findViewById(R.id.gk7);
                    o.LJIIIIZZ(findViewById7, "adLabelLl.findViewById(R.id.mission_by_tv)");
                    this.LLJILJILJ = (TuxTextView) findViewById7;
                    View findViewById8 = linearLayout.findViewById(R.id.gk6);
                    o.LJIIIIZZ(findViewById8, "adLabelLl.findViewById(R.id.mission_ad_tv)");
                    this.LLJILLL = (TuxTextView) findViewById8;
                }
                if (C59982Xa.LIZIZ()) {
                    C59948Nfs c59948Nfs2 = this.LLJIJIL;
                    if (c59948Nfs2 != null) {
                        f(c59948Nfs2);
                    } else {
                        o.LJIJI("adLabel");
                        throw null;
                    }
                }
            }
            if (I() && (viewStub = (ViewStub) view.findViewById(R.id.nbx)) != null) {
                NQD nqd = new NQD();
                nqd.LJFF = viewStub;
                C7OY LIZJ = CommercializeAdServiceImpl.LJ().LIZJ(context, nqd);
                if (LIZJ instanceof InterfaceC59325NQb) {
                    this.LLJJJJ = (InterfaceC59325NQb) LIZJ;
                }
            }
            NDX LIZIZ = CommerceIBEService.LJFF().LIZIZ(new C59119NId(this));
            this.LLJZIJLIL = LIZIZ;
            LIZIZ.LIZJ(view);
            View V83 = baseHolder.V8("ad_product_tile_view_stub", true);
            o.LJII(V83, "null cannot be cast to non-null type android.view.ViewGroup");
            ViewGroup viewGroup4 = (ViewGroup) V83;
            if (viewGroup4.getChildCount() > 0) {
                View childAt = viewGroup4.getChildAt(0);
                o.LJII(childAt, "null cannot be cast to non-null type android.view.ViewStub");
                viewStub2 = (ViewStub) childAt;
            } else {
                View LLLLIILL3 = C16880lQ.LLLLIILL(C16880lQ.LLZIL(context), R.layout.af_, viewGroup4, false);
                o.LJII(LLLLIILL3, "null cannot be cast to non-null type android.view.ViewStub");
                viewStub2 = (ViewStub) LLLLIILL3;
                viewGroup4.addView(viewStub2);
            }
            if (viewStub3 != null) {
                this.LLJL = LLZZ().LJJIJ(viewStub3);
            }
            if (frameLayout != null) {
                this.LLJLIL = LLZZ().LJIIL(viewStub4, frameLayout);
            }
            if (viewStub5 != null) {
                this.LLJLILLLLZIIL = LLZZ().LJII(viewStub5);
            }
            if (viewStub7 != null) {
                if (C58542Rm.LIZ()) {
                    this.LLJLLIL = LLZZ().LJJIIJ(viewStub7);
                } else {
                    this.LLJLL = LLZZ().LJIIJ(viewStub7);
                }
            }
            if (viewStub6 != null) {
                this.LLJJLIIIJLLLLLLLZ = LLZZ().LJJ(viewStub6);
            }
            this.LLJLLL = LLZZ().LJFF(viewStub2);
            this.LLJZ = LLZZ().LJJIFFI(view, baseHolder, str2);
            baseHolder.LJLIIL(new C217638gR());
            this.LLLLLLLZIL = MeasurementServiceImpl.LJ().LIZLLL();
            return;
        }
        o.LJIJI("nativeAdBottomLabelView");
        throw null;
    }
}

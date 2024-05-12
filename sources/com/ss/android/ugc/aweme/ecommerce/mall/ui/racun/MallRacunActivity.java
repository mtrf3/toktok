package com.ss.android.ugc.aweme.ecommerce.mall.ui.racun;

import X.ActivityC86117Xqz;
import X.C06O;
import X.C16360ka;
import X.C16880lQ;
import X.C16970lZ;
import X.C184077Kh;
import X.C1B3;
import X.C1I1;
import X.C201037ul;
import X.C212418Vh;
import X.C213178Yf;
import X.C213198Yh;
import X.C214298b3;
import X.C214528bQ;
import X.C224238r5;
import X.C225328sq;
import X.C2U8;
import X.C33Q;
import X.C36746EbW;
import X.C36922EeM;
import X.C3C8;
import X.C47699Inn;
import X.C48027It5;
import X.C50419JqZ;
import X.C52184Kdw;
import X.C54502LaE;
import X.C55410Los;
import X.C55412Lou;
import X.C55416Loy;
import X.C55417Loz;
import X.C55418Lp0;
import X.C55421Lp3;
import X.C55427Lp9;
import X.C55793Lv3;
import X.C56412MCa;
import X.C57092Lx;
import X.C61447O9r;
import X.C65352Pkq;
import X.C65776Prg;
import X.C65803Ps7;
import X.C72Y;
import X.C76800UCe;
import X.C78926UyI;
import X.C78939UyV;
import X.C79004UzY;
import X.C8YN;
import X.C8YZ;
import X.FET;
import X.FMX;
import X.IG2;
import X.IWF;
import X.InterfaceC212848Wy;
import X.InterfaceC222288nw;
import X.InterfaceC27436Apk;
import X.InterfaceC45601Hv3;
import X.InterfaceC51123K4p;
import X.InterfaceC55286Lms;
import X.InterfaceC55336Lng;
import X.InterfaceC65784Pro;
import X.InterfaceC88471Ynr;
import X.InterfaceC88472Yns;
import X.InterfaceC88473Ynt;
import X.InterfaceC88474Ynu;
import X.InterfaceC88475Ynv;
import X.InterfaceC88476Ynw;
import X.KL0;
import X.KPL;
import X.L9Y;
import X.M89;
import X.M8A;
import X.OGB;
import X.OSK;
import X.OSL;
import X.OSM;
import X.RunnableC46309IFl;
import X.TBT;
import X.TBW;
import X.W5F;
import X.W5U;
import X.X1D;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.transition.AutoTransition;
import android.transition.Transition;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;
import com.bytedance.apm.agent.v2.instrumentation.ActivityAgent;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.ss.android.ugc.aweme.awemeservice.AwemeService;
import com.ss.android.ugc.aweme.awemeservice.RequestIdService;
import com.ss.android.ugc.aweme.awemeservice.api.IRequestIdService;
import com.ss.android.ugc.aweme.commercialize.profile.talent.TalentAdRevenueShareServiceImpl;
import com.ss.android.ugc.aweme.common.MobClick;
import com.ss.android.ugc.aweme.ecommerce.mall.vm.MallRacunViewModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.service.IFeedDebugService;
import com.ss.android.ugc.aweme.utils.ActivityStack;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AqS159S0100000_9;
import kotlin.jvm.internal.AqS191S0100000_9;
import kotlin.jvm.internal.AqS62S1100000_9;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class MallRacunActivity extends ActivityC86117Xqz implements InterfaceC55286Lms, InterfaceC45601Hv3, OGB, KPL {
    public static final HashSet<Integer> LJLLJ = new HashSet<>();
    public final C214298b3 LJLIL;
    public MallRacunFragment LJLILLLLZI;
    public FrameLayout LJLJI;
    public boolean LJLJJI;
    public M89 LJLJJL;
    public int LJLJJLL;
    public volatile boolean LJLJL;
    public InterfaceC27436Apk LJLJLJ;
    public boolean LJLJLLL;
    public FrameLayout LJLL;
    public FrameLayout LJLLI;
    public final Map<Integer, View> LJLLILLLL = new LinkedHashMap();

    @Override // X.ActivityC86117Xqz, X.KMV
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJLLILLLL).clear();
    }

    @Override // X.ActivityC86117Xqz, X.KMV
    public final View _$_findCachedViewById(int i) {
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLLILLLL;
        View view = (View) linkedHashMap.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        if (findViewById == null) {
            return null;
        }
        linkedHashMap.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    @Override // X.KPL, X.C8YZ
    public final LifecycleOwner getActualLifecycleOwner() {
        return this;
    }

    @Override // X.KPL, X.C8YM
    public final C8YZ getActualLifecycleOwnerHolder() {
        return this;
    }

    @Override // X.KPL, X.InterfaceC212848Wy
    public final C3C8 getActualReceiver() {
        return this;
    }

    @Override // X.KPL, X.C8YM
    public final InterfaceC212848Wy<C3C8> getActualReceiverHolder() {
        return this;
    }

    @Override // X.InterfaceC55286Lms
    public final InterfaceC55336Lng getHelper() {
        return null;
    }

    @Override // X.KPL, X.C8YM
    public final LifecycleOwner getHostLifecycleOwner() {
        return null;
    }

    @Override // X.KPL, X.C8YM
    public final LifecycleOwner getOwnLifecycleOwner() {
        return this;
    }

    @Override // X.KPL, X.C8YM
    public final C3C8 getReceiverForHostVM() {
        return null;
    }

    @Override // X.C8YM
    public final boolean getUniqueOnlyDefault() {
        return true;
    }

    @Override // X.ActivityC86117Xqz, X.ActivityC45651qj, android.app.Activity
    public final void onResume() {
        C65803Ps7.LIZLLL(this);
        super.onResume();
    }

    public MallRacunActivity() {
        C65776Prg LIZ = C65352Pkq.LIZ(MallRacunViewModel.class);
        this.LJLIL = new C214298b3(LIZ, new AqS159S0100000_9(LIZ, 136), C214528bQ.LJLIL, C78926UyI.LJJII(this, false), C78926UyI.LJJIIJZLJL(this, false), C184077Kh.LJLIL, C55418Lp0.INSTANCE, (InterfaceC65784Pro) null, 384);
        this.LJLJJI = true;
    }

    @Override // X.InterfaceC45601Hv3
    public final InterfaceC51123K4p getInflater() {
        return new L9Y(this);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0025, code lost:
    
        if (r0.vl() != false) goto L16;
     */
    @Override // X.KMV, androidx.activity.ComponentActivity, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onBackPressed() {
        /*
            r3 = this;
            com.ss.android.ugc.aweme.ecommerce.mall.ui.racun.MallRacunFragment r0 = r3.LJLILLLLZI
            if (r0 == 0) goto L3a
            boolean r1 = r0.isViewValid()
            r0 = 1
            if (r1 != r0) goto L3a
            com.ss.android.ugc.aweme.ecommerce.mall.ui.racun.MallRacunFragment r2 = r3.LJLILLLLZI
            if (r2 == 0) goto L32
            X.VWB r0 = r2.LJLJI
            if (r0 == 0) goto L32
            int r1 = r0.getCurrentItem()
            X.Ln3 r0 = r2.LJLLI
            if (r0 == 0) goto L32
            com.ss.android.ugc.aweme.ecommerce.mall.ui.racun.MallRacunPageFragment r0 = r0.LJJIIZI(r1)
            if (r0 == 0) goto L32
            boolean r0 = r0.vl()
            if (r0 == 0) goto L32
        L27:
            X.Jqa r1 = new X.Jqa
            r0 = 42
            r1.<init>(r0)
            X.C2U8.LIZ(r1)
            return
        L32:
            com.ss.android.ugc.aweme.ecommerce.mall.ui.racun.MallRacunFragment r0 = r3.LJLILLLLZI
            if (r0 == 0) goto L27
            r0.LJI()
            goto L27
        L3a:
            super.onBackPressed()
            java.lang.String r1 = "return"
            X.C55793Lv3.LIZJ(r1)
            com.ss.android.ugc.aweme.ecommerce.mall.ui.racun.MallRacunFragment r0 = r3.LJLILLLLZI
            if (r0 == 0) goto L27
            com.ss.android.ugc.aweme.ecommerce.mall.ui.racun.MallRacunFragment.Dl(r1)
            goto L27
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.mall.ui.racun.MallRacunActivity.onBackPressed():void");
    }

    @Override // X.ActivityC86117Xqz, android.app.Activity
    public final void finish() {
        super.finish();
        IWF.LJJLIIIIJ().LLLLLL();
        C78939UyV.LJJJJ(this);
        getIntent().removeExtra("VENDOR_BACK_INTENT_FOR_INTENT_KEY");
    }

    @Override // X.ActivityC86117Xqz, X.C29S, X.ActivityC45651qj, android.app.Activity
    public final void onDestroy() {
        String str;
        Aweme wl;
        MallRacunFragment mallRacunFragment;
        Aweme wl2;
        String str2;
        String str3;
        Aweme wl3;
        C65803Ps7.LIZIZ(this);
        super.onDestroy();
        C47699Inn.LJ();
        o.LJIIIIZZ(TalentAdRevenueShareServiceImpl.LJIIJJI(), "get().getService<ITalent…class.java,\n            )");
        C2U8.LIZ(new C55421Lp3());
        if (this.LJLILLLLZI == null) {
            return;
        }
        String LLJJIJIIJIL = C16880lQ.LLJJIJIIJIL(getIntent(), "video_from");
        C16880lQ.LLJJIJIIJIL(getIntent(), "refer");
        Aweme aweme = null;
        if (C50419JqZ.LIZ(LLJJIJIIJIL) && this.LJLJJLL != -1 && (mallRacunFragment = this.LJLILLLLZI) != null && (wl2 = mallRacunFragment.wl()) != null) {
            if (o.LJ(LLJJIJIIJIL, "from_hot")) {
                str2 = "homepage_hot";
            } else if (o.LJ(LLJJIJIIJIL, "from_nearby")) {
                str2 = "homepage_fresh";
            } else {
                return;
            }
            MobClick LIZLLL = C1I1.LIZLLL("feed_back", str2);
            MallRacunFragment mallRacunFragment2 = this.LJLILLLLZI;
            if (mallRacunFragment2 != null && (wl3 = mallRacunFragment2.wl()) != null) {
                str3 = wl3.getAid();
            } else {
                str3 = null;
            }
            LIZLLL.setValue(str3);
            LIZLLL.setJsonObject(RequestIdService.LJ().LIZ(this.LJLJJLL, wl2));
            FMX.onEvent(LIZLLL);
        }
        if (TextUtils.equals(LLJJIJIIJIL, "from_mix_detail") || TextUtils.equals(LLJJIJIIJIL, "from_mix_detail_item")) {
            MallRacunFragment mallRacunFragment3 = this.LJLILLLLZI;
            if (mallRacunFragment3 != null && (wl = mallRacunFragment3.wl()) != null) {
                str = wl.getAid();
            } else {
                str = null;
            }
            MobClick obtain = MobClick.obtain();
            obtain.setEventName("feed_back");
            obtain.setLabelName("playlist");
            obtain.setValue(str);
            IRequestIdService LJ = RequestIdService.LJ();
            MallRacunFragment mallRacunFragment4 = this.LJLILLLLZI;
            if (mallRacunFragment4 != null) {
                aweme = mallRacunFragment4.wl();
            }
            obtain.setJsonObject(LJ.LIZ(this.LJLJJLL, aweme));
            FMX.onEvent(obtain);
        }
        FET.LIZ();
        if (C72Y.LIZ()) {
            C16970lZ.LJIIIIZZ("common_feed_item_feed");
            C16970lZ.LJIIIIZZ("common_feed_micro_app_card_view");
        }
        C55793Lv3.LIZJ("close");
    }

    @Override // X.ActivityC86117Xqz, X.ActivityC45651qj, android.app.Activity
    public final void onPause() {
        C65803Ps7.LIZJ(this);
        super.onPause();
        IFeedDebugService iFeedDebugService = (IFeedDebugService) ServiceManager.get().getService(IFeedDebugService.class);
        if (iFeedDebugService != null) {
            iFeedDebugService.LJI();
        }
        Handler handler = IG2.LIZIZ;
        handler.removeCallbacksAndMessages(null);
        handler.postDelayed(RunnableC46309IFl.LJLIL, 500L);
        C48027It5.LIZJ();
    }

    @Override // X.ActivityC86117Xqz, X.C29S, X.ActivityC45651qj, android.app.Activity
    public final void onStart() {
        MallRacunFragment mallRacunFragment;
        C65803Ps7.LJ(this);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.ecommerce.mall.ui.racun.MallRacunActivity", "onStart", true);
        super.onStart();
        C55793Lv3.LIZIZ = System.currentTimeMillis();
        if (!this.LJLJJI && (mallRacunFragment = this.LJLILLLLZI) != null) {
            C212418Vh.LJIIJJI(mallRacunFragment.Al(), new AqS62S1100000_9(mallRacunFragment, "others", 15));
        }
        this.LJLJJI = false;
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.ecommerce.mall.ui.racun.MallRacunActivity", "onStart", false);
    }

    @Override // X.ActivityC86117Xqz, X.C29S, X.ActivityC45651qj, android.app.Activity
    public final void onStop() {
        C65803Ps7.LJFF(this);
        super.onStop();
        if (o.LJ(ActivityStack.getTopActivity(), this)) {
            C55793Lv3.LIZJ("close");
            if (this.LJLILLLLZI != null) {
                MallRacunFragment.Dl("close");
            }
        } else {
            C55793Lv3.LIZJ("next");
            if (this.LJLILLLLZI != null) {
                MallRacunFragment.Dl("next");
            }
        }
        if (EnterTransitionCrashOptimizer.getContext() != null) {
            try {
                getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
            } catch (Throwable unused) {
            }
        }
        try {
            getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
        } catch (Throwable unused2) {
        }
    }

    @Override // X.C29S, X.C1AU, android.app.Activity, android.view.Window.Callback
    public final boolean dispatchKeyEvent(KeyEvent event) {
        MallRacunFragment mallRacunFragment;
        MallRacunPageFragment xl;
        o.LJIIIZ(event, "event");
        MallRacunFragment mallRacunFragment2 = this.LJLILLLLZI;
        if (mallRacunFragment2 != null && mallRacunFragment2.xl() != null && (mallRacunFragment = this.LJLILLLLZI) != null && (xl = mallRacunFragment.xl()) != null && event.getAction() == 1 && event.getKeyCode() == 62 && xl.LLFF != null) {
            if (IWF.LJJLIIIIJ().isPlaying()) {
                IWF.LJJLIIIIJ().LJIILJJIL();
                MallRacunFragmentPanel mallRacunFragmentPanel = xl.LLFF;
                if (mallRacunFragmentPanel != null) {
                    mallRacunFragmentPanel.showIvPlay();
                }
            } else {
                IWF.LJJLIIIIJ().LIZIZ();
                MallRacunFragmentPanel mallRacunFragmentPanel2 = xl.LLFF;
                if (mallRacunFragmentPanel2 != null) {
                    mallRacunFragmentPanel2.hideIvPlay();
                }
            }
        }
        return super.dispatchKeyEvent(event);
    }

    @Override // X.C29S, android.app.Activity
    public final <T extends View> T findViewById(int i) {
        T t = (T) super.findViewById(i);
        if (t == null && LJLLJ.contains(Integer.valueOf(i))) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("live_fragment_id findViewById is null and id is ");
            LIZ.append(i);
            C36746EbW.LIZ(3, X1D.LIZIZ(LIZ));
            return (T) super.findViewById(R.id.llg);
        }
        return t;
    }

    @Override // X.ActivityC86117Xqz, X.KMV, X.ActivityC45651qj, androidx.activity.ComponentActivity, X.C1AU, android.app.Activity
    public final void onCreate(Bundle bundle) {
        Bundle bundle2;
        String str;
        String str2;
        String str3;
        String str4;
        C65803Ps7.LIZ(this, bundle);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.ecommerce.mall.ui.racun.MallRacunActivity", "onCreate", true);
        if (C72Y.LIZ()) {
            C16970lZ.LJFF(this, "common_feed_item_feed");
            C16970lZ.LJFF(this, "common_feed_micro_app_card_view");
        }
        C54502LaE.LIZ("detail_page");
        C54502LaE.LIZ("detail_page_startup");
        super.onCreate(bundle);
        if (getIntent().getBooleanExtra("from_notification", false)) {
            C55427Lp9.LIZIZ = System.currentTimeMillis();
            C55427Lp9.LIZJ = 2;
            C55427Lp9.LIZ();
        }
        ViewGroup.LayoutParams layoutParams = null;
        if (getIntent().getData() != null) {
            Uri data = getIntent().getData();
            StringBuilder LIZ = X1D.LIZ();
            if (data != null) {
                str = data.getHost();
            } else {
                str = null;
            }
            LIZ.append(str);
            if (data != null) {
                str2 = data.getPath();
            } else {
                str2 = null;
            }
            LIZ.append(str2);
            if (TextUtils.equals("user/video", X1D.LIZIZ(LIZ))) {
                getIntent().putExtra("enter_from", "push");
                getIntent().putExtra("refer", "push");
                Intent intent = getIntent();
                if (data != null) {
                    str3 = UriProtector.getQueryParameter(data, "id");
                } else {
                    str3 = null;
                }
                intent.putExtra("id", str3);
                Intent intent2 = getIntent();
                if (data != null) {
                    str4 = UriProtector.getQueryParameter(data, "commentId");
                } else {
                    str4 = null;
                }
                intent2.putExtra("cid", str4);
            }
        }
        getWindow().setSoftInputMode(48);
        setContentView(C16970lZ.LIZLLL(this, R.layout.a01));
        this.LJLLI = (FrameLayout) findViewById(R.id.c9b);
        this.LJLL = (FrameLayout) findViewById(R.id.dm7);
        this.LJLJI = (FrameLayout) findViewById(R.id.dhj);
        FET.LIZ();
        FrameLayout frameLayout = this.LJLLI;
        if (frameLayout != null) {
            frameLayout.setBackground(null);
        }
        if (bundle == null) {
            C55793Lv3.LJIIIZ = false;
        }
        M89 LIZIZ = M8A.LIZIZ(this);
        this.LJLJJL = LIZIZ;
        HashMap<String, String> param = LIZIZ.getLogExtra();
        o.LJIIIZ(param, "param");
        C225328sq.LIZ(this).LJLIL.putAll(param);
        this.LJLJJLL = getIntent().getIntExtra("page_type", -1);
        LIZIZ.getPreviousPage();
        LIZIZ.getEventType();
        String LLJJIJIIJIL = C16880lQ.LLJJIJIIJIL(getIntent(), "enter_from");
        if (LLJJIJIIJIL == null) {
            LLJJIJIIJIL = "mall";
        }
        C55793Lv3.LIZ = LLJJIJIIJIL;
        M89 m89 = this.LJLJJL;
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        o.LJIIIIZZ(supportFragmentManager, "supportFragmentManager");
        MallRacunFragment mallRacunFragment = (MallRacunFragment) supportFragmentManager.LJJJIL("contentFeedFragment");
        C1B3 c1b3 = new C1B3(supportFragmentManager);
        if (mallRacunFragment != null) {
            this.LJLILLLLZI = mallRacunFragment;
        } else {
            Intent intent3 = getIntent();
            if (intent3 == null || (bundle2 = C16880lQ.LLJJIJI(intent3)) == null) {
                bundle2 = new Bundle();
            }
            bundle2.putSerializable("feed_param", m89);
            MallRacunFragment mallRacunFragment2 = new MallRacunFragment();
            mallRacunFragment2.setArguments(bundle2);
            this.LJLILLLLZI = mallRacunFragment2;
            c1b3.LJIIJ(mallRacunFragment2, "contentFeedFragment", R.id.dm7);
        }
        MallRacunFragment mallRacunFragment3 = this.LJLILLLLZI;
        if (mallRacunFragment3 != null) {
            c1b3.LJIIL(mallRacunFragment3);
        }
        c1b3.LJIILJJIL();
        MallRacunFragment mallRacunFragment4 = this.LJLILLLLZI;
        if (mallRacunFragment4 != null) {
            mallRacunFragment4.setUserVisibleHint(true);
        }
        System.currentTimeMillis();
        try {
            getWindow().addFlags(LiveLayoutPreloadThreadPriority.DEFAULT);
            getWindow().setNavigationBarColor(-16777216);
        } catch (Exception e) {
            C36922EeM.LJFF(e);
        }
        Bundle LLJJIJI = C16880lQ.LLJJIJI(getIntent());
        if (LLJJIJI != null) {
            LLJJIJI.getInt("com.ss.android.ugc.aweme.intent.extra.FEED_TYPE", -1);
        }
        if (getIntent().getBooleanExtra("video_cover_transition", false)) {
            Aweme i6 = AwemeService.LIZ().i6(C16880lQ.LLJJIJIIJIL(getIntent(), "id"));
            o.LJI(i6);
            if (i6.getVideo() != null && i6.getVideo().getCover() != null && !C79004UzY.LJJIFFI(i6.getVideo().getCover().getUrlList())) {
                FrameLayout frameLayout2 = this.LJLJI;
                if (frameLayout2 != null) {
                    frameLayout2.setVisibility(0);
                }
                C224238r5 c224238r5 = new C224238r5();
                C224238r5.LJIIIIZZ(this);
                FrameLayout frameLayout3 = this.LJLJI;
                if (frameLayout3 != null) {
                    layoutParams = frameLayout3.getLayoutParams();
                }
                o.LJII(layoutParams, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
                FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
                layoutParams2.topMargin = C224238r5.LJII;
                C57092Lx.LIZ.getClass();
                layoutParams2.bottomMargin = C61447O9r.LIZ();
                FrameLayout frameLayout4 = this.LJLJI;
                if (frameLayout4 != null) {
                    frameLayout4.setLayoutParams(layoutParams2);
                }
                SmartImageView smartImageView = new SmartImageView(this);
                FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-1, -1, 17);
                FrameLayout frameLayout5 = this.LJLJI;
                if (frameLayout5 != null) {
                    frameLayout5.addView(smartImageView, layoutParams3);
                }
                i6.getOcrLocation();
                FrameLayout frameLayout6 = this.LJLJI;
                c224238r5.LJ = false;
                c224238r5.LIZ(this, i6, null, smartImageView, frameLayout6);
                C16360ka.LJIJJLI(smartImageView, "video_cover_transition");
                W5F LJII = W5U.LJII(C78939UyV.LJ(i6.getVideo().getCover()));
                LJII.LJJI = KL0.HIGH;
                LJII.LIZIZ("MallRacunActivity");
                LJII.LJJIIJ = smartImageView;
                LJII.LIZLLL(new C55412Lou(this));
                C06O.LIZIZ(this);
                AutoTransition autoTransition = new AutoTransition();
                autoTransition.addListener((Transition.TransitionListener) new C55410Los(this));
                getWindow().setSharedElementEnterTransition(autoTransition);
            }
        }
        if (!getIntent().getBooleanExtra("activity_has_activity_options", false)) {
            activityConfiguration(C55417Loz.LJLIL);
            C201037ul.LIZ(0, this, true);
        }
        IFeedDebugService iFeedDebugService = (IFeedDebugService) ServiceManager.get().getService(IFeedDebugService.class);
        findViewById(R.id.c9b);
        iFeedDebugService.LIZLLL();
        C8YN.LJII(this, this.LJLIL.getValue(), new TBT() { // from class: X.Lox
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return Boolean.valueOf(((C35638Dyk) obj).LJLJI);
            }
        }, null, new AqS191S0100000_9(this, 8), 6);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.ecommerce.mall.ui.racun.MallRacunActivity", "onCreate", false);
    }

    @Override // X.ActivityC86117Xqz, X.ActivityC45651qj, androidx.activity.ComponentActivity, X.C1AU, android.app.Activity
    public final void onSaveInstanceState(Bundle outState) {
        o.LJIIIZ(outState, "outState");
        super.onSaveInstanceState(outState);
        if (C52184Kdw.LIZ) {
            outState.putParcelable("android:support:fragments", null);
        }
    }

    @Override // X.ActivityC86117Xqz, android.app.Activity, android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.ecommerce.mall.ui.racun.MallRacunActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
        if (z && !this.LJLJLLL) {
            this.LJLJLLL = true;
            C54502LaE.LIZLLL("detail_page_startup", null, 6);
        }
    }

    @Override // X.OGB
    public final void setActivityResultListener(InterfaceC27436Apk listener) {
        o.LJIIIZ(listener, "listener");
        this.LJLJLJ = listener;
    }

    @Override // X.ActivityC86117Xqz, X.KMV, X.ActivityC45651qj, androidx.activity.ComponentActivity, android.app.Activity
    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        InterfaceC27436Apk interfaceC27436Apk = this.LJLJLJ;
        if (interfaceC27436Apk != null) {
            interfaceC27436Apk.onActivityResult(i, i2, intent);
        }
        if (i == 10086 && i2 == -1) {
            setResult(-1, intent);
            activityConfiguration(C55416Loy.LJLIL);
            finish();
        }
    }

    @Override // X.C8YM
    public final <S extends C33Q> InterfaceC222288nw subscribe(AssemViewModel<S> assemViewModel, C56412MCa<S> c56412MCa, InterfaceC88472Yns<? super Throwable, C76800UCe> interfaceC88472Yns, InterfaceC88471Ynr<? super C3C8, ? super S, C76800UCe> interfaceC88471Ynr) {
        return C212418Vh.LJIIIIZZ(this, assemViewModel, c56412MCa, interfaceC88472Yns, interfaceC88471Ynr);
    }

    @Override // X.C8YM
    public final <S extends C33Q, A> InterfaceC222288nw selectSubscribe(AssemViewModel<S> assemViewModel, TBW<S, ? extends A> tbw, C56412MCa<C213178Yf<A>> c56412MCa, InterfaceC88472Yns<? super Throwable, C76800UCe> interfaceC88472Yns, InterfaceC88471Ynr<? super C3C8, ? super A, C76800UCe> interfaceC88471Ynr) {
        return C212418Vh.LIZJ(this, assemViewModel, tbw, c56412MCa, interfaceC88472Yns, interfaceC88471Ynr);
    }

    @Override // X.C8YM
    public final <S extends C33Q, A> InterfaceC222288nw selectSubscribeOnAsync(AssemViewModel<S> assemViewModel, TBW<S, ? extends A> tbw, C56412MCa<C213178Yf<A>> c56412MCa, InterfaceC88472Yns<? super Throwable, C76800UCe> interfaceC88472Yns, InterfaceC88471Ynr<? super C3C8, ? super A, C76800UCe> interfaceC88471Ynr) {
        return C212418Vh.LJII(this, assemViewModel, tbw, c56412MCa, interfaceC88472Yns, interfaceC88471Ynr);
    }

    @Override // X.C8YM
    public final <S extends C33Q, A, B> InterfaceC222288nw selectSubscribe(AssemViewModel<S> assemViewModel, TBW<S, ? extends A> tbw, TBW<S, ? extends B> tbw2, C56412MCa<C213198Yh<A, B>> c56412MCa, InterfaceC88472Yns<? super Throwable, C76800UCe> interfaceC88472Yns, InterfaceC88473Ynt<? super C3C8, ? super A, ? super B, C76800UCe> interfaceC88473Ynt) {
        return C212418Vh.LIZIZ(assemViewModel, this, c56412MCa, interfaceC88472Yns, interfaceC88473Ynt, tbw, tbw2);
    }

    @Override // X.C8YM
    public final <S extends C33Q, A, B, C> InterfaceC222288nw selectSubscribe(AssemViewModel<S> assemViewModel, TBW<S, ? extends A> tbw, TBW<S, ? extends B> tbw2, TBW<S, ? extends C> tbw3, C56412MCa<OSK<A, B, C>> c56412MCa, InterfaceC88472Yns<? super Throwable, C76800UCe> interfaceC88472Yns, InterfaceC88474Ynu<? super C3C8, ? super A, ? super B, ? super C, C76800UCe> interfaceC88474Ynu) {
        return C212418Vh.LIZLLL(this, assemViewModel, tbw, tbw2, tbw3, c56412MCa, interfaceC88472Yns, interfaceC88474Ynu);
    }

    @Override // X.C8YM
    public final <S extends C33Q, A, B, C, D> InterfaceC222288nw selectSubscribe(AssemViewModel<S> assemViewModel, TBW<S, ? extends A> tbw, TBW<S, ? extends B> tbw2, TBW<S, ? extends C> tbw3, TBW<S, ? extends D> tbw4, C56412MCa<OSL<A, B, C, D>> c56412MCa, InterfaceC88472Yns<? super Throwable, C76800UCe> interfaceC88472Yns, InterfaceC88475Ynv<? super C3C8, ? super A, ? super B, ? super C, ? super D, C76800UCe> interfaceC88475Ynv) {
        return C212418Vh.LJ(this, assemViewModel, tbw, tbw2, tbw3, tbw4, c56412MCa, interfaceC88472Yns, interfaceC88475Ynv);
    }

    @Override // X.C8YM
    public final <S extends C33Q, A, B, C, D, E> InterfaceC222288nw selectSubscribe(AssemViewModel<S> assemViewModel, TBW<S, ? extends A> tbw, TBW<S, ? extends B> tbw2, TBW<S, ? extends C> tbw3, TBW<S, ? extends D> tbw4, TBW<S, ? extends E> tbw5, C56412MCa<OSM<A, B, C, D, E>> c56412MCa, InterfaceC88472Yns<? super Throwable, C76800UCe> interfaceC88472Yns, InterfaceC88476Ynw<? super C3C8, ? super A, ? super B, ? super C, ? super D, ? super E, C76800UCe> interfaceC88476Ynw) {
        return C212418Vh.LJFF(this, assemViewModel, tbw, tbw2, tbw3, tbw4, tbw5, c56412MCa, interfaceC88472Yns, interfaceC88476Ynw);
    }
}

package com.ss.android.ugc.aweme.detail.ui;

import X.C1046848y;
import X.C116484hg;
import X.C16880lQ;
import X.C1GE;
import X.C2MA;
import X.C36721Eb7;
import X.C37179EiV;
import X.C40358Fsg;
import X.C41379GLv;
import X.C48027It5;
import X.C50420Jqa;
import X.C52184Kdw;
import X.C52294Kfi;
import X.C52446KiA;
import X.C52987Kqt;
import X.C54502LaE;
import X.C55406Loo;
import X.C55408Loq;
import X.C56642Ke;
import X.C65803Ps7;
import X.C67012k5;
import X.C75792yF;
import X.C78540Us4;
import X.C78598Ut0;
import X.C78939UyV;
import X.C78996UzQ;
import X.C79043V0l;
import X.C84193Sd;
import X.C8RO;
import X.EF7;
import X.FMX;
import X.GHC;
import X.IG2;
import X.IIZ;
import X.IN6;
import X.IN7;
import X.IWF;
import X.InterfaceC18010nF;
import X.InterfaceC224908sA;
import X.InterfaceC27436Apk;
import X.InterfaceC45601Hv3;
import X.InterfaceC51123K4p;
import X.InterfaceC55286Lms;
import X.InterfaceC55336Lng;
import X.JHI;
import X.L9Y;
import X.M89;
import X.OGB;
import X.PJZ;
import X.QD3;
import X.RunnableC46309IFl;
import X.X1D;
import X.YUC;
import Y.AObjectS14S0001000_13;
import Y.ARunnableS42S0100000_6;
import android.content.ClipboardManager;
import android.content.Intent;
import android.content.res.Configuration;
import android.media.AudioManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.apm.agent.v2.instrumentation.ActivityAgent;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.bytedance.mt.protector.impl.UriProtector;
import com.ss.android.agilelogger.ALog;
import com.ss.android.ugc.aweme.awemeservice.AwemeService;
import com.ss.android.ugc.aweme.awemeservice.api.IAwemeService;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.base.ui.CommonPageFragment;
import com.ss.android.ugc.aweme.commercialize.profile.talent.ITalentAdRevenueShareService;
import com.ss.android.ugc.aweme.commercialize.profile.talent.TalentAdRevenueShareServiceImpl;
import com.ss.android.ugc.aweme.detail.platform.IDetailPageAbility;
import com.ss.android.ugc.aweme.editpost.EditPostPermission;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.FeedSharePlayerViewModel;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.homepage.api.interaction.ScrollSwitchStateManager;
import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.aweme.service.IFeedDebugService;
import com.ss.android.ugc.aweme.service.IPhotosViewHolderType;
import com.zhiliaoapp.musically.R;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.greenrobot.eventbus.ThreadMode;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes10.dex */
public class DetailActivity extends YUC implements InterfaceC55286Lms, InterfaceC45601Hv3, InterfaceC224908sA, OGB, InterfaceC18010nF {
    public static final HashSet<Integer> LLFFF = new HashSet<>();
    public DetailFragment LJLJJI;
    public List<GHC> LJLJJL;
    public FrameLayout LJLJL;
    public FrameLayout LJLLLLLL;
    public FrameLayout LJLZ;
    public AudioManager LLD;
    public int LLF;
    public L9Y LLFF;
    public final C8RO LJLJI = new C8RO("DetailActivity");
    public String LJLJJLL = "";
    public volatile boolean LJLJLJ = false;
    public InterfaceC27436Apk LJLJLLL = null;
    public volatile boolean LJLL = false;
    public boolean LJLLI = false;
    public boolean LJLLILLLL = false;
    public boolean LJLLJ = false;
    public Configuration LJLLL = null;
    public final C40358Fsg LJLLLL = new C40358Fsg(this);
    public int LJZ = -1;
    public long LJZI = 0;
    public long LJZL = -1;
    public long LL = 0;

    @Override // X.InterfaceC18010nF
    public String getBtmPageCode() {
        return "b2878";
    }

    @QD3
    public void onVideoEvent(C50420Jqa c50420Jqa) {
    }

    @Override // X.InterfaceC224908sA
    public final DetailPageFragment LJJJJIZL() {
        ScrollSwitchStateManager scrollSwitchStateManager;
        DetailFragment detailFragment = this.LJLJJI;
        if (detailFragment.LJLJJLL != null && (scrollSwitchStateManager = detailFragment.LJLJI) != null) {
            CommonPageFragment jv0 = scrollSwitchStateManager.jv0(scrollSwitchStateManager.nv0("page_feed"));
            if (jv0 instanceof DetailPageFragment) {
                return (DetailPageFragment) jv0;
            }
        }
        return null;
    }

    public final void LLFZ() {
        Intent intent = new Intent();
        intent.putExtra("TIME_PAUSED_IN_DETAIL_ACTIVITY", this.LL);
        setResult(54321, intent);
    }

    @Override // X.ActivityC86117Xqz, android.app.Activity
    public void finish() {
        int currentPlayPosition;
        boolean z = this.LJLL;
        super.finish();
        DetailFragment detailFragment = this.LJLJJI;
        if (detailFragment != null && C79043V0l.LJJII(detailFragment.Kl()) && detailFragment.mo49getActivity() != null) {
            JHI.LIZ().LIZ = FeedSharePlayerViewModel.getPlayerManager(detailFragment.mo49getActivity());
            JHI.LIZ().LJIIJJI = true;
            JHI LIZ = JHI.LIZ();
            if (C78540Us4.LJIJ(detailFragment.LJLL)) {
                C2MA curViewHolder = detailFragment.Hl().Wr().getCurViewHolder();
                if (curViewHolder instanceof IPhotosViewHolderType) {
                    currentPlayPosition = ((IPhotosViewHolderType) curViewHolder).getCurrentPlayPosition();
                    LIZ.LJIILJJIL = currentPlayPosition;
                }
            }
            currentPlayPosition = -1;
            LIZ.LJIILJJIL = currentPlayPosition;
        }
        String LLJJIJIIJIL = C16880lQ.LLJJIJIIJIL(getIntent(), "video_from");
        if (C1GE.LJIIIZ(this) || TextUtils.equals(LLJJIJIIJIL, "from_follow_page")) {
            if (!TextUtils.equals("from_mix_video", LLJJIJIIJIL)) {
                overridePendingTransition(R.anim.df, R.anim.dg);
            }
        } else {
            IWF.LJJLIIIIJ().LLLLLL();
        }
        C78996UzQ.LJJJ(this);
        String LLJJIJIIJIL2 = C16880lQ.LLJJIJIIJIL(getIntent(), "back_to");
        if (!TextUtils.isEmpty(LLJJIJIIJIL2)) {
            Intent intent = new Intent("android.intent.action.VIEW");
            Uri parse = UriProtector.parse(LLJJIJIIJIL2);
            if ("sslocal".equals(parse.getScheme())) {
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("snssdk");
                LIZ2.append(EF7.LJIIIZ);
                LLJJIJIIJIL2 = LLJJIJIIJIL2.replaceFirst("sslocal", X1D.LIZIZ(LIZ2));
                parse = UriProtector.parse(LLJJIJIIJIL2);
            }
            intent.setData(parse);
            intent.setPackage(getPackageName());
            intent.addCategory("android.intent.category.BROWSABLE");
            C78598Ut0.LJIJJ(intent, this);
            startActivity(intent);
            C8RO c8ro = this.LJLJI;
            StringBuilder LIZ3 = X1D.LIZ();
            LIZ3.append("[finish] backTo ");
            LIZ3.append(LLJJIJIIJIL2);
            c8ro.LJIIIIZZ(X1D.LIZIZ(LIZ3));
        } else {
            C78939UyV.LJJJJ(this);
        }
        getIntent().removeExtra("VENDOR_BACK_INTENT_FOR_INTENT_KEY");
        DetailFragment detailFragment2 = this.LJLJJI;
        if (detailFragment2 != null) {
            detailFragment2.Nl(this.LJZ, !TextUtils.equals(LLJJIJIIJIL, "from_follow_page"));
            this.LJLJJI.Ml(this.LJZ);
        }
        this.LJLJI.LJIIIIZZ("[finish]");
    }

    @Override // X.InterfaceC55286Lms
    public final InterfaceC55336Lng getHelper() {
        return this.LJLJJI.LJLILLLLZI;
    }

    @Override // X.InterfaceC45601Hv3
    public final InterfaceC51123K4p getInflater() {
        if (this.LLFF == null) {
            this.LLFF = new L9Y(this);
        }
        return this.LLFF;
    }

    @Override // X.InterfaceC18010nF
    public final Map<String, String> x3() {
        Aweme aweme;
        DetailFragment detailFragment = this.LJLJJI;
        if (detailFragment != null && (aweme = detailFragment.LJLL) != null) {
            HashMap hashMap = new HashMap();
            hashMap.put("aweme_id", aweme.getAid());
            if (aweme.getAuthor() != null && aweme.getAuthor().getAvatarThumb() != null) {
                UrlModel avatarThumb = aweme.getAuthor().getAvatarThumb();
                HashMap hashMap2 = new HashMap();
                hashMap2.put("uri", avatarThumb.getUri());
                hashMap2.put("url_list", avatarThumb.getUrlList());
                hashMap.put("avatar_thumb", C75792yF.LIZJ(hashMap2));
            }
            return hashMap;
        }
        return null;
    }

    @Override // X.InterfaceC18010nF
    public final String LLZIL() {
        return String.valueOf(hashCode());
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x0089, code lost:
    
        if (r0.vl() != false) goto L26;
     */
    @Override // X.KMV, androidx.activity.ComponentActivity, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onBackPressed() {
        /*
            r4 = this;
            com.ss.android.ugc.aweme.homepage.api.interaction.ScrollSwitchStateManager r0 = X.C84193Sd.LIZ(r4)
            com.ss.android.ugc.aweme.homepage.api.interaction.CurrentPagerItem r0 = r0.LJLIL
            java.lang.Integer r0 = r0.getValue()
            int r0 = r0.intValue()
            if (r0 != 0) goto L13
            r4.LLFZ()
        L13:
            java.util.List<X.GHC> r0 = r4.LJLJJL     // Catch: java.lang.Exception -> L32
            if (r0 == 0) goto L3a
            java.util.ArrayList r0 = (java.util.ArrayList) r0     // Catch: java.lang.Exception -> L32
            java.util.Iterator r3 = r0.iterator()     // Catch: java.lang.Exception -> L32
        L1d:
            boolean r0 = r3.hasNext()     // Catch: java.lang.Exception -> L32
            if (r0 == 0) goto L3a
            java.lang.Object r2 = r3.next()     // Catch: java.lang.Exception -> L32
            X.GHC r2 = (X.GHC) r2     // Catch: java.lang.Exception -> L32
            r1 = 4
            r0 = 0
            boolean r0 = r2.onKeyDown(r1, r0)     // Catch: java.lang.Exception -> L32
            if (r0 == 0) goto L1d
            return
        L32:
            r2 = move-exception
            X.8RO r1 = r4.LJLJI
            java.lang.String r0 = "[onBackPressed]"
            r1.LJFF(r0, r2)
        L3a:
            com.ss.android.ugc.aweme.detail.ui.DetailFragment r0 = r4.LJLJJI
            if (r0 == 0) goto L91
            boolean r0 = r0.isViewValid()
            if (r0 == 0) goto L91
            com.ss.android.ugc.aweme.detail.ui.DetailFragment r2 = r4.LJLJJI
            X.Lng r0 = r2.LJLILLLLZI
            if (r0 == 0) goto L8b
            com.ss.android.ugc.aweme.homepage.api.interaction.ScrollSwitchStateManager r0 = r2.LJLJI
            if (r0 == 0) goto L8b
            java.lang.String r1 = r0.hv0()
            java.lang.String r0 = "page_profile"
            boolean r0 = android.text.TextUtils.equals(r0, r1)
            if (r0 == 0) goto L7d
            X.Lng r0 = r2.LJLILLLLZI
            r0.LIZIZ()
        L5f:
            X.Jqa r1 = new X.Jqa
            r0 = 42
            r1.<init>(r0)
            X.C2U8.LIZ(r1)
            X.8RO r2 = r4.LJLJI
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r0 = "[onBackPressed] "
            r1.<init>(r0)
            r1.append(r4)
            java.lang.String r0 = r1.toString()
            r2.LJIIIIZZ(r0)
            return
        L7d:
            com.ss.android.ugc.aweme.homepage.api.interaction.ScrollSwitchStateManager r0 = r2.LJLJI
            com.ss.android.ugc.aweme.base.ui.CommonPageFragment r0 = r0.kv0()
            if (r0 == 0) goto L8b
            boolean r0 = r0.vl()
            if (r0 != 0) goto L5f
        L8b:
            com.ss.android.ugc.aweme.detail.ui.DetailFragment r0 = r4.LJLJJI
            r0.LJI()
            goto L5f
        L91:
            java.lang.String r2 = "back when fragment is null!"
            r1 = 6
            java.lang.String r0 = "DetailActivity"
            X.C36922EeM.LIZLLL(r1, r0, r2)
            super.onBackPressed()
            goto L5f
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.detail.ui.DetailActivity.onBackPressed():void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:102:0x0235, code lost:
    
        if (r6.equals("select_ads") == false) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0085, code lost:
    
        if (r8.equals("from_nearby") == false) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x013e, code lost:
    
        if (r6.equals("challenge") == false) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0170, code lost:
    
        r3 = new X.C188727au();
        r3.LJIIIZ("enter_from", r6);
        r0 = r12.LJLJJI.Hl();
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x017e, code lost:
    
        if (r0 == null) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0180, code lost:
    
        r1 = r0.Zg();
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0184, code lost:
    
        r3.LIZLLL(r1, "is_last");
        r3.LJIIIZ("group_id", r7.getAid());
        X.FMX.LJIIL("feed_back", r3.LIZ);
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0199, code lost:
    
        r1 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0147, code lost:
    
        if (r6.equals("others_homepage") == false) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0150, code lost:
    
        if (r6.equals("personal_homepage") == false) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0159, code lost:
    
        if (r6.equals("prop_page") == false) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0162, code lost:
    
        if (r6.equals("question") == false) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x016c, code lost:
    
        if (r6.equals("single_song") == false) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x01b1, code lost:
    
        if (r6.equals("ads_engage") == false) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x0239, code lost:
    
        r0 = new X.C188727au();
        r0.LJIIIZ("enter_from", r6);
        X.FMX.LJIIL("feed_back", r0.LIZ);
     */
    @Override // X.ActivityC86117Xqz, X.C29S, X.ActivityC45651qj, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onDestroy() {
        /*
            Method dump skipped, instructions count: 738
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.detail.ui.DetailActivity.onDestroy():void");
    }

    @Override // X.ActivityC86117Xqz, X.ActivityC45651qj, android.app.Activity
    public void onPause() {
        C65803Ps7.LIZJ(this);
        super.onPause();
        long currentTimeMillis = System.currentTimeMillis() - this.LJZI;
        String LLJJIJIIJIL = C16880lQ.LLJJIJIIJIL(getIntent(), "video_from");
        String LLJJIJIIJIL2 = C16880lQ.LLJJIJIIJIL(getIntent(), "enter_from");
        C55406Loo c55406Loo = new C55406Loo();
        c55406Loo.LJJL = Long.toString(currentTimeMillis);
        if ("add_yours".equals(LLJJIJIIJIL)) {
            c55406Loo.LIZLLL = LLJJIJIIJIL2;
            c55406Loo.LJIILIIL();
        }
        if (C84193Sd.LIZ(this).LJLIL.getValue().intValue() == 0) {
            this.LJZL = System.currentTimeMillis();
        }
        ((IFeedDebugService) ServiceManager.get().getService(IFeedDebugService.class)).LJI();
        Handler handler = IG2.LIZIZ;
        handler.removeCallbacksAndMessages(null);
        handler.postDelayed(RunnableC46309IFl.LJLIL, 500L);
        C48027It5.LIZJ();
        C8RO c8ro = this.LJLJI;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("[onPause] ");
        LIZ.append(this);
        c8ro.LJIIIIZZ(X1D.LIZIZ(LIZ));
    }

    @Override // X.ActivityC86117Xqz, X.ActivityC45651qj, android.app.Activity
    public void onResume() {
        C65803Ps7.LIZLLL(this);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.detail.ui.DetailActivity", "onResume", true);
        super.onResume();
        if (C84193Sd.LIZ(this).LJLIL.getValue().intValue() == 0 && this.LJZL != -1) {
            this.LL = (System.currentTimeMillis() - this.LJZL) + this.LL;
            this.LJZL = -1L;
        }
        IG2.LIZIZ.removeCallbacksAndMessages(null);
        IG2.LIZ = true;
        this.LJLJI.LJIIIIZZ("[onResume] " + this);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.detail.ui.DetailActivity", "onResume", false);
    }

    @Override // X.ActivityC86117Xqz, X.C29S, X.ActivityC45651qj, android.app.Activity
    public void onStart() {
        C65803Ps7.LJ(this);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.detail.ui.DetailActivity", "onStart", true);
        super.onStart();
        if (Build.VERSION.SDK_INT >= 29 && this.LJLLILLLL) {
            this.LLD.setAllowedCapturePolicy(2);
        }
        this.LJLJI.LJIIIIZZ("[onStart] " + this);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.detail.ui.DetailActivity", "onStart", false);
    }

    @Override // X.ActivityC86117Xqz, X.C29S, X.ActivityC45651qj, android.app.Activity
    public void onStop() {
        C65803Ps7.LJFF(this);
        if (IIZ.LIZ) {
            C37179EiV.LJFF.post(new ARunnableS42S0100000_6(this, 67));
        }
        if (Build.VERSION.SDK_INT >= 29 && this.LJLLILLLL) {
            this.LLD.setAllowedCapturePolicy(1);
        }
        super.onStop();
        C8RO c8ro = this.LJLJI;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("[onStop] ");
        LIZ.append(this);
        LIZ.append(",");
        LIZ.append(isChangingConfigurations());
        LIZ.append(",");
        LIZ.append(getChangingConfigurations());
        c8ro.LJIIIIZZ(X1D.LIZIZ(LIZ));
        if (isChangingConfigurations()) {
            int changingConfigurations = getChangingConfigurations();
            HashMap hashMap = new HashMap();
            C116484hg.LIZIZ(hashMap, "enter_from", this.LJLJJLL, changingConfigurations, "changing_configurations");
            FMX.LJIIL("changing_configuration_recreate", hashMap);
        }
    }

    @Override // android.app.Activity
    public final void finishAfterTransition() {
        super.finishAfterTransition();
    }

    public DetailFragment LLFII(M89 m89) {
        Bundle bundle;
        Intent intent = getIntent();
        if (intent == null || (bundle = C16880lQ.LLJJIJI(intent)) == null) {
            bundle = new Bundle();
        }
        bundle.putSerializable("feed_param", m89);
        DetailFragment detailFragment = new DetailFragment();
        detailFragment.setArguments(bundle);
        return detailFragment;
    }

    @Override // X.C29S, X.C1AU, android.app.Activity, android.view.Window.Callback
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        IDetailPageAbility Hl;
        DetailFragment detailFragment = this.LJLJJI;
        if (detailFragment != null && (Hl = detailFragment.Hl()) != null) {
            Hl.rY(keyEvent);
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // X.C29S, android.app.Activity
    public final <T extends View> T findViewById(int i) {
        T t = (T) super.findViewById(i);
        if (t == null && LLFFF.contains(Integer.valueOf(i))) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("findViewById is null and id is ");
            LIZ.append(i);
            ALog.com_ss_android_agilelogger_ALog_com_ss_android_ugc_aweme_lancet_AlogLancet_alogD("live_fragment_id", X1D.LIZIZ(LIZ));
            return (T) super.findViewById(R.id.llg);
        }
        return t;
    }

    @QD3(threadMode = ThreadMode.MAIN)
    public void getAgeInfoUpdateEvent(C1046848y c1046848y) {
        finish();
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public final Object getSystemService(String str) {
        Object systemService;
        LayoutInflater LIZIZ;
        if (C52446KiA.LIZ && Build.VERSION.SDK_INT > 27 && TextUtils.equals("layout_inflater", str) && getBaseContext() != null && (LIZIZ = C67012k5.LJ.LIZIZ(this)) != null) {
            return LIZIZ;
        }
        if (Build.VERSION.SDK_INT <= 27 && "clipboard".equals(str)) {
            if (IN7.LIZ) {
                synchronized (ClipboardManager.class) {
                    systemService = super.getSystemService(str);
                    if (Thread.currentThread() != Looper.getMainLooper().getThread()) {
                        try {
                            Field declaredField = ClipboardManager.class.getDeclaredField("mHandler");
                            declaredField.setAccessible(true);
                            declaredField.set(systemService, new IN6((Handler) declaredField.get(systemService)));
                        } catch (Exception e) {
                            PJZ.LIZIZ(e, "ClipboardManager Handler Reflect Fail");
                        }
                    }
                    IN7.LIZ = false;
                }
                return systemService;
            }
            return super.getSystemService(str);
        }
        if (!IN7.LIZIZ && "connectivity".equals(str)) {
            try {
                new C36721Eb7().LJ();
                IN7.LIZIZ = true;
                return super.getSystemService(str);
            } catch (Throwable unused) {
                return super.getSystemService(str);
            }
        }
        return super.getSystemService(str);
    }

    @Override // X.ActivityC86117Xqz, X.C29S, X.ActivityC45651qj, androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        Configuration configuration2 = this.LJLLL;
        if (configuration.navigation != configuration2.navigation) {
            C8RO c8ro = this.LJLJI;
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("navigation config changes ");
            LIZ.append(configuration2.navigation);
            LIZ.append(",");
            LIZ.append(configuration.navigation);
            c8ro.LJIIIIZZ(X1D.LIZIZ(LIZ));
            if (((Number) C52987Kqt.LIZ.getValue()).intValue() == 1) {
                this.LJLJI.LJIIIIZZ("recreate due to navigation");
                recreate();
                return;
            }
        }
        Configuration configuration3 = this.LJLLL;
        if (configuration3 == null) {
            this.LJLLL = new Configuration(configuration);
        } else {
            configuration3.setTo(configuration);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:51:0x0330, code lost:
    
        if (X.C2NU.LIZ.LIZIZ() == false) goto L83;
     */
    @Override // X.YUC, X.ActivityC86117Xqz, X.KMV, X.ActivityC45651qj, androidx.activity.ComponentActivity, X.C1AU, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onCreate(android.os.Bundle r20) {
        /*
            Method dump skipped, instructions count: 1290
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.detail.ui.DetailActivity.onCreate(android.os.Bundle):void");
    }

    @QD3(threadMode = ThreadMode.MAIN)
    public void onJsBroadCastEvent(C56642Ke c56642Ke) {
        Aweme i6;
        try {
            if (TextUtils.equals("adVideoReportSuccess", JSONObjectProtectorUtils.getString(c56642Ke.LJLIL, "eventName"))) {
                try {
                    ITalentAdRevenueShareService LJIIJJI = TalentAdRevenueShareServiceImpl.LJIIJJI();
                    if (LJIIJJI == null) {
                        return;
                    }
                    JSONObject jSONObject = JSONObjectProtectorUtils.getJSONObject(c56642Ke.LJLIL, "data");
                    if (jSONObject.opt("object_id") != null) {
                        String string = JSONObjectProtectorUtils.getString(jSONObject, "object_id");
                        IAwemeService LIZ = AwemeService.LIZ();
                        if (LIZ != null && (i6 = LIZ.i6(string)) != null && i6.getAwemeRawAd() != null) {
                            LJIIJJI.LJIIIZ(i6.getAwemeRawAd(), jSONObject);
                        }
                    }
                } catch (Throwable unused) {
                }
            }
        } catch (JSONException e) {
            C16880lQ.LLLLIIL(e);
        }
    }

    @Override // X.ActivityC86117Xqz, X.ActivityC45651qj, androidx.activity.ComponentActivity, X.C1AU, android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        if (C52184Kdw.LIZ) {
            bundle.putParcelable("android:support:fragments", null);
        }
    }

    @Override // X.ActivityC86117Xqz, android.app.Activity, android.view.Window.Callback
    public void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.detail.ui.DetailActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
        if (z && !this.LJLLI) {
            this.LJLLI = true;
            C54502LaE.LIZIZ("detail_page_startup");
        }
    }

    @Override // X.C34X
    public final void registerActivityOnKeyDownListener(GHC ghc) {
        if (this.LJLJJL == null) {
            this.LJLJJL = new ArrayList();
        }
        if (!this.LJLJJL.contains(ghc)) {
            this.LJLJJL.add(ghc);
        }
    }

    @Override // X.OGB
    public final void setActivityResultListener(InterfaceC27436Apk interfaceC27436Apk) {
        this.LJLJLLL = interfaceC27436Apk;
    }

    @Override // X.C34X
    public final void unRegisterActivityOnKeyDownListener(GHC ghc) {
        List<GHC> list = this.LJLJJL;
        if (list != null) {
            ((ArrayList) list).remove(ghc);
        }
    }

    @Override // X.ActivityC86117Xqz, android.app.Activity
    public final void onActivityReenter(int i, Intent intent) {
        InterfaceC55336Lng interfaceC55336Lng;
        C55408Loq.LIZ(this, i);
        if (-1 == i && intent != null && (interfaceC55336Lng = this.LJLJJI.LJLILLLLZI) != null) {
            interfaceC55336Lng.l7(C16880lQ.LLJJIJIIJIL(intent, "feed_share_element_aid"));
        }
        super.onActivityReenter(i, intent);
    }

    @Override // X.ActivityC86117Xqz, X.C29S, android.app.Activity, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        this.LJLLJ = false;
        List<GHC> list = this.LJLJJL;
        boolean z = true;
        if (list != null) {
            Iterator it = ((ArrayList) list).iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                if (((GHC) it.next()).onKeyDown(i, keyEvent)) {
                    this.LJLLJ = true;
                    break;
                }
            }
        }
        if (!this.LJLLJ) {
            z = super.onKeyDown(i, keyEvent);
        }
        this.LJLLLL.onKeyDown(i, keyEvent);
        C8RO c8ro = this.LJLJI;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("[onKeyDown] ");
        LIZ.append(z);
        LIZ.append(",");
        LIZ.append(i);
        c8ro.LJIIIIZZ(X1D.LIZIZ(LIZ));
        return z;
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public final boolean onKeyUp(int i, KeyEvent keyEvent) {
        if (C52294Kfi.LIZ) {
            if (i != 25 && i != 24) {
                return super.onKeyUp(i, keyEvent);
            }
            return this.LJLLJ;
        }
        return super.onKeyUp(i, keyEvent);
    }

    @Override // X.ActivityC86117Xqz, X.KMV, X.ActivityC45651qj, androidx.activity.ComponentActivity, android.app.Activity
    public final void onActivityResult(int i, int i2, Intent intent) {
        IDetailPageAbility Hl;
        super.onActivityResult(i, i2, intent);
        InterfaceC27436Apk interfaceC27436Apk = this.LJLJLLL;
        if (interfaceC27436Apk != null) {
            interfaceC27436Apk.onActivityResult(i, i2, intent);
        }
        if (i == 10086) {
            if (i2 == -1) {
                setResult(-1, intent);
                activityConfiguration(new AObjectS14S0001000_13(1, 2));
                finish();
                return;
            }
            return;
        }
        if (i == 1996) {
            if (i2 != -1 || intent == null) {
                return;
            }
            C41379GLv.LIZ(this, intent);
            return;
        }
        if (i != 10087 || i2 != -1 || intent == null) {
            return;
        }
        Music music = (Music) intent.getSerializableExtra("extra_replace_music_info");
        EditPostPermission editPostPermission = (EditPostPermission) intent.getSerializableExtra("extra_replace_music_permission_info");
        DetailFragment detailFragment = this.LJLJJI;
        if (detailFragment == null || (Hl = detailFragment.Hl()) == null) {
            return;
        }
        Hl.ph(music, editPostPermission);
    }
}

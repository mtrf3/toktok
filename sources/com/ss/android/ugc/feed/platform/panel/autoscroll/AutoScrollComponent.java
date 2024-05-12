package com.ss.android.ugc.feed.platform.panel.autoscroll;

import X.ActivityC45651qj;
import X.C16880lQ;
import X.C188727au;
import X.C212428Vi;
import X.C220858ld;
import X.C221108m2;
import X.C221138m5;
import X.C224888s8;
import X.C26045AKb;
import X.C2IW;
import X.C2K0;
import X.C2MA;
import X.C2NU;
import X.C2S6;
import X.C48753JBl;
import X.C48759JBr;
import X.C48761JBt;
import X.C48762JBu;
import X.C48763JBv;
import X.C48765JBx;
import X.C48766JBy;
import X.C51781KTx;
import X.C55096Ljo;
import X.C56509MFt;
import X.C58992Tf;
import X.C5H3;
import X.C62822Ol8;
import X.C63081OpJ;
import X.C78866UxK;
import X.C78983UzD;
import X.C87277YNd;
import X.C8MM;
import X.EnumC111394Yt;
import X.EnumC221088m0;
import X.EnumC223268pW;
import X.FMX;
import X.IDW;
import X.IWF;
import X.InterfaceC55102Lju;
import X.InterfaceC55235Lm3;
import X.J8K;
import X.JAK;
import X.JC4;
import X.KNV;
import X.KR8;
import X.KU4;
import X.LRD;
import X.M89;
import X.Z9N;
import Y.ACListenerS28S0100000_8;
import Y.AObserverS76S0100000_8;
import Y.ARunnableS40S0100000_4;
import Y.IDiS270S0100000_8;
import android.content.res.Resources;
import android.util.LruCache;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.poplayer.core.PopupManager;
import com.bytedance.tiktok.homepage.mainfragment.HomeTabAbility;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.AccountService;
import com.ss.android.ugc.aweme.IAccountService;
import com.ss.android.ugc.aweme.ad.feed.midad.IMidAdCellAbility;
import com.ss.android.ugc.aweme.base.HomePageViewPagerAbility;
import com.ss.android.ugc.aweme.commercialize.measurement.MeasurementServiceImpl;
import com.ss.android.ugc.aweme.feed.FypAutoScrollService;
import com.ss.android.ugc.aweme.feed.assem.ability.IFeedPanelPlatformAbility;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.PhotoModeImageInfo;
import com.ss.android.ugc.aweme.feed.model.PhotoModeImageUrlModel;
import com.ss.android.ugc.aweme.scope.MainActivityScope;
import com.ss.android.ugc.aweme.util.CountDownTimer;
import com.ss.android.ugc.feed.platform.fragment.IDetailBaseAbility;
import com.ss.android.ugc.feed.platform.panel.midad.IMidAdAbility;
import com.ss.android.ugc.feed.platform.panel.presenter.IFeedFetchDataAbility;
import com.ss.android.ugc.feed.platform.panel.viewpager.IViewPagerComponentAbility;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Stack;
import kotlin.jvm.internal.AqS158S0100000_8;
import kotlin.jvm.internal.AqS174S0100000_8;
import kotlin.jvm.internal.AqS64S0110000_8;
import kotlin.jvm.internal.AqS75S1100000_8;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class AutoScrollComponent extends BaseAutoScrollUIComponent implements JC4, IAutoAScrollAbility, InterfaceC55102Lju {
    public CountDownTimer LJLLI;
    public int LJLLILLLL;
    public EnumC223268pW LJLLJ;
    public int LJLLL;
    public final C62822Ol8 LJLLLL;
    public int LJLLLLLL;
    public boolean LJLZ;
    public boolean LJZ;
    public boolean LJZI;
    public View LJZL;
    public boolean LL;
    public final C5H3 LLD;
    public final C5H3 LLF;
    public final C221138m5 LLFF;
    public final C62822Ol8 LLFFF;
    public final C62822Ol8 LLFII;
    public final IDW LLFZ;
    public final Stack<Boolean> LLI;

    @Override // X.JC4
    public final void LJIILIIL(long j) {
    }

    @Override // X.InterfaceC55102Lju
    public final C2K0 provideAbility(String str) {
        if (str.hashCode() != -292136012) {
            return null;
        }
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AutoScrollComponent() {
        C62822Ol8 c62822Ol8;
        C62822Ol8 c62822Ol82;
        new LinkedHashMap();
        this.LJLLILLLL = 2;
        this.LJLLJ = EnumC223268pW.AUTO_SCROLL_STATE_STOP;
        this.LJLLLL = C221108m2.LIZIZ(new AqS158S0100000_8(this, 383));
        this.LJLZ = true;
        this.LL = true;
        if (JAK.LIZ()) {
            C221138m5 c221138m5 = new C221138m5(EnumC221088m0.PUBLICATION, new AqS158S0100000_8((KU4) this, 381), null);
            C51781KTx.LIZJ(this, c221138m5);
            c62822Ol8 = c221138m5;
        } else {
            c62822Ol8 = C221108m2.LIZIZ(new AqS64S0110000_8(false, (KU4) this, 4));
        }
        this.LLD = c62822Ol8;
        if (JAK.LIZ()) {
            C221138m5 c221138m52 = new C221138m5(EnumC221088m0.PUBLICATION, new AqS158S0100000_8((KU4) this, 382), null);
            C51781KTx.LIZJ(this, c221138m52);
            c62822Ol82 = c221138m52;
        } else {
            c62822Ol82 = C221108m2.LIZIZ(new AqS64S0110000_8(false, (KU4) this, 5));
        }
        this.LLF = c62822Ol82;
        this.LLFF = KR8.LJIIJJI(new AqS158S0100000_8(this, 384));
        this.LLFFF = C221108m2.LIZIZ(new AqS158S0100000_8(this, 378));
        this.LLFII = C221108m2.LIZIZ(new AqS158S0100000_8(this, 377));
        this.LLFZ = MeasurementServiceImpl.LJ().LIZLLL();
        this.LLI = new Stack<>();
    }

    public final void LJIIJJI() {
        if (this.LJLLLLLL > 3) {
            return;
        }
        IViewPagerComponentAbility viewPagerComponentAbility = getViewPagerComponentAbility();
        if (viewPagerComponentAbility != null && viewPagerComponentAbility.getNextViewHolder() != null) {
            return;
        }
        if (C224888s8.LJI(C56509MFt.LIZLLL(getPanelContext()))) {
            this.LJLLLLLL++;
            IDetailBaseAbility iDetailBaseAbility = (IDetailBaseAbility) this.LLFII.getValue();
            if (iDetailBaseAbility != null) {
                iDetailBaseAbility.LV();
                return;
            }
            return;
        }
        IFeedFetchDataAbility iFeedFetchDataAbility = (IFeedFetchDataAbility) C55096Ljo.LIZ(C55096Ljo.LJIIZILJ(this), IFeedFetchDataAbility.class, null);
        if (iFeedFetchDataAbility != null) {
            this.LJLLLLLL++;
            iFeedFetchDataAbility.LJJIJIIJI();
        }
    }

    public final IFeedPanelPlatformAbility M3() {
        return (IFeedPanelPlatformAbility) this.LLD.getValue();
    }

    public final C48763JBv N3() {
        return (C48763JBv) this.LJLLLL.getValue();
    }

    public final void P3() {
        EnumC223268pW enumC223268pW;
        EnumC223268pW enumC223268pW2 = this.LJLLJ;
        if (enumC223268pW2 == EnumC223268pW.AUTO_SCROLL_STATE_STOP || enumC223268pW2 == (enumC223268pW = EnumC223268pW.AUTO_SCROLL_STATE_PAUSE)) {
            return;
        }
        PopupManager.LJII();
        CountDownTimer countDownTimer = this.LJLLI;
        if (countDownTimer != null) {
            countDownTimer.pause();
        }
        this.LJLLJ = enumC223268pW;
        C48763JBv N3 = N3();
        if (N3 == null) {
            return;
        }
        N3.LIZ();
    }

    public final void Q3() {
        CountDownTimer countDownTimer;
        if (this.LJLZ && this.LJLLJ == EnumC223268pW.AUTO_SCROLL_STATE_PAUSE) {
            PopupManager.LJIIJ();
            this.LJLLJ = EnumC223268pW.AUTO_SCROLL_STATE_START;
            CountDownTimer countDownTimer2 = this.LJLLI;
            if (countDownTimer2 != null && countDownTimer2.isPaused() && (countDownTimer = this.LJLLI) != null) {
                countDownTimer.resume();
            }
            C48763JBv N3 = N3();
            if (N3 != null && N3.LIZJ == 1) {
                N3.LIZIZ = System.currentTimeMillis();
                N3.LIZJ = 0;
            }
        }
        X3();
    }

    public final void U3() {
        C2MA c2ma;
        int i;
        String str;
        Aweme aweme;
        C2MA nextViewHolder;
        String str2;
        EnumC223268pW enumC223268pW = this.LJLLJ;
        if (enumC223268pW == EnumC223268pW.AUTO_SCROLL_STATE_STOP || enumC223268pW == EnumC223268pW.AUTO_SCROLL_STATE_PAUSE) {
            return;
        }
        C224888s8.LIZIZ().LJIIJ(new AqS158S0100000_8(this, 379));
        if (Y3()) {
            IViewPagerComponentAbility viewPagerComponentAbility = getViewPagerComponentAbility();
            Boolean bool = null;
            String str3 = null;
            if (viewPagerComponentAbility != null) {
                c2ma = viewPagerComponentAbility.getNextViewHolder();
            } else {
                c2ma = null;
            }
            if (c2ma == null) {
                if (C2NU.LIZ.LIZJ != EnumC111394Yt.AVAILABLE) {
                    if (!this.LJZ) {
                        c4(R.string.bya);
                        Aweme K3 = K3();
                        String L3 = L3();
                        C188727au c188727au = new C188727au();
                        c188727au.LJIIIZ("enter_from", L3);
                        if (K3 != null) {
                            str3 = K3.getAuthorUid();
                        }
                        c188727au.LJIIIZ("author_id", str3);
                        if (K3 == null || (str2 = K3.getAid()) == null) {
                            str2 = "";
                        }
                        c188727au.LJIIIZ("group_id", str2);
                        if (C224888s8.LJI(L3)) {
                            c188727au.LJIIIIZZ(C224888s8.LIZLLL());
                        }
                        FMX.LJIIL("auto_scroll_weak_internet_toast", c188727au.LIZ);
                        this.LJZ = true;
                    }
                } else {
                    this.LJZ = false;
                    LJIIJJI();
                }
                if (!R3(K3())) {
                    return;
                }
                a4();
                return;
            }
            IWF.LJJLIIIIJ().LJIILJJIL();
            this.LJZ = false;
            this.LJLLLLLL = 0;
            IViewPagerComponentAbility viewPagerComponentAbility2 = getViewPagerComponentAbility();
            if (viewPagerComponentAbility2 != null) {
                i = viewPagerComponentAbility2.LLILL();
            } else {
                i = 0;
            }
            Aweme K32 = K3();
            IFeedPanelPlatformAbility M3 = M3();
            if (M3 != null) {
                str = M3.getPanelEventType();
            } else {
                str = null;
            }
            if (K32 != null && o.LJ(str, "homepage_hot")) {
                String aid = K32.getAid();
                LruCache<String, C2IW> lruCache = J8K.LIZ;
                C2IW c2iw = lruCache.get(aid);
                if (c2iw != null) {
                    c2iw.LJLILLLLZI = true;
                } else {
                    lruCache.put(aid, new C2IW(false, true));
                }
            }
            IViewPagerComponentAbility viewPagerComponentAbility3 = getViewPagerComponentAbility();
            if (viewPagerComponentAbility3 != null && (nextViewHolder = viewPagerComponentAbility3.getNextViewHolder()) != null) {
                aweme = nextViewHolder.getAweme();
            } else {
                aweme = null;
            }
            IViewPagerComponentAbility viewPagerComponentAbility4 = getViewPagerComponentAbility();
            if (viewPagerComponentAbility4 != null) {
                viewPagerComponentAbility4.lo0(true);
            }
            IViewPagerComponentAbility viewPagerComponentAbility5 = getViewPagerComponentAbility();
            if (viewPagerComponentAbility5 != null) {
                bool = Boolean.valueOf(viewPagerComponentAbility5.moveViewPagerToIndex(i + 1));
            }
            if (o.LJ(bool, Boolean.TRUE) && aweme != null && aweme.isAd()) {
                try {
                    SettingsManager.LIZLLL().getClass();
                } catch (Throwable th) {
                    C78983UzD.LJIIZILJ(th);
                }
                if (SettingsManager.LIZ("auto_scroll_ad_report_show", true)) {
                    if (!C58992Tf.LIZ(L3())) {
                        this.LLFZ.LIZIZ(aweme, L3(), C48766JBy.LIZ, new AqS174S0100000_8(this, 144));
                    }
                }
            }
            IViewPagerComponentAbility viewPagerComponentAbility6 = getViewPagerComponentAbility();
            if (viewPagerComponentAbility6 != null) {
                viewPagerComponentAbility6.lo0(false);
            }
            C224888s8.LIZIZ().LJIIJ(new C48753JBl(i));
            return;
        }
        if (R3(K3())) {
            a4();
        } else {
            CountDownTimer countDownTimer = this.LJLLI;
            if (countDownTimer != null) {
                countDownTimer.cancel();
            }
        }
        this.LJZ = false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x00a6, code lost:
    
        if (r0 == false) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean Y3() {
        /*
            r13 = this;
            X.8pW r1 = r13.LJLLJ
            X.8pW r0 = X.EnumC223268pW.AUTO_SCROLL_STATE_STOP
            r12 = 0
            if (r1 == r0) goto Lb
            X.8pW r0 = X.EnumC223268pW.AUTO_SCROLL_STATE_PAUSE
            if (r1 != r0) goto Lc
        Lb:
            return r12
        Lc:
            int r0 = r13.LJLLL
            if (r0 != 0) goto Lb
            X.KRA r1 = r13.getPanelContext()
            java.lang.String r0 = "panelContext"
            kotlin.jvm.internal.o.LJIIIZ(r1, r0)
            X.1qj r11 = r1.LIZ()
            r10 = 1
            if (r11 != 0) goto L40
        L21:
            com.ss.android.ugc.aweme.feed.FypAutoScrollService r0 = com.ss.android.ugc.feed.platform.panel.autoscroll.FypAutoScrollServiceImpl.LJIIZILJ()
            boolean r0 = r0.LJIIL()
            if (r0 != 0) goto Lb
            com.ss.android.ugc.aweme.feed.FypAutoScrollService r0 = com.ss.android.ugc.feed.platform.panel.autoscroll.FypAutoScrollServiceImpl.LJIIZILJ()
            boolean r0 = r0.LIZ()
            if (r0 != 0) goto Lb
            com.ss.android.ugc.aweme.feed.FypAutoScrollService r0 = com.ss.android.ugc.feed.platform.panel.autoscroll.FypAutoScrollServiceImpl.LJIIZILJ()
            boolean r0 = r0.LJIILIIL()
            if (r0 == 0) goto Lb0
            goto Lb
        L40:
            X.LRe r0 = X.LRD.LIZ(r11)
            boolean r9 = r0.LIZIZ()
            X.LRe r0 = X.LRD.LIZ(r11)
            boolean r8 = r0.LIZLLL()
            X.LRe r1 = X.LRD.LIZ(r11)
            java.lang.String r0 = "long_press_layer"
            boolean r7 = r1.LIZ(r0)
            X.LRe r1 = X.LRD.LIZ(r11)
            java.lang.String r0 = "downloaded_video_share_dialog"
            boolean r6 = r1.LIZ(r0)
            com.ss.android.ugc.aweme.feed.FypAutoScrollService r0 = com.ss.android.ugc.feed.platform.panel.autoscroll.FypAutoScrollServiceImpl.LJIIZILJ()
            if (r0 == 0) goto Lae
            boolean r5 = r0.LIZIZ()
        L6e:
            com.ss.android.ugc.aweme.feed.FypAutoScrollService r0 = com.ss.android.ugc.feed.platform.panel.autoscroll.FypAutoScrollServiceImpl.LJIIZILJ()
            if (r0 == 0) goto Lac
            boolean r4 = r0.LIZJ()
        L78:
            com.ss.android.ugc.aweme.feed.FypAutoScrollService r0 = com.ss.android.ugc.feed.platform.panel.autoscroll.FypAutoScrollServiceImpl.LJIIZILJ()
            if (r0 == 0) goto Laa
            boolean r3 = r0.LJIILJJIL()
        L82:
            X.LRe r1 = X.LRD.LIZ(r11)
            java.lang.String r0 = "input_danmaku"
            boolean r2 = r1.LIZ(r0)
            X.LRe r1 = X.LRD.LIZ(r11)
            java.lang.String r0 = "show_danmaku_rethink"
            boolean r0 = r1.LIZ(r0)
            if (r9 != 0) goto Lb
            if (r8 != 0) goto Lb
            if (r7 != 0) goto Lb
            if (r6 != 0) goto Lb
            if (r5 != 0) goto Lb
            if (r4 != 0) goto Lb
            if (r3 != 0) goto Lb
            if (r2 != 0) goto Lb
            if (r0 == 0) goto L21
            goto Lb
        Laa:
            r3 = 0
            goto L82
        Lac:
            r4 = 0
            goto L78
        Lae:
            r5 = 0
            goto L6e
        Lb0:
            int r1 = r13.LJLLILLLL
            r0 = 2
            if (r1 != r0) goto Lc0
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r13.K3()
            boolean r0 = r13.R3(r0)
            if (r0 != 0) goto Lc0
            return r12
        Lc0:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.feed.platform.panel.autoscroll.AutoScrollComponent.Y3():boolean");
    }

    public final void a4() {
        long j;
        EnumC223268pW enumC223268pW = this.LJLLJ;
        if (enumC223268pW == EnumC223268pW.AUTO_SCROLL_STATE_STOP || enumC223268pW == EnumC223268pW.AUTO_SCROLL_STATE_PAUSE) {
            return;
        }
        Aweme K3 = K3();
        if (K3 != null && K3.isLive()) {
            j = 10000;
        } else {
            j = 5000;
        }
        CountDownTimer countDownTimer = new CountDownTimer(j, 1000L, this);
        this.LJLLI = countDownTimer;
        countDownTimer.start();
    }

    public final IViewPagerComponentAbility getViewPagerComponentAbility() {
        return (IViewPagerComponentAbility) this.LLFF.getValue();
    }

    public final void initViews() {
        String str;
        Resources resources;
        View findViewById;
        if (this.LJZI) {
            return;
        }
        this.LJZI = true;
        ActivityC45651qj LIZ = C212428Vi.LIZ(this);
        if (LIZ != null) {
            LRD.LIZ(LIZ).LJIIIIZZ("long_press_layer", new C48759JBr(this, LIZ));
            HomePageViewPagerAbility homePageViewPagerAbility = (HomePageViewPagerAbility) this.LLFFF.getValue();
            if (homePageViewPagerAbility != null) {
                homePageViewPagerAbility.ii(new IDiS270S0100000_8(this, 1));
            }
            IAccountService LJIJ = AccountService.LJIJ();
            if (LJIJ != null) {
                LJIJ.LJIILJJIL(C48765JBx.LJLIL);
            }
        }
        View view = this.LJZL;
        if (view != null && (findViewById = view.findViewById(R.id.aan)) != null) {
            C16880lQ.LJIIJ(new ACListenerS28S0100000_8(this, 42), findViewById);
        }
        TuxTextView tuxTextView = this.LJLJJLL;
        if (tuxTextView != null) {
            ActivityC45651qj LIZ2 = C212428Vi.LIZ(this);
            if (LIZ2 == null || (resources = LIZ2.getResources()) == null || (str = resources.getString(R.string.by_)) == null) {
                str = "";
            }
            tuxTextView.setText(str);
        }
        TuxIconView tuxIconView = this.LJLJL;
        if (tuxIconView != null) {
            tuxIconView.setIconRes(R.raw.icon_auto_scroll_off_fill);
        }
        IViewPagerComponentAbility viewPagerComponentAbility = getViewPagerComponentAbility();
        if (viewPagerComponentAbility != null) {
            viewPagerComponentAbility.De0(new C48761JBt(this));
        }
    }

    @Override // com.ss.android.ugc.feed.platform.panel.autoscroll.BaseAutoScrollUIComponent
    public final boolean v3() {
        if (this.LJLLJ != EnumC223268pW.AUTO_SCROLL_STATE_STOP) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0040 A[RETURN, SYNTHETIC] */
    @Override // com.ss.android.ugc.feed.platform.panel.autoscroll.BaseAutoScrollUIComponent
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String A3() {
        /*
            r3 = this;
            com.ss.android.ugc.aweme.feed.assem.ability.IFeedPanelPlatformAbility r0 = r3.M3()
            if (r0 == 0) goto L1f
            java.lang.String r2 = r0.getPanelEventType()
            if (r2 == 0) goto L1f
            int r1 = r2.hashCode()
            r0 = 998835423(0x3b8904df, float:0.004181489)
            if (r1 == r0) goto L37
            r0 = 1425879700(0x54fd3294, float:8.6998023E12)
            if (r1 == r0) goto L2e
            r0 = 1691937916(0x64d8ec7c, float:3.2012298E22)
            if (r1 == r0) goto L22
        L1f:
            java.lang.String r0 = ""
        L21:
            return r0
        L22:
            java.lang.String r0 = "homepage_hot"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L2b
            goto L1f
        L2b:
            java.lang.String r0 = "first_show_auto_scroll"
            goto L21
        L2e:
            java.lang.String r0 = "search_result"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L40
            goto L1f
        L37:
            java.lang.String r0 = "general_search"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L40
            goto L1f
        L40:
            java.lang.String r0 = "first_show_search_auto_scroll"
            goto L21
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.feed.platform.panel.autoscroll.AutoScrollComponent.A3():java.lang.String");
    }

    public final void H3() {
        IFeedPanelPlatformAbility M3 = M3();
        String str = null;
        if (M3 != null) {
            str = M3.getPanelEventType();
        }
        if (!C224888s8.LJI(str) || this.LJLLJ != EnumC223268pW.AUTO_SCROLL_STATE_START) {
            return;
        }
        IViewPagerComponentAbility viewPagerComponentAbility = getViewPagerComponentAbility();
        if (viewPagerComponentAbility != null && viewPagerComponentAbility.getNextViewHolder() != null) {
            return;
        }
        LJIIJJI();
    }

    public final Aweme K3() {
        IViewPagerComponentAbility viewPagerComponentAbility = getViewPagerComponentAbility();
        if (viewPagerComponentAbility != null) {
            return viewPagerComponentAbility.getCurrentPlayAweme();
        }
        return null;
    }

    public final String L3() {
        String eventType;
        M89 m89 = getPanelContext().LIZJ;
        if (m89 == null || (eventType = m89.getEventType()) == null) {
            return "";
        }
        return eventType;
    }

    @Override // X.JC4
    public final void LIZ() {
        String str;
        boolean z;
        boolean z2;
        PhotoModeImageInfo photoModeImageInfo;
        String aid;
        FypAutoScrollService LJIIZILJ;
        List<PhotoModeImageUrlModel> imageList;
        Aweme K3 = K3();
        if (K3 == null) {
            return;
        }
        IFeedPanelPlatformAbility M3 = M3();
        String str2 = null;
        if (M3 != null) {
            str = M3.getPanelEventType();
        } else {
            str = null;
        }
        if (!C224888s8.LJI(str) && K3.isLive()) {
            z = true;
        } else {
            z = false;
        }
        IFeedPanelPlatformAbility M32 = M3();
        if (M32 != null) {
            str2 = M32.getPanelEventType();
        }
        if (C224888s8.LJI(str2) && K3.getIsSubAweme()) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!z && (((photoModeImageInfo = K3.getPhotoModeImageInfo()) == null || (imageList = photoModeImageInfo.getImageList()) == null || imageList.size() != 1) && ((C224888s8.LJIIIZ(K3) || K3.isLive()) && !C220858ld.LJIIJJI(K3) && !C220858ld.LJIIJ(K3) && ((!C220858ld.LJIIIZ(K3) || (LJIIZILJ = FypAutoScrollServiceImpl.LJIIZILJ()) == null || !LJIIZILJ.LJIILL()) && (((aid = K3.getAid()) == null || !ujb.o.LJJJLIIL(aid, "ug_referral_sub_", true)) && !z2))))) {
            return;
        }
        U3();
    }

    public final boolean W3() {
        String str;
        IFeedPanelPlatformAbility M3 = M3();
        if (M3 != null) {
            str = M3.getPanelEventType();
        } else {
            str = null;
        }
        if (C224888s8.LJI(str) && Z9N.LIZIZ.LJJJJJ()) {
            return true;
        }
        return false;
    }

    public final void X3() {
        EnumC223268pW LLJILJILJ;
        if (!C224888s8.LJI(C2S6.LIZ(getContext()).getEventType()) || (LLJILJILJ = Z9N.LIZIZ.LLJILJILJ()) == this.LJLLJ) {
            return;
        }
        if (LLJILJILJ == EnumC223268pW.AUTO_SCROLL_STATE_START) {
            initViews();
            Z3(false);
        } else {
            b4("", false);
        }
    }

    @Override // com.ss.android.ugc.feed.platform.panel.BasePanelUIComponent, com.bytedance.assem.arch.core.UIAssem, X.C8W0
    public final void onDestroy() {
        super.onDestroy();
        C224888s8.LIZ = null;
        C224888s8.LIZIZ = null;
    }

    @Override // X.C8W0
    public final void onPause() {
        super.onPause();
        P3();
        C224888s8.LIZ = null;
        C224888s8.LIZIZ = null;
    }

    @Override // X.C8W0
    public final void onResume() {
        super.onResume();
        Q3();
    }

    @Override // com.ss.android.ugc.feed.platform.panel.autoscroll.IAutoAScrollAbility
    public final void zl() {
        IMidAdCellAbility FT;
        C224888s8.LIZIZ().LJIIJ(new AqS158S0100000_8(this, 380));
        initViews();
        Z3(true);
        IMidAdAbility iMidAdAbility = (IMidAdAbility) this.LLF.getValue();
        if (iMidAdAbility != null && (FT = iMidAdAbility.FT()) != null) {
            FT.v10(true);
        }
    }

    @Override // com.ss.android.ugc.feed.platform.panel.autoscroll.IAutoAScrollAbility
    public final EnumC223268pW dl() {
        return this.LJLLJ;
    }

    @Override // X.C8W0
    public final void onStart() {
        super.onStart();
    }

    @Override // X.C8W0
    public final void onStop() {
        super.onStop();
    }

    public final boolean I3(Aweme aweme) {
        if ((aweme == null || (!aweme.isLive() && !C63081OpJ.LLIIII(aweme))) && !W3()) {
            return true;
        }
        return false;
    }

    public final void O3(boolean z) {
        C48763JBv N3;
        if (this.LJLLJ == EnumC223268pW.AUTO_SCROLL_STATE_STOP) {
            return;
        }
        Aweme K3 = K3();
        if (!I3(K3)) {
            getContainerView().setVisibility(8);
        } else if (getContainerView().getVisibility() != 0) {
            getContainerView().setVisibility(0);
            getContainerView().setAlpha(1.0f);
            getContainerView().post(new ARunnableS40S0100000_4(this, 164));
        }
        if (R3(K3)) {
            CountDownTimer countDownTimer = this.LJLLI;
            if (countDownTimer != null) {
                countDownTimer.cancel();
            }
            a4();
        }
        if (K3 != null && K3.isLive()) {
            C48763JBv N32 = N3();
            if (N32 != null) {
                N32.LIZ();
                return;
            }
            return;
        }
        if ((z || !this.LL) && (N3 = N3()) != null) {
            N3.LIZLLL++;
        }
        C48763JBv N33 = N3();
        if (N33 == null || N33.LIZJ != 1) {
            return;
        }
        N33.LIZIZ = System.currentTimeMillis();
        N33.LIZJ = 0;
    }

    public final boolean R3(Aweme aweme) {
        String str;
        boolean z;
        boolean z2;
        PhotoModeImageInfo photoModeImageInfo;
        String aid;
        List<PhotoModeImageUrlModel> imageList;
        if (aweme == null) {
            return false;
        }
        IFeedPanelPlatformAbility M3 = M3();
        String str2 = null;
        if (M3 != null) {
            str = M3.getPanelEventType();
        } else {
            str = null;
        }
        if (!C224888s8.LJI(str) && aweme.isLive()) {
            z = true;
        } else {
            z = false;
        }
        IFeedPanelPlatformAbility M32 = M3();
        if (M32 != null) {
            str2 = M32.getPanelEventType();
        }
        if (C224888s8.LJI(str2) && aweme.getIsSubAweme()) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!z && (((photoModeImageInfo = aweme.getPhotoModeImageInfo()) == null || (imageList = photoModeImageInfo.getImageList()) == null || imageList.size() != 1) && ((C224888s8.LJIIIZ(aweme) || aweme.isLive()) && !C220858ld.LJIIJJI(aweme) && !C220858ld.LJIIJ(aweme) && !C220858ld.LJIIIZ(aweme) && (((aid = aweme.getAid()) == null || !ujb.o.LJJJLIIL(aid, "ug_referral_sub_", true)) && !z2)))) {
            return false;
        }
        return true;
    }

    public final void Z3(boolean z) {
        C48763JBv N3;
        EnumC223268pW enumC223268pW = this.LJLLJ;
        EnumC223268pW enumC223268pW2 = EnumC223268pW.AUTO_SCROLL_STATE_START;
        if (enumC223268pW == enumC223268pW2) {
            return;
        }
        if (z && (!E3() || W3())) {
            c4(R.string.byc);
        }
        if (I3(K3())) {
            F3();
        }
        if (z) {
            C48763JBv N32 = N3();
            if (N32 != null) {
                N32.LIZLLL = 0L;
            }
            C48763JBv N33 = N3();
            if (N33 != null && N33.LIZJ != 0) {
                N33.LIZIZ = System.currentTimeMillis();
                N33.LIZ = 0L;
                N33.LIZJ = 0;
            }
        }
        this.LJLLJ = enumC223268pW2;
        if (C224888s8.LJI(C2S6.LIZ(getContext()).getEventType())) {
            Z9N.LIZIZ.LLJJIJIIJIL(this.LJLLJ);
        }
        PopupManager.LJIIJ();
        O3(true);
        if (!C224888s8.LJII(K3()) && this.LJLLILLLL == 2 && (N3 = N3()) != null) {
            N3.LIZ();
        }
        e4(false);
        H3();
        C224888s8.LIZIZ().LJIIJ(new C48762JBu(z));
    }

    public final void c4(int i) {
        ActivityC45651qj LIZ = C212428Vi.LIZ(this);
        if (LIZ != null) {
            C26045AKb c26045AKb = new C26045AKb(LIZ);
            c26045AKb.LJIIIZ(LIZ.getResources().getString(i));
            c26045AKb.LJIIJ();
        }
    }

    @Override // com.ss.android.ugc.feed.platform.panel.autoscroll.IAutoAScrollAbility
    public final void dQ(boolean z) {
        int i;
        if (!z) {
            this.LLI.push(Boolean.TRUE);
        } else {
            this.LLI.pop();
        }
        View view = this.LJZL;
        if (view == null) {
            return;
        }
        if (this.LLI.empty() && this.LJLLJ == EnumC223268pW.AUTO_SCROLL_STATE_START) {
            i = 0;
        } else {
            i = 8;
        }
        view.setVisibility(i);
    }

    public final void e4(boolean z) {
        MainActivityScope LJJLIIIJJI;
        HomeTabAbility LJIL;
        Fragment Ja;
        InterfaceC55235Lm3 LJFF;
        ActivityC45651qj LIZ = C212428Vi.LIZ(this);
        IDefaultAutoScrollAbility iDefaultAutoScrollAbility = null;
        if (LIZ != null && (LJJLIIIJJI = C78866UxK.LJJLIIIJJI(LIZ)) != null && (LJIL = C87277YNd.LJIL(LJJLIIIJJI)) != null && (Ja = LJIL.Ja("For You")) != null && (LJFF = KR8.LJFF(Ja)) != null) {
            iDefaultAutoScrollAbility = (IDefaultAutoScrollAbility) C55096Ljo.LIZ(LJFF, IDefaultAutoScrollAbility.class, null);
        }
        if (z) {
            if (iDefaultAutoScrollAbility != null) {
                iDefaultAutoScrollAbility.dC();
            }
        } else {
            if (iDefaultAutoScrollAbility == null) {
                return;
            }
            iDefaultAutoScrollAbility.JH();
        }
    }

    @Override // com.ss.android.ugc.feed.platform.panel.BasePanelUIComponent, X.KUK
    public final void eventInit(C8MM c8mm) {
        String str;
        c8mm.LIZ("event_on_play_completed", new AqS174S0100000_8(this, 141));
        c8mm.LIZ("event_on_play_pause", new AqS174S0100000_8(this, 142));
        c8mm.LIZIZ().put("event_on_playing", new AObserverS76S0100000_8(this, 77));
        c8mm.LIZIZ().put("event_on_request_resume_play", new AObserverS76S0100000_8(this, 78));
        IFeedPanelPlatformAbility M3 = M3();
        if (M3 != null) {
            str = M3.getPanelEventType();
        } else {
            str = null;
        }
        if (C224888s8.LJI(str) && Z9N.LIZIZ.LJJJJJ()) {
            c8mm.LIZ("event_on_play_progress_change", new AqS174S0100000_8(this, 143));
        }
    }

    @Override // com.ss.android.ugc.feed.platform.panel.autoscroll.IAutoAScrollAbility
    public final void j60(String enterMethod) {
        IMidAdCellAbility FT;
        o.LJIIIZ(enterMethod, "enterMethod");
        C224888s8.LIZIZ().LJIIJ(new AqS75S1100000_8(this, enterMethod, 10));
        c4(R.string.byb);
        b4(enterMethod, true);
        IMidAdAbility iMidAdAbility = (IMidAdAbility) this.LLF.getValue();
        if (iMidAdAbility != null && (FT = iMidAdAbility.FT()) != null) {
            FT.v10(false);
        }
    }

    @Override // com.ss.android.ugc.feed.platform.panel.BasePanelUIComponent, X.KU4
    public final void onPagePause(int i) {
        this.LJLZ = false;
        P3();
    }

    @Override // com.ss.android.ugc.feed.platform.panel.BasePanelUIComponent, X.KU4
    public final void onPageResume(int i) {
        this.LJLZ = true;
        Q3();
    }

    @Override // com.ss.android.ugc.feed.platform.panel.autoscroll.BaseAutoScrollUIComponent, com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        o.LJIIIZ(view, "view");
        super.onViewCreated(view);
        this.LJZL = view;
        this.LJZI = false;
        C224888s8.LIZ = null;
        C224888s8.LIZIZ = null;
        X3();
    }

    @Override // com.ss.android.ugc.feed.platform.panel.autoscroll.IAutoAScrollAbility
    public final void wm(Aweme aweme) {
        String str;
        String str2;
        if (this.LJLLJ == EnumC223268pW.AUTO_SCROLL_STATE_STOP) {
            return;
        }
        String str3 = null;
        if (aweme != null) {
            str = aweme.getAid();
        } else {
            str = null;
        }
        Aweme K3 = K3();
        if (K3 != null) {
            str2 = K3.getAid();
        } else {
            str2 = null;
        }
        if (o.LJ(str, str2)) {
            IFeedPanelPlatformAbility M3 = M3();
            if (M3 != null) {
                str3 = M3.getPanelEventType();
            }
            J8K.LIZLLL(aweme, str3);
            U3();
        }
    }

    public final void b4(String str, boolean z) {
        long j;
        long j2;
        String str2;
        String str3;
        String aid;
        EnumC223268pW enumC223268pW = this.LJLLJ;
        EnumC223268pW enumC223268pW2 = EnumC223268pW.AUTO_SCROLL_STATE_STOP;
        if (enumC223268pW == enumC223268pW2) {
            return;
        }
        C3();
        CountDownTimer countDownTimer = this.LJLLI;
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }
        CountDownTimer countDownTimer2 = this.LJLJLLL;
        if (countDownTimer2 != null) {
            countDownTimer2.cancel();
        }
        this.LJLLJ = enumC223268pW2;
        if (C224888s8.LJI(C2S6.LIZ(getContext()).getEventType())) {
            Z9N.LIZIZ.LLJJIJIIJIL(this.LJLLJ);
        }
        PopupManager.LJII();
        C48763JBv N3 = N3();
        if (N3 != null && N3.LIZJ != 2) {
            long currentTimeMillis = System.currentTimeMillis() - N3.LIZIZ;
            if (currentTimeMillis < 3600000) {
                N3.LIZ += currentTimeMillis;
            }
            N3.LIZIZ = 0L;
            N3.LIZJ = 2;
        }
        if (z) {
            Aweme K3 = K3();
            String L3 = L3();
            C48763JBv N32 = N3();
            if (N32 != null) {
                j = N32.LIZLLL;
            } else {
                j = 0;
            }
            C48763JBv N33 = N3();
            if (N33 != null) {
                j2 = N33.LIZ;
            } else {
                j2 = 0;
            }
            C188727au LIZLLL = KNV.LIZLLL(str, "enterMethod");
            LIZLLL.LJIIIZ("enter_from", L3);
            LIZLLL.LJIIIZ("enter_method", str);
            String str4 = null;
            if (K3 != null) {
                str2 = K3.getAuthorUid();
            } else {
                str2 = null;
            }
            LIZLLL.LJIIIZ("author_id", str2);
            LIZLLL.LJ(j, "auto_scroll_vv");
            LIZLLL.LJ(j2, "auto_scroll_duration");
            if (K3 != null) {
                str3 = K3.getAid();
            } else {
                str3 = null;
            }
            String str5 = "";
            if (str3 == null) {
                str3 = "";
            }
            LIZLLL.LJIIIZ("group_id", str3);
            if (C224888s8.LJI(L3)) {
                LIZLLL.LJIIIIZZ(C224888s8.LIZLLL());
            }
            FMX.LJIIL("turn_off_auto_scroll", LIZLLL.LIZ);
            Aweme K32 = K3();
            String L32 = L3();
            C188727au c188727au = new C188727au();
            c188727au.LJIIIZ("enter_from", L32);
            c188727au.LJIIIZ("enter_method", str);
            if (K32 != null) {
                str4 = K32.getAuthorUid();
            }
            c188727au.LJIIIZ("author_id", str4);
            if (K32 != null && (aid = K32.getAid()) != null) {
                str5 = aid;
            }
            c188727au.LJIIIZ("group_id", str5);
            if (C224888s8.LJI(L32)) {
                c188727au.LJIIIIZZ(C224888s8.LIZLLL());
            }
            FMX.LJIIL("auto_scroll_turned_off_toast", c188727au.LIZ);
            C48763JBv N34 = N3();
            if (N34 != null) {
                N34.LIZLLL = 0L;
            }
        }
        e4(true);
    }

    @Override // com.ss.android.ugc.feed.platform.panel.autoscroll.IAutoAScrollAbility
    public final void yh(int i, int i2) {
        String str;
        C48763JBv N3;
        if (this.LJLLJ == EnumC223268pW.AUTO_SCROLL_STATE_STOP) {
            return;
        }
        Aweme K3 = K3();
        if (C224888s8.LJIIIIZZ(K3)) {
            if (i == i2 - 1) {
                if (!Y3() && (N3 = N3()) != null) {
                    N3.LIZLLL++;
                }
                IFeedPanelPlatformAbility M3 = M3();
                if (M3 != null) {
                    str = M3.getPanelEventType();
                } else {
                    str = null;
                }
                J8K.LIZLLL(K3, str);
                U3();
                return;
            }
            C48763JBv N32 = N3();
            if (N32 == null) {
                return;
            }
            N32.LIZLLL++;
        }
    }
}

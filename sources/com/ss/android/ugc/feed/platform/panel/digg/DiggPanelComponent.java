package com.ss.android.ugc.feed.platform.panel.digg;

import X.AnonymousClass799;
import X.C110624Vu;
import X.C16880lQ;
import X.C183887Jo;
import X.C1DH;
import X.C221108m2;
import X.C2K0;
import X.C2MA;
import X.C2MH;
import X.C2MY;
import X.C2U8;
import X.C38354F3m;
import X.C50420Jqa;
import X.C51705KQz;
import X.C56509MFt;
import X.C5WY;
import X.C62822Ol8;
import X.C79N;
import X.InterfaceC55102Lju;
import X.KR0;
import X.KR6;
import X.KR8;
import X.LSL;
import X.QD3;
import Y.ARunnableS22S0200000_3;
import Y.ARunnableS42S0100000_6;
import Y.ARunnableS5S1300000_8;
import android.app.Activity;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Handler;
import android.view.KeyEvent;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.bytedance.android.livesdk.livesetting.other.subscribe.SubscriptionIconHideTextMinimumDimensionSetting;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.awemeservice.AwemeService;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.panel.BaseListFragmentPanel;
import com.ss.android.ugc.feed.platform.panel.BasePanelUIComponent;
import com.ss.android.ugc.feed.platform.panel.IRootAbility;
import com.ss.android.ugc.feed.platform.panel.loadmorepanel.ILoadMoreAbility;
import com.ss.android.ugc.feed.platform.panel.viewpager.IViewPagerComponentAbility;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.AqS158S0100000_8;
import kotlin.jvm.internal.AqS174S0100000_8;
import kotlin.jvm.internal.o;
import org.greenrobot.eventbus.EventBus;

/* loaded from: classes9.dex */
public final class DiggPanelComponent extends BasePanelUIComponent implements IDiggComponentAbility, KR6, InterfaceC55102Lju {
    public static final Keva LJLLJ = Keva.getRepo(C16880lQ.LJLLJ(BaseListFragmentPanel.class));
    public final C62822Ol8 LJLJJI;
    public final C62822Ol8 LJLJJL;
    public final C62822Ol8 LJLJJLL;
    public final C62822Ol8 LJLJL;
    public C5WY LJLJLJ;
    public boolean LJLJLLL;
    public Handler LJLL;
    public ARunnableS5S1300000_8 LJLLI;
    public ARunnableS42S0100000_6 LJLLILLLL;

    @Override // X.KR6
    public final void LJLLILLLL() {
    }

    @Override // X.KR6
    public final void LLJILJIL() {
    }

    @Override // X.KR6
    public final void LLJLLL() {
    }

    @Override // X.KR6
    public final void LLLIL() {
    }

    @Override // X.KR6
    public final void LLLLLZ(Bundle bundle) {
    }

    @Override // X.KR6
    public final void LLLLZLLLI() {
    }

    @Override // X.KR6
    public final void W1() {
    }

    @Override // X.KR6
    public final void d5() {
    }

    @Override // X.InterfaceC55102Lju
    public final C2K0 provideAbility(String str) {
        if (str.hashCode() != 1969856132) {
            return null;
        }
        return this;
    }

    @Override // X.KR6
    public final void v() {
    }

    public DiggPanelComponent() {
        new LinkedHashMap();
        this.LJLJJI = C221108m2.LIZIZ(new AqS158S0100000_8(this, SubscriptionIconHideTextMinimumDimensionSetting.DEFAULT));
        this.LJLJJL = C221108m2.LIZIZ(new AqS158S0100000_8(this, 389));
        this.LJLJJLL = C221108m2.LIZIZ(new AqS158S0100000_8(this, 388));
        this.LJLJL = C221108m2.LIZIZ(new AqS158S0100000_8(this, 391));
    }

    public final IViewPagerComponentAbility getViewPagerComponentAbility() {
        return (IViewPagerComponentAbility) this.LJLJL.getValue();
    }

    @Override // com.ss.android.ugc.feed.platform.panel.BasePanelUIComponent, com.bytedance.assem.arch.core.UIAssem, X.C8W0
    public final void onDestroy() {
        Handler handler;
        super.onDestroy();
        EventBus.LIZJ().LJIJ(this);
        ARunnableS42S0100000_6 aRunnableS42S0100000_6 = this.LJLLILLLL;
        if (aRunnableS42S0100000_6 != null && (handler = this.LJLL) != null) {
            handler.removeCallbacks(aRunnableS42S0100000_6);
        }
        this.LJLL = null;
        this.LJLLILLLL = null;
        this.LJLLI = null;
    }

    @Override // X.C8W0
    public final void onPause() {
        Handler handler;
        super.onPause();
        ARunnableS42S0100000_6 aRunnableS42S0100000_6 = this.LJLLILLLL;
        if (aRunnableS42S0100000_6 != null && (handler = this.LJLL) != null) {
            handler.removeCallbacks(aRunnableS42S0100000_6);
        }
    }

    @Override // X.C8W0
    public final void onResume() {
        Handler handler;
        super.onResume();
        if (this.LJLLI != null) {
            if (this.LJLL == null) {
                this.LJLL = new Handler();
            }
            if (this.LJLLILLLL == null) {
                this.LJLLILLLL = new ARunnableS42S0100000_6(this, 66);
            }
            ARunnableS42S0100000_6 aRunnableS42S0100000_6 = this.LJLLILLLL;
            if (aRunnableS42S0100000_6 != null && (handler = this.LJLL) != null) {
                handler.postDelayed(aRunnableS42S0100000_6, 500L);
            }
        }
    }

    @Override // X.KR6
    public final void LLIIIJ(Configuration newConfig) {
        o.LJIIIZ(newConfig, "newConfig");
    }

    @Override // X.KR6
    public final void LLLII(Bundle outState) {
        o.LJIIIZ(outState, "outState");
    }

    /* JADX WARN: Code restructure failed: missing block: B:152:0x01cb, code lost:
    
        r0 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:154:0x01e7, code lost:
    
        if (X.C2NU.LIZ.LIZIZ() == false) goto L89;
     */
    /* JADX WARN: Code restructure failed: missing block: B:155:0x01e9, code lost:
    
        r6.m6(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:156:0x01d5, code lost:
    
        if (r7 <= 0) goto L120;
     */
    /* JADX WARN: Code restructure failed: missing block: B:157:0x01d7, code lost:
    
        if (r12 != false) goto L120;
     */
    /* JADX WARN: Code restructure failed: missing block: B:159:0x01dd, code lost:
    
        if (X.C2043180d.LIZ() < r7) goto L120;
     */
    /* JADX WARN: Code restructure failed: missing block: B:173:0x0262, code lost:
    
        if (X.C80S.LJ(r4) != false) goto L126;
     */
    /* JADX WARN: Code restructure failed: missing block: B:182:0x01ed, code lost:
    
        if (r4 != null) goto L124;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00d6, code lost:
    
        if (r4.isCanPlay() != false) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00d8, code lost:
    
        r7 = X.IW7.LJ();
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00dc, code lost:
    
        if (r7 != 0) goto L115;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00e0, code lost:
    
        if ((!r12) == false) goto L120;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x00e2, code lost:
    
        r6 = "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x00e4, code lost:
    
        if (r7 == 0) goto L79;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x00f4, code lost:
    
        if (android.text.TextUtils.equals(X.C56509MFt.LIZLLL(getPanelContext()), "homepage_hot") == false) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x00f6, code lost:
    
        r11 = r5.getString(com.zhiliaoapp.musically.R.string.hy4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x00fd, code lost:
    
        if (r11 != null) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0100, code lost:
    
        r9 = X.HG3.LJIIIIZZ();
        r8 = new X.C78450Uqc();
        r8.LIZ = r5;
        r8.LIZIZ = X.C56509MFt.LIZLLL(getPanelContext());
        r8.LIZJ = "click_double_like";
        r10 = new X.C40883G2t();
        r10.LIZLLL("login_title", r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0121, code lost:
    
        if (r4 == null) goto L114;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0123, code lost:
    
        r5 = r4.getAid();
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0127, code lost:
    
        r10.LIZLLL("group_id", r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x012c, code lost:
    
        if (r4 == null) goto L113;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x012e, code lost:
    
        r0 = r4.getAid();
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0132, code lost:
    
        r10.LIZLLL("log_pb", X.C227768wm.LJIIIZ(r0));
        r8.LIZLLL = (android.os.Bundle) r10.LIZ;
        r9.showLoginView(new X.C78451Uqd(r8));
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x01cf, code lost:
    
        r0 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x01d2, code lost:
    
        r5 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x00ff, code lost:
    
        r11 = "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0149, code lost:
    
        r5 = new X.C200417tl();
        r5.LIZLLL = X.C56509MFt.LIZLLL(getPanelContext());
        r5.LJJLIIIJJIZ = X.C56509MFt.LJFF(getPanelContext());
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0162, code lost:
    
        if (r4 == null) goto L83;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0164, code lost:
    
        r0 = r4.getAid();
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0168, code lost:
    
        if (r0 != null) goto L112;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x01cd, code lost:
    
        r6 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x016a, code lost:
    
        r5.LJJL = r6;
        r5.LJJIIZ(r4);
        r5.LJJLIIIJ = "click_double_like";
        r5.LJJLIIIJILLIZJL = !X.C2043180d.LIZIZ() ? 1 : 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0179, code lost:
    
        if (r7 == 0) goto L111;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x017b, code lost:
    
        r0 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x017c, code lost:
    
        r5.LJJLIIIJJI = r0;
        r5.LJIILIIL();
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x0185, code lost:
    
        if (X.C2043180d.LIZIZ() != false) goto L89;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x0187, code lost:
    
        X.C2043180d.LIZJ();
     */
    @Override // com.ss.android.ugc.feed.platform.panel.digg.IDiggComponentAbility
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void handleDoubleClick(android.view.MotionEvent r14) {
        /*
            Method dump skipped, instructions count: 842
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.feed.platform.panel.digg.DiggPanelComponent.handleDoubleClick(android.view.MotionEvent):void");
    }

    @QD3
    public final void onDiggStartEvent(C50420Jqa c50420Jqa) {
        C1DH.LJJIJIIJI(new ARunnableS22S0200000_3(this, c50420Jqa, 27));
    }

    @QD3
    public final void onVideoEvent(C50420Jqa c50420Jqa) {
        String str;
        IViewPagerComponentAbility viewPagerComponentAbility;
        List<C2MA> allViewHolders;
        Aweme i6;
        boolean z;
        if (!KR8.LJIIIZ(this) && c50420Jqa != null && c50420Jqa.LJLIL == 13) {
            Object obj = c50420Jqa.LJLILLLLZI;
            if ((obj instanceof String) && (str = (String) obj) != null && (viewPagerComponentAbility = getViewPagerComponentAbility()) != null && (allViewHolders = viewPagerComponentAbility.getAllViewHolders()) != null) {
                for (C2MA c2ma : allViewHolders) {
                    if (!BaseListFragmentPanel.isLiveViewHolder(c2ma) && c2ma.getAweme() != null && C38354F3m.LIZJ(c2ma.getAweme().getAid(), str) && (i6 = AwemeService.LIZ().i6(str)) != null) {
                        if (i6.getUserDigg() != 0) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (i6.isAd() && i6.getActivityPendant() == null) {
                            C56509MFt.LIZLLL(getPanelContext());
                            Aweme m114clone = i6.m114clone();
                            o.LJIIIIZZ(m114clone, "aweme.clone()");
                            m114clone.setAd(false);
                            AwemeService.LIZ().R1(m114clone);
                        }
                        C2U8.LIZ(new C183887Jo(z, i6.getAid()));
                        String aid = i6.getAid();
                        o.LJIIIIZZ(aid, "aweme.aid");
                        C2U8.LIZ(new AnonymousClass799(aid, i6.getStatistics().getDiggCount(), i6.getUserDigg(), C79N.LIST));
                        if (c2ma.j3() != null) {
                            c2ma.j3().f2(z);
                        }
                        if (C56509MFt.LJIIJ(getPanelContext())) {
                            C2MY.LIZ().LJFF(5);
                        }
                    }
                }
            }
        }
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        C5WY c5wy;
        C110624Vu wo;
        o.LJIIIZ(view, "view");
        super.onViewCreated(view);
        if (view instanceof C5WY) {
            c5wy = (C5WY) view;
        } else {
            c5wy = null;
        }
        this.LJLJLJ = c5wy;
        this.LJLJLLL = o.LJ(C56509MFt.LJ(getPanelContext()), "from_publish_add_video");
        IRootAbility iRootAbility = (IRootAbility) this.LJLJJI.getValue();
        if (iRootAbility != null && (wo = iRootAbility.wo()) != null) {
            LSL lsl = new LSL(this);
            if (!wo.LIZLLL().contains(lsl)) {
                wo.LIZLLL().add(lsl);
            }
        }
        ILoadMoreAbility iLoadMoreAbility = (ILoadMoreAbility) this.LJLJJLL.getValue();
        if (iLoadMoreAbility != null) {
            iLoadMoreAbility.Ci0(new KR0(this));
        }
        IRootAbility iRootAbility2 = (IRootAbility) this.LJLJJI.getValue();
        if (iRootAbility2 != null) {
            iRootAbility2.to0(new AqS174S0100000_8(this, 145));
        }
        IViewPagerComponentAbility viewPagerComponentAbility = getViewPagerComponentAbility();
        if (viewPagerComponentAbility != null) {
            viewPagerComponentAbility.De0(new C51705KQz(this));
        }
        EventBus.LIZJ().LJIILJJIL(this);
    }

    @Override // X.KR6
    public final void LJJJJI(View view, Bundle bundle) {
        KeyEvent.Callback callback;
        C5WY c5wy = null;
        if (view != null) {
            callback = view.findViewById(R.id.c_v);
        } else {
            callback = null;
        }
        if (callback instanceof C5WY) {
            c5wy = (C5WY) callback;
        }
        this.LJLJLJ = c5wy;
    }

    @Override // X.KR6
    public final void j(Activity activity, Fragment fragment) {
        C2MH.LIZ(activity, fragment);
    }
}

package com.ss.android.ugc.feed.platform.panel.clearmode;

import X.ActivityC45651qj;
import X.C16880lQ;
import X.C212428Vi;
import X.C221108m2;
import X.C221138m5;
import X.C245249js;
import X.C252399vP;
import X.C26045AKb;
import X.C2K0;
import X.C2MA;
import X.C2MJ;
import X.C2MX;
import X.C2U8;
import X.C51781KTx;
import X.C54838Lfe;
import X.C56509MFt;
import X.C5H3;
import X.C62822Ol8;
import X.C8MM;
import X.C8RO;
import X.C92E;
import X.C9XV;
import X.EnumC221088m0;
import X.IDP;
import X.InterfaceC46330IGg;
import X.InterfaceC55102Lju;
import X.JAK;
import X.KU4;
import X.QD3;
import X.X1D;
import X.Z9N;
import Y.ACallableS0S2121101_3;
import Y.ARunnableS20S0200000_1;
import android.hardware.display.DisplayManager;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.MessageQueue;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import com.ss.android.ugc.aweme.feed.assem.ability.IFeedPanelPlatformAbility;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.panel.BaseListFragmentPanel;
import com.ss.android.ugc.feed.platform.panel.BasePanelComponent;
import com.ss.android.ugc.feed.platform.panel.IRootAbility;
import com.ss.android.ugc.feed.platform.panel.clearmode.ClearModePanelComponent;
import com.ss.android.ugc.feed.platform.panel.player.IPlayerComponentAbility;
import com.ss.android.ugc.feed.platform.panel.system.SystemComponentAbility;
import com.ss.android.ugc.feed.platform.panel.viewpager.IViewPagerComponentAbility;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS154S0100000_4;
import kotlin.jvm.internal.AqS170S0100000_4;
import kotlin.jvm.internal.AqS61S0110000_4;
import kotlin.jvm.internal.o;
import org.greenrobot.eventbus.EventBus;

/* loaded from: classes5.dex */
public final class ClearModePanelComponent extends BasePanelComponent implements IClearModePanelComponent, DisplayManager.DisplayListener, InterfaceC55102Lju {
    public final C8RO LJLIL = new C8RO("ClearModePanelComponent");
    public final C5H3 LJLILLLLZI;
    public final C5H3 LJLJI;
    public final C5H3 LJLJJI;
    public final C62822Ol8 LJLJJL;
    public final C5H3 LJLJJLL;
    public final C62822Ol8 LJLJL;
    public final C62822Ol8 LJLJLJ;
    public boolean LJLJLLL;
    public boolean LJLL;
    public long LJLLI;
    public int LJLLILLLL;

    @Override // X.InterfaceC55102Lju
    public final C2K0 provideAbility(String str) {
        if (str.hashCode() != 476418352) {
            return null;
        }
        return this;
    }

    public final IFeedPanelPlatformAbility A3() {
        return (IFeedPanelPlatformAbility) this.LJLILLLLZI.getValue();
    }

    public final IViewPagerComponentAbility C3() {
        return (IViewPagerComponentAbility) this.LJLJL.getValue();
    }

    public final IPlayerComponentAbility getPlayerComponentAbility() {
        return (IPlayerComponentAbility) this.LJLJJL.getValue();
    }

    @Override // com.ss.android.ugc.feed.platform.panel.BasePanelComponent, X.C8W0
    public final void onDestroy() {
        C2MA c2ma;
        float f;
        super.onDestroy();
        EventBus.LIZJ().LJIJ(this);
        IViewPagerComponentAbility C3 = C3();
        C2MA c2ma2 = null;
        if (C3 != null) {
            c2ma = C3.getCurViewHolder();
        } else {
            c2ma = null;
        }
        if (c2ma != null) {
            String LIZLLL = C56509MFt.LIZLLL(getPanelContext());
            Aweme aweme = c2ma.getAweme();
            long j = this.LJLLI;
            int i = this.LJLLILLLL;
            if (C2MX.LIZ().LIZ(LIZLLL)) {
                long LIZLLL2 = C252399vP.LIZLLL(aweme);
                float LIZ = C252399vP.LIZ(j, LIZLLL2);
                if (i > C252399vP.LJIIJ) {
                    f = 1 - C252399vP.LJIIIZ;
                } else {
                    f = LIZ - C252399vP.LJIIIZ;
                }
                if (f < 0.0f) {
                    f = Math.abs(1 - C252399vP.LIZLLL);
                }
                C252399vP.LJ(LIZ, i, LIZLLL2, aweme, LIZLLL, "other", true, true);
                float LIZIZ = C252399vP.LIZIZ(f);
                int i2 = i - C252399vP.LJIIJ;
                long j2 = C252399vP.LJIIL;
                if (j2 <= 0) {
                    j2 = System.currentTimeMillis();
                }
                C252399vP.LJFF(LIZIZ, i2, LIZLLL2, C252399vP.LIZJ(j2, C252399vP.LJIIJJI), aweme, LIZLLL, "other", true, true);
                C252399vP.LJIIIZ = 0.0f;
                C252399vP.LJIIJ = 0;
                C252399vP.LJIIJJI = 0L;
                C252399vP.LJIIL = 0L;
            }
        }
        SystemComponentAbility systemComponentAbility = (SystemComponentAbility) this.LJLJJLL.getValue();
        if (systemComponentAbility != null) {
            systemComponentAbility.unregisterDisplayListener(this);
        }
        this.LJLLI = 0L;
        this.LJLLILLLL = 0;
        IViewPagerComponentAbility C32 = C3();
        if (C32 != null) {
            c2ma2 = C32.getCurViewHolder();
        }
        F3(c2ma2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ClearModePanelComponent() {
        C62822Ol8 c62822Ol8;
        C62822Ol8 c62822Ol82;
        C62822Ol8 c62822Ol83;
        C62822Ol8 c62822Ol84;
        if (JAK.LIZ()) {
            C221138m5 c221138m5 = new C221138m5(EnumC221088m0.PUBLICATION, new AqS154S0100000_4((KU4) this, 909), null);
            C51781KTx.LIZJ(this, c221138m5);
            c62822Ol8 = c221138m5;
        } else {
            c62822Ol8 = C221108m2.LIZIZ(new AqS61S0110000_4(false, (KU4) this, 6));
        }
        this.LJLILLLLZI = c62822Ol8;
        if (JAK.LIZ()) {
            C221138m5 c221138m52 = new C221138m5(EnumC221088m0.PUBLICATION, new AqS154S0100000_4((KU4) this, 910), null);
            C51781KTx.LIZJ(this, c221138m52);
            c62822Ol82 = c221138m52;
        } else {
            c62822Ol82 = C221108m2.LIZIZ(new AqS61S0110000_4(false, (KU4) this, 7));
        }
        this.LJLJI = c62822Ol82;
        if (JAK.LIZ()) {
            C221138m5 c221138m53 = new C221138m5(EnumC221088m0.PUBLICATION, new AqS154S0100000_4((KU4) this, 911), null);
            C51781KTx.LIZJ(this, c221138m53);
            c62822Ol83 = c221138m53;
        } else {
            c62822Ol83 = C221108m2.LIZIZ(new AqS61S0110000_4(false, (KU4) this, 8));
        }
        this.LJLJJI = c62822Ol83;
        this.LJLJJL = C221108m2.LIZIZ(new AqS154S0100000_4(this, 908));
        if (JAK.LIZ()) {
            C221138m5 c221138m54 = new C221138m5(EnumC221088m0.PUBLICATION, new AqS154S0100000_4((KU4) this, 912), null);
            C51781KTx.LIZJ(this, c221138m54);
            c62822Ol84 = c221138m54;
        } else {
            c62822Ol84 = C221108m2.LIZIZ(new AqS61S0110000_4(false, (KU4) this, 9));
        }
        this.LJLJJLL = c62822Ol84;
        this.LJLJL = C221108m2.LIZIZ(new AqS154S0100000_4(this, 913));
        this.LJLJLJ = C221108m2.LIZIZ(new AqS154S0100000_4(this, 907));
    }

    public final void E3() {
        long j;
        InterfaceC46330IGg playerManager;
        IPlayerComponentAbility playerComponentAbility = getPlayerComponentAbility();
        if (playerComponentAbility != null && (playerManager = playerComponentAbility.getPlayerManager()) != null) {
            j = playerManager.getCurrentPosition();
        } else {
            j = 0;
        }
        this.LJLLI = j;
        IPlayerComponentAbility playerComponentAbility2 = getPlayerComponentAbility();
        if (playerComponentAbility2 != null) {
            this.LJLLILLLL = playerComponentAbility2.d0();
            C252399vP.LJIIL = System.currentTimeMillis();
        }
    }

    @Override // com.ss.android.ugc.feed.platform.panel.clearmode.IClearModePanelComponent
    public final void kW() {
        C2MA c2ma;
        IViewPagerComponentAbility C3 = C3();
        if (C3 != null) {
            c2ma = C3.getCurViewHolder();
        } else {
            c2ma = null;
        }
        F3(c2ma);
    }

    @Override // com.ss.android.ugc.feed.platform.panel.BasePanelComponent, X.C8W0
    public final void onCreate() {
        super.onCreate();
        EventBus.LIZJ().LJIILJJIL(this);
    }

    @Override // X.C8W0
    public final void onParentViewCreated() {
        super.onParentViewCreated();
        IViewPagerComponentAbility C3 = C3();
        if (C3 != null) {
            C3.De0(new C2MJ() { // from class: X.9vO
                @Override // X.C2MJ
                public final void J8(int i) {
                }

                @Override // X.C2MJ
                public final void e(int i, boolean z) {
                }

                @Override // X.C2MJ, X.C0C3
                public final void onPageScrolled(int i, float f, int i2) {
                }

                @Override // X.C2MJ
                public final void Ye(C2MA selectedHolder) {
                    boolean z;
                    long j;
                    int i;
                    float f;
                    String str;
                    o.LJIIIZ(selectedHolder, "selectedHolder");
                    ClearModePanelComponent clearModePanelComponent = ClearModePanelComponent.this;
                    IFeedPanelPlatformAbility A3 = clearModePanelComponent.A3();
                    if (A3 != null) {
                        z = A3.isPageChangeDown();
                    } else {
                        z = false;
                    }
                    String LIZLLL = C56509MFt.LIZLLL(clearModePanelComponent.getPanelContext());
                    Aweme aweme = selectedHolder.getAweme();
                    IPlayerComponentAbility playerComponentAbility = clearModePanelComponent.getPlayerComponentAbility();
                    if (playerComponentAbility != null) {
                        j = playerComponentAbility.getCurrentPosition();
                    } else {
                        j = 0;
                    }
                    IPlayerComponentAbility playerComponentAbility2 = clearModePanelComponent.getPlayerComponentAbility();
                    if (playerComponentAbility2 != null) {
                        i = playerComponentAbility2.d0();
                    } else {
                        i = 0;
                    }
                    if (C2MX.LIZ().LIZ(LIZLLL)) {
                        long LIZLLL2 = C252399vP.LIZLLL(aweme);
                        float LIZ = C252399vP.LIZ(j, LIZLLL2);
                        if (i > C252399vP.LJIIJ) {
                            f = 1 - C252399vP.LJIIIZ;
                        } else {
                            f = LIZ - C252399vP.LJIIIZ;
                        }
                        if (f < 0.0f) {
                            f = Math.abs(1 - C252399vP.LIZLLL);
                        }
                        if (z) {
                            str = "swipe_up";
                        } else {
                            str = "swipe_down";
                        }
                        C252399vP.LJ(LIZ, i, LIZLLL2, aweme, LIZLLL, str, true, true);
                        float LIZIZ = C252399vP.LIZIZ(f);
                        int i2 = i - C252399vP.LJIIJ;
                        long j2 = C252399vP.LJIIL;
                        if (j2 <= 0) {
                            j2 = System.currentTimeMillis();
                        }
                        C252399vP.LJFF(LIZIZ, i2, LIZLLL2, C252399vP.LIZJ(j2, C252399vP.LJIIJJI), aweme, LIZLLL, str, true, true);
                        C252399vP.LJIIIZ = 0.0f;
                        C252399vP.LJIIJ = 0;
                        C252399vP.LJIIJJI = 0L;
                        C252399vP.LJIIL = 0L;
                    }
                    clearModePanelComponent.F3(selectedHolder);
                }

                @Override // X.C2MJ, X.C0C3
                public final void onPageScrollStateChanged(int i) {
                    C2MA c2ma;
                    Handler handler;
                    boolean z;
                    long j;
                    int i2;
                    String str;
                    Aweme aweme;
                    boolean z2;
                    IViewPagerComponentAbility C32 = ClearModePanelComponent.this.C3();
                    if (C32 != null) {
                        c2ma = C32.getCurViewHolder();
                    } else {
                        c2ma = null;
                    }
                    ClearModePanelComponent clearModePanelComponent = ClearModePanelComponent.this;
                    clearModePanelComponent.getClass();
                    if (c2ma == null) {
                        return;
                    }
                    if (!BaseListFragmentPanel.isLiveViewHolder(c2ma) && ((aweme = c2ma.getAweme()) == null || !C63081OpJ.LLIZLLLIL(aweme) || c2ma.j3() == null || !c2ma.j3().G2())) {
                        IViewPagerComponentAbility C33 = clearModePanelComponent.C3();
                        if (C33 != null) {
                            z2 = C33.isScrollDragging();
                        } else {
                            z2 = false;
                        }
                        Handler handler2 = (Handler) clearModePanelComponent.LJLJLJ.getValue();
                        if (handler2 != null) {
                            if (((Boolean) DVX.LJII.getValue()).booleanValue()) {
                                if (i == 1) {
                                    if (!clearModePanelComponent.LJLL) {
                                        c2ma.G7(false);
                                        clearModePanelComponent.LJLL = true;
                                    }
                                } else if (i == 0 && clearModePanelComponent.LJLL) {
                                    c2ma.G7(true);
                                    clearModePanelComponent.LJLL = false;
                                }
                            } else if (z2) {
                                Message obtain = Message.obtain(handler2, new ARunnableS20S0200000_1(handler2, c2ma, 67));
                                obtain.what = 1001;
                                handler2.sendMessageDelayed(obtain, 120L);
                            } else {
                                if (handler2.hasMessages(1001)) {
                                    handler2.removeMessages(1001);
                                }
                                Handler handler3 = (Handler) clearModePanelComponent.LJLJLJ.getValue();
                                if (handler3 != null && c2ma.O8()) {
                                    if (2 == i) {
                                        Message obtain2 = Message.obtain(handler3, new ARunnableS20S0200000_1(handler3, c2ma, 66));
                                        obtain2.what = 1002;
                                        handler3.sendMessageDelayed(obtain2, 20L);
                                    } else {
                                        clearModePanelComponent.x3(c2ma);
                                    }
                                }
                            }
                        }
                    }
                    IFeedPanelPlatformAbility A3 = clearModePanelComponent.A3();
                    if (A3 == null || (handler = (Handler) clearModePanelComponent.LJLJLJ.getValue()) == null || A3.getPlayerController() == null) {
                        return;
                    }
                    IViewPagerComponentAbility C34 = clearModePanelComponent.C3();
                    if (C34 != null) {
                        z = C34.isScrollDragging();
                    } else {
                        z = false;
                    }
                    String LIZLLL = C56509MFt.LIZLLL(clearModePanelComponent.getPanelContext());
                    Aweme awemeByIndex = A3.getAwemeByIndex(A3.getCurrentIndex());
                    IDP playerController = A3.getPlayerController();
                    if (playerController != null) {
                        j = playerController.LJJIJIL();
                    } else {
                        j = 0;
                    }
                    IDP playerController2 = A3.getPlayerController();
                    if (playerController2 != null) {
                        i2 = playerController2.LLILLJJLI;
                    } else {
                        i2 = 0;
                    }
                    int currentIndex = A3.getCurrentIndex();
                    Aweme aweme2 = C252399vP.LIZ;
                    if (aweme2 == null) {
                        aweme2 = awemeByIndex;
                    }
                    long LIZLLL2 = C252399vP.LIZLLL(aweme2);
                    if (z) {
                        C252399vP.LIZLLL = C252399vP.LIZ(j, C252399vP.LIZLLL(awemeByIndex));
                        C252399vP.LJ = i2;
                        C252399vP.LJFF = System.currentTimeMillis();
                        C252399vP.LIZIZ = currentIndex;
                        C252399vP.LIZ = awemeByIndex;
                        Message obtain3 = Message.obtain(handler, new Runnable() { // from class: X.9vS
                            @Override // java.lang.Runnable
                            public final void run() {
                                boolean LIZ;
                                try {
                                    C252399vP.LIZJ = true;
                                } finally {
                                    if (LIZ) {
                                    }
                                }
                            }
                        });
                        obtain3.what = 101;
                        handler.sendMessageDelayed(obtain3, 1000L);
                        return;
                    }
                    if (handler.hasMessages(101)) {
                        handler.removeMessages(101);
                    }
                    if (i != 0) {
                        if (i != 2) {
                            return;
                        }
                        C252399vP.LJI = C252399vP.LIZ(j, LIZLLL2);
                        C252399vP.LJII = i2;
                        C252399vP.LJIIIIZZ = System.currentTimeMillis();
                        return;
                    }
                    if (C252399vP.LJIIIIZZ <= 0) {
                        C252399vP.LJI = C252399vP.LIZ(j, LIZLLL2);
                        C252399vP.LJII = i2;
                        C252399vP.LJIIIIZZ = System.currentTimeMillis();
                    }
                    int i3 = C252399vP.LIZIZ - currentIndex;
                    if (i3 > 0) {
                        str = "swipe_down";
                    } else if (i3 < 0) {
                        str = "swipe_up";
                    } else {
                        str = "slide_cancel";
                    }
                    boolean z3 = C252399vP.LIZJ;
                    final C252419vR c252419vR = new C252419vR(z3, C252399vP.LIZ, LIZLLL, LIZLLL2, str, C252399vP.LIZLLL, C252399vP.LJ, C252399vP.LJFF, C252399vP.LJI, C252399vP.LJII, C252399vP.LJIIIIZZ);
                    if (z3) {
                        C16880lQ.LJLI(Looper.myQueue(), new MessageQueue.IdleHandler() { // from class: X.9vQ
                            @Override // android.os.MessageQueue.IdleHandler
                            public final boolean queueIdle() {
                                float f;
                                long abs;
                                C252419vR c252419vR2 = C252419vR.this;
                                String str2 = c252419vR2.LIZJ;
                                C10K.LIZIZ(new ACallableS0S2121101_3(c252419vR2.LJI, c252419vR2.LJII, c252419vR2.LIZLLL, c252419vR2.LIZIZ, "", str2, false, c252419vR2.LJFF, 0), FMX.LIZIZ(), null);
                                C252419vR c252419vR3 = C252419vR.this;
                                String str3 = c252419vR3.LIZJ;
                                String str4 = c252419vR3.LJ;
                                C252399vP.LJ(c252419vR3.LJIIIZ, c252419vR3.LJIIJ, c252419vR3.LIZLLL, c252419vR3.LIZIZ, str3, str4, false, c252419vR3.LJFF);
                                C252419vR c252419vR4 = C252419vR.this;
                                int i4 = c252419vR4.LJIIJ - c252419vR4.LJII;
                                if (i4 > 0) {
                                    f = 1;
                                } else {
                                    f = c252419vR4.LJIIIZ;
                                }
                                float f2 = c252419vR4.LJI;
                                float f3 = f - f2;
                                if (f3 < 0.0f) {
                                    f3 = Math.abs(1 - f2);
                                }
                                C252419vR c252419vR5 = C252419vR.this;
                                long j2 = c252419vR5.LJIIJJI - c252419vR5.LJIIIIZZ;
                                String str5 = c252419vR5.LIZJ;
                                String str6 = c252419vR5.LJ;
                                Aweme aweme3 = c252419vR5.LIZIZ;
                                long j3 = c252419vR5.LIZLLL;
                                float LIZIZ = C252399vP.LIZIZ(f3);
                                int abs2 = Math.abs(i4);
                                if (Math.abs(j2) > 86400000) {
                                    abs = 1000;
                                } else {
                                    abs = Math.abs(j2);
                                }
                                C252399vP.LJFF(LIZIZ, abs2, j3, abs, aweme3, str5, str6, false, C252419vR.this.LJFF);
                                return false;
                            }
                        });
                    }
                    C252399vP.LIZIZ = 0;
                    C252399vP.LIZ = null;
                    C252399vP.LIZLLL = 0.0f;
                    C252399vP.LJ = 0;
                    C252399vP.LJFF = 0L;
                    C252399vP.LJI = 0.0f;
                    C252399vP.LJII = 0;
                    C252399vP.LJIIIIZZ = 0L;
                    C252399vP.LIZJ = false;
                }

                @Override // X.C2MJ, X.C0C3
                public final void onPageSelected(int i) {
                    C2MA c2ma;
                    boolean z;
                    IViewPagerComponentAbility C32 = ClearModePanelComponent.this.C3();
                    if (C32 != null) {
                        IFeedPanelPlatformAbility A3 = ClearModePanelComponent.this.A3();
                        if (A3 != null) {
                            z = A3.isPageChangeDown();
                        } else {
                            z = false;
                        }
                        c2ma = C32.getLastFeedViewHolder(z);
                    } else {
                        c2ma = null;
                    }
                    ClearModePanelComponent.this.x3(c2ma);
                    ClearModePanelComponent clearModePanelComponent = ClearModePanelComponent.this;
                    clearModePanelComponent.LJLLI = 0L;
                    clearModePanelComponent.LJLLILLLL = 0;
                }
            });
        }
    }

    @Override // X.C8W0
    public final void onPause() {
        super.onPause();
        if (!C56509MFt.LJII(getPanelContext())) {
            E3();
        }
    }

    public final void v3() {
        ActivityC45651qj LIZ = getPanelContext().LIZ();
        if (LIZ == null) {
            return;
        }
        C26045AKb c26045AKb = new C26045AKb(LIZ);
        c26045AKb.LJIIIIZZ(R.string.dfl);
        c26045AKb.LIZLLL(2000L);
        c26045AKb.LJIIJ();
    }

    public final void F3(C2MA c2ma) {
        if (c2ma != null) {
            if (C54838Lfe.LJIIZILJ(c2ma.getAweme()) && !C54838Lfe.LJJ(c2ma.getAweme())) {
                return;
            }
            if (C2MX.LIZ().LIZ(C56509MFt.LIZLLL(getPanelContext()))) {
                c2ma.s8(false, false);
            }
            c2ma.J7(false, false);
        }
    }

    @Override // com.ss.android.ugc.feed.platform.panel.BasePanelComponent, X.KUK
    public final void eventInit(C8MM c8mm) {
        o.LJIIIZ(c8mm, "<this>");
        c8mm.LIZ("event_on_render_ready", C92E.LJLIL);
        c8mm.LIZ("event_on_play_progress_change", new AqS170S0100000_4(this, 807));
    }

    @QD3
    public final void onClearModeEvent(C245249js c245249js) {
        IViewPagerComponentAbility C3;
        C2MA curViewHolder;
        boolean z;
        InterfaceC46330IGg interfaceC46330IGg;
        InterfaceC46330IGg interfaceC46330IGg2;
        InterfaceC46330IGg interfaceC46330IGg3;
        InterfaceC46330IGg interfaceC46330IGg4;
        IRootAbility iRootAbility;
        if (c245249js == null) {
            return;
        }
        if (c245249js.LJLIL && C2MX.LIZ().LIZIZ) {
            v3();
            return;
        }
        if ((!c245249js.LJLIL && !C2MX.LIZ().LIZ(C56509MFt.LIZLLL(getPanelContext()))) || (C3 = C3()) == null || (curViewHolder = C3.getCurViewHolder()) == null) {
            return;
        }
        if (C16880lQ.LLJJIJIL(getLifecycle().getCurrentState(), Lifecycle.State.RESUMED) >= 0 && (iRootAbility = (IRootAbility) this.LJLJI.getValue()) != null && iRootAbility.getUserVisibleHint()) {
            z = true;
        } else {
            z = false;
        }
        String str = c245249js.LJLJI;
        IDP idp = null;
        if (C9XV.LONG_PRESS.getType() == c245249js.LJLILLLLZI && z) {
            boolean z2 = c245249js.LJLIL;
            String LIZLLL = C56509MFt.LIZLLL(getPanelContext());
            Aweme aweme = curViewHolder.getAweme();
            IPlayerComponentAbility playerComponentAbility = getPlayerComponentAbility();
            if (playerComponentAbility != null) {
                interfaceC46330IGg4 = playerComponentAbility.getPlayerManager();
            } else {
                interfaceC46330IGg4 = null;
            }
            IFeedPanelPlatformAbility A3 = A3();
            if (A3 != null) {
                idp = A3.getPlayerController();
            }
            C252399vP.LJII(z2, LIZLLL, str, aweme, "long_press", interfaceC46330IGg4, idp);
            curViewHolder.s8(c245249js.LJLIL, false);
            Fragment LIZLLL2 = C212428Vi.LIZLLL(this);
            if (LIZLLL2 == null) {
                return;
            }
            Z9N.LIZIZ.LIZ.LLJJLIIIJLLLLLLLZ(LIZLLL2, c245249js.LJLIL);
            return;
        }
        if (C9XV.SCREEN_RECORD.getType() == c245249js.LJLILLLLZI && z) {
            boolean z3 = c245249js.LJLIL;
            String LIZLLL3 = C56509MFt.LIZLLL(getPanelContext());
            Aweme aweme2 = curViewHolder.getAweme();
            IPlayerComponentAbility playerComponentAbility2 = getPlayerComponentAbility();
            if (playerComponentAbility2 != null) {
                interfaceC46330IGg3 = playerComponentAbility2.getPlayerManager();
            } else {
                interfaceC46330IGg3 = null;
            }
            IFeedPanelPlatformAbility A32 = A3();
            if (A32 != null) {
                idp = A32.getPlayerController();
            }
            C252399vP.LJII(z3, LIZLLL3, str, aweme2, "record_screen", interfaceC46330IGg3, idp);
            curViewHolder.s8(c245249js.LJLIL, false);
            return;
        }
        if (C9XV.CLICK_EXIT.getType() == c245249js.LJLILLLLZI && z) {
            boolean z4 = c245249js.LJLIL;
            String LIZLLL4 = C56509MFt.LIZLLL(getPanelContext());
            Aweme aweme3 = curViewHolder.getAweme();
            IPlayerComponentAbility playerComponentAbility3 = getPlayerComponentAbility();
            if (playerComponentAbility3 != null) {
                interfaceC46330IGg2 = playerComponentAbility3.getPlayerManager();
            } else {
                interfaceC46330IGg2 = null;
            }
            IFeedPanelPlatformAbility A33 = A3();
            if (A33 != null) {
                idp = A33.getPlayerController();
            }
            C252399vP.LJII(z4, LIZLLL4, str, aweme3, "click_icon", interfaceC46330IGg2, idp);
            curViewHolder.s8(c245249js.LJLIL, true);
            Fragment LIZLLL5 = C212428Vi.LIZLLL(this);
            if (LIZLLL5 == null) {
                return;
            }
            Z9N.LIZIZ.LIZ.LLJJLIIIJLLLLLLLZ(LIZLLL5, c245249js.LJLIL);
            return;
        }
        if (C9XV.SWITCH_PAGE.getType() == c245249js.LJLILLLLZI && !z) {
            C252399vP.LJI(c245249js.LJLIL, C56509MFt.LIZLLL(getPanelContext()), str, curViewHolder.getAweme(), "switch_page", this.LJLLI, this.LJLLILLLL);
            curViewHolder.s8(c245249js.LJLIL, false);
            return;
        }
        if (C9XV.PINCH_ZOOM.getType() != c245249js.LJLILLLLZI || !z) {
            return;
        }
        boolean z5 = c245249js.LJLIL;
        String LIZLLL6 = C56509MFt.LIZLLL(getPanelContext());
        Aweme aweme4 = curViewHolder.getAweme();
        IPlayerComponentAbility playerComponentAbility4 = getPlayerComponentAbility();
        if (playerComponentAbility4 != null) {
            interfaceC46330IGg = playerComponentAbility4.getPlayerManager();
        } else {
            interfaceC46330IGg = null;
        }
        IFeedPanelPlatformAbility A34 = A3();
        if (A34 != null) {
            idp = A34.getPlayerController();
        }
        C252399vP.LJII(z5, LIZLLL6, str, aweme4, "pinch", interfaceC46330IGg, idp);
        curViewHolder.s8(c245249js.LJLIL, false);
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayAdded(int i) {
        C2MX.LIZ().LIZIZ = true;
        if (C2MX.LIZ().LIZ(C56509MFt.LIZLLL(getPanelContext()))) {
            C2U8.LIZ(new C245249js(C9XV.SCREEN_RECORD.getType(), "", false));
            v3();
        }
        C8RO c8ro = this.LJLIL;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("[onDisplayAdded]");
        LIZ.append(i);
        c8ro.LJIIIIZZ(X1D.LIZIZ(LIZ));
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayChanged(int i) {
        C8RO c8ro = this.LJLIL;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("[onDisplayChanged]");
        LIZ.append(i);
        c8ro.LJIIIIZZ(X1D.LIZIZ(LIZ));
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayRemoved(int i) {
        C2MX.LIZ().LIZIZ = false;
        C8RO c8ro = this.LJLIL;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("[onDisplayRemoved]");
        LIZ.append(i);
        c8ro.LJIIIIZZ(X1D.LIZIZ(LIZ));
    }

    @Override // com.ss.android.ugc.feed.platform.panel.BasePanelComponent, X.KU4
    public final void onPagePause(int i) {
        super.onPagePause(i);
        if (!C56509MFt.LJII(getPanelContext())) {
            E3();
        }
    }

    public final void x3(C2MA c2ma) {
        Handler handler = (Handler) this.LJLJLJ.getValue();
        if (handler != null && handler.hasMessages(1002)) {
            handler.removeMessages(1002);
        }
        if (c2ma != null && c2ma.O8()) {
            c2ma.J7(false, true);
        }
    }
}

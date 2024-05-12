package com.ss.android.ugc.aweme.dsp.playerservice;

import X.ActivityC45651qj;
import X.AnonymousClass078;
import X.C221108m2;
import X.C2JO;
import X.C42625Go9;
import X.C47261Igj;
import X.C5H3;
import X.C91092Zp2;
import X.C91216Zr2;
import X.C91218Zr4;
import X.C91249ZrZ;
import X.C91251Zrb;
import X.C91287ZsB;
import X.C91299ZsN;
import X.C91411ZuB;
import X.C91470Zv8;
import X.C91471Zv9;
import X.C91498Zva;
import X.C91612ZxQ;
import X.C91613ZxR;
import X.FKM;
import X.InterfaceC63764P0u;
import X.InterfaceC91296ZsK;
import X.InterfaceC91459Zux;
import X.L41;
import X.QD3;
import X.X1D;
import X.YBK;
import android.app.Activity;
import androidx.fragment.app.FragmentManager;
import com.ss.android.ugc.aweme.dsp.playerservice.plugin.expired.ExpiredPlayableManager;
import com.ss.android.ugc.aweme.utils.ActivityStack;
import com.zhiliaoapp.musically.R;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.IDqS421S0100000_29;
import kotlin.jvm.internal.o;
import org.greenrobot.eventbus.ThreadMode;

/* loaded from: classes22.dex */
public final class NewDspPlayerService implements InterfaceC63764P0u {
    public final C5H3 activityLifecycleCallback$delegate;
    public int attachTime;
    public boolean isActivityVisible;
    public boolean isDspNodeVisible;
    public WeakReference<Activity> lastResumeRef;
    public String lastTab;
    public final C91612ZxQ mainPlayerController;
    public final C91470Zv8 mainPlayerInterceptor;
    public final C91613ZxR subPlayerController;
    public final C91471Zv9 subPlayerInterceptor;

    public final void onDspNodeCreatedEvent() {
        this.isDspNodeVisible = true;
    }

    private final C91092Zp2 getActivityLifecycleCallback() {
        return (C91092Zp2) this.activityLifecycleCallback$delegate.getValue();
    }

    private final boolean isMainPlayerLastActive() {
        return o.LJ(this.lastTab, "Daily Mix V2");
    }

    private final boolean isSubPlayerLastActive() {
        return o.LJ(this.lastTab, "LIBRARY V2");
    }

    public final void attach() {
        this.attachTime++;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onAttach ");
        LIZ.append(this.attachTime);
        LIZ.append(' ');
        LIZ.append(this);
        X1D.LIZIZ(LIZ);
        if (this.attachTime > 1) {
            return;
        }
        onAttach();
    }

    public final void detach() {
        this.attachTime--;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onDetach ");
        LIZ.append(this.attachTime);
        LIZ.append(' ');
        LIZ.append(this);
        X1D.LIZIZ(LIZ);
        if (this.attachTime > 0) {
            return;
        }
        onDetach();
    }

    @Override // X.InterfaceC63764P0u
    public void onAppBackground() {
        ActivityC45651qj activityC45651qj;
        ActivityC45651qj activityC45651qj2;
        if (!this.isActivityVisible || !this.isDspNodeVisible) {
            return;
        }
        L41.LIZ.getClass();
        if (L41.LIZ()) {
            this.mainPlayerController.LJJI(true);
            this.subPlayerController.LJJI(true);
            return;
        }
        InterfaceC91459Zux interfaceC91459Zux = null;
        if (isMainPlayerLastActive()) {
            if (this.mainPlayerController.LJIJI().isPlayingState()) {
                InterfaceC91296ZsK LIZ = this.mainPlayerController.LIZ();
                Activity validTopActivity = ActivityStack.getValidTopActivity();
                if (validTopActivity instanceof ActivityC45651qj) {
                    activityC45651qj2 = (ActivityC45651qj) validTopActivity;
                } else {
                    activityC45651qj2 = null;
                }
                if (LIZ != null && activityC45651qj2 != null) {
                    FragmentManager supportFragmentManager = activityC45651qj2.getSupportFragmentManager();
                    o.LJIIIIZZ(supportFragmentManager, "topActivity.supportFragmentManager");
                    C91218Zr4.LJI(activityC45651qj2, supportFragmentManager, LIZ, getPageName(LIZ));
                }
                this.mainPlayerController.LJIL(new C91299ZsN("PAUSE_FROM_ON_BACKGROUND"));
            }
            InterfaceC91459Zux interfaceC91459Zux2 = this.mainPlayerController.LJLILLLLZI.LJLJJI.LJLILLLLZI.get(C91498Zva.class);
            if (interfaceC91459Zux2 instanceof C91498Zva) {
                interfaceC91459Zux = interfaceC91459Zux2;
            }
            C91498Zva c91498Zva = (C91498Zva) interfaceC91459Zux;
            if (c91498Zva == null) {
                return;
            }
            c91498Zva.LJII(new C91299ZsN("PAUSE_FROM_ON_BACKGROUND"), false);
            return;
        }
        if (this.subPlayerController.LJIJI().isPlayingState()) {
            InterfaceC91296ZsK LIZ2 = this.subPlayerController.LIZ();
            Activity validTopActivity2 = ActivityStack.getValidTopActivity();
            if (validTopActivity2 instanceof ActivityC45651qj) {
                activityC45651qj = (ActivityC45651qj) validTopActivity2;
            } else {
                activityC45651qj = null;
            }
            if (LIZ2 != null && activityC45651qj != null) {
                FragmentManager supportFragmentManager2 = activityC45651qj.getSupportFragmentManager();
                o.LJIIIIZZ(supportFragmentManager2, "topActivity.supportFragmentManager");
                C91218Zr4.LJI(activityC45651qj, supportFragmentManager2, LIZ2, getPageName(LIZ2));
            }
            this.subPlayerController.LJIL(new C91299ZsN("PAUSE_FROM_ON_BACKGROUND"));
        }
        InterfaceC91459Zux interfaceC91459Zux3 = this.subPlayerController.LJLILLLLZI.LJLJJI.LJLILLLLZI.get(C91498Zva.class);
        if (interfaceC91459Zux3 instanceof C91498Zva) {
            interfaceC91459Zux = interfaceC91459Zux3;
        }
        C91498Zva c91498Zva2 = (C91498Zva) interfaceC91459Zux;
        if (c91498Zva2 == null) {
            return;
        }
        c91498Zva2.LJII(new C91299ZsN("PAUSE_FROM_ON_BACKGROUND"), false);
    }

    @Override // X.InterfaceC63764P0u
    public void onAppForeground() {
        ((AnonymousClass078) C91216Zr2.LIZ.getValue()).LIZJ(R.id.iy, null);
        if (!this.isActivityVisible || !this.isDspNodeVisible) {
            return;
        }
        L41.LIZ.getClass();
        if (L41.LIZ()) {
            this.mainPlayerController.LJJI(false);
            this.subPlayerController.LJJI(false);
        }
        play$default(this, new C91299ZsN("RESUME_FROM_ON_FOREGROUND"), false, 2, null);
    }

    public final void onAttach() {
        this.mainPlayerController.onAttach();
        this.subPlayerController.onAttach();
        ActivityStack.addAppBackGroundListener(this);
        FKM.LIZ().registerActivityLifecycleCallbacks(getActivityLifecycleCallback());
        C42625Go9.LIZIZ(this);
    }

    public final void onDetach() {
        this.mainPlayerController.onDetach();
        this.subPlayerController.onDetach();
        ActivityStack.removeAppBackGroundListener(this);
        FKM.LIZ().unregisterActivityLifecycleCallbacks(getActivityLifecycleCallback());
        C42625Go9.LIZJ(this);
    }

    public NewDspPlayerService() {
        YBK.LIZ.getClass();
        this.isDspNodeVisible = !YBK.LIZJ().fixCrosstalkBug;
        this.isActivityVisible = true;
        this.lastTab = "Daily Mix V2";
        C91470Zv8 c91470Zv8 = new C91470Zv8(this);
        this.mainPlayerInterceptor = c91470Zv8;
        C91471Zv9 c91471Zv9 = new C91471Zv9(this);
        this.subPlayerInterceptor = c91471Zv9;
        this.mainPlayerController = new C91612ZxQ(C47261Igj.LJJIJ(c91470Zv8));
        this.subPlayerController = new C91613ZxR(C47261Igj.LJJIJ(c91471Zv9));
        this.activityLifecycleCallback$delegate = C221108m2.LIZIZ(new IDqS421S0100000_29(this, 12));
    }

    public final boolean isMainCanPlay() {
        if (isMainPlayerLastActive() && this.isDspNodeVisible && this.isActivityVisible) {
            return true;
        }
        return false;
    }

    public final boolean isSubCanPlay() {
        if (isSubPlayerLastActive() && this.isDspNodeVisible && this.isActivityVisible) {
            return true;
        }
        return false;
    }

    public final C91612ZxQ getMainPlayerController() {
        return this.mainPlayerController;
    }

    public final C91613ZxR getSubPlayerController() {
        return this.subPlayerController;
    }

    private final String getPageName(InterfaceC91296ZsK interfaceC91296ZsK) {
        String str = interfaceC91296ZsK.getEventData().LIZLLL;
        if (str.length() == 0) {
            return "track_reco";
        }
        return str;
    }

    @QD3
    public final void onDspNodeVisibleChangeEvent(C91411ZuB event) {
        String str;
        o.LJIIIZ(event, "event");
        boolean z = event.LJLIL;
        if (!C91251Zrb.LIZIZ) {
            C91251Zrb.LIZIZ = true;
            if (z) {
                str = "on_node_show_event_received";
            } else {
                str = "on_node_hide_event_received";
            }
            C91249ZrZ.LJIIIZ("", "", str);
        }
        boolean z2 = event.LJLIL;
        this.isDspNodeVisible = z2;
        if (!this.isActivityVisible) {
            return;
        }
        if (z2) {
            play(new C91299ZsN("RESUME_FROM_CHANGE_TAB"), true);
        } else {
            pause(new C91299ZsN("PAUSE_FROM_CHANGE_TAB"));
        }
    }

    @QD3(sticky = true, threadMode = ThreadMode.MAIN)
    public final void onMusicDspTabChangeEvent(C2JO event) {
        o.LJIIIZ(event, "event");
        if (!o.LJ(event.LJLILLLLZI, this)) {
            return;
        }
        this.lastTab = event.LJLIL;
        play$default(this, new C91299ZsN("RESUME_FROM_DSP_TAB_CHANGE"), false, 2, null);
        if (ExpiredPlayableManager.INSTANCE.isTodayPlayableLimited()) {
            if (isMainPlayerLastActive()) {
                if (this.subPlayerController.LJIJI().startPlaying() || this.subPlayerController.LJIJJLI()) {
                    this.subPlayerController.LJIL(new C91299ZsN("PAUSE_FROM_MAIN_PLAYER"));
                    return;
                }
                return;
            }
            if (this.mainPlayerController.LJIJI().startPlaying() || this.mainPlayerController.LJIJJLI()) {
                this.mainPlayerController.LJIL(new C91299ZsN("PAUSE_FROM_SUB_PLAYER"));
            }
        }
    }

    public final void pause(C91299ZsN c91299ZsN) {
        InterfaceC91459Zux interfaceC91459Zux = null;
        if (isMainPlayerLastActive()) {
            InterfaceC91459Zux interfaceC91459Zux2 = this.mainPlayerController.LJLILLLLZI.LJLJJI.LJLILLLLZI.get(C91498Zva.class);
            if (interfaceC91459Zux2 instanceof C91498Zva) {
                interfaceC91459Zux = interfaceC91459Zux2;
            }
            C91498Zva c91498Zva = (C91498Zva) interfaceC91459Zux;
            if (c91498Zva != null) {
                c91498Zva.LJII(c91299ZsN, false);
            }
            if (this.mainPlayerController.LJIJI().startPlaying() || this.mainPlayerController.LJIJJLI()) {
                this.mainPlayerController.LJIL(c91299ZsN);
                return;
            }
            return;
        }
        InterfaceC91459Zux interfaceC91459Zux3 = this.subPlayerController.LJLILLLLZI.LJLJJI.LJLILLLLZI.get(C91498Zva.class);
        if (interfaceC91459Zux3 instanceof C91498Zva) {
            interfaceC91459Zux = interfaceC91459Zux3;
        }
        C91498Zva c91498Zva2 = (C91498Zva) interfaceC91459Zux;
        if (c91498Zva2 != null) {
            c91498Zva2.LJII(c91299ZsN, false);
        }
        if (this.subPlayerController.LJIJI().startPlaying() || this.subPlayerController.LJIJJLI()) {
            this.subPlayerController.LJIL(c91299ZsN);
        }
    }

    public final void play(C91299ZsN c91299ZsN, boolean z) {
        InterfaceC91459Zux interfaceC91459Zux = null;
        if (isMainPlayerLastActive()) {
            if (z) {
                InterfaceC91459Zux interfaceC91459Zux2 = this.mainPlayerController.LJLILLLLZI.LJLJJI.LJLILLLLZI.get(C91498Zva.class);
                if (interfaceC91459Zux2 instanceof C91498Zva) {
                    interfaceC91459Zux = interfaceC91459Zux2;
                }
                C91498Zva c91498Zva = (C91498Zva) interfaceC91459Zux;
                if (c91498Zva != null) {
                    c91498Zva.LJII(c91299ZsN, true);
                }
            }
            if (this.mainPlayerController.LJIJI().startPlaying() || this.mainPlayerController.LJIJJLI()) {
                return;
            }
            if (this.mainPlayerController.LJIJI().isPauseState()) {
                this.mainPlayerController.LJJ(c91299ZsN);
                return;
            } else {
                C91287ZsB.LIZ(this.mainPlayerController, c91299ZsN, 2);
                return;
            }
        }
        if (z) {
            InterfaceC91459Zux interfaceC91459Zux3 = this.subPlayerController.LJLILLLLZI.LJLJJI.LJLILLLLZI.get(C91498Zva.class);
            if (interfaceC91459Zux3 instanceof C91498Zva) {
                interfaceC91459Zux = interfaceC91459Zux3;
            }
            C91498Zva c91498Zva2 = (C91498Zva) interfaceC91459Zux;
            if (c91498Zva2 != null) {
                c91498Zva2.LJII(c91299ZsN, true);
            }
        }
        if (!this.subPlayerController.LJIJI().startPlaying() && !this.subPlayerController.LJIJJLI()) {
            if (this.subPlayerController.LJIJI().isPauseState()) {
                this.subPlayerController.LJJ(c91299ZsN);
            } else {
                C91287ZsB.LIZ(this.subPlayerController, c91299ZsN, 2);
            }
        }
    }

    public static /* synthetic */ void play$default(NewDspPlayerService newDspPlayerService, C91299ZsN c91299ZsN, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        newDspPlayerService.play(c91299ZsN, z);
    }
}

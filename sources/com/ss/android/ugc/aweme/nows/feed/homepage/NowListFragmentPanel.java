package com.ss.android.ugc.aweme.nows.feed.homepage;

import X.AbstractC193937jJ;
import X.C195877mR;
import X.C195887mS;
import X.C196267n4;
import X.C196437nL;
import X.C196447nM;
import X.C196457nN;
import X.C196487nQ;
import X.C197057oL;
import X.C221108m2;
import X.C46276IEe;
import X.C55096Ljo;
import X.C55230Lly;
import X.C62822Ol8;
import X.C7ML;
import X.C7XD;
import X.InterfaceC196737np;
import X.InterfaceC46811IYt;
import X.InterfaceC55062LjG;
import X.InterfaceC57784Mm4;
import X.QD3;
import X.SYL;
import X.X1D;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OnLifecycleEvent;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.nows.ability.NowListAbility;
import com.ss.android.ugc.aweme.nows.feed.common.INowListFragmentPanel;
import com.ss.android.ugc.aweme.nows.feed.viewmodel.NowPageViewModel;
import java.util.Set;
import kotlin.jvm.internal.AqS153S0100000_3;
import kotlin.jvm.internal.o;
import org.greenrobot.eventbus.EventBus;

/* loaded from: classes4.dex */
public final class NowListFragmentPanel implements GenericLifecycleObserver, INowListFragmentPanel {
    public static final C196437nL LJLJLJ = new C196437nL();
    public static final C62822Ol8 LJLJLLL = C221108m2.LIZIZ(C196447nM.LJLIL);
    public final Fragment LJLIL;
    public final InterfaceC55062LjG LJLILLLLZI;
    public final String LJLJI;
    public final C62822Ol8 LJLJJI;
    public final String LJLJJL;
    public final C62822Ol8 LJLJJLL;
    public boolean LJLJL;

    @Override // X.InterfaceC53907LDr
    public final String L6() {
        return "";
    }

    @Override // com.ss.android.ugc.aweme.nows.ability.NowListAbility
    public final RecyclerView.RecycledViewPool WE() {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.nows.ability.NowListAbility
    public final SYL i8() {
        return null;
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (event == Lifecycle.Event.ON_CREATE) {
            onCreate();
            return;
        }
        if (event == Lifecycle.Event.ON_RESUME) {
            onResume();
        } else if (event == Lifecycle.Event.ON_PAUSE) {
            onPause();
        } else if (event == Lifecycle.Event.ON_DESTROY) {
            onDestroy();
        }
    }

    @Override // com.ss.android.ugc.aweme.nows.ability.NowListAbility
    public final void yJ(RecyclerView.RecycledViewPool recycledViewPool) {
    }

    @Override // com.ss.android.ugc.aweme.nows.feed.common.INowListFragmentPanel
    public final InterfaceC196737np getPlayer() {
        return (InterfaceC196737np) this.LJLJJI.getValue();
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_PAUSE)
    public final void onPause() {
        if (this.LJLJJL == null) {
            NowPageViewModel sg = sg();
            if (sg != null) {
                sg.setState(C195887mS.LJLIL);
            }
            AbstractC193937jJ LIZ = C196437nL.LIZ(this.LJLJI);
            if (LIZ == null) {
                return;
            }
            ((Set) C196267n4.LIZ.getValue()).remove(LIZ);
        }
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
    public final void onResume() {
        if (this.LJLJJL == null) {
            NowPageViewModel sg = sg();
            if (sg != null) {
                sg.setState(C195877mR.LJLIL);
            }
            AbstractC193937jJ LIZ = C196437nL.LIZ(this.LJLJI);
            if (LIZ == null) {
                return;
            }
            ((Set) C196267n4.LIZ.getValue()).add(LIZ);
        }
    }

    @Override // com.ss.android.ugc.aweme.nows.feed.common.INowListFragmentPanel
    public final NowPageViewModel sg() {
        return (NowPageViewModel) this.LJLJJLL.getValue();
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_CREATE)
    public final void onCreate() {
        Fragment fragment = getFragment();
        if (fragment != null) {
            C55096Ljo.LJIIJJI(C55230Lly.LIZJ(fragment, null), this, NowListAbility.class, null);
        }
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public final void onDestroy() {
        Fragment fragment = getFragment();
        if (fragment != null) {
            C55096Ljo.LJIILL(C55230Lly.LIZJ(fragment, null), NowListAbility.class, null);
        }
        C196487nQ.LIZJ(this);
        C196457nN.LIZ = null;
        EventBus.LIZJ().LJIJ(this);
    }

    @Override // com.ss.android.ugc.aweme.nows.ability.NowListAbility
    public final boolean pt0() {
        return C196487nQ.LIZ(this);
    }

    @Override // com.ss.android.ugc.aweme.nows.feed.common.INowListFragmentPanel
    public final String Zn0() {
        return this.LJLJJL;
    }

    @Override // com.ss.android.ugc.aweme.nows.feed.common.INowListFragmentPanel
    public final Fragment getFragment() {
        return this.LJLIL;
    }

    @Override // X.InterfaceC53896LDg
    public final void LLLLILI(Bundle bundle) {
        NowPageViewModel sg = sg();
        if (sg != null) {
            sg.setState(C195887mS.LJLIL);
        }
        AbstractC193937jJ LIZ = C196437nL.LIZ(this.LJLJI);
        if (LIZ == null) {
            return;
        }
        ((Set) C196267n4.LIZ.getValue()).remove(LIZ);
    }

    @Override // X.InterfaceC53896LDg
    public final void LLLLLLZ(Bundle args) {
        o.LJIIIZ(args, "args");
        NowPageViewModel sg = sg();
        if (sg != null) {
            sg.setState(C195877mR.LJLIL);
        }
        AbstractC193937jJ LIZ = C196437nL.LIZ(this.LJLJI);
        if (LIZ == null) {
            return;
        }
        ((Set) C196267n4.LIZ.getValue()).add(LIZ);
    }

    @Override // com.ss.android.ugc.aweme.nows.ability.NowListAbility
    public final int jd0(InterfaceC57784Mm4 item) {
        InterfaceC55062LjG interfaceC55062LjG;
        C7ML c7ml;
        Aweme aweme;
        o.LJIIIZ(item, "item");
        String str = null;
        if ((item instanceof C7ML) && (c7ml = (C7ML) item) != null && (aweme = c7ml.getAweme()) != null) {
            str = aweme.getAid();
        }
        if (str == null || (interfaceC55062LjG = this.LJLILLLLZI) == null) {
            return -1;
        }
        return interfaceC55062LjG.LJI(str);
    }

    @QD3
    public final void onVideoPlayerEvent(C46276IEe status) {
        String str;
        InterfaceC46811IYt interfaceC46811IYt;
        o.LJIIIZ(status, "status");
        int i = status.LJLIL;
        if ((i != 0 && i != 10) || !C196487nQ.LIZ(this) || !this.LJLIL.getLifecycle().getCurrentState().isAtLeast(Lifecycle.State.RESUMED)) {
            return;
        }
        InterfaceC196737np player = getPlayer();
        o.LJIIIZ(player, "<this>");
        if (player.LJIIJ() == null && !getPlayer().getPlayState().isPlaying()) {
            return;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("try to stop, playing key: ");
        C197057oL LJIIJ = getPlayer().LJIIJ();
        if (LJIIJ != null && (interfaceC46811IYt = LJIIJ.LIZIZ) != null) {
            str = interfaceC46811IYt.getKey();
        } else {
            str = null;
        }
        LIZ.append(str);
        LIZ.append(", isPlaying: ");
        LIZ.append(getPlayer().getPlayState().isPlaying());
        LIZ.append(", tab selected: ");
        LIZ.append(C196487nQ.LIZ(this));
        LIZ.append(' ');
        C7XD.LIZ("NowListFragmentPanel", X1D.LIZIZ(LIZ));
        getPlayer().stop();
    }

    public NowListFragmentPanel(Fragment fragment, InterfaceC55062LjG interfaceC55062LjG, String str) {
        String str2;
        this.LJLIL = fragment;
        this.LJLILLLLZI = interfaceC55062LjG;
        this.LJLJI = str;
        EventBus.LIZJ().LJIILJJIL(this);
        this.LJLJJI = C221108m2.LIZIZ(new AqS153S0100000_3(this, 576));
        if (o.LJ(str, "homepage_hot")) {
            str2 = "For You";
        } else if (o.LJ(str, "homepage_friends")) {
            str2 = "FRIENDS_FEED";
        } else {
            str2 = null;
        }
        this.LJLJJL = str2;
        this.LJLJJLL = C221108m2.LIZIZ(new AqS153S0100000_3(this, 575));
    }
}

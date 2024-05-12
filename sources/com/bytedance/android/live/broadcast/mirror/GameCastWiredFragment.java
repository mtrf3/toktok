package com.bytedance.android.live.broadcast.mirror;

import X.ActivityC45651qj;
import X.C05380Ja;
import X.C05440Jg;
import X.C0JX;
import X.C10A;
import X.C10S;
import X.C141335gf;
import X.C15490jB;
import X.C16880lQ;
import X.C19U;
import X.C29306Beo;
import X.C29S;
import X.C3C5;
import X.C46991st;
import X.C47001su;
import X.C47061t0;
import X.C47121t6;
import X.C76800UCe;
import X.C90903hW;
import X.InterfaceC05420Je;
import X.InterfaceC32901Qw;
import X.V10;
import X.X1D;
import Y.ARunnableS41S0100000_5;
import Y.IDCListenerS135S0100000;
import Y.IDRunnableS4S1100000;
import Y.IDRunnableS85S0100000;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.android.live.broadcast.mirror.GameCastWiredFragment;
import com.bytedance.android.live.broadcast.mirror.widget.GameCastWiredWidget;
import com.bytedance.android.livesdk.ui.BaseFragment;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.IDqS19S0101000;
import kotlin.jvm.internal.IDqS420S0100000;
import kotlin.jvm.internal.o;

/* loaded from: classes.dex */
public final class GameCastWiredFragment extends BaseFragment implements InterfaceC32901Qw {
    public static final /* synthetic */ int LJLLILLLL = 0;
    public boolean LJLIL;
    public boolean LJLILLLLZI;
    public boolean LJLJI;
    public View LJLJJI;
    public C47061t0 LJLJJL;
    public C47061t0 LJLJJLL;
    public C47121t6 LJLJL;
    public View LJLJLJ;
    public C47121t6 LJLJLLL;
    public C47121t6 LJLL;
    public IDRunnableS4S1100000 LJLLI;

    @Override // com.bytedance.android.live.design.resource.theme.LiveThemeAwareFragment, X.InterfaceC12810er
    public final /* synthetic */ int getThemeOverlay(Context context) {
        return V10.LIZ();
    }

    public GameCastWiredFragment() {
        new LinkedHashMap();
    }

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        if (!C05440Jg.LIZ(GameCastWiredWidget.class)) {
            C0JX.LJIIIZ(true);
        }
        C0JX.LIZJ = null;
        super.onDestroy();
    }

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        View view = getView();
        if (view != null) {
            view.removeCallbacks(new IDRunnableS85S0100000(this, 56));
        }
        this.LJLLI = null;
        this.LJLILLLLZI = false;
        super.onDestroyView();
    }

    public final void vl() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("loadWiredCastFailedIcon  isCasting: ");
        C19U.LIZJ(LIZ, this.LJLJI, LIZ, "GameCastWiredFragment");
        C15490jB.LJ(this.LJLJJL, "tiktok_live_game_demand_1", "ttlive_game_cast_wired_failed.png");
    }

    public final void wl(boolean z) {
        String str;
        C10S.LIZ("loadWiredCastStateIcon  isCasting: ", z, "GameCastWiredFragment");
        C47061t0 c47061t0 = this.LJLJJL;
        if (z) {
            str = "ttlive_game_cast_wired_succeed.png";
        } else {
            str = "ttlive_game_cast_wired_loading.png";
        }
        C15490jB.LJ(c47061t0, "tiktok_live_game_demand_1", str);
    }

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        boolean z;
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        this.LJLJJI = view.findViewById(R.id.avo);
        this.LJLJJL = (C47061t0) view.findViewById(R.id.b6j);
        this.LJLJJLL = (C47061t0) view.findViewById(R.id.b6n);
        this.LJLJL = (C47121t6) view.findViewById(R.id.l5_);
        this.LJLJLJ = view.findViewById(R.id.cdn);
        this.LJLJLLL = (C47121t6) view.findViewById(R.id.l8m);
        C47121t6 c47121t6 = (C47121t6) view.findViewById(R.id.l8n);
        this.LJLL = c47121t6;
        if (c47121t6 != null) {
            c47121t6.setText(getString(R.string.oxc));
        }
        View findViewById = view.findViewById(R.id.b6m);
        if (findViewById != null) {
            C16880lQ.LJIIJ(new IDCListenerS135S0100000(this, 29), findViewById);
        }
        C15490jB.LJ(this.LJLJJLL, "tiktok_live_game_demand_1", "ttlive_game_cast_wired_end.png");
        C47061t0 c47061t0 = this.LJLJJLL;
        if (c47061t0 != null) {
            C16880lQ.LJJI(c47061t0, new IDCListenerS135S0100000(this, 30));
        }
        Bundle arguments = getArguments();
        if (arguments != null && arguments.getBoolean("key_wired_cast_is_showing")) {
            z = true;
        } else {
            z = false;
        }
        C29306Beo.LJJJIL(new C46991st(z, this));
        this.LJLJI = z;
        wl(z);
        if (!this.LJLJI && isAdded() && getContext() != null) {
            String string = getString(R.string.la7);
            o.LJIIIIZZ(string, "getString(R.string.pm_gameLive_cast_fail_tip4)");
            IDRunnableS4S1100000 iDRunnableS4S1100000 = new IDRunnableS4S1100000(this, string, 2);
            this.LJLLI = iDRunnableS4S1100000;
            view.postDelayed(iDRunnableS4S1100000, 20000L);
        }
        if (!this.LJLJI) {
            this.LJLILLLLZI = true;
            String setInitText$lambda$0 = getString(R.string.la9);
            o.LJIIIIZZ(setInitText$lambda$0, "setInitText$lambda$0");
            xl(0, this.LJLJL, ujb.o.LJJJJZ(setInitText$lambda$0, ".", "", false));
        } else {
            C47121t6 c47121t62 = this.LJLJL;
            if (c47121t62 != null) {
                c47121t62.setText(getString(R.string.l_t));
            }
        }
        Context context = getContext();
        InterfaceC05420Je interfaceC05420Je = new InterfaceC05420Je() { // from class: X.1G3
            @Override // X.InterfaceC05420Je
            public final void LIZ() {
                if (GameCastWiredFragment.this.LJLJI) {
                    return;
                }
                C0NB.LIZIZ("GameCastWiredFragment", "onCastSucceed, --wiredFragmnet");
                GameCastWiredFragment gameCastWiredFragment = GameCastWiredFragment.this;
                gameCastWiredFragment.getClass();
                C29306Beo.LJJJIL(new C46991st(true, gameCastWiredFragment));
                gameCastWiredFragment.LJLJI = true;
                GameCastWiredFragment gameCastWiredFragment2 = GameCastWiredFragment.this;
                gameCastWiredFragment2.LJLILLLLZI = false;
                C15610jN.LIZIZ(new ARunnableS41S0100000_5(new IDqS420S0100000(gameCastWiredFragment2, 39), 256));
                C0JV.LJIIIIZZ(false);
            }

            @Override // X.InterfaceC05420Je
            public final void LIZIZ() {
                if (!GameCastWiredFragment.this.LJLJI) {
                    return;
                }
                C0NB.LIZIZ("GameCastWiredFragment", "onCastEnd, --wiredFragmnet");
                GameCastWiredFragment gameCastWiredFragment = GameCastWiredFragment.this;
                gameCastWiredFragment.getClass();
                C29306Beo.LJJJIL(new C46991st(false, gameCastWiredFragment));
                gameCastWiredFragment.LJLJI = false;
                C15610jN.LIZIZ(new ARunnableS41S0100000_5(new IDqS420S0100000(GameCastWiredFragment.this, 43), 256));
            }

            @Override // X.InterfaceC05420Je
            public final void LIZJ() {
                C0NB.LIZIZ("GameCastWiredFragment", "onInitSucceed, start --wiredFragmnet");
                GameCastWiredFragment gameCastWiredFragment = GameCastWiredFragment.this;
                if (gameCastWiredFragment.LJLJI) {
                    C0NB.LIZIZ("GameCastWiredFragment", "startWiredCast isCasting --wiredFragment");
                } else {
                    C0JX.LJFF(gameCastWiredFragment);
                }
            }

            @Override // X.InterfaceC05420Je
            public final void LJ() {
                if (GameCastWiredFragment.this.LJLJI) {
                    return;
                }
                C0NB.LIZIZ("GameCastWiredFragment", "onConnectSucceed, start --wiredFragmnet");
                GameCastWiredFragment gameCastWiredFragment = GameCastWiredFragment.this;
                if (gameCastWiredFragment.LJLJI) {
                    C0NB.LIZIZ("GameCastWiredFragment", "startWiredCast isCasting --wiredFragment");
                } else {
                    C0JX.LJFF(gameCastWiredFragment);
                }
            }

            @Override // X.InterfaceC05420Je
            public final void LIZLLL(int i) {
                C0NB.LIZIZ("GameCastWiredFragment", "onDisConnected, stop --wiredFragmnet");
                if (GameCastWiredFragment.this.LJLJI) {
                    C0NB.LIZIZ("GameCastWiredFragment", "wired stop");
                    C0JX.LJII(true);
                }
                C15610jN.LIZIZ(new ARunnableS41S0100000_5(new IDqS19S0101000(GameCastWiredFragment.this, i, 1), 256));
            }

            @Override // X.InterfaceC05420Je
            public final void LJFF(int i) {
                C0NB.LIZIZ("GameCastWiredFragment", "onCastFailed, --wiredFragmnet");
                C29306Beo.LJJJIL(new IDqS19S0101000(GameCastWiredFragment.this, i, 0));
            }
        };
        if (context != null) {
            C0JX.LJII = true;
            C0JX.LIZJ(context);
            C0JX.LIZJ = interfaceC05420Je;
            C0JX.LIZLLL = new C05380Ja(context);
        }
        View view2 = this.LJLJJI;
        if (view2 == null) {
            return;
        }
        view2.setVisibility(4);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        C0JX.LIZ(i, i2, intent);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        o.LJIIIZ(inflater, "inflater");
        View LLLLIILL = C16880lQ.LLLLIILL(inflater, R.layout.d3k, viewGroup, false);
        C29S c29s = null;
        if (!(LLLLIILL instanceof View)) {
            LLLLIILL = null;
        }
        if (LLLLIILL != null) {
            try {
                ViewTreeLifecycleOwner.set(LLLLIILL, getViewLifecycleOwner());
                ViewTreeViewModelStoreOwner.set(LLLLIILL, this);
                C10A.LIZIZ(LLLLIILL, this);
                ActivityC45651qj mo49getActivity = mo49getActivity();
                if (mo49getActivity instanceof C29S) {
                    c29s = (C29S) mo49getActivity;
                }
                C90903hW.LIZ(c29s);
            } catch (Throwable th) {
                C3C5.m7constructorimpl(C141335gf.LIZ(th));
            }
        }
        C3C5.m7constructorimpl(C76800UCe.LIZ);
        return LLLLIILL;
    }

    public final void xl(int i, View view, String str) {
        if (view == null || str == null || !this.LJLILLLLZI || this.LJLJI) {
            return;
        }
        C29306Beo.LJJJIL(new C47001su(i, this, str, view));
    }
}

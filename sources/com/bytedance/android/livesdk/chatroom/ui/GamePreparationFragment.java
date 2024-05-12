package com.bytedance.android.livesdk.chatroom.ui;

import X.ActivityC45651qj;
import X.BZI;
import X.C03880Dg;
import X.C0NB;
import X.C10A;
import X.C10V;
import X.C141335gf;
import X.C16880lQ;
import X.C1EW;
import X.C221108m2;
import X.C28514BHa;
import X.C28787BRn;
import X.C29S;
import X.C30922CBq;
import X.C3C5;
import X.C3R;
import X.C47071t1;
import X.C47121t6;
import X.C4K;
import X.C62822Ol8;
import X.C65300Pk0;
import X.C73318Sq2;
import X.C73411SrX;
import X.C76800UCe;
import X.C76965UIn;
import X.C87277YNd;
import X.C90903hW;
import X.FCD;
import X.InterfaceC27469AqH;
import X.InterfaceC92693kP;
import X.TMC;
import X.X1D;
import Y.AfS4S0100100_5;
import Y.IDaS216S0100000_5;
import Y.IDcS170S0100000_5;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.android.live.design.app.LiveDialog;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.android.livesdk.chatroom.widget.ScreenRecordStatusWidget;
import com.bytedance.android.livesdk.comp.api.game.GamePreparationDefinitionDialogAlive;
import com.bytedance.android.livesdk.comp.api.game.GamePreparationNetworkSpeedDetectionDialogAlive;
import com.bytedance.android.livesdk.comp.api.game.GamePreparationNetworkSpeedTipsDialogAlive;
import com.bytedance.android.livesdk.comp.api.game.GamePreparationPageDestroyEvent;
import com.bytedance.android.livesdk.comp.api.game.PrepareCountDown;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.livesetting.broadcast.BroadcastGameCountDownNum;
import com.bytedance.android.livesdk.model.GameTag;
import com.bytedance.android.livesdk.ui.BaseFragment;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.widget.WidgetManager;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class GamePreparationFragment extends BaseFragment implements C3R, InterfaceC27469AqH {
    public C47121t6 LJLIL;
    public C47121t6 LJLILLLLZI;
    public C47121t6 LJLJI;
    public C47121t6 LJLJJI;
    public LinearLayout LJLJJL;
    public LiveIconView LJLJJLL;
    public WidgetManager LJLJL;
    public ScreenRecordStatusWidget LJLJLJ;
    public final long LJLJLLL;
    public long LJLL;
    public final C73318Sq2 LJLLI;
    public boolean LJLLILLLL;
    public DataChannel LJLLJ;
    public C10V LJLLL;
    public C73411SrX LJLLLL;
    public long LJLLLLLL;
    public Room LJLZ;
    public final C62822Ol8 LJZ;
    public final Map<Integer, View> LJZI = new LinkedHashMap();

    @Override // X.C3R
    public final void Fb() {
        xl(false);
        wl(0L);
    }

    public final View _$_findCachedViewById(int i) {
        View findViewById;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJZI;
        View view = (View) linkedHashMap.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null || (findViewById = view2.findViewById(i)) == null) {
            return null;
        }
        linkedHashMap.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    @Override // X.C3R
    public final Fragment getFragment() {
        return this;
    }

    public GamePreparationFragment() {
        long j;
        Long valueOf;
        int value = BroadcastGameCountDownNum.INSTANCE.getValue();
        if (value > 0 && (valueOf = Long.valueOf(value)) != null) {
            j = valueOf.longValue();
        } else {
            j = 90;
        }
        this.LJLJLLL = j;
        this.LJLL = j;
        this.LJLLI = new C73318Sq2();
        this.LJLLLLLL = -1L;
        this.LJZ = C221108m2.LIZIZ(C4K.LJLIL);
    }

    public final String Al() {
        return (String) this.LJZ.getValue();
    }

    public final WidgetManager Dl() {
        WidgetManager widgetManager = this.LJLJL;
        if (widgetManager != null) {
            return widgetManager;
        }
        o.LJIJI("widgetManager");
        throw null;
    }

    public final void Jl() {
        if (this.LJLLILLLL || this.LJLL <= 0) {
            return;
        }
        if (C30922CBq.LIZIZ) {
            C0NB.LJIIIZ("GamePreparationFragmentTag", "start go live countdown.");
        }
        long j = this.LJLL;
        this.LJLLILLLL = true;
        InterfaceC92693kP LJJJJZI = C1EW.LIZ(TMC.LJJIFFI(j + 1, 0L, 1L, TimeUnit.SECONDS)).LJIIZILJ(new IDaS216S0100000_5(this, 1)).LJJJJZI(new AfS4S0100100_5(j, this, 5));
        this.LJLLLL = (C73411SrX) LJJJJZI;
        this.LJLLI.LIZ(LJJJJZI);
    }

    public final void Kl() {
        boolean z;
        boolean z2;
        boolean z3;
        DataChannel dataChannel = this.LJLLJ;
        if (dataChannel != null) {
            Boolean bool = (Boolean) dataChannel.kv0(GamePreparationDefinitionDialogAlive.class);
            if (bool != null) {
                z = bool.booleanValue();
            } else {
                z = false;
            }
            DataChannel dataChannel2 = this.LJLLJ;
            if (dataChannel2 != null) {
                Boolean bool2 = (Boolean) dataChannel2.kv0(GamePreparationNetworkSpeedDetectionDialogAlive.class);
                if (bool2 != null) {
                    z2 = bool2.booleanValue();
                } else {
                    z2 = false;
                }
                DataChannel dataChannel3 = this.LJLLJ;
                if (dataChannel3 != null) {
                    Boolean bool3 = (Boolean) dataChannel3.kv0(GamePreparationNetworkSpeedTipsDialogAlive.class);
                    if (bool3 != null) {
                        z3 = bool3.booleanValue();
                    } else {
                        z3 = false;
                    }
                    if (C30922CBq.LIZIZ) {
                        C0NB.LJIIIZ("GamePreparationFragmentTag", "tryResetGoLiveCountDown(). ");
                    }
                    if (z || z2 || z3) {
                        if (C30922CBq.LIZIZ) {
                            StringBuilder LIZ = X1D.LIZ();
                            LIZ.append("tryResetGoLiveCountDown(). isGoLiveCountDownStarted=");
                            C76965UIn.LIZJ(LIZ, this.LJLLILLLL, "; endGoLiveCountDown.isGamePreparationDefinitionDialogAlive=", z, ";isGamePreparationNetworkSpeedDetectionDialogAlive=");
                            LIZ.append(z2);
                            LIZ.append(";isGamePreparationNetworkSpeedTipsDialogAlive=");
                            LIZ.append(z3);
                            C0NB.LJIIIZ("GamePreparationFragmentTag", X1D.LIZIZ(LIZ));
                        }
                        if (this.LJLLILLLL) {
                            xl(true);
                            return;
                        }
                        return;
                    }
                    if (C30922CBq.LIZIZ) {
                        C0NB.LJIIIZ("GamePreparationFragmentTag", "tryResetGoLiveCountDown(). startGoLiveCountDown().isGamePreparationDefinitionDialogAlive=false;isGamePreparationNetworkSpeedDetectionDialogAlive=false;isGamePreparationNetworkSpeedTipsDialogAlive=false");
                    }
                    Jl();
                    return;
                }
                o.LJIJI("dataChannel");
                throw null;
            }
            o.LJIJI("dataChannel");
            throw null;
        }
        o.LJIJI("dataChannel");
        throw null;
    }

    @Override // X.C3R
    public final void Pb() {
        LiveIconView liveIconView = this.LJLJJLL;
        if (liveIconView != null) {
            C87277YNd.LJJIJ(liveIconView);
            LinearLayout linearLayout = this.LJLJJL;
            if (linearLayout != null) {
                C87277YNd.LJJIIZ(linearLayout);
                C47121t6 c47121t6 = this.LJLIL;
                if (c47121t6 != null) {
                    c47121t6.setText(getString(R.string.mby));
                    C47121t6 c47121t62 = this.LJLILLLLZI;
                    if (c47121t62 != null) {
                        c47121t62.setText(getString(R.string.mbx));
                        return;
                    } else {
                        o.LJIJI("contentTextView");
                        throw null;
                    }
                }
                o.LJIJI("titleTextView");
                throw null;
            }
            o.LJIJI("countDownView");
            throw null;
        }
        o.LJIJI("warningView");
        throw null;
    }

    @Override // X.InterfaceC27469AqH
    public final boolean onBackPressed() {
        Gl("exit");
        xl(false);
        if (getContext() == null) {
            return true;
        }
        C47071t1 c47071t1 = new C47071t1(getContext());
        c47071t1.LJIILJJIL = false;
        c47071t1.LJIILL = false;
        c47071t1.LJIILLIIL(R.string.mbp);
        c47071t1.LJIIL(R.string.mbo, new IDcS170S0100000_5(this, 9));
        c47071t1.LJIIIZ(R.string.mbn, new IDcS170S0100000_5(this, 10));
        LiveDialog LIZ = c47071t1.LIZ();
        if (new C03880Dg(2).LIZJ(300000, "com/bytedance/android/live/design/app/LiveDialog", "show", LIZ, new Object[0], "void", new C65300Pk0(false, "()V", "7643148937388831651")).LIZ) {
            return true;
        }
        LIZ.show();
        return true;
    }

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        DataChannel dataChannel = this.LJLLJ;
        if (dataChannel != null) {
            dataChannel.pv0(GamePreparationPageDestroyEvent.class);
            super.onDestroy();
            if (C30922CBq.LIZIZ) {
                C0NB.LJIIIZ("GamePreparationFragmentTag", "cancel all countdown.");
            }
            this.LJLLILLLL = false;
            this.LJLLI.LIZLLL();
            return;
        }
        o.LJIJI("dataChannel");
        throw null;
    }

    public final void vl() {
        long j = this.LJLL;
        long j2 = 60;
        long j3 = j / j2;
        long j4 = j % j2;
        C47121t6 c47121t6 = this.LJLJI;
        if (c47121t6 != null) {
            Locale locale = Locale.US;
            String LLLZI = C16880lQ.LLLZI(locale, "%02d", Arrays.copyOf(new Object[]{Long.valueOf(j3)}, 1));
            o.LJIIIIZZ(LLLZI, "format(locale, format, *args)");
            c47121t6.setText(LLLZI);
            C47121t6 c47121t62 = this.LJLJJI;
            if (c47121t62 != null) {
                String LLLZI2 = C16880lQ.LLLZI(locale, "%02d", Arrays.copyOf(new Object[]{Long.valueOf(j4)}, 1));
                o.LJIIIIZZ(LLLZI2, "format(locale, format, *args)");
                c47121t62.setText(LLLZI2);
                return;
            }
            o.LJIJI("countDownSecondView");
            throw null;
        }
        o.LJIJI("countDownMinuteView");
        throw null;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStart() {
        super.onStart();
        this.LJLLLLLL = System.currentTimeMillis();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStop() {
        super.onStop();
        Hl("background");
    }

    public final void Gl(String str) {
        Long l;
        BZI LIZ = C28787BRn.LIZ("livesdk_live_prepare_page_leave");
        LIZ.LJIJ("screen_share");
        LIZ.LJFF(Al());
        LIZ.LJIJJ(str, "position");
        Room room = this.LJLZ;
        if (room != null) {
            l = Long.valueOf(room.getId());
        } else {
            l = null;
        }
        LIZ.LJJIII(l);
        LIZ.LJJIIJZLJL();
        if (o.LJ(str, "confirm")) {
            Hl("exit");
        }
    }

    public final void Hl(String str) {
        int i;
        Long l;
        String str2;
        if (this.LJLLLLLL < 0) {
            return;
        }
        BZI LIZ = C28787BRn.LIZ("livesdk_live_prepare_page_stay_time");
        LIZ.LJIJ("screen_share");
        LIZ.LJFF(Al());
        LIZ.LJIJJ(Long.valueOf(System.currentTimeMillis() - this.LJLLLLLL), "duration");
        LIZ.LJIJJ(str, "reason");
        GameTag LIZIZ = C28514BHa.LIZIZ();
        if (LIZIZ != null && (str2 = LIZIZ.packageName) != null) {
            i = Integer.valueOf(FCD.LJFF(getContext(), str2) ? 1 : 0);
        } else {
            i = 0;
        }
        LIZ.LJIJJ(i, "if_default_game");
        Room room = this.LJLZ;
        if (room != null) {
            l = Long.valueOf(room.getId());
        } else {
            l = null;
        }
        LIZ.LJJIII(l);
        LIZ.LJJIIJZLJL();
        this.LJLLLLLL = -1L;
    }

    public final void wl(long j) {
        if (j < 0) {
            return;
        }
        this.LJLL = j;
        DataChannel dataChannel = this.LJLLJ;
        if (dataChannel != null) {
            dataChannel.rv0(PrepareCountDown.class, Long.valueOf(j));
            vl();
        } else {
            o.LJIJI("dataChannel");
            throw null;
        }
    }

    public final void xl(boolean z) {
        if (C30922CBq.LIZIZ) {
            C0NB.LJIIIZ("GamePreparationFragmentTag", "cancel go live countdown.");
        }
        this.LJLLILLLL = false;
        if (z) {
            wl(this.LJLJLLL);
        }
        C73318Sq2 c73318Sq2 = this.LJLLI;
        C73411SrX c73411SrX = this.LJLLLL;
        if (c73411SrX != null) {
            c73318Sq2.LIZIZ(c73411SrX);
        } else {
            o.LJIJI("goLiveCountDown");
            throw null;
        }
    }

    public final void Il(DataChannel dataChannel, GameBroadcastFragment gameBroadcastFragment) {
        this.LJLLJ = dataChannel;
        this.LJLZ = (Room) dataChannel.kv0(RoomChannel.class);
        this.LJLLL = gameBroadcastFragment;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0368  */
    @Override // com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onViewCreated(android.view.View r24, android.os.Bundle r25) {
        /*
            Method dump skipped, instructions count: 887
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.chatroom.ui.GamePreparationFragment.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        o.LJIIIZ(inflater, "inflater");
        View LLLLIILL = C16880lQ.LLLLIILL(inflater, R.layout.d49, viewGroup, false);
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
}

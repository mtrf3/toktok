package com.bytedance.android.live.broadcast.fragment;

import X.ActivityC45651qj;
import X.BZI;
import X.C005800o;
import X.C012403c;
import X.C03880Dg;
import X.C0JC;
import X.C0JV;
import X.C0NB;
import X.C10A;
import X.C141335gf;
import X.C15380j0;
import X.C15490jB;
import X.C15610jN;
import X.C16880lQ;
import X.C221108m2;
import X.C276716t;
import X.C28787BRn;
import X.C29306Beo;
import X.C29S;
import X.C35251Zx;
import X.C3C5;
import X.C46901sk;
import X.C46911sl;
import X.C46921sm;
import X.C47061t0;
import X.C47071t1;
import X.C62822Ol8;
import X.C65300Pk0;
import X.C76800UCe;
import X.C90903hW;
import X.InterfaceC005900p;
import X.InterfaceC27469AqH;
import X.InterfaceC28236B6i;
import X.InterfaceC32901Qw;
import X.V10;
import X.X1D;
import Y.ARunnableS41S0100000_5;
import Y.IDRunnableS85S0100000;
import Y.IDcS169S0100000;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.SurfaceView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.byted.cast.common.source.IMessageListener;
import com.byted.cast.common.source.ServiceInfo;
import com.bytedance.android.live.broadcast.fragment.GameDualDeviceSourceFragment;
import com.bytedance.android.live.broadcast.mirror.message.DualCameraCaptureSizeMessage;
import com.bytedance.android.live.broadcast.mirror.message.DualLiveStateMessage;
import com.bytedance.android.live.broadcast.widget.DualDeviceFlipPowerWidget;
import com.bytedance.android.live.broadcast.widget.DualDevicePowerCameraWidget;
import com.bytedance.android.live.broadcast.widget.DualDevicePowerWidget;
import com.bytedance.android.live.design.app.LiveDialog;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.android.livesdk.dataChannel.LiveDualDevicePowerCameraChannel;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveBroadcastUploadVideoImageHeightSetting;
import com.bytedance.android.livesdk.ui.BaseFragment;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.widgets.RecyclableWidgetManager;
import com.bytedance.tux.icon.TuxIconView;
import com.zhiliaoapp.musically.R;
import defpackage.i0;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.IDqS0S2100000;
import kotlin.jvm.internal.IDqS420S0100000;
import kotlin.jvm.internal.o;

/* loaded from: classes.dex */
public final class GameDualDeviceSourceFragment extends BaseFragment implements InterfaceC32901Qw, InterfaceC28236B6i, InterfaceC27469AqH {
    public static final /* synthetic */ int LLIIJI = 0;
    public boolean LJLIL;
    public boolean LJLILLLLZI;
    public SurfaceView LJLJI;
    public View LJLJJI;
    public TuxIconView LJLJJL;
    public LiveIconView LJLJJLL;
    public TextView LJLJL;
    public TextView LJLJLJ;
    public View LJLJLLL;
    public View LJLL;
    public DualDevicePowerWidget LJLLI;
    public DualDevicePowerCameraWidget LJLLILLLL;
    public DualDeviceFlipPowerWidget LJLLJ;
    public RecyclableWidgetManager LJLLL;
    public DataChannel LJLLLL;
    public boolean LJLLLLLL;
    public long LJLZ;
    public C47061t0 LJZ;
    public View LJZI;
    public int LJZL;
    public String LL;
    public boolean LLD;
    public C005800o LLF;
    public C35251Zx LLFF;
    public C0JC LLFFF;
    public boolean LLFII;
    public boolean LLFZ;
    public int LLI;
    public int LLIFFJFJJ;
    public final C62822Ol8 LLII;
    public boolean LLIIII;
    public boolean LLIIIILZ;
    public final IDRunnableS85S0100000 LLIIIJ;
    public final IDRunnableS85S0100000 LLIIIL;
    public final IDRunnableS85S0100000 LLIIIZ;

    public final void Dl() {
        if (!this.LJLLLLLL) {
            return;
        }
        long j = this.LJLZ;
        long j2 = 60;
        C15610jN.LIZIZ(new ARunnableS41S0100000_5(new C46911sl(this, j / 3600, (j / j2) % j2, j % j2), 256));
        this.LJLZ++;
        View view = getView();
        if (view != null) {
            view.postDelayed(this.LLIIIJ, 1000L);
        }
    }

    @Override // com.bytedance.android.live.design.resource.theme.LiveThemeAwareFragment, X.InterfaceC12810er
    public final /* synthetic */ int getThemeOverlay(Context context) {
        return V10.LIZ();
    }

    public GameDualDeviceSourceFragment() {
        new LinkedHashMap();
        this.LJLIL = true;
        this.LL = "";
        this.LLFFF = C0JC.IDLE;
        this.LLI = LiveBroadcastUploadVideoImageHeightSetting.DEFAULT;
        this.LLIFFJFJJ = 360;
        this.LLII = C221108m2.LIZIZ(C46901sk.LJLIL);
        this.LLIIII = true;
        this.LLIIIILZ = true;
        this.LLIIIJ = new IDRunnableS85S0100000(this, 50);
        this.LLIIIL = new IDRunnableS85S0100000(this, 48);
        this.LLIIIZ = new IDRunnableS85S0100000(this, 49);
    }

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        C0NB.LIZIZ("GameDualDeviceSource", "fragment destroy");
        if (!this.LLFFF.isConnected()) {
            C005800o c005800o = this.LLF;
            if (c005800o != null) {
                c005800o.LJIIIIZZ();
            }
            this.LLF = null;
        } else {
            C005800o c005800o2 = this.LLF;
            if (c005800o2 != null) {
                c005800o2.LIZLLL();
            }
            this.LLFFF = C0JC.DESTROY;
        }
        DataChannel dataChannel = this.LJLLLL;
        if (dataChannel != null) {
            dataChannel.jv0(this);
        }
        View view = getView();
        if (view != null) {
            view.removeCallbacks(this.LLIIIJ);
        }
        View view2 = getView();
        if (view2 != null) {
            view2.removeCallbacks(this.LLIIIL);
        }
        super.onDestroyView();
    }

    public final void vl() {
        TuxIconView tuxIconView;
        if (this.LJLIL && (tuxIconView = this.LJLJJL) != null) {
            tuxIconView.setRotation(tuxIconView.getRotation() + 3.0f);
            tuxIconView.postOnAnimation(this.LLIIIZ);
        }
    }

    @Override // X.InterfaceC27469AqH
    public final boolean onBackPressed() {
        xl(getContext());
        return true;
    }

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
        try {
            if (this.LLFFF.isDisConnect()) {
                return;
            }
            C005800o c005800o = this.LLF;
            if (c005800o != null) {
                c005800o.LJII(false);
            }
            ActivityC45651qj mo49getActivity = mo49getActivity();
            if (mo49getActivity != null && !mo49getActivity.isFinishing()) {
                C005800o c005800o2 = this.LLF;
                if (c005800o2 != null) {
                    c005800o2.LJIIJ(true);
                }
                this.LLFII = true;
            }
        } catch (NoClassDefFoundError e) {
            if (!C276716t.LIZ) {
                C0NB.LJFF("GameCastLink", "NoClassDefFoundError the df_live_plugin is not ready", e);
                return;
            }
            throw e;
        }
    }

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        Boolean bool;
        C005800o c005800o;
        super.onResume();
        try {
            if (this.LLFFF.isDisConnect()) {
                if (this.LLFZ && (c005800o = this.LLF) != null) {
                    c005800o.LIZJ();
                    return;
                }
                return;
            }
            this.LLFII = false;
            DataChannel dataChannel = this.LJLLLL;
            if (dataChannel != null && (bool = (Boolean) dataChannel.kv0(LiveDualDevicePowerCameraChannel.class)) != null) {
                boolean booleanValue = bool.booleanValue();
                C005800o c005800o2 = this.LLF;
                if (c005800o2 != null) {
                    c005800o2.LJIIJ(booleanValue);
                }
            }
        } catch (NoClassDefFoundError e) {
            if (!C276716t.LIZ) {
                C0NB.LJFF("GameCastLink", "NoClassDefFoundError the df_live_plugin is not ready", e);
                return;
            }
            throw e;
        }
    }

    @Override // X.InterfaceC28236B6i
    public final DataChannel provideDataChannel() {
        return this.LJLLLL;
    }

    public final void Gl(int i) {
        boolean z;
        Boolean bool;
        C012403c.LJ("updateStateLayout, state: ", i, "GameDualDeviceSource");
        DataChannel dataChannel = this.LJLLLL;
        if (dataChannel != null && (bool = (Boolean) dataChannel.kv0(LiveDualDevicePowerCameraChannel.class)) != null) {
            z = bool.booleanValue();
        } else {
            z = false;
        }
        C29306Beo.LJJJIL(new C46921sm(i, this, z));
    }

    public final void wl(boolean z) {
        if (z) {
            SurfaceView surfaceView = this.LJLJI;
            if (surfaceView != null) {
                surfaceView.setVisibility(8);
            }
            View view = this.LJZI;
            if (view != null) {
                view.setVisibility(0);
            }
            C15490jB.LJ(this.LJZ, "tiktok_live_game_demand_2", "ttlive_dual_device_eye_splash.png");
            return;
        }
        SurfaceView surfaceView2 = this.LJLJI;
        if (surfaceView2 != null) {
            surfaceView2.setVisibility(0);
        }
        View view2 = this.LJZI;
        if (view2 == null) {
            return;
        }
        view2.setVisibility(8);
    }

    public final void xl(Context context) {
        if (context == null) {
            return;
        }
        C47071t1 c47071t1 = new C47071t1(context);
        c47071t1.LIZJ = C15380j0.LJIILJJIL(R.string.mwa);
        c47071t1.LJII(C15380j0.LJIILJJIL(R.string.mw8));
        c47071t1.LJIIJ(C15380j0.LJIILJJIL(R.string.mw_), new IDcS169S0100000(this, 3));
        c47071t1.LJIILIIL(C15380j0.LJIILJJIL(R.string.mw9), new IDcS169S0100000(this, 4));
        LiveDialog LIZ = c47071t1.LIZ();
        if (new C03880Dg(2).LIZJ(300000, "com/bytedance/android/live/design/app/LiveDialog", "show", LIZ, new Object[0], "void", new C65300Pk0(false, "()V", "-617234430456761969")).LIZ) {
            return;
        }
        LIZ.show();
    }

    public final void Al(String str, String str2) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("show wrong page, error_code: ");
        LIZ.append(str);
        LIZ.append(", detailErrorCode: ");
        LIZ.append(str2);
        C0NB.LJ("GameDualDeviceSource", X1D.LIZIZ(LIZ));
        C15610jN.LIZIZ(new ARunnableS41S0100000_5(new IDqS0S2100000(str, str2, this, 0), 256));
    }

    /* JADX WARN: Type inference failed for: r0v32, types: [X.1Zx] */
    @Override // com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        this.LJLJJL = (TuxIconView) view.findViewById(R.id.ei5);
        this.LJLJJLL = (LiveIconView) view.findViewById(R.id.ei6);
        this.LJLJLLL = view.findViewById(R.id.l8o);
        this.LJLJI = (SurfaceView) view.findViewById(R.id.kuq);
        this.LJLL = view.findViewById(R.id.niu);
        this.LJLJL = (TextView) view.findViewById(R.id.l5_);
        this.LJLJLJ = (TextView) view.findViewById(R.id.ms2);
        this.LJZ = (C47061t0) view.findViewById(R.id.b3d);
        this.LJZI = view.findViewById(R.id.b3c);
        this.LJLJJI = view.findViewById(R.id.kuk);
        try {
            DataChannel dataChannel = this.LJLLLL;
            if (dataChannel != null) {
                dataChannel.rv0(LiveDualDevicePowerCameraChannel.class, Boolean.FALSE);
            }
            this.LLFF = new InterfaceC005900p() { // from class: X.1Zx
                @Override // X.InterfaceC005900p
                public final void onStart() {
                    Boolean bool;
                    C0NB.LIZIZ("GameDualDeviceSource", "onStar - dual device");
                    GameDualDeviceSourceFragment gameDualDeviceSourceFragment = GameDualDeviceSourceFragment.this;
                    gameDualDeviceSourceFragment.LLD = false;
                    gameDualDeviceSourceFragment.LLFFF = C0JC.CONNECTED;
                    DataChannel dataChannel2 = gameDualDeviceSourceFragment.LJLLLL;
                    if (dataChannel2 != null && (bool = (Boolean) dataChannel2.kv0(LiveDualDevicePowerCameraChannel.class)) != null) {
                        GameDualDeviceSourceFragment gameDualDeviceSourceFragment2 = GameDualDeviceSourceFragment.this;
                        boolean booleanValue = bool.booleanValue();
                        if (gameDualDeviceSourceFragment2.LLFII) {
                            C005800o c005800o = gameDualDeviceSourceFragment2.LLF;
                            if (c005800o != null) {
                                c005800o.LJIIJ(true);
                            }
                        } else {
                            C005800o c005800o2 = gameDualDeviceSourceFragment2.LLF;
                            if (c005800o2 != null) {
                                c005800o2.LJIIJ(booleanValue);
                            }
                        }
                    }
                    C15610jN.LIZIZ(new ARunnableS41S0100000_5(new IDqS420S0100000(GameDualDeviceSourceFragment.this, 166), 256));
                    GameDualDeviceSourceFragment gameDualDeviceSourceFragment3 = GameDualDeviceSourceFragment.this;
                    if (gameDualDeviceSourceFragment3.LLIIIILZ) {
                        String roomId = gameDualDeviceSourceFragment3.LL;
                        o.LJIIIZ(roomId, "roomId");
                        BZI LIZ = C28787BRn.LIZ("livesdk_dual_device_source_living");
                        LIZ.LJIJJ(Long.valueOf(C0JV.LIZ()), "user_id");
                        LIZ.LJIJJ(roomId, "room_id");
                        LIZ.LJJIIJZLJL();
                        GameDualDeviceSourceFragment.this.LLIIIILZ = false;
                    }
                }

                @Override // X.InterfaceC005900p
                public final void onStop() {
                    C005800o c005800o;
                    C0NB.LJIIL("GameDualDeviceSource", "onStop dual device");
                    GameDualDeviceSourceFragment gameDualDeviceSourceFragment = GameDualDeviceSourceFragment.this;
                    if (gameDualDeviceSourceFragment.LLD && (c005800o = gameDualDeviceSourceFragment.LLF) != null) {
                        c005800o.LJIILIIL();
                    }
                }

                @Override // X.InterfaceC005900p
                public final void LIZIZ(boolean z) {
                    int i;
                    String str;
                    int i2;
                    String string;
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("init success, times: ");
                    C1DD.LJFF(LIZ, GameDualDeviceSourceFragment.this.LJZL, LIZ, "GameDualDeviceSource");
                    GameDualDeviceSourceFragment gameDualDeviceSourceFragment = GameDualDeviceSourceFragment.this;
                    if (gameDualDeviceSourceFragment.LJZL >= 20 || gameDualDeviceSourceFragment.LLFFF.isDisConnect()) {
                        return;
                    }
                    GameDualDeviceSourceFragment gameDualDeviceSourceFragment2 = GameDualDeviceSourceFragment.this;
                    gameDualDeviceSourceFragment2.getClass();
                    StringBuilder LIZ2 = X1D.LIZ();
                    LIZ2.append("checkQRParamsAndConnect: firstInit： ");
                    LIZ2.append(z);
                    C0NB.LIZIZ("GameDualDeviceSource", X1D.LIZIZ(LIZ2));
                    Bundle arguments = gameDualDeviceSourceFragment2.getArguments();
                    if (arguments != null) {
                        i = arguments.getInt("source_port");
                    } else {
                        i = -1;
                    }
                    Bundle arguments2 = gameDualDeviceSourceFragment2.getArguments();
                    String str2 = "";
                    if (arguments2 == null || (str = arguments2.getString("source_ip")) == null) {
                        str = "";
                    }
                    Bundle arguments3 = gameDualDeviceSourceFragment2.getArguments();
                    int i3 = 1;
                    if (arguments3 != null) {
                        i2 = arguments3.getInt("version");
                    } else {
                        i2 = 1;
                    }
                    Bundle arguments4 = gameDualDeviceSourceFragment2.getArguments();
                    if (arguments4 != null && (string = arguments4.getString("room_id")) != null) {
                        str2 = string;
                    }
                    gameDualDeviceSourceFragment2.LL = str2;
                    Bundle arguments5 = gameDualDeviceSourceFragment2.getArguments();
                    int i4 = LiveBroadcastUploadVideoImageHeightSetting.DEFAULT;
                    if (arguments5 != null) {
                        i4 = arguments5.getInt("video_width", LiveBroadcastUploadVideoImageHeightSetting.DEFAULT);
                    }
                    gameDualDeviceSourceFragment2.LLI = i4;
                    Bundle arguments6 = gameDualDeviceSourceFragment2.getArguments();
                    int i5 = 360;
                    if (arguments6 != null) {
                        i5 = arguments6.getInt("video_height", 360);
                    }
                    gameDualDeviceSourceFragment2.LLIFFJFJJ = i5;
                    if (i > 0) {
                        if (TextUtils.isEmpty(str) || gameDualDeviceSourceFragment2.LLIFFJFJJ <= 0 || gameDualDeviceSourceFragment2.LLI <= 0) {
                            if (TextUtils.isEmpty(str)) {
                                C0JV.LIZLLL(1001, 1, gameDualDeviceSourceFragment2.LL, "qr_scan", "qr_scan_3", gameDualDeviceSourceFragment2.LLFII);
                            } else if (gameDualDeviceSourceFragment2.LLIFFJFJJ <= 0 || gameDualDeviceSourceFragment2.LLI <= 0) {
                                C0JV.LIZLLL(1001, 1, gameDualDeviceSourceFragment2.LL, "qr_scan", "qr_scan_4", gameDualDeviceSourceFragment2.LLFII);
                            }
                        } else {
                            if (i2 > 1) {
                                C0JV.LIZLLL(1001, 2, gameDualDeviceSourceFragment2.LL, "qr_scan", "qr_scan_2", gameDualDeviceSourceFragment2.LLFII);
                                gameDualDeviceSourceFragment2.Al("version", "version");
                                return;
                            }
                            C15610jN.LIZIZ(new ARunnableS41S0100000_5(new C528725r(gameDualDeviceSourceFragment2, z), 256));
                            C005800o c005800o = gameDualDeviceSourceFragment2.LLF;
                            if (c005800o != null) {
                                c005800o.LJI(i, gameDualDeviceSourceFragment2.LLI, gameDualDeviceSourceFragment2.LLIFFJFJJ, i2, str);
                            }
                            Context LIZLLL = C15380j0.LIZLLL();
                            if (LIZLLL != null) {
                                if (!C48189Ivh.LJI(LIZLLL)) {
                                    i3 = 2;
                                }
                            } else {
                                i3 = 1;
                            }
                            C0JV.LIZLLL(0, i3, gameDualDeviceSourceFragment2.LL, "qr_scan", "qr_scan_0", gameDualDeviceSourceFragment2.LLFII);
                            return;
                        }
                    } else {
                        C0JV.LIZLLL(1001, 1, gameDualDeviceSourceFragment2.LL, "qr_scan", "qr_scan_1", gameDualDeviceSourceFragment2.LLFII);
                    }
                    gameDualDeviceSourceFragment2.Al("invalid_qr", "invalid_qr");
                }

                @Override // X.InterfaceC005900p
                public final void LIZ(int i, int i2) {
                    if (GameDualDeviceSourceFragment.this.LLFFF.isDestroy()) {
                        C005800o c005800o = GameDualDeviceSourceFragment.this.LLF;
                        if (c005800o != null) {
                            c005800o.LJIIIIZZ();
                        }
                        GameDualDeviceSourceFragment.this.LLF = null;
                        return;
                    }
                    if (!GameDualDeviceSourceFragment.this.LLFFF.isReconnecting()) {
                        GameDualDeviceSourceFragment.this.LLFFF = C0JC.DISCONNECTED;
                    }
                    GameDualDeviceSourceFragment.this.LJLLLLLL = false;
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("onDisconnect, what: ");
                    LIZ.append(i);
                    LIZ.append(", extra: ");
                    LIZ.append(i2);
                    C0NB.LJ("GameDualDeviceSource", X1D.LIZIZ(LIZ));
                    if (GameDualDeviceSourceFragment.this.LLFFF.isReconnecting()) {
                        GameDualDeviceSourceFragment gameDualDeviceSourceFragment = GameDualDeviceSourceFragment.this;
                        gameDualDeviceSourceFragment.getClass();
                        C29306Beo.LJJJIL(new C528625q(gameDualDeviceSourceFragment, i2, i));
                        return;
                    }
                    GameDualDeviceSourceFragment.this.Gl(4);
                    if (i == 200) {
                        if (i2 == 10022007) {
                            GameDualDeviceSourceFragment gameDualDeviceSourceFragment2 = GameDualDeviceSourceFragment.this;
                            C0JV.LIZLLL(0, 10022007, gameDualDeviceSourceFragment2.LL, "disconnect_result", "", gameDualDeviceSourceFragment2.LLFII);
                            return;
                        }
                    } else if (i != 200) {
                        return;
                    }
                    GameDualDeviceSourceFragment gameDualDeviceSourceFragment3 = GameDualDeviceSourceFragment.this;
                    C0JV.LIZLLL(0, i2, gameDualDeviceSourceFragment3.LL, "disconnect_result", "", gameDualDeviceSourceFragment3.LLFII);
                }

                @Override // X.InterfaceC005900p
                public final void LIZJ(int i, String str) {
                    String str2 = str;
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("init failed:");
                    LIZ.append(i);
                    LIZ.append(", errMsg:");
                    LIZ.append(str2);
                    C0NB.LJ("GameDualDeviceSource", X1D.LIZIZ(LIZ));
                    GameDualDeviceSourceFragment.this.Al("others", String.valueOf(i));
                    GameDualDeviceSourceFragment gameDualDeviceSourceFragment = GameDualDeviceSourceFragment.this;
                    String str3 = gameDualDeviceSourceFragment.LL;
                    if (str2 == null) {
                        str2 = "";
                    }
                    C0JV.LIZLLL(1010, i, str3, "connect_result", str2, gameDualDeviceSourceFragment.LLFII);
                }

                @Override // X.InterfaceC005900p
                public final void onConnect(ServiceInfo serviceInfo, int i) {
                    o.LJIIIZ(serviceInfo, "serviceInfo");
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("onConnect serviceInfo ");
                    LIZ.append(serviceInfo);
                    LIZ.append(", extra: ");
                    LIZ.append(i);
                    C0NB.LIZIZ("GameDualDeviceSource", X1D.LIZIZ(LIZ));
                    GameDualDeviceSourceFragment.this.getClass();
                    GameDualDeviceSourceFragment gameDualDeviceSourceFragment = GameDualDeviceSourceFragment.this;
                    gameDualDeviceSourceFragment.LLFFF = C0JC.CONNECTED;
                    gameDualDeviceSourceFragment.LLFZ = false;
                    gameDualDeviceSourceFragment.LJZL = 0;
                    C0JV.LIZLLL(0, 1, gameDualDeviceSourceFragment.LL, "connect_result", "", gameDualDeviceSourceFragment.LLFII);
                    GameDualDeviceSourceFragment gameDualDeviceSourceFragment2 = GameDualDeviceSourceFragment.this;
                    if (gameDualDeviceSourceFragment2.LLIIII) {
                        C0JV.LJI(gameDualDeviceSourceFragment2.LL, "shoot");
                        GameDualDeviceSourceFragment.this.LLIIII = false;
                    }
                }

                @Override // X.InterfaceC005900p
                public final void onError(int i, int i2, String str) {
                    String str2 = str;
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("mirror_play_error what=");
                    LIZ.append(i);
                    LIZ.append(", extra=");
                    LIZ.append(i2);
                    C0NB.LJ("GameDualDeviceSource", X1D.LIZIZ(LIZ));
                    GameDualDeviceSourceFragment.this.getClass();
                    if (i == 211005 && i2 == 14004004) {
                        return;
                    }
                    GameDualDeviceSourceFragment gameDualDeviceSourceFragment = GameDualDeviceSourceFragment.this;
                    gameDualDeviceSourceFragment.LJLLLLLL = false;
                    boolean z = gameDualDeviceSourceFragment.LLFII;
                    if (z && i == 211005 && (i2 == 10022013 || i2 == 10022011)) {
                        gameDualDeviceSourceFragment.LLFZ = true;
                    }
                    if (!gameDualDeviceSourceFragment.LJLILLLLZI) {
                        String str3 = gameDualDeviceSourceFragment.LL;
                        if (str2 == null) {
                            str2 = "";
                        }
                        C0JV.LIZLLL(1002, i2, str3, "connect_result", str2, z);
                        GameDualDeviceSourceFragment.this.Al("others", String.valueOf(i2));
                        return;
                    }
                    if ((i != 211005 || (i2 != 10022011 && i2 != 10022009)) && !gameDualDeviceSourceFragment.LLFFF.isDisConnect()) {
                        GameDualDeviceSourceFragment.this.LLFFF = C0JC.RECONNECTING;
                    }
                    if (GameDualDeviceSourceFragment.this.LLFFF.isReconnecting()) {
                        GameDualDeviceSourceFragment gameDualDeviceSourceFragment2 = GameDualDeviceSourceFragment.this;
                        gameDualDeviceSourceFragment2.getClass();
                        C29306Beo.LJJJIL(new C528625q(gameDualDeviceSourceFragment2, i2, i));
                    }
                }

                @Override // X.InterfaceC005900p
                public final void onInfo(int i, int i2, String str) {
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("onInfo what=");
                    LIZ.append(i);
                    LIZ.append(", extra=");
                    LIZ.append(i2);
                    C0NB.LJIIIZ("GameDualDeviceSource", X1D.LIZIZ(LIZ));
                    if (i == 211032) {
                        GameDualDeviceSourceFragment gameDualDeviceSourceFragment = GameDualDeviceSourceFragment.this;
                        String str2 = "";
                        if (gameDualDeviceSourceFragment.LJLILLLLZI) {
                            StringBuilder LIZ2 = X1D.LIZ();
                            LIZ2.append("disConnect: what: ");
                            LIZ2.append(i);
                            LIZ2.append(", extra: ");
                            LIZ2.append(i2);
                            C0NB.LJ("GameDualDeviceSource", X1D.LIZIZ(LIZ2));
                            C005800o c005800o = gameDualDeviceSourceFragment.LLF;
                            if (c005800o != null) {
                                c005800o.LIZLLL();
                                return;
                            }
                            return;
                        }
                        String str3 = gameDualDeviceSourceFragment.LL;
                        if (str != null) {
                            str2 = str;
                        }
                        C0JV.LIZLLL(1002, i2, str3, "connect_result", str2, gameDualDeviceSourceFragment.LLFII);
                        GameDualDeviceSourceFragment.this.Al("others", String.valueOf(i2));
                    }
                }
            };
            C005800o c005800o = new C005800o();
            c005800o.LJFF(this.LLFF);
            c005800o.LJIIL(new IMessageListener() { // from class: X.1Zw
                @Override // com.byted.cast.common.source.IMessageListener
                public final String onMessageSync(String str) {
                    return i0.LJFF("test onMessageSync from source:", str);
                }

                @Override // com.byted.cast.common.source.IMessageListener
                public final void onMessage(ServiceInfo serviceInfo, String str) {
                    C0JW.LIZ.getClass();
                    C15D LJ = C0JW.LJ(str);
                    if (LJ instanceof DualLiveStateMessage) {
                        GameDualDeviceSourceFragment gameDualDeviceSourceFragment = GameDualDeviceSourceFragment.this;
                        DualLiveStateMessage dualLiveStateMessage = (DualLiveStateMessage) LJ;
                        if (gameDualDeviceSourceFragment.getContext() != null) {
                            int i = dualLiveStateMessage.liveState;
                            if (i != 0) {
                                if (i != 2) {
                                    if (i == 3) {
                                        C0NB.LIZIZ("GameDualDeviceSource", "rec resume msg");
                                        gameDualDeviceSourceFragment.LJLLLLLL = true;
                                        gameDualDeviceSourceFragment.Gl(3);
                                        gameDualDeviceSourceFragment.LJLZ = dualLiveStateMessage.durationSec;
                                        View view2 = gameDualDeviceSourceFragment.getView();
                                        if (view2 != null) {
                                            view2.removeCallbacks(gameDualDeviceSourceFragment.LLIIIJ);
                                        }
                                        gameDualDeviceSourceFragment.Dl();
                                    }
                                } else {
                                    C0NB.LIZIZ("GameDualDeviceSource", "rec pause msg");
                                    gameDualDeviceSourceFragment.LJLLLLLL = false;
                                    gameDualDeviceSourceFragment.Gl(2);
                                }
                            } else {
                                C0NB.LIZIZ("GameDualDeviceSource", "rec connected msg");
                                gameDualDeviceSourceFragment.LJLIL = false;
                                gameDualDeviceSourceFragment.LJLILLLLZI = true;
                                gameDualDeviceSourceFragment.Gl(0);
                            }
                        }
                    } else if (LJ instanceof DualCameraCaptureSizeMessage) {
                        GameDualDeviceSourceFragment gameDualDeviceSourceFragment2 = GameDualDeviceSourceFragment.this;
                        gameDualDeviceSourceFragment2.LLD = true;
                        C005800o c005800o2 = gameDualDeviceSourceFragment2.LLF;
                        if (c005800o2 != null) {
                            c005800o2.LJ((DualCameraCaptureSizeMessage) LJ);
                        }
                    }
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("dualDeviceMessage = ");
                    LIZ.append(LJ);
                    C0NB.LJIIIZ("GameDualDeviceSource", X1D.LIZIZ(LIZ));
                }
            });
            this.LLF = c005800o;
        } catch (NoClassDefFoundError e) {
            if (!C276716t.LIZ) {
                C0NB.LJFF("GameCastLink", "NoClassDefFoundError the df_live_plugin is not ready", e);
            } else {
                throw e;
            }
        }
        BZI LIZ = C28787BRn.LIZ("livesdk_dual_device_source_entrance");
        LIZ.LJIJJ(Long.valueOf(C0JV.LIZ()), "user_id");
        LIZ.LJJIIJZLJL();
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        o.LJIIIZ(inflater, "inflater");
        View LLLLIILL = C16880lQ.LLLLIILL(inflater, R.layout.d45, viewGroup, false);
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

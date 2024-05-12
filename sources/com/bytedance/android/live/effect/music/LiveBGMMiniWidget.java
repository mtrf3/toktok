package com.bytedance.android.live.effect.music;

import X.ActivityC45651qj;
import X.BQO;
import X.BWZ;
import X.BYI;
import X.C14260hC;
import X.C14320hI;
import X.C14360hM;
import X.C14410hR;
import X.C15650jR;
import X.C1DH;
import X.C259910h;
import X.C29306Beo;
import X.C33481Tc;
import X.C33591Tn;
import X.C55042Ea;
import X.C55062Ec;
import X.C55222Es;
import X.C55242Eu;
import X.C78720Uuy;
import X.CL0;
import X.EnumC06880Ou;
import X.InterfaceC14440hU;
import X.InterfaceC30442Bx8;
import X.InterfaceC88472Yns;
import X.X1D;
import android.view.View;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModelProviders;
import com.bytedance.android.live.broadcast.shortcutpanel.BaseSubShortCutPanelWidget;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.android.livesdk.dataChannel.BGMMiniWidgetShowEvent;
import com.bytedance.android.livesdk.dataChannel.ECLiveStatusChangeChannel;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveBGMSetting;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveBgMusicSwitchSetting;
import com.bytedance.android.livesdkapi.depend.model.live.PaidEvent;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.IDqS416S0100000;
import kotlin.jvm.internal.o;
import webcast.data.MusicSong;

/* loaded from: classes.dex */
public final class LiveBGMMiniWidget extends BaseSubShortCutPanelWidget implements InterfaceC14440hU {
    public BGMSongListViewModel LJLJJI;
    public BGMPlaylistViewModel LJLJJL;
    public LiveIconView LJLJJLL;
    public View LJLJL;
    public LiveIconView LJLJLJ;
    public View LJLJLLL;
    public View LJLL;
    public View LJLLI;
    public View LJLLILLLL;
    public CL0 LJLLJ;
    public MusicSong LJLLL;
    public long LJLLLL;
    public boolean LJLLLLLL;

    @Override // X.InterfaceC14440hU
    public final void Ee() {
    }

    @Override // X.InterfaceC14440hU
    public final void LJJJLL() {
        LL(false);
    }

    @Override // com.bytedance.android.widget.Widget
    public final int getLayoutId() {
        return R.layout.cvw;
    }

    @Override // X.InterfaceC14440hU
    public final void h9() {
        LL(true);
    }

    @Override // com.bytedance.android.live.broadcast.shortcutpanel.BaseSubShortCutPanelWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    public final boolean LJZL() {
        PaidEvent paidEvent;
        if (!LiveBgMusicSwitchSetting.INSTANCE.getValue() || !LiveBGMSetting.INSTANCE.inLiveBGMUpgrade()) {
            return false;
        }
        Room room = (Room) this.dataChannel.kv0(RoomChannel.class);
        if ((room != null && (paidEvent = room.paidEvent) != null && paidEvent.paidType == 1) || !C29306Beo.LJIILLIIL((Boolean) this.dataChannel.kv0(ECLiveStatusChangeChannel.class))) {
            return false;
        }
        Room room2 = (Room) this.dataChannel.kv0(RoomChannel.class);
        if (room2 != null && room2.liveSubOnly == 1) {
            return false;
        }
        return true;
    }

    public final void LLF() {
        Boolean bool;
        if (!LiveBGMSetting.INSTANCE.inLiveBGMUpgradeV3() || !InterfaceC30442Bx8.LLL.LIZJ().booleanValue()) {
            Room LJIILL = C1DH.LJIILL(this.dataChannel);
            if (LJIILL != null) {
                bool = Boolean.valueOf(LJIILL.hasUsedMusic);
            } else {
                bool = null;
            }
            if (C29306Beo.LJIILLIIL(bool)) {
                LiveIconView liveIconView = this.LJLJLJ;
                if (liveIconView != null) {
                    liveIconView.setIconTint(C259910h.LIZJ(R.attr.ar7, liveIconView));
                }
                View view = this.LJLJLLL;
                if (view != null) {
                    view.setClickable(true);
                }
                View view2 = this.LJLJLLL;
                if (view2 == null) {
                    return;
                }
                view2.setEnabled(true);
            }
        }
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final void hide() {
        super.hide();
        if (!C14260hC.LJIIJJI) {
            BYI.LIZLLL(BWZ.BGM);
        } else {
            BYI.LIZJ(BWZ.BGM);
        }
        C14260hC.LJIIIIZZ = false;
        C14360hM.LJI((System.currentTimeMillis() - this.LJLLLL) / 1000, this.dataChannel, "shortcut", this.LJLLLLLL);
        this.LJLLLLLL = false;
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final void onCreate() {
        String str;
        String str2;
        String str3;
        Boolean bool;
        super.onCreate();
        ActivityC45651qj mo49getActivity = this.widgetCallback.getFragment().mo49getActivity();
        if (mo49getActivity != null) {
            this.LJLJJI = (BGMSongListViewModel) ViewModelProviders.of(mo49getActivity, new C33591Tn(new C14410hR(), this.dataChannel)).get(BGMSongListViewModel.class);
            ActivityC45651qj mo49getActivity2 = this.widgetCallback.getFragment().mo49getActivity();
            if (mo49getActivity2 != null) {
                this.LJLJJL = (BGMPlaylistViewModel) ViewModelProviders.of(mo49getActivity2, new C33481Tc(new C14320hI(), this.dataChannel)).get(BGMPlaylistViewModel.class);
            }
        }
        C14260hC.LIZ(this);
        View view = getView();
        if (view != null) {
            view.setEnabled(true);
        }
        this.LJLJJLL = (LiveIconView) findViewById(R.id.aka);
        this.LJLJL = findViewById(R.id.ak_);
        this.LJLJLJ = (LiveIconView) findViewById(R.id.ak4);
        this.LJLJLLL = findViewById(R.id.ak3);
        this.LJLL = findViewById(R.id.aju);
        this.LJLLI = findViewById(R.id.ajy);
        View findViewById = findViewById(R.id.ajw);
        o.LJIIIIZZ(findViewById, "findViewById(R.id.bgm_cover)");
        this.LJLLILLLL = findViewById;
        View findViewById2 = findViewById(R.id.akd);
        o.LJIIIIZZ(findViewById2, "findViewById(R.id.bgm_title)");
        this.LJLLJ = (CL0) findViewById2;
        if (LiveBGMSetting.INSTANCE.inLiveBGMUpgradeV3()) {
            Boolean LIZJ = InterfaceC30442Bx8.LLL.LIZJ();
            o.LJIIIIZZ(LIZJ, "LIVE_BGM_V3_MINI_PANEL.value");
            if (LIZJ.booleanValue() && LJZL()) {
                Room LJIILL = C1DH.LJIILL(this.dataChannel);
                if (LJIILL != null) {
                    bool = Boolean.valueOf(LJIILL.hasUsedMusic);
                } else {
                    bool = null;
                }
                if (C29306Beo.LJIILLIIL(bool)) {
                    C29306Beo.LJJIIJZLJL(this, null, new C55042Ea(this, null), 3);
                    LiveIconView liveIconView = this.LJLJLJ;
                    if (liveIconView != null) {
                        liveIconView.setIconTint(C259910h.LIZIZ(R.attr.ara, liveIconView.getContext()));
                    }
                    View view2 = this.LJLJLLL;
                    if (view2 != null) {
                        view2.setClickable(false);
                    }
                    View view3 = this.LJLJLLL;
                    if (view3 != null) {
                        view3.setEnabled(false);
                    }
                    this.LJLLLLLL = true;
                }
            }
        }
        Boolean LIZJ2 = InterfaceC30442Bx8.LLLF.LIZJ();
        o.LJIIIIZZ(LIZJ2, "LIVE_BGM_SHOULD_OPEN_MINI_PANEL.value");
        if (LIZJ2.booleanValue() && LJZL()) {
            C29306Beo.LJJIIJZLJL(this, null, new C55062Ec(this, null), 3);
            this.LJLLLLLL = true;
        }
        BGMPlaylistViewModel bGMPlaylistViewModel = this.LJLJJL;
        if (bGMPlaylistViewModel != null) {
            if (bGMPlaylistViewModel.LJLIL.LJ != null) {
                BQO LIZ = C15650jR.LIZ();
                BGMPlaylistViewModel bGMPlaylistViewModel2 = this.LJLJJL;
                if (bGMPlaylistViewModel2 != null) {
                    MusicSong musicSong = bGMPlaylistViewModel2.LJLIL.LJ;
                    if (musicSong != null) {
                        str = musicSong.coverUrl;
                    } else {
                        str = null;
                    }
                    C78720Uuy url = LIZ.setUrl(str);
                    View view4 = this.LJLLILLLL;
                    if (view4 != null) {
                        url.LJIIJJI(view4);
                        LL(C14260hC.LJIIJJI);
                        CL0 cl0 = this.LJLLJ;
                        if (cl0 != null) {
                            StringBuilder LIZ2 = X1D.LIZ();
                            BGMPlaylistViewModel bGMPlaylistViewModel3 = this.LJLJJL;
                            if (bGMPlaylistViewModel3 != null) {
                                MusicSong musicSong2 = bGMPlaylistViewModel3.LJLIL.LJ;
                                if (musicSong2 != null) {
                                    str2 = musicSong2.title;
                                } else {
                                    str2 = null;
                                }
                                LIZ2.append(str2);
                                LIZ2.append('-');
                                BGMPlaylistViewModel bGMPlaylistViewModel4 = this.LJLJJL;
                                if (bGMPlaylistViewModel4 != null) {
                                    MusicSong musicSong3 = bGMPlaylistViewModel4.LJLIL.LJ;
                                    if (musicSong3 != null) {
                                        str3 = musicSong3.author;
                                    } else {
                                        str3 = null;
                                    }
                                    LIZ2.append(str3);
                                    cl0.setText(X1D.LIZIZ(LIZ2));
                                } else {
                                    o.LJIJI("playListViewModel");
                                    throw null;
                                }
                            } else {
                                o.LJIJI("playListViewModel");
                                throw null;
                            }
                        } else {
                            o.LJIJI("bgmTitle");
                            throw null;
                        }
                    } else {
                        o.LJIJI("bgmCover");
                        throw null;
                    }
                } else {
                    o.LJIJI("playListViewModel");
                    throw null;
                }
            }
            C14260hC.LJ(false, 3);
            LiveIconView liveIconView2 = this.LJLJJLL;
            if (liveIconView2 != null) {
                liveIconView2.setIconAttr(R.attr.av3);
            }
            View view5 = this.LJLLI;
            if (view5 != null) {
                C29306Beo.LJJJLL(view5, 500L, new IDqS416S0100000(this, 231));
            }
            View view6 = this.LJLJL;
            if (view6 != null) {
                C29306Beo.LJJJLL(view6, 500L, new IDqS416S0100000(this, 232));
            }
            View view7 = this.LJLJLLL;
            if (view7 != null) {
                C29306Beo.LJJJLL(view7, 500L, new IDqS416S0100000(this, 233));
            }
            View view8 = this.LJLL;
            if (view8 != null) {
                C29306Beo.LJJJLL(view8, 500L, new IDqS416S0100000(this, 234));
            }
            DataChannel dataChannel = this.dataChannel;
            if (dataChannel != null) {
                dataChannel.lv0(this, BGMMiniWidgetShowEvent.class, new IDqS416S0100000(this, 235));
                dataChannel.lv0(this, ECLiveStatusChangeChannel.class, new IDqS416S0100000(this, 229));
            }
            C29306Beo.LJJIIJZLJL(this, null, new C55222Es(this, null), 3);
            C29306Beo.LJJIIJZLJL(this, null, new C55242Eu(this, null), 3);
            return;
        }
        o.LJIJI("playListViewModel");
        throw null;
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final void onDestroy() {
        super.onDestroy();
        if (isShowing()) {
            C14360hM.LJI((System.currentTimeMillis() - this.LJLLLL) / 1000, this.dataChannel, "shortcut", this.LJLLLLLL);
        }
        this.LJLLLLLL = false;
        C14260hC.LJFF(this);
        InterfaceC30442Bx8.LLLF.LIZ(Boolean.valueOf(isShowing()));
        if (LiveBGMSetting.INSTANCE.inLiveBGMUpgradeV3()) {
            InterfaceC30442Bx8.LLL.LIZ(Boolean.FALSE);
        }
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final void show() {
        super.show();
        if (LJZL()) {
            BYI.LIZJ(BWZ.BGM);
            C14260hC.LJIIIIZZ = true;
        }
        this.LJLLLL = System.currentTimeMillis();
    }

    @Override // com.bytedance.android.live.broadcast.shortcutpanel.BaseSubShortCutPanelWidget
    public final EnumC06880Ou LJLZ() {
        return EnumC06880Ou.BGM_MINI;
    }

    public final void LL(boolean z) {
        if (z) {
            CL0 cl0 = this.LJLLJ;
            if (cl0 != null) {
                cl0.requestFocus();
                CL0 cl02 = this.LJLLJ;
                if (cl02 != null) {
                    cl02.LJJIJLIJ();
                    LiveIconView liveIconView = this.LJLJJLL;
                    if (liveIconView != null) {
                        liveIconView.setIconAttr(R.attr.aur);
                        return;
                    }
                    return;
                }
                o.LJIJI("bgmTitle");
                throw null;
            }
            o.LJIJI("bgmTitle");
            throw null;
        }
        CL0 cl03 = this.LJLLJ;
        if (cl03 != null) {
            cl03.clearFocus();
            CL0 cl04 = this.LJLLJ;
            if (cl04 != null) {
                cl04.LJLLLL = true;
                cl04.setSelected(false);
                LiveIconView liveIconView2 = this.LJLJJLL;
                if (liveIconView2 == null) {
                    return;
                }
                liveIconView2.setIconAttr(R.attr.av3);
                return;
            }
            o.LJIJI("bgmTitle");
            throw null;
        }
        o.LJIJI("bgmTitle");
        throw null;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LiveBGMMiniWidget(InterfaceC88472Yns<? super EnumC06880Ou, Boolean> canShowMethod, InterfaceC88472Yns<? super EnumC06880Ou, Boolean> canHideMethod) {
        super(canShowMethod, canHideMethod);
        o.LJIIIZ(canShowMethod, "canShowMethod");
        o.LJIIIZ(canHideMethod, "canHideMethod");
    }
}

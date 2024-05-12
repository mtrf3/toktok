package com.bytedance.android.live.liveinteract.multiguestv3.main.media.guest.previewv1;

import X.AbstractC73672Svk;
import X.ActivityC45651qj;
import X.B83;
import X.BU9;
import X.C018905p;
import X.C03880Dg;
import X.C0NB;
import X.C0TV;
import X.C10A;
import X.C141335gf;
import X.C15380j0;
import X.C15510jD;
import X.C15580jK;
import X.C16880lQ;
import X.C19680pw;
import X.C1B3;
import X.C1B6;
import X.C24130x7;
import X.C29044Baa;
import X.C29374Bfu;
import X.C29S;
import X.C2A4;
import X.C2A7;
import X.C30784C6i;
import X.C30868C9o;
import X.C31665Cbl;
import X.C31778Cda;
import X.C3C5;
import X.C47061t0;
import X.C47071t1;
import X.C47121t6;
import X.C59895Nf1;
import X.C65300Pk0;
import X.C73318Sq2;
import X.C73933Szx;
import X.C73969T1h;
import X.C74600TPo;
import X.C74614TQc;
import X.C74631TQt;
import X.C74632TQu;
import X.C74740TUy;
import X.C74824TYe;
import X.C74838TYs;
import X.C74910Tac;
import X.C74912Tae;
import X.C74913Taf;
import X.C74921Tan;
import X.C74927Tat;
import X.C74930Taw;
import X.C74932Tay;
import X.C74945TbB;
import X.C74951TbH;
import X.C74957TbN;
import X.C75209TfR;
import X.C75211TfT;
import X.C75425Tiv;
import X.C75460TjU;
import X.C75559Tl5;
import X.C75948TrM;
import X.C76104Tts;
import X.C76535U1z;
import X.C76633U5t;
import X.C76800UCe;
import X.C76923UGx;
import X.C77123UOp;
import X.C78739UvH;
import X.C78857UxB;
import X.C88207Yjb;
import X.C8E;
import X.C90903hW;
import X.CFX;
import X.CN1;
import X.EnumC74929Tav;
import X.EnumC74949TbF;
import X.FT5;
import X.InterfaceC06390Mx;
import X.InterfaceC08120To;
import X.InterfaceC08130Tp;
import X.InterfaceC24140x8;
import X.InterfaceC29205BdB;
import X.InterfaceC31981Ni;
import X.InterfaceC74605TPt;
import X.InterfaceC75138TeI;
import X.InterfaceC75441TjB;
import X.KL2;
import X.OSZ;
import X.T16;
import X.TQA;
import X.TQP;
import X.TRI;
import X.U35;
import X.ViewOnClickListenerC13880ga;
import X.X1D;
import Y.AObjectS26S0000000_13;
import Y.AObjectS42S0101000_5;
import Y.AObjectS43S0101000_7;
import Y.AObjectS45S0101000_13;
import Y.AObjectS46S0101000_15;
import Y.AObjectS50S0101000_5;
import Y.AObjectS89S0101000_13;
import Y.ARunnableS15S0101000_11;
import Y.ARunnableS16S0201000_13;
import Y.AfS36S0101000_5;
import Y.IDcS172S0100000_13;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.SeekBar;
import android.widget.Space;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.broadcast.api.IBroadcastService;
import com.bytedance.android.live.design.app.LiveDialog;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.android.live.effect.api.IEffectService;
import com.bytedance.android.live.effect.api.MultiGuestStickerImageSelectedEvent;
import com.bytedance.android.live.liveinteract.api.IInteractService;
import com.bytedance.android.live.liveinteract.api.LinkReceiveEnlargeMessageEvent;
import com.bytedance.android.live.liveinteract.api.MultiGuestPreviewCameraOpenEvent;
import com.bytedance.android.live.liveinteract.multiguestv3.MultiGuestAudioVolumeEvent;
import com.bytedance.android.live.liveinteract.multiguestv3.main.common.MultiGuestDataHolder;
import com.bytedance.android.live.liveinteract.multiguestv3.main.common.channel.MicClickableEvent;
import com.bytedance.android.live.liveinteract.multiguestv3.main.common.channel.MultiGuestV3PreviewPanelV2CloseEvent;
import com.bytedance.android.live.liveinteract.multiguestv3.main.guest.GuestDisconnectByWindowWithConfirmEvent;
import com.bytedance.android.live.liveinteract.multiguestv3.main.media.guest.effect.MultiGuestEffectSwitchFragment;
import com.bytedance.android.live.liveinteract.multiguestv3.main.zoom.ZoomService;
import com.bytedance.android.live.liveinteract.multiguestv3.model.MultiLiveGuestMuteAudioEvent;
import com.bytedance.android.live.liveinteract.multiguestv3.model.MultiLiveGuestMuteVideoEvent;
import com.bytedance.android.livesdk.LiveDialogFragment;
import com.bytedance.android.livesdk.dataChannel.MultiGuestSelectedStickerEvent;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.livesetting.linkmic.LinkMicMultiGuestV3BeautyControlGroupAppLogSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveSdkMultiGuestLeakOptSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.MultiGuestLiveShowConfigSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.MultiGuestNaviAvatarSwitcherSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.multilive.MultiGuestV3AudioBeOccupiedGuestABSetting;
import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.effectmanager.effect.model.EffectChannelResponse;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.o;
import webcast.data.multi_guest_play.ShowConfig;
import webcast.data.multi_guest_play.ShowContent;
import webcast.data.multi_guest_play.ShowListUser;

/* loaded from: classes14.dex */
public class GuestMediaManageFragment extends PreviewFragment implements View.OnClickListener, InterfaceC08120To, SeekBar.OnSeekBarChangeListener {
    public static final String LLJZ = C16880lQ.LJLLJ(GuestMediaManageFragment.class);
    public C47061t0 LJLJI;
    public InterfaceC24140x8 LJLJJI;
    public View LJLJJL;
    public C2A4 LJLJJLL;
    public FrameLayout LJLJL;
    public ViewGroup LJLJLJ;
    public Space LJLJLLL;
    public ViewGroup LJLL;
    public ImageView LJLLI;
    public View LJLLILLLL;
    public View LJLLJ;
    public View LJLLL;
    public TextView LJLLLL;
    public TextView LJLLLLLL;
    public View LJLZ;
    public C31778Cda LJZ;
    public RecyclerView LJZI;
    public C47121t6 LJZL;
    public View LL;
    public C2A7 LLD;
    public FrameLayout LLF;
    public ConstraintLayout LLFF;
    public LiveIconView LLFFF;
    public View LLFII;
    public C76633U5t LLFZ;
    public C76923UGx LLI;
    public ConstraintLayout LLIFFJFJJ;
    public FrameLayout LLII;
    public FrameLayout LLIIII;
    public FrameLayout LLIIIILZ;
    public C47121t6 LLIIIJ;
    public MultiGuestEffectSwitchFragment LLIIIL;
    public boolean LLIIIZ;
    public boolean LLIIJI;
    public int LLIIJLIL;
    public LiveEffect LLIIL;
    public C76104Tts LLIILII;
    public C0TV LLIILZL;
    public boolean LLIIZ;
    public boolean LLIL;
    public int LLILII;
    public LiveEffect LLILIL;
    public boolean LLILL;
    public boolean LLILLIZIL;
    public boolean LLILLJJLI;
    public LiveDialogFragment LLILLL;
    public InterfaceC08130Tp LLILZ;
    public C76535U1z LLILZIL;
    public int LLILZLL;
    public boolean LLIZ;
    public boolean LLIZLLLIL;
    public DataChannel LLJ;
    public MultiGuestDataHolder LLJILJIL;
    public InterfaceC74605TPt LLJJ;
    public InterfaceC31981Ni LLJJIJI;
    public C0TV LLJJIJIIJIL;
    public C75425Tiv LLJJJJLIIL;
    public C75211TfT LLJJL;

    @InterfaceC75138TeI(name = "ZOOM_SERVICE")
    public ZoomService mZoomService;
    public final C73318Sq2 LLJI = new C73318Sq2();
    public final Handler LLJIJIL = new Handler(C16880lQ.LLJJJJ());
    public String LLJILJILJ = "";
    public boolean LLJILLL = false;
    public boolean LLJJI = false;
    public boolean LLJJIII = false;
    public String LLJJIJIL = "";
    public String LLJJJ = "";
    public String LLJJJIL = "";
    public String LLJJJJ = "outside";
    public final Long LLJJJJJIL = Long.valueOf(System.currentTimeMillis());
    public boolean LLJJLIIIJLLLLLLLZ = false;
    public boolean LLJL = false;
    public boolean LLJLIL = false;
    public final TRI LLJLILLLLZIIL = new TRI(this);
    public final C74927Tat LLJLL = new C74927Tat(this);
    public final C74921Tan LLJLLIL = new C74921Tan(this);
    public final C74930Taw LLJLLL = new C74930Taw(this);

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStartTrackingTouch(SeekBar seekBar) {
    }

    @Override // X.InterfaceC08120To
    public final void Wj() {
        C0NB.LJIIIZ(LLJZ, "onSyncStickersFailed");
        wl(new ArrayList());
    }

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        String str = LLJZ;
        C0NB.LJIIIZ(str, "onDestroy");
        super.onDestroy();
        C75211TfT c75211TfT = this.LLJJL;
        if (c75211TfT != null) {
            c75211TfT.LIZ(false);
        }
        C2A4 c2a4 = this.LJLJJLL;
        if (c2a4 != null) {
            c2a4.LJ();
        }
        InterfaceC08130Tp interfaceC08130Tp = this.LLILZ;
        if (interfaceC08130Tp != null) {
            interfaceC08130Tp.onDestroy();
        }
        this.LLIZLLLIL = false;
        this.LLJL = false;
        this.LLJI.LIZLLL();
        this.LLJIJIL.removeCallbacksAndMessages(null);
        C0NB.LJIIIZ(str, "dispose");
        if (!this.LLJI.LJLILLLLZI) {
            this.LLJI.dispose();
        }
        this.LLJJI = false;
        this.LLJJIII = false;
        DataChannel dataChannel = this.LLJ;
        if (dataChannel != null) {
            dataChannel.qv0(MultiGuestV3PreviewPanelV2CloseEvent.class, new TQP(new C74600TPo(this.LLIIIZ, this.LLIIJI, this.LLIIJLIL, this.LLIIL, this.LLIILZL), "business_mute_close_manage_panel", Boolean.valueOf(this.LLJLIL)));
        }
        if (this.LLJILJIL != null) {
            C74824TYe.LIZ.LJJJJZI(this.LLILIL, this.LLILII, !r4.LIZLLL, !this.LLIIZ, this.LLIL, this.LLJJJJ, System.currentTimeMillis() - this.LLJJJJJIL.longValue(), true, C77123UOp.LJJI(this.mZoomService, vl()), this.LLJJIJIL);
        }
        C8E.LJ().X3(this.LLJLILLLLZIIL);
        if (LiveSdkMultiGuestLeakOptSetting.INSTANCE.isEnable()) {
            this.LLIIIL = null;
        }
        this.LLJLIL = false;
        C88207Yjb.LJIJI("multi_guest_guest_media_manage_page");
    }

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onPause() {
        C0NB.LJIIIZ(LLJZ, "onPause");
        super.onPause();
        if (this.LLJILLL) {
            return;
        }
        Dl("business_mute_pause_manage_panel", false);
        this.LLJJI = true;
    }

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        String str = LLJZ;
        C0NB.LJIIIZ(str, "onResume");
        super.onResume();
        this.LLJILLL = false;
        Dl("business_mute_resume_manage_panel", this.LLIIZ);
        if (this.LLJJI && this.LLJJIII) {
            this.LLJJI = false;
            this.LLJJIII = false;
            C0NB.LJIIIZ(str, "dispose");
            if (!this.LLJI.LJLILLLLZI) {
                this.LLJI.dispose();
            }
        }
    }

    public final String vl() {
        ZoomService zoomService = this.mZoomService;
        if (zoomService != null) {
            return zoomService.LJIIIZ();
        }
        return "";
    }

    public final void Hl(String str) {
        MultiGuestEffectSwitchFragment multiGuestEffectSwitchFragment;
        C0NB.LJIIIZ(LLJZ, "switchToAudioSelection");
        if (this.LLJILJIL == null) {
            return;
        }
        C75425Tiv c75425Tiv = this.LLJJJJLIIL;
        if (c75425Tiv != null && (multiGuestEffectSwitchFragment = this.LLIIIL) != null) {
            c75425Tiv.LJIILJJIL(multiGuestEffectSwitchFragment.xl(), this.LLIIIL.wl());
        }
        C74951TbH.LJFF(1, "business_mute_click_manage_panel".equals(str));
        this.LLJJJIL = "audio";
        C74824TYe.LIZ.LJJJLL(this.LLJJJ, this.LLJJIJIL, "audio", this.LLILIL, this.LLILII, !this.LLJILJIL.LIZLLL, !this.LLIIZ, this.LLIL, true, C77123UOp.LJJI(this.mZoomService, vl()));
        Gl(str, false);
        if (!C30784C6i.LIZJ()) {
            View view = this.LJLLL;
            if (view != null) {
                view.setVisibility(4);
            }
            C31778Cda c31778Cda = this.LJZ;
            if (c31778Cda != null) {
                c31778Cda.setVisibility(8);
            }
            RecyclerView recyclerView = this.LJZI;
            if (recyclerView != null) {
                recyclerView.setVisibility(8);
            }
            TextView textView = this.LJLLLL;
            if (textView != null) {
                textView.setTextColor(-2130706433);
            }
            TextView textView2 = this.LJLLLLLL;
            if (textView2 != null) {
                textView2.setTextColor(-2130706433);
            }
        } else {
            C47121t6 c47121t6 = this.LJZL;
            if (c47121t6 != null) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) c47121t6.getLayoutParams();
                marginLayoutParams.topMargin = C15380j0.LIZ(16.0f);
                this.LJZL.setLayoutParams(marginLayoutParams);
            }
        }
        C47121t6 c47121t62 = this.LJZL;
        if (c47121t62 != null) {
            c47121t62.setVisibility(0);
        }
        View view2 = this.LL;
        if (view2 != null) {
            view2.setVisibility(4);
        }
        if (C30784C6i.LIZJ()) {
            return;
        }
        FrameLayout frameLayout = this.LJLJL;
        if (frameLayout != null && this.LLIIIL != null) {
            KL2.LJIILLIIL(4, frameLayout);
            KL2.LJIILLIIL(4, this.LLIFFJFJJ);
            DataChannel dataChannel = this.LLIIIL.LJLLILLLL;
            if (dataChannel == null) {
                return;
            }
            dataChannel.qv0(MultiGuestPreviewCameraOpenEvent.class, Boolean.FALSE);
            return;
        }
        C76104Tts c76104Tts = this.LLIILII;
        if (c76104Tts != null) {
            c76104Tts.LIZIZ();
        }
        KL2.LJIILLIIL(8, this.LJLJL);
        KL2.LJIILLIIL(8, this.LLI);
    }

    public final void Il(String str) {
        MultiGuestEffectSwitchFragment multiGuestEffectSwitchFragment;
        MultiGuestEffectSwitchFragment multiGuestEffectSwitchFragment2;
        if (!C30784C6i.LIZJ()) {
            if (this.LJLJL != null && (multiGuestEffectSwitchFragment = this.LLIIIL) != null) {
                multiGuestEffectSwitchFragment.Gl();
                KL2.LJIILLIIL(0, this.LJLJL);
                KL2.LJIILLIIL(4, this.LJLLL);
                if (this.LLIIIL.xl()) {
                    KL2.LJIILLIIL(0, this.LLIFFJFJJ);
                }
                if (this.LLIIIL.wl()) {
                    KL2.LJIILLIIL(0, this.LLII);
                }
            } else {
                C76104Tts c76104Tts = this.LLIILII;
                if (c76104Tts != null) {
                    c76104Tts.LIZJ(true);
                }
                KL2.LJIILLIIL(8, this.LJLJL);
                KL2.LJIILLIIL(8, this.LLIFFJFJJ);
            }
        }
        C0NB.LJIIIZ(LLJZ, "switchToBeautySelection");
        this.LLJJJIL = "enhance";
        if (this.LLJILJIL == null) {
            return;
        }
        C75425Tiv c75425Tiv = this.LLJJJJLIIL;
        if (c75425Tiv != null && (multiGuestEffectSwitchFragment2 = this.LLIIIL) != null) {
            c75425Tiv.LJIILIIL(multiGuestEffectSwitchFragment2.xl(), this.LLIIIL.wl());
        }
        C74951TbH.LJFF(2, "business_mute_click_manage_panel".equals(str));
        C74824TYe.LIZ.LJJJLL(this.LLJJJ, this.LLJJIJIL, this.LLJJJIL, this.LLILIL, this.LLILII, !this.LLJILJIL.LIZLLL, !this.LLIIZ, this.LLIL, true, C77123UOp.LJJI(this.mZoomService, vl()));
        InterfaceC74605TPt interfaceC74605TPt = this.LLJJ;
        if (interfaceC74605TPt != null) {
            interfaceC74605TPt.LJII();
        }
        Gl(str, true);
        if (!C30784C6i.LIZJ()) {
            View view = this.LJLZ;
            if (view != null) {
                C018905p c018905p = (C018905p) view.getLayoutParams();
                c018905p.bottomToBottom = R.id.ahz;
                c018905p.rightToRight = R.id.ahz;
                c018905p.leftToLeft = R.id.ahz;
                this.LJLZ.setLayoutParams(c018905p);
            }
            C31778Cda c31778Cda = this.LJZ;
            if (c31778Cda != null) {
                c31778Cda.setVisibility(0);
            }
            RecyclerView recyclerView = this.LJZI;
            if (recyclerView != null) {
                recyclerView.setVisibility(8);
            }
            TextView textView = this.LJLLLL;
            if (textView != null) {
                textView.setTextColor(-1);
            }
            TextView textView2 = this.LJLLLLLL;
            if (textView2 != null) {
                textView2.setTextColor(-2130706433);
            }
            View view2 = this.LJLLL;
            if (view2 != null) {
                view2.setVisibility(8);
            }
            View view3 = this.LL;
            if (view3 != null) {
                view3.setVisibility(0);
            }
        }
        C47121t6 c47121t6 = this.LJZL;
        if (c47121t6 != null) {
            c47121t6.setVisibility(8);
        }
    }

    public final void Jl(String str) {
        if (this.LLFII == null) {
            return;
        }
        ZoomService zoomService = this.mZoomService;
        if (zoomService != null && zoomService.LIZ() == EnumC74949TbF.CAN_ZOOM_TO_MIN) {
            C74913Taf.LIZLLL("Zoom/GuestMediaManageFragment", "visible", str);
            this.LLFII.setVisibility(0);
        } else {
            C74913Taf.LIZLLL("Zoom/GuestMediaManageFragment", "gone", str);
            this.LLFII.setVisibility(8);
        }
    }

    @Override // X.InterfaceC08120To
    public final void L0(EffectChannelResponse effectChannelResponse) {
        C0NB.LJIIIZ(LLJZ, C16880lQ.LLLZ("onSyncStickersSuccess effectCategoryResponseList=%s", new Object[]{effectChannelResponse}));
        ((InterfaceC29205BdB) AbstractC73672Svk.LJJIIZ(effectChannelResponse.getAllCategoryEffects()).LJJIJL(new C59895Nf1()).LJJLIL().LJJIIJ(T16.LIZ()).LJIJJ(C73969T1h.LIZIZ()).LIZLLL(C73933Szx.LIZJ(this.LJZI))).LIZJ(new AfS36S0101000_5(0, this, 30), new AfS36S0101000_5(0, this, 31));
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        U35 LIZ;
        ShowContent content;
        ShowConfig showConfig;
        boolean z;
        boolean z2;
        Room room;
        DataChannel dataChannel;
        int i;
        String str = LLJZ;
        int i2 = 0;
        C0NB.LJIIIZ(str, C16880lQ.LLLZ("onClick v=%s", new Object[]{Integer.valueOf(view.getId())}));
        int id = view.getId();
        if (id == R.id.fhw) {
            C0NB.LJIIIZ(str, "showDisconnectDialog");
            InterfaceC75441TjB R6 = C8E.LJ().R6();
            if (R6 != null && R6.LLLLLJIL() != null) {
                C74824TYe.LIZ.LJIJI(((C29374Bfu) B83.LIZ().LIZIZ()).getCurrentUserId(), "guest", "go_live_panel", this.LLJJJ, R6.LLLLLJIL().getLinkMicId());
            }
            Room room2 = (Room) DataChannelGlobal.LJLJJI.mv0(C29044Baa.class);
            if (room2 == null || room2.getOwner() == null) {
                return;
            }
            this.LLJJJJ = "disconnect_icon";
            LiveDialogFragment liveDialogFragment = this.LLILLL;
            if (liveDialogFragment != null) {
                liveDialogFragment.dismiss();
            }
            if (this.LLJ == null) {
                return;
            }
            this.LLJ.qv0(GuestDisconnectByWindowWithConfirmEvent.class, new OSZ("setting_panel", 10002));
            return;
        }
        if (id == R.id.b3h) {
            MultiGuestDataHolder multiGuestDataHolder = this.LLJILJIL;
            if (multiGuestDataHolder != null && (i = multiGuestDataHolder.LJJIJLIJ) != 3 && i != 1 && this.LLJJIII) {
                C30868C9o.LIZJ(R.string.nep);
                return;
            }
            this.LLIL = !this.LLIL;
            if (this.LJLJJI == null) {
                return;
            }
            InterfaceC75441TjB R62 = C8E.LJ().R6();
            if (R62 != null) {
                R62.LIZLLL().LIZ(null, "business_mute_click_manage_panel", "Switch camera back or front, just for fake capture");
            }
            this.LJLJJI.LIZIZ(C78857UxB.LJJIIJ(1476788234, "bpea-video_capture_in_preview_panel_switch_camera_back_front"));
            return;
        }
        if (id == R.id.ahz) {
            Il("business_mute_click_manage_panel");
            return;
        }
        if (id == R.id.kka) {
            C0NB.LJIIIZ(str, "switchToStickerSelection");
            this.LLJJJIL = "props";
            if (this.LLJILJIL == null) {
                return;
            }
            C74824TYe.LIZ.LJJJLL(this.LLJJJ, this.LLJJIJIL, "props", this.LLILIL, this.LLILII, !r6.LIZLLL, !this.LLIIZ, this.LLIL, true, C77123UOp.LJJI(this.mZoomService, vl()));
            Gl("business_mute_click_manage_panel", true);
            if (!C30784C6i.LIZJ()) {
                View view2 = this.LJLZ;
                if (view2 != null) {
                    C018905p c018905p = (C018905p) view2.getLayoutParams();
                    c018905p.bottomToBottom = R.id.kka;
                    c018905p.rightToRight = R.id.kka;
                    c018905p.leftToLeft = R.id.kka;
                    this.LJLZ.setLayoutParams(c018905p);
                }
                C31778Cda c31778Cda = this.LJZ;
                if (c31778Cda != null) {
                    c31778Cda.setVisibility(8);
                }
                RecyclerView recyclerView = this.LJZI;
                if (recyclerView != null) {
                    recyclerView.setVisibility(0);
                }
                TextView textView = this.LJLLLL;
                if (textView != null) {
                    textView.setTextColor(-2130706433);
                }
                TextView textView2 = this.LJLLLLLL;
                if (textView2 != null) {
                    textView2.setTextColor(-1);
                }
                View view3 = this.LJLLL;
                if (view3 != null) {
                    view3.setVisibility(8);
                }
            }
            C47121t6 c47121t6 = this.LJZL;
            if (c47121t6 != null) {
                c47121t6.setVisibility(8);
            }
            View view4 = this.LL;
            if (view4 == null) {
                return;
            }
            view4.setVisibility(0);
            return;
        }
        if (id == R.id.n8p) {
            int i3 = this.LLJILJIL.LJJIJLIJ;
            if (i3 != 3 && i3 != 1 && this.LLJJIII) {
                C30868C9o.LIZJ(R.string.nep);
                Hl("business_mute_click_manage_panel");
                return;
            }
            boolean z3 = !this.LLIIZ;
            this.LLIIZ = z3;
            if (z3) {
                Il("business_mute_click_manage_panel");
            } else {
                Hl("business_mute_click_manage_panel");
            }
            C74824TYe.LIZ.LJJJJ("link_management_panel", this.LLJILJIL.LJJJJI, this.LLIIZ, this.LLIL);
            return;
        }
        if (id == R.id.ayr) {
            this.LLJLIL = true;
            C0NB.LJIIIZ(str, "rewriteBeforeStates");
            this.LLILL = true;
            boolean z4 = this.LLIIZ;
            if (z4 && !this.LLIIIZ) {
                z = true;
            } else {
                z = false;
            }
            this.LLILLJJLI = z;
            if (!z4 && this.LLIIIZ) {
                z2 = true;
            } else {
                z2 = false;
            }
            this.LLILLIZIL = z2;
            this.LLIIIZ = z4;
            this.LLIIJI = this.LLIL;
            this.LLIIJLIL = this.LLILII;
            LiveEffect liveEffect = this.LLILIL;
            this.LLIIL = liveEffect;
            this.LLIILZL = this.LLJJIJIIJIL;
            if (liveEffect != null && (dataChannel = this.LLJ) != null) {
                dataChannel.qv0(MultiGuestSelectedStickerEvent.class, new C19680pw(liveEffect, "liveinteract", "", false));
            }
            InterfaceC31981Ni interfaceC31981Ni = this.LLJJIJI;
            if (interfaceC31981Ni instanceof InterfaceC31981Ni) {
                interfaceC31981Ni.LJIJ(true);
                C74957TbN.LIZIZ(this.LLJJIJI);
            }
            LiveDialogFragment liveDialogFragment2 = this.LLILLL;
            if (liveDialogFragment2 != null) {
                this.LLJJJJ = "confirm_icon";
                liveDialogFragment2.dismiss();
            }
            DataChannel dataChannel2 = this.LLJ;
            if (dataChannel2 != null && (room = (Room) dataChannel2.kv0(RoomChannel.class)) != null) {
                i2 = room.liveRoomMode;
            }
            C74824TYe.LJLIIIL(i2, this.LLJILJILJ, this.LLILLJJLI, vl(), this.LLJJJ);
            return;
        }
        if (id == R.id.giw) {
            MultiGuestDataHolder multiGuestDataHolder2 = this.LLJILJIL;
            if (multiGuestDataHolder2 == null) {
                return;
            }
            int i4 = multiGuestDataHolder2.LJJIJLIJ;
            if (i4 != 2 && i4 != 3) {
                return;
            }
            if (C74838TYs.LJ().LJJIL) {
                C30868C9o.LIZJ(R.string.n7a);
                return;
            }
            Room room3 = (Room) DataChannelGlobal.LJLJJI.mv0(C29044Baa.class);
            if (room3 != null && ((IInteractService) CN1.LIZ(IInteractService.class)).gt(String.valueOf(room3.getId()))) {
                return;
            }
            if (MultiGuestV3AudioBeOccupiedGuestABSetting.INSTANCE.showOccupied() && !this.LLJILJIL.LJIL) {
                InterfaceC75441TjB R63 = C8E.LJ().R6();
                if (R63 != null && R63.LIZIZ() == 5) {
                    C30868C9o.LIZJ(R.string.n0d);
                    C74824TYe.LJJJIL("pm_mic_occupy_during_live_toast", "guest_connection");
                    return;
                } else {
                    C30868C9o.LIZJ(R.string.n0c);
                    C74824TYe.LJJJIL("pm_mic_occupy_before_live_guest_toast", "guest_connection_preview_pannel");
                    return;
                }
            }
            if (MultiGuestLiveShowConfigSetting.INSTANCE.isOpenLiveShow() && (LIZ = TQA.LIZ()) != null && (content = LIZ.getContent()) != null && (showConfig = content.showConfig) != null && !showConfig.allowOpenMicFreely) {
                long j = -1;
                while (i2 < content.showingAndReadyList.size()) {
                    if (((ShowListUser) ListProtector.get(content.showingAndReadyList, i2)).status == 2) {
                        j = ((ShowListUser) ListProtector.get(content.showingAndReadyList, i2)).userId;
                    }
                    i2++;
                }
                if (j != -1 && j != ((C29374Bfu) B83.LIZ().LIZIZ()).getCurrentUserId() && !this.LLJILJIL.LIZLLL) {
                    C30868C9o.LIZJ(R.string.ndl);
                    return;
                }
            }
            String str2 = LLJZ;
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("onClickMicBtn setAudioEnable from ");
            LIZ2.append(this.LLJILJIL.LIZLLL);
            LIZ2.append(" to ");
            FT5.LJ(LIZ2, !this.LLJILJIL.LIZLLL, LIZ2, str2);
            MultiGuestDataHolder multiGuestDataHolder3 = this.LLJILJIL;
            boolean z5 = !multiGuestDataHolder3.LIZLLL;
            multiGuestDataHolder3.LIZLLL = z5;
            C74824TYe.LIZ.LJJ(multiGuestDataHolder3.LJJIJ, multiGuestDataHolder3.LJJJJI, "guest_connection_panel", true ^ z5);
            DataChannel dataChannel3 = this.LLJ;
            if (dataChannel3 == null) {
                return;
            }
            dataChannel3.qv0(MultiLiveGuestMuteAudioEvent.class, new C74631TQt(this.LLJILJIL.LIZLLL, "business_mute_manage_panel"));
            return;
        }
        if (id != R.id.fny) {
            return;
        }
        C74913Taf.LJ("Zoom/GuestMediaManageFragment");
        U35 LIZ3 = TQA.LIZ();
        if (MultiGuestLiveShowConfigSetting.INSTANCE.isOpenLiveShow() && LIZ3 != null && LIZ3.LJIIJJI()) {
            C30868C9o.LIZJ(R.string.ndx);
            return;
        }
        C47071t1 c47071t1 = new C47071t1(getContext());
        c47071t1.LJIILLIIL(R.string.ney);
        c47071t1.LJFF(R.string.nex);
        c47071t1.LJIIIIZZ(R.string.nev);
        c47071t1.LJIIL(R.string.neu, new IDcS172S0100000_13(this, 12));
        c47071t1.LJIJI = new C75948TrM(new AObjectS42S0101000_5(1, this, 47));
        LiveDialog LIZ4 = c47071t1.LIZ();
        if (new C03880Dg(2).LIZJ(300000, "com/bytedance/android/live/design/app/LiveDialog", "show", LIZ4, new Object[0], "void", new C65300Pk0(false, "()V", "8714133310554461678")).LIZ) {
            return;
        }
        LIZ4.show();
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStopTrackingTouch(SeekBar seekBar) {
        if (this.LLJL) {
            C75460TjU.LIZLLL(this.LLILII, "video_anchor_connect_detail");
            this.LLJL = false;
        }
    }

    public final void wl(List<LiveEffect> list) {
        C0NB.LJIIIZ(LLJZ, C16880lQ.LLLZ("initStickerRecyclerView liveEffects=%s", new Object[]{list.toString()}));
        if (list.isEmpty()) {
            list.add(new LiveEffect());
            return;
        }
        ListProtector.add(list, 0, new LiveEffect());
        this.LLILZIL = new C76535U1z(getContext(), list, new C74910Tac(this), true, this.LLJ);
        RecyclerView recyclerView = this.LJZI;
        if (recyclerView != null) {
            getContext();
            recyclerView.setLayoutManager(new LinearLayoutManager(0, false));
            this.LJZI.setAdapter(this.LLILZIL);
            if (LinkMicMultiGuestV3BeautyControlGroupAppLogSetting.INSTANCE.getValue()) {
                this.LLIILII = new C76104Tts(0, this.LJZI, new AObjectS89S0101000_13(0, this, 0));
            }
        }
    }

    public static void xl(GuestMediaManageFragment guestMediaManageFragment, LiveDialog liveDialog) {
        String vl = guestMediaManageFragment.vl();
        C74824TYe.LIZ.LJJIJ(String.valueOf(((C29374Bfu) B83.LIZ().LIZIZ()).getCurrentUserId()));
        C74913Taf.LIZ("Zoom/GuestMediaManageFragment", guestMediaManageFragment.mZoomService, vl);
        if (guestMediaManageFragment.mZoomService != null && !TextUtils.isEmpty(vl)) {
            guestMediaManageFragment.mZoomService.LJ(vl, new C74912Tae(guestMediaManageFragment, liveDialog), guestMediaManageFragment.LLJJLIIIJLLLLLLLZ, false, EnumC74929Tav.FROM_GUEST_MEDIA_MANAGE_FRAGMENT);
        } else {
            liveDialog.dismiss();
        }
    }

    public final void Dl(String str, boolean z) {
        C0NB.LJIIIZ(LLJZ, C16880lQ.LLLZ("switchCameraOnOrOff isVideoOn=%s source=%s", new Object[]{Boolean.valueOf(z), str}));
        if (this.LJLJJI == null) {
            return;
        }
        InterfaceC75441TjB R6 = C8E.LJ().R6();
        if (R6 != null) {
            R6.LIZLLL().LIZ(Boolean.valueOf(!z), str, "just for fake capture");
        }
        this.LJLJJI.LJIIJJI(C78857UxB.LJJIIJ(1476788234, "bpea-video_capture_in_preview_panel_switch_camera"), z);
    }

    public final void Gl(String str, boolean z) {
        C0NB.LJIIIZ(LLJZ, C16880lQ.LLLZ("switchPreview isVideoOn=%s", new Object[]{Boolean.valueOf(z)}));
        Dl(str, z);
        if (z) {
            View view = this.LJLLILLLL;
            if (view != null) {
                view.setBackground(C15380j0.LJI(R.drawable.d10));
            }
            View view2 = this.LJLLJ;
            if (view2 != null) {
                view2.setBackground(C15380j0.LJI(R.drawable.d00));
                this.LJLLJ.setEnabled(true);
            }
            C47061t0 c47061t0 = this.LJLJI;
            if (c47061t0 != null) {
                c47061t0.setVisibility(4);
            }
            C2A4 c2a4 = this.LJLJJLL;
            if (c2a4 != null) {
                c2a4.setVisibility(4);
                this.LJLJJLL.LJ();
            }
            ImageView imageView = this.LJLLI;
            if (imageView != null) {
                imageView.setVisibility(4);
                return;
            }
            return;
        }
        View view3 = this.LJLLILLLL;
        if (view3 != null) {
            view3.setBackground(C15380j0.LJI(R.drawable.d0y));
        }
        View view4 = this.LJLLJ;
        if (view4 != null) {
            view4.setBackground(C15380j0.LJI(R.drawable.czy));
            this.LJLLJ.setEnabled(false);
        }
        C47061t0 c47061t02 = this.LJLJI;
        if (c47061t02 != null) {
            c47061t02.setVisibility(0);
        }
        C2A4 c2a42 = this.LJLJJLL;
        if (c2a42 != null) {
            c2a42.setVisibility(0);
            this.LJLJJLL.LJII();
        }
        if (!this.LLIZ) {
            ImageModel avatarThumb = ((C29374Bfu) B83.LIZ().LIZIZ()).LIZIZ.getAvatarThumb();
            C31665Cbl.LJFF(this.LJLJI, avatarThumb, new C78739UvH(0.74698794f));
            ImageView imageView2 = this.LJLLI;
            C31665Cbl.LJIIJ(imageView2, avatarThumb, imageView2.getWidth(), this.LJLLI.getHeight(), R.drawable.cuk);
            this.LLIZ = true;
        }
        ImageView imageView3 = this.LJLLI;
        if (imageView3 == null) {
            return;
        }
        imageView3.setVisibility(0);
    }

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        C75211TfT c75211TfT = new C75211TfT(this.LLIIIJ, this.LJLJJI, this, new C74932Tay(this), this.LLJJJJLIIL);
        this.LLJJL = c75211TfT;
        c75211TfT.LIZ(true);
        C74614TQc.LIZ().LIZJ(view);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        InterfaceC74605TPt createLinkMicPreviewView;
        FrameLayout frameLayout;
        o.LJIIIZ(inflater, "inflater");
        C74614TQc.LIZ().LJ();
        C88207Yjb.LJIILIIL("multi_guest_guest_media_manage_page");
        String str = LLJZ;
        C0NB.LJIIIZ(str, C16880lQ.LLLZ("onCreateView: onCreateView=%s, container=%s, savedInstanceState=%s", new Object[]{inflater, viewGroup, bundle}));
        View LLLLIILL = C16880lQ.LLLLIILL(inflater, R.layout.d52, viewGroup, false);
        C74614TQc.LIZ().LIZLLL();
        C0NB.LJIIIZ(str, C16880lQ.LLLZ("findViewByID mRootView=%s", new Object[]{LLLLIILL}));
        this.LLFF = (ConstraintLayout) LLLLIILL.findViewById(R.id.i2w);
        this.LLF = (FrameLayout) LLLLIILL.findViewById(R.id.i2k);
        this.LJLJJL = LLLLIILL.findViewById(R.id.i1z);
        this.LJLJI = (C47061t0) LLLLIILL.findViewById(R.id.abo);
        this.LJLJJLL = (C2A4) LLLLIILL.findViewById(R.id.a_5);
        this.LJLLI = (ImageView) LLLLIILL.findViewById(R.id.abh);
        this.LJLLILLLL = LLLLIILL.findViewById(R.id.n8p);
        this.LJLLJ = LLLLIILL.findViewById(R.id.b3h);
        this.LJLLL = LLLLIILL.findViewById(R.id.hfh);
        this.LJLLLL = (TextView) LLLLIILL.findViewById(R.id.ahz);
        this.LJLLLLLL = (TextView) LLLLIILL.findViewById(R.id.kka);
        this.LJLZ = LLLLIILL.findViewById(R.id.el4);
        this.LJZ = (C31778Cda) LLLLIILL.findViewById(R.id.ahy);
        this.LJZI = (RecyclerView) LLLLIILL.findViewById(R.id.kj2);
        this.LJZL = (C47121t6) LLLLIILL.findViewById(R.id.a_6);
        this.LLD = (C2A7) LLLLIILL.findViewById(R.id.ayr);
        this.LL = LLLLIILL.findViewById(R.id.n99);
        this.LLFFF = (LiveIconView) LLLLIILL.findViewById(R.id.fhw);
        this.LLFII = LLLLIILL.findViewById(R.id.fny);
        this.LLFZ = (C76633U5t) LLLLIILL.findViewById(R.id.giw);
        this.LJLJL = (FrameLayout) LLLLIILL.findViewById(R.id.csl);
        this.LLI = (C76923UGx) LLLLIILL.findViewById(R.id.k5p);
        this.LLIFFJFJJ = (ConstraintLayout) LLLLIILL.findViewById(R.id.jkm);
        this.LLII = (FrameLayout) LLLLIILL.findViewById(R.id.a0e);
        this.LLIIIILZ = (FrameLayout) LLLLIILL.findViewById(R.id.kim);
        this.LLIIIJ = (C47121t6) LLLLIILL.findViewById(R.id.kk_);
        this.LLIIII = (FrameLayout) LLLLIILL.findViewById(R.id.kgi);
        this.LJLJLJ = (ViewGroup) LLLLIILL.findViewById(R.id.ap_);
        this.LJLJLLL = (Space) LLLLIILL.findViewById(R.id.gjg);
        this.LJLL = (ViewGroup) LLLLIILL.findViewById(R.id.fn0);
        C15580jK.LIZIZ(C15380j0.LIZ(8.0f), this.LLF);
        C15580jK.LIZIZ(C15380j0.LIZ(8.0f), this.LJLJJL);
        C15580jK.LIZIZ(C15380j0.LIZ(8.0f), this.LJLJI);
        C15580jK.LIZIZ(C15380j0.LIZ(8.0f), this.LL);
        C75559Tl5 c75559Tl5 = C75559Tl5.LIZIZ;
        c75559Tl5.LJ(this);
        MultiGuestDataHolder multiGuestDataHolder = this.LLJILJIL;
        if (multiGuestDataHolder != null && multiGuestDataHolder.LJ) {
            multiGuestDataHolder.LJ = false;
            DataChannel dataChannel = this.LLJ;
            if (dataChannel != null) {
                dataChannel.qv0(MultiLiveGuestMuteVideoEvent.class, new C74632TQu(false, "business_mute_open_manage_panel"));
            }
        }
        this.LLIILZL = new C0TV(C74740TUy.LIZLLL().LJI, C74740TUy.LIZLLL().LJI);
        InterfaceC06390Mx LIZ = CN1.LIZ(IEffectService.class);
        o.LJIIIIZZ(LIZ, "getService(T::class.java)");
        InterfaceC31981Ni createComposerManagerB = ((IEffectService) LIZ).createComposerManagerB();
        o.LJIIIIZZ(createComposerManagerB, "{\n                servic…rManagerB()\n            }");
        this.LLJJIJI = createComposerManagerB;
        createComposerManagerB.LJIJ(false);
        InterfaceC31981Ni composerManager = this.LLJJIJI;
        C0NB.LJIIIZ(str, "createAndAddSurfaceView");
        C24130x7 c24130x7 = new C24130x7();
        c24130x7.LIZ = this.LLILII;
        c24130x7.LIZIZ = this.LLILIL;
        c24130x7.LIZJ = C74740TUy.LIZLLL().LJI;
        c24130x7.LIZLLL = C74740TUy.LIZLLL().LJII;
        if (this.LLIL) {
            c24130x7.LJ = 0;
        } else {
            c24130x7.LJ = 1;
        }
        c24130x7.LJFF = this.LLIIZ;
        Context context = getContext();
        DataChannel dataChannel2 = this.LLJ;
        o.LJIIIZ(context, "context");
        o.LJIIIZ(dataChannel2, "dataChannel");
        o.LJIIIZ(composerManager, "composerManager");
        if (MultiGuestNaviAvatarSwitcherSetting.INSTANCE.isEnable() && c75559Tl5.LIZIZ("MULTI_GUEST_DATA_HOLDER") != null) {
            MultiGuestDataHolder multiGuestDataHolder2 = (MultiGuestDataHolder) c75559Tl5.LIZIZ("MULTI_GUEST_DATA_HOLDER");
            if (multiGuestDataHolder2 == null || (createLinkMicPreviewView = multiGuestDataHolder2.LJJIJIL) == null) {
                createLinkMicPreviewView = ((IBroadcastService) CN1.LIZ(IBroadcastService.class)).createLinkMicPreviewView(context, c24130x7, dataChannel2, composerManager);
            }
        } else {
            createLinkMicPreviewView = ((IBroadcastService) CN1.LIZ(IBroadcastService.class)).createLinkMicPreviewView(context, c24130x7, dataChannel2, composerManager);
        }
        this.LLJJ = createLinkMicPreviewView;
        InterfaceC24140x8 interfaceC24140x8 = (InterfaceC24140x8) createLinkMicPreviewView;
        this.LJLJJI = interfaceC24140x8;
        FrameLayout frameLayout2 = this.LLF;
        if (frameLayout2 != null && interfaceC24140x8 != null) {
            frameLayout2.post(new ARunnableS16S0201000_13(0, this, composerManager, 2));
        }
        InterfaceC24140x8 interfaceC24140x82 = this.LJLJJI;
        if (!C30784C6i.LIZJ()) {
            C75425Tiv c75425Tiv = new C75425Tiv(this.LLIFFJFJJ, this.LLII, this.LLIIII, this.LLF, (View) this.LJLJJI, this.LLFF, this.LJLJLLL, this.LJLL, this.LJLJL, this.LJLJLJ, new AObjectS50S0101000_5(0, this, 2));
            this.LLJJJJLIIL = c75425Tiv;
            c75425Tiv.LJIJ();
        }
        C29S c29s = null;
        if (C30784C6i.LIZJ()) {
            KL2.LJIILLIIL(8, this.LLIFFJFJJ);
            KL2.LJIILLIIL(8, this.LLII);
            KL2.LJIILLIIL(8, this.LLIIII);
            KL2.LJIILLIIL(8, this.LJLJL);
            KL2.LJIILLIIL(8, this.LLIIIILZ);
            KL2.LJIILLIIL(8, this.LJLLL);
            ViewGroup viewGroup2 = this.LJLJLJ;
            if (viewGroup2 != null) {
                viewGroup2.setPadding(0, C15380j0.LIZ(70.0f), 0, 0);
            }
        } else if (this.LLIIIL == null && (frameLayout = this.LJLJL) != null) {
            KL2.LJIILLIIL(0, frameLayout);
            KL2.LJIILLIIL(4, this.LJLLL);
            C74927Tat c74927Tat = this.LLJLL;
            C74921Tan c74921Tan = this.LLJLLIL;
            FrameLayout frameLayout3 = this.LLII;
            FrameLayout frameLayout4 = this.LLIIII;
            Integer valueOf = Integer.valueOf(R.id.kim);
            C75425Tiv c75425Tiv2 = this.LLJJJJLIIL;
            LiveEffect liveEffect = this.LLILIL;
            MultiGuestEffectSwitchFragment.LLI.getClass();
            this.LLIIIL = C75209TfR.LIZ(interfaceC24140x82, c74927Tat, true, c74921Tan, frameLayout3, frameLayout4, valueOf, c75425Tiv2, 1, "connection_status", liveEffect, false);
            FragmentManager childFragmentManager = getChildFragmentManager();
            C1B3 LIZ2 = C1B6.LIZ(childFragmentManager, childFragmentManager);
            LIZ2.LJIIJ(this.LLIIIL, null, R.id.csl);
            LIZ2.LJII();
            ConstraintLayout constraintLayout = this.LLFF;
            if (constraintLayout != null) {
                constraintLayout.setMaxHeight((int) (C15380j0.LJIIJJI() * 0.8d));
            }
        } else {
            KL2.LJIILLIIL(0, this.LJLLL);
            KL2.LJIILLIIL(8, this.LLIFFJFJJ);
            KL2.LJIILLIIL(8, this.LJLJL);
            if (LiveSdkMultiGuestLeakOptSetting.INSTANCE.isEnable()) {
                BU9.LIZ("connection_status");
            } else {
                BU9.LJ = new AObjectS26S0000000_13(1);
            }
        }
        this.LLFFF.setVisibility(0);
        this.LLD.setVisibility(0);
        this.LLJJIII = true;
        C16880lQ.LJJII(this.LLFFF, this);
        C16880lQ.LJJIII(this.LLD, this);
        C16880lQ.LJIIJ(this, this.LLFII);
        C16880lQ.LJIIJ(this, this.LJLLILLLL);
        C16880lQ.LJIIJ(this, this.LJLLJ);
        C16880lQ.LJIJI(this.LJLLLL, this);
        C16880lQ.LJIJI(this.LJLLLLLL, this);
        this.LJZ.setSeekbarListener(this);
        this.LJLJJLL.LJIIIIZZ(C15510jD.LJIIIZ(CFX.LIZ("tiktok_live_interaction_resource", "tiktok_live_interaction_demand_1"), "audio_interact_effect.webp"));
        this.LJLLL.post(new ARunnableS15S0101000_11(0, this, 8));
        this.LLILZ = ((IEffectService) CN1.LIZ(IEffectService.class)).stickerPresenter();
        this.LJZ.setCurrentProgress(this.LLILII);
        this.LLIZLLLIL = true;
        this.LLIZ = false;
        DataChannel dataChannel3 = this.LLJ;
        if (dataChannel3 != null) {
            dataChannel3.ov0(this, MultiLiveGuestMuteAudioEvent.class, new AObjectS42S0101000_5(0, this, 20));
            dataChannel3.ov0(this, MultiGuestAudioVolumeEvent.class, new AObjectS46S0101000_15(0, this, 0));
            dataChannel3.lv0(this, LinkReceiveEnlargeMessageEvent.class, new AObjectS46S0101000_15(0, this, 1));
            dataChannel3.lv0(this, MultiGuestStickerImageSelectedEvent.class, new AObjectS43S0101000_7(0, this, 1));
            dataChannel3.ov0(this, MicClickableEvent.class, new AObjectS45S0101000_13(0, this, 1));
        }
        this.LLFZ.setOnClickListener(new ViewOnClickListenerC13880ga(this));
        if (this.LLJILJIL != null) {
            StringBuilder LIZ3 = X1D.LIZ();
            LIZ3.append(" onCreateView isAudioEnable = ");
            FT5.LJ(LIZ3, this.LLJILJIL.LIZLLL, LIZ3, str);
        }
        C8E.LJ().e3(this.LLJLILLLLZIIL);
        Jl("onCreateView");
        C74740TUy.LIZLLL().LJIIL = C74740TUy.LIZLLL().LJFF;
        if (C74945TbB.LIZIZ(Boolean.FALSE)) {
            this.LLFFF.setIconAttr(R.attr.auc);
        }
        try {
        } catch (Throwable th) {
            th = th;
        }
        try {
            ViewTreeLifecycleOwner.set(LLLLIILL, getViewLifecycleOwner());
            ViewTreeViewModelStoreOwner.set(LLLLIILL, this);
            C10A.LIZIZ(LLLLIILL, this);
            ActivityC45651qj mo49getActivity = mo49getActivity();
            if (mo49getActivity instanceof C29S) {
                c29s = (C29S) mo49getActivity;
            }
            C90903hW.LIZ(c29s);
            C3C5.m7constructorimpl(C76800UCe.LIZ);
        } catch (Throwable th2) {
            th = th2;
            C3C5.m7constructorimpl(C141335gf.LIZ(th));
            return LLLLIILL;
        }
        return LLLLIILL;
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onProgressChanged(SeekBar seekBar, int i, boolean z) {
        if (i < 0 || i > seekBar.getMax() || !z) {
            return;
        }
        InterfaceC24140x8 interfaceC24140x8 = this.LJLJJI;
        if (interfaceC24140x8 != null) {
            interfaceC24140x8.LJIIIZ(i);
        }
        if (i != this.LLILII) {
            this.LLJL = true;
        }
        this.LLILII = i;
    }

    public static GuestMediaManageFragment Al(GuestMediaManagePanel guestMediaManagePanel, DataChannel dataChannel, Boolean bool, Boolean bool2, int i, LiveEffect liveEffect, Boolean bool3, Boolean bool4, int i2, LiveEffect liveEffect2, String str, String str2, MultiGuestDataHolder multiGuestDataHolder, String str3) {
        C0NB.LJIIIZ(LLJZ, C16880lQ.LLLZ("newInstance: dialog=%s,dataChannel=%s,isVideoSwitchOnBefore=%s,isUsingBackCameraBefore=%s,beautyLevelBefore=%s,stickerBefore=%s,isVideoSwitchOnWhenOpen=%s,isUsingBackCameraWhenOpen=%sbeautyLevelWhenOpen=%sstickerWhenOpen=%sopenSource=%sguestInviteType=%s", new Object[]{guestMediaManagePanel, dataChannel, bool, bool2, Integer.valueOf(i), liveEffect, bool3, bool4, Integer.valueOf(i2), liveEffect2, str, str2}));
        GuestMediaManageFragment guestMediaManageFragment = new GuestMediaManageFragment();
        guestMediaManageFragment.LLILLL = guestMediaManagePanel;
        guestMediaManageFragment.LLJ = dataChannel;
        guestMediaManageFragment.LLIIIZ = bool.booleanValue();
        guestMediaManageFragment.LLIIJI = bool2.booleanValue();
        guestMediaManageFragment.LLIIJLIL = i;
        guestMediaManageFragment.LLIIL = liveEffect;
        guestMediaManageFragment.LLIIZ = bool3.booleanValue();
        guestMediaManageFragment.LLIL = bool4.booleanValue();
        guestMediaManageFragment.LLILII = i2;
        guestMediaManageFragment.LLILIL = liveEffect2;
        guestMediaManageFragment.LLJJIJIL = str;
        guestMediaManageFragment.LLJJJ = str2;
        guestMediaManageFragment.LLJILJIL = multiGuestDataHolder;
        guestMediaManageFragment.LLJILJILJ = str3;
        return guestMediaManageFragment;
    }
}

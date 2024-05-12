package com.bytedance.android.livesdk.comp.impl.game.linkmic.fragment;

import X.ActivityC45651qj;
import X.AnonymousClass391;
import X.B83;
import X.C03880Dg;
import X.C0NB;
import X.C0NE;
import X.C10A;
import X.C113554cx;
import X.C141335gf;
import X.C15380j0;
import X.C15490jB;
import X.C15510jD;
import X.C15580jK;
import X.C15650jR;
import X.C16880lQ;
import X.C1DJ;
import X.C28733BPl;
import X.C29044Baa;
import X.C29306Beo;
import X.C29374Bfu;
import X.C29701Eo;
import X.C29S;
import X.C2A4;
import X.C2A7;
import X.C30868C9o;
import X.C31665Cbl;
import X.C3C5;
import X.C47061t0;
import X.C47121t6;
import X.C51029K0z;
import X.C64504PTg;
import X.C65300Pk0;
import X.C73318Sq2;
import X.C73411SrX;
import X.C74674TSk;
import X.C74740TUy;
import X.C74746TVe;
import X.C74748TVg;
import X.C74837TYr;
import X.C74838TYs;
import X.C75559Tl5;
import X.C76800UCe;
import X.C77125UOr;
import X.C77437UaH;
import X.C78720Uuy;
import X.C78739UvH;
import X.C78866UxK;
import X.C90903hW;
import X.CFX;
import X.DialogC77438UaI;
import X.EnumC74884TaC;
import X.InterfaceC74810TXq;
import X.OSZ;
import X.TT0;
import X.TTR;
import X.TTV;
import X.TVD;
import X.TWA;
import X.TWL;
import X.TY3;
import X.X1D;
import Y.AObjectS42S0101000_5;
import Y.IDCListenerS164S0100000_13;
import Y.IDCListenerS80S0000000_13;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.livesdk.LiveDialogFragment;
import com.bytedance.android.livesdk.comp.impl.game.linkmic.dialog.GameLinkGuestUserInfoDialog;
import com.bytedance.android.livesdk.comp.impl.game.linkmic.model.AnchorPermitGuestEvent;
import com.bytedance.android.livesdk.comp.impl.game.linkmic.model.ApplyTypeChangeEvent;
import com.bytedance.android.livesdk.comp.impl.game.linkmic.model.DialogPageChannel;
import com.bytedance.android.livesdk.comp.impl.game.linkmic.model.GameLinkGuestMuteAudioEvent;
import com.bytedance.android.livesdk.comp.impl.game.linkmic.model.GuestReplyAnchorEvent;
import com.bytedance.android.livesdk.comp.impl.game.linkmic.model.PreviewHasPermissionEvent;
import com.bytedance.android.livesdk.comp.impl.game.linkmic.model.RealGoLivePreviewDestroyEvent;
import com.bytedance.android.livesdk.comp.impl.game.linkmic.presenter.GameLinkGuestPresenter;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveTryModeCountDownThresholdSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.LinkMicMultiGuestV3BackgroundFixSetting;
import com.bytedance.android.livesdk.livesetting.other.LiveImageLoaderModuleSetting;
import com.bytedance.android.livesdk.model.message.linker.listchangemessage.LinkListUser;
import com.bytedance.android.livesdk.ui.BaseFragment;
import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.zhiliaoapp.musically.R;
import defpackage.t1;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes14.dex */
public class GameLinkPreviewFragment extends BaseFragment implements View.OnClickListener, InterfaceC74810TXq {
    public static final /* synthetic */ int LLILLIZIL = 0;
    public ViewGroup LJLIL;
    public C47061t0 LJLILLLLZI;
    public C29701Eo LJLJI;
    public C2A4 LJLJJI;
    public ImageView LJLJJL;
    public C47121t6 LJLJJLL;
    public C2A7 LJLJL;
    public ViewGroup LJLJLLL;
    public C47121t6 LJLL;
    public C47121t6 LJLLI;
    public View LJLLILLLL;
    public View LJLLJ;
    public FrameLayout LJLLL;
    public View LJLLLL;
    public ImageView LJLLLLLL;
    public ViewGroup LJLZ;
    public LiveDialogFragment LJZI;
    public TY3 LJZL;
    public boolean LL;
    public DataChannel LLD;
    public C73411SrX LLFF;
    public DialogC77438UaI LLFII;
    public TT0 LLI;
    public TTR LLIFFJFJJ;
    public int LLII;
    public int LLIIII;
    public boolean LLIIIILZ;
    public WeakReference<GameLinkGuestPresenter> LLIIIJ;
    public TWA LLILL;
    public Boolean LJLJLJ = Boolean.FALSE;
    public boolean LJZ = true;
    public final C73318Sq2 LLF = new C73318Sq2();
    public final Handler LLFFF = new Handler(C16880lQ.LLJJJJ());
    public final TVD LLFZ = TTV.LIZ();
    public boolean LLIIIL = false;
    public boolean LLIIIZ = false;
    public boolean LLIIJI = false;
    public boolean LLIIJLIL = false;
    public boolean LLIIL = false;
    public String LLIILII = "outside";
    public String LLIILZL = "is_cancel";
    public final long LLIIZ = System.currentTimeMillis();
    public C74748TVg LLIL = null;
    public String LLILII = "anchor_invite";
    public String LLILIL = "";

    @Override // X.InterfaceC74810TXq
    public final /* synthetic */ void LLILIL() {
    }

    @Override // X.InterfaceC74810TXq
    public final /* synthetic */ void LLLLIL() {
    }

    @Override // X.InterfaceC74810TXq
    public final /* synthetic */ void LLLLLLLZIL(Throwable th) {
    }

    @Override // X.InterfaceC74810TXq
    public final /* synthetic */ void LLLLZLLLI(Throwable th) {
    }

    public final boolean Al() {
        TT0 tt0 = this.LLI;
        if (tt0 == null) {
            return false;
        }
        Iterator it = tt0.LIZ().LJ().iterator();
        while (it.hasNext()) {
            if (((LinkListUser) it.next()).user.getId() == ((C29374Bfu) B83.LIZ().LIZIZ()).LIZIZ.getId()) {
                return true;
            }
        }
        return false;
    }

    public final boolean Dl() {
        String str = this.LLILII;
        if (str != null && str.equals("anchor_invite")) {
            return true;
        }
        return false;
    }

    public final boolean Gl() {
        String str = this.LLILII;
        if (str != null && str.equals("anchor_permit")) {
            return true;
        }
        return false;
    }

    public final void Ll() {
        DataChannel dataChannel;
        if (this.LLILL != TWA.GO_LIVE) {
            return;
        }
        if (this.LLIFFJFJJ != null && C74838TYs.LJ().LJJ >= this.LLIFFJFJJ.LJII() && !Al()) {
            C30868C9o.LIZJ(R.string.mij);
            LiveDialogFragment liveDialogFragment = this.LJZI;
            if (liveDialogFragment != null) {
                liveDialogFragment.dismiss();
            }
            WeakReference<GameLinkGuestPresenter> weakReference = this.LLIIIJ;
            if (weakReference != null && weakReference.get() != null) {
                this.LLIIIJ.get().exitInteractInNormalWay("leave_source_reply_pos_limit", false, 10012);
                return;
            }
            return;
        }
        C28733BPl.LJIILIIL().getClass();
        C0NE.LIZ("invite_issue_check", "replyAnchor");
        C74838TYs.LJ().LJIIIZ(true);
        TTV.LIZ().LJ = true;
        this.LJLJLJ = Boolean.TRUE;
        if (Gl()) {
            DataChannel dataChannel2 = this.LLD;
            if (dataChannel2 != null) {
                dataChannel2.pv0(AnchorPermitGuestEvent.class);
            }
        } else if (Dl() && (dataChannel = this.LLD) != null) {
            dataChannel.pv0(GuestReplyAnchorEvent.class);
        }
        vl();
    }

    /* JADX WARN: Removed duplicated region for block: B:67:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00b8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Pl() {
        /*
            Method dump skipped, instructions count: 616
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.comp.impl.game.linkmic.fragment.GameLinkPreviewFragment.Pl():void");
    }

    public final void onBackPressed() {
        if (this.LLILL == TWA.GO_LIVE) {
            return;
        }
        this.LLIILZL = "is_cancel";
        this.LLIILII = "return";
        DataChannel LJIILIIL = C51029K0z.LJIILIIL(this);
        if (LJIILIIL != null) {
            this.LLIIIL = true;
            EnumC74884TaC enumC74884TaC = EnumC74884TaC.GUEST_USER_INFO;
            enumC74884TaC.setGoNextPage(false);
            LJIILIIL.rv0(DialogPageChannel.class, enumC74884TaC);
        }
    }

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        String str;
        long j;
        String str2;
        super.onDestroy();
        this.LJLJI.cancelAnimation();
        this.LJLJJI.LJ();
        this.LLF.LIZLLL();
        this.LLFFF.removeCallbacksAndMessages(null);
        vl();
        DataChannel dataChannel = this.LLD;
        if (dataChannel != null) {
            dataChannel.qv0(ApplyTypeChangeEvent.class, TWA.SEND_REQUEST);
        }
        if ((!this.LLIIIZ || this.LLILL != TWA.GO_LIVE) && this.LLD != null && this.LJLJLJ.booleanValue()) {
            this.LLD.pv0(RealGoLivePreviewDestroyEvent.class);
        }
        this.LLIIJI = false;
        this.LLIIJLIL = false;
        this.LLIIL = false;
        TVD tvd = this.LLFZ;
        if (tvd != null) {
            TWL twl = TWL.LIZ;
            String str3 = tvd.LJJ;
            LiveEffect liveEffect = C74740TUy.LIZLLL().LJFF;
            long j2 = C74740TUy.LIZLLL().LJ;
            int i = !this.LLFZ.LJIIIIZZ ? 1 : 0;
            String closeWay = this.LLIILII;
            String closeReason = this.LLIILZL;
            long currentTimeMillis = System.currentTimeMillis() - this.LLIIZ;
            o.LJIIIZ(closeWay, "closeWay");
            o.LJIIIZ(closeReason, "closeReason");
            HashMap hashMap = new HashMap();
            if (str3 == null) {
                str = "others";
            } else if (o.LJ(str3, "apply")) {
                str = "guest_apply_anchor";
            } else if (o.LJ(str3, "invite")) {
                str = "anchor_invite_guest";
            } else {
                str = str3;
            }
            hashMap.put("guest_invite_type", str);
            Room room = (Room) DataChannelGlobal.LJLJJI.mv0(C29044Baa.class);
            if (room != null) {
                String idStr = room.getIdStr();
                o.LJIIIIZZ(idStr, "room.idStr");
                hashMap.put("room_id", idStr);
                hashMap.put("anchor_id", String.valueOf(room.getOwnerUserId()));
                t1.LJ((C29374Bfu) B83.LIZ().LIZIZ(), hashMap, "guest_id");
            }
            if (liveEffect != null) {
                j = liveEffect.effectId;
            } else {
                j = 0;
            }
            C64504PTg.LIZJ(j, hashMap, "props_id", j2, "enhance_level");
            hashMap.put("mic_status", String.valueOf(i ^ 1));
            hashMap.put("camera_status", String.valueOf(0));
            hashMap.put("camera_type", "off");
            hashMap.put("close_way", closeWay);
            hashMap.put("close_reason", closeReason);
            if (str3 == null) {
                str2 = "click_icon";
            } else if (o.LJ(str3, "apply")) {
                str2 = "accepted_apply";
            } else if (o.LJ(str3, "invite")) {
                str2 = "receive_invitation";
            } else {
                str2 = "";
            }
            AnonymousClass391.LJFF(hashMap, "open_reason", str2, currentTimeMillis, "stay_duration");
            TWL.LIZLLL(twl, hashMap);
            TWL.LJIL("livesdk_guest_connection_preview_panel_close", hashMap);
        }
    }

    public final void vl() {
        if (!this.LLF.LJLILLLLZI) {
            this.LLF.dispose();
        }
        C29306Beo.LJJJJI(this.LLFF);
    }

    public GameLinkPreviewFragment() {
        C75559Tl5.LIZIZ.LJ(this);
    }

    public final boolean Hl() {
        if (C74740TUy.LIZLLL().LJ() && !Dl() && !Gl()) {
            return true;
        }
        return false;
    }

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
        C0NB.LJ("GameLinkPreviewFragment", "onPause");
        if (!LinkMicMultiGuestV3BackgroundFixSetting.INSTANCE.getValue()) {
            C0NB.LJ("GameLinkPreviewFragment", "doPauseActionFromOnPause");
            wl();
        }
    }

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        this.LLIIIL = false;
        C74837TYr.LJIIIZ(false, "camera_preview_view_show", new JSONObject());
        if (this.LLFZ != null) {
            if (Hl()) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("setUpAudioStateWhenOnResume enable=");
                LIZ.append(this.LLFZ.LJIIIIZZ);
                LIZ.append(" ");
                LIZ.append(xl());
                C0NB.LJIIIZ("GameLinkPreviewFragment", X1D.LIZIZ(LIZ));
                if (this.LLFZ.LJIIIIZZ) {
                    Ol("business_mute_open_preview_panel");
                } else {
                    Nl("business_mute_open_preview_panel");
                }
            } else {
                boolean z = this.LLFZ.LJIIIIZZ;
                this.LJZ = z;
                Jl("business_mute_open_preview_panel", !z);
            }
        }
        this.LLIIIL = false;
        if (C74740TUy.LIZLLL().LJ() && this.LLIIJI && this.LLIIJLIL) {
            this.LLIIJI = false;
            this.LLIIJLIL = false;
            vl();
            Ll();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStop() {
        super.onStop();
        C0NB.LJ("GameLinkPreviewFragment", "onStop");
        if (LinkMicMultiGuestV3BackgroundFixSetting.INSTANCE.getValue()) {
            C0NB.LJ("GameLinkPreviewFragment", "doPauseActionFromOnStop");
            wl();
        }
    }

    public final void wl() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("isEnterFrontAndEngineOn: ");
        LIZ.append(false);
        C0NB.LJ("GameLinkPreviewFragment", X1D.LIZIZ(LIZ));
        if (!Hl() && !this.LLIIIL && !this.LLIIL && this.LLFZ != null) {
            this.LLIIJI = true;
        }
    }

    public final String xl() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(" isFromInvite=");
        LIZ.append(Dl());
        LIZ.append(" isFromPermit");
        LIZ.append(Gl());
        LIZ.append(" isGuestOnline");
        LIZ.append(Hl());
        return X1D.LIZIZ(LIZ);
    }

    @Override // X.InterfaceC74810TXq
    public final LiveDialogFragment getDialog() {
        return this.LJZI;
    }

    public final void Il(String str) {
        String str2 = this.LLILIL;
        OSZ[] oszArr = new OSZ[3];
        String str3 = TTV.LIZ().LJJ;
        if (str3 == null) {
            str3 = "others";
        }
        oszArr[0] = new OSZ("guest_invite_type", str3);
        oszArr[1] = new OSZ("click_type", str);
        if (str2 == null) {
            str2 = "";
        }
        oszArr[2] = new OSZ("tab", str2);
        Map LJJLIIIIJ = C113554cx.LJJLIIIIJ(oszArr);
        C1DJ.LIZIZ(LJJLIIIIJ);
        C1DJ.LIZ(LJJLIIIIJ);
        C77125UOr.LJ(LJJLIIIIJ);
        LJJLIIIIJ.put("enhance_level", CardStruct.IStatusCode.DEFAULT);
        C77125UOr.LJI(LJJLIIIIJ);
        C74746TVe.LJI("livesdk_guest_video_preview_page_click", LJJLIIIIJ);
    }

    public final void Nl(String str) {
        DataChannel dataChannel;
        this.LJZ = false;
        Jl(str, true);
        TVD tvd = this.LLFZ;
        if (tvd != null) {
            tvd.LJIIIIZZ = this.LJZ;
            if (Hl() && (dataChannel = this.LLD) != null) {
                dataChannel.qv0(GameLinkGuestMuteAudioEvent.class, new C74674TSk(this.LLFZ.LJIIIIZZ, str));
                return;
            }
            return;
        }
        C0NB.LJIIIZ("GameLinkPreviewFragment", "mLinkDataHolder == null when switchAudio2Mute");
    }

    public final void Ol(String str) {
        DataChannel dataChannel;
        this.LJZ = true;
        Jl(str, false);
        TVD tvd = this.LLFZ;
        if (tvd != null) {
            tvd.LJIIIIZZ = this.LJZ;
            if (Hl() && (dataChannel = this.LLD) != null) {
                dataChannel.qv0(GameLinkGuestMuteAudioEvent.class, new C74674TSk(this.LLFZ.LJIIIIZZ, str));
            }
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int id = view.getId();
        if (id == R.id.fgr) {
            onBackPressed();
            return;
        }
        if (id == R.id.fhw) {
            Room room = (Room) DataChannelGlobal.LJLJJI.mv0(C29044Baa.class);
            if (room != null && room.getOwner() != null) {
                C74746TVe.LIZIZ("click", "cancel");
                C77437UaH c77437UaH = new C77437UaH(getContext());
                c77437UaH.LJI(R.string.n8v);
                c77437UaH.LIZIZ(R.string.n8t);
                c77437UaH.LIZJ(R.string.n8s, new IDCListenerS80S0000000_13(1), false);
                c77437UaH.LJ(R.string.n8u, new IDCListenerS164S0100000_13(this, 12), false);
                this.LLFII = c77437UaH.LIZ();
                C74746TVe.LIZIZ("show", CardStruct.IStatusCode.DEFAULT);
                C78866UxK.LJIJI(this.LLFII, 5, true, false, false, LiveTryModeCountDownThresholdSetting.DEFAULT);
                DialogC77438UaI dialogC77438UaI = this.LLFII;
                if (!new C03880Dg(2).LIZJ(300000, "com/bytedance/android/livesdk/dialog/LiveModalDialog", "show", dialogC77438UaI, new Object[0], "void", new C65300Pk0(false, "()V", "7798535758438511850")).LIZ) {
                    dialogC77438UaI.show();
                }
            }
            Il("cancel_link");
            return;
        }
        if (id == R.id.dxe) {
            this.LLIILZL = "connection";
            this.LLIILII = "confirm_icon";
            Ll();
            Il("go_live");
            return;
        }
        if (id != R.id.f6y) {
            return;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onClickMicBtn#isAudioSwitchOn ");
        LIZ.append(this.LJZ);
        LIZ.append(" to ");
        LIZ.append(!this.LJZ);
        LIZ.append(xl());
        C0NB.LJIIIZ("GameLinkPreviewFragment", X1D.LIZIZ(LIZ));
        if (this.LJZ) {
            Nl("business_mute_click_preview_panel");
        } else {
            Ol("business_mute_click_preview_panel");
        }
        TVD tvd = this.LLFZ;
        if (tvd != null) {
            TWL.LIZ.LJIIJ(0, tvd.LJJ, "preview_page", !tvd.LJIIIIZZ);
        }
        Il("switch_mute_setting");
    }

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, com.bytedance.android.live.design.resource.theme.LiveThemeAwareFragment, androidx.fragment.app.Fragment
    public final LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
        mo49getActivity();
        return onGetLayoutInflater;
    }

    public final void Jl(String str, boolean z) {
        ImageView imageView = this.LJLLLLLL;
        if (imageView == null) {
            return;
        }
        if (z) {
            C15490jB.LJ(imageView, CFX.LIZ("tiktok_live_link_mic", "tiktok_live_interaction_demand_1"), "ttlive_ic_microphone_slash.png");
        } else {
            C15490jB.LJ(imageView, CFX.LIZ("tiktok_live_link_mic", "tiktok_live_interaction_demand_1"), "ttlive_ic_microphone.png");
        }
    }

    public final void Ml(int i, View view) {
        if (view == null) {
            return;
        }
        view.setVisibility(i);
    }

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        Pl();
        TVD tvd = this.LLFZ;
        if (tvd == null) {
            return;
        }
        this.LLILIL = "audio";
        tvd.LJIILLIIL = 2;
        C74740TUy.LIZLLL().LJIIJJI = 2;
        this.LJLILLLLZI.setVisibility(0);
        this.LJLJJI.setVisibility(0);
        this.LJLJJI.LJII();
        if (!this.LL) {
            ImageModel LIZJ = this.LJZL.LIZJ();
            if (LiveImageLoaderModuleSetting.useImageModule()) {
                C78720Uuy LIZ = C15650jR.LIZ().LIZ(LIZJ.getUrls());
                LIZ.LIZIZ(0.74698794f);
                LIZ.LJIIJJI(this.LJLILLLLZI);
                C78720Uuy LIZ2 = C15650jR.LIZ().LIZ(LIZJ.getUrls());
                int width = this.LJLJJL.getWidth();
                int height = this.LJLJJL.getHeight();
                LIZ2.LJ = width;
                LIZ2.LJFF = height;
                LIZ2.LJIIIIZZ = R.drawable.cuk;
                LIZ2.LJIIJJI(this.LJLJJL);
            } else {
                C31665Cbl.LJFF(this.LJLILLLLZI, LIZJ, new C78739UvH(0.74698794f));
                ImageView imageView = this.LJLJJL;
                C31665Cbl.LJIIJ(imageView, LIZJ, imageView.getWidth(), this.LJLJJL.getHeight(), R.drawable.cuk);
            }
            this.LL = true;
        }
        this.LJLJJL.setVisibility(0);
        this.LJZL.LJFF(2);
        Ml(0, this.LJLJJLL);
        C47121t6 c47121t6 = this.LJLJJLL;
        if (c47121t6 == null || this.LLIL == null) {
            return;
        }
        c47121t6.setText(R.string.n9_);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        C29S c29s;
        o.LJIIIZ(inflater, "inflater");
        View LLLLIILL = C16880lQ.LLLLIILL(inflater, R.layout.d47, viewGroup, false);
        this.LJLIL = (ViewGroup) LLLLIILL.findViewById(R.id.i2w);
        this.LJLLL = (FrameLayout) LLLLIILL.findViewById(R.id.i2k);
        this.LJLILLLLZI = (C47061t0) LLLLIILL.findViewById(R.id.abo);
        this.LJLJI = (C29701Eo) LLLLIILL.findViewById(R.id.a_4);
        this.LJLJJI = (C2A4) LLLLIILL.findViewById(R.id.a_5);
        this.LJLJJL = (ImageView) LLLLIILL.findViewById(R.id.abh);
        this.LJLJJLL = (C47121t6) LLLLIILL.findViewById(R.id.a_6);
        this.LJLJL = (C2A7) LLLLIILL.findViewById(R.id.dxe);
        this.LJLJLLL = (ViewGroup) LLLLIILL.findViewById(R.id.fn0);
        this.LJLLI = (C47121t6) LLLLIILL.findViewById(R.id.mo6);
        this.LJLLILLLL = LLLLIILL.findViewById(R.id.fgr);
        this.LJLLJ = LLLLIILL.findViewById(R.id.fhw);
        this.LJLLLL = LLLLIILL.findViewById(R.id.cdz);
        this.LJLL = (C47121t6) LLLLIILL.findViewById(R.id.moe);
        this.LJLLLLLL = (ImageView) LLLLIILL.findViewById(R.id.f6y);
        this.LJLZ = (ViewGroup) LLLLIILL.findViewById(R.id.ap_);
        LLLLIILL.findViewById(R.id.gjg);
        C15580jK.LIZIZ(C15380j0.LIZ(8.0f), this.LJLLL);
        C15580jK.LIZIZ(C15380j0.LIZ(8.0f), this.LJLILLLLZI);
        this.LJZL.LIZIZ(this);
        C16880lQ.LJIIL(this.LJLIL, this);
        C16880lQ.LJIIJ(this, this.LJLLILLLL);
        C16880lQ.LJIIJ(this, this.LJLLJ);
        C16880lQ.LJJIII(this.LJLJL, this);
        C16880lQ.LJIILLIIL(this.LJLLLLLL, this);
        this.LJLJI.setVisibility(8);
        this.LJLJJI.LJIIIIZZ(C15510jD.LJIIIZ(CFX.LIZ("tiktok_live_interaction_resource", "tiktok_live_interaction_demand_1"), "audio_interact_effect.webp"));
        this.LJZL.LJ(C74740TUy.LIZLLL().LJIIIIZZ);
        this.LL = false;
        DataChannel dataChannel = this.LLD;
        if (dataChannel != null) {
            dataChannel.lv0(this, PreviewHasPermissionEvent.class, new AObjectS42S0101000_5(4, this, 58));
        }
        try {
            ViewTreeLifecycleOwner.set(LLLLIILL, getViewLifecycleOwner());
            ViewTreeViewModelStoreOwner.set(LLLLIILL, this);
            C10A.LIZIZ(LLLLIILL, this);
            ActivityC45651qj mo49getActivity = mo49getActivity();
            if (mo49getActivity instanceof C29S) {
                c29s = (C29S) mo49getActivity;
            } else {
                c29s = null;
            }
            C90903hW.LIZ(c29s);
            C3C5.m7constructorimpl(C76800UCe.LIZ);
        } catch (Throwable th) {
            C3C5.m7constructorimpl(C141335gf.LIZ(th));
        }
        return LLLLIILL;
    }

    public static GameLinkPreviewFragment Kl(GameLinkGuestUserInfoDialog gameLinkGuestUserInfoDialog, DataChannel dataChannel, TT0 tt0, TTR ttr, TY3 ty3, TWA twa, WeakReference weakReference, String str, C74748TVg c74748TVg) {
        GameLinkPreviewFragment gameLinkPreviewFragment = new GameLinkPreviewFragment();
        gameLinkPreviewFragment.LJZI = gameLinkGuestUserInfoDialog;
        gameLinkPreviewFragment.LLD = dataChannel;
        gameLinkPreviewFragment.LLI = tt0;
        gameLinkPreviewFragment.LLIFFJFJJ = ttr;
        gameLinkPreviewFragment.LJZL = ty3;
        gameLinkPreviewFragment.LLILL = twa;
        gameLinkPreviewFragment.LLILII = str;
        gameLinkPreviewFragment.LLIIIJ = weakReference;
        gameLinkPreviewFragment.LLIL = c74748TVg;
        return gameLinkPreviewFragment;
    }
}

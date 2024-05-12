package X;

import Y.AObjectS40S0201000_7;
import Y.AObjectS42S0101000_5;
import Y.AObjectS56S0101000_13;
import Y.ARunnableS15S0101000_11;
import Y.ARunnableS41S0100000_5;
import Y.AfS54S0200000_5;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.Pair;
import android.view.View;
import android.view.animation.Animation;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.ToolBarShareVisibleChannel;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.android.live.liveinteract.api.MultiGuestGuestShowSharePanelEvent;
import com.bytedance.android.live.liveinteract.api.MultiLiveInviteGuestChannel;
import com.bytedance.android.live.share.IShareService;
import com.bytedance.android.live.slot.ISlotService;
import com.bytedance.android.live.toolbar.BroadcastToolbarLoadEvent;
import com.bytedance.android.live.toolbar.BroadcastToolbarUnloadEvent;
import com.bytedance.android.live.toolbar.IToolbarService;
import com.bytedance.android.live.usermanage.IUserManageService;
import com.bytedance.android.livesdk.dataChannel.CommentCompressOnSmallEvent;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.dataChannel.RoomShareCountChannel;
import com.bytedance.android.livesdk.dataChannel.UserIsAnchorChannel;
import com.bytedance.android.livesdk.livesetting.comment.LiveCommentWidthOptSetting;
import com.bytedance.android.livesdk.livesetting.other.LiveRedDotOfflineEnableSetting;
import com.bytedance.android.livesdk.livesetting.roomfunction.LiveAnchorContactShareSetting;
import com.bytedance.android.livesdk.livesetting.roomfunction.LiveSharePanelSetting;
import com.bytedance.android.livesdk.livesetting.roomfunction.LiveTooltipAlogSetting;
import com.bytedance.android.livesdk.livesetting.watchlive.ShowAudienceDefinitionSelectionSetting;
import com.bytedance.android.livesdk.model.PromoteInfo;
import com.bytedance.android.livesdk.model.RoomAuthMessage;
import com.bytedance.android.livesdk.model.RoomAuthStatus;
import com.bytedance.android.livesdk.model.message.RoomUserSeqMessage;
import com.bytedance.android.livesdk.model.message.ShareGuideMessage;
import com.bytedance.android.livesdk.share.LiveShareDialog;
import com.bytedance.android.livesdk.share.ShareDialogOptSetting;
import com.bytedance.android.livesdk.watch.IWatchLiveService;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.host.IHostSetting;
import com.bytedance.android.livesdkapi.host.IHostShare;
import com.bytedance.android.livesdkapi.host.IHostUser;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.google.android.play.core.appupdate.u;
import com.ss.ugc.live.sdk.message.data.IMessage;
import com.ss.ugc.live.sdk.message.interfaces.IMessageManager;
import com.ss.ugc.live.sdk.message.interfaces.OnMessageListener;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import kotlin.jvm.internal.o;
import o3.IDaS468S0100000_5;
import o3.h0;

/* renamed from: X.Bnr, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C29867Bnr implements InterfaceViewOnClickListenerC30227Btf, OnMessageListener {
    public InterfaceC30237Btp LJLIL;
    public boolean LJLILLLLZI;
    public String LJLJI;
    public boolean LJLJJI;
    public Room LJLJJL;
    public AnimatorSet LJLJJLL;
    public ObjectAnimator LJLJL;
    public final LiveMode LJLJLJ;
    public final ActivityC45651qj LJLJLLL;
    public final Context LJLL;
    public DataChannel LJLLI;
    public final LifecycleOwner LJLLILLLL;
    public IMessageManager LJLLL;
    public LiveIconView LJLLLL;
    public ShareGuideMessage LJLLLLLL;
    public DialogFragment LJLZ;
    public boolean LJZ;
    public C2A8 LJZL;
    public C1Q4 LL;
    public int LLF;
    public final C73318Sq2 LJLLJ = new C73318Sq2();
    public boolean LJZI = false;
    public final int LLD = LiveSharePanelSetting.INSTANCE.getValue();
    public boolean LLFF = false;
    public int LLFFF = 0;
    public int LLFII = 0;
    public final int LLFZ = LiveTooltipAlogSetting.INSTANCE.getToolbarBehaviorDelay();
    public boolean LLI = false;

    @Override // X.InterfaceViewOnClickListenerC30227Btf
    public final /* synthetic */ void Ea(boolean z) {
    }

    @Override // X.InterfaceViewOnClickListenerC30227Btf
    public final /* synthetic */ void F() {
    }

    @Override // X.InterfaceViewOnClickListenerC30227Btf
    public final /* synthetic */ long LLJZ() {
        return 500L;
    }

    @Override // X.InterfaceViewOnClickListenerC30227Btf
    public final /* synthetic */ boolean LLLILZJ(View view) {
        return false;
    }

    @Override // X.InterfaceViewOnClickListenerC30227Btf
    public final /* synthetic */ void ei() {
    }

    @Override // X.InterfaceViewOnClickListenerC30227Btf
    public final /* synthetic */ void onHide() {
    }

    @Override // X.InterfaceViewOnClickListenerC30227Btf
    public final /* synthetic */ void onShow() {
    }

    @Override // X.InterfaceViewOnClickListenerC30227Btf
    public final /* synthetic */ boolean ud() {
        return true;
    }

    public final void LIZ() {
        Animation animation = this.LJLLLL.getAnimation();
        if (animation != null) {
            animation.cancel();
        }
        AnimatorSet animatorSet = this.LJLJJLL;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        ObjectAnimator objectAnimator = this.LJLJL;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
        this.LJLLLL.clearAnimation();
        LIZLLL();
    }

    public final void LJ() {
        Boolean bool;
        EnumC30204BtI enumC30204BtI;
        LiveIconView liveIconView;
        DataChannel dataChannel = this.LJLLI;
        if (dataChannel != null) {
            bool = (Boolean) dataChannel.kv0(BCW.class);
        } else {
            bool = Boolean.FALSE;
        }
        if (bool != null && !bool.booleanValue() && (liveIconView = this.LJLLLL) != null) {
            if (this.LLD == 0 || this.LJLJJI) {
                liveIconView.setIcon(R.drawable.d0d);
                return;
            } else {
                liveIconView.setIcon(this.LL);
                return;
            }
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("setDefaultIconView sharePanelSetting:");
        LIZ.append(this.LLD);
        LIZ.append(" mIsAnchor:");
        C19U.LIZJ(LIZ, this.LJLJJI, LIZ, "voice_chat");
        if (this.LLD == 0 || this.LJLJJI) {
            enumC30204BtI = EnumC30204BtI.SHARE;
        } else {
            enumC30204BtI = EnumC30204BtI.MORE;
        }
        Integer LIZ2 = C29893BoH.LIZ(enumC30204BtI);
        LiveIconView liveIconView2 = this.LJLLLL;
        if (liveIconView2 != null && LIZ2 != null) {
            liveIconView2.setIcon(LIZ2.intValue());
        }
        if (this.LJZI) {
            C2A8 c2a8 = this.LJZL;
            if (c2a8 != null && this.LLD != 0 && !this.LJLJJI) {
                c2a8.setText(R.string.n5a);
                this.LLF = -1;
                return;
            }
            return;
        }
        C2A8 c2a82 = this.LJZL;
        if (c2a82 == null) {
            return;
        }
        c2a82.setVisibility(8);
    }

    public final void LIZLLL() {
        LJ();
        this.LJLILLLLZI = false;
        this.LJLJI = null;
        this.LJLLLL.setScaleX(1.0f);
        this.LJLLLL.setScaleY(1.0f);
    }

    public final void LIZIZ(ShareGuideMessage shareGuideMessage) {
        Context context = this.LJLL;
        if (context != null) {
            this.LJLLLLLL = shareGuideMessage;
            if (this.LJLJJI) {
                Room room = this.LJLJJL;
                if ((room == null || room.getOwner() == null || !((IHostSetting) CN1.LIZ(IHostSetting.class)).Zi()) && this.LJLJLJ == LiveMode.VIDEO) {
                    LJFF(shareGuideMessage, 300);
                    return;
                }
                return;
            }
            if (this.LJLJJL != null) {
                C31951CgN LIZIZ = C31951CgN.LIZIZ(context);
                String idStr = this.LJLJJL.getIdStr();
                LIZIZ.getClass();
                this.LJLLJ.LIZ(AbstractC73672Svk.LJJIJIL(idStr).LJJIII(new C31953CgP(LIZIZ), false).LJJL(T16.LIZ()).LJJJ(C73969T1h.LIZIZ()).LJJJJZI(new AfS54S0200000_5(shareGuideMessage, this, 35)));
            }
        }
    }

    public final void LIZJ(Boolean bool) {
        String str;
        String str2;
        HashMap hashMap = new HashMap();
        if (bool.booleanValue()) {
            hashMap.put("request_page", "live_room");
            if (this.LJZ) {
                str2 = "more";
            } else {
                str2 = "detail_bottom_bar";
            }
            hashMap.put("position", str2);
            hashMap.put("have_red_dot", String.valueOf(C29306Beo.LJJIFFI(Boolean.valueOf(EnumC30204BtI.SHARE.isRedDotShowing(this.LJLLI))) ? 1 : 0));
            str = "anchor_share_click";
        } else {
            Integer num = (Integer) this.LJLLI.kv0(RoomShareCountChannel.class);
            if (num == null) {
                num = 0;
            }
            hashMap.put("share_num", num.toString());
            str = "user_share_click";
        }
        BZI LIZ = C28787BRn.LIZ(str);
        LIZ.LJIILLIIL(this.LJLLI);
        LIZ.LJIJJ(C28509BGv.LIZ(this.LJLJJL.getStreamType()), "live_type");
        LIZ.LJJIFFI(hashMap);
        LIZ.LJJIIJZLJL();
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        String str;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        int i;
        EnumC30736C4m enumC30736C4m;
        RoomAuthStatus roomAuthStatus;
        Room room;
        if (C29306Beo.LJJII(this.LJLLI)) {
            LIZJ(Boolean.TRUE);
            BPM bpm = new BPM();
            bpm.LIZJ = R.string.mdd;
            bpm.LIZIZ = "pm_liveTryMode_tryModePage_shareToast";
            bpm.LJFF = this.LJLLI;
            bpm.LIZLLL = true;
            C30868C9o.LJII(bpm);
            return;
        }
        if (this.LJLJLLL == null || this.LJLJJL == null || !u.LJJIIJ()) {
            return;
        }
        DataChannel dataChannel = this.LJLLI;
        String str2 = "";
        if (dataChannel == null) {
            str = "";
        } else {
            str = (String) dataChannel.kv0(C28388BCe.class);
        }
        String LJFF = BJM.LJFF();
        String LJIIIIZZ = BJM.LJIIIIZZ();
        IHostSetting iHostSetting = (IHostSetting) CN1.LIZ(IHostSetting.class);
        if (this.LJLJJI && (room = this.LJLJJL) != null && room.getOwner() != null && iHostSetting.Zi()) {
            C30868C9o.LIZJ(R.string.o2m);
            return;
        }
        Room room2 = this.LJLJJL;
        String str3 = null;
        if (room2 != null && room2.getOwner() != null && this.LJLJJL.getOwner().getSecret() == 1 && LiveSharePanelSetting.INSTANCE.getValue() == 0) {
            C28555BIp c28555BIp = new C28555BIp(this.LJLJJL.getId(), this.LJLJJL.getOwnerUserId(), this.LJLJJL.getOwnerUserId(), this.LJLJJL.getOwner().getSecUid(), "anchor_profile", LJFF, LJIIIIZZ, str, "report_anchor", BJM.LJIILIIL(), C28835BTj.LIZIZ(null, this.LJLLI, "user_live_duration"));
            c28555BIp.LJJI = ((IUserManageService) CN1.LIZ(IUserManageService.class)).Ab0();
            ((IUserManageService) CN1.LIZ(IUserManageService.class)).Qp0(this.LJLL, c28555BIp);
            return;
        }
        C48459J0d<Boolean> c48459J0d = InterfaceC30442Bx8.u2;
        Boolean bool = Boolean.TRUE;
        c48459J0d.LIZ(bool);
        HashMap hashMap = new HashMap();
        hashMap.put("position", "detail_bottom_bar");
        hashMap.putAll(C28787BRn.LIZ("").LJIILJJIL());
        Room room3 = this.LJLJJL;
        C29929Bor LIZLLL = C29075Bb5.LIZLLL(room3, this.LJLLI, C29075Bb5.LIZIZ(room3.getOwner()), "live_room_share_button", hashMap);
        HashMap hashMap2 = new HashMap();
        Room room4 = this.LJLJJL;
        int i2 = 0;
        if (room4 != null && (roomAuthStatus = room4.mRoomAuthStatus) != null && roomAuthStatus.isEnablePromote()) {
            z = true;
        } else {
            z = false;
        }
        hashMap2.put("param_broadcast_room_auth_promote_bool", Boolean.valueOf(z));
        PromoteInfo promoteInfo = new PromoteInfo();
        Room room5 = this.LJLJJL;
        if (room5 != null) {
            RoomAuthStatus roomAuthStatus2 = room5.mRoomAuthStatus;
            if (roomAuthStatus2 != null) {
                promoteInfo.promoteOther = roomAuthStatus2.getPromoteOther();
            }
            RoomAuthMessage roomAuthMessage = this.LJLJJL.mRoomAuthMessage;
            if (roomAuthMessage != null) {
                promoteInfo.promoteOtherMessage = roomAuthMessage.promoteOtherMessage;
            }
        }
        hashMap2.put("param_audience_room_promote_info", promoteInfo);
        hashMap2.put("param_room", this.LJLJJL);
        hashMap2.put("toast_prompt", C15380j0.LJIILJJIL(R.string.nk1));
        if (this.LJLJJL.liveSubOnly != 1) {
            ISlotService iSlotService = (ISlotService) CN1.LIZ(ISlotService.class);
            if (this.LJLJJI) {
                enumC30736C4m = EnumC30736C4m.SLOT_BROADCAST_SHARE;
            } else {
                enumC30736C4m = EnumC30736C4m.SLOT_AUDIENCE_SHARE;
            }
            ((ArrayList) LIZLLL.LJIL).addAll(iSlotService.getLiveShareSheetAction(hashMap2, enumC30736C4m));
        }
        ((ArrayList) LIZLLL.LJIL).addAll(B9M.LIZ(this.LJLJLJ, this.LJLJJL, this.LJLLI, this.LJLJJI));
        boolean booleanValue = ((Boolean) this.LJLLI.kv0(BCW.class)).booleanValue();
        if (!booleanValue) {
            ((ArrayList) LIZLLL.LJIL).addAll(((IWatchLiveService) CN1.LIZ(IWatchLiveService.class)).IU(this.LJLLI, this.LJLJLJ));
            BZI LIZ = C28787BRn.LIZ("live_user_more");
            LIZ.LJIIZILJ();
            LIZ.LJJIIJZLJL();
        }
        LIZLLL.LJJIL = booleanValue;
        LIZLLL.LJJIZ = true;
        if (!this.LLFF) {
            EnumC30204BtI.SHARE.setRedDotVisible(this.LJLLI, false);
        } else {
            LIZLLL.LJJIFFI = "guest_window";
            this.LLFF = false;
        }
        LIZJ(Boolean.valueOf(this.LJLJJI));
        if (C28835BTj.LJII(this.LJLLI) != null) {
            str3 = C28835BTj.LJII(this.LJLLI).aid;
        }
        if (!this.LJLJJI) {
            if (this.LLD != 3) {
                this.LJLJJL.getOwner().getSecret();
            }
            this.LJLJJL.getOwner().getSecret();
            if (this.LJLJJL.getOwner().getSecret() == 1 && this.LLD != 0) {
                z3 = true;
            } else {
                z3 = false;
            }
            LIZLLL.LJJJJL = z3;
            if (this.LJLJJL.getOwner().getSecret() == 1 && this.LLD != 0) {
                z4 = true;
            } else {
                z4 = false;
            }
            LIZLLL.LJJJJLI = z4;
            if (this.LJLJJL.getOwner().getSecret() == 1 && this.LLD != 0) {
                z5 = true;
            } else {
                z5 = false;
            }
            LIZLLL.LJJJJLL = z5;
            if (this.LJLJJL.getOwner().getSecret() == 1 && this.LLD != 0) {
                i = R.string.n5c;
            } else {
                i = 0;
            }
            LIZLLL.LJJJJZ = i;
            if (this.LJLJJL.getOwner().getSecret() == 1 && this.LLD != 0) {
                str2 = this.LJLL.getString(R.string.n5d);
            }
            LIZLLL.LJJJJZI = str2;
        }
        LIZLLL.LJJIJIIJI = str3;
        LIZLLL.LJIJI = this.LJLJJL.getOwner().getSecUid();
        if (this.LJLJJL.liveSubOnly == 1) {
            z2 = true;
        } else {
            z2 = false;
        }
        LIZLLL.LJJIIJZLJL = z2;
        LIZLLL.LJJIJL = C28835BTj.LIZLLL(this.LJLLI);
        LIZLLL.LJJIJLIJ = C28835BTj.LJII(this.LJLLI);
        LIZLLL.LJJIJIL = ((IUserManageService) CN1.LIZ(IUserManageService.class)).Ab0();
        LIZLLL.LIZ(Boolean.valueOf(booleanValue), "show_cancel");
        C29930Bos c29930Bos = new C29930Bos(LIZLLL);
        DialogFragment dialogFragment = this.LJLZ;
        if (dialogFragment != null && dialogFragment.getDialog() != null && this.LJLZ.getDialog().isShowing()) {
            this.LJLZ.dismiss();
        }
        C29868Bns c29868Bns = new C29868Bns(this, c29930Bos);
        Boolean sharePanelRefactor = ((C29338BfK) ((IShareService) CN1.LIZ(IShareService.class)).un0()).LIZ.sharePanelRefactor();
        o.LJIIIIZZ(sharePanelRefactor, "getService(IShareService…re().sharePanelRefactor()");
        if (sharePanelRefactor.booleanValue() && booleanValue) {
            C14A c14a = AnonymousClass149.LIZ;
            if (!c14a.LIZLLL()) {
                this.LJLLI.rv0(ToolBarShareVisibleChannel.class, bool);
                ActivityC45651qj activity = this.LJLJLLL;
                o.LJIIIZ(activity, "activity");
                TuxSheet shareTuxSheet = ((C29338BfK) ((IShareService) CN1.LIZ(IShareService.class)).un0()).LIZ.getShareTuxSheet(activity, c29930Bos, c29868Bns);
                if (ShareDialogOptSetting.INSTANCE.getValue()) {
                    this.LJLZ = shareTuxSheet;
                }
                if (shareTuxSheet != null) {
                    if (c14a.LIZIZ == null) {
                        c14a.LIZIZ = new HashSet();
                    }
                    ((HashSet) c14a.LIZIZ).add(shareTuxSheet);
                    c29868Bns.LJLILLLLZI = new C29874Bny(i2, this, shareTuxSheet);
                }
            }
        } else {
            LiveShareDialog vl = LiveShareDialog.vl(c29930Bos, c29868Bns);
            this.LJLZ = vl;
            ActivityC45651qj activity2 = this.LJLJLLL;
            o.LJIIIZ(activity2, "activity");
            FragmentManager supportFragmentManager = activity2.getSupportFragmentManager();
            o.LJIIIIZZ(supportFragmentManager, "activity.supportFragmentManager");
            vl.show(supportFragmentManager, "LiveShareDialog");
            this.LJLLI.rv0(ToolBarShareVisibleChannel.class, bool);
            vl.setOnDismissListener(new DialogInterfaceOnDismissListenerC29873Bnx(0, this));
        }
        if (this.LJLILLLLZI && !C38354F3m.LJ(this.LJLJI)) {
            BZI LIZ2 = C28787BRn.LIZ("livesdk_share_button_click");
            LIZ2.LJIILLIIL(this.LJLLI);
            LIZ2.LJIJJ(this.LJLJI, "share_platform");
            LIZ2.LJJIIJZLJL();
        }
        if (this.LJLILLLLZI && this.LJLJJI) {
            J9A.LIZJ(C28787BRn.LIZ("livesdk_anchor_share_button_click"), this.LJLLI, "chat_merge", "share_platform");
        }
        if (this.LJLILLLLZI) {
            LIZ();
        }
        if (!this.LJLJJI) {
            C70657RoD.LJJI(0.001d, new AObjectS56S0101000_13(1, this, 0));
        }
        C31951CgN.LIZIZ(view.getContext()).LIZJ(this.LJLJJL.getId(), this.LJLJJL.getIdStr());
    }

    @Override // com.ss.ugc.live.sdk.message.interfaces.OnMessageListener
    public final void onMessage(IMessage iMessage) {
        if (iMessage instanceof ShareGuideMessage) {
            if (this.LJLJJI && LiveAnchorContactShareSetting.INSTANCE.getValue().LIZIZ().booleanValue()) {
                LIZIZ((ShareGuideMessage) iMessage);
                return;
            }
            return;
        }
        if (!(iMessage instanceof RoomUserSeqMessage) || ((RoomUserSeqMessage) iMessage).mTotal <= 100 || !this.LJLILLLLZI) {
            return;
        }
        LIZ();
    }

    public final void LJFF(ShareGuideMessage shareGuideMessage, int i) {
        C29889BoD c29889BoD;
        Context context = this.LJLL;
        String str = null;
        if (context != null) {
            c29889BoD = C29889BoD.LIZIZ(context);
        } else {
            c29889BoD = null;
        }
        String str2 = "";
        if (c29889BoD != null) {
            str = (String) c29889BoD.LIZLLL("live.mt.lastest.share.channel", EnumC29921Boj.STRING, "");
        }
        if (((IHostShare) CN1.LIZ(IHostShare.class)).isImChannel(str)) {
            ((IHostShare) CN1.LIZ(IHostShare.class)).getUrlModelAndShowAnim(new C29876Bo0(this, i));
            return;
        }
        Pair<String, Drawable> breathShareAnimShareRes = ((IHostShare) CN1.LIZ(IHostShare.class)).getBreathShareAnimShareRes(this.LJLJLLL, str, shareGuideMessage.shareChannel);
        if (breathShareAnimShareRes != null) {
            if (!C38354F3m.LJ((String) breathShareAnimShareRes.first)) {
                str2 = (String) breathShareAnimShareRes.first;
            }
            this.LJLJI = str2;
            Drawable drawable = (Drawable) breathShareAnimShareRes.second;
            if (drawable == null) {
                return;
            }
            C29917Bof.LIZ().LIZ(new C29870Bnu(this, drawable, i));
        }
    }

    @Override // X.InterfaceViewOnClickListenerC30227Btf
    public final void Q4(InterfaceC30237Btp interfaceC30237Btp, DataChannel dataChannel) {
        LIZ();
        IMessageManager iMessageManager = this.LJLLL;
        if (iMessageManager != null) {
            iMessageManager.removeMessageListener(this);
        }
        dataChannel.qv0(BroadcastToolbarUnloadEvent.class, EnumC30204BtI.SHARE);
        dataChannel.jv0(this);
        AnimatorSet animatorSet = this.LJLJJLL;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        ObjectAnimator objectAnimator = this.LJLJL;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
        this.LJLLJ.LIZLLL();
        this.LJLLLLLL = null;
        this.LLI = false;
        if (interfaceC30237Btp.LJFF() != null) {
            interfaceC30237Btp.LJFF().setAccessibilityDelegate(null);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceViewOnClickListenerC30227Btf
    public final void i(InterfaceC30237Btp interfaceC30237Btp, DataChannel dataChannel) {
        String str;
        boolean z;
        LifecycleOwner lifecycleOwner;
        this.LJLLI = dataChannel;
        this.LJLIL = interfaceC30237Btp;
        boolean z2 = false;
        this.LLF = 0;
        this.LJLJJI = ((Boolean) dataChannel.kv0(UserIsAnchorChannel.class)).booleanValue();
        this.LJZI = Boolean.TRUE.equals(dataChannel.kv0(BNK.class));
        this.LJLJJL = (Room) dataChannel.kv0(RoomChannel.class);
        this.LJLLLL = (LiveIconView) interfaceC30237Btp.LIZ(R.id.ld4);
        if (LiveCommentWidthOptSetting.INSTANCE.isStrategyEnable()) {
            this.LJLLLL.post(new ARunnableS41S0100000_5(this, 235));
            Context context = this.LJLL;
            if (context instanceof LifecycleOwner) {
                lifecycleOwner = (LifecycleOwner) context;
            } else {
                lifecycleOwner = null;
            }
            dataChannel.ov0(lifecycleOwner, CommentCompressOnSmallEvent.class, new AObjectS42S0101000_5(1, this, 30));
        }
        if (this.LLD != 0) {
            C1Q4 LIZLLL = C259910h.LIZLLL(R.attr.at_, this.LJLL);
            this.LL = LIZLLL;
            if (LIZLLL != null) {
                LIZLLL.setTint(C259910h.LIZIZ(R.attr.bmu, this.LJLL));
            }
        }
        EnumC30204BtI enumC30204BtI = EnumC30204BtI.SHARE;
        dataChannel.qv0(BroadcastToolbarLoadEvent.class, enumC30204BtI);
        this.LJZ = ((IToolbarService) CN1.LIZ(IToolbarService.class)).pk(dataChannel).LJFF(enumC30204BtI);
        if (this.LJZI) {
            this.LJZL = (C2A8) interfaceC30237Btp.LIZ(R.id.ldm);
        }
        if (this.LJLJJI && (this.LJLJLJ == LiveMode.THIRD_PARTY || this.LJZ)) {
            this.LJLLLL.setIcon(R.drawable.d0b);
        } else {
            LJ();
        }
        this.LJLILLLLZI = false;
        if (!this.LJZ) {
            dataChannel.nv0(RoomShareCountChannel.class, this.LJLLILLLL, new AObjectS42S0101000_5(1, this, 16));
            IMessageManager iMessageManager = (IMessageManager) dataChannel.kv0(C29927Bop.class);
            this.LJLLL = iMessageManager;
            if (iMessageManager != null) {
                iMessageManager.addMessageListener(EnumC31509CYf.SHARE_GUIDE_MESSAGE.getIntType(), this);
                if (this.LJLJJI && this.LJLJLJ == LiveMode.VIDEO) {
                    this.LJLLL.addMessageListener(EnumC31509CYf.USER_SEQ.getIntType(), this);
                }
            }
            dataChannel.mv0(MultiLiveInviteGuestChannel.class, this, new AObjectS42S0101000_5(2, this, 28));
        }
        if (!this.LJLJJI) {
            dataChannel.mv0(MultiGuestGuestShowSharePanelEvent.class, this, new AObjectS40S0201000_7(0, this, interfaceC30237Btp, 3));
        }
        boolean isEnable = ShowAudienceDefinitionSelectionSetting.INSTANCE.isEnable();
        LiveRedDotOfflineEnableSetting liveRedDotOfflineEnableSetting = LiveRedDotOfflineEnableSetting.INSTANCE;
        if (!liveRedDotOfflineEnableSetting.getValue()) {
            Room room = this.LJLJJL;
            if (room != null && room.getStreamUrl() != null && this.LJLJJL.getStreamUrl().liveCoreSDKData != null && this.LJLJJL.getStreamUrl().liveCoreSDKData.getPullData() != null && this.LJLJJL.getStreamUrl().liveCoreSDKData.getPullData().getOptions() != null) {
                z = this.LJLJJL.getStreamUrl().liveCoreSDKData.getPullData().getOptions().showQualityButton;
            } else {
                z = false;
            }
            if (!this.LJLJJI && isEnable && z) {
                if (!liveRedDotOfflineEnableSetting.getValue() && !InterfaceC30442Bx8.LLLLZLLLI.LIZJ().booleanValue()) {
                    z2 = true;
                }
                enumC30204BtI.setRedDotVisible(dataChannel, z2);
            }
        }
        if (this.LJLJJI) {
            BZI LIZ = C28787BRn.LIZ("livesdk_anchor_share_show");
            LIZ.LJIILLIIL(dataChannel);
            if (this.LJZ) {
                str = "more";
            } else {
                str = "detail_bottom_bar";
            }
            LIZ.LJIJJ(str, "position");
            LIZ.LJIJJ(Integer.valueOf(C29306Beo.LJJIFFI(Boolean.valueOf(enumC30204BtI.isRedDotShowing(dataChannel))) ? 1 : 0), "have_red_dot");
            LIZ.LJJIIJZLJL();
        }
        if (!this.LLI) {
            this.LLI = true;
            B76.LIZJ((Room) this.LJLLI.kv0(RoomChannel.class), "share");
        }
        int i = this.LLD;
        if ((i == 2 || i == 3) && !InterfaceC30442Bx8.u2.LIZJ().booleanValue() && !((IHostUser) CN1.LIZ(IHostUser.class)).isNewUser() && !this.LJLJJI) {
            B73.LIZ().postDelayed(new ARunnableS15S0101000_11(2, interfaceC30237Btp, 8), this.LLFZ);
        }
        View LJFF = interfaceC30237Btp.LJFF();
        if (LJFF != null) {
            h0.LJIJI(LJFF, new IDaS468S0100000_5(this, 4));
        }
    }

    public C29867Bnr(ActivityC45651qj activityC45651qj, Context context, LiveMode liveMode, LifecycleOwner lifecycleOwner) {
        this.LJLJLLL = activityC45651qj;
        this.LJLL = context;
        this.LJLJLJ = liveMode;
        this.LJLLILLLL = lifecycleOwner;
    }
}

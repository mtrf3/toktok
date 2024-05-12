package Y;

import X.BAI;
import X.BAP;
import X.BIK;
import X.BVA;
import X.BWG;
import X.BZI;
import X.C06490Nh;
import X.C0K7;
import X.C0N7;
import X.C1I;
import X.C28787BRn;
import X.C29352BfY;
import X.C29494Bhq;
import X.C30337BvR;
import X.C30439Bx5;
import X.C32041No;
import X.C32044Chs;
import X.C3C5;
import X.C51029K0z;
import X.C68322mC;
import X.C74751TVj;
import X.C76800UCe;
import X.C78847Ux1;
import X.C7N;
import X.CC3;
import X.CC4;
import X.CN1;
import X.HandlerC29100BbU;
import X.InterfaceC06390Mx;
import X.InterfaceC65784Pro;
import X.InterfaceC67352kd;
import X.InterfaceC88472Yns;
import X.X1D;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.bytedance.android.live.LiveModeChannel;
import com.bytedance.android.live.actionhandler.IActionHandlerService;
import com.bytedance.android.live.adminsetting.IAdminSettingService;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.broadcast.model.PopMsgContainer;
import com.bytedance.android.live.design.app.LiveDialog;
import com.bytedance.android.live.effect.api.IEffectService;
import com.bytedance.android.live.liveinteract.api.IInteractService;
import com.bytedance.android.live.liveinteract.multiguestv3.main.media.guest.previewv2.golive.MultiGuestGoLivePreviewFragment;
import com.bytedance.android.live.liveinteract.multiguestv3.main.media.guest.previewv2.golive.MultiGuestGoLivePreviewViewModel;
import com.bytedance.android.live.usermanage.IUserManageService;
import com.bytedance.android.livesdk.adminsetting.LiveCommercialContentToggleFragmentSheet;
import com.bytedance.android.livesdk.broadcast.ShouldDoubleCheckSafetyEducationStatus;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.interaction.poll.ui.giftwidget.AbsPollWidget;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveSafetyEducationSchema;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveAudienceLinkmicLowestAgeSetting;
import com.bytedance.android.livesdk.model.Hashtag;
import com.bytedance.android.livesdk.model.message.Question;
import com.bytedance.android.livesdk.moderator.removeself.ModeratorHostIModeratorListFragment;
import com.bytedance.android.livesdk.qa.CloseQuestionEvent;
import com.bytedance.android.livesdk.qa.QuestionCardWidget;
import com.bytedance.android.livesdk.qa.QuestionEx;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import defpackage.i0;
import java.util.List;
import kotlin.jvm.internal.AqS136S0200000_5;
import kotlin.jvm.internal.AqS167S0100000_1;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public class IDcS93S0200000_5 implements C0K7 {
    public final int $t;
    public Object l0;
    public Object l1;

    @Override // X.C0K7
    public final void LJIILLIIL(LiveDialog liveDialog) {
        switch (this.$t) {
            case 0:
                LJIILLIIL$0(this, liveDialog);
                return;
            case 1:
                LJIILLIIL$1(this, liveDialog);
                return;
            case 2:
                LJIILLIIL$2(this, liveDialog);
                return;
            case 3:
                LJIILLIIL$3(this, liveDialog);
                return;
            case 4:
                LJIILLIIL$4(this, liveDialog);
                return;
            case 5:
                LJIILLIIL$5(this, liveDialog);
                return;
            case 6:
                LJIILLIIL$6(this, liveDialog);
                return;
            case 7:
                LJIILLIIL$7(this, liveDialog);
                return;
            case 8:
                LJIILLIIL$8(this, liveDialog);
                return;
            case 9:
                LJIILLIIL$9(this, liveDialog);
                return;
            case 10:
                LJIILLIIL$10(this, liveDialog);
                return;
            case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                LJIILLIIL$11(this, liveDialog);
                return;
            case 12:
                LJIILLIIL$12(this, liveDialog);
                return;
            case ABRConfig.ABR_STARTUP_MAX_BITRATE /* 13 */:
                LJIILLIIL$13(this, liveDialog);
                return;
            case 14:
                LJIILLIIL$14(this, liveDialog);
                return;
            case 15:
                LJIILLIIL$15(this, liveDialog);
                return;
            case LiveAudienceLinkmicLowestAgeSetting.DEFAULT /* 16 */:
                LJIILLIIL$16(this, liveDialog);
                return;
            case 17:
                LJIILLIIL$17(this, liveDialog);
                return;
            case 18:
                LJIILLIIL$18(this, liveDialog);
                return;
            default:
                return;
        }
    }

    public static final void LJIILLIIL$0(IDcS93S0200000_5 iDcS93S0200000_5, LiveDialog liveDialog) {
        String str;
        liveDialog.dismiss();
        DataChannel dataChannel = (DataChannel) iDcS93S0200000_5.l0;
        List<String> list = ((PopMsgContainer) iDcS93S0200000_5.l1).buttonContent;
        if (list != null) {
            str = (String) ListProtector.get(list, 0);
        } else {
            str = null;
        }
        C30337BvR.LIZIZ(dataChannel, str);
    }

    public static final void LJIILLIIL$1(IDcS93S0200000_5 iDcS93S0200000_5, LiveDialog liveDialog) {
        ((IActionHandlerService) CN1.LIZ(IActionHandlerService.class)).handle((Context) iDcS93S0200000_5.l0, LiveSafetyEducationSchema.INSTANCE.getValue());
        ((DataChannel) iDcS93S0200000_5.l1).rv0(ShouldDoubleCheckSafetyEducationStatus.class, Boolean.TRUE);
        C0N7.LJIL((DataChannel) iDcS93S0200000_5.l1, "verify");
        liveDialog.dismiss();
    }

    public static final void LJIILLIIL$10(IDcS93S0200000_5 iDcS93S0200000_5, LiveDialog liveDialog) {
        ((IInteractService) iDcS93S0200000_5.l0).Yl0(new BAP((InterfaceC65784Pro) iDcS93S0200000_5.l1));
        liveDialog.dismiss();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void LJIILLIIL$11(IDcS93S0200000_5 iDcS93S0200000_5, LiveDialog liveDialog) {
        int i;
        InterfaceC06390Mx LIZ = CN1.LIZ(IEffectService.class);
        o.LJIIIIZZ(LIZ, "getService(T::class.java)");
        ((IEffectService) LIZ).getLiveStickerLogManager();
        C32041No.LJIL();
        InterfaceC06390Mx LIZ2 = CN1.LIZ(IEffectService.class);
        o.LJIIIIZZ(LIZ2, "getService(T::class.java)");
        ((IEffectService) LIZ2).getLiveStickerLogManager();
        C32041No.LJIIJ();
        MultiGuestGoLivePreviewViewModel multiGuestGoLivePreviewViewModel = ((MultiGuestGoLivePreviewFragment) iDcS93S0200000_5.l0).LLIILII;
        if (multiGuestGoLivePreviewViewModel != null && multiGuestGoLivePreviewViewModel.ov0()) {
            i = 10047;
        } else {
            i = 10048;
        }
        MultiGuestGoLivePreviewViewModel multiGuestGoLivePreviewViewModel2 = ((MultiGuestGoLivePreviewFragment) iDcS93S0200000_5.l0).LLIILII;
        if (multiGuestGoLivePreviewViewModel2 != null) {
            multiGuestGoLivePreviewViewModel2.rv0(i, "leave_source_user_click_cancel_in_preview");
        }
        liveDialog.dismiss();
        ((MultiGuestGoLivePreviewFragment) iDcS93S0200000_5.l0).dismiss();
        C74751TVj.LIZIZ((String) ((C68322mC) iDcS93S0200000_5.l1).element, "click", "end_now");
    }

    public static final void LJIILLIIL$12(IDcS93S0200000_5 iDcS93S0200000_5, LiveDialog liveDialog) {
        ((QuestionCardWidget) iDcS93S0200000_5.l0).LLIIII((Question) iDcS93S0200000_5.l1);
        liveDialog.dismiss();
    }

    public static final void LJIILLIIL$13(IDcS93S0200000_5 iDcS93S0200000_5, LiveDialog liveDialog) {
        ((QuestionCardWidget) iDcS93S0200000_5.l0).LLIIII((Question) iDcS93S0200000_5.l1);
        liveDialog.dismiss();
    }

    public static final void LJIILLIIL$14(IDcS93S0200000_5 iDcS93S0200000_5, LiveDialog liveDialog) {
        C1I.LIZ.LIZ(1, new AqS136S0200000_5((BWG) iDcS93S0200000_5.l0, (Question) iDcS93S0200000_5.l1, 34));
        liveDialog.dismiss();
    }

    public static final void LJIILLIIL$15(IDcS93S0200000_5 iDcS93S0200000_5, LiveDialog liveDialog) {
        ((BVA) iDcS93S0200000_5.l0).L((QuestionEx) iDcS93S0200000_5.l1);
        liveDialog.dismiss();
    }

    public static final void LJIILLIIL$16(IDcS93S0200000_5 iDcS93S0200000_5, LiveDialog liveDialog) {
        ((InterfaceC65784Pro) iDcS93S0200000_5.l0).invoke();
        liveDialog.dismiss();
        CC3.LIZIZ(((AbsPollWidget) iDcS93S0200000_5.l1).dataChannel, CC4.LIZ, 1);
    }

    public static final void LJIILLIIL$17(IDcS93S0200000_5 iDcS93S0200000_5, LiveDialog liveDialog) {
        liveDialog.dismiss();
        InterfaceC67352kd interfaceC67352kd = (InterfaceC67352kd) iDcS93S0200000_5.l0;
        Boolean bool = Boolean.FALSE;
        C3C5.m7constructorimpl(bool);
        interfaceC67352kd.resumeWith(bool);
        C78847Ux1.LJJJJJ(((BIK) iDcS93S0200000_5.l1).LIZIZ, "click_go_live");
    }

    public static final void LJIILLIIL$18(IDcS93S0200000_5 iDcS93S0200000_5, LiveDialog liveDialog) {
        LiveMode liveMode;
        FragmentManager fragmentManager;
        liveDialog.dismiss();
        InterfaceC67352kd interfaceC67352kd = (InterfaceC67352kd) iDcS93S0200000_5.l0;
        Boolean bool = Boolean.TRUE;
        C3C5.m7constructorimpl(bool);
        interfaceC67352kd.resumeWith(bool);
        C78847Ux1.LJJJJJ(((BIK) iDcS93S0200000_5.l1).LIZIZ, "click_remove");
        IAdminSettingService iAdminSettingService = (IAdminSettingService) CN1.LIZ(IAdminSettingService.class);
        DataChannel dataChannel = ((BIK) iDcS93S0200000_5.l1).LIZIZ;
        if (dataChannel != null) {
            liveMode = (LiveMode) dataChannel.kv0(LiveModeChannel.class);
        } else {
            liveMode = null;
        }
        LiveCommercialContentToggleFragmentSheet e80 = iAdminSettingService.e80(liveMode, C30439Bx5.LIZ(((BIK) iDcS93S0200000_5.l1).LIZIZ), C30439Bx5.LIZIZ(((BIK) iDcS93S0200000_5.l1).LIZIZ), false);
        if (e80 != null) {
            DataChannel dataChannel2 = ((BIK) iDcS93S0200000_5.l1).LIZIZ;
            if (dataChannel2 != null) {
                fragmentManager = (FragmentManager) dataChannel2.kv0(C29494Bhq.class);
            } else {
                fragmentManager = null;
            }
            C32044Chs.LJIIJ(fragmentManager, e80, "live_commercial_content_toggle", null);
        }
    }

    public static final void LJIILLIIL$2(IDcS93S0200000_5 iDcS93S0200000_5, LiveDialog liveDialog) {
        C29352BfY c29352BfY = (C29352BfY) iDcS93S0200000_5.l0;
        Context context = (Context) iDcS93S0200000_5.l1;
        c29352BfY.LJLILLLLZI.LJI = false;
        liveDialog.dismiss();
        c29352BfY.LJJIFFI(c29352BfY.LJLILLLLZI, context);
        c29352BfY.LJLILLLLZI.LJI = true;
    }

    public static final void LJIILLIIL$3(IDcS93S0200000_5 iDcS93S0200000_5, LiveDialog liveDialog) {
        long j;
        Room room;
        ((ModeratorHostIModeratorListFragment) iDcS93S0200000_5.l0).vl("confirm");
        ModeratorHostIModeratorListFragment moderatorHostIModeratorListFragment = (ModeratorHostIModeratorListFragment) iDcS93S0200000_5.l0;
        User user = (User) iDcS93S0200000_5.l1;
        moderatorHostIModeratorListFragment.getClass();
        DataChannel LJIILIIL = C51029K0z.LJIILIIL(moderatorHostIModeratorListFragment);
        if (LJIILIIL != null && (room = (Room) LJIILIIL.kv0(RoomChannel.class)) != null) {
            j = room.getId();
        } else {
            j = -1;
        }
        ((IUserManageService) CN1.LIZ(IUserManageService.class)).Z20(user.getId(), j, moderatorHostIModeratorListFragment.LJLILLLLZI);
        liveDialog.dismiss();
    }

    public static final void LJIILLIIL$4(IDcS93S0200000_5 iDcS93S0200000_5, LiveDialog liveDialog) {
        String str;
        long j;
        Long l;
        String str2;
        liveDialog.dismiss();
        Hashtag hashtag = ((HandlerC29100BbU) iDcS93S0200000_5.l0).LJIIJ;
        if (hashtag != null && (str2 = hashtag.title) != null) {
            str = ujb.o.LJJJJZ(str2, "&", "%26", false);
        } else {
            str = "";
        }
        Hashtag hashtag2 = ((HandlerC29100BbU) iDcS93S0200000_5.l0).LJIIJ;
        if (hashtag2 != null && (l = hashtag2.id) != null) {
            j = l.longValue();
        } else {
            j = 0;
        }
        StringBuilder LIZJ = C06490Nh.LIZJ("source_params={\"hashtag_title\":\"", str, "\",\"hashtag_id\":", j);
        LIZJ.append(",\"showApplyDialog\":1,\"request_from\":oneTapGoLive}");
        C7N.LJIIJJI().handleSchema((Activity) iDcS93S0200000_5.l1, i0.LJFF("sslocal://openRecord?enter_from=direct_shoot&tab=live&", X1D.LIZIZ(LIZJ)), new Bundle());
    }

    public static final void LJIILLIIL$5(IDcS93S0200000_5 iDcS93S0200000_5, LiveDialog liveDialog) {
        ((InterfaceC88472Yns) iDcS93S0200000_5.l0).invoke(Boolean.FALSE);
        DataChannel LJIILIIL = C51029K0z.LJIILIIL((Fragment) iDcS93S0200000_5.l1);
        BZI LIZ = C28787BRn.LIZ("livesdk_multi_pictionary_change_popup_click");
        LIZ.LJIILLIIL(LJIILIIL);
        LIZ.LJIJJ("close", "click_type");
        LIZ.LJJIIJZLJL();
        liveDialog.dismiss();
    }

    public static final void LJIILLIIL$6(IDcS93S0200000_5 iDcS93S0200000_5, LiveDialog liveDialog) {
        ((InterfaceC88472Yns) iDcS93S0200000_5.l0).invoke(Boolean.FALSE);
        BAI.LJIIJ((DataChannel) iDcS93S0200000_5.l1, "QA", false);
        liveDialog.dismiss();
    }

    public static final void LJIILLIIL$7(IDcS93S0200000_5 iDcS93S0200000_5, LiveDialog liveDialog) {
        DataChannel dataChannel = (DataChannel) iDcS93S0200000_5.l0;
        if (dataChannel != null) {
            dataChannel.qv0(CloseQuestionEvent.class, new AqS167S0100000_1((InterfaceC88472Yns) iDcS93S0200000_5.l1, (InterfaceC88472Yns<? super FrameLayout, C76800UCe>) 283));
        }
        BAI.LJIIJ((DataChannel) iDcS93S0200000_5.l0, "QA", true);
        liveDialog.dismiss();
    }

    public static final void LJIILLIIL$8(IDcS93S0200000_5 iDcS93S0200000_5, LiveDialog liveDialog) {
        ((InterfaceC88472Yns) iDcS93S0200000_5.l0).invoke(Boolean.FALSE);
        BAI.LJIIJ((DataChannel) iDcS93S0200000_5.l1, "poll", false);
        liveDialog.dismiss();
    }

    public static final void LJIILLIIL$9(IDcS93S0200000_5 iDcS93S0200000_5, LiveDialog liveDialog) {
        C1I.LIZ.LIZ(1, new AqS167S0100000_1((InterfaceC88472Yns) iDcS93S0200000_5.l1, (InterfaceC88472Yns<? super FrameLayout, C76800UCe>) 284));
        BAI.LJIIJ((DataChannel) iDcS93S0200000_5.l0, "poll", true);
        liveDialog.dismiss();
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public IDcS93S0200000_5(com.bytedance.ies.sdk.datachannel.DataChannel r2, X.InterfaceC88472Yns r3, int r4) {
        /*
            r1 = this;
            r1.$t = r4
            switch(r4) {
                case 6: goto Le;
                case 7: goto L5;
                case 8: goto Le;
                default: goto L5;
            }
        L5:
            r0 = r1
            r0.l0 = r2
            r0.l1 = r3
        La:
            r0.<init>()
            return
        Le:
            r0 = r1
            r0.l0 = r3
            r0.l1 = r2
            goto La
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.IDcS93S0200000_5.<init>(com.bytedance.ies.sdk.datachannel.DataChannel, X.Yns, int):void");
    }

    public IDcS93S0200000_5(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
    }

    public IDcS93S0200000_5(BVA bva, QuestionEx questionEx, int i, int i2) {
        this.$t = i2;
        this.l0 = bva;
        this.l1 = questionEx;
    }
}

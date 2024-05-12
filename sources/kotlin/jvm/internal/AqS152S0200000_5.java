package kotlin.jvm.internal;

import X.AbstractC32698CsQ;
import X.AbstractC65781Prl;
import X.ActivityC45651qj;
import X.B83;
import X.BAF;
import X.BQO;
import X.BTH;
import X.BZI;
import X.C03150Al;
import X.C04330Ez;
import X.C0NB;
import X.C0WZ;
import X.C141335gf;
import X.C15380j0;
import X.C15640jQ;
import X.C15650jR;
import X.C1Q4;
import X.C22810uz;
import X.C22820v0;
import X.C28212B5k;
import X.C28433BDx;
import X.C28477BFp;
import X.C28787BRn;
import X.C29044Baa;
import X.C29306Beo;
import X.C29356Bfc;
import X.C29374Bfu;
import X.C29377Bfx;
import X.C29522BiI;
import X.C29800Bmm;
import X.C29804Bmq;
import X.C2U8;
import X.C30466BxW;
import X.C30868C9o;
import X.C31371CSx;
import X.C31458CWg;
import X.C31646CbS;
import X.C31663Cbj;
import X.C32128CjE;
import X.C32129CjF;
import X.C32133CjJ;
import X.C32134CjK;
import X.C32279Clf;
import X.C32364Cn2;
import X.C32500CpE;
import X.C32785Ctp;
import X.C32799Cu3;
import X.C32800Cu4;
import X.C32801Cu5;
import X.C32802Cu6;
import X.C32804Cu8;
import X.C32816CuK;
import X.C32825CuT;
import X.C35201Zs;
import X.C3C5;
import X.C51029K0z;
import X.C55045Liz;
import X.C68322mC;
import X.C72242sW;
import X.C74074T5i;
import X.C75;
import X.C76732zl;
import X.C76800UCe;
import X.C78720Uuy;
import X.C86343Xud;
import X.CCW;
import X.CE3;
import X.CGW;
import X.CN1;
import X.CQK;
import X.CQQ;
import X.CR6;
import X.CSC;
import X.CSD;
import X.CT7;
import X.EnumC29609Bjh;
import X.F9J;
import X.InterfaceC22790ux;
import X.InterfaceC29405BgP;
import X.InterfaceC30442Bx8;
import X.InterfaceC31368CSu;
import X.InterfaceC31961Ng;
import X.InterfaceC65784Pro;
import X.InterfaceC88472Yns;
import X.O6R;
import X.ScaleGestureDetectorOnScaleGestureListenerC30428Bwu;
import X.UW7;
import X.WM7;
import X.XKX;
import Y.ARunnableS41S0100000_5;
import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.Drawable;
import android.os.CountDownTimer;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleOwnerKt;
import com.bytedance.android.live.actionhandler.IActionHandlerService;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.UrlModel;
import com.bytedance.android.live.base.model.user.BadgeStruct;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.android.live.gift.GiftStartSendEvent;
import com.bytedance.android.live.liveinteract.api.IInteractService;
import com.bytedance.android.live.liveinteract.multimatch.clientai.CoHostFriendNoticeService;
import com.bytedance.android.live.pin.widget.BaseCommentPinnedWidget;
import com.bytedance.android.livesdk.FastGiftCombEvent;
import com.bytedance.android.livesdk.RechargeExchangeCoinsDialogShowing;
import com.bytedance.android.livesdk.api.revenue.level.IUserLevelService;
import com.bytedance.android.livesdk.broadcast.preview.widget.PreviewStickerHelper;
import com.bytedance.android.livesdk.broadcast.preview.widget.PreviewSubscriptionWidget;
import com.bytedance.android.livesdk.broadcast.preview.widget.partnership.GameDropsPreviewBanner;
import com.bytedance.android.livesdk.broadcast.trymode.TryModeBroadcastInteractionFragment;
import com.bytedance.android.livesdk.broadcast.video.VideoBroadcastInteractionFragment;
import com.bytedance.android.livesdk.chatroom.viewmodule.NewTopRightBannerWidget;
import com.bytedance.android.livesdk.dataChannel.MockGiftPollEvent;
import com.bytedance.android.livesdk.dataChannel.UserIsAnchorChannel;
import com.bytedance.android.livesdk.gift.base.platform.core.manager.GiftManager;
import com.bytedance.android.livesdk.gift.model.SendGiftResult;
import com.bytedance.android.livesdk.impl.revenue.starcomment.paymentdialog.StarCommentPaymentDialog;
import com.bytedance.android.livesdk.impl.revenue.subscription.ui.setting.SubscriptionSettingFragmentNew;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveInsertStickerSupportForDifferentScenesSetting;
import com.bytedance.android.livesdk.livesetting.clientai.CohostNoticeStrategySettings;
import com.bytedance.android.livesdk.livesetting.level.UserLevelSettings;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveAudienceLinkmicLowestAgeSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.TTliveAnchorDeviceScoreSetting;
import com.bytedance.android.livesdk.livesetting.other.LiveLogMonitorSampleSetting;
import com.bytedance.android.livesdk.livesetting.performance.BuriedFieldReductionSetting;
import com.bytedance.android.livesdk.livesetting.performance.RoomSlowFunctionOptSetting;
import com.bytedance.android.livesdk.livesetting.starcomment.LiveStarCommentSchemaConfig;
import com.bytedance.android.livesdk.livesetting.subscription.LiveSubOnlyChatConfig;
import com.bytedance.android.livesdk.livesetting.subscription.SubscribeInvitationLynxUrlSetting;
import com.bytedance.android.livesdk.livesetting.watchlive.LiveDislikeVersion;
import com.bytedance.android.livesdk.model.Gift;
import com.bytedance.android.livesdk.model.GiftLockInfo;
import com.bytedance.android.livesdk.model.message.BannerInRoomCollection;
import com.bytedance.android.livesdk.model.message.ChatMessage;
import com.bytedance.android.livesdk.revenue.level.api.service.IFansClubService;
import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.common.utility.BitmapUtils;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.ss.android.ugc.aweme.feed.adapter.widget.LongPressWidget;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.zhiliaoapp.musically.R;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;
import tikcast.api.privilege.GradeConfig;
import tikcast.api.privilege.GradeScoreRule;
import tikcast.api.privilege.GradeShowConfig;
import tikcast.api.privilege.PayGradeInfo;
import tikcast.api.privilege.UpgradeInfo;
import tikcast.api.privilege.UserGrade;
import webcast.data.FansLevelInfo;

/* loaded from: classes6.dex */
public class AqS152S0200000_5 extends AbstractC65781Prl implements InterfaceC65784Pro {
    public final int $t;
    public Object l0;
    public Object l1;

    @Override // X.InterfaceC65784Pro
    public final Object invoke() {
        switch (this.$t) {
            case 0:
                return invoke$0(this);
            case 1:
                return invoke$1(this);
            case 2:
                return invoke$2(this);
            case 3:
                return invoke$3(this);
            case 4:
                return invoke$4(this);
            case 5:
                return invoke$5(this);
            case 6:
                return invoke$6(this);
            case 7:
                return invoke$7(this);
            case 8:
                return invoke$8(this);
            case 9:
                return invoke$9(this);
            case 10:
                return invoke$10(this);
            case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                return invoke$11(this);
            case 12:
                return invoke$12(this);
            case ABRConfig.ABR_STARTUP_MAX_BITRATE /* 13 */:
                return invoke$13(this);
            case 14:
                return invoke$14(this);
            case 15:
                return invoke$15(this);
            case LiveAudienceLinkmicLowestAgeSetting.DEFAULT /* 16 */:
                return invoke$16(this);
            case 17:
                return invoke$17(this);
            case 18:
                return invoke$18(this);
            case 19:
                return invoke$19(this);
            case 20:
                return invoke$20(this);
            case 21:
                return invoke$21(this);
            case 22:
                return invoke$22(this);
            case 23:
                return invoke$23(this);
            case 24:
                return invoke$24(this);
            case 25:
                return invoke$25(this);
            case 26:
                return invoke$26(this);
            case 27:
                return invoke$27(this);
            case 28:
                return invoke$28(this);
            case 29:
                return invoke$29(this);
            case 30:
                return invoke$30(this);
            case 31:
                return invoke$31(this);
            case 32:
                return invoke$32(this);
            case 33:
                return invoke$33(this);
            case 34:
                return invoke$34(this);
            case 35:
                return invoke$35(this);
            case 36:
                return invoke$36(this);
            case 37:
                return invoke$37(this);
            case 38:
                return invoke$38(this);
            case 39:
                return invoke$39(this);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AqS152S0200000_5 aqS152S0200000_5) {
        String str;
        int i;
        Gift gift;
        GiftLockInfo giftLockInfo;
        Map<String, String> map = UserLevelSettings.INSTANCE.getUserLevelConfig().revenueUserLevelLynxUrls;
        Object obj = null;
        if (map != null) {
            str = map.get("user_level_detail_panel");
        } else {
            str = null;
        }
        C32364Cn2 c32364Cn2 = new C32364Cn2(str);
        AbstractC32698CsQ abstractC32698CsQ = (AbstractC32698CsQ) aqS152S0200000_5.l0;
        if (abstractC32698CsQ != null) {
            obj = abstractC32698CsQ.LIZIZ;
        }
        if ((obj instanceof Gift) && (gift = (Gift) obj) != null && (giftLockInfo = gift.giftSubInfo) != null) {
            i = giftLockInfo.giftLevel;
        } else {
            i = 0;
        }
        c32364Cn2.LIZJ("show_entrance", "progress");
        c32364Cn2.LIZ(i, "target_grade");
        ((IActionHandlerService) CN1.LIZ(IActionHandlerService.class)).handle(((C32500CpE) aqS152S0200000_5.l1).LJLIL, UriProtector.parse(c32364Cn2.LIZLLL()));
        return C76800UCe.LIZ;
    }

    public static final Object invoke$1(AqS152S0200000_5 aqS152S0200000_5) {
        ((C32500CpE) aqS152S0200000_5.l0).LJJIIZI((AbstractC32698CsQ) aqS152S0200000_5.l1);
        return C76800UCe.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object invoke$10(AqS152S0200000_5 aqS152S0200000_5) {
        long j;
        ImageModel imageModel;
        GradeScoreRule gradeScoreRule;
        GradeShowConfig gradeShowConfig;
        long currentTimeMillis = System.currentTimeMillis();
        C76732zl c76732zl = new C76732zl();
        C76732zl c76732zl2 = new C76732zl();
        for (GradeConfig gradeConfig : (List) aqS152S0200000_5.l0) {
            String str = null;
            if (gradeConfig != null && (gradeShowConfig = gradeConfig.showConfig) != null) {
                imageModel = gradeShowConfig.badgeIconLite;
            } else {
                imageModel = null;
            }
            File file = (File) ((C68322mC) aqS152S0200000_5.l1).element;
            if (file != null) {
                C29804Bmq c29804Bmq = new C29804Bmq(c76732zl2, c76732zl);
                Boolean bool = Boolean.TRUE;
                if (gradeConfig != null && (gradeScoreRule = gradeConfig.gradeScore) != null) {
                    str = Integer.valueOf(gradeScoreRule.grade).toString();
                }
                C31663Cbj.LIZ(imageModel, c29804Bmq, file, -2, 8, bool, bool, str);
            }
        }
        long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
        int i = c76732zl.element;
        int i2 = c76732zl2.element;
        if (LiveLogMonitorSampleSetting.INSTANCE.isReport("livesdk_user_level_resource_prefetch", LiveLogMonitorSampleSetting.getSAMPLE_100())) {
            BZI LIZ = C28787BRn.LIZ("livesdk_user_level_resource_prefetch");
            Room room = (Room) DataChannelGlobal.LJLJJI.mv0(C29044Baa.class);
            long j2 = 0;
            if (room != null) {
                j = room.getId();
                if (room.getOwner() != null) {
                    j2 = room.getOwner().getId();
                }
            } else {
                j = 0;
            }
            long currentUserId = ((C29374Bfu) B83.LIZ().LIZIZ()).getCurrentUserId();
            LIZ.LJIJJ(Long.valueOf(j), "room_id");
            LIZ.LJIJJ(Long.valueOf(j2), "anchor_id");
            LIZ.LJIJJ(Long.valueOf(currentUserId), "user_id");
            LIZ.LJIJJ("user_level", WM7.SCENE_SERVICE);
            LIZ.LJIJJ(Integer.valueOf(i), "success_count");
            LIZ.LJIJJ(Integer.valueOf(i2), "fail_count");
            LIZ.LJIJJ(Long.valueOf(currentTimeMillis2), "duration");
            if (!BuriedFieldReductionSetting.INSTANCE.isBuriedField(LIZ.LJIILL())) {
                LIZ.LJIIZILJ();
                LIZ.LJJIIJZLJL();
            } else {
                LIZ.LJJIJ();
                LIZ.LJJIIZI();
            }
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$11(AqS152S0200000_5 aqS152S0200000_5) {
        Long l;
        Long l2;
        BZI LIZ = C28787BRn.LIZ("livesdk_sub_only_live_music_guide_capsule_click");
        LIZ.LJIIZILJ();
        Room room = (Room) aqS152S0200000_5.l0;
        if (room != null) {
            l = Long.valueOf(room.getOwnerUserId());
        } else {
            l = null;
        }
        LIZ.LJIJJ(l, "anchor_id");
        Room room2 = (Room) aqS152S0200000_5.l0;
        if (room2 != null) {
            l2 = Long.valueOf(room2.getId());
        } else {
            l2 = null;
        }
        LIZ.LJIJJ(l2, "room_id");
        LIZ.LJJIIJZLJL();
        C28477BFp.LIZ((DataChannel) aqS152S0200000_5.l1, "sub_only_live_music_capsule", null, true);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$12(AqS152S0200000_5 aqS152S0200000_5) {
        String str;
        Aweme aweme = (Aweme) aqS152S0200000_5.l0;
        C86343Xud LJLZ = ((LongPressWidget) aqS152S0200000_5.l1).LJLZ();
        if (LJLZ != null) {
            str = LJLZ.LIZLLL;
        } else {
            str = null;
        }
        C2U8.LIZ(new C55045Liz(aweme, str));
        return C76800UCe.LIZ;
    }

    public static final Object invoke$13(AqS152S0200000_5 aqS152S0200000_5) {
        String str;
        if (LiveDislikeVersion.INSTANCE.getValue() <= 1 || ((LongPressWidget) aqS152S0200000_5.l0).LJLJJI) {
            C30868C9o.LIZJ(R.string.mg9);
            Aweme aweme = (Aweme) aqS152S0200000_5.l1;
            C86343Xud LJLZ = ((LongPressWidget) aqS152S0200000_5.l0).LJLZ();
            if (LJLZ != null) {
                str = LJLZ.LIZLLL;
            } else {
                str = null;
            }
            C2U8.LIZ(new C55045Liz(aweme, str));
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$14(AqS152S0200000_5 aqS152S0200000_5) {
        ((InterfaceC22790ux) ((CoHostFriendNoticeService) aqS152S0200000_5.l0).LJLJI.getValue()).LIZJ(new C22810uz("live_cohost_friend_notice_optimize_strategy", new C22820v0(false, new JSONObject().putOpt("room_id", Long.valueOf(C29306Beo.LJJIZ((DataChannel) aqS152S0200000_5.l1))).putOpt("type", "iteration").putOpt("notice_strategy_group", Integer.valueOf(CohostNoticeStrategySettings.INSTANCE.getGetStickValue()))), ((CoHostFriendNoticeService) aqS152S0200000_5.l0).LJLJL, (C35201Zs) null, 24));
        return C76800UCe.LIZ;
    }

    public static final Object invoke$15(AqS152S0200000_5 aqS152S0200000_5) {
        C30868C9o.LIZJ(R.string.ksf);
        BAF.LJIIJJI(C51029K0z.LJIILIIL((Fragment) aqS152S0200000_5.l0), false, "anchor_connection");
        ((InterfaceC88472Yns) aqS152S0200000_5.l1).invoke(Boolean.FALSE);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$16(AqS152S0200000_5 aqS152S0200000_5) {
        C30868C9o.LIZJ(R.string.ktm);
        BAF.LJIIJJI(C51029K0z.LJIILIIL((Fragment) aqS152S0200000_5.l0), false, "guest_connection_enlarge_screen");
        ((InterfaceC88472Yns) aqS152S0200000_5.l1).invoke(Boolean.FALSE);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$17(AqS152S0200000_5 aqS152S0200000_5) {
        Bitmap LIZ;
        Bitmap bitmap = ((C31646CbS) aqS152S0200000_5.l0).LJIIIIZZ;
        if (bitmap == null) {
            Context context = (Context) aqS152S0200000_5.l1;
            try {
                C31646CbS.LJJJJZI.getClass();
                if (!RoomSlowFunctionOptSetting.watchOpt()) {
                    LIZ = BitmapFactory.decodeResource(context.getResources(), R.drawable.zn);
                } else {
                    LIZ = C31646CbS.LJJJLL.get();
                    if (LIZ == null) {
                        LIZ = BitmapFactory.decodeResource(context.getResources(), R.drawable.zn);
                        C31646CbS.LJJJLL = new WeakReference<>(LIZ);
                    }
                }
                C3C5.m7constructorimpl(LIZ);
            } catch (Throwable th) {
                LIZ = C141335gf.LIZ(th);
                C3C5.m7constructorimpl(LIZ);
            }
            if (C3C5.m12isFailureimpl(LIZ)) {
                return null;
            }
            return LIZ;
        }
        return bitmap;
    }

    public static final Object invoke$18(AqS152S0200000_5 aqS152S0200000_5) {
        ImageModel imageModel;
        ImageView imageView = ((PreviewStickerHelper) aqS152S0200000_5.l0).LJLJJI;
        UrlModel urlModel = ((LiveEffect) aqS152S0200000_5.l1).icon;
        if (urlModel != null) {
            imageModel = urlModel.L();
        } else {
            imageModel = null;
        }
        C15640jQ.LJ(imageView, imageModel, 0);
        View view = ((PreviewStickerHelper) aqS152S0200000_5.l0).LJLJJL;
        if (view != null) {
            C29306Beo.LJI(view);
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$19(AqS152S0200000_5 aqS152S0200000_5) {
        BZI LIZ = C28787BRn.LIZ("livesdk_panel_open_cost_time");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        EnumC29609Bjh enumC29609Bjh = (EnumC29609Bjh) aqS152S0200000_5.l0;
        Map map = (Map) aqS152S0200000_5.l1;
        linkedHashMap.put("panel_type", enumC29609Bjh.getValue());
        linkedHashMap.put("device_score", String.valueOf(TTliveAnchorDeviceScoreSetting.INSTANCE.getValue()));
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(C51029K0z.LJJIIZ(map.size()));
        for (Map.Entry entry : map.entrySet()) {
            linkedHashMap2.put(entry.getKey(), String.valueOf(((Number) entry.getValue()).longValue()));
        }
        linkedHashMap.putAll(linkedHashMap2);
        LIZ.LJJIFFI(linkedHashMap);
        LIZ.LJJIIJZLJL();
        return C76800UCe.LIZ;
    }

    public static final Object invoke$2(AqS152S0200000_5 aqS152S0200000_5) {
        int LIZ = C15380j0.LIZ(10.0f);
        CQQ cqq = (CQQ) aqS152S0200000_5.l0;
        if (cqq != null && cqq.LJIIZILJ) {
            LIZ = C15380j0.LIZ(11.4f);
        }
        Bitmap decodeBitmap = BitmapUtils.decodeBitmap(((View) aqS152S0200000_5.l1).getContext(), R.drawable.b2j, LIZ, LIZ);
        Context context = ((View) aqS152S0200000_5.l1).getContext();
        o.LJIIIIZZ(context, "itemView.context");
        String LJIILJJIL = C15380j0.LJIILJJIL(R.string.nne);
        o.LJIIIIZZ(LJIILJJIL, "getString(R.string.pm_pincomment_status_pinned)");
        return new C31458CWg(context, decodeBitmap, LJIILJJIL, C04330Ez.LIZIZ(((View) aqS152S0200000_5.l1).getContext(), R.color.bz), LIZ / 2, LIZ);
    }

    public static final Object invoke$20(AqS152S0200000_5 aqS152S0200000_5) {
        ImageModel Ut0;
        UrlModel urlModel;
        C1Q4 c1q4;
        C30466BxW c30466BxW = (C30466BxW) aqS152S0200000_5.l0;
        List<String> list = null;
        if (c30466BxW.LJLL == null) {
            LiveIconView liveIconView = c30466BxW.LJLJLJ;
            if (liveIconView != null) {
                c1q4 = liveIconView.getIcon();
            } else {
                c1q4 = null;
            }
            c30466BxW.LJLL = c1q4;
        }
        if (LiveInsertStickerSupportForDifferentScenesSetting.INSTANCE.isV2()) {
            LiveIconView liveIconView2 = ((C30466BxW) aqS152S0200000_5.l0).LJLJLJ;
            if (liveIconView2 != null) {
                liveIconView2.setTranslationY(((Number) r0.LJLJI.getValue()).intValue());
            }
            C29306Beo.LJI(((C30466BxW) aqS152S0200000_5.l0).LJLJLLL);
        }
        C0WZ c0wz = (C0WZ) aqS152S0200000_5.l1;
        if (c0wz.LIZ != null) {
            ((C30466BxW) aqS152S0200000_5.l0).LJLLL = true;
            BQO LIZ = C15650jR.LIZ();
            LiveEffect liveEffect = ((C0WZ) aqS152S0200000_5.l1).LIZ;
            if (liveEffect != null && (urlModel = liveEffect.icon) != null) {
                list = urlModel.urlList;
            }
            C78720Uuy LIZ2 = LIZ.LIZ(list);
            LIZ2.LJIIIIZZ = R.drawable.d6b;
            LIZ2.LIZLLL(ImageView.ScaleType.FIT_XY);
            LIZ2.LJIIJJI(((C30466BxW) aqS152S0200000_5.l0).LJLJLJ);
            InterfaceC31961Ng LIZJ = ((C30466BxW) aqS152S0200000_5.l0).LIZJ();
            if (LIZJ != null && (Ut0 = LIZJ.Ut0(((C0WZ) aqS152S0200000_5.l1).LIZIZ)) != null) {
                C30466BxW c30466BxW2 = (C30466BxW) aqS152S0200000_5.l0;
                C29306Beo.LJJLJLI(c30466BxW2.LJLLI);
                C29306Beo.LJJLJLI(c30466BxW2.LJLLILLLL);
                C78720Uuy LJIIIZ = C15650jR.LIZ().LJIIIZ(Ut0);
                LJIIIZ.LIZLLL(ImageView.ScaleType.FIT_CENTER);
                LJIIIZ.LJIIL = Boolean.TRUE;
                LJIIIZ.LJIIJJI(c30466BxW2.LJLLI);
            }
        } else {
            LiveIconView liveIconView3 = ((C30466BxW) aqS152S0200000_5.l0).LJLJLJ;
            if (liveIconView3 != null) {
                liveIconView3.setBackgroundDrawable(c0wz.LIZLLL);
            }
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$21(AqS152S0200000_5 aqS152S0200000_5) {
        DataChannel LJI = ((C32802Cu6) aqS152S0200000_5.l0).LJI();
        if (LJI != null) {
            LJI.qv0(MockGiftPollEvent.class, new CCW(true, new Throwable("ignore"), GiftManager.inst().getPollGiftIndex(((C32279Clf) aqS152S0200000_5.l1).LIZ)));
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$22(AqS152S0200000_5 aqS152S0200000_5) {
        ActivityC45651qj LJFF = ((C32802Cu6) aqS152S0200000_5.l0).LJFF();
        if (LJFF != null) {
            C32802Cu6 c32802Cu6 = (C32802Cu6) aqS152S0200000_5.l0;
            InterfaceC29405BgP LIZIZ = B83.LIZ().LIZIZ();
            C29356Bfc c29356Bfc = new C29356Bfc();
            c29356Bfc.LIZ = C15380j0.LJIILJJIL(R.string.syk);
            c29356Bfc.LIZJ = c32802Cu6.LJIIJ;
            c29356Bfc.LJ = "live_detail";
            c29356Bfc.LJFF = "gift_send";
            c29356Bfc.LIZLLL = "enableGift";
            ((C29374Bfu) LIZIZ).LIZLLL(LJFF, new C29377Bfx(c29356Bfc)).LIZ(new C29522BiI());
        }
        ((C32802Cu6) aqS152S0200000_5.l0).LJIIIZ((C32816CuK) aqS152S0200000_5.l1, new Exception("BizError NotLogin"));
        return C76800UCe.LIZ;
    }

    public static final Object invoke$23(AqS152S0200000_5 aqS152S0200000_5) {
        DataChannel LJI = ((C32801Cu5) aqS152S0200000_5.l0).LJI();
        if (LJI != null) {
            LJI.qv0(MockGiftPollEvent.class, new CCW(true, new Throwable("ignore"), GiftManager.inst().getPollGiftIndex(((C32279Clf) aqS152S0200000_5.l1).LIZ)));
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$24(AqS152S0200000_5 aqS152S0200000_5) {
        boolean z;
        Boolean bool;
        UW7 uw7 = GiftManager.inst().giftRepository;
        long id = ((Room) aqS152S0200000_5.l0).getId();
        DataChannel LJI = ((C32801Cu5) aqS152S0200000_5.l1).LJI();
        if (LJI != null && (bool = (Boolean) LJI.kv0(UserIsAnchorChannel.class)) != null) {
            z = bool.booleanValue();
        } else {
            z = false;
        }
        uw7.LIZ(15, id, new C32133CjJ((C32801Cu5) aqS152S0200000_5.l1), "", z);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$25(AqS152S0200000_5 aqS152S0200000_5) {
        DataChannel LJI = ((C32800Cu4) aqS152S0200000_5.l0).LJI();
        if (LJI != null) {
            LJI.qv0(MockGiftPollEvent.class, new CCW(true, new Throwable("ignore"), GiftManager.inst().getPollGiftIndex(((C32279Clf) aqS152S0200000_5.l1).LIZ)));
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$26(AqS152S0200000_5 aqS152S0200000_5) {
        UserGrade userGrade;
        boolean z;
        boolean z2;
        BadgeStruct badgeStruct;
        BadgeStruct badgeStruct2;
        boolean z3;
        boolean z4;
        long j;
        UpgradeInfo upgradeInfo;
        UpgradeInfo upgradeInfo2;
        UserGrade userGrade2;
        UserGrade userGrade3;
        C32800Cu4 c32800Cu4 = (C32800Cu4) aqS152S0200000_5.l0;
        SendGiftResult data = (SendGiftResult) aqS152S0200000_5.l1;
        o.LJIIIIZZ(data, "data");
        c32800Cu4.getClass();
        try {
            PayGradeInfo payGradeInfo = data.payGradeInfo;
            UserGrade userGrade4 = null;
            if (payGradeInfo != null) {
                userGrade = payGradeInfo.userGrade;
            } else {
                userGrade = null;
            }
            boolean z5 = true;
            if (userGrade != null && payGradeInfo.upgradeInfo != null) {
                z = true;
            } else {
                z = false;
            }
            FansLevelInfo fansLevelInfo = data.fansLevelInfo;
            if (fansLevelInfo != null) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z && payGradeInfo != null && (userGrade2 = payGradeInfo.userGrade) != null && userGrade2.defaultGradeBadge != null && (userGrade3 = payGradeInfo.userGrade) != null) {
                badgeStruct = userGrade3.defaultGradeBadge;
            } else {
                badgeStruct = null;
            }
            if (!z2 || fansLevelInfo == null) {
                badgeStruct2 = null;
            } else {
                badgeStruct2 = fansLevelInfo.badge;
            }
            ((IFansClubService) CN1.LIZ(IFansClubService.class)).gK(badgeStruct, badgeStruct2);
            if (z) {
                C32128CjE c32128CjE = C32129CjF.LIZ;
                c32128CjE.LJIL = true;
                if (payGradeInfo == null || (upgradeInfo2 = payGradeInfo.upgradeInfo) == null) {
                    z3 = false;
                } else {
                    z3 = upgradeInfo2.isUpgrade;
                }
                c32128CjE.LJJI = z3;
                if (payGradeInfo != null && (upgradeInfo = payGradeInfo.upgradeInfo) != null) {
                    z4 = upgradeInfo.isUpgrade;
                } else {
                    z4 = false;
                }
                boolean z6 = !z4;
                if (payGradeInfo != null && payGradeInfo.userGrade != null) {
                    C29800Bmm gr = ((IUserLevelService) CN1.LIZ(IUserLevelService.class)).gr();
                    UserGrade userGrade5 = payGradeInfo.userGrade;
                    if (userGrade5 != null) {
                        if (gr == null) {
                            j = 0;
                        } else {
                            j = gr.LJIILIIL;
                        }
                        userGrade5.version = j;
                    }
                }
                IUserLevelService iUserLevelService = (IUserLevelService) CN1.LIZ(IUserLevelService.class);
                if (payGradeInfo != null) {
                    userGrade4 = payGradeInfo.userGrade;
                }
                if (data.comboCount <= 1) {
                    z5 = false;
                }
                iUserLevelService.Rm(userGrade4, z6, "gifting", z5);
            }
            if (z2) {
                ((IFansClubService) CN1.LIZ(IFansClubService.class)).tz(fansLevelInfo, data.anchorFansCount);
            }
            C0NB.LIZIZ("gift_prompt_notification", "gift level result processing success");
        } catch (Exception e) {
            C32785Ctp c32785Ctp = C32785Ctp.LJIILIIL;
            String th = e.toString();
            c32785Ctp.getClass();
            C32785Ctp.LJIJJLI("error_setting_level", th);
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$27(AqS152S0200000_5 aqS152S0200000_5) {
        boolean z;
        Boolean bool;
        UW7 uw7 = GiftManager.inst().giftRepository;
        long j = ((C32804Cu8) aqS152S0200000_5.l0).LIZIZ;
        DataChannel LJI = ((C32800Cu4) aqS152S0200000_5.l1).LJI();
        if (LJI != null && (bool = (Boolean) LJI.kv0(UserIsAnchorChannel.class)) != null) {
            z = bool.booleanValue();
        } else {
            z = false;
        }
        uw7.LIZ(13, j, new C32134CjK((C32800Cu4) aqS152S0200000_5.l1), "", z);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$28(AqS152S0200000_5 aqS152S0200000_5) {
        ActivityC45651qj LJFF = ((C32800Cu4) aqS152S0200000_5.l0).LJFF();
        if (LJFF != null) {
            long j = ((C72242sW) aqS152S0200000_5.l1).element;
            SharedPreferences.Editor edit = F9J.LIZIZ(LJFF, 0, "gift_dialog_storage").edit();
            edit.putLong("default_dialog_item", j);
            edit.commit();
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$29(AqS152S0200000_5 aqS152S0200000_5) {
        ((SubscriptionSettingFragmentNew) aqS152S0200000_5.l0).Sl("banner");
        InterfaceC30442Bx8.LJLI.LIZJ(Boolean.TRUE);
        XKX.LIZLLL(LifecycleOwnerKt.getLifecycleScope((SubscriptionSettingFragmentNew) aqS152S0200000_5.l0), null, null, new CGW((CE3) aqS152S0200000_5.l1, null), 3);
        return C76800UCe.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object invoke$3(AqS152S0200000_5 aqS152S0200000_5) {
        CountDownTimer countDownTimer = (CountDownTimer) ((C68322mC) aqS152S0200000_5.l0).element;
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }
        ((InterfaceC65784Pro) aqS152S0200000_5.l1).invoke();
        return C76800UCe.LIZ;
    }

    public static final Object invoke$30(AqS152S0200000_5 aqS152S0200000_5) {
        CT7 ct7 = ((C31371CSx) aqS152S0200000_5.l0).LIZJ;
        if (ct7 != null) {
            ((C03150Al) aqS152S0200000_5.l1).LIZJ(ct7);
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$31(AqS152S0200000_5 aqS152S0200000_5) {
        ImageView imageView;
        View view = ((GameDropsPreviewBanner) aqS152S0200000_5.l0).getView();
        if (view != null && (imageView = (ImageView) view.findViewById(R.id.e9h)) != null) {
            imageView.setImageDrawable((Drawable) aqS152S0200000_5.l1);
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$32(AqS152S0200000_5 aqS152S0200000_5) {
        C32825CuT c32825CuT;
        DataChannel LJI;
        DataChannel LJI2 = ((C32799Cu3) aqS152S0200000_5.l0).LJI();
        if (LJI2 != null) {
            LJI2.qv0(GiftStartSendEvent.class, ((C32804Cu8) aqS152S0200000_5.l1).LJIILLIIL);
        }
        DataChannel LJI3 = ((C32799Cu3) aqS152S0200000_5.l0).LJI();
        if (LJI3 != null) {
            LJI3.rv0(RechargeExchangeCoinsDialogShowing.class, Boolean.FALSE);
        }
        C32804Cu8 c32804Cu8 = (C32804Cu8) aqS152S0200000_5.l1;
        if ((c32804Cu8 instanceof C32825CuT) && (c32825CuT = (C32825CuT) c32804Cu8) != null && c32825CuT.LJJIIJZLJL && (LJI = ((C32799Cu3) aqS152S0200000_5.l0).LJI()) != null) {
            LJI.qv0(FastGiftCombEvent.class, Boolean.TRUE);
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$33(AqS152S0200000_5 aqS152S0200000_5) {
        CSD csd = (CSD) aqS152S0200000_5.l0;
        CQQ cqq = csd.LJLILLLLZI;
        if (cqq != null) {
            CR6 cr6 = csd.LLF;
            o.LJII(cr6, "null cannot be cast to non-null type com.bytedance.android.livesdk.model.message.ChatMessage");
            CQK model = (CQK) aqS152S0200000_5.l1;
            o.LJIIIZ(model, "model");
            cqq.LJIIJ.LJJIJL((ChatMessage) cr6, model);
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$34(AqS152S0200000_5 aqS152S0200000_5) {
        String str;
        InterfaceC31368CSu interfaceC31368CSu = (CQK) aqS152S0200000_5.l0;
        if (interfaceC31368CSu instanceof CSC) {
            ((CSC) interfaceC31368CSu).LJJIZ(false);
        }
        ((CQQ) aqS152S0200000_5.l1).LJFF((CQK) aqS152S0200000_5.l0);
        BZI LIZ = C28787BRn.LIZ("livesdk_undo_translate_comment");
        LIZ.LJIILLIIL(((CQQ) aqS152S0200000_5.l1).LJIIIIZZ);
        if (((CQQ) aqS152S0200000_5.l1).LJFF) {
            str = "anchor";
        } else {
            str = "user";
        }
        LIZ.LJIJJ(str, "user_type");
        LIZ.LJIJJ("revert_icon", "click_icon");
        LIZ.LJIJJ(Long.valueOf(((CQK) aqS152S0200000_5.l0).LJLILLLLZI()), "to_user_id");
        LIZ.LJJIIJZLJL();
        return C76800UCe.LIZ;
    }

    public static final Object invoke$35(AqS152S0200000_5 aqS152S0200000_5) {
        ViewGroup.LayoutParams layoutParams = ((View) aqS152S0200000_5.l0).getLayoutParams();
        o.LJII(layoutParams, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
        C28212B5k c28212B5k = (C28212B5k) aqS152S0200000_5.l1;
        layoutParams2.width = c28212B5k.LIZ;
        layoutParams2.height = c28212B5k.LIZIZ;
        layoutParams2.gravity = 51;
        layoutParams2.leftMargin = c28212B5k.LIZLLL;
        layoutParams2.rightMargin = c28212B5k.LJ;
        layoutParams2.topMargin = c28212B5k.LIZJ;
        ((View) aqS152S0200000_5.l0).setLayoutParams(layoutParams2);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$36(AqS152S0200000_5 aqS152S0200000_5) {
        ViewGroup.LayoutParams layoutParams = ((View) aqS152S0200000_5.l0).getLayoutParams();
        o.LJII(layoutParams, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
        C28212B5k c28212B5k = (C28212B5k) aqS152S0200000_5.l1;
        layoutParams2.width = c28212B5k.LIZ;
        layoutParams2.height = c28212B5k.LIZIZ;
        layoutParams2.gravity = 51;
        layoutParams2.leftMargin = c28212B5k.LIZLLL;
        layoutParams2.rightMargin = c28212B5k.LJ;
        layoutParams2.topMargin = c28212B5k.LIZJ;
        ((View) aqS152S0200000_5.l0).setLayoutParams(layoutParams2);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$37(AqS152S0200000_5 aqS152S0200000_5) {
        int i;
        if (Math.abs(((C72242sW) aqS152S0200000_5.l0).element - System.currentTimeMillis()) >= 1000) {
            ((C72242sW) aqS152S0200000_5.l0).element = System.currentTimeMillis();
            C32364Cn2 c32364Cn2 = new C32364Cn2(LiveStarCommentSchemaConfig.INSTANCE.getSettingValue().starCommentTerms);
            View view = ((StarCommentPaymentDialog) aqS152S0200000_5.l1).LLD;
            if (view != null) {
                i = view.getHeight();
            } else {
                i = 505;
            }
            c32364Cn2.LIZJ("height", String.valueOf((int) C15380j0.LJIJ(i)));
            Context context = ((StarCommentPaymentDialog) aqS152S0200000_5.l1).getContext();
            if (context != null) {
                ((IActionHandlerService) CN1.LIZ(IActionHandlerService.class)).handle(context, c32364Cn2.LIZLLL());
            }
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$38(AqS152S0200000_5 aqS152S0200000_5) {
        LiveSubOnlyChatConfig liveSubOnlyChatConfig = LiveSubOnlyChatConfig.INSTANCE;
        C30868C9o.LJI(C15380j0.LJIIIIZZ(R.plurals.pr, liveSubOnlyChatConfig.onLiveSwitchFrequencyMin(), Integer.valueOf(liveSubOnlyChatConfig.onLiveSwitchFrequencyMin())));
        C28433BDx c28433BDx = (C28433BDx) aqS152S0200000_5.l0;
        Room room = (Room) aqS152S0200000_5.l1;
        c28433BDx.getClass();
        C28433BDx.LIZJ(room);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$39(AqS152S0200000_5 aqS152S0200000_5) {
        LiveSubOnlyChatConfig liveSubOnlyChatConfig = LiveSubOnlyChatConfig.INSTANCE;
        C30868C9o.LJI(C15380j0.LJIIIIZZ(R.plurals.pr, liveSubOnlyChatConfig.onLiveSwitchFrequencyMin(), Integer.valueOf(liveSubOnlyChatConfig.onLiveSwitchFrequencyMin())));
        C28433BDx c28433BDx = (C28433BDx) aqS152S0200000_5.l0;
        Room room = (Room) aqS152S0200000_5.l1;
        c28433BDx.getClass();
        C28433BDx.LIZJ(room);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$4(AqS152S0200000_5 aqS152S0200000_5) {
        ((C74074T5i) aqS152S0200000_5.l0).post(new ARunnableS41S0100000_5((BaseCommentPinnedWidget) aqS152S0200000_5.l1, 32));
        return C76800UCe.LIZ;
    }

    public static final Object invoke$5(AqS152S0200000_5 aqS152S0200000_5) {
        ((C68322mC) aqS152S0200000_5.l0).element = "home_page";
        PreviewSubscriptionWidget previewSubscriptionWidget = (PreviewSubscriptionWidget) aqS152S0200000_5.l1;
        C75 c75 = previewSubscriptionWidget.LJLJJI;
        Context context = previewSubscriptionWidget.context;
        o.LJIIIIZZ(context, "context");
        c75.LIZIZ(SubscribeInvitationLynxUrlSetting.INSTANCE.getHome_page(), "invitation_letter", "live_take_page", "", context);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$6(AqS152S0200000_5 aqS152S0200000_5) {
        int top;
        if (((TryModeBroadcastInteractionFragment) aqS152S0200000_5.l0).isViewValid() && ((TryModeBroadcastInteractionFragment) aqS152S0200000_5.l0)._$_findCachedViewById(R.id.if2) != null) {
            ScaleGestureDetectorOnScaleGestureListenerC30428Bwu scaleGestureDetectorOnScaleGestureListenerC30428Bwu = ((TryModeBroadcastInteractionFragment) aqS152S0200000_5.l0).LLFFF;
            if (scaleGestureDetectorOnScaleGestureListenerC30428Bwu != null) {
                scaleGestureDetectorOnScaleGestureListenerC30428Bwu.LJLZ = C15380j0.LIZ(148.0f);
                int height = ((View) aqS152S0200000_5.l1).getHeight();
                ScaleGestureDetectorOnScaleGestureListenerC30428Bwu scaleGestureDetectorOnScaleGestureListenerC30428Bwu2 = ((TryModeBroadcastInteractionFragment) aqS152S0200000_5.l0).LLFFF;
                if (scaleGestureDetectorOnScaleGestureListenerC30428Bwu2 != null) {
                    if (!((IInteractService) CN1.LIZ(IInteractService.class)).OB()) {
                        IInteractService iInteractService = (IInteractService) CN1.LIZ(IInteractService.class);
                        if (!iInteractService.VY() && !iInteractService.ta0()) {
                            top = height - ((TryModeBroadcastInteractionFragment) aqS152S0200000_5.l0)._$_findCachedViewById(R.id.if2).getTop();
                            scaleGestureDetectorOnScaleGestureListenerC30428Bwu2.LJZ = top;
                        }
                    }
                    top = (height - ((TryModeBroadcastInteractionFragment) aqS152S0200000_5.l0)._$_findCachedViewById(R.id.if2).getTop()) + C15380j0.LIZ(40.0f);
                    scaleGestureDetectorOnScaleGestureListenerC30428Bwu2.LJZ = top;
                } else {
                    o.LJIJI("cameraGestureDetector");
                    throw null;
                }
            } else {
                o.LJIJI("cameraGestureDetector");
                throw null;
            }
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$7(AqS152S0200000_5 aqS152S0200000_5) {
        int top;
        if (((VideoBroadcastInteractionFragment) aqS152S0200000_5.l0).isViewValid() && ((VideoBroadcastInteractionFragment) aqS152S0200000_5.l0)._$_findCachedViewById(R.id.if2) != null) {
            ScaleGestureDetectorOnScaleGestureListenerC30428Bwu scaleGestureDetectorOnScaleGestureListenerC30428Bwu = ((VideoBroadcastInteractionFragment) aqS152S0200000_5.l0).LLIIIILZ;
            if (scaleGestureDetectorOnScaleGestureListenerC30428Bwu != null) {
                scaleGestureDetectorOnScaleGestureListenerC30428Bwu.LJLZ = C15380j0.LIZ(148.0f);
                int height = ((View) aqS152S0200000_5.l1).getHeight();
                ScaleGestureDetectorOnScaleGestureListenerC30428Bwu scaleGestureDetectorOnScaleGestureListenerC30428Bwu2 = ((VideoBroadcastInteractionFragment) aqS152S0200000_5.l0).LLIIIILZ;
                if (scaleGestureDetectorOnScaleGestureListenerC30428Bwu2 != null) {
                    if (!((IInteractService) CN1.LIZ(IInteractService.class)).OB()) {
                        IInteractService iInteractService = (IInteractService) CN1.LIZ(IInteractService.class);
                        if (!iInteractService.VY() && !iInteractService.ta0()) {
                            top = height - ((VideoBroadcastInteractionFragment) aqS152S0200000_5.l0)._$_findCachedViewById(R.id.if2).getTop();
                            scaleGestureDetectorOnScaleGestureListenerC30428Bwu2.LJZ = top;
                        }
                    }
                    top = (height - ((VideoBroadcastInteractionFragment) aqS152S0200000_5.l0)._$_findCachedViewById(R.id.if2).getTop()) + C15380j0.LIZ(40.0f);
                    scaleGestureDetectorOnScaleGestureListenerC30428Bwu2.LJZ = top;
                } else {
                    o.LJIJI("cameraGestureDetector");
                    throw null;
                }
            } else {
                o.LJIJI("cameraGestureDetector");
                throw null;
            }
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$8(AqS152S0200000_5 aqS152S0200000_5) {
        if (((View) aqS152S0200000_5.l0).getHeight() > 0) {
            ViewGroup viewGroup = BTH.LJLJL;
            if (viewGroup != null) {
                View view = (View) aqS152S0200000_5.l0;
                ViewGroup viewGroup2 = (ViewGroup) aqS152S0200000_5.l1;
                ViewGroup.LayoutParams layoutParams = viewGroup.getLayoutParams();
                if (layoutParams != null) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                    marginLayoutParams.width = O6R.LJJIIZ((view.getWidth() * marginLayoutParams.height) / view.getHeight());
                    marginLayoutParams.setMarginStart((viewGroup2.getWidth() - BTH.LJLZ) - marginLayoutParams.width);
                    marginLayoutParams.topMargin = (viewGroup2.getHeight() - BTH.LJZ) - marginLayoutParams.height;
                    viewGroup.setLayoutParams(marginLayoutParams);
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                }
            }
            C29306Beo.LJJLJLI(BTH.LJLJL);
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$9(AqS152S0200000_5 aqS152S0200000_5) {
        ((NewTopRightBannerWidget) aqS152S0200000_5.l0).LJZ(((BannerInRoomCollection) aqS152S0200000_5.l1).topRightBanner);
        return C76800UCe.LIZ;
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public AqS152S0200000_5(X.C32500CpE r3, X.AbstractC32698CsQ r4, int r5) {
        /*
            r2 = this;
            r2.$t = r5
            switch(r5) {
                case 0: goto Lf;
                default: goto L5;
            }
        L5:
            r1 = r2
            r1.l0 = r3
            r1.l1 = r4
            r0 = 0
        Lb:
            r1.<init>(r0)
            return
        Lf:
            r1 = r2
            r1.l0 = r4
            r1.l1 = r3
            r0 = 0
            goto Lb
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AqS152S0200000_5.<init>(X.CpE, X.CsQ, int):void");
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public AqS152S0200000_5(com.ss.android.ugc.aweme.feed.adapter.widget.LongPressWidget r3, com.ss.android.ugc.aweme.feed.model.Aweme r4, int r5) {
        /*
            r2 = this;
            r2.$t = r5
            switch(r5) {
                case 12: goto Lf;
                default: goto L5;
            }
        L5:
            r1 = r2
            r1.l0 = r3
            r1.l1 = r4
            r0 = 0
        Lb:
            r1.<init>(r0)
            return
        Lf:
            r1 = r2
            r1.l0 = r4
            r1.l1 = r3
            r0 = 0
            goto Lb
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AqS152S0200000_5.<init>(com.ss.android.ugc.aweme.feed.adapter.widget.LongPressWidget, com.ss.android.ugc.aweme.feed.model.Aweme, int):void");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AqS152S0200000_5(C68322mC c68322mC, C68322mC<String> c68322mC2, PreviewSubscriptionWidget previewSubscriptionWidget) {
        super(0);
        this.$t = previewSubscriptionWidget;
        this.l0 = c68322mC;
        this.l1 = c68322mC2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS152S0200000_5(C72242sW c72242sW, StarCommentPaymentDialog starCommentPaymentDialog, int i) {
        super(0);
        this.$t = i;
        this.l0 = c72242sW;
        this.l1 = starCommentPaymentDialog;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS152S0200000_5(C28433BDx c28433BDx, Room room, int i) {
        super(0);
        this.$t = i;
        this.l0 = c28433BDx;
        this.l1 = room;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AqS152S0200000_5(EnumC29609Bjh enumC29609Bjh, EnumC29609Bjh enumC29609Bjh2, Map<String, Long> map) {
        super(0);
        this.$t = map;
        this.l0 = enumC29609Bjh;
        this.l1 = enumC29609Bjh2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS152S0200000_5(C30466BxW c30466BxW, C0WZ c0wz, int i) {
        super(0);
        this.$t = i;
        this.l0 = c30466BxW;
        this.l1 = c0wz;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS152S0200000_5(CQQ cqq, CQK cqk, int i) {
        super(0);
        this.$t = i;
        this.l0 = cqk;
        this.l1 = cqq;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AqS152S0200000_5(CSD csd, CSD csd2, CQK<? extends CR6> cqk) {
        super(0);
        this.$t = cqk;
        this.l0 = csd;
        this.l1 = csd2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS152S0200000_5(C31371CSx c31371CSx, C03150Al c03150Al, int i) {
        super(0);
        this.$t = i;
        this.l0 = c31371CSx;
        this.l1 = c03150Al;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS152S0200000_5(C31646CbS c31646CbS, Context context, int i) {
        super(0);
        this.$t = i;
        this.l0 = c31646CbS;
        this.l1 = context;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS152S0200000_5(C32799Cu3 c32799Cu3, C32804Cu8 c32804Cu8, int i) {
        super(0);
        this.$t = i;
        this.l0 = c32799Cu3;
        this.l1 = c32804Cu8;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS152S0200000_5(C32800Cu4 c32800Cu4, C72242sW c72242sW, int i) {
        super(0);
        this.$t = i;
        this.l0 = c32800Cu4;
        this.l1 = c72242sW;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS152S0200000_5(C32800Cu4 c32800Cu4, C32279Clf c32279Clf, int i) {
        super(0);
        this.$t = i;
        this.l0 = c32800Cu4;
        this.l1 = c32279Clf;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS152S0200000_5(C32800Cu4 c32800Cu4, SendGiftResult sendGiftResult, int i) {
        super(0);
        this.$t = i;
        this.l0 = c32800Cu4;
        this.l1 = sendGiftResult;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS152S0200000_5(C32801Cu5 c32801Cu5, C32279Clf c32279Clf, int i) {
        super(0);
        this.$t = i;
        this.l0 = c32801Cu5;
        this.l1 = c32279Clf;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS152S0200000_5(C32802Cu6 c32802Cu6, C32279Clf c32279Clf, int i) {
        super(0);
        this.$t = i;
        this.l0 = c32802Cu6;
        this.l1 = c32279Clf;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS152S0200000_5(C32802Cu6 c32802Cu6, C32816CuK c32816CuK, int i) {
        super(0);
        this.$t = i;
        this.l0 = c32802Cu6;
        this.l1 = c32816CuK;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS152S0200000_5(C32804Cu8 c32804Cu8, C32800Cu4 c32800Cu4, int i) {
        super(0);
        this.$t = i;
        this.l0 = c32804Cu8;
        this.l1 = c32800Cu4;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS152S0200000_5(InterfaceC65784Pro interfaceC65784Pro, C68322mC c68322mC, int i) {
        super(0);
        this.$t = i;
        this.l0 = c68322mC;
        this.l1 = interfaceC65784Pro;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS152S0200000_5(C74074T5i c74074T5i, BaseCommentPinnedWidget baseCommentPinnedWidget, int i) {
        super(0);
        this.$t = i;
        this.l0 = c74074T5i;
        this.l1 = baseCommentPinnedWidget;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS152S0200000_5(View view, C28212B5k c28212B5k, int i) {
        super(0);
        this.$t = i;
        this.l0 = view;
        this.l1 = c28212B5k;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS152S0200000_5(View view, CQQ cqq, int i) {
        super(0);
        this.$t = i;
        this.l0 = cqq;
        this.l1 = view;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS152S0200000_5(View view, ViewGroup viewGroup, int i) {
        super(0);
        this.$t = i;
        this.l0 = view;
        this.l1 = viewGroup;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AqS152S0200000_5(Fragment fragment, Fragment fragment2, InterfaceC88472Yns<? super Boolean, C76800UCe> interfaceC88472Yns) {
        super(0);
        this.$t = interfaceC88472Yns;
        this.l0 = fragment;
        this.l1 = fragment2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS152S0200000_5(CoHostFriendNoticeService coHostFriendNoticeService, DataChannel dataChannel, int i) {
        super(0);
        this.$t = i;
        this.l0 = coHostFriendNoticeService;
        this.l1 = dataChannel;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS152S0200000_5(PreviewStickerHelper previewStickerHelper, LiveEffect liveEffect, int i) {
        super(0);
        this.$t = i;
        this.l0 = previewStickerHelper;
        this.l1 = liveEffect;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS152S0200000_5(GameDropsPreviewBanner gameDropsPreviewBanner, Drawable drawable, int i) {
        super(0);
        this.$t = i;
        this.l0 = gameDropsPreviewBanner;
        this.l1 = drawable;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS152S0200000_5(TryModeBroadcastInteractionFragment tryModeBroadcastInteractionFragment, View view, int i) {
        super(0);
        this.$t = i;
        this.l0 = tryModeBroadcastInteractionFragment;
        this.l1 = view;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS152S0200000_5(VideoBroadcastInteractionFragment videoBroadcastInteractionFragment, View view, int i) {
        super(0);
        this.$t = i;
        this.l0 = videoBroadcastInteractionFragment;
        this.l1 = view;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS152S0200000_5(NewTopRightBannerWidget newTopRightBannerWidget, BannerInRoomCollection bannerInRoomCollection, int i) {
        super(0);
        this.$t = i;
        this.l0 = newTopRightBannerWidget;
        this.l1 = bannerInRoomCollection;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS152S0200000_5(SubscriptionSettingFragmentNew subscriptionSettingFragmentNew, CE3 ce3, int i) {
        super(0);
        this.$t = i;
        this.l0 = subscriptionSettingFragmentNew;
        this.l1 = ce3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS152S0200000_5(Room room, C32801Cu5 c32801Cu5, int i) {
        super(0);
        this.$t = i;
        this.l0 = room;
        this.l1 = c32801Cu5;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS152S0200000_5(Room room, DataChannel dataChannel, int i) {
        super(0);
        this.$t = i;
        this.l0 = room;
        this.l1 = dataChannel;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AqS152S0200000_5(List list, List<GradeConfig> list2, C68322mC<File> c68322mC) {
        super(0);
        this.$t = c68322mC;
        this.l0 = list;
        this.l1 = list2;
    }
}

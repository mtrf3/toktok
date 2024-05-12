package X;

import Y.ARunnableS41S0100000_5;
import android.app.Dialog;
import android.view.View;
import android.widget.FrameLayout;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import com.bytedance.android.live.effect.api.IEffectService;
import com.bytedance.android.livesdk.broadcast.preview.widget.LiveGoalPreviewButtonWidget;
import com.bytedance.android.livesdk.broadcast.preview.widget.LiveGoalPreviewWidget;
import com.bytedance.android.livesdk.broadcast.preview.widget.PreviewApplyWidget;
import com.bytedance.android.livesdk.broadcast.preview.widget.PreviewBeautyWidget;
import com.bytedance.android.livesdk.broadcast.preview.widget.PreviewCloseWidget;
import com.bytedance.android.livesdk.broadcast.preview.widget.PreviewCommercialWidget;
import com.bytedance.android.livesdk.broadcast.preview.widget.PreviewCustomPollWidget;
import com.bytedance.android.livesdk.broadcast.preview.widget.PreviewFilterStyleWidget;
import com.bytedance.android.livesdk.broadcast.preview.widget.PreviewLiveCenterWidget;
import com.bytedance.android.livesdk.broadcast.preview.widget.PreviewLiveDetailWidget;
import com.bytedance.android.livesdk.broadcast.preview.widget.PreviewMoreWidget;
import com.bytedance.android.livesdk.broadcast.preview.widget.PreviewPromoteWidget;
import com.bytedance.android.livesdk.broadcast.preview.widget.PreviewReverseCameraWidget;
import com.bytedance.android.livesdk.broadcast.preview.widget.PreviewStickerHintWidget;
import com.bytedance.android.livesdk.broadcast.preview.widget.PreviewStickerWidget;
import com.bytedance.android.livesdk.broadcast.preview.widget.PreviewSubscriptionWidget;
import com.bytedance.android.livesdk.broadcast.preview.widget.PreviewTitleWidget;
import com.bytedance.android.livesdk.broadcast.preview.widget.SwitchButtonWidget;
import com.bytedance.android.livesdk.broadcast.preview.widget.cover.PreviewCoverWidget;
import com.bytedance.android.livesdk.broadcast.preview.widget.levelup.PreviewLevelUpNotifyWidget;
import com.bytedance.android.livesdk.broadcast.preview.widget.livegoal.PreviewLiveGoalEffectWidget;
import com.bytedance.android.livesdk.broadcast.preview.widget.livepro.PreviewLiveProNotifyWidget;
import com.bytedance.android.livesdk.broadcast.preview.widget.notify.PreviewCommonNotifyWidget;
import com.bytedance.android.livesdk.broadcast.preview.widget.replay.PreviewReplayWidget;
import com.bytedance.android.livesdk.broadcast.preview.widget.setting.PreviewSettingWidget;
import com.bytedance.android.livesdk.broadcast.preview.widget.share.PreviewShareWidget;
import com.bytedance.android.livesdk.broadcast.preview.widget.start_live.PreviewStartLiveWidget;
import com.bytedance.android.livesdk.dataChannel.AccessRecallVisibilityChannel;
import com.bytedance.android.livesdk.dataChannel.BlockVisibilityChannel;
import com.bytedance.android.livesdk.dataChannel.CustomPollEnableChannel;
import com.bytedance.android.livesdk.dataChannel.EffectDialogShowChannel;
import com.bytedance.android.livesdk.dataChannel.LevelupNotifyBannerChannel;
import com.bytedance.android.livesdk.dataChannel.LiveGoalDialogShowChannel;
import com.bytedance.android.livesdk.dataChannel.LiveProNotifyBannerChannel;
import com.bytedance.android.livesdk.dataChannel.LiveSimplifiedVisibilityChannel;
import com.bytedance.android.livesdk.dataChannel.ReplayEnableChannel;
import com.bytedance.android.livesdk.dataChannel.ReplayInfluenceBannerChannel;
import com.bytedance.android.livesdk.dataChannel.RoomCreateInfoChannel;
import com.bytedance.android.livesdk.dataChannel.StickerDialogShowChannel;
import com.bytedance.android.livesdk.livesetting.broadcast.LivePreviewComponentsSimplifyTypeSetting;
import com.bytedance.android.livesdk.livesetting.broadcast.preview.LivePreviewMoreSetting;
import com.bytedance.android.livesdk.livesetting.effect.LiveEffectFaceDetectAllowlistSetting;
import com.bytedance.android.livesdk.livesetting.gift.LiveGoalAnchorAccessControlSetting;
import com.bytedance.android.livesdk.livesetting.gift.LiveGoalReverseControlSetting;
import com.bytedance.android.livesdk.livesetting.performance.LiveGoal2GreenScreenSetting;
import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.google.android.play.core.appupdate.u;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.AqS171S0100000_5;
import ujb.o;

/* renamed from: X.Bve, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C30350Bve extends C0N0 implements InterfaceC72822Si2 {
    public final Fragment LJLILLLLZI;
    public final DataChannel LJLJI;
    public boolean LJLJJI;
    public final C5H3 LJLJJL;
    public final C30561Bz3 LJLJJLL;
    public final YLE LJLJL;
    public final C30426Bws LJLJLJ;
    public final ScaleGestureDetectorOnScaleGestureListenerC30428Bwu LJLJLLL;
    public final InterfaceC08070Tj<? extends LiveEffect> LJLL;
    public long LJLLI;
    public final C9N LJLLILLLL;
    public boolean LJLLJ;
    public int LJLLL;
    public int LJLLLL;
    public final C30429Bwv LJLLLLLL;
    public final C73411SrX LJLZ;
    public long LJZ;
    public final InterfaceC08160Ts LJZI;
    public float LJZL;
    public float LL;
    public boolean LLD;
    public final ARunnableS41S0100000_5 LLF;
    public final C30358Bvm LLFF;
    public final C30367Bvv LLFFF;
    public final java.util.Map<Integer, View> LLFII;

    public final View LJFF(int i) {
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LLFII;
        View view = (View) linkedHashMap.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        if (findViewById == null) {
            return null;
        }
        linkedHashMap.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    @Override // X.C0N0
    public final void LIZJ() {
        if (LivePreviewMoreSetting.INSTANCE.useMoreBtn()) {
            DataChannel dataChannel = this.LJLJI;
            if (dataChannel != null) {
                dataChannel.ov0(this.LJLILLLLZI, RoomCreateInfoChannel.class, new AqS171S0100000_5(this, 67));
                return;
            }
            return;
        }
        LJI();
    }

    public final void LJI() {
        C0N9.LIZ(C65352Pkq.LIZ(PreviewCloseWidget.class), (C31809Ce5) LJFF(R.id.bg2), new InterfaceC65350Pko[]{C65352Pkq.LIZ(StickerDialogShowChannel.class), C65352Pkq.LIZ(EffectDialogShowChannel.class), C65352Pkq.LIZ(LiveGoalDialogShowChannel.class)}, true);
        LivePreviewComponentsSimplifyTypeSetting livePreviewComponentsSimplifyTypeSetting = LivePreviewComponentsSimplifyTypeSetting.INSTANCE;
        View view = null;
        if (livePreviewComponentsSimplifyTypeSetting.inExperiment()) {
            C0N9.LIZ(C65352Pkq.LIZ(PreviewLiveDetailWidget.class), (C31809Ce5) LJFF(R.id.dpf), new InterfaceC65350Pko[]{C65352Pkq.LIZ(StickerDialogShowChannel.class), C65352Pkq.LIZ(EffectDialogShowChannel.class), C65352Pkq.LIZ(LiveGoalDialogShowChannel.class), C65352Pkq.LIZ(LiveSimplifiedVisibilityChannel.class)}, true);
            if (!livePreviewComponentsSimplifyTypeSetting.showFullLiveGoalBtn()) {
                LJFF(R.id.by6).setBackgroundResource(R.color.yi);
            } else {
                LJFF(R.id.by6).setBackgroundResource(R.drawable.cav);
            }
            C29306Beo.LJI(LJFF(R.id.byb));
            C0N9.LIZ(C65352Pkq.LIZ(PreviewReplayWidget.class), (C31809Ce5) LJFF(R.id.ivy), new InterfaceC65350Pko[]{C65352Pkq.LIZ(LevelupNotifyBannerChannel.class), C65352Pkq.LIZ(StickerDialogShowChannel.class), C65352Pkq.LIZ(EffectDialogShowChannel.class), C65352Pkq.LIZ(LiveGoalDialogShowChannel.class), C65352Pkq.LIZ(BlockVisibilityChannel.class), C65352Pkq.LIZ(ReplayEnableChannel.class), C65352Pkq.LIZ(LiveProNotifyBannerChannel.class)}, true);
            if (!LiveGoalReverseControlSetting.INSTANCE.enableReverse() && LiveGoalAnchorAccessControlSetting.INSTANCE.showPreviewWidget()) {
                if (livePreviewComponentsSimplifyTypeSetting.showFullLiveGoalBtn()) {
                    C29306Beo.LJI(LJFF(R.id.e2q));
                    if (BCD.LIZJ(this.LJLJI, C28515BHb.LJLIL, null) == EnumC12540eQ.OFF) {
                        C29306Beo.LJJLIIIJILLIZJL(0, LJFF(R.id.daj));
                    } else {
                        C0N9.LIZ(C65352Pkq.LIZ(LiveGoalPreviewWidget.class), (C31809Ce5) LJFF(R.id.klh), new InterfaceC65350Pko[]{C65352Pkq.LIZ(StickerDialogShowChannel.class), C65352Pkq.LIZ(EffectDialogShowChannel.class), C65352Pkq.LIZ(LiveGoalDialogShowChannel.class), C65352Pkq.LIZ(BlockVisibilityChannel.class)}, true);
                    }
                } else {
                    C0N9.LIZ(C65352Pkq.LIZ(LiveGoalPreviewButtonWidget.class), (C31809Ce5) LJFF(R.id.fwz), new InterfaceC65350Pko[]{C65352Pkq.LIZ(StickerDialogShowChannel.class), C65352Pkq.LIZ(EffectDialogShowChannel.class), C65352Pkq.LIZ(LiveGoalDialogShowChannel.class), C65352Pkq.LIZ(BlockVisibilityChannel.class)}, true);
                    C29306Beo.LJI(LJFF(R.id.daj));
                }
            }
            C65776Prg sj = C7N.LIZJ().sj();
            if ((sj instanceof InterfaceC65350Pko) && sj != null) {
                C0N9.LIZ(sj, (C31809Ce5) LJFF(R.id.agf), new InterfaceC65350Pko[]{C65352Pkq.LIZ(BlockVisibilityChannel.class), C65352Pkq.LIZ(ReplayInfluenceBannerChannel.class), C65352Pkq.LIZ(StickerDialogShowChannel.class), C65352Pkq.LIZ(EffectDialogShowChannel.class), C65352Pkq.LIZ(LiveGoalDialogShowChannel.class), C65352Pkq.LIZ(LiveProNotifyBannerChannel.class), C65352Pkq.LIZ(LevelupNotifyBannerChannel.class)}, true);
            }
            C0N9.LIZ(C65352Pkq.LIZ(PreviewLiveProNotifyWidget.class), (C31809Ce5) LJFF(R.id.fy1), new InterfaceC65350Pko[]{C65352Pkq.LIZ(BlockVisibilityChannel.class), C65352Pkq.LIZ(LevelupNotifyBannerChannel.class), C65352Pkq.LIZ(StickerDialogShowChannel.class), C65352Pkq.LIZ(EffectDialogShowChannel.class), C65352Pkq.LIZ(LiveGoalDialogShowChannel.class)}, true);
        } else {
            C0N9.LIZ(C65352Pkq.LIZ(PreviewCoverWidget.class), (C31809Ce5) LJFF(R.id.byb), new InterfaceC65350Pko[]{C65352Pkq.LIZ(StickerDialogShowChannel.class), C65352Pkq.LIZ(EffectDialogShowChannel.class), C65352Pkq.LIZ(LiveGoalDialogShowChannel.class), C65352Pkq.LIZ(LiveSimplifiedVisibilityChannel.class)}, true);
            C0N9.LIZ(C65352Pkq.LIZ(PreviewTitleWidget.class), (C31809Ce5) LJFF(R.id.lau), new InterfaceC65350Pko[]{C65352Pkq.LIZ(StickerDialogShowChannel.class), C65352Pkq.LIZ(EffectDialogShowChannel.class), C65352Pkq.LIZ(LiveGoalDialogShowChannel.class), C65352Pkq.LIZ(LiveSimplifiedVisibilityChannel.class)}, true);
            if (!LiveGoalReverseControlSetting.INSTANCE.enableReverse() && LiveGoalAnchorAccessControlSetting.INSTANCE.showPreviewWidget()) {
                C0N9.LIZ(C65352Pkq.LIZ(LiveGoalPreviewWidget.class), (C31809Ce5) LJFF(R.id.klh), new InterfaceC65350Pko[]{C65352Pkq.LIZ(StickerDialogShowChannel.class), C65352Pkq.LIZ(EffectDialogShowChannel.class), C65352Pkq.LIZ(LiveGoalDialogShowChannel.class), C65352Pkq.LIZ(BlockVisibilityChannel.class)}, true);
            }
            C65776Prg nk = C7N.LJIIJ().nk();
            if ((nk instanceof InterfaceC65350Pko) && nk != null) {
                C0N9.LIZ(nk, (C31809Ce5) LJFF(R.id.e2q), new InterfaceC65350Pko[]{C65352Pkq.LIZ(StickerDialogShowChannel.class), C65352Pkq.LIZ(EffectDialogShowChannel.class), C65352Pkq.LIZ(LiveGoalDialogShowChannel.class), C65352Pkq.LIZ(BlockVisibilityChannel.class), C65352Pkq.LIZ(AccessRecallVisibilityChannel.class)}, true);
            }
            C0N9.LIZ(C65352Pkq.LIZ(PreviewReplayWidget.class), (C31809Ce5) LJFF(R.id.ivy), new InterfaceC65350Pko[]{C65352Pkq.LIZ(StickerDialogShowChannel.class), C65352Pkq.LIZ(EffectDialogShowChannel.class), C65352Pkq.LIZ(LiveGoalDialogShowChannel.class), C65352Pkq.LIZ(BlockVisibilityChannel.class), C65352Pkq.LIZ(ReplayEnableChannel.class)}, true);
            C65776Prg sj2 = C7N.LIZJ().sj();
            if ((sj2 instanceof InterfaceC65350Pko) && sj2 != null) {
                C0N9.LIZ(sj2, (C31809Ce5) LJFF(R.id.agf), new InterfaceC65350Pko[]{C65352Pkq.LIZ(BlockVisibilityChannel.class), C65352Pkq.LIZ(ReplayInfluenceBannerChannel.class), C65352Pkq.LIZ(StickerDialogShowChannel.class), C65352Pkq.LIZ(EffectDialogShowChannel.class), C65352Pkq.LIZ(LiveGoalDialogShowChannel.class), C65352Pkq.LIZ(LiveProNotifyBannerChannel.class)}, true);
            }
            C0N9.LIZ(C65352Pkq.LIZ(PreviewLiveProNotifyWidget.class), (C31809Ce5) LJFF(R.id.fy1), new InterfaceC65350Pko[]{C65352Pkq.LIZ(LevelupNotifyBannerChannel.class), C65352Pkq.LIZ(StickerDialogShowChannel.class), C65352Pkq.LIZ(EffectDialogShowChannel.class), C65352Pkq.LIZ(LiveGoalDialogShowChannel.class)}, true);
        }
        C0N9.LIZ(C65352Pkq.LIZ(PreviewReverseCameraWidget.class), (C31809Ce5) LJFF(R.id.j0a), new InterfaceC65350Pko[]{C65352Pkq.LIZ(StickerDialogShowChannel.class), C65352Pkq.LIZ(EffectDialogShowChannel.class), C65352Pkq.LIZ(LiveGoalDialogShowChannel.class)}, true);
        C0N9.LIZ(C65352Pkq.LIZ(PreviewCommonNotifyWidget.class), (C31809Ce5) LJFF(R.id.h64), new InterfaceC65350Pko[0], true);
        C0N9.LIZ(C65352Pkq.LIZ(PreviewShareWidget.class), (C31809Ce5) LJFF(R.id.jvi), new InterfaceC65350Pko[]{C65352Pkq.LIZ(StickerDialogShowChannel.class), C65352Pkq.LIZ(EffectDialogShowChannel.class), C65352Pkq.LIZ(LiveGoalDialogShowChannel.class)}, true);
        C0N9.LIZ(C65352Pkq.LIZ(PreviewSettingWidget.class), (C31809Ce5) LJFF(R.id.jr7), new InterfaceC65350Pko[]{C65352Pkq.LIZ(StickerDialogShowChannel.class), C65352Pkq.LIZ(EffectDialogShowChannel.class), C65352Pkq.LIZ(LiveGoalDialogShowChannel.class)}, true);
        C0N9.LIZ(C65352Pkq.LIZ(PreviewLevelUpNotifyWidget.class), (C31809Ce5) LJFF(R.id.a2t), new InterfaceC65350Pko[]{C65352Pkq.LIZ(BlockVisibilityChannel.class), C65352Pkq.LIZ(StickerDialogShowChannel.class), C65352Pkq.LIZ(EffectDialogShowChannel.class), C65352Pkq.LIZ(LiveGoalDialogShowChannel.class)}, true);
        C0N9.LIZ(C65352Pkq.LIZ(PreviewLiveCenterWidget.class), (C31809Ce5) LJFF(R.id.fws), new InterfaceC65350Pko[]{C65352Pkq.LIZ(StickerDialogShowChannel.class), C65352Pkq.LIZ(EffectDialogShowChannel.class), C65352Pkq.LIZ(LiveGoalDialogShowChannel.class)}, true);
        if (C78540Us4.LJJIIJ()) {
            C0N9.LIZ(C65352Pkq.LIZ(PreviewStartLiveWidget.class), (C31809Ce5) LJFF(R.id.kd7), new InterfaceC65350Pko[]{C65352Pkq.LIZ(StickerDialogShowChannel.class), C65352Pkq.LIZ(EffectDialogShowChannel.class), C65352Pkq.LIZ(LiveGoalDialogShowChannel.class)}, true);
            C0N9.LIZ(C65352Pkq.LIZ(SwitchButtonWidget.class), (C31809Ce5) LJFF(R.id.kxm), new InterfaceC65350Pko[]{C65352Pkq.LIZ(StickerDialogShowChannel.class), C65352Pkq.LIZ(EffectDialogShowChannel.class), C65352Pkq.LIZ(LiveGoalDialogShowChannel.class)}, true);
        } else {
            C0N9.LIZ(C65352Pkq.LIZ(PreviewStartLiveWidget.class), (C31809Ce5) LJFF(R.id.kd6), new InterfaceC65350Pko[]{C65352Pkq.LIZ(StickerDialogShowChannel.class), C65352Pkq.LIZ(EffectDialogShowChannel.class), C65352Pkq.LIZ(LiveGoalDialogShowChannel.class)}, true);
        }
        C0N9.LIZ(C65352Pkq.LIZ(PreviewBeautyWidget.class), (C31809Ce5) LJFF(R.id.ai1), new InterfaceC65350Pko[]{C65352Pkq.LIZ(StickerDialogShowChannel.class), C65352Pkq.LIZ(EffectDialogShowChannel.class), C65352Pkq.LIZ(LiveGoalDialogShowChannel.class)}, true);
        C0N9.LIZ(C65352Pkq.LIZ(PreviewStickerWidget.class), (C31809Ce5) LJFF(R.id.kkq), new InterfaceC65350Pko[]{C65352Pkq.LIZ(StickerDialogShowChannel.class), C65352Pkq.LIZ(EffectDialogShowChannel.class), C65352Pkq.LIZ(LiveGoalDialogShowChannel.class)}, true);
        PreviewStickerWidget previewStickerWidget = (PreviewStickerWidget) C0N9.LIZIZ(C65352Pkq.LIZ(PreviewStickerWidget.class));
        if (previewStickerWidget != null) {
            previewStickerWidget.LJLJJI = (FrameLayout) LJFF(R.id.kgq);
        }
        C0N9.LIZ(C65352Pkq.LIZ(PreviewApplyWidget.class), (C31809Ce5) LJFF(R.id.a6x), new InterfaceC65350Pko[0], true);
        PreviewApplyWidget previewApplyWidget = (PreviewApplyWidget) C0N9.LIZIZ(C65352Pkq.LIZ(PreviewApplyWidget.class));
        if (previewApplyWidget != null) {
            previewApplyWidget.LJLJL = (C119774mz) LJFF(R.id.gn2);
        }
        C0N9.LIZ(C65352Pkq.LIZ(PreviewSubscriptionWidget.class), (C31809Ce5) LJFF(R.id.kq8), new InterfaceC65350Pko[]{C65352Pkq.LIZ(StickerDialogShowChannel.class), C65352Pkq.LIZ(EffectDialogShowChannel.class), C65352Pkq.LIZ(LiveGoalDialogShowChannel.class)}, true);
        EnumC12540eQ LIZJ = BCD.LIZJ(this.LJLJI, BHG.LJLIL, null);
        EnumC12540eQ enumC12540eQ = EnumC12540eQ.ON;
        if (LIZJ == enumC12540eQ) {
            C0N9.LIZ(C65352Pkq.LIZ(PreviewCustomPollWidget.class), (C31809Ce5) LJFF(R.id.c2n), new InterfaceC65350Pko[]{C65352Pkq.LIZ(StickerDialogShowChannel.class), C65352Pkq.LIZ(EffectDialogShowChannel.class), C65352Pkq.LIZ(LiveGoalDialogShowChannel.class), C65352Pkq.LIZ(CustomPollEnableChannel.class)}, true);
        }
        C0N9.LIZ(C65352Pkq.LIZ(PreviewFilterStyleWidget.class), (C31809Ce5) LJFF(R.id.d_c), new InterfaceC65350Pko[0], true);
        C0N9.LIZ(C65352Pkq.LIZ(PreviewStickerHintWidget.class), (C31809Ce5) LJFF(R.id.drp), new InterfaceC65350Pko[0], true);
        C0N9.LIZ(C65352Pkq.LIZ(PreviewCommercialWidget.class), (C31809Ce5) LJFF(R.id.b1g), new InterfaceC65350Pko[]{C65352Pkq.LIZ(StickerDialogShowChannel.class), C65352Pkq.LIZ(EffectDialogShowChannel.class), C65352Pkq.LIZ(LiveGoalDialogShowChannel.class), C65352Pkq.LIZ(AccessRecallVisibilityChannel.class), C65352Pkq.LIZ(BlockVisibilityChannel.class)}, true);
        PreviewCommercialWidget previewCommercialWidget = (PreviewCommercialWidget) C0N9.LIZIZ(C65352Pkq.LIZ(PreviewCommercialWidget.class));
        if (previewCommercialWidget != null) {
            previewCommercialWidget.LLIIIILZ();
        }
        if (BCD.LIZJ(this.LJLJI, BHO.LJLIL, null) == enumC12540eQ) {
            C0N9.LIZ(C65352Pkq.LIZ(PreviewPromoteWidget.class), (C31809Ce5) LJFF(R.id.ibt), new InterfaceC65350Pko[]{C65352Pkq.LIZ(StickerDialogShowChannel.class), C65352Pkq.LIZ(EffectDialogShowChannel.class), C65352Pkq.LIZ(LiveGoalDialogShowChannel.class), C65352Pkq.LIZ(AccessRecallVisibilityChannel.class), C65352Pkq.LIZ(BlockVisibilityChannel.class)}, true);
        }
        if (LiveGoal2GreenScreenSetting.INSTANCE.getEnable()) {
            C0N9.LIZ(C65352Pkq.LIZ(PreviewLiveGoalEffectWidget.class), (C31809Ce5) LJFF(R.id.fx0), new InterfaceC65350Pko[]{C65352Pkq.LIZ(LiveGoalDialogShowChannel.class)}, true);
        }
        if (LivePreviewMoreSetting.INSTANCE.useMoreBtn()) {
            C0N9.LIZ(C65352Pkq.LIZ(PreviewMoreWidget.class), (C31809Ce5) LJFF(R.id.gn_), new InterfaceC65350Pko[]{C65352Pkq.LIZ(StickerDialogShowChannel.class), C65352Pkq.LIZ(EffectDialogShowChannel.class), C65352Pkq.LIZ(LiveGoalDialogShowChannel.class), C65352Pkq.LIZ(AccessRecallVisibilityChannel.class), C65352Pkq.LIZ(BlockVisibilityChannel.class)}, true);
            PreviewMoreWidget previewMoreWidget = (PreviewMoreWidget) C0N9.LIZIZ(C65352Pkq.LIZ(PreviewMoreWidget.class));
            if (previewMoreWidget != null) {
                previewMoreWidget.LJLJJLL = (C119774mz) LJFF(R.id.gn2);
            }
        }
        C30429Bwv c30429Bwv = this.LJLLLLLL;
        if (c30429Bwv != null) {
            view = c30429Bwv.getView();
        }
        C29306Beo.LJIIIZ(view);
    }

    public final InterfaceC30359Bvn getLiveParamsListener() {
        return (InterfaceC30359Bvn) this.LJLJJL.getValue();
    }

    public final boolean LJII() {
        java.util.Map<String, LiveEffect> map;
        java.util.Map<String, LiveEffect> map2;
        Collection<LiveEffect> values;
        List LLJI;
        List<String> list;
        java.util.Map<String, java.util.Map<String, LiveEffect>> Z5 = C30355Bvj.LIZJ().Z5();
        String str = C0TY.LIZIZ;
        if (Z5.containsKey(str) && (map = Z5.get(str)) != null && (!map.isEmpty()) && (map2 = Z5.get(str)) != null && (values = map2.values()) != null && (LLJI = ORZ.LLJI(values)) != null) {
            ArrayList arrayList = new ArrayList();
            Iterator it = LLJI.iterator();
            while (it.hasNext()) {
                Effect effect = ((LiveEffect) it.next()).getEffect();
                if (effect == null || (list = effect.getRequirements()) == null) {
                    list = C61878OQg.INSTANCE;
                }
                ORS.LJJLIIIJILLIZJL(list, arrayList);
            }
            if (!arrayList.isEmpty()) {
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    String str2 = (String) it2.next();
                    for (String str3 : LiveEffectFaceDetectAllowlistSetting.INSTANCE.getALLOWLIST()) {
                        if (o.LJJJLIIL(str2, str3, false)) {
                            ActivityC45651qj mo49getActivity = this.LJLILLLLZI.mo49getActivity();
                            if (mo49getActivity != null) {
                                mo49getActivity.runOnUiThread(new ARunnableS41S0100000_5(this, 24));
                            }
                            return true;
                        }
                    }
                }
            }
            ActivityC45651qj mo49getActivity2 = this.LJLILLLLZI.mo49getActivity();
            if (mo49getActivity2 != null) {
                mo49getActivity2.runOnUiThread(new ARunnableS41S0100000_5(this, 25));
            }
        }
        return false;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C30350Bve(androidx.fragment.app.Fragment r12) {
        /*
            Method dump skipped, instructions count: 713
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C30350Bve.<init>(androidx.fragment.app.Fragment):void");
    }

    @Override // X.InterfaceC72822Si2
    public final void onReceiveJsEvent(C199097rd c199097rd) {
        InterfaceC78280Uns interfaceC78280Uns;
        String str = c199097rd.LJLIL;
        String str2 = null;
        if (kotlin.jvm.internal.o.LJ(str, "live_open_onboaring_tips")) {
            InterfaceC78280Uns interfaceC78280Uns2 = c199097rd.LJLILLLLZI;
            if (interfaceC78280Uns2 != null) {
                str2 = u.LJJIJIL(interfaceC78280Uns2, "enter_from", "");
            }
            BQT.LIZ(this.LJLJI, str2);
            return;
        }
        if (!kotlin.jvm.internal.o.LJ(str, "live_goal_update_event") || (interfaceC78280Uns = c199097rd.LJLILLLLZI) == null) {
            return;
        }
        InterfaceC08090Tl liveGoalEffectHelper = ((IEffectService) CN1.LIZ(IEffectService.class)).getLiveGoalEffectHelper();
        if (u.LJJIIZI(interfaceC78280Uns, "isQuit", false)) {
            ((C31691Mf) liveGoalEffectHelper).LJIILL();
            return;
        }
        if (u.LJJIJIIJI(interfaceC78280Uns, "live_goal_background_position", 0) == 0) {
            ((C31691Mf) liveGoalEffectHelper).LJIIJJI();
        } else {
            C31691Mf.LJJI();
            C31691Mf.LJJ();
        }
        liveGoalEffectHelper.getClass();
        C31691Mf.LJI(C49521wy.LJLIL);
        C31691Mf.LJ = null;
    }

    public final void setLiveFilterPos$livebroadcast_impl_release(int i) {
        DialogFragment dialogFragment;
        Dialog dialog;
        if (this.LJLILLLLZI.isAdded()) {
            Fragment LJJJIL = this.LJLILLLLZI.getChildFragmentManager().LJJJIL("LiveBeautyFilterDialogFragment");
            if ((LJJJIL instanceof DialogFragment) && (dialogFragment = (DialogFragment) LJJJIL) != null && (dialog = dialogFragment.getDialog()) != null && dialog.isShowing()) {
                return;
            }
        }
        Integer LIZJ = InterfaceC30442Bx8.LJIJI.LIZJ();
        if (LIZJ != null && LIZJ.intValue() == i) {
            return;
        }
        C48459J0d<Boolean> c48459J0d = InterfaceC30442Bx8.LLZZLLIL;
        if (C29306Beo.LJIILLIIL(c48459J0d.LIZJ())) {
            c48459J0d.LIZ(Boolean.TRUE);
        }
        this.LJLL.LJFF(i);
        ((C32021Nm) C30355Bvj.LJIIIIZZ()).LIZJ("VideoModeContainer#setLiveFilterPos", false);
        ((C32021Nm) C30355Bvj.LJIIIIZZ()).LJI(this.LJLJI, "VideoModeContainer#setLiveFilterPos", false, false);
        C30355Bvj.LJIIIIZZ();
        C32021Nm.LIZ("VideoModeContainer#setLiveFilterPos");
    }
}

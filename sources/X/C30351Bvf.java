package X;

import Y.ARunnableS41S0100000_5;
import android.app.Dialog;
import android.view.View;
import android.widget.FrameLayout;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import com.bytedance.android.livesdk.broadcast.preview.widget.LiveGoalPreviewButtonWidget;
import com.bytedance.android.livesdk.broadcast.preview.widget.PreviewApplyWidget;
import com.bytedance.android.livesdk.broadcast.preview.widget.PreviewBeautyWidget;
import com.bytedance.android.livesdk.broadcast.preview.widget.PreviewCloseWidget;
import com.bytedance.android.livesdk.broadcast.preview.widget.PreviewCommercialWidget;
import com.bytedance.android.livesdk.broadcast.preview.widget.PreviewCustomPollWidget;
import com.bytedance.android.livesdk.broadcast.preview.widget.PreviewFilterStyleWidget;
import com.bytedance.android.livesdk.broadcast.preview.widget.PreviewLiveCenterWidget;
import com.bytedance.android.livesdk.broadcast.preview.widget.PreviewPromoteWidget;
import com.bytedance.android.livesdk.broadcast.preview.widget.PreviewReverseCameraWidget;
import com.bytedance.android.livesdk.broadcast.preview.widget.PreviewStickerHintWidget;
import com.bytedance.android.livesdk.broadcast.preview.widget.PreviewStickerWidget;
import com.bytedance.android.livesdk.broadcast.preview.widget.PreviewSubscriptionWidget;
import com.bytedance.android.livesdk.broadcast.preview.widget.SwitchButtonWidget;
import com.bytedance.android.livesdk.broadcast.preview.widget.TryModeIntroductionWidget;
import com.bytedance.android.livesdk.broadcast.preview.widget.cover.PreviewCoverWidget;
import com.bytedance.android.livesdk.broadcast.preview.widget.livegoal.PreviewLiveGoalEffectWidget;
import com.bytedance.android.livesdk.broadcast.preview.widget.setting.PreviewSettingWidget;
import com.bytedance.android.livesdk.broadcast.preview.widget.share.PreviewShareWidget;
import com.bytedance.android.livesdk.broadcast.preview.widget.start_live.PreviewPracticeLiveWidget;
import com.bytedance.android.livesdk.broadcast.preview.widget.start_live.PreviewStartLiveWidget;
import com.bytedance.android.livesdk.dataChannel.AccessRecallVisibilityChannel;
import com.bytedance.android.livesdk.dataChannel.BlockVisibilityChannel;
import com.bytedance.android.livesdk.dataChannel.CustomPollEnableChannel;
import com.bytedance.android.livesdk.dataChannel.EffectDialogShowChannel;
import com.bytedance.android.livesdk.dataChannel.LiveGoalDialogShowChannel;
import com.bytedance.android.livesdk.dataChannel.StickerDialogShowChannel;
import com.bytedance.android.livesdk.dataChannel.TryModeV1PreloadGoLiveChannel;
import com.bytedance.android.livesdk.livesetting.broadcast.LivePreviewComponentsSimplifyTypeSetting;
import com.bytedance.android.livesdk.livesetting.effect.LiveEffectFaceDetectAllowlistSetting;
import com.bytedance.android.livesdk.livesetting.gift.LiveGoalAnchorAccessControlSetting;
import com.bytedance.android.livesdk.livesetting.gift.LiveGoalReverseControlSetting;
import com.bytedance.android.livesdk.livesetting.performance.LiveGoal2GreenScreenSetting;
import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import ujb.o;

/* renamed from: X.Bvf, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C30351Bvf extends C0N0 {
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
    public final C30357Bvl LLFF;
    public final C30366Bvu LLFFF;
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
        C0N9.LIZ(C65352Pkq.LIZ(PreviewCoverWidget.class), (C31809Ce5) LJFF(R.id.byb), new InterfaceC65350Pko[0], true);
        if (!LiveGoalReverseControlSetting.INSTANCE.enableReverse() && LiveGoalAnchorAccessControlSetting.INSTANCE.showPreviewWidget() && LivePreviewComponentsSimplifyTypeSetting.INSTANCE.showBottomLiveGoalBtn()) {
            C0N9.LIZ(C65352Pkq.LIZ(LiveGoalPreviewButtonWidget.class), (C31809Ce5) LJFF(R.id.fwz), new InterfaceC65350Pko[]{C65352Pkq.LIZ(StickerDialogShowChannel.class), C65352Pkq.LIZ(EffectDialogShowChannel.class), C65352Pkq.LIZ(LiveGoalDialogShowChannel.class), C65352Pkq.LIZ(BlockVisibilityChannel.class)}, true);
        }
        C0N9.LIZ(C65352Pkq.LIZ(PreviewCloseWidget.class), (C31809Ce5) LJFF(R.id.bg2), new InterfaceC65350Pko[]{C65352Pkq.LIZ(StickerDialogShowChannel.class), C65352Pkq.LIZ(EffectDialogShowChannel.class), C65352Pkq.LIZ(LiveGoalDialogShowChannel.class)}, true);
        C0N9.LIZ(C65352Pkq.LIZ(TryModeIntroductionWidget.class), (C31809Ce5) LJFF(R.id.erj), new InterfaceC65350Pko[]{C65352Pkq.LIZ(StickerDialogShowChannel.class), C65352Pkq.LIZ(EffectDialogShowChannel.class), C65352Pkq.LIZ(LiveGoalDialogShowChannel.class)}, true);
        C0N9.LIZ(C65352Pkq.LIZ(PreviewReverseCameraWidget.class), (C31809Ce5) LJFF(R.id.j0a), new InterfaceC65350Pko[]{C65352Pkq.LIZ(StickerDialogShowChannel.class), C65352Pkq.LIZ(EffectDialogShowChannel.class), C65352Pkq.LIZ(LiveGoalDialogShowChannel.class)}, true);
        C0N9.LIZ(C65352Pkq.LIZ(PreviewShareWidget.class), (C31809Ce5) LJFF(R.id.jvi), new InterfaceC65350Pko[]{C65352Pkq.LIZ(StickerDialogShowChannel.class), C65352Pkq.LIZ(EffectDialogShowChannel.class), C65352Pkq.LIZ(LiveGoalDialogShowChannel.class)}, true);
        C0N9.LIZ(C65352Pkq.LIZ(PreviewSettingWidget.class), (C31809Ce5) LJFF(R.id.jr7), new InterfaceC65350Pko[]{C65352Pkq.LIZ(StickerDialogShowChannel.class), C65352Pkq.LIZ(EffectDialogShowChannel.class), C65352Pkq.LIZ(LiveGoalDialogShowChannel.class)}, true);
        C0N9.LIZ(C65352Pkq.LIZ(PreviewLiveCenterWidget.class), (C31809Ce5) LJFF(R.id.fws), new InterfaceC65350Pko[]{C65352Pkq.LIZ(StickerDialogShowChannel.class), C65352Pkq.LIZ(EffectDialogShowChannel.class), C65352Pkq.LIZ(LiveGoalDialogShowChannel.class)}, true);
        if (C78540Us4.LJJIIJ()) {
            C0N9.LIZ(C65352Pkq.LIZ(PreviewPracticeLiveWidget.class), (C31809Ce5) LJFF(R.id.i0h), new InterfaceC65350Pko[]{C65352Pkq.LIZ(StickerDialogShowChannel.class), C65352Pkq.LIZ(EffectDialogShowChannel.class), C65352Pkq.LIZ(LiveGoalDialogShowChannel.class)}, true);
            C0N9.LIZ(C65352Pkq.LIZ(SwitchButtonWidget.class), (C31809Ce5) LJFF(R.id.kxm), new InterfaceC65350Pko[]{C65352Pkq.LIZ(StickerDialogShowChannel.class), C65352Pkq.LIZ(EffectDialogShowChannel.class), C65352Pkq.LIZ(LiveGoalDialogShowChannel.class)}, true);
            C0N9.LIZ(C65352Pkq.LIZ(PreviewStartLiveWidget.class), (C31809Ce5) LJFF(R.id.kd7), new InterfaceC65350Pko[]{C65352Pkq.LIZ(TryModeV1PreloadGoLiveChannel.class)}, true);
        } else if (C78540Us4.LJJIIJZLJL()) {
            C0N9.LIZ(C65352Pkq.LIZ(PreviewPracticeLiveWidget.class), (C31809Ce5) LJFF(R.id.i0i), new InterfaceC65350Pko[]{C65352Pkq.LIZ(StickerDialogShowChannel.class), C65352Pkq.LIZ(EffectDialogShowChannel.class), C65352Pkq.LIZ(LiveGoalDialogShowChannel.class)}, true);
            C0N9.LIZ(C65352Pkq.LIZ(PreviewStartLiveWidget.class), (C31809Ce5) LJFF(R.id.kd8), new InterfaceC65350Pko[]{C65352Pkq.LIZ(StickerDialogShowChannel.class), C65352Pkq.LIZ(EffectDialogShowChannel.class), C65352Pkq.LIZ(LiveGoalDialogShowChannel.class)}, true);
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
            previewApplyWidget.LJLJL = (C119774mz) LJFF(R.id.dj8);
        }
        C0N9.LIZ(C65352Pkq.LIZ(PreviewSubscriptionWidget.class), (C31809Ce5) LJFF(R.id.kq8), new InterfaceC65350Pko[]{C65352Pkq.LIZ(StickerDialogShowChannel.class), C65352Pkq.LIZ(EffectDialogShowChannel.class), C65352Pkq.LIZ(LiveGoalDialogShowChannel.class)}, true);
        View view = null;
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
        C30429Bwv c30429Bwv = this.LJLLLLLL;
        if (c30429Bwv != null) {
            view = c30429Bwv.getView();
        }
        C29306Beo.LJIIIZ(view);
    }

    public final InterfaceC30359Bvn getLiveParamsListener() {
        return (InterfaceC30359Bvn) this.LJLJJL.getValue();
    }

    public final boolean LJI() {
        java.util.Map<String, LiveEffect> map;
        java.util.Map<String, LiveEffect> map2;
        Collection<LiveEffect> values;
        List LLJI;
        List<String> list;
        java.util.Map<String, java.util.Map<String, LiveEffect>> Z5 = C30355Bvj.LIZJ().Z5();
        String str = C0TY.LIZIZ;
        if (!Z5.containsKey(str) || (map = Z5.get(str)) == null || !(!map.isEmpty()) || (map2 = Z5.get(str)) == null || (values = map2.values()) == null || (LLJI = ORZ.LLJI(values)) == null) {
            return false;
        }
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
                            mo49getActivity.runOnUiThread(new ARunnableS41S0100000_5(this, 20));
                        }
                        return true;
                    }
                }
            }
        }
        ActivityC45651qj mo49getActivity2 = this.LJLILLLLZI.mo49getActivity();
        if (mo49getActivity2 == null) {
            return false;
        }
        mo49getActivity2.runOnUiThread(new ARunnableS41S0100000_5(this, 21));
        return false;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C30351Bvf(androidx.fragment.app.Fragment r13) {
        /*
            Method dump skipped, instructions count: 582
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C30351Bvf.<init>(androidx.fragment.app.Fragment):void");
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

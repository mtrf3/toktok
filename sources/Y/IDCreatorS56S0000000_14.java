package Y;

import X.C61447O9r;
import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveBroadcastTaskResourceIdSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.LinkMicMultiGuestV3MaskAvatarSizeTestSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveAudienceLinkmicLowestAgeSetting;
import com.bytedance.android.livesdk.livesetting.other.subscribe_enhance.SubscriptionExpireRemindHourSetting;
import com.bytedance.android.livesdk.widget.LivePagerSlidingTabStrip$SavedState;
import com.bytedance.apm.util.SpPair;
import com.bytedance.ies.bullet.service.popup.anim.BottomSheetBehavior;
import com.bytedance.scene.group.GroupRecord;
import com.bytedance.scene.navigation.Record;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.ss.android.ttve.model.VETrackParams;
import com.ss.android.ugc.aweme.base.widget.CanCancelRadioButton$SavedState;
import com.ss.android.ugc.aweme.effectplatform.FilterEffect;
import com.ss.android.ugc.aweme.filter.FilterBean;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import com.ss.android.ugc.aweme.sticker.StickerWrapper;
import com.ss.android.ugc.aweme.sticker.panel.guide.ExtraParams;
import com.ss.android.ugc.aweme.tools.beauty.views.SwitchButton$SavedState;
import com.ss.android.ugc.aweme.ui.FragmentTabHost;
import com.ss.android.ugc.tools.view.widget.AbstractLoadingLayout$SavedState;
import com.ss.android.vesdk.VEARCoreParam;
import com.ss.android.vesdk.VEAudioEffectBean;
import com.ss.android.vesdk.VECameraSettings;
import com.ss.android.vesdk.VECherEffectParam;
import com.ss.android.vesdk.VEDisplaySettings;
import com.ss.android.vesdk.VEVideoEncodeSettings;
import com.ss.android.vesdk.VEVolumeParam;
import com.ss.android.vesdk.clipparam.VEClipTimelineParam;
import com.ss.android.vesdk.filterparam.VEAmazingFilterParam;
import com.ss.android.vesdk.filterparam.VEAudioDspFilterParam;
import com.ss.android.vesdk.filterparam.VEAudioEffectFilterParam;
import com.ss.android.vesdk.filterparam.VEAudioFadeFilterParam;
import com.ss.android.vesdk.filterparam.VEAudioLoudnessBalanceFilter;
import com.ss.android.vesdk.filterparam.VEAudioMetricsFilterParam;
import com.ss.android.vesdk.filterparam.VEAudioNoiseFilterParam;
import com.ss.android.vesdk.filterparam.VEAudioSamiFilterParam;
import com.ss.android.vesdk.filterparam.VEAudioSpeedFilterParam;
import com.ss.android.vesdk.filterparam.VEAudioVolumeFilterParam;
import com.ss.android.vesdk.filterparam.VEBaseFilterParam;
import com.ss.android.vesdk.filterparam.VEBeautyFilterParam;
import com.ss.android.vesdk.filterparam.VEBlurFilterParam;
import com.ss.android.vesdk.filterparam.VECanvasFilterParam;
import com.ss.android.vesdk.filterparam.VEColorFilterParam;
import com.ss.android.vesdk.filterparam.VEColorHslFilterParam;
import com.ss.android.vesdk.filterparam.VEComposerFilterParam;
import com.ss.android.vesdk.filterparam.VEEffectFilterParam;
import com.ss.android.vesdk.filterparam.VEEffectHdrFilterParam;
import com.ss.android.vesdk.filterparam.VEExposureFilterParam;
import com.ss.android.vesdk.filterparam.VEImageAddFilterParam;
import com.ss.android.vesdk.filterparam.VEImageTransformFilterParam;
import com.ss.android.vesdk.filterparam.VEInfoStickerFilterParam;
import com.ss.android.vesdk.filterparam.VELensHdrFilterParam;
import com.ss.android.vesdk.filterparam.VEMIMOFilterParam;
import com.ss.android.vesdk.filterparam.VEMakeUpFilterParam;
import com.ss.android.vesdk.filterparam.VERepeatFilterParam;
import com.ss.android.vesdk.filterparam.VEReshapeFilterParam;
import com.ss.android.vesdk.filterparam.VERoundFilterParam;
import com.ss.android.vesdk.filterparam.VESlowMotionFilterParam;
import com.ss.android.vesdk.filterparam.VETransitionFilterParam;
import com.ss.android.vesdk.filterparam.VEVideoAjustmentFilterParam;
import com.ss.android.vesdk.filterparam.VEVideoCropFilterParam;
import com.ss.android.vesdk.filterparam.VEVideoEffectOutSizeFilterParam;
import com.ss.android.vesdk.filterparam.VEVideoEffectStreamFilterParam;
import com.ss.android.vesdk.filterparam.VEVideoStableFilterParam;
import com.ss.android.vesdk.filterparam.VEVideoTransformFilterParam;
import com.ss.android.vesdk.model.VEPrePlayParams;
import com.ss.android.vesdk.runtime.VEMapBufferInfo;
import com.ss.ugc.effectplatform.model.Effect;
import com.ttnet.org.chromium.base.UnguessableToken;
import com.zhihu.matisse.internal.entity.Album;
import com.zhihu.matisse.internal.entity.Item;
import kotlin.jvm.internal.o;

/* loaded from: classes15.dex */
public class IDCreatorS56S0000000_14 implements Parcelable.Creator {
    public final int $t;

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.$t) {
            case 0:
                return createFromParcel$0(this, parcel);
            case 1:
                return createFromParcel$1(this, parcel);
            case 2:
                return createFromParcel$2(this, parcel);
            case 3:
                return createFromParcel$3(this, parcel);
            case 4:
                return createFromParcel$4(this, parcel);
            case 5:
                return createFromParcel$5(this, parcel);
            case 6:
                return createFromParcel$6(this, parcel);
            case 7:
                return createFromParcel$7(this, parcel);
            case 8:
                return createFromParcel$8(this, parcel);
            case 9:
                return createFromParcel$9(this, parcel);
            case 10:
                return createFromParcel$10(this, parcel);
            case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                return createFromParcel$11(this, parcel);
            case 12:
                return createFromParcel$12(this, parcel);
            case ABRConfig.ABR_STARTUP_MAX_BITRATE /* 13 */:
                return createFromParcel$13(this, parcel);
            case 14:
                return createFromParcel$14(this, parcel);
            case 15:
                return createFromParcel$15(this, parcel);
            case LiveAudienceLinkmicLowestAgeSetting.DEFAULT /* 16 */:
                return createFromParcel$16(this, parcel);
            case 17:
                return createFromParcel$17(this, parcel);
            case 18:
                return createFromParcel$18(this, parcel);
            case 19:
                return createFromParcel$19(this, parcel);
            case 20:
                return createFromParcel$20(this, parcel);
            case 21:
                return createFromParcel$21(this, parcel);
            case 22:
                return createFromParcel$22(this, parcel);
            case 23:
                return createFromParcel$23(this, parcel);
            case 24:
                return createFromParcel$24(this, parcel);
            case 25:
                return createFromParcel$25(this, parcel);
            case 26:
                return createFromParcel$26(this, parcel);
            case 27:
                return createFromParcel$27(this, parcel);
            case 28:
                return createFromParcel$28(this, parcel);
            case 29:
                return createFromParcel$29(this, parcel);
            case 30:
                return createFromParcel$30(this, parcel);
            case 31:
                return createFromParcel$31(this, parcel);
            case 32:
                return createFromParcel$32(this, parcel);
            case 33:
                return createFromParcel$33(this, parcel);
            case 34:
                return createFromParcel$34(this, parcel);
            case 35:
                return createFromParcel$35(this, parcel);
            case 36:
                return createFromParcel$36(this, parcel);
            case 37:
                return createFromParcel$37(this, parcel);
            case 38:
                return createFromParcel$38(this, parcel);
            case 39:
                return createFromParcel$39(this, parcel);
            case LinkMicMultiGuestV3MaskAvatarSizeTestSetting.SIZE_40 /* 40 */:
                return createFromParcel$40(this, parcel);
            case 41:
                return createFromParcel$41(this, parcel);
            case 42:
                return createFromParcel$42(this, parcel);
            case LiveBroadcastTaskResourceIdSetting.DEFAULT /* 43 */:
                return createFromParcel$43(this, parcel);
            case 44:
                return createFromParcel$44(this, parcel);
            case 45:
                return createFromParcel$45(this, parcel);
            case 46:
                return createFromParcel$46(this, parcel);
            case 47:
                return createFromParcel$47(this, parcel);
            case LinkMicMultiGuestV3MaskAvatarSizeTestSetting.SIZE_48 /* 48 */:
                return createFromParcel$48(this, parcel);
            case C61447O9r.LJIIJ:
                return createFromParcel$49(this, parcel);
            case 50:
                return createFromParcel$50(this, parcel);
            case 51:
                return createFromParcel$51(this, parcel);
            case 52:
                return createFromParcel$52(this, parcel);
            case 53:
                return createFromParcel$53(this, parcel);
            case 54:
                return createFromParcel$54(this, parcel);
            case 55:
                return createFromParcel$55(this, parcel);
            case 56:
                return createFromParcel$56(this, parcel);
            case 57:
                return createFromParcel$57(this, parcel);
            case 58:
                return createFromParcel$58(this, parcel);
            case 59:
                return createFromParcel$59(this, parcel);
            case 60:
                return createFromParcel$60(this, parcel);
            case 61:
                return createFromParcel$61(this, parcel);
            case BaseNotice.CREATOR /* 62 */:
                return createFromParcel$62(this, parcel);
            case 63:
                return createFromParcel$63(this, parcel);
            case 64:
                return createFromParcel$64(this, parcel);
            case 65:
                return createFromParcel$65(this, parcel);
            case 66:
                return createFromParcel$66(this, parcel);
            case 67:
                return createFromParcel$67(this, parcel);
            case 68:
                return createFromParcel$68(this, parcel);
            case 69:
                return createFromParcel$69(this, parcel);
            case 70:
                return createFromParcel$70(this, parcel);
            case 71:
                return createFromParcel$71(this, parcel);
            case SubscriptionExpireRemindHourSetting.DEFAULT /* 72 */:
                return createFromParcel$72(this, parcel);
            default:
                return null;
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.$t) {
            case 0:
                return newArray$0(this, i);
            case 1:
                return newArray$1(this, i);
            case 2:
                return newArray$2(this, i);
            case 3:
                return newArray$3(this, i);
            case 4:
                return newArray$4(this, i);
            case 5:
                return newArray$5(this, i);
            case 6:
                return newArray$6(this, i);
            case 7:
                return newArray$7(this, i);
            case 8:
                return newArray$8(this, i);
            case 9:
                return newArray$9(this, i);
            case 10:
                return newArray$10(this, i);
            case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                return newArray$11(this, i);
            case 12:
                return newArray$12(this, i);
            case ABRConfig.ABR_STARTUP_MAX_BITRATE /* 13 */:
                return newArray$13(this, i);
            case 14:
                return newArray$14(this, i);
            case 15:
                return newArray$15(this, i);
            case LiveAudienceLinkmicLowestAgeSetting.DEFAULT /* 16 */:
                return newArray$16(this, i);
            case 17:
                return newArray$17(this, i);
            case 18:
                return newArray$18(this, i);
            case 19:
                return newArray$19(this, i);
            case 20:
                return newArray$20(this, i);
            case 21:
                return newArray$21(this, i);
            case 22:
                return newArray$22(this, i);
            case 23:
                return newArray$23(this, i);
            case 24:
                return newArray$24(this, i);
            case 25:
                return newArray$25(this, i);
            case 26:
                return newArray$26(this, i);
            case 27:
                return newArray$27(this, i);
            case 28:
                return newArray$28(this, i);
            case 29:
                return newArray$29(this, i);
            case 30:
                return newArray$30(this, i);
            case 31:
                return newArray$31(this, i);
            case 32:
                return newArray$32(this, i);
            case 33:
                return newArray$33(this, i);
            case 34:
                return newArray$34(this, i);
            case 35:
                return newArray$35(this, i);
            case 36:
                return newArray$36(this, i);
            case 37:
                return newArray$37(this, i);
            case 38:
                return newArray$38(this, i);
            case 39:
                return newArray$39(this, i);
            case LinkMicMultiGuestV3MaskAvatarSizeTestSetting.SIZE_40 /* 40 */:
                return newArray$40(this, i);
            case 41:
                return newArray$41(this, i);
            case 42:
                return newArray$42(this, i);
            case LiveBroadcastTaskResourceIdSetting.DEFAULT /* 43 */:
                return newArray$43(this, i);
            case 44:
                return newArray$44(this, i);
            case 45:
                return newArray$45(this, i);
            case 46:
                return newArray$46(this, i);
            case 47:
                return newArray$47(this, i);
            case LinkMicMultiGuestV3MaskAvatarSizeTestSetting.SIZE_48 /* 48 */:
                return newArray$48(this, i);
            case C61447O9r.LJIIJ:
                return newArray$49(this, i);
            case 50:
                return newArray$50(this, i);
            case 51:
                return newArray$51(this, i);
            case 52:
                return newArray$52(this, i);
            case 53:
                return newArray$53(this, i);
            case 54:
                return newArray$54(this, i);
            case 55:
                return newArray$55(this, i);
            case 56:
                return newArray$56(this, i);
            case 57:
                return newArray$57(this, i);
            case 58:
                return newArray$58(this, i);
            case 59:
                return newArray$59(this, i);
            case 60:
                return newArray$60(this, i);
            case 61:
                return newArray$61(this, i);
            case BaseNotice.CREATOR /* 62 */:
                return newArray$62(this, i);
            case 63:
                return newArray$63(this, i);
            case 64:
                return newArray$64(this, i);
            case 65:
                return newArray$65(this, i);
            case 66:
                return newArray$66(this, i);
            case 67:
                return newArray$67(this, i);
            case 68:
                return newArray$68(this, i);
            case 69:
                return newArray$69(this, i);
            case 70:
                return newArray$70(this, i);
            case 71:
                return newArray$71(this, i);
            case SubscriptionExpireRemindHourSetting.DEFAULT /* 72 */:
                return newArray$72(this, i);
            default:
                return new Object[0];
        }
    }

    public IDCreatorS56S0000000_14(int i) {
        this.$t = i;
    }

    public static final Object createFromParcel$0(IDCreatorS56S0000000_14 iDCreatorS56S0000000_14, Parcel parcel) {
        return new LivePagerSlidingTabStrip$SavedState(parcel);
    }

    public static final Object createFromParcel$1(IDCreatorS56S0000000_14 iDCreatorS56S0000000_14, Parcel parcel) {
        return new SpPair(parcel);
    }

    public static final Object createFromParcel$10(IDCreatorS56S0000000_14 iDCreatorS56S0000000_14, Parcel parcel) {
        return new StickerWrapper(parcel);
    }

    public static final Object createFromParcel$11(IDCreatorS56S0000000_14 iDCreatorS56S0000000_14, Parcel parcel) {
        return new ExtraParams(parcel);
    }

    public static final Object createFromParcel$12(IDCreatorS56S0000000_14 iDCreatorS56S0000000_14, Parcel parcel) {
        return new SwitchButton$SavedState(parcel);
    }

    public static final Object createFromParcel$13(IDCreatorS56S0000000_14 iDCreatorS56S0000000_14, Parcel parcel) {
        return new FragmentTabHost.SavedState(parcel);
    }

    public static final Object createFromParcel$14(IDCreatorS56S0000000_14 iDCreatorS56S0000000_14, Parcel parcel) {
        return new AbstractLoadingLayout$SavedState(parcel);
    }

    public static final Object createFromParcel$15(IDCreatorS56S0000000_14 iDCreatorS56S0000000_14, Parcel parcel) {
        return new VEARCoreParam(parcel);
    }

    public static final Object createFromParcel$16(IDCreatorS56S0000000_14 iDCreatorS56S0000000_14, Parcel parcel) {
        return new VEAudioEffectBean(parcel);
    }

    public static final Object createFromParcel$17(IDCreatorS56S0000000_14 iDCreatorS56S0000000_14, Parcel parcel) {
        return VECameraSettings.CAMERA_CAPTURE_FLASH_STRATEGY.values()[parcel.readInt()];
    }

    public static final Object createFromParcel$18(IDCreatorS56S0000000_14 iDCreatorS56S0000000_14, Parcel parcel) {
        return VECameraSettings.CAMERA_FACING_ID.values()[parcel.readInt()];
    }

    public static final Object createFromParcel$19(IDCreatorS56S0000000_14 iDCreatorS56S0000000_14, Parcel parcel) {
        return VECameraSettings.CAMERA_FLASH_MODE.values()[parcel.readInt()];
    }

    public static final Object createFromParcel$2(IDCreatorS56S0000000_14 iDCreatorS56S0000000_14, Parcel parcel) {
        return new BottomSheetBehavior.SavedState(parcel);
    }

    public static final Object createFromParcel$20(IDCreatorS56S0000000_14 iDCreatorS56S0000000_14, Parcel parcel) {
        return VECameraSettings.CAMERA_HW_LEVEL.values()[parcel.readInt()];
    }

    public static final Object createFromParcel$21(IDCreatorS56S0000000_14 iDCreatorS56S0000000_14, Parcel parcel) {
        return VECameraSettings.CAMERA_MODE_TYPE.values()[parcel.readInt()];
    }

    public static final Object createFromParcel$22(IDCreatorS56S0000000_14 iDCreatorS56S0000000_14, Parcel parcel) {
        return VECameraSettings.CAMERA_TYPE.values()[parcel.readInt()];
    }

    public static final Object createFromParcel$23(IDCreatorS56S0000000_14 iDCreatorS56S0000000_14, Parcel parcel) {
        return new VECameraSettings(parcel);
    }

    public static final Object createFromParcel$24(IDCreatorS56S0000000_14 iDCreatorS56S0000000_14, Parcel parcel) {
        int readInt = parcel.readInt();
        int readInt2 = parcel.readInt();
        String[] strArr = new String[readInt];
        parcel.readStringArray(strArr);
        double[] dArr = new double[readInt * 2];
        parcel.readDoubleArray(dArr);
        boolean[] zArr = new boolean[readInt2];
        parcel.readBooleanArray(zArr);
        return new VECherEffectParam(strArr, dArr, zArr);
    }

    public static final Object createFromParcel$25(IDCreatorS56S0000000_14 iDCreatorS56S0000000_14, Parcel parcel) {
        return new VEDisplaySettings(parcel);
    }

    public static final Object createFromParcel$26(IDCreatorS56S0000000_14 iDCreatorS56S0000000_14, Parcel parcel) {
        return VEVideoEncodeSettings.COMPILE_TYPE.values()[parcel.readInt()];
    }

    public static final Object createFromParcel$27(IDCreatorS56S0000000_14 iDCreatorS56S0000000_14, Parcel parcel) {
        return VEVideoEncodeSettings.VEVideoEncodeMirrorMode.values()[parcel.readInt()];
    }

    public static final Object createFromParcel$28(IDCreatorS56S0000000_14 iDCreatorS56S0000000_14, Parcel parcel) {
        return new VEVolumeParam(parcel);
    }

    public static final Object createFromParcel$29(IDCreatorS56S0000000_14 iDCreatorS56S0000000_14, Parcel parcel) {
        return new VEClipTimelineParam(parcel);
    }

    public static final Object createFromParcel$3(IDCreatorS56S0000000_14 iDCreatorS56S0000000_14, Parcel parcel) {
        return new GroupRecord(parcel);
    }

    public static final Object createFromParcel$30(IDCreatorS56S0000000_14 iDCreatorS56S0000000_14, Parcel parcel) {
        return new VEAmazingFilterParam(parcel);
    }

    public static final Object createFromParcel$31(IDCreatorS56S0000000_14 iDCreatorS56S0000000_14, Parcel parcel) {
        return new VEAudioDspFilterParam(parcel);
    }

    public static final Object createFromParcel$32(IDCreatorS56S0000000_14 iDCreatorS56S0000000_14, Parcel parcel) {
        return new VEAudioEffectFilterParam(parcel);
    }

    public static final Object createFromParcel$33(IDCreatorS56S0000000_14 iDCreatorS56S0000000_14, Parcel parcel) {
        return new VEAudioFadeFilterParam(parcel);
    }

    public static final Object createFromParcel$34(IDCreatorS56S0000000_14 iDCreatorS56S0000000_14, Parcel parcel) {
        return new VEAudioLoudnessBalanceFilter(parcel);
    }

    public static final Object createFromParcel$35(IDCreatorS56S0000000_14 iDCreatorS56S0000000_14, Parcel parcel) {
        return new VEAudioMetricsFilterParam(parcel);
    }

    public static final Object createFromParcel$36(IDCreatorS56S0000000_14 iDCreatorS56S0000000_14, Parcel parcel) {
        return new VEAudioNoiseFilterParam(parcel);
    }

    public static final Object createFromParcel$37(IDCreatorS56S0000000_14 iDCreatorS56S0000000_14, Parcel parcel) {
        return new VEAudioSamiFilterParam(parcel);
    }

    public static final Object createFromParcel$38(IDCreatorS56S0000000_14 iDCreatorS56S0000000_14, Parcel parcel) {
        return new VEAudioSpeedFilterParam(parcel);
    }

    public static final Object createFromParcel$39(IDCreatorS56S0000000_14 iDCreatorS56S0000000_14, Parcel parcel) {
        return new VEAudioVolumeFilterParam(parcel);
    }

    public static final Object createFromParcel$4(IDCreatorS56S0000000_14 iDCreatorS56S0000000_14, Parcel parcel) {
        return new Record(parcel);
    }

    public static final Object createFromParcel$40(IDCreatorS56S0000000_14 iDCreatorS56S0000000_14, Parcel parcel) {
        return new VEBaseFilterParam(parcel);
    }

    public static final Object createFromParcel$41(IDCreatorS56S0000000_14 iDCreatorS56S0000000_14, Parcel parcel) {
        return new VEBeautyFilterParam(parcel);
    }

    public static final Object createFromParcel$42(IDCreatorS56S0000000_14 iDCreatorS56S0000000_14, Parcel parcel) {
        return new VEBlurFilterParam(parcel);
    }

    public static final Object createFromParcel$43(IDCreatorS56S0000000_14 iDCreatorS56S0000000_14, Parcel parcel) {
        return new VECanvasFilterParam(parcel);
    }

    public static final Object createFromParcel$44(IDCreatorS56S0000000_14 iDCreatorS56S0000000_14, Parcel parcel) {
        return new VEColorFilterParam(parcel);
    }

    public static final Object createFromParcel$45(IDCreatorS56S0000000_14 iDCreatorS56S0000000_14, Parcel parcel) {
        return new VEColorHslFilterParam(parcel);
    }

    public static final Object createFromParcel$46(IDCreatorS56S0000000_14 iDCreatorS56S0000000_14, Parcel parcel) {
        return new VEComposerFilterParam(parcel);
    }

    public static final Object createFromParcel$47(IDCreatorS56S0000000_14 iDCreatorS56S0000000_14, Parcel parcel) {
        return new VEEffectFilterParam(parcel);
    }

    public static final Object createFromParcel$48(IDCreatorS56S0000000_14 iDCreatorS56S0000000_14, Parcel parcel) {
        return new VEEffectHdrFilterParam(parcel);
    }

    public static final Object createFromParcel$49(IDCreatorS56S0000000_14 iDCreatorS56S0000000_14, Parcel parcel) {
        return new VEExposureFilterParam(parcel);
    }

    public static final Object createFromParcel$5(IDCreatorS56S0000000_14 iDCreatorS56S0000000_14, Parcel parcel) {
        return new VETrackParams(parcel);
    }

    public static final Object createFromParcel$50(IDCreatorS56S0000000_14 iDCreatorS56S0000000_14, Parcel parcel) {
        return new VEImageAddFilterParam(parcel);
    }

    public static final Object createFromParcel$51(IDCreatorS56S0000000_14 iDCreatorS56S0000000_14, Parcel parcel) {
        return new VEImageTransformFilterParam(parcel);
    }

    public static final Object createFromParcel$52(IDCreatorS56S0000000_14 iDCreatorS56S0000000_14, Parcel parcel) {
        return new VEInfoStickerFilterParam.VEStickerAnimationParam(parcel);
    }

    public static final Object createFromParcel$53(IDCreatorS56S0000000_14 iDCreatorS56S0000000_14, Parcel parcel) {
        return new VEInfoStickerFilterParam(parcel);
    }

    public static final Object createFromParcel$54(IDCreatorS56S0000000_14 iDCreatorS56S0000000_14, Parcel parcel) {
        return new VELensHdrFilterParam(parcel);
    }

    public static final Object createFromParcel$55(IDCreatorS56S0000000_14 iDCreatorS56S0000000_14, Parcel parcel) {
        return new VEMIMOFilterParam(parcel);
    }

    public static final Object createFromParcel$56(IDCreatorS56S0000000_14 iDCreatorS56S0000000_14, Parcel parcel) {
        return new VEMakeUpFilterParam(parcel);
    }

    public static final Object createFromParcel$57(IDCreatorS56S0000000_14 iDCreatorS56S0000000_14, Parcel parcel) {
        return new VERepeatFilterParam(parcel);
    }

    public static final Object createFromParcel$58(IDCreatorS56S0000000_14 iDCreatorS56S0000000_14, Parcel parcel) {
        return new VEReshapeFilterParam(parcel);
    }

    public static final Object createFromParcel$59(IDCreatorS56S0000000_14 iDCreatorS56S0000000_14, Parcel parcel) {
        return new VERoundFilterParam(parcel);
    }

    public static final Object createFromParcel$6(IDCreatorS56S0000000_14 iDCreatorS56S0000000_14, Parcel parcel) {
        return new CanCancelRadioButton$SavedState(parcel);
    }

    public static final Object createFromParcel$60(IDCreatorS56S0000000_14 iDCreatorS56S0000000_14, Parcel parcel) {
        return new VESlowMotionFilterParam(parcel);
    }

    public static final Object createFromParcel$61(IDCreatorS56S0000000_14 iDCreatorS56S0000000_14, Parcel parcel) {
        return new VETransitionFilterParam(parcel);
    }

    public static final Object createFromParcel$62(IDCreatorS56S0000000_14 iDCreatorS56S0000000_14, Parcel parcel) {
        return new VEVideoAjustmentFilterParam(parcel);
    }

    public static final Object createFromParcel$63(IDCreatorS56S0000000_14 iDCreatorS56S0000000_14, Parcel parcel) {
        return new VEVideoCropFilterParam(parcel);
    }

    public static final Object createFromParcel$64(IDCreatorS56S0000000_14 iDCreatorS56S0000000_14, Parcel parcel) {
        return new VEVideoEffectOutSizeFilterParam(parcel);
    }

    public static final Object createFromParcel$65(IDCreatorS56S0000000_14 iDCreatorS56S0000000_14, Parcel parcel) {
        return new VEVideoEffectStreamFilterParam(parcel);
    }

    public static final Object createFromParcel$66(IDCreatorS56S0000000_14 iDCreatorS56S0000000_14, Parcel parcel) {
        return new VEVideoStableFilterParam(parcel);
    }

    public static final Object createFromParcel$67(IDCreatorS56S0000000_14 iDCreatorS56S0000000_14, Parcel parcel) {
        return new VEVideoTransformFilterParam(parcel);
    }

    public static final Object createFromParcel$68(IDCreatorS56S0000000_14 iDCreatorS56S0000000_14, Parcel parcel) {
        return new VEPrePlayParams(parcel);
    }

    public static final Object createFromParcel$69(IDCreatorS56S0000000_14 iDCreatorS56S0000000_14, Parcel parcel) {
        return new VEMapBufferInfo(parcel);
    }

    public static final Object createFromParcel$7(IDCreatorS56S0000000_14 iDCreatorS56S0000000_14, Parcel in) {
        o.LJIIIZ(in, "in");
        return new com.ss.android.ugc.aweme.discover.adapter.AbstractLoadingLayout$SavedState(in);
    }

    public static final Object createFromParcel$70(IDCreatorS56S0000000_14 iDCreatorS56S0000000_14, Parcel parcel) {
        long readLong = parcel.readLong();
        long readLong2 = parcel.readLong();
        if (readLong == 0 || readLong2 == 0) {
            return null;
        }
        return new UnguessableToken(readLong, readLong2);
    }

    public static final Object createFromParcel$71(IDCreatorS56S0000000_14 iDCreatorS56S0000000_14, Parcel parcel) {
        return new Album(parcel);
    }

    public static final Object createFromParcel$72(IDCreatorS56S0000000_14 iDCreatorS56S0000000_14, Parcel parcel) {
        return new Item(parcel);
    }

    public static final Object createFromParcel$8(IDCreatorS56S0000000_14 iDCreatorS56S0000000_14, Parcel source) {
        boolean z;
        Object obj;
        o.LJIIIZ(source, "source");
        Effect effect = null;
        try {
            Object obj2 = Effect.class.getField("CREATOR").get(null);
            if (!(obj2 instanceof Parcelable.Creator)) {
                obj2 = null;
            }
            Parcelable.Creator creator = (Parcelable.Creator) obj2;
            if (creator != null) {
                obj = creator.createFromParcel(source);
            } else {
                obj = null;
            }
            if (!(obj instanceof Effect)) {
                obj = null;
            }
            effect = (Effect) obj;
        } catch (Exception unused) {
        }
        FilterEffect filterEffect = new FilterEffect(effect);
        boolean z2 = false;
        if (source.readByte() != 0) {
            z = true;
        } else {
            z = false;
        }
        filterEffect.setChecked(z);
        if (source.readByte() != 0) {
            z2 = true;
        }
        filterEffect.setBuildIn(z2);
        return filterEffect;
    }

    public static final Object createFromParcel$9(IDCreatorS56S0000000_14 iDCreatorS56S0000000_14, Parcel parcel) {
        return new FilterBean(parcel);
    }

    public static final Object[] newArray$0(IDCreatorS56S0000000_14 iDCreatorS56S0000000_14, int i) {
        return new LivePagerSlidingTabStrip$SavedState[i];
    }

    public static final Object[] newArray$1(IDCreatorS56S0000000_14 iDCreatorS56S0000000_14, int i) {
        return new SpPair[i];
    }

    public static final Object[] newArray$10(IDCreatorS56S0000000_14 iDCreatorS56S0000000_14, int i) {
        return new StickerWrapper[i];
    }

    public static final Object[] newArray$11(IDCreatorS56S0000000_14 iDCreatorS56S0000000_14, int i) {
        return new ExtraParams[i];
    }

    public static final Object[] newArray$12(IDCreatorS56S0000000_14 iDCreatorS56S0000000_14, int i) {
        return new SwitchButton$SavedState[i];
    }

    public static final Object[] newArray$13(IDCreatorS56S0000000_14 iDCreatorS56S0000000_14, int i) {
        return new FragmentTabHost.SavedState[i];
    }

    public static final Object[] newArray$14(IDCreatorS56S0000000_14 iDCreatorS56S0000000_14, int i) {
        return new AbstractLoadingLayout$SavedState[i];
    }

    public static final Object[] newArray$15(IDCreatorS56S0000000_14 iDCreatorS56S0000000_14, int i) {
        return new VEARCoreParam[i];
    }

    public static final Object[] newArray$16(IDCreatorS56S0000000_14 iDCreatorS56S0000000_14, int i) {
        return new VEAudioEffectBean[i];
    }

    public static final Object[] newArray$17(IDCreatorS56S0000000_14 iDCreatorS56S0000000_14, int i) {
        return new VECameraSettings.CAMERA_CAPTURE_FLASH_STRATEGY[i];
    }

    public static final Object[] newArray$18(IDCreatorS56S0000000_14 iDCreatorS56S0000000_14, int i) {
        return new VECameraSettings.CAMERA_FACING_ID[i];
    }

    public static final Object[] newArray$19(IDCreatorS56S0000000_14 iDCreatorS56S0000000_14, int i) {
        return new VECameraSettings.CAMERA_FLASH_MODE[i];
    }

    public static final Object[] newArray$2(IDCreatorS56S0000000_14 iDCreatorS56S0000000_14, int i) {
        return new BottomSheetBehavior.SavedState[i];
    }

    public static final Object[] newArray$20(IDCreatorS56S0000000_14 iDCreatorS56S0000000_14, int i) {
        return new VECameraSettings.CAMERA_HW_LEVEL[i];
    }

    public static final Object[] newArray$21(IDCreatorS56S0000000_14 iDCreatorS56S0000000_14, int i) {
        return new VECameraSettings.CAMERA_MODE_TYPE[i];
    }

    public static final Object[] newArray$22(IDCreatorS56S0000000_14 iDCreatorS56S0000000_14, int i) {
        return new VECameraSettings.CAMERA_TYPE[i];
    }

    public static final Object[] newArray$23(IDCreatorS56S0000000_14 iDCreatorS56S0000000_14, int i) {
        return new VECameraSettings[i];
    }

    public static final Object[] newArray$24(IDCreatorS56S0000000_14 iDCreatorS56S0000000_14, int i) {
        return new VECherEffectParam[i];
    }

    public static final Object[] newArray$25(IDCreatorS56S0000000_14 iDCreatorS56S0000000_14, int i) {
        return new VEDisplaySettings[i];
    }

    public static final Object[] newArray$26(IDCreatorS56S0000000_14 iDCreatorS56S0000000_14, int i) {
        return new VEVideoEncodeSettings.COMPILE_TYPE[i];
    }

    public static final Object[] newArray$27(IDCreatorS56S0000000_14 iDCreatorS56S0000000_14, int i) {
        return new VEVideoEncodeSettings.VEVideoEncodeMirrorMode[i];
    }

    public static final Object[] newArray$28(IDCreatorS56S0000000_14 iDCreatorS56S0000000_14, int i) {
        return new VEVolumeParam[i];
    }

    public static final Object[] newArray$29(IDCreatorS56S0000000_14 iDCreatorS56S0000000_14, int i) {
        return new VEClipTimelineParam[i];
    }

    public static final Object[] newArray$3(IDCreatorS56S0000000_14 iDCreatorS56S0000000_14, int i) {
        return new GroupRecord[i];
    }

    public static final Object[] newArray$30(IDCreatorS56S0000000_14 iDCreatorS56S0000000_14, int i) {
        return new VEAmazingFilterParam[i];
    }

    public static final Object[] newArray$31(IDCreatorS56S0000000_14 iDCreatorS56S0000000_14, int i) {
        return new VEAudioDspFilterParam[i];
    }

    public static final Object[] newArray$32(IDCreatorS56S0000000_14 iDCreatorS56S0000000_14, int i) {
        return new VEAudioEffectFilterParam[i];
    }

    public static final Object[] newArray$33(IDCreatorS56S0000000_14 iDCreatorS56S0000000_14, int i) {
        return new VEAudioFadeFilterParam[i];
    }

    public static final Object[] newArray$34(IDCreatorS56S0000000_14 iDCreatorS56S0000000_14, int i) {
        return new VEAudioLoudnessBalanceFilter[i];
    }

    public static final Object[] newArray$35(IDCreatorS56S0000000_14 iDCreatorS56S0000000_14, int i) {
        return new VEAudioMetricsFilterParam[i];
    }

    public static final Object[] newArray$36(IDCreatorS56S0000000_14 iDCreatorS56S0000000_14, int i) {
        return new VEAudioNoiseFilterParam[i];
    }

    public static final Object[] newArray$37(IDCreatorS56S0000000_14 iDCreatorS56S0000000_14, int i) {
        return new VEAudioSamiFilterParam[i];
    }

    public static final Object[] newArray$38(IDCreatorS56S0000000_14 iDCreatorS56S0000000_14, int i) {
        return new VEAudioSpeedFilterParam[i];
    }

    public static final Object[] newArray$39(IDCreatorS56S0000000_14 iDCreatorS56S0000000_14, int i) {
        return new VEAudioVolumeFilterParam[i];
    }

    public static final Object[] newArray$4(IDCreatorS56S0000000_14 iDCreatorS56S0000000_14, int i) {
        return new Record[i];
    }

    public static final Object[] newArray$40(IDCreatorS56S0000000_14 iDCreatorS56S0000000_14, int i) {
        return new VEBaseFilterParam[i];
    }

    public static final Object[] newArray$41(IDCreatorS56S0000000_14 iDCreatorS56S0000000_14, int i) {
        return new VEBeautyFilterParam[i];
    }

    public static final Object[] newArray$42(IDCreatorS56S0000000_14 iDCreatorS56S0000000_14, int i) {
        return new VEBlurFilterParam[i];
    }

    public static final Object[] newArray$43(IDCreatorS56S0000000_14 iDCreatorS56S0000000_14, int i) {
        return new VECanvasFilterParam[i];
    }

    public static final Object[] newArray$44(IDCreatorS56S0000000_14 iDCreatorS56S0000000_14, int i) {
        return new VEColorFilterParam[i];
    }

    public static final Object[] newArray$45(IDCreatorS56S0000000_14 iDCreatorS56S0000000_14, int i) {
        return new VEColorHslFilterParam[i];
    }

    public static final Object[] newArray$46(IDCreatorS56S0000000_14 iDCreatorS56S0000000_14, int i) {
        return new VEComposerFilterParam[i];
    }

    public static final Object[] newArray$47(IDCreatorS56S0000000_14 iDCreatorS56S0000000_14, int i) {
        return new VEEffectFilterParam[i];
    }

    public static final Object[] newArray$48(IDCreatorS56S0000000_14 iDCreatorS56S0000000_14, int i) {
        return new VEEffectHdrFilterParam[i];
    }

    public static final Object[] newArray$49(IDCreatorS56S0000000_14 iDCreatorS56S0000000_14, int i) {
        return new VEExposureFilterParam[i];
    }

    public static final Object[] newArray$5(IDCreatorS56S0000000_14 iDCreatorS56S0000000_14, int i) {
        return new VETrackParams[i];
    }

    public static final Object[] newArray$50(IDCreatorS56S0000000_14 iDCreatorS56S0000000_14, int i) {
        return new VEImageAddFilterParam[i];
    }

    public static final Object[] newArray$51(IDCreatorS56S0000000_14 iDCreatorS56S0000000_14, int i) {
        return new VEImageTransformFilterParam[i];
    }

    public static final Object[] newArray$52(IDCreatorS56S0000000_14 iDCreatorS56S0000000_14, int i) {
        return new VEInfoStickerFilterParam.VEStickerAnimationParam[i];
    }

    public static final Object[] newArray$53(IDCreatorS56S0000000_14 iDCreatorS56S0000000_14, int i) {
        return new VEInfoStickerFilterParam[i];
    }

    public static final Object[] newArray$54(IDCreatorS56S0000000_14 iDCreatorS56S0000000_14, int i) {
        return new VELensHdrFilterParam[i];
    }

    public static final Object[] newArray$55(IDCreatorS56S0000000_14 iDCreatorS56S0000000_14, int i) {
        return new VEMIMOFilterParam[i];
    }

    public static final Object[] newArray$56(IDCreatorS56S0000000_14 iDCreatorS56S0000000_14, int i) {
        return new VEMakeUpFilterParam[i];
    }

    public static final Object[] newArray$57(IDCreatorS56S0000000_14 iDCreatorS56S0000000_14, int i) {
        return new VERepeatFilterParam[i];
    }

    public static final Object[] newArray$58(IDCreatorS56S0000000_14 iDCreatorS56S0000000_14, int i) {
        return new VEReshapeFilterParam[i];
    }

    public static final Object[] newArray$59(IDCreatorS56S0000000_14 iDCreatorS56S0000000_14, int i) {
        return new VERoundFilterParam[i];
    }

    public static final Object[] newArray$6(IDCreatorS56S0000000_14 iDCreatorS56S0000000_14, int i) {
        return new CanCancelRadioButton$SavedState[i];
    }

    public static final Object[] newArray$60(IDCreatorS56S0000000_14 iDCreatorS56S0000000_14, int i) {
        return new VESlowMotionFilterParam[i];
    }

    public static final Object[] newArray$61(IDCreatorS56S0000000_14 iDCreatorS56S0000000_14, int i) {
        return new VETransitionFilterParam[i];
    }

    public static final Object[] newArray$62(IDCreatorS56S0000000_14 iDCreatorS56S0000000_14, int i) {
        return new VEVideoAjustmentFilterParam[i];
    }

    public static final Object[] newArray$63(IDCreatorS56S0000000_14 iDCreatorS56S0000000_14, int i) {
        return new VEVideoCropFilterParam[i];
    }

    public static final Object[] newArray$64(IDCreatorS56S0000000_14 iDCreatorS56S0000000_14, int i) {
        return new VEVideoEffectOutSizeFilterParam[i];
    }

    public static final Object[] newArray$65(IDCreatorS56S0000000_14 iDCreatorS56S0000000_14, int i) {
        return new VEVideoEffectStreamFilterParam[i];
    }

    public static final Object[] newArray$66(IDCreatorS56S0000000_14 iDCreatorS56S0000000_14, int i) {
        return new VEVideoStableFilterParam[i];
    }

    public static final Object[] newArray$67(IDCreatorS56S0000000_14 iDCreatorS56S0000000_14, int i) {
        return new VEVideoTransformFilterParam[i];
    }

    public static final Object[] newArray$68(IDCreatorS56S0000000_14 iDCreatorS56S0000000_14, int i) {
        return new VEPrePlayParams[i];
    }

    public static final Object[] newArray$69(IDCreatorS56S0000000_14 iDCreatorS56S0000000_14, int i) {
        return new VEMapBufferInfo[i];
    }

    public static final Object[] newArray$7(IDCreatorS56S0000000_14 iDCreatorS56S0000000_14, int i) {
        return new com.ss.android.ugc.aweme.discover.adapter.AbstractLoadingLayout$SavedState[i];
    }

    public static final Object[] newArray$70(IDCreatorS56S0000000_14 iDCreatorS56S0000000_14, int i) {
        return new UnguessableToken[i];
    }

    public static final Object[] newArray$71(IDCreatorS56S0000000_14 iDCreatorS56S0000000_14, int i) {
        return new Album[i];
    }

    public static final Object[] newArray$72(IDCreatorS56S0000000_14 iDCreatorS56S0000000_14, int i) {
        return new Item[i];
    }

    public static final Object[] newArray$8(IDCreatorS56S0000000_14 iDCreatorS56S0000000_14, int i) {
        return new FilterEffect[i];
    }

    public static final Object[] newArray$9(IDCreatorS56S0000000_14 iDCreatorS56S0000000_14, int i) {
        return new FilterBean[i];
    }
}

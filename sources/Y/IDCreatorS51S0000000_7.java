package Y;

import X.C16880lQ;
import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveAudienceLinkmicLowestAgeSetting;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.ss.android.ugc.aweme.comment.widgets.CommentEditText$MentionSavedState;
import com.ss.android.ugc.aweme.creative.model.publish.AVTextExtraStruct;
import com.ss.android.ugc.aweme.effect.EffectListModel;
import com.ss.android.ugc.aweme.filter.StrArray;
import com.ss.android.ugc.aweme.lexical.platform.span.MentionSpan;
import com.ss.android.ugc.aweme.live.emote.shoot.workspace.OldImpl;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import com.ss.android.ugc.aweme.photomovie.PhotoMovieContext;
import com.ss.android.ugc.aweme.share.gif.VideoShare2GifEditContext;
import com.ss.android.ugc.aweme.shortvideo.AVChallenge;
import com.ss.android.ugc.aweme.shortvideo.CameraComponentModel;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.WorkSpace.Workspace;
import com.ss.android.ugc.aweme.shortvideo.cut.model.CutVideoContext;
import com.ss.android.ugc.aweme.shortvideo.cut.model.VideoSegment;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.edit.multiedit.data.MultiEditVideoSegmentRecordData;
import com.ss.android.ugc.aweme.shortvideo.edit.multiedit.data.MultiEditVideoStatusRecordData;
import com.ss.android.ugc.aweme.shortvideo.reaction.ReactionParams;
import com.ss.android.ugc.aweme.shortvideo.ui.TimeSpeedModelExtension;
import com.ss.android.ugc.aweme.shortvideo.view.MentionEditText$MentionSavedState;
import com.ss.android.ugc.aweme.sticker.model.FaceStickerBean;
import com.ss.android.ugc.aweme.tools.mvtemplate.MvThemeData;
import com.ss.android.vesdk.ROTATE_DEGREE;
import com.ss.android.vesdk.VERecordData;
import com.ss.android.vesdk.VEVideoEncodeSettings;
import com.ss.android.vesdk.VEWatermarkParam;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public class IDCreatorS51S0000000_7 implements Parcelable.Creator {
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
            default:
                return new Object[0];
        }
    }

    public IDCreatorS51S0000000_7(int i) {
        this.$t = i;
    }

    public static final Object createFromParcel$0(IDCreatorS51S0000000_7 iDCreatorS51S0000000_7, Parcel parcel) {
        o.LJIIIZ(parcel, "parcel");
        try {
            return new CommentEditText$MentionSavedState(parcel);
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
            return null;
        }
    }

    public static final Object createFromParcel$1(IDCreatorS51S0000000_7 iDCreatorS51S0000000_7, Parcel source) {
        o.LJIIIZ(source, "source");
        return new AVTextExtraStruct(source);
    }

    public static final Object createFromParcel$10(IDCreatorS51S0000000_7 iDCreatorS51S0000000_7, Parcel parcel) {
        return new CameraComponentModel(parcel);
    }

    public static final Object createFromParcel$11(IDCreatorS51S0000000_7 iDCreatorS51S0000000_7, Parcel parcel) {
        return new ShortVideoContext(parcel);
    }

    public static final Object createFromParcel$12(IDCreatorS51S0000000_7 iDCreatorS51S0000000_7, Parcel parcel) {
        return new Workspace(parcel);
    }

    public static final Object createFromParcel$13(IDCreatorS51S0000000_7 iDCreatorS51S0000000_7, Parcel parcel) {
        return new CutVideoContext(parcel);
    }

    public static final Object createFromParcel$14(IDCreatorS51S0000000_7 iDCreatorS51S0000000_7, Parcel parcel) {
        return new VideoSegment(parcel);
    }

    public static final Object createFromParcel$15(IDCreatorS51S0000000_7 iDCreatorS51S0000000_7, Parcel parcel) {
        return new VideoPublishEditModel(parcel);
    }

    public static final Object createFromParcel$16(IDCreatorS51S0000000_7 iDCreatorS51S0000000_7, Parcel parcel) {
        return new MultiEditVideoSegmentRecordData(parcel);
    }

    public static final Object createFromParcel$17(IDCreatorS51S0000000_7 iDCreatorS51S0000000_7, Parcel parcel) {
        return new MultiEditVideoStatusRecordData(parcel);
    }

    public static final Object createFromParcel$18(IDCreatorS51S0000000_7 iDCreatorS51S0000000_7, Parcel parcel) {
        return new ReactionParams(parcel);
    }

    public static final Object createFromParcel$19(IDCreatorS51S0000000_7 iDCreatorS51S0000000_7, Parcel parcel) {
        return new TimeSpeedModelExtension(parcel);
    }

    public static final Object createFromParcel$2(IDCreatorS51S0000000_7 iDCreatorS51S0000000_7, Parcel parcel) {
        return new EffectListModel(parcel);
    }

    public static final Object createFromParcel$20(IDCreatorS51S0000000_7 iDCreatorS51S0000000_7, Parcel parcel) {
        try {
            return new MentionEditText$MentionSavedState(parcel);
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
            return null;
        }
    }

    public static final Object createFromParcel$21(IDCreatorS51S0000000_7 iDCreatorS51S0000000_7, Parcel parcel) {
        return new FaceStickerBean(parcel);
    }

    public static final Object createFromParcel$22(IDCreatorS51S0000000_7 iDCreatorS51S0000000_7, Parcel parcel) {
        return new MvThemeData(parcel);
    }

    public static final Object createFromParcel$23(IDCreatorS51S0000000_7 iDCreatorS51S0000000_7, Parcel parcel) {
        try {
            return new com.ss.android.ugc.aweme.views.mention.MentionEditText$MentionSavedState(parcel);
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
            return null;
        }
    }

    public static final Object createFromParcel$24(IDCreatorS51S0000000_7 iDCreatorS51S0000000_7, Parcel parcel) {
        return ROTATE_DEGREE.values()[parcel.readInt()];
    }

    public static final Object createFromParcel$25(IDCreatorS51S0000000_7 iDCreatorS51S0000000_7, Parcel parcel) {
        return new VERecordData(parcel);
    }

    public static final Object createFromParcel$26(IDCreatorS51S0000000_7 iDCreatorS51S0000000_7, Parcel parcel) {
        return VEVideoEncodeSettings.ENCODE_PRESET.values()[parcel.readInt()];
    }

    public static final Object createFromParcel$27(IDCreatorS51S0000000_7 iDCreatorS51S0000000_7, Parcel parcel) {
        return new VEWatermarkParam.VEWatermarkEntity(parcel);
    }

    public static final Object createFromParcel$28(IDCreatorS51S0000000_7 iDCreatorS51S0000000_7, Parcel parcel) {
        return new VEWatermarkParam.VEWatermarkMask(parcel);
    }

    public static final Object createFromParcel$29(IDCreatorS51S0000000_7 iDCreatorS51S0000000_7, Parcel parcel) {
        return new VEWatermarkParam(parcel);
    }

    public static final Object createFromParcel$3(IDCreatorS51S0000000_7 iDCreatorS51S0000000_7, Parcel parcel) {
        return new StrArray(parcel);
    }

    public static final Object createFromParcel$4(IDCreatorS51S0000000_7 iDCreatorS51S0000000_7, Parcel parcel) {
        return new MentionSpan(parcel);
    }

    public static final Object createFromParcel$5(IDCreatorS51S0000000_7 iDCreatorS51S0000000_7, Parcel parcel) {
        return new OldImpl(parcel);
    }

    public static final Object createFromParcel$6(IDCreatorS51S0000000_7 iDCreatorS51S0000000_7, Parcel parcel) {
        return new MediaModel(parcel);
    }

    public static final Object createFromParcel$7(IDCreatorS51S0000000_7 iDCreatorS51S0000000_7, Parcel parcel) {
        return new PhotoMovieContext(parcel);
    }

    public static final Object createFromParcel$8(IDCreatorS51S0000000_7 iDCreatorS51S0000000_7, Parcel parcel) {
        return new VideoShare2GifEditContext(parcel);
    }

    public static final Object createFromParcel$9(IDCreatorS51S0000000_7 iDCreatorS51S0000000_7, Parcel parcel) {
        return new AVChallenge(parcel);
    }

    public static final Object[] newArray$0(IDCreatorS51S0000000_7 iDCreatorS51S0000000_7, int i) {
        return new CommentEditText$MentionSavedState[i];
    }

    public static final Object[] newArray$1(IDCreatorS51S0000000_7 iDCreatorS51S0000000_7, int i) {
        return new AVTextExtraStruct[i];
    }

    public static final Object[] newArray$10(IDCreatorS51S0000000_7 iDCreatorS51S0000000_7, int i) {
        return new CameraComponentModel[i];
    }

    public static final Object[] newArray$11(IDCreatorS51S0000000_7 iDCreatorS51S0000000_7, int i) {
        return new ShortVideoContext[i];
    }

    public static final Object[] newArray$12(IDCreatorS51S0000000_7 iDCreatorS51S0000000_7, int i) {
        return new Workspace[i];
    }

    public static final Object[] newArray$13(IDCreatorS51S0000000_7 iDCreatorS51S0000000_7, int i) {
        return new CutVideoContext[i];
    }

    public static final Object[] newArray$14(IDCreatorS51S0000000_7 iDCreatorS51S0000000_7, int i) {
        return new VideoSegment[i];
    }

    public static final Object[] newArray$15(IDCreatorS51S0000000_7 iDCreatorS51S0000000_7, int i) {
        return new VideoPublishEditModel[i];
    }

    public static final Object[] newArray$16(IDCreatorS51S0000000_7 iDCreatorS51S0000000_7, int i) {
        return new MultiEditVideoSegmentRecordData[i];
    }

    public static final Object[] newArray$17(IDCreatorS51S0000000_7 iDCreatorS51S0000000_7, int i) {
        return new MultiEditVideoStatusRecordData[i];
    }

    public static final Object[] newArray$18(IDCreatorS51S0000000_7 iDCreatorS51S0000000_7, int i) {
        return new ReactionParams[i];
    }

    public static final Object[] newArray$19(IDCreatorS51S0000000_7 iDCreatorS51S0000000_7, int i) {
        return new TimeSpeedModelExtension[i];
    }

    public static final Object[] newArray$2(IDCreatorS51S0000000_7 iDCreatorS51S0000000_7, int i) {
        return new EffectListModel[i];
    }

    public static final Object[] newArray$20(IDCreatorS51S0000000_7 iDCreatorS51S0000000_7, int i) {
        return new MentionEditText$MentionSavedState[i];
    }

    public static final Object[] newArray$21(IDCreatorS51S0000000_7 iDCreatorS51S0000000_7, int i) {
        return new FaceStickerBean[i];
    }

    public static final Object[] newArray$22(IDCreatorS51S0000000_7 iDCreatorS51S0000000_7, int i) {
        return new MvThemeData[i];
    }

    public static final Object[] newArray$23(IDCreatorS51S0000000_7 iDCreatorS51S0000000_7, int i) {
        return new com.ss.android.ugc.aweme.views.mention.MentionEditText$MentionSavedState[i];
    }

    public static final Object[] newArray$24(IDCreatorS51S0000000_7 iDCreatorS51S0000000_7, int i) {
        return new ROTATE_DEGREE[i];
    }

    public static final Object[] newArray$25(IDCreatorS51S0000000_7 iDCreatorS51S0000000_7, int i) {
        return new VERecordData[i];
    }

    public static final Object[] newArray$26(IDCreatorS51S0000000_7 iDCreatorS51S0000000_7, int i) {
        return new VEVideoEncodeSettings.ENCODE_PRESET[i];
    }

    public static final Object[] newArray$27(IDCreatorS51S0000000_7 iDCreatorS51S0000000_7, int i) {
        return new VEWatermarkParam.VEWatermarkEntity[i];
    }

    public static final Object[] newArray$28(IDCreatorS51S0000000_7 iDCreatorS51S0000000_7, int i) {
        return new VEWatermarkParam.VEWatermarkMask[i];
    }

    public static final Object[] newArray$29(IDCreatorS51S0000000_7 iDCreatorS51S0000000_7, int i) {
        return new VEWatermarkParam[i];
    }

    public static final Object[] newArray$3(IDCreatorS51S0000000_7 iDCreatorS51S0000000_7, int i) {
        return new StrArray[i];
    }

    public static final Object[] newArray$4(IDCreatorS51S0000000_7 iDCreatorS51S0000000_7, int i) {
        return new MentionSpan[i];
    }

    public static final Object[] newArray$5(IDCreatorS51S0000000_7 iDCreatorS51S0000000_7, int i) {
        return new OldImpl[i];
    }

    public static final Object[] newArray$6(IDCreatorS51S0000000_7 iDCreatorS51S0000000_7, int i) {
        return new MediaModel[i];
    }

    public static final Object[] newArray$7(IDCreatorS51S0000000_7 iDCreatorS51S0000000_7, int i) {
        return new PhotoMovieContext[i];
    }

    public static final Object[] newArray$8(IDCreatorS51S0000000_7 iDCreatorS51S0000000_7, int i) {
        return new VideoShare2GifEditContext[i];
    }

    public static final Object[] newArray$9(IDCreatorS51S0000000_7 iDCreatorS51S0000000_7, int i) {
        return new AVChallenge[i];
    }
}

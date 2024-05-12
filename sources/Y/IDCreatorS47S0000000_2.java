package Y;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.editSticker.model.InfoStickerModel;
import com.ss.android.ugc.aweme.editSticker.model.StickerItemModel;
import com.ss.android.ugc.aweme.effect.EffectPointModel;
import com.ss.android.ugc.aweme.shortvideo.edit.model.EditPreviewInfo;
import com.ss.android.ugc.aweme.shortvideo.edit.model.EditVideoSegment;
import com.ss.android.ugc.aweme.shortvideo.edit.multiedit.data.MultiEditVideoRecordData;
import com.ss.android.vesdk.VERecordData;
import dmt.av.video.VEPreviewMusicParams;
import dmt.av.video.VEPreviewParams;
import kotlin.jvm.internal.o;

/* loaded from: classes3.dex */
public class IDCreatorS47S0000000_2 implements Parcelable.Creator {
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
            default:
                return new Object[0];
        }
    }

    public IDCreatorS47S0000000_2(int i) {
        this.$t = i;
    }

    public static final Object createFromParcel$0(IDCreatorS47S0000000_2 iDCreatorS47S0000000_2, Parcel parcel) {
        return new InfoStickerModel(parcel);
    }

    public static final Object createFromParcel$1(IDCreatorS47S0000000_2 iDCreatorS47S0000000_2, Parcel parcel) {
        return new StickerItemModel(parcel);
    }

    public static final Object createFromParcel$2(IDCreatorS47S0000000_2 iDCreatorS47S0000000_2, Parcel parcel) {
        return new EffectPointModel(parcel);
    }

    public static final Object createFromParcel$3(IDCreatorS47S0000000_2 iDCreatorS47S0000000_2, Parcel source) {
        o.LJIIIZ(source, "source");
        return new EditPreviewInfo(source);
    }

    public static final Object createFromParcel$4(IDCreatorS47S0000000_2 iDCreatorS47S0000000_2, Parcel source) {
        o.LJIIIZ(source, "source");
        return new EditVideoSegment(source);
    }

    public static final Object createFromParcel$5(IDCreatorS47S0000000_2 iDCreatorS47S0000000_2, Parcel parcel) {
        return new MultiEditVideoRecordData(parcel);
    }

    public static final Object createFromParcel$6(IDCreatorS47S0000000_2 iDCreatorS47S0000000_2, Parcel parcel) {
        return new VERecordData.VERecordSegmentData(parcel);
    }

    public static final Object createFromParcel$7(IDCreatorS47S0000000_2 iDCreatorS47S0000000_2, Parcel parcel) {
        return new VEPreviewMusicParams(parcel);
    }

    public static final Object createFromParcel$8(IDCreatorS47S0000000_2 iDCreatorS47S0000000_2, Parcel parcel) {
        return new VEPreviewParams(parcel);
    }

    public static final Object[] newArray$0(IDCreatorS47S0000000_2 iDCreatorS47S0000000_2, int i) {
        return new InfoStickerModel[i];
    }

    public static final Object[] newArray$1(IDCreatorS47S0000000_2 iDCreatorS47S0000000_2, int i) {
        return new StickerItemModel[i];
    }

    public static final Object[] newArray$2(IDCreatorS47S0000000_2 iDCreatorS47S0000000_2, int i) {
        return new EffectPointModel[i];
    }

    public static final Object[] newArray$3(IDCreatorS47S0000000_2 iDCreatorS47S0000000_2, int i) {
        return new EditPreviewInfo[i];
    }

    public static final Object[] newArray$4(IDCreatorS47S0000000_2 iDCreatorS47S0000000_2, int i) {
        return new EditVideoSegment[i];
    }

    public static final Object[] newArray$5(IDCreatorS47S0000000_2 iDCreatorS47S0000000_2, int i) {
        return new MultiEditVideoRecordData[i];
    }

    public static final Object[] newArray$6(IDCreatorS47S0000000_2 iDCreatorS47S0000000_2, int i) {
        return new VERecordData.VERecordSegmentData[i];
    }

    public static final Object[] newArray$7(IDCreatorS47S0000000_2 iDCreatorS47S0000000_2, int i) {
        return new VEPreviewMusicParams[i];
    }

    public static final Object[] newArray$8(IDCreatorS47S0000000_2 iDCreatorS47S0000000_2, int i) {
        return new VEPreviewParams[i];
    }
}

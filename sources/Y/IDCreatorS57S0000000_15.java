package Y;

import X.X7P;
import X.X7Q;
import android.content.ComponentName;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveAudienceLinkmicLowestAgeSetting;
import com.bytedance.android.livesdk.model.ChargeDeal;
import com.bytedance.common.wschannel.model.WsApi;
import com.bytedance.common.wschannel.model.WsComponent;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import com.ss.android.ttvecamera.TEFocusParameters;
import com.ss.android.ugc.aweme.live.model.LiveVerifyChecklist;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaAudio;
import com.ss.android.vesdk.VEEditorModel;
import com.ss.android.vesdk.VEVideoEncodeSettings;
import com.ss.android.vesdk.settings.VEVideoCompileEncodeSettings;
import com.ss.android.vesdk.settings.VEVideoEncodePreset;
import com.ss.android.vesdk.settings.VEVideoEncodeProfile;
import com.ss.android.vesdk.settings.VEVideoHWEncodeSettings;
import com.ss.android.vesdk.settings.VEVideoSWEncodeSettings;
import com.ss.android.vesdk.settings.VideoInvisibleWatermarkSettings;
import com.tencent.wcdb.BulkCursorDescriptor;
import com.tencent.wcdb.CursorWindow;

/* loaded from: classes16.dex */
public class IDCreatorS57S0000000_15 implements Parcelable.Creator {
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
            default:
                return new Object[0];
        }
    }

    public IDCreatorS57S0000000_15(int i) {
        this.$t = i;
    }

    public static final Object createFromParcel$0(IDCreatorS57S0000000_15 iDCreatorS57S0000000_15, Parcel parcel) {
        return new ChargeDeal.CurrencyPrice(parcel);
    }

    public static final Object createFromParcel$1(IDCreatorS57S0000000_15 iDCreatorS57S0000000_15, Parcel parcel) {
        return new ChargeDeal.HsSkuDetail(parcel);
    }

    public static final Object createFromParcel$10(IDCreatorS57S0000000_15 iDCreatorS57S0000000_15, Parcel parcel) {
        return VEVideoEncodeSettings.ENCODE_PROFILE.values()[parcel.readInt()];
    }

    public static final Object createFromParcel$11(IDCreatorS57S0000000_15 iDCreatorS57S0000000_15, Parcel parcel) {
        return VEVideoEncodeSettings.VEVideoEncodeFitMode.values()[parcel.readInt()];
    }

    public static final Object createFromParcel$12(IDCreatorS57S0000000_15 iDCreatorS57S0000000_15, Parcel parcel) {
        return new VEVideoEncodeSettings(parcel);
    }

    public static final Object createFromParcel$13(IDCreatorS57S0000000_15 iDCreatorS57S0000000_15, Parcel parcel) {
        return new VEVideoCompileEncodeSettings(parcel);
    }

    public static final Object createFromParcel$14(IDCreatorS57S0000000_15 iDCreatorS57S0000000_15, Parcel parcel) {
        return VEVideoEncodePreset.values()[parcel.readInt()];
    }

    public static final Object createFromParcel$15(IDCreatorS57S0000000_15 iDCreatorS57S0000000_15, Parcel parcel) {
        return VEVideoEncodeProfile.values()[parcel.readInt()];
    }

    public static final Object createFromParcel$16(IDCreatorS57S0000000_15 iDCreatorS57S0000000_15, Parcel parcel) {
        return new VEVideoHWEncodeSettings(parcel);
    }

    public static final Object createFromParcel$17(IDCreatorS57S0000000_15 iDCreatorS57S0000000_15, Parcel parcel) {
        return new VEVideoSWEncodeSettings(parcel);
    }

    public static final Object createFromParcel$18(IDCreatorS57S0000000_15 iDCreatorS57S0000000_15, Parcel parcel) {
        return new VideoInvisibleWatermarkSettings(parcel);
    }

    public static final Object createFromParcel$19(IDCreatorS57S0000000_15 iDCreatorS57S0000000_15, Parcel parcel) {
        X7Q x7q;
        BulkCursorDescriptor bulkCursorDescriptor = new BulkCursorDescriptor();
        IBinder readStrongBinder = parcel.readStrongBinder();
        String[] strArr = null;
        if (readStrongBinder == null) {
            x7q = null;
        } else {
            x7q = (X7Q) readStrongBinder.queryLocalInterface("android.content.IBulkCursor");
            if (x7q == null) {
                x7q = new X7P(readStrongBinder);
            }
        }
        bulkCursorDescriptor.cursor = x7q;
        int readInt = parcel.readInt();
        boolean z = false;
        if (readInt >= 0) {
            strArr = new String[readInt];
            for (int i = 0; i < readInt; i++) {
                strArr[i] = parcel.readString();
            }
        }
        bulkCursorDescriptor.columnNames = strArr;
        if (parcel.readInt() != 0) {
            z = true;
        }
        bulkCursorDescriptor.wantsAllOnMoveCalls = z;
        bulkCursorDescriptor.count = parcel.readInt();
        if (parcel.readInt() != 0) {
            bulkCursorDescriptor.window = CursorWindow.CREATOR.createFromParcel(parcel);
        }
        return bulkCursorDescriptor;
    }

    public static final Object createFromParcel$2(IDCreatorS57S0000000_15 iDCreatorS57S0000000_15, Parcel parcel) {
        return new ChargeDeal(parcel);
    }

    public static final Object createFromParcel$20(IDCreatorS57S0000000_15 iDCreatorS57S0000000_15, Parcel parcel) {
        new CursorWindow();
        throw null;
    }

    public static final Object createFromParcel$3(IDCreatorS57S0000000_15 iDCreatorS57S0000000_15, Parcel parcel) {
        WsApi wsApi = new WsApi();
        wsApi.service = parcel.readInt();
        wsApi.method = parcel.readInt();
        return wsApi;
    }

    public static final Object createFromParcel$4(IDCreatorS57S0000000_15 iDCreatorS57S0000000_15, Parcel parcel) {
        WsComponent wsComponent = new WsComponent();
        wsComponent.componentName = (ComponentName) parcel.readParcelable(IDCreatorS57S0000000_15.class.getClassLoader());
        wsComponent.acceptApis = parcel.createTypedArrayList(WsApi.CREATOR);
        return wsComponent;
    }

    public static final Object createFromParcel$5(IDCreatorS57S0000000_15 iDCreatorS57S0000000_15, Parcel parcel) {
        return new DownloadInfo(parcel);
    }

    public static final Object createFromParcel$6(IDCreatorS57S0000000_15 iDCreatorS57S0000000_15, Parcel parcel) {
        return new TEFocusParameters(parcel);
    }

    public static final Object createFromParcel$7(IDCreatorS57S0000000_15 iDCreatorS57S0000000_15, Parcel parcel) {
        return new LiveVerifyChecklist(parcel);
    }

    public static final Object createFromParcel$8(IDCreatorS57S0000000_15 iDCreatorS57S0000000_15, Parcel parcel) {
        return new MediaAudio(parcel);
    }

    public static final Object createFromParcel$9(IDCreatorS57S0000000_15 iDCreatorS57S0000000_15, Parcel parcel) {
        return new VEEditorModel(parcel);
    }

    public static final Object[] newArray$0(IDCreatorS57S0000000_15 iDCreatorS57S0000000_15, int i) {
        return new ChargeDeal.CurrencyPrice[i];
    }

    public static final Object[] newArray$1(IDCreatorS57S0000000_15 iDCreatorS57S0000000_15, int i) {
        return new ChargeDeal.HsSkuDetail[i];
    }

    public static final Object[] newArray$10(IDCreatorS57S0000000_15 iDCreatorS57S0000000_15, int i) {
        return new VEVideoEncodeSettings.ENCODE_PROFILE[i];
    }

    public static final Object[] newArray$11(IDCreatorS57S0000000_15 iDCreatorS57S0000000_15, int i) {
        return new VEVideoEncodeSettings.VEVideoEncodeFitMode[i];
    }

    public static final Object[] newArray$12(IDCreatorS57S0000000_15 iDCreatorS57S0000000_15, int i) {
        return new VEVideoEncodeSettings[i];
    }

    public static final Object[] newArray$13(IDCreatorS57S0000000_15 iDCreatorS57S0000000_15, int i) {
        return new VEVideoCompileEncodeSettings[i];
    }

    public static final Object[] newArray$14(IDCreatorS57S0000000_15 iDCreatorS57S0000000_15, int i) {
        return new VEVideoEncodePreset[i];
    }

    public static final Object[] newArray$15(IDCreatorS57S0000000_15 iDCreatorS57S0000000_15, int i) {
        return new VEVideoEncodeProfile[i];
    }

    public static final Object[] newArray$16(IDCreatorS57S0000000_15 iDCreatorS57S0000000_15, int i) {
        return new VEVideoHWEncodeSettings[i];
    }

    public static final Object[] newArray$17(IDCreatorS57S0000000_15 iDCreatorS57S0000000_15, int i) {
        return new VEVideoSWEncodeSettings[i];
    }

    public static final Object[] newArray$18(IDCreatorS57S0000000_15 iDCreatorS57S0000000_15, int i) {
        return new VideoInvisibleWatermarkSettings[i];
    }

    public static final Object[] newArray$19(IDCreatorS57S0000000_15 iDCreatorS57S0000000_15, int i) {
        return new BulkCursorDescriptor[i];
    }

    public static final Object[] newArray$2(IDCreatorS57S0000000_15 iDCreatorS57S0000000_15, int i) {
        return new ChargeDeal[i];
    }

    public static final Object[] newArray$20(IDCreatorS57S0000000_15 iDCreatorS57S0000000_15, int i) {
        return new CursorWindow[i];
    }

    public static final Object[] newArray$3(IDCreatorS57S0000000_15 iDCreatorS57S0000000_15, int i) {
        return new WsApi[i];
    }

    public static final Object[] newArray$4(IDCreatorS57S0000000_15 iDCreatorS57S0000000_15, int i) {
        return new WsComponent[i];
    }

    public static final Object[] newArray$5(IDCreatorS57S0000000_15 iDCreatorS57S0000000_15, int i) {
        return new DownloadInfo[i];
    }

    public static final Object[] newArray$6(IDCreatorS57S0000000_15 iDCreatorS57S0000000_15, int i) {
        return new TEFocusParameters[i];
    }

    public static final Object[] newArray$7(IDCreatorS57S0000000_15 iDCreatorS57S0000000_15, int i) {
        return new LiveVerifyChecklist[i];
    }

    public static final Object[] newArray$8(IDCreatorS57S0000000_15 iDCreatorS57S0000000_15, int i) {
        return new MediaAudio[i];
    }

    public static final Object[] newArray$9(IDCreatorS57S0000000_15 iDCreatorS57S0000000_15, int i) {
        return new VEEditorModel[i];
    }
}

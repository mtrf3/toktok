package com.ss.android.ugc.aweme.shortvideo;

import X.C78886Uxe;
import X.C79045V0n;
import X.C82891Wg3;
import X.HC9;
import X.HCA;
import X.InterfaceC136915Yx;
import Y.IDCreatorS51S0000000_7;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.mt.protector.impl.string2number.CastFloatProtector;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.google.gson.m;
import com.ss.android.ugc.aweme.shortvideo.WorkSpace.Workspace;
import com.ss.android.ugc.aweme.shortvideo.model.ExtractFramesModel;
import com.ss.android.ugc.aweme.shortvideo.model.GameDuetResource;
import com.ss.android.ugc.aweme.shortvideo.ui.TimeSpeedModelExtension;
import com.ss.android.ugc.aweme.sticker.model.BackgroundVideo;
import com.ss.android.ugc.aweme.sticker.model.DiyPropVideo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes8.dex */
public class CameraComponentModel implements Parcelable {
    public static final Parcelable.Creator<CameraComponentModel> CREATOR = new IDCreatorS51S0000000_7(10);
    public String creationId;
    public int creativeVersion;
    public BackgroundVideo curBackgroundVideo;
    public DiyPropVideo curDiyPropVideo;
    public DuetContext duetContext;
    public boolean enableAspectRatio;
    public boolean enableFastCVLanczos;
    public boolean enableRecordingMp4;
    public boolean enterRecordWithSticker;
    public ExtractFramesModel extractFramesModel;
    public GameDuetResource gameDuetResource;
    public boolean isLoopSwitchOn;
    public boolean isMuted;
    public boolean isPlayingPreviewMusic;
    public boolean isRetakeMode;
    public float latestUsedZoomValue;
    public int mBeautyType;
    public boolean mCurrentDurationMode;
    public boolean mDurationSwitchable;
    public HCA mDurings;
    public int mHardEncode;
    public long mMaxDuration;
    public String mMusicPath;
    public int mMusicStart;
    public final int mRestoreType;
    public long mRetakeDuration;
    public HCA mRetakeDurings;
    public long mRetakeTime;
    public long mTotalRecordingTime;
    public boolean mUseBeautyFace;
    public int mVideoHeight;
    public int mVideoWidth;
    public Workspace mWorkspace;
    public long minDuration;
    public int musicEndTime;
    public RecordContext recordContext;
    public int recordMode;
    public InterfaceC136915Yx retakeVideoContext;
    public int subDraftType;
    public ClientCherEffectParam veCherEffectParam;
    public Map<String, Object> videoRecordMetadata;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final HCA LIZ() {
        if (!this.isRetakeMode || C78886Uxe.LJJIJ(this.mRetakeDurings)) {
            return this.mDurings;
        }
        HCA hca = new HCA(this.mDurings);
        InterfaceC136915Yx interfaceC136915Yx = this.retakeVideoContext;
        if (interfaceC136915Yx != null) {
            if (((RetakeVideoContext) interfaceC136915Yx).isAddClips) {
                hca.addAll(this.mRetakeDurings);
            } else if (((RetakeVideoContext) interfaceC136915Yx).retakeIndex < hca.size()) {
                InterfaceC136915Yx interfaceC136915Yx2 = this.retakeVideoContext;
                if (((RetakeVideoContext) interfaceC136915Yx2).retakeIndex >= 0) {
                    hca.remove(((RetakeVideoContext) interfaceC136915Yx2).retakeIndex);
                    hca.addAll(((RetakeVideoContext) this.retakeVideoContext).retakeIndex, this.mRetakeDurings);
                }
            }
        }
        return hca;
    }

    public final HCA LIZIZ() {
        if (this.isRetakeMode) {
            return this.mRetakeDurings;
        }
        return this.mDurings;
    }

    public final long LIZLLL() {
        if (this.isRetakeMode) {
            return this.mRetakeTime;
        }
        return this.mTotalRecordingTime;
    }

    public final long LJ() {
        if (this.isRetakeMode) {
            return this.mRetakeDuration;
        }
        return this.mMaxDuration;
    }

    public final long LJI() {
        if (this.isRetakeMode) {
            return ((RetakeVideoContext) this.retakeVideoContext).start + this.mMusicStart;
        }
        Iterator<TimeSpeedModelExtension> it = this.mDurings.iterator();
        while (it.hasNext()) {
            if (it.next().getLibraryVideo() != null) {
                Iterator<TimeSpeedModelExtension> it2 = this.mDurings.iterator();
                long j = 0;
                while (it2.hasNext()) {
                    TimeSpeedModelExtension next = it2.next();
                    if (next.getLibraryVideo() != null) {
                        j += next.getLibraryVideo().getAudioDuration().longValue();
                    }
                }
                return j + this.mMusicStart;
            }
        }
        return this.mMusicStart;
    }

    public final boolean LJII() {
        InterfaceC136915Yx interfaceC136915Yx = this.retakeVideoContext;
        if (interfaceC136915Yx != null && ((RetakeVideoContext) interfaceC136915Yx).isFromEditorPro) {
            return true;
        }
        return false;
    }

    public final boolean LJIIIIZZ() {
        Workspace workspace = this.mWorkspace;
        if (workspace != null && workspace.getMusicPath() != null && !LJIILIIL()) {
            return true;
        }
        return false;
    }

    public final boolean LJIILIIL() {
        if (!TextUtils.isEmpty(this.duetContext.duetVideoPath) && !TextUtils.isEmpty(this.duetContext.duetAudioPath)) {
            return true;
        }
        return false;
    }

    public final boolean LJIIIZ() {
        if (LJII() && ((RetakeVideoContext) this.retakeVideoContext).disableBGM) {
            return true;
        }
        return false;
    }

    public final String getMusicPath() {
        if (LJIIIIZZ()) {
            return this.mWorkspace.getMusicPath();
        }
        return null;
    }

    public CameraComponentModel(Parcel parcel) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        this.mDurings = new HCA();
        this.mRetakeDurings = new HCA();
        this.mTotalRecordingTime = 0L;
        this.mRetakeTime = 0L;
        this.isMuted = false;
        this.isPlayingPreviewMusic = false;
        this.duetContext = new DuetContext();
        this.mDurationSwitchable = true;
        this.mCurrentDurationMode = true;
        this.subDraftType = 0;
        this.latestUsedZoomValue = -1.0f;
        this.creativeVersion = 0;
        this.enableRecordingMp4 = false;
        this.enableFastCVLanczos = false;
        this.recordContext = new RecordContext();
        this.enableAspectRatio = false;
        this.mRestoreType = parcel.readInt();
        this.mMaxDuration = parcel.readLong();
        this.mMusicPath = parcel.readString();
        this.mMusicStart = parcel.readInt();
        this.mVideoWidth = parcel.readInt();
        this.mVideoHeight = parcel.readInt();
        this.mWorkspace = (Workspace) parcel.readParcelable(Workspace.class.getClassLoader());
        this.mDurings = new HCA(LJIIJJI(parcel.readString()));
        this.mTotalRecordingTime = parcel.readLong();
        this.mHardEncode = parcel.readInt();
        if (parcel.readInt() == 1) {
            z = true;
        } else {
            z = false;
        }
        this.mUseBeautyFace = z;
        this.mBeautyType = parcel.readInt();
        this.creationId = parcel.readString();
        this.creativeVersion = parcel.readInt();
        this.duetContext = (DuetContext) parcel.readParcelable(DuetContext.class.getClassLoader());
        this.recordContext = (RecordContext) parcel.readParcelable(RecordContext.class.getClassLoader());
        if (parcel.readByte() != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.mDurationSwitchable = z2;
        if (parcel.readByte() != 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        this.mCurrentDurationMode = z3;
        if (parcel.readByte() != 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        this.isMuted = z4;
        this.recordMode = parcel.readInt();
        this.gameDuetResource = (GameDuetResource) parcel.readParcelable(GameDuetResource.class.getClassLoader());
        this.extractFramesModel = (ExtractFramesModel) parcel.readSerializable();
        this.veCherEffectParam = (ClientCherEffectParam) parcel.readParcelable(ClientCherEffectParam.class.getClassLoader());
        if (parcel.readByte() != 0) {
            z5 = true;
        } else {
            z5 = false;
        }
        this.isLoopSwitchOn = z5;
        this.latestUsedZoomValue = parcel.readFloat();
        if (parcel.readByte() != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        this.enterRecordWithSticker = z6;
        this.enableFastCVLanczos = parcel.readInt() == 1;
    }

    public static ArrayList<TimeSpeedModelExtension> LJIIJJI(String str) {
        try {
            return LJIIL(str);
        } catch (Exception unused) {
            ArrayList<TimeSpeedModelExtension> arrayList = new ArrayList<>();
            if (!TextUtils.isEmpty(str)) {
                String[] split = str.split("\\$");
                if (split.length > 0) {
                    for (String str2 : split) {
                        String[] split2 = str2.split(",");
                        if (split2.length == 2) {
                            try {
                                arrayList.add(new TimeSpeedModelExtension(CastIntegerProtector.parseInt(split2[0]), CastFloatProtector.parseFloat(split2[1]), null, null, null));
                            } catch (Exception unused2) {
                            }
                        }
                        if (split2.length == 3) {
                            try {
                                arrayList.add(new TimeSpeedModelExtension(CastIntegerProtector.parseInt(split2[0]), CastFloatProtector.parseFloat(split2[1]), split2[2], null, null));
                            } catch (Exception unused3) {
                            }
                        }
                    }
                }
            }
            return arrayList;
        }
    }

    public static ArrayList<TimeSpeedModelExtension> LJIIL(String str) {
        ArrayList arrayList = (ArrayList) GsonProtectorUtils.fromJson(C82891Wg3.LIZJ(), str, new HC9().getType());
        ArrayList<TimeSpeedModelExtension> arrayList2 = new ArrayList<>(arrayList.size());
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(TimeSpeedModelExtension.fromJson(C82891Wg3.LIZJ(), (m) it.next()));
        }
        return arrayList2;
    }

    public final void LJIIJ(long j) {
        if (this.isRetakeMode) {
            this.mRetakeTime = j;
        } else {
            this.mTotalRecordingTime = j;
        }
    }

    public CameraComponentModel(int i) {
        this.mDurings = new HCA();
        this.mRetakeDurings = new HCA();
        this.mTotalRecordingTime = 0L;
        this.mRetakeTime = 0L;
        this.isMuted = false;
        this.isPlayingPreviewMusic = false;
        this.duetContext = new DuetContext();
        this.mDurationSwitchable = true;
        this.mCurrentDurationMode = true;
        this.subDraftType = 0;
        this.latestUsedZoomValue = -1.0f;
        this.creativeVersion = 0;
        this.enableRecordingMp4 = false;
        this.enableFastCVLanczos = false;
        this.recordContext = new RecordContext();
        this.enableAspectRatio = false;
        this.mRestoreType = i;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.mRestoreType);
        parcel.writeLong(this.mMaxDuration);
        parcel.writeString(this.mMusicPath);
        parcel.writeInt(this.mMusicStart);
        parcel.writeInt(this.mVideoWidth);
        parcel.writeInt(this.mVideoHeight);
        parcel.writeParcelable(this.mWorkspace, i);
        parcel.writeString(C79045V0n.LJIJI(this.mDurings));
        parcel.writeLong(this.mTotalRecordingTime);
        parcel.writeInt(this.mHardEncode);
        parcel.writeInt(this.mUseBeautyFace ? 1 : 0);
        parcel.writeInt(this.mBeautyType);
        parcel.writeString(this.creationId);
        parcel.writeInt(this.creativeVersion);
        parcel.writeParcelable(this.duetContext, i);
        parcel.writeParcelable(this.recordContext, i);
        parcel.writeByte(this.mDurationSwitchable ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.mCurrentDurationMode ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.isMuted ? (byte) 1 : (byte) 0);
        parcel.writeInt(this.recordMode);
        parcel.writeParcelable(this.gameDuetResource, i);
        parcel.writeSerializable(this.extractFramesModel);
        parcel.writeParcelable(this.veCherEffectParam, i);
        parcel.writeByte(this.isLoopSwitchOn ? (byte) 1 : (byte) 0);
        parcel.writeFloat(this.latestUsedZoomValue);
        parcel.writeByte(this.enterRecordWithSticker ? (byte) 1 : (byte) 0);
        parcel.writeInt(this.enableFastCVLanczos ? 1 : 0);
    }

    public CameraComponentModel(int i, String str, int i2) {
        this.mDurings = new HCA();
        this.mRetakeDurings = new HCA();
        this.mTotalRecordingTime = 0L;
        this.mRetakeTime = 0L;
        this.isMuted = false;
        this.isPlayingPreviewMusic = false;
        this.duetContext = new DuetContext();
        this.mDurationSwitchable = true;
        this.mCurrentDurationMode = true;
        this.subDraftType = 0;
        this.latestUsedZoomValue = -1.0f;
        this.creativeVersion = 0;
        this.enableRecordingMp4 = false;
        this.enableFastCVLanczos = false;
        this.recordContext = new RecordContext();
        this.enableAspectRatio = false;
        this.mRestoreType = i;
        this.creationId = str;
        this.creativeVersion = i2;
    }
}

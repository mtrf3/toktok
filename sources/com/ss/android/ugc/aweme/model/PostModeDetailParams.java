package com.ss.android.ugc.aweme.model;

import X.C05040Hs;
import X.C1FL;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.model.PhotoModeIngressEtData;
import com.ss.android.ugc.aweme.model.PostModeDetailParams;
import com.ss.android.ugc.aweme.model.PostModeEntranceMechanism;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class PostModeDetailParams implements Parcelable {
    public static final Parcelable.Creator<PostModeDetailParams> CREATOR = new Parcelable.Creator<PostModeDetailParams>() { // from class: X.7uf
        @Override // android.os.Parcelable.Creator
        public final PostModeDetailParams createFromParcel(Parcel parcel) {
            boolean z;
            boolean z2;
            PhotoModeIngressEtData createFromParcel;
            boolean z3;
            boolean z4;
            Boolean valueOf;
            Long valueOf2;
            boolean z5;
            PostModeEntranceMechanism createFromParcel2;
            boolean z6;
            boolean z7;
            boolean z8;
            boolean z9;
            boolean z10;
            o.LJIIIZ(parcel, "parcel");
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            String readString3 = parcel.readString();
            int readInt = parcel.readInt();
            String readString4 = parcel.readString();
            int readInt2 = parcel.readInt();
            String readString5 = parcel.readString();
            int readInt3 = parcel.readInt();
            String readString6 = parcel.readString();
            String readString7 = parcel.readString();
            if (parcel.readInt() != 0) {
                z = true;
            } else {
                z = false;
            }
            if (parcel.readInt() != 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            HashMap hashMap = null;
            if (parcel.readInt() == 0) {
                createFromParcel = null;
            } else {
                createFromParcel = PhotoModeIngressEtData.CREATOR.createFromParcel(parcel);
            }
            PhotoModeIngressEtData photoModeIngressEtData = createFromParcel;
            if (parcel.readInt() != 0) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (parcel.readInt() == 0) {
                valueOf = null;
            } else {
                if (parcel.readInt() != 0) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                valueOf = Boolean.valueOf(z4);
            }
            if (parcel.readInt() == 0) {
                valueOf2 = null;
            } else {
                valueOf2 = Long.valueOf(parcel.readLong());
            }
            if (parcel.readInt() != 0) {
                z5 = true;
            } else {
                z5 = false;
            }
            if (parcel.readInt() == 0) {
                createFromParcel2 = null;
            } else {
                createFromParcel2 = PostModeEntranceMechanism.CREATOR.createFromParcel(parcel);
            }
            PostModeEntranceMechanism postModeEntranceMechanism = createFromParcel2;
            if (parcel.readInt() != 0) {
                z6 = true;
            } else {
                z6 = false;
            }
            if (parcel.readInt() != 0) {
                z7 = true;
            } else {
                z7 = false;
            }
            if (parcel.readInt() != 0) {
                z8 = true;
            } else {
                z8 = false;
            }
            if (parcel.readInt() != 0) {
                z9 = true;
            } else {
                z9 = false;
            }
            if (parcel.readInt() != 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (parcel.readInt() != 0) {
                int readInt4 = parcel.readInt();
                hashMap = new HashMap(readInt4);
                for (int i = 0; i != readInt4; i++) {
                    hashMap.put(parcel.readString(), parcel.readString());
                }
            }
            return new PostModeDetailParams(readString, readString2, readString3, readInt, readString4, readInt2, readString5, readInt3, readString6, readString7, z, z2, photoModeIngressEtData, z3, valueOf, valueOf2, z5, postModeEntranceMechanism, z6, z7, z8, z9, z10, hashMap);
        }

        @Override // android.os.Parcelable.Creator
        public final PostModeDetailParams[] newArray(int i) {
            return new PostModeDetailParams[i];
        }
    };
    public final boolean autoAdvancePausedTillManualResume;
    public String awemeId;
    public HashMap<String, String> displayTitleParams;
    public boolean enableGestureExit;
    public boolean enableSingleClick;
    public String enterMethod;
    public String eventType;
    public String feedParamFrom;
    public final boolean hasNextFeed;
    public int imageHeight;
    public final boolean isEnableAutoSlidePhoto;
    public Boolean isMuted;
    public boolean isPlayerPaused;
    public final boolean needMobVideoPlay;
    public int pageType;
    public Long pauseTime;
    public PhotoModeIngressEtData photoModeIngressEtData;
    public String playerKey;
    public int position;
    public final PostModeEntranceMechanism postModeEntranceMechanism;
    public String previousPage;
    public String tabName;
    public final boolean useFadeOutExitAnim;
    public final boolean useSwipeEnterAnim;

    public PostModeDetailParams() {
        this(0);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PostModeDetailParams)) {
            return false;
        }
        PostModeDetailParams postModeDetailParams = (PostModeDetailParams) obj;
        return o.LJ(this.eventType, postModeDetailParams.eventType) && o.LJ(this.tabName, postModeDetailParams.tabName) && o.LJ(this.awemeId, postModeDetailParams.awemeId) && this.position == postModeDetailParams.position && o.LJ(this.playerKey, postModeDetailParams.playerKey) && this.imageHeight == postModeDetailParams.imageHeight && o.LJ(this.previousPage, postModeDetailParams.previousPage) && this.pageType == postModeDetailParams.pageType && o.LJ(this.feedParamFrom, postModeDetailParams.feedParamFrom) && o.LJ(this.enterMethod, postModeDetailParams.enterMethod) && this.enableGestureExit == postModeDetailParams.enableGestureExit && this.isPlayerPaused == postModeDetailParams.isPlayerPaused && o.LJ(this.photoModeIngressEtData, postModeDetailParams.photoModeIngressEtData) && this.hasNextFeed == postModeDetailParams.hasNextFeed && o.LJ(this.isMuted, postModeDetailParams.isMuted) && o.LJ(this.pauseTime, postModeDetailParams.pauseTime) && this.enableSingleClick == postModeDetailParams.enableSingleClick && this.postModeEntranceMechanism == postModeDetailParams.postModeEntranceMechanism && this.useSwipeEnterAnim == postModeDetailParams.useSwipeEnterAnim && this.useFadeOutExitAnim == postModeDetailParams.useFadeOutExitAnim && this.isEnableAutoSlidePhoto == postModeDetailParams.isEnableAutoSlidePhoto && this.needMobVideoPlay == postModeDetailParams.needMobVideoPlay && this.autoAdvancePausedTillManualResume == postModeDetailParams.autoAdvancePausedTillManualResume && o.LJ(this.displayTitleParams, postModeDetailParams.displayTitleParams);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        String str = this.eventType;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.tabName;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.awemeId;
        int hashCode3 = (((hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31) + this.position) * 31;
        String str4 = this.playerKey;
        int hashCode4 = (((hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31) + this.imageHeight) * 31;
        String str5 = this.previousPage;
        int hashCode5 = (((hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31) + this.pageType) * 31;
        String str6 = this.feedParamFrom;
        int hashCode6 = (hashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.enterMethod;
        int hashCode7 = (hashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
        boolean z = this.enableGestureExit;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int i2 = (hashCode7 + i) * 31;
        boolean z2 = this.isPlayerPaused;
        int i3 = z2;
        if (z2 != 0) {
            i3 = 1;
        }
        int i4 = (i2 + i3) * 31;
        PhotoModeIngressEtData photoModeIngressEtData = this.photoModeIngressEtData;
        int hashCode8 = (i4 + (photoModeIngressEtData == null ? 0 : photoModeIngressEtData.hashCode())) * 31;
        boolean z3 = this.hasNextFeed;
        int i5 = z3;
        if (z3 != 0) {
            i5 = 1;
        }
        int i6 = (hashCode8 + i5) * 31;
        Boolean bool = this.isMuted;
        int hashCode9 = (i6 + (bool == null ? 0 : bool.hashCode())) * 31;
        Long l = this.pauseTime;
        int hashCode10 = (hashCode9 + (l == null ? 0 : l.hashCode())) * 31;
        boolean z4 = this.enableSingleClick;
        int i7 = z4;
        if (z4 != 0) {
            i7 = 1;
        }
        int i8 = (hashCode10 + i7) * 31;
        PostModeEntranceMechanism postModeEntranceMechanism = this.postModeEntranceMechanism;
        int hashCode11 = (i8 + (postModeEntranceMechanism == null ? 0 : postModeEntranceMechanism.hashCode())) * 31;
        boolean z5 = this.useSwipeEnterAnim;
        int i9 = z5;
        if (z5 != 0) {
            i9 = 1;
        }
        int i10 = (hashCode11 + i9) * 31;
        boolean z6 = this.useFadeOutExitAnim;
        int i11 = z6;
        if (z6 != 0) {
            i11 = 1;
        }
        int i12 = (i10 + i11) * 31;
        boolean z7 = this.isEnableAutoSlidePhoto;
        int i13 = z7;
        if (z7 != 0) {
            i13 = 1;
        }
        int i14 = (i12 + i13) * 31;
        boolean z8 = this.needMobVideoPlay;
        int i15 = z8;
        if (z8 != 0) {
            i15 = 1;
        }
        int i16 = (((i14 + i15) * 31) + (this.autoAdvancePausedTillManualResume ? 1 : 0)) * 31;
        HashMap<String, String> hashMap = this.displayTitleParams;
        return i16 + (hashMap != null ? hashMap.hashCode() : 0);
    }

    public final String toString() {
        return "PostModeDetailParams(eventType=" + this.eventType + ", tabName=" + this.tabName + ", awemeId=" + this.awemeId + ", position=" + this.position + ", playerKey=" + this.playerKey + ", imageHeight=" + this.imageHeight + ", previousPage=" + this.previousPage + ", pageType=" + this.pageType + ", feedParamFrom=" + this.feedParamFrom + ", enterMethod=" + this.enterMethod + ", enableGestureExit=" + this.enableGestureExit + ", isPlayerPaused=" + this.isPlayerPaused + ", photoModeIngressEtData=" + this.photoModeIngressEtData + ", hasNextFeed=" + this.hasNextFeed + ", isMuted=" + this.isMuted + ", pauseTime=" + this.pauseTime + ", enableSingleClick=" + this.enableSingleClick + ", postModeEntranceMechanism=" + this.postModeEntranceMechanism + ", useSwipeEnterAnim=" + this.useSwipeEnterAnim + ", useFadeOutExitAnim=" + this.useFadeOutExitAnim + ", isEnableAutoSlidePhoto=" + this.isEnableAutoSlidePhoto + ", needMobVideoPlay=" + this.needMobVideoPlay + ", autoAdvancePausedTillManualResume=" + this.autoAdvancePausedTillManualResume + ", displayTitleParams=" + this.displayTitleParams + ')';
    }

    public /* synthetic */ PostModeDetailParams(int i) {
        this(null, null, null, 0, null, 0, null, 0, null, null, true, true, null, false, null, null, true, null, false, false, true, false, false, null);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        out.writeString(this.eventType);
        out.writeString(this.tabName);
        out.writeString(this.awemeId);
        out.writeInt(this.position);
        out.writeString(this.playerKey);
        out.writeInt(this.imageHeight);
        out.writeString(this.previousPage);
        out.writeInt(this.pageType);
        out.writeString(this.feedParamFrom);
        out.writeString(this.enterMethod);
        out.writeInt(this.enableGestureExit ? 1 : 0);
        out.writeInt(this.isPlayerPaused ? 1 : 0);
        PhotoModeIngressEtData photoModeIngressEtData = this.photoModeIngressEtData;
        if (photoModeIngressEtData == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            photoModeIngressEtData.writeToParcel(out, i);
        }
        out.writeInt(this.hasNextFeed ? 1 : 0);
        Boolean bool = this.isMuted;
        if (bool == null) {
            out.writeInt(0);
        } else {
            C1FL.LJ(out, 1, bool);
        }
        Long l = this.pauseTime;
        if (l == null) {
            out.writeInt(0);
        } else {
            C05040Hs.LIZLLL(out, 1, l);
        }
        out.writeInt(this.enableSingleClick ? 1 : 0);
        PostModeEntranceMechanism postModeEntranceMechanism = this.postModeEntranceMechanism;
        if (postModeEntranceMechanism == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            postModeEntranceMechanism.writeToParcel(out, i);
        }
        out.writeInt(this.useSwipeEnterAnim ? 1 : 0);
        out.writeInt(this.useFadeOutExitAnim ? 1 : 0);
        out.writeInt(this.isEnableAutoSlidePhoto ? 1 : 0);
        out.writeInt(this.needMobVideoPlay ? 1 : 0);
        out.writeInt(this.autoAdvancePausedTillManualResume ? 1 : 0);
        HashMap<String, String> hashMap = this.displayTitleParams;
        if (hashMap == null) {
            out.writeInt(0);
            return;
        }
        out.writeInt(1);
        out.writeInt(hashMap.size());
        for (Map.Entry<String, String> entry : hashMap.entrySet()) {
            out.writeString(entry.getKey());
            out.writeString(entry.getValue());
        }
    }

    public PostModeDetailParams(String str, String str2, String str3, int i, String str4, int i2, String str5, int i3, String str6, String str7, boolean z, boolean z2, PhotoModeIngressEtData photoModeIngressEtData, boolean z3, Boolean bool, Long l, boolean z4, PostModeEntranceMechanism postModeEntranceMechanism, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, HashMap<String, String> hashMap) {
        this.eventType = str;
        this.tabName = str2;
        this.awemeId = str3;
        this.position = i;
        this.playerKey = str4;
        this.imageHeight = i2;
        this.previousPage = str5;
        this.pageType = i3;
        this.feedParamFrom = str6;
        this.enterMethod = str7;
        this.enableGestureExit = z;
        this.isPlayerPaused = z2;
        this.photoModeIngressEtData = photoModeIngressEtData;
        this.hasNextFeed = z3;
        this.isMuted = bool;
        this.pauseTime = l;
        this.enableSingleClick = z4;
        this.postModeEntranceMechanism = postModeEntranceMechanism;
        this.useSwipeEnterAnim = z5;
        this.useFadeOutExitAnim = z6;
        this.isEnableAutoSlidePhoto = z7;
        this.needMobVideoPlay = z8;
        this.autoAdvancePausedTillManualResume = z9;
        this.displayTitleParams = hashMap;
    }
}

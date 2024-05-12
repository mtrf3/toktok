package com.ss.android.ugc.aweme.shortvideo.reaction;

import X.InterfaceC65349Pkn;
import Y.IDCreatorS51S0000000_7;
import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes8.dex */
public class ReactionParams implements Serializable, Parcelable {
    public static final Parcelable.Creator<ReactionParams> CREATOR = new IDCreatorS51S0000000_7(18);

    @InterfaceC65349Pkn("non_reacted_video")
    public boolean nonReacted;

    @InterfaceC65349Pkn("reaction_from_id")
    public String reactionFromId;

    @InterfaceC65349Pkn("reaction_origin_id")
    public String reactionOriginId;

    @InterfaceC65349Pkn("reaction_view_id")
    public String reactionViewId;

    @InterfaceC65349Pkn("video_height")
    public int videoHeight;

    @InterfaceC65349Pkn("video_path")
    public String videoPath;

    @InterfaceC65349Pkn("video_width")
    public int videoWidth;

    @InterfaceC65349Pkn("wav_path")
    public String wavPath;

    @InterfaceC65349Pkn("react_shape_list")
    public List<CopiedReactionWindowInfo> windowInfoList;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean removeReactionWindowInfo() {
        if (this.windowInfoList.size() > 0) {
            List<CopiedReactionWindowInfo> list = this.windowInfoList;
            ListProtector.remove(list, list.size() - 1);
            return true;
        }
        return false;
    }

    public ReactionParams() {
        this.windowInfoList = new ArrayList();
    }

    public ReactionParams(Parcel parcel) {
        boolean z;
        this.windowInfoList = new ArrayList();
        this.videoPath = parcel.readString();
        this.wavPath = parcel.readString();
        this.videoWidth = parcel.readInt();
        this.videoHeight = parcel.readInt();
        this.reactionViewId = parcel.readString();
        this.reactionOriginId = parcel.readString();
        this.reactionFromId = parcel.readString();
        if (parcel.readByte() != 0) {
            z = true;
        } else {
            z = false;
        }
        this.nonReacted = z;
        this.windowInfoList = parcel.createTypedArrayList(CopiedReactionWindowInfo.CREATOR);
    }

    public void addReactionWindowInfo(CopiedReactionWindowInfo copiedReactionWindowInfo) {
        this.windowInfoList.add(copiedReactionWindowInfo);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.videoPath);
        parcel.writeString(this.wavPath);
        parcel.writeInt(this.videoWidth);
        parcel.writeInt(this.videoHeight);
        parcel.writeString(this.reactionViewId);
        parcel.writeString(this.reactionOriginId);
        parcel.writeString(this.reactionFromId);
        parcel.writeByte(this.nonReacted ? (byte) 1 : (byte) 0);
        parcel.writeTypedList(this.windowInfoList);
    }
}

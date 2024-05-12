package com.ss.android.ugc.aweme.comment.preload;

import X.C76G;
import Y.IDCreatorS48S0000000_3;
import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.google.gson.Gson;

/* loaded from: classes4.dex */
public class CommentPreloadRequest implements Parcelable {
    public static final Parcelable.Creator CREATOR = new IDCreatorS48S0000000_3(0);
    public final Long adCreativeId;
    public final int adPricingType;
    public final String aid;
    public final int authorRelationType;
    public final int channelId;
    public final int count;
    public final long cursor;
    public final String enterType;
    public final int forwardPageType;
    public final String insertCids;
    public final int limitCount;
    public final int loadType;
    public final int offlinePin;
    public final Object policy;
    public final String searchParams;
    public final String userAvatarShrink;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public CommentPreloadRequest(Parcel parcel) {
        this.aid = parcel.readString();
        this.cursor = parcel.readLong();
        this.count = parcel.readInt();
        this.insertCids = parcel.readString();
        this.forwardPageType = parcel.readInt();
        this.adCreativeId = Long.valueOf(parcel.readLong());
        this.channelId = parcel.readInt();
        this.userAvatarShrink = parcel.readString();
        this.adPricingType = parcel.readInt();
        this.loadType = parcel.readInt();
        this.policy = GsonProtectorUtils.fromJson(new Gson(), parcel.readString(), Object.class);
        this.limitCount = parcel.readInt();
        this.offlinePin = parcel.readInt();
        this.authorRelationType = parcel.readInt();
        this.enterType = parcel.readString();
        this.searchParams = parcel.readString();
    }

    public CommentPreloadRequest(C76G c76g) {
        this.aid = c76g.LIZ;
        this.cursor = c76g.LIZIZ;
        this.count = c76g.LIZJ;
        this.insertCids = c76g.LIZLLL;
        this.forwardPageType = c76g.LJ;
        this.adCreativeId = c76g.LJFF;
        this.channelId = c76g.LJI;
        this.userAvatarShrink = c76g.LJII;
        this.adPricingType = c76g.LJIIIIZZ;
        this.loadType = c76g.LJIIIZ;
        this.policy = c76g.LJIIJ;
        this.limitCount = c76g.LJIIJJI;
        this.offlinePin = c76g.LJIIL;
        this.authorRelationType = c76g.LJIILIIL;
        this.enterType = c76g.LJIILJJIL;
        this.searchParams = c76g.LJIILL;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.aid);
        parcel.writeLong(this.cursor);
        parcel.writeInt(this.count);
        parcel.writeString(this.insertCids);
        parcel.writeInt(this.forwardPageType);
        parcel.writeLong(this.adCreativeId.longValue());
        parcel.writeInt(this.channelId);
        parcel.writeString(this.userAvatarShrink);
        parcel.writeInt(this.adPricingType);
        parcel.writeInt(this.loadType);
        parcel.writeString(GsonProtectorUtils.toJson(new Gson(), this.policy));
        parcel.writeInt(this.limitCount);
        parcel.writeInt(this.offlinePin);
        parcel.writeInt(this.authorRelationType);
        parcel.writeString(this.enterType);
        parcel.writeString(this.searchParams);
    }
}

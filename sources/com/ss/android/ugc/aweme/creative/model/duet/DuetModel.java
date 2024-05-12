package com.ss.android.ugc.aweme.creative.model.duet;

import X.C41563GSx;
import X.InterfaceC65349Pkn;
import X.X1D;
import android.os.Parcel;
import android.os.Parcelable;
import defpackage.b0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class DuetModel implements Parcelable {
    public static final Parcelable.Creator<DuetModel> CREATOR = new C41563GSx();

    @InterfaceC65349Pkn("duet_author")
    public DuetUser duetAuthor;

    @InterfaceC65349Pkn("duet_hashtag")
    public String duetHashtag;

    @InterfaceC65349Pkn("duet_video_aigc_label_type")
    public int duetVideoAIGCLabelType;

    @InterfaceC65349Pkn("duet_video_id")
    public String duetVideoId;

    /* JADX WARN: Multi-variable type inference failed */
    public DuetModel() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0, 15, 0 == true ? 1 : 0);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DuetModel)) {
            return false;
        }
        DuetModel duetModel = (DuetModel) obj;
        return o.LJ(this.duetAuthor, duetModel.duetAuthor) && o.LJ(this.duetVideoId, duetModel.duetVideoId) && o.LJ(this.duetHashtag, duetModel.duetHashtag) && this.duetVideoAIGCLabelType == duetModel.duetVideoAIGCLabelType;
    }

    public final int hashCode() {
        DuetUser duetUser = this.duetAuthor;
        int hashCode = (duetUser == null ? 0 : duetUser.hashCode()) * 31;
        String str = this.duetVideoId;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.duetHashtag;
        return ((hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31) + this.duetVideoAIGCLabelType;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        DuetUser duetUser = this.duetAuthor;
        if (duetUser == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            duetUser.writeToParcel(out, i);
        }
        out.writeString(this.duetVideoId);
        out.writeString(this.duetHashtag);
        out.writeInt(this.duetVideoAIGCLabelType);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("DuetModel(duetAuthor=");
        LIZ.append(this.duetAuthor);
        LIZ.append(", duetVideoId=");
        LIZ.append(this.duetVideoId);
        LIZ.append(", duetHashtag=");
        LIZ.append(this.duetHashtag);
        LIZ.append(", duetVideoAIGCLabelType=");
        return b0.LIZJ(LIZ, this.duetVideoAIGCLabelType, ')', LIZ);
    }

    public DuetModel(DuetUser duetUser, String str, String str2, int i) {
        this.duetAuthor = duetUser;
        this.duetVideoId = str;
        this.duetHashtag = str2;
        this.duetVideoAIGCLabelType = i;
    }

    public /* synthetic */ DuetModel(DuetUser duetUser, String str, String str2, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? null : duetUser, (i2 & 2) != 0 ? null : str, (i2 & 4) != 0 ? null : str2, (i2 & 8) != 0 ? 0 : i);
    }
}

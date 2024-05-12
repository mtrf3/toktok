package com.ss.android.ugc.aweme.influencer.ecommercelive.business.effect2.model;

import X.C78685UuP;
import X.F9E;
import X.HH1;
import X.S51;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class RootData extends F9E implements Parcelable {
    public static final Parcelable.Creator<RootData> CREATOR = new S51();
    public String authorId;
    public boolean isNewUser;
    public String roomId;
    public int templateEntryType;
    public String userId;

    public RootData() {
        this(0);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.authorId, this.roomId, Boolean.valueOf(this.isNewUser), this.userId, Integer.valueOf(this.templateEntryType)};
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        out.writeString(this.authorId);
        out.writeString(this.roomId);
        out.writeInt(this.isNewUser ? 1 : 0);
        out.writeString(this.userId);
        out.writeInt(this.templateEntryType);
    }

    public final boolean isOwner() {
        if (C78685UuP.LJJJZ(this.authorId) && C78685UuP.LJJJZ(this.userId) && o.LJ(this.authorId, this.userId)) {
            return true;
        }
        return false;
    }

    public final String L() {
        if (!isOwner()) {
            return this.userId;
        }
        return null;
    }

    public /* synthetic */ RootData(int i) {
        this(0, "", true, "", "");
    }

    public RootData(int i, String str, boolean z, String str2, String str3) {
        HH1.LIZ(str, "authorId", str2, "roomId", str3, "userId");
        this.authorId = str;
        this.roomId = str2;
        this.isNewUser = z;
        this.userId = str3;
        this.templateEntryType = i;
    }
}

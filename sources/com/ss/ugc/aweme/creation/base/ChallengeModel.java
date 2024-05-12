package com.ss.ugc.aweme.creation.base;

import X.HIM;
import X.InterfaceC65349Pkn;
import android.os.Parcel;
import android.os.Parcelable;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public class ChallengeModel implements Parcelable, Serializable {
    public static final Parcelable.Creator<ChallengeModel> CREATOR = new HIM();

    @InterfaceC65349Pkn("challenge_id")
    public String challengeId;

    @InterfaceC65349Pkn("challenge_name")
    public String challengeName;

    /* JADX WARN: Multi-variable type inference failed */
    public ChallengeModel() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        o.LJIIIZ(parcel, "parcel");
        parcel.writeString(this.challengeId);
        parcel.writeString(this.challengeName);
    }

    public final String getChallengeId() {
        return this.challengeId;
    }

    public final String getChallengeName() {
        return this.challengeName;
    }

    public final void setChallengeId(String str) {
        this.challengeId = str;
    }

    public final void setChallengeName(String str) {
        this.challengeName = str;
    }

    public ChallengeModel(String str, String str2) {
        this.challengeId = str;
        this.challengeName = str2;
    }

    public /* synthetic */ ChallengeModel(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2);
    }
}

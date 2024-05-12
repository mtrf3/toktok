package com.ss.android.ugc.aweme.creative.model;

import X.HCQ;
import X.InterfaceC65349Pkn;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class SocialParametersModel implements Parcelable {
    public static final Parcelable.Creator<SocialParametersModel> CREATOR = new HCQ();

    @InterfaceC65349Pkn("from_user_id")
    public final String fromUserId;

    @InterfaceC65349Pkn("is_prop_prompt")
    public final String isPropPrompt;

    /* JADX WARN: Multi-variable type inference failed */
    public SocialParametersModel() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        out.writeString(this.isPropPrompt);
        out.writeString(this.fromUserId);
    }

    public SocialParametersModel(String str, String str2) {
        this.isPropPrompt = str;
        this.fromUserId = str2;
    }

    public /* synthetic */ SocialParametersModel(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2);
    }
}

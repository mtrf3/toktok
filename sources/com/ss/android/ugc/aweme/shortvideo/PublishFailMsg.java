package com.ss.android.ugc.aweme.shortvideo;

import X.F9E;
import X.GW1;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class PublishFailMsg extends F9E implements Parcelable {
    public static final Parcelable.Creator<PublishFailMsg> CREATOR = new GW1();
    public final boolean ccNotAllowDirectPost;
    public final boolean isDirectPublishByCC;
    public final String publishFailedString;

    public PublishFailMsg() {
        this(0);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.publishFailedString, Boolean.valueOf(this.isDirectPublishByCC), Boolean.valueOf(this.ccNotAllowDirectPost)};
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        out.writeString(this.publishFailedString);
        out.writeInt(this.isDirectPublishByCC ? 1 : 0);
        out.writeInt(this.ccNotAllowDirectPost ? 1 : 0);
    }

    public /* synthetic */ PublishFailMsg(int i) {
        this("", false, false);
    }

    public PublishFailMsg(String publishFailedString, boolean z, boolean z2) {
        o.LJIIIZ(publishFailedString, "publishFailedString");
        this.publishFailedString = publishFailedString;
        this.isDirectPublishByCC = z;
        this.ccNotAllowDirectPost = z2;
    }
}

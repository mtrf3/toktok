package com.bytedance.android.livesdk.chatroom.model;

import X.CIE;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class ReplyInfo implements Parcelable {
    public static final Parcelable.Creator<ReplyInfo> CREATOR = new CIE();
    public long msgId;
    public long releaseId;
    public long replyToId;
    public String replyUserSecId;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        out.writeInt(1);
    }
}

package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.android.livesdk.chatroom.model.ReplyInfo;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class CIE implements Parcelable.Creator<ReplyInfo> {
    @Override // android.os.Parcelable.Creator
    public final ReplyInfo createFromParcel(Parcel parcel) {
        o.LJIIIZ(parcel, "parcel");
        parcel.readInt();
        return new ReplyInfo();
    }

    @Override // android.os.Parcelable.Creator
    public final ReplyInfo[] newArray(int i) {
        return new ReplyInfo[i];
    }
}

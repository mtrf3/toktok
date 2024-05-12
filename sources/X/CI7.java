package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.android.livesdk.chatroom.event.ISendCommentEvent;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class CI7 implements Parcelable.Creator<ISendCommentEvent.Sender> {
    @Override // android.os.Parcelable.Creator
    public final ISendCommentEvent.Sender createFromParcel(Parcel parcel) {
        o.LJIIIZ(parcel, "parcel");
        String readString = parcel.readString();
        if (readString == null) {
            readString = "UNKNOWN";
        }
        ISendCommentEvent.Sender valueOf = ISendCommentEvent.Sender.valueOf(readString);
        parcel.readMap(valueOf.getLogArgs(), java.util.Map.class.getClassLoader());
        return valueOf;
    }

    @Override // android.os.Parcelable.Creator
    public final ISendCommentEvent.Sender[] newArray(int i) {
        return new ISendCommentEvent.Sender[i];
    }
}

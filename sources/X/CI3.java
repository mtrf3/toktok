package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.android.livesdk.chatroom.utils.EmoteFixTextHelper;
import java.util.ArrayList;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class CI3 implements Parcelable.Creator<EmoteFixTextHelper> {
    @Override // android.os.Parcelable.Creator
    public final EmoteFixTextHelper createFromParcel(Parcel parcel) {
        boolean z;
        o.LJIIIZ(parcel, "parcel");
        EmoteFixTextHelper emoteFixTextHelper = new EmoteFixTextHelper();
        emoteFixTextHelper.emoteLength = parcel.readInt();
        if (parcel.readByte() != 0) {
            z = true;
        } else {
            z = false;
        }
        emoteFixTextHelper.isReceiveInput = z;
        ArrayList createTypedArrayList = parcel.createTypedArrayList(EmoteFixTextHelper.EmoteText.CREATOR);
        if ((createTypedArrayList instanceof ArrayList) && createTypedArrayList != null) {
            emoteFixTextHelper.list.addAll(createTypedArrayList);
        }
        emoteFixTextHelper.recordInputIndex = parcel.readInt();
        emoteFixTextHelper.recordLength = parcel.readInt();
        return emoteFixTextHelper;
    }

    @Override // android.os.Parcelable.Creator
    public final EmoteFixTextHelper[] newArray(int i) {
        return new EmoteFixTextHelper[i];
    }
}

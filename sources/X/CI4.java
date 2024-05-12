package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.android.live.base.model.emoji.EmoteModel;
import com.bytedance.android.livesdk.chatroom.utils.EmoteFixTextHelper;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class CI4 implements Parcelable.Creator<EmoteFixTextHelper.EmoteText> {
    @Override // android.os.Parcelable.Creator
    public final EmoteFixTextHelper.EmoteText createFromParcel(Parcel parcel) {
        o.LJIIIZ(parcel, "parcel");
        EmoteFixTextHelper.EmoteText emoteText = new EmoteFixTextHelper.EmoteText();
        emoteText.state = parcel.readInt();
        emoteText.emote = (EmoteModel) parcel.readParcelable(EmoteModel.class.getClassLoader());
        emoteText.text = parcel.readString();
        emoteText.emoji = parcel.readString();
        return emoteText;
    }

    @Override // android.os.Parcelable.Creator
    public final EmoteFixTextHelper.EmoteText[] newArray(int i) {
        return new EmoteFixTextHelper.EmoteText[i];
    }
}

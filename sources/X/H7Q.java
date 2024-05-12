package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.tools.sticker.core.text.model.TTSVoiceStruct;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class H7Q implements Parcelable.Creator<TTSVoiceStruct> {
    @Override // android.os.Parcelable.Creator
    public final TTSVoiceStruct createFromParcel(Parcel parcel) {
        o.LJIIIZ(parcel, "parcel");
        return new TTSVoiceStruct(parcel.readString(), parcel.readString(), parcel.readString());
    }

    @Override // android.os.Parcelable.Creator
    public final TTSVoiceStruct[] newArray(int i) {
        return new TTSVoiceStruct[i];
    }
}

package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.effectcreatormobile.ckeapi.api.text.TextAlign;
import com.bytedance.effectcreatormobile.ckeapi.api.text.TextModel;
import com.bytedance.effectcreatormobile.ckeapi.api.text.TextStyle;
import kotlin.jvm.internal.o;

/* renamed from: X.aRj, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public class C93491aRj implements Parcelable.Creator<TextModel> {
    @Override // android.os.Parcelable.Creator
    public final TextModel createFromParcel(Parcel in) {
        o.LJIIIZ(in, "in");
        return new TextModel(in.readString(), in.readString(), in.readString(), (TextStyle) V0N.LJJJ(TextStyle.class, in.readString()), (TextAlign) V0N.LJJJ(TextAlign.class, in.readString()), in.readString());
    }

    @Override // android.os.Parcelable.Creator
    public final TextModel[] newArray(int i) {
        return new TextModel[i];
    }
}

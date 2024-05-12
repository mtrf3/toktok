package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.im.message.template.component.TextComponent;
import kotlin.jvm.internal.o;

/* renamed from: X.V2y, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C79108V2y implements Parcelable.Creator<TextComponent> {
    @Override // android.os.Parcelable.Creator
    public final TextComponent createFromParcel(Parcel parcel) {
        o.LJIIIZ(parcel, "parcel");
        return new TextComponent(parcel.readString());
    }

    @Override // android.os.Parcelable.Creator
    public final TextComponent[] newArray(int i) {
        return new TextComponent[i];
    }
}

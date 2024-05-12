package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.editSticker.text.bean.InlineRichTextStyle;
import kotlin.jvm.internal.o;

/* renamed from: X.Pm0, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C65424Pm0 implements Parcelable.Creator<InlineRichTextStyle> {
    @Override // android.os.Parcelable.Creator
    public final InlineRichTextStyle createFromParcel(Parcel parcel) {
        o.LJIIIZ(parcel, "parcel");
        return new InlineRichTextStyle(parcel.readString());
    }

    @Override // android.os.Parcelable.Creator
    public final InlineRichTextStyle[] newArray(int i) {
        return new InlineRichTextStyle[i];
    }
}

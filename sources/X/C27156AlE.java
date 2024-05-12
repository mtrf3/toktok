package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.RichTextExtraInfo;
import kotlin.jvm.internal.o;

/* renamed from: X.AlE, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C27156AlE implements Parcelable.Creator<RichTextExtraInfo> {
    @Override // android.os.Parcelable.Creator
    public final RichTextExtraInfo createFromParcel(Parcel parcel) {
        o.LJIIIZ(parcel, "parcel");
        return new RichTextExtraInfo(parcel.readString());
    }

    @Override // android.os.Parcelable.Creator
    public final RichTextExtraInfo[] newArray(int i) {
        return new RichTextExtraInfo[i];
    }
}

package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.rss.link.models.RssLinkParam;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class A77 implements Parcelable.Creator<RssLinkParam> {
    @Override // android.os.Parcelable.Creator
    public final RssLinkParam createFromParcel(Parcel parcel) {
        o.LJIIIZ(parcel, "parcel");
        return new RssLinkParam(parcel.readString(), parcel.readString());
    }

    @Override // android.os.Parcelable.Creator
    public final RssLinkParam[] newArray(int i) {
        return new RssLinkParam[i];
    }
}

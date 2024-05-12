package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.commerce.tools.music.context.CommerceToolsMusicContext;
import kotlin.jvm.internal.o;

/* renamed from: X.Gln, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C42479Gln implements Parcelable.Creator<CommerceToolsMusicContext> {
    @Override // android.os.Parcelable.Creator
    public final CommerceToolsMusicContext createFromParcel(Parcel parcel) {
        o.LJIIIZ(parcel, "parcel");
        parcel.readInt();
        return new CommerceToolsMusicContext();
    }

    @Override // android.os.Parcelable.Creator
    public final CommerceToolsMusicContext[] newArray(int i) {
        return new CommerceToolsMusicContext[i];
    }
}

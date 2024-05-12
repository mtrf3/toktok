package X;

import android.os.Parcel;
import com.ss.android.ugc.aweme.sticker.widget.AVRtlViewPager$SavedState;

/* renamed from: X.VfT, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public class C80307VfT implements InterfaceC10700bS<AVRtlViewPager$SavedState> {
    @Override // X.InterfaceC10700bS
    public final AVRtlViewPager$SavedState[] newArray(int i) {
        return new AVRtlViewPager$SavedState[i];
    }

    @Override // X.InterfaceC10700bS
    public final AVRtlViewPager$SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
        return new AVRtlViewPager$SavedState(parcel, classLoader);
    }
}

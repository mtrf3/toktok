package X;

import android.os.Parcel;
import com.ss.android.ugc.aweme.common.widget.VerticalViewPager$SavedState;

/* renamed from: X.Vny, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public class C80834Vny implements InterfaceC10700bS<VerticalViewPager$SavedState> {
    @Override // X.InterfaceC10700bS
    public final VerticalViewPager$SavedState[] newArray(int i) {
        return new VerticalViewPager$SavedState[i];
    }

    @Override // X.InterfaceC10700bS
    public final VerticalViewPager$SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
        return new VerticalViewPager$SavedState(parcel, classLoader);
    }
}

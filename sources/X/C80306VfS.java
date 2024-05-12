package X;

import android.os.Parcel;
import com.bytedance.touchpoint.ui.views.RtlViewPager$SavedState;

/* renamed from: X.VfS, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public class C80306VfS implements InterfaceC10700bS<RtlViewPager$SavedState> {
    @Override // X.InterfaceC10700bS
    public final RtlViewPager$SavedState[] newArray(int i) {
        return new RtlViewPager$SavedState[i];
    }

    @Override // X.InterfaceC10700bS
    public final RtlViewPager$SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
        return new RtlViewPager$SavedState(parcel, classLoader);
    }
}

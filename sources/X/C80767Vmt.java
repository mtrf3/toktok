package X;

import android.os.Parcel;
import dmt.viewpager.DmtRtlViewPager$SavedState;

/* renamed from: X.Vmt, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public class C80767Vmt implements InterfaceC10700bS<DmtRtlViewPager$SavedState> {
    @Override // X.InterfaceC10700bS
    public final DmtRtlViewPager$SavedState[] newArray(int i) {
        return new DmtRtlViewPager$SavedState[i];
    }

    @Override // X.InterfaceC10700bS
    public final DmtRtlViewPager$SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
        return new DmtRtlViewPager$SavedState(parcel, classLoader);
    }
}

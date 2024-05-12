package X;

import android.os.Parcel;
import com.bytedance.android.livesdk.liveroom.LiveVerticalViewPager$SavedState;

/* renamed from: X.Vnx, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public class C80833Vnx implements InterfaceC10700bS<LiveVerticalViewPager$SavedState> {
    @Override // X.InterfaceC10700bS
    public final LiveVerticalViewPager$SavedState[] newArray(int i) {
        return new LiveVerticalViewPager$SavedState[i];
    }

    @Override // X.InterfaceC10700bS
    public final LiveVerticalViewPager$SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
        return new LiveVerticalViewPager$SavedState(parcel, classLoader);
    }
}

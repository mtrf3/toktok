package X;

import android.os.Parcel;
import com.ss.android.ugc.aweme.dsp.widget.vvpager.MDVerticalViewPager$SavedState;
import kotlin.jvm.internal.o;

/* renamed from: X.ZtM, reason: case insensitive filesystem */
/* loaded from: classes22.dex */
public final class C91360ZtM implements InterfaceC10700bS<MDVerticalViewPager$SavedState> {
    @Override // X.InterfaceC10700bS
    public final MDVerticalViewPager$SavedState[] newArray(int i) {
        return new MDVerticalViewPager$SavedState[i];
    }

    @Override // X.InterfaceC10700bS
    public final MDVerticalViewPager$SavedState createFromParcel(Parcel in, ClassLoader loader) {
        o.LJIIIZ(in, "in");
        o.LJIIIZ(loader, "loader");
        return new MDVerticalViewPager$SavedState(in, loader);
    }
}

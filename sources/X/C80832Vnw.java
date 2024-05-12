package X;

import android.os.Parcel;
import com.ss.android.ugc.aweme.kids.commonfeed.ui.widget.VerticalViewPager$SavedState;
import kotlin.jvm.internal.o;

/* renamed from: X.Vnw, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C80832Vnw implements InterfaceC10700bS<VerticalViewPager$SavedState> {
    @Override // X.InterfaceC10700bS
    public final VerticalViewPager$SavedState[] newArray(int i) {
        return new VerticalViewPager$SavedState[i];
    }

    @Override // X.InterfaceC10700bS
    public final VerticalViewPager$SavedState createFromParcel(Parcel in, ClassLoader loader) {
        o.LJIIIZ(in, "in");
        o.LJIIIZ(loader, "loader");
        return new VerticalViewPager$SavedState(in, loader);
    }
}

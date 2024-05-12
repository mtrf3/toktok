package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.tablet.impl.business.bookmode.split.DrawerLayout;
import kotlin.jvm.internal.o;

/* renamed from: X.VmE, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C80726VmE implements Parcelable.ClassLoaderCreator<DrawerLayout.SavedState> {
    public static DrawerLayout.SavedState[] LIZ(int i) {
        return LIZ(i);
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel in) {
        o.LJIIIZ(in, "in");
        return new DrawerLayout.SavedState(in, null);
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        return LIZ(i);
    }

    @Override // android.os.Parcelable.ClassLoaderCreator
    public final DrawerLayout.SavedState createFromParcel(Parcel in, ClassLoader loader) {
        o.LJIIIZ(in, "in");
        o.LJIIIZ(loader, "loader");
        return new DrawerLayout.SavedState(in, loader);
    }
}

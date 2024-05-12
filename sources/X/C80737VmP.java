package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.tux.sheet.sidesheet.SavedState;
import kotlin.jvm.internal.o;

/* renamed from: X.VmP, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C80737VmP implements Parcelable.ClassLoaderCreator<SavedState> {
    public static SavedState[] LIZ(int i) {
        return LIZ(i);
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel source) {
        o.LJIIIZ(source, "source");
        return new SavedState(source, (ClassLoader) null);
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        return LIZ(i);
    }

    @Override // android.os.Parcelable.ClassLoaderCreator
    public final SavedState createFromParcel(Parcel source, ClassLoader classLoader) {
        o.LJIIIZ(source, "source");
        return new SavedState(source, classLoader);
    }
}

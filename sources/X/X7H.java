package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.flow.PageSession;
import com.ss.android.ugc.aweme.flow.Stage;
import kotlin.jvm.internal.o;

/* JADX INFO: Add missing generic type declarations: [T] */
/* loaded from: classes16.dex */
public final class X7H<T> implements Parcelable.Creator<Stage<T>> {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        o.LJIIIZ(parcel, "parcel");
        return new Stage((PageSession) parcel.readParcelable(Stage.class.getClassLoader()));
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        return new Stage[i];
    }
}

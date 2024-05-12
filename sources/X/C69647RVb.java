package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.im.message.template.component.TTLComponent;
import kotlin.jvm.internal.o;

/* renamed from: X.RVb, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C69647RVb implements Parcelable.Creator<TTLComponent> {
    @Override // android.os.Parcelable.Creator
    public final TTLComponent createFromParcel(Parcel parcel) {
        o.LJIIIZ(parcel, "parcel");
        return new TTLComponent(parcel.readLong());
    }

    @Override // android.os.Parcelable.Creator
    public final TTLComponent[] newArray(int i) {
        return new TTLComponent[i];
    }
}

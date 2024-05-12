package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.im.message.template.component.BaseRequestComponent;
import com.ss.android.ugc.aweme.im.message.template.component.QueryDataComponent;
import kotlin.jvm.internal.o;

/* renamed from: X.Oll, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C62861Oll implements Parcelable.Creator<BaseRequestComponent> {
    @Override // android.os.Parcelable.Creator
    public final BaseRequestComponent createFromParcel(Parcel parcel) {
        o.LJIIIZ(parcel, "parcel");
        return new BaseRequestComponent(QueryDataComponent.CREATOR.createFromParcel(parcel));
    }

    @Override // android.os.Parcelable.Creator
    public final BaseRequestComponent[] newArray(int i) {
        return new BaseRequestComponent[i];
    }
}

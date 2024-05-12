package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.im.message.template.component.ActionLinkComponent;
import com.ss.android.ugc.aweme.im.message.template.component.ActionLinkType;
import kotlin.jvm.internal.o;

/* renamed from: X.OlP, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C62839OlP implements Parcelable.Creator<ActionLinkComponent> {
    @Override // android.os.Parcelable.Creator
    public final ActionLinkComponent createFromParcel(Parcel parcel) {
        o.LJIIIZ(parcel, "parcel");
        return new ActionLinkComponent(parcel.createStringArrayList(), ActionLinkType.CREATOR.createFromParcel(parcel), parcel.readString());
    }

    @Override // android.os.Parcelable.Creator
    public final ActionLinkComponent[] newArray(int i) {
        return new ActionLinkComponent[i];
    }
}

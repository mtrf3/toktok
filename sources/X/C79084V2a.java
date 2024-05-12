package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.im.message.template.component.ActionLinkComponent;
import com.ss.android.ugc.aweme.im.message.template.component.ButtonComponent;
import com.ss.android.ugc.aweme.im.message.template.component.TextComponent;
import kotlin.jvm.internal.o;

/* renamed from: X.V2a, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C79084V2a implements Parcelable.Creator<ButtonComponent> {
    @Override // android.os.Parcelable.Creator
    public final ButtonComponent createFromParcel(Parcel parcel) {
        o.LJIIIZ(parcel, "parcel");
        return new ButtonComponent(TextComponent.CREATOR.createFromParcel(parcel), ActionLinkComponent.CREATOR.createFromParcel(parcel));
    }

    @Override // android.os.Parcelable.Creator
    public final ButtonComponent[] newArray(int i) {
        return new ButtonComponent[i];
    }
}

package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.im.message.template.component.ActionLinkComponent;
import com.ss.android.ugc.aweme.im.message.template.component.FallbackInfoComponent;
import com.ss.android.ugc.aweme.im.message.template.component.ImageComponent;
import com.ss.android.ugc.aweme.im.message.template.component.TextComponent;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class V2Y implements Parcelable.Creator<FallbackInfoComponent> {
    @Override // android.os.Parcelable.Creator
    public final FallbackInfoComponent createFromParcel(Parcel parcel) {
        TextComponent createFromParcel;
        ActionLinkComponent createFromParcel2;
        o.LJIIIZ(parcel, "parcel");
        ImageComponent imageComponent = null;
        if (parcel.readInt() == 0) {
            createFromParcel = null;
        } else {
            createFromParcel = TextComponent.CREATOR.createFromParcel(parcel);
        }
        TextComponent textComponent = createFromParcel;
        if (parcel.readInt() == 0) {
            createFromParcel2 = null;
        } else {
            createFromParcel2 = ActionLinkComponent.CREATOR.createFromParcel(parcel);
        }
        ActionLinkComponent actionLinkComponent = createFromParcel2;
        if (parcel.readInt() != 0) {
            imageComponent = ImageComponent.CREATOR.createFromParcel(parcel);
        }
        return new FallbackInfoComponent(actionLinkComponent, imageComponent, textComponent);
    }

    @Override // android.os.Parcelable.Creator
    public final FallbackInfoComponent[] newArray(int i) {
        return new FallbackInfoComponent[i];
    }
}

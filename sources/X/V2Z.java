package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.im.message.template.component.ActionLinkComponent;
import com.ss.android.ugc.aweme.im.message.template.component.BaseUserComponent;
import com.ss.android.ugc.aweme.im.message.template.component.ImageComponent;
import com.ss.android.ugc.aweme.im.message.template.component.TextComponent;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class V2Z implements Parcelable.Creator<BaseUserComponent> {
    @Override // android.os.Parcelable.Creator
    public final BaseUserComponent createFromParcel(Parcel parcel) {
        Long valueOf;
        TextComponent createFromParcel;
        TextComponent createFromParcel2;
        ImageComponent createFromParcel3;
        TextComponent createFromParcel4;
        Integer valueOf2;
        boolean z;
        o.LJIIIZ(parcel, "parcel");
        Boolean bool = null;
        if (parcel.readInt() == 0) {
            valueOf = null;
        } else {
            valueOf = Long.valueOf(parcel.readLong());
        }
        if (parcel.readInt() == 0) {
            createFromParcel = null;
        } else {
            createFromParcel = TextComponent.CREATOR.createFromParcel(parcel);
        }
        TextComponent textComponent = createFromParcel;
        if (parcel.readInt() == 0) {
            createFromParcel2 = null;
        } else {
            createFromParcel2 = TextComponent.CREATOR.createFromParcel(parcel);
        }
        TextComponent textComponent2 = createFromParcel2;
        if (parcel.readInt() == 0) {
            createFromParcel3 = null;
        } else {
            createFromParcel3 = ImageComponent.CREATOR.createFromParcel(parcel);
        }
        ImageComponent imageComponent = createFromParcel3;
        ActionLinkComponent createFromParcel5 = ActionLinkComponent.CREATOR.createFromParcel(parcel);
        if (parcel.readInt() == 0) {
            createFromParcel4 = null;
        } else {
            createFromParcel4 = TextComponent.CREATOR.createFromParcel(parcel);
        }
        TextComponent textComponent3 = createFromParcel4;
        if (parcel.readInt() == 0) {
            valueOf2 = null;
        } else {
            valueOf2 = Integer.valueOf(parcel.readInt());
        }
        if (parcel.readInt() != 0) {
            if (parcel.readInt() != 0) {
                z = true;
            } else {
                z = false;
            }
            bool = Boolean.valueOf(z);
        }
        return new BaseUserComponent(valueOf, textComponent, textComponent2, imageComponent, createFromParcel5, textComponent3, valueOf2, bool);
    }

    @Override // android.os.Parcelable.Creator
    public final BaseUserComponent[] newArray(int i) {
        return new BaseUserComponent[i];
    }
}

package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.im.message.template.card.infocard.CardButtonType;
import com.ss.android.ugc.aweme.im.message.template.card.infocard.InfoCardButtonComponent;
import com.ss.android.ugc.aweme.im.message.template.component.ActionLinkComponent;
import com.ss.android.ugc.aweme.im.message.template.component.TextComponent;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class V3C implements Parcelable.Creator<InfoCardButtonComponent> {
    @Override // android.os.Parcelable.Creator
    public final InfoCardButtonComponent createFromParcel(Parcel parcel) {
        TextComponent createFromParcel;
        o.LJIIIZ(parcel, "parcel");
        Parcelable.Creator<TextComponent> creator = TextComponent.CREATOR;
        TextComponent createFromParcel2 = creator.createFromParcel(parcel);
        CardButtonType cardButtonType = null;
        if (parcel.readInt() == 0) {
            createFromParcel = null;
        } else {
            createFromParcel = creator.createFromParcel(parcel);
        }
        TextComponent textComponent = createFromParcel;
        ActionLinkComponent createFromParcel3 = ActionLinkComponent.CREATOR.createFromParcel(parcel);
        if (parcel.readInt() != 0) {
            cardButtonType = CardButtonType.CREATOR.createFromParcel(parcel);
        }
        return new InfoCardButtonComponent(createFromParcel2, textComponent, createFromParcel3, cardButtonType);
    }

    @Override // android.os.Parcelable.Creator
    public final InfoCardButtonComponent[] newArray(int i) {
        return new InfoCardButtonComponent[i];
    }
}

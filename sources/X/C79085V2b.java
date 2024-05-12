package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.im.message.template.card.imagecard.ImageCardTitleBar;
import com.ss.android.ugc.aweme.im.message.template.component.ButtonComponent;
import com.ss.android.ugc.aweme.im.message.template.component.ImageComponent;
import com.ss.android.ugc.aweme.im.message.template.component.TextComponent;
import kotlin.jvm.internal.o;

/* renamed from: X.V2b, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C79085V2b implements Parcelable.Creator<ImageCardTitleBar> {
    @Override // android.os.Parcelable.Creator
    public final ImageCardTitleBar createFromParcel(Parcel parcel) {
        ButtonComponent createFromParcel;
        o.LJIIIZ(parcel, "parcel");
        ImageComponent createFromParcel2 = ImageComponent.CREATOR.createFromParcel(parcel);
        Parcelable.Creator<TextComponent> creator = TextComponent.CREATOR;
        TextComponent createFromParcel3 = creator.createFromParcel(parcel);
        TextComponent createFromParcel4 = creator.createFromParcel(parcel);
        if (parcel.readInt() == 0) {
            createFromParcel = null;
        } else {
            createFromParcel = ButtonComponent.CREATOR.createFromParcel(parcel);
        }
        return new ImageCardTitleBar(createFromParcel2, createFromParcel3, createFromParcel4, createFromParcel);
    }

    @Override // android.os.Parcelable.Creator
    public final ImageCardTitleBar[] newArray(int i) {
        return new ImageCardTitleBar[i];
    }
}

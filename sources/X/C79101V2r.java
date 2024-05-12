package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.im.message.template.card.infocard.InfoCardTitleBarComponent;
import com.ss.android.ugc.aweme.im.message.template.component.ImageComponent;
import com.ss.android.ugc.aweme.im.message.template.component.TextComponent;
import kotlin.jvm.internal.o;

/* renamed from: X.V2r, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C79101V2r implements Parcelable.Creator<InfoCardTitleBarComponent> {
    @Override // android.os.Parcelable.Creator
    public final InfoCardTitleBarComponent createFromParcel(Parcel parcel) {
        ImageComponent createFromParcel;
        o.LJIIIZ(parcel, "parcel");
        TextComponent createFromParcel2 = TextComponent.CREATOR.createFromParcel(parcel);
        if (parcel.readInt() == 0) {
            createFromParcel = null;
        } else {
            createFromParcel = ImageComponent.CREATOR.createFromParcel(parcel);
        }
        return new InfoCardTitleBarComponent(createFromParcel2, createFromParcel);
    }

    @Override // android.os.Parcelable.Creator
    public final InfoCardTitleBarComponent[] newArray(int i) {
        return new InfoCardTitleBarComponent[i];
    }
}

package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.im.message.template.component.PreviewHintComponent;
import com.ss.android.ugc.aweme.im.message.template.component.QuotePicturePreviewComponent;
import com.ss.android.ugc.aweme.im.message.template.component.QuotePreviewTypeComponent;
import com.ss.android.ugc.aweme.im.message.template.component.TextComponent;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class V2U implements Parcelable.Creator<PreviewHintComponent> {
    @Override // android.os.Parcelable.Creator
    public final PreviewHintComponent createFromParcel(Parcel parcel) {
        QuotePreviewTypeComponent createFromParcel;
        o.LJIIIZ(parcel, "parcel");
        Parcelable.Creator<TextComponent> creator = TextComponent.CREATOR;
        TextComponent createFromParcel2 = creator.createFromParcel(parcel);
        TextComponent createFromParcel3 = creator.createFromParcel(parcel);
        TextComponent createFromParcel4 = creator.createFromParcel(parcel);
        QuotePicturePreviewComponent quotePicturePreviewComponent = null;
        if (parcel.readInt() == 0) {
            createFromParcel = null;
        } else {
            createFromParcel = QuotePreviewTypeComponent.CREATOR.createFromParcel(parcel);
        }
        QuotePreviewTypeComponent quotePreviewTypeComponent = createFromParcel;
        if (parcel.readInt() != 0) {
            quotePicturePreviewComponent = QuotePicturePreviewComponent.CREATOR.createFromParcel(parcel);
        }
        return new PreviewHintComponent(createFromParcel2, createFromParcel3, createFromParcel4, quotePreviewTypeComponent, quotePicturePreviewComponent);
    }

    @Override // android.os.Parcelable.Creator
    public final PreviewHintComponent[] newArray(int i) {
        return new PreviewHintComponent[i];
    }
}

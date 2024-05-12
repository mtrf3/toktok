package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.im.message.template.component.ActionLinkComponent;
import com.ss.android.ugc.aweme.im.message.template.component.IconTypeComponent;
import com.ss.android.ugc.aweme.im.message.template.component.ImageComponent;
import com.ss.android.ugc.aweme.im.message.template.component.PreviewIconTypeComponent;
import com.ss.android.ugc.aweme.im.message.template.component.QuotePicturePreviewComponent;
import com.ss.android.ugc.aweme.im.message.template.component.TTLComponent;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class V2E implements Parcelable.Creator<QuotePicturePreviewComponent> {
    @Override // android.os.Parcelable.Creator
    public final QuotePicturePreviewComponent createFromParcel(Parcel parcel) {
        Long valueOf;
        ImageComponent createFromParcel;
        IconTypeComponent createFromParcel2;
        PreviewIconTypeComponent createFromParcel3;
        ActionLinkComponent createFromParcel4;
        o.LJIIIZ(parcel, "parcel");
        String readString = parcel.readString();
        TTLComponent tTLComponent = null;
        if (parcel.readInt() == 0) {
            valueOf = null;
        } else {
            valueOf = Long.valueOf(parcel.readLong());
        }
        if (parcel.readInt() == 0) {
            createFromParcel = null;
        } else {
            createFromParcel = ImageComponent.CREATOR.createFromParcel(parcel);
        }
        ImageComponent imageComponent = createFromParcel;
        if (parcel.readInt() == 0) {
            createFromParcel2 = null;
        } else {
            createFromParcel2 = IconTypeComponent.CREATOR.createFromParcel(parcel);
        }
        IconTypeComponent iconTypeComponent = createFromParcel2;
        if (parcel.readInt() == 0) {
            createFromParcel3 = null;
        } else {
            createFromParcel3 = PreviewIconTypeComponent.CREATOR.createFromParcel(parcel);
        }
        PreviewIconTypeComponent previewIconTypeComponent = createFromParcel3;
        if (parcel.readInt() == 0) {
            createFromParcel4 = null;
        } else {
            createFromParcel4 = ActionLinkComponent.CREATOR.createFromParcel(parcel);
        }
        ActionLinkComponent actionLinkComponent = createFromParcel4;
        if (parcel.readInt() != 0) {
            tTLComponent = TTLComponent.CREATOR.createFromParcel(parcel);
        }
        return new QuotePicturePreviewComponent(readString, valueOf, imageComponent, iconTypeComponent, previewIconTypeComponent, actionLinkComponent, tTLComponent);
    }

    @Override // android.os.Parcelable.Creator
    public final QuotePicturePreviewComponent[] newArray(int i) {
        return new QuotePicturePreviewComponent[i];
    }
}

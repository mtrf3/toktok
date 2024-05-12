package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.im.message.template.component.ActionLinkComponent;
import com.ss.android.ugc.aweme.im.message.template.component.ImageComponent;
import com.ss.android.ugc.aweme.im.message.template.component.ResolutionComponent;
import com.ss.android.ugc.aweme.im.message.template.component.VideoCoverComponent;
import com.ss.android.ugc.aweme.im.message.template.component.VideoCoverType;
import kotlin.jvm.internal.o;

/* renamed from: X.V2s, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C79102V2s implements Parcelable.Creator<VideoCoverComponent> {
    @Override // android.os.Parcelable.Creator
    public final VideoCoverComponent createFromParcel(Parcel parcel) {
        ImageComponent createFromParcel;
        ImageComponent createFromParcel2;
        o.LJIIIZ(parcel, "parcel");
        ResolutionComponent resolutionComponent = null;
        if (parcel.readInt() == 0) {
            createFromParcel = null;
        } else {
            createFromParcel = ImageComponent.CREATOR.createFromParcel(parcel);
        }
        ImageComponent imageComponent = createFromParcel;
        String readString = parcel.readString();
        String readString2 = parcel.readString();
        VideoCoverType createFromParcel3 = VideoCoverType.CREATOR.createFromParcel(parcel);
        if (parcel.readInt() == 0) {
            createFromParcel2 = null;
        } else {
            createFromParcel2 = ImageComponent.CREATOR.createFromParcel(parcel);
        }
        ImageComponent imageComponent2 = createFromParcel2;
        ActionLinkComponent createFromParcel4 = ActionLinkComponent.CREATOR.createFromParcel(parcel);
        if (parcel.readInt() != 0) {
            resolutionComponent = ResolutionComponent.CREATOR.createFromParcel(parcel);
        }
        return new VideoCoverComponent(imageComponent, readString, readString2, createFromParcel3, imageComponent2, createFromParcel4, resolutionComponent);
    }

    @Override // android.os.Parcelable.Creator
    public final VideoCoverComponent[] newArray(int i) {
        return new VideoCoverComponent[i];
    }
}

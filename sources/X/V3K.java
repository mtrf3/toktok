package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.im.message.template.component.ActionLinkComponent;
import com.ss.android.ugc.aweme.im.message.template.component.ImageComponent;
import com.ss.android.ugc.aweme.im.message.template.component.PictureCardFallbackInfoComponent;
import com.ss.android.ugc.aweme.im.message.template.component.TextComponent;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class V3K implements Parcelable.Creator<PictureCardFallbackInfoComponent> {
    @Override // android.os.Parcelable.Creator
    public final PictureCardFallbackInfoComponent createFromParcel(Parcel parcel) {
        o.LJIIIZ(parcel, "parcel");
        return new PictureCardFallbackInfoComponent(ActionLinkComponent.CREATOR.createFromParcel(parcel), ImageComponent.CREATOR.createFromParcel(parcel), TextComponent.CREATOR.createFromParcel(parcel));
    }

    @Override // android.os.Parcelable.Creator
    public final PictureCardFallbackInfoComponent[] newArray(int i) {
        return new PictureCardFallbackInfoComponent[i];
    }
}

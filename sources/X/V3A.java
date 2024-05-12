package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.im.message.template.component.ActionLinkComponent;
import com.ss.android.ugc.aweme.im.message.template.component.ImageComponent;
import com.ss.android.ugc.aweme.im.message.template.component.TextComponent;
import com.ss.android.ugc.aweme.im.message.template.component.VideoCardFallbackInfoComponent;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class V3A implements Parcelable.Creator<VideoCardFallbackInfoComponent> {
    @Override // android.os.Parcelable.Creator
    public final VideoCardFallbackInfoComponent createFromParcel(Parcel parcel) {
        o.LJIIIZ(parcel, "parcel");
        return new VideoCardFallbackInfoComponent(ActionLinkComponent.CREATOR.createFromParcel(parcel), ImageComponent.CREATOR.createFromParcel(parcel), TextComponent.CREATOR.createFromParcel(parcel));
    }

    @Override // android.os.Parcelable.Creator
    public final VideoCardFallbackInfoComponent[] newArray(int i) {
        return new VideoCardFallbackInfoComponent[i];
    }
}

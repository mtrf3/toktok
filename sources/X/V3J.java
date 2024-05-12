package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.im.message.template.card.PictureCardTemplate;
import com.ss.android.ugc.aweme.im.message.template.component.ActionLinkComponent;
import com.ss.android.ugc.aweme.im.message.template.component.BaseRequestComponent;
import com.ss.android.ugc.aweme.im.message.template.component.BaseResponseComponent;
import com.ss.android.ugc.aweme.im.message.template.component.ImageComponent;
import com.ss.android.ugc.aweme.im.message.template.component.PictureCardFallbackInfoComponent;
import com.ss.android.ugc.aweme.im.message.template.component.PreviewHintComponent;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class V3J implements Parcelable.Creator<PictureCardTemplate> {
    @Override // android.os.Parcelable.Creator
    public final PictureCardTemplate createFromParcel(Parcel parcel) {
        o.LJIIIZ(parcel, "parcel");
        Parcelable.Creator<ImageComponent> creator = ImageComponent.CREATOR;
        return new PictureCardTemplate(creator.createFromParcel(parcel), creator.createFromParcel(parcel), PictureCardFallbackInfoComponent.CREATOR.createFromParcel(parcel), ActionLinkComponent.CREATOR.createFromParcel(parcel), PreviewHintComponent.CREATOR.createFromParcel(parcel), BaseRequestComponent.CREATOR.createFromParcel(parcel), BaseResponseComponent.CREATOR.createFromParcel(parcel));
    }

    @Override // android.os.Parcelable.Creator
    public final PictureCardTemplate[] newArray(int i) {
        return new PictureCardTemplate[i];
    }
}

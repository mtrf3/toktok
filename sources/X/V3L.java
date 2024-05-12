package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.im.message.template.card.StickerTemplate;
import com.ss.android.ugc.aweme.im.message.template.component.BaseRequestComponent;
import com.ss.android.ugc.aweme.im.message.template.component.BaseResponseComponent;
import com.ss.android.ugc.aweme.im.message.template.component.ImageComponent;
import com.ss.android.ugc.aweme.im.message.template.component.PreviewHintComponent;
import com.ss.android.ugc.aweme.im.message.template.component.StickerCardFallbackInfoComponent;
import com.ss.android.ugc.aweme.im.message.template.component.UserInfoComponent;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class V3L implements Parcelable.Creator<StickerTemplate> {
    @Override // android.os.Parcelable.Creator
    public final StickerTemplate createFromParcel(Parcel parcel) {
        UserInfoComponent createFromParcel;
        o.LJIIIZ(parcel, "parcel");
        ImageComponent createFromParcel2 = ImageComponent.CREATOR.createFromParcel(parcel);
        StickerCardFallbackInfoComponent createFromParcel3 = StickerCardFallbackInfoComponent.CREATOR.createFromParcel(parcel);
        if (parcel.readInt() == 0) {
            createFromParcel = null;
        } else {
            createFromParcel = UserInfoComponent.CREATOR.createFromParcel(parcel);
        }
        return new StickerTemplate(createFromParcel2, createFromParcel3, createFromParcel, PreviewHintComponent.CREATOR.createFromParcel(parcel), BaseRequestComponent.CREATOR.createFromParcel(parcel), BaseResponseComponent.CREATOR.createFromParcel(parcel));
    }

    @Override // android.os.Parcelable.Creator
    public final StickerTemplate[] newArray(int i) {
        return new StickerTemplate[i];
    }
}

package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.im.message.template.card.VideoCardTemplate;
import com.ss.android.ugc.aweme.im.message.template.component.BaseRequestComponent;
import com.ss.android.ugc.aweme.im.message.template.component.BaseResponseComponent;
import com.ss.android.ugc.aweme.im.message.template.component.PreviewHintComponent;
import com.ss.android.ugc.aweme.im.message.template.component.VideoCardFallbackInfoComponent;
import com.ss.android.ugc.aweme.im.message.template.component.VideoCoverComponent;
import kotlin.jvm.internal.o;

/* renamed from: X.V2u, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C79104V2u implements Parcelable.Creator<VideoCardTemplate> {
    @Override // android.os.Parcelable.Creator
    public final VideoCardTemplate createFromParcel(Parcel parcel) {
        o.LJIIIZ(parcel, "parcel");
        return new VideoCardTemplate(VideoCoverComponent.CREATOR.createFromParcel(parcel), VideoCardFallbackInfoComponent.CREATOR.createFromParcel(parcel), PreviewHintComponent.CREATOR.createFromParcel(parcel), BaseRequestComponent.CREATOR.createFromParcel(parcel), BaseResponseComponent.CREATOR.createFromParcel(parcel));
    }

    @Override // android.os.Parcelable.Creator
    public final VideoCardTemplate[] newArray(int i) {
        return new VideoCardTemplate[i];
    }
}

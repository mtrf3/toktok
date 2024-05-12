package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.im.message.template.card.AwemeCardTemplate;
import com.ss.android.ugc.aweme.im.message.template.component.BaseRequestComponent;
import com.ss.android.ugc.aweme.im.message.template.component.BaseResponseComponent;
import com.ss.android.ugc.aweme.im.message.template.component.BaseUserComponent;
import com.ss.android.ugc.aweme.im.message.template.component.PreviewHintComponent;
import com.ss.android.ugc.aweme.im.message.template.component.VideoCardFallbackInfoComponent;
import com.ss.android.ugc.aweme.im.message.template.component.VideoCoverComponent;
import kotlin.jvm.internal.o;

/* renamed from: X.V2t, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C79103V2t implements Parcelable.Creator<AwemeCardTemplate> {
    @Override // android.os.Parcelable.Creator
    public final AwemeCardTemplate createFromParcel(Parcel parcel) {
        o.LJIIIZ(parcel, "parcel");
        return new AwemeCardTemplate(VideoCoverComponent.CREATOR.createFromParcel(parcel), VideoCardFallbackInfoComponent.CREATOR.createFromParcel(parcel), BaseUserComponent.CREATOR.createFromParcel(parcel), PreviewHintComponent.CREATOR.createFromParcel(parcel), BaseRequestComponent.CREATOR.createFromParcel(parcel), BaseResponseComponent.CREATOR.createFromParcel(parcel));
    }

    @Override // android.os.Parcelable.Creator
    public final AwemeCardTemplate[] newArray(int i) {
        return new AwemeCardTemplate[i];
    }
}

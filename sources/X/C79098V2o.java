package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.im.message.template.card.DynamicCardTemplate;
import com.ss.android.ugc.aweme.im.message.template.card.dynamic.DynamicInfoComponent;
import com.ss.android.ugc.aweme.im.message.template.component.BaseRequestComponent;
import com.ss.android.ugc.aweme.im.message.template.component.BaseResponseComponent;
import com.ss.android.ugc.aweme.im.message.template.component.FallbackInfoComponent;
import com.ss.android.ugc.aweme.im.message.template.component.PreviewHintComponent;
import kotlin.jvm.internal.o;

/* renamed from: X.V2o, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C79098V2o implements Parcelable.Creator<DynamicCardTemplate> {
    @Override // android.os.Parcelable.Creator
    public final DynamicCardTemplate createFromParcel(Parcel parcel) {
        DynamicInfoComponent createFromParcel;
        o.LJIIIZ(parcel, "parcel");
        FallbackInfoComponent fallbackInfoComponent = null;
        if (parcel.readInt() == 0) {
            createFromParcel = null;
        } else {
            createFromParcel = DynamicInfoComponent.CREATOR.createFromParcel(parcel);
        }
        DynamicInfoComponent dynamicInfoComponent = createFromParcel;
        if (parcel.readInt() != 0) {
            fallbackInfoComponent = FallbackInfoComponent.CREATOR.createFromParcel(parcel);
        }
        return new DynamicCardTemplate(dynamicInfoComponent, fallbackInfoComponent, PreviewHintComponent.CREATOR.createFromParcel(parcel), BaseResponseComponent.CREATOR.createFromParcel(parcel), BaseRequestComponent.CREATOR.createFromParcel(parcel));
    }

    @Override // android.os.Parcelable.Creator
    public final DynamicCardTemplate[] newArray(int i) {
        return new DynamicCardTemplate[i];
    }
}

package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.im.message.template.card.InteractiveNoticeTemplate;
import com.ss.android.ugc.aweme.im.message.template.component.BaseRequestComponent;
import com.ss.android.ugc.aweme.im.message.template.component.BaseResponseComponent;
import com.ss.android.ugc.aweme.im.message.template.component.PreviewHintComponent;
import com.ss.android.ugc.aweme.im.message.template.component.TextComponent;
import kotlin.jvm.internal.o;

/* renamed from: X.V2p, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C79099V2p implements Parcelable.Creator<InteractiveNoticeTemplate> {
    @Override // android.os.Parcelable.Creator
    public final InteractiveNoticeTemplate createFromParcel(Parcel parcel) {
        TextComponent createFromParcel;
        TextComponent createFromParcel2;
        o.LJIIIZ(parcel, "parcel");
        TextComponent textComponent = null;
        if (parcel.readInt() == 0) {
            createFromParcel = null;
        } else {
            createFromParcel = TextComponent.CREATOR.createFromParcel(parcel);
        }
        TextComponent textComponent2 = createFromParcel;
        if (parcel.readInt() == 0) {
            createFromParcel2 = null;
        } else {
            createFromParcel2 = TextComponent.CREATOR.createFromParcel(parcel);
        }
        TextComponent textComponent3 = createFromParcel2;
        if (parcel.readInt() != 0) {
            textComponent = TextComponent.CREATOR.createFromParcel(parcel);
        }
        return new InteractiveNoticeTemplate(textComponent2, textComponent3, textComponent, parcel.readString(), PreviewHintComponent.CREATOR.createFromParcel(parcel), BaseRequestComponent.CREATOR.createFromParcel(parcel), BaseResponseComponent.CREATOR.createFromParcel(parcel));
    }

    @Override // android.os.Parcelable.Creator
    public final InteractiveNoticeTemplate[] newArray(int i) {
        return new InteractiveNoticeTemplate[i];
    }
}

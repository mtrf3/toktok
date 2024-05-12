package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.im.message.template.card.PortraitCardTemplate;
import com.ss.android.ugc.aweme.im.message.template.component.ActionLinkComponent;
import com.ss.android.ugc.aweme.im.message.template.component.BaseRequestComponent;
import com.ss.android.ugc.aweme.im.message.template.component.BaseResponseComponent;
import com.ss.android.ugc.aweme.im.message.template.component.BaseUserComponent;
import com.ss.android.ugc.aweme.im.message.template.component.ImageComponent;
import com.ss.android.ugc.aweme.im.message.template.component.PreviewHintComponent;
import com.ss.android.ugc.aweme.im.message.template.component.TextComponent;
import kotlin.jvm.internal.o;

/* renamed from: X.V2q, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C79100V2q implements Parcelable.Creator<PortraitCardTemplate> {
    @Override // android.os.Parcelable.Creator
    public final PortraitCardTemplate createFromParcel(Parcel parcel) {
        ImageComponent createFromParcel;
        BaseUserComponent createFromParcel2;
        TextComponent createFromParcel3;
        TextComponent createFromParcel4;
        TextComponent createFromParcel5;
        o.LJIIIZ(parcel, "parcel");
        ActionLinkComponent actionLinkComponent = null;
        if (parcel.readInt() == 0) {
            createFromParcel = null;
        } else {
            createFromParcel = ImageComponent.CREATOR.createFromParcel(parcel);
        }
        ImageComponent imageComponent = createFromParcel;
        if (parcel.readInt() == 0) {
            createFromParcel2 = null;
        } else {
            createFromParcel2 = BaseUserComponent.CREATOR.createFromParcel(parcel);
        }
        BaseUserComponent baseUserComponent = createFromParcel2;
        if (parcel.readInt() == 0) {
            createFromParcel3 = null;
        } else {
            createFromParcel3 = TextComponent.CREATOR.createFromParcel(parcel);
        }
        TextComponent textComponent = createFromParcel3;
        if (parcel.readInt() == 0) {
            createFromParcel4 = null;
        } else {
            createFromParcel4 = TextComponent.CREATOR.createFromParcel(parcel);
        }
        TextComponent textComponent2 = createFromParcel4;
        if (parcel.readInt() == 0) {
            createFromParcel5 = null;
        } else {
            createFromParcel5 = TextComponent.CREATOR.createFromParcel(parcel);
        }
        TextComponent textComponent3 = createFromParcel5;
        if (parcel.readInt() != 0) {
            actionLinkComponent = ActionLinkComponent.CREATOR.createFromParcel(parcel);
        }
        return new PortraitCardTemplate(imageComponent, baseUserComponent, textComponent, textComponent2, textComponent3, actionLinkComponent, PreviewHintComponent.CREATOR.createFromParcel(parcel), BaseResponseComponent.CREATOR.createFromParcel(parcel), BaseRequestComponent.CREATOR.createFromParcel(parcel));
    }

    @Override // android.os.Parcelable.Creator
    public final PortraitCardTemplate[] newArray(int i) {
        return new PortraitCardTemplate[i];
    }
}

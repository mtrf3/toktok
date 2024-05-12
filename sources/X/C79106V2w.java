package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.im.message.template.card.InfoCardTemplate;
import com.ss.android.ugc.aweme.im.message.template.card.infocard.InfoCardButtonComponent;
import com.ss.android.ugc.aweme.im.message.template.card.infocard.InfoCardContentComponent;
import com.ss.android.ugc.aweme.im.message.template.card.infocard.InfoCardTitleBarComponent;
import com.ss.android.ugc.aweme.im.message.template.component.ActionLinkComponent;
import com.ss.android.ugc.aweme.im.message.template.component.BaseRequestComponent;
import com.ss.android.ugc.aweme.im.message.template.component.BaseResponseComponent;
import com.ss.android.ugc.aweme.im.message.template.component.PreviewHintComponent;
import com.ss.android.ugc.aweme.im.message.template.component.VideoCoverComponent;
import java.util.ArrayList;
import kotlin.jvm.internal.o;

/* renamed from: X.V2w, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C79106V2w implements Parcelable.Creator<InfoCardTemplate> {
    @Override // android.os.Parcelable.Creator
    public final InfoCardTemplate createFromParcel(Parcel parcel) {
        InfoCardContentComponent createFromParcel;
        VideoCoverComponent createFromParcel2;
        o.LJIIIZ(parcel, "parcel");
        InfoCardTitleBarComponent createFromParcel3 = InfoCardTitleBarComponent.CREATOR.createFromParcel(parcel);
        ActionLinkComponent actionLinkComponent = null;
        if (parcel.readInt() == 0) {
            createFromParcel = null;
        } else {
            createFromParcel = InfoCardContentComponent.CREATOR.createFromParcel(parcel);
        }
        InfoCardContentComponent infoCardContentComponent = createFromParcel;
        if (parcel.readInt() == 0) {
            createFromParcel2 = null;
        } else {
            createFromParcel2 = VideoCoverComponent.CREATOR.createFromParcel(parcel);
        }
        VideoCoverComponent videoCoverComponent = createFromParcel2;
        int readInt = parcel.readInt();
        ArrayList arrayList = new ArrayList(readInt);
        int i = 0;
        while (i != readInt) {
            i = C279117r.LIZIZ(InfoCardButtonComponent.CREATOR, parcel, arrayList, i, 1);
        }
        if (parcel.readInt() != 0) {
            actionLinkComponent = ActionLinkComponent.CREATOR.createFromParcel(parcel);
        }
        return new InfoCardTemplate(createFromParcel3, infoCardContentComponent, videoCoverComponent, arrayList, actionLinkComponent, PreviewHintComponent.CREATOR.createFromParcel(parcel), BaseResponseComponent.CREATOR.createFromParcel(parcel), BaseRequestComponent.CREATOR.createFromParcel(parcel));
    }

    @Override // android.os.Parcelable.Creator
    public final InfoCardTemplate[] newArray(int i) {
        return new InfoCardTemplate[i];
    }
}

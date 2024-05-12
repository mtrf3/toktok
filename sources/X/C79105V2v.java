package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.im.message.template.card.ImageCardTemplate;
import com.ss.android.ugc.aweme.im.message.template.card.imagecard.ImageCardTitleBar;
import com.ss.android.ugc.aweme.im.message.template.component.ActionLinkComponent;
import com.ss.android.ugc.aweme.im.message.template.component.BaseRequestComponent;
import com.ss.android.ugc.aweme.im.message.template.component.BaseResponseComponent;
import com.ss.android.ugc.aweme.im.message.template.component.PreviewHintComponent;
import com.ss.android.ugc.aweme.im.message.template.component.VideoCoverComponent;
import java.util.ArrayList;
import kotlin.jvm.internal.o;

/* renamed from: X.V2v, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C79105V2v implements Parcelable.Creator<ImageCardTemplate> {
    @Override // android.os.Parcelable.Creator
    public final ImageCardTemplate createFromParcel(Parcel parcel) {
        o.LJIIIZ(parcel, "parcel");
        ImageCardTitleBar createFromParcel = ImageCardTitleBar.CREATOR.createFromParcel(parcel);
        ActionLinkComponent createFromParcel2 = ActionLinkComponent.CREATOR.createFromParcel(parcel);
        int readInt = parcel.readInt();
        ArrayList arrayList = new ArrayList(readInt);
        int i = 0;
        while (i != readInt) {
            i = C279117r.LIZIZ(VideoCoverComponent.CREATOR, parcel, arrayList, i, 1);
        }
        return new ImageCardTemplate(createFromParcel, createFromParcel2, arrayList, PreviewHintComponent.CREATOR.createFromParcel(parcel), BaseResponseComponent.CREATOR.createFromParcel(parcel), BaseRequestComponent.CREATOR.createFromParcel(parcel));
    }

    @Override // android.os.Parcelable.Creator
    public final ImageCardTemplate[] newArray(int i) {
        return new ImageCardTemplate[i];
    }
}

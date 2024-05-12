package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.im.message.template.card.botanswercard.BotAnswerCardItemComponent;
import com.ss.android.ugc.aweme.im.message.template.component.ImageComponent;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class SG2 implements Parcelable.Creator<BotAnswerCardItemComponent> {
    @Override // android.os.Parcelable.Creator
    public final BotAnswerCardItemComponent createFromParcel(Parcel parcel) {
        o.LJIIIZ(parcel, "parcel");
        long readLong = parcel.readLong();
        long readLong2 = parcel.readLong();
        Parcelable.Creator<ImageComponent> creator = ImageComponent.CREATOR;
        return new BotAnswerCardItemComponent(readLong, readLong2, creator.createFromParcel(parcel), creator.createFromParcel(parcel));
    }

    @Override // android.os.Parcelable.Creator
    public final BotAnswerCardItemComponent[] newArray(int i) {
        return new BotAnswerCardItemComponent[i];
    }
}

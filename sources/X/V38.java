package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.im.message.template.card.AnswerStatusComponent;
import com.ss.android.ugc.aweme.im.message.template.card.BotAnswerCardTemplate;
import com.ss.android.ugc.aweme.im.message.template.card.botanswercard.BotAnswerCardItemComponent;
import com.ss.android.ugc.aweme.im.message.template.component.ActionLinkComponent;
import com.ss.android.ugc.aweme.im.message.template.component.BaseRequestComponent;
import com.ss.android.ugc.aweme.im.message.template.component.BaseResponseComponent;
import com.ss.android.ugc.aweme.im.message.template.component.BaseUserComponent;
import com.ss.android.ugc.aweme.im.message.template.component.PreviewHintComponent;
import com.ss.android.ugc.aweme.im.message.template.component.TextComponent;
import java.util.ArrayList;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class V38 implements Parcelable.Creator<BotAnswerCardTemplate> {
    @Override // android.os.Parcelable.Creator
    public final BotAnswerCardTemplate createFromParcel(Parcel parcel) {
        Integer valueOf;
        ArrayList arrayList;
        TextComponent createFromParcel;
        o.LJIIIZ(parcel, "parcel");
        ArrayList arrayList2 = null;
        if (parcel.readInt() == 0) {
            valueOf = null;
        } else {
            valueOf = Integer.valueOf(parcel.readInt());
        }
        int readInt = parcel.readInt();
        ArrayList arrayList3 = new ArrayList(readInt);
        int i = 0;
        for (int i2 = 0; i2 != readInt; i2++) {
            arrayList3.add(Integer.valueOf(parcel.readInt()));
        }
        if (parcel.readInt() == 0) {
            arrayList = null;
        } else {
            int readInt2 = parcel.readInt();
            arrayList = new ArrayList(readInt2);
            int i3 = 0;
            while (i3 != readInt2) {
                i3 = C279117r.LIZIZ(ActionLinkComponent.CREATOR, parcel, arrayList, i3, 1);
            }
        }
        if (parcel.readInt() == 0) {
            createFromParcel = null;
        } else {
            createFromParcel = TextComponent.CREATOR.createFromParcel(parcel);
        }
        TextComponent textComponent = createFromParcel;
        if (parcel.readInt() != 0) {
            int readInt3 = parcel.readInt();
            arrayList2 = new ArrayList(readInt3);
            int i4 = 0;
            while (i4 != readInt3) {
                i4 = C279117r.LIZIZ(BotAnswerCardItemComponent.CREATOR, parcel, arrayList2, i4, 1);
            }
        }
        AnswerStatusComponent createFromParcel2 = AnswerStatusComponent.CREATOR.createFromParcel(parcel);
        int readInt4 = parcel.readInt();
        ArrayList arrayList4 = new ArrayList(readInt4);
        while (i != readInt4) {
            i = C279117r.LIZIZ(BaseUserComponent.CREATOR, parcel, arrayList4, i, 1);
        }
        return new BotAnswerCardTemplate(valueOf, arrayList3, arrayList, textComponent, arrayList2, createFromParcel2, arrayList4, PreviewHintComponent.CREATOR.createFromParcel(parcel), BaseRequestComponent.CREATOR.createFromParcel(parcel), BaseResponseComponent.CREATOR.createFromParcel(parcel));
    }

    @Override // android.os.Parcelable.Creator
    public final BotAnswerCardTemplate[] newArray(int i) {
        return new BotAnswerCardTemplate[i];
    }
}

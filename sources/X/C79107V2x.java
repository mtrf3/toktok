package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.im.message.template.card.infocard.InfoCardContentComponent;
import com.ss.android.ugc.aweme.im.message.template.component.TextComponent;
import java.util.ArrayList;
import kotlin.jvm.internal.o;

/* renamed from: X.V2x, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C79107V2x implements Parcelable.Creator<InfoCardContentComponent> {
    @Override // android.os.Parcelable.Creator
    public final InfoCardContentComponent createFromParcel(Parcel parcel) {
        o.LJIIIZ(parcel, "parcel");
        TextComponent createFromParcel = TextComponent.CREATOR.createFromParcel(parcel);
        int readInt = parcel.readInt();
        ArrayList arrayList = new ArrayList(readInt);
        int i = 0;
        while (i != readInt) {
            i = C279117r.LIZIZ(TextComponent.CREATOR, parcel, arrayList, i, 1);
        }
        return new InfoCardContentComponent(createFromParcel, arrayList);
    }

    @Override // android.os.Parcelable.Creator
    public final InfoCardContentComponent[] newArray(int i) {
        return new InfoCardContentComponent[i];
    }
}

package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.commerce.tools.common.CommerceToolsModel;
import com.ss.android.ugc.aweme.commerce.tools.mission.Mission;
import com.ss.android.ugc.aweme.commerce.tools.music.context.CommerceToolsMusicContext;
import com.ss.android.ugc.aweme.commerce.tools.music.model.CommerceToolsMusicModel;
import com.ss.android.ugc.aweme.commerce.tools.sticker.CommerceToolsStickerContext;
import com.ss.android.ugc.aweme.commerce.tools.sticker.IBEContext;
import com.ss.android.ugc.aweme.commerce.tools.tcm.CommerceToolsTcmModel;
import com.ss.android.ugc.aweme.shortvideo.AVChallenge;
import kotlin.jvm.internal.o;

/* renamed from: X.Gli, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C42474Gli implements Parcelable.Creator<CommerceToolsModel> {
    @Override // android.os.Parcelable.Creator
    public final CommerceToolsModel createFromParcel(Parcel parcel) {
        Mission createFromParcel;
        boolean z;
        o.LJIIIZ(parcel, "parcel");
        CommerceToolsTcmModel createFromParcel2 = CommerceToolsTcmModel.CREATOR.createFromParcel(parcel);
        if (parcel.readInt() == 0) {
            createFromParcel = null;
        } else {
            createFromParcel = Mission.CREATOR.createFromParcel(parcel);
        }
        Mission mission = createFromParcel;
        boolean z2 = false;
        if (parcel.readInt() != 0) {
            z = true;
        } else {
            z = false;
        }
        if (parcel.readInt() != 0) {
            z2 = true;
        }
        return new CommerceToolsModel(createFromParcel2, mission, z, z2, (AVChallenge) parcel.readParcelable(CommerceToolsModel.class.getClassLoader()), parcel.readInt(), CommerceToolsStickerContext.CREATOR.createFromParcel(parcel), CommerceToolsMusicModel.CREATOR.createFromParcel(parcel), CommerceToolsMusicContext.CREATOR.createFromParcel(parcel), IBEContext.CREATOR.createFromParcel(parcel));
    }

    @Override // android.os.Parcelable.Creator
    public final CommerceToolsModel[] newArray(int i) {
        return new CommerceToolsModel[i];
    }
}

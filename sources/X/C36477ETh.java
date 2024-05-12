package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.ugc.aweme.creation.base.InfoStickerConfigModel;
import kotlin.jvm.internal.o;

/* renamed from: X.ETh, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C36477ETh implements Parcelable.Creator<InfoStickerConfigModel> {
    @Override // android.os.Parcelable.Creator
    public final InfoStickerConfigModel createFromParcel(Parcel in) {
        o.LJIIIZ(in, "in");
        return new InfoStickerConfigModel(in.readString());
    }

    @Override // android.os.Parcelable.Creator
    public final InfoStickerConfigModel[] newArray(int i) {
        return new InfoStickerConfigModel[i];
    }
}

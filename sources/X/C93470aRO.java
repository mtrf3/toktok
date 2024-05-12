package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.effectcreatormobile.ckeapi.api.draft.CKEDraftInfo;
import com.bytedance.effectcreatormobile.ckeapi.api.draft.EffectHint;
import kotlin.jvm.internal.o;

/* renamed from: X.aRO, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public class C93470aRO implements Parcelable.Creator<CKEDraftInfo> {
    @Override // android.os.Parcelable.Creator
    public final CKEDraftInfo createFromParcel(Parcel in) {
        EffectHint effectHint;
        o.LJIIIZ(in, "in");
        String readString = in.readString();
        String readString2 = in.readString();
        String readString3 = in.readString();
        String readString4 = in.readString();
        String readString5 = in.readString();
        String readString6 = in.readString();
        String readString7 = in.readString();
        String readString8 = in.readString();
        String readString9 = in.readString();
        String readString10 = in.readString();
        String readString11 = in.readString();
        String readString12 = in.readString();
        int readInt = in.readInt();
        String readString13 = in.readString();
        if (in.readInt() != 0) {
            effectHint = EffectHint.CREATOR.createFromParcel(in);
        } else {
            effectHint = null;
        }
        return new CKEDraftInfo(readString, readString2, readString3, readString4, readString5, readString6, readString7, readString8, readString9, readString10, readString11, readString12, readInt, readString13, effectHint, in.readInt());
    }

    @Override // android.os.Parcelable.Creator
    public final CKEDraftInfo[] newArray(int i) {
        return new CKEDraftInfo[i];
    }
}

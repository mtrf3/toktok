package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.flow.CreationFlow;
import com.ss.android.ugc.aweme.flow.ExtraSession;
import kotlin.jvm.internal.o;

/* JADX INFO: Add missing generic type declarations: [INIT_PAGE_SESSION, INIT_STAGE] */
/* renamed from: X.ESg, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C36450ESg<INIT_PAGE_SESSION, INIT_STAGE> implements Parcelable.Creator<CreationFlow<INIT_STAGE, INIT_PAGE_SESSION>> {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        o.LJIIIZ(parcel, "parcel");
        return new CreationFlow(parcel.readString(), ExtraSession.CREATOR.createFromParcel(parcel));
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        return new CreationFlow[i];
    }
}

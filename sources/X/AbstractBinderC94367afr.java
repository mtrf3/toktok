package X;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.afr, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public abstract class AbstractBinderC94367afr extends BinderC93974aZW implements InterfaceC93987aZj {
    public AbstractBinderC94367afr() {
        super("com.google.android.play.core.install.protocol.IInstallServiceCallback");
    }

    @Override // X.BinderC93974aZW
    public final boolean LJLJI(Parcel parcel, int i) {
        Parcelable parcelable = null;
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    return false;
                }
                Parcelable.Creator creator = Bundle.CREATOR;
                if (parcel.readInt() != 0) {
                }
            } else {
                Parcelable.Creator creator2 = Bundle.CREATOR;
                if (parcel.readInt() != 0) {
                    parcelable = (Parcelable) creator2.createFromParcel(parcel);
                }
                LJJJJJL((Bundle) parcelable);
            }
        } else {
            Parcelable.Creator creator3 = Bundle.CREATOR;
            if (parcel.readInt() != 0) {
                parcelable = (Parcelable) creator3.createFromParcel(parcel);
            }
            LJJJJLL((Bundle) parcelable);
        }
        return true;
    }
}

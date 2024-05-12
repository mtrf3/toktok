package X;

import android.os.Parcel;
import com.google.android.gms.cast.MediaMetadata;
import com.google.android.gms.common.images.WebImage;

/* renamed from: X.Zhk, reason: case insensitive filesystem */
/* loaded from: classes29.dex */
public abstract class AbstractBinderC90640Zhk extends BinderC90358ZdC implements ZZ1 {
    public AbstractBinderC90640Zhk() {
        super("com.google.android.gms.cast.framework.media.IImagePicker");
    }

    @Override // X.BinderC90358ZdC
    public final boolean LJLJI(int i, Parcel parcel, Parcel parcel2) {
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        return false;
                    }
                    MediaMetadata mediaMetadata = (MediaMetadata) C90257ZbZ.LIZ(parcel, MediaMetadata.CREATOR);
                    ((BinderC90877ZlZ) this).LJLIL.getClass();
                    WebImage LIZ = C90117ZYj.LIZ(mediaMetadata);
                    parcel2.writeNoException();
                    if (LIZ == null) {
                        parcel2.writeInt(0);
                    } else {
                        parcel2.writeInt(1);
                        LIZ.writeToParcel(parcel2, 1);
                    }
                } else {
                    parcel2.writeNoException();
                    parcel2.writeInt(12451000);
                }
            } else {
                InterfaceC68163Qp5 LIZJ = ((BinderC90877ZlZ) this).LIZJ();
                parcel2.writeNoException();
                C90257ZbZ.LIZJ(parcel2, LIZJ);
            }
        } else {
            MediaMetadata mediaMetadata2 = (MediaMetadata) C90257ZbZ.LIZ(parcel, MediaMetadata.CREATOR);
            parcel.readInt();
            ((BinderC90877ZlZ) this).LJLIL.getClass();
            WebImage LIZ2 = C90117ZYj.LIZ(mediaMetadata2);
            parcel2.writeNoException();
            if (LIZ2 == null) {
                parcel2.writeInt(0);
            } else {
                parcel2.writeInt(1);
                LIZ2.writeToParcel(parcel2, 1);
            }
        }
        return true;
    }
}

package X;

import android.os.Parcel;

/* renamed from: X.Zk1, reason: case insensitive filesystem */
/* loaded from: classes29.dex */
public final class BinderC90781Zk1 extends BinderC90358ZdC {
    public final /* synthetic */ AsyncTaskC90782Zk2 LJLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BinderC90781Zk1(AsyncTaskC90782Zk2 asyncTaskC90782Zk2) {
        super("com.google.android.gms.cast.framework.media.internal.IFetchBitmapTaskProgressPublisher");
        this.LJLIL = asyncTaskC90782Zk2;
    }

    @Override // X.BinderC90358ZdC
    public final boolean LJLJI(int i, Parcel parcel, Parcel parcel2) {
        if (i != 1) {
            if (i != 2) {
                return false;
            }
            parcel2.writeNoException();
            parcel2.writeInt(12451000);
        } else {
            this.LJLIL.publishProgress(Long.valueOf(parcel.readLong()), Long.valueOf(parcel.readLong()));
            parcel2.writeNoException();
        }
        return true;
    }
}

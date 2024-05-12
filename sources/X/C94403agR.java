package X;

import android.os.IBinder;
import android.os.Parcel;
import com.google.vr.dynamite.client.INativeLibraryLoader;

/* renamed from: X.agR, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class C94403agR extends C93973aZV implements INativeLibraryLoader {
    public C94403agR(IBinder iBinder) {
        super(iBinder, "com.google.vr.dynamite.client.INativeLibraryLoader");
    }

    @Override // com.google.vr.dynamite.client.INativeLibraryLoader
    public final int checkVersion(String str) {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.LJLILLLLZI);
        obtain.writeString(str);
        Parcel LJLJI = LJLJI(obtain, 2);
        int readInt = LJLJI.readInt();
        LJLJI.recycle();
        return readInt;
    }

    @Override // com.google.vr.dynamite.client.INativeLibraryLoader
    public final long initializeAndLoadNativeLibrary(String str) {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.LJLILLLLZI);
        obtain.writeString(str);
        Parcel LJLJI = LJLJI(obtain, 1);
        long readLong = LJLJI.readLong();
        LJLJI.recycle();
        return readLong;
    }
}

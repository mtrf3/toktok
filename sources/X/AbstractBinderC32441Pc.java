package X;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import androidx.browser.customtabs.CustomTabsService;
import com.bytedance.vcloud.abrmodule.ABRConfig;

/* renamed from: X.1Pc, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractBinderC32441Pc extends Binder implements InterfaceC10090aT {
    public static final /* synthetic */ int LJLIL = 0;

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }

    public AbstractBinderC32441Pc() {
        attachInterface(this, "android.support.customtabs.ICustomTabsService");
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        android.net.Uri uri;
        if (i != 1598968902) {
            Bundle bundle = null;
            switch (i) {
                case 2:
                    parcel.enforceInterface("android.support.customtabs.ICustomTabsService");
                    boolean LLZLLIL = ((BinderC39931hV) this).LLZLLIL(parcel.readLong());
                    parcel2.writeNoException();
                    parcel2.writeInt(LLZLLIL ? 1 : 0);
                    return true;
                case 3:
                    parcel.enforceInterface("android.support.customtabs.ICustomTabsService");
                    boolean LLJI = ((BinderC39931hV) this).LLJI(AbstractBinderC32421Pa.LJLJI(parcel.readStrongBinder()), null);
                    parcel2.writeNoException();
                    parcel2.writeInt(LLJI ? 1 : 0);
                    return true;
                case 4:
                    parcel.enforceInterface("android.support.customtabs.ICustomTabsService");
                    InterfaceC10080aS LJLJI = AbstractBinderC32421Pa.LJLJI(parcel.readStrongBinder());
                    if (parcel.readInt() != 0) {
                        uri = (android.net.Uri) android.net.Uri.CREATOR.createFromParcel(parcel);
                    } else {
                        uri = null;
                    }
                    if (parcel.readInt() != 0) {
                        bundle = (Bundle) Bundle.CREATOR.createFromParcel(parcel);
                    }
                    boolean LLIIIL = ((BinderC39931hV) this).LLIIIL(LJLJI, uri, bundle, parcel.createTypedArrayList(Bundle.CREATOR));
                    parcel2.writeNoException();
                    parcel2.writeInt(LLIIIL ? 1 : 0);
                    return true;
                case 5:
                    parcel.enforceInterface("android.support.customtabs.ICustomTabsService");
                    parcel.readString();
                    if (parcel.readInt() != 0) {
                        Bundle.CREATOR.createFromParcel(parcel);
                    }
                    Bundle LIZ = ((BinderC39931hV) this).LJLILLLLZI.LIZ();
                    parcel2.writeNoException();
                    if (LIZ != null) {
                        parcel2.writeInt(1);
                        LIZ.writeToParcel(parcel2, 1);
                    } else {
                        parcel2.writeInt(0);
                    }
                    return true;
                case 6:
                    parcel.enforceInterface("android.support.customtabs.ICustomTabsService");
                    InterfaceC10080aS LJLJI2 = AbstractBinderC32421Pa.LJLJI(parcel.readStrongBinder());
                    if (parcel.readInt() != 0) {
                        bundle = (Bundle) Bundle.CREATOR.createFromParcel(parcel);
                    }
                    CustomTabsService customTabsService = ((BinderC39931hV) this).LJLILLLLZI;
                    new AnonymousClass009(LJLJI2, BinderC39931hV.LJLJI(bundle));
                    boolean LJI = customTabsService.LJI();
                    parcel2.writeNoException();
                    parcel2.writeInt(LJI ? 1 : 0);
                    return true;
                case 7:
                    parcel.enforceInterface("android.support.customtabs.ICustomTabsService");
                    InterfaceC10080aS LJLJI3 = AbstractBinderC32421Pa.LJLJI(parcel.readStrongBinder());
                    if (parcel.readInt() != 0) {
                        android.net.Uri.CREATOR.createFromParcel(parcel);
                    }
                    CustomTabsService customTabsService2 = ((BinderC39931hV) this).LJLILLLLZI;
                    new AnonymousClass009(LJLJI3, null);
                    boolean LJFF = customTabsService2.LJFF();
                    parcel2.writeNoException();
                    parcel2.writeInt(LJFF ? 1 : 0);
                    return true;
                case 8:
                    parcel.enforceInterface("android.support.customtabs.ICustomTabsService");
                    InterfaceC10080aS LJLJI4 = AbstractBinderC32421Pa.LJLJI(parcel.readStrongBinder());
                    parcel.readString();
                    if (parcel.readInt() != 0) {
                        bundle = (Bundle) Bundle.CREATOR.createFromParcel(parcel);
                    }
                    CustomTabsService customTabsService3 = ((BinderC39931hV) this).LJLILLLLZI;
                    new AnonymousClass009(LJLJI4, BinderC39931hV.LJLJI(bundle));
                    int LIZLLL = customTabsService3.LIZLLL();
                    parcel2.writeNoException();
                    parcel2.writeInt(LIZLLL);
                    return true;
                case 9:
                    parcel.enforceInterface("android.support.customtabs.ICustomTabsService");
                    InterfaceC10080aS LJLJI5 = AbstractBinderC32421Pa.LJLJI(parcel.readStrongBinder());
                    parcel.readInt();
                    if (parcel.readInt() != 0) {
                        android.net.Uri.CREATOR.createFromParcel(parcel);
                    }
                    if (parcel.readInt() != 0) {
                        bundle = (Bundle) Bundle.CREATOR.createFromParcel(parcel);
                    }
                    CustomTabsService customTabsService4 = ((BinderC39931hV) this).LJLILLLLZI;
                    new AnonymousClass009(LJLJI5, BinderC39931hV.LJLJI(bundle));
                    boolean LJII = customTabsService4.LJII();
                    parcel2.writeNoException();
                    parcel2.writeInt(LJII ? 1 : 0);
                    return true;
                case 10:
                    parcel.enforceInterface("android.support.customtabs.ICustomTabsService");
                    InterfaceC10080aS LJLJI6 = AbstractBinderC32421Pa.LJLJI(parcel.readStrongBinder());
                    if (parcel.readInt() != 0) {
                        bundle = (Bundle) Bundle.CREATOR.createFromParcel(parcel);
                    }
                    boolean LLJI2 = ((BinderC39931hV) this).LLJI(LJLJI6, BinderC39931hV.LJLJI(bundle));
                    parcel2.writeNoException();
                    parcel2.writeInt(LLJI2 ? 1 : 0);
                    return true;
                case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                    parcel.enforceInterface("android.support.customtabs.ICustomTabsService");
                    InterfaceC10080aS LJLJI7 = AbstractBinderC32421Pa.LJLJI(parcel.readStrongBinder());
                    if (parcel.readInt() != 0) {
                        android.net.Uri.CREATOR.createFromParcel(parcel);
                    }
                    if (parcel.readInt() != 0) {
                        bundle = (Bundle) Bundle.CREATOR.createFromParcel(parcel);
                    }
                    CustomTabsService customTabsService5 = ((BinderC39931hV) this).LJLILLLLZI;
                    new AnonymousClass009(LJLJI7, BinderC39931hV.LJLJI(bundle));
                    boolean LJFF2 = customTabsService5.LJFF();
                    parcel2.writeNoException();
                    parcel2.writeInt(LJFF2 ? 1 : 0);
                    return true;
                case 12:
                    parcel.enforceInterface("android.support.customtabs.ICustomTabsService");
                    InterfaceC10080aS LJLJI8 = AbstractBinderC32421Pa.LJLJI(parcel.readStrongBinder());
                    if (parcel.readInt() != 0) {
                        android.net.Uri.CREATOR.createFromParcel(parcel);
                    }
                    parcel.readInt();
                    if (parcel.readInt() != 0) {
                        bundle = (Bundle) Bundle.CREATOR.createFromParcel(parcel);
                    }
                    CustomTabsService customTabsService6 = ((BinderC39931hV) this).LJLILLLLZI;
                    new AnonymousClass009(LJLJI8, BinderC39931hV.LJLJI(bundle));
                    boolean LJ = customTabsService6.LJ();
                    parcel2.writeNoException();
                    parcel2.writeInt(LJ ? 1 : 0);
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }
        parcel2.writeString("android.support.customtabs.ICustomTabsService");
        return true;
    }
}

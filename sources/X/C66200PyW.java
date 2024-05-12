package X;

import android.content.Intent;
import android.os.Build;
import android.os.Parcel;
import java.util.Iterator;
import kotlin.jvm.internal.o;

/* renamed from: X.PyW, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C66200PyW {
    public static final /* synthetic */ int LIZ = 0;

    public static boolean LIZ(String str, Parcel parcel, Parcel parcel2) {
        parcel.setDataPosition(0);
        parcel.enforceInterface(str);
        parcel.readStrongBinder();
        parcel.readStrongBinder();
        if (Build.VERSION.SDK_INT >= 26 && parcel.readInt() == 0) {
            return false;
        }
        Throwable th = new Throwable();
        Intent intent = (Intent) Intent.CREATOR.createFromParcel(parcel);
        Iterator<InterfaceC66203PyZ> it = C66199PyV.LIZ.iterator();
        while (it.hasNext()) {
            InterfaceC66203PyZ next = it.next();
            o.LJIIIIZZ(intent, "intent");
            next.LJ(intent, th);
        }
        return false;
    }

    public static boolean LIZIZ(String str, Parcel parcel, Parcel parcel2) {
        parcel.setDataPosition(0);
        parcel.enforceInterface(str);
        parcel.readStrongBinder();
        if (Build.VERSION.SDK_INT >= 26 && parcel.readInt() == 0) {
            return false;
        }
        Throwable th = new Throwable();
        Intent intent = (Intent) Intent.CREATOR.createFromParcel(parcel);
        Iterator<InterfaceC66203PyZ> it = C66199PyV.LIZ.iterator();
        while (it.hasNext()) {
            InterfaceC66203PyZ next = it.next();
            o.LJIIIIZZ(intent, "intent");
            next.LJFF(intent, th);
        }
        return false;
    }

    public static boolean LIZJ(String str, Parcel parcel, Parcel parcel2) {
        parcel.setDataPosition(0);
        parcel.enforceInterface(str);
        parcel.readStrongBinder();
        parcel.readString();
        if (Build.VERSION.SDK_INT >= 26 && parcel.readInt() == 0) {
            return false;
        }
        Throwable th = new Throwable();
        Intent intent = (Intent) Intent.CREATOR.createFromParcel(parcel);
        Iterator<InterfaceC66203PyZ> it = C66199PyV.LIZ.iterator();
        while (it.hasNext()) {
            InterfaceC66203PyZ next = it.next();
            o.LJIIIIZZ(intent, "intent");
            next.LJFF(intent, th);
        }
        return false;
    }

    public static boolean LIZLLL(String str, Parcel parcel, Parcel parcel2) {
        if (Build.VERSION.SDK_INT >= 24) {
            parcel.setDataPosition(0);
            parcel.enforceInterface(str);
            parcel.readStrongBinder();
            parcel.readStrongBinder();
            parcel.readInt();
            if (parcel.readInt() == 0) {
                return false;
            }
        }
        Throwable th = new Throwable();
        Intent intent = (Intent) Intent.CREATOR.createFromParcel(parcel);
        Iterator<InterfaceC66203PyZ> it = C66199PyV.LIZ.iterator();
        while (it.hasNext()) {
            InterfaceC66203PyZ next = it.next();
            o.LJIIIIZZ(intent, "intent");
            next.LIZLLL(intent, th);
        }
        return false;
    }

    public static boolean LJ(String str, Parcel parcel, Parcel parcel2) {
        parcel.setDataPosition(0);
        parcel.enforceInterface(str);
        parcel.readStrongBinder();
        parcel.readString();
        if (o.LJ(str, "android.app.IActivityTaskManager") && Build.VERSION.SDK_INT >= 30) {
            parcel.readString();
        }
        if (Build.VERSION.SDK_INT >= 26 && parcel.readInt() == 0) {
            return false;
        }
        Throwable th = new Throwable();
        Intent intent = (Intent) Intent.CREATOR.createFromParcel(parcel);
        Iterator<InterfaceC66203PyZ> it = C66199PyV.LIZ.iterator();
        while (it.hasNext()) {
            InterfaceC66203PyZ next = it.next();
            o.LJIIIIZZ(intent, "intent");
            if (next.LIZ(intent, th)) {
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("startActivity blocked ");
                LIZ2.append(intent);
                LIZ2.append(" by ");
                LIZ2.append(next);
                C66063PwJ.LIZJ("ActivityProcessor", X1D.LIZIZ(LIZ2), null);
                if (parcel2 != null) {
                    parcel2.writeNoException();
                    parcel2.writeInt(-1);
                }
                return true;
            }
        }
        return false;
    }

    public static boolean LJFF(String str, Parcel parcel, Parcel parcel2) {
        parcel.setDataPosition(0);
        parcel.enforceInterface(str);
        parcel.readStrongBinder();
        parcel.readString();
        if (o.LJ(str, "android.app.IActivityTaskManager") && Build.VERSION.SDK_INT >= 30) {
            parcel.readString();
        }
        if (Build.VERSION.SDK_INT >= 26 && parcel.readInt() == 0) {
            return false;
        }
        Throwable th = new Throwable();
        Intent intent = (Intent) Intent.CREATOR.createFromParcel(parcel);
        Iterator<InterfaceC66203PyZ> it = C66199PyV.LIZ.iterator();
        while (it.hasNext()) {
            InterfaceC66203PyZ next = it.next();
            o.LJIIIIZZ(intent, "intent");
            if (next.LIZ(intent, th)) {
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("startActivity blocked ");
                LIZ2.append(intent);
                LIZ2.append(" by ");
                LIZ2.append(next);
                LIZ2.append(' ');
                LIZ2.append(next.name());
                C66063PwJ.LIZJ("ActivityProcessor", X1D.LIZIZ(LIZ2), null);
                if (parcel2 != null) {
                    parcel2.writeNoException();
                    parcel2.writeInt(-1);
                }
                return true;
            }
        }
        return false;
    }

    public static boolean LJI(String str, Parcel parcel, Parcel parcel2) {
        parcel.setDataPosition(0);
        parcel.enforceInterface(str);
        parcel.readStrongBinder();
        if (Build.VERSION.SDK_INT >= 26 && parcel.readInt() == 0) {
            return false;
        }
        Throwable th = new Throwable();
        Intent intent = (Intent) Intent.CREATOR.createFromParcel(parcel);
        Iterator<InterfaceC66203PyZ> it = C66199PyV.LIZ.iterator();
        while (it.hasNext()) {
            InterfaceC66203PyZ next = it.next();
            o.LJIIIIZZ(intent, "intent");
            next.LJIIIZ(intent, th);
        }
        return false;
    }
}

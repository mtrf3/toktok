package X;

import android.content.AttributionSource;
import android.content.ContentProviderOperation;
import android.content.ContentValues;
import android.os.Build;
import android.os.Parcel;
import com.bytedance.helios.sdk.HeliosEnvImpl;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Iterator;
import kotlin.jvm.internal.o;

/* renamed from: X.PyU, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C66198PyU {
    public static final java.util.Map<String, Boolean> LIZ = new HashMap();

    public static android.net.Uri LIZ(Parcel parcel) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 31) {
            AttributionSource.CREATOR.createFromParcel(parcel);
            return (android.net.Uri) android.net.Uri.CREATOR.createFromParcel(parcel);
        }
        if (i == 30) {
            parcel.readString();
            parcel.readString();
            return (android.net.Uri) android.net.Uri.CREATOR.createFromParcel(parcel);
        }
        parcel.readString();
        return (android.net.Uri) android.net.Uri.CREATOR.createFromParcel(parcel);
    }

    public static boolean LIZJ(Parcel parcel) {
        String authority;
        android.net.Uri LIZ2 = LIZ(parcel);
        if (LIZ2 == null || (authority = LIZ2.getAuthority()) == null || authority.length() == 0 || C66074PwU.LIZ.LJFF.contains(authority)) {
            return false;
        }
        Boolean bool = (Boolean) ((HashMap) LIZ).get(authority);
        if (bool != null && !bool.booleanValue()) {
            return false;
        }
        ContentValues[] contentValuesArr = (ContentValues[]) parcel.createTypedArray(ContentValues.CREATOR);
        Throwable th = new Throwable();
        if (contentValuesArr != null) {
            Iterator<InterfaceC66203PyZ> it = C66199PyV.LIZ.iterator();
            while (it.hasNext()) {
                it.next().LIZIZ(LIZ2, contentValuesArr, th);
            }
        }
        return false;
    }

    public static boolean LIZLLL(Parcel parcel) {
        String authority;
        android.net.Uri LIZ2 = LIZ(parcel);
        if (LIZ2 == null || (authority = LIZ2.getAuthority()) == null || authority.length() == 0 || ((HashMap) LIZ).containsKey(authority) || C66074PwU.LIZ.LJFF.contains(authority)) {
            return false;
        }
        Throwable th = new Throwable();
        parcel.readBundle();
        Iterator<InterfaceC66203PyZ> it = C66199PyV.LIZ.iterator();
        while (it.hasNext()) {
            it.next().LJIIIIZZ(LIZ2, th);
        }
        return false;
    }

    public static boolean LJ(Parcel parcel) {
        String authority;
        android.net.Uri LIZ2 = LIZ(parcel);
        if (LIZ2 == null || (authority = LIZ2.getAuthority()) == null || authority.length() == 0 || C66074PwU.LIZ.LJFF.contains(authority)) {
            return false;
        }
        Boolean bool = (Boolean) ((HashMap) LIZ).get(authority);
        if (bool != null && !bool.booleanValue()) {
            return false;
        }
        Throwable th = new Throwable();
        ContentValues cv = (ContentValues) ContentValues.CREATOR.createFromParcel(parcel);
        Iterator<InterfaceC66203PyZ> it = C66199PyV.LIZ.iterator();
        while (it.hasNext()) {
            InterfaceC66203PyZ next = it.next();
            o.LJIIIIZZ(cv, "cv");
            next.LIZJ(LIZ2, cv, th);
        }
        return false;
    }

    public static boolean LJI(Parcel parcel) {
        String authority;
        android.net.Uri LIZ2 = LIZ(parcel);
        if (LIZ2 == null || (authority = LIZ2.getAuthority()) == null || authority.length() == 0 || C66074PwU.LIZ.LJFF.contains(authority)) {
            return false;
        }
        Boolean bool = (Boolean) ((HashMap) LIZ).get(authority);
        if (bool != null && !bool.booleanValue()) {
            return false;
        }
        Throwable th = new Throwable();
        ContentValues cv = (ContentValues) ContentValues.CREATOR.createFromParcel(parcel);
        Iterator<InterfaceC66203PyZ> it = C66199PyV.LIZ.iterator();
        while (it.hasNext()) {
            InterfaceC66203PyZ next = it.next();
            o.LJIIIIZZ(cv, "cv");
            next.LJII(LIZ2, cv, th);
        }
        return false;
    }

    public static boolean LIZIZ(Method method, Parcel parcel, Parcel parcel2) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 31) {
            AttributionSource.CREATOR.createFromParcel(parcel);
            parcel.readString();
        } else if (i == 30) {
            parcel.readString();
            parcel.readString();
            parcel.readString();
        } else if (i == 29) {
            parcel.readString();
            parcel.readString();
        } else {
            parcel.readString();
        }
        int readInt = parcel.readInt();
        if (readInt >= 0) {
            int i2 = 0;
            while (true) {
                ContentProviderOperation op = (ContentProviderOperation) ContentProviderOperation.CREATOR.createFromParcel(parcel);
                o.LJIIIIZZ(op, "op");
                android.net.Uri uri = op.getUri();
                o.LJIIIIZZ(uri, "op.uri");
                String authority = uri.getAuthority();
                if (authority == null || authority.length() == 0 || C66074PwU.LIZ.LJFF.contains(authority)) {
                    return false;
                }
                Boolean bool = (Boolean) ((HashMap) LIZ).get(authority);
                if (bool != null && !bool.booleanValue()) {
                    return false;
                }
                if (C66146Pxe.LIZIZ.containsKey(authority)) {
                    return C66116PxA.LIZ("android.content.IContentProvider", method, parcel, parcel2, C03660Ck.LIZJ("parameters", authority));
                }
                Thread LLLLIIIILLL = C16880lQ.LLLLIIIILLL();
                o.LJIIIIZZ(LLLLIIIILLL, "Thread.currentThread()");
                String threadName = LLLLIIIILLL.getName();
                if (Build.VERSION.SDK_INT >= 23 && (op.isInsert() || op.isUpdate())) {
                    HeliosEnvImpl heliosEnvImpl = HeliosEnvImpl.get();
                    o.LJIIIIZZ(heliosEnvImpl, "HeliosEnvImpl.get()");
                    heliosEnvImpl.LJFF();
                    String valueOf = String.valueOf(op);
                    o.LJIIIIZZ(threadName, "threadName");
                    LJIIIZ("applyBatch", authority, valueOf, threadName, new Throwable("ContentProvider.applyBatch"));
                } else {
                    o.LJIIIIZZ(threadName, "threadName");
                    LJIIIIZZ("applyBatch", authority, threadName, new Throwable("ContentProvider.applyBatch"));
                }
                if (i2 == readInt) {
                    break;
                }
                i2++;
            }
        }
        return false;
    }

    public static boolean LJFF(Method method, Parcel parcel, Parcel parcel2) {
        String authority;
        android.net.Uri LIZ2 = LIZ(parcel);
        if (LIZ2 == null || (authority = LIZ2.getAuthority()) == null || authority.length() == 0 || ((HashMap) LIZ).containsKey(authority) || C66074PwU.LIZ.LJFF.contains(authority)) {
            return false;
        }
        if (C66146Pxe.LIZIZ.containsKey(authority)) {
            if (C66116PxA.LIZ("android.content.IContentProvider", method, parcel, parcel2, C03660Ck.LIZJ("parameters", authority))) {
                return true;
            }
        } else {
            Thread LLLLIIIILLL = C16880lQ.LLLLIIIILLL();
            o.LJIIIIZZ(LLLLIIIILLL, "Thread.currentThread()");
            String threadName = LLLLIIIILLL.getName();
            o.LJIIIIZZ(threadName, "threadName");
            LJIIIIZZ("query", authority, threadName, new Throwable("ContentProvider.query"));
        }
        Throwable th = new Throwable();
        Iterator<InterfaceC66203PyZ> it = C66199PyV.LIZ.iterator();
        while (it.hasNext()) {
            it.next().LJI(LIZ2, th);
        }
        return false;
    }

    public static void LJIIIIZZ(String str, String authority, String str2, Throwable th) {
        o.LJIIIZ(authority, "authority");
        if (C66074PwU.LIZ.LIZ) {
            LJII(str, authority, "", str2, "LinkStart", th);
        }
    }

    public static void LJIIIZ(String str, String authority, String str2, String str3, Throwable th) {
        o.LJIIIZ(authority, "authority");
        LJII(str, authority, str2, str3, "Sharing", th);
    }

    public static void LJII(String str, String str2, String str3, String str4, String str5, Throwable th) {
        C66201PyX c66201PyX = new C66201PyX(null);
        c66201PyX.LJLJI = str;
        c66201PyX.LJLILLLLZI = str5;
        PQ0 pq0 = PQ0.LJFF;
        o.LJIIIIZZ(pq0, "LifecycleMonitor.get()");
        c66201PyX.LJLJJI = PQ0.LIZLLL();
        String copyOnWriteArrayList = pq0.LIZ.toString();
        o.LJIIIIZZ(copyOnWriteArrayList, "LifecycleMonitor.get().activityStackString");
        c66201PyX.LJLJJL = copyOnWriteArrayList;
        String message = th.getMessage();
        o.LJI(message);
        c66201PyX.LJLJLJ = C37115EhT.LIZ(message, "com.bytedance.helios.binder", th);
        String LJIIJ = HeliosEnvImpl.get().LJIIJ();
        if (LJIIJ == null || LJIIJ.length() == 0) {
            LJIIJ = "null";
        }
        o.LJIIIZ(LJIIJ, "<set-?>");
        c66201PyX.LJLJLLL = LJIIJ;
        c66201PyX.LJLJJLL = str4;
        o.LJIIIZ(str2, "<set-?>");
        c66201PyX.LJLL = str2;
        c66201PyX.LJLLI = str3;
        int hashCode = str5.hashCode();
        if (hashCode != -576091972) {
            if (hashCode == 368586856 && str5.equals("LinkStart")) {
                c66201PyX.LJLLILLLL.add(str5);
                c66201PyX.LJLLL = C66074PwU.LIZ.LIZ;
            }
        } else if (str5.equals("Sharing")) {
            c66201PyX.LJLLILLLL.add(str5);
            c66201PyX.LJLLILLLL.add("LinkStart");
            c66201PyX.LJLLL = C66074PwU.LIZ.LIZ;
        }
        c66201PyX.LJLLJ = "provider";
        C66059PwF.LIZIZ(c66201PyX);
    }
}

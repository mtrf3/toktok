package X;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.content.pm.Signature;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.UriProtector;
import com.google.android.gms.measurement.internal.zzac;
import com.google.android.gms.measurement.internal.zzau;
import com.google.android.gms.measurement.internal.zzaw;
import java.io.ByteArrayInputStream;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Random;
import java.util.TreeSet;
import java.util.concurrent.atomic.AtomicLong;
import javax.security.auth.x500.X500Principal;

/* renamed from: X.Qnn, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C68083Qnn extends AbstractC68049QnF {
    public static final String[] LJI = {"firebase_", "google_", "ga_"};
    public static final String[] LJII = {"_err"};
    public SecureRandom LIZJ;
    public final AtomicLong LIZLLL;
    public int LJ;
    public Integer LJFF;

    public static MessageDigest LJIILIIL() {
        MessageDigest messageDigest;
        for (int i = 0; i < 2; i++) {
            try {
                messageDigest = MessageDigest.getInstance("MD5");
            } catch (NoSuchAlgorithmException unused) {
            }
            if (messageDigest != null) {
                return messageDigest;
            }
        }
        return null;
    }

    @Override // X.AbstractC68049QnF
    public final boolean LJI() {
        return true;
    }

    public final String LJIIJJI() {
        byte[] bArr = new byte[16];
        LJIILJJIL().nextBytes(bArr);
        return C16880lQ.LLLZI(Locale.US, "%032x", new Object[]{new BigInteger(1, bArr)});
    }

    public final int LJJLI() {
        if (this.LJFF == null) {
            this.LJFF = Integer.valueOf(C67258QaU.getInstance().getApkVersion(this.LIZ.LIZ) / 1000);
        }
        return this.LJFF.intValue();
    }

    public final long LJJLIIIJ() {
        long andIncrement;
        long j;
        if (this.LIZLLL.get() == 0) {
            synchronized (this.LIZLLL) {
                long nanoTime = System.nanoTime();
                this.LIZ.LJIILIIL.getClass();
                long nextLong = new Random(nanoTime ^ System.currentTimeMillis()).nextLong();
                int i = this.LJ + 1;
                this.LJ = i;
                j = nextLong + i;
            }
            return j;
        }
        synchronized (this.LIZLLL) {
            this.LIZLLL.compareAndSet(-1L, 1L);
            andIncrement = this.LIZLLL.getAndIncrement();
        }
        return andIncrement;
    }

    public final SecureRandom LJIILJJIL() {
        LJFF();
        if (this.LIZJ == null) {
            this.LIZJ = new SecureRandom();
        }
        return this.LIZJ;
    }

    public final void LJJIJL() {
        LJFF();
        SecureRandom secureRandom = new SecureRandom();
        long nextLong = secureRandom.nextLong();
        if (nextLong == 0) {
            nextLong = secureRandom.nextLong();
            if (nextLong == 0) {
                this.LIZ.LIZJ().LJIIIIZZ.LIZ("Utils falling back to Random for random id");
            }
        }
        this.LIZLLL.set(nextLong);
    }

    public C68083Qnn(C68033Qmz c68033Qmz) {
        super(c68033Qmz);
        this.LIZLLL = new AtomicLong(0L);
    }

    public static ArrayList LJIILL(List list) {
        if (list == null) {
            return new ArrayList(0);
        }
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            zzac zzacVar = (zzac) it.next();
            Bundle bundle = new Bundle();
            bundle.putString("app_id", zzacVar.zza);
            bundle.putString("origin", zzacVar.zzb);
            bundle.putLong("creation_timestamp", zzacVar.zzd);
            bundle.putString("name", zzacVar.zzc.zzb);
            Object LJJJJL = zzacVar.zzc.LJJJJL();
            QH7.LJIIIIZZ(LJJJJL);
            C78886Uxe.LJJLL(bundle, LJJJJL);
            bundle.putBoolean("active", zzacVar.zze);
            String str = zzacVar.zzf;
            if (str != null) {
                bundle.putString("trigger_event_name", str);
            }
            zzaw zzawVar = zzacVar.zzg;
            if (zzawVar != null) {
                bundle.putString("timed_out_event_name", zzawVar.zza);
                zzau zzauVar = zzawVar.zzb;
                if (zzauVar != null) {
                    bundle.putBundle("timed_out_event_params", zzauVar.LJJJJZI());
                }
            }
            bundle.putLong("trigger_timeout", zzacVar.zzh);
            zzaw zzawVar2 = zzacVar.zzi;
            if (zzawVar2 != null) {
                bundle.putString("triggered_event_name", zzawVar2.zza);
                zzau zzauVar2 = zzawVar2.zzb;
                if (zzauVar2 != null) {
                    bundle.putBundle("triggered_event_params", zzauVar2.LJJJJZI());
                }
            }
            bundle.putLong("triggered_timestamp", zzacVar.zzc.zzc);
            bundle.putLong("time_to_live", zzacVar.zzj);
            zzaw zzawVar3 = zzacVar.zzk;
            if (zzawVar3 != null) {
                bundle.putString("expired_event_name", zzawVar3.zza);
                zzau zzauVar3 = zzawVar3.zzb;
                if (zzauVar3 != null) {
                    bundle.putBundle("expired_event_params", zzauVar3.LJJJJZI());
                }
            }
            arrayList.add(bundle);
        }
        return arrayList;
    }

    public static boolean LJJJI(Object obj) {
        if ((obj instanceof Parcelable[]) || (obj instanceof ArrayList) || (obj instanceof Bundle)) {
            return true;
        }
        return false;
    }

    public static boolean LJJJJ(String str) {
        if (!TextUtils.isEmpty(str) && str.startsWith("_")) {
            return true;
        }
        return false;
    }

    public static boolean LJJJJI(String str) {
        QH7.LJI(str);
        if (str.charAt(0) == '_' && !str.equals("_ep")) {
            return false;
        }
        return true;
    }

    public static boolean LJJJJIZL(Context context) {
        ActivityInfo receiverInfo;
        QH7.LJIIIIZZ(context);
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager != null && (receiverInfo = packageManager.getReceiverInfo(new ComponentName(context, "com.google.android.gms.measurement.AppMeasurementReceiver"), 0)) != null) {
                if (receiverInfo.enabled) {
                    return true;
                }
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        return false;
    }

    public static boolean LJJJJJ(Context context) {
        ServiceInfo serviceInfo;
        ServiceInfo serviceInfo2;
        QH7.LJIIIIZZ(context);
        if (Build.VERSION.SDK_INT >= 24) {
            try {
                PackageManager packageManager = context.getPackageManager();
                if (packageManager != null && (serviceInfo2 = packageManager.getServiceInfo(new ComponentName(context, "com.google.android.gms.measurement.AppMeasurementJobService"), 0)) != null) {
                    if (serviceInfo2.enabled) {
                        return true;
                    }
                }
            } catch (PackageManager.NameNotFoundException unused) {
            }
            return false;
        }
        try {
            PackageManager packageManager2 = context.getPackageManager();
            if (packageManager2 != null && (serviceInfo = packageManager2.getServiceInfo(new ComponentName(context, "com.google.android.gms.measurement.AppMeasurementService"), 0)) != null) {
                if (serviceInfo.enabled) {
                    return true;
                }
            }
        } catch (PackageManager.NameNotFoundException unused2) {
        }
        return false;
    }

    public static byte[] LJJJJL(Parcelable parcelable) {
        if (parcelable == null) {
            return null;
        }
        Parcel obtain = Parcel.obtain();
        try {
            parcelable.writeToParcel(obtain, 0);
            return obtain.marshall();
        } finally {
            obtain.recycle();
        }
    }

    public static long LJJLIIIIJ(byte[] bArr) {
        boolean z;
        QH7.LJIIIIZZ(bArr);
        int length = bArr.length;
        int i = 0;
        if (length > 0) {
            z = true;
        } else {
            z = false;
        }
        QH7.LJIIJJI(z);
        long j = 0;
        for (int i2 = length - 1; i2 >= 0 && i2 >= bArr.length - 8; i2--) {
            j += (bArr[i2] & 255) << i;
            i += 8;
        }
        return j;
    }

    public final boolean LJJJ(String str) {
        LJFF();
        if (QCX.LIZ(this.LIZ.LIZ).LIZ.checkCallingOrSelfPermission(str) == 0) {
            return true;
        }
        this.LIZ.LIZJ().LJIIL.LIZIZ(str, "Permission not granted");
        return false;
    }

    public final int LJJJJLL(String str) {
        if ("_ldl".equals(str)) {
            return 2048;
        }
        if ("_id".equals(str)) {
            return 256;
        }
        if ("_lgclid".equals(str)) {
            return 100;
        }
        return 36;
    }

    public final int LJJJLL(String str) {
        if (!LJJIL("event", str)) {
            return 2;
        }
        if (!LJJIJIIJIL("event", str, C68107QoB.LIZ, C68107QoB.LIZIZ)) {
            return 13;
        }
        if (!LJJIJIIJI(40, "event", str)) {
            return 2;
        }
        return 0;
    }

    public final int LJJJLZIJ(String str) {
        if (!LJJIL("event param", str)) {
            return 3;
        }
        if (!LJJIJIIJIL("event param", str, null, null)) {
            return 14;
        }
        if (!LJJIJIIJI(40, "event param", str)) {
            return 3;
        }
        return 0;
    }

    public final int LJJJZ(String str) {
        if (!LJJIZ("event param", str)) {
            return 3;
        }
        if (!LJJIJIIJIL("event param", str, null, null)) {
            return 14;
        }
        if (!LJJIJIIJI(40, "event param", str)) {
            return 3;
        }
        return 0;
    }

    public final int LJJL(String str) {
        if (!LJJIL("user property", str)) {
            return 6;
        }
        if (!LJJIJIIJIL("user property", str, C68119QoN.LIZ, null)) {
            return 15;
        }
        if (!LJJIJIIJI(24, "user property", str)) {
            return 6;
        }
        return 0;
    }

    public final Bundle LJJLIIIJJI(Bundle bundle) {
        Bundle bundle2 = new Bundle();
        if (bundle != null) {
            for (String str : bundle.keySet()) {
                Object LJIIIZ = LJIIIZ(C16880lQ.LLJJIII(bundle, str), str);
                if (LJIIIZ == null) {
                    this.LIZ.LIZJ().LJIIJ.LIZIZ(this.LIZ.LJIIL.LJ(str), "Param value can't be null");
                } else {
                    LJIL(bundle2, str, LJIIIZ);
                }
            }
        }
        return bundle2;
    }

    public static final boolean LJJJJLI(int i, Bundle bundle) {
        if (bundle.getLong("_err") == 0) {
            bundle.putLong("_err", i);
            return true;
        }
        return false;
    }

    public static boolean LJJJJZI(String str, String[] strArr) {
        QH7.LJIIIIZZ(strArr);
        for (Object obj : strArr) {
            if (str == obj || (str != null && str.equals(obj))) {
                return true;
            }
        }
        return false;
    }

    public final Object LJIIIZ(Object obj, String str) {
        int i = 256;
        if ("_ev".equals(str)) {
            return LJJJJZ(256, obj, true, true);
        }
        if (!LJJJJ(str)) {
            i = 100;
        }
        return LJJJJZ(i, obj, false, true);
    }

    public final Object LJIIJ(Object obj, String str) {
        if ("_ldl".equals(str)) {
            return LJJJJZ(LJJJJLL(str), obj, true, false);
        }
        return LJJJJZ(LJJJJLL(str), obj, false, false);
    }

    public final void LJIILLIIL(long j, Bundle bundle) {
        long j2 = bundle.getLong("_et");
        if (j2 != 0) {
            this.LIZ.LIZJ().LJIIIIZZ.LIZIZ(Long.valueOf(j2), "Params already contained engagement");
        } else {
            j2 = 0;
        }
        bundle.putLong("_et", j + j2);
    }

    public final void LJIJI(Bundle bundle, Bundle bundle2) {
        if (bundle2 == null) {
            return;
        }
        for (String str : bundle2.keySet()) {
            if (!bundle.containsKey(str)) {
                this.LIZ.LJIL().LJIL(bundle, str, C16880lQ.LLJJIII(bundle2, str));
            }
        }
    }

    public final void LJIJJ(C68111QoF c68111QoF, int i) {
        Iterator it = new TreeSet(c68111QoF.LIZLLL.keySet()).iterator();
        int i2 = 0;
        while (it.hasNext()) {
            String str = (String) it.next();
            if (LJJJJI(str) && (i2 = i2 + 1) > i) {
                this.LIZ.LIZJ().LJII.LIZJ(this.LIZ.LJIIL.LIZLLL(c68111QoF.LIZ), this.LIZ.LJIIL.LIZIZ(c68111QoF.LIZLLL), "Event can't contain more than " + i + " params");
                LJJJJLI(5, c68111QoF.LIZLLL);
                c68111QoF.LIZLLL.remove(str);
            }
        }
    }

    public final void LJJ(InterfaceC68139Qoh interfaceC68139Qoh, boolean z) {
        try {
            interfaceC68139Qoh.LJJJZ(C01R.LIZ("r", z));
        } catch (RemoteException e) {
            this.LIZ.LIZJ().LJIIIIZZ.LIZIZ(e, "Error returning boolean value to wrapper");
        }
    }

    public final void LJJI(InterfaceC68139Qoh interfaceC68139Qoh, ArrayList arrayList) {
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList("r", arrayList);
        try {
            interfaceC68139Qoh.LJJJZ(bundle);
        } catch (RemoteException e) {
            this.LIZ.LIZJ().LJIIIIZZ.LIZIZ(e, "Error returning bundle list to wrapper");
        }
    }

    public final void LJJIFFI(InterfaceC68139Qoh interfaceC68139Qoh, Bundle bundle) {
        try {
            interfaceC68139Qoh.LJJJZ(bundle);
        } catch (RemoteException e) {
            this.LIZ.LIZJ().LJIIIIZZ.LIZIZ(e, "Error returning bundle value to wrapper");
        }
    }

    public final void LJJII(InterfaceC68139Qoh interfaceC68139Qoh, byte[] bArr) {
        Bundle bundle = new Bundle();
        bundle.putByteArray("r", bArr);
        try {
            interfaceC68139Qoh.LJJJZ(bundle);
        } catch (RemoteException e) {
            this.LIZ.LIZJ().LJIIIIZZ.LIZIZ(e, "Error returning byte array to wrapper");
        }
    }

    public final void LJJIII(InterfaceC68139Qoh interfaceC68139Qoh, int i) {
        try {
            interfaceC68139Qoh.LJJJZ(C141415gn.LIZ("r", i));
        } catch (RemoteException e) {
            this.LIZ.LIZJ().LJIIIIZZ.LIZIZ(e, "Error returning int value to wrapper");
        }
    }

    public final void LJJIIJ(InterfaceC68139Qoh interfaceC68139Qoh, long j) {
        Bundle bundle = new Bundle();
        bundle.putLong("r", j);
        try {
            interfaceC68139Qoh.LJJJZ(bundle);
        } catch (RemoteException e) {
            this.LIZ.LIZJ().LJIIIIZZ.LIZIZ(e, "Error returning long value to wrapper");
        }
    }

    public final void LJJIIJZLJL(String str, InterfaceC68139Qoh interfaceC68139Qoh) {
        try {
            interfaceC68139Qoh.LJJJZ(C0H1.LIZ("r", str));
        } catch (RemoteException e) {
            this.LIZ.LIZJ().LJIIIIZZ.LIZIZ(e, "Error returning string value to wrapper");
        }
    }

    public final boolean LJJIJ(String str, String str2) {
        if (!TextUtils.isEmpty(str)) {
            QH7.LJIIIIZZ(str);
            if (!str.matches("^(1:\\d+:android:[a-f0-9]+|ca-app-pub-.*)$")) {
                if (TextUtils.isEmpty(this.LIZ.LIZIZ)) {
                    this.LIZ.LIZJ().LJII.LIZIZ(C67280Qaq.LJIIIZ(str), "Invalid google_app_id. Firebase Analytics disabled. See https://goo.gl/NAOOOI. provided id");
                }
                return false;
            }
            return true;
        }
        if (!TextUtils.isEmpty(str2)) {
            QH7.LJIIIIZZ(str2);
            if (!str2.matches("^(1:\\d+:android:[a-f0-9]+|ca-app-pub-.*)$")) {
                this.LIZ.LIZJ().LJII.LIZIZ(C67280Qaq.LJIIIZ(str2), "Invalid admob_app_id. Analytics disabled.");
                return false;
            }
            return true;
        }
        if (TextUtils.isEmpty(this.LIZ.LIZIZ)) {
            this.LIZ.LIZJ().LJII.LIZ("Missing google_app_id. Firebase Analytics disabled. See https://goo.gl/NAOOOI");
        }
        return false;
    }

    public final boolean LJJIL(String str, String str2) {
        if (str2 == null) {
            this.LIZ.LIZJ().LJII.LIZIZ(str, "Name is required and can't be null. Type");
            return false;
        }
        if (str2.length() == 0) {
            this.LIZ.LIZJ().LJII.LIZIZ(str, "Name is required and can't be empty. Type");
            return false;
        }
        int codePointAt = str2.codePointAt(0);
        if (!Character.isLetter(codePointAt)) {
            if (codePointAt == 95) {
                codePointAt = 95;
            } else {
                this.LIZ.LIZJ().LJII.LIZJ(str, str2, "Name must start with a letter or _ (underscore). Type, name");
                return false;
            }
        }
        int length = str2.length();
        int charCount = Character.charCount(codePointAt);
        while (charCount < length) {
            int codePointAt2 = str2.codePointAt(charCount);
            if (codePointAt2 == 95 || Character.isLetterOrDigit(codePointAt2)) {
                charCount += Character.charCount(codePointAt2);
            } else {
                this.LIZ.LIZJ().LJII.LIZJ(str, str2, "Name must consist of letters, digits or _ (underscores). Type, name");
                return false;
            }
        }
        return true;
    }

    public final boolean LJJIZ(String str, String str2) {
        if (str2 == null) {
            this.LIZ.LIZJ().LJII.LIZIZ(str, "Name is required and can't be null. Type");
            return false;
        }
        if (str2.length() == 0) {
            this.LIZ.LIZJ().LJII.LIZIZ(str, "Name is required and can't be empty. Type");
            return false;
        }
        int codePointAt = str2.codePointAt(0);
        if (!Character.isLetter(codePointAt)) {
            this.LIZ.LIZJ().LJII.LIZJ(str, str2, "Name must start with a letter. Type, name");
            return false;
        }
        int length = str2.length();
        int charCount = Character.charCount(codePointAt);
        while (charCount < length) {
            int codePointAt2 = str2.codePointAt(charCount);
            if (codePointAt2 == 95 || Character.isLetterOrDigit(codePointAt2)) {
                charCount += Character.charCount(codePointAt2);
            } else {
                this.LIZ.LIZJ().LJII.LIZJ(str, str2, "Name must consist of letters, digits or _ (underscores). Type, name");
                return false;
            }
        }
        return true;
    }

    public final boolean LJJJIL(Context context, String str) {
        Signature[] signatureArr;
        X500Principal x500Principal = new X500Principal("CN=Android Debug,O=Android,C=US");
        try {
            PackageInfo LIZIZ = QCX.LIZ(context).LIZIZ(64, str);
            if (LIZIZ != null && (signatureArr = LIZIZ.signatures) != null && signatureArr.length > 0) {
                return ((X509Certificate) CertificateFactory.getInstance("X.509").generateCertificate(new ByteArrayInputStream(signatureArr[0].toByteArray()))).getSubjectX500Principal().equals(x500Principal);
            }
            return true;
        } catch (PackageManager.NameNotFoundException e) {
            this.LIZ.LIZJ().LJFF.LIZIZ(e, "Package name not found");
            return true;
        } catch (CertificateException e2) {
            this.LIZ.LIZJ().LJFF.LIZIZ(e2, "Error obtaining certificate");
            return true;
        }
    }

    public final int LJJJLIIL(Object obj, String str) {
        boolean LJJIJLIJ;
        if ("_ldl".equals(str)) {
            LJJIJLIJ = LJJIJLIJ(LJJJJLL(str), "user property referrer", str, obj);
        } else {
            LJJIJLIJ = LJJIJLIJ(LJJJJLL(str), "user property", str, obj);
        }
        if (LJJIJLIJ) {
            return 0;
        }
        return 7;
    }

    public static String LJIIL(int i, String str, boolean z) {
        if (str == null) {
            return null;
        }
        if (str.codePointCount(0, str.length()) > i) {
            if (!z) {
                return null;
            }
            return String.valueOf(str.substring(0, str.offsetByCodePoints(0, i))).concat("...");
        }
        return str;
    }

    public static void LJIJ(C68132Qoa c68132Qoa, Bundle bundle, boolean z) {
        if (bundle != null) {
            if (c68132Qoa != null) {
                if (!bundle.containsKey("_sc") || z) {
                    String str = c68132Qoa.LIZ;
                    if (str != null) {
                        bundle.putString("_sn", str);
                    } else {
                        bundle.remove("_sn");
                    }
                    String str2 = c68132Qoa.LIZIZ;
                    if (str2 != null) {
                        bundle.putString("_sc", str2);
                    } else {
                        bundle.remove("_sc");
                    }
                    bundle.putLong("_si", c68132Qoa.LIZJ);
                    return;
                }
                return;
            }
            if (z) {
                bundle.remove("_sn");
                bundle.remove("_sc");
                bundle.remove("_si");
            }
        }
    }

    public final void LJIL(Bundle bundle, String str, Object obj) {
        String str2;
        if (bundle == null) {
            return;
        }
        if (obj instanceof Long) {
            bundle.putLong(str, ((Long) obj).longValue());
            return;
        }
        if (obj instanceof String) {
            bundle.putString(str, String.valueOf(obj));
            return;
        }
        if (obj instanceof Double) {
            bundle.putDouble(str, ((Double) obj).doubleValue());
            return;
        }
        if (obj instanceof Bundle[]) {
            bundle.putParcelableArray(str, (Bundle[]) obj);
        } else if (str != null) {
            if (obj != null) {
                str2 = C16880lQ.LJLLJ(obj.getClass());
            } else {
                str2 = null;
            }
            this.LIZ.LIZJ().LJIIJ.LIZJ(this.LIZ.LJIIL.LJ(str), str2, "Not putting event parameter. Invalid value type. name, type");
        }
    }

    public final boolean LJJIJIIJI(int i, String str, String str2) {
        if (str2 == null) {
            this.LIZ.LIZJ().LJII.LIZIZ(str, "Name is required and can't be null. Type");
            return false;
        }
        if (str2.codePointCount(0, str2.length()) > i) {
            this.LIZ.LIZJ().LJII.LIZLLL(str, Integer.valueOf(i), str2, "Name is too long. Type, maximum supported length, name");
            return false;
        }
        return true;
    }

    public final Bundle LJJLIIIJILLIZJL(android.net.Uri uri, boolean z, boolean z2) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        if (uri != null) {
            try {
                if (uri.isHierarchical()) {
                    str = UriProtector.getQueryParameter(uri, "utm_campaign");
                    str2 = UriProtector.getQueryParameter(uri, "utm_source");
                    str3 = UriProtector.getQueryParameter(uri, "utm_medium");
                    str4 = UriProtector.getQueryParameter(uri, "gclid");
                    if (z) {
                        str5 = UriProtector.getQueryParameter(uri, "utm_id");
                        str6 = UriProtector.getQueryParameter(uri, "dclid");
                    } else {
                        str5 = null;
                        str6 = null;
                    }
                    if (z2) {
                        str7 = UriProtector.getQueryParameter(uri, "srsltid");
                    } else {
                        str7 = null;
                    }
                } else {
                    str = null;
                    str2 = null;
                    str3 = null;
                    str4 = null;
                    str5 = null;
                    str6 = null;
                    str7 = null;
                }
                if (TextUtils.isEmpty(str) && TextUtils.isEmpty(str2) && TextUtils.isEmpty(str3) && TextUtils.isEmpty(str4) && ((!z || (TextUtils.isEmpty(str5) && TextUtils.isEmpty(str6))) && (!z2 || TextUtils.isEmpty(str7)))) {
                    return null;
                }
                Bundle bundle = new Bundle();
                if (!TextUtils.isEmpty(str)) {
                    bundle.putString("campaign", str);
                }
                if (!TextUtils.isEmpty(str2)) {
                    bundle.putString("source", str2);
                }
                if (!TextUtils.isEmpty(str3)) {
                    bundle.putString("medium", str3);
                }
                if (!TextUtils.isEmpty(str4)) {
                    bundle.putString("gclid", str4);
                }
                String queryParameter = UriProtector.getQueryParameter(uri, "utm_term");
                if (!TextUtils.isEmpty(queryParameter)) {
                    bundle.putString("term", queryParameter);
                }
                String queryParameter2 = UriProtector.getQueryParameter(uri, "utm_content");
                if (!TextUtils.isEmpty(queryParameter2)) {
                    bundle.putString("content", queryParameter2);
                }
                String queryParameter3 = UriProtector.getQueryParameter(uri, "aclid");
                if (!TextUtils.isEmpty(queryParameter3)) {
                    bundle.putString("aclid", queryParameter3);
                }
                String queryParameter4 = UriProtector.getQueryParameter(uri, "cp1");
                if (!TextUtils.isEmpty(queryParameter4)) {
                    bundle.putString("cp1", queryParameter4);
                }
                String queryParameter5 = UriProtector.getQueryParameter(uri, "anid");
                if (!TextUtils.isEmpty(queryParameter5)) {
                    bundle.putString("anid", queryParameter5);
                }
                if (z) {
                    if (!TextUtils.isEmpty(str5)) {
                        bundle.putString("campaign_id", str5);
                    }
                    if (!TextUtils.isEmpty(str6)) {
                        bundle.putString("dclid", str6);
                    }
                    String queryParameter6 = UriProtector.getQueryParameter(uri, "utm_source_platform");
                    if (!TextUtils.isEmpty(queryParameter6)) {
                        bundle.putString("source_platform", queryParameter6);
                    }
                    String queryParameter7 = UriProtector.getQueryParameter(uri, "utm_creative_format");
                    if (!TextUtils.isEmpty(queryParameter7)) {
                        bundle.putString("creative_format", queryParameter7);
                    }
                    String queryParameter8 = UriProtector.getQueryParameter(uri, "utm_marketing_tactic");
                    if (!TextUtils.isEmpty(queryParameter8)) {
                        bundle.putString("marketing_tactic", queryParameter8);
                    }
                }
                if (z2 && !TextUtils.isEmpty(str7)) {
                    bundle.putString("srsltid", str7);
                }
                return bundle;
            } catch (UnsupportedOperationException e) {
                this.LIZ.LIZJ().LJIIIIZZ.LIZIZ(e, "Install referrer url isn't a hierarchical URI");
            }
        }
        return null;
    }

    public static boolean LJJJJJL(String str, String str2, String str3, String str4) {
        boolean isEmpty = TextUtils.isEmpty(str);
        boolean isEmpty2 = TextUtils.isEmpty(str2);
        if (!isEmpty) {
            if (!isEmpty2) {
                QH7.LJIIIIZZ(str);
                if (!str.equals(str2)) {
                    return true;
                }
                return false;
            }
            if (TextUtils.isEmpty(str4)) {
                return false;
            }
            if (TextUtils.isEmpty(str3) || !str3.equals(str4)) {
                return true;
            }
            return false;
        }
        if (isEmpty2) {
            if (!TextUtils.isEmpty(str3) && !TextUtils.isEmpty(str4)) {
                if (!str3.equals(str4)) {
                    return true;
                }
                return false;
            }
            if (!TextUtils.isEmpty(str4)) {
                return true;
            }
            return false;
        }
        if (TextUtils.isEmpty(str3) || !str3.equals(str4)) {
            return true;
        }
        return false;
    }

    public final void LJIIZILJ(Bundle bundle, int i, String str, Object obj) {
        if (LJJJJLI(i, bundle)) {
            bundle.putString("_ev", LJIIL(40, str, true));
            if (obj != null) {
                if ((obj instanceof String) || (obj instanceof CharSequence)) {
                    bundle.putLong("_el", obj.toString().length());
                }
            }
        }
    }

    public final boolean LJJIJIIJIL(String str, String str2, String[] strArr, String[] strArr2) {
        if (str2 == null) {
            this.LIZ.LIZJ().LJII.LIZIZ(str, "Name is required and can't be null. Type");
            return false;
        }
        String[] strArr3 = LJI;
        int i = 0;
        while (!str2.startsWith(strArr3[i])) {
            i++;
            if (i >= 3) {
                if (strArr != null && LJJJJZI(str2, strArr)) {
                    if (strArr2 == null || !LJJJJZI(str2, strArr2)) {
                        this.LIZ.LIZJ().LJII.LIZJ(str, str2, "Name is reserved. Type, name");
                        return false;
                    }
                    return true;
                }
                return true;
            }
        }
        this.LIZ.LIZJ().LJII.LIZJ(str, str2, "Name starts with reserved prefix. Type, name");
        return false;
    }

    public final boolean LJJIJLIJ(int i, String str, String str2, Object obj) {
        if (obj != null && !(obj instanceof Long) && !(obj instanceof Float) && !(obj instanceof Integer) && !(obj instanceof Byte) && !(obj instanceof Short) && !(obj instanceof Boolean) && !(obj instanceof Double)) {
            if (!(obj instanceof String) && !(obj instanceof Character) && !(obj instanceof CharSequence)) {
                return false;
            }
            String obj2 = obj.toString();
            if (obj2.codePointCount(0, obj2.length()) > i) {
                this.LIZ.LIZJ().LJIIJ.LIZLLL(str, str2, Integer.valueOf(obj2.length()), "Value is too long; discarded. Value kind, name, value length");
                return false;
            }
        }
        return true;
    }

    public final Object LJJJJZ(int i, Object obj, boolean z, boolean z2) {
        long j;
        if (obj == null) {
            return null;
        }
        if ((obj instanceof Long) || (obj instanceof Double)) {
            return obj;
        }
        if (obj instanceof Integer) {
            return Long.valueOf(((Integer) obj).intValue());
        }
        if (obj instanceof Byte) {
            return Long.valueOf(((Byte) obj).byteValue());
        }
        if (obj instanceof Short) {
            return Long.valueOf(((Short) obj).shortValue());
        }
        if (obj instanceof Boolean) {
            if (true != ((Boolean) obj).booleanValue()) {
                j = 0;
            } else {
                j = 1;
            }
            return Long.valueOf(j);
        }
        if (obj instanceof Float) {
            return Double.valueOf(((Float) obj).doubleValue());
        }
        if ((obj instanceof String) || (obj instanceof Character) || (obj instanceof CharSequence)) {
            return LJIIL(i, obj.toString(), z);
        }
        if (!z2 || (!(obj instanceof Bundle[]) && !(obj instanceof Parcelable[]))) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (Parcelable parcelable : (Parcelable[]) obj) {
            if (parcelable instanceof Bundle) {
                Bundle LJJLIIIJJI = LJJLIIIJJI((Bundle) parcelable);
                if (!LJJLIIIJJI.isEmpty()) {
                    arrayList.add(LJJLIIIJJI);
                }
            }
        }
        return arrayList.toArray(new Bundle[arrayList.size()]);
    }

    public final Bundle LJJLIIIJJIZ(String str, String str2, Bundle bundle, List list, boolean z) {
        int LJJJLZIJ;
        String str3;
        String str4;
        boolean LJJJJZI = LJJJJZI(str2, C68107QoB.LIZLLL);
        if (bundle != null) {
            Bundle bundle2 = new Bundle(bundle);
            int LJIIIIZZ = this.LIZ.LJI.LJIIIIZZ();
            Iterator it = new TreeSet(bundle.keySet()).iterator();
            int i = 0;
            while (it.hasNext()) {
                String str5 = (String) it.next();
                if ((list == null || !list.contains(str5)) && ((!z && (LJJJLZIJ = LJJJZ(str5)) != 0) || (LJJJLZIJ = LJJJLZIJ(str5)) != 0)) {
                    if (LJJJLZIJ == 3) {
                        str3 = str5;
                    } else {
                        str3 = null;
                    }
                    LJIIZILJ(bundle2, LJJJLZIJ, str5, str3);
                    bundle2.remove(str5);
                } else {
                    int LJJIJIL = LJJIJIL(str, str2, str5, C16880lQ.LLJJIII(bundle, str5), bundle2, list, z, LJJJJZI);
                    if (LJJIJIL == 17) {
                        LJIIZILJ(bundle2, 17, str5, Boolean.FALSE);
                    } else if (LJJIJIL != 0 && !"_ev".equals(str5)) {
                        if (LJJIJIL == 21) {
                            str4 = str2;
                        } else {
                            str4 = str5;
                        }
                        LJIIZILJ(bundle2, LJJIJIL, str4, C16880lQ.LLJJIII(bundle, str5));
                        bundle2.remove(str5);
                    }
                    if (LJJJJI(str5) && (i = i + 1) > LJIIIIZZ) {
                        this.LIZ.LIZJ().LJII.LIZJ(this.LIZ.LJIIL.LIZLLL(str2), this.LIZ.LJIIL.LIZIZ(bundle), "Event can't contain more than " + LJIIIIZZ + " params");
                        LJJJJLI(5, bundle2);
                        bundle2.remove(str5);
                    }
                }
            }
            return bundle2;
        }
        return null;
    }

    public static void LJIJJLI(InterfaceC68141Qoj interfaceC68141Qoj, String str, int i, String str2, String str3, int i2) {
        Bundle bundle = new Bundle();
        LJJJJLI(i, bundle);
        if (!TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str3)) {
            bundle.putString(str2, str3);
        }
        if (i == 6 || i == 7 || i == 2) {
            bundle.putLong("_el", i2);
        }
        interfaceC68141Qoj.LIZ(str, bundle);
    }

    public final void LJJIIZI(String str, String str2, String str3, Bundle bundle, List list, boolean z) {
        int LJJJLZIJ;
        String str4;
        int LJJIJIL;
        if (bundle == null) {
            return;
        }
        Iterator it = new TreeSet(bundle.keySet()).iterator();
        int i = 0;
        while (it.hasNext()) {
            String str5 = (String) it.next();
            if ((list == null || !list.contains(str5)) && ((!z && (LJJJLZIJ = LJJJZ(str5)) != 0) || (LJJJLZIJ = LJJJLZIJ(str5)) != 0)) {
                if (LJJJLZIJ == 3) {
                    str4 = str5;
                } else {
                    str4 = null;
                }
                LJIIZILJ(bundle, LJJJLZIJ, str5, str4);
                bundle.remove(str5);
            } else {
                if (LJJJI(C16880lQ.LLJJIII(bundle, str5))) {
                    this.LIZ.LIZJ().LJIIJ.LIZLLL(str2, str3, str5, "Nested Bundle parameters are not allowed; discarded. event name, param name, child param name");
                    LJJIJIL = 22;
                } else {
                    LJJIJIL = LJJIJIL(str, str2, str5, C16880lQ.LLJJIII(bundle, str5), bundle, list, z, false);
                    if (LJJIJIL == 0) {
                        if (LJJJJI(str5) && !LJJJJZI(str5, C68094Qny.LIZLLL) && (i = i + 1) > 0) {
                            this.LIZ.LIZJ().LJII.LIZJ(this.LIZ.LJIIL.LIZLLL(str2), this.LIZ.LJIIL.LIZIZ(bundle), "Item cannot contain custom parameters");
                            LJJJJLI(23, bundle);
                            bundle.remove(str5);
                        }
                    }
                }
                if (!"_ev".equals(str5)) {
                    LJIIZILJ(bundle, LJJIJIL, str5, C16880lQ.LLJJIII(bundle, str5));
                    bundle.remove(str5);
                } else if (LJJJJI(str5)) {
                    this.LIZ.LIZJ().LJII.LIZJ(this.LIZ.LJIIL.LIZLLL(str2), this.LIZ.LJIIL.LIZIZ(bundle), "Item cannot contain custom parameters");
                    LJJJJLI(23, bundle);
                    bundle.remove(str5);
                }
            }
        }
    }

    public final zzaw LJJLIIIJL(String str, String str2, Bundle bundle, String str3, long j, boolean z) {
        Bundle bundle2;
        if (TextUtils.isEmpty(str2)) {
            return null;
        }
        if (LJJJLL(str2) == 0) {
            if (bundle != null) {
                bundle2 = new Bundle(bundle);
            } else {
                bundle2 = new Bundle();
            }
            bundle2.putString("_o", str3);
            Bundle LJJLIIIJJIZ = LJJLIIIJJIZ(str, str2, bundle2, Collections.singletonList("_o"), true);
            if (z) {
                LJJLIIIJJIZ = LJJLIIIJJI(LJJLIIIJJIZ);
            }
            QH7.LJIIIIZZ(LJJLIIIJJIZ);
            return new zzaw(str2, new zzau(LJJLIIIJJIZ), str3, j);
        }
        this.LIZ.LIZJ().LJFF.LIZIZ(this.LIZ.LJIIL.LJFF(str2), "Invalid conditional property event name");
        throw new IllegalArgumentException();
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x00c4 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00c8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int LJJIJIL(java.lang.String r23, java.lang.String r24, java.lang.String r25, java.lang.Object r26, android.os.Bundle r27, java.util.List r28, boolean r29, boolean r30) {
        /*
            Method dump skipped, instructions count: 337
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C68083Qnn.LJJIJIL(java.lang.String, java.lang.String, java.lang.String, java.lang.Object, android.os.Bundle, java.util.List, boolean, boolean):int");
    }
}

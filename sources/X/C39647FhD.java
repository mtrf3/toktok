package X;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.StrictMode;
import com.bytedance.librarian.Librarian;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import kotlin.jvm.internal.o;

/* renamed from: X.FhD, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39647FhD {
    public static final AtomicReference<C39647FhD> LIZLLL = new AtomicReference<>(null);
    public final C39649FhF LIZ;
    public final java.util.Set<String> LIZIZ = new HashSet();
    public final C39651FhH LIZJ;

    public C39647FhD(Context context) {
        try {
            C39649FhF c39649FhF = new C39649FhF(context);
            this.LIZ = c39649FhF;
            this.LIZJ = new C39651FhH(c39649FhF);
        } catch (PackageManager.NameNotFoundException e) {
            throw new C39658FhO(e);
        }
    }

    public final java.util.Set<String> LIZ() {
        HashSet hashSet;
        synchronized (this.LIZIZ) {
            hashSet = new HashSet(this.LIZIZ);
        }
        return hashSet;
    }

    public static boolean LIZLLL(Context context) {
        if (((Boolean) EPE.LIZIZ.getValue()).booleanValue()) {
            EPE.LIZ();
        }
        boolean LIZIZ = LIZIZ(context, false);
        o.LJIIIZ(context, "context");
        try {
            File LLIIJLIL = C16880lQ.LLIIJLIL(context);
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("splitcompat/");
            LIZ.append(EF7.LJI());
            LIZ.append("/verified-splits");
            File file = new File(LLIIJLIL, X1D.LIZIZ(LIZ));
            if (file.exists()) {
                File[] listFiles = file.listFiles();
                if (listFiles == null) {
                    listFiles = new File[0];
                }
                ArrayList arrayList = new ArrayList();
                for (File file2 : listFiles) {
                    if (!C35967E9r.LIZ.contains(file2)) {
                        arrayList.add(file2);
                    }
                }
                C35967E9r.LIZ.addAll(arrayList);
                ArrayList arrayList2 = new ArrayList(C32I.LJJL(arrayList, 10));
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    arrayList2.add(((File) it.next()).getAbsolutePath());
                }
                Librarian.LIZ(arrayList2);
            }
        } catch (Throwable th) {
            C78983UzD.LJIIZILJ(th);
        }
        return LIZIZ;
    }

    public static boolean LJ(Context context) {
        StrictMode.ThreadPolicy threadPolicy;
        C39647FhD c39647FhD = LIZLLL.get();
        if (c39647FhD != null) {
            C39651FhH c39651FhH = c39647FhD.LIZJ;
            java.util.Set<String> LIZ = c39647FhD.LIZ();
            synchronized (c39651FhH) {
                try {
                    threadPolicy = StrictMode.getThreadPolicy();
                    try {
                        StrictMode.allowThreadDiskReads();
                        StrictMode.allowThreadDiskWrites();
                    } catch (Exception unused) {
                    }
                } catch (Exception unused2) {
                    threadPolicy = null;
                }
                try {
                    try {
                        HashSet hashSet = new HashSet();
                        Iterator it = ((HashSet) LIZ).iterator();
                        while (it.hasNext()) {
                            hashSet.add(c39651FhH.LIZ.LIZIZ((String) it.next()));
                        }
                        c39651FhH.LIZ(context, hashSet);
                        if (threadPolicy != null) {
                            StrictMode.setThreadPolicy(threadPolicy);
                        }
                    } catch (Throwable th) {
                        if (threadPolicy != null) {
                            StrictMode.setThreadPolicy(threadPolicy);
                        }
                        throw th;
                    }
                } catch (Exception unused3) {
                    if (threadPolicy != null) {
                        StrictMode.setThreadPolicy(threadPolicy);
                    }
                    return false;
                }
            }
            return true;
        }
        throw new IllegalStateException("SplitCompat.installActivity can only be called if SplitCompat.install is first called at startup on application context.");
    }

    public static boolean LIZIZ(Context context, boolean z) {
        boolean z2;
        AtomicReference<C39647FhD> atomicReference = LIZLLL;
        C39647FhD c39647FhD = new C39647FhD(context);
        while (true) {
            if (atomicReference.compareAndSet(null, c39647FhD)) {
                z2 = true;
                break;
            }
            if (atomicReference.get() != null) {
                z2 = false;
                break;
            }
        }
        C39647FhD c39647FhD2 = LIZLLL.get();
        if (z2) {
            EnumC39661FhR enumC39661FhR = EnumC39661FhR.a;
            Executor LJIIIZ = C78948Uye.LJIIIZ();
            C39649FhF c39649FhF = c39647FhD2.LIZ;
            enumC39661FhR.b(new C39663FhT(context, LJIIIZ, new C39667FhX(context, c39649FhF), c39649FhF));
            C37255Ejj c37255Ejj = new C37255Ejj(c39647FhD2);
            AtomicReference<InterfaceC34852Dm4> atomicReference2 = C37110EhO.LIZ;
            while (!atomicReference2.compareAndSet(null, c37255Ejj) && atomicReference2.get() == null) {
            }
            C78948Uye.LJIIIZ().execute(new RunnableC40554Fvq(context));
        }
        try {
            c39647FhD2.LIZJ(context, z);
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    public final synchronized void LIZJ(Context context, boolean z) {
        List<String> asList;
        String str;
        if (!z) {
            C78948Uye.LJIIIZ().execute(new RunnableC39655FhL(this));
        } else {
            this.LIZ.LIZ();
        }
        String packageName = context.getPackageName();
        int i = 1;
        try {
            String[] strArr = C16880lQ.LLLLLLZ(context.getPackageManager(), packageName, 0).splitNames;
            if (strArr == null) {
                asList = new ArrayList();
            } else {
                asList = Arrays.asList(strArr);
            }
            java.util.Set<C36728EbE> LIZJ = this.LIZ.LIZJ();
            HashSet hashSet = new HashSet();
            HashSet hashSet2 = (HashSet) LIZJ;
            Iterator it = hashSet2.iterator();
            while (it.hasNext()) {
                String str2 = ((C36728EbE) it.next()).LIZIZ;
                if (asList.contains(str2)) {
                    if (!z) {
                        hashSet.add(str2);
                    } else {
                        C39649FhF.LIZLLL(this.LIZ.LIZIZ(str2));
                    }
                    it.remove();
                }
            }
            if (!hashSet.isEmpty()) {
                C78948Uye.LJIIIZ().execute(new RunnableC68081Qnl(i, this, hashSet));
            }
            HashSet hashSet3 = new HashSet();
            Iterator it2 = hashSet2.iterator();
            while (it2.hasNext()) {
                String str3 = ((C36728EbE) it2.next()).LIZIZ;
                if (!C37109EhN.LIZLLL(str3)) {
                    hashSet3.add(str3);
                }
            }
            for (String str4 : asList) {
                if (!C37109EhN.LIZLLL(str4)) {
                    hashSet3.add(str4);
                }
            }
            HashSet hashSet4 = new HashSet(hashSet2.size());
            Iterator it3 = hashSet2.iterator();
            while (it3.hasNext()) {
                C36728EbE c36728EbE = (C36728EbE) it3.next();
                if (!c36728EbE.LIZIZ.startsWith("config.")) {
                    String str5 = c36728EbE.LIZIZ;
                    if (str5.startsWith("config.")) {
                        str = "";
                    } else {
                        str = str5.split("\\.config\\.", 2)[0];
                    }
                    if (hashSet3.contains(str)) {
                    }
                }
                hashSet4.add(c36728EbE);
            }
            C39648FhE c39648FhE = new C39648FhE(this.LIZ);
            InterfaceC39656FhM LIZ = C40631Fx5.LIZ();
            ClassLoader classLoader = context.getClassLoader();
            if (z) {
                LIZ.LIZLLL(classLoader, c39648FhE.LIZ());
            } else {
                Iterator it4 = hashSet4.iterator();
                while (it4.hasNext()) {
                    C36728EbE c36728EbE2 = (C36728EbE) it4.next();
                    AtomicBoolean atomicBoolean = new AtomicBoolean(true);
                    HashSet hashSet5 = new HashSet();
                    C39648FhE.LIZIZ(c36728EbE2, new C39653FhJ(c39648FhE, c36728EbE2, hashSet5, atomicBoolean));
                    if (atomicBoolean.get()) {
                        LIZ.LIZLLL(classLoader, hashSet5);
                    } else {
                        it4.remove();
                    }
                }
            }
            HashSet hashSet6 = new HashSet();
            Iterator it5 = hashSet4.iterator();
            while (it5.hasNext()) {
                C36728EbE c36728EbE3 = (C36728EbE) it5.next();
                try {
                    ZipFile zipFile = new ZipFile(c36728EbE3.LIZ);
                    try {
                        ZipEntry entry = zipFile.getEntry("classes.dex");
                        zipFile.close();
                        if (entry != null) {
                            C39649FhF c39649FhF = this.LIZ;
                            String str6 = c36728EbE3.LIZIZ;
                            c39649FhF.getClass();
                            File file = new File(c39649FhF.LJ(), "dex");
                            C39649FhF.LJII(file);
                            File LJI = C39649FhF.LJI(file, str6);
                            C39649FhF.LJII(LJI);
                            if (!LIZ.LJIILL(classLoader, LJI, c36728EbE3.LIZ, z)) {
                                new StringBuilder(String.valueOf(c36728EbE3.LIZ).length() + 24);
                            }
                        }
                        hashSet6.add(c36728EbE3.LIZ);
                    } catch (IOException e) {
                        try {
                            zipFile.close();
                            throw e;
                        } catch (IOException e2) {
                            C36662EaA.LIZ(e, e2);
                            throw e;
                        }
                    }
                } catch (IOException e3) {
                    throw e3;
                }
            }
            this.LIZJ.LIZ(context, hashSet6);
            HashSet hashSet7 = new HashSet();
            Iterator it6 = hashSet4.iterator();
            while (it6.hasNext()) {
                C36728EbE c36728EbE4 = (C36728EbE) it6.next();
                if (hashSet6.contains(c36728EbE4.LIZ)) {
                    new StringBuilder(c36728EbE4.LIZIZ.length() + 30);
                    hashSet7.add(c36728EbE4.LIZIZ);
                } else {
                    new StringBuilder(c36728EbE4.LIZIZ.length() + 35);
                }
            }
            synchronized (this.LIZIZ) {
                this.LIZIZ.addAll(hashSet7);
            }
        } catch (PackageManager.NameNotFoundException e4) {
            throw new IOException(C16880lQ.LLLZ("Cannot load data for application '%s'", new Object[]{packageName}), e4);
        }
    }
}

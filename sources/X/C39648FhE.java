package X;

import android.os.Build;
import com.bytedance.mt.protector.impl.PatternProtector;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

/* renamed from: X.FhE, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39648FhE {
    public static final Pattern LIZIZ = PatternProtector.compile("lib/([^/]+)/(.*\\.so)$");
    public final C39649FhF LIZ;

    public C39648FhE(C39649FhF c39649FhF) {
        this.LIZ = c39649FhF;
    }

    public static void LIZIZ(C36728EbE c36728EbE, InterfaceC39657FhN interfaceC39657FhN) {
        try {
            ZipFile zipFile = new ZipFile(c36728EbE.LIZ);
            try {
                HashMap hashMap = new HashMap();
                Enumeration<? extends ZipEntry> entries = zipFile.entries();
                while (entries.hasMoreElements()) {
                    ZipEntry nextElement = entries.nextElement();
                    Matcher matcher = LIZIZ.matcher(nextElement.getName());
                    if (matcher.matches()) {
                        String group = matcher.group(1);
                        String group2 = matcher.group(2);
                        java.util.Set set = (java.util.Set) hashMap.get(group);
                        if (set == null) {
                            set = new HashSet();
                            hashMap.put(group, set);
                        }
                        set.add(new C39659FhP(nextElement, group2));
                    }
                }
                HashMap hashMap2 = new HashMap();
                for (String str : Build.SUPPORTED_ABIS) {
                    if (hashMap.containsKey(str)) {
                        for (C39659FhP c39659FhP : (java.util.Set) hashMap.get(str)) {
                            if (!hashMap2.containsKey(c39659FhP.LIZ)) {
                                hashMap2.put(c39659FhP.LIZ, c39659FhP);
                            }
                        }
                    }
                }
                interfaceC39657FhN.LIZ(zipFile, new HashSet(hashMap2.values()));
                zipFile.close();
            } catch (IOException e) {
                try {
                    zipFile.close();
                } catch (IOException e2) {
                    C36662EaA.LIZ(e, e2);
                }
            }
        } catch (IOException e3) {
            throw e3;
        }
    }

    public final java.util.Set<File> LIZ() {
        java.util.Set<C36728EbE> LIZJ = this.LIZ.LIZJ();
        C39649FhF c39649FhF = this.LIZ;
        c39649FhF.getClass();
        ArrayList arrayList = new ArrayList();
        File file = new File(c39649FhF.LJ(), "native-libraries");
        C39649FhF.LJII(file);
        File[] listFiles = file.listFiles();
        if (listFiles != null) {
            for (File file2 : listFiles) {
                if (file2.isDirectory()) {
                    arrayList.add(file2.getName());
                }
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            Iterator it2 = ((HashSet) LIZJ).iterator();
            while (true) {
                if (it2.hasNext()) {
                    if (((C36728EbE) it2.next()).LIZIZ.equals(str)) {
                        break;
                    }
                } else {
                    C39649FhF c39649FhF2 = this.LIZ;
                    c39649FhF2.getClass();
                    File file3 = new File(c39649FhF2.LJ(), "native-libraries");
                    C39649FhF.LJII(file3);
                    File LJI = C39649FhF.LJI(file3, str);
                    C39649FhF.LJII(LJI);
                    C39649FhF.LIZLLL(LJI);
                    break;
                }
            }
        }
        HashSet hashSet = new HashSet();
        Iterator it3 = ((HashSet) LIZJ).iterator();
        while (it3.hasNext()) {
            C36728EbE c36728EbE = (C36728EbE) it3.next();
            HashSet hashSet2 = new HashSet();
            LIZIZ(c36728EbE, new C39652FhI(this, hashSet2, c36728EbE));
            C39649FhF c39649FhF3 = this.LIZ;
            String str2 = c36728EbE.LIZIZ;
            c39649FhF3.getClass();
            HashSet hashSet3 = new HashSet();
            File file4 = new File(c39649FhF3.LJ(), "native-libraries");
            C39649FhF.LJII(file4);
            File LJI2 = C39649FhF.LJI(file4, str2);
            C39649FhF.LJII(LJI2);
            File[] listFiles2 = LJI2.listFiles();
            if (listFiles2 != null) {
                for (File file5 : listFiles2) {
                    if (file5.isFile()) {
                        hashSet3.add(file5);
                    }
                }
            }
            Iterator it4 = hashSet3.iterator();
            while (it4.hasNext()) {
                File file6 = (File) it4.next();
                if (!hashSet2.contains(file6)) {
                    file6.getAbsolutePath();
                    c36728EbE.LIZ.getAbsolutePath();
                    C39649FhF c39649FhF4 = this.LIZ;
                    c39649FhF4.getClass();
                    File parentFile = file6.getParentFile().getParentFile();
                    File file7 = new File(c39649FhF4.LJ(), "native-libraries");
                    C39649FhF.LJII(file7);
                    if (parentFile.equals(file7)) {
                        C39649FhF.LIZLLL(file6);
                    } else {
                        throw new IllegalStateException("File to remove is not a native library");
                    }
                }
            }
            hashSet.addAll(hashSet2);
        }
        return hashSet;
    }

    public final void LIZJ(C36728EbE c36728EbE, java.util.Set<C39659FhP> set, InterfaceC39660FhQ interfaceC39660FhQ) {
        boolean z;
        Iterator it = ((HashSet) set).iterator();
        while (it.hasNext()) {
            C39659FhP c39659FhP = (C39659FhP) it.next();
            C39649FhF c39649FhF = this.LIZ;
            String str = c36728EbE.LIZIZ;
            String str2 = c39659FhP.LIZ;
            c39649FhF.getClass();
            File file = new File(c39649FhF.LJ(), "native-libraries");
            C39649FhF.LJII(file);
            File LJI = C39649FhF.LJI(file, str);
            C39649FhF.LJII(LJI);
            File LJI2 = C39649FhF.LJI(LJI, str2);
            if (LJI2.exists() && LJI2.length() == c39659FhP.LIZIZ.getSize()) {
                z = true;
            } else {
                z = false;
            }
            interfaceC39660FhQ.LIZ(c39659FhP, LJI2, z);
        }
    }
}

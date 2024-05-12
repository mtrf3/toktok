package X;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.os.Bundle;
import java.io.IOException;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import org.xmlpull.v1.XmlPullParserException;

/* renamed from: X.EhN, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37109EhN {
    public static final C13T LIZJ = new C13T("SplitInstallInfoProvider");
    public final Context LIZ;
    public final String LIZIZ;

    public C37109EhN(Context context) {
        this.LIZ = context;
        this.LIZIZ = context.getPackageName();
    }

    public final java.util.Set<String> LIZ() {
        HashSet hashSet = new HashSet();
        Iterator it = ((HashSet) LJ()).iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            if (!LIZLLL(str)) {
                hashSet.add(str);
            }
        }
        return hashSet;
    }

    public final java.util.Set<String> LIZIZ() {
        C35959E9j LIZJ2 = LIZJ();
        if (LIZJ2 == null) {
            return null;
        }
        HashSet hashSet = new HashSet();
        java.util.Set<String> LJ = LJ();
        ((HashSet) LJ).add("");
        java.util.Set<String> LIZ = LIZ();
        ((HashSet) LIZ).add("");
        for (Map.Entry entry : ((HashMap) LIZJ2.LIZ(LIZ)).entrySet()) {
            if (LJ.containsAll((Collection) entry.getValue())) {
                hashSet.add(entry.getKey());
            }
        }
        return hashSet;
    }

    public final Bundle LJFF() {
        Bundle bundle;
        try {
            ApplicationInfo LLLLLLLLL = C16880lQ.LLLLLLLLL(this.LIZ.getPackageManager(), this.LIZIZ, 128);
            if (LLLLLLLLL == null || (bundle = LLLLLLLLL.metaData) == null) {
                LIZJ.LIZJ("App has no applicationInfo or metaData", 3, new Object[0]);
                return null;
            }
            return bundle;
        } catch (PackageManager.NameNotFoundException unused) {
            LIZJ.LIZJ("App is not found in PackageManager", 5, new Object[0]);
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x007d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.Set<java.lang.String> LJ() {
        /*
            r7 = this;
            java.util.HashSet r3 = new java.util.HashSet
            r3.<init>()
            android.os.Bundle r1 = r7.LJFF()
            r5 = 3
            r6 = 0
            if (r1 != 0) goto Le
            goto L3a
        Le:
            java.lang.String r0 = "com.android.dynamic.apk.fused.modules"
            java.lang.String r2 = r1.getString(r0)
            if (r2 == 0) goto L1c
            boolean r0 = r2.isEmpty()
            if (r0 == 0) goto L26
        L1c:
            X.13T r2 = X.C37109EhN.LIZJ
            java.lang.Object[] r1 = new java.lang.Object[r6]
            java.lang.String r0 = "App has no fused modules."
            r2.LIZJ(r0, r5, r1)
            goto L3a
        L26:
            java.lang.String r1 = ","
            r0 = -1
            java.lang.String[] r0 = r2.split(r1, r0)
            java.util.Collections.addAll(r3, r0)
            java.lang.String r0 = ""
            r3.remove(r0)
            java.lang.String r0 = "base"
            r3.remove(r0)
        L3a:
            android.content.Context r0 = r7.LIZ     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L4b
            android.content.pm.PackageManager r1 = r0.getPackageManager()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L4b
            java.lang.String r0 = r7.LIZIZ     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L4b
            android.content.pm.PackageInfo r0 = X.C16880lQ.LLLLLLZ(r1, r0, r6)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L4b
            if (r0 == 0) goto L55
            java.lang.String[] r4 = r0.splitNames     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L4b
            goto L56
        L4b:
            X.13T r4 = X.C37109EhN.LIZJ
            java.lang.Object[] r2 = new java.lang.Object[r6]
            r1 = 5
            java.lang.String r0 = "App is not found in PackageManager"
            r4.LIZJ(r0, r1, r2)
        L55:
            r4 = 0
        L56:
            if (r4 == 0) goto L7d
            X.13T r2 = X.C37109EhN.LIZJ
            r0 = 1
            java.lang.Object[] r1 = new java.lang.Object[r0]
            java.lang.String r0 = java.util.Arrays.toString(r4)
            r1[r6] = r0
            java.lang.String r0 = "Adding splits from package manager: %s"
            r2.LIZJ(r0, r5, r1)
            java.util.Collections.addAll(r3, r4)
        L6b:
            java.util.concurrent.atomic.AtomicReference<X.Dm4> r0 = X.C37110EhO.LIZ
            java.lang.Object r0 = r0.get()
            X.Dm4 r0 = (X.InterfaceC34852Dm4) r0
            if (r0 == 0) goto L7c
            java.util.Set r0 = r0.a()
            r3.addAll(r0)
        L7c:
            return r3
        L7d:
            X.13T r2 = X.C37109EhN.LIZJ
            java.lang.Object[] r1 = new java.lang.Object[r6]
            java.lang.String r0 = "No splits are found or app cannot be found in package manager."
            r2.LIZJ(r0, r5, r1)
            goto L6b
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C37109EhN.LJ():java.util.Set");
    }

    public final C35959E9j LIZJ() {
        String LIZ;
        Bundle LJFF = LJFF();
        C35959E9j c35959E9j = null;
        if (LJFF == null) {
            LIZJ.LIZJ("No metadata found in Context.", 5, new Object[0]);
            return null;
        }
        int i = LJFF.getInt("com.android.vending.splits");
        if (i == 0) {
            LIZJ.LIZJ("No metadata found in AndroidManifest.", 5, new Object[0]);
            return null;
        }
        try {
            XmlResourceParser xml = this.LIZ.getResources().getXml(i);
            C35960E9k c35960E9k = new C35960E9k();
            while (xml.next() != 1) {
                try {
                    if (xml.getEventType() == 2) {
                        if (xml.getName().equals("splits")) {
                            while (xml.next() != 3) {
                                if (xml.getEventType() == 2) {
                                    if (xml.getName().equals("module") && (LIZ = C37111EhP.LIZ(xml, "name")) != null) {
                                        while (xml.next() != 3) {
                                            if (xml.getEventType() == 2) {
                                                if (xml.getName().equals("language")) {
                                                    while (xml.next() != 3) {
                                                        if (xml.getEventType() == 2) {
                                                            if (xml.getName().equals("entry")) {
                                                                String LIZ2 = C37111EhP.LIZ(xml, "key");
                                                                String LIZ3 = C37111EhP.LIZ(xml, "split");
                                                                C37111EhP.LIZIZ(xml);
                                                                if (LIZ2 != null && LIZ3 != null) {
                                                                    c35960E9k.LIZIZ(LIZ, LIZ2, LIZ3);
                                                                }
                                                            } else {
                                                                C37111EhP.LIZIZ(xml);
                                                            }
                                                        }
                                                    }
                                                } else {
                                                    C37111EhP.LIZIZ(xml);
                                                }
                                            }
                                        }
                                    } else {
                                        C37111EhP.LIZIZ(xml);
                                    }
                                }
                            }
                        } else {
                            C37111EhP.LIZIZ(xml);
                        }
                    }
                } catch (IOException | IllegalStateException | XmlPullParserException unused) {
                }
            }
            c35959E9j = c35960E9k.LIZ();
            if (c35959E9j == null) {
                LIZJ.LIZJ("Can't parse languages metadata.", 5, new Object[0]);
            }
            return c35959E9j;
        } catch (Resources.NotFoundException unused2) {
            LIZJ.LIZJ("Resource with languages metadata doesn't exist.", 5, new Object[0]);
            return null;
        }
    }

    public static boolean LIZLLL(String str) {
        if (str.startsWith("config.") || str.contains(".config.")) {
            return true;
        }
        return false;
    }
}

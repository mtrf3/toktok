package X;

import defpackage.a1;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.TreeMap;
import java.util.TreeSet;

/* renamed from: X.PXe, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C64606PXe {
    public final String[] LIZ;

    public final long LIZ() {
        String[] strArr = this.LIZ;
        long length = strArr.length * 2;
        for (int i = 0; i < strArr.length; i++) {
            length += this.LIZ[i].length();
        }
        return length;
    }

    public final java.util.Set<String> LJFF() {
        TreeSet treeSet = new TreeSet(String.CASE_INSENSITIVE_ORDER);
        int length = this.LIZ.length / 2;
        for (int i = 0; i < length; i++) {
            treeSet.add(LJ(i));
        }
        return Collections.unmodifiableSet(treeSet);
    }

    public final C64605PXd LJI() {
        C64605PXd c64605PXd = new C64605PXd();
        Collections.addAll(c64605PXd.LIZ, this.LIZ);
        return c64605PXd;
    }

    public final int LJIIIIZZ() {
        return this.LIZ.length / 2;
    }

    public final java.util.Map<String, List<String>> LJIIIZ() {
        TreeMap treeMap = new TreeMap(String.CASE_INSENSITIVE_ORDER);
        int length = this.LIZ.length / 2;
        for (int i = 0; i < length; i++) {
            String lowerCase = LJ(i).toLowerCase(Locale.US);
            List list = (List) treeMap.get(lowerCase);
            if (list == null) {
                list = new ArrayList(2);
                treeMap.put(lowerCase, list);
            }
            list.add(LJIIJ(i));
        }
        return treeMap;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.LIZ);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        int length = this.LIZ.length / 2;
        for (int i = 0; i < length; i++) {
            sb.append(LJ(i));
            sb.append(": ");
            sb.append(LJIIJ(i));
            sb.append("\n");
        }
        return sb.toString();
    }

    public C64606PXe(C64605PXd c64605PXd) {
        ArrayList arrayList = (ArrayList) c64605PXd.LIZ;
        this.LIZ = (String[]) arrayList.toArray(new String[arrayList.size()]);
    }

    public static void LIZIZ(String str) {
        if (str != null) {
            if (!str.isEmpty()) {
                int length = str.length();
                for (int i = 0; i < length; i++) {
                    char charAt = str.charAt(i);
                    if (charAt <= ' ' || charAt >= 127) {
                        throw new IllegalArgumentException(PVA.LJIIJJI("Unexpected char %#04x at %d in header name: %s", Integer.valueOf(charAt), Integer.valueOf(i), str));
                    }
                }
                return;
            }
            throw new IllegalArgumentException("name is empty");
        }
        throw new NullPointerException("name == null");
    }

    public static C64606PXe LJII(String... strArr) {
        if (strArr.length % 2 == 0) {
            String[] strArr2 = (String[]) strArr.clone();
            for (int i = 0; i < strArr2.length; i++) {
                String str = strArr2[i];
                if (str != null) {
                    strArr2[i] = str.trim();
                } else {
                    throw new IllegalArgumentException("Headers cannot be null");
                }
            }
            for (int i2 = 0; i2 < strArr2.length; i2 += 2) {
                String str2 = strArr2[i2];
                String str3 = strArr2[i2 + 1];
                LIZIZ(str2);
                LIZJ(str3, str2);
            }
            return new C64606PXe(strArr2);
        }
        throw new IllegalArgumentException("Expected alternating header names and values");
    }

    public final String LIZLLL(String str) {
        String[] strArr = this.LIZ;
        int length = strArr.length;
        do {
            length -= 2;
            if (length < 0) {
                return null;
            }
        } while (!str.equalsIgnoreCase(strArr[length]));
        return strArr[length + 1];
    }

    public final String LJ(int i) {
        return this.LIZ[i * 2];
    }

    public final String LJIIJ(int i) {
        return this.LIZ[(i * 2) + 1];
    }

    public final List<String> LJIIJJI(String str) {
        int length = this.LIZ.length / 2;
        ArrayList arrayList = null;
        for (int i = 0; i < length; i++) {
            if (str.equalsIgnoreCase(LJ(i))) {
                if (arrayList == null) {
                    arrayList = new ArrayList(2);
                }
                arrayList.add(LJIIJ(i));
            }
        }
        if (arrayList != null) {
            return Collections.unmodifiableList(arrayList);
        }
        return Collections.emptyList();
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof C64606PXe) && Arrays.equals(((C64606PXe) obj).LIZ, this.LIZ)) {
            return true;
        }
        return false;
    }

    public C64606PXe(String[] strArr) {
        this.LIZ = strArr;
    }

    public static void LIZJ(String str, String str2) {
        if (str != null) {
            int length = str.length();
            for (int i = 0; i < length; i++) {
                char charAt = str.charAt(i);
                if (charAt <= 31) {
                    if (charAt != '\t') {
                        throw new IllegalArgumentException(PVA.LJIIJJI("Unexpected char %#04x at %d in %s value: %s", Integer.valueOf(charAt), Integer.valueOf(i), str2, str));
                    }
                } else {
                    if (charAt >= 127) {
                        throw new IllegalArgumentException(PVA.LJIIJJI("Unexpected char %#04x at %d in %s value: %s", Integer.valueOf(charAt), Integer.valueOf(i), str2, str));
                    }
                }
            }
            return;
        }
        throw new NullPointerException(a1.LJ("value for name ", str2, " == null"));
    }
}

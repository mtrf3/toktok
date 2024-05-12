package X;

import defpackage.a1;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Locale;

/* renamed from: X.1Pq, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C32581Pq implements InterfaceC10670bP {
    public static final Locale[] LIZIZ = new Locale[0];
    public final Locale[] LIZ;

    static {
        new Locale("en", "XA");
        new Locale("ar", "XB");
        String[] split = "en-Latn".split("-", -1);
        if (split.length > 2) {
            new Locale(split[0], split[1], split[2]);
        } else if (split.length > 1) {
            new Locale(split[0], split[1]);
        } else {
            if (split.length == 1) {
                new Locale(split[0]);
                return;
            }
            throw new IllegalArgumentException(a1.LJ("Can not parse language tag: [", "en-Latn", "]"));
        }
    }

    @Override // X.InterfaceC10670bP
    public final Object LIZ() {
        return null;
    }

    @Override // X.InterfaceC10670bP
    public final Locale get() {
        Locale[] localeArr = this.LIZ;
        if (localeArr.length > 0) {
            return localeArr[0];
        }
        return null;
    }

    public final int hashCode() {
        int i = 1;
        for (Locale locale : this.LIZ) {
            i = (i * 31) + locale.hashCode();
        }
        return i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("[");
        int i = 0;
        while (true) {
            Locale[] localeArr = this.LIZ;
            if (i < localeArr.length) {
                sb.append(localeArr[i]);
                if (i < this.LIZ.length - 1) {
                    sb.append(',');
                }
                i++;
            } else {
                sb.append("]");
                return sb.toString();
            }
        }
    }

    public C32581Pq(Locale... localeArr) {
        if (localeArr.length == 0) {
            this.LIZ = LIZIZ;
            return;
        }
        ArrayList arrayList = new ArrayList();
        HashSet hashSet = new HashSet();
        for (int i = 0; i < localeArr.length; i++) {
            Locale locale = localeArr[i];
            if (locale != null) {
                if (!hashSet.contains(locale)) {
                    Locale locale2 = (Locale) locale.clone();
                    arrayList.add(locale2);
                    locale2.getLanguage();
                    String country = locale2.getCountry();
                    if (country != null && !country.isEmpty()) {
                        locale2.getCountry();
                    }
                    hashSet.add(locale2);
                }
            } else {
                throw new NullPointerException(C0NY.LIZIZ("list[", i, "] is null"));
            }
        }
        this.LIZ = (Locale[]) arrayList.toArray(new Locale[0]);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C32581Pq)) {
            return false;
        }
        Locale[] localeArr = ((C32581Pq) obj).LIZ;
        if (this.LIZ.length != localeArr.length) {
            return false;
        }
        int i = 0;
        while (true) {
            Locale[] localeArr2 = this.LIZ;
            if (i >= localeArr2.length) {
                return true;
            }
            if (!localeArr2[i].equals(localeArr[i])) {
                return false;
            }
            i++;
        }
    }
}

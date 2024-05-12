package X;

import android.os.Bundle;
import java.util.EnumMap;

/* renamed from: X.Qnu, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C68090Qnu {
    public static final C68090Qnu LIZIZ = new C68090Qnu(null, null);
    public final EnumMap LIZ;

    public final String LJ() {
        char c;
        StringBuilder sb = new StringBuilder("G1");
        EnumC68125QoT[] enumC68125QoTArr = EnumC68125QoT.zzc;
        int i = 0;
        do {
            Boolean bool = (Boolean) this.LIZ.get(enumC68125QoTArr[i]);
            if (bool == null) {
                c = '-';
            } else if (bool.booleanValue()) {
                c = '1';
            } else {
                c = '0';
            }
            sb.append(c);
            i++;
        } while (i < 2);
        return sb.toString();
    }

    public final int hashCode() {
        int i;
        int i2 = 17;
        for (Boolean bool : this.LIZ.values()) {
            int i3 = i2 * 31;
            if (bool == null) {
                i = 0;
            } else if (bool.booleanValue()) {
                i = 1;
            } else {
                i = 2;
            }
            i2 = i3 + i;
        }
        return i2;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("settings: ");
        EnumC68125QoT[] values = EnumC68125QoT.values();
        int length = values.length;
        for (int i = 0; i < length; i++) {
            EnumC68125QoT enumC68125QoT = values[i];
            if (i != 0) {
                sb.append(", ");
            }
            sb.append(enumC68125QoT.name());
            sb.append("=");
            Boolean bool = (Boolean) this.LIZ.get(enumC68125QoT);
            if (bool == null) {
                sb.append("uninitialized");
            } else {
                if (true != bool.booleanValue()) {
                    str = "denied";
                } else {
                    str = "granted";
                }
                sb.append(str);
            }
        }
        return sb.toString();
    }

    public C68090Qnu(EnumMap enumMap) {
        EnumMap enumMap2 = new EnumMap(EnumC68125QoT.class);
        this.LIZ = enumMap2;
        enumMap2.putAll(enumMap);
    }

    public static C68090Qnu LIZ(Bundle bundle) {
        if (bundle == null) {
            return LIZIZ;
        }
        EnumMap enumMap = new EnumMap(EnumC68125QoT.class);
        for (EnumC68125QoT enumC68125QoT : EnumC68125QoT.values()) {
            String string = bundle.getString(enumC68125QoT.zzd);
            Boolean bool = null;
            if (string != null) {
                if (string.equals("granted")) {
                    bool = Boolean.TRUE;
                } else if (string.equals("denied")) {
                    bool = Boolean.FALSE;
                }
            }
            enumMap.put((EnumMap) enumC68125QoT, (EnumC68125QoT) bool);
        }
        return new C68090Qnu(enumMap);
    }

    public static C68090Qnu LIZIZ(String str) {
        EnumMap enumMap = new EnumMap(EnumC68125QoT.class);
        if (str != null) {
            int i = 0;
            while (true) {
                EnumC68125QoT[] enumC68125QoTArr = EnumC68125QoT.zzc;
                if (i >= 2) {
                    break;
                }
                EnumC68125QoT enumC68125QoT = enumC68125QoTArr[i];
                int i2 = i + 2;
                if (i2 < str.length()) {
                    char charAt = str.charAt(i2);
                    Boolean bool = null;
                    if (charAt != '-') {
                        if (charAt != '0') {
                            if (charAt == '1') {
                                bool = Boolean.TRUE;
                            }
                        } else {
                            bool = Boolean.FALSE;
                        }
                    }
                    enumMap.put((EnumMap) enumC68125QoT, (EnumC68125QoT) bool);
                }
                i++;
            }
        }
        return new C68090Qnu(enumMap);
    }

    public final C68090Qnu LIZJ(C68090Qnu c68090Qnu) {
        boolean z;
        EnumMap enumMap = new EnumMap(EnumC68125QoT.class);
        for (EnumC68125QoT enumC68125QoT : EnumC68125QoT.values()) {
            Boolean bool = (Boolean) this.LIZ.get(enumC68125QoT);
            Boolean bool2 = (Boolean) c68090Qnu.LIZ.get(enumC68125QoT);
            if (bool == null) {
                bool = bool2;
            } else if (bool2 != null) {
                if (bool.booleanValue() && bool2.booleanValue()) {
                    z = true;
                } else {
                    z = false;
                }
                bool = Boolean.valueOf(z);
            }
            enumMap.put((EnumMap) enumC68125QoT, (EnumC68125QoT) bool);
        }
        return new C68090Qnu(enumMap);
    }

    public final C68090Qnu LIZLLL(C68090Qnu c68090Qnu) {
        EnumMap enumMap = new EnumMap(EnumC68125QoT.class);
        for (EnumC68125QoT enumC68125QoT : EnumC68125QoT.values()) {
            Object obj = this.LIZ.get(enumC68125QoT);
            if (obj == null) {
                obj = c68090Qnu.LIZ.get(enumC68125QoT);
            }
            enumMap.put((EnumMap) enumC68125QoT, (EnumC68125QoT) obj);
        }
        return new C68090Qnu(enumMap);
    }

    public final boolean LJFF(EnumC68125QoT enumC68125QoT) {
        Boolean bool = (Boolean) this.LIZ.get(enumC68125QoT);
        if (bool == null || bool.booleanValue()) {
            return true;
        }
        return false;
    }

    public final boolean equals(Object obj) {
        char c;
        if (!(obj instanceof C68090Qnu)) {
            return false;
        }
        C68090Qnu c68090Qnu = (C68090Qnu) obj;
        EnumC68125QoT[] values = EnumC68125QoT.values();
        int length = values.length;
        int i = 0;
        while (true) {
            char c2 = 1;
            if (i >= length) {
                return true;
            }
            EnumC68125QoT enumC68125QoT = values[i];
            Boolean bool = (Boolean) this.LIZ.get(enumC68125QoT);
            if (bool == null) {
                c = 0;
            } else if (bool.booleanValue()) {
                c = 1;
            } else {
                c = 2;
            }
            Boolean bool2 = (Boolean) c68090Qnu.LIZ.get(enumC68125QoT);
            if (bool2 == null) {
                c2 = 0;
            } else if (!bool2.booleanValue()) {
                c2 = 2;
            }
            if (c != c2) {
                return false;
            }
            i++;
        }
    }

    public C68090Qnu(Boolean bool, Boolean bool2) {
        EnumMap enumMap = new EnumMap(EnumC68125QoT.class);
        this.LIZ = enumMap;
        enumMap.put((EnumMap) EnumC68125QoT.AD_STORAGE, (EnumC68125QoT) bool);
        enumMap.put((EnumMap) EnumC68125QoT.ANALYTICS_STORAGE, (EnumC68125QoT) bool2);
    }

    public final boolean LJI(C68090Qnu c68090Qnu, EnumC68125QoT... enumC68125QoTArr) {
        for (EnumC68125QoT enumC68125QoT : enumC68125QoTArr) {
            Object obj = this.LIZ.get(enumC68125QoT);
            Object obj2 = c68090Qnu.LIZ.get(enumC68125QoT);
            Boolean bool = Boolean.FALSE;
            if (obj == bool && obj2 != bool) {
                return true;
            }
        }
        return false;
    }
}

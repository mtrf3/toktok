package X;

import com.bytedance.android.livesdk.livesetting.linkmic.LivesdkLinkmicFloatWindowOptimizeSetting;
import com.bytedance.mt.protector.impl.PatternProtector;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.regex.PatternSyntaxException;

/* renamed from: X.QqV, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public abstract class AbstractC68251QqV {
    public final String LIZ;
    public final int LIZIZ;
    public Boolean LIZJ;
    public Boolean LIZLLL;
    public Long LJ;
    public Long LJFF;

    public AbstractC68251QqV(String str, int i) {
        this.LIZ = str;
        this.LIZIZ = i;
    }

    public abstract int LIZ();

    public abstract boolean LIZIZ();

    public abstract boolean LIZJ();

    public static Boolean LJFF(Boolean bool, boolean z) {
        boolean z2;
        if (bool == null) {
            return null;
        }
        if (bool.booleanValue() != z) {
            z2 = true;
        } else {
            z2 = false;
        }
        return Boolean.valueOf(z2);
    }

    public static Boolean LIZLLL(BigDecimal bigDecimal, C68269Qqn c68269Qqn, double d) {
        BigDecimal bigDecimal2;
        BigDecimal bigDecimal3;
        BigDecimal bigDecimal4;
        QH7.LJIIIIZZ(c68269Qqn);
        if (c68269Qqn.LJIJJ()) {
            boolean z = true;
            if (c68269Qqn.LJJIFFI() != 1) {
                if (c68269Qqn.LJJIFFI() == 5) {
                    if (!c68269Qqn.LJJI() || !c68269Qqn.LJJ()) {
                        return null;
                    }
                } else if (!c68269Qqn.LJIJJLI()) {
                    return null;
                }
                int LJJIFFI = c68269Qqn.LJJIFFI();
                if (c68269Qqn.LJJIFFI() == 5) {
                    if (C68243QqN.LJJIJIIJI(c68269Qqn.zzi) && C68243QqN.LJJIJIIJI(c68269Qqn.zzj)) {
                        try {
                            bigDecimal3 = new BigDecimal(c68269Qqn.zzi);
                            bigDecimal4 = new BigDecimal(c68269Qqn.zzj);
                            bigDecimal2 = null;
                        } catch (NumberFormatException unused) {
                        }
                    }
                    return null;
                }
                if (!C68243QqN.LJJIJIIJI(c68269Qqn.zzh)) {
                    return null;
                }
                try {
                    bigDecimal2 = new BigDecimal(c68269Qqn.zzh);
                    bigDecimal3 = null;
                    bigDecimal4 = null;
                } catch (NumberFormatException unused2) {
                }
                if (LJJIFFI == 5) {
                    if (bigDecimal3 == null) {
                        return null;
                    }
                } else if (bigDecimal2 == null) {
                    return null;
                }
                int i = LJJIFFI - 1;
                if (i != 1) {
                    if (i != 2) {
                        if (i != 3) {
                            if (i != 4 || bigDecimal3 == null) {
                                return null;
                            }
                            if (bigDecimal.compareTo(bigDecimal3) < 0 || bigDecimal.compareTo(bigDecimal4) > 0) {
                                z = false;
                            }
                            return Boolean.valueOf(z);
                        }
                        if (bigDecimal2 == null) {
                            return null;
                        }
                        if (d != LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX) {
                            if (bigDecimal.compareTo(bigDecimal2.subtract(new BigDecimal(d).multiply(new BigDecimal(2)))) <= 0 || bigDecimal.compareTo(bigDecimal2.add(new BigDecimal(d).multiply(new BigDecimal(2)))) >= 0) {
                                z = false;
                            }
                            return Boolean.valueOf(z);
                        }
                        if (bigDecimal.compareTo(bigDecimal2) != 0) {
                            z = false;
                        }
                        return Boolean.valueOf(z);
                    }
                    if (bigDecimal2 == null) {
                        return null;
                    }
                    if (bigDecimal.compareTo(bigDecimal2) <= 0) {
                        z = false;
                    }
                    return Boolean.valueOf(z);
                }
                if (bigDecimal2 == null) {
                    return null;
                }
                if (bigDecimal.compareTo(bigDecimal2) >= 0) {
                    z = false;
                }
                return Boolean.valueOf(z);
            }
        }
        return null;
    }

    public static Boolean LJ(String str, C68270Qqo c68270Qqo, C67280Qaq c67280Qaq) {
        String str2;
        List list;
        String str3;
        int i;
        QH7.LJIIIIZZ(c68270Qqo);
        Boolean bool = null;
        if (str == null || !c68270Qqo.LJIL() || c68270Qqo.LJJ() == 1) {
            return null;
        }
        if (c68270Qqo.LJJ() == 7) {
            if (c68270Qqo.zzi.size() == 0) {
                return null;
            }
        } else if (!c68270Qqo.LJIJJLI()) {
            return null;
        }
        int LJJ = c68270Qqo.LJJ();
        boolean z = c68270Qqo.zzh;
        if (z || LJJ == 2 || LJJ == 7) {
            str2 = c68270Qqo.zzg;
        } else {
            str2 = c68270Qqo.zzg.toUpperCase(Locale.ENGLISH);
        }
        if (c68270Qqo.zzi.size() == 0) {
            list = null;
        } else {
            list = c68270Qqo.zzi;
            if (!z) {
                ArrayList arrayList = new ArrayList(list.size());
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(((String) it.next()).toUpperCase(Locale.ENGLISH));
                }
                list = Collections.unmodifiableList(arrayList);
            }
        }
        if (LJJ == 2) {
            str3 = str2;
        } else {
            str3 = null;
        }
        if (LJJ == 7) {
            if (list == null || list.isEmpty()) {
                return null;
            }
        } else if (str2 == null) {
            return null;
        }
        if (!z && LJJ != 2) {
            str = str.toUpperCase(Locale.ENGLISH);
        }
        switch (LJJ - 1) {
            case 1:
                if (str3 == null) {
                    return null;
                }
                if (true != z) {
                    i = 66;
                } else {
                    i = 0;
                }
                try {
                    bool = Boolean.valueOf(PatternProtector.compile(str3, i).matcher(str).matches());
                    return bool;
                } catch (PatternSyntaxException unused) {
                    if (c67280Qaq == null) {
                        return bool;
                    }
                    c67280Qaq.LJIIIIZZ.LIZIZ(str3, "Invalid regular expression in REGEXP audience filter. expression");
                    return bool;
                }
            case 2:
                return Boolean.valueOf(str.startsWith(str2));
            case 3:
                return Boolean.valueOf(str.endsWith(str2));
            case 4:
                return Boolean.valueOf(str.contains(str2));
            case 5:
                return Boolean.valueOf(str.equals(str2));
            case 6:
                if (list == null) {
                    return null;
                }
                return Boolean.valueOf(list.contains(str));
            default:
                return null;
        }
    }
}

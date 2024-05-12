package X;

import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;
import ujb.s;

/* renamed from: X.a2x, reason: case insensitive filesystem */
/* loaded from: classes20.dex */
public final class C91955a2x {
    public static final OJD LIZ = new OJD("[.-]");
    public static final OJD LIZIZ = new OJD("[^\\d]");
    public static final List<String> LIZJ = C47261Igj.LJJIJIIJI("00000000000", "11111111111", "22222222222", "33333333333", "44444444444", "55555555555", "66666666666", "77777777777", "88888888888", "99999999999", "12345678909");

    public static boolean LIZ(String value) {
        OJD ojd;
        o.LJIIIZ(value, "value");
        if (o.LJ(Boolean.TRUE, null)) {
            ojd = LIZ;
        } else {
            ojd = LIZIZ;
        }
        String replace = ojd.replace(value, "");
        if (replace.length() == 0 || replace.length() != 11 || LIZJ.contains(replace)) {
            return false;
        }
        String substring = replace.substring(0, 9);
        o.LJIIIIZZ(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        String LJIILLIIL = o.LJIILLIIL(Integer.valueOf(LIZIZ(substring)), substring);
        String substring2 = o.LJIILLIIL(Integer.valueOf(LIZIZ(LJIILLIIL)), LJIILLIIL).substring(9);
        o.LJIIIIZZ(substring2, "this as java.lang.String).substring(startIndex)");
        String substring3 = replace.substring(9);
        o.LJIIIIZZ(substring3, "this as java.lang.String).substring(startIndex)");
        return o.LJ(substring2, substring3);
    }

    public static int LIZIZ(String str) {
        List LJLJJL = s.LJLJJL(str, new String[]{""}, 0, 6);
        ArrayList arrayList = new ArrayList();
        for (Object obj : LJLJJL) {
            if (((String) obj).length() > 0) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(C32I.LJJL(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(Integer.valueOf(CastIntegerProtector.parseInt((String) it.next())));
        }
        int size = arrayList2.size() + 1;
        ArrayList arrayList3 = new ArrayList(C32I.LJJL(arrayList2, 10));
        Iterator it2 = arrayList2.iterator();
        int i = 0;
        while (it2.hasNext()) {
            Object next = it2.next();
            int i2 = i + 1;
            if (i >= 0) {
                arrayList3.add(Integer.valueOf(((Number) next).intValue() * (size - i)));
                i = i2;
            } else {
                C47261Igj.LJJJJJ();
                throw null;
            }
        }
        Iterator it3 = arrayList3.iterator();
        if (it3.hasNext()) {
            Object next2 = it3.next();
            while (it3.hasNext()) {
                next2 = Integer.valueOf(((Number) next2).intValue() + ((Number) it3.next()).intValue());
            }
            int intValue = ((Number) next2).intValue() % 11;
            if (intValue < 2) {
                return 0;
            }
            return 11 - intValue;
        }
        throw new UnsupportedOperationException("Empty collection can't be reduced.");
    }
}

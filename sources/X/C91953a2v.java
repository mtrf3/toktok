package X;

import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;
import ujb.s;

/* renamed from: X.a2v, reason: case insensitive filesystem */
/* loaded from: classes20.dex */
public final class C91953a2v {
    public static final OJD LIZ = new OJD("[-\\/.]");
    public static final OJD LIZIZ = new OJD("[^\\d]");
    public static final List<String> LIZJ = C47261Igj.LJJIJIIJI("00000000000000", "11111111111111", "22222222222222", "33333333333333", "44444444444444", "55555555555555", "66666666666666", "77777777777777", "88888888888888", "99999999999999");

    public static boolean LIZ(String value) {
        OJD ojd;
        o.LJIIIZ(value, "value");
        if (o.LJ(Boolean.TRUE, null)) {
            ojd = LIZ;
        } else {
            ojd = LIZIZ;
        }
        String replace = ojd.replace(value, "");
        if (replace.length() == 0 || replace.length() != 14 || LIZJ.contains(replace)) {
            return false;
        }
        String substring = replace.substring(0, 12);
        o.LJIIIIZZ(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        String LJIILLIIL = o.LJIILLIIL(Integer.valueOf(LIZIZ(substring)), substring);
        String substring2 = o.LJIILLIIL(Integer.valueOf(LIZIZ(LJIILLIIL)), LJIILLIIL).substring(12);
        o.LJIIIIZZ(substring2, "this as java.lang.String).substring(startIndex)");
        String substring3 = replace.substring(12);
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
        List list = C61878OQg.INSTANCE;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            list = ORZ.LLIIIZ(list, C47261Igj.LJJIJ(Integer.valueOf(CastIntegerProtector.parseInt((String) it.next()))));
        }
        Iterator it2 = list.iterator();
        int i = 0;
        loop2: while (true) {
            int i2 = 2;
            while (it2.hasNext()) {
                i += ((Number) it2.next()).intValue() * i2;
                if (i2 == 9) {
                    break;
                }
                i2++;
            }
        }
        int i3 = i % 11;
        if (i3 < 2) {
            return 0;
        }
        return 11 - i3;
    }
}

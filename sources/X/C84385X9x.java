package X;

import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.X9x, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C84385X9x implements XC4 {
    public final List<String> LIZ = C47261Igj.LJJIJIIJI("52310", "42494", "22435", "52308", "22428", "29412", "23202", "85256", "51522", "51092", "45973", "40781");
    public final List<String> LIZIZ = C47261Igj.LJJIJIIJI("52352", "42504", "50593", "249501", "22146", "166469", "221655", "234650", "240739", "203226");

    public static boolean LIZ(String str) {
        C12310e3 c12310e3 = C12310e3.LIZIZ;
        StringBuilder LIZIZ = C25620zW.LIZIZ("cleaneffect: isCountry:", str, " now:");
        C0FT c0ft = XBJ.LJIIJ;
        LIZIZ.append(c0ft);
        String LIZIZ2 = X1D.LIZIZ(LIZIZ);
        c12310e3.getClass();
        C12310e3.LIZ("EffectDiskLruCache", LIZIZ2);
        if (!C107244Iu.LIZIZ(str) && o.LJ(str, c0ft.LIZ)) {
            return true;
        }
        return false;
    }

    @Override // X.XC4
    public final boolean isAllowed(String key) {
        o.LJIIJ(key, "key");
        if (C107244Iu.LIZIZ(key)) {
            return false;
        }
        C12310e3 c12310e3 = C12310e3.LIZIZ;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("cleaneffect: allowlist：");
        LIZ.append(key);
        String LIZIZ = X1D.LIZIZ(LIZ);
        c12310e3.getClass();
        C12310e3.LIZ("EffectDiskLruCache", LIZIZ);
        InterfaceC84387X9z interfaceC84387X9z = (InterfaceC84387X9z) XBJ.LJIIIZ.LIZ;
        if (interfaceC84387X9z != null) {
            String string = interfaceC84387X9z.getString(key, "");
            if (LIZ("BR") && this.LIZ.contains(string)) {
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("cleaneffect: allowlist：BR, key: ");
                LIZ2.append(key);
                C12310e3.LIZ("EffectDiskLruCache", X1D.LIZIZ(LIZ2));
                return true;
            }
            if (LIZ("RU") && this.LIZIZ.contains(string)) {
                StringBuilder LIZ3 = X1D.LIZ();
                LIZ3.append("cleaneffect: allowlist：RU, key: ");
                LIZ3.append(key);
                C12310e3.LIZ("EffectDiskLruCache", X1D.LIZIZ(LIZ3));
                return true;
            }
            List list = (List) XBJ.LJIIJJI.LIZ;
            if (list != null && list.contains(key)) {
                StringBuilder LIZ4 = X1D.LIZ();
                LIZ4.append("cleaneffect: allowlist：draft, key: ");
                LIZ4.append(key);
                C12310e3.LIZ("EffectDiskLruCache", X1D.LIZIZ(LIZ4));
                return true;
            }
        }
        return false;
    }
}

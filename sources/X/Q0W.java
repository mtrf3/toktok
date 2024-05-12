package X;

import com.google.gson.m;
import com.google.gson.p;
import kotlin.jvm.internal.o;

/* loaded from: classes12.dex */
public final class Q0W implements InterfaceC66313Q0v {
    public m LIZ;
    public final int LIZIZ;

    public Q0W(int i) {
        this.LIZIZ = i;
    }

    public static EnumC66308Q0q LIZIZ(String str) {
        int hashCode = str.hashCode();
        if (hashCode != 3344077) {
            if (hashCode != 3433489) {
                if (hashCode == 93832333 && str.equals("block")) {
                    return EnumC66308Q0q.ERROR;
                }
            } else if (str.equals("pass")) {
                return EnumC66308Q0q.IGNORE;
            }
        } else if (str.equals("mark")) {
            return EnumC66308Q0q.WARNING;
        }
        return EnumC66308Q0q.IGNORE;
    }

    public static boolean LIZJ(OHW ohw) {
        String[] strArr = ohw.LIZLLL;
        if (strArr != null && ORY.LJJIJIIJIL("clipboard", strArr)) {
            return true;
        }
        String[] strArr2 = ohw.LIZLLL;
        if (strArr2 != null && ORY.LJJIJIIJIL("location", strArr2)) {
            return true;
        }
        String[] strArr3 = ohw.LIZLLL;
        if (strArr3 != null && ORY.LJJIJIIJIL("video", strArr3)) {
            return true;
        }
        String[] strArr4 = ohw.LIZLLL;
        if (strArr4 != null && ORY.LJJIJIIJIL("audio", strArr4)) {
            return true;
        }
        String[] strArr5 = ohw.LIZLLL;
        if (strArr5 != null && ORY.LJJIJIIJIL("contact", strArr5)) {
            return true;
        }
        String[] strArr6 = ohw.LIZLLL;
        if (strArr6 != null && ORY.LJJIJIIJIL(OHQ.LIZ, strArr6)) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC66313Q0v
    public final EnumC66308Q0q LIZ(OHW context) {
        Object LIZ;
        String[] strArr;
        m mVar;
        m LJJIJIL;
        p LJJIJL;
        m LJJIJIL2;
        p LJJIJL2;
        o.LJIIIZ(context, "context");
        System.nanoTime();
        String str = "";
        try {
            String[] strArr2 = context.LIZLLL;
            if (strArr2 != null) {
                for (String str2 : strArr2) {
                    StringBuilder LIZ2 = X1D.LIZ();
                    LIZ2.append(str);
                    LIZ2.append(str2);
                    String LIZIZ = X1D.LIZIZ(LIZ2);
                    StringBuilder LIZ3 = X1D.LIZ();
                    LIZ3.append(LIZIZ);
                    LIZ3.append(",");
                    str = X1D.LIZIZ(LIZ3);
                }
            }
            if (str.length() > 0) {
                str = str.substring(0, str.length() - 1);
                o.LJIIIIZZ(str, "(this as java.lang.Strin…ing(startIndex, endIndex)");
            }
            mVar = this.LIZ;
        } catch (Throwable th) {
            LIZ = C141335gf.LIZ(th);
            C3C5.m7constructorimpl(LIZ);
        }
        if (mVar != null && (LJJIJIL2 = mVar.LJJIJIL(str)) != null && (LJJIJL2 = LJJIJIL2.LJJIJL(String.valueOf(this.LIZIZ))) != null && (LJJIJL2.LJLIL instanceof String)) {
            String asString = LJJIJL2.LJJIFFI();
            o.LJIIIIZZ(asString, "asString");
            return LIZIZ(asString);
        }
        m mVar2 = this.LIZ;
        if (mVar2 != null && (LJJIJIL = mVar2.LJJIJIL("_default")) != null && (LJJIJL = LJJIJIL.LJJIJL(String.valueOf(this.LIZIZ))) != null) {
            if (LJJIJL.LJLIL instanceof String) {
                String asString2 = LJJIJL.LJJIFFI();
                o.LJIIIIZZ(asString2, "asString");
                return LIZIZ(asString2);
            }
            LIZ = C76800UCe.LIZ;
        } else {
            LIZ = null;
        }
        C3C5.m7constructorimpl(LIZ);
        C3C5.m10exceptionOrNullimpl(LIZ);
        int i = this.LIZIZ;
        if (i != -2101) {
            if (i != -1001 && i != -1000) {
                return EnumC66308Q0q.WARNING;
            }
            if (LIZJ(context)) {
                return EnumC66308Q0q.WARNING;
            }
            return EnumC66308Q0q.IGNORE;
        }
        String[] strArr3 = context.LIZLLL;
        if ((strArr3 != null && ORY.LJJIJIIJIL("contact", strArr3)) || ((strArr = context.LIZLLL) != null && ORY.LJJIJIIJIL("location", strArr))) {
            return EnumC66308Q0q.WARNING;
        }
        return EnumC66308Q0q.IGNORE;
    }
}

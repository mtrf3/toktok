package X;

import com.google.gson.g;
import com.google.gson.j;
import com.google.gson.m;
import kotlin.jvm.internal.o;

/* renamed from: X.DvL, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C35427DvL {
    public static AbstractC35426DvK LIZ(g gVar, EnumC35437DvV rule) {
        Object LIZ;
        o.LJIIJ(rule, "rule");
        if (gVar.size() == 0) {
            return null;
        }
        try {
            j LJJIIZ = gVar.LJJIIZ(0);
            o.LJFF(LJJIIZ, "jsonArray.get(0)");
            LIZ = LJJIIZ.LJIIZILJ();
            C3C5.m7constructorimpl(LIZ);
        } catch (Throwable th) {
            LIZ = C141335gf.LIZ(th);
            C3C5.m7constructorimpl(LIZ);
        }
        if (C3C5.m12isFailureimpl(LIZ)) {
            LIZ = null;
        }
        m mVar = (m) LIZ;
        if (mVar == null) {
            return null;
        }
        int i = C35429DvN.LIZ[rule.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    return new C34899Dmp(gVar, mVar, 0);
                }
                throw new C162476Zf();
            }
            return new C35425DvJ(gVar, mVar, 0);
        }
        return new C35430DvO(gVar, mVar, 0);
    }
}

package X;

import com.google.gson.g;
import com.google.gson.j;
import com.google.gson.m;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class YHF extends YHP {
    @Override // X.YHP
    public final void LIZ(YHN chain, YHM yhm) {
        String str;
        String str2;
        j LJJIJ;
        o.LJIIIZ(chain, "chain");
        m LJJIJIL = chain.LIZ.LJFF.LJJIJIL("rst");
        if (LJJIJIL != null) {
            if (LJJIJIL.LJJIJLIJ("error_message")) {
                if (yhm != null) {
                    String jVar = LJJIJIL.toString();
                    o.LJIIIIZZ(jVar, "taskResult.toString()");
                    yhm.LIZ(-1, jVar, chain);
                    return;
                }
                return;
            }
            j LJJIJ2 = LJJIJIL.LJJIJ("function_name");
            String str3 = null;
            if (LJJIJ2 != null) {
                str = LJJIJ2.LJJIFFI();
            } else {
                str = null;
            }
            if (o.LJ(str, chain.LIZ.LIZIZ)) {
                if (!LJJIJIL.LJJIJLIJ("result_json")) {
                    return;
                }
                g resultArray = LJJIJIL.LJJIJIIJI("result_json");
                YHS yhs = YHS.LIZ;
                o.LJIIIIZZ(resultArray, "resultArray");
                ArrayList arrayList = new ArrayList(C32I.LJJL(resultArray, 10));
                Iterator<j> it = resultArray.iterator();
                while (it.hasNext()) {
                    j next = it.next();
                    next.getClass();
                    if (next instanceof m) {
                        try {
                            LJJIJ = next.LJIIZILJ().LJJIJ("aweme_id");
                        } catch (Throwable unused) {
                            str2 = "";
                        }
                        if (LJJIJ != null) {
                            str2 = LJJIJ.LJJIFFI();
                            arrayList.add(str2);
                        }
                    }
                    str2 = null;
                    arrayList.add(str2);
                }
                yhs.getClass();
                List LJLL = ORZ.LJLL(arrayList);
                YHH yhh = chain.LIZ;
                List<String> LLJILJILJ = ORZ.LLJILJILJ(LJLL);
                yhh.getClass();
                yhh.LJI = LLJILJILJ;
                try {
                    chain.LIZ.LJIIIIZZ = LJJIJIL.LJJIJ("should_request_candidate_ads").LJFF();
                    C3C5.m7constructorimpl(C76800UCe.LIZ);
                } catch (Throwable th) {
                    C3C5.m7constructorimpl(C141335gf.LIZ(th));
                }
                chain.LIZIZ(yhm);
                return;
            }
            if (yhm == null) {
                return;
            }
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("functionName not match. expect ");
            LIZ.append(chain.LIZ.LIZIZ);
            LIZ.append(" but ");
            j LJJIJ3 = LJJIJIL.LJJIJ("function_name");
            if (LJJIJ3 != null) {
                str3 = LJJIJ3.LJJIFFI();
            }
            yhm.LIZ(-1, JBR.LJFF(LIZ, str3, " found", LIZ), chain);
            return;
        }
        if (yhm == null) {
            return;
        }
        yhm.LIZ(-1, "taskResult is null", chain);
    }
}

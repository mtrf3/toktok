package X;

import com.ss.bduploader.util.BDUrlDispatchInterface;
import ee1.e;
import ee1.l;
import ee1.m;
import java.util.ArrayList;
import kotlin.jvm.internal.o;

/* renamed from: X.Pa3, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C64683Pa3 implements BDUrlDispatchInterface {
    public static final C64683Pa3 LIZ = new C64683Pa3();

    @Override // com.ss.bduploader.util.BDUrlDispatchInterface
    public final String doDispatchUrl(String str, String str2) {
        if (!((ArrayList) l.LJ().LIZLLL).isEmpty()) {
            e LIZ2 = l.LJ().LIZ(new m(str, str2));
            if (LIZ2 != null && !str.equals(LIZ2.LIZ)) {
                String str3 = LIZ2.LIZ;
                o.LJIIIIZZ(str3, "dispatchResult.mDispatchedURL");
                if (str3.length() == 0) {
                    o.LJIIIIZZ(LIZ2.LIZIZ, "dispatchResult.mActionRuleIdList");
                    if (!((ArrayList) r1).isEmpty()) {
                        return "";
                    }
                }
                if (!EZX.LIZ(LIZ2.LIZ)) {
                    return str;
                }
                return LIZ2.LIZ;
            }
            return str;
        }
        String LIZLLL = l.LJ().LIZLLL(str);
        if (str.equals(LIZLLL) || !EZX.LIZ(LIZLLL)) {
            return str;
        }
        return LIZLLL;
    }
}

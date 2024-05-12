package X;

import Y.AfS21S1100000_6;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.EaJ, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C36671EaJ {
    public static final /* synthetic */ int LIZ = 0;

    public static String LIZ(C64797Pbt c64797Pbt) {
        List<EJ6> LIZIZ;
        String str;
        C36910EeA c36910EeA = c64797Pbt.LIZ;
        if (c36910EeA == null || (LIZIZ = c36910EeA.LIZIZ("X-Tt-Logid")) == null || LIZIZ.size() <= 0 || (str = ((EJ6) ListProtector.get(LIZIZ, 0)).LIZIZ) == null) {
            return "";
        }
        return str;
    }

    public static C73422Sri LIZIZ(AbstractC73672Svk abstractC73672Svk, String str, OSZ... oszArr) {
        o.LJIIIZ(abstractC73672Svk, "<this>");
        return abstractC73672Svk.LJIJJLI(new AfS21S1100000_6(str, oszArr, 1)).LJIJJ(new AfS21S1100000_6(str, oszArr, 2));
    }

    public static void LIZJ(int i, String str, String str2, String str3, boolean z, OSZ... oszArr) {
        C76542zS.LIZJ("rd_tiktokec_common_network", new C27942Axu(i, str, str2, str3, z, oszArr));
    }
}

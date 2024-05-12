package X;

import com.bytedance.bpea.basics.Cert;
import java.util.Arrays;
import kotlin.jvm.internal.AqS141S0200000_10;
import kotlin.jvm.internal.o;

/* renamed from: X.Nyc, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C61110Nyc extends AbstractC61106NyY {
    /* JADX WARN: Failed to extract var names
    java.lang.NullPointerException
     */
    @Override // X.AbstractC61106NyY
    public final void LIZ(C61101NyT c61101NyT, String... strArr) {
        Object LIZ;
        o.LJIIIZ(strArr, OHQ.LIZIZ);
        if (c61101NyT != null) {
            if (!C61097NyP.LIZ || c61101NyT.LIZ == null) {
                c61101NyT.LIZIZ();
                return;
            }
            try {
                OHR ohr = OHQ.LIZJ;
                Object[] copyOf = Arrays.copyOf(strArr, strArr.length);
                o.LJIIIIZZ(copyOf, "copyOf(this, size)");
                Cert cert = c61101NyT.LIZ;
                AqS141S0200000_10 aqS141S0200000_10 = new AqS141S0200000_10(c61101NyT, c61101NyT, 26);
                ohr.getClass();
                OHR.LIZ((String[]) copyOf, cert, aqS141S0200000_10);
                LIZ = C76800UCe.LIZ;
                C3C5.m7constructorimpl(LIZ);
            } catch (Throwable th) {
                LIZ = C141335gf.LIZ(th);
                C3C5.m7constructorimpl(LIZ);
            }
            if (C3C5.m10exceptionOrNullimpl(LIZ) != null) {
                c61101NyT.LIZ();
            }
            C3C5.m6boximpl(LIZ);
        }
    }
}

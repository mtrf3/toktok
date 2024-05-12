package X;

import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.google.gson.s;
import com.ss.android.ugc.aweme.ecommerce.smartcheck.core.roma.RomaApiData;
import kotlin.jvm.internal.o;

/* renamed from: X.EDe, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C36058EDe {
    public static final /* synthetic */ int LIZ = 0;

    public static Object LIZ(boolean z, C3CS c3cs) {
        RomaApiData romaApiData;
        StringBuilder LJI = JBR.LJI("roma fetch: ", z, ", ");
        LJI.append(EDY.LIZ().getFetch().getSource());
        String message = X1D.LIZIZ(LJI);
        o.LJIIIZ(message, "message");
        int source = EDY.LIZ().getFetch().getSource();
        if (source != 1) {
            if (source != 2) {
                return C36061EDh.LIZ.LIZ(z, c3cs);
            }
            C36065EDl c36065EDl = C36065EDl.LIZ;
            if (z) {
                try {
                    Object fromJson = GsonProtectorUtils.fromJson(C27739Aud.LJFF(), C35367DuN.LIZ(2), C65330PkU.LIZJ(C65352Pkq.LJI(RomaApiData.class)));
                    if (!(fromJson instanceof RomaApiData)) {
                        fromJson = null;
                    }
                    romaApiData = (RomaApiData) fromJson;
                } catch (s unused) {
                    romaApiData = null;
                }
                if (romaApiData == null) {
                    return null;
                }
                return romaApiData.getData();
            }
            return c36065EDl.LIZ(c3cs);
        }
        return C36061EDh.LIZ.LIZ(z, c3cs);
    }
}

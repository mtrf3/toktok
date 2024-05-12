package X;

import com.bytedance.bpea.cert.token.TokenCert;
import kotlin.jvm.internal.AqS121S0300000_2;
import kotlin.jvm.internal.AqS162S0100000_12;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class T4E implements InterfaceC73997T2j {
    /* JADX WARN: Failed to extract var names
    java.lang.NullPointerException
     */
    @Override // X.InterfaceC73997T2j
    public final void LIZ(ActivityC45651qj activity, String[] strArr, AqS162S0100000_12 aqS162S0100000_12, AqS162S0100000_12 aqS162S0100000_122, final AqS121S0300000_2 aqS121S0300000_2) {
        o.LJIIIZ(activity, "activity");
        o.LJIIIZ(strArr, OHQ.LIZIZ);
        HVR.LJ(activity, new HPI() { // from class: X.6bR
            @Override // X.HPI
            public final void LIZ(int[] iArr, String[] strArr2) {
                aqS121S0300000_2.invoke(strArr2, iArr);
            }
        }, aqS162S0100000_12, aqS162S0100000_122, null, TokenCert.Companion.with((String) C78605Ut7.LJIIJ("bpea-tools_request_storage_permission_upload_sticker_target33", "bpea-tools_request_storage_permission_upload_sticker")), 16);
    }
}

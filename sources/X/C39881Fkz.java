package X;

import com.bytedance.lynx.hybrid.ssp.base.SSPResponse;
import com.bytedance.ttnet.TTNetInit;
import kotlin.jvm.internal.o;

/* renamed from: X.Fkz, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39881Fkz {
    public final /* synthetic */ C39902FlK LIZ;

    public C39881Fkz(C39902FlK c39902FlK) {
        this.LIZ = c39902FlK;
    }

    public static final void LIZ(SSPResponse.PreConnect info) {
        o.LJIIJ(info, "info");
        String str = info.domain;
        if (str != null) {
            try {
                TTNetInit.preconnectUrl(str);
                C3C5.m7constructorimpl(C76800UCe.LIZ);
            } catch (Throwable th) {
                C3C5.m7constructorimpl(C141335gf.LIZ(th));
            }
        }
    }
}

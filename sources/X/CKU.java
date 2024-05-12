package X;

import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class CKU implements InterfaceC31146CKg {
    public final /* synthetic */ CKP LIZ;

    public CKU(CKP ckp) {
        this.LIZ = ckp;
    }

    @Override // X.InterfaceC31146CKg
    public final void LIZ(String it) {
        java.util.Map<String, String> map = this.LIZ.LIZJ;
        o.LJIIIIZZ(it, "it");
        ((ConcurrentHashMap) map).put("cpu_soc", it);
    }
}

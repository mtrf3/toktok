package X;

import com.bytedance.pia.core.bridge.protocol.ProtocolMessage;
import com.bytedance.pia.core.plugins.BootPlugin;
import com.google.gson.m;

/* renamed from: X.EmU, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37426EmU implements BQ6<C37394Ely> {
    public final /* synthetic */ m LIZ;
    public final /* synthetic */ String LIZIZ;
    public final /* synthetic */ BootPlugin LIZJ;

    @Override // X.BQ6
    public final void accept(C37394Ely c37394Ely) {
        C37394Ely c37394Ely2 = c37394Ely;
        this.LIZ.LJJII("result", ProtocolMessage.LIZ(new C37428EmW(1, c37394Ely2.getCode(), null, c37394Ely2.getMessage())));
        this.LIZJ.LJII(this.LIZ, this.LIZIZ);
    }

    public C37426EmU(BootPlugin bootPlugin, m mVar, String str) {
        this.LIZJ = bootPlugin;
        this.LIZ = mVar;
        this.LIZIZ = str;
    }
}

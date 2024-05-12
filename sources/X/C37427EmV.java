package X;

import com.bytedance.pia.core.bridge.protocol.ProtocolMessage;
import com.bytedance.pia.core.plugins.BootPlugin;
import com.google.gson.m;

/* renamed from: X.EmV, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37427EmV implements BQ6<m> {
    public final /* synthetic */ m LIZ;
    public final /* synthetic */ String LIZIZ;
    public final /* synthetic */ BootPlugin LIZJ;

    @Override // X.BQ6
    public final void accept(m mVar) {
        this.LIZ.LJJII("result", ProtocolMessage.LIZ(new C37428EmW(1, 1, mVar, null)));
        this.LIZJ.LJII(this.LIZ, this.LIZIZ);
    }

    public C37427EmV(BootPlugin bootPlugin, m mVar, String str) {
        this.LIZJ = bootPlugin;
        this.LIZ = mVar;
        this.LIZIZ = str;
    }
}

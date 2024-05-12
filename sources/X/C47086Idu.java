package X;

import com.ss.mediakit.net.AVMDLNetClient;
import com.ss.mediakit.net.AVMDLNetClientMaker;

/* renamed from: X.Idu, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C47086Idu implements AVMDLNetClientMaker {
    public final InterfaceC47093Ie1 LIZ;

    @Override // com.ss.mediakit.net.AVMDLNetClientMaker
    public final AVMDLNetClient getNetClient() {
        return new C47413IjB(((C47085Idt) this.LIZ).LIZ.LJIJJLI.getNetClient());
    }

    public C47086Idu(C47085Idt c47085Idt) {
        this.LIZ = c47085Idt;
    }
}

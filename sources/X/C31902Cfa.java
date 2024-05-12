package X;

import java.util.Map;

/* renamed from: X.Cfa, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31902Cfa implements InterfaceC31920Cfs {
    public final /* synthetic */ String LIZ;
    public final /* synthetic */ Map.Entry<String, InterfaceC31940CgC> LIZIZ;
    public final /* synthetic */ int LIZJ;

    /* JADX WARN: Multi-variable type inference failed */
    public C31902Cfa(String str, Map.Entry<String, ? extends InterfaceC31940CgC> entry, int i) {
        this.LIZ = str;
        this.LIZIZ = entry;
        this.LIZJ = i;
    }

    @Override // X.InterfaceC31920Cfs
    public final AbstractC38123Exj LIZ() {
        return new C31938CgA(this.LIZ, this.LIZIZ, this.LIZJ);
    }
}

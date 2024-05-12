package X;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.W6r, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C81753W6r extends UF5 {
    public final List<InterfaceC81754W6s> LIZ;

    public C81753W6r(java.util.Set<InterfaceC81754W6s> set) {
        this.LIZ = new ArrayList(set.size());
        for (InterfaceC81754W6s interfaceC81754W6s : set) {
            if (interfaceC81754W6s != null) {
                this.LIZ.add(interfaceC81754W6s);
            }
        }
    }

    @Override // X.UF5, X.InterfaceC81754W6s
    public final void LJ(String str) {
        int size = ((ArrayList) this.LIZ).size();
        for (int i = 0; i < size; i++) {
            try {
                ((InterfaceC81754W6s) ((ArrayList) this.LIZ).get(i)).LJ(str);
            } catch (Exception e) {
                LJIILIIL("InternalListener exception in onRequestCancellation", e);
            }
        }
    }

    @Override // X.UF5, X.InterfaceC81754W6s
    public final void LJII(String str) {
        int size = ((ArrayList) this.LIZ).size();
        for (int i = 0; i < size; i++) {
            try {
                ((InterfaceC81754W6s) ((ArrayList) this.LIZ).get(i)).LJII(str);
            } catch (Exception e) {
                LJIILIIL("InternalListener exception in onIntermediateChunkStart", e);
            }
        }
    }

    @Override // X.UF5, X.InterfaceC81754W6s
    public final boolean LJIIIZ(String str) {
        int size = ((ArrayList) this.LIZ).size();
        for (int i = 0; i < size; i++) {
            if (((InterfaceC81754W6s) ((ArrayList) this.LIZ).get(i)).LJIIIZ(str)) {
                return true;
            }
        }
        return false;
    }

    public final byte[] LJIIL(InputStream inputStream) {
        int size = this.LIZ.size();
        for (int i = 0; i < size; i++) {
            if (this.LIZ.get(i) instanceof AbstractC51632KOe) {
                return ((AbstractC51632KOe) this.LIZ.get(i)).LJIIJJI(inputStream);
            }
        }
        return null;
    }

    public C81753W6r(InterfaceC81754W6s... interfaceC81754W6sArr) {
        this.LIZ = new ArrayList(interfaceC81754W6sArr.length);
        for (InterfaceC81754W6s interfaceC81754W6s : interfaceC81754W6sArr) {
            if (interfaceC81754W6s != null) {
                ((ArrayList) this.LIZ).add(interfaceC81754W6s);
            }
        }
    }

    public static void LJIILIIL(String str, Throwable th) {
        W58.LJII("ForwardingRequestListener", str, th);
    }

    @Override // X.UF5, X.InterfaceC81754W6s
    public final void LIZ(String str, String str2) {
        int size = ((ArrayList) this.LIZ).size();
        for (int i = 0; i < size; i++) {
            try {
                ((InterfaceC81754W6s) ((ArrayList) this.LIZ).get(i)).LIZ(str, str2);
            } catch (Exception e) {
                LJIILIIL("InternalListener exception in onProducerStart", e);
            }
        }
    }

    @Override // X.UF5, X.InterfaceC81754W6s
    public final void LIZIZ(String str, String str2, java.util.Map<String, String> map) {
        int size = ((ArrayList) this.LIZ).size();
        for (int i = 0; i < size; i++) {
            try {
                ((InterfaceC81754W6s) ((ArrayList) this.LIZ).get(i)).LIZIZ(str, str2, map);
            } catch (Exception e) {
                LJIILIIL("InternalListener exception in onProducerFinishWithSuccess", e);
            }
        }
    }

    @Override // X.UF5, X.InterfaceC81754W6s
    public final void LIZJ(String str, String str2, java.util.Map<String, String> map) {
        int size = ((ArrayList) this.LIZ).size();
        for (int i = 0; i < size; i++) {
            try {
                ((InterfaceC81754W6s) ((ArrayList) this.LIZ).get(i)).LIZJ(str, str2, map);
            } catch (Exception e) {
                LJIILIIL("InternalListener exception in onProducerFinishWithCancellation", e);
            }
        }
    }

    @Override // X.UF5, X.InterfaceC81754W6s
    public final void LIZLLL(String str, String str2, boolean z) {
        int size = ((ArrayList) this.LIZ).size();
        for (int i = 0; i < size; i++) {
            try {
                ((InterfaceC81754W6s) ((ArrayList) this.LIZ).get(i)).LIZLLL(str, str2, z);
            } catch (Exception e) {
                LJIILIIL("InternalListener exception in onProducerFinishWithSuccess", e);
            }
        }
    }

    @Override // X.UF5, X.InterfaceC81754W6s
    public final void LJIIIIZZ(W5O w5o, String str, boolean z) {
        int size = ((ArrayList) this.LIZ).size();
        for (int i = 0; i < size; i++) {
            try {
                ((InterfaceC81754W6s) ((ArrayList) this.LIZ).get(i)).LJIIIIZZ(w5o, str, z);
            } catch (Exception e) {
                LJIILIIL("InternalListener exception in onRequestSuccess", e);
            }
        }
    }

    @Override // X.UF5
    public final void LJIIJJI(W5O w5o, String str, boolean z) {
        int size = ((ArrayList) this.LIZ).size();
        for (int i = 0; i < size; i++) {
            InterfaceC81754W6s interfaceC81754W6s = (InterfaceC81754W6s) ((ArrayList) this.LIZ).get(i);
            try {
                if (interfaceC81754W6s instanceof UF5) {
                    ((UF5) interfaceC81754W6s).LJIIJJI(w5o, str, z);
                }
            } catch (Exception e) {
                LJIILIIL("InternalListener exception in onRequestIntermediateResult", e);
            }
        }
    }

    @Override // X.UF5, X.InterfaceC81754W6s
    public final void LJFF(W5O w5o, String str, Throwable th, boolean z) {
        int size = ((ArrayList) this.LIZ).size();
        for (int i = 0; i < size; i++) {
            try {
                ((InterfaceC81754W6s) ((ArrayList) this.LIZ).get(i)).LJFF(w5o, str, th, z);
            } catch (Exception e) {
                LJIILIIL("InternalListener exception in onRequestFailure", e);
            }
        }
    }

    @Override // X.UF5, X.InterfaceC81754W6s
    public final void LJI(String str, String str2, Throwable th, java.util.Map<String, String> map) {
        int size = ((ArrayList) this.LIZ).size();
        for (int i = 0; i < size; i++) {
            try {
                ((InterfaceC81754W6s) ((ArrayList) this.LIZ).get(i)).LJI(str, str2, th, map);
            } catch (Exception e) {
                LJIILIIL("InternalListener exception in onProducerFinishWithFailure", e);
            }
        }
    }

    @Override // X.UF5, X.InterfaceC81754W6s
    public final void LJIIJ(W5O w5o, Object obj, String str, boolean z) {
        int size = ((ArrayList) this.LIZ).size();
        for (int i = 0; i < size; i++) {
            try {
                ((InterfaceC81754W6s) ((ArrayList) this.LIZ).get(i)).LJIIJ(w5o, obj, str, z);
            } catch (Exception e) {
                LJIILIIL("InternalListener exception in onRequestStart", e);
            }
        }
    }
}

package X;

import java.util.concurrent.ConcurrentHashMap;

/* renamed from: X.Jm9, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C50145Jm9 implements InterfaceC50157JmL {
    public int LIZIZ;
    public final ConcurrentHashMap<String, Object> LIZJ = new ConcurrentHashMap<>();
    public final ConcurrentHashMap<Integer, C50160JmO> LIZ = new ConcurrentHashMap<>();

    @Override // X.InterfaceC50157JmL
    public final C50160JmO LIZJ() {
        return LJ(this.LIZIZ);
    }

    @Override // X.InterfaceC50157JmL
    public final void LJI() {
        this.LIZ.clear();
    }

    @Override // X.InterfaceC50157JmL
    public final int LIZIZ() {
        return this.LIZIZ;
    }

    @Override // X.InterfaceC50157JmL
    public final java.util.Map<String, Object> LIZLLL() {
        return this.LIZJ;
    }

    @Override // X.InterfaceC50157JmL
    public final void LIZ(int i) {
        this.LIZIZ = i;
    }

    @Override // X.InterfaceC50157JmL
    public final C50160JmO LJ(int i) {
        C50160JmO c50160JmO = this.LIZ.get(Integer.valueOf(i));
        if (c50160JmO == null) {
            return new C50160JmO();
        }
        return c50160JmO;
    }

    @Override // X.InterfaceC50157JmL
    public final void LJFF(int i, C50160JmO c50160JmO) {
        this.LIZ.put(Integer.valueOf(i), c50160JmO);
    }
}

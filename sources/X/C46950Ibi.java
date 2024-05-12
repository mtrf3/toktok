package X;

import android.util.Pair;

/* renamed from: X.Ibi, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C46950Ibi implements InterfaceC46949Ibh {
    public final /* synthetic */ InterfaceC46976Ic8 LIZ;

    @Override // X.InterfaceC46949Ibh
    public final java.util.Set<String> LIZ() {
        return ((C46966Iby) this.LIZ).LIZ.LIZ();
    }

    @Override // X.InterfaceC46949Ibh
    public final String LIZIZ() {
        return ((C46966Iby) this.LIZ).LIZ.LIZIZ();
    }

    @Override // X.InterfaceC46949Ibh
    public final double LIZJ() {
        return ((C46966Iby) this.LIZ).LIZ.LIZJ();
    }

    @Override // X.InterfaceC46949Ibh
    public final Pair<Double, Double> LIZLLL() {
        C46966Iby c46966Iby = (C46966Iby) this.LIZ;
        Pair<Double, Double> pair = c46966Iby.LIZIZ;
        if (pair != null) {
            return pair;
        }
        return c46966Iby.LIZ.LIZLLL();
    }

    public C46950Ibi(InterfaceC46976Ic8 interfaceC46976Ic8) {
        this.LIZ = interfaceC46976Ic8;
    }
}

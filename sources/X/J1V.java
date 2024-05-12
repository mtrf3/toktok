package X;

import java.util.concurrent.Callable;

/* loaded from: classes9.dex */
public final class J1V<V> implements Callable {
    public final /* synthetic */ String LJLIL;
    public final /* synthetic */ long LJLILLLLZI;
    public final /* synthetic */ int LJLJI;
    public final /* synthetic */ EnumC48190Ivi LJLJJI;
    public final /* synthetic */ J1W LJLJJL;

    public J1V(int i, long j, EnumC48190Ivi enumC48190Ivi, C67144QWu c67144QWu, String str) {
        this.LJLIL = str;
        this.LJLILLLLZI = j;
        this.LJLJI = i;
        this.LJLJJI = enumC48190Ivi;
        this.LJLJJL = c67144QWu;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("[ping], host = ");
        LIZ.append(this.LJLIL);
        LIZ.append(", delaySeconds = ");
        LIZ.append(this.LJLILLLLZI);
        LIZ.append(", timeoutSeconds = ");
        LIZ.append(this.LJLJI);
        C221018lt.LJFF("PingUtils", X1D.LIZIZ(LIZ));
        String str = this.LJLIL;
        EnumC48190Ivi enumC48190Ivi = this.LJLJJI;
        MS5.LIZIZ(new J1U(this.LJLJI, this.LJLILLLLZI, enumC48190Ivi, this.LJLJJL, str), this.LJLILLLLZI);
        return C76800UCe.LIZ;
    }
}

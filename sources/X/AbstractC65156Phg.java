package X;

import java.util.List;

/* renamed from: X.Phg, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public abstract class AbstractC65156Phg implements InterfaceC65157Phh {
    public InterfaceC65157Phh LIZ;

    public abstract InterfaceC65157Phh LJIIL();

    @Override // X.InterfaceC65157Phh
    public final byte[] LIZJ(int i, String str) {
        if (this.LIZ == null) {
            this.LIZ = LJIIL();
        }
        return this.LIZ.LIZJ(i, str);
    }

    @Override // X.InterfaceC65157Phh
    public final String LIZLLL(int i, int i2, String str, List<InterfaceC61858OPm> list) {
        InterfaceC65157Phh interfaceC65157Phh = this.LIZ;
        if (interfaceC65157Phh == null) {
            return null;
        }
        return interfaceC65157Phh.LIZLLL(i, i2, str, list);
    }

    @Override // X.InterfaceC65157Phh
    public final String LJIIJ(int i, String str, C65155Phf c65155Phf, long j, InterfaceC65171Phv[] interfaceC65171PhvArr) {
        if (this.LIZ == null) {
            this.LIZ = LJIIL();
        }
        return this.LIZ.LJIIJ(i, str, c65155Phf, j, interfaceC65171PhvArr);
    }

    @Override // X.InterfaceC65157Phh
    public final String LIZ(int i, int i2, String str, byte[] bArr, String str2, String str3) {
        if (this.LIZ == null) {
            this.LIZ = LJIIL();
        }
        return this.LIZ.LIZ(i, i2, str, bArr, str2, str3);
    }

    @Override // X.InterfaceC65157Phh
    public final String LJFF(int i, String str, byte[] bArr, String str2, String str3, List list) {
        InterfaceC65157Phh interfaceC65157Phh = this.LIZ;
        if (interfaceC65157Phh == null) {
            return null;
        }
        return interfaceC65157Phh.LJFF(i, str, bArr, str2, str3, list);
    }

    @Override // X.InterfaceC65157Phh
    public final String LJI(int i, int i2, String str, List list, InterfaceC65171Phv[] interfaceC65171PhvArr, List list2) {
        InterfaceC65157Phh interfaceC65157Phh = this.LIZ;
        if (interfaceC65157Phh == null) {
            return null;
        }
        return interfaceC65157Phh.LJI(i, i2, str, list, interfaceC65171PhvArr, list2);
    }

    @Override // X.InterfaceC65157Phh
    public final String LJII(int i, int i2, String str, List list, InterfaceC65171Phv[] interfaceC65171PhvArr, List list2) {
        if (this.LIZ == null) {
            this.LIZ = LJIIL();
        }
        return this.LIZ.LJII(i, i2, str, list, interfaceC65171PhvArr, list2);
    }

    @Override // X.InterfaceC65157Phh
    public final String LJIIIZ(int i, int i2, String str, C65155Phf c65155Phf, InterfaceC65171Phv[] interfaceC65171PhvArr, List list) {
        if (this.LIZ == null) {
            this.LIZ = LJIIL();
        }
        return this.LIZ.LJIIIZ(i, i2, str, c65155Phf, interfaceC65171PhvArr, list);
    }

    @Override // X.InterfaceC65157Phh
    public final String LJIIIIZZ(int i, int i2, String str, boolean z, List list, F30 f30, boolean z2) {
        if (this.LIZ == null) {
            this.LIZ = LJIIL();
        }
        return this.LIZ.LJIIIIZZ(i, i2, str, z, list, f30, z2);
    }

    @Override // X.InterfaceC65157Phh
    public final String LJIIJJI(int i, int i2, String str, byte[] bArr, String str2, String str3, List<InterfaceC61858OPm> list) {
        if (this.LIZ == null) {
            this.LIZ = LJIIL();
        }
        return this.LIZ.LJIIJJI(0, i2, str, bArr, str2, str3, list);
    }

    @Override // X.InterfaceC65157Phh
    public final boolean LIZIZ(int i, String str, StringBuffer stringBuffer, StringBuffer stringBuffer2, StringBuffer stringBuffer3, InterfaceC65169Pht interfaceC65169Pht, String str2, List list, String[] strArr, int[] iArr) {
        if (this.LIZ == null) {
            this.LIZ = LJIIL();
        }
        return this.LIZ.LIZIZ(i, str, stringBuffer, stringBuffer2, stringBuffer3, interfaceC65169Pht, str2, list, strArr, iArr);
    }

    @Override // X.InterfaceC65157Phh
    public final boolean LJ(int i, String str, String str2, String str3, String str4, InterfaceC65169Pht interfaceC65169Pht, String str5, List list, String[] strArr, int[] iArr) {
        if (this.LIZ == null) {
            this.LIZ = LJIIL();
        }
        return this.LIZ.LJ(i, str, str2, str3, str4, interfaceC65169Pht, str5, list, strArr, iArr);
    }
}

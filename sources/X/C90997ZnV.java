package X;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.RandomAccess;

/* renamed from: X.ZnV */
/* loaded from: classes29.dex */
public final class C90997ZnV extends AbstractC90950Zmk<C90997ZnV, C90946Zmg> implements InterfaceC90327Zch {
    public static final InterfaceC90341Zcv<Integer, EnumC90770Zjq> zzb = new C90688ZiW();
    public static final C90997ZnV zze;
    public int zzf;
    public C91010Zni zzg;
    public C90995ZnT zzh;
    public InterfaceC90352Zd6<C90988ZnM> zzi = C90899Zlv.LJLJJI;
    public InterfaceC90721Zj3 zzj = C90894Zlq.LJLJJI;

    static {
        C90997ZnV c90997ZnV = new C90997ZnV();
        zze = c90997ZnV;
        AbstractC90950Zmk.LIZLLL(C90997ZnV.class, c90997ZnV);
    }

    public static C90946Zmg LJIIJ() {
        return zze.LJI();
    }

    public static /* synthetic */ void LJIIL(C90997ZnV c90997ZnV, C91010Zni c91010Zni) {
        c90997ZnV.zzg = c91010Zni;
        c90997ZnV.zzf |= 1;
    }

    public static void LJIILL(C90997ZnV c90997ZnV, Iterable iterable) {
        int i;
        RandomAccess randomAccess = c90997ZnV.zzj;
        if (!((AbstractC90703Zil) randomAccess).LJLIL) {
            C90894Zlq c90894Zlq = (C90894Zlq) randomAccess;
            int i2 = c90894Zlq.LJLJI;
            if (i2 == 0) {
                i = 10;
            } else {
                i = i2 + i2;
                if (i < i2) {
                    throw new IllegalArgumentException();
                }
            }
            c90997ZnV.zzj = new C90894Zlq(Arrays.copyOf(c90894Zlq.LJLILLLLZI, i), c90894Zlq.LJLJI);
        }
        Iterator it = ((ArrayList) iterable).iterator();
        while (it.hasNext()) {
            EnumC90770Zjq enumC90770Zjq = (EnumC90770Zjq) it.next();
            ((C90894Zlq) c90997ZnV.zzj).LJFF(enumC90770Zjq.zza());
        }
    }

    @Override // X.AbstractC90950Zmk
    public final Object LJ(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 != 2) {
                if (i2 != 3) {
                    if (i2 != 4) {
                        if (i2 != 5) {
                            return null;
                        }
                        return zze;
                    }
                    return new C90946Zmg(0);
                }
                return new C90997ZnV();
            }
            return new C90758Zje(zze, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0002\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003\u001b\u0004\u001e", new Object[]{"zzf", "zzg", "zzh", "zzi", C90988ZnM.class, "zzj", EnumC90770Zjq.zzc()});
        }
        return (byte) 1;
    }
}

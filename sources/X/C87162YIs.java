package X;

import java.util.Arrays;

/* renamed from: X.YIs, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C87162YIs extends YJA<C87159YIp, C87159YIp> {
    @Override // X.YJA
    public final /* synthetic */ int LIZIZ(C87159YIp c87159YIp) {
        return c87159YIp.LIZ();
    }

    @Override // X.YJA
    public final /* synthetic */ C87159YIp LIZJ(Object obj) {
        return ((YIO) obj).zzfza;
    }

    @Override // X.YJA
    public final int LIZLLL(C87159YIp c87159YIp) {
        C87159YIp c87159YIp2 = c87159YIp;
        int i = c87159YIp2.LIZLLL;
        if (i == -1) {
            i = 0;
            for (int i2 = 0; i2 < c87159YIp2.LIZ; i2++) {
                int i3 = c87159YIp2.LIZIZ[i2] >>> 3;
                AbstractC87141YHx abstractC87141YHx = (AbstractC87141YHx) c87159YIp2.LIZJ[i2];
                i += AbstractC87156YIm.LJIIJ(3, abstractC87141YHx) + AbstractC87156YIm.LJ(2, i3) + (AbstractC87156YIm.LJIJJ(1) << 1);
            }
            c87159YIp2.LIZLLL = i;
        }
        return i;
    }

    @Override // X.YJA
    public final void LJII(YIO yio) {
        yio.zzfza.getClass();
    }

    @Override // X.YJA
    public final /* synthetic */ void LIZ(Object obj, YJ8 yj8) {
        ((C87159YIp) obj).LIZIZ(yj8);
    }

    @Override // X.YJA
    public final void LJ(Object obj, YJ8 yj8) {
        C87159YIp c87159YIp = (C87159YIp) obj;
        c87159YIp.getClass();
        yj8.getClass();
        for (int i = 0; i < c87159YIp.LIZ; i++) {
            yj8.LIZJ(c87159YIp.LIZIZ[i] >>> 3, c87159YIp.LIZJ[i]);
        }
    }

    @Override // X.YJA
    public final void LJFF(Object obj, C87159YIp c87159YIp) {
        ((YIO) obj).zzfza = c87159YIp;
    }

    @Override // X.YJA
    public final C87159YIp LJI(Object obj, Object obj2) {
        C87159YIp c87159YIp = (C87159YIp) obj;
        C87159YIp c87159YIp2 = (C87159YIp) obj2;
        if (c87159YIp2.equals(C87159YIp.LJ)) {
            return c87159YIp;
        }
        int i = c87159YIp.LIZ + c87159YIp2.LIZ;
        int[] copyOf = Arrays.copyOf(c87159YIp.LIZIZ, i);
        System.arraycopy(c87159YIp2.LIZIZ, 0, copyOf, c87159YIp.LIZ, c87159YIp2.LIZ);
        Object[] copyOf2 = Arrays.copyOf(c87159YIp.LIZJ, i);
        System.arraycopy(c87159YIp2.LIZJ, 0, copyOf2, c87159YIp.LIZ, c87159YIp2.LIZ);
        return new C87159YIp(i, copyOf, copyOf2);
    }
}

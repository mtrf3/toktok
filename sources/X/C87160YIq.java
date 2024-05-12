package X;

import java.util.Arrays;

/* renamed from: X.YIq, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C87160YIq extends YJH {
    @Override // X.YJH
    public final /* synthetic */ C87157YIn LJ() {
        return C87157YIn.LIZIZ();
    }

    @Override // X.YJH
    public final /* synthetic */ int LIZ(Object obj) {
        return ((C87157YIn) obj).LIZ();
    }

    @Override // X.YJH
    public final int LIZIZ(Object obj) {
        C87157YIn c87157YIn = (C87157YIn) obj;
        int i = c87157YIn.LIZLLL;
        if (i == -1) {
            i = 0;
            for (int i2 = 0; i2 < c87157YIn.LIZ; i2++) {
                int i3 = c87157YIn.LIZIZ[i2];
                AbstractC87134YHq abstractC87134YHq = (AbstractC87134YHq) c87157YIn.LIZJ[i2];
                int LJLJL = AbstractC87153YIj.LJLJL(8);
                int zzd = abstractC87134YHq.zzd();
                int LJLJL2 = AbstractC87153YIj.LJLJL(i3 >>> 3) + AbstractC87153YIj.LJLJL(16);
                i += AbstractC87153YIj.LJLJL(zzd) + zzd + AbstractC87153YIj.LJLJL(24) + LJLJL2 + LJLJL + LJLJL;
            }
            c87157YIn.LIZLLL = i;
        }
        return i;
    }

    @Override // X.YJH
    public final /* synthetic */ C87157YIn LIZJ(Object obj) {
        return ((YIN) obj).zzc;
    }

    @Override // X.YJH
    public final void LJI(Object obj) {
        ((YIN) obj).zzc.LJ = false;
    }

    @Override // X.YJH
    public final Object LIZLLL(Object obj, Object obj2) {
        C87157YIn c87157YIn = (C87157YIn) obj2;
        if (c87157YIn.equals(C87157YIn.LJFF)) {
            return obj;
        }
        C87157YIn c87157YIn2 = (C87157YIn) obj;
        int i = c87157YIn2.LIZ + c87157YIn.LIZ;
        int[] copyOf = Arrays.copyOf(c87157YIn2.LIZIZ, i);
        System.arraycopy(c87157YIn.LIZIZ, 0, copyOf, c87157YIn2.LIZ, c87157YIn.LIZ);
        Object[] copyOf2 = Arrays.copyOf(c87157YIn2.LIZJ, i);
        System.arraycopy(c87157YIn.LIZJ, 0, copyOf2, c87157YIn2.LIZ, c87157YIn.LIZ);
        return new C87157YIn(i, copyOf, copyOf2, true);
    }

    @Override // X.YJH
    public final /* synthetic */ void LJII(Object obj, Object obj2) {
        ((YIN) obj).zzc = (C87157YIn) obj2;
    }

    @Override // X.YJH
    public final /* synthetic */ void LJIIIIZZ(Object obj, C87149YIf c87149YIf) {
        ((C87157YIn) obj).LIZLLL(c87149YIf);
    }

    @Override // X.YJH
    public final /* bridge */ /* synthetic */ void LJFF(long j, int i, Object obj) {
        ((C87157YIn) obj).LIZJ(i << 3, Long.valueOf(j));
    }
}

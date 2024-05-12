package X;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

/* renamed from: X.1AD, reason: invalid class name */
/* loaded from: classes.dex */
public class C1AD extends C018205i implements InterfaceC018505l {
    public C018205i[] LIZ = new C018205i[4];
    public int LIZIZ;

    @Override // X.InterfaceC018505l
    public final void LIZ() {
        this.LIZIZ = 0;
        Arrays.fill(this.LIZ, (Object) null);
    }

    @Override // X.InterfaceC018505l
    public void LIZIZ() {
    }

    @Override // X.InterfaceC018505l
    public final void LIZJ(C018205i c018205i) {
        if (c018205i == this || c018205i == null) {
            return;
        }
        int i = this.LIZIZ + 1;
        C018205i[] c018205iArr = this.LIZ;
        if (i > c018205iArr.length) {
            this.LIZ = (C018205i[]) Arrays.copyOf(c018205iArr, c018205iArr.length * 2);
        }
        C018205i[] c018205iArr2 = this.LIZ;
        int i2 = this.LIZIZ;
        c018205iArr2[i2] = c018205i;
        this.LIZIZ = i2 + 1;
    }

    @Override // X.C018205i
    public void copy(C018205i c018205i, HashMap<C018205i, C018205i> hashMap) {
        super.copy(c018205i, hashMap);
        C1AD c1ad = (C1AD) c018205i;
        this.LIZIZ = 0;
        int i = c1ad.LIZIZ;
        for (int i2 = 0; i2 < i; i2++) {
            LIZJ(hashMap.get(c1ad.LIZ[i2]));
        }
    }

    public final void LIZLLL(int i, C16I c16i, ArrayList arrayList) {
        for (int i2 = 0; i2 < this.LIZIZ; i2++) {
            c16i.LIZ(this.LIZ[i2]);
        }
        for (int i3 = 0; i3 < this.LIZIZ; i3++) {
            C16F.LIZ(this.LIZ[i3], i, arrayList, c16i);
        }
    }
}

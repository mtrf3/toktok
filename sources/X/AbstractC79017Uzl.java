package X;

import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import java.util.EnumMap;

/* renamed from: X.Uzl, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public abstract class AbstractC79017Uzl implements V04 {
    public abstract boolean[] LIZIZ(String str);

    public int LIZJ() {
        return 10;
    }

    public static int LIZ(boolean[] zArr, int i, int[] iArr, boolean z) {
        int i2 = 0;
        for (int i3 : iArr) {
            int i4 = 0;
            while (i4 < i3) {
                zArr[i] = z;
                i4++;
                i++;
            }
            i2 += i3;
            z = !z;
        }
        return i2;
    }

    @Override // X.V04
    public C79007Uzb LJ(String str, V0B v0b, int i, int i2, java.util.Map<EnumC79013Uzh, ?> map) {
        if (!str.isEmpty()) {
            if (i >= 0 && i2 >= 0) {
                int LIZJ = LIZJ();
                if (map != null) {
                    EnumC79013Uzh enumC79013Uzh = EnumC79013Uzh.MARGIN;
                    EnumMap enumMap = (EnumMap) map;
                    if (enumMap.containsKey(enumC79013Uzh)) {
                        LIZJ = CastIntegerProtector.parseInt(enumMap.get(enumC79013Uzh).toString());
                    }
                }
                boolean[] LIZIZ = LIZIZ(str);
                int length = LIZIZ.length;
                int i3 = LIZJ + length;
                int max = Math.max(i, i3);
                int max2 = Math.max(1, i2);
                int i4 = max / i3;
                int i5 = (max - (length * i4)) / 2;
                C79007Uzb c79007Uzb = new C79007Uzb(max, max2);
                int i6 = 0;
                while (i6 < length) {
                    if (LIZIZ[i6]) {
                        c79007Uzb.LIZJ(i5, 0, i4, max2);
                    }
                    i6++;
                    i5 += i4;
                }
                return c79007Uzb;
            }
            throw new IllegalArgumentException("Negative size is not allowed. Input: " + i + 'x' + i2);
        }
        throw new IllegalArgumentException("Found empty contents");
    }
}

package X;

import android.util.Base64;
import java.io.ByteArrayOutputStream;
import java.util.Iterator;
import java.util.zip.GZIPOutputStream;
import kotlin.jvm.internal.o;

/* renamed from: X.VMi, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C79612VMi extends AbstractC65781Prl implements InterfaceC65784Pro<C76800UCe> {
    public final /* synthetic */ VJI LJLIL;
    public final /* synthetic */ InterfaceC79629VMz LJLILLLLZI;
    public final /* synthetic */ long LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C79612VMi(VJI vji, InterfaceC79629VMz interfaceC79629VMz, long j) {
        super(0);
        this.LJLIL = vji;
        this.LJLILLLLZI = interfaceC79629VMz;
        this.LJLJI = j;
    }

    @Override // X.InterfaceC65784Pro
    public final C76800UCe invoke() {
        C79608VMe c79608VMe;
        int i;
        String encodeToString;
        long currentTimeMillis = System.currentTimeMillis();
        VJI vji = this.LJLIL;
        int i2 = vji.LIZIZ;
        int i3 = 0;
        if (i2 <= 0 || (i = vji.LIZJ) <= 0) {
            c79608VMe = new C79608VMe(0);
        } else {
            int i4 = vji.LIZLLL;
            int i5 = ((i - 1) / i4) + 1;
            int LIZJ = AnonymousClass030.LIZJ(i2, 1, i4, 1);
            int i6 = i5 * LIZJ;
            int i7 = LIZJ - 1;
            int i8 = i5 - 1;
            byte[] bArr = new byte[(i6 >> 3) + 1];
            Iterator<Integer[]> it = vji.LIZ.iterator();
            int i9 = 0;
            int i10 = 0;
            int i11 = 0;
            int i12 = i7;
            int i13 = i8;
            while (it.hasNext()) {
                Integer[] next = it.next();
                int max = Math.max(i3, next[i3].intValue() / vji.LIZLLL);
                int max2 = Math.max(i3, next[1].intValue() / vji.LIZLLL);
                int min = Math.min(i7, next[2].intValue() / vji.LIZLLL);
                int min2 = Math.min(i8, next[3].intValue() / vji.LIZLLL);
                if (next[4].intValue() == 1) {
                    if (max2 <= min2) {
                        int i14 = max2;
                        while (true) {
                            if (max <= min) {
                                int i15 = max;
                                while (true) {
                                    int i16 = (LIZJ * i14) + i15;
                                    int i17 = i16 >> 3;
                                    int i18 = (7 - i16) & 7;
                                    byte b = bArr[i17];
                                    if (((b >>> i18) & 1) == 0) {
                                        bArr[i17] = (byte) (b | ((byte) (1 << i18)));
                                        i11++;
                                    }
                                    if (i15 == min) {
                                        break;
                                    }
                                    i15++;
                                }
                            }
                            if (i14 == min2) {
                                break;
                            }
                            i14++;
                        }
                    }
                    i12 = Math.min(i12, max);
                    i9 = Math.max(i9, min);
                    i13 = Math.min(i13, max2);
                    i10 = Math.max(i10, min2);
                }
                i3 = 0;
            }
            float f = i6;
            float max3 = (Math.max(Math.max(i12 * i5, (i7 - i9) * i5), Math.max(i13 * LIZJ, (i8 - i10) * LIZJ)) * 1.0f) / f;
            float f2 = (i11 * 1.0f) / f;
            if (VMS.blankBitmap.isEnabled()) {
                try {
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
                    gZIPOutputStream.write(bArr);
                    gZIPOutputStream.close();
                    encodeToString = Base64.encodeToString(byteArrayOutputStream.toByteArray(), 2);
                    o.LJFF(encodeToString, "Base64.encodeToString(by…eArray(), Base64.NO_WRAP)");
                } catch (Throwable unused) {
                }
                c79608VMe = new C79608VMe(f2, LIZJ, i5, encodeToString, vji.LIZ.size(), max3);
            }
            encodeToString = "";
            c79608VMe = new C79608VMe(f2, LIZJ, i5, encodeToString, vji.LIZ.size(), max3);
        }
        this.LJLILLLLZI.LIZ(new C79611VMh(this.LJLJI, System.currentTimeMillis() - currentTimeMillis, c79608VMe));
        return C76800UCe.LIZ;
    }
}

package X;

import com.bytedance.android.livesdk.livesetting.publicscreen.LiveChatShowDelayForHotLiveSetting;
import java.util.ArrayList;

/* renamed from: X.Wtl, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C83741Wtl extends InterpolatorC83740Wtk {
    public C83741Wtl(float f, float f2, float f3, float f4) {
        C83742Wtm c83742Wtm;
        ArrayList arrayList = new ArrayList();
        float f5 = 0.0f;
        arrayList.add(new C83742Wtm(0.0f, 0.0f));
        arrayList.add(new C83742Wtm(f, f2));
        arrayList.add(new C83742Wtm(f3, f4));
        float f6 = 1.0f;
        arrayList.add(new C83742Wtm(1.0f, 1.0f));
        C60036NhI c60036NhI = new C60036NhI(arrayList);
        C38501fC c38501fC = new C38501fC();
        this.LIZ = c38501fC;
        c38501fC.LJLIL = c60036NhI;
        float[] fArr = new float[100];
        int i = LiveChatShowDelayForHotLiveSetting.DEFAULT;
        C83742Wtm[] c83742WtmArr = new C83742Wtm[LiveChatShowDelayForHotLiveSetting.DEFAULT];
        int i2 = 0;
        while (true) {
            if (i2 >= i) {
                break;
            }
            float f7 = i2 / 399;
            int length = ((C83742Wtm[]) c60036NhI.LIZ).length;
            if (length < 2) {
                c83742Wtm = new C83742Wtm(f5, f5);
            } else {
                int i3 = 0;
                do {
                    C83742Wtm[] c83742WtmArr2 = (C83742Wtm[]) c60036NhI.LIZIZ;
                    if (c83742WtmArr2[i3] == null) {
                        c83742WtmArr2[i3] = new C83742Wtm();
                    }
                    C83742Wtm c83742Wtm2 = c83742WtmArr2[i3];
                    C83742Wtm c83742Wtm3 = ((C83742Wtm[]) c60036NhI.LIZ)[i3];
                    c83742Wtm2.getClass();
                    c83742Wtm2.LIZ = c83742Wtm3.LIZ;
                    c83742Wtm2.LIZIZ = c83742Wtm3.LIZIZ;
                    i3++;
                } while (i3 < length);
                C83742Wtm[] c83742WtmArr3 = (C83742Wtm[]) c60036NhI.LIZIZ;
                int length2 = c83742WtmArr3.length;
                for (int i4 = 1; i4 <= length2; i4++) {
                    int i5 = 0;
                    while (i5 < length2 - i4) {
                        C83742Wtm c83742Wtm4 = c83742WtmArr3[i5];
                        float f8 = f6 - f7;
                        float f9 = c83742Wtm4.LIZ * f8;
                        i5++;
                        C83742Wtm c83742Wtm5 = c83742WtmArr3[i5];
                        c83742Wtm4.LIZ = (c83742Wtm5.LIZ * f7) + f9;
                        c83742Wtm4.LIZIZ = (c83742Wtm5.LIZIZ * f7) + (f8 * c83742Wtm4.LIZIZ);
                        f6 = 1.0f;
                    }
                }
                c83742Wtm = c83742WtmArr3[0];
            }
            c83742WtmArr[i2] = new C83742Wtm(c83742Wtm.LIZ, c83742Wtm.LIZIZ);
            i2++;
            f5 = 0.0f;
            f6 = 1.0f;
            i = LiveChatShowDelayForHotLiveSetting.DEFAULT;
        }
        int i6 = 0;
        int i7 = 0;
        do {
            float f10 = i7 / 99;
            int i8 = i6;
            int i9 = 399;
            while (i6 <= i9 && c83742WtmArr[i6].LIZ <= f10) {
                i8 = (i6 + i9) >>> 1;
                float f11 = c83742WtmArr[i8].LIZ;
                if (f11 < f10) {
                    i6 = i8 + 1;
                } else if (f11 <= f10) {
                    break;
                } else {
                    i9 = i8 - 1;
                }
            }
            i6 = i8;
            int min = Math.min(i8 + 1, 399);
            C83742Wtm c83742Wtm6 = c83742WtmArr[i6];
            float f12 = c83742Wtm6.LIZ;
            C83742Wtm c83742Wtm7 = c83742WtmArr[min];
            float f13 = c83742Wtm7.LIZ;
            float f14 = c83742Wtm6.LIZIZ;
            float f15 = c83742Wtm7.LIZIZ;
            if (i6 != min && f12 != f13) {
                fArr[i7] = C06420Na.LIZIZ(f15, f14, (f10 - f12) / (f13 - f12), f14);
            } else {
                fArr[i7] = f14;
            }
            i7++;
        } while (i7 < 100);
        c38501fC.LJLILLLLZI = fArr;
    }
}

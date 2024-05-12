package X;

import com.bytedance.ies.nle.editor_jni.NLEEditorJniJNI;
import com.ss.android.vesdk.LoudnessDetectResult;
import java.util.ArrayList;
import kotlin.jvm.internal.o;

/* renamed from: X.5P6, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C5P6 extends C5XB {
    @Override // X.C5XB
    public final void LJFF(InterfaceC153045zY interfaceC153045zY, LoudnessDetectResult[] loudnessDetectResultArr, C5XE[] loudnessNormalizationParams, C5P7 c5p7) {
        o.LJIIIZ(loudnessNormalizationParams, "loudnessNormalizationParams");
        if (interfaceC153045zY != null) {
            C122034qd LJJI = C17N.LJJI(interfaceC153045zY);
            if (LJJI != null) {
                ArrayList arrayList = new ArrayList();
                int length = loudnessNormalizationParams.length;
                int i = 0;
                int i2 = 0;
                while (i < length) {
                    C5XE c5xe = loudnessNormalizationParams[i];
                    int i3 = i2 + 1;
                    if (loudnessDetectResultArr[i2].result == 0) {
                        C121634pz c121634pz = new C121634pz(NLEEditorJniJNI.NLEFilterName_getAUDIO_LOUDNESS_BALANCE_FILTER());
                        c121634pz.LJIIIIZZ = Double.valueOf(loudnessDetectResultArr[i2].avgLoudness);
                        c121634pz.LJIIIZ = Double.valueOf(loudnessDetectResultArr[i2].peakLoudness);
                        c121634pz.LJIIJ = Double.valueOf(c5xe.LIZLLL);
                        if (c5xe.LJIIIZ != 0) {
                            c121634pz.LIZLLL = Long.valueOf(c5xe.LJIIIIZZ);
                            c121634pz.LJ = Long.valueOf(c5xe.LJIIIZ);
                        }
                        StringBuilder LIZ = X1D.LIZ();
                        LIZ.append("audioBalanceFilter: ");
                        LIZ.append(c121634pz.LJIIIIZZ);
                        LIZ.append(' ');
                        LIZ.append(c121634pz.LJIIIZ);
                        LIZ.append(" uuid:");
                        LIZ.append(c5xe.LJFF);
                        LIZ.append(' ');
                        LIZ.append(c121634pz.LJIIJ);
                        LIZ.append(' ');
                        LIZ.append(c121634pz.LIZLLL);
                        LIZ.append(' ');
                        LIZ.append(c121634pz.LJ);
                        H78.LIZIZ("LoudnessNormalization", X1D.LIZIZ(LIZ));
                        arrayList.add(c121634pz);
                        String LJJJ = LJJI.LJFF().LJJJ(c5xe.LJFF, c121634pz);
                        StringBuilder LIZ2 = X1D.LIZ();
                        LIZ2.append("complete loudness normalization result: ");
                        LIZ2.append(LJJJ);
                        H78.LIZIZ("LoudnessNormalization", X1D.LIZIZ(LIZ2));
                    }
                    i++;
                    i2 = i3;
                }
                if (c5p7 != null) {
                    c5p7.LIZ((C121634pz[]) arrayList.toArray(new C121634pz[0]));
                    return;
                }
                return;
            }
            "Required value was null.".toString();
            throw new IllegalArgumentException("Required value was null.");
        }
    }
}

package X;

import android.content.Context;
import com.bytedance.ies.nle.editor_jni.NLESegmentVideo;
import com.ss.android.vesdk.VEEditor;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.5KN, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C5KN {
    public static final java.util.Map<String, C67102kE> LIZ = new LinkedHashMap();

    public static final void LIZ() {
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("cancelJobs: jobMap = ");
        LinkedHashMap linkedHashMap = (LinkedHashMap) LIZ;
        LIZ2.append(ORZ.LLD(linkedHashMap.keySet(), null, null, null, null, 63));
        LIZJ(X1D.LIZIZ(LIZ2));
        for (C67102kE c67102kE : linkedHashMap.values()) {
            c67102kE.getClass();
            StringBuilder LIZ3 = X1D.LIZ();
            LIZ3.append("ResizeJob: ");
            LIZ3.append(c67102kE);
            LIZ3.append(" cancel");
            LIZJ(X1D.LIZIZ(LIZ3));
            c67102kE.LIZ.LIZIZ(null);
            VEEditor vEEditor = c67102kE.LIZIZ;
            if (vEEditor != null) {
                vEEditor.LJIILIIL();
            }
        }
        ((LinkedHashMap) LIZ).clear();
    }

    public static void LIZJ(String str) {
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("ResizeMediasTask ");
        LIZ2.append(str);
        H78.LJI(X1D.LIZIZ(LIZ2));
    }

    public static final String LIZIZ(String cacheFolder, String str, boolean z) {
        StringBuilder LIZ2;
        String str2;
        o.LJIIIZ(cacheFolder, "cacheFolder");
        String LJI = C173376rF.LJI(str);
        if (z) {
            LIZ2 = X1D.LIZ();
            LIZ2.append(cacheFolder);
            LIZ2.append('/');
            LIZ2.append(LJI);
            str2 = ".png";
        } else {
            LIZ2 = X1D.LIZ();
            LIZ2.append(cacheFolder);
            LIZ2.append('/');
            LIZ2.append(LJI);
            str2 = ".mp4";
        }
        LIZ2.append(str2);
        return X1D.LIZIZ(LIZ2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static C84661XKn LIZLLL(Context context, NLESegmentVideo nLESegmentVideo, String str, boolean z) {
        boolean z2;
        String inputPath = nLESegmentVideo.LJ().LIZJ();
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("resizeSingleMedia start: isImg = ");
        LIZ2.append(z);
        LIZ2.append(", inputPath = ");
        LIZ2.append(inputPath);
        LIZ2.append(", zipFolder = ");
        LIZ2.append(str);
        LIZJ(X1D.LIZIZ(LIZ2));
        if (inputPath == null || inputPath.length() == 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            return null;
        }
        o.LJIIIIZZ(inputPath, "inputPath");
        String LIZIZ = LIZIZ(str, inputPath, z);
        int[] iArr = {C78926UyI.LJJIZ(nLESegmentVideo.LJIILIIL())};
        int[] iArr2 = {C78926UyI.LJJIZ(nLESegmentVideo.LJIIL())};
        StringBuilder LIZ3 = X1D.LIZ();
        LIZ3.append("resizeSingleMedia data: isImg = ");
        LIZ3.append(z);
        LIZ3.append(", inputPath = ");
        LIZ3.append(inputPath);
        LIZ3.append(", outPath = ");
        LIZ3.append(LIZIZ);
        LIZ3.append(", vTrimIn = ");
        LIZ3.append(ORY.LJJIZ(iArr));
        LIZ3.append(", vTrimOut = ");
        LIZ3.append(ORY.LJJIZ(iArr2));
        LIZJ(X1D.LIZIZ(LIZ3));
        C68322mC c68322mC = new C68322mC();
        C84661XKn LIZIZ2 = XKX.LIZIZ(C780334l.LJLIL, C78613UtF.LIZJ, null, new C5KO(z, context, inputPath, LIZIZ, str, iArr, iArr2, c68322mC, null), 2);
        LIZ.put(inputPath, new C67102kE(LIZIZ2, (VEEditor) c68322mC.element));
        return LIZIZ2;
    }
}

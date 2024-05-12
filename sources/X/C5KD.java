package X;

import com.ss.android.vesdk.ROTATE_DEGREE;
import com.ss.android.vesdk.VEEditor;
import kotlin.jvm.internal.o;

/* renamed from: X.5KD, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C5KD extends C5KG {
    public int[] LIZ;
    public int[] LIZIZ;
    public String[] LIZJ;
    public String[] LIZLLL;
    public int[] LJ;
    public int[] LJFF;
    public float[] LJI;
    public ROTATE_DEGREE[] LJII;
    public C5NI LJIIIIZZ;
    public final String[] LJIIIZ;

    public C5KD(String[] videoFilePaths) {
        o.LJIIIZ(videoFilePaths, "videoFilePaths");
        this.LJIIIZ = videoFilePaths;
        this.LJIIIIZZ = C5NI.VIDEO_OUT_RATIO_ORIGINAL;
    }

    public final void LIZIZ(C5NI c5ni) {
        o.LJIIIZ(c5ni, "<set-?>");
        this.LJIIIIZZ = c5ni;
    }

    @Override // X.C5KG
    public final int LIZ(VEEditor editor, boolean z) {
        int[] iArr;
        o.LJIIIZ(editor, "editor");
        int[] iArr2 = this.LIZ;
        if (iArr2 != null && (iArr = this.LIZIZ) != null) {
            String[] strArr = this.LJIIIZ;
            String[] strArr2 = this.LIZJ;
            String[] strArr3 = this.LIZLLL;
            int[] iArr3 = this.LJ;
            int[] iArr4 = this.LJFF;
            float[] fArr = this.LJI;
            return editor.LJJII(strArr, iArr2, iArr, strArr2, strArr3, iArr3, iArr4, fArr, fArr, this.LJII, this.LJIIIIZZ);
        }
        return editor.LJJIFFI(this.LJIIIZ, this.LIZJ, this.LIZLLL, this.LJIIIIZZ);
    }
}

package X;

import android.graphics.Paint;
import android.graphics.Rect;

/* renamed from: X.1ac, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C35661ac implements InterfaceC24210xF {
    public int[] LJLIL;
    public float[] LJLILLLLZI;
    public InterfaceC24200xE LJLJJLL;
    public final Paint LJLJI = new Paint(1);
    public int LJLJJI = 0;
    public final Rect LJLJJL = new Rect();
    public int LJLJL = 255;

    @Override // X.InterfaceC24210xF
    public final int[] getGradientColors() {
        throw null;
    }

    @Override // X.InterfaceC24210xF
    public final float[] getGradientPositions() {
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:48:0x00a6, code lost:
    
        if (r10 == 13) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00ab, code lost:
    
        r7 = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x009a, code lost:
    
        if (r10 == 13) goto L56;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZ() {
        /*
            Method dump skipped, instructions count: 184
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C35661ac.LIZ():void");
    }

    @Override // X.InterfaceC24210xF
    public final void LJIJJLI(float[] fArr, int[] iArr) {
        if (iArr == null || fArr == null || iArr.length == fArr.length) {
            this.LJLIL = iArr;
            this.LJLILLLLZI = fArr;
            LIZ();
            InterfaceC24200xE interfaceC24200xE = this.LJLJJLL;
            if (interfaceC24200xE != null) {
                interfaceC24200xE.invalidate();
                return;
            }
            return;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Gradient colors and positions should be of the same length, colors' length is ");
        LIZ.append(iArr.length);
        LIZ.append(", positions' length is ");
        throw new IllegalArgumentException(C08380Uo.LIZ(LIZ, fArr.length, ".", LIZ));
    }
}

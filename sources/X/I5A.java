package X;

import com.ss.android.ugc.aweme.shortvideo.cut.CutMultiVideoViewModel;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class I5A implements W1V {
    public final /* synthetic */ I5Y LIZ;

    public I5A(I5Y i5y) {
        this.LIZ = i5y;
    }

    @Override // X.W1V
    public final void LIZ(int i) {
        I5Y i5y = this.LIZ;
        if (i5y.LJLJI) {
            i5y.LJLJLJ = I5Y.LLJILJIL(i);
            CutMultiVideoViewModel cutMultiVideoViewModel = this.LIZ.LJLJJI;
            if (cutMultiVideoViewModel != null) {
                cutMultiVideoViewModel.LJLJJL.setValue(Float.valueOf(I5Y.LLJILJIL(i).value()));
            } else {
                o.LJIJI("cutMultiVideoViewModel");
                throw null;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x002d, code lost:
    
        if (r0.Mv0().LJIL != false) goto L18;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x005a A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x008f  */
    @Override // X.W1V
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LIZIZ(int r10) {
        /*
            r9 = this;
            X.I5Y r1 = r9.LIZ
            boolean r0 = r1.LJLJI
            r8 = 0
            if (r0 != 0) goto L8
            return r8
        L8:
            X.I5V r0 = r1.LJLIL
            if (r0 != 0) goto Ld
            return r8
        Ld:
            com.ss.android.ugc.aweme.shortvideo.cut.scene.CutVideoViewModel r3 = r1.LJLJJLL
            r2 = 0
            java.lang.String r1 = "cutVideoViewModel"
            if (r3 == 0) goto L9b
            X.H8r r0 = r3.LJLJJLL
            r6 = 1
            if (r0 == 0) goto L91
            X.H8r r0 = r3.Mv0()
            boolean r0 = r0.LJIJJLI
            if (r0 != 0) goto L2f
            X.I5Y r0 = r9.LIZ
            com.ss.android.ugc.aweme.shortvideo.cut.scene.CutVideoViewModel r0 = r0.LJLJJLL
            if (r0 == 0) goto L97
            X.H8r r0 = r0.Mv0()
            boolean r0 = r0.LJIL
            if (r0 == 0) goto L91
        L2f:
            r4 = 500(0x1f4, double:2.47E-321)
        L31:
            X.I5Y r0 = r9.LIZ
            X.I5V r0 = r0.LJLIL
            if (r0 == 0) goto L8f
            float r7 = r0.LJLIL()
        L3b:
            X.I5Y r0 = r9.LIZ
            X.WaC r0 = r0.LJLJLJ
            float r2 = r0.value()
            X.I5Y r0 = r9.LIZ
            r0.getClass()
            X.WaC r0 = X.I5Y.LLJILJIL(r10)
            float r1 = r0.value()
            float r7 = r7 * r2
            float r7 = r7 / r1
            float r3 = (float) r4
            r0 = 1148846080(0x447a0000, float:1000.0)
            float r3 = r3 / r0
            int r0 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r0 < 0) goto L5c
            r8 = 1
        L5b:
            return r8
        L5c:
            float r3 = r3 * r1
            float r3 = r3 / r2
            X.I5Y r0 = r9.LIZ
            android.app.Activity r0 = r0.requireActivity()
            android.content.res.Resources r2 = r0.getResources()
            java.lang.Object[] r1 = new java.lang.Object[r6]
            int r0 = (int) r3
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1[r8] = r0
            r0 = 2131848591(0x7f116d8f, float:1.9330692E38)
            java.lang.String r2 = r2.getString(r0, r1)
            java.lang.String r0 = "requireActivity().resour…                        )"
            kotlin.jvm.internal.o.LJIIIIZZ(r2, r0)
            X.5S1 r1 = new X.5S1
            X.I5Y r0 = r9.LIZ
            android.app.Activity r0 = r0.requireActivity()
            r1.<init>(r0)
            r1.LIZLLL(r2)
            r1.LJ()
            goto L5b
        L8f:
            r7 = 0
            goto L3b
        L91:
            long r4 = X.C44529Hdl.LIZIZ()
            goto L31
        L97:
            kotlin.jvm.internal.o.LJIJI(r1)
            throw r2
        L9b:
            kotlin.jvm.internal.o.LJIJI(r1)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.I5A.LIZIZ(int):boolean");
    }
}

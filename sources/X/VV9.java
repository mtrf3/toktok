package X;

import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.xelement.LynxScrollView;
import kotlin.jvm.internal.o;

/* loaded from: classes15.dex */
public final class VV9 extends C0A6 {
    public C0FT LJLIL;
    public final /* synthetic */ LynxScrollView LJLILLLLZI;

    public VV9(LynxScrollView lynxScrollView) {
        this.LJLILLLLZI = lynxScrollView;
    }

    @Override // X.C0A6
    public final void LJIILJJIL(int i, RecyclerView recyclerView) {
        o.LJIIJ(recyclerView, "recyclerView");
        if (1 == i) {
            if (this.LJLIL == null) {
                LynxScrollView lynxScrollView = this.LJLILLLLZI;
                this.LJLIL = new C0FT(lynxScrollView.mContext, lynxScrollView.mScrollMonitorTag);
            }
            C0FT c0ft = this.LJLIL;
            if (c0ft != null) {
                C0FS.LIZIZ(c0ft.LIZ);
            }
        }
        this.LJLILLLLZI.recognizeGesturere();
        LynxScrollView lynxScrollView2 = this.LJLILLLLZI;
        if (lynxScrollView2.LJLJLJ && lynxScrollView2.LJLLJ == 1 && (i == 2 || i == 0)) {
            if (((VVF) lynxScrollView2.mView).getMScrollDirection() == VVD.HORIZONTAL_LEFT || ((VVF) this.LJLILLLLZI.mView).getMScrollDirection() == VVD.HORIZONTAL_RIGHT) {
                int computeHorizontalScrollOffset = recyclerView.computeHorizontalScrollOffset();
                this.LJLILLLLZI.LJJIII(computeHorizontalScrollOffset, 0, computeHorizontalScrollOffset, 0, "dragend");
            }
            if (((VVF) this.LJLILLLLZI.mView).getMScrollDirection() == VVD.VERTICAL_BOTTOM || ((VVF) this.LJLILLLLZI.mView).getMScrollDirection() == VVD.VERTICAL_TOP) {
                int computeVerticalScrollOffset = recyclerView.computeVerticalScrollOffset();
                this.LJLILLLLZI.LJJIII(0, computeVerticalScrollOffset, 0, computeVerticalScrollOffset, "dragend");
            }
        }
        this.LJLILLLLZI.LJLLJ = i;
        if (i == 0) {
            C0FT c0ft2 = this.LJLIL;
            if (c0ft2 != null) {
                C0FS.LIZIZ(c0ft2.LIZ);
            }
            LynxScrollView lynxScrollView3 = this.LJLILLLLZI;
            if (!lynxScrollView3.LJLJLLL) {
                return;
            }
            if (((VVF) lynxScrollView3.mView).getMScrollDirection() == VVD.HORIZONTAL_LEFT || ((VVF) this.LJLILLLLZI.mView).getMScrollDirection() == VVD.HORIZONTAL_RIGHT) {
                int measuredWidth = recyclerView.getMeasuredWidth();
                int computeHorizontalScrollOffset2 = recyclerView.computeHorizontalScrollOffset() % measuredWidth;
                if (computeHorizontalScrollOffset2 * 2 > measuredWidth) {
                    recyclerView.LJLIIIL(measuredWidth - computeHorizontalScrollOffset2, 0);
                    return;
                } else {
                    recyclerView.LJLIIIL(-computeHorizontalScrollOffset2, 0);
                    return;
                }
            }
            if (((VVF) this.LJLILLLLZI.mView).getMScrollDirection() != VVD.VERTICAL_BOTTOM && ((VVF) this.LJLILLLLZI.mView).getMScrollDirection() != VVD.VERTICAL_TOP) {
                return;
            }
            int measuredHeight = recyclerView.getMeasuredHeight();
            int computeVerticalScrollOffset2 = recyclerView.computeVerticalScrollOffset() % measuredHeight;
            if (computeVerticalScrollOffset2 * 2 > measuredHeight) {
                recyclerView.LJLIIIL(0, measuredHeight - computeVerticalScrollOffset2);
            } else {
                recyclerView.LJLIIIL(0, -computeVerticalScrollOffset2);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0021, code lost:
    
        if (r3.LJLJJL != false) goto L13;
     */
    /* JADX WARN: Removed duplicated region for block: B:30:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:38:? A[RETURN, SYNTHETIC] */
    @Override // X.C0A6
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIILL(androidx.recyclerview.widget.RecyclerView r10, int r11, int r12) {
        /*
            r9 = this;
            java.lang.String r0 = "recyclerView"
            r1 = r10
            kotlin.jvm.internal.o.LJIIJ(r1, r0)
            com.bytedance.ies.xelement.LynxScrollView r1 = r9.LJLILLLLZI
            boolean r0 = r1.LJLJL
            r5 = 0
            if (r0 != 0) goto L15
            boolean r0 = r1.LJLJJLL
            if (r0 != 0) goto L15
            boolean r0 = r1.LJLJJL
            if (r0 == 0) goto Lac
        L15:
            int r0 = r1.LJJIIJ()
        L19:
            com.bytedance.ies.xelement.LynxScrollView r3 = r9.LJLILLLLZI
            boolean r1 = r3.LJLJJLL
            if (r1 != 0) goto L7b
            boolean r1 = r3.LJLJJL
            if (r1 == 0) goto L49
        L23:
            boolean r1 = r3.LJLJJL
            if (r1 == 0) goto L45
            r1 = r0 & 1
            if (r1 == 0) goto L79
            r2 = 1
        L2c:
            int r1 = r3.LJZ
            r1 = r1 & 1
            if (r1 == 0) goto L33
            r5 = 1
        L33:
            r1 = r5 ^ 1
            r2 = r2 & r1
            if (r2 == 0) goto L45
            if (r11 == 0) goto L6b
            int r4 = r3.LJZI
            r5 = 0
            int r6 = r4 - r11
            java.lang.String r8 = "scrolltoupper"
            r7 = r5
            r3.LJJIII(r4, r5, r6, r7, r8)
        L45:
            com.bytedance.ies.xelement.LynxScrollView r1 = r9.LJLILLLLZI
            r1.LJZ = r0
        L49:
            com.bytedance.ies.xelement.LynxScrollView r1 = r9.LJLILLLLZI
            boolean r0 = r1.LJLJL
            if (r0 == 0) goto L5c
            if (r11 == 0) goto L5d
            int r2 = r1.LJZI
            r3 = 0
            int r4 = r2 - r11
            java.lang.String r6 = "scroll"
            r5 = r3
            r1.LJJIII(r2, r3, r4, r5, r6)
        L5c:
            return
        L5d:
            if (r12 == 0) goto L5c
            r2 = 0
            int r3 = r1.LJZI
            int r5 = r3 - r12
            java.lang.String r6 = "scroll"
            r4 = r2
            r1.LJJIII(r2, r3, r4, r5, r6)
            goto L5c
        L6b:
            if (r12 == 0) goto L45
            r4 = 0
            int r5 = r3.LJZI
            int r7 = r5 - r12
            java.lang.String r8 = "scrolltoupper"
            r6 = r4
            r3.LJJIII(r4, r5, r6, r7, r8)
            goto L45
        L79:
            r2 = 0
            goto L2c
        L7b:
            r1 = r0 & 2
            if (r1 == 0) goto L9b
            r2 = 1
        L80:
            int r1 = r3.LJZ
            r1 = r1 & 2
            if (r1 == 0) goto L99
            r1 = 1
        L87:
            r1 = r1 ^ 1
            r2 = r2 & r1
            if (r2 == 0) goto L23
            if (r11 == 0) goto L9d
            int r4 = r3.LJZI
            int r6 = r4 - r11
            java.lang.String r8 = "scrolltolower"
            r7 = r5
            r3.LJJIII(r4, r5, r6, r7, r8)
            goto L45
        L99:
            r1 = 0
            goto L87
        L9b:
            r2 = 0
            goto L80
        L9d:
            if (r12 == 0) goto L45
            int r4 = r3.LJZI
            int r6 = r4 - r12
            java.lang.String r7 = "scrolltolower"
            r2 = r3
            r3 = r5
            r5 = r5
            r2.LJJIII(r3, r4, r5, r6, r7)
            goto L45
        Lac:
            r0 = 0
            goto L19
        */
        throw new UnsupportedOperationException("Method not decompiled: X.VV9.LJIILL(androidx.recyclerview.widget.RecyclerView, int, int):void");
    }
}

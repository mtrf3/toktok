package X;

import android.animation.Animator;
import com.lynx.tasm.behavior.ui.LynxBaseUI;
import java.lang.ref.WeakReference;

/* loaded from: classes15.dex */
public class VQU extends VQX {
    public final WeakReference<C79708VQa> LJLJJI;
    public final boolean LJLJJL;

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0053, code lost:
    
        if (r1 != 2048) goto L21;
     */
    @Override // X.VQX, android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onAnimationEnd(android.animation.Animator r33) {
        /*
            r32 = this;
            r3 = r32
            boolean r0 = r3.LJLJJL
            if (r0 == 0) goto Lb
            r0 = r33
            super.onAnimationEnd(r0)
        Lb:
            java.lang.ref.WeakReference<X.VQa> r0 = r3.LJLJJI
            java.lang.Object r2 = r0.get()
            X.VQa r2 = (X.C79708VQa) r2
            java.lang.ref.WeakReference<com.lynx.tasm.behavior.ui.LynxBaseUI> r0 = r3.LJLIL
            java.lang.Object r14 = r0.get()
            com.lynx.tasm.behavior.ui.LynxBaseUI r14 = (com.lynx.tasm.behavior.ui.LynxBaseUI) r14
            if (r14 == 0) goto L1f
            if (r2 != 0) goto L20
        L1f:
            return
        L20:
            java.util.HashMap<java.lang.Integer, android.animation.Animator> r1 = r2.LJII
            int r0 = r3.LJLILLLLZI
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1.remove(r0)
            int r13 = r14.getOriginLeft()
            int r12 = r14.getOriginTop()
            int r11 = r14.getWidth()
            int r10 = r14.getHeight()
            int r1 = r3.LJLILLLLZI
            r0 = 16
            if (r1 == r0) goto La0
            r0 = 32
            if (r1 == r0) goto L9d
            r0 = 256(0x100, float:3.59E-43)
            if (r1 == r0) goto L9a
            r0 = 512(0x200, float:7.17E-43)
            if (r1 == r0) goto L97
            r0 = 1024(0x400, float:1.435E-42)
            if (r1 == r0) goto L9a
            r0 = 2048(0x800, float:2.87E-42)
            if (r1 == r0) goto L97
        L55:
            int r0 = r14.mPaddingLeft
            r16 = r0
            int r15 = r14.mPaddingTop
            int r9 = r14.mPaddingRight
            int r8 = r14.mPaddingBottom
            int r7 = r14.mMarginLeft
            int r6 = r14.mMarginTop
            int r5 = r14.mMarginRight
            int r4 = r14.mMarginBottom
            int r3 = r14.mBorderLeftWidth
            int r2 = r14.mBorderTopWidth
            int r1 = r14.mBorderRightWidth
            int r0 = r14.mBorderBottomWidth
            android.graphics.Rect r31 = r14.getBound()
            r27 = r3
            r28 = r2
            r29 = r1
            r30 = r0
            r26 = r4
            r25 = r5
            r24 = r6
            r23 = r7
            r22 = r8
            r21 = r9
            r20 = r15
            r19 = r16
            r18 = r10
            r17 = r11
            r16 = r12
            r15 = r13
            r14 = r14
            r14.updateLayout(r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31)
            goto L1f
        L97:
            int r12 = r2.LIZIZ
            goto L55
        L9a:
            int r13 = r2.LIZ
            goto L55
        L9d:
            int r10 = r2.LIZLLL
            goto L55
        La0:
            int r11 = r2.LIZJ
            goto L55
        */
        throw new UnsupportedOperationException("Method not decompiled: X.VQU.onAnimationEnd(android.animation.Animator):void");
    }

    @Override // X.VQX, android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        if (this.LJLJJL) {
            super.onAnimationStart(animator);
        }
    }

    public VQU(LynxBaseUI lynxBaseUI, int i, C79708VQa c79708VQa, boolean z) {
        super(lynxBaseUI, i);
        this.LJLJJL = true;
        this.LJLJJI = new WeakReference<>(c79708VQa);
        this.LJLJJL = z;
    }
}

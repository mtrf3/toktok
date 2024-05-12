package X;

import android.content.Context;
import com.lynx.tasm.behavior.ui.UIShadowProxy;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* renamed from: X.VQt, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public class C79727VQt extends VRK {
    public boolean LJLIL;
    public ArrayList<C79728VQu> LJLILLLLZI;
    public C79726VQs LJLJI;
    public final WeakReference<UIShadowProxy> LJLJJI;

    @Override // X.VRK, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x008c  */
    @Override // X.VRK, android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void dispatchDraw(android.graphics.Canvas r15) {
        /*
            r14 = this;
            java.util.ArrayList<X.VQu> r0 = r14.LJLILLLLZI
            r7 = r15
            if (r0 == 0) goto Lb
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L1a
        Lb:
            X.VQs r0 = r14.LJLJI
            if (r0 != 0) goto L1a
        Lf:
            super.dispatchDraw(r7)
            X.VQs r0 = r14.LJLJI
            if (r0 == 0) goto L19
            r0.LIZIZ(r7)
        L19:
            return
        L1a:
            java.lang.ref.WeakReference<com.lynx.tasm.behavior.ui.UIShadowProxy> r0 = r14.LJLJJI
            java.lang.Object r2 = r0.get()
            com.lynx.tasm.behavior.ui.UIShadowProxy r2 = (com.lynx.tasm.behavior.ui.UIShadowProxy) r2
            r3 = 1065353216(0x3f800000, float:1.0)
            if (r2 == 0) goto L3c
            com.lynx.tasm.behavior.ui.LynxBaseUI r1 = r2.LJLIL
            boolean r0 = r1 instanceof com.lynx.tasm.behavior.ui.LynxUI
            if (r0 == 0) goto L3c
            com.lynx.tasm.behavior.ui.LynxUI r1 = (com.lynx.tasm.behavior.ui.LynxUI) r1
            T extends android.view.View r0 = r1.mView
            float r1 = r0.getAlpha()
            r0 = 981668463(0x3a83126f, float:0.001)
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 > 0) goto L40
            goto Lf
        L3c:
            r7.save()
            goto L59
        L40:
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 >= 0) goto L3c
            r8 = 0
            int r0 = r14.getWidth()
            float r10 = (float) r0
            int r0 = r14.getHeight()
            float r11 = (float) r0
            r0 = 1132396544(0x437f0000, float:255.0)
            float r1 = r1 * r0
            int r12 = (int) r1
            r13 = 31
            r9 = r8
            r7.saveLayerAlpha(r8, r9, r10, r11, r12, r13)
        L59:
            if (r2 == 0) goto L88
            java.lang.ref.WeakReference<com.lynx.tasm.behavior.ui.UIShadowProxy> r0 = r14.LJLJJI
            java.lang.Object r5 = r0.get()
            com.lynx.tasm.behavior.ui.UIShadowProxy r5 = (com.lynx.tasm.behavior.ui.UIShadowProxy) r5
            android.graphics.Matrix r0 = r5.LJLJJI
            r0.reset()
            com.lynx.tasm.behavior.ui.LynxBaseUI r1 = r5.LJLIL
            boolean r0 = r1 instanceof com.lynx.tasm.behavior.ui.LynxUI
            if (r0 != 0) goto Laa
            android.graphics.Matrix r1 = r5.LJLJJI
        L70:
            boolean r0 = r1.isIdentity()
            if (r0 != 0) goto L79
            r7.concat(r1)
        L79:
            java.lang.ref.WeakReference<com.lynx.tasm.behavior.ui.UIShadowProxy> r0 = r14.LJLJJI
            java.lang.Object r0 = r0.get()
            com.lynx.tasm.behavior.ui.LynxBaseUI r0 = (com.lynx.tasm.behavior.ui.LynxBaseUI) r0
            float r0 = r0.getTranslationZ()
            r14.setTranslationZ(r0)
        L88:
            java.util.ArrayList<X.VQu> r0 = r14.LJLILLLLZI
            if (r0 == 0) goto Lea
            int r2 = r0.size()
        L90:
            int r2 = r2 + (-1)
            if (r2 < 0) goto Lea
            java.util.ArrayList<X.VQu> r0 = r14.LJLILLLLZI
            java.lang.Object r1 = com.bytedance.mt.protector.impl.collections.ListProtector.get(r0, r2)
            X.VQu r1 = (X.C79728VQu) r1
            if (r1 == 0) goto L90
            X.VQv r0 = r1.LJIIJ
            boolean r0 = r0.LIZ()
            if (r0 != 0) goto L90
            r1.LIZLLL(r7)
            goto L90
        Laa:
            com.lynx.tasm.behavior.ui.LynxUI r1 = (com.lynx.tasm.behavior.ui.LynxUI) r1
            T extends android.view.View r6 = r1.mView
            if (r6 == 0) goto Le7
            float r4 = r6.getPivotX()
            int r0 = r5.getLeft()
            float r0 = (float) r0
            float r4 = r4 + r0
            float r3 = r6.getPivotY()
            int r0 = r5.getTop()
            float r0 = (float) r0
            float r3 = r3 + r0
            float r2 = r6.getTranslationX()
            float r1 = r6.getTranslationY()
            android.graphics.Matrix r0 = r5.LJLJJI
            r0.preTranslate(r2, r1)
            float r2 = r6.getScaleX()
            float r1 = r6.getScaleY()
            android.graphics.Matrix r0 = r5.LJLJJI
            r0.preScale(r2, r1, r4, r3)
            float r1 = r6.getRotation()
            android.graphics.Matrix r0 = r5.LJLJJI
            r0.preRotate(r1, r4, r3)
        Le7:
            android.graphics.Matrix r1 = r5.LJLJJI
            goto L70
        Lea:
            r7.restore()
            goto Lf
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C79727VQt.dispatchDraw(android.graphics.Canvas):void");
    }

    public C79727VQt(UIShadowProxy uIShadowProxy, Context context) {
        super(context);
        this.LJLJJI = new WeakReference<>(uIShadowProxy);
        setWillNotDraw(false);
    }
}

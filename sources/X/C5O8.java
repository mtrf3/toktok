package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.widget.ImageView;
import com.bytedance.ies.nle.editor_jni.NLETimeSpaceNode;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AqS152S0100000_2;
import kotlin.jvm.internal.o;

/* renamed from: X.5O8, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C5O8 extends ViewGroup {
    public final C5OB LJLIL;
    public final C5OE LJLILLLLZI;
    public final C126844yO LJLJI;
    public final C62822Ol8 LJLJJI;
    public final java.util.Map<NLETrackSlot, C5CP> LJLJJL;
    public OSZ<? extends NLETrackSlot, C5CP> LJLJJLL;
    public OSZ<? extends NLETrackSlot, C5CP> LJLJL;
    public float LJLJLJ;
    public ImageView LJLJLLL;
    public boolean LJLL;
    public float LJLLI;
    public OSZ<Integer, Integer> LJLLILLLL;
    public boolean LJLLJ;
    public long LJLLL;
    public final C62822Ol8 LJLLLL;

    private final C5OA getClipView() {
        return (C5OA) this.LJLJJI.getValue();
    }

    private final int getCursorWidth() {
        return ((Number) this.LJLLLL.getValue()).intValue();
    }

    public final void LIZLLL() {
        NLETrackSlot nLETrackSlot;
        C5CP second;
        if (this.LJLLJ) {
            return;
        }
        OSZ<? extends NLETrackSlot, C5CP> osz = this.LJLJL;
        if (osz != null) {
            nLETrackSlot = osz.getFirst();
        } else {
            nLETrackSlot = null;
        }
        OSZ<? extends NLETrackSlot, C5CP> osz2 = this.LJLJL;
        if (osz2 != null && (second = osz2.getSecond()) != null) {
            ImageView imageView = this.LJLJLLL;
            if (imageView != null) {
                int cursorWidth = (getCursorWidth() / 2) + imageView.getLeft();
                int[] iArr = new int[2];
                second.getLocationOnScreen(iArr);
                int i = iArr[0];
                int width = second.getWidth() + i;
                if (cursorWidth >= i && cursorWidth <= width) {
                    C5OE c5oe = this.LJLILLLLZI;
                    if (c5oe != null) {
                        this.LJLJI.getClass();
                        String LJIIIZ = C126844yO.LJIIIZ(nLETrackSlot);
                        if (LJIIIZ == null) {
                            LJIIIZ = "";
                        }
                        c5oe.LIZIZ(LJIIIZ);
                        return;
                    }
                    return;
                }
            } else {
                o.LJIJI("cursorView");
                throw null;
            }
        }
        C5OE c5oe2 = this.LJLILLLLZI;
        if (c5oe2 == null) {
            return;
        }
        c5oe2.LIZIZ(null);
    }

    public final void LJIIIIZZ() {
        C5OA clipView = getClipView();
        if (C78996UzQ.LJJIIJZLJL(clipView)) {
            C78996UzQ.LJI();
        }
        removeView(clipView);
        C5OA clipView2 = getClipView();
        C5OC style = C5OC.NONE;
        clipView2.getClass();
        o.LJIIIZ(style, "style");
        clipView2.LJLILLLLZI = style;
        clipView2.invalidate();
        this.LJLJL = null;
    }

    public final C5OA getClipView$tools_camera_edit_release() {
        return getClipView();
    }

    public final float LIZ(float f) {
        int cursorWidth = this.LJLIL.LJLLJ - (getCursorWidth() / 2);
        int LJ = (C143205jg.LJ() - this.LJLIL.LJLLJ) - (getCursorWidth() / 2);
        float f2 = cursorWidth;
        if (f >= f2) {
            f2 = LJ;
            if (f <= f2) {
                return f;
            }
        }
        return f2;
    }

    public final void LIZJ(int i) {
        if (i < 0) {
            return;
        }
        ImageView imageView = this.LJLJLLL;
        if (imageView != null) {
            ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
            o.LJII(layoutParams, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            if (C90193gN.LIZ()) {
                marginLayoutParams.setMarginEnd(i);
            } else {
                marginLayoutParams.setMarginStart(i);
            }
            ImageView imageView2 = this.LJLJLLL;
            if (imageView2 != null) {
                imageView2.setLayoutParams(marginLayoutParams);
                return;
            } else {
                o.LJIJI("cursorView");
                throw null;
            }
        }
        o.LJIJI("cursorView");
        throw null;
    }

    public final void LJ(float f) {
        if (C90193gN.LIZIZ(getContext())) {
            f = 1 - f;
        }
        int LJ = C143205jg.LJ();
        LIZJ((int) LIZ((((LJ - (r1 * 2)) * f) + this.LJLIL.LJLLJ) - (getCursorWidth() / 2)));
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x005c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJI(com.bytedance.ies.nle.editor_jni.NLETrackSlot r5) {
        /*
            r4 = this;
            if (r5 != 0) goto L3
            return
        L3:
            boolean r0 = r4.LJLLJ
            r1 = 0
            if (r0 == 0) goto L30
            X.OSZ<? extends com.bytedance.ies.nle.editor_jni.NLETrackSlot, X.5CP> r0 = r4.LJLJJLL
            if (r0 == 0) goto L18
            java.lang.Object r0 = r0.getFirst()
            com.bytedance.ies.nle.editor_jni.NLENode r0 = (com.bytedance.ies.nle.editor_jni.NLENode) r0
            if (r0 == 0) goto L18
            java.lang.String r1 = r0.getUUID()
        L18:
            java.lang.String r0 = r5.getUUID()
            boolean r0 = kotlin.jvm.internal.o.LJ(r1, r0)
            if (r0 == 0) goto L30
            X.OSZ<? extends com.bytedance.ies.nle.editor_jni.NLETrackSlot, X.5CP> r0 = r4.LJLJJLL
            if (r0 == 0) goto L2c
            java.lang.Object r3 = r0.getSecond()
        L2a:
            if (r3 != 0) goto L5c
        L2c:
            r4.LJIIIIZZ()
            return
        L30:
            java.util.Map<com.bytedance.ies.nle.editor_jni.NLETrackSlot, X.5CP> r0 = r4.LJLJJL
            java.util.LinkedHashMap r0 = (java.util.LinkedHashMap) r0
            java.util.Collection r0 = r0.values()
            java.util.Iterator r2 = r0.iterator()
        L3c:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L2c
            java.lang.Object r3 = r2.next()
            r0 = r3
            X.5CP r0 = (X.C5CP) r0
            com.bytedance.ies.nle.editor_jni.NLETrackSlot r0 = r0.getSlot$tools_camera_edit_release()
            java.lang.String r1 = r0.getUUID()
            java.lang.String r0 = r5.getUUID()
            boolean r0 = kotlin.jvm.internal.o.LJ(r1, r0)
            if (r0 == 0) goto L3c
            goto L2a
        L5c:
            X.5OA r1 = r4.getClipView()
            boolean r0 = X.C78996UzQ.LJJIIJZLJL(r1)
            if (r0 == 0) goto L69
            X.C78996UzQ.LJI()
        L69:
            r4.removeView(r1)
            X.5OA r2 = r4.getClipView()
            boolean r0 = r4.LJLLJ
            if (r0 == 0) goto L98
            boolean r0 = X.C17J.LJJIJLIJ(r5)
            if (r0 != 0) goto L98
            X.5OC r1 = X.C5OC.LINE
        L7c:
            r2.getClass()
            java.lang.String r0 = "style"
            kotlin.jvm.internal.o.LJIIIZ(r1, r0)
            r2.LJLILLLLZI = r1
            r2.invalidate()
            X.5OA r0 = r4.getClipView()
            r4.addView(r0)
            X.OSZ r0 = new X.OSZ
            r0.<init>(r5, r3)
            r4.LJLJL = r0
            return
        L98:
            boolean r0 = X.C17J.LJJIL(r5)
            if (r0 == 0) goto La1
            X.5OC r1 = X.C5OC.LINE
            goto L7c
        La1:
            X.5OC r1 = X.C5OC.CLIP
            goto L7c
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C5O8.LJI(com.bytedance.ies.nle.editor_jni.NLETrackSlot):void");
    }

    public final void LJII(boolean z) {
        float f;
        if (z) {
            f = 1.1f;
        } else {
            f = 1.0f;
        }
        ImageView imageView = this.LJLJLLL;
        if (imageView != null) {
            ViewPropertyAnimator animate = imageView.animate();
            animate.scaleX(f);
            animate.scaleY(f);
            animate.setDuration(50L);
            animate.start();
            return;
        }
        o.LJIJI("cursorView");
        throw null;
    }

    public final float LJIIIZ(float f) {
        int LJ = C143205jg.LJ();
        float f2 = (f - this.LJLIL.LJLLJ) / (LJ - (r1 * 2));
        if (f2 > 0.99d) {
            f2 = 1.0f;
        }
        if (f2 < 0.01d) {
            f2 = 0.0f;
        }
        if (C90193gN.LIZ()) {
            return 1 - f2;
        }
        return f2;
    }

    public final void setCursor$tools_camera_edit_release(ImageView view) {
        o.LJIIIZ(view, "view");
        this.LJLJLLL = view;
    }

    public final void setDuration$tools_camera_edit_release(int i) {
        this.LJLJLJ = (C143205jg.LJ() - (this.LJLIL.LJLLJ * 2)) / i;
        invalidate();
    }

    public final void LJFF(boolean z, float f, boolean z2) {
        if (z) {
            LJII(true);
            return;
        }
        if (z2) {
            LJII(false);
        }
        float LIZ = LIZ(f);
        LIZJ((int) LIZ);
        float LJIIIZ = LJIIIZ(LIZ + (getCursorWidth() / 2));
        C5OE c5oe = this.LJLILLLLZI;
        if (c5oe != null) {
            c5oe.LIZ(LJIIIZ, z2);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5O8(C5OB config, C5OE c5oe, Context context, C126844yO editEffectNLEHandler) {
        super(context, null, 0);
        o.LJIIIZ(config, "config");
        o.LJIIIZ(editEffectNLEHandler, "editEffectNLEHandler");
        new LinkedHashMap();
        this.LJLIL = config;
        this.LJLILLLLZI = c5oe;
        this.LJLJI = editEffectNLEHandler;
        this.LJLJJI = C221108m2.LIZIZ(new AqS152S0100000_2(this, 841));
        this.LJLJJL = new LinkedHashMap();
        this.LJLJLJ = 1.0f;
        this.LJLLI = -1.0f;
        this.LJLLLL = C221108m2.LIZIZ(new AqS152S0100000_2(this, 842));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        C5CP c5cp;
        C5CP second;
        OSZ<? extends NLETrackSlot, C5CP> osz;
        NLETrackSlot first;
        OSZ<? extends NLETrackSlot, C5CP> osz2;
        C5CP second2;
        int endTime;
        int height = getHeight();
        int i5 = this.LJLIL.LJLLILLLL;
        int i6 = (height - i5) / 2;
        int i7 = i5 + i6;
        if (this.LJLLJ) {
            if (this.LJLL || (osz = this.LJLJJLL) == null || (first = osz.getFirst()) == null || (osz2 = this.LJLJJLL) == null || (second2 = osz2.getSecond()) == null) {
                return;
            }
            long j = 1000;
            int startTime = (int) ((((float) (first.getStartTime() / j)) * this.LJLJLJ) + this.LJLIL.LJLLJ);
            if (C17J.LJJIJLIJ(first)) {
                endTime = C17J.LJJIJIIJIL(first);
            } else {
                endTime = (int) (first.getEndTime() / j);
            }
            int rint = this.LJLIL.LJLLJ + ((int) Math.rint(endTime * this.LJLJLJ));
            if (C90193gN.LIZ()) {
                second2.layout(C143205jg.LJ() - rint, i6, C143205jg.LJ() - startTime, i7);
            } else {
                second2.layout(startTime, i6, rint, i7);
            }
        } else {
            for (Map.Entry entry : ((LinkedHashMap) this.LJLJJL).entrySet()) {
                NLETimeSpaceNode nLETimeSpaceNode = (NLETimeSpaceNode) entry.getKey();
                View view = (View) entry.getValue();
                if (this.LJLL) {
                    OSZ<? extends NLETrackSlot, C5CP> osz3 = this.LJLJL;
                    if (osz3 != null) {
                        c5cp = osz3.getSecond();
                    } else {
                        c5cp = null;
                    }
                    if (!o.LJ(c5cp, view)) {
                    }
                }
                long j2 = 1000;
                int rint2 = this.LJLIL.LJLLJ + ((int) Math.rint(((float) (nLETimeSpaceNode.getStartTime() / j2)) * this.LJLJLJ));
                int rint3 = this.LJLIL.LJLLJ + ((int) Math.rint(((float) (nLETimeSpaceNode.getEndTime() / j2)) * this.LJLJLJ));
                if (C90193gN.LIZ()) {
                    view.layout(C143205jg.LJ() - rint3, i6, C143205jg.LJ() - rint2, i7);
                } else {
                    view.layout(rint2, i6, rint3, i7);
                }
            }
        }
        OSZ<? extends NLETrackSlot, C5CP> osz4 = this.LJLJL;
        if (osz4 == null || (second = osz4.getSecond()) == null) {
            return;
        }
        int height2 = (getHeight() - this.LJLIL.LJLJL) / 2;
        C5OA clipView = getClipView();
        int left = second.getLeft() - this.LJLIL.LJLJJLL;
        int right = second.getRight();
        C5OB c5ob = this.LJLIL;
        clipView.layout(left, height2, right + c5ob.LJLJJLL, c5ob.LJLJL + height2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:151:0x019d, code lost:
    
        if (r9 > r8) goto L71;
     */
    /* JADX WARN: Removed duplicated region for block: B:101:0x020d  */
    /* JADX WARN: Removed duplicated region for block: B:108:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0222  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0257  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01f6  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0206  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LIZIZ(X.C5O8 r13, float r14, boolean r15, boolean r16, boolean r17, int r18) {
        /*
            Method dump skipped, instructions count: 671
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C5O8.LIZIZ(X.5O8, float, boolean, boolean, boolean, int):void");
    }
}

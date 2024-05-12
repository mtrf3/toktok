package com.lynx.tasm.behavior.ui;

import X.VGO;
import X.VGP;
import X.VGQ;
import X.VNU;
import X.VPD;
import X.VPG;
import X.VPH;
import X.X1D;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Build;
import com.lynx.react.bridge.ReadableArray;
import com.lynx.tasm.LynxEnv;
import com.lynx.tasm.base.TraceEvent;
import com.lynx.tasm.behavior.ui.utils.BackgroundDrawable;
import java.util.Iterator;

/* loaded from: classes15.dex */
public class LynxFlattenUI extends LynxBaseUI {
    public float mAlpha;
    public boolean mIsValidate;
    public VPG mRenderNode;

    public boolean enableRenderNode() {
        return true;
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public float getTranslationX() {
        return 0.0f;
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public float getTranslationY() {
        return 0.0f;
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public float getTranslationZ() {
        return 0.0f;
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI, X.VPH
    public void invalidate() {
        this.mIsValidate = false;
        VPH vph = this.mDrawParent;
        if (vph != null) {
            vph.invalidate();
        }
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public boolean isFlatten() {
        return true;
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI, X.VPH
    public void requestLayout() {
        this.mIsValidate = false;
        VPH vph = this.mDrawParent;
        if (vph != null) {
            vph.requestLayout();
        }
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public int getInitialOverflowType() {
        if (this.mContext.LJZ && ("view".equals(getTagName()) || "component".equals(getTagName()))) {
            return 0;
        }
        return 1;
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public void measure() {
        Iterator<LynxBaseUI> it = this.mChildren.iterator();
        while (it.hasNext()) {
            it.next().measure();
        }
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public void onAttach() {
        super.onAttach();
        invalidate();
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public void onDrawingPositionChanged() {
        invalidate();
    }

    public LynxFlattenUI(Context context) {
        this((VNU) context);
    }

    private boolean isHardwareDraw(Canvas canvas) {
        return canvas.isHardwareAccelerated();
    }

    public void draw(Canvas canvas) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(getTagName());
        LIZ.append(".flatten.draw");
        String LIZIZ = X1D.LIZIZ(LIZ);
        TraceEvent.LIZIZ(LIZIZ);
        if (this.mAlpha <= 0.0f) {
            TraceEvent.LJ(LIZIZ);
            return;
        }
        int left = getLeft();
        int top = getTop();
        int save = canvas.save();
        if ((left | top) != 0) {
            canvas.translate(left, top);
        }
        if (this.mAlpha < 1.0f) {
            canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), (int) (this.mAlpha * 255.0f), 31);
        }
        onDraw(canvas);
        canvas.restoreToCount(save);
        TraceEvent.LJ(LIZIZ);
    }

    public final void innerDraw(Canvas canvas) {
        if (this.mRenderNode == null || !isHardwareDraw(canvas)) {
            draw(canvas);
            return;
        }
        boolean z = this.mIsValidate;
        this.mIsValidate = true;
        if (!z || !this.mRenderNode.LIZLLL()) {
            updateRenderNode(this.mRenderNode);
        }
        if (!this.mRenderNode.LIZLLL()) {
            return;
        }
        this.mRenderNode.LIZIZ(canvas);
    }

    public void onDraw(Canvas canvas) {
        BackgroundDrawable backgroundDrawable = this.mLynxBackground.LIZIZ;
        if (backgroundDrawable == null) {
            return;
        }
        backgroundDrawable.setBounds(0, 0, getWidth(), getHeight());
        backgroundDrawable.draw(canvas);
    }

    @VPD(defaultFloat = 1.0f, name = "opacity")
    public void setAlpha(float f) {
        this.mAlpha = f;
        invalidate();
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    @VPD(name = "transform")
    public void setTransform(ReadableArray readableArray) {
        super.setTransform(readableArray);
        invalidate();
    }

    public void updateRenderNode(VPG vpg) {
        int width = getWidth();
        int height = getHeight();
        int left = getLeft();
        int top = getTop();
        int i = left + width;
        int i2 = top + height;
        if (getOverflow() != 0) {
            Rect clipBounds = getClipBounds();
            i = clipBounds.right + left;
            i2 = clipBounds.bottom + top;
            left += clipBounds.left;
            top += clipBounds.top;
            width = i - left;
            height = i2 - top;
        }
        vpg.LJFF(left, top, i, i2);
        Canvas LIZ = vpg.LIZ(width, height);
        try {
            LIZ.translate(-left, -top);
            draw(LIZ);
        } finally {
            vpg.LIZJ(LIZ);
        }
    }

    public LynxFlattenUI(VNU vnu) {
        this(vnu, null);
    }

    public LynxFlattenUI(VNU vnu, Object obj) {
        super(vnu, obj);
        VPG vgo;
        this.mAlpha = 1.0f;
        if (LynxEnv.LJJIJIIJIL.compareAndSet(false, true)) {
            LynxEnv.LJJIJIIJI = LynxEnv.LIZLLL("enable_render_node");
        }
        if (LynxEnv.LJJIJIIJI && enableRenderNode()) {
            int i = Build.VERSION.SDK_INT;
            if (i >= 29) {
                vgo = new VGQ();
            } else if (i >= 23) {
                vgo = new VGP();
            } else {
                vgo = new VGO();
            }
            vgo.LJ();
            this.mRenderNode = vgo;
        }
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public void setPosition(int i, int i2) {
        if (getOriginTop() != i2) {
            this.mOriginTop = i2;
            setTop(i2);
        }
        if (getOriginLeft() != i) {
            this.mOriginLeft = i;
            setLeft(i);
        }
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public void setSign(int i, String str) {
        super.setSign(i, str);
        if (this.mContext.LJZ) {
            if (str.equals("view") || str.equals("component")) {
                this.mOverflow = 3;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0048  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void layout(int r7, int r8, android.graphics.Rect r9) {
        /*
            r6 = this;
            r6.updateDrawingLayoutInfo(r7, r8, r9)
            android.graphics.Rect r2 = new android.graphics.Rect
            int r5 = r6.getLeft()
            int r4 = r6.getTop()
            int r0 = r6.getLeft()
            int r3 = r6.getWidth()
            int r3 = r3 + r0
            int r1 = r6.getTop()
            int r0 = r6.getHeight()
            int r0 = r0 + r1
            r2.<init>(r5, r4, r3, r0)
            int r3 = r6.getOverflow()
            r0 = r3 & 1
            r4 = 0
            if (r0 == 0) goto Lcb
            r1 = 1
        L2c:
            r0 = r3 & 2
            if (r0 == 0) goto L31
            r4 = 1
        L31:
            X.VNU r0 = r6.mContext
            android.util.DisplayMetrics r3 = r0.LJLZ
            if (r1 == 0) goto L86
            if (r4 == 0) goto L71
            if (r9 != 0) goto L7d
            r2 = 0
        L3c:
            java.util.List<com.lynx.tasm.behavior.ui.LynxBaseUI> r0 = r6.mChildren
            java.util.Iterator r5 = r0.iterator()
        L42:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto Lce
            java.lang.Object r4 = r5.next()
            com.lynx.tasm.behavior.ui.LynxBaseUI r4 = (com.lynx.tasm.behavior.ui.LynxBaseUI) r4
            int r3 = r4.getOriginLeft()
            int r3 = r3 + r7
            int r1 = r4.getOriginTop()
            int r1 = r1 + r8
            boolean r0 = r4.isFlatten()
            if (r0 != 0) goto L65
            r4.updateDrawingLayoutInfo(r3, r1, r2)
            r4.layout()
            goto L42
        L65:
            boolean r0 = r4.isFlatten()
            if (r0 == 0) goto L42
            com.lynx.tasm.behavior.ui.LynxFlattenUI r4 = (com.lynx.tasm.behavior.ui.LynxFlattenUI) r4
            r4.layout(r3, r1, r2)
            goto L42
        L71:
            if (r9 != 0) goto L7d
            int r1 = r3.widthPixels
            int r0 = -r1
            r2.left = r0
            int r0 = r1 * 2
            r2.right = r0
            goto L98
        L7d:
            int r0 = r9.left
            r2.left = r0
            int r0 = r9.right
            r2.right = r0
            goto L98
        L86:
            if (r9 == 0) goto L98
            int r1 = r2.left
            int r0 = r9.left
            if (r1 <= r0) goto La8
        L8e:
            r2.left = r1
            int r1 = r2.right
            int r0 = r9.right
            if (r1 >= r0) goto La6
        L96:
            r2.right = r1
        L98:
            if (r4 == 0) goto Lb3
            if (r9 != 0) goto Laa
            int r1 = r3.heightPixels
            int r0 = -r1
            r2.top = r0
            int r0 = r1 * 2
            r2.bottom = r0
            goto L3c
        La6:
            r1 = r0
            goto L96
        La8:
            r1 = r0
            goto L8e
        Laa:
            int r0 = r9.top
            r2.top = r0
            int r0 = r9.bottom
            r2.bottom = r0
            goto L3c
        Lb3:
            if (r9 == 0) goto L3c
            int r1 = r2.top
            int r0 = r9.top
            if (r1 <= r0) goto Lc9
        Lbb:
            r2.top = r1
            int r1 = r2.bottom
            int r0 = r9.bottom
            if (r1 >= r0) goto Lc7
        Lc3:
            r2.bottom = r1
            goto L3c
        Lc7:
            r1 = r0
            goto Lc3
        Lc9:
            r1 = r0
            goto Lbb
        Lcb:
            r1 = 0
            goto L2c
        Lce:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.lynx.tasm.behavior.ui.LynxFlattenUI.layout(int, int, android.graphics.Rect):void");
    }
}

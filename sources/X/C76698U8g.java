package X;

import android.graphics.Rect;
import android.graphics.RectF;
import android.widget.FrameLayout;
import com.bytedance.android.livesdk.comp.api.linkcore.model.Layout;
import com.ss.ttlivestreamer.core.mixer.VideoMixer;
import kotlin.jvm.internal.AqS179S0100000_13;
import kotlin.jvm.internal.o;

/* renamed from: X.U8g, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C76698U8g implements UA1 {
    public final U8P LIZ;
    public final InterfaceC88472Yns<String, C76800UCe> LIZIZ;
    public boolean LIZJ;
    public Rect LIZLLL;

    public final boolean LJI() {
        Integer isOverlay;
        U8P u8p = this.LIZ;
        Layout LIZ = u8p.LIZ();
        if (LIZ != null && (isOverlay = LIZ.isOverlay()) != null) {
            int intValue = isOverlay.intValue();
            String LJIIIZ = U8P.LJIIIZ(52);
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("isOverlay = ");
            LIZ2.append(intValue);
            C32014ChO.LIZ(LJIIIZ, X1D.LIZIZ(LIZ2));
            if (intValue != 0) {
                if (intValue == 1) {
                    return true;
                }
                return u8p.LJIIIIZZ();
            }
            return false;
        }
        return u8p.LJIIIIZZ();
    }

    @Override // X.UA1
    public final void LIZ(Rect rect) {
        this.LIZLLL = rect;
    }

    public final void LJII(String str) {
        InterfaceC88472Yns<String, C76800UCe> interfaceC88472Yns = this.LIZIZ;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("error: ");
        LIZ.append(str);
        interfaceC88472Yns.invoke(X1D.LIZIZ(LIZ));
        C0K2.LIZ(str, new Throwable());
    }

    public C76698U8g(U8P helper, AqS179S0100000_13 aqS179S0100000_13) {
        o.LJIIIZ(helper, "helper");
        this.LIZ = helper;
        this.LIZIZ = aqS179S0100000_13;
    }

    @Override // X.UA1
    public final void LIZIZ(Rect rect, boolean z) {
        this.LIZJ = z;
        this.LIZLLL = rect;
    }

    @Override // X.UA1
    public final Rect LJ(Rect rect, Rect allAreaRect) {
        Rect rect2;
        o.LJIIIZ(allAreaRect, "allAreaRect");
        Rect rect3 = new Rect();
        if (this.LIZJ && (rect2 = this.LIZLLL) != null) {
            allAreaRect = rect2;
        }
        rect3.left = allAreaRect.left;
        rect3.top = allAreaRect.top;
        rect3.right = allAreaRect.right;
        rect3.bottom = allAreaRect.bottom;
        return rect3;
    }

    @Override // X.UA1
    public final void LIZLLL(int i, int i2, C76711U8t micWindow) {
        o.LJIIIZ(micWindow, "micWindow");
        VideoMixer.VideoMixerDescription description = new VideoMixer.VideoMixerDescription();
        description.setVisibility(false);
        o.LJIIIIZZ(description, "description");
        LJFF(description, micWindow, i2);
        InterfaceC88472Yns<String, C76800UCe> interfaceC88472Yns = this.LIZIZ;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("remove layer view pos = ");
        LIZ.append(i);
        LIZ.append(", server pos = ");
        LIZ.append(i2);
        interfaceC88472Yns.invoke(X1D.LIZIZ(LIZ));
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x006f, code lost:
    
        if (X.C76800UCe.LIZ == null) goto L25;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJFF(com.ss.ttlivestreamer.core.mixer.VideoMixer.VideoMixerDescription r4, X.C76711U8t r5, int r6) {
        /*
            r3 = this;
            X.U8j r0 = r5.LJLIL
            java.lang.ref.WeakReference<com.ss.ttlivestreamer.livestreamv2.core.ILayerControl$ILayer> r0 = r0.LJ
            if (r0 == 0) goto L15
            java.lang.Object r0 = r0.get()
            com.ss.ttlivestreamer.livestreamv2.core.ILayerControl$ILayer r0 = (com.ss.ttlivestreamer.livestreamv2.core.ILayerControl.ILayer) r0
            if (r0 == 0) goto L15
            r0.updateDescription(r4)
            X.UCe r0 = X.C76800UCe.LIZ
            if (r0 != 0) goto L55
        L15:
            X.U8P r0 = r3.LIZ
            X.U8H r0 = r0.LIZ
            com.bytedance.android.livesdk.comp.api.linkcore.model.LinkUser r0 = r0.LJIILLIIL
            java.lang.String r2 = r0.getLinkMicId()
            X.U8j r0 = r5.LJLIL
            java.lang.String r1 = r0.LIZJ
            if (r2 == 0) goto L2b
            int r0 = r2.length()
            if (r0 != 0) goto L9a
        L2b:
            if (r6 != 0) goto L56
        L2d:
            X.U8P r0 = r3.LIZ
            X.U8H r0 = r0.LIZ
            X.U6z r0 = r0.LIZ
            X.U8M r0 = r0.LJFF
            com.ss.ttlivestreamer.livestreamv2.core.ILayerControl$ILayer r0 = r0.LJJIJIIJIL()
            if (r0 == 0) goto L42
            r0.updateDescription(r4)
            X.UCe r0 = X.C76800UCe.LIZ
            if (r0 != 0) goto L55
        L42:
            java.lang.StringBuilder r1 = X.X1D.LIZ()
            java.lang.String r0 = "cannot find local layer for owner "
            r1.append(r0)
            r1.append(r6)
            java.lang.String r0 = X.X1D.LIZIZ(r1)
            r3.LJII(r0)
        L55:
            return
        L56:
            X.U8j r0 = r5.LJLIL
            java.lang.String r1 = r0.LIZJ
            if (r1 == 0) goto L84
            X.U8P r0 = r3.LIZ
            X.U8H r0 = r0.LIZ
            X.U6z r0 = r0.LIZ
            X.U8M r0 = r0.LJFF
            com.ss.ttlivestreamer.livestreamv2.core.ILayerControl$ILayer r0 = r0.getLayer(r1)
            if (r0 == 0) goto L71
            r0.updateDescription(r4)
            X.UCe r0 = X.C76800UCe.LIZ
            if (r0 != 0) goto L84
        L71:
            java.lang.StringBuilder r1 = X.X1D.LIZ()
            java.lang.String r0 = "cannot find local layer for other "
            r1.append(r0)
            r1.append(r6)
            java.lang.String r0 = X.X1D.LIZIZ(r1)
            r3.LJII(r0)
        L84:
            X.Yns<java.lang.String, X.UCe> r2 = r3.LIZIZ
            java.lang.StringBuilder r1 = X.X1D.LIZ()
            java.lang.String r0 = "cannot find layer for user "
            r1.append(r0)
            r1.append(r6)
            java.lang.String r0 = X.X1D.LIZIZ(r1)
            r2.invoke(r0)
            goto L55
        L9a:
            if (r1 == 0) goto L2b
            int r0 = r1.length()
            if (r0 != 0) goto La3
            goto L2b
        La3:
            boolean r0 = kotlin.jvm.internal.o.LJ(r2, r1)
            if (r0 != 0) goto L2d
            goto L2b
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C76698U8g.LJFF(com.ss.ttlivestreamer.core.mixer.VideoMixer$VideoMixerDescription, X.U8t, int):void");
    }

    @Override // X.UA1
    public final void LIZJ(int i, int i2, C76711U8t micWindow, FrameLayout.LayoutParams layoutParams, Rect allAreaRect) {
        Rect rect;
        int i3;
        o.LJIIIZ(micWindow, "micWindow");
        o.LJIIIZ(allAreaRect, "allAreaRect");
        if (!this.LIZJ || (rect = this.LIZLLL) == null) {
            rect = allAreaRect;
        }
        int width = rect.width();
        int height = rect.height();
        if (height <= 0 || width <= 0) {
            this.LIZIZ.invoke(C48690J9a.LJIIJJI("add layer view pos = ", i, ", server pos = ", i2, ", player rect is 0"));
            return;
        }
        RectF rectF = new RectF();
        float f = width;
        float f2 = ((allAreaRect.left - rect.left) + layoutParams.leftMargin) / f;
        rectF.left = f2;
        rectF.right = (layoutParams.width / f) + f2;
        float f3 = height;
        float f4 = ((allAreaRect.top - rect.top) + layoutParams.topMargin) / f3;
        rectF.top = f4;
        rectF.bottom = (layoutParams.height / f3) + f4;
        VideoMixer.VideoMixerDescription description = new VideoMixer.VideoMixerDescription();
        description.setLeft(rectF.left);
        description.setRight(rectF.right);
        description.setTop(rectF.top);
        description.setBottom(rectF.bottom);
        description.setVisibility(true);
        description.setMode(2);
        if (i == 0) {
            if (LJI()) {
                i3 = 100;
            } else if (!LJI()) {
                i3 = 200;
            }
            description.setzOrder(i3);
            o.LJIIIIZZ(description, "description");
            LJFF(description, micWindow, i2);
            InterfaceC88472Yns<String, C76800UCe> interfaceC88472Yns = this.LIZIZ;
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("add layer view pos = ");
            LIZ.append(i);
            LIZ.append(", server pos = ");
            LIZ.append(i2);
            interfaceC88472Yns.invoke(X1D.LIZIZ(LIZ));
        }
        i3 = 150;
        description.setzOrder(i3);
        o.LJIIIIZZ(description, "description");
        LJFF(description, micWindow, i2);
        InterfaceC88472Yns<String, C76800UCe> interfaceC88472Yns2 = this.LIZIZ;
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("add layer view pos = ");
        LIZ2.append(i);
        LIZ2.append(", server pos = ");
        LIZ2.append(i2);
        interfaceC88472Yns2.invoke(X1D.LIZIZ(LIZ2));
    }
}

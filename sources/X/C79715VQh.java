package X;

import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import com.lynx.tasm.behavior.ui.LynxUI;
import com.lynx.tasm.behavior.ui.utils.BackgroundDrawable;
import java.lang.ref.WeakReference;

/* renamed from: X.VQh, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C79715VQh extends VQ3 {
    public final WeakReference<LynxUI> LJFF;
    public C79716VQi LJI;
    public PointF LJII;
    public boolean LJIIIIZZ;

    @Override // X.VQ3
    public final BackgroundDrawable LIZ() {
        LynxUI lynxUI = this.LJFF.get();
        if (lynxUI == null) {
            return null;
        }
        BackgroundDrawable LIZ = super.LIZ();
        T t = lynxUI.mView;
        if (t != 0) {
            Drawable background = t.getBackground();
            lynxUI.mView.setBackground(null);
            if (background == null) {
                lynxUI.mView.setBackground(LIZ);
            } else {
                lynxUI.mView.setBackground(new LayerDrawable(new Drawable[]{LIZ, background}));
            }
        }
        return LIZ;
    }

    public final void LJIIL() {
        float f;
        LynxUI lynxUI = this.LJFF.get();
        if (lynxUI == null) {
            return;
        }
        PointF pointF = this.LJII;
        float f2 = 0.0f;
        if (pointF != null) {
            float f3 = pointF.x + 0.0f;
            f = 0.0f + pointF.y;
            f2 = f3;
        } else {
            f = 0.0f;
        }
        C79716VQi c79716VQi = this.LJI;
        if (c79716VQi != null) {
            f2 += c79716VQi.LJFF();
            f += this.LJI.LJI();
        }
        T t = lynxUI.mView;
        if (t != 0) {
            t.setTranslationX(f2);
            lynxUI.mView.setTranslationY(f);
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:42:0x010e. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0722  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIIJJI(java.util.List<X.VQ4> r134) {
        /*
            Method dump skipped, instructions count: 2064
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C79715VQh.LJIIJJI(java.util.List):void");
    }

    public C79715VQh(LynxUI lynxUI, VNU vnu) {
        super(vnu);
        this.LJIIIIZZ = true;
        this.LJFF = new WeakReference<>(lynxUI);
    }
}

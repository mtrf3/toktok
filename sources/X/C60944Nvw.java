package X;

import android.view.View;
import android.view.ViewGroup;
import com.bytedance.lynx.spark.schema.model.SparkPopupSchemaParam;
import kotlin.jvm.internal.o;

/* renamed from: X.Nvw, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C60944Nvw implements InterfaceC60871Nul {
    public final View LIZ;
    public final Integer[] LIZIZ;

    @Override // X.InterfaceC60871Nul
    public final void invoke() {
        Object LIZ;
        Object LIZ2;
        Object LIZ3;
        Object LIZ4;
        try {
            LIZ = Integer.valueOf(this.LIZIZ[0].intValue());
            C3C5.m7constructorimpl(LIZ);
        } catch (Throwable th) {
            LIZ = C141335gf.LIZ(th);
            C3C5.m7constructorimpl(LIZ);
        }
        if (C3C5.m12isFailureimpl(LIZ)) {
            LIZ = 0;
        }
        int intValue = ((Number) LIZ).intValue();
        try {
            LIZ2 = Integer.valueOf(this.LIZIZ[1].intValue());
            C3C5.m7constructorimpl(LIZ2);
        } catch (Throwable th2) {
            LIZ2 = C141335gf.LIZ(th2);
            C3C5.m7constructorimpl(LIZ2);
        }
        if (C3C5.m12isFailureimpl(LIZ2)) {
            LIZ2 = 0;
        }
        int intValue2 = ((Number) LIZ2).intValue();
        try {
            LIZ3 = Integer.valueOf(this.LIZIZ[2].intValue());
            C3C5.m7constructorimpl(LIZ3);
        } catch (Throwable th3) {
            LIZ3 = C141335gf.LIZ(th3);
            C3C5.m7constructorimpl(LIZ3);
        }
        if (C3C5.m12isFailureimpl(LIZ3)) {
            LIZ3 = 0;
        }
        int intValue3 = ((Number) LIZ3).intValue();
        try {
            LIZ4 = Integer.valueOf(this.LIZIZ[3].intValue());
            C3C5.m7constructorimpl(LIZ4);
        } catch (Throwable th4) {
            LIZ4 = C141335gf.LIZ(th4);
            C3C5.m7constructorimpl(LIZ4);
        }
        if (C3C5.m12isFailureimpl(LIZ4)) {
            LIZ4 = 0;
        }
        int intValue4 = ((Number) LIZ4).intValue();
        if (intValue2 > 0 || intValue4 > 0 || intValue > 0 || intValue3 > 0) {
            ViewGroup.LayoutParams layoutParams = this.LIZ.getLayoutParams();
            if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
                layoutParams = null;
            }
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            if (marginLayoutParams != null) {
                marginLayoutParams.leftMargin = intValue;
                marginLayoutParams.topMargin = intValue2;
                marginLayoutParams.rightMargin = intValue3;
                marginLayoutParams.bottomMargin = intValue4;
            }
            this.LIZ.requestLayout();
        }
    }

    public C60944Nvw(SparkPopupSchemaParam params, View popupContainer, Integer[] margin) {
        o.LJIIJ(params, "params");
        o.LJIIJ(popupContainer, "popupContainer");
        o.LJIIJ(margin, "margin");
        this.LIZ = popupContainer;
        this.LIZIZ = margin;
    }
}

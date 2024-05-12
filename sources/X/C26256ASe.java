package X;

import android.view.View;
import kotlin.jvm.internal.o;

/* renamed from: X.ASe, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26256ASe extends AbstractC26257ASf {
    public final /* synthetic */ boolean LIZ;
    public final /* synthetic */ C26255ASd LIZIZ;

    public C26256ASe(boolean z, C26255ASd c26255ASd) {
        this.LIZ = z;
        this.LIZIZ = c26255ASd;
    }

    @Override // X.AbstractC26257ASf
    public final void LIZ(View bottomSheet, float f) {
        C53860LBw handleView;
        AbstractC26257ASf bottomSheetCallback;
        o.LJIIIZ(bottomSheet, "bottomSheet");
        if (this.LIZ && (handleView = this.LIZIZ.getHandleView()) != null && (bottomSheetCallback = handleView.getBottomSheetCallback()) != null) {
            bottomSheetCallback.LIZ(bottomSheet, f);
        }
        AbstractC26257ASf bottomSheetCallback2 = this.LIZIZ.getBottomSheetCallback();
        if (bottomSheetCallback2 != null) {
            bottomSheetCallback2.LIZ(bottomSheet, f);
        }
    }

    @Override // X.AbstractC26257ASf
    public final void LIZIZ(int i, View bottomSheet) {
        InterfaceC65784Pro<C76800UCe> dismissFunc;
        C53860LBw handleView;
        int i2;
        AbstractC26257ASf bottomSheetCallback;
        o.LJIIIZ(bottomSheet, "bottomSheet");
        if (this.LIZ) {
            C53860LBw handleView2 = this.LIZIZ.getHandleView();
            if (handleView2 != null && (bottomSheetCallback = handleView2.getBottomSheetCallback()) != null) {
                bottomSheetCallback.LIZIZ(i, bottomSheet);
            }
            if (this.LIZIZ.getVariant() == 3 && (handleView = this.LIZIZ.getHandleView()) != null) {
                if (i == 3) {
                    i2 = 8;
                } else {
                    i2 = 0;
                }
                handleView.setVisibility(i2);
            }
        }
        if (i == 5 && (dismissFunc = this.LIZIZ.getDismissFunc()) != null) {
            dismissFunc.invoke();
        }
        AbstractC26257ASf bottomSheetCallback2 = this.LIZIZ.getBottomSheetCallback();
        if (bottomSheetCallback2 != null) {
            bottomSheetCallback2.LIZIZ(i, bottomSheet);
        }
    }
}

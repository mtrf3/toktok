package X;

import android.view.View;

/* renamed from: X.Nq0, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C60576Nq0 extends AbstractC60578Nq2 {
    public final /* synthetic */ C60559Npj LIZ;

    public C60576Nq0(C60559Npj c60559Npj) {
        this.LIZ = c60559Npj;
    }

    @Override // X.AbstractC60578Nq2
    public void onEvent(String str) {
        InterfaceC88472Yns<? super String, C76800UCe> interfaceC88472Yns = this.LIZ.LJLJLJ;
        if (interfaceC88472Yns != null) {
            interfaceC88472Yns.invoke(str);
        }
        AbstractC60578Nq2 onBottomSheetCallback = this.LIZ.getOnBottomSheetCallback();
        if (onBottomSheetCallback != null) {
            onBottomSheetCallback.onEvent(str);
        }
    }

    @Override // X.AbstractC60578Nq2
    public final void LIZ(View view, float f) {
        AbstractC60578Nq2 onBottomSheetCallback = this.LIZ.getOnBottomSheetCallback();
        if (onBottomSheetCallback != null) {
            onBottomSheetCallback.LIZ(view, f);
        }
    }

    @Override // X.AbstractC60578Nq2
    public final void LIZIZ(int i, View view) {
        AbstractC60578Nq2 onBottomSheetCallback = this.LIZ.getOnBottomSheetCallback();
        if (onBottomSheetCallback != null) {
            onBottomSheetCallback.LIZIZ(i, view);
        }
        if (i == 5) {
            this.LIZ.LJI();
        }
    }
}

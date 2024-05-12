package X;

import android.view.View;
import android.view.ViewGroup;
import com.bytedance.hybrid.spark.anim.BottomSheetBehavior;
import com.bytedance.hybrid.spark.page.SparkPopup;

/* renamed from: X.Nvs, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C60940Nvs extends AbstractC60969NwL {
    public final /* synthetic */ BottomSheetBehavior LIZ;
    public final /* synthetic */ boolean LIZIZ;
    public final /* synthetic */ SparkPopup LIZJ;
    public final /* synthetic */ ViewGroup LIZLLL;

    @Override // X.AbstractC60969NwL
    public final void LIZ(View view, float f) {
        LC0 lc0;
        AbstractC26257ASf bottomSheetCallback;
        if (this.LIZIZ && (lc0 = this.LIZJ.LJLLLLLL) != null && (bottomSheetCallback = lc0.getBottomSheetCallback()) != null) {
            bottomSheetCallback.LIZ(view, f);
        }
        SparkPopup sparkPopup = this.LIZJ;
        C60937Nvp c60937Nvp = sparkPopup.LJZL;
        c60937Nvp.getClass();
        c60937Nvp.LIZ(sparkPopup, new C60950Nw2(view, f));
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("popup onSlide offset: ");
        LIZ.append(f);
        C37682Eqc.LIZIZ(this.LIZJ.LJLLI, "SparkActivity", X1D.LIZIZ(LIZ));
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0048  */
    @Override // X.AbstractC60969NwL
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZIZ(int r10, android.view.View r11) {
        /*
            Method dump skipped, instructions count: 318
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C60940Nvs.LIZIZ(int, android.view.View):void");
    }

    public C60940Nvs(BottomSheetBehavior bottomSheetBehavior, boolean z, SparkPopup sparkPopup, ViewGroup viewGroup) {
        this.LIZ = bottomSheetBehavior;
        this.LIZIZ = z;
        this.LIZJ = sparkPopup;
        this.LIZLLL = viewGroup;
    }
}

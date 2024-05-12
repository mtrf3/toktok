package X;

import android.view.ViewGroup;
import com.bytedance.hybrid.spark.anim.BottomSheetBehavior;
import com.bytedance.hybrid.spark.page.SparkPopup;
import kotlin.jvm.internal.o;

/* renamed from: X.Nvv, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C60943Nvv implements InterfaceC60730NsU {
    public final /* synthetic */ SparkPopup LIZ;
    public final /* synthetic */ ViewGroup LIZIZ;

    @Override // X.InterfaceC60730NsU
    public final void LIZ(SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS sparkView) {
        int i;
        o.LJIIJ(sparkView, "sparkView");
        SparkPopup sparkPopup = this.LIZ;
        sparkPopup.LLI = true;
        SparkPopup.xl(sparkPopup).setHeight(SparkPopup.wl(this.LIZ).getMeasuredHeight());
        int Kl = this.LIZ.Kl() + SparkPopup.xl(this.LIZ).getHeight();
        SparkPopup.vl(this.LIZ).setPeekHeight(Kl);
        SparkPopup.vl(this.LIZ).LJIJJLI = SparkPopup.xl(this.LIZ).getDragHeight();
        BottomSheetBehavior vl = SparkPopup.vl(this.LIZ);
        Integer valueOf = Integer.valueOf(SparkPopup.xl(this.LIZ).getDragDownCloseThreshold());
        if (valueOf.intValue() != 0) {
            i = valueOf.intValue();
        } else {
            i = (int) (Kl * 0.2f);
        }
        vl.LJJIFFI = i;
        SparkPopup.wl(this.LIZ).requestLayout();
        SparkPopup.Pl(this.LIZ, false, true, 0, 5);
    }

    @Override // X.InterfaceC60730NsU
    public final void LIZIZ(SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS sparkView) {
        int i;
        o.LJIIJ(sparkView, "sparkView");
        SparkPopup.xl(this.LIZ).setHeight(SparkPopup.wl(this.LIZ).getMeasuredHeight());
        int Kl = this.LIZ.Kl() + SparkPopup.xl(this.LIZ).getHeight();
        SparkPopup.vl(this.LIZ).setPeekHeight(Kl);
        SparkPopup.vl(this.LIZ).LJIJJLI = SparkPopup.xl(this.LIZ).getDragHeight();
        BottomSheetBehavior vl = SparkPopup.vl(this.LIZ);
        Integer valueOf = Integer.valueOf(SparkPopup.xl(this.LIZ).getDragDownCloseThreshold());
        if (valueOf.intValue() != 0) {
            i = valueOf.intValue();
        } else {
            i = (int) (Kl * 0.2f);
        }
        vl.LJJIFFI = i;
        SparkPopup.wl(this.LIZ).requestLayout();
        SparkPopup.Pl(this.LIZ, false, true, 0, 5);
    }

    public C60943Nvv(SparkPopup sparkPopup, ViewGroup viewGroup) {
        this.LIZ = sparkPopup;
        this.LIZIZ = viewGroup;
    }
}

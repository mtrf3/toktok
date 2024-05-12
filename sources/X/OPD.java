package X;

import android.content.Context;
import com.ss.android.ugc.aweme.setting.page.accessibility.DynamicFontSizeFragment;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class OPD implements OPF {
    public final /* synthetic */ DynamicFontSizeFragment LIZ;

    public OPD(DynamicFontSizeFragment dynamicFontSizeFragment) {
        this.LIZ = dynamicFontSizeFragment;
    }

    @Override // X.OPF
    public final void LIZ(C74042T4c slider, int i) {
        o.LJIIIZ(slider, "slider");
        DynamicFontSizeFragment dynamicFontSizeFragment = this.LIZ;
        dynamicFontSizeFragment.LL = i;
        dynamicFontSizeFragment.Al(i);
        DynamicFontSizeFragment dynamicFontSizeFragment2 = this.LIZ;
        if (dynamicFontSizeFragment2.LLD) {
            if (dynamicFontSizeFragment2.xl() != null) {
                FMX.LJIIL("change_slider_font_size", C78920UyC.LIZJ(i, "font_value").LIZ);
            }
            this.LIZ.LLD = false;
        }
        Context context = this.LIZ.getContext();
        if (context != null) {
            new C61996OUu(context).LIZ(0);
        }
    }
}

package kotlin.jvm.internal;

import X.AbstractC65781Prl;
import X.C221018lt;
import X.C25765A9h;
import X.C76800UCe;
import X.C7MY;
import X.InterfaceC88472Yns;
import X.X1D;
import android.view.Window;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.TranslateAnimation;
import com.ss.android.ugc.aweme.ecommerce.base.widget.regionpicker.fragment.RegionPicker;
import com.ss.android.ugc.aweme.ecommerce.base.widget.regionpicker.viewmodel.DistrictPickerWrapperState;

/* loaded from: classes5.dex */
public class AqS2S0112000_4 extends AbstractC65781Prl implements InterfaceC88472Yns {
    public final int $t;
    public int i2;
    public int i3;
    public Object l0;
    public boolean z1;

    @Override // X.InterfaceC88472Yns
    public final Object invoke(Object obj) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj);
            case 1:
                return invoke$1(this, obj);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AqS2S0112000_4 aqS2S0112000_4, Object obj) {
        Animation onCreateAnimation;
        DistrictPickerWrapperState it = (DistrictPickerWrapperState) obj;
        o.LJIIIZ(it, "it");
        if (it.getDone() || it.getTitleBarBack() || it.getPhysicalBack()) {
            TranslateAnimation translateAnimation = new TranslateAnimation(0.0f, 0.0f, 0.0f, 0.0f);
            translateAnimation.setDuration(300L);
            return translateAnimation;
        }
        onCreateAnimation = super/*androidx.fragment.app.Fragment*/.onCreateAnimation(aqS2S0112000_4.i2, aqS2S0112000_4.z1, aqS2S0112000_4.i3);
        return onCreateAnimation;
    }

    public static final Object invoke$1(AqS2S0112000_4 aqS2S0112000_4, Object obj) {
        int i;
        int i2;
        Window setWindowParams = (Window) obj;
        o.LJIIIZ(setWindowParams, "$this$setWindowParams");
        WindowManager.LayoutParams attributes = setWindowParams.getAttributes();
        if (aqS2S0112000_4.z1 ? (i = aqS2S0112000_4.i2 - aqS2S0112000_4.i3) > (i2 = ((C25765A9h) aqS2S0112000_4.l0).LJLLLL) : (i = aqS2S0112000_4.i2 - aqS2S0112000_4.i3) < (i2 = C7MY.LIZIZ(204))) {
            i = i2;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("set window height: ");
        LIZ.append(i);
        C221018lt.LIZ("RecUserDialogController", X1D.LIZIZ(LIZ));
        attributes.height = i;
        return C76800UCe.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS2S0112000_4(RegionPicker regionPicker, int i, boolean z, int i2, int i3) {
        super(1);
        this.$t = i3;
        this.l0 = regionPicker;
        this.i2 = i;
        this.z1 = z;
        this.i3 = i2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS2S0112000_4(boolean z, int i, int i2, C25765A9h c25765A9h, int i3) {
        super(1);
        this.$t = i3;
        this.z1 = z;
        this.i2 = i;
        this.i3 = i2;
        this.l0 = c25765A9h;
    }
}

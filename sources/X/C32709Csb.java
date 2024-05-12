package X;

import androidx.lifecycle.MutableLiveData;
import com.bytedance.android.livesdk.gift.base.platform.business.panel.portrait.leaf.GiftPanelLeafViewModel;
import com.bytedance.android.livesdk.livesetting.performance.LiveComboLargeClickableAreaSetting;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.List;
import kotlin.jvm.internal.AqS155S0100000_5;

/* renamed from: X.Csb, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32709Csb extends C0CJ {
    public final /* synthetic */ C32676Cs4 LJLIL;

    public C32709Csb(C32676Cs4 c32676Cs4) {
        this.LJLIL = c32676Cs4;
    }

    @Override // X.C0CJ
    public final void LIZJ(int i) {
        int i2;
        MutableLiveData<List<C32713Csf>> mutableLiveData;
        List<C32713Csf> value;
        C32713Csf c32713Csf;
        GiftPanelLeafViewModel LJJIJIL = this.LJLIL.LJJIJIL();
        if (LJJIJIL != null && (mutableLiveData = LJJIJIL.LJLJI) != null && (value = mutableLiveData.getValue()) != null && (c32713Csf = (C32713Csf) ListProtector.get(value, i)) != null) {
            i2 = c32713Csf.LIZ;
        } else {
            i2 = 1;
        }
        if (this.LJLIL.LJJIJIIJI() != i2) {
            this.LJLIL.LJJLI(i2);
        }
        C32676Cs4 c32676Cs4 = this.LJLIL;
        C77557UcD c77557UcD = c32676Cs4.LLFFF;
        if (c77557UcD != null) {
            AqS155S0100000_5 aqS155S0100000_5 = new AqS155S0100000_5(c32676Cs4, 8);
            if (LiveComboLargeClickableAreaSetting.INSTANCE.getValue()) {
                aqS155S0100000_5.invoke();
                T2J.LJII(c77557UcD, true);
            }
        }
    }

    @Override // X.C0CJ
    public final void LIZIZ(int i, float f, int i2) {
        float f2;
        Float f3;
        C77557UcD c77557UcD = this.LJLIL.LLFFF;
        if (c77557UcD != null && LiveComboLargeClickableAreaSetting.INSTANCE.getValue()) {
            Object tag = c77557UcD.getTag();
            if ((tag instanceof Float) && (f3 = (Float) tag) != null) {
                f2 = f3.floatValue();
            } else {
                f2 = 0.0f;
            }
            c77557UcD.setX(f2 - i2);
        }
    }
}

package X;

import androidx.lifecycle.MutableLiveData;
import com.bytedance.android.livesdk.gift.base.platform.business.panel.portrait.leaf.GiftPanelLeafViewModel;
import com.bytedance.android.livesdk.gift.model.GiftListResult;

/* renamed from: X.Ct9, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32743Ct9 implements InterfaceC32478Cos {
    public final /* synthetic */ C32676Cs4 LIZ;

    public C32743Ct9(C32676Cs4 c32676Cs4) {
        this.LIZ = c32676Cs4;
    }

    @Override // X.InterfaceC32478Cos
    public final void LIZ(GiftListResult giftListResult, int i) {
        EnumC32736Ct2 enumC32736Ct2;
        MutableLiveData<EnumC32736Ct2> mutableLiveData;
        if (giftListResult != null) {
            C32676Cs4 c32676Cs4 = this.LIZ;
            GiftPanelLeafViewModel LJJIJIL = c32676Cs4.LJJIJIL();
            if (LJJIJIL != null && (mutableLiveData = LJJIJIL.LJLJL) != null) {
                enumC32736Ct2 = mutableLiveData.getValue();
            } else {
                enumC32736Ct2 = null;
            }
            if (enumC32736Ct2 != EnumC32736Ct2.SUCCESS) {
                c32676Cs4.LJJLI(c32676Cs4.LJJIJIIJIL());
            }
        }
    }
}

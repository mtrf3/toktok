package X;

import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PdpButton;
import com.ss.android.ugc.aweme.ecommerce.tts.sku.us.widget.UsSkuBottomWidget;
import kotlin.jvm.internal.o;

/* renamed from: X.Rev, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C70081Rev implements InterfaceC70181RgX {
    public final /* synthetic */ UsSkuBottomWidget LIZ;

    @Override // X.InterfaceC70181RgX
    public final void LIZIZ(C113724dE c113724dE, PdpButton pdpButton) {
    }

    public C70081Rev(UsSkuBottomWidget usSkuBottomWidget) {
        this.LIZ = usSkuBottomWidget;
    }

    @Override // X.InterfaceC70181RgX
    public final void LIZ(C113724dE view, PdpButton button) {
        o.LJIIIZ(view, "view");
        o.LJIIIZ(button, "button");
        Integer num = button.buttonAction;
        int value = EnumC70033Re9.ADD_TO_CART.getValue();
        if (num == null || num.intValue() != value) {
            int value2 = EnumC70033Re9.BUY.getValue();
            if (num == null || num.intValue() != value2) {
                int value3 = EnumC70033Re9.UPDATE_ADDRESS.getValue();
                if (num == null || num.intValue() != value3) {
                    int value4 = EnumC70033Re9.CHANGE_SKU_ITEM.getValue();
                    if (num == null || num.intValue() != value4) {
                        return;
                    }
                    this.LIZ.changeSkuItem(button, view);
                    return;
                }
                this.LIZ.updateAddress(view);
                return;
            }
            this.LIZ.buyNow(button, view);
            return;
        }
        this.LIZ.addToCart(button, view);
    }
}

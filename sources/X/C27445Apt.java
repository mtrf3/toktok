package X;

import com.ss.android.ugc.aweme.ecommerce.base.sku.SkuPanelStarter;
import com.ss.android.ugc.aweme.ecommerce.eventcenter.EventCenter;

/* renamed from: X.Apt, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C27445Apt extends AbstractC65781Prl implements InterfaceC88471Ynr<Boolean, Integer, C76800UCe> {
    public static final C27445Apt LJLIL = new C27445Apt();

    public C27445Apt() {
        super(2);
    }

    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(Boolean bool, Integer num) {
        boolean booleanValue = bool.booleanValue();
        num.intValue();
        EventCenter.LJ().LIZ("ec_sku_panel_keyboard_show", C27739Aud.LJI(new SkuPanelStarter.SkuKeyboardVisibilityParams(booleanValue)));
        return C76800UCe.LIZ;
    }
}

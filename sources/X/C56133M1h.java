package X;

import android.app.Activity;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.ss.android.ugc.aweme.ecommerce.mall.ShopMainFragment;
import com.ss.android.ugc.aweme.ecommerce.mall.lynxhome.api.GetShopLynxVMAbility;
import com.ss.android.ugc.aweme.ecommerce.mall.lynxhome.vm.ShopMainLynxViewModel;
import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.AqS32S1000000_9;
import kotlin.jvm.internal.o;

/* renamed from: X.M1h, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C56133M1h extends AbstractC56443MDf {
    @Override // X.AbstractC37594EpC
    public final void LJI(XBaseParamModel xBaseParamModel, C37356ElM c37356ElM, EnumC37844EtE type) {
        Activity activity;
        ActivityC45651qj activityC45651qj;
        GetShopLynxVMAbility getShopLynxVMAbility;
        ShopMainLynxViewModel Io;
        InterfaceC56444MDg interfaceC56444MDg = (InterfaceC56444MDg) xBaseParamModel;
        o.LJIIIZ(type, "type");
        try {
            InterfaceC38263Ezz interfaceC38263Ezz = this.LJLIL;
            if (interfaceC38263Ezz != null) {
                activity = interfaceC38263Ezz.LIZLLL();
            } else {
                activity = null;
            }
            if ((activity instanceof ActivityC45651qj) && (activityC45651qj = (ActivityC45651qj) activity) != null && (getShopLynxVMAbility = (GetShopLynxVMAbility) C55096Ljo.LIZ(C55230Lly.LIZLLL(activityC45651qj, null), GetShopLynxVMAbility.class, null)) != null && (Io = getShopLynxVMAbility.Io()) != null) {
                String mallCartCard = interfaceC56444MDg.getMallCartCard();
                if (mallCartCard != null) {
                    ShopMainFragment.LJZ.getClass();
                    if (C54741Le5.LIZIZ()) {
                        C78565UsT.LJJIJIIJI(Io, C78613UtF.LIZJ, new C64782gU(Io, mallCartCard, null));
                    }
                }
                String topBarContentStyle = interfaceC56444MDg.getTopBarContentStyle();
                if (topBarContentStyle != null) {
                    Io.setState(new AqS32S1000000_9(topBarContentStyle, 9));
                }
            }
            C3C5.m7constructorimpl(C76800UCe.LIZ);
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th) {
            C78983UzD.LJIIZILJ(th);
            C3C5.m7constructorimpl(C141335gf.LIZ(th));
        }
    }
}

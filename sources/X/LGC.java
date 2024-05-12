package X;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.ss.android.ugc.aweme.base.MainBusinessAbility;
import com.ss.android.ugc.aweme.ecommerce.mall.ShopTopTabProtocol;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class LGC implements InterfaceC53896LDg {
    public final /* synthetic */ ShopTopTabProtocol LJLIL;
    public final /* synthetic */ Context LJLILLLLZI;

    @Override // X.InterfaceC53907LDr
    public final String L6() {
        return "";
    }

    @Override // X.InterfaceC53896LDg
    public final void LLLLILI(Bundle bundle) {
    }

    @Override // X.InterfaceC53896LDg
    public final void LLLLLLZ(Bundle args) {
        String str;
        String str2;
        Intent intent;
        Intent intent2;
        Intent intent3;
        o.LJIIIZ(args, "args");
        if (this.LJLIL.LJIIJJI()) {
            ActivityC45651qj LJJIFFI = C45804HyK.LJJIFFI(this.LJLILLLLZI);
            int i = -1;
            if (LJJIFFI != null && (intent3 = LJJIFFI.getIntent()) != null) {
                i = intent3.getIntExtra("tab", -1);
            }
            boolean z = false;
            if (i == LGE.SHOP.getValue()) {
                ActivityC45651qj LJJIFFI2 = C45804HyK.LJJIFFI(this.LJLILLLLZI);
                if (LJJIFFI2 != null && (intent2 = LJJIFFI2.getIntent()) != null) {
                    intent2.removeExtra("tab");
                    return;
                }
                return;
            }
            ActivityC45651qj LJJIFFI3 = C45804HyK.LJJIFFI(this.LJLILLLLZI);
            if (LJJIFFI3 != null && (intent = LJJIFFI3.getIntent()) != null) {
                str = C16880lQ.LLJJIJIIJIL(intent, "extra_non_click_open_from");
            } else {
                str = null;
            }
            AbstractC56099Lzz abstractC56099Lzz = (AbstractC56099Lzz) this.LJLIL.LJLJLLL.getValue();
            MainBusinessAbility LJIL = C1JD.LJIL((InterfaceC55235Lm3) this.LJLIL.LJLJJLL.getValue());
            if (LJIL == null || (str2 = LJIL.nH()) == null) {
                str2 = "";
            }
            if (str == null || ujb.o.LJJJJJL(str)) {
                z = true;
            }
            abstractC56099Lzz.LIZLLL(str2, 3, !z, LSO.CLICK_TAB);
        }
    }

    public LGC(Context context, ShopTopTabProtocol shopTopTabProtocol) {
        this.LJLIL = shopTopTabProtocol;
        this.LJLILLLLZI = context;
    }
}

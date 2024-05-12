package X;

import android.widget.CompoundButton;
import com.ss.android.ugc.aweme.ecommerce.base.osp.module.discount.PlatformDiscountsVH;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.BonusInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.ChangeInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.vm.OrderSubmitViewModel;
import java.util.HashMap;
import kotlin.jvm.internal.AqS135S0200000_4;
import kotlin.jvm.internal.o;

/* renamed from: X.AuP, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C27725AuP implements CompoundButton.OnCheckedChangeListener {
    public final /* synthetic */ BonusInfo LJLIL;
    public final /* synthetic */ ARV LJLILLLLZI;
    public final /* synthetic */ PlatformDiscountsVH LJLJI;
    public final /* synthetic */ HashMap<String, Object> LJLJJI;

    public C27725AuP(BonusInfo bonusInfo, ARV arv, PlatformDiscountsVH platformDiscountsVH, HashMap<String, Object> hashMap) {
        this.LJLIL = bonusInfo;
        this.LJLILLLLZI = arv;
        this.LJLJI = platformDiscountsVH;
        this.LJLJJI = hashMap;
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        if (o.LJ(this.LJLIL.redeemCanBeUsed, Boolean.TRUE)) {
            ARV onCheckedChanged = this.LJLILLLLZI;
            o.LJIIIIZZ(onCheckedChanged, "onCheckedChanged");
            C78946Uyc.LJJIIJ(onCheckedChanged, new C70919RsR(), new AqS135S0200000_4(this.LJLJI, (PlatformDiscountsVH) this.LJLJJI, (HashMap<String, Object>) 263));
            ARV onCheckedChanged2 = this.LJLILLLLZI;
            o.LJIIIIZZ(onCheckedChanged2, "onCheckedChanged");
            C78946Uyc.LJJIIJ(onCheckedChanged2, new C70917RsP(), new AqS135S0200000_4(compoundButton, this.LJLJI, 264));
            this.LJLJI.M().LLJZ = compoundButton.isChecked();
            OrderSubmitViewModel.Lw0(this.LJLJI.M(), false, null, false, false, null, null, false, null, null, new ChangeInfo(EnumC27805Avh.USE_BONUS.getValue()), 4095);
            return;
        }
        compoundButton.setChecked(!z);
        String str = this.LJLIL.nonRedeemReason;
        if (str == null) {
            return;
        }
        ARV arv = this.LJLILLLLZI;
        o.LJIIIIZZ(arv, "this");
        C26045AKb c26045AKb = new C26045AKb(arv);
        c26045AKb.LJIIIZ(str);
        c26045AKb.LIZLLL(3000L);
        c26045AKb.LJIIJ();
        C78946Uyc.LJJIIJ(arv, new C70947Rst(), C27726AuQ.LJLIL);
    }
}

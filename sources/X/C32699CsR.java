package X;

import androidx.lifecycle.MutableLiveData;
import androidx.recyclerview.widget.GridLayoutManager;
import com.bytedance.android.livesdk.gift.base.platform.business.panel.portrait.leaf.GiftPanelLeafViewModel;
import fjb.a;
import java.util.LinkedList;

@InterfaceC65848Psq(c = "com.bytedance.android.livesdk.gift.base.platform.business.panel.portrait.leaf.GiftPanelLeafV2$recordShownGifts$1", f = "GiftPanelLeafV2.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.CsR, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32699CsR extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ C32676Cs4 LJLIL;
    public final /* synthetic */ RunnableC31065CHd LJLILLLLZI;
    public final /* synthetic */ GridLayoutManager LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C32699CsR(C32676Cs4 c32676Cs4, RunnableC31065CHd runnableC31065CHd, GridLayoutManager gridLayoutManager, InterfaceC67352kd<? super C32699CsR> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = c32676Cs4;
        this.LJLILLLLZI = runnableC31065CHd;
        this.LJLJI = gridLayoutManager;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C32699CsR(this.LJLIL, this.LJLILLLLZI, this.LJLJI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        LinkedList<AbstractC32698CsQ<? extends C30896CAq>> linkedList;
        MutableLiveData<LinkedList<AbstractC32698CsQ<? extends C30896CAq>>> mutableLiveData;
        C141335gf.LIZJ(obj);
        GiftPanelLeafViewModel LJJIJIL = this.LJLIL.LJJIJIL();
        if (LJJIJIL != null) {
            RunnableC31065CHd runnableC31065CHd = this.LJLILLLLZI;
            GridLayoutManager gridLayoutManager = this.LJLJI;
            GiftPanelLeafViewModel LJJIJIL2 = this.LJLIL.LJJIJIL();
            if (LJJIJIL2 != null && (mutableLiveData = LJJIJIL2.LJLILLLLZI) != null) {
                linkedList = mutableLiveData.getValue();
            } else {
                linkedList = null;
            }
            LJJIJIL.jv0(runnableC31065CHd, gridLayoutManager, linkedList);
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}

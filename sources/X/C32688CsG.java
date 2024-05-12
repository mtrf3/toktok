package X;

import androidx.lifecycle.MutableLiveData;
import androidx.recyclerview.widget.GridLayoutManager;
import com.bytedance.android.livesdk.gift.base.platform.business.panel.portrait.leaf.GiftPanelLeafViewModel;
import fjb.a;
import java.util.LinkedList;
import java.util.List;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "com.bytedance.android.livesdk.gift.base.platform.business.panel.portrait.leaf.GiftPanelLeafV2$sendInitialGiftData$1$1", f = "GiftPanelLeafV2.kt", l = {2562}, m = "invokeSuspend")
/* renamed from: X.CsG, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32688CsG extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ GiftPanelLeafViewModel LJLILLLLZI;
    public final /* synthetic */ RunnableC31065CHd LJLJI;
    public final /* synthetic */ GridLayoutManager LJLJJI;
    public final /* synthetic */ C32676Cs4 LJLJJL;
    public final /* synthetic */ long LJLJJLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C32688CsG(GiftPanelLeafViewModel giftPanelLeafViewModel, RunnableC31065CHd runnableC31065CHd, GridLayoutManager gridLayoutManager, C32676Cs4 c32676Cs4, long j, InterfaceC67352kd<? super C32688CsG> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = giftPanelLeafViewModel;
        this.LJLJI = runnableC31065CHd;
        this.LJLJJI = gridLayoutManager;
        this.LJLJJL = c32676Cs4;
        this.LJLJJLL = j;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C32688CsG(this.LJLILLLLZI, this.LJLJI, this.LJLJJI, this.LJLJJL, this.LJLJJLL, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        LinkedList<AbstractC32698CsQ<? extends C30896CAq>> linkedList;
        MutableLiveData<LinkedList<AbstractC32698CsQ<? extends C30896CAq>>> mutableLiveData;
        EnumC58928NAu enumC58928NAu = EnumC58928NAu.COROUTINE_SUSPENDED;
        int i = this.LJLIL;
        if (i != 0) {
            if (i == 1) {
                C141335gf.LIZJ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C141335gf.LIZJ(obj);
            GiftPanelLeafViewModel giftPanelLeafViewModel = this.LJLILLLLZI;
            RunnableC31065CHd recyclerView = this.LJLJI;
            GridLayoutManager layoutManager = this.LJLJJI;
            GiftPanelLeafViewModel LJJIJIL = this.LJLJJL.LJJIJIL();
            if (LJJIJIL != null && (mutableLiveData = LJJIJIL.LJLILLLLZI) != null) {
                linkedList = mutableLiveData.getValue();
            } else {
                linkedList = null;
            }
            C32676Cs4 c32676Cs4 = this.LJLJJL;
            List<Long> list = c32676Cs4.LLI;
            java.util.Map<Long, C32830CuY> forceInsertGifts = c32676Cs4.LLIFFJFJJ;
            giftPanelLeafViewModel.getClass();
            o.LJIIIZ(recyclerView, "recyclerView");
            o.LJIIIZ(layoutManager, "layoutManager");
            o.LJIIIZ(forceInsertGifts, "forceInsertGifts");
            ORS.LJJLIL(C2N1.LJLIL, giftPanelLeafViewModel.LJLJLLL);
            ORS.LJJLIL(C2N2.LJLIL, giftPanelLeafViewModel.LJLL);
            giftPanelLeafViewModel.hv0(recyclerView, layoutManager, linkedList, list, forceInsertGifts);
            giftPanelLeafViewModel.jv0(recyclerView, layoutManager, linkedList);
            AbstractC78621UtN abstractC78621UtN = C36636EZk.LIZ;
            C32705CsX c32705CsX = new C32705CsX(this.LJLJJL, this.LJLJJLL, null);
            this.LJLIL = 1;
            if (XKX.LJI(abstractC78621UtN, c32705CsX, this) == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}

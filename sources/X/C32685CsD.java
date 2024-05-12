package X;

import androidx.lifecycle.MutableLiveData;
import com.bytedance.android.livesdk.gift.base.platform.business.panel.portrait.leaf.GiftPanelLeafViewModel;
import fjb.a;
import java.util.Iterator;
import java.util.LinkedList;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "com.bytedance.android.livesdk.gift.base.platform.business.panel.portrait.leaf.GiftPanelLeafV2$cancelComboAnim$1$1", f = "GiftPanelLeafV2.kt", l = {1666}, m = "invokeSuspend")
/* renamed from: X.CsD, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32685CsD extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ C32676Cs4 LJLILLLLZI;
    public final /* synthetic */ GiftPanelLeafViewModel LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C32685CsD(C32676Cs4 c32676Cs4, GiftPanelLeafViewModel giftPanelLeafViewModel, InterfaceC67352kd<? super C32685CsD> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = c32676Cs4;
        this.LJLJI = giftPanelLeafViewModel;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C32685CsD(this.LJLILLLLZI, this.LJLJI, interfaceC67352kd);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        MutableLiveData<LinkedList<AbstractC32698CsQ<? extends C30896CAq>>> mutableLiveData;
        LinkedList<AbstractC32698CsQ<? extends C30896CAq>> value;
        Object obj2;
        Object obj3;
        Integer num;
        Long l;
        AbstractC32698CsQ abstractC32698CsQ;
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
            GiftPanelLeafViewModel LJJIJIL = this.LJLILLLLZI.LJJIJIL();
            if (LJJIJIL != null && (mutableLiveData = LJJIJIL.LJLILLLLZI) != null && (value = mutableLiveData.getValue()) != null) {
                GiftPanelLeafViewModel giftPanelLeafViewModel = this.LJLJI;
                C32676Cs4 c32676Cs4 = this.LJLILLLLZI;
                giftPanelLeafViewModel.getClass();
                Iterator it = ORZ.LLJJI(value).iterator();
                while (true) {
                    C199797sl c199797sl = (C199797sl) it;
                    obj2 = null;
                    if (c199797sl.hasNext()) {
                        obj3 = c199797sl.next();
                        C2058786d c2058786d = (C2058786d) obj3;
                        AbstractC32698CsQ abstractC32698CsQ2 = (AbstractC32698CsQ) c2058786d.LIZIZ;
                        if (abstractC32698CsQ2 != null) {
                            l = Long.valueOf(abstractC32698CsQ2.LIZJ());
                        } else {
                            l = null;
                        }
                        if (o.LJ(l, giftPanelLeafViewModel.LJLJJLL.getValue()) && (abstractC32698CsQ = (AbstractC32698CsQ) c2058786d.LIZIZ) != null && abstractC32698CsQ.LIZLLL) {
                            break;
                        }
                    } else {
                        obj3 = null;
                        break;
                    }
                }
                C2058786d c2058786d2 = (C2058786d) obj3;
                if (c2058786d2 != null) {
                    num = Integer.valueOf(c2058786d2.LIZ);
                    obj2 = c2058786d2.LIZIZ;
                } else {
                    num = null;
                }
                OSZ osz = new OSZ(num, obj2);
                Integer num2 = (Integer) osz.getFirst();
                AbstractC32698CsQ abstractC32698CsQ3 = (AbstractC32698CsQ) osz.getSecond();
                if (num2 != null && abstractC32698CsQ3 != null) {
                    MBA plus = C36636EZk.LIZ.plus(c32676Cs4.LLJL);
                    C32695CsN c32695CsN = new C32695CsN(value, num2, c32676Cs4, abstractC32698CsQ3, null);
                    this.LJLIL = 1;
                    if (XKX.LJI(plus, c32695CsN, this) == enumC58928NAu) {
                        return enumC58928NAu;
                    }
                }
            }
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}

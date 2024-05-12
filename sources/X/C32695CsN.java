package X;

import fjb.a;
import java.util.LinkedList;

@InterfaceC65848Psq(c = "com.bytedance.android.livesdk.gift.base.platform.business.panel.portrait.leaf.GiftPanelLeafV2$cancelComboAnim$1$1$1$1", f = "GiftPanelLeafV2.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.CsN, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32695CsN extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ LinkedList<AbstractC32698CsQ<? extends C30896CAq>> LJLIL;
    public final /* synthetic */ Integer LJLILLLLZI;
    public final /* synthetic */ C32676Cs4 LJLJI;
    public final /* synthetic */ AbstractC32698CsQ<? extends C30896CAq> LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C32695CsN(LinkedList<AbstractC32698CsQ<? extends C30896CAq>> linkedList, Integer num, C32676Cs4 c32676Cs4, AbstractC32698CsQ<? extends C30896CAq> abstractC32698CsQ, InterfaceC67352kd<? super C32695CsN> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = linkedList;
        this.LJLILLLLZI = num;
        this.LJLJI = c32676Cs4;
        this.LJLJJI = abstractC32698CsQ;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C32695CsN(this.LJLIL, this.LJLILLLLZI, this.LJLJI, this.LJLJJI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        AbstractC32698CsQ<? extends C30896CAq> abstractC32698CsQ = this.LJLIL.get(this.LJLILLLLZI.intValue());
        if (abstractC32698CsQ != null) {
            abstractC32698CsQ.LIZJ = true;
        }
        AbstractC32698CsQ<? extends C30896CAq> abstractC32698CsQ2 = this.LJLIL.get(this.LJLILLLLZI.intValue());
        if (abstractC32698CsQ2 != null) {
            abstractC32698CsQ2.LIZLLL = false;
        }
        C32681Cs9 c32681Cs9 = this.LJLJI.LJZ;
        if (c32681Cs9 != null) {
            c32681Cs9.notifyItemChanged(this.LJLILLLLZI.intValue(), this.LJLJJI);
            return C76800UCe.LIZ;
        }
        return null;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}

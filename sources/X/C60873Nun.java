package X;

import androidx.lifecycle.MutableLiveData;
import com.bytedance.android.live.slot.IIconSlot;
import com.bytedance.android.livesdk.livesetting.pullstream.LiveNetAdaptiveHurryTimeSetting;
import defpackage.e1;
import fjb.a;
import java.util.List;
import kotlin.jvm.internal.AqS191S0100000_9;
import kotlin.jvm.internal.IDqS431S0100000_6;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.ecommercelive.business.audience.slot.ECAudienceWidget$onSlotCreated$4$4", f = "ECAudienceWidget.kt", l = {565}, m = "invokeSuspend")
/* renamed from: X.Nun, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C60873Nun extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public /* synthetic */ Object LJLILLLLZI;
    public final /* synthetic */ C71188Rwm LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C60873Nun(C71188Rwm c71188Rwm, InterfaceC67352kd<? super C60873Nun> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLJI = c71188Rwm;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        C60873Nun c60873Nun = new C60873Nun(this.LJLJI, interfaceC67352kd);
        c60873Nun.LJLILLLLZI = obj;
        return c60873Nun;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        InterfaceC70422pa interfaceC70422pa;
        IIconSlot.SlotViewModel slotViewModel;
        MutableLiveData<Boolean> mutableLiveData;
        EnumC58928NAu enumC58928NAu = EnumC58928NAu.COROUTINE_SUSPENDED;
        int i = this.LJLIL;
        if (i != 0) {
            if (i == 1) {
                interfaceC70422pa = (InterfaceC70422pa) this.LJLILLLLZI;
                C141335gf.LIZJ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C141335gf.LIZJ(obj);
            interfaceC70422pa = (InterfaceC70422pa) this.LJLILLLLZI;
            long LIZ = C00F.LIZ(31744, LiveNetAdaptiveHurryTimeSetting.DEFAULT, "ec_shop_bag_list_preload_duration", true);
            this.LJLILLLLZI = interfaceC70422pa;
            this.LJLIL = 1;
            if (C1JD.LIZJ(LIZ, this) == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        C71188Rwm c71188Rwm = this.LJLJI;
        if (c71188Rwm.LLJI || (slotViewModel = c71188Rwm.LJLJL) == null || (mutableLiveData = slotViewModel.LJLILLLLZI) == null || !o.LJ(mutableLiveData.getValue(), Boolean.TRUE) || this.LJLJI.LLIIJI || !e1.LIZ(31744, "ec_shop_bag_list_preload_enable", true, false)) {
            return C76800UCe.LIZ;
        }
        if (C48841JEv.LJIILLIIL(interfaceC70422pa)) {
            C71188Rwm c71188Rwm2 = this.LJLJI;
            c71188Rwm2.LLIIIL = c71188Rwm2.LJIJJ(null, "live_cart", true, null);
            ALE ale = new ALE();
            ale.LJIIIZ = true;
            ale.LIZ = "ec_shop_bag_biz";
            ale.LJIIJ = 1;
            List<String> list = C71188Rwm.LLJJIJI;
            ale.LJIILIIL = list;
            List<String> list2 = C71188Rwm.LLJJIII;
            ale.LJIILJJIL = list2;
            ale.LJFF = new AqS191S0100000_9(c71188Rwm2, 92);
            ale.LJIIL = new IDqS431S0100000_6(c71188Rwm2, 2);
            c71188Rwm2.LLIIJLIL = ale;
            C60827Nu3 c60827Nu3 = C58310MuY.LIZIZ;
            c60827Nu3.getClass();
            Boolean bool = Boolean.FALSE;
            C60827Nu3.LJIIJJI(ale, bool);
            C60827Nu3.LJIIIIZZ(c60827Nu3, c71188Rwm2.LLIIIL, "ec_shop_bag_biz", null, 8);
            if (((Boolean) C52993Kqz.LIZ.getValue()).booleanValue()) {
                C25570A1u c25570A1u = new C25570A1u();
                c25570A1u.LIZ = true;
                c25570A1u.LIZLLL = "ec_shop_bag_biz";
                c25570A1u.LIZJ = 1;
                c25570A1u.LJII = list;
                c25570A1u.LJIIIIZZ = list2;
                c25570A1u.LJFF = new AqS191S0100000_9(c71188Rwm2, 93);
                c71188Rwm2.LLIIL = c25570A1u;
                C37724ErI.LIZIZ.getClass();
                C60828Nu4.LJ(c25570A1u, bool);
            }
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}

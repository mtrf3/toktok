package X;

import com.ss.android.ugc.aweme.ecommerce.base.address.dto.InputItemDTO;
import com.ss.android.ugc.aweme.ecommerce.base.address.edit.AddressEditViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.address.edit.viewholder.PhoneInputItemViewHolder;
import fjb.a;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.ecommerce.base.address.edit.viewholder.PhoneInputItemViewHolder$onBind$2$6$2", f = "PhoneInputItemViewHolder.kt", l = {196}, m = "invokeSuspend")
/* renamed from: X.AnE, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C27280AnE extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ PhoneInputItemViewHolder LJLILLLLZI;
    public final /* synthetic */ C27021Aj3 LJLJI;
    public final /* synthetic */ C252989wM LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C27280AnE(PhoneInputItemViewHolder phoneInputItemViewHolder, C27021Aj3 c27021Aj3, C252989wM c252989wM, InterfaceC67352kd<? super C27280AnE> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = phoneInputItemViewHolder;
        this.LJLJI = c27021Aj3;
        this.LJLJJI = c252989wM;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C27280AnE(this.LJLILLLLZI, this.LJLJI, this.LJLJJI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        String str;
        C27021Aj3 c27021Aj3;
        OSZ osz;
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
            List<C27021Aj3> hw0 = this.LJLILLLLZI.getViewModel().hw0();
            C27021Aj3 c27021Aj32 = this.LJLJI;
            Iterator<C27021Aj3> it = hw0.iterator();
            while (true) {
                str = null;
                if (it.hasNext()) {
                    c27021Aj3 = it.next();
                    if (o.LJ(c27021Aj3.LIZ.key, c27021Aj32.LIZ.key)) {
                        break;
                    }
                } else {
                    c27021Aj3 = null;
                    break;
                }
            }
            C27021Aj3 c27021Aj33 = c27021Aj3;
            if (c27021Aj33 != null) {
                c27021Aj33.LIZIZ = this.LJLJI.LIZIZ;
                InputItemDTO inputItemDTO = this.LJLJI.LIZ;
                o.LJIIIZ(inputItemDTO, "<set-?>");
                c27021Aj33.LIZ = inputItemDTO;
                c27021Aj33.LIZJ = this.LJLJI.LIZJ;
            }
            Object obj2 = this.LJLJI.LIZIZ;
            if (obj2 instanceof OSZ) {
                osz = (OSZ) obj2;
            } else {
                osz = null;
            }
            AddressEditViewModel viewModel = this.LJLILLLLZI.getViewModel();
            C27021Aj3 c27021Aj34 = this.LJLJI;
            if (osz != null) {
                str = (String) osz.getSecond();
            }
            this.LJLIL = 1;
            obj = viewModel.zw0(c27021Aj34, str, this);
            if (obj == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        this.LJLJJI.LJ((C253009wO) obj);
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}

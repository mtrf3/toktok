package X;

import com.ss.android.ugc.gamora.recorder.sticker.optionlist.viewpager.OptionCategoryViewModel;
import fjb.a;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "com.ss.android.ugc.gamora.recorder.sticker.optionlist.viewpager.OptionCategoryViewModel$clear$2", f = "OptionCategoryViewModel.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.UwW, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C78816UwW extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ C78820Uwa LJLIL;
    public final /* synthetic */ OptionCategoryViewModel LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C78816UwW(C78820Uwa c78820Uwa, OptionCategoryViewModel optionCategoryViewModel, InterfaceC67352kd<? super C78816UwW> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = c78820Uwa;
        this.LJLILLLLZI = optionCategoryViewModel;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C78816UwW(this.LJLIL, this.LJLILLLLZI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        if (o.LJ(this.LJLIL.LIZJ, "Green Screen")) {
            OptionCategoryViewModel optionCategoryViewModel = this.LJLILLLLZI;
            InterfaceC78821Uwb interfaceC78821Uwb = optionCategoryViewModel.LJLJI;
            C78820Uwa c78820Uwa = this.LJLIL;
            interfaceC78821Uwb.LIZ(c78820Uwa, new C78815UwV(optionCategoryViewModel, c78820Uwa));
        } else {
            OptionCategoryViewModel optionCategoryViewModel2 = this.LJLILLLLZI;
            InterfaceC78821Uwb interfaceC78821Uwb2 = optionCategoryViewModel2.LJLJI;
            C78820Uwa c78820Uwa2 = this.LJLIL;
            interfaceC78821Uwb2.LIZJ(c78820Uwa2, new C78817UwX(optionCategoryViewModel2, c78820Uwa2));
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}

package X;

import com.ss.android.ugc.gamora.recorder.sticker.optionlist.viewpager.OptionCategoryViewModel;
import fjb.a;
import java.io.IOException;

@InterfaceC65848Psq(c = "com.ss.android.ugc.gamora.recorder.sticker.optionlist.viewpager.OptionCategoryViewModel$updateGreenScreenSelection$1$1", f = "OptionCategoryViewModel.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.UwO, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C78808UwO extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ OptionCategoryViewModel LJLIL;
    public final /* synthetic */ String LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C78808UwO(OptionCategoryViewModel optionCategoryViewModel, String str, InterfaceC67352kd<? super C78808UwO> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = optionCategoryViewModel;
        this.LJLILLLLZI = str;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C78808UwO(this.LJLIL, this.LJLILLLLZI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        try {
            OptionCategoryViewModel optionCategoryViewModel = this.LJLIL;
            C78820Uwa c78820Uwa = new C78820Uwa("Environment", 0, "Green Screen", 0, new C78789Uw5(null, null, this.LJLILLLLZI, null, null, null, 0, 0, 0, null, false, null, 4091));
            optionCategoryViewModel.LJLJI.LIZIZ(c78820Uwa, new C78813UwT(optionCategoryViewModel, c78820Uwa));
        } catch (IOException e) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("Unable to get bitmap: ");
            LIZ.append(e);
            C15280iq.LIZJ("OptionCategoryPanelViewModel", X1D.LIZIZ(LIZ));
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}

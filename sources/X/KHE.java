package X;

import com.ss.android.ugc.aweme.vision.PhotoSearchViewModel;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.vision.PhotoSearchViewModel$searchPhotoRequest$3$6", f = "PhotoSearchViewModel.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes9.dex */
public final class KHE extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ boolean LJLIL;
    public final /* synthetic */ PhotoSearchViewModel LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KHE(boolean z, PhotoSearchViewModel photoSearchViewModel, InterfaceC67352kd<? super KHE> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = z;
        this.LJLILLLLZI = photoSearchViewModel;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new KHE(this.LJLIL, this.LJLILLLLZI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        KHP khp;
        C141335gf.LIZJ(obj);
        if (this.LJLIL) {
            khp = KHP.SUCCESS;
        } else {
            khp = KHP.FAILED;
        }
        PhotoSearchViewModel photoSearchViewModel = this.LJLILLLLZI;
        photoSearchViewModel.LJLIL.setValue(new KHV<>(photoSearchViewModel.LJLJJI, khp));
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}

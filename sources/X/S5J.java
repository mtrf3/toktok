package X;

import com.ss.android.ugc.aweme.influencer.ecommercelive.business.effect2.model.ImageItem;
import com.ss.android.ugc.aweme.influencer.ecommercelive.business.effect2.viewmodel.ImageListViewModel;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.influencer.ecommercelive.business.effect2.viewmodel.ImageListViewModel$display$1$imageFilepath$1", f = "ImageListViewModel.kt", l = {389}, m = "invokeSuspend")
/* loaded from: classes13.dex */
public final class S5J extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super String>, Object> {
    public int LJLIL;
    public final /* synthetic */ ImageItem LJLILLLLZI;
    public final /* synthetic */ ImageListViewModel LJLJI;
    public final /* synthetic */ boolean LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public S5J(ImageItem imageItem, ImageListViewModel imageListViewModel, InterfaceC67352kd interfaceC67352kd, boolean z) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = imageItem;
        this.LJLJI = imageListViewModel;
        this.LJLJJI = z;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new S5J(this.LJLILLLLZI, this.LJLJI, interfaceC67352kd, this.LJLJJI);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        EnumC58928NAu enumC58928NAu = EnumC58928NAu.COROUTINE_SUSPENDED;
        int i = this.LJLIL;
        try {
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C141335gf.LIZJ(obj);
            } else {
                C141335gf.LIZJ(obj);
                String str = this.LJLILLLLZI.imageUrl;
                this.LJLIL = 1;
                C84654XKg c84654XKg = new C84654XKg(C78555UsJ.LJJII(this));
                long currentTimeMillis = System.currentTimeMillis();
                S5A.LIZ("start", "download_image", null, null, null, 28);
                W5U.LJIIIIZZ(str).LJII(new S5K(currentTimeMillis, str, c84654XKg));
                obj = c84654XKg.LIZ();
                if (obj == enumC58928NAu) {
                    return enumC58928NAu;
                }
            }
            return (String) obj;
        } catch (Throwable th) {
            ImageListViewModel.kv0(this.LJLJI, this.LJLJJI, false, th.getMessage(), 8);
            return "";
        }
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super String> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}

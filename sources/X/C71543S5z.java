package X;

import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import com.ss.android.ugc.aweme.influencer.ecommercelive.business.effect2.model.ImageItem;
import com.ss.android.ugc.aweme.influencer.ecommercelive.business.effect2.viewmodel.ImageListViewModel;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.influencer.ecommercelive.business.effect2.viewmodel.ImageListViewModel$display$1", f = "ImageListViewModel.kt", l = {387, 407, 431}, m = "invokeSuspend")
/* renamed from: X.S5z, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C71543S5z extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public S6S LJLIL;
    public LiveEffect LJLILLLLZI;
    public InterfaceC07990Tb LJLJI;
    public int LJLJJI;
    public final /* synthetic */ ImageListViewModel LJLJJL;
    public final /* synthetic */ boolean LJLJJLL;
    public final /* synthetic */ ImageItem LJLJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C71543S5z(ImageItem imageItem, ImageListViewModel imageListViewModel, InterfaceC67352kd interfaceC67352kd, boolean z) {
        super(2, interfaceC67352kd);
        this.LJLJJL = imageListViewModel;
        this.LJLJJLL = z;
        this.LJLJL = imageItem;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C71543S5z(this.LJLJL, this.LJLJJL, interfaceC67352kd, this.LJLJJLL);
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x01ba  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x01de  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001f  */
    @Override // fjb.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r25) {
        /*
            Method dump skipped, instructions count: 517
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C71543S5z.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}

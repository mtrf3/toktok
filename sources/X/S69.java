package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;
import com.ss.android.ugc.aweme.influencer.ecommercelive.business.effect2.viewmodel.ImageListViewModel;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.influencer.ecommercelive.business.effect2.viewmodel.ImageListViewModel", f = "ImageListViewModel.kt", l = {335}, m = "getImageXUploadConfig")
/* loaded from: classes13.dex */
public final class S69 extends C3CS {
    public /* synthetic */ Object LJLIL;
    public final /* synthetic */ ImageListViewModel LJLILLLLZI;
    public int LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public S69(ImageListViewModel imageListViewModel, InterfaceC67352kd<? super S69> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLILLLLZI = imageListViewModel;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLIL = obj;
        this.LJLJI |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLILLLLZI.hv0(this);
    }
}

package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;
import com.ss.android.ugc.aweme.influencer.ecommercelive.business.effect2.viewmodel.ImageListViewModel;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.influencer.ecommercelive.business.effect2.viewmodel.ImageListViewModel", f = "ImageListViewModel.kt", l = {147}, m = "fetchImages")
/* loaded from: classes13.dex */
public final class S67 extends C3CS {
    public ImageListViewModel LJLIL;
    public /* synthetic */ Object LJLILLLLZI;
    public final /* synthetic */ ImageListViewModel LJLJI;
    public int LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public S67(ImageListViewModel imageListViewModel, InterfaceC67352kd<? super S67> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLJI = imageListViewModel;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLILLLLZI = obj;
        this.LJLJJI |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLJI.gv0(null, 0, this);
    }
}

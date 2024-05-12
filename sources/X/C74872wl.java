package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;
import com.bytedance.vcloud.abrmodule.ABRConfig;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.ecommerce.core.translate.repository.TranslationRepository", f = "TranslationRepository.kt", l = {ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY}, m = "getTranslation")
/* renamed from: X.2wl, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C74872wl extends C3CS {
    public Object LJLIL;
    public /* synthetic */ Object LJLILLLLZI;
    public final /* synthetic */ C74862wk LJLJI;
    public int LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C74872wl(C74862wk c74862wk, InterfaceC67352kd<? super C74872wl> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLJI = c74862wk;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLILLLLZI = obj;
        this.LJLJJI |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLJI.LIZ(null, this);
    }
}

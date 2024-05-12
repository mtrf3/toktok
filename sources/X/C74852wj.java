package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.ecommerce.core.translate.repository.api.TranslationApi$Companion", f = "TranslationApi.kt", l = {34}, m = "getTranslation")
/* renamed from: X.2wj, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C74852wj extends C3CS {
    public /* synthetic */ Object LJLIL;
    public final /* synthetic */ C74842wi LJLILLLLZI;
    public int LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C74852wj(C74842wi c74842wi, InterfaceC67352kd<? super C74852wj> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLILLLLZI = c74842wi;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLIL = obj;
        this.LJLJI |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLILLLLZI.LIZ(null, this);
    }
}

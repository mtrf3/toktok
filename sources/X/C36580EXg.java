package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.influencer.ecommercelive.business.common.api.BcToggleApi$Companion", f = "BcToggleApi.kt", l = {42}, m = "getCreatorSaleMode")
/* renamed from: X.EXg, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C36580EXg extends C3CS {
    public /* synthetic */ Object LJLIL;
    public final /* synthetic */ C36579EXf LJLILLLLZI;
    public int LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C36580EXg(C36579EXf c36579EXf, InterfaceC67352kd<? super C36580EXg> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLILLLLZI = c36579EXf;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLIL = obj;
        this.LJLJI |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLILLLLZI.LIZ(null, this);
    }
}

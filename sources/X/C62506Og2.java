package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;
import com.ss.android.ugc.aweme.share.base.model.BaseSharePackage;
import com.ss.android.ugc.aweme.share.improve.handler.LongPressShareButtonHandler;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.share.improve.handler.LongPressShareButtonHandler", f = "LongPressShareButtonHandler.kt", l = {75}, m = "getShareLink")
/* renamed from: X.Og2, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C62506Og2 extends C3CS {
    public BaseSharePackage LJLIL;
    public /* synthetic */ Object LJLILLLLZI;
    public final /* synthetic */ LongPressShareButtonHandler LJLJI;
    public int LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C62506Og2(LongPressShareButtonHandler longPressShareButtonHandler, InterfaceC67352kd<? super C62506Og2> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLJI = longPressShareButtonHandler;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLILLLLZI = obj;
        this.LJLJJI |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLJI.LJII(null, null, this);
    }
}

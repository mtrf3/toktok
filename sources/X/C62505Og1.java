package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;
import com.ss.android.ugc.aweme.share.base.model.BaseSharePackage;
import com.ss.android.ugc.aweme.share.improve.handler.LongPressShareButtonHandler;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.share.improve.handler.LongPressShareButtonHandler", f = "LongPressShareButtonHandler.kt", l = {35, 36}, m = "preHandleShare")
/* renamed from: X.Og1, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C62505Og1 extends C3CS {
    public LongPressShareButtonHandler LJLIL;
    public Object LJLILLLLZI;
    public BaseSharePackage LJLJI;
    public InterfaceC62225ObV LJLJJI;
    public Object LJLJJL;
    public /* synthetic */ Object LJLJJLL;
    public final /* synthetic */ LongPressShareButtonHandler LJLJL;
    public int LJLJLJ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C62505Og1(LongPressShareButtonHandler longPressShareButtonHandler, InterfaceC67352kd<? super C62505Og1> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLJL = longPressShareButtonHandler;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLJJLL = obj;
        this.LJLJLJ |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLJL.LJIIJ(null, null, null, null, this);
    }
}

package X;

import com.bytedance.android.livesdk.livesetting.linkmic.LinkMicMultiGuestV3MaskAvatarSizeTestSetting;
import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;

@InterfaceC65848Psq(c = "com.bytedance.android.livesdk.gift.base.platform.business.send.presend.PreSendGiftInterceptor", f = "PreSendGiftInterceptor.kt", l = {LinkMicMultiGuestV3MaskAvatarSizeTestSetting.SIZE_48}, m = "doCheck")
/* renamed from: X.Rbt, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C69893Rbt extends C3CS {
    public C32804Cu8 LJLIL;
    public /* synthetic */ Object LJLILLLLZI;
    public final /* synthetic */ C32798Cu2 LJLJI;
    public int LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C69893Rbt(C32798Cu2 c32798Cu2, InterfaceC67352kd<? super C69893Rbt> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLJI = c32798Cu2;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLILLLLZI = obj;
        this.LJLJJI |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLJI.LJIIIZ(null, this);
    }
}

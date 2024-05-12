package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;
import com.ss.android.ugc.aweme.im.sdk.chat.data.model.ShareAwemeContent;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.im.sdk.chat.controller.utils.AwemeCoverManager", f = "AwemeCoverManager.kt", l = {729, 757}, m = "bindAwemeCoverReplyMessage")
/* renamed from: X.3Ve, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C84983Ve extends C3CS {
    public C84973Vd LJLIL;
    public C109544Rq LJLILLLLZI;
    public ShareAwemeContent LJLJI;
    public /* synthetic */ Object LJLJJI;
    public final /* synthetic */ C84973Vd LJLJJL;
    public int LJLJJLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C84983Ve(C84973Vd c84973Vd, InterfaceC67352kd<? super C84983Ve> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLJJL = c84973Vd;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLJJI = obj;
        this.LJLJJLL |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLJJL.LIZJ(null, null, null, this, false);
    }
}

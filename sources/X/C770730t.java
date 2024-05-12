package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.im.sdk.chatlist.controller.helper.DmHelper", f = "DmHelper.kt", l = {134}, m = "saveLastReadMessageReactionTimestamp")
/* renamed from: X.30t, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C770730t extends C3CS {
    public Object LJLIL;
    public /* synthetic */ Object LJLILLLLZI;
    public final /* synthetic */ AnonymousClass325 LJLJI;
    public int LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C770730t(AnonymousClass325 anonymousClass325, InterfaceC67352kd<? super C770730t> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLJI = anonymousClass325;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLILLLLZI = obj;
        this.LJLJJI |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLJI.LJIIIIZZ(null, null, this);
    }
}

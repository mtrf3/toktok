package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.im.sdk.chat.feature.tikbot.api.TakoApiUtil", f = "TakoApiUtil.kt", l = {60}, m = "sendTakoReceiveMsgAck$im_base_release")
/* renamed from: X.32m, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C775232m extends C3CS {
    public int LJLIL;
    public int LJLILLLLZI;
    public int LJLJI;
    public Object LJLJJI;
    public Object LJLJJL;
    public long LJLJJLL;
    public /* synthetic */ Object LJLJL;
    public final /* synthetic */ C775132l LJLJLJ;
    public int LJLJLLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C775232m(C775132l c775132l, InterfaceC67352kd<? super C775232m> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLJLJ = c775132l;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLJL = obj;
        this.LJLJLLL |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLJLJ.LIZIZ(null, 0, 0, null, false, null, this);
    }
}

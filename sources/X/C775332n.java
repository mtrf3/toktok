package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.im.sdk.chat.feature.tikbot.api.TakoApiUtil", f = "TakoApiUtil.kt", l = {37}, m = "getTakoSugList$im_base_release")
/* renamed from: X.32n, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C775332n extends C3CS {
    public Object LJLIL;
    public long LJLILLLLZI;
    public /* synthetic */ Object LJLJI;
    public final /* synthetic */ C775132l LJLJJI;
    public int LJLJJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C775332n(C775132l c775132l, InterfaceC67352kd<? super C775332n> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLJJI = c775132l;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLJI = obj;
        this.LJLJJL |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLJJI.LIZ(0, null, null, null, null, null, null, null, this);
    }
}

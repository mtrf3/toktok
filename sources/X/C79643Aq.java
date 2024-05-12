package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.im.sdk.activitystatus.data.MUFActivityStatusModel", f = "MUFActivityStatusModel.kt", l = {311, 314}, m = "fetchMUFActivityStatus")
/* renamed from: X.3Aq, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C79643Aq extends C3CS {
    public C79613An LJLIL;
    public Object LJLILLLLZI;
    public /* synthetic */ Object LJLJI;
    public final /* synthetic */ C79613An LJLJJI;
    public int LJLJJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C79643Aq(C79613An c79613An, InterfaceC67352kd<? super C79643Aq> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLJJI = c79613An;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLJI = obj;
        this.LJLJJL |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLJJI.LIZLLL(this);
    }
}

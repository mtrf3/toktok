package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;

@InterfaceC65848Psq(c = "com.bytedance.android.livesdk.usercard.profilev3.LiveProfileRepository", f = "LiveProfileRepository.kt", l = {159, 160, 169}, m = "flushUserQuery")
/* renamed from: X.BhQ, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C29468BhQ extends C3CS {
    public C29465BhN LJLIL;
    public /* synthetic */ Object LJLILLLLZI;
    public final /* synthetic */ C29465BhN LJLJI;
    public int LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C29468BhQ(C29465BhN c29465BhN, InterfaceC67352kd<? super C29468BhQ> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLJI = c29465BhN;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLILLLLZI = obj;
        this.LJLJJI |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLJI.LIZJ(this);
    }
}
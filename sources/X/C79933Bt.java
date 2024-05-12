package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;

@InterfaceC65848Psq(c = "kotlinx.coroutines.flow.FlowKt__ChannelsKt", f = "Channels.kt", l = {51, BaseNotice.CREATOR}, m = "emitAllImpl$FlowKt__ChannelsKt")
/* renamed from: X.3Bt, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C79933Bt<T> extends C3CS {
    public InterfaceC64672gJ LJLIL;
    public XKM LJLILLLLZI;
    public boolean LJLJI;
    public /* synthetic */ Object LJLJJI;
    public int LJLJJL;

    public C79933Bt(InterfaceC67352kd<? super C79933Bt> interfaceC67352kd) {
        super(interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLJJI = obj;
        this.LJLJJL |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return C79943Bu.LIZIZ(null, null, false, this);
    }
}

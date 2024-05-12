package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.share.viewmodel.ShareActionHelper", f = "ShareActionHelper.kt", l = {119, 129}, m = "hasShareScope")
/* renamed from: X.Hyk, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45830Hyk extends C3CS {
    public C45827Hyh LJLIL;
    public C45827Hyh LJLILLLLZI;
    public /* synthetic */ Object LJLJI;
    public final /* synthetic */ C45827Hyh LJLJJI;
    public int LJLJJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C45830Hyk(C45827Hyh c45827Hyh, InterfaceC67352kd<? super C45830Hyk> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLJJI = c45827Hyh;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLJI = obj;
        this.LJLJJL |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLJJI.LIZ(null, null, null, this);
    }
}

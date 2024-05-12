package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.im.sdk.relations.data.core.SharePanelRelationModel", f = "SharePanelRelationModel.kt", l = {220}, m = "checkShowHeader")
/* renamed from: X.3RD, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C3RD extends C3CS {
    public /* synthetic */ Object LJLIL;
    public final /* synthetic */ C3R0 LJLILLLLZI;
    public int LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3RD(C3R0 c3r0, InterfaceC67352kd<? super C3RD> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLILLLLZI = c3r0;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLIL = obj;
        this.LJLJI |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLILLLLZI.LJIIIIZZ(this);
    }
}

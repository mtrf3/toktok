package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;

@InterfaceC65848Psq(c = "com.bytedance.ugc.effectcreator.main.draftupdate.DraftUpdater$updateDraftResources$$inlined$map$2$2", f = "DraftUpdater.kt", l = {138}, m = "emit")
/* renamed from: X.alR, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class C94713alR extends C3CS {
    public /* synthetic */ Object LJLIL;
    public int LJLILLLLZI;
    public final /* synthetic */ C94358afi LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C94713alR(C94358afi c94358afi, InterfaceC67352kd interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLJI = c94358afi;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLIL = obj;
        this.LJLILLLLZI |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLJI.emit(null, this);
    }
}

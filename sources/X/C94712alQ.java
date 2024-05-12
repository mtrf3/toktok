package X;

import Y.IDfS134S0100000_42;
import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;

@InterfaceC65848Psq(c = "com.bytedance.ugc.effectcreator.main.draftupdate.DraftUpdater$updateDraftResources$$inlined$map$1$2", f = "DraftUpdater.kt", l = {137}, m = "emit")
/* renamed from: X.alQ, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class C94712alQ extends C3CS {
    public /* synthetic */ Object LJLIL;
    public int LJLILLLLZI;
    public final /* synthetic */ IDfS134S0100000_42 LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C94712alQ(IDfS134S0100000_42 iDfS134S0100000_42, InterfaceC67352kd interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLJI = iDfS134S0100000_42;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLIL = obj;
        this.LJLILLLLZI |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLJI.emit(null, this);
    }
}

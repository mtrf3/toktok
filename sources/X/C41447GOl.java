package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;
import com.ss.android.ugc.aweme.commerce.tools.tcm.CommerceTcmPublishModule;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.commerce.tools.tcm.CommerceTcmPublishModule", f = "CommerceTcmPublishModule.kt", l = {180}, m = "showBCSheetOnTagPeople")
/* renamed from: X.GOl, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C41447GOl extends C3CS {
    public /* synthetic */ Object LJLIL;
    public final /* synthetic */ CommerceTcmPublishModule LJLILLLLZI;
    public int LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C41447GOl(CommerceTcmPublishModule commerceTcmPublishModule, InterfaceC67352kd<? super C41447GOl> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLILLLLZI = commerceTcmPublishModule;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLIL = obj;
        this.LJLJI |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLILLLLZI.rd0(null, this);
    }
}

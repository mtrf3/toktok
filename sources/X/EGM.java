package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;

@InterfaceC65848Psq(c = "com.ss.android.ugc.gamora.recorder.sticker.templateeffect.newexport.MobileEffectExportWorkflowImpl", f = "MobileEffectExportWorkflowImpl.kt", l = {89}, m = "fetchNewEffectId")
/* loaded from: classes7.dex */
public final class EGM extends C3CS {
    public ERD LJLIL;
    public /* synthetic */ Object LJLILLLLZI;
    public final /* synthetic */ ERD LJLJI;
    public int LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EGM(ERD erd, InterfaceC67352kd<? super EGM> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLJI = erd;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLILLLLZI = obj;
        this.LJLJJI |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLJI.LJ(this);
    }
}

package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;

@InterfaceC65848Psq(c = "com.ss.android.ugc.gamora.recorder.sticker.templateeffect.exporttasks.MobileEffectGSExportTask", f = "MobileEffectGSExportTask.kt", l = {101}, m = "exportIcon")
/* renamed from: X.EQn, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C36405EQn extends C3CS {
    public /* synthetic */ Object LJLIL;
    public final /* synthetic */ C36413EQv LJLILLLLZI;
    public int LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C36405EQn(C36413EQv c36413EQv, InterfaceC67352kd<? super C36405EQn> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLILLLLZI = c36413EQv;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLIL = obj;
        this.LJLJI |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLILLLLZI.LIZIZ(null, this);
    }
}

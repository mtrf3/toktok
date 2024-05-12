package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;

@InterfaceC65848Psq(c = "com.ss.android.ugc.gamora.recorder.sticker.templateeffect.exporttasks.MobileEffectExportTask", f = "MobileEffectExportTask.kt", l = {76, 80, 82}, m = "exportIcon")
/* renamed from: X.EQs, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C36410EQs extends C3CS {
    public Object LJLIL;
    public /* synthetic */ Object LJLILLLLZI;
    public final /* synthetic */ C36411EQt LJLJI;
    public int LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C36410EQs(C36411EQt c36411EQt, InterfaceC67352kd<? super C36410EQs> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLJI = c36411EQt;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLILLLLZI = obj;
        this.LJLJJI |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLJI.LIZIZ(null, this);
    }
}

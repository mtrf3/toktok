package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;

@InterfaceC65848Psq(c = "com.ss.android.ugc.gamora.recorder.sticker.templateeffect.exporttasks.MobileEffectGSExportTask", f = "MobileEffectGSExportTask.kt", l = {66}, m = "saveSticker")
/* renamed from: X.EQo, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C36406EQo extends C3CS {
    public Object LJLIL;
    public Object LJLILLLLZI;
    public Object LJLJI;
    public /* synthetic */ Object LJLJJI;
    public final /* synthetic */ C36413EQv LJLJJL;
    public int LJLJJLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C36406EQo(C36413EQv c36413EQv, InterfaceC67352kd<? super C36406EQo> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLJJL = c36413EQv;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLJJI = obj;
        this.LJLJJLL |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLJJL.LIZJ(null, null, this);
    }
}

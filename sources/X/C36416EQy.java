package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;

@InterfaceC65848Psq(c = "com.ss.android.ugc.gamora.recorder.sticker.templateeffect.newexport.exportutils.AnnotationExportUtils$Companion", f = "AnnotationExportUtils.kt", l = {26}, m = "saveSticker")
/* renamed from: X.EQy, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C36416EQy extends C3CS {
    public XN6 LJLIL;
    public Object LJLILLLLZI;
    public /* synthetic */ Object LJLJI;
    public final /* synthetic */ C36417EQz LJLJJI;
    public int LJLJJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C36416EQy(C36417EQz c36417EQz, InterfaceC67352kd<? super C36416EQy> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLJJI = c36417EQz;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLJI = obj;
        this.LJLJJL |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLJJI.LIZ(null, null, this);
    }
}

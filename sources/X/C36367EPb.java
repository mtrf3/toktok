package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;

@InterfaceC65848Psq(c = "com.ss.android.ugc.gamora.recorder.sticker.templateeffect.MobileEffectUploader", f = "MobileEffectUploader.kt", l = {56}, m = "createEffect")
/* renamed from: X.EPb, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C36367EPb extends C3CS {
    public /* synthetic */ Object LJLIL;
    public final /* synthetic */ C36370EPe LJLILLLLZI;
    public int LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C36367EPb(C36370EPe c36370EPe, InterfaceC67352kd<? super C36367EPb> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLILLLLZI = c36370EPe;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLIL = obj;
        this.LJLJI |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLILLLLZI.LIZ(null, null, null, null, null, this);
    }
}

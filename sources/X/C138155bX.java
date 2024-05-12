package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;

@InterfaceC65848Psq(c = "com.ss.android.ugc.gamora.editor.sticker.read.panel.TTSPanelUIComponent", f = "TTSPanelUIComponent.kt", l = {980, 981}, m = "fetchVoiceListByOnlyCategory")
/* renamed from: X.5bX, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C138155bX extends C3CS {
    public C138075bP LJLIL;
    public /* synthetic */ Object LJLILLLLZI;
    public final /* synthetic */ C138075bP LJLJI;
    public int LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C138155bX(C138075bP c138075bP, InterfaceC67352kd<? super C138155bX> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLJI = c138075bP;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLILLLLZI = obj;
        this.LJLJJI |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLJI.LLJJIII(this);
    }
}

package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;

@InterfaceC65848Psq(c = "com.ss.android.ugc.gamora.editor.sticker.nature.viewmodel.NatureRepository", f = "NatureRepository.kt", l = {69}, m = "checkNatureContent")
/* renamed from: X.6d3, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C164576d3 extends C3CS {
    public C164546d0 LJLIL;
    public /* synthetic */ Object LJLILLLLZI;
    public final /* synthetic */ C164546d0 LJLJI;
    public int LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C164576d3(C164546d0 c164546d0, InterfaceC67352kd<? super C164576d3> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLJI = c164546d0;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLILLLLZI = obj;
        this.LJLJJI |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLJI.LIZ(null, this);
    }
}

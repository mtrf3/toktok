package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;

@InterfaceC65848Psq(c = "com.ss.android.ugc.gamora.editor.sticker.nature.viewmodel.NatureRepository", f = "NatureRepository.kt", l = {92, 131}, m = "getSpeciesList")
/* renamed from: X.6d2, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C164566d2 extends C3CS {
    public C164546d0 LJLIL;
    public C34K LJLILLLLZI;
    public /* synthetic */ Object LJLJI;
    public final /* synthetic */ C164546d0 LJLJJI;
    public int LJLJJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C164566d2(C164546d0 c164546d0, InterfaceC67352kd<? super C164566d2> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLJJI = c164546d0;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLJI = obj;
        this.LJLJJL |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLJJI.LIZIZ(this);
    }
}

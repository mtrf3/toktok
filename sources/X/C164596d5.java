package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;

@InterfaceC65848Psq(c = "com.ss.android.ugc.gamora.editor.sticker.nature.viewmodel.NatureRepository$getSpeciesList$$inlined$collect$1", f = "NatureRepository.kt", l = {139, 150, 152, 156}, m = "emit")
/* renamed from: X.6d5, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C164596d5 extends C3CS {
    public /* synthetic */ Object LJLIL;
    public int LJLILLLLZI;
    public final /* synthetic */ C164556d1 LJLJI;
    public C164556d1 LJLJJI;
    public long LJLJJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C164596d5(C164556d1 c164556d1, InterfaceC67352kd interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLJI = c164556d1;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLIL = obj;
        this.LJLILLLLZI |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLJI.emit(null, this);
    }
}

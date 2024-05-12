package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;

@InterfaceC65848Psq(c = "com.bytedance.android.live.effect.smallitem.LiveSmallItemBeautyRepository", f = "LiveSmallItemBeautyRepository.kt", l = {125}, m = "fetchRemoteDataNew")
/* renamed from: X.27g, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C532827g extends C3CS {
    public C44171oL LJLIL;
    public long LJLILLLLZI;
    public /* synthetic */ Object LJLJI;
    public final /* synthetic */ C44171oL LJLJJI;
    public int LJLJJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C532827g(C44171oL c44171oL, InterfaceC67352kd<? super C532827g> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLJJI = c44171oL;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLJI = obj;
        this.LJLJJL |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLJJI.LJIIIIZZ(this);
    }
}

package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;

@InterfaceC65848Psq(c = "com.bytedance.android.live.effect.smallitem.LiveSmallItemBeautyRepository", f = "LiveSmallItemBeautyRepository.kt", l = {65}, m = "fetchLocalDataNew")
/* renamed from: X.27f, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C532727f extends C3CS {
    public C44171oL LJLIL;
    public /* synthetic */ Object LJLILLLLZI;
    public final /* synthetic */ C44171oL LJLJI;
    public int LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C532727f(C44171oL c44171oL, InterfaceC67352kd<? super C532727f> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLJI = c44171oL;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLILLLLZI = obj;
        this.LJLJJI |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLJI.LJI(this);
    }
}

package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;

@InterfaceC65848Psq(c = "com.ss.android.ugc.tiktok.addyours.collection.AddYoursCollectionRepository$operator$1", f = "AddYoursCollectionRepository.kt", l = {42}, m = "unCollectTopic")
/* renamed from: X.8jV, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C219538jV extends C3CS {
    public /* synthetic */ Object LJLIL;
    public final /* synthetic */ C219518jT LJLILLLLZI;
    public int LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C219538jV(C219518jT c219518jT, InterfaceC67352kd<? super C219538jV> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLILLLLZI = c219518jT;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLIL = obj;
        this.LJLJI |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLILLLLZI.LJIL(0L, this);
    }
}
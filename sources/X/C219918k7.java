package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;

@InterfaceC65848Psq(c = "com.ss.android.ugc.tiktok.addyours.api.AddYoursApi", f = "AddYoursApi.kt", l = {34}, m = "getTopicSticker")
/* renamed from: X.8k7, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C219918k7 extends C3CS {
    public /* synthetic */ Object LJLIL;
    public final /* synthetic */ C219908k6 LJLILLLLZI;
    public int LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C219918k7(C219908k6 c219908k6, InterfaceC67352kd<? super C219918k7> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLILLLLZI = c219908k6;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLIL = obj;
        this.LJLJI |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLILLLLZI.LIZIZ(0L, this);
    }
}

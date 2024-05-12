package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;

@InterfaceC65848Psq(c = "com.bytedance.android.live.publicscreen.impl.caption.TextSegmentHelper", f = "TextSegmentHelper.kt", l = {35}, m = "measure")
/* renamed from: X.Bek, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C29302Bek extends C3CS {
    public C29301Bej LJLIL;
    public /* synthetic */ Object LJLILLLLZI;
    public final /* synthetic */ C29301Bej LJLJI;
    public int LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C29302Bek(C29301Bej c29301Bej, InterfaceC67352kd<? super C29302Bek> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLJI = c29301Bej;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLILLLLZI = obj;
        this.LJLJJI |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLJI.LIZJ(null, this);
    }
}

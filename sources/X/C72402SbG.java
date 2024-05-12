package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;

@InterfaceC65848Psq(c = "com.bytedance.android.livesdk.widget.multiImageview.loader.MultiIconLoadHelper", f = "MultiIconLoadHelper.kt", l = {75}, m = "fetchImageUrls")
/* renamed from: X.SbG, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C72402SbG extends C3CS {
    public /* synthetic */ Object LJLIL;
    public final /* synthetic */ C72400SbE LJLILLLLZI;
    public int LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C72402SbG(C72400SbE c72400SbE, InterfaceC67352kd<? super C72402SbG> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLILLLLZI = c72400SbE;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLIL = obj;
        this.LJLJI |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLILLLLZI.LIZ(null, null, this);
    }
}

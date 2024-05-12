package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;

@InterfaceC65848Psq(c = "com.ss.ugc.android.editor.track.utils.VEUtils", f = "VEUtils.kt", l = {14}, m = "getWaveArray")
/* renamed from: X.2tF, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C72692tF extends C3CS {
    public /* synthetic */ Object LJLIL;
    public final /* synthetic */ C72682tE LJLILLLLZI;
    public int LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C72692tF(C72682tE c72682tE, InterfaceC67352kd<? super C72692tF> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLILLLLZI = c72682tE;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLIL = obj;
        this.LJLJI |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLILLLLZI.LIZ(null, 0, this);
    }
}

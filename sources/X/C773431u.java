package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.im.sdk.chat.feature.camera.safety.DMMediaSafetyHelper", f = "DMMediaSafetyHelper.kt", l = {21}, m = "forceMark")
/* renamed from: X.31u, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C773431u extends C3CS {
    public /* synthetic */ Object LJLIL;
    public final /* synthetic */ C773331t LJLILLLLZI;
    public int LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C773431u(C773331t c773331t, InterfaceC67352kd<? super C773431u> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLILLLLZI = c773331t;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLIL = obj;
        this.LJLJI |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLILLLLZI.LIZ(null, this);
    }
}
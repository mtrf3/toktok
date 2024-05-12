package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.im.sdk.relations.data.manager.IMUserMentionPrivacyUpdateManager", f = "IMUserMentionPrivacyUpdateManager.kt", l = {38}, m = "updateIMUserMentionPrivacyForWarmStart")
/* renamed from: X.3Dy, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C80503Dy extends C3CS {
    public /* synthetic */ Object LJLIL;
    public final /* synthetic */ C3E0 LJLILLLLZI;
    public int LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C80503Dy(C3E0 c3e0, InterfaceC67352kd<? super C80503Dy> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLILLLLZI = c3e0;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLIL = obj;
        this.LJLJI |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLILLLLZI.LIZIZ(this);
    }
}

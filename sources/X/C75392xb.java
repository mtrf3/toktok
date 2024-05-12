package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.im.sdk.chatlist.feature.cameraicon.mgr.AddCameraIconMgr", f = "AddCameraIconMgr.kt", l = {163, 56, 63}, m = "initUpdateSet")
/* renamed from: X.2xb, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C75392xb extends C3CS {
    public Object LJLIL;
    public Object LJLILLLLZI;
    public Object LJLJI;
    public InterfaceC75422xe LJLJJI;
    public /* synthetic */ Object LJLJJL;
    public final /* synthetic */ C75382xa LJLJJLL;
    public int LJLJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C75392xb(C75382xa c75382xa, InterfaceC67352kd<? super C75392xb> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLJJLL = c75382xa;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLJJL = obj;
        this.LJLJL |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLJJLL.LJFF(null, null, null, this);
    }
}

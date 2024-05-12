package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.im.sdk.chatlist.feature.cameraicon.mgr.AddCameraIconMgr", f = "AddCameraIconMgr.kt", l = {173, 96}, m = "updateProperty")
/* renamed from: X.2xc, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C75402xc extends C3CS {
    public Object LJLIL;
    public Object LJLILLLLZI;
    public Object LJLJI;
    public XJO LJLJJI;
    public /* synthetic */ Object LJLJJL;
    public final /* synthetic */ C75382xa LJLJJLL;
    public int LJLJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C75402xc(C75382xa c75382xa, InterfaceC67352kd<? super C75402xc> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLJJLL = c75382xa;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLJJL = obj;
        this.LJLJL |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLJJLL.LJII(null, this);
    }
}

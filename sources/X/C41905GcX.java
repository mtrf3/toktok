package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.tools.music.aichoosemusic.task.StreamEditUploadFrameTask", f = "StreamEditUploadFrameTask.kt", l = {47}, m = "createFramePackage")
/* renamed from: X.GcX, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C41905GcX extends C3CS {
    public C41906GcY LJLIL;
    public long LJLILLLLZI;
    public /* synthetic */ Object LJLJI;
    public final /* synthetic */ C41906GcY LJLJJI;
    public int LJLJJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C41905GcX(C41906GcY c41906GcY, InterfaceC67352kd<? super C41905GcX> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLJJI = c41906GcY;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLJI = obj;
        this.LJLJJL |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLJJI.LIZ(this);
    }
}

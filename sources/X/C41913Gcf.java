package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.tools.music.aichoosemusic.task.LocalVideoUploadFrameTask", f = "LocalVideoUploadFrameTask.kt", l = {73}, m = "createFramePackageOld")
/* renamed from: X.Gcf, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C41913Gcf extends C3CS {
    public C41911Gcd LJLIL;
    public long LJLILLLLZI;
    public /* synthetic */ Object LJLJI;
    public final /* synthetic */ C41911Gcd LJLJJI;
    public int LJLJJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C41913Gcf(C41911Gcd c41911Gcd, InterfaceC67352kd<? super C41913Gcf> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLJJI = c41911Gcd;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLJI = obj;
        this.LJLJJL |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLJJI.LJIIL(this);
    }
}

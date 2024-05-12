package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.tools.music.aichoosemusic.task.LocalVideoUploadFrameTask", f = "LocalVideoUploadFrameTask.kt", l = {110, 232}, m = "createFramePackageNew")
/* renamed from: X.Gce, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C41912Gce extends C3CS {
    public C41911Gcd LJLIL;
    public Object LJLILLLLZI;
    public Object LJLJI;
    public C68322mC LJLJJI;
    public long LJLJJL;
    public /* synthetic */ Object LJLJJLL;
    public final /* synthetic */ C41911Gcd LJLJL;
    public int LJLJLJ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C41912Gce(C41911Gcd c41911Gcd, InterfaceC67352kd<? super C41912Gce> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLJL = c41911Gcd;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLJJLL = obj;
        this.LJLJLJ |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLJL.LJIIJJI(this);
    }
}

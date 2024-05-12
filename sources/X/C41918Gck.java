package X;

import Y.IDfS23S0200000_7;
import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.tools.music.aichoosemusic.task.LocalVideoUploadFrameTask$createFramePackageNew$$inlined$map$1$2", f = "LocalVideoUploadFrameTask.kt", l = {136}, m = "emit")
/* renamed from: X.Gck, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C41918Gck extends C3CS {
    public /* synthetic */ Object LJLIL;
    public int LJLILLLLZI;
    public final /* synthetic */ IDfS23S0200000_7 LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C41918Gck(IDfS23S0200000_7 iDfS23S0200000_7, InterfaceC67352kd interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLJI = iDfS23S0200000_7;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLIL = obj;
        this.LJLILLLLZI |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLJI.emit(null, this);
    }
}

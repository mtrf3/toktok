package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.shortvideo.video2sticker.crop.VideoCropComponent", f = "VideoCropComponent.kt", l = {181}, m = "frequencyLimitedCommitNLE")
/* renamed from: X.5lj, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C144475lj extends C3CS {
    public C144435lf LJLIL;
    public /* synthetic */ Object LJLILLLLZI;
    public final /* synthetic */ C144435lf LJLJI;
    public int LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C144475lj(C144435lf c144435lf, InterfaceC67352kd<? super C144475lj> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLJI = c144435lf;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLILLLLZI = obj;
        this.LJLJJI |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLJI.LJLZ(this);
    }
}

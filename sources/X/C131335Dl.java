package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;

@InterfaceC65848Psq(c = "com.ss.ugc.android.editor.track.frame.FrameLoader", f = "FrameLoader.kt", l = {53}, m = "loadFrame")
/* renamed from: X.5Dl, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C131335Dl extends C3CS {
    public Object LJLIL;
    public Object LJLILLLLZI;
    public Object LJLJI;
    public C5DX LJLJJI;
    public /* synthetic */ Object LJLJJL;
    public final /* synthetic */ C5DZ LJLJJLL;
    public int LJLJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C131335Dl(C5DZ c5dz, InterfaceC67352kd<? super C131335Dl> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLJJLL = c5dz;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLJJL = obj;
        this.LJLJL |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLJJLL.LIZLLL(null, null, null, null, null, null, this);
    }
}

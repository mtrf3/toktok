package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;

@InterfaceC65848Psq(c = "com.ss.ugc.android.editor.track.frame.VideoFrameCache", f = "VideoFrameCache.kt", l = {156}, m = "doRefresh")
/* renamed from: X.5Dm, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C131345Dm extends C3CS {
    public C131235Db LJLIL;
    public boolean LJLILLLLZI;
    public /* synthetic */ Object LJLJI;
    public final /* synthetic */ C131235Db LJLJJI;
    public int LJLJJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C131345Dm(C131235Db c131235Db, InterfaceC67352kd<? super C131345Dm> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLJJI = c131235Db;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLJI = obj;
        this.LJLJJL |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLJJI.LJ(false, this);
    }
}

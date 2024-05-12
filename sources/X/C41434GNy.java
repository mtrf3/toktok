package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.tools.draft.download.DraftStickerDownloadMgr$Companion", f = "DraftStickerDownloadMgr.kt", l = {270, 272}, m = "updateDraftStickers")
/* renamed from: X.GNy, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C41434GNy extends C3CS {
    public C83309Wmn LJLIL;
    public /* synthetic */ Object LJLILLLLZI;
    public final /* synthetic */ C41435GNz LJLJI;
    public int LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C41434GNy(C41435GNz c41435GNz, InterfaceC67352kd<? super C41434GNy> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLJI = c41435GNz;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLILLLLZI = obj;
        this.LJLJJI |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLJI.LIZIZ(null, null, this);
    }
}

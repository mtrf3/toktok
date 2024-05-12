package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;
import com.ss.android.ugc.aweme.poi.detail.videolist.PoiVideoListSharedViewModel;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.poi.detail.videolist.PoiVideoListSharedViewModel", f = "PoiVideoListSharedViewModel.kt", l = {94, 106}, m = "onLoadMore")
/* renamed from: X.7bg, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C189207bg extends C3CS {
    public PoiVideoListSharedViewModel LJLIL;
    public Object LJLILLLLZI;
    public PoiVideoListSharedViewModel LJLJI;
    public long LJLJJI;
    public long LJLJJL;
    public /* synthetic */ Object LJLJJLL;
    public final /* synthetic */ PoiVideoListSharedViewModel LJLJL;
    public int LJLJLJ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C189207bg(PoiVideoListSharedViewModel poiVideoListSharedViewModel, InterfaceC67352kd<? super C189207bg> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLJL = poiVideoListSharedViewModel;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLJJLL = obj;
        this.LJLJLJ |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLJL.gv0(0L, this);
    }
}

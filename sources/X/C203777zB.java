package X;

import com.bytedance.android.livesdk.livesetting.level.UserLevelGeckoUpdateSetting;
import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.feed.favorite.VideoFavoriteRepository$operator$1$mutateFavorite$$inlined$map$1$2", f = "VideoFavoriteRepository.kt", l = {UserLevelGeckoUpdateSetting.DEFAULT, 136}, m = "emit")
/* renamed from: X.7zB, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C203777zB extends C3CS {
    public /* synthetic */ Object LJLIL;
    public int LJLILLLLZI;
    public InterfaceC64672gJ LJLJI;
    public final /* synthetic */ C203767zA LJLJJI;
    public XGX LJLJJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C203777zB(C203767zA c203767zA, InterfaceC67352kd interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLJJI = c203767zA;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLIL = obj;
        this.LJLILLLLZI |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLJJI.emit(null, this);
    }
}

package X;

import com.bytedance.android.livesdk.livesetting.linkmic.LiveAudienceLinkmicLowestAgeSetting;
import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.music.api.QueryMusicQuery", f = "QueryMusicQuery.kt", l = {LiveAudienceLinkmicLowestAgeSetting.DEFAULT}, m = "operate")
/* renamed from: X.Mei, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C57328Mei extends C3CS {
    public /* synthetic */ Object LJLIL;
    public final /* synthetic */ C57327Meh LJLILLLLZI;
    public int LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C57328Mei(C57327Meh c57327Meh, InterfaceC67352kd<? super C57328Mei> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLILLLLZI = c57327Meh;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLIL = obj;
        this.LJLJI |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLILLLLZI.LJJLIIIJILLIZJL(null, this);
    }
}

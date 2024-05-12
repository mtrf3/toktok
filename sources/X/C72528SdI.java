package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;
import com.ss.android.ugc.aweme.viewmodel.MentionMusicVideoVM;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.viewmodel.MentionMusicVideoVM", f = "MentionMusicVideoVM.kt", l = {90, 93}, m = "getMusicVideos")
/* renamed from: X.SdI, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C72528SdI extends C3CS {
    public MentionMusicVideoVM LJLIL;
    public Object LJLILLLLZI;
    public /* synthetic */ Object LJLJI;
    public final /* synthetic */ MentionMusicVideoVM LJLJJI;
    public int LJLJJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C72528SdI(MentionMusicVideoVM mentionMusicVideoVM, InterfaceC67352kd<? super C72528SdI> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLJJI = mentionMusicVideoVM;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLJI = obj;
        this.LJLJJL |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLJJI.kv0(0, 0L, null, this);
    }
}

package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;
import com.ss.android.ugc.aweme.viewmodel.MentionFavoriteVideoVM;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.viewmodel.MentionFavoriteVideoVM", f = "MentionFavoriteVideoVM.kt", l = {101, 104}, m = "getFavoriteVideos")
/* renamed from: X.SdH, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C72527SdH extends C3CS {
    public MentionFavoriteVideoVM LJLIL;
    public Object LJLILLLLZI;
    public /* synthetic */ Object LJLJI;
    public final /* synthetic */ MentionFavoriteVideoVM LJLJJI;
    public int LJLJJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C72527SdH(MentionFavoriteVideoVM mentionFavoriteVideoVM, InterfaceC67352kd<? super C72527SdH> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLJJI = mentionFavoriteVideoVM;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLJI = obj;
        this.LJLJJL |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLJJI.lv0(0L, this);
    }
}

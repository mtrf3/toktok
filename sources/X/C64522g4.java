package X;

import android.content.Context;
import com.ss.android.ugc.aweme.feed.favorite.VideoFavoriteVM;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.feed.favorite.VideoFavoriteVM$handleFavoriteOptimsticUI$5$1$1$2", f = "VideoFavoriteVM.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.2g4, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C64522g4 extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ VideoFavoriteVM LJLIL;
    public final /* synthetic */ VideoItemParams LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C64522g4(VideoFavoriteVM videoFavoriteVM, VideoItemParams videoItemParams, InterfaceC67352kd<? super C64522g4> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = videoFavoriteVM;
        this.LJLILLLLZI = videoItemParams;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C64522g4(this.LJLIL, this.LJLILLLLZI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        String str;
        Context context;
        Aweme aweme;
        C141335gf.LIZJ(obj);
        VideoFavoriteVM videoFavoriteVM = this.LJLIL;
        VideoItemParams videoItemParams = this.LJLILLLLZI;
        if (videoItemParams == null || (aweme = videoItemParams.getAweme()) == null || (str = aweme.getAid()) == null) {
            str = "";
        }
        videoFavoriteVM.pv0(str, true, true);
        if (this.LJLIL.ov0() && (context = this.LJLIL.getContext()) != null && !C79004UzY.LJJIJIIJI(context)) {
            this.LJLIL.setState(C90713hD.LJLIL);
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}

package X;

import android.content.Context;
import com.ss.android.ugc.aweme.audiomode.fullepisodev2.FullEpisodeDetailsViewModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.audiomode.fullepisodev2.FullEpisodeDetailsViewModel$handleFavorite$1$1$1", f = "FullEpisodeDetailViewModel.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.2e3, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C63272e3 extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ FullEpisodeDetailsViewModel LJLIL;
    public final /* synthetic */ Aweme LJLILLLLZI;
    public final /* synthetic */ Context LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C63272e3(FullEpisodeDetailsViewModel fullEpisodeDetailsViewModel, Aweme aweme, Context context, InterfaceC67352kd<? super C63272e3> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = fullEpisodeDetailsViewModel;
        this.LJLILLLLZI = aweme;
        this.LJLJI = context;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C63272e3(this.LJLIL, this.LJLILLLLZI, this.LJLJI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        String str;
        C141335gf.LIZJ(obj);
        FullEpisodeDetailsViewModel fullEpisodeDetailsViewModel = this.LJLIL;
        Aweme aweme = this.LJLILLLLZI;
        Context context = this.LJLJI;
        if (aweme == null || (str = aweme.getAid()) == null) {
            str = "";
        }
        fullEpisodeDetailsViewModel.refreshFavoriteState(true, aweme, context, str, false);
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}

package X;

import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.search.detail.shoot.ui.SearchInflowMusicShootButtonAssem;
import kotlin.jvm.internal.o;

/* renamed from: X.KLl, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51561KLl extends AbstractC65781Prl implements InterfaceC88471Ynr<SearchInflowMusicShootButtonAssem, C43I<? extends Integer>, C76800UCe> {
    public static final C51561KLl LJLIL = new C51561KLl();

    public C51561KLl() {
        super(2);
    }

    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(SearchInflowMusicShootButtonAssem searchInflowMusicShootButtonAssem, C43I<? extends Integer> c43i) {
        SearchInflowMusicShootButtonAssem selectSubscribe = searchInflowMusicShootButtonAssem;
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        if (c43i != null && selectSubscribe.getContainerView().isShown()) {
            Z9N.LIZIZ.LLILZ().LJIIIZ(((VideoItemParams) C51029K0z.LJIILLIIL(selectSubscribe)).getAweme().getAid(), ((VideoItemParams) C51029K0z.LJIILLIIL(selectSubscribe)).mEventType, ((VideoItemParams) C51029K0z.LJIILLIIL(selectSubscribe)).getAweme().getAuthorUid());
        }
        return C76800UCe.LIZ;
    }
}

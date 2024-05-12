package X;

import android.text.TextUtils;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.awemeservice.AwemeService;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.dsp.service.IMusicDspService;
import com.ss.android.ugc.aweme.favorites.service.FavoriteServiceImpl;
import com.ss.android.ugc.aweme.favorites.service.IFavoriteService;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeStatistics;
import fjb.a;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.feed.favorite.VideoFavoriteRepository$operator$1$mutateFavorite$1$1", f = "VideoFavoriteRepository.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.7z9, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C203757z9 extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ XGX<C203787zC> LJLIL;
    public final /* synthetic */ InterfaceC65784Pro<C76800UCe> LJLILLLLZI;
    public final /* synthetic */ C203827zG LJLJI;
    public final /* synthetic */ Aweme LJLJJI;
    public final /* synthetic */ String LJLJJL;
    public final /* synthetic */ int LJLJJLL;
    public final /* synthetic */ String LJLJL;
    public final /* synthetic */ boolean LJLJLJ;
    public final /* synthetic */ long LJLJLLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C203757z9(XGX<C203787zC> xgx, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro, C203827zG c203827zG, Aweme aweme, String str, int i, String str2, boolean z, long j, InterfaceC67352kd<? super C203757z9> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = xgx;
        this.LJLILLLLZI = interfaceC65784Pro;
        this.LJLJI = c203827zG;
        this.LJLJJI = aweme;
        this.LJLJJL = str;
        this.LJLJJLL = i;
        this.LJLJL = str2;
        this.LJLJLJ = z;
        this.LJLJLLL = j;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C203757z9(this.LJLIL, this.LJLILLLLZI, this.LJLJI, this.LJLJJI, this.LJLJJL, this.LJLJJLL, this.LJLJL, this.LJLJLJ, this.LJLJLLL, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        BaseResponse baseResponse;
        AwemeStatistics statistics;
        C203787zC c203787zC;
        C141335gf.LIZJ(obj);
        XGW xgw = (XGW) this.LJLIL;
        if (xgw != null && (c203787zC = (C203787zC) xgw.LJ) != null) {
            baseResponse = c203787zC.LIZ;
        } else {
            baseResponse = null;
        }
        M8L.LIZJ("/aweme/v1/aweme/collect/", "net", baseResponse);
        InterfaceC65784Pro<C76800UCe> interfaceC65784Pro = this.LJLILLLLZI;
        if (interfaceC65784Pro != null) {
            interfaceC65784Pro.invoke();
        } else {
            C203827zG c203827zG = this.LJLJI;
            Aweme aweme = this.LJLJJI;
            String enterFrom = this.LJLJJL;
            int i = this.LJLJJLL;
            String from = this.LJLJL;
            boolean z = this.LJLJLJ;
            long j = this.LJLJLLL;
            c203827zG.getClass();
            o.LJIIIZ(aweme, "aweme");
            o.LJIIIZ(enterFrom, "enterFrom");
            o.LJIIIZ(from, "from");
            if (aweme.getCollectStatus() != i) {
                aweme.setCollectStatus(i);
                IMusicDspService iMusicDspService = C51645KOr.LIZIZ;
                String aid = aweme.getAid();
                o.LJIIIIZZ(aid, "aweme.aid");
                iMusicDspService.LJIJI(i, aweme.getAwemeType(), aid);
                AwemeService.LIZ().g6(i, aweme.getAid());
                if (AwemeService.LIZ().i6(aweme.getAid()) == null) {
                    if (i == 1) {
                        AwemeStatistics statistics2 = aweme.getStatistics();
                        if (statistics2 != null) {
                            statistics2.setCollectCount(j + 1);
                        }
                    } else if (j > 0 && (statistics = aweme.getStatistics()) != null) {
                        statistics.setCollectCount(j - 1);
                    }
                }
                C2U8.LIZ(new C50420Jqa(54, aweme));
                String aid2 = aweme.getAid();
                o.LJIIIIZZ(aid2, "aweme.aid");
                C2U8.LIZ(new C193097hx(aid2, aweme.getCollectStatus(), false));
                String aid3 = aweme.getAid();
                o.LJIIIIZZ(aid3, "aweme.aid");
                C2U8.LIZ(new C193087hw(aid3, aweme.getCollectStatus(), aweme.getAwemeType()));
                if (!TextUtils.equals(enterFrom, "from_duet_mode") && !TextUtils.equals(enterFrom, "from_duet_mode_detail")) {
                    IFavoriteService LJIJJLI = FavoriteServiceImpl.LJIJJLI();
                    String aid4 = aweme.getAid();
                    o.LJIIIIZZ(aid4, "aweme.aid");
                    LJIJJLI.LJIIJJI(aid4);
                }
                if (!Keva.getRepo("collect").getBoolean("first_favourite_success", false) && !z) {
                    Keva.getRepo("collect").storeBoolean("first_favourite_success", true);
                }
            }
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}

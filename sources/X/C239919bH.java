package X;

import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.music.artist.model.ArtistMusicAwemeResponse;
import com.ss.android.ugc.aweme.music.artist.viewmodel.ArtistMusicFeaturedVideoViewModel;
import fjb.a;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AqS170S0100000_4;
import kotlin.jvm.internal.IDqS451S0100000_4;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.music.artist.viewmodel.ArtistMusicFeaturedVideoViewModel$requestAwemeList$resultList$1", f = "ArtistMusicFeaturedVideoViewModel.kt", l = {126}, m = "invokeSuspend")
/* renamed from: X.9bH, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C239919bH extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super List<InterfaceC57784Mm4>>, Object> {
    public int LJLIL;
    public final /* synthetic */ ArtistMusicFeaturedVideoViewModel LJLILLLLZI;
    public final /* synthetic */ String LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C239919bH(ArtistMusicFeaturedVideoViewModel artistMusicFeaturedVideoViewModel, String str, InterfaceC67352kd<? super C239919bH> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = artistMusicFeaturedVideoViewModel;
        this.LJLJI = str;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C239919bH(this.LJLILLLLZI, this.LJLJI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        String str;
        EnumC58928NAu enumC58928NAu = EnumC58928NAu.COROUTINE_SUSPENDED;
        int i = this.LJLIL;
        if (i != 0) {
            if (i == 1) {
                C141335gf.LIZJ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C141335gf.LIZJ(obj);
            AbstractC73672Svk<ArtistMusicAwemeResponse> LLII = ((InterfaceC233929Ga) this.LJLILLLLZI.LJLIL.getValue().getOperator()).LLII(this.LJLJI);
            this.LJLIL = 1;
            obj = C77318UWc.LIZIZ(LLII, this);
            if (obj == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        ArtistMusicAwemeResponse artistMusicAwemeResponse = (ArtistMusicAwemeResponse) obj;
        this.LJLILLLLZI.setState(C239909bG.LJLIL);
        ArrayList arrayList = new ArrayList();
        C236139On c236139On = (C236139On) this.LJLILLLLZI.LJLILLLLZI.getValue();
        if (c236139On == null || (str = c236139On.LJLILLLLZI) == null) {
            str = "";
        }
        arrayList.add(new C239959bL(str));
        arrayList.add(new C239969bM(new AqS170S0100000_4(this.LJLILLLLZI, 414)));
        List<Aweme> awemeList = artistMusicAwemeResponse.getAwemeList();
        if (awemeList == null) {
            awemeList = C61878OQg.INSTANCE;
        }
        if (awemeList.isEmpty()) {
            this.LJLILLLLZI.setState(C239949bK.LJLIL);
        }
        for (Aweme aweme : awemeList) {
            String aid = aweme.getAid();
            if (aid == null) {
                aid = "";
            }
            UrlModel musicStarter = aweme.getMusicStarter();
            String labelMusicStarterText = aweme.getLabelMusicStarterText();
            if (labelMusicStarterText == null) {
                labelMusicStarterText = "";
            }
            UrlModel cover = aweme.getVideo().getCover();
            if (cover == null) {
                cover = new UrlModel();
            }
            arrayList.add(new C243889hg(aid, musicStarter, labelMusicStarterText, cover, o.LJ(aweme.getAid(), this.LJLILLLLZI.LJLJI), new IDqS451S0100000_4(this.LJLILLLLZI, 2)));
        }
        this.LJLILLLLZI.LJLJJI.clear();
        this.LJLILLLLZI.LJLJJI.addAll(arrayList);
        return arrayList;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super List<InterfaceC57784Mm4>> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}

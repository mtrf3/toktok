package X;

import Y.IDfS12S0300000_1;
import android.content.Context;
import com.ss.android.ugc.aweme.audiomode.fullepisodev2.FullEpisodeDetailsViewModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.audiomode.fullepisodev2.FullEpisodeDetailsViewModel$handleFavorite$1", f = "FullEpisodeDetailViewModel.kt", l = {381, 687}, m = "invokeSuspend")
/* renamed from: X.2g0, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C64482g0 extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ FullEpisodeDetailsViewModel LJLILLLLZI;
    public final /* synthetic */ Aweme LJLJI;
    public final /* synthetic */ Context LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C64482g0(FullEpisodeDetailsViewModel fullEpisodeDetailsViewModel, Aweme aweme, Context context, InterfaceC67352kd<? super C64482g0> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = fullEpisodeDetailsViewModel;
        this.LJLJI = aweme;
        this.LJLJJI = context;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C64482g0(this.LJLILLLLZI, this.LJLJI, this.LJLJJI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        EnumC58928NAu enumC58928NAu = EnumC58928NAu.COROUTINE_SUSPENDED;
        int i = this.LJLIL;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    C141335gf.LIZJ(obj);
                    return C76800UCe.LIZ;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C141335gf.LIZJ(obj);
        } else {
            C141335gf.LIZJ(obj);
            FullEpisodeDetailsViewModel fullEpisodeDetailsViewModel = this.LJLILLLLZI;
            this.LJLIL = 1;
            if (fullEpisodeDetailsViewModel.startTimer(this) == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        Aweme aweme = this.LJLJI;
        Boolean value = this.LJLILLLLZI._isFavorite.getValue();
        if (value == null) {
            value = Boolean.FALSE;
        }
        InterfaceC65462ha LIZ = C203857zJ.LIZ(aweme, "", "", value.booleanValue(), 0L);
        IDfS12S0300000_1 iDfS12S0300000_1 = new IDfS12S0300000_1(this.LJLJJI, this.LJLILLLLZI, this.LJLJI, 0);
        this.LJLIL = 2;
        if (((C65482hc) LIZ).collect(iDfS12S0300000_1, this) == enumC58928NAu) {
            return enumC58928NAu;
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}

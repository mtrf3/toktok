package X;

import Y.IDfS131S0100000_10;
import com.ss.android.ugc.aweme.commercialize.media.impl.handler.detail.substitutemusic.v2.CommerceMusicSubstituteMusicListViewModel;
import com.ss.android.ugc.aweme.commercialize.media.impl.utils.ScopedMusicPlayer;
import fjb.a;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.commercialize.media.impl.handler.detail.substitutemusic.v2.CommerceMusicSubstituteMusicListViewModel$init$2", f = "CommerceMusicSubstituteMusicListViewModel.kt", l = {161}, m = "invokeSuspend")
/* loaded from: classes11.dex */
public final class NE2 extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ CommerceMusicSubstituteMusicListViewModel LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NE2(CommerceMusicSubstituteMusicListViewModel commerceMusicSubstituteMusicListViewModel, InterfaceC67352kd<? super NE2> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = commerceMusicSubstituteMusicListViewModel;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new NE2(this.LJLILLLLZI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
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
            ScopedMusicPlayer scopedMusicPlayer = this.LJLILLLLZI.LJLILLLLZI;
            if (scopedMusicPlayer != null) {
                C79863Bm LIZLLL = V1M.LIZLLL(scopedMusicPlayer.LJLJI);
                IDfS131S0100000_10 iDfS131S0100000_10 = new IDfS131S0100000_10(this.LJLILLLLZI, 12);
                this.LJLIL = 1;
                if (LIZLLL.collect(iDfS131S0100000_10, this) == enumC58928NAu) {
                    return enumC58928NAu;
                }
            } else {
                o.LJIJI("musicPlayer");
                throw null;
            }
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}

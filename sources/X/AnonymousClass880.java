package X;

import Y.IDfS127S0100000_3;
import com.ss.android.ugc.aweme.favorites.business.playlist.PlaylistCollectionStateAgent;
import com.ss.android.ugc.aweme.favorites.business.playlist.PlaylistCollectionVM;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.favorites.business.playlist.PlaylistCollectionVM$onPrepared$1", f = "PlaylistCollectionVM.kt", l = {116}, m = "invokeSuspend")
/* renamed from: X.880, reason: invalid class name */
/* loaded from: classes4.dex */
public final class AnonymousClass880 extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ PlaylistCollectionVM LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnonymousClass880(PlaylistCollectionVM playlistCollectionVM, InterfaceC67352kd<? super AnonymousClass880> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = playlistCollectionVM;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new AnonymousClass880(this.LJLILLLLZI, interfaceC67352kd);
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
            final C79883Bo LIZ = PlaylistCollectionStateAgent.LJIIZILJ().LIZ();
            InterfaceC65462ha<AnonymousClass883<Boolean>> interfaceC65462ha = new InterfaceC65462ha<AnonymousClass883<Boolean>>() { // from class: X.881
                @Override // X.InterfaceC65462ha
                public final Object collect(InterfaceC64672gJ<? super AnonymousClass883<Boolean>> interfaceC64672gJ, InterfaceC67352kd interfaceC67352kd) {
                    Object collect = InterfaceC65462ha.this.collect(new IDfS127S0100000_3(interfaceC64672gJ, 1), interfaceC67352kd);
                    if (collect == EnumC58928NAu.COROUTINE_SUSPENDED) {
                        return collect;
                    }
                    return C76800UCe.LIZ;
                }
            };
            IDfS127S0100000_3 iDfS127S0100000_3 = new IDfS127S0100000_3(this.LJLILLLLZI, 0);
            this.LJLIL = 1;
            if (interfaceC65462ha.collect(iDfS127S0100000_3, this) == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}

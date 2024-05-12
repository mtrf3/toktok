package X;

import com.ss.android.ugc.aweme.favorites.business.playlist.PlaylistCollectionVM;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.favorites.business.playlist.PlaylistCollectionVM$clickPlaylist$3", f = "PlaylistCollectionVM.kt", l = {106, 106}, m = "invokeSuspend")
/* renamed from: X.887, reason: invalid class name */
/* loaded from: classes4.dex */
public final class AnonymousClass887 extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ PlaylistCollectionVM LJLILLLLZI;
    public final /* synthetic */ String LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnonymousClass887(PlaylistCollectionVM playlistCollectionVM, String str, InterfaceC67352kd<? super AnonymousClass887> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = playlistCollectionVM;
        this.LJLJI = str;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new AnonymousClass887(this.LJLILLLLZI, this.LJLJI, interfaceC67352kd);
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
            C88D c88d = this.LJLILLLLZI.LJLIL.LIZ;
            String str = this.LJLJI;
            this.LJLIL = 1;
            c88d.getClass();
            obj = XGJ.LIZ().LIZ(new C88M(str)).LIZIZ();
            if (obj == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        this.LJLIL = 2;
        if (V1M.LJJJJJL((InterfaceC65462ha) obj, this) == enumC58928NAu) {
            return enumC58928NAu;
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}

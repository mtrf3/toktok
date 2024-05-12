package X;

import com.bytedance.android.live.effect.music.BGMSongListViewModel;
import fjb.a;

@InterfaceC65848Psq(c = "com.bytedance.android.live.effect.music.BGMSongListViewModel$loadMoreFavoriteSongs$2", f = "BGMSongListViewModel.kt", l = {158}, m = "invokeSuspend")
/* renamed from: X.2Af, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C54052Af extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ BGMSongListViewModel LJLILLLLZI;
    public final /* synthetic */ C33541Ti LJLJI;
    public final /* synthetic */ int LJLJJI;
    public final /* synthetic */ long LJLJJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C54052Af(BGMSongListViewModel bGMSongListViewModel, C33541Ti c33541Ti, int i, long j, InterfaceC67352kd<? super C54052Af> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = bGMSongListViewModel;
        this.LJLJI = c33541Ti;
        this.LJLJJI = i;
        this.LJLJJL = j;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C54052Af(this.LJLILLLLZI, this.LJLJI, this.LJLJJI, this.LJLJJL, interfaceC67352kd);
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
            XLL xll = this.LJLILLLLZI.LJLJJI;
            C34141Vq c34141Vq = new C34141Vq(this.LJLJI, this.LJLJJI, this.LJLJJL);
            this.LJLIL = 1;
            if (xll.emit(c34141Vq, this) == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        this.LJLILLLLZI.getClass();
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}

package X;

import com.bytedance.android.live.effect.music.BGMSongListViewModel;
import fjb.a;
import java.util.HashMap;

@InterfaceC65848Psq(c = "com.bytedance.android.live.effect.music.BGMSongListViewModel$loadMoreSongsById$3", f = "BGMSongListViewModel.kt", l = {142}, m = "invokeSuspend")
/* renamed from: X.2Ai, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C54082Ai extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ BGMSongListViewModel LJLILLLLZI;
    public final /* synthetic */ long LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C54082Ai(BGMSongListViewModel bGMSongListViewModel, long j, InterfaceC67352kd<? super C54082Ai> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = bGMSongListViewModel;
        this.LJLJI = j;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C54082Ai(this.LJLILLLLZI, this.LJLJI, interfaceC67352kd);
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
            ((HashMap) this.LJLILLLLZI.LJLJJL).put(new Long(this.LJLJI), Boolean.TRUE);
            XLL xll = this.LJLILLLLZI.LJLJJI;
            C34201Vw c34201Vw = new C34201Vw(this.LJLJI);
            this.LJLIL = 1;
            if (xll.emit(c34201Vw, this) == enumC58928NAu) {
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

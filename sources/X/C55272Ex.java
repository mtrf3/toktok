package X;

import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import fjb.a;
import webcast.data.MusicSong;

@InterfaceC65848Psq(c = "com.bytedance.android.live.effect.music.BGMPlayListAdapter$onBindViewHolder$1$2$1", f = "BGMPlayListAdapter.kt", l = {185}, m = "invokeSuspend")
/* renamed from: X.2Ex, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C55272Ex extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ C33601To LJLILLLLZI;
    public final /* synthetic */ MusicSong LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C55272Ex(C33601To c33601To, MusicSong musicSong, InterfaceC67352kd<? super C55272Ex> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = c33601To;
        this.LJLJI = musicSong;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C55272Ex(this.LJLILLLLZI, this.LJLJI, interfaceC67352kd);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Boolean, O] */
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
            ((C32537Cpp) DataChannelGlobal.LJLJJI.gv0(C54962Ds.class)).LIZ = Boolean.FALSE;
            XK4 xk4 = this.LJLILLLLZI.LJLIL.LJLILLLLZI;
            C33991Vb c33991Vb = new C33991Vb(this.LJLJI);
            this.LJLIL = 1;
            if (xk4.LJIIIZ(c33991Vb, this) == enumC58928NAu) {
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

package X;

import android.content.Context;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import fjb.a;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.actionai.action.microaction.music.MusicApplyAction$execute$downloadResult$1", f = "MusicApplyAction.kt", l = {75}, m = "invokeSuspend")
/* renamed from: X.9g0, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C242849g0 extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C3C5<? extends MusicModel>>, Object> {
    public int LJLIL;
    public final /* synthetic */ C45323HqZ LJLILLLLZI;
    public final /* synthetic */ C68322mC<MusicModel> LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C242849g0(C45323HqZ c45323HqZ, C68322mC<MusicModel> c68322mC, InterfaceC67352kd<? super C242849g0> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = c45323HqZ;
        this.LJLJI = c68322mC;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C242849g0(this.LJLILLLLZI, this.LJLJI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        Object LIZJ;
        EnumC58928NAu enumC58928NAu = EnumC58928NAu.COROUTINE_SUSPENDED;
        int i = this.LJLIL;
        if (i != 0) {
            if (i == 1) {
                C141335gf.LIZJ(obj);
                LIZJ = ((C3C5) obj).m15unboximpl();
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C141335gf.LIZJ(obj);
            C45323HqZ c45323HqZ = this.LJLILLLLZI;
            Context context = c45323HqZ.LJLIL;
            MusicModel musicModel = this.LJLJI.element;
            o.LJIIIIZZ(musicModel, "musicModel");
            this.LJLIL = 1;
            LIZJ = c45323HqZ.LIZJ(context, musicModel, this);
            if (LIZJ == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        return C3C5.m6boximpl(LIZJ);
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C3C5<? extends MusicModel>> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}

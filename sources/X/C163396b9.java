package X;

import android.content.Context;
import com.ss.android.ugc.aweme.component.music.MusicService;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import fjb.a;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.actionai.action.microaction.music.MusicApplyAction$execute$2", f = "MusicApplyAction.kt", l = {70}, m = "invokeSuspend")
/* renamed from: X.6b9, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C163396b9 extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super MusicModel>, Object> {
    public int LJLIL;
    public final /* synthetic */ C45323HqZ LJLILLLLZI;
    public final /* synthetic */ C68322mC<MusicModel> LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C163396b9(C45323HqZ c45323HqZ, C68322mC<MusicModel> c68322mC, InterfaceC67352kd<? super C163396b9> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = c45323HqZ;
        this.LJLJI = c68322mC;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C163396b9(this.LJLILLLLZI, this.LJLJI, interfaceC67352kd);
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
            Context context = this.LJLILLLLZI.LJLIL;
            MusicModel musicModel = this.LJLJI.element;
            o.LJIIIIZZ(musicModel, "musicModel");
            MusicModel musicModel2 = musicModel;
            this.LJLIL = 1;
            final C84654XKg c84654XKg = new C84654XKg(C78555UsJ.LJJII(this));
            if (XU0.LIZ(musicModel2, context, false)) {
                C3C5.m7constructorimpl(musicModel2);
                c84654XKg.resumeWith(musicModel2);
            }
            MusicService.LJJLIIIJJI().LJJJLIIL(context, musicModel2.getMusicId(), false, null, new M5G() { // from class: X.6ZX
                @Override // X.M5G
                public final void onFailed(Exception exc) {
                    String str;
                    InterfaceC67352kd<MusicModel> interfaceC67352kd = c84654XKg;
                    if (exc == null || (str = exc.getMessage()) == null) {
                        str = "Download Music fail";
                    }
                    C3C4 LIZ = C141335gf.LIZ(new RuntimeException(str));
                    C3C5.m7constructorimpl(LIZ);
                    interfaceC67352kd.resumeWith(LIZ);
                }

                @Override // X.M5G
                public final void onSuccess(MusicModel musicModel3, String str) {
                    if (musicModel3 != null) {
                        InterfaceC67352kd<MusicModel> interfaceC67352kd = c84654XKg;
                        C3C5.m7constructorimpl(musicModel3);
                        interfaceC67352kd.resumeWith(musicModel3);
                    } else {
                        InterfaceC67352kd<MusicModel> interfaceC67352kd2 = c84654XKg;
                        C3C4 LIZ = C141335gf.LIZ(new RuntimeException("Download Music fail"));
                        C3C5.m7constructorimpl(LIZ);
                        interfaceC67352kd2.resumeWith(LIZ);
                    }
                }
            });
            obj = c84654XKg.LIZ();
            if (obj == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        return obj;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super MusicModel> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}

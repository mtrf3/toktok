package X;

import com.ss.android.ugc.aweme.services.story.forward.ForwardMedia;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.gamora.editor.lightening.canvas.forward.Forward2StoryEnvironment$downloadSourceMedia$1", f = "Forward2StoryEnvironment.kt", l = {271, 275}, m = "invokeSuspend")
/* loaded from: classes8.dex */
public final class GY7 extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC64672gJ<? super GYE>, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public /* synthetic */ Object LJLILLLLZI;
    public final /* synthetic */ ForwardMedia LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GY7(ForwardMedia forwardMedia, InterfaceC67352kd<? super GY7> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLJI = forwardMedia;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        GY7 gy7 = new GY7(this.LJLJI, interfaceC67352kd);
        gy7.LJLILLLLZI = obj;
        return gy7;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        InterfaceC64672gJ interfaceC64672gJ;
        C44428Hc8 c44428Hc8;
        EnumC58928NAu enumC58928NAu = EnumC58928NAu.COROUTINE_SUSPENDED;
        int i = this.LJLIL;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    C141335gf.LIZJ(obj);
                    c44428Hc8 = GYP.LIZJ;
                    if (c44428Hc8 != null && c44428Hc8.LIZIZ) {
                        c44428Hc8.LJ();
                    }
                    return C76800UCe.LIZ;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            interfaceC64672gJ = (InterfaceC64672gJ) this.LJLILLLLZI;
            C141335gf.LIZJ(obj);
        } else {
            C141335gf.LIZJ(obj);
            interfaceC64672gJ = (InterfaceC64672gJ) this.LJLILLLLZI;
            C44428Hc8 c44428Hc82 = GYP.LJ;
            if (c44428Hc82 != null && !c44428Hc82.LIZIZ) {
                c44428Hc82.LIZLLL();
            }
            GZ6 gz6 = new GZ6();
            GZB gzb = new GZB(this.LJLJI.getVideo(), C41719GYx.LIZ(this.LJLJI.getVideo(), true));
            this.LJLILLLLZI = interfaceC64672gJ;
            this.LJLIL = 1;
            obj = AbstractC41806Gaw.LIZ(gz6, gzb, this);
            if (obj == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        GY8 gy8 = (GY8) obj;
        String str = gy8.LIZ;
        if (str == null || str.length() == 0) {
            Exception exc = gy8.LIZJ;
            if (exc != null) {
                throw exc;
            }
            throw new IllegalStateException("result path is empty");
        }
        GYE gye = new GYE(gy8.LIZ, gy8.LIZIZ, 2);
        this.LJLILLLLZI = null;
        this.LJLIL = 2;
        if (interfaceC64672gJ.emit(gye, this) == enumC58928NAu) {
            return enumC58928NAu;
        }
        c44428Hc8 = GYP.LIZJ;
        if (c44428Hc8 != null) {
            c44428Hc8.LJ();
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC64672gJ<? super GYE> interfaceC64672gJ, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC64672gJ, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}

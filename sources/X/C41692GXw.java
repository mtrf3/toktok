package X;

import com.ss.ugc.effectplatform.model.Effect;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.gamora.editor.lightening.canvas.forward.Forward2StoryEnvironment$downloadCanvasStyle$1", f = "Forward2StoryEnvironment.kt", l = {309, 310}, m = "invokeSuspend")
/* renamed from: X.GXw, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C41692GXw extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC64672gJ<? super C163166am>, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public /* synthetic */ Object LJLILLLLZI;

    public C41692GXw(InterfaceC67352kd<? super C41692GXw> interfaceC67352kd) {
        super(2, interfaceC67352kd);
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        C41692GXw c41692GXw = new C41692GXw(interfaceC67352kd);
        c41692GXw.LJLILLLLZI = obj;
        return c41692GXw;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        InterfaceC64672gJ interfaceC64672gJ;
        String unzipPath;
        C44428Hc8 c44428Hc8;
        EnumC58928NAu enumC58928NAu = EnumC58928NAu.COROUTINE_SUSPENDED;
        int i = this.LJLIL;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    C141335gf.LIZJ(obj);
                    c44428Hc8 = GYP.LJ;
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
            C41690GXu c41690GXu = new C41690GXu();
            C41685GXp c41685GXp = new C41685GXp(true);
            this.LJLILLLLZI = interfaceC64672gJ;
            this.LJLIL = 1;
            obj = AbstractC41806Gaw.LIZ(c41690GXu, c41685GXp, this);
            if (obj == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        C41688GXs c41688GXs = (C41688GXs) obj;
        String str = c41688GXs.LIZ;
        String str2 = "";
        if (str == null) {
            str = "";
        }
        Effect effect = c41688GXs.LIZIZ;
        if (effect != null && (unzipPath = effect.getUnzipPath()) != null) {
            str2 = unzipPath;
        }
        C163166am c163166am = new C163166am(str, str2, C2311295g.LIZ());
        this.LJLILLLLZI = null;
        this.LJLIL = 2;
        if (interfaceC64672gJ.emit(c163166am, this) == enumC58928NAu) {
            return enumC58928NAu;
        }
        c44428Hc8 = GYP.LJ;
        if (c44428Hc8 != null) {
            c44428Hc8.LJ();
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC64672gJ<? super C163166am> interfaceC64672gJ, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC64672gJ, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}

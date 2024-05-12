package X;

import android.graphics.Bitmap;
import com.ss.android.ugc.aweme.canvas.CanvasBackground;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.gamora.editor.lightening.canvas.forward.QuickForwardResolver$resolve$job$1$calculateCanvasBgTask$1", f = "QuickForwardResolver.kt", l = {147, 147}, m = "invokeSuspend")
/* renamed from: X.GXk, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C41680GXk extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super CanvasBackground>, Object> {
    public C41695GXz LJLIL;
    public int LJLILLLLZI;
    public final /* synthetic */ InterfaceC68342mE<Bitmap> LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C41680GXk(InterfaceC68342mE<Bitmap> interfaceC68342mE, InterfaceC67352kd<? super C41680GXk> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLJI = interfaceC68342mE;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C41680GXk(this.LJLJI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C41695GXz c41695GXz;
        EnumC58928NAu enumC58928NAu = EnumC58928NAu.COROUTINE_SUSPENDED;
        int i = this.LJLILLLLZI;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    C141335gf.LIZJ(obj);
                    return obj;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c41695GXz = this.LJLIL;
            C141335gf.LIZJ(obj);
        } else {
            C141335gf.LIZJ(obj);
            c41695GXz = new C41695GXz();
            InterfaceC68342mE<Bitmap> interfaceC68342mE = this.LJLJI;
            this.LJLIL = c41695GXz;
            this.LJLILLLLZI = 1;
            obj = interfaceC68342mE.LJI(this);
            if (obj == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        this.LJLIL = null;
        this.LJLILLLLZI = 2;
        c41695GXz.getClass();
        obj = AbstractC41806Gaw.LIZ(c41695GXz, obj, this);
        if (obj != enumC58928NAu) {
            return obj;
        }
        return enumC58928NAu;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super CanvasBackground> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}

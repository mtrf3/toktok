package X;

import android.graphics.Bitmap;
import com.ss.android.ugc.aweme.canvas.CanvasBackground;
import com.ss.android.ugc.aweme.creative.CreativeInfo;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.gamora.editor.lightening.canvas.forward.QuickForwardResolver$resolve$job$1$generateForwardCoverTask$1", f = "QuickForwardResolver.kt", l = {165, 166}, m = "invokeSuspend")
/* renamed from: X.GXl, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C41681GXl extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C41679GXj>, Object> {
    public Object LJLIL;
    public int LJLILLLLZI;
    public final /* synthetic */ CreativeInfo LJLJI;
    public final /* synthetic */ InterfaceC68342mE<Bitmap> LJLJJI;
    public final /* synthetic */ CanvasBackground LJLJJL;
    public final /* synthetic */ GZX LJLJJLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C41681GXl(CreativeInfo creativeInfo, InterfaceC68342mE<Bitmap> interfaceC68342mE, CanvasBackground canvasBackground, GZX gzx, InterfaceC67352kd<? super C41681GXl> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLJI = creativeInfo;
        this.LJLJJI = interfaceC68342mE;
        this.LJLJJL = canvasBackground;
        this.LJLJJLL = gzx;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C41681GXl(this.LJLJI, this.LJLJJI, this.LJLJJL, this.LJLJJLL, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        String LIZLLL;
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
            LIZLLL = (String) this.LJLIL;
            C141335gf.LIZJ(obj);
        } else {
            C141335gf.LIZJ(obj);
            LIZLLL = C43073GvN.LIZLLL(C60903NvH.LJIIJJI().LJJIJL().getPathService(), this.LJLJI, EnumC43649HBd.COVER, C43077GvR.LIZ("_cover.png"), false, 8);
            InterfaceC68342mE<Bitmap> interfaceC68342mE = this.LJLJJI;
            this.LJLIL = LIZLLL;
            this.LJLILLLLZI = 1;
            obj = interfaceC68342mE.LJI(this);
            if (obj == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        C42189Gh7 c42189Gh7 = new C42189Gh7();
        C41682GXm c41682GXm = new C41682GXm(LIZLLL, this.LJLJJL, (Bitmap) obj, this.LJLJJLL);
        this.LJLIL = null;
        this.LJLILLLLZI = 2;
        obj = AbstractC41806Gaw.LIZ(c42189Gh7, c41682GXm, this);
        if (obj != enumC58928NAu) {
            return obj;
        }
        return enumC58928NAu;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C41679GXj> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}

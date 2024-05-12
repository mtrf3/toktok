package X;

import com.ss.android.ugc.effectmanager.effect.model.Effect;
import fjb.a;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "com.bytedance.ugc.effectcreator.main.draftupdate.DraftUpdater$updateDraftResources$updateFlow$5", f = "DraftUpdater.kt", l = {79}, m = "invokeSuspend")
/* renamed from: X.apH, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class C94951apH extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC64672gJ<? super List<Effect>>, InterfaceC67352kd<? super C76800UCe>, Object> {
    public /* synthetic */ Object LJLIL;
    public int LJLILLLLZI;

    public C94951apH(InterfaceC67352kd interfaceC67352kd) {
        super(2, interfaceC67352kd);
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> completion) {
        o.LJIIIZ(completion, "completion");
        C94951apH c94951apH = new C94951apH(completion);
        c94951apH.LJLIL = obj;
        return c94951apH;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC64672gJ<? super List<Effect>> interfaceC64672gJ, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC64672gJ, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        EnumC58928NAu enumC58928NAu = EnumC58928NAu.COROUTINE_SUSPENDED;
        int i = this.LJLILLLLZI;
        if (i != 0) {
            if (i == 1) {
                C141335gf.LIZJ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C141335gf.LIZJ(obj);
            InterfaceC64672gJ interfaceC64672gJ = (InterfaceC64672gJ) this.LJLIL;
            ArrayList arrayList = new ArrayList();
            this.LJLILLLLZI = 1;
            if (interfaceC64672gJ.emit(arrayList, this) == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        return C76800UCe.LIZ;
    }
}

package X;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.RepeatOnLifecycleKt;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.actionbar.ui.ActionBarComponent;
import fjb.a;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.im.sdk.chat.feature.actionbar.ui.ActionBarComponent$initViewModel$3", f = "ActionBarComponent.kt", l = {188}, m = "invokeSuspend")
/* renamed from: X.4Ef, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C106054Ef extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ ActionBarComponent LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C106054Ef(ActionBarComponent actionBarComponent, InterfaceC67352kd<? super C106054Ef> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = actionBarComponent;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C106054Ef(this.LJLILLLLZI, interfaceC67352kd);
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
            Lifecycle lifecycle = this.LJLILLLLZI.LJLIL.getLifecycle();
            o.LJIIIIZZ(lifecycle, "fragment.lifecycle");
            Lifecycle.State state = Lifecycle.State.RESUMED;
            C106064Eg c106064Eg = new C106064Eg(this.LJLILLLLZI, null);
            this.LJLIL = 1;
            if (RepeatOnLifecycleKt.repeatOnLifecycle(lifecycle, state, c106064Eg, this) == enumC58928NAu) {
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

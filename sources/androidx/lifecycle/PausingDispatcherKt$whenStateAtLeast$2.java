package androidx.lifecycle;

import X.AbstractC65782Prm;
import X.C141335gf;
import X.C76800UCe;
import X.EnumC58928NAu;
import X.InterfaceC65848Psq;
import X.InterfaceC67352kd;
import X.InterfaceC70422pa;
import X.InterfaceC79150V4o;
import X.InterfaceC88471Ynr;
import X.XKX;
import androidx.lifecycle.Lifecycle;
import fjb.a;

/* JADX INFO: Add missing generic type declarations: [T] */
@InterfaceC65848Psq(c = "androidx.lifecycle.PausingDispatcherKt$whenStateAtLeast$2", f = "PausingDispatcher.kt", l = {162}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class PausingDispatcherKt$whenStateAtLeast$2<T> extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super T>, Object> {
    public final /* synthetic */ InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super T>, Object> $block;
    public final /* synthetic */ Lifecycle.State $minState;
    public final /* synthetic */ Lifecycle $this_whenStateAtLeast;
    public /* synthetic */ Object L$0;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public PausingDispatcherKt$whenStateAtLeast$2(Lifecycle lifecycle, Lifecycle.State state, InterfaceC88471Ynr<? super InterfaceC70422pa, ? super InterfaceC67352kd<? super T>, ? extends Object> interfaceC88471Ynr, InterfaceC67352kd<? super PausingDispatcherKt$whenStateAtLeast$2> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.$this_whenStateAtLeast = lifecycle;
        this.$minState = state;
        this.$block = interfaceC88471Ynr;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        PausingDispatcherKt$whenStateAtLeast$2 pausingDispatcherKt$whenStateAtLeast$2 = new PausingDispatcherKt$whenStateAtLeast$2(this.$this_whenStateAtLeast, this.$minState, this.$block, interfaceC67352kd);
        pausingDispatcherKt$whenStateAtLeast$2.L$0 = obj;
        return pausingDispatcherKt$whenStateAtLeast$2;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super T> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        LifecycleController lifecycleController;
        EnumC58928NAu enumC58928NAu = EnumC58928NAu.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i != 0) {
            if (i == 1) {
                lifecycleController = (LifecycleController) this.L$0;
                try {
                    C141335gf.LIZJ(obj);
                } catch (Throwable th) {
                    th = th;
                    lifecycleController.finish();
                    throw th;
                }
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C141335gf.LIZJ(obj);
            InterfaceC79150V4o interfaceC79150V4o = (InterfaceC79150V4o) ((InterfaceC70422pa) this.L$0).getCoroutineContext().get(InterfaceC79150V4o.LJJJJJ);
            if (interfaceC79150V4o != null) {
                PausingDispatcher pausingDispatcher = new PausingDispatcher();
                lifecycleController = new LifecycleController(this.$this_whenStateAtLeast, this.$minState, pausingDispatcher.dispatchQueue, interfaceC79150V4o);
                try {
                    InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super T>, Object> interfaceC88471Ynr = this.$block;
                    this.L$0 = lifecycleController;
                    this.label = 1;
                    obj = XKX.LJI(pausingDispatcher, interfaceC88471Ynr, this);
                    if (obj == enumC58928NAu) {
                        return enumC58928NAu;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    lifecycleController.finish();
                    throw th;
                }
            } else {
                "when[State] methods should have a parent job".toString();
                throw new IllegalStateException("when[State] methods should have a parent job");
            }
        }
        lifecycleController.finish();
        return obj;
    }
}

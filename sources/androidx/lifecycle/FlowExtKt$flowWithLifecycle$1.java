package androidx.lifecycle;

import X.AbstractC65782Prm;
import X.C141335gf;
import X.C3CK;
import X.C3T4;
import X.C76800UCe;
import X.EnumC58928NAu;
import X.InterfaceC64672gJ;
import X.InterfaceC65462ha;
import X.InterfaceC65848Psq;
import X.InterfaceC67352kd;
import X.InterfaceC70422pa;
import X.InterfaceC88471Ynr;
import androidx.lifecycle.Lifecycle;
import fjb.a;

/* JADX INFO: Add missing generic type declarations: [T] */
@InterfaceC65848Psq(c = "androidx.lifecycle.FlowExtKt$flowWithLifecycle$1", f = "FlowExt.kt", l = {91}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class FlowExtKt$flowWithLifecycle$1<T> extends AbstractC65782Prm implements InterfaceC88471Ynr<C3CK<? super T>, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ Lifecycle $lifecycle;
    public final /* synthetic */ Lifecycle.State $minActiveState;
    public final /* synthetic */ InterfaceC65462ha<T> $this_flowWithLifecycle;
    public /* synthetic */ Object L$0;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public FlowExtKt$flowWithLifecycle$1(Lifecycle lifecycle, Lifecycle.State state, InterfaceC65462ha<? extends T> interfaceC65462ha, InterfaceC67352kd<? super FlowExtKt$flowWithLifecycle$1> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.$lifecycle = lifecycle;
        this.$minActiveState = state;
        this.$this_flowWithLifecycle = interfaceC65462ha;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        FlowExtKt$flowWithLifecycle$1 flowExtKt$flowWithLifecycle$1 = new FlowExtKt$flowWithLifecycle$1(this.$lifecycle, this.$minActiveState, this.$this_flowWithLifecycle, interfaceC67352kd);
        flowExtKt$flowWithLifecycle$1.L$0 = obj;
        return flowExtKt$flowWithLifecycle$1;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(C3CK<? super T> c3ck, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(c3ck, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }

    @InterfaceC65848Psq(c = "androidx.lifecycle.FlowExtKt$flowWithLifecycle$1$1", f = "FlowExt.kt", l = {92}, m = "invokeSuspend")
    /* renamed from: androidx.lifecycle.FlowExtKt$flowWithLifecycle$1$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public final class AnonymousClass1 extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
        public final /* synthetic */ C3CK<T> $$this$callbackFlow;
        public final /* synthetic */ InterfaceC65462ha<T> $this_flowWithLifecycle;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass1(InterfaceC65462ha<? extends T> interfaceC65462ha, C3CK<? super T> c3ck, InterfaceC67352kd<? super AnonymousClass1> interfaceC67352kd) {
            super(2, interfaceC67352kd);
            this.$this_flowWithLifecycle = interfaceC65462ha;
            this.$$this$callbackFlow = c3ck;
        }

        @Override // fjb.a
        public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
            return new AnonymousClass1(this.$this_flowWithLifecycle, this.$$this$callbackFlow, interfaceC67352kd);
        }

        @Override // X.InterfaceC88471Ynr
        public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
            return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
        }

        @Override // fjb.a
        public final Object invokeSuspend(Object obj) {
            EnumC58928NAu enumC58928NAu = EnumC58928NAu.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i != 0) {
                if (i == 1) {
                    C141335gf.LIZJ(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                C141335gf.LIZJ(obj);
                InterfaceC65462ha<T> interfaceC65462ha = this.$this_flowWithLifecycle;
                final C3CK<T> c3ck = this.$$this$callbackFlow;
                InterfaceC64672gJ<? super T> interfaceC64672gJ = new InterfaceC64672gJ() { // from class: androidx.lifecycle.FlowExtKt.flowWithLifecycle.1.1.1
                    @Override // X.InterfaceC64672gJ
                    public final Object emit(T t, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
                        Object LJIIIZ = c3ck.LJIIIZ(t, interfaceC67352kd);
                        if (LJIIIZ == EnumC58928NAu.COROUTINE_SUSPENDED) {
                            return LJIIIZ;
                        }
                        return C76800UCe.LIZ;
                    }
                };
                this.label = 1;
                if (interfaceC65462ha.collect(interfaceC64672gJ, this) == enumC58928NAu) {
                    return enumC58928NAu;
                }
            }
            return C76800UCe.LIZ;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v4, types: [X.3T4] */
    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C3CK c3ck;
        EnumC58928NAu enumC58928NAu = EnumC58928NAu.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i != 0) {
            if (i == 1) {
                ?? r4 = (C3T4) this.L$0;
                C141335gf.LIZJ(obj);
                c3ck = r4;
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C141335gf.LIZJ(obj);
            C3CK c3ck2 = (C3CK) this.L$0;
            Lifecycle lifecycle = this.$lifecycle;
            Lifecycle.State state = this.$minActiveState;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$this_flowWithLifecycle, c3ck2, null);
            this.L$0 = c3ck2;
            this.label = 1;
            c3ck = c3ck2;
            if (RepeatOnLifecycleKt.repeatOnLifecycle(lifecycle, state, anonymousClass1, this) == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        c3ck.LJJIFFI(null);
        return C76800UCe.LIZ;
    }
}

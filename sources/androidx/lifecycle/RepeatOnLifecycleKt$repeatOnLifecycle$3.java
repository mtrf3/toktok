package androidx.lifecycle;

import X.AbstractC65782Prm;
import X.AbstractC78621UtN;
import X.C141335gf;
import X.C36636EZk;
import X.C76800UCe;
import X.EnumC58928NAu;
import X.InterfaceC65848Psq;
import X.InterfaceC67352kd;
import X.InterfaceC70422pa;
import X.InterfaceC88471Ynr;
import X.XKX;
import androidx.lifecycle.Lifecycle;
import fjb.a;

@InterfaceC65848Psq(c = "androidx.lifecycle.RepeatOnLifecycleKt$repeatOnLifecycle$3", f = "RepeatOnLifecycle.kt", l = {84}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class RepeatOnLifecycleKt$repeatOnLifecycle$3 extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> $block;
    public final /* synthetic */ Lifecycle.State $state;
    public final /* synthetic */ Lifecycle $this_repeatOnLifecycle;
    public /* synthetic */ Object L$0;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public RepeatOnLifecycleKt$repeatOnLifecycle$3(Lifecycle lifecycle, Lifecycle.State state, InterfaceC88471Ynr<? super InterfaceC70422pa, ? super InterfaceC67352kd<? super C76800UCe>, ? extends Object> interfaceC88471Ynr, InterfaceC67352kd<? super RepeatOnLifecycleKt$repeatOnLifecycle$3> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.$this_repeatOnLifecycle = lifecycle;
        this.$state = state;
        this.$block = interfaceC88471Ynr;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        RepeatOnLifecycleKt$repeatOnLifecycle$3 repeatOnLifecycleKt$repeatOnLifecycle$3 = new RepeatOnLifecycleKt$repeatOnLifecycle$3(this.$this_repeatOnLifecycle, this.$state, this.$block, interfaceC67352kd);
        repeatOnLifecycleKt$repeatOnLifecycle$3.L$0 = obj;
        return repeatOnLifecycleKt$repeatOnLifecycle$3;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }

    @InterfaceC65848Psq(c = "androidx.lifecycle.RepeatOnLifecycleKt$repeatOnLifecycle$3$1", f = "RepeatOnLifecycle.kt", l = {166}, m = "invokeSuspend")
    /* renamed from: androidx.lifecycle.RepeatOnLifecycleKt$repeatOnLifecycle$3$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public final class AnonymousClass1 extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
        public final /* synthetic */ InterfaceC70422pa $$this$coroutineScope;
        public final /* synthetic */ InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> $block;
        public final /* synthetic */ Lifecycle.State $state;
        public final /* synthetic */ Lifecycle $this_repeatOnLifecycle;
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public Object L$3;
        public Object L$4;
        public Object L$5;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass1(Lifecycle lifecycle, Lifecycle.State state, InterfaceC70422pa interfaceC70422pa, InterfaceC88471Ynr<? super InterfaceC70422pa, ? super InterfaceC67352kd<? super C76800UCe>, ? extends Object> interfaceC88471Ynr, InterfaceC67352kd<? super AnonymousClass1> interfaceC67352kd) {
            super(2, interfaceC67352kd);
            this.$this_repeatOnLifecycle = lifecycle;
            this.$state = state;
            this.$$this$coroutineScope = interfaceC70422pa;
            this.$block = interfaceC88471Ynr;
        }

        @Override // fjb.a
        public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
            return new AnonymousClass1(this.$this_repeatOnLifecycle, this.$state, this.$$this$coroutineScope, this.$block, interfaceC67352kd);
        }

        @Override // X.InterfaceC88471Ynr
        public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
            return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:20:0x0098  */
        /* JADX WARN: Removed duplicated region for block: B:23:0x00a1  */
        /* JADX WARN: Type inference failed for: r6v1, types: [androidx.lifecycle.RepeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1, T, androidx.lifecycle.LifecycleObserver] */
        @Override // fjb.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r15) {
            /*
                r14 = this;
                X.NAu r5 = X.EnumC58928NAu.COROUTINE_SUSPENDED
                int r0 = r14.label
                r3 = 0
                r6 = 1
                if (r0 == 0) goto L20
                if (r0 != r6) goto L18
                java.lang.Object r2 = r14.L$1
                X.2mC r2 = (X.C68322mC) r2
                java.lang.Object r8 = r14.L$0
                X.2mC r8 = (X.C68322mC) r8
                X.C141335gf.LIZJ(r15)     // Catch: java.lang.Throwable -> L16
                goto L79
            L16:
                r4 = move-exception
                goto L92
            L18:
                java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r1.<init>(r0)
                throw r1
            L20:
                X.C141335gf.LIZJ(r15)
                androidx.lifecycle.Lifecycle r0 = r14.$this_repeatOnLifecycle
                androidx.lifecycle.Lifecycle$State r1 = r0.getCurrentState()
                androidx.lifecycle.Lifecycle$State r0 = androidx.lifecycle.Lifecycle.State.DESTROYED
                if (r1 != r0) goto L30
                X.UCe r0 = X.C76800UCe.LIZ
                return r0
            L30:
                X.2mC r8 = new X.2mC
                r8.<init>()
                X.2mC r2 = new X.2mC
                r2.<init>()
                androidx.lifecycle.Lifecycle$State r4 = r14.$state     // Catch: java.lang.Throwable -> L91
                androidx.lifecycle.Lifecycle r1 = r14.$this_repeatOnLifecycle     // Catch: java.lang.Throwable -> L91
                X.2pa r9 = r14.$$this$coroutineScope     // Catch: java.lang.Throwable -> L91
                X.Ynr<X.2pa, X.2kd<? super X.UCe>, java.lang.Object> r13 = r14.$block     // Catch: java.lang.Throwable -> L91
                r14.L$0 = r8     // Catch: java.lang.Throwable -> L91
                r14.L$1 = r2     // Catch: java.lang.Throwable -> L91
                r14.L$2 = r4     // Catch: java.lang.Throwable -> L91
                r14.L$3 = r1     // Catch: java.lang.Throwable -> L91
                r14.L$4 = r9     // Catch: java.lang.Throwable -> L91
                r14.L$5 = r13     // Catch: java.lang.Throwable -> L91
                r14.label = r6     // Catch: java.lang.Throwable -> L91
                X.XKS r11 = new X.XKS     // Catch: java.lang.Throwable -> L91
                X.2kd r0 = X.C78555UsJ.LJJII(r14)     // Catch: java.lang.Throwable -> L91
                r11.<init>(r6, r0)     // Catch: java.lang.Throwable -> L91
                r11.LJIIL()     // Catch: java.lang.Throwable -> L91
                androidx.lifecycle.Lifecycle$Event r7 = androidx.lifecycle.Lifecycle.Event.upTo(r4)     // Catch: java.lang.Throwable -> L91
                androidx.lifecycle.Lifecycle$Event r10 = androidx.lifecycle.Lifecycle.Event.downFrom(r4)     // Catch: java.lang.Throwable -> L91
                X.XJO r12 = X.XJR.LIZ()     // Catch: java.lang.Throwable -> L91
                androidx.lifecycle.RepeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1 r6 = new androidx.lifecycle.RepeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1     // Catch: java.lang.Throwable -> L91
                r6.<init>()     // Catch: java.lang.Throwable -> L91
                r2.element = r6     // Catch: java.lang.Throwable -> L91
                r1.addObserver(r6)     // Catch: java.lang.Throwable -> L91
                java.lang.Object r0 = r11.LJIIJJI()     // Catch: java.lang.Throwable -> L91
                if (r0 != r5) goto L79
                goto L90
            L79:
                T r0 = r8.element
                X.V4o r0 = (X.InterfaceC79150V4o) r0
                if (r0 == 0) goto L82
                r0.LIZIZ(r3)
            L82:
                T r1 = r2.element
                androidx.lifecycle.LifecycleObserver r1 = (androidx.lifecycle.LifecycleObserver) r1
                if (r1 == 0) goto L8d
                androidx.lifecycle.Lifecycle r0 = r14.$this_repeatOnLifecycle
                r0.removeObserver(r1)
            L8d:
                X.UCe r0 = X.C76800UCe.LIZ
                return r0
            L90:
                return r5
            L91:
                r4 = move-exception
            L92:
                T r0 = r8.element
                X.V4o r0 = (X.InterfaceC79150V4o) r0
                if (r0 == 0) goto L9b
                r0.LIZIZ(r3)
            L9b:
                T r1 = r2.element
                androidx.lifecycle.LifecycleObserver r1 = (androidx.lifecycle.LifecycleObserver) r1
                if (r1 == 0) goto La6
                androidx.lifecycle.Lifecycle r0 = r14.$this_repeatOnLifecycle
                r0.removeObserver(r1)
            La6:
                throw r4
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.lifecycle.RepeatOnLifecycleKt$repeatOnLifecycle$3.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
        }
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
            InterfaceC70422pa interfaceC70422pa = (InterfaceC70422pa) this.L$0;
            AbstractC78621UtN LJJIJIL = C36636EZk.LIZ.LJJIJIL();
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$this_repeatOnLifecycle, this.$state, interfaceC70422pa, this.$block, null);
            this.label = 1;
            if (XKX.LJI(LJJIJIL, anonymousClass1, this) == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        return C76800UCe.LIZ;
    }
}

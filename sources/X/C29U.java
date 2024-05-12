package X;

import android.view.View;
import androidx.compose.ui.platform.WindowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2;
import androidx.lifecycle.LifecycleOwner;
import fjb.a;

@InterfaceC65848Psq(c = "androidx.compose.ui.platform.WindowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2$onStateChanged$1", f = "WindowRecomposer.android.kt", l = {513}, m = "invokeSuspend")
/* renamed from: X.29U, reason: invalid class name */
/* loaded from: classes.dex */
public final class C29U extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public /* synthetic */ Object LJLILLLLZI;
    public final /* synthetic */ C68322mC<C45351qF> LJLJI;
    public final /* synthetic */ C36001bA LJLJJI;
    public final /* synthetic */ LifecycleOwner LJLJJL;
    public final /* synthetic */ WindowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2 LJLJJLL;
    public final /* synthetic */ View LJLJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C29U(C68322mC<C45351qF> c68322mC, C36001bA c36001bA, LifecycleOwner lifecycleOwner, WindowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2 windowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2, View view, InterfaceC67352kd<? super C29U> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLJI = c68322mC;
        this.LJLJJI = c36001bA;
        this.LJLJJL = lifecycleOwner;
        this.LJLJJLL = windowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2;
        this.LJLJL = view;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        C29U c29u = new C29U(this.LJLJI, this.LJLJJI, this.LJLJJL, this.LJLJJLL, this.LJLJL, interfaceC67352kd);
        c29u.LJLILLLLZI = obj;
        return c29u;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x00bc  */
    @Override // fjb.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            X.NAu r6 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r0 = r8.LJLIL
            r3 = 1
            r5 = 0
            if (r0 == 0) goto L1e
            if (r0 != r3) goto L16
            java.lang.Object r7 = r8.LJLILLLLZI
            X.V4o r7 = (X.InterfaceC79150V4o) r7
            X.C141335gf.LIZJ(r9)     // Catch: java.lang.Throwable -> L13
            goto L98
        L13:
            r2 = move-exception
            goto Lba
        L16:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L1e:
            X.C141335gf.LIZJ(r9)
            java.lang.Object r4 = r8.LJLILLLLZI
            X.2pa r4 = (X.InterfaceC70422pa) r4
            X.2mC<X.1qF> r0 = r8.LJLJI     // Catch: java.lang.Throwable -> Lb6
            T r7 = r0.element     // Catch: java.lang.Throwable -> Lb6
            X.1qF r7 = (X.C45351qF) r7     // Catch: java.lang.Throwable -> Lb6
            if (r7 == 0) goto L5e
            android.view.View r0 = r8.LJLJL     // Catch: java.lang.Throwable -> Lb6
            android.content.Context r0 = r0.getContext()     // Catch: java.lang.Throwable -> Lb6
            android.content.Context r1 = X.C16880lQ.LLLLL(r0)     // Catch: java.lang.Throwable -> Lb6
            java.lang.String r0 = "context.applicationContext"
            kotlin.jvm.internal.o.LJIIIIZZ(r1, r0)     // Catch: java.lang.Throwable -> Lb6
            X.2rk r2 = X.C05M.LIZ(r1)     // Catch: java.lang.Throwable -> Lb6
            java.lang.Object r0 = r2.getValue()     // Catch: java.lang.Throwable -> Lb6
            java.lang.Number r0 = (java.lang.Number) r0     // Catch: java.lang.Throwable -> Lb6
            float r0 = r0.floatValue()     // Catch: java.lang.Throwable -> Lb6
            androidx.compose.runtime.ParcelableSnapshotMutableState r1 = r7.LJLIL     // Catch: java.lang.Throwable -> Lb6
            java.lang.Float r0 = java.lang.Float.valueOf(r0)     // Catch: java.lang.Throwable -> Lb6
            r1.setValue(r0)     // Catch: java.lang.Throwable -> Lb6
            X.29T r1 = new X.29T     // Catch: java.lang.Throwable -> Lb6
            r1.<init>(r2, r7, r5)     // Catch: java.lang.Throwable -> Lb6
            r0 = 3
            X.XKQ r7 = X.XKX.LIZLLL(r4, r5, r5, r1, r0)     // Catch: java.lang.Throwable -> Lb6
            goto L5f
        L5e:
            r7 = r5
        L5f:
            X.1bA r4 = r8.LJLJJI     // Catch: java.lang.Throwable -> Lb9
            r8.LJLILLLLZI = r7     // Catch: java.lang.Throwable -> Lb9
            r8.LJLIL = r3     // Catch: java.lang.Throwable -> Lb9
            r4.getClass()     // Catch: java.lang.Throwable -> Lb9
            X.2GY r3 = new X.2GY     // Catch: java.lang.Throwable -> Lb9
            r3.<init>(r4, r5)     // Catch: java.lang.Throwable -> Lb9
            X.MBA r1 = r8.getContext()     // Catch: java.lang.Throwable -> Lb9
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.o.LJIIIZ(r1, r0)     // Catch: java.lang.Throwable -> Lb9
            X.1bG r0 = X.InterfaceC44041o8.LJJLIL     // Catch: java.lang.Throwable -> Lb9
            X.MBD r2 = r1.get(r0)     // Catch: java.lang.Throwable -> Lb9
            X.1o8 r2 = (X.InterfaceC44041o8) r2     // Catch: java.lang.Throwable -> Lb9
            if (r2 == 0) goto Lab
            X.26Y r1 = r4.LIZ     // Catch: java.lang.Throwable -> Lb9
            X.2GX r0 = new X.2GX     // Catch: java.lang.Throwable -> Lb9
            r0.<init>(r4, r3, r2, r5)     // Catch: java.lang.Throwable -> Lb9
            java.lang.Object r0 = X.XKX.LJI(r1, r0, r8)     // Catch: java.lang.Throwable -> Lb9
            if (r0 != r6) goto L8e
            goto L90
        L8e:
            X.UCe r0 = X.C76800UCe.LIZ     // Catch: java.lang.Throwable -> Lb9
        L90:
            if (r0 != r6) goto L95
        L92:
            if (r0 != r6) goto L98
            return r6
        L95:
            X.UCe r0 = X.C76800UCe.LIZ     // Catch: java.lang.Throwable -> Lb9
            goto L92
        L98:
            if (r7 == 0) goto L9d
            r7.LIZIZ(r5)
        L9d:
            androidx.lifecycle.LifecycleOwner r0 = r8.LJLJJL
            androidx.lifecycle.Lifecycle r1 = r0.getLifecycle()
            androidx.compose.ui.platform.WindowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2 r0 = r8.LJLJJLL
            r1.removeObserver(r0)
            X.UCe r0 = X.C76800UCe.LIZ
            return r0
        Lab:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> Lb9
            java.lang.String r0 = "A MonotonicFrameClock is not available in this CoroutineContext. Callers should supply an appropriate MonotonicFrameClock using withContext."
            r0.toString()     // Catch: java.lang.Throwable -> Lb9
            r1.<init>(r0)     // Catch: java.lang.Throwable -> Lb9
            throw r1     // Catch: java.lang.Throwable -> Lb9
        Lb6:
            r2 = move-exception
            r7 = r5
            goto Lba
        Lb9:
            r2 = move-exception
        Lba:
            if (r7 == 0) goto Lbf
            r7.LIZIZ(r5)
        Lbf:
            androidx.lifecycle.LifecycleOwner r0 = r8.LJLJJL
            androidx.lifecycle.Lifecycle r1 = r0.getLifecycle()
            androidx.compose.ui.platform.WindowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2 r0 = r8.LJLJJLL
            r1.removeObserver(r0)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C29U.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}

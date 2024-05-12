package X;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import fjb.a;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.screenshot.ScreenShotMonitor$addNewLifeCycleCallbacks$1", f = "ScreenShotMonitor.kt", l = {61}, m = "invokeSuspend")
/* renamed from: X.2xm, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C75502xm extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ C62635Oi7 LJLILLLLZI;
    public final /* synthetic */ Context LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C75502xm(C62635Oi7 c62635Oi7, Context context, InterfaceC67352kd<? super C75502xm> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = c62635Oi7;
        this.LJLJI = context;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C75502xm(this.LJLILLLLZI, this.LJLJI, interfaceC67352kd);
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
            Activity LJIIIIZZ = C84763XOl.LJIIIIZZ();
            C62635Oi7 c62635Oi7 = this.LJLILLLLZI;
            WeakReference weakReference = new WeakReference(LJIIIIZZ);
            this.LJLIL = 1;
            c62635Oi7.getClass();
            if (XKX.LJI(C78613UtF.LIZJ, new C62637Oi9(weakReference, c62635Oi7, null), this) == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        Context context = this.LJLJI;
        if (context == null || !(context instanceof Application)) {
            context = EF7.LIZIZ();
        }
        final C62635Oi7 c62635Oi72 = this.LJLILLLLZI;
        ((Application) context).registerActivityLifecycleCallbacks(new Application.ActivityLifecycleCallbacks() { // from class: X.2xk
            @Override // android.app.Application.ActivityLifecycleCallbacks
            public final void onActivityCreated(Activity activity, Bundle bundle) {
                o.LJIIIZ(activity, "activity");
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public final void onActivityDestroyed(Activity activity) {
                o.LJIIIZ(activity, "activity");
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public final void onActivitySaveInstanceState(Activity activity, Bundle outState) {
                o.LJIIIZ(activity, "activity");
                o.LJIIIZ(outState, "outState");
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public final void onActivityStarted(Activity activity) {
                o.LJIIIZ(activity, "activity");
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public final void onActivityStopped(Activity activity) {
                o.LJIIIZ(activity, "activity");
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public final void onActivityPaused(Activity activity) {
                o.LJIIIZ(activity, "activity");
                XKX.LIZLLL(C48841JEv.LIZ(C78613UtF.LIZJ), null, null, new C75472xj(C62635Oi7.this, activity, null), 3);
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public final void onActivityResumed(Activity activity) {
                o.LJIIIZ(activity, "activity");
                XKX.LIZLLL(C48841JEv.LIZ(C78613UtF.LIZJ), null, null, new C75492xl(C62635Oi7.this, activity, null), 3);
            }
        });
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}

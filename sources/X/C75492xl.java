package X;

import android.app.Activity;
import fjb.a;
import java.lang.ref.WeakReference;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.screenshot.ScreenShotMonitor$addNewLifeCycleCallbacks$1$1$1$onActivityResumed$1", f = "ScreenShotMonitor.kt", l = {67}, m = "invokeSuspend")
/* renamed from: X.2xl, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C75492xl extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ C62635Oi7 LJLILLLLZI;
    public final /* synthetic */ Activity LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C75492xl(C62635Oi7 c62635Oi7, Activity activity, InterfaceC67352kd<? super C75492xl> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = c62635Oi7;
        this.LJLJI = activity;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C75492xl(this.LJLILLLLZI, this.LJLJI, interfaceC67352kd);
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
            C62635Oi7 c62635Oi7 = this.LJLILLLLZI;
            WeakReference weakReference = new WeakReference(this.LJLJI);
            this.LJLIL = 1;
            c62635Oi7.getClass();
            if (XKX.LJI(C78613UtF.LIZJ, new C62637Oi9(weakReference, c62635Oi7, null), this) == enumC58928NAu) {
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
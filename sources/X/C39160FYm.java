package X;

import android.app.Activity;
import com.bytedance.crash.CrashType;
import com.bytedance.crash.Npth;
import com.ss.android.ugc.aweme.utils.ActivityStack;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.checkpoint.CheckPointExitInfoHelper$getExitInfoAndResetRepo$1", f = "CheckPointExitService.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.FYm, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39160FYm extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public C39160FYm(InterfaceC67352kd<? super C39160FYm> interfaceC67352kd) {
        super(2, interfaceC67352kd);
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C39160FYm(interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        C39163FYp.LJFF().clear();
        Npth.registerCrashCallback(C39159FYl.LJLIL, CrashType.ALL);
        C84763XOl.LJI().LJJJJZI(C39161FYn.LJLIL);
        Activity topActivity = ActivityStack.getTopActivity();
        if (topActivity != null) {
            topActivity.getApplication().registerComponentCallbacks(new ComponentCallbacks2C39162FYo());
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return new C39160FYm(interfaceC67352kd).invokeSuspend(C76800UCe.LIZ);
    }
}

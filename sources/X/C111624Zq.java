package X;

import android.view.accessibility.AccessibilityManager;
import com.google.android.material.snackbar.Snackbar;
import fjb.a;
import java.lang.reflect.Field;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.im.sdk.common.controller.utils.SnackBarUtils$showIMSnackbar$4$1", f = "SnackBarUtils.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.4Zq, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C111624Zq extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ Snackbar LJLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C111624Zq(Snackbar snackbar, InterfaceC67352kd<? super C111624Zq> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = snackbar;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C111624Zq(this.LJLIL, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        boolean LIZJ;
        AccessibilityManager accessibilityManager;
        InterfaceC17700mk interfaceC17700mk;
        C141335gf.LIZJ(obj);
        Snackbar snackbar = this.LJLIL;
        snackbar.getClass();
        C111664Zu LIZIZ = C111664Zu.LIZIZ();
        C80204Vdo c80204Vdo = snackbar.LJIIL;
        synchronized (LIZIZ.LIZ) {
            LIZJ = LIZIZ.LIZJ(c80204Vdo);
        }
        if (LIZJ) {
            this.LJLIL.LIZIZ(3);
        }
        Class<?> cls = Class.forName("com.google.android.material.snackbar.BaseTransientBottomBar$h");
        Field declaredField = cls.getDeclaredField("accessibilityManager");
        declaredField.setAccessible(true);
        Object obj2 = declaredField.get(this.LJLIL.LIZJ);
        if (!(obj2 instanceof AccessibilityManager) || (accessibilityManager = (AccessibilityManager) obj2) == null) {
            return C76800UCe.LIZ;
        }
        Field declaredField2 = cls.getDeclaredField("touchExplorationStateChangeListener");
        declaredField2.setAccessible(true);
        Object obj3 = declaredField2.get(this.LJLIL.LIZJ);
        if (!(obj3 instanceof InterfaceC17700mk) || (interfaceC17700mk = (InterfaceC17700mk) obj3) == null) {
            return C76800UCe.LIZ;
        }
        C17690mj.LIZIZ(accessibilityManager, interfaceC17700mk);
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}

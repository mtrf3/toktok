package X;

import android.app.Activity;
import android.content.Context;
import com.bytedance.assem.arch.core.UIAssem;
import kotlin.jvm.internal.o;

/* renamed from: X.3hN, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C90813hN extends AbstractC65781Prl implements InterfaceC88471Ynr<UIAssem, C43I<? extends Boolean>, C76800UCe> {
    public static final C90813hN LJLIL = new C90813hN();

    public C90813hN() {
        super(2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(UIAssem uIAssem, C43I<? extends Boolean> c43i) {
        Context context;
        Activity LJIJJ;
        UIAssem selectSubscribe = uIAssem;
        C43I<? extends Boolean> c43i2 = c43i;
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        if (c43i2 != null && ((Boolean) c43i2.LIZ).booleanValue() && (context = selectSubscribe.getContext()) != null && (LJIJJ = C45804HyK.LJIJJ(context)) != null) {
            LJIJJ.finish();
        }
        return C76800UCe.LIZ;
    }
}

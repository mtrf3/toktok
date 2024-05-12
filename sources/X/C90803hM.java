package X;

import android.app.Activity;
import android.content.Context;
import com.bytedance.assem.arch.core.UIAssem;
import kotlin.jvm.internal.o;

/* renamed from: X.3hM, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C90803hM extends AbstractC65781Prl implements InterfaceC88471Ynr<UIAssem, C43I<? extends Boolean>, C76800UCe> {
    public static final C90803hM LJLIL = new C90803hM();

    public C90803hM() {
        super(2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(UIAssem uIAssem, C43I<? extends Boolean> c43i) {
        Context context;
        Activity LJIJJ;
        UIAssem selectSubscribe = uIAssem;
        C43I<? extends Boolean> it = c43i;
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        o.LJIIIZ(it, "it");
        if (((Boolean) it.LIZ).booleanValue() && (context = selectSubscribe.getContext()) != null && (LJIJJ = C45804HyK.LJIJJ(context)) != null) {
            LJIJJ.setResult(2097);
            LJIJJ.finish();
        }
        return C76800UCe.LIZ;
    }
}

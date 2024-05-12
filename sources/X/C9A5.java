package X;

import com.bytedance.assem.arch.core.UIAssem;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.9A5, reason: invalid class name */
/* loaded from: classes5.dex */
public final class C9A5 extends AbstractC65781Prl implements InterfaceC88471Ynr<UIAssem, C43I<? extends Boolean>, C76800UCe> {
    public static final C9A5 LJLIL = new C9A5();

    public C9A5() {
        super(2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(UIAssem uIAssem, C43I<? extends Boolean> c43i) {
        int i;
        UIAssem selectSubscribe = uIAssem;
        C43I<? extends Boolean> it = c43i;
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        o.LJIIIZ(it, "it");
        Boolean bool = (Boolean) it.LIZ;
        if (bool != null) {
            if (bool.booleanValue()) {
                i = R.string.ifp;
            } else {
                i = R.string.dtj;
            }
            ActivityC45651qj LIZ = C212428Vi.LIZ(selectSubscribe);
            if (LIZ != null) {
                C40328FsC.LIZLLL(LIZ, i);
            }
        }
        return C76800UCe.LIZ;
    }
}

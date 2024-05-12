package X;

import com.bytedance.assem.arch.core.UIAssem;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class KMJ extends AbstractC65781Prl implements InterfaceC88471Ynr<UIAssem, C43I<? extends EnumC46467ILn>, C76800UCe> {
    public static final KMJ LJLIL = new KMJ();

    public KMJ() {
        super(2);
    }

    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(UIAssem uIAssem, C43I<? extends EnumC46467ILn> c43i) {
        T t;
        UIAssem selectSubscribe = uIAssem;
        C43I<? extends EnumC46467ILn> c43i2 = c43i;
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        if (c43i2 != null && (t = c43i2.LIZ) != 0 && t == EnumC46467ILn.QUIT) {
            ActivityC45651qj LIZ = C212428Vi.LIZ(selectSubscribe);
            if (LIZ != null) {
                LIZ.setResult(-1);
            }
            ActivityC45651qj LIZ2 = C212428Vi.LIZ(selectSubscribe);
            if (LIZ2 != null) {
                LIZ2.finish();
            }
        }
        return C76800UCe.LIZ;
    }
}

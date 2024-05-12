package X;

import androidx.fragment.app.Fragment;
import com.bytedance.assem.arch.core.UIAssem;
import kotlin.jvm.internal.o;

/* renamed from: X.Zwr, reason: case insensitive filesystem */
/* loaded from: classes22.dex */
public final class C91577Zwr extends AbstractC65781Prl implements InterfaceC88471Ynr<UIAssem, Boolean, C76800UCe> {
    public static final C91577Zwr LJLIL = new C91577Zwr();

    public C91577Zwr() {
        super(2);
    }

    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(UIAssem uIAssem, Boolean bool) {
        Fragment LIZLLL;
        UIAssem selectSubscribe = uIAssem;
        boolean booleanValue = bool.booleanValue();
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        if (booleanValue && (LIZLLL = C212428Vi.LIZLLL(selectSubscribe)) != null) {
            ASQ.LJ(LIZLLL, ASX.LIZ);
        }
        return C76800UCe.LIZ;
    }
}

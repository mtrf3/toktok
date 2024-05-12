package X;

import android.content.Intent;
import com.bytedance.assem.arch.core.UIAssem;
import kotlin.jvm.internal.o;

/* renamed from: X.8hb, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C218358hb extends AbstractC65781Prl implements InterfaceC88471Ynr<UIAssem, Y9G, C76800UCe> {
    public static final C218358hb LJLIL = new C218358hb();

    public C218358hb() {
        super(2);
    }

    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(UIAssem uIAssem, Y9G y9g) {
        UIAssem selectSubscribe = uIAssem;
        Y9G it = y9g;
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        o.LJIIIZ(it, "it");
        ActivityC45651qj LIZ = C212428Vi.LIZ(selectSubscribe);
        if (LIZ != null) {
            Intent intent = new Intent();
            intent.putExtra("extra_data", Y9H.LIZJ(it));
            LIZ.setResult(-1, intent);
            LIZ.finish();
        }
        return C76800UCe.LIZ;
    }
}

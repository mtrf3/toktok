package X;

import Y.AfS65S0100000_13;
import Y.IDeS357S0100000_12;
import android.content.Context;
import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.LifecycleOwnerKt;

/* loaded from: classes13.dex */
public final class SQ7 {
    public static final /* synthetic */ int LIZ = 0;

    public static final void LIZ(Context context, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro) {
        C71945SLl.LJ().LIZJ().bindMobile(C45804HyK.LJIJJ(context), "suggest_contacts", C141415gn.LIZ("phone_number_source", 13), new IDeS357S0100000_12(interfaceC65784Pro, 5));
        C66645QDp.LIZ(0, "contact");
    }

    public static final void LIZIZ(Context context, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro) {
        LifecycleCoroutineScope lifecycleScope;
        ActivityC45651qj LJJIFFI = C45804HyK.LJJIFFI(context);
        if (LJJIFFI != null && (lifecycleScope = LifecycleOwnerKt.getLifecycleScope(LJJIFFI)) != null) {
            XKX.LIZLLL(lifecycleScope, null, null, new UPR(context, interfaceC65784Pro, null), 3);
        }
        C66645QDp.LIZ(1, "contact");
    }

    public static final void LIZJ(Context context, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro) {
        T3Q.LIZIZ(context, C77266UUc.LIZIZ.LJIIJJI(), ((RBX) HG3.LJIILL()).getCurUserId(), "syato", "click", true, null).LJJJJZI(new AfS65S0100000_13(interfaceC65784Pro, 130));
        C66645QDp.LIZ(1, "contact");
    }
}

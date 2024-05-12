package X;

import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.JwE, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C50770JwE implements InterfaceC50825Jx7 {
    @Override // X.InterfaceC50825Jx7
    public final void LIZ(SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS sparkView) {
        o.LJIIIZ(sparkView, "sparkView");
        ((ConcurrentHashMap) C50783JwR.LIZ.getValue()).put(Integer.valueOf(sparkView.hashCode()), Boolean.TRUE);
        C2U8.LIZ(new C50774JwI(sparkView, IM2.LYNX_TEMPLATE_LOAD_SUCCESS));
    }
}

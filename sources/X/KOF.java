package X;

import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.LynxExposeHelper;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class KOF implements InterfaceC60730NsU {
    @Override // X.InterfaceC60730NsU
    public final void LIZIZ(SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS sparkView) {
        o.LJIIIZ(sparkView, "sparkView");
    }

    @Override // X.InterfaceC60730NsU
    public final void LIZ(SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS sparkView) {
        o.LJIIIZ(sparkView, "sparkView");
        KOE koe = new KOE(sparkView);
        try {
            String queryParameter = UriProtector.getQueryParameter(UriProtector.parse(sparkView.getUrl()), "use_visibility_plus");
            if (queryParameter != null) {
                if (CastIntegerProtector.parseInt(queryParameter) == 1) {
                    C12460eI.LIZLLL(sparkView, new KOI(sparkView, koe));
                    return;
                }
            }
        } catch (NullPointerException unused) {
        }
        new LynxExposeHelper.ExposeView(new WeakReference(sparkView), koe);
    }
}

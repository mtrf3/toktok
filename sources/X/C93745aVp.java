package X;

import androidx.lifecycle.ViewModelStoreOwner;
import com.bytedance.effectcreatormobile.ckeapi.api.foundation.log.ILog;
import com.bytedance.news.common.service.manager.IService;
import kotlin.jvm.internal.IDqS179S0200000_42;
import kotlin.jvm.internal.o;

/* renamed from: X.aVp, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class C93745aVp {
    public static final <T extends IService> T LIZ(Class<T> cls) {
        T t;
        C93970aZS LIZ = C93971aZT.LIZ();
        if (LIZ != null) {
            t = (T) LIZ.LIZ(cls);
        } else {
            t = null;
        }
        o.LJI(t);
        return t;
    }

    public static final void LIZIZ(InterfaceC65784Pro<C76800UCe> interfaceC65784Pro) {
        try {
            interfaceC65784Pro.invoke();
        } catch (Exception unused) {
            ((ILog) C93892aYC.LIZ(ILog.class)).logStack("CKE", "safeRun");
        }
    }

    public static final C62822Ol8 LIZJ(ViewModelStoreOwner viewModel, Class cls) {
        o.LJIIIZ(viewModel, "$this$viewModel");
        return C221108m2.LIZIZ(new IDqS179S0200000_42(viewModel, cls, 4));
    }
}

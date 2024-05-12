package X;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelProviders;
import com.ss.android.ugc.aweme.refactor.business.compliance.NewAdSubscriptionServiceImpl;
import com.ss.android.ugc.aweme.refactor.business.language.AppLanguageServiceImpl;
import com.ss.android.ugc.aweme.refactor.business.lynx.LynxComponentServiceImpl;
import com.ss.android.ugc.aweme.refactor.business.slogan.SloganPageServiceImpl;
import com.ss.android.ugc.aweme.refactor.business.smartlock.PersonalizedNujServiceImpl;
import com.ss.android.ugc.aweme.refactor.integration.FlowStepMonitorServiceImpl;
import kotlin.jvm.internal.o;

/* renamed from: X.FzD, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C40763FzD implements InterfaceC40794Fzi {
    @Override // X.InterfaceC40794Fzi
    public final <T> T getService(Class<T> cls) {
        InterfaceC40755Fz5 interfaceC40755Fz5;
        ActivityC45651qj LIZ;
        ViewModel viewModel;
        G0D LIZ2 = C40751Fz1.LIZ();
        if (LIZ2 == null || (interfaceC40755Fz5 = (InterfaceC40755Fz5) LIZ2.LJLILLLLZI) == null || (LIZ = interfaceC40755Fz5.LIZ()) == null) {
            return null;
        }
        ViewModelProvider of = ViewModelProviders.of(LIZ);
        o.LJIIIIZZ(of, "of(activity)");
        if (o.LJ(cls, InterfaceC40806Fzu.class)) {
            viewModel = of.get(LynxComponentServiceImpl.class);
            if (viewModel == null) {
                return null;
            }
        } else if (o.LJ(cls, G1T.class)) {
            viewModel = of.get(PersonalizedNujServiceImpl.class);
            if (viewModel == null) {
                return null;
            }
        } else {
            if (o.LJ(cls, G08.class)) {
                return (T) of.get(SloganPageServiceImpl.class);
            }
            if (o.LJ(cls, InterfaceC40740Fyq.class)) {
                return (T) of.get(AppLanguageServiceImpl.class);
            }
            if (o.LJ(cls, G1W.class)) {
                return (T) of.get(NewAdSubscriptionServiceImpl.class);
            }
            if (!o.LJ(cls, G1X.class)) {
                return null;
            }
            return (T) of.get(FlowStepMonitorServiceImpl.class);
        }
        return (T) viewModel;
    }
}

package X;

import androidx.lifecycle.LifecycleOwner;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.o;

/* renamed from: X.8bC, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C214388bC {
    public static void LIZ(AssemViewModel viewModel, InterfaceC65784Pro lifecycleProducer, InterfaceC65784Pro interfaceC65784Pro, InterfaceC65784Pro interfaceC65784Pro2, InterfaceC65784Pro dispatcherFactory, InterfaceC88472Yns argumentsAcceptor) {
        C7C3 c7c3;
        o.LJIIIZ(viewModel, "viewModel");
        o.LJIIIZ(lifecycleProducer, "lifecycleProducer");
        o.LJIIIZ(dispatcherFactory, "dispatcherFactory");
        o.LJIIIZ(argumentsAcceptor, "argumentsAcceptor");
        if (!viewModel._initialized) {
            viewModel.setLifecycleRef(new WeakReference<>(((LifecycleOwner) lifecycleProducer.invoke()).getLifecycle()));
            C8VA c8va = null;
            if (interfaceC65784Pro != null) {
                c7c3 = (C7C3) interfaceC65784Pro.invoke();
            } else {
                c7c3 = null;
            }
            viewModel.hierarchyDataStore = c7c3;
            if (interfaceC65784Pro2 != null) {
                c8va = (C8VA) interfaceC65784Pro2.invoke();
            }
            viewModel.hierarchyServiceStore = c8va;
            viewModel.initialize((C8YR) dispatcherFactory.invoke(), argumentsAcceptor);
        }
    }
}

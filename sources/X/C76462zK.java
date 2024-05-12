package X;

import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ProcessLifecycleOwner;
import com.ss.android.ugc.aweme.im.sdk.iescore.depend.NetworkDependImpl$registerNetworkConditionCallback$1;
import kotlin.jvm.internal.o;

/* renamed from: X.2zK, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C76462zK extends AbstractC65781Prl implements InterfaceC65784Pro<C76800UCe> {
    public static final C76462zK LJLIL = new C76462zK();

    public C76462zK() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final C76800UCe invoke() {
        C76482zM.LIZ.getClass();
        C34B.LIZIZ("NetworkDependImpl", "register network callback");
        LifecycleOwner lifecycleOwner = ProcessLifecycleOwner.get();
        o.LJIIIIZZ(lifecycleOwner, "get()");
        XKX.LIZLLL(LifecycleOwnerKt.getLifecycleScope(lifecycleOwner), C36636EZk.LIZ, null, new NetworkDependImpl$registerNetworkConditionCallback$1(null), 2);
        return C76800UCe.LIZ;
    }
}

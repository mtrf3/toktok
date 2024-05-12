package X;

import android.os.Looper;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* renamed from: X.Wa5, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C82521Wa5 extends C83113Wjd {
    @Override // X.C83113Wjd, X.AbstractC29891Fh
    public void onCreate() {
        super.onCreate();
        H78.LIZIZ("LazyComponents", "TikTokRecordBeautyLogicComponent onCreate");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C82521Wa5(C82622Wbi diContainer, boolean z, InterfaceC65784Pro<? extends InterfaceC84497XEf> epProvider, InterfaceC88472Yns<? super Boolean, String> defaultPanel, InterfaceC83139Wk3 logicStore, C5NP logger, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro, InterfaceC88472Yns<? super C83116Wjg, C76800UCe> interfaceC88472Yns) {
        super(diContainer, z, C45448Hsa.LIZ(), epProvider, defaultPanel, logicStore, logger, interfaceC65784Pro, interfaceC88472Yns);
        Lifecycle lifecycle;
        o.LJIIIZ(diContainer, "diContainer");
        o.LJIIIZ(epProvider, "epProvider");
        o.LJIIIZ(defaultPanel, "defaultPanel");
        o.LJIIIZ(logicStore, "logicStore");
        o.LJIIIZ(logger, "logger");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("TikTokRecordBeautyLogicComponent, current State=");
        Lifecycle.State state = null;
        LifecycleOwner lifecycleOwner = (LifecycleOwner) diContainer.LJIIIIZZ(null, LifecycleOwner.class);
        if (lifecycleOwner != null && (lifecycle = lifecycleOwner.getLifecycle()) != null) {
            state = lifecycle.getCurrentState();
        }
        LIZ.append(state);
        H78.LIZIZ("LazyComponents", X1D.LIZIZ(LIZ));
        if (o.LJ(C16880lQ.LLJJJJ(), Looper.myLooper())) {
        } else {
            throw new IllegalThreadStateException("can only call from main thread");
        }
    }

    public /* synthetic */ C82521Wa5(C82622Wbi c82622Wbi, boolean z, InterfaceC65784Pro interfaceC65784Pro, InterfaceC88472Yns interfaceC88472Yns, InterfaceC83139Wk3 interfaceC83139Wk3, C5NP c5np, InterfaceC65784Pro interfaceC65784Pro2, InterfaceC88472Yns interfaceC88472Yns2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(c82622Wbi, z, interfaceC65784Pro, interfaceC88472Yns, (i & 16) != 0 ? new C82522Wa6() : interfaceC83139Wk3, (i & 32) != 0 ? C82523Wa7.LIZ : c5np, (i & 64) != 0 ? null : interfaceC65784Pro2, (i & 128) == 0 ? interfaceC88472Yns2 : null);
    }
}

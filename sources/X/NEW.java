package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.ss.android.ugc.effectmanager.common.ConcurrentHashSet;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class NEW extends AbstractC58889N9h {
    public final ConcurrentHashSet<String> LJLJJL = new ConcurrentHashSet<>();

    @Override // X.AbstractC37594EpC
    public final void LJI(XBaseParamModel xBaseParamModel, C37356ElM c37356ElM, EnumC37844EtE type) {
        InterfaceC58890N9i interfaceC58890N9i = (InterfaceC58890N9i) xBaseParamModel;
        o.LJIIIZ(type, "type");
        if (!this.LJLJJL.contains(interfaceC58890N9i.getResourceId())) {
            this.LJLJJL.add(interfaceC58890N9i.getResourceId());
            XKX.LIZLLL(C48841JEv.LIZ(C78613UtF.LIZJ), null, null, new C59007NDv(interfaceC58890N9i, c37356ElM, this, null), 3);
        } else {
            C31626Cb8.LIZ(c37356ElM, 0, "is downloading", 4);
        }
    }
}

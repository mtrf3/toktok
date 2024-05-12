package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.ss.android.ugc.effectmanager.common.ConcurrentHashSet;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class NEV extends AbstractC58896N9o {
    public final ConcurrentHashSet<String> LJLJJL = new ConcurrentHashSet<>();

    @Override // X.AbstractC37594EpC
    public final void LJI(XBaseParamModel xBaseParamModel, C37356ElM c37356ElM, EnumC37844EtE type) {
        InterfaceC58898N9q interfaceC58898N9q = (InterfaceC58898N9q) xBaseParamModel;
        o.LJIIIZ(type, "type");
        if (!this.LJLJJL.contains(interfaceC58898N9q.getResourceId())) {
            this.LJLJJL.add(interfaceC58898N9q.getResourceId());
            XKX.LIZLLL(C48841JEv.LIZ(C78613UtF.LIZJ), null, null, new C59006NDu(interfaceC58898N9q, c37356ElM, this, null), 3);
        } else {
            C31626Cb8.LIZ(c37356ElM, 0, "is applying effect", 4);
        }
    }
}

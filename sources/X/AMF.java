package X;

import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.jedi.ext.adapter.JediViewHolder;
import kotlin.jvm.internal.o;

/* JADX INFO: Add missing generic type declarations: [VM] */
/* loaded from: classes5.dex */
public final class AMF<VM> implements InterfaceC115514g7<Object, VM> {
    public final /* synthetic */ JediViewHolder LIZ;
    public final /* synthetic */ InterfaceC65784Pro LIZIZ;
    public final /* synthetic */ InterfaceC65350Pko LIZJ;
    public final /* synthetic */ InterfaceC88472Yns LIZLLL;

    @Override // X.InterfaceC115514g7
    public final Object LIZ(Object obj, InterfaceC74236TBo property) {
        o.LJIIJ(property, "property");
        AMK proxy = this.LIZ.getProxy();
        if (proxy != null) {
            InterfaceC73150SnK interfaceC73150SnK = this.LIZ;
            if (interfaceC73150SnK instanceof AMD) {
                JediViewModel jediViewModel = (JediViewModel) AMG.LIZ(((AMD) interfaceC73150SnK).getViewModelFactory(), proxy.r6()).LIZ((String) this.LIZIZ.invoke(), C39557Ffl.LIZ(this.LIZJ));
                InterfaceC72022SOk create = jediViewModel.LJLJJI.create(C39557Ffl.LIZ(this.LIZJ));
                if (create != null) {
                    create.binding(jediViewModel);
                }
                jediViewModel.ov0(this.LIZLLL);
                return jediViewModel;
            }
            "Check failed.".toString();
            throw new IllegalStateException("Check failed.");
        }
        throw new IllegalStateException("proxy not bound to viewHolder yet");
    }

    public AMF(JediViewHolder jediViewHolder, InterfaceC65784Pro interfaceC65784Pro, InterfaceC65350Pko interfaceC65350Pko, InterfaceC88472Yns interfaceC88472Yns) {
        this.LIZ = jediViewHolder;
        this.LIZIZ = interfaceC65784Pro;
        this.LIZJ = interfaceC65350Pko;
        this.LIZLLL = interfaceC88472Yns;
    }
}

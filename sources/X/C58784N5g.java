package X;

import com.bytedance.ies.ugc.aweme.commercialize.search.arch.v2.module.GlobalSearchAdModuleImpl;
import com.bytedance.ies.ugc.aweme.commercialize.search.arch.v2.module.IGlobalSearchAdModule;
import com.ss.android.ugc.aweme.feed.model.Aweme;

/* renamed from: X.N5g, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C58784N5g implements IGlobalSearchAdModule {
    public static final C58784N5g LIZIZ = new C58784N5g();
    public final /* synthetic */ IGlobalSearchAdModule LIZ;

    @Override // com.bytedance.ies.ugc.aweme.commercialize.search.arch.v2.module.IGlobalSearchAdModule
    public final void LIZ() {
        this.LIZ.LIZ();
    }

    @Override // com.bytedance.ies.ugc.aweme.commercialize.search.arch.v2.module.IGlobalSearchAdModule
    public final InterfaceC49504Jbo LIZIZ() {
        return this.LIZ.LIZIZ();
    }

    @Override // com.bytedance.ies.ugc.aweme.commercialize.search.arch.v2.module.IGlobalSearchAdModule
    public final N7D LIZJ(Aweme aweme) {
        return this.LIZ.LIZJ(aweme);
    }

    @Override // com.bytedance.ies.ugc.aweme.commercialize.search.arch.v2.module.IGlobalSearchAdModule
    public final void LIZLLL() {
        this.LIZ.LIZLLL();
    }

    @Override // com.bytedance.ies.ugc.aweme.commercialize.search.arch.v2.module.IGlobalSearchAdModule
    public final JMD LJ(Aweme aweme) {
        return this.LIZ.LJ(aweme);
    }

    public C58784N5g() {
        IGlobalSearchAdModule iGlobalSearchAdModule;
        Object LIZ = C58096Mr6.LIZ(IGlobalSearchAdModule.class, false);
        if (LIZ != null) {
            iGlobalSearchAdModule = (IGlobalSearchAdModule) LIZ;
        } else {
            if (C58096Mr6.LJIJJLI == null) {
                synchronized (IGlobalSearchAdModule.class) {
                    if (C58096Mr6.LJIJJLI == null) {
                        C58096Mr6.LJIJJLI = new GlobalSearchAdModuleImpl();
                    }
                }
            }
            iGlobalSearchAdModule = C58096Mr6.LJIJJLI;
        }
        this.LIZ = iGlobalSearchAdModule;
    }
}

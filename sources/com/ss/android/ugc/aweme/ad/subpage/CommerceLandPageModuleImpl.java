package com.ss.android.ugc.aweme.ad.subpage;

import X.C221108m2;
import X.C58096Mr6;
import X.C58281Mu5;
import X.C58282Mu6;
import X.C62822Ol8;
import X.C73343SqR;
import com.ss.android.ugc.aweme.ad.prerender.IPreRenderLandPageModule;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.realtime.IAdLandPageRealtimeResourceModule;

/* loaded from: classes11.dex */
public final class CommerceLandPageModuleImpl implements ILandPageFunctionModule {
    public final C62822Ol8 LJLIL = C221108m2.LIZIZ(C58281Mu5.INSTANCE);
    public final C62822Ol8 LJLILLLLZI = C221108m2.LIZIZ(C58282Mu6.LJLIL);

    @Override // X.InterfaceC41000G7g
    public final void initialize() {
    }

    public static ILandPageFunctionModule LIZ() {
        Object LIZ = C58096Mr6.LIZ(ILandPageFunctionModule.class, false);
        if (LIZ != null) {
            return (ILandPageFunctionModule) LIZ;
        }
        if (C58096Mr6.LLFFF == null) {
            synchronized (ILandPageFunctionModule.class) {
                if (C58096Mr6.LLFFF == null) {
                    C58096Mr6.LLFFF = new CommerceLandPageModuleImpl();
                }
            }
        }
        return C58096Mr6.LLFFF;
    }

    @Override // com.ss.android.ugc.aweme.ad.subpage.ILandPageFunctionModule
    public final IAdLandPageRealtimeResourceModule Am0() {
        return (IAdLandPageRealtimeResourceModule) this.LJLILLLLZI.getValue();
    }

    @Override // X.InterfaceC41034G8o
    public final Object L9() {
        return new C73343SqR();
    }

    @Override // com.ss.android.ugc.aweme.ad.subpage.ILandPageFunctionModule
    public final void LLLJL(Aweme aweme) {
        ((IPreRenderLandPageModule) this.LJLIL.getValue()).LLLJL(aweme);
        Am0().LLLJL(aweme);
    }
}

package X;

import android.content.Context;
import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.ss.android.ugc.tiktok.location_api.service.ILocationBaseServiceForMT;
import com.ss.android.ugc.tiktok.location_api.service.PermissionCache;
import defpackage.l;

/* loaded from: classes10.dex */
public final class M49 implements InterfaceC54674Ld0 {
    public final /* synthetic */ l.c LIZ;
    public final /* synthetic */ CompletionBlock<l.c> LIZIZ;
    public final /* synthetic */ ILocationBaseServiceForMT LIZJ;
    public final /* synthetic */ Context LIZLLL;

    @Override // X.InterfaceC54674Ld0
    public final void LIZ() {
        this.LIZ.setRequestResult(1);
        l.c cVar = this.LIZ;
        PermissionCache.LJLIL.getClass();
        cVar.setLocationMobParams(C113554cx.LJJL(new OSZ("inapp_is_precise", Integer.valueOf(this.LIZJ.isInAppPrecise() ? 1 : 0)), new OSZ("system_is_precise", Integer.valueOf(this.LIZJ.isSystemPrecise(this.LIZLLL) ? 1 : 0)), new OSZ("enable_location", Integer.valueOf(PermissionCache.LIZIZ("android.permission.ACCESS_COARSE_LOCATION") ? 1 : 0))));
        this.LIZIZ.onSuccess(this.LIZ, "");
    }

    @Override // X.InterfaceC54674Ld0
    public final void LIZJ(int i) {
        this.LIZ.setRequestResult(3);
        this.LIZ.setLocationMobParams(C113554cx.LJJJLIIL());
        this.LIZIZ.onSuccess(this.LIZ, "");
    }

    @Override // X.InterfaceC54674Ld0
    public final void LIZIZ(int i, String str) {
        this.LIZ.setRequestResult(2);
        this.LIZ.setLocationMobParams(C113554cx.LJJJLIIL());
        this.LIZIZ.onSuccess(this.LIZ, str);
    }

    public M49(l.c cVar, C37356ElM c37356ElM, ILocationBaseServiceForMT iLocationBaseServiceForMT, Context context) {
        this.LIZ = cVar;
        this.LIZIZ = c37356ElM;
        this.LIZJ = iLocationBaseServiceForMT;
        this.LIZLLL = context;
    }
}

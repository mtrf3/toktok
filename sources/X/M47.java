package X;

import android.content.Context;
import androidx.lifecycle.ViewModelKt;
import androidx.lifecycle.ViewModelProviders;
import com.bytedance.bdlocation.BDLocation;
import com.bytedance.bdlocation.exception.BDLocationException;
import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.ss.android.ugc.aweme.search.common.viewmodel.SearchGlobalViewModel;
import com.ss.android.ugc.aweme.search.pages.core.ui.activity.SearchResultActivity;
import com.ss.android.ugc.tiktok.location_api.service.ILocationBaseServiceForMT;
import com.ss.android.ugc.tiktok.location_api.service.PermissionCache;
import com.ss.android.ugc.tiktok.location_api.service.proxy.BDLocationProxy;
import defpackage.j;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class M47 implements InterfaceC56182M3e {
    public final /* synthetic */ j.c LIZ;
    public final /* synthetic */ ILocationBaseServiceForMT LIZIZ;
    public final /* synthetic */ Context LIZJ;
    public final /* synthetic */ CompletionBlock<j.c> LIZLLL;
    public final /* synthetic */ C51445KGz LJ;
    public final /* synthetic */ Number LJFF;

    @Override // X.InterfaceC56182M3e
    public final void LIZ(J0X j0x) {
        String str;
        this.LIZ.setRefreshResult(0);
        this.LIZ.setLocationMobParams(C113554cx.LJJJLIIL());
        C51445KGz c51445KGz = this.LJ;
        Context context = this.LIZJ;
        boolean z = !o.LJ(this.LJFF, 0);
        c51445KGz.getClass();
        if ((context instanceof SearchResultActivity) && z) {
            SearchGlobalViewModel searchGlobalViewModel = (SearchGlobalViewModel) ViewModelProviders.of((ActivityC45651qj) context).get(SearchGlobalViewModel.class);
            searchGlobalViewModel.getClass();
            XKX.LIZLLL(ViewModelKt.getViewModelScope(searchGlobalViewModel), null, null, new C3CZ(searchGlobalViewModel, null), 3);
        }
        CompletionBlock<j.c> completionBlock = this.LIZLLL;
        j.c cVar = this.LIZ;
        if (j0x == null || (str = j0x.getMessage()) == null) {
            str = "";
        }
        completionBlock.onSuccess(cVar, str);
    }

    @Override // X.InterfaceC56182M3e
    public final void LIZIZ(BDLocationProxy bDLocationProxy) {
        Double d;
        int i = 1;
        this.LIZ.setRefreshResult(1);
        j.c cVar = this.LIZ;
        OSZ[] oszArr = new OSZ[5];
        Double d2 = null;
        if (bDLocationProxy != null) {
            d = Double.valueOf(bDLocationProxy.getLatitude());
        } else {
            d = null;
        }
        oszArr[0] = new OSZ("latitude", String.valueOf(d));
        if (bDLocationProxy != null) {
            d2 = Double.valueOf(bDLocationProxy.getLongitude());
        }
        oszArr[1] = new OSZ("longitude", String.valueOf(d2));
        oszArr[2] = new OSZ("inapp_is_precise", Integer.valueOf(this.LIZIZ.isInAppPrecise() ? 1 : 0));
        Context context = this.LIZJ;
        if (context == null || !this.LIZIZ.isSystemPrecise(context)) {
            i = 0;
        }
        oszArr[3] = new OSZ("system_is_precise", Integer.valueOf(i));
        PermissionCache.LJLIL.getClass();
        oszArr[4] = new OSZ("enable_location", Integer.valueOf(PermissionCache.LIZIZ("android.permission.ACCESS_COARSE_LOCATION") ? 1 : 0));
        cVar.setLocationMobParams(C113554cx.LJJL(oszArr));
        this.LIZLLL.onSuccess(this.LIZ, "");
    }

    @Override // X.InterfaceC56182M3e, com.bytedance.bdlocation.callback.BDLocationCallback
    public final void onError(BDLocationException bDLocationException) {
        C56181M3d.LIZ(this, bDLocationException);
    }

    @Override // X.InterfaceC56182M3e, com.bytedance.bdlocation.callback.BDLocationCallback
    public final void onLocationChanged(BDLocation bDLocation) {
        C56181M3d.LIZIZ(this, bDLocation);
    }

    public M47(j.c cVar, ILocationBaseServiceForMT iLocationBaseServiceForMT, Context context, C37356ElM c37356ElM, C51445KGz c51445KGz, Number number) {
        this.LIZ = cVar;
        this.LIZIZ = iLocationBaseServiceForMT;
        this.LIZJ = context;
        this.LIZLLL = c37356ElM;
        this.LJ = c51445KGz;
        this.LJFF = number;
    }
}

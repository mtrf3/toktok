package X;

import android.content.Context;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModelKt;
import androidx.lifecycle.ViewModelProviders;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.search.common.viewmodel.SearchGlobalViewModel;
import com.ss.android.ugc.aweme.search.pages.core.ui.activity.SearchResultActivity;
import com.ss.android.ugc.tiktok.location_api.service.ILocationBaseServiceForMT;
import defpackage.j;
import kotlin.jvm.internal.o;

/* renamed from: X.KGz, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51445KGz extends j {
    @Override // X.AbstractC37594EpC
    public final void LJI(XBaseParamModel xBaseParamModel, C37356ElM c37356ElM, EnumC37844EtE type) {
        Context context;
        o.LJIIIZ(type, "type");
        Number byUser = ((j.b) xBaseParamModel).getByUser();
        j.c cVar = (j.c) ED5.LIZJ(j.c.class, null);
        InterfaceC38263Ezz interfaceC38263Ezz = this.LJLIL;
        if (interfaceC38263Ezz != null) {
            context = interfaceC38263Ezz.getContext();
        } else {
            context = null;
        }
        ILocationBaseServiceForMT iLocationBaseServiceForMT = (ILocationBaseServiceForMT) ServiceManager.get().getService(ILocationBaseServiceForMT.class);
        if (context instanceof SearchResultActivity) {
            if (o.LJ(byUser, 0) && C17N.LJJJJJL((LifecycleOwner) context).le0().LIZJ().LJLIL) {
                cVar.setRefreshResult(2);
                cVar.setLocationMobParams(C113554cx.LJJJLIIL());
                c37356ElM.onSuccess(cVar, "");
                return;
            } else {
                if (!o.LJ(byUser, 0)) {
                    SearchGlobalViewModel searchGlobalViewModel = (SearchGlobalViewModel) ViewModelProviders.of((ActivityC45651qj) context).get(SearchGlobalViewModel.class);
                    searchGlobalViewModel.getClass();
                    XKX.LIZLLL(ViewModelKt.getViewModelScope(searchGlobalViewModel), null, null, new C80003Ca(searchGlobalViewModel, null), 3);
                }
                C17N.LJJJJJL((LifecycleOwner) context).j4(new C49655JeF());
            }
        }
        C51733KSb.LIZ("search", "poi_biz", KSZ.LIZJ, KSZ.LIZ, new M47(cVar, iLocationBaseServiceForMT, context, c37356ElM, this, byUser), 32);
    }
}

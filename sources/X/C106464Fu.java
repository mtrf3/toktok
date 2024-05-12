package X;

import androidx.lifecycle.LifecycleOwner;
import com.bytedance.ies.im.core.service.IMCoreProxyService;
import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.ss.android.ugc.aweme.IAccountService;
import com.ss.android.ugc.aweme.im.sdk.activitystatus.ActivityStatusViewModelImpl;
import com.ss.android.ugc.aweme.im.sdk.activitystatus.data.api.ActivityStatusAPI;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.input.gifsearch.giphy.GiphyGifApi;
import com.ss.android.ugc.aweme.im.service.appsettings.ActivityStatusConfig;
import com.ss.android.ugc.aweme.im.service.model.ActivityStatus;
import kotlin.jvm.internal.o;

/* renamed from: X.4Fu, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C106464Fu<T> implements C4G1<T> {
    public final C106504Fy LIZ;
    public final int LIZIZ;

    @Override // X.C4G1
    public final T get() {
        switch (this.LIZIZ) {
            case 0:
                return (T) new C3UL() { // from class: X.4Fv
                    @Override // X.C3UL
                    public final ActivityStatusViewModelImpl LIZ(C98453th c98453th, InterfaceC65784Pro<Long> interfaceC65784Pro, ActivityStatusConfig activityStatusConfig, java.util.Map<String, C73849Syb<ActivityStatus>> map, java.util.Map<String, C73849Syb<ActivityStatus>> map2, java.util.Map<String, Integer> map3, java.util.Map<String, Integer> map4, C73893SzJ<String> c73893SzJ, C73893SzJ<String> c73893SzJ2, InterfaceC92693kP interfaceC92693kP, C73318Sq2 c73318Sq2, C73318Sq2 c73318Sq22, AbstractC73946T0k abstractC73946T0k, AbstractC73946T0k abstractC73946T0k2, LifecycleOwner lifecycleOwner, InterfaceC70422pa interfaceC70422pa, boolean z, boolean z2) {
                        C106504Fy c106504Fy = C106464Fu.this.LIZ;
                        c106504Fy.getClass();
                        return new ActivityStatusViewModelImpl(new C106934Hp(new C3B7(c106504Fy.LIZJ.get())), c98453th, interfaceC65784Pro, activityStatusConfig, map, map2, map3, map4, c73893SzJ, c73893SzJ2, interfaceC92693kP, c73318Sq2, c73318Sq22, abstractC73946T0k, abstractC73946T0k2, lifecycleOwner, interfaceC70422pa, z, z2);
                    }
                };
            case 1:
                T t = (T) RetrofitFactory.LIZLLL().LIZ(C30Y.LIZIZ).LJFF().LIZ.LIZ(ActivityStatusAPI.class);
                C78555UsJ.LJII(t);
                return t;
            case 2:
                return (T) new InterfaceC100593x9() { // from class: X.4Fx
                    @Override // X.InterfaceC100593x9
                    public final C79613An LIZ(C3B2 c3b2, ActivityStatusConfig activityStatusConfig, InterfaceC70422pa interfaceC70422pa) {
                        return new C79613An(c3b2, activityStatusConfig, interfaceC70422pa, C106464Fu.this.LIZ.LIZJ.get(), new C36G(), C106464Fu.this.LIZ.LJ.get());
                    }
                };
            case 3:
                return (T) new C98453th("MUFActivityStatusModel", null, 6);
            case 4:
                ActivityStatusViewModelImpl activityStatusViewModelImpl = (ActivityStatusViewModelImpl) C100573x7.LIZ.getValue();
                C78555UsJ.LJII(activityStatusViewModelImpl);
                C4Z2 LIZIZ = IMCoreProxyService.LIZJ().LIZIZ();
                C78555UsJ.LJII(LIZIZ);
                C3AL.LIZ.getClass();
                ActivityStatusConfig LIZ = C3AL.LIZ();
                C78555UsJ.LJII(LIZ);
                HG3.LJIIL();
                IAccountService iAccountService = HG3.LJLJL;
                o.LJIIIIZZ(iAccountService, "get()");
                return (T) new C3A6(activityStatusViewModelImpl, LIZIZ, LIZ, iAccountService, this.LIZ.LJI.get());
            case 5:
                return (T) new C98453th("ActivityStatusMsgSource", null, 6);
            case 6:
                T t2 = (T) RetrofitFactory.LIZLLL().LIZ(C30Y.LIZ).LJFF().LIZ.LIZ(GiphyGifApi.class);
                C78555UsJ.LJII(t2);
                return t2;
            case 7:
                T t3 = (T) C106404Fo.LIZ();
                C78555UsJ.LJII(t3);
                return t3;
            default:
                throw new AssertionError(this.LIZIZ);
        }
    }

    public C106464Fu(C106504Fy c106504Fy, int i) {
        this.LIZ = c106504Fy;
        this.LIZIZ = i;
    }
}

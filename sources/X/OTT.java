package X;

import android.app.Application;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import com.ss.android.ugc.aweme.authorize.AwemeAuthorizePlatformDepend;
import com.ss.android.ugc.aweme.authorize.viewmodel.AuthCommonViewModel;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class OTT implements ViewModelProvider.Factory {
    public final Application LIZ;
    public final AwemeAuthorizePlatformDepend LIZIZ;
    public final InterfaceC61954OTe LIZJ;
    public final OT6 LIZLLL;
    public final OTD LJ;

    @Override // androidx.lifecycle.ViewModelProvider.Factory
    public final /* synthetic */ ViewModel create(Class cls, C0VK c0vk) {
        return C09L.LIZIZ(this, cls, c0vk);
    }

    @Override // androidx.lifecycle.ViewModelProvider.Factory
    public final <T extends ViewModel> T create(Class<T> modelClass) {
        o.LJIIIZ(modelClass, "modelClass");
        return new AuthCommonViewModel(this.LIZ, this.LIZIZ, this.LIZJ, this.LIZLLL, this.LJ);
    }

    public OTT(Application application, AwemeAuthorizePlatformDepend awemeAuthorizePlatformDepend, InterfaceC61954OTe interfaceC61954OTe, OT6 ot6, OTD otd) {
        this.LIZ = application;
        this.LIZIZ = awemeAuthorizePlatformDepend;
        this.LIZJ = interfaceC61954OTe;
        this.LIZLLL = ot6;
        this.LJ = otd;
    }
}

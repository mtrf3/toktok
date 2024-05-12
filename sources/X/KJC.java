package X;

import androidx.fragment.app.Fragment;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.search.ISearchDynamicService;
import com.ss.android.ugc.aweme.search.core.communicate.SearchDynamicServiceImpl;
import com.ss.android.ugc.aweme.search.voice.core.service.SearchDynamicServiceDefaultImpl;
import java.util.HashMap;

/* loaded from: classes9.dex */
public final class KJC implements ISearchDynamicService {
    public static final KJC LIZIZ = new KJC();
    public final /* synthetic */ ISearchDynamicService LIZ;

    @Override // com.ss.android.ugc.aweme.search.ISearchDynamicService
    public final boolean engineSupportDynamicFeature() {
        return this.LIZ.engineSupportDynamicFeature();
    }

    @Override // com.ss.android.ugc.aweme.search.ISearchDynamicService
    public final void initEditVoiceButton(TuxIconView tuxIconView, Fragment fragment, K55 k55, HashMap<String, String> hashMap, InterfaceC65784Pro<Boolean> interfaceC65784Pro) {
        this.LIZ.initEditVoiceButton(tuxIconView, fragment, k55, hashMap, interfaceC65784Pro);
    }

    @Override // com.ss.android.ugc.aweme.search.ISearchDynamicService
    public final void initVoiceButton(TuxIconView tuxIconView, Fragment fragment, K55 k55, HashMap<String, String> hashMap) {
        this.LIZ.initVoiceButton(tuxIconView, fragment, k55, hashMap);
    }

    @Override // com.ss.android.ugc.aweme.search.ISearchDynamicService
    public final void startVoiceSearch(ActivityC45651qj activityC45651qj, HashMap<String, String> hashMap, boolean z, K55 k55, String str, int i) {
        this.LIZ.startVoiceSearch(activityC45651qj, hashMap, z, k55, "search", i);
    }

    public KJC() {
        ISearchDynamicService searchDynamicServiceDefaultImpl;
        Object LIZ;
        try {
            searchDynamicServiceDefaultImpl = SearchDynamicServiceImpl.LIZ();
            if (searchDynamicServiceDefaultImpl instanceof SearchDynamicServiceDefaultImpl) {
                try {
                    LIZ = Class.forName("com.ss.android.ugc.aweme.search.core.communicate.SearchDynamicServiceImpl");
                    C3C5.m7constructorimpl(LIZ);
                } catch (Throwable th) {
                    LIZ = C141335gf.LIZ(th);
                    C3C5.m7constructorimpl(LIZ);
                }
                Class cls = (Class) (C3C5.m12isFailureimpl(LIZ) ? null : LIZ);
                if (cls != null) {
                    ServiceManager.get().bind(ISearchDynamicService.class, new KJD(cls)).asSingleton();
                }
                searchDynamicServiceDefaultImpl = SearchDynamicServiceImpl.LIZ();
            }
        } catch (Throwable unused) {
            searchDynamicServiceDefaultImpl = new SearchDynamicServiceDefaultImpl();
        }
        this.LIZ = searchDynamicServiceDefaultImpl;
    }
}

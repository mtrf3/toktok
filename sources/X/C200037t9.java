package X;

import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.nows.service.NowUserPublishService;
import com.ss.android.ugc.aweme.service.INowUserPublishService;
import java.util.Collection;
import kotlin.jvm.internal.o;

/* renamed from: X.7t9, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C200037t9 implements INowUserPublishService {
    public static final C200037t9 LIZIZ = new C200037t9();
    public final /* synthetic */ INowUserPublishService LIZ;

    @Override // com.ss.android.ugc.aweme.service.INowUserPublishService
    public final void LIZ(LifecycleOwner lifecycleOwner, C56475MEl listener) {
        o.LJIIIZ(lifecycleOwner, "lifecycleOwner");
        o.LJIIIZ(listener, "listener");
        this.LIZ.LIZ(lifecycleOwner, listener);
    }

    @Override // com.ss.android.ugc.aweme.service.INowUserPublishService
    public final int LIZIZ(Collection<? extends Aweme> collection, InterfaceC88472Yns<? super Aweme, Boolean> interfaceC88472Yns) {
        o.LJIIIZ(collection, "collection");
        return this.LIZ.LIZIZ(collection, interfaceC88472Yns);
    }

    @Override // com.ss.android.ugc.aweme.service.INowUserPublishService
    public final void LIZJ(LifecycleOwner lifecycleOwner, InterfaceC88472Yns<? super String, C76800UCe> interfaceC88472Yns) {
        o.LJIIIZ(lifecycleOwner, "lifecycleOwner");
        this.LIZ.LIZJ(lifecycleOwner, interfaceC88472Yns);
    }

    @Override // com.ss.android.ugc.aweme.service.INowUserPublishService
    public final void LIZLLL(LifecycleOwner lifecycleOwner, InterfaceC88472Yns<? super String, C76800UCe> interfaceC88472Yns) {
        o.LJIIIZ(lifecycleOwner, "lifecycleOwner");
        this.LIZ.LIZLLL(lifecycleOwner, interfaceC88472Yns);
    }

    @Override // com.ss.android.ugc.aweme.service.INowUserPublishService
    public final void LJ(Aweme outAweme, Aweme aweme) {
        o.LJIIIZ(outAweme, "outAweme");
        this.LIZ.LJ(outAweme, aweme);
    }

    @Override // com.ss.android.ugc.aweme.service.INowUserPublishService
    public final void LJFF(Aweme outAweme, String aid) {
        o.LJIIIZ(outAweme, "outAweme");
        o.LJIIIZ(aid, "aid");
        this.LIZ.LJFF(outAweme, aid);
    }

    public C200037t9() {
        INowUserPublishService iNowUserPublishService;
        Object LIZ = C58096Mr6.LIZ(INowUserPublishService.class, false);
        if (LIZ != null) {
            iNowUserPublishService = (INowUserPublishService) LIZ;
        } else {
            if (C58096Mr6.D3 == null) {
                synchronized (INowUserPublishService.class) {
                    if (C58096Mr6.D3 == null) {
                        C58096Mr6.D3 = new NowUserPublishService();
                    }
                }
            }
            iNowUserPublishService = C58096Mr6.D3;
        }
        this.LIZ = iNowUserPublishService;
    }
}

package X;

import android.content.Context;
import com.bytedance.android.livesdk.model.AdLiveEnterRoomConfig;
import com.ss.android.ugc.aweme.ad.feed.adexperience.CommerceAdExperienceServiceImpl;
import com.ss.android.ugc.aweme.ad.feed.adexperience.ICommerceAdExperienceService;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.feed.platform.container.protocol.priority.BottomBarPriorityProtocol;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.NFm, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C59050NFm implements ICommerceAdExperienceService {
    public static final C59050NFm LIZIZ = new C59050NFm();
    public final /* synthetic */ ICommerceAdExperienceService LIZ;

    @Override // com.ss.android.ugc.aweme.ad.feed.adexperience.ICommerceAdExperienceService
    public final void LIZ(Context context, Aweme aweme, String str, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro2) {
        o.LJIIIZ(context, "context");
        this.LIZ.LIZ(context, aweme, str, interfaceC65784Pro, interfaceC65784Pro2);
    }

    @Override // com.ss.android.ugc.aweme.ad.feed.adexperience.ICommerceAdExperienceService
    public final NQU LIZIZ(C59122NIg c59122NIg) {
        return this.LIZ.LIZIZ(c59122NIg);
    }

    @Override // com.ss.android.ugc.aweme.ad.feed.adexperience.ICommerceAdExperienceService
    public final NFU LIZJ(Aweme aweme) {
        return this.LIZ.LIZJ(aweme);
    }

    @Override // com.ss.android.ugc.aweme.ad.feed.adexperience.ICommerceAdExperienceService
    public final List<String> LIZLLL(Aweme aweme) {
        return this.LIZ.LIZLLL(aweme);
    }

    @Override // com.ss.android.ugc.aweme.ad.feed.adexperience.ICommerceAdExperienceService
    public final boolean LJ(Aweme aweme) {
        return this.LIZ.LJ(aweme);
    }

    @Override // com.ss.android.ugc.aweme.ad.feed.adexperience.ICommerceAdExperienceService
    public final void LJFF(Context context, AdLiveEnterRoomConfig adLiveEnterRoomConfig, String uid) {
        o.LJIIIZ(context, "context");
        o.LJIIIZ(uid, "uid");
        this.LIZ.LJFF(context, adLiveEnterRoomConfig, uid);
    }

    @Override // com.ss.android.ugc.aweme.ad.feed.adexperience.ICommerceAdExperienceService
    public final String LJI(AwemeRawAd awemeRawAd) {
        return this.LIZ.LJI(awemeRawAd);
    }

    @Override // com.ss.android.ugc.aweme.ad.feed.adexperience.ICommerceAdExperienceService
    public final BottomBarPriorityProtocol LJII() {
        return this.LIZ.LJII();
    }

    @Override // com.ss.android.ugc.aweme.ad.feed.adexperience.ICommerceAdExperienceService
    public final boolean LJIIIIZZ(Aweme aweme) {
        return this.LIZ.LJIIIIZZ(aweme);
    }

    @Override // com.ss.android.ugc.aweme.ad.feed.adexperience.ICommerceAdExperienceService
    public final void LJIIIZ(Context context, AdLiveEnterRoomConfig adLiveEnterRoomConfig, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro2) {
        o.LJIIIZ(context, "context");
        this.LIZ.LJIIIZ(context, adLiveEnterRoomConfig, interfaceC65784Pro, interfaceC65784Pro2);
    }

    @Override // com.ss.android.ugc.aweme.ad.feed.adexperience.ICommerceAdExperienceService
    public final void LJIIJ(Context context, Aweme aweme, String reportFrom) {
        o.LJIIIZ(context, "context");
        o.LJIIIZ(reportFrom, "reportFrom");
        this.LIZ.LJIIJ(context, aweme, reportFrom);
    }

    public C59050NFm() {
        ICommerceAdExperienceService iCommerceAdExperienceService;
        Object LIZ = C58096Mr6.LIZ(ICommerceAdExperienceService.class, false);
        if (LIZ != null) {
            iCommerceAdExperienceService = (ICommerceAdExperienceService) LIZ;
        } else {
            if (C58096Mr6.LJLLLL == null) {
                synchronized (ICommerceAdExperienceService.class) {
                    if (C58096Mr6.LJLLLL == null) {
                        C58096Mr6.LJLLLL = new CommerceAdExperienceServiceImpl();
                    }
                }
            }
            iCommerceAdExperienceService = C58096Mr6.LJLLLL;
        }
        this.LIZ = iCommerceAdExperienceService;
    }
}

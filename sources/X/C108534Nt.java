package X;

import com.ss.android.ugc.aweme.legacy.select.SocialCardServiceImp;
import com.ss.android.ugc.aweme.social.widget.card.ISocialCardService;

/* renamed from: X.4Nt, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C108534Nt implements ISocialCardService {
    public static final C108534Nt LIZIZ = new C108534Nt();
    public final /* synthetic */ ISocialCardService LIZ;

    @Override // com.ss.android.ugc.aweme.social.widget.card.ISocialCardService
    public final InterfaceC108504Nq LIZ(C87693cL c87693cL) {
        return this.LIZ.LIZ(c87693cL);
    }

    public C108534Nt() {
        ISocialCardService iSocialCardService;
        Object LIZ = C58096Mr6.LIZ(ISocialCardService.class, false);
        if (LIZ != null) {
            iSocialCardService = (ISocialCardService) LIZ;
        } else {
            if (C58096Mr6.d2 == null) {
                synchronized (ISocialCardService.class) {
                    if (C58096Mr6.d2 == null) {
                        C58096Mr6.d2 = new SocialCardServiceImp();
                    }
                }
            }
            iSocialCardService = C58096Mr6.d2;
        }
        this.LIZ = iSocialCardService;
    }
}

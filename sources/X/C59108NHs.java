package X;

import com.ss.android.ugc.aweme.ad.feed.photomode.AdPhotoModeServiceImpl;
import com.ss.android.ugc.aweme.commercialize.service.IAdPhotoModeService;

/* renamed from: X.NHs, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C59108NHs extends AbstractC65781Prl implements InterfaceC65784Pro<IAdPhotoModeService> {
    public static final C59108NHs INSTANCE = new C59108NHs();

    public C59108NHs() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final IAdPhotoModeService invoke() {
        return AdPhotoModeServiceImpl.LIZ();
    }
}

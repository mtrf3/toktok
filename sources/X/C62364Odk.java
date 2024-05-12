package X;

import android.app.Activity;
import androidx.lifecycle.Observer;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.service.IPhotoDownloadService;
import com.ss.android.ugc.aweme.service.PhotoDownloadServiceImpl;
import com.ss.android.ugc.aweme.sharer.model.SharePackage;
import kotlin.jvm.internal.o;

/* renamed from: X.Odk, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C62364Odk implements IPhotoDownloadService {
    public static final C62364Odk LIZIZ = new C62364Odk();
    public final /* synthetic */ IPhotoDownloadService LIZ;

    @Override // com.ss.android.ugc.aweme.service.IPhotoDownloadService
    public final void LIZ() {
        this.LIZ.LIZ();
    }

    @Override // com.ss.android.ugc.aweme.service.IPhotoDownloadService
    public final void LIZIZ() {
        this.LIZ.LIZIZ();
    }

    @Override // com.ss.android.ugc.aweme.service.IPhotoDownloadService
    public final Observer<Aweme> LIZJ() {
        return this.LIZ.LIZJ();
    }

    @Override // com.ss.android.ugc.aweme.service.IPhotoDownloadService
    public final InterfaceC62486Ofi LIZLLL(Activity activity, Aweme aweme, String str, String str2, String str3, String str4) {
        o.LJIIIZ(activity, "activity");
        o.LJIIIZ(aweme, "aweme");
        return this.LIZ.LIZLLL(activity, aweme, str, str2, str3, str4);
    }

    @Override // com.ss.android.ugc.aweme.service.IPhotoDownloadService
    public final void LJ(Activity activity, Integer num, Aweme aweme, C45374HrO c45374HrO, C42593Gnd c42593Gnd, String str) {
        this.LIZ.LJ(activity, num, aweme, c45374HrO, c42593Gnd, str);
    }

    @Override // com.ss.android.ugc.aweme.service.IPhotoDownloadService
    public final boolean LJFF() {
        return this.LIZ.LJFF();
    }

    @Override // com.ss.android.ugc.aweme.service.IPhotoDownloadService
    public final boolean LJI() {
        return this.LIZ.LJI();
    }

    @Override // com.ss.android.ugc.aweme.service.IPhotoDownloadService
    public final void LJII() {
        this.LIZ.LJII();
    }

    @Override // com.ss.android.ugc.aweme.service.IPhotoDownloadService
    public final void LJIIIIZZ() {
        this.LIZ.LJIIIIZZ();
    }

    @Override // com.ss.android.ugc.aweme.service.IPhotoDownloadService
    public final void LJIIIZ(SharePackage sharePackage) {
        this.LIZ.LJIIIZ(sharePackage);
    }

    @Override // com.ss.android.ugc.aweme.service.IPhotoDownloadService
    public final void a1(int i) {
        this.LIZ.a1(i);
    }

    public C62364Odk() {
        IPhotoDownloadService iPhotoDownloadService;
        Object LIZ = C58096Mr6.LIZ(IPhotoDownloadService.class, false);
        if (LIZ != null) {
            iPhotoDownloadService = (IPhotoDownloadService) LIZ;
        } else {
            if (C58096Mr6.f5 == null) {
                synchronized (IPhotoDownloadService.class) {
                    if (C58096Mr6.f5 == null) {
                        C58096Mr6.f5 = new PhotoDownloadServiceImpl();
                    }
                }
            }
            iPhotoDownloadService = C58096Mr6.f5;
        }
        this.LIZ = iPhotoDownloadService;
    }
}

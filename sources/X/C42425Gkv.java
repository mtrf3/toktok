package X;

import android.app.Activity;
import com.ss.android.ugc.aweme.creative.CreativeInfo;
import com.ss.android.ugc.aweme.download.DownloadAwemeVideoServiceImpl;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.services.external.ability.IVideo2StickerService;
import com.ss.android.ugc.aweme.tools.IDownloadAwemeVideoService;
import kotlin.jvm.internal.o;

/* renamed from: X.Gkv, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C42425Gkv implements IVideo2StickerService {
    @Override // com.ss.android.ugc.aweme.services.external.ability.IVideo2StickerService
    public final void video2StickerEdit(Activity activity, Aweme aweme, IVideo2StickerService.Callback callback) {
        String LJIILJJIL;
        IDownloadAwemeVideoService iDownloadAwemeVideoService;
        o.LJIIIZ(activity, "activity");
        o.LJIIIZ(aweme, "aweme");
        CreativeInfo LJJJJJ = C44384HbQ.LJJJJJ();
        LJIILJJIL = C62850Ola.LJ().LJIILJJIL(EnumC43651HBf.VIDEO_2_STICKER, "");
        Object LIZ = C58096Mr6.LIZ(IDownloadAwemeVideoService.class, false);
        if (LIZ != null) {
            iDownloadAwemeVideoService = (IDownloadAwemeVideoService) LIZ;
        } else {
            if (C58096Mr6.z == null) {
                synchronized (IDownloadAwemeVideoService.class) {
                    if (C58096Mr6.z == null) {
                        C58096Mr6.z = new DownloadAwemeVideoServiceImpl();
                    }
                }
            }
            iDownloadAwemeVideoService = C58096Mr6.z;
        }
        iDownloadAwemeVideoService.LIZ(activity, aweme, LJIILJJIL, new C42427Gkx(this, activity, aweme, LJJJJJ, callback));
    }
}
